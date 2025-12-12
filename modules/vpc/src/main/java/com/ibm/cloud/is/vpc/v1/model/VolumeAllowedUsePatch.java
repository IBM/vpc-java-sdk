/*
 * (C) Copyright IBM Corp. 2025.
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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * VolumeAllowedUsePatch.
 */
public class VolumeAllowedUsePatch extends GenericModel {

  @SerializedName("api_version")
  protected String apiVersion;
  @SerializedName("bare_metal_server")
  protected String bareMetalServer;
  protected String instance;

  /**
   * Builder.
   */
  public static class Builder {
    private String apiVersion;
    private String bareMetalServer;
    private String instance;

    /**
     * Instantiates a new Builder from an existing VolumeAllowedUsePatch instance.
     *
     * @param volumeAllowedUsePatch the instance to initialize the Builder with
     */
    private Builder(VolumeAllowedUsePatch volumeAllowedUsePatch) {
      this.apiVersion = volumeAllowedUsePatch.apiVersion;
      this.bareMetalServer = volumeAllowedUsePatch.bareMetalServer;
      this.instance = volumeAllowedUsePatch.instance;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a VolumeAllowedUsePatch.
     *
     * @return the new VolumeAllowedUsePatch instance
     */
    public VolumeAllowedUsePatch build() {
      return new VolumeAllowedUsePatch(this);
    }

    /**
     * Set the apiVersion.
     *
     * @param apiVersion the apiVersion
     * @return the VolumeAllowedUsePatch builder
     */
    public Builder apiVersion(String apiVersion) {
      this.apiVersion = apiVersion;
      return this;
    }

    /**
     * Set the bareMetalServer.
     *
     * @param bareMetalServer the bareMetalServer
     * @return the VolumeAllowedUsePatch builder
     */
    public Builder bareMetalServer(String bareMetalServer) {
      this.bareMetalServer = bareMetalServer;
      return this;
    }

    /**
     * Set the instance.
     *
     * @param instance the instance
     * @return the VolumeAllowedUsePatch builder
     */
    public Builder instance(String instance) {
      this.instance = instance;
      return this;
    }
  }

  protected VolumeAllowedUsePatch() { }

  protected VolumeAllowedUsePatch(Builder builder) {
    apiVersion = builder.apiVersion;
    bareMetalServer = builder.bareMetalServer;
    instance = builder.instance;
  }

  /**
   * New builder.
   *
   * @return a VolumeAllowedUsePatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the apiVersion.
   *
   * The API version with which to evaluate the expressions.
   *
   * If specified, the value must be between `2019-01-01` and today's date (in UTC).
   *
   * @return the apiVersion
   */
  public String apiVersion() {
    return apiVersion;
  }

  /**
   * Gets the bareMetalServer.
   *
   * The expression that must be satisfied by the properties of a bare metal server provisioned using the image data in
   * this volume.
   *
   * The expression follows [Common Expression Language](https://github.com/google/cel-spec/blob/master/doc/langdef.md),
   * but does not support built-in functions and macros. In addition, the following variable is supported, corresponding
   * to the `BareMetalServer` property:
   * - `enable_secure_boot` (boolean): Indicates whether secure boot is enabled.
   *
   * @return the bareMetalServer
   */
  public String bareMetalServer() {
    return bareMetalServer;
  }

  /**
   * Gets the instance.
   *
   * The expression that must be satisfied by the properties of a virtual server instance provisioned using this volume
   *
   * The expression follows [Common Expression Language](https://github.com/google/cel-spec/blob/master/doc/langdef.md),
   * but does not support built-in functions and macros. In addition, the following variables are supported,
   * corresponding to `Instance` properties:
   * - `enable_secure_boot` (boolean): Indicates whether secure boot is enabled
   * - `gpu.count` (integer): The number of GPUs
   * - `gpu.manufacturer` (string): The GPU manufacturer
   * - `gpu.memory` (integer): The overall amount of GPU memory in GiB (gibibytes)
   * - `gpu.model` (string): The GPU model.
   *
   * @return the instance
   */
  public String instance() {
    return instance;
  }
}

