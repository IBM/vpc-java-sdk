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
 * IPsecPolicyPatch.
 */
public class IPsecPolicyPatch extends GenericModel {

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

  /**
   * Perfect Forward Secrecy.
   */
  public interface Pfs {
    /** disabled. */
    String DISABLED = "disabled";
    /** group_14. */
    String GROUP_14 = "group_14";
    /** group_19. */
    String GROUP_19 = "group_19";
    /** group_2. */
    String GROUP_2 = "group_2";
    /** group_5. */
    String GROUP_5 = "group_5";
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
   * The authentication algorithm.
   *
   * @return the authenticationAlgorithm
   */
  public String authenticationAlgorithm() {
    return authenticationAlgorithm;
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
   * Gets the pfs.
   *
   * Perfect Forward Secrecy.
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

