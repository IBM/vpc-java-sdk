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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The [instance profile](https://cloud.ibm.com/docs/vpc?topic=vpc-profiles) or
 * [bare metal server profile](https://cloud.ibm.com/docs/vpc?topic=vpc-bare-metal-servers-profile) for this
 * reservation.
 *
 * Classes which extend this class:
 * - ReservationProfileInstanceProfileReference
 * - ReservationProfileBareMetalServerProfileReference
 */
public class ReservationProfile extends GenericModel {

  /**
   * The resource type.
   */
  public interface ResourceType {
    /** instance_profile. */
    String INSTANCE_PROFILE = "instance_profile";
  }

  protected String href;
  protected String name;
  @SerializedName("resource_type")
  protected String resourceType;

  protected ReservationProfile() { }

  /**
   * Gets the href.
   *
   * The URL for this virtual server instance profile.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the name.
   *
   * The globally unique name for this virtual server instance profile.
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

