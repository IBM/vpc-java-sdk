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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * InstancePatch.
 */
public class InstancePatch extends GenericModel {

  /**
   * The confidential compute mode to use for this virtual server instance.
   *
   * For this property to be changed, the virtual server instance `status` must be
   * `stopping` or `stopped`.
   */
  public interface ConfidentialComputeMode {
    /** disabled. */
    String DISABLED = "disabled";
    /** sgx. */
    String SGX = "sgx";
    /** tdx. */
    String TDX = "tdx";
  }

  @SerializedName("availability_policy")
  protected InstanceAvailabilityPolicyPatch availabilityPolicy;
  @SerializedName("confidential_compute_mode")
  protected String confidentialComputeMode;
  @SerializedName("enable_secure_boot")
  protected Boolean enableSecureBoot;
  @SerializedName("metadata_service")
  protected InstanceMetadataServicePatch metadataService;
  protected String name;
  @SerializedName("placement_target")
  protected InstancePlacementTargetPatch placementTarget;
  protected InstancePatchProfile profile;
  @SerializedName("reservation_affinity")
  protected InstanceReservationAffinityPatch reservationAffinity;
  @SerializedName("total_volume_bandwidth")
  protected Long totalVolumeBandwidth;

  /**
   * Builder.
   */
  public static class Builder {
    private InstanceAvailabilityPolicyPatch availabilityPolicy;
    private String confidentialComputeMode;
    private Boolean enableSecureBoot;
    private InstanceMetadataServicePatch metadataService;
    private String name;
    private InstancePlacementTargetPatch placementTarget;
    private InstancePatchProfile profile;
    private InstanceReservationAffinityPatch reservationAffinity;
    private Long totalVolumeBandwidth;

    /**
     * Instantiates a new Builder from an existing InstancePatch instance.
     *
     * @param instancePatch the instance to initialize the Builder with
     */
    private Builder(InstancePatch instancePatch) {
      this.availabilityPolicy = instancePatch.availabilityPolicy;
      this.confidentialComputeMode = instancePatch.confidentialComputeMode;
      this.enableSecureBoot = instancePatch.enableSecureBoot;
      this.metadataService = instancePatch.metadataService;
      this.name = instancePatch.name;
      this.placementTarget = instancePatch.placementTarget;
      this.profile = instancePatch.profile;
      this.reservationAffinity = instancePatch.reservationAffinity;
      this.totalVolumeBandwidth = instancePatch.totalVolumeBandwidth;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a InstancePatch.
     *
     * @return the new InstancePatch instance
     */
    public InstancePatch build() {
      return new InstancePatch(this);
    }

    /**
     * Set the availabilityPolicy.
     *
     * @param availabilityPolicy the availabilityPolicy
     * @return the InstancePatch builder
     */
    public Builder availabilityPolicy(InstanceAvailabilityPolicyPatch availabilityPolicy) {
      this.availabilityPolicy = availabilityPolicy;
      return this;
    }

    /**
     * Set the confidentialComputeMode.
     *
     * @param confidentialComputeMode the confidentialComputeMode
     * @return the InstancePatch builder
     */
    public Builder confidentialComputeMode(String confidentialComputeMode) {
      this.confidentialComputeMode = confidentialComputeMode;
      return this;
    }

    /**
     * Set the enableSecureBoot.
     *
     * @param enableSecureBoot the enableSecureBoot
     * @return the InstancePatch builder
     */
    public Builder enableSecureBoot(Boolean enableSecureBoot) {
      this.enableSecureBoot = enableSecureBoot;
      return this;
    }

    /**
     * Set the metadataService.
     *
     * @param metadataService the metadataService
     * @return the InstancePatch builder
     */
    public Builder metadataService(InstanceMetadataServicePatch metadataService) {
      this.metadataService = metadataService;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the InstancePatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the placementTarget.
     *
     * @param placementTarget the placementTarget
     * @return the InstancePatch builder
     */
    public Builder placementTarget(InstancePlacementTargetPatch placementTarget) {
      this.placementTarget = placementTarget;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the InstancePatch builder
     */
    public Builder profile(InstancePatchProfile profile) {
      this.profile = profile;
      return this;
    }

    /**
     * Set the reservationAffinity.
     *
     * @param reservationAffinity the reservationAffinity
     * @return the InstancePatch builder
     */
    public Builder reservationAffinity(InstanceReservationAffinityPatch reservationAffinity) {
      this.reservationAffinity = reservationAffinity;
      return this;
    }

    /**
     * Set the totalVolumeBandwidth.
     *
     * @param totalVolumeBandwidth the totalVolumeBandwidth
     * @return the InstancePatch builder
     */
    public Builder totalVolumeBandwidth(long totalVolumeBandwidth) {
      this.totalVolumeBandwidth = totalVolumeBandwidth;
      return this;
    }
  }

  protected InstancePatch() { }

  protected InstancePatch(Builder builder) {
    availabilityPolicy = builder.availabilityPolicy;
    confidentialComputeMode = builder.confidentialComputeMode;
    enableSecureBoot = builder.enableSecureBoot;
    metadataService = builder.metadataService;
    name = builder.name;
    placementTarget = builder.placementTarget;
    profile = builder.profile;
    reservationAffinity = builder.reservationAffinity;
    totalVolumeBandwidth = builder.totalVolumeBandwidth;
  }

  /**
   * New builder.
   *
   * @return a InstancePatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the availabilityPolicy.
   *
   * The availability policy for this virtual server instance.
   *
   * @return the availabilityPolicy
   */
  public InstanceAvailabilityPolicyPatch availabilityPolicy() {
    return availabilityPolicy;
  }

  /**
   * Gets the confidentialComputeMode.
   *
   * The confidential compute mode to use for this virtual server instance.
   *
   * For this property to be changed, the virtual server instance `status` must be
   * `stopping` or `stopped`.
   *
   * @return the confidentialComputeMode
   */
  public String confidentialComputeMode() {
    return confidentialComputeMode;
  }

  /**
   * Gets the enableSecureBoot.
   *
   * Indicates whether secure boot is enabled for this virtual server instance.
   *
   * For this property to be changed, the virtual server instance `status` must be
   * `stopping` or `stopped`.
   *
   * @return the enableSecureBoot
   */
  public Boolean enableSecureBoot() {
    return enableSecureBoot;
  }

  /**
   * Gets the metadataService.
   *
   * The metadata service configuration.
   *
   * @return the metadataService
   */
  public InstanceMetadataServicePatch metadataService() {
    return metadataService;
  }

  /**
   * Gets the name.
   *
   * The name for this virtual server instance. The name must not be used by another virtual server instance in the
   * region. Changing the name will not affect the system hostname.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the placementTarget.
   *
   * The placement restrictions to use for the virtual server instance. For the placement restrictions to be changed,
   * the instance `status` must be `stopping` or `stopped`.
   * If set, `reservation_affinity.policy` must be `disabled`.
   *
   * @return the placementTarget
   */
  public InstancePlacementTargetPatch placementTarget() {
    return placementTarget;
  }

  /**
   * Gets the profile.
   *
   * The profile to use for this virtual server instance. Any disks associated with the
   * current profile will be deleted, and any disks associated with the requested profile
   * will be created.
   *
   * For the profile to be changed, the instance `status` must be `stopping` or `stopped`.
   * In addition, the requested profile must:
   * - Be compatible with any `placement_target` constraints. For example, if the
   *   instance is placed on a dedicated host, the requested profile `family` must be
   *   the same as the dedicated host `family`.
   * - Have the same `vcpu.architecture`.
   * - Support the number of network attachments or network interfaces the instance
   *   currently has.
   *
   * @return the profile
   */
  public InstancePatchProfile profile() {
    return profile;
  }

  /**
   * Gets the reservationAffinity.
   *
   * @return the reservationAffinity
   */
  public InstanceReservationAffinityPatch reservationAffinity() {
    return reservationAffinity;
  }

  /**
   * Gets the totalVolumeBandwidth.
   *
   * The amount of bandwidth (in megabits per second) allocated exclusively to instance storage volumes. An increase in
   * this value will result in a corresponding decrease to
   * `total_network_bandwidth`.
   *
   * @return the totalVolumeBandwidth
   */
  public Long totalVolumeBandwidth() {
    return totalVolumeBandwidth;
  }

  /**
   * Construct a JSON merge-patch from the InstancePatch.
   *
   * Note that properties of the InstancePatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the InstancePatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

