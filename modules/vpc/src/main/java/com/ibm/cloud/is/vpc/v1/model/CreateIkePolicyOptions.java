/*
 * (C) Copyright IBM Corp. 2023, 2024, 2025.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.ibm.cloud.is.vpc.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createIkePolicy options.
 */
public class CreateIkePolicyOptions extends GenericModel {

  /**
   * The authentication algorithm.
   */
  public interface AuthenticationAlgorithm {
    /** sha256. */
    String SHA256 = "sha256";
    /** sha384. */
    String SHA384 = "sha384";
    /** sha512. */
    String SHA512 = "sha512";
  }

  /**
   * The encryption algorithm.
   */
  public interface EncryptionAlgorithm {
    /** aes128. */
    String AES128 = "aes128";
    /** aes192. */
    String AES192 = "aes192";
    /** aes256. */
    String AES256 = "aes256";
  }

  protected String authenticationAlgorithm;
  protected Long dhGroup;
  protected String encryptionAlgorithm;
  protected Long ikeVersion;
  protected Long keyLifetime;
  protected String name;
  protected ResourceGroupIdentity resourceGroup;

  /**
   * Builder.
   */
  public static class Builder {
    private String authenticationAlgorithm;
    private Long dhGroup;
    private String encryptionAlgorithm;
    private Long ikeVersion;
    private Long keyLifetime;
    private String name;
    private ResourceGroupIdentity resourceGroup;

    /**
     * Instantiates a new Builder from an existing CreateIkePolicyOptions instance.
     *
     * @param createIkePolicyOptions the instance to initialize the Builder with
     */
    private Builder(CreateIkePolicyOptions createIkePolicyOptions) {
      this.authenticationAlgorithm = createIkePolicyOptions.authenticationAlgorithm;
      this.dhGroup = createIkePolicyOptions.dhGroup;
      this.encryptionAlgorithm = createIkePolicyOptions.encryptionAlgorithm;
      this.ikeVersion = createIkePolicyOptions.ikeVersion;
      this.keyLifetime = createIkePolicyOptions.keyLifetime;
      this.name = createIkePolicyOptions.name;
      this.resourceGroup = createIkePolicyOptions.resourceGroup;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param authenticationAlgorithm the authenticationAlgorithm
     * @param dhGroup the dhGroup
     * @param encryptionAlgorithm the encryptionAlgorithm
     * @param ikeVersion the ikeVersion
     */
    public Builder(String authenticationAlgorithm, Long dhGroup, String encryptionAlgorithm, Long ikeVersion) {
      this.authenticationAlgorithm = authenticationAlgorithm;
      this.dhGroup = dhGroup;
      this.encryptionAlgorithm = encryptionAlgorithm;
      this.ikeVersion = ikeVersion;
    }

    /**
     * Builds a CreateIkePolicyOptions.
     *
     * @return the new CreateIkePolicyOptions instance
     */
    public CreateIkePolicyOptions build() {
      return new CreateIkePolicyOptions(this);
    }

    /**
     * Set the authenticationAlgorithm.
     *
     * @param authenticationAlgorithm the authenticationAlgorithm
     * @return the CreateIkePolicyOptions builder
     */
    public Builder authenticationAlgorithm(String authenticationAlgorithm) {
      this.authenticationAlgorithm = authenticationAlgorithm;
      return this;
    }

    /**
     * Set the dhGroup.
     *
     * @param dhGroup the dhGroup
     * @return the CreateIkePolicyOptions builder
     */
    public Builder dhGroup(long dhGroup) {
      this.dhGroup = dhGroup;
      return this;
    }

    /**
     * Set the encryptionAlgorithm.
     *
     * @param encryptionAlgorithm the encryptionAlgorithm
     * @return the CreateIkePolicyOptions builder
     */
    public Builder encryptionAlgorithm(String encryptionAlgorithm) {
      this.encryptionAlgorithm = encryptionAlgorithm;
      return this;
    }

    /**
     * Set the ikeVersion.
     *
     * @param ikeVersion the ikeVersion
     * @return the CreateIkePolicyOptions builder
     */
    public Builder ikeVersion(long ikeVersion) {
      this.ikeVersion = ikeVersion;
      return this;
    }

    /**
     * Set the keyLifetime.
     *
     * @param keyLifetime the keyLifetime
     * @return the CreateIkePolicyOptions builder
     */
    public Builder keyLifetime(long keyLifetime) {
      this.keyLifetime = keyLifetime;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateIkePolicyOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the CreateIkePolicyOptions builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }
  }

  protected CreateIkePolicyOptions() { }

  protected CreateIkePolicyOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.authenticationAlgorithm,
      "authenticationAlgorithm cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.dhGroup,
      "dhGroup cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.encryptionAlgorithm,
      "encryptionAlgorithm cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ikeVersion,
      "ikeVersion cannot be null");
    authenticationAlgorithm = builder.authenticationAlgorithm;
    dhGroup = builder.dhGroup;
    encryptionAlgorithm = builder.encryptionAlgorithm;
    ikeVersion = builder.ikeVersion;
    keyLifetime = builder.keyLifetime;
    name = builder.name;
    resourceGroup = builder.resourceGroup;
  }

  /**
   * New builder.
   *
   * @return a CreateIkePolicyOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the authenticationAlgorithm.
   *
   * The authentication algorithm.
   *
   * @return the authenticationAlgorithm
   */
  public String authenticationAlgorithm() {
    return authenticationAlgorithm;
  }

  /**
   * Gets the dhGroup.
   *
   * The Diffie-Hellman group.
   *
   * @return the dhGroup
   */
  public Long dhGroup() {
    return dhGroup;
  }

  /**
   * Gets the encryptionAlgorithm.
   *
   * The encryption algorithm.
   *
   * @return the encryptionAlgorithm
   */
  public String encryptionAlgorithm() {
    return encryptionAlgorithm;
  }

  /**
   * Gets the ikeVersion.
   *
   * The IKE protocol version.
   *
   * @return the ikeVersion
   */
  public Long ikeVersion() {
    return ikeVersion;
  }

  /**
   * Gets the keyLifetime.
   *
   * The key lifetime in seconds.
   *
   * @return the keyLifetime
   */
  public Long keyLifetime() {
    return keyLifetime;
  }

  /**
   * Gets the name.
   *
   * The name for this IKE policy. The name must not be used by another IKE policies in the region. If unspecified, the
   * name will be a hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group to use. If unspecified, the account's [default resource
   * group](https://cloud.ibm.com/apidocs/resource-manager#introduction) will be used.
   *
   * @return the resourceGroup
   */
  public ResourceGroupIdentity resourceGroup() {
    return resourceGroup;
  }
}

