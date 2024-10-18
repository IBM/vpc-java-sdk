/*
 * (C) Copyright IBM Corp. 2022, 2023, 2024.
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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * ShareProfile.
 */
public class ShareProfile extends GenericModel {

  /**
   * The product family this share profile belongs to.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Family {
    /** defined_performance. */
    String DEFINED_PERFORMANCE = "defined_performance";
  }

  /**
   * The resource type.
   */
  public interface ResourceType {
    /** share_profile. */
    String SHARE_PROFILE = "share_profile";
  }

  protected ShareProfileCapacity capacity;
  protected String family;
  protected String href;
  protected ShareProfileIOPS iops;
  protected String name;
  @SerializedName("resource_type")
  protected String resourceType;

  protected ShareProfile() { }

  /**
   * Gets the capacity.
   *
   * The permitted capacity range (in gigabytes) for a share with this profile.
   *
   * @return the capacity
   */
  public ShareProfileCapacity getCapacity() {
    return capacity;
  }

  /**
   * Gets the family.
   *
   * The product family this share profile belongs to.
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
   * The URL for this share profile.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the iops.
   *
   * The permitted IOPS range for a share with this profile.
   *
   * @return the iops
   */
  public ShareProfileIOPS getIops() {
    return iops;
  }

  /**
   * Gets the name.
   *
   * The globally unique name for this share profile.
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
}

