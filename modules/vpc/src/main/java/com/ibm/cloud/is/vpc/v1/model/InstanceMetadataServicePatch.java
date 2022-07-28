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
 * The metadata service configuration.
 */
public class InstanceMetadataServicePatch extends GenericModel {

  protected Boolean enabled;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean enabled;

    private Builder(InstanceMetadataServicePatch instanceMetadataServicePatch) {
      this.enabled = instanceMetadataServicePatch.enabled;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a InstanceMetadataServicePatch.
     *
     * @return the new InstanceMetadataServicePatch instance
     */
    public InstanceMetadataServicePatch build() {
      return new InstanceMetadataServicePatch(this);
    }

    /**
     * Set the enabled.
     *
     * @param enabled the enabled
     * @return the InstanceMetadataServicePatch builder
     */
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }
  }

  protected InstanceMetadataServicePatch(Builder builder) {
    enabled = builder.enabled;
  }

  /**
   * New builder.
   *
   * @return a InstanceMetadataServicePatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the enabled.
   *
   * Indicates whether the metadata service endpoint will be available to the virtual server instance.
   *
   * @return the enabled
   */
  public Boolean enabled() {
    return enabled;
  }
}

