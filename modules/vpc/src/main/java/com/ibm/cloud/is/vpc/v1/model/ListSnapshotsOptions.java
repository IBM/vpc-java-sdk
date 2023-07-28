/*
 * (C) Copyright IBM Corp. 2021, 2022, 2023.
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
  protected String tag;
  protected String resourceGroupId;
  protected String name;
  protected String sourceVolumeId;
  protected String sourceVolumeCrn;
  protected String sourceImageId;
  protected String sourceImageCrn;
  protected String sort;
  protected String backupPolicyPlanId;
  protected String copiesId;
  protected String copiesName;
  protected String copiesCrn;
  protected String copiesRemoteRegionName;
  protected String sourceSnapshotId;
  protected String sourceSnapshotRemoteRegionName;
  protected String sourceVolumeRemoteRegionName;
  protected String sourceImageRemoteRegionName;
  protected String clonesZoneName;

  /**
   * Builder.
   */
  public static class Builder {
    private String start;
    private Long limit;
    private String tag;
    private String resourceGroupId;
    private String name;
    private String sourceVolumeId;
    private String sourceVolumeCrn;
    private String sourceImageId;
    private String sourceImageCrn;
    private String sort;
    private String backupPolicyPlanId;
    private String copiesId;
    private String copiesName;
    private String copiesCrn;
    private String copiesRemoteRegionName;
    private String sourceSnapshotId;
    private String sourceSnapshotRemoteRegionName;
    private String sourceVolumeRemoteRegionName;
    private String sourceImageRemoteRegionName;
    private String clonesZoneName;

    /**
     * Instantiates a new Builder from an existing ListSnapshotsOptions instance.
     *
     * @param listSnapshotsOptions the instance to initialize the Builder with
     */
    private Builder(ListSnapshotsOptions listSnapshotsOptions) {
      this.start = listSnapshotsOptions.start;
      this.limit = listSnapshotsOptions.limit;
      this.tag = listSnapshotsOptions.tag;
      this.resourceGroupId = listSnapshotsOptions.resourceGroupId;
      this.name = listSnapshotsOptions.name;
      this.sourceVolumeId = listSnapshotsOptions.sourceVolumeId;
      this.sourceVolumeCrn = listSnapshotsOptions.sourceVolumeCrn;
      this.sourceImageId = listSnapshotsOptions.sourceImageId;
      this.sourceImageCrn = listSnapshotsOptions.sourceImageCrn;
      this.sort = listSnapshotsOptions.sort;
      this.backupPolicyPlanId = listSnapshotsOptions.backupPolicyPlanId;
      this.copiesId = listSnapshotsOptions.copiesId;
      this.copiesName = listSnapshotsOptions.copiesName;
      this.copiesCrn = listSnapshotsOptions.copiesCrn;
      this.copiesRemoteRegionName = listSnapshotsOptions.copiesRemoteRegionName;
      this.sourceSnapshotId = listSnapshotsOptions.sourceSnapshotId;
      this.sourceSnapshotRemoteRegionName = listSnapshotsOptions.sourceSnapshotRemoteRegionName;
      this.sourceVolumeRemoteRegionName = listSnapshotsOptions.sourceVolumeRemoteRegionName;
      this.sourceImageRemoteRegionName = listSnapshotsOptions.sourceImageRemoteRegionName;
      this.clonesZoneName = listSnapshotsOptions.clonesZoneName;
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
     * Set the tag.
     *
     * @param tag the tag
     * @return the ListSnapshotsOptions builder
     */
    public Builder tag(String tag) {
      this.tag = tag;
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

    /**
     * Set the backupPolicyPlanId.
     *
     * @param backupPolicyPlanId the backupPolicyPlanId
     * @return the ListSnapshotsOptions builder
     */
    public Builder backupPolicyPlanId(String backupPolicyPlanId) {
      this.backupPolicyPlanId = backupPolicyPlanId;
      return this;
    }

    /**
     * Set the copiesId.
     *
     * @param copiesId the copiesId
     * @return the ListSnapshotsOptions builder
     */
    public Builder copiesId(String copiesId) {
      this.copiesId = copiesId;
      return this;
    }

    /**
     * Set the copiesName.
     *
     * @param copiesName the copiesName
     * @return the ListSnapshotsOptions builder
     */
    public Builder copiesName(String copiesName) {
      this.copiesName = copiesName;
      return this;
    }

    /**
     * Set the copiesCrn.
     *
     * @param copiesCrn the copiesCrn
     * @return the ListSnapshotsOptions builder
     */
    public Builder copiesCrn(String copiesCrn) {
      this.copiesCrn = copiesCrn;
      return this;
    }

    /**
     * Set the copiesRemoteRegionName.
     *
     * @param copiesRemoteRegionName the copiesRemoteRegionName
     * @return the ListSnapshotsOptions builder
     */
    public Builder copiesRemoteRegionName(String copiesRemoteRegionName) {
      this.copiesRemoteRegionName = copiesRemoteRegionName;
      return this;
    }

    /**
     * Set the sourceSnapshotId.
     *
     * @param sourceSnapshotId the sourceSnapshotId
     * @return the ListSnapshotsOptions builder
     */
    public Builder sourceSnapshotId(String sourceSnapshotId) {
      this.sourceSnapshotId = sourceSnapshotId;
      return this;
    }

    /**
     * Set the sourceSnapshotRemoteRegionName.
     *
     * @param sourceSnapshotRemoteRegionName the sourceSnapshotRemoteRegionName
     * @return the ListSnapshotsOptions builder
     */
    public Builder sourceSnapshotRemoteRegionName(String sourceSnapshotRemoteRegionName) {
      this.sourceSnapshotRemoteRegionName = sourceSnapshotRemoteRegionName;
      return this;
    }

    /**
     * Set the sourceVolumeRemoteRegionName.
     *
     * @param sourceVolumeRemoteRegionName the sourceVolumeRemoteRegionName
     * @return the ListSnapshotsOptions builder
     */
    public Builder sourceVolumeRemoteRegionName(String sourceVolumeRemoteRegionName) {
      this.sourceVolumeRemoteRegionName = sourceVolumeRemoteRegionName;
      return this;
    }

    /**
     * Set the sourceImageRemoteRegionName.
     *
     * @param sourceImageRemoteRegionName the sourceImageRemoteRegionName
     * @return the ListSnapshotsOptions builder
     */
    public Builder sourceImageRemoteRegionName(String sourceImageRemoteRegionName) {
      this.sourceImageRemoteRegionName = sourceImageRemoteRegionName;
      return this;
    }

    /**
     * Set the clonesZoneName.
     *
     * @param clonesZoneName the clonesZoneName
     * @return the ListSnapshotsOptions builder
     */
    public Builder clonesZoneName(String clonesZoneName) {
      this.clonesZoneName = clonesZoneName;
      return this;
    }
  }

  protected ListSnapshotsOptions() { }

  protected ListSnapshotsOptions(Builder builder) {
    start = builder.start;
    limit = builder.limit;
    tag = builder.tag;
    resourceGroupId = builder.resourceGroupId;
    name = builder.name;
    sourceVolumeId = builder.sourceVolumeId;
    sourceVolumeCrn = builder.sourceVolumeCrn;
    sourceImageId = builder.sourceImageId;
    sourceImageCrn = builder.sourceImageCrn;
    sort = builder.sort;
    backupPolicyPlanId = builder.backupPolicyPlanId;
    copiesId = builder.copiesId;
    copiesName = builder.copiesName;
    copiesCrn = builder.copiesCrn;
    copiesRemoteRegionName = builder.copiesRemoteRegionName;
    sourceSnapshotId = builder.sourceSnapshotId;
    sourceSnapshotRemoteRegionName = builder.sourceSnapshotRemoteRegionName;
    sourceVolumeRemoteRegionName = builder.sourceVolumeRemoteRegionName;
    sourceImageRemoteRegionName = builder.sourceImageRemoteRegionName;
    clonesZoneName = builder.clonesZoneName;
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
   * Gets the tag.
   *
   * Filters the collection to resources with an item in the `tags` property matching the exact specified tag.
   *
   * @return the tag
   */
  public String tag() {
    return tag;
  }

  /**
   * Gets the resourceGroupId.
   *
   * Filters the collection to resources with a `resource_group.id` property matching the specified identifier.
   *
   * @return the resourceGroupId
   */
  public String resourceGroupId() {
    return resourceGroupId;
  }

  /**
   * Gets the name.
   *
   * Filters the collection to resources with a `name` property matching the exact specified name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the sourceVolumeId.
   *
   * Filters the collection to resources with a `source_volume.id` property matching the specified identifier.
   *
   * @return the sourceVolumeId
   */
  public String sourceVolumeId() {
    return sourceVolumeId;
  }

  /**
   * Gets the sourceVolumeCrn.
   *
   * Filters the collection to resources with a `source_volume.crn` property matching the specified CRN.
   *
   * @return the sourceVolumeCrn
   */
  public String sourceVolumeCrn() {
    return sourceVolumeCrn;
  }

  /**
   * Gets the sourceImageId.
   *
   * Filters the collection to resources with a `source_image.id` property matching the specified identifier.
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
   * Filters the collection to resources with a `source_image.crn` property matching the specified CRN.
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

  /**
   * Gets the backupPolicyPlanId.
   *
   * Filters the collection to backup policy jobs with a `backup_policy_plan.id` property matching the specified
   * identifier.
   *
   * @return the backupPolicyPlanId
   */
  public String backupPolicyPlanId() {
    return backupPolicyPlanId;
  }

  /**
   * Gets the copiesId.
   *
   * Filters the collection to snapshots with an item in the `copies` property with an `id` property matching the
   * specified identifier.
   *
   * @return the copiesId
   */
  public String copiesId() {
    return copiesId;
  }

  /**
   * Gets the copiesName.
   *
   * Filters the collection to snapshots with an item in the `copies` property with a `name` property matching the exact
   * specified name.
   *
   * @return the copiesName
   */
  public String copiesName() {
    return copiesName;
  }

  /**
   * Gets the copiesCrn.
   *
   * Filters the collection to snapshots with an item in the `copies` property with an `id` property matching the
   * specified CRN.
   *
   * @return the copiesCrn
   */
  public String copiesCrn() {
    return copiesCrn;
  }

  /**
   * Gets the copiesRemoteRegionName.
   *
   * Filters the collection to snapshots with an item in the `copies` property with a
   * `remote.region.name` property matching the exact specified name.
   *
   * @return the copiesRemoteRegionName
   */
  public String copiesRemoteRegionName() {
    return copiesRemoteRegionName;
  }

  /**
   * Gets the sourceSnapshotId.
   *
   * Filters the collection to resources with a `source_snapshot.id` property matching the specified identifier.
   *
   * @return the sourceSnapshotId
   */
  public String sourceSnapshotId() {
    return sourceSnapshotId;
  }

  /**
   * Gets the sourceSnapshotRemoteRegionName.
   *
   * Filters the collection to resources with a `source_snapshot.remote.region.name` property matching the exact
   * specified name.
   *
   * @return the sourceSnapshotRemoteRegionName
   */
  public String sourceSnapshotRemoteRegionName() {
    return sourceSnapshotRemoteRegionName;
  }

  /**
   * Gets the sourceVolumeRemoteRegionName.
   *
   * Filters the collection to resources with a `source_volume.remote.region.name` property matching the exact specified
   * name.
   *
   * @return the sourceVolumeRemoteRegionName
   */
  public String sourceVolumeRemoteRegionName() {
    return sourceVolumeRemoteRegionName;
  }

  /**
   * Gets the sourceImageRemoteRegionName.
   *
   * Filters the collection to resources with a `source_image.remote.region.name` property matching the exact specified
   * name.
   *
   * @return the sourceImageRemoteRegionName
   */
  public String sourceImageRemoteRegionName() {
    return sourceImageRemoteRegionName;
  }

  /**
   * Gets the clonesZoneName.
   *
   * Filters the collection to snapshots with an item in the `clones` property with a `zone.name` property matching the
   * exact specified name.
   *
   * @return the clonesZoneName
   */
  public String clonesZoneName() {
    return clonesZoneName;
  }
}

