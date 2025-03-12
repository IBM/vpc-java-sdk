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
 * The createKey options.
 */
public class CreateKeyOptions extends GenericModel {

  /**
   * The crypto-system for this key.
   */
  public interface Type {
    /** ed25519. */
    String ED25519 = "ed25519";
    /** rsa. */
    String RSA = "rsa";
  }

  protected String publicKey;
  protected String name;
  protected ResourceGroupIdentity resourceGroup;
  protected String type;

  /**
   * Builder.
   */
  public static class Builder {
    private String publicKey;
    private String name;
    private ResourceGroupIdentity resourceGroup;
    private String type;

    /**
     * Instantiates a new Builder from an existing CreateKeyOptions instance.
     *
     * @param createKeyOptions the instance to initialize the Builder with
     */
    private Builder(CreateKeyOptions createKeyOptions) {
      this.publicKey = createKeyOptions.publicKey;
      this.name = createKeyOptions.name;
      this.resourceGroup = createKeyOptions.resourceGroup;
      this.type = createKeyOptions.type;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param publicKey the publicKey
     */
    public Builder(String publicKey) {
      this.publicKey = publicKey;
    }

    /**
     * Builds a CreateKeyOptions.
     *
     * @return the new CreateKeyOptions instance
     */
    public CreateKeyOptions build() {
      return new CreateKeyOptions(this);
    }

    /**
     * Set the publicKey.
     *
     * @param publicKey the publicKey
     * @return the CreateKeyOptions builder
     */
    public Builder publicKey(String publicKey) {
      this.publicKey = publicKey;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateKeyOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the CreateKeyOptions builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the CreateKeyOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }

  protected CreateKeyOptions() { }

  protected CreateKeyOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.publicKey,
      "publicKey cannot be null");
    publicKey = builder.publicKey;
    name = builder.name;
    resourceGroup = builder.resourceGroup;
    type = builder.type;
  }

  /**
   * New builder.
   *
   * @return a CreateKeyOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the publicKey.
   *
   * The public SSH key to use, in OpenSSH format (consisting of three space-separated fields: the algorithm name,
   * base64-encoded key value, and a comment). The algorithm and comment fields may be omitted, as only the key field is
   * used.
   *
   * The key field must not match another key in the region.
   *
   * Keys of type `rsa` must be 2048 or 4096 bits in length (4096 is recommended). Keys of type `ed25519` must be 256
   * bits in length.
   *
   * @return the publicKey
   */
  public String publicKey() {
    return publicKey;
  }

  /**
   * Gets the name.
   *
   * The name for this key. The name must not be used by another key in the region. If unspecified, the name will be a
   * hyphenated list of randomly-selected words.
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

  /**
   * Gets the type.
   *
   * The crypto-system for this key.
   *
   * @return the type
   */
  public String type() {
    return type;
  }
}

