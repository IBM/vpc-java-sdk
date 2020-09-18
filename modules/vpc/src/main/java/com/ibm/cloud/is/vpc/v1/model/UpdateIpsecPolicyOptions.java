/*
 * (C) Copyright IBM Corp. 2020.
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
 * The updateIpsecPolicy options.
 */
public class UpdateIpsecPolicyOptions extends GenericModel {

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
  }

  /**
   * The encryption algorithm.
   */
  public interface EncryptionAlgorithm {
    /** triple_des. */
    String TRIPLE_DES = "triple_des";
    /** aes128. */
    String AES128 = "aes128";
    /** aes256. */
    String AES256 = "aes256";
  }

  /**
   * Perfect Forward Secrecy.
   */
  public interface Pfs {
    /** disabled. */
    String DISABLED = "disabled";
    /** group_14. */
    String GROUP_14 = "group_14";
    /** group_2. */
    String GROUP_2 = "group_2";
    /** group_5. */
    String GROUP_5 = "group_5";
  }

  protected String id;
  protected String name;
  protected String authenticationAlgorithm;
  protected String encryptionAlgorithm;
  protected Long keyLifetime;
  protected String pfs;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String name;
    private String authenticationAlgorithm;
    private String encryptionAlgorithm;
    private Long keyLifetime;
    private String pfs;

    private Builder(UpdateIpsecPolicyOptions updateIpsecPolicyOptions) {
      this.id = updateIpsecPolicyOptions.id;
      this.name = updateIpsecPolicyOptions.name;
      this.authenticationAlgorithm = updateIpsecPolicyOptions.authenticationAlgorithm;
      this.encryptionAlgorithm = updateIpsecPolicyOptions.encryptionAlgorithm;
      this.keyLifetime = updateIpsecPolicyOptions.keyLifetime;
      this.pfs = updateIpsecPolicyOptions.pfs;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     */
    public Builder(String id) {
      this.id = id;
    }

    /**
     * Builds a UpdateIpsecPolicyOptions.
     *
     * @return the new UpdateIpsecPolicyOptions instance
     */
    public UpdateIpsecPolicyOptions build() {
      return new UpdateIpsecPolicyOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateIpsecPolicyOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateIpsecPolicyOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the authenticationAlgorithm.
     *
     * @param authenticationAlgorithm the authenticationAlgorithm
     * @return the UpdateIpsecPolicyOptions builder
     */
    public Builder authenticationAlgorithm(String authenticationAlgorithm) {
      this.authenticationAlgorithm = authenticationAlgorithm;
      return this;
    }

    /**
     * Set the encryptionAlgorithm.
     *
     * @param encryptionAlgorithm the encryptionAlgorithm
     * @return the UpdateIpsecPolicyOptions builder
     */
    public Builder encryptionAlgorithm(String encryptionAlgorithm) {
      this.encryptionAlgorithm = encryptionAlgorithm;
      return this;
    }

    /**
     * Set the keyLifetime.
     *
     * @param keyLifetime the keyLifetime
     * @return the UpdateIpsecPolicyOptions builder
     */
    public Builder keyLifetime(long keyLifetime) {
      this.keyLifetime = keyLifetime;
      return this;
    }

    /**
     * Set the pfs.
     *
     * @param pfs the pfs
     * @return the UpdateIpsecPolicyOptions builder
     */
    public Builder pfs(String pfs) {
      this.pfs = pfs;
      return this;
    }
  }

  protected UpdateIpsecPolicyOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    name = builder.name;
    authenticationAlgorithm = builder.authenticationAlgorithm;
    encryptionAlgorithm = builder.encryptionAlgorithm;
    keyLifetime = builder.keyLifetime;
    pfs = builder.pfs;
  }

  /**
   * New builder.
   *
   * @return a UpdateIpsecPolicyOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The IPsec policy identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
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
   * Gets the pfs.
   *
   * Perfect Forward Secrecy.
   *
   * @return the pfs
   */
  public String pfs() {
    return pfs;
  }
}

