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
 * IKEPolicyPatch.
 */
public class IKEPolicyPatch extends GenericModel {

  /**
   * The authentication algorithm.
   *
   * `authentication_algorithm` has been deprecated. Use `authentication_algorithms` instead.
   *
   * If specified, `authentication_algorithms` must not be specified.
   *
   * Updating this property will also update the
   * `authentication_algorithms` field accordingly.
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
   * If specified, `encryption_algorithms` must not be specified.
   *
   * Updating this property will also update the
   * `encryption_algorithms` field accordingly.
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

  @SerializedName("authentication_algorithm")
  protected String authenticationAlgorithm;
  @SerializedName("authentication_algorithms")
  protected List<String> authenticationAlgorithms;
  @SerializedName("dh_group")
  protected Long dhGroup;
  @SerializedName("dh_groups")
  protected List<Long> dhGroups;
  @SerializedName("encryption_algorithm")
  protected String encryptionAlgorithm;
  @SerializedName("encryption_algorithms")
  protected List<String> encryptionAlgorithms;
  @SerializedName("ike_version")
  protected Long ikeVersion;
  @SerializedName("key_lifetime")
  protected Long keyLifetime;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private String authenticationAlgorithm;
    private List<String> authenticationAlgorithms;
    private Long dhGroup;
    private List<Long> dhGroups;
    private String encryptionAlgorithm;
    private List<String> encryptionAlgorithms;
    private Long ikeVersion;
    private Long keyLifetime;
    private String name;

    /**
     * Instantiates a new Builder from an existing IKEPolicyPatch instance.
     *
     * @param ikePolicyPatch the instance to initialize the Builder with
     */
    private Builder(IKEPolicyPatch ikePolicyPatch) {
      this.authenticationAlgorithm = ikePolicyPatch.authenticationAlgorithm;
      this.authenticationAlgorithms = ikePolicyPatch.authenticationAlgorithms;
      this.dhGroup = ikePolicyPatch.dhGroup;
      this.dhGroups = ikePolicyPatch.dhGroups;
      this.encryptionAlgorithm = ikePolicyPatch.encryptionAlgorithm;
      this.encryptionAlgorithms = ikePolicyPatch.encryptionAlgorithms;
      this.ikeVersion = ikePolicyPatch.ikeVersion;
      this.keyLifetime = ikePolicyPatch.keyLifetime;
      this.name = ikePolicyPatch.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a IKEPolicyPatch.
     *
     * @return the new IKEPolicyPatch instance
     */
    public IKEPolicyPatch build() {
      return new IKEPolicyPatch(this);
    }

    /**
     * Adds a new element to authenticationAlgorithms.
     *
     * @param authenticationAlgorithms the new element to be added
     * @return the IKEPolicyPatch builder
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
     * @return the IKEPolicyPatch builder
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
     * @return the IKEPolicyPatch builder
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
     * Set the authenticationAlgorithm.
     *
     * @param authenticationAlgorithm the authenticationAlgorithm
     * @return the IKEPolicyPatch builder
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
     * @return the IKEPolicyPatch builder
     */
    public Builder authenticationAlgorithms(List<String> authenticationAlgorithms) {
      this.authenticationAlgorithms = authenticationAlgorithms;
      return this;
    }

    /**
     * Set the dhGroup.
     *
     * @param dhGroup the dhGroup
     * @return the IKEPolicyPatch builder
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
     * @return the IKEPolicyPatch builder
     */
    public Builder dhGroups(List<Long> dhGroups) {
      this.dhGroups = dhGroups;
      return this;
    }

    /**
     * Set the encryptionAlgorithm.
     *
     * @param encryptionAlgorithm the encryptionAlgorithm
     * @return the IKEPolicyPatch builder
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
     * @return the IKEPolicyPatch builder
     */
    public Builder encryptionAlgorithms(List<String> encryptionAlgorithms) {
      this.encryptionAlgorithms = encryptionAlgorithms;
      return this;
    }

    /**
     * Set the ikeVersion.
     *
     * @param ikeVersion the ikeVersion
     * @return the IKEPolicyPatch builder
     */
    public Builder ikeVersion(long ikeVersion) {
      this.ikeVersion = ikeVersion;
      return this;
    }

    /**
     * Set the keyLifetime.
     *
     * @param keyLifetime the keyLifetime
     * @return the IKEPolicyPatch builder
     */
    public Builder keyLifetime(long keyLifetime) {
      this.keyLifetime = keyLifetime;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the IKEPolicyPatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected IKEPolicyPatch() { }

  protected IKEPolicyPatch(Builder builder) {
    authenticationAlgorithm = builder.authenticationAlgorithm;
    authenticationAlgorithms = builder.authenticationAlgorithms;
    dhGroup = builder.dhGroup;
    dhGroups = builder.dhGroups;
    encryptionAlgorithm = builder.encryptionAlgorithm;
    encryptionAlgorithms = builder.encryptionAlgorithms;
    ikeVersion = builder.ikeVersion;
    keyLifetime = builder.keyLifetime;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a IKEPolicyPatch builder
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
   * The authentication algorithms to use for IKE Negotiation.
   *
   * If specified, `authentication_algorithm` must not be specified.
   *
   * If the IKE policy's `ike_version` is `1`, this array must contain exactly one algorithm.
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
   * Gets the dhGroup.
   *
   * The Diffie-Hellman group.
   *
   * `dh_group` has been deprecated. Use `dh_groups` instead.
   *
   * If specified, `dh_groups` must not be specified.
   *
   * Updating this property will also update the `dh_groups` field accordingly.
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
   * The Diffie-Hellman groups to use for IKE Negotiation.
   *
   * If specified, `dh_group` must not be specified.
   *
   * If the IKE policy's `ike_version` is `1`, this array must contain exactly one algorithm.
   *
   * The order of the Diffie-Hellman groups in this array indicates their priority for negotiation, with each
   * Diffie-Hellman group having priority over the one after it.
   *
   * Updating this property will also update the `dh_group` field accordingly.
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
   * If specified, `encryption_algorithms` must not be specified.
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
   * The encryption algorithms to use for IKE negotiation.
   *
   * If specified, `encryption_algorithm` must not be specified.
   *
   * If the IKE policy's `ike_version` is `1`, this array must contain exactly one algorithm.
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
   * The name for this IKE policy. The name must not be used by another IKE policy in the region.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Construct a JSON merge-patch from the IKEPolicyPatch.
   *
   * Note that properties of the IKEPolicyPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the IKEPolicyPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

