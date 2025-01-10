#!/bin/bash

# This script will publish the aggregated javadocs found in the project's "target" directory.
# The javadocs are committed and pushed to the git repository's gh-pages branch.
# Be sure to customize this file to reflect your SDK project's settings (git url)

# Avoid publishing javadocs for a PR build
if [ "$GITHUB_EVENT_NAME" == "push" ] && [ -n "$GITHUB_REF_NAME" ]; then

    printf "\n>>>>> Publishing javadoc for release build: repo=%s branch=%s\n" ${GITHUB_REPOSITORY} ${GITHUB_REF_NAME}

    printf "\n>>>>> Cloning repository's gh-pages branch into directory 'gh-pages'\n"
    rm -fr ./gh-pages
    git clone --branch=gh-pages https://${GH_TOKEN}@github.com/IBM/vpc-java-sdk.git gh-pages

    printf "\n>>>>> Finished cloning...\n"

    pushd gh-pages

    # Create a new directory for this branch/tag and copy the aggregated javadocs there.
    printf "\n>>>>> Copying aggregated javadocs to new tagged-release directory: %s\n" ${GITHUB_REF_NAME}
    rm -rf docs/${GITHUB_REF_NAME}
    mkdir -p docs/${GITHUB_REF_NAME}
    cp -rf ../target/site/apidocs/* docs/${GITHUB_REF_NAME}

    printf "\n>>>>> Generating gh-pages index.html...\n"
    ../build/generateJavadocIndex.sh > index.html

    # Update the 'latest' symlink to point to this branch if it's a tagged release.
    if [[ $GITHUB_REF == refs/tags/* ]]; then
        pushd docs
        rm -f latest
        ln -s ./${GITHUB_REF_NAME} latest
        printf "\n>>>>> Updated 'docs/latest' symlink:\n"
        ls -l latest
        popd
    fi

    printf "\n>>>>> Committing new javadoc...\n"
    git config --global user.email "github-actions[bot]@users.noreply.github.com"
    git config --global user.name "github-actions[bot]"
    git add -f .
    git commit -m "Javadoc for release ${GITHUB_REF_NAME} (${GITHUB_SHA})"
    git push -f origin gh-pages

    popd

    printf "\n>>>>> Published javadoc for release build: repo=%s branch=%s\n" ${GITHUB_REPOSITORY} ${GITHUB_REF_NAME}

else

    printf "\n>>>>> Javadoc publishing bypassed for non-release build\n"

fi