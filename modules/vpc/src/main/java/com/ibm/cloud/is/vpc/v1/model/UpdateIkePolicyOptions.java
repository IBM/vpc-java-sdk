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
 * The updateIkePolicy options.
 */
public class UpdateIkePolicyOptions extends GenericModel {

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

  protected String id;
  protected String name;
  protected String authenticationAlgorithm;
  protected Long dhGroup;
  protected String encryptionAlgorithm;
  protected Long ikeVersion;
  protected Long keyLifetime;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String name;
    private String authenticationAlgorithm;
    private Long dhGroup;
    private String encryptionAlgorithm;
    private Long ikeVersion;
    private Long keyLifetime;

    private Builder(UpdateIkePolicyOptions updateIkePolicyOptions) {
      this.id = updateIkePolicyOptions.id;
      this.name = updateIkePolicyOptions.name;
      this.authenticationAlgorithm = updateIkePolicyOptions.authenticationAlgorithm;
      this.dhGroup = updateIkePolicyOptions.dhGroup;
      this.encryptionAlgorithm = updateIkePolicyOptions.encryptionAlgorithm;
      this.ikeVersion = updateIkePolicyOptions.ikeVersion;
      this.keyLifetime = updateIkePolicyOptions.keyLifetime;
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
     * Builds a UpdateIkePolicyOptions.
     *
     * @return the new UpdateIkePolicyOptions instance
     */
    public UpdateIkePolicyOptions build() {
      return new UpdateIkePolicyOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateIkePolicyOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateIkePolicyOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the authenticationAlgorithm.
     *
     * @param authenticationAlgorithm the authenticationAlgorithm
     * @return the UpdateIkePolicyOptions builder
     */
    public Builder authenticationAlgorithm(String authenticationAlgorithm) {
      this.authenticationAlgorithm = authenticationAlgorithm;
      return this;
    }

    /**
     * Set the dhGroup.
     *
     * @param dhGroup the dhGroup
     * @return the UpdateIkePolicyOptions builder
     */
    public Builder dhGroup(long dhGroup) {
      this.dhGroup = dhGroup;
      return this;
    }

    /**
     * Set the encryptionAlgorithm.
     *
     * @param encryptionAlgorithm the encryptionAlgorithm
     * @return the UpdateIkePolicyOptions builder
     */
    public Builder encryptionAlgorithm(String encryptionAlgorithm) {
      this.encryptionAlgorithm = encryptionAlgorithm;
      return this;
    }

    /**
     * Set the ikeVersion.
     *
     * @param ikeVersion the ikeVersion
     * @return the UpdateIkePolicyOptions builder
     */
    public Builder ikeVersion(long ikeVersion) {
      this.ikeVersion = ikeVersion;
      return this;
    }

    /**
     * Set the keyLifetime.
     *
     * @param keyLifetime the keyLifetime
     * @return the UpdateIkePolicyOptions builder
     */
    public Builder keyLifetime(long keyLifetime) {
      this.keyLifetime = keyLifetime;
      return this;
    }
  }

  protected UpdateIkePolicyOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    name = builder.name;
    authenticationAlgorithm = builder.authenticationAlgorithm;
    dhGroup = builder.dhGroup;
    encryptionAlgorithm = builder.encryptionAlgorithm;
    ikeVersion = builder.ikeVersion;
    keyLifetime = builder.keyLifetime;
  }

  /**
   * New builder.
   *
   * @return a UpdateIkePolicyOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The IKE policy identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
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
}

