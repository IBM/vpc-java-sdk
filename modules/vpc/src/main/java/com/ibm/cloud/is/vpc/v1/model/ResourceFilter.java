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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Identifies one or more resources according to the specified filter property.
 */
public class ResourceFilter extends GenericModel {

  @SerializedName("resource_type")
  protected String resourceType;

  /**
   * Builder.
   */
  public static class Builder {
    private String resourceType;

    /**
     * Instantiates a new Builder from an existing ResourceFilter instance.
     *
     * @param resourceFilter the instance to initialize the Builder with
     */
    private Builder(ResourceFilter resourceFilter) {
      this.resourceType = resourceFilter.resourceType;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ResourceFilter.
     *
     * @return the new ResourceFilter instance
     */
    public ResourceFilter build() {
      return new ResourceFilter(this);
    }

    /**
     * Set the resourceType.
     *
     * @param resourceType the resourceType
     * @return the ResourceFilter builder
     */
    public Builder resourceType(String resourceType) {
      this.resourceType = resourceType;
      return this;
    }
  }

  protected ResourceFilter() { }

  protected ResourceFilter(Builder builder) {
    resourceType = builder.resourceType;
  }

  /**
   * New builder.
   *
   * @return a ResourceFilter builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the resourceType.
   *
   * The resource type.
   *
   * @return the resourceType
   */
  public String resourceType() {
    return resourceType;
  }
}

