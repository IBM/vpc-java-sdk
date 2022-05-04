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
   */
  public interface AuthenticationAlgorithm {
    /** md5. */
    String MD5 = "md5";
    /** sha1. */
    String SHA1 = "sha1";
    /** sha256. */
    String SHA256 = "sha256";
    /** sha512. */
    String SHA512 = "sha512";
  }

  /**
   * The encryption algorithm.
   */
  public interface EncryptionAlgorithm {
    /** aes128. */
    String AES128 = "aes128";
    /** aes256. */
    String AES256 = "aes256";
    /** triple_des. */
    String TRIPLE_DES = "triple_des";
  }

  @SerializedName("authentication_algorithm")
  protected String authenticationAlgorithm;
  @SerializedName("dh_group")
  protected Long dhGroup;
  @SerializedName("encryption_algorithm")
  protected String encryptionAlgorithm;
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
    private Long dhGroup;
    private String encryptionAlgorithm;
    private Long ikeVersion;
    private Long keyLifetime;
    private String name;

    private Builder(IKEPolicyPatch ikePolicyPatch) {
      this.authenticationAlgorithm = ikePolicyPatch.authenticationAlgorithm;
      this.dhGroup = ikePolicyPatch.dhGroup;
      this.encryptionAlgorithm = ikePolicyPatch.encryptionAlgorithm;
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
     * Set the authenticationAlgorithm.
     *
     * @param authenticationAlgorithm the authenticationAlgorithm
     * @return the IKEPolicyPatch builder
     */
    public Builder authenticationAlgorithm(String authenticationAlgorithm) {
      this.authenticationAlgorithm = authenticationAlgorithm;
      return this;
    }

    /**
     * Set the dhGroup.
     *
     * @param dhGroup the dhGroup
     * @return the IKEPolicyPatch builder
     */
    public Builder dhGroup(long dhGroup) {
      this.dhGroup = dhGroup;
      return this;
    }

    /**
     * Set the encryptionAlgorithm.
     *
     * @param encryptionAlgorithm the encryptionAlgorithm
     * @return the IKEPolicyPatch builder
     */
    public Builder encryptionAlgorithm(String encryptionAlgorithm) {
      this.encryptionAlgorithm = encryptionAlgorithm;
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

  protected IKEPolicyPatch(Builder builder) {
    authenticationAlgorithm = builder.authenticationAlgorithm;
    dhGroup = builder.dhGroup;
    encryptionAlgorithm = builder.encryptionAlgorithm;
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
   * The user-defined name for this IKE policy.
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

