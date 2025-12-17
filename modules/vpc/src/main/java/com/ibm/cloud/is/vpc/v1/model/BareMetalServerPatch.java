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
 * BareMetalServerPatch.
 */
public class BareMetalServerPatch extends GenericModel {

  protected Long bandwidth;
  @SerializedName("enable_secure_boot")
  protected Boolean enableSecureBoot;
  @SerializedName("metadata_service")
  protected BareMetalServerMetadataServicePatch metadataService;
  protected String name;
  @SerializedName("reservation_affinity")
  protected BareMetalServerReservationAffinityPatch reservationAffinity;
  @SerializedName("trusted_platform_module")
  protected BareMetalServerTrustedPlatformModulePatch trustedPlatformModule;

  /**
   * Builder.
   */
  public static class Builder {
    private Long bandwidth;
    private Boolean enableSecureBoot;
    private BareMetalServerMetadataServicePatch metadataService;
    private String name;
    private BareMetalServerReservationAffinityPatch reservationAffinity;
    private BareMetalServerTrustedPlatformModulePatch trustedPlatformModule;

    /**
     * Instantiates a new Builder from an existing BareMetalServerPatch instance.
     *
     * @param bareMetalServerPatch the instance to initialize the Builder with
     */
    private Builder(BareMetalServerPatch bareMetalServerPatch) {
      this.bandwidth = bareMetalServerPatch.bandwidth;
      this.enableSecureBoot = bareMetalServerPatch.enableSecureBoot;
      this.metadataService = bareMetalServerPatch.metadataService;
      this.name = bareMetalServerPatch.name;
      this.reservationAffinity = bareMetalServerPatch.reservationAffinity;
      this.trustedPlatformModule = bareMetalServerPatch.trustedPlatformModule;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a BareMetalServerPatch.
     *
     * @return the new BareMetalServerPatch instance
     */
    public BareMetalServerPatch build() {
      return new BareMetalServerPatch(this);
    }

    /**
     * Set the bandwidth.
     *
     * @param bandwidth the bandwidth
     * @return the BareMetalServerPatch builder
     */
    public Builder bandwidth(long bandwidth) {
      this.bandwidth = bandwidth;
      return this;
    }

    /**
     * Set the enableSecureBoot.
     *
     * @param enableSecureBoot the enableSecureBoot
     * @return the BareMetalServerPatch builder
     */
    public Builder enableSecureBoot(Boolean enableSecureBoot) {
      this.enableSecureBoot = enableSecureBoot;
      return this;
    }

    /**
     * Set the metadataService.
     *
     * @param metadataService the metadataService
     * @return the BareMetalServerPatch builder
     */
    public Builder metadataService(BareMetalServerMetadataServicePatch metadataService) {
      this.metadataService = metadataService;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the BareMetalServerPatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the reservationAffinity.
     *
     * @param reservationAffinity the reservationAffinity
     * @return the BareMetalServerPatch builder
     */
    public Builder reservationAffinity(BareMetalServerReservationAffinityPatch reservationAffinity) {
      this.reservationAffinity = reservationAffinity;
      return this;
    }

    /**
     * Set the trustedPlatformModule.
     *
     * @param trustedPlatformModule the trustedPlatformModule
     * @return the BareMetalServerPatch builder
     */
    public Builder trustedPlatformModule(BareMetalServerTrustedPlatformModulePatch trustedPlatformModule) {
      this.trustedPlatformModule = trustedPlatformModule;
      return this;
    }
  }

  protected BareMetalServerPatch() { }

  protected BareMetalServerPatch(Builder builder) {
    bandwidth = builder.bandwidth;
    enableSecureBoot = builder.enableSecureBoot;
    metadataService = builder.metadataService;
    name = builder.name;
    reservationAffinity = builder.reservationAffinity;
    trustedPlatformModule = builder.trustedPlatformModule;
  }

  /**
   * New builder.
   *
   * @return a BareMetalServerPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the bandwidth.
   *
   * The total bandwidth (in megabits per second) shared across the bare metal server's network interfaces. The
   * specified value must match one of the bandwidth values in the bare metal server's profile.
   *
   * @return the bandwidth
   */
  public Long bandwidth() {
    return bandwidth;
  }

  /**
   * Gets the enableSecureBoot.
   *
   * Indicates whether secure boot is enabled. If enabled, the image must support secure boot or the bare metal server
   * will fail to boot.
   *
   * For `enable_secure_boot` to be changed, the bare metal server `status` must be
   * `stopped`.
   *
   * @return the enableSecureBoot
   */
  public Boolean enableSecureBoot() {
    return enableSecureBoot;
  }

  /**
   * Gets the metadataService.
   *
   * The metadata service configuration for the bare metal server.
   *
   * @return the metadataService
   */
  public BareMetalServerMetadataServicePatch metadataService() {
    return metadataService;
  }

  /**
   * Gets the name.
   *
   * The name for this bare metal server. The name must not be used by another bare metal server in the region. Changing
   * the name will not affect the system hostname.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the reservationAffinity.
   *
   * @return the reservationAffinity
   */
  public BareMetalServerReservationAffinityPatch reservationAffinity() {
    return reservationAffinity;
  }

  /**
   * Gets the trustedPlatformModule.
   *
   * @return the trustedPlatformModule
   */
  public BareMetalServerTrustedPlatformModulePatch trustedPlatformModule() {
    return trustedPlatformModule;
  }

  /**
   * Construct a JSON merge-patch from the BareMetalServerPatch.
   *
   * Note that properties of the BareMetalServerPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the BareMetalServerPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

