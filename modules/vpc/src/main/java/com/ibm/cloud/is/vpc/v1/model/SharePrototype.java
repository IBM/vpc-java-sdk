/*
 * (C) Copyright IBM Corp. 2025.
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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * SharePrototype.
 *
 * Classes which extend this class:
 * - SharePrototypeShareBySize
 * - SharePrototypeShareBySourceShare
 * - SharePrototypeShareByOriginShare
 * - SharePrototypeShareBySourceSnapshot
 */
public class SharePrototype extends GenericModel {

  public interface AllowedTransitEncryptionModes {
    /** ipsec. */
    String IPSEC = "ipsec";
    /** none. */
    String NONE = "none";
    /** stunnel. */
    String STUNNEL = "stunnel";
  }

  /**
   * The access control mode for the share:
   *
   * - `security_group`: The security groups on the virtual network interface for a
   *   mount target control access to the mount target. Mount targets for this share
   *   require a virtual network interface.
   * - `vpc`: All clients in the VPC for a mount target have access to the mount target.
   *   Mount targets for this share require a VPC.
   */
  public interface AccessControlMode {
    /** security_group. */
    String SECURITY_GROUP = "security_group";
    /** vpc. */
    String VPC = "vpc";
  }

  public interface AllowedAccessProtocols {
    /** nfs4. */
    String NFS4 = "nfs4";
  }

  @SerializedName("allowed_transit_encryption_modes")
  protected List<String> allowedTransitEncryptionModes;
  @SerializedName("mount_targets")
  protected List<ShareMountTargetPrototype> mountTargets;
  protected String name;
  @SerializedName("replica_share")
  protected SharePrototypeShareContext replicaShare;
  @SerializedName("user_tags")
  protected List<String> userTags;
  @SerializedName("access_control_mode")
  protected String accessControlMode;
  @SerializedName("allowed_access_protocols")
  protected List<String> allowedAccessProtocols;
  protected Long bandwidth;
  @SerializedName("encryption_key")
  protected EncryptionKeyIdentity encryptionKey;
  @SerializedName("initial_owner")
  protected ShareInitialOwner initialOwner;
  protected Long iops;
  protected ShareProfileIdentity profile;
  @SerializedName("resource_group")
  protected ResourceGroupIdentity resourceGroup;
  protected Long size;
  protected ZoneIdentity zone;
  @SerializedName("replication_cron_spec")
  protected String replicationCronSpec;
  @SerializedName("source_share")
  protected ShareIdentity sourceShare;
  @SerializedName("origin_share")
  protected ShareIdentity originShare;
  @SerializedName("source_snapshot")
  protected ShareSourceSnapshotPrototype sourceSnapshot;

  protected SharePrototype() { }

  /**
   * Gets the allowedTransitEncryptionModes.
   *
   * The transit encryption modes to allow for this share. If unspecified:
   * - If share mount targets are specified, then only transit encryption modes
   *   specified by those share mount target will be allowed.
   * - Otherwise, the default allowed transit encryption modes from the profile will be
   *   used.
   *
   * @return the allowedTransitEncryptionModes
   */
  public List<String> allowedTransitEncryptionModes() {
    return allowedTransitEncryptionModes;
  }

  /**
   * Gets the mountTargets.
   *
   * The mount targets for the file share. Each mount target must be in a unique VPC.
   *
   * @return the mountTargets
   */
  public List<ShareMountTargetPrototype> mountTargets() {
    return mountTargets;
  }

  /**
   * Gets the name.
   *
   * The name for this share. The name must not be used by another share in the region. If unspecified, the name will be
   * a hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the replicaShare.
   *
   * Configuration for a replica file share to create and associate with this file share. If
   * unspecified, a replica may be subsequently added by creating a new file share with a
   * `source_share` referencing this file share.
   *
   * Replica file shares can only be created for shares with an `availability_mode` of
   * `zonal`.
   *
   * @return the replicaShare
   */
  public SharePrototypeShareContext replicaShare() {
    return replicaShare;
  }

  /**
   * Gets the userTags.
   *
   * The tags for this resource.
   *
   * @return the userTags
   */
  public List<String> userTags() {
    return userTags;
  }

  /**
   * Gets the accessControlMode.
   *
   * The access control mode for the share:
   *
   * - `security_group`: The security groups on the virtual network interface for a
   *   mount target control access to the mount target. Mount targets for this share
   *   require a virtual network interface.
   * - `vpc`: All clients in the VPC for a mount target have access to the mount target.
   *   Mount targets for this share require a VPC.
   *
   * @return the accessControlMode
   */
  public String accessControlMode() {
    return accessControlMode;
  }

  /**
   * Gets the allowedAccessProtocols.
   *
   * The access protocols to allow for this share. If unspecified:
   * - If share mount targets are specified, only the access protocols specified by those
   *   share mount target will be allowed.
   * - Otherwise, the default access protocols from the profile will be used.
   *
   * @return the allowedAccessProtocols
   */
  public List<String> allowedAccessProtocols() {
    return allowedAccessProtocols;
  }

  /**
   * Gets the bandwidth.
   *
   * The maximum bandwidth (in megabits per second) for the file share.
   *
   * If the share profile has a `bandwidth.type` of `dependent` or `fixed`, this property is system-managed and must not
   * be specified. Otherwise, the specified value must be within the `bandwidth` range of the share's profile.
   *
   * Provided the property is user-managed, if it is unspecified, its value will be set based on the specified [`size`
   * and
   * `iops`](https://cloud.ibm.com/docs/vpc?topic=vpc-file-storage-profiles&amp;interface=api).
   *
   * @return the bandwidth
   */
  public Long bandwidth() {
    return bandwidth;
  }

  /**
   * Gets the encryptionKey.
   *
   * The root key to use to wrap the data encryption key for the share.
   *
   * If unspecified, the `encryption` type for the share will be `provider_managed`.
   *
   * The specified key may be in a different account, subject to IAM policies.
   *
   * @return the encryptionKey
   */
  public EncryptionKeyIdentity encryptionKey() {
    return encryptionKey;
  }

  /**
   * Gets the initialOwner.
   *
   * The owner assigned to the file share at creation. Subsequent changes to the owner
   * must be performed by a client that has mounted the file share.
   *
   * @return the initialOwner
   */
  public ShareInitialOwner initialOwner() {
    return initialOwner;
  }

  /**
   * Gets the iops.
   *
   * The maximum input/output operations per second (IOPS) for the file share.
   *
   * If the share profile has an `iops.type` of `dependent` or `fixed`, this property is system-managed and must not be
   * specified. Otherwise, the specified value must be within the `iops` range of the share profile as supported by the
   * share's specified size.
   *
   * @return the iops
   */
  public Long iops() {
    return iops;
  }

  /**
   * Gets the profile.
   *
   * The [profile](https://cloud.ibm.com/docs/vpc?topic=vpc-file-storage-profiles) to use
   * for this file share. The profile must support the share's specified IOPS and size.
   *
   * @return the profile
   */
  public ShareProfileIdentity profile() {
    return profile;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group to use. If unspecified, the account's [default resource
   * group](https://cloud.ibm.com/apidocs/resource-manager#introduction) will be used.
   *
   * @return the resourceGroup
   */
  public ResourceGroupIdentity resourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the size.
   *
   * The size of the file share (in gigabytes), excluding share snapshots.
   *
   * The specified value must be within the permitted `capacity` range of the share's profile and supported by the
   * share's specified IOPS.
   *
   * @return the size
   */
  public Long size() {
    return size;
  }

  /**
   * Gets the zone.
   *
   * The zone this file share will reside in. For a replica share in the same region as
   * the source share, this must be a different zone from the source share.
   *
   * This property must be specified if the share profile `availability_mode` is `zonal`,
   * and must not be specified otherwise.
   *
   * @return the zone
   */
  public ZoneIdentity zone() {
    return zone;
  }

  /**
   * Gets the replicationCronSpec.
   *
   * The cron specification for the file share replication schedule.
   *
   * Replication of a share can be scheduled to occur at most once every 15 minutes.
   *
   * The scheduling frequency for this property may
   * [increase](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the replicationCronSpec
   */
  public String replicationCronSpec() {
    return replicationCronSpec;
  }

  /**
   * Gets the sourceShare.
   *
   * The source file share for this replica file share. The specified file share must:
   * - Not already have a replica.
   * - Not be a replica.
   * - Have a `storage_generation` of `1`.
   *
   * If source file share is specified by CRN, it may be in an [associated partner
   * region](https://cloud.ibm.com/docs/vpc?topic=vpc-file-storage-replication).
   *
   * @return the sourceShare
   */
  public ShareIdentity sourceShare() {
    return sourceShare;
  }

  /**
   * Gets the originShare.
   *
   * The origin share for the accessor share. The origin share must have an
   * `access_control_mode` of `security_group`, and must not have an
   * `accessor_binding_role` of `accessor`.
   *
   * The specified share may be in a different account, subject to IAM policies.
   *
   * @return the originShare
   */
  public ShareIdentity originShare() {
    return originShare;
  }

  /**
   * Gets the sourceSnapshot.
   *
   * The source snapshot to clone this file share from.
   *
   * This file share will reside in the same zone as the specified source snapshot.
   * The snapshot must have the `lifecycle_state` as `stable` and `status` as `available`
   * to be able to restore a share for it.
   *
   * @return the sourceSnapshot
   */
  public ShareSourceSnapshotPrototype sourceSnapshot() {
    return sourceSnapshot;
  }
}

