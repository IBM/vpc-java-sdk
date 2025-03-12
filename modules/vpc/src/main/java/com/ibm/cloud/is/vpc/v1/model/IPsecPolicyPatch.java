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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * IPsecPolicyPatch.
 */
public class IPsecPolicyPatch extends GenericModel {

  /**
   * The authentication algorithm
   *
   * Must be `disabled` if and only if the `encryption_algorithm` is `aes128gcm16`,
   * `aes192gcm16`, or `aes256gcm16`
   *
   * The `md5` and `sha1` algorithms have been deprecated.
   */
  public interface AuthenticationAlgorithm {
    /** disabled. */
    String DISABLED = "disabled";
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
   * The `authentication_algorithm` must be `disabled` if and only if
   * `encryption_algorithm` is `aes128gcm16`, `aes192gcm16`, or `aes256gcm16`
   *
   * The `triple_des` algorithm has been deprecated.
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
  }

  /**
   * The Perfect Forward Secrecy group.
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
  }

  @SerializedName("authentication_algorithm")
  protected String authenticationAlgorithm;
  @SerializedName("encryption_algorithm")
  protected String encryptionAlgorithm;
  @SerializedName("key_lifetime")
  protected Long keyLifetime;
  protected String name;
  protected String pfs;

  /**
   * Builder.
   */
  public static class Builder {
    private String authenticationAlgorithm;
    private String encryptionAlgorithm;
    private Long keyLifetime;
    private String name;
    private String pfs;

    /**
     * Instantiates a new Builder from an existing IPsecPolicyPatch instance.
     *
     * @param iPsecPolicyPatch the instance to initialize the Builder with
     */
    private Builder(IPsecPolicyPatch iPsecPolicyPatch) {
      this.authenticationAlgorithm = iPsecPolicyPatch.authenticationAlgorithm;
      this.encryptionAlgorithm = iPsecPolicyPatch.encryptionAlgorithm;
      this.keyLifetime = iPsecPolicyPatch.keyLifetime;
      this.name = iPsecPolicyPatch.name;
      this.pfs = iPsecPolicyPatch.pfs;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a IPsecPolicyPatch.
     *
     * @return the new IPsecPolicyPatch instance
     */
    public IPsecPolicyPatch build() {
      return new IPsecPolicyPatch(this);
    }

    /**
     * Set the authenticationAlgorithm.
     *
     * @param authenticationAlgorithm the authenticationAlgorithm
     * @return the IPsecPolicyPatch builder
     */
    public Builder authenticationAlgorithm(String authenticationAlgorithm) {
      this.authenticationAlgorithm = authenticationAlgorithm;
      return this;
    }

    /**
     * Set the encryptionAlgorithm.
     *
     * @param encryptionAlgorithm the encryptionAlgorithm
     * @return the IPsecPolicyPatch builder
     */
    public Builder encryptionAlgorithm(String encryptionAlgorithm) {
      this.encryptionAlgorithm = encryptionAlgorithm;
      return this;
    }

    /**
     * Set the keyLifetime.
     *
     * @param keyLifetime the keyLifetime
     * @return the IPsecPolicyPatch builder
     */
    public Builder keyLifetime(long keyLifetime) {
      this.keyLifetime = keyLifetime;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the IPsecPolicyPatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the pfs.
     *
     * @param pfs the pfs
     * @return the IPsecPolicyPatch builder
     */
    public Builder pfs(String pfs) {
      this.pfs = pfs;
      return this;
    }
  }

  protected IPsecPolicyPatch() { }

  protected IPsecPolicyPatch(Builder builder) {
    authenticationAlgorithm = builder.authenticationAlgorithm;
    encryptionAlgorithm = builder.encryptionAlgorithm;
    keyLifetime = builder.keyLifetime;
    name = builder.name;
    pfs = builder.pfs;
  }

  /**
   * New builder.
   *
   * @return a IPsecPolicyPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the authenticationAlgorithm.
   *
   * The authentication algorithm
   *
   * Must be `disabled` if and only if the `encryption_algorithm` is `aes128gcm16`,
   * `aes192gcm16`, or `aes256gcm16`
   *
   * The `md5` and `sha1` algorithms have been deprecated.
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
   * The `authentication_algorithm` must be `disabled` if and only if
   * `encryption_algorithm` is `aes128gcm16`, `aes192gcm16`, or `aes256gcm16`
   *
   * The `triple_des` algorithm has been deprecated.
   *
   * @return the encryptionAlgorithm
   */
  public String encryptionAlgorithm() {
    return encryptionAlgorithm;
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
   * The name for this IPsec policy. The name must not be used by another IPsec policy in the region.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the pfs.
   *
   * The Perfect Forward Secrecy group.
   *
   * Groups `group_2` and `group_5` have been deprecated.
   *
   * @return the pfs
   */
  public String pfs() {
    return pfs;
  }

  /**
   * Construct a JSON merge-patch from the IPsecPolicyPatch.
   *
   * Note that properties of the IPsecPolicyPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the IPsecPolicyPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

