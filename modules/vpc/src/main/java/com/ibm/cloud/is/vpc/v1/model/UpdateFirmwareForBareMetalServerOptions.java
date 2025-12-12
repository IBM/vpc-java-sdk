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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateFirmwareForBareMetalServer options.
 */
public class UpdateFirmwareForBareMetalServerOptions extends GenericModel {

  protected String id;
  protected Boolean autoStart;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Boolean autoStart;

    /**
     * Instantiates a new Builder from an existing UpdateFirmwareForBareMetalServerOptions instance.
     *
     * @param updateFirmwareForBareMetalServerOptions the instance to initialize the Builder with
     */
    private Builder(UpdateFirmwareForBareMetalServerOptions updateFirmwareForBareMetalServerOptions) {
      this.id = updateFirmwareForBareMetalServerOptions.id;
      this.autoStart = updateFirmwareForBareMetalServerOptions.autoStart;
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
     * Builds a UpdateFirmwareForBareMetalServerOptions.
     *
     * @return the new UpdateFirmwareForBareMetalServerOptions instance
     */
    public UpdateFirmwareForBareMetalServerOptions build() {
      return new UpdateFirmwareForBareMetalServerOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateFirmwareForBareMetalServerOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the autoStart.
     *
     * @param autoStart the autoStart
     * @return the UpdateFirmwareForBareMetalServerOptions builder
     */
    public Builder autoStart(Boolean autoStart) {
      this.autoStart = autoStart;
      return this;
    }
  }

  protected UpdateFirmwareForBareMetalServerOptions() { }

  protected UpdateFirmwareForBareMetalServerOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    autoStart = builder.autoStart;
  }

  /**
   * New builder.
   *
   * @return a UpdateFirmwareForBareMetalServerOptions builder
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
   * Gets the autoStart.
   *
   * Indicates whether to automatically start the bare metal server after the firmware update is successfully completed.
   *
   * @return the autoStart
   */
  public Boolean autoStart() {
    return autoStart;
  }
}

