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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The stopBareMetalServer options.
 */
public class StopBareMetalServerOptions extends GenericModel {

  /**
   * The type of stop operation:
   * - `soft`: signal running operating system to quiesce and shutdown cleanly
   * - `hard`: immediately stop the server.
   */
  public interface Type {
    /** hard. */
    String HARD = "hard";
    /** soft. */
    String SOFT = "soft";
  }

  protected String id;
  protected String type;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String type;

    private Builder(StopBareMetalServerOptions stopBareMetalServerOptions) {
      this.id = stopBareMetalServerOptions.id;
      this.type = stopBareMetalServerOptions.type;
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
     * @param type the type
     */
    public Builder(String id, String type) {
      this.id = id;
      this.type = type;
    }

    /**
     * Builds a StopBareMetalServerOptions.
     *
     * @return the new StopBareMetalServerOptions instance
     */
    public StopBareMetalServerOptions build() {
      return new StopBareMetalServerOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the StopBareMetalServerOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the StopBareMetalServerOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }

  protected StopBareMetalServerOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    id = builder.id;
    type = builder.type;
  }

  /**
   * New builder.
   *
   * @return a StopBareMetalServerOptions builder
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
   * Gets the type.
   *
   * The type of stop operation:
   * - `soft`: signal running operating system to quiesce and shutdown cleanly
   * - `hard`: immediately stop the server.
   *
   * @return the type
   */
  public String type() {
    return type;
  }
}

