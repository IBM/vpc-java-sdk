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
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * IPsecPolicyPatch.
 */
public class IPsecPolicyPatch extends GenericModel {

  /**
   * The authentication algorithm.
   *
   * `authentication_algorithm` has been deprecated. Use `authentication_algorithms` instead.
   *
   * If specified, `authentication_algorithms` must not be specified.
   *
   * Must be `disabled` if and only if the `encryption_algorithm` is `aes128gcm16`,
   * `aes192gcm16`, or `aes256gcm16`
   *
   * The `md5` and `sha1` algorithms have been deprecated.
   *
   * Updating this property will also update the
   * `authentication_algorithms` field accordingly.
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

  public interface AuthenticationAlgorithms {
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
   * The encryption algorithm.
   *
   * `encryption_algorithm` has been deprecated. Use `encryption_algorithms` instead.
   *
   * If specified, `encryption_algorithms` must not be specified.
   *
   * The `authentication_algorithm` must be `disabled` if and only if
   * `encryption_algorithm` is `aes128gcm16`, `aes192gcm16`, or `aes256gcm16`
   *
   * The `triple_des` algorithm has been deprecated.
   *
   * Updating this property will also update the
   * `encryption_algorithms` field accordingly.
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

  public interface EncryptionAlgorithms {
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
   * `pfs` has been deprecated. Use `pfs_groups` instead.
   *
   * If specified, `pfs_groups` must not be specified.
   *
   * Groups `group_2` and `group_5` have been deprecated.
   *
   * Updating this property will also update the
   * `pfs_groups` field accordingly.
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

  public interface PfsGroups {
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
  @SerializedName("authentication_algorithms")
  protected List<String> authenticationAlgorithms;
  @SerializedName("encryption_algorithm")
  protected String encryptionAlgorithm;
  @SerializedName("encryption_algorithms")
  protected List<String> encryptionAlgorithms;
  @SerializedName("key_lifetime")
  protected Long keyLifetime;
  protected String name;
  protected String pfs;
  @SerializedName("pfs_groups")
  protected List<String> pfsGroups;

  /**
   * Builder.
   */
  public static class Builder {
    private String authenticationAlgorithm;
    private List<String> authenticationAlgorithms;
    private String encryptionAlgorithm;
    private List<String> encryptionAlgorithms;
    private Long keyLifetime;
    private String name;
    private String pfs;
    private List<String> pfsGroups;

    /**
     * Instantiates a new Builder from an existing IPsecPolicyPatch instance.
     *
     * @param iPsecPolicyPatch the instance to initialize the Builder with
     */
    private Builder(IPsecPolicyPatch iPsecPolicyPatch) {
      this.authenticationAlgorithm = iPsecPolicyPatch.authenticationAlgorithm;
      this.authenticationAlgorithms = iPsecPolicyPatch.authenticationAlgorithms;
      this.encryptionAlgorithm = iPsecPolicyPatch.encryptionAlgorithm;
      this.encryptionAlgorithms = iPsecPolicyPatch.encryptionAlgorithms;
      this.keyLifetime = iPsecPolicyPatch.keyLifetime;
      this.name = iPsecPolicyPatch.name;
      this.pfs = iPsecPolicyPatch.pfs;
      this.pfsGroups = iPsecPolicyPatch.pfsGroups;
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
     * Adds a new element to authenticationAlgorithms.
     *
     * @param authenticationAlgorithms the new element to be added
     * @return the IPsecPolicyPatch builder
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
     * Adds a new element to encryptionAlgorithms.
     *
     * @param encryptionAlgorithms the new element to be added
     * @return the IPsecPolicyPatch builder
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
     * Adds a new element to pfsGroups.
     *
     * @param pfsGroups the new element to be added
     * @return the IPsecPolicyPatch builder
     */
    public Builder addPfsGroups(String pfsGroups) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(pfsGroups,
        "pfsGroups cannot be null");
      if (this.pfsGroups == null) {
        this.pfsGroups = new ArrayList<String>();
      }
      this.pfsGroups.add(pfsGroups);
      return this;
    }

    /**
     * Set the authenticationAlgorithm.
     *
     * @param authenticationAlgorithm the authenticationAlgorithm
     * @return the IPsecPolicyPatch builder
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
     * @return the IPsecPolicyPatch builder
     */
    public Builder authenticationAlgorithms(List<String> authenticationAlgorithms) {
      this.authenticationAlgorithms = authenticationAlgorithms;
      return this;
    }

    /**
     * Set the encryptionAlgorithm.
     *
     * @param encryptionAlgorithm the encryptionAlgorithm
     * @return the IPsecPolicyPatch builder
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
     * @return the IPsecPolicyPatch builder
     */
    public Builder encryptionAlgorithms(List<String> encryptionAlgorithms) {
      this.encryptionAlgorithms = encryptionAlgorithms;
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
     * @deprecated this method is deprecated and may be removed in a future release
     */
    @Deprecated
    public Builder pfs(String pfs) {
      this.pfs = pfs;
      return this;
    }

    /**
     * Set the pfsGroups.
     * Existing pfsGroups will be replaced.
     *
     * @param pfsGroups the pfsGroups
     * @return the IPsecPolicyPatch builder
     */
    public Builder pfsGroups(List<String> pfsGroups) {
      this.pfsGroups = pfsGroups;
      return this;
    }
  }

  protected IPsecPolicyPatch() { }

  protected IPsecPolicyPatch(Builder builder) {
    authenticationAlgorithm = builder.authenticationAlgorithm;
    authenticationAlgorithms = builder.authenticationAlgorithms;
    encryptionAlgorithm = builder.encryptionAlgorithm;
    encryptionAlgorithms = builder.encryptionAlgorithms;
    keyLifetime = builder.keyLifetime;
    name = builder.name;
    pfs = builder.pfs;
    pfsGroups = builder.pfsGroups;
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
   * The authentication algorithm.
   *
   * `authentication_algorithm` has been deprecated. Use `authentication_algorithms` instead.
   *
   * If specified, `authentication_algorithms` must not be specified.
   *
   * Must be `disabled` if and only if the `encryption_algorithm` is `aes128gcm16`,
   * `aes192gcm16`, or `aes256gcm16`
   *
   * The `md5` and `sha1` algorithms have been deprecated.
   *
   * Updating this property will also update the
   * `authentication_algorithms` field accordingly.
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
   * The authentication algorithms to use for IPsec negotiation.
   *
   * If specified, `authentication_algorithm` must not be specified.
   *
   * Must be `["disabled"]` when `encryption_algorithms` has only combined-mode algorithms
   * (`aes128gcm16`, `aes192gcm16`, and `aes256gcm16`).
   *
   * The `md5` and `sha1` algorithms have been deprecated.
   *
   * The order of the algorithms in this array indicates their priority for negotiation, with each algorithm having
   * priority over the one after it.
   *
   * Updating this property will also update the
   * `authentication_algorithm` field accordingly.
   *
   * @return the authenticationAlgorithms
   */
  public List<String> authenticationAlgorithms() {
    return authenticationAlgorithms;
  }

  /**
   * Gets the encryptionAlgorithm.
   *
   * The encryption algorithm.
   *
   * `encryption_algorithm` has been deprecated. Use `encryption_algorithms` instead.
   *
   * If specified, `encryption_algorithms` must not be specified.
   *
   * The `authentication_algorithm` must be `disabled` if and only if
   * `encryption_algorithm` is `aes128gcm16`, `aes192gcm16`, or `aes256gcm16`
   *
   * The `triple_des` algorithm has been deprecated.
   *
   * Updating this property will also update the
   * `encryption_algorithms` field accordingly.
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
   * The encryption algorithms to use for IPsec negotiation.
   *
   * If specified, `encryption_algorithm` must not be specified.
   *
   * If only combined-mode encryption algorithms (`aes128gcm16`, `aes192gcm16`, and
   * `aes256gcm16`) are to be used, then `authentication_algorithms` must be `["disabled"]`.
   *
   * The `triple_des` algorithm has been deprecated.
   *
   * The order of the algorithms in this array indicates their priority for negotiation, with each algorithm having
   * priority over the one after it.
   *
   * Updating this property will also update the `encryption_algorithm` field accordingly.
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
   * The name for this IPsec policy. The name is unique across all IPsec policies in the region.
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
   * `pfs` has been deprecated. Use `pfs_groups` instead.
   *
   * If specified, `pfs_groups` must not be specified.
   *
   * Groups `group_2` and `group_5` have been deprecated.
   *
   * Updating this property will also update the
   * `pfs_groups` field accordingly.
   *
   * @return the pfs
   * @deprecated this method is deprecated and may be removed in a future release
   */
  @Deprecated
  public String pfs() {
    return pfs;
  }

  /**
   * Gets the pfsGroups.
   *
   * The Perfect Forward Secrecy groups to use for IPsec negotiation.
   *
   * If specified, `pfs_groups` must not be specified.
   *
   * Groups `group_2` and `group_5` have been deprecated.
   *
   * The order of the Perfect Forward Secrecy groups in this array indicates their priority for negotiation, with each
   * Perfect Forward Secrecy group having priority over the one after it.
   *
   * Updating this property will also update the `pfs` field accordingly.
   *
   * @return the pfsGroups
   */
  public List<String> pfsGroups() {
    return pfsGroups;
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

