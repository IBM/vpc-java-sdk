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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * DedicatedHostGroup.
 */
public class DedicatedHostGroup extends GenericModel {

  /**
   * The dedicated host profile family for hosts in this group.
   */
  public interface Family {
    /** balanced. */
    String BALANCED = "balanced";
    /** compute. */
    String COMPUTE = "compute";
    /** memory. */
    String MEMORY = "memory";
  }

  /**
   * The resource type.
   */
  public interface ResourceType {
    /** dedicated_host_group. */
    String DEDICATED_HOST_GROUP = "dedicated_host_group";
  }

  @SerializedName("class")
  protected String xClass;
  @SerializedName("created_at")
  protected Date createdAt;
  protected String crn;
  @SerializedName("dedicated_hosts")
  protected List<DedicatedHostReference> dedicatedHosts;
  protected String family;
  protected String href;
  protected String id;
  protected String name;
  @SerializedName("resource_group")
  protected ResourceGroupReference resourceGroup;
  @SerializedName("resource_type")
  protected String resourceType;
  @SerializedName("supported_instance_profiles")
  protected List<InstanceProfileReference> supportedInstanceProfiles;
  protected ZoneReference zone;

  protected DedicatedHostGroup() { }

  /**
   * Gets the xClass.
   *
   * The dedicated host profile class for hosts in this group.
   *
   * @return the xClass
   */
  public String getXClass() {
    return xClass;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that the dedicated host group was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the crn.
   *
   * The CRN for this dedicated host group.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the dedicatedHosts.
   *
   * The dedicated hosts that are in this dedicated host group.
   *
   * @return the dedicatedHosts
   */
  public List<DedicatedHostReference> getDedicatedHosts() {
    return dedicatedHosts;
  }

  /**
   * Gets the family.
   *
   * The dedicated host profile family for hosts in this group.
   *
   * @return the family
   */
  public String getFamily() {
    return family;
  }

  /**
   * Gets the href.
   *
   * The URL for this dedicated host group.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this dedicated host group.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * The unique user-defined name for this dedicated host group.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group for this dedicated host group.
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
   * Gets the supportedInstanceProfiles.
   *
   * The instance profiles usable by instances placed on this dedicated host group.
   *
   * @return the supportedInstanceProfiles
   */
  public List<InstanceProfileReference> getSupportedInstanceProfiles() {
    return supportedInstanceProfiles;
  }

  /**
   * Gets the zone.
   *
   * The zone this dedicated host group resides in.
   *
   * @return the zone
   */
  public ZoneReference getZone() {
    return zone;
  }
}

