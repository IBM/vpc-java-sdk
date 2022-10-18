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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateSnapshot options.
 */
public class UpdateSnapshotOptions extends GenericModel {

  protected String id;
  protected Map<String, Object> snapshotPatch;
  protected String ifMatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Map<String, Object> snapshotPatch;
    private String ifMatch;

    /**
     * Instantiates a new Builder from an existing UpdateSnapshotOptions instance.
     *
     * @param updateSnapshotOptions the instance to initialize the Builder with
     */
    private Builder(UpdateSnapshotOptions updateSnapshotOptions) {
      this.id = updateSnapshotOptions.id;
      this.snapshotPatch = updateSnapshotOptions.snapshotPatch;
      this.ifMatch = updateSnapshotOptions.ifMatch;
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
     * @param snapshotPatch the snapshotPatch
     */
    public Builder(String id, Map<String, Object> snapshotPatch) {
      this.id = id;
      this.snapshotPatch = snapshotPatch;
    }

    /**
     * Builds a UpdateSnapshotOptions.
     *
     * @return the new UpdateSnapshotOptions instance
     */
    public UpdateSnapshotOptions build() {
      return new UpdateSnapshotOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateSnapshotOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the snapshotPatch.
     *
     * @param snapshotPatch the snapshotPatch
     * @return the UpdateSnapshotOptions builder
     */
    public Builder snapshotPatch(Map<String, Object> snapshotPatch) {
      this.snapshotPatch = snapshotPatch;
      return this;
    }

    /**
     * Set the ifMatch.
     *
     * @param ifMatch the ifMatch
     * @return the UpdateSnapshotOptions builder
     */
    public Builder ifMatch(String ifMatch) {
      this.ifMatch = ifMatch;
      return this;
    }
  }

  protected UpdateSnapshotOptions() { }

  protected UpdateSnapshotOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.snapshotPatch,
      "snapshotPatch cannot be null");
    id = builder.id;
    snapshotPatch = builder.snapshotPatch;
    ifMatch = builder.ifMatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateSnapshotOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The snapshot identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the snapshotPatch.
   *
   * The snapshot patch.
   *
   * @return the snapshotPatch
   */
  public Map<String, Object> snapshotPatch() {
    return snapshotPatch;
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

