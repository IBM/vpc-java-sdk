/*
 * (C) Copyright IBM Corp. 2023, 2024, 2025, 2026.
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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createIkePolicy options.
 */
public class CreateIkePolicyOptions extends GenericModel {

  /**
   * The authentication algorithm.
   *
   * `authentication_algorithm` has been deprecated. Use `authentication_algorithms` instead.
   *
   * If  specified, `authentication_algorithms` must not be specified.
   */
  public interface AuthenticationAlgorithm {
    /** sha256. */
    String SHA256 = "sha256";
    /** sha384. */
    String SHA384 = "sha384";
    /** sha512. */
    String SHA512 = "sha512";
  }

  public interface AuthenticationAlgorithms {
    /** sha256. */
    String SHA256 = "sha256";
    /** sha384. */
    String SHA384 = "sha384";
    /** sha512. */
    String SHA512 = "sha512";
  }

  /**
   * The encryption algorithm.
   *
   * `encryption_algorithm` has been deprecated. Use `encryption_algorithms` instead.
   *
   * If  specified, `encryption_algorithms` must not be specified.
   */
  public interface EncryptionAlgorithm {
    /** aes128. */
    String AES128 = "aes128";
    /** aes192. */
    String AES192 = "aes192";
    /** aes256. */
    String AES256 = "aes256";
  }

  public interface EncryptionAlgorithms {
    /** aes128. */
    String AES128 = "aes128";
    /** aes192. */
    String AES192 = "aes192";
    /** aes256. */
    String AES256 = "aes256";
  }

  protected Long ikeVersion;
  protected String authenticationAlgorithm;
  protected List<String> authenticationAlgorithms;
  protected Long dhGroup;
  protected List<Long> dhGroups;
  protected String encryptionAlgorithm;
  protected List<String> encryptionAlgorithms;
  protected Long keyLifetime;
  protected String name;
  protected ResourceGroupIdentity resourceGroup;

  /**
   * Builder.
   */
  public static class Builder {
    private Long ikeVersion;
    private String authenticationAlgorithm;
    private List<String> authenticationAlgorithms;
    private Long dhGroup;
    private List<Long> dhGroups;
    private String encryptionAlgorithm;
    private List<String> encryptionAlgorithms;
    private Long keyLifetime;
    private String name;
    private ResourceGroupIdentity resourceGroup;

    /**
     * Instantiates a new Builder from an existing CreateIkePolicyOptions instance.
     *
     * @param createIkePolicyOptions the instance to initialize the Builder with
     */
    private Builder(CreateIkePolicyOptions createIkePolicyOptions) {
      this.ikeVersion = createIkePolicyOptions.ikeVersion;
      this.authenticationAlgorithm = createIkePolicyOptions.authenticationAlgorithm;
      this.authenticationAlgorithms = createIkePolicyOptions.authenticationAlgorithms;
      this.dhGroup = createIkePolicyOptions.dhGroup;
      this.dhGroups = createIkePolicyOptions.dhGroups;
      this.encryptionAlgorithm = createIkePolicyOptions.encryptionAlgorithm;
      this.encryptionAlgorithms = createIkePolicyOptions.encryptionAlgorithms;
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
     * @param ikeVersion the ikeVersion
     */
    public Builder(Long ikeVersion) {
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
     * Adds a new element to authenticationAlgorithms.
     *
     * @param authenticationAlgorithms the new element to be added
     * @return the CreateIkePolicyOptions builder
     */
    public Builder addAuthenticationAlgorithms(String authenticationAlgorithms) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(authenticationAlgorithms,
        "authenticationAlgorithms cannot be null");
      if (this.authenticationAlgorithms == null) {
        this.authenticationAlgorithms = new ArrayList<String>();
      }
      this.authenticationAlgorithms.add(authenticationAlgorithms);
      return this;
    }

    /**
     * Adds a new element to dhGroups.
     *
     * @param dhGroups the new element to be added
     * @return the CreateIkePolicyOptions builder
     */
    public Builder addDhGroups(Long dhGroups) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(dhGroups,
        "dhGroups cannot be null");
      if (this.dhGroups == null) {
        this.dhGroups = new ArrayList<Long>();
      }
      this.dhGroups.add(dhGroups);
      return this;
    }

    /**
     * Adds a new element to encryptionAlgorithms.
     *
     * @param encryptionAlgorithms the new element to be added
     * @return the CreateIkePolicyOptions builder
     */
    public Builder addEncryptionAlgorithms(String encryptionAlgorithms) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(encryptionAlgorithms,
        "encryptionAlgorithms cannot be null");
      if (this.encryptionAlgorithms == null) {
        this.encryptionAlgorithms = new ArrayList<String>();
      }
      this.encryptionAlgorithms.add(encryptionAlgorithms);
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
     * Set the authenticationAlgorithm.
     *
     * @param authenticationAlgorithm the authenticationAlgorithm
     * @return the CreateIkePolicyOptions builder
     * @deprecated this method is deprecated and may be removed in a future release
     */
    @Deprecated
    public Builder authenticationAlgorithm(String authenticationAlgorithm) {
      this.authenticationAlgorithm = authenticationAlgorithm;
      return this;
    }

    /**
     * Set the authenticationAlgorithms.
     * Existing authenticationAlgorithms will be replaced.
     *
     * @param authenticationAlgorithms the authenticationAlgorithms
     * @return the CreateIkePolicyOptions builder
     */
    public Builder authenticationAlgorithms(List<String> authenticationAlgorithms) {
      this.authenticationAlgorithms = authenticationAlgorithms;
      return this;
    }

    /**
     * Set the dhGroup.
     *
     * @param dhGroup the dhGroup
     * @return the CreateIkePolicyOptions builder
     * @deprecated this method is deprecated and may be removed in a future release
     */
    @Deprecated
    public Builder dhGroup(long dhGroup) {
      this.dhGroup = dhGroup;
      return this;
    }

    /**
     * Set the dhGroups.
     * Existing dhGroups will be replaced.
     *
     * @param dhGroups the dhGroups
     * @return the CreateIkePolicyOptions builder
     */
    public Builder dhGroups(List<Long> dhGroups) {
      this.dhGroups = dhGroups;
      return this;
    }

    /**
     * Set the encryptionAlgorithm.
     *
     * @param encryptionAlgorithm the encryptionAlgorithm
     * @return the CreateIkePolicyOptions builder
     * @deprecated this method is deprecated and may be removed in a future release
     */
    @Deprecated
    public Builder encryptionAlgorithm(String encryptionAlgorithm) {
      this.encryptionAlgorithm = encryptionAlgorithm;
      return this;
    }

    /**
     * Set the encryptionAlgorithms.
     * Existing encryptionAlgorithms will be replaced.
     *
     * @param encryptionAlgorithms the encryptionAlgorithms
     * @return the CreateIkePolicyOptions builder
     */
    public Builder encryptionAlgorithms(List<String> encryptionAlgorithms) {
      this.encryptionAlgorithms = encryptionAlgorithms;
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
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ikeVersion,
      "ikeVersion cannot be null");
    ikeVersion = builder.ikeVersion;
    authenticationAlgorithm = builder.authenticationAlgorithm;
    authenticationAlgorithms = builder.authenticationAlgorithms;
    dhGroup = builder.dhGroup;
    dhGroups = builder.dhGroups;
    encryptionAlgorithm = builder.encryptionAlgorithm;
    encryptionAlgorithms = builder.encryptionAlgorithms;
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
   * Gets the authenticationAlgorithm.
   *
   * The authentication algorithm.
   *
   * `authentication_algorithm` has been deprecated. Use `authentication_algorithms` instead.
   *
   * If  specified, `authentication_algorithms` must not be specified.
   *
   * @return the authenticationAlgorithm
   * @deprecated this method is deprecated and may be removed in a future release
   */
  @Deprecated
  public String authenticationAlgorithm() {
    return authenticationAlgorithm;
  }

  /**
   * Gets the authenticationAlgorithms.
   *
   * The authentication algorithms to use for IKE Negotiation.
   *
   * If specified, `authentication_algorithm` must not be specified.
   *
   * If the IKE policy's `ike_version` is `1`, this array must contain exactly one algorithm.
   *
   * The order of the algorithms in this array indicates their priority for negotiation, with each algorithm having
   * priority over the one after it.
   *
   * @return the authenticationAlgorithms
   */
  public List<String> authenticationAlgorithms() {
    return authenticationAlgorithms;
  }

  /**
   * Gets the dhGroup.
   *
   * The Diffie-Hellman group.
   *
   * `dh_group` has been deprecated. Use `dh_groups` instead.
   *
   * If  specified, `dh_groups` must not be specified.
   *
   * @return the dhGroup
   * @deprecated this method is deprecated and may be removed in a future release
   */
  @Deprecated
  public Long dhGroup() {
    return dhGroup;
  }

  /**
   * Gets the dhGroups.
   *
   * The Diffie-Hellman groups to use for IKE negotiation.
   *
   * If  specified, `dh_group` must not be specified.
   *
   * If the IKE policy's `ike_version` is `1`, this array must contain exactly one algorithm.
   *
   * The order of the Diffie-Hellman groups in this array indicates their priority for negotiation, with each
   * Diffie-Hellman group having priority over the one after it.
   *
   * @return the dhGroups
   */
  public List<Long> dhGroups() {
    return dhGroups;
  }

  /**
   * Gets the encryptionAlgorithm.
   *
   * The encryption algorithm.
   *
   * `encryption_algorithm` has been deprecated. Use `encryption_algorithms` instead.
   *
   * If  specified, `encryption_algorithms` must not be specified.
   *
   * @return the encryptionAlgorithm
   * @deprecated this method is deprecated and may be removed in a future release
   */
  @Deprecated
  public String encryptionAlgorithm() {
    return encryptionAlgorithm;
  }

  /**
   * Gets the encryptionAlgorithms.
   *
   * The encryption algorithms to use for IKE Negotiation.
   *
   * If  specified, `encryption_algorithm` must not be specified.
   *
   * If the IKE policy's `ike_version` is `1`, this array must contain exactly one algorithm.
   *
   * The order of the algorithms in this array indicates their priority for negotiation, with each algorithm having
   * priority over the one after it.
   *
   * @return the encryptionAlgorithms
   */
  public List<String> encryptionAlgorithms() {
    return encryptionAlgorithms;
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
   * The name for this IKE policy. The name must not be used by another IKE policy in the region. If unspecified, the
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

