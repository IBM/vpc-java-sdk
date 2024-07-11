/*
 * (C) Copyright IBM Corp. 2022, 2023, 2024.
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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateSnapshotConsistencyGroup options.
 */
public class UpdateSnapshotConsistencyGroupOptions extends GenericModel {

  protected String id;
  protected Map<String, Object> snapshotConsistencyGroupPatch;
  protected String ifMatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Map<String, Object> snapshotConsistencyGroupPatch;
    private String ifMatch;

    /**
     * Instantiates a new Builder from an existing UpdateSnapshotConsistencyGroupOptions instance.
     *
     * @param updateSnapshotConsistencyGroupOptions the instance to initialize the Builder with
     */
    private Builder(UpdateSnapshotConsistencyGroupOptions updateSnapshotConsistencyGroupOptions) {
      this.id = updateSnapshotConsistencyGroupOptions.id;
      this.snapshotConsistencyGroupPatch = updateSnapshotConsistencyGroupOptions.snapshotConsistencyGroupPatch;
      this.ifMatch = updateSnapshotConsistencyGroupOptions.ifMatch;
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
     * @param snapshotConsistencyGroupPatch the snapshotConsistencyGroupPatch
     */
    public Builder(String id, Map<String, Object> snapshotConsistencyGroupPatch) {
      this.id = id;
      this.snapshotConsistencyGroupPatch = snapshotConsistencyGroupPatch;
    }

    /**
     * Builds a UpdateSnapshotConsistencyGroupOptions.
     *
     * @return the new UpdateSnapshotConsistencyGroupOptions instance
     */
    public UpdateSnapshotConsistencyGroupOptions build() {
      return new UpdateSnapshotConsistencyGroupOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateSnapshotConsistencyGroupOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the snapshotConsistencyGroupPatch.
     *
     * @param snapshotConsistencyGroupPatch the snapshotConsistencyGroupPatch
     * @return the UpdateSnapshotConsistencyGroupOptions builder
     */
    public Builder snapshotConsistencyGroupPatch(Map<String, Object> snapshotConsistencyGroupPatch) {
      this.snapshotConsistencyGroupPatch = snapshotConsistencyGroupPatch;
      return this;
    }

    /**
     * Set the ifMatch.
     *
     * @param ifMatch the ifMatch
     * @return the UpdateSnapshotConsistencyGroupOptions builder
     */
    public Builder ifMatch(String ifMatch) {
      this.ifMatch = ifMatch;
      return this;
    }
  }

  protected UpdateSnapshotConsistencyGroupOptions() { }

  protected UpdateSnapshotConsistencyGroupOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.snapshotConsistencyGroupPatch,
      "snapshotConsistencyGroupPatch cannot be null");
    id = builder.id;
    snapshotConsistencyGroupPatch = builder.snapshotConsistencyGroupPatch;
    ifMatch = builder.ifMatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateSnapshotConsistencyGroupOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The snapshot consistency group identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the snapshotConsistencyGroupPatch.
   *
   * The snapshot consistency group patch.
   *
   * @return the snapshotConsistencyGroupPatch
   */
  public Map<String, Object> snapshotConsistencyGroupPatch() {
    return snapshotConsistencyGroupPatch;
  }

  /**
   * Gets the ifMatch.
   *
   * If present, the request will fail if the specified ETag value does not match the resource's current ETag value.
   * Required if the request body includes an array.
   *
   * @return the ifMatch
   */
  public String ifMatch() {
    return ifMatch;
  }
}

