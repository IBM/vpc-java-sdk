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
 * The deleteSnapshots options.
 */
public class DeleteSnapshotsOptions extends GenericModel {

  protected String sourceVolumeId;

  /**
   * Builder.
   */
  public static class Builder {
    private String sourceVolumeId;

    private Builder(DeleteSnapshotsOptions deleteSnapshotsOptions) {
      this.sourceVolumeId = deleteSnapshotsOptions.sourceVolumeId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param sourceVolumeId the sourceVolumeId
     */
    public Builder(String sourceVolumeId) {
      this.sourceVolumeId = sourceVolumeId;
    }

    /**
     * Builds a DeleteSnapshotsOptions.
     *
     * @return the new DeleteSnapshotsOptions instance
     */
    public DeleteSnapshotsOptions build() {
      return new DeleteSnapshotsOptions(this);
    }

    /**
     * Set the sourceVolumeId.
     *
     * @param sourceVolumeId the sourceVolumeId
     * @return the DeleteSnapshotsOptions builder
     */
    public Builder sourceVolumeId(String sourceVolumeId) {
      this.sourceVolumeId = sourceVolumeId;
      return this;
    }
  }

  protected DeleteSnapshotsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.sourceVolumeId,
      "sourceVolumeId cannot be null");
    sourceVolumeId = builder.sourceVolumeId;
  }

  /**
   * New builder.
   *
   * @return a DeleteSnapshotsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the sourceVolumeId.
   *
   * Filters the collection to resources with the source volume with the specified identifier.
   *
   * @return the sourceVolumeId
   */
  public String sourceVolumeId() {
    return sourceVolumeId;
  }
}

