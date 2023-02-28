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
 * The listBackupPolicyJobs options.
 */
public class ListBackupPolicyJobsOptions extends GenericModel {

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

  protected String backupPolicyId;
  protected String status;
  protected String backupPolicyPlanId;
  protected String start;
  protected Long limit;
  protected String sort;
  protected String sourceId;
  protected String targetSnapshotsId;
  protected String targetSnapshotsCrn;

  /**
   * Builder.
   */
  public static class Builder {
    private String backupPolicyId;
    private String status;
    private String backupPolicyPlanId;
    private String start;
    private Long limit;
    private String sort;
    private String sourceId;
    private String targetSnapshotsId;
    private String targetSnapshotsCrn;

    /**
     * Instantiates a new Builder from an existing ListBackupPolicyJobsOptions instance.
     *
     * @param listBackupPolicyJobsOptions the instance to initialize the Builder with
     */
    private Builder(ListBackupPolicyJobsOptions listBackupPolicyJobsOptions) {
      this.backupPolicyId = listBackupPolicyJobsOptions.backupPolicyId;
      this.status = listBackupPolicyJobsOptions.status;
      this.backupPolicyPlanId = listBackupPolicyJobsOptions.backupPolicyPlanId;
      this.start = listBackupPolicyJobsOptions.start;
      this.limit = listBackupPolicyJobsOptions.limit;
      this.sort = listBackupPolicyJobsOptions.sort;
      this.sourceId = listBackupPolicyJobsOptions.sourceId;
      this.targetSnapshotsId = listBackupPolicyJobsOptions.targetSnapshotsId;
      this.targetSnapshotsCrn = listBackupPolicyJobsOptions.targetSnapshotsCrn;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param backupPolicyId the backupPolicyId
     */
    public Builder(String backupPolicyId) {
      this.backupPolicyId = backupPolicyId;
    }

    /**
     * Builds a ListBackupPolicyJobsOptions.
     *
     * @return the new ListBackupPolicyJobsOptions instance
     */
    public ListBackupPolicyJobsOptions build() {
      return new ListBackupPolicyJobsOptions(this);
    }

    /**
     * Set the backupPolicyId.
     *
     * @param backupPolicyId the backupPolicyId
     * @return the ListBackupPolicyJobsOptions builder
     */
    public Builder backupPolicyId(String backupPolicyId) {
      this.backupPolicyId = backupPolicyId;
      return this;
    }

    /**
     * Set the status.
     *
     * @param status the status
     * @return the ListBackupPolicyJobsOptions builder
     */
    public Builder status(String status) {
      this.status = status;
      return this;
    }

    /**
     * Set the backupPolicyPlanId.
     *
     * @param backupPolicyPlanId the backupPolicyPlanId
     * @return the ListBackupPolicyJobsOptions builder
     */
    public Builder backupPolicyPlanId(String backupPolicyPlanId) {
      this.backupPolicyPlanId = backupPolicyPlanId;
      return this;
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListBackupPolicyJobsOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListBackupPolicyJobsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the sort.
     *
     * @param sort the sort
     * @return the ListBackupPolicyJobsOptions builder
     */
    public Builder sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set the sourceId.
     *
     * @param sourceId the sourceId
     * @return the ListBackupPolicyJobsOptions builder
     */
    public Builder sourceId(String sourceId) {
      this.sourceId = sourceId;
      return this;
    }

    /**
     * Set the targetSnapshotsId.
     *
     * @param targetSnapshotsId the targetSnapshotsId
     * @return the ListBackupPolicyJobsOptions builder
     */
    public Builder targetSnapshotsId(String targetSnapshotsId) {
      this.targetSnapshotsId = targetSnapshotsId;
      return this;
    }

    /**
     * Set the targetSnapshotsCrn.
     *
     * @param targetSnapshotsCrn the targetSnapshotsCrn
     * @return the ListBackupPolicyJobsOptions builder
     */
    public Builder targetSnapshotsCrn(String targetSnapshotsCrn) {
      this.targetSnapshotsCrn = targetSnapshotsCrn;
      return this;
    }
  }

  protected ListBackupPolicyJobsOptions() { }

  protected ListBackupPolicyJobsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.backupPolicyId,
      "backupPolicyId cannot be empty");
    backupPolicyId = builder.backupPolicyId;
    status = builder.status;
    backupPolicyPlanId = builder.backupPolicyPlanId;
    start = builder.start;
    limit = builder.limit;
    sort = builder.sort;
    sourceId = builder.sourceId;
    targetSnapshotsId = builder.targetSnapshotsId;
    targetSnapshotsCrn = builder.targetSnapshotsCrn;
  }

  /**
   * New builder.
   *
   * @return a ListBackupPolicyJobsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the backupPolicyId.
   *
   * The backup policy identifier.
   *
   * @return the backupPolicyId
   */
  public String backupPolicyId() {
    return backupPolicyId;
  }

  /**
   * Gets the status.
   *
   * Filters the collection to backup policy jobs with the specified status.
   *
   * @return the status
   */
  public String status() {
    return status;
  }

  /**
   * Gets the backupPolicyPlanId.
   *
   * Filters the collection to backup policy jobs with the backup plan with the specified identifier.
   *
   * @return the backupPolicyPlanId
   */
  public String backupPolicyPlanId() {
    return backupPolicyPlanId;
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
   * Gets the sourceId.
   *
   * Filters the collection to backup policy jobs with a source with the specified identifier.
   *
   * @return the sourceId
   */
  public String sourceId() {
    return sourceId;
  }

  /**
   * Gets the targetSnapshotsId.
   *
   * Filters the collection to resources with the target snapshot with the specified identifier.
   *
   * @return the targetSnapshotsId
   */
  public String targetSnapshotsId() {
    return targetSnapshotsId;
  }

  /**
   * Gets the targetSnapshotsCrn.
   *
   * Filters the collection to backup policy jobs with the target snapshot with the specified CRN.
   *
   * @return the targetSnapshotsCrn
   */
  public String targetSnapshotsCrn() {
    return targetSnapshotsCrn;
  }
}

