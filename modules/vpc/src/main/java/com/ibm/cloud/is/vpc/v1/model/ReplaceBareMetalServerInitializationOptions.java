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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The replaceBareMetalServerInitialization options.
 */
public class ReplaceBareMetalServerInitializationOptions extends GenericModel {

  protected String id;
  protected ImageIdentity image;
  protected List<KeyIdentity> keys;
  protected String userData;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private ImageIdentity image;
    private List<KeyIdentity> keys;
    private String userData;

    /**
     * Instantiates a new Builder from an existing ReplaceBareMetalServerInitializationOptions instance.
     *
     * @param replaceBareMetalServerInitializationOptions the instance to initialize the Builder with
     */
    private Builder(ReplaceBareMetalServerInitializationOptions replaceBareMetalServerInitializationOptions) {
      this.id = replaceBareMetalServerInitializationOptions.id;
      this.image = replaceBareMetalServerInitializationOptions.image;
      this.keys = replaceBareMetalServerInitializationOptions.keys;
      this.userData = replaceBareMetalServerInitializationOptions.userData;
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
     * @param image the image
     * @param keys the keys
     */
    public Builder(String id, ImageIdentity image, List<KeyIdentity> keys) {
      this.id = id;
      this.image = image;
      this.keys = keys;
    }

    /**
     * Builds a ReplaceBareMetalServerInitializationOptions.
     *
     * @return the new ReplaceBareMetalServerInitializationOptions instance
     */
    public ReplaceBareMetalServerInitializationOptions build() {
      return new ReplaceBareMetalServerInitializationOptions(this);
    }

    /**
     * Adds a new element to keys.
     *
     * @param keys the new element to be added
     * @return the ReplaceBareMetalServerInitializationOptions builder
     */
    public Builder addKeys(KeyIdentity keys) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(keys,
        "keys cannot be null");
      if (this.keys == null) {
        this.keys = new ArrayList<KeyIdentity>();
      }
      this.keys.add(keys);
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the ReplaceBareMetalServerInitializationOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the image.
     *
     * @param image the image
     * @return the ReplaceBareMetalServerInitializationOptions builder
     */
    public Builder image(ImageIdentity image) {
      this.image = image;
      return this;
    }

    /**
     * Set the keys.
     * Existing keys will be replaced.
     *
     * @param keys the keys
     * @return the ReplaceBareMetalServerInitializationOptions builder
     */
    public Builder keys(List<KeyIdentity> keys) {
      this.keys = keys;
      return this;
    }

    /**
     * Set the userData.
     *
     * @param userData the userData
     * @return the ReplaceBareMetalServerInitializationOptions builder
     */
    public Builder userData(String userData) {
      this.userData = userData;
      return this;
    }
  }

  protected ReplaceBareMetalServerInitializationOptions() { }

  protected ReplaceBareMetalServerInitializationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.image,
      "image cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.keys,
      "keys cannot be null");
    id = builder.id;
    image = builder.image;
    keys = builder.keys;
    userData = builder.userData;
  }

  /**
   * New builder.
   *
   * @return a ReplaceBareMetalServerInitializationOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The bare metal server identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the image.
   *
   * The image to be used when provisioning the bare metal server.
   *
   * @return the image
   */
  public ImageIdentity image() {
    return image;
  }

  /**
   * Gets the keys.
   *
   * The public SSH keys to install on the bare metal server. Keys will be made available to the bare metal server as
   * cloud-init vendor data. For cloud-init enabled images, these keys will also be added as SSH authorized keys for the
   * administrative user.
   *
   * For Windows images, at least one key must be specified, and one will be selected to encrypt the administrator
   * password. Keys are optional for other images, but if no keys are specified, the instance will be inaccessible
   * unless the specified image provides another means of access.
   *
   * @return the keys
   */
  public List<KeyIdentity> keys() {
    return keys;
  }

  /**
   * Gets the userData.
   *
   * User data to be made available when initializing the bare metal server.
   *
   * If unspecified, no user data will be made available.
   *
   * @return the userData
   */
  public String userData() {
    return userData;
  }
}

