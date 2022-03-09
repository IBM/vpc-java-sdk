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
 * The getDedicatedHostDisk options.
 */
public class GetDedicatedHostDiskOptions extends GenericModel {

  protected String dedicatedHostId;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String dedicatedHostId;
    private String id;

    private Builder(GetDedicatedHostDiskOptions getDedicatedHostDiskOptions) {
      this.dedicatedHostId = getDedicatedHostDiskOptions.dedicatedHostId;
      this.id = getDedicatedHostDiskOptions.id;
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
     * @param id the id
     */
    public Builder(String dedicatedHostId, String id) {
      this.dedicatedHostId = dedicatedHostId;
      this.id = id;
    }

    /**
     * Builds a GetDedicatedHostDiskOptions.
     *
     * @return the new GetDedicatedHostDiskOptions instance
     */
    public GetDedicatedHostDiskOptions build() {
      return new GetDedicatedHostDiskOptions(this);
    }

    /**
     * Set the dedicatedHostId.
     *
     * @param dedicatedHostId the dedicatedHostId
     * @return the GetDedicatedHostDiskOptions builder
     */
    public Builder dedicatedHostId(String dedicatedHostId) {
      this.dedicatedHostId = dedicatedHostId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetDedicatedHostDiskOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected GetDedicatedHostDiskOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.dedicatedHostId,
      "dedicatedHostId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    dedicatedHostId = builder.dedicatedHostId;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a GetDedicatedHostDiskOptions builder
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

  /**
   * Gets the id.
   *
   * The dedicated host disk identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

