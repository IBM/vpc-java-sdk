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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Share.
 */
public class Share extends GenericModel {

  /**
   * The access control mode for the share:
   *
   * - `security_group`: The security groups on the virtual network interface for a mount
   *   target control access to the mount target.
   * - `vpc`: All clients in the VPC for a mount target have access to the mount target.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface AccessControlMode {
    /** security_group. */
    String SECURITY_GROUP = "security_group";
    /** vpc. */
    String VPC = "vpc";
  }

  /**
   * The accessor binding role of this file share:
   * - `none`: This file share is not participating in access with another file share
   * - `origin`: This file share is the origin for one or more file shares
   *   (which may be in other accounts)
   * - `accessor`: This file share is providing access to another file share
   *   (which may be in another account).
   */
  public interface AccessorBindingRole {
    /** accessor. */
    String ACCESSOR = "accessor";
    /** none. */
    String NONE = "none";
    /** origin. */
    String ORIGIN = "origin";
  }

  public interface AllowedTransitEncryptionModes {
    /** none. */
    String NONE = "none";
    /** user_managed. */
    String USER_MANAGED = "user_managed";
  }

  /**
   * The type of encryption used for this file share.
   */
  public interface Encryption {
    /** provider_managed. */
    String PROVIDER_MANAGED = "provider_managed";
    /** user_managed. */
    String USER_MANAGED = "user_managed";
  }

  /**
   * The lifecycle state of the file share.
   */
  public interface LifecycleState {
    /** deleting. */
    String DELETING = "deleting";
    /** failed. */
    String FAILED = "failed";
    /** pending. */
    String PENDING = "pending";
    /** stable. */
    String STABLE = "stable";
    /** suspended. */
    String SUSPENDED = "suspended";
    /** updating. */
    String UPDATING = "updating";
    /** waiting. */
    String WAITING = "waiting";
  }

  /**
   * The replication role of the file share:
   * - `none`: This share is not participating in replication.
   * - `replica`: This share is a replication target.
   * - `source`: This share is a replication source.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface ReplicationRole {
    /** none. */
    String NONE = "none";
    /** replica. */
    String REPLICA = "replica";
    /** source. */
    String SOURCE = "source";
  }

  /**
   * The replication status of the file share:
   * - `active`: This share is actively participating in replication, and the replica's data is up-to-date with the
   * replication schedule.
   * - `degraded`: This is share is participating in replication, but the replica's data has fallen behind the
   * replication schedule.
   * - `failover_pending`: This share is performing a replication failover.
   * - `initializing`: This share is initializing replication.
   * - `none`: This share is not participating in replication.
   * - `split_pending`: This share is performing a replication split.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface ReplicationStatus {
    /** active. */
    String ACTIVE = "active";
    /** degraded. */
    String DEGRADED = "degraded";
    /** failover_pending. */
    String FAILOVER_PENDING = "failover_pending";
    /** initializing. */
    String INITIALIZING = "initializing";
    /** none. */
    String NONE = "none";
    /** split_pending. */
    String SPLIT_PENDING = "split_pending";
  }

  /**
   * The resource type.
   */
  public interface ResourceType {
    /** share. */
    String SHARE = "share";
  }

  @SerializedName("access_control_mode")
  protected String accessControlMode;
  @SerializedName("accessor_binding_role")
  protected String accessorBindingRole;
  @SerializedName("accessor_bindings")
  protected List<ShareAccessorBindingReference> accessorBindings;
  @SerializedName("allowed_transit_encryption_modes")
  protected List<String> allowedTransitEncryptionModes;
  @SerializedName("created_at")
  protected Date createdAt;
  protected String crn;
  protected String encryption;
  @SerializedName("encryption_key")
  protected EncryptionKeyReference encryptionKey;
  protected String href;
  protected String id;
  @SerializedName("initial_owner")
  protected ShareInitialOwner initialOwner;
  protected Long iops;
  @SerializedName("latest_job")
  protected ShareJob latestJob;
  @SerializedName("latest_sync")
  protected ShareLatestSync latestSync;
  @SerializedName("lifecycle_reasons")
  protected List<ShareLifecycleReason> lifecycleReasons;
  @SerializedName("lifecycle_state")
  protected String lifecycleState;
  @SerializedName("mount_targets")
  protected List<ShareMountTargetReference> mountTargets;
  protected String name;
  @SerializedName("origin_share")
  protected ShareReference originShare;
  protected ShareProfileReference profile;
  @SerializedName("replica_share")
  protected ShareReference replicaShare;
  @SerializedName("replication_cron_spec")
  protected String replicationCronSpec;
  @SerializedName("replication_role")
  protected String replicationRole;
  @SerializedName("replication_status")
  protected String replicationStatus;
  @SerializedName("replication_status_reasons")
  protected List<ShareReplicationStatusReason> replicationStatusReasons;
  @SerializedName("resource_group")
  protected ResourceGroupReference resourceGroup;
  @SerializedName("resource_type")
  protected String resourceType;
  protected Long size;
  @SerializedName("snapshot_count")
  protected Long snapshotCount;
  @SerializedName("snapshot_size")
  protected Long snapshotSize;
  @SerializedName("source_share")
  protected ShareReference sourceShare;
  @SerializedName("source_snapshot")
  protected ShareSourceSnapshot sourceSnapshot;
  @SerializedName("user_tags")
  protected List<String> userTags;
  protected ZoneReference zone;

  protected Share() { }

  /**
   * Gets the accessControlMode.
   *
   * The access control mode for the share:
   *
   * - `security_group`: The security groups on the virtual network interface for a mount
   *   target control access to the mount target.
   * - `vpc`: All clients in the VPC for a mount target have access to the mount target.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the accessControlMode
   */
  public String getAccessControlMode() {
    return accessControlMode;
  }

  /**
   * Gets the accessorBindingRole.
   *
   * The accessor binding role of this file share:
   * - `none`: This file share is not participating in access with another file share
   * - `origin`: This file share is the origin for one or more file shares
   *   (which may be in other accounts)
   * - `accessor`: This file share is providing access to another file share
   *   (which may be in another account).
   *
   * @return the accessorBindingRole
   */
  public String getAccessorBindingRole() {
    return accessorBindingRole;
  }

  /**
   * Gets the accessorBindings.
   *
   * The accessor bindings for this file share. Each accessor binding identifies a resource (possibly in another
   * account) with access to this file share's data and its snapshots.
   *
   * @return the accessorBindings
   */
  public List<ShareAccessorBindingReference> getAccessorBindings() {
    return accessorBindings;
  }

  /**
   * Gets the allowedTransitEncryptionModes.
   *
   * The transit encryption modes allowed for this share:
   * - `none`: Not encrypted in transit.
   * - `user_managed`: Encrypted in transit using an instance identity certificate.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the allowedTransitEncryptionModes
   */
  public List<String> getAllowedTransitEncryptionModes() {
    return allowedTransitEncryptionModes;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that the file share is created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the crn.
   *
   * The CRN for this file share.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the encryption.
   *
   * The type of encryption used for this file share.
   *
   * @return the encryption
   */
  public String getEncryption() {
    return encryption;
  }

  /**
   * Gets the encryptionKey.
   *
   * The key used to encrypt this file share.
   *
   * This property will be present if `encryption` is `user_managed`.
   *
   * @return the encryptionKey
   */
  public EncryptionKeyReference getEncryptionKey() {
    return encryptionKey;
  }

  /**
   * Gets the href.
   *
   * The URL for this file share.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this file share.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the initialOwner.
   *
   * The owner assigned to the file share at creation.
   *
   * @return the initialOwner
   */
  public ShareInitialOwner getInitialOwner() {
    return initialOwner;
  }

  /**
   * Gets the iops.
   *
   * The maximum input/output operations per second (IOPS) for the file share. In addition, each client accessing the
   * share will be restricted to 48,000 IOPS.
   *
   * The maximum IOPS for a share may increase in the future.
   *
   * @return the iops
   */
  public Long getIops() {
    return iops;
  }

  /**
   * Gets the latestJob.
   *
   * The latest job associated with this file share.
   *
   * This property will be absent if no jobs have been created for this file share.
   *
   * @return the latestJob
   */
  public ShareJob getLatestJob() {
    return latestJob;
  }

  /**
   * Gets the latestSync.
   *
   * Information about the latest synchronization for this file share.
   *
   * This property will be present when the `replication_role` is `replica` and at least
   * one replication sync has been completed.
   *
   * @return the latestSync
   */
  public ShareLatestSync getLatestSync() {
    return latestSync;
  }

  /**
   * Gets the lifecycleReasons.
   *
   * The reasons for the current `lifecycle_state` (if any).
   *
   * @return the lifecycleReasons
   */
  public List<ShareLifecycleReason> getLifecycleReasons() {
    return lifecycleReasons;
  }

  /**
   * Gets the lifecycleState.
   *
   * The lifecycle state of the file share.
   *
   * @return the lifecycleState
   */
  public String getLifecycleState() {
    return lifecycleState;
  }

  /**
   * Gets the mountTargets.
   *
   * The mount targets for the file share.
   *
   * @return the mountTargets
   */
  public List<ShareMountTargetReference> getMountTargets() {
    return mountTargets;
  }

  /**
   * Gets the name.
   *
   * The name for this share. The name is unique across all shares in the region.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the originShare.
   *
   * The origin share this accessor share is referring to.
   *
   * This property will be present when the `accessor_binding_role` is `accessor`.
   *
   * @return the originShare
   */
  public ShareReference getOriginShare() {
    return originShare;
  }

  /**
   * Gets the profile.
   *
   * The [profile](https://cloud.ibm.com/docs/vpc?topic=vpc-file-storage-profiles) for
   * this file share.
   *
   * @return the profile
   */
  public ShareProfileReference getProfile() {
    return profile;
  }

  /**
   * Gets the replicaShare.
   *
   * The replica file share for this source file share.
   *
   * This property will be present when the `replication_role` is `source`.
   *
   * @return the replicaShare
   */
  public ShareReference getReplicaShare() {
    return replicaShare;
  }

  /**
   * Gets the replicationCronSpec.
   *
   * The cron specification for the file share replication schedule.
   *
   * This property will be present when the `replication_role` is `replica`.
   *
   * @return the replicationCronSpec
   */
  public String getReplicationCronSpec() {
    return replicationCronSpec;
  }

  /**
   * Gets the replicationRole.
   *
   * The replication role of the file share:
   * - `none`: This share is not participating in replication.
   * - `replica`: This share is a replication target.
   * - `source`: This share is a replication source.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the replicationRole
   */
  public String getReplicationRole() {
    return replicationRole;
  }

  /**
   * Gets the replicationStatus.
   *
   * The replication status of the file share:
   * - `active`: This share is actively participating in replication, and the replica's data is up-to-date with the
   * replication schedule.
   * - `degraded`: This is share is participating in replication, but the replica's data has fallen behind the
   * replication schedule.
   * - `failover_pending`: This share is performing a replication failover.
   * - `initializing`: This share is initializing replication.
   * - `none`: This share is not participating in replication.
   * - `split_pending`: This share is performing a replication split.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the replicationStatus
   */
  public String getReplicationStatus() {
    return replicationStatus;
  }

  /**
   * Gets the replicationStatusReasons.
   *
   * The reasons for the current replication status (if any).
   *
   * @return the replicationStatusReasons
   */
  public List<ShareReplicationStatusReason> getReplicationStatusReasons() {
    return replicationStatusReasons;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group for this file share.
   *
   * @return the resourceGroup
   */
  public ResourceGroupReference getResourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the resourceType.
   *
   * The resource type.
   *
   * @return the resourceType
   */
  public String getResourceType() {
    return resourceType;
  }

  /**
   * Gets the size.
   *
   * The size of the file share (in gigabytes), excluding share snapshots.
   *
   * @return the size
   */
  public Long getSize() {
    return size;
  }

  /**
   * Gets the snapshotCount.
   *
   * The total number of snapshots for this share.
   *
   * @return the snapshotCount
   */
  public Long getSnapshotCount() {
    return snapshotCount;
  }

  /**
   * Gets the snapshotSize.
   *
   * The total size (in gigabytes) of snapshots used for this file share.
   *
   * @return the snapshotSize
   */
  public Long getSnapshotSize() {
    return snapshotSize;
  }

  /**
   * Gets the sourceShare.
   *
   * The source file share for this replica file share.
   *
   * This property will be present when the `replication_role` is `replica`.
   *
   * @return the sourceShare
   */
  public ShareReference getSourceShare() {
    return sourceShare;
  }

  /**
   * Gets the sourceSnapshot.
   *
   * The snapshot this file share was cloned from.
   *
   * This property will be present when the share was created from a snapshot.
   *
   * The resources supported by this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the
   * future.
   *
   * @return the sourceSnapshot
   */
  public ShareSourceSnapshot getSourceSnapshot() {
    return sourceSnapshot;
  }

  /**
   * Gets the userTags.
   *
   * The tags for this resource.
   *
   * @return the userTags
   */
  public List<String> getUserTags() {
    return userTags;
  }

  /**
   * Gets the zone.
   *
   * The zone this file share resides in.
   *
   * @return the zone
   */
  public ZoneReference getZone() {
    return zone;
  }
}

