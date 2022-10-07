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
 * The listBareMetalServerDisks options.
 */
public class ListBareMetalServerDisksOptions extends GenericModel {

  protected String bareMetalServerId;

  /**
   * Builder.
   */
  public static class Builder {
    private String bareMetalServerId;

    /**
     * Instantiates a new Builder from an existing ListBareMetalServerDisksOptions instance.
     *
     * @param listBareMetalServerDisksOptions the instance to initialize the Builder with
     */
    private Builder(ListBareMetalServerDisksOptions listBareMetalServerDisksOptions) {
      this.bareMetalServerId = listBareMetalServerDisksOptions.bareMetalServerId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param bareMetalServerId the bareMetalServerId
     */
    public Builder(String bareMetalServerId) {
      this.bareMetalServerId = bareMetalServerId;
    }

    /**
     * Builds a ListBareMetalServerDisksOptions.
     *
     * @return the new ListBareMetalServerDisksOptions instance
     */
    public ListBareMetalServerDisksOptions build() {
      return new ListBareMetalServerDisksOptions(this);
    }

    /**
     * Set the bareMetalServerId.
     *
     * @param bareMetalServerId the bareMetalServerId
     * @return the ListBareMetalServerDisksOptions builder
     */
    public Builder bareMetalServerId(String bareMetalServerId) {
      this.bareMetalServerId = bareMetalServerId;
      return this;
    }
  }

  protected ListBareMetalServerDisksOptions() { }

  protected ListBareMetalServerDisksOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.bareMetalServerId,
      "bareMetalServerId cannot be empty");
    bareMetalServerId = builder.bareMetalServerId;
  }

  /**
   * New builder.
   *
   * @return a ListBareMetalServerDisksOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the bareMetalServerId.
   *
   * The bare metal server identifier.
   *
   * @return the bareMetalServerId
   */
  public String bareMetalServerId() {
    return bareMetalServerId;
  }
}

