/*
 * (C) Copyright IBM Corp. 2023, 2024, 2025.
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
 * The createVolumeJob options.
 */
public class CreateVolumeJobOptions extends GenericModel {

  protected String volumeId;
  protected VolumeJobPrototype volumeJobPrototype;
  protected String start;
  protected Long limit;

  /**
   * Builder.
   */
  public static class Builder {
    private String volumeId;
    private VolumeJobPrototype volumeJobPrototype;
    private String start;
    private Long limit;

    /**
     * Instantiates a new Builder from an existing CreateVolumeJobOptions instance.
     *
     * @param createVolumeJobOptions the instance to initialize the Builder with
     */
    private Builder(CreateVolumeJobOptions createVolumeJobOptions) {
      this.volumeId = createVolumeJobOptions.volumeId;
      this.volumeJobPrototype = createVolumeJobOptions.volumeJobPrototype;
      this.start = createVolumeJobOptions.start;
      this.limit = createVolumeJobOptions.limit;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param volumeId the volumeId
     * @param volumeJobPrototype the volumeJobPrototype
     */
    public Builder(String volumeId, VolumeJobPrototype volumeJobPrototype) {
      this.volumeId = volumeId;
      this.volumeJobPrototype = volumeJobPrototype;
    }

    /**
     * Builds a CreateVolumeJobOptions.
     *
     * @return the new CreateVolumeJobOptions instance
     */
    public CreateVolumeJobOptions build() {
      return new CreateVolumeJobOptions(this);
    }

    /**
     * Set the volumeId.
     *
     * @param volumeId the volumeId
     * @return the CreateVolumeJobOptions builder
     */
    public Builder volumeId(String volumeId) {
      this.volumeId = volumeId;
      return this;
    }

    /**
     * Set the volumeJobPrototype.
     *
     * @param volumeJobPrototype the volumeJobPrototype
     * @return the CreateVolumeJobOptions builder
     */
    public Builder volumeJobPrototype(VolumeJobPrototype volumeJobPrototype) {
      this.volumeJobPrototype = volumeJobPrototype;
      return this;
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the CreateVolumeJobOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the CreateVolumeJobOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }
  }

  protected CreateVolumeJobOptions() { }

  protected CreateVolumeJobOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.volumeId,
      "volumeId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.volumeJobPrototype,
      "volumeJobPrototype cannot be null");
    volumeId = builder.volumeId;
    volumeJobPrototype = builder.volumeJobPrototype;
    start = builder.start;
    limit = builder.limit;
  }

  /**
   * New builder.
   *
   * @return a CreateVolumeJobOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the volumeId.
   *
   * The volume identifier.
   *
   * @return the volumeId
   */
  public String volumeId() {
    return volumeId;
  }

  /**
   * Gets the volumeJobPrototype.
   *
   * The volume job prototype object.
   *
   * @return the volumeJobPrototype
   */
  public VolumeJobPrototype volumeJobPrototype() {
    return volumeJobPrototype;
  }

  /**
   * Gets the start.
   *
   * A server-provided token determining what resource to start the page on.
   *
   * @return the start
   */
  public String start() {
    return start;
  }

  /**
   * Gets the limit.
   *
   * The number of resources to return on a page.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }
}

