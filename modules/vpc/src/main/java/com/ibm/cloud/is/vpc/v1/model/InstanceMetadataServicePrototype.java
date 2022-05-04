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
 * InstanceMetadataServicePrototype.
 */
public class InstanceMetadataServicePrototype extends GenericModel {

  protected Boolean enabled;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean enabled;

    private Builder(InstanceMetadataServicePrototype instanceMetadataServicePrototype) {
      this.enabled = instanceMetadataServicePrototype.enabled;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a InstanceMetadataServicePrototype.
     *
     * @return the new InstanceMetadataServicePrototype instance
     */
    public InstanceMetadataServicePrototype build() {
      return new InstanceMetadataServicePrototype(this);
    }

    /**
     * Set the enabled.
     *
     * @param enabled the enabled
     * @return the InstanceMetadataServicePrototype builder
     */
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }
  }

  protected InstanceMetadataServicePrototype(Builder builder) {
    enabled = builder.enabled;
  }

  /**
   * New builder.
   *
   * @return a InstanceMetadataServicePrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the enabled.
   *
   * Indicates whether the metadata service endpoint is available to the virtual server instance.
   *
   * @return the enabled
   */
  public Boolean enabled() {
    return enabled;
  }
}

