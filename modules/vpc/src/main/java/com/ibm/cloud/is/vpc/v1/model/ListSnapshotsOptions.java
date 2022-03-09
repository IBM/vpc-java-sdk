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
 * The listSnapshots options.
 */
public class ListSnapshotsOptions extends GenericModel {

  /**
   * Sorts the returned collection by the specified property name in ascending order. A `-` may be prepended to the name
   * to sort in descending order. For example, the value `-created_at` sorts the collection by the `created_at` property
   * in descending order, and the value `name` sorts it by the `name` property in ascending order.
   */
  public interface Sort {
    /** created_at. */
    String CREATED_AT = "created_at";
    /** name. */
    String NAME = "name";
  }

  protected String start;
  protected Long limit;
  protected String resourceGroupId;
  protected String name;
  protected String sourceVolumeId;
  protected String sourceVolumeCrn;
  protected String sourceImageId;
  protected String sourceImageCrn;
  protected String sort;

  /**
   * Builder.
   */
  public static class Builder {
    private String start;
    private Long limit;
    private String resourceGroupId;
    private String name;
    private String sourceVolumeId;
    private String sourceVolumeCrn;
    private String sourceImageId;
    private String sourceImageCrn;
    private String sort;

    private Builder(ListSnapshotsOptions listSnapshotsOptions) {
      this.start = listSnapshotsOptions.start;
      this.limit = listSnapshotsOptions.limit;
      this.resourceGroupId = listSnapshotsOptions.resourceGroupId;
      this.name = listSnapshotsOptions.name;
      this.sourceVolumeId = listSnapshotsOptions.sourceVolumeId;
      this.sourceVolumeCrn = listSnapshotsOptions.sourceVolumeCrn;
      this.sourceImageId = listSnapshotsOptions.sourceImageId;
      this.sourceImageCrn = listSnapshotsOptions.sourceImageCrn;
      this.sort = listSnapshotsOptions.sort;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListSnapshotsOptions.
     *
     * @return the new ListSnapshotsOptions instance
     */
    public ListSnapshotsOptions build() {
      return new ListSnapshotsOptions(this);
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListSnapshotsOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListSnapshotsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the resourceGroupId.
     *
     * @param resourceGroupId the resourceGroupId
     * @return the ListSnapshotsOptions builder
     */
    public Builder resourceGroupId(String resourceGroupId) {
      this.resourceGroupId = resourceGroupId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ListSnapshotsOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the sourceVolumeId.
     *
     * @param sourceVolumeId the sourceVolumeId
     * @return the ListSnapshotsOptions builder
     */
    public Builder sourceVolumeId(String sourceVolumeId) {
      this.sourceVolumeId = sourceVolumeId;
      return this;
    }

    /**
     * Set the sourceVolumeCrn.
     *
     * @param sourceVolumeCrn the sourceVolumeCrn
     * @return the ListSnapshotsOptions builder
     */
    public Builder sourceVolumeCrn(String sourceVolumeCrn) {
      this.sourceVolumeCrn = sourceVolumeCrn;
      return this;
    }

    /**
     * Set the sourceImageId.
     *
     * @param sourceImageId the sourceImageId
     * @return the ListSnapshotsOptions builder
     */
    public Builder sourceImageId(String sourceImageId) {
      this.sourceImageId = sourceImageId;
      return this;
    }

    /**
     * Set the sourceImageCrn.
     *
     * @param sourceImageCrn the sourceImageCrn
     * @return the ListSnapshotsOptions builder
     */
    public Builder sourceImageCrn(String sourceImageCrn) {
      this.sourceImageCrn = sourceImageCrn;
      return this;
    }

    /**
     * Set the sort.
     *
     * @param sort the sort
     * @return the ListSnapshotsOptions builder
     */
    public Builder sort(String sort) {
      this.sort = sort;
      return this;
    }
  }

  protected ListSnapshotsOptions(Builder builder) {
    start = builder.start;
    limit = builder.limit;
    resourceGroupId = builder.resourceGroupId;
    name = builder.name;
    sourceVolumeId = builder.sourceVolumeId;
    sourceVolumeCrn = builder.sourceVolumeCrn;
    sourceImageId = builder.sourceImageId;
    sourceImageCrn = builder.sourceImageCrn;
    sort = builder.sort;
  }

  /**
   * New builder.
   *
   * @return a ListSnapshotsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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

  /**
   * Gets the resourceGroupId.
   *
   * Filters the collection to resources in the resource group with the specified identifier.
   *
   * @return the resourceGroupId
   */
  public String resourceGroupId() {
    return resourceGroupId;
  }

  /**
   * Gets the name.
   *
   * Filters the collection to resources with the exact specified name.
   *
   * @return the name
   */
  public String name() {
    return name;
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

  /**
   * Gets the sourceVolumeCrn.
   *
   * Filters the collection to resources with the source volume with the specified CRN.
   *
   * @return the sourceVolumeCrn
   */
  public String sourceVolumeCrn() {
    return sourceVolumeCrn;
  }

  /**
   * Gets the sourceImageId.
   *
   * Filters the collection to resources with the source image with the specified identifier.
   *
   * This parameter also supports the values `null` and `not:null` which filter the collection to resources which have
   * no source image or any existent source image, respectively.
   *
   * @return the sourceImageId
   */
  public String sourceImageId() {
    return sourceImageId;
  }

  /**
   * Gets the sourceImageCrn.
   *
   * Filters the collection to resources with the source volume with the specified CRN.
   *
   * This parameter also supports the values `null` and `not:null` which filter the collection to resources which have
   * no source image or any existent source image, respectively.
   *
   * @return the sourceImageCrn
   */
  public String sourceImageCrn() {
    return sourceImageCrn;
  }

  /**
   * Gets the sort.
   *
   * Sorts the returned collection by the specified property name in ascending order. A `-` may be prepended to the name
   * to sort in descending order. For example, the value `-created_at` sorts the collection by the `created_at` property
   * in descending order, and the value `name` sorts it by the `name` property in ascending order.
   *
   * @return the sort
   */
  public String sort() {
    return sort;
  }
}

