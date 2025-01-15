#!/usr/bin/env bash

# Exit on any error
set -e
# Print commands before executing
set -x

# This script is responsible for decrypting your encrypted signing key file
# and importing it into the gpg keystore. This is done so that your maven
# build will be able to properly sign your jars prior to publishing them
# on maven central.
#
# Prerequisites:
# - GPG_PRIVATE_KEY: Base64 encoded GPG private key (add to GitHub Secrets)
# - GPG_PASSPHRASE: Your GPG key passphrase (add to GitHub Secrets)
# - GPG_KEYNAME: Your GPG key ID (add to GitHub Secrets)

echo "Importing signing key..."

# Create a temporary directory for secure operations
# This ensures sensitive files are not left on disk
TEMP_DIR="$(mktemp -d)"
chmod 700 "${TEMP_DIR}"

# Cleanup function to ensure no sensitive files are left behind
# This runs even if the script fails
cleanup() {
    # Remove temporary directory and all its contents
    rm -rf "${TEMP_DIR}"
    # Kill GPG agent to remove any cached keys
    gpgconf --kill gpg-agent
}

# Set trap to ensure cleanup runs on exit
trap cleanup EXIT

# Decode and import the base64 encoded GPG key from GitHub secrets
# The key should be exported using: gpg --export-secret-key YOUR_KEY_ID | base64
echo "${GPG_PRIVATE_KEY}" | base64 -d > "${TEMP_DIR}/signing.key"
chmod 600 "${TEMP_DIR}/signing.key"

# Setup GPG configuration for maven signing
# This enables non-interactive signing with the GPG key
mkdir -p ~/.gnupg
chmod 700 ~/.gnupg
echo "use-agent" > ~/.gnupg/gpg.conf
echo "pinentry-mode loopback" >> ~/.gnupg/gpg.conf
echo "allow-loopback-pinentry" > ~/.gnupg/gpg-agent.conf
chmod 600 ~/.gnupg/*

# Import the key into gpg keystore
gpg --batch --import "${TEMP_DIR}/signing.key"

# Verify the key was imported correctly
gpg --list-secret-keys "${GPG_KEYNAME}"

echo "Signing key import finished!"

# Note: The cleanup trap will automatically remove the temporary directory
# and kill the GPG agent when the script exits