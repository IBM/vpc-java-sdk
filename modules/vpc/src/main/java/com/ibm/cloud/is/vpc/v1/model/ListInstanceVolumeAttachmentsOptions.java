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
 * The listInstanceVolumeAttachments options.
 */
public class ListInstanceVolumeAttachmentsOptions extends GenericModel {

  protected String instanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;

    /**
     * Instantiates a new Builder from an existing ListInstanceVolumeAttachmentsOptions instance.
     *
     * @param listInstanceVolumeAttachmentsOptions the instance to initialize the Builder with
     */
    private Builder(ListInstanceVolumeAttachmentsOptions listInstanceVolumeAttachmentsOptions) {
      this.instanceId = listInstanceVolumeAttachmentsOptions.instanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param instanceId the instanceId
     */
    public Builder(String instanceId) {
      this.instanceId = instanceId;
    }

    /**
     * Builds a ListInstanceVolumeAttachmentsOptions.
     *
     * @return the new ListInstanceVolumeAttachmentsOptions instance
     */
    public ListInstanceVolumeAttachmentsOptions build() {
      return new ListInstanceVolumeAttachmentsOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the ListInstanceVolumeAttachmentsOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }
  }

  protected ListInstanceVolumeAttachmentsOptions() { }

  protected ListInstanceVolumeAttachmentsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    instanceId = builder.instanceId;
  }

  /**
   * New builder.
   *
   * @return a ListInstanceVolumeAttachmentsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the instanceId.
   *
   * The instance identifier.
   *
   * @return the instanceId
   */
  public String instanceId() {
    return instanceId;
  }
}

