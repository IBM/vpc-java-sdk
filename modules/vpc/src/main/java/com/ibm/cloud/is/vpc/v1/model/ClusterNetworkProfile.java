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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * ClusterNetworkProfile.
 */
public class ClusterNetworkProfile extends GenericModel {

  /**
   * The product family this cluster network profile belongs to.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Family {
    /** vela. */
    String VELA = "vela";
  }

  /**
   * The resource type.
   */
  public interface ResourceType {
    /** cluster_network_profile. */
    String CLUSTER_NETWORK_PROFILE = "cluster_network_profile";
  }

  protected String family;
  protected String href;
  protected String name;
  @SerializedName("resource_type")
  protected String resourceType;
  @SerializedName("supported_instance_profiles")
  protected List<InstanceProfileReference> supportedInstanceProfiles;
  protected List<ZoneReference> zones;

  protected ClusterNetworkProfile() { }

  /**
   * Gets the family.
   *
   * The product family this cluster network profile belongs to.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the family
   */
  public String getFamily() {
    return family;
  }

  /**
   * Gets the href.
   *
   * The URL for this cluster network profile.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the name.
   *
   * The globally unique name for this cluster network profile.
   *
   * @return the name
   */
  public String getName() {
    return name;
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
   * Gets the supportedInstanceProfiles.
   *
   * The instance profiles that support this cluster network profile.
   *
   * @return the supportedInstanceProfiles
   */
  public List<InstanceProfileReference> getSupportedInstanceProfiles() {
    return supportedInstanceProfiles;
  }

  /**
   * Gets the zones.
   *
   * Zones in this region that support this cluster network profile.
   *
   * @return the zones
   */
  public List<ZoneReference> getZones() {
    return zones;
  }
}

