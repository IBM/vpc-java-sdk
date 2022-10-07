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
 * The listDedicatedHostDisks options.
 */
public class ListDedicatedHostDisksOptions extends GenericModel {

  protected String dedicatedHostId;

  /**
   * Builder.
   */
  public static class Builder {
    private String dedicatedHostId;

    /**
     * Instantiates a new Builder from an existing ListDedicatedHostDisksOptions instance.
     *
     * @param listDedicatedHostDisksOptions the instance to initialize the Builder with
     */
    private Builder(ListDedicatedHostDisksOptions listDedicatedHostDisksOptions) {
      this.dedicatedHostId = listDedicatedHostDisksOptions.dedicatedHostId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param dedicatedHostId the dedicatedHostId
     */
    public Builder(String dedicatedHostId) {
      this.dedicatedHostId = dedicatedHostId;
    }

    /**
     * Builds a ListDedicatedHostDisksOptions.
     *
     * @return the new ListDedicatedHostDisksOptions instance
     */
    public ListDedicatedHostDisksOptions build() {
      return new ListDedicatedHostDisksOptions(this);
    }

    /**
     * Set the dedicatedHostId.
     *
     * @param dedicatedHostId the dedicatedHostId
     * @return the ListDedicatedHostDisksOptions builder
     */
    public Builder dedicatedHostId(String dedicatedHostId) {
      this.dedicatedHostId = dedicatedHostId;
      return this;
    }
  }

  protected ListDedicatedHostDisksOptions() { }

  protected ListDedicatedHostDisksOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.dedicatedHostId,
      "dedicatedHostId cannot be empty");
    dedicatedHostId = builder.dedicatedHostId;
  }

  /**
   * New builder.
   *
   * @return a ListDedicatedHostDisksOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the dedicatedHostId.
   *
   * The dedicated host identifier.
   *
   * @return the dedicatedHostId
   */
  public String dedicatedHostId() {
    return dedicatedHostId;
  }
}

