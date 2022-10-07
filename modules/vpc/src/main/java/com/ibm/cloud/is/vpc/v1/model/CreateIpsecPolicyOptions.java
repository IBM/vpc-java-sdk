/*
 * (C) Copyright IBM Corp. 2020, 2021, 2022.
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
 * The createIpsecPolicy options.
 */
public class CreateIpsecPolicyOptions extends GenericModel {

  /**
   * The authentication algorithm
   *
   * The `md5` and `sha1` algorithms have been deprecated
   *
   * Must be `disabled` if and only if the `encryption_algorithm` is
   * `aes128gcm16`, `aes192gcm16`, or `aes256gcm16`.
   */
  public interface AuthenticationAlgorithm {
    /** disabled. */
    String DISABLED = "disabled";
    /** md5. */
    String MD5 = "md5";
    /** sha1. */
    String SHA1 = "sha1";
    /** sha256. */
    String SHA256 = "sha256";
    /** sha384. */
    String SHA384 = "sha384";
    /** sha512. */
    String SHA512 = "sha512";
  }

  /**
   * The encryption algorithm
   *
   * The `triple_des` algorithm has been deprecated
   *
   * The `authentication_algorithm` must be `disabled` if and only if
   * `encryption_algorithm` is `aes128gcm16`, `aes192gcm16`, or
   * `aes256gcm16`.
   */
  public interface EncryptionAlgorithm {
    /** aes128. */
    String AES128 = "aes128";
    /** aes128gcm16. */
    String AES128GCM16 = "aes128gcm16";
    /** aes192. */
    String AES192 = "aes192";
    /** aes192gcm16. */
    String AES192GCM16 = "aes192gcm16";
    /** aes256. */
    String AES256 = "aes256";
    /** aes256gcm16. */
    String AES256GCM16 = "aes256gcm16";
    /** triple_des. */
    String TRIPLE_DES = "triple_des";
  }

  /**
   * Perfect Forward Secrecy
   *
   * Groups `group_2` and `group_5` have been deprecated.
   */
  public interface Pfs {
    /** disabled. */
    String DISABLED = "disabled";
    /** group_14. */
    String GROUP_14 = "group_14";
    /** group_15. */
    String GROUP_15 = "group_15";
    /** group_16. */
    String GROUP_16 = "group_16";
    /** group_17. */
    String GROUP_17 = "group_17";
    /** group_18. */
    String GROUP_18 = "group_18";
    /** group_19. */
    String GROUP_19 = "group_19";
    /** group_2. */
    String GROUP_2 = "group_2";
    /** group_20. */
    String GROUP_20 = "group_20";
    /** group_21. */
    String GROUP_21 = "group_21";
    /** group_22. */
    String GROUP_22 = "group_22";
    /** group_23. */
    String GROUP_23 = "group_23";
    /** group_24. */
    String GROUP_24 = "group_24";
    /** group_31. */
    String GROUP_31 = "group_31";
    /** group_5. */
    String GROUP_5 = "group_5";
  }

  protected String authenticationAlgorithm;
  protected String encryptionAlgorithm;
  protected String pfs;
  protected Long keyLifetime;
  protected String name;
  protected ResourceGroupIdentity resourceGroup;

  /**
   * Builder.
   */
  public static class Builder {
    private String authenticationAlgorithm;
    private String encryptionAlgorithm;
    private String pfs;
    private Long keyLifetime;
    private String name;
    private ResourceGroupIdentity resourceGroup;

    /**
     * Instantiates a new Builder from an existing CreateIpsecPolicyOptions instance.
     *
     * @param createIpsecPolicyOptions the instance to initialize the Builder with
     */
    private Builder(CreateIpsecPolicyOptions createIpsecPolicyOptions) {
      this.authenticationAlgorithm = createIpsecPolicyOptions.authenticationAlgorithm;
      this.encryptionAlgorithm = createIpsecPolicyOptions.encryptionAlgorithm;
      this.pfs = createIpsecPolicyOptions.pfs;
      this.keyLifetime = createIpsecPolicyOptions.keyLifetime;
      this.name = createIpsecPolicyOptions.name;
      this.resourceGroup = createIpsecPolicyOptions.resourceGroup;
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
     * @param encryptionAlgorithm the encryptionAlgorithm
     * @param pfs the pfs
     */
    public Builder(String authenticationAlgorithm, String encryptionAlgorithm, String pfs) {
      this.authenticationAlgorithm = authenticationAlgorithm;
      this.encryptionAlgorithm = encryptionAlgorithm;
      this.pfs = pfs;
    }

    /**
     * Builds a CreateIpsecPolicyOptions.
     *
     * @return the new CreateIpsecPolicyOptions instance
     */
    public CreateIpsecPolicyOptions build() {
      return new CreateIpsecPolicyOptions(this);
    }

    /**
     * Set the authenticationAlgorithm.
     *
     * @param authenticationAlgorithm the authenticationAlgorithm
     * @return the CreateIpsecPolicyOptions builder
     */
    public Builder authenticationAlgorithm(String authenticationAlgorithm) {
      this.authenticationAlgorithm = authenticationAlgorithm;
      return this;
    }

    /**
     * Set the encryptionAlgorithm.
     *
     * @param encryptionAlgorithm the encryptionAlgorithm
     * @return the CreateIpsecPolicyOptions builder
     */
    public Builder encryptionAlgorithm(String encryptionAlgorithm) {
      this.encryptionAlgorithm = encryptionAlgorithm;
      return this;
    }

    /**
     * Set the pfs.
     *
     * @param pfs the pfs
     * @return the CreateIpsecPolicyOptions builder
     */
    public Builder pfs(String pfs) {
      this.pfs = pfs;
      return this;
    }

    /**
     * Set the keyLifetime.
     *
     * @param keyLifetime the keyLifetime
     * @return the CreateIpsecPolicyOptions builder
     */
    public Builder keyLifetime(long keyLifetime) {
      this.keyLifetime = keyLifetime;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateIpsecPolicyOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the CreateIpsecPolicyOptions builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }
  }

  protected CreateIpsecPolicyOptions() { }

  protected CreateIpsecPolicyOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.authenticationAlgorithm,
      "authenticationAlgorithm cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.encryptionAlgorithm,
      "encryptionAlgorithm cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.pfs,
      "pfs cannot be null");
    authenticationAlgorithm = builder.authenticationAlgorithm;
    encryptionAlgorithm = builder.encryptionAlgorithm;
    pfs = builder.pfs;
    keyLifetime = builder.keyLifetime;
    name = builder.name;
    resourceGroup = builder.resourceGroup;
  }

  /**
   * New builder.
   *
   * @return a CreateIpsecPolicyOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the authenticationAlgorithm.
   *
   * The authentication algorithm
   *
   * The `md5` and `sha1` algorithms have been deprecated
   *
   * Must be `disabled` if and only if the `encryption_algorithm` is
   * `aes128gcm16`, `aes192gcm16`, or `aes256gcm16`.
   *
   * @return the authenticationAlgorithm
   */
  public String authenticationAlgorithm() {
    return authenticationAlgorithm;
  }

  /**
   * Gets the encryptionAlgorithm.
   *
   * The encryption algorithm
   *
   * The `triple_des` algorithm has been deprecated
   *
   * The `authentication_algorithm` must be `disabled` if and only if
   * `encryption_algorithm` is `aes128gcm16`, `aes192gcm16`, or
   * `aes256gcm16`.
   *
   * @return the encryptionAlgorithm
   */
  public String encryptionAlgorithm() {
    return encryptionAlgorithm;
  }

  /**
   * Gets the pfs.
   *
   * Perfect Forward Secrecy
   *
   * Groups `group_2` and `group_5` have been deprecated.
   *
   * @return the pfs
   */
  public String pfs() {
    return pfs;
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
   * The user-defined name for this IPsec policy.
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
   * group](https://cloud.ibm.com/apidocs/resource-manager#introduction) is used.
   *
   * @return the resourceGroup
   */
  public ResourceGroupIdentity resourceGroup() {
    return resourceGroup;
  }
}

