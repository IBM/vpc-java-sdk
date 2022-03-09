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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * AddressPrefix.
 */
public class AddressPrefix extends GenericModel {

  protected String cidr;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("has_subnets")
  protected Boolean hasSubnets;
  protected String href;
  protected String id;
  @SerializedName("is_default")
  protected Boolean isDefault;
  protected String name;
  protected ZoneReference zone;

  /**
   * Gets the cidr.
   *
   * The CIDR block for this prefix.
   *
   * @return the cidr
   */
  public String getCidr() {
    return cidr;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that the prefix was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the hasSubnets.
   *
   * Indicates whether subnets exist with addresses from this prefix.
   *
   * @return the hasSubnets
   */
  public Boolean isHasSubnets() {
    return hasSubnets;
  }

  /**
   * Gets the href.
   *
   * The URL for this address prefix.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this address prefix.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the isDefault.
   *
   * Indicates whether this is the default prefix for this zone in this VPC. If a default prefix was automatically
   * created when the VPC was created, the prefix is automatically named using a hyphenated list of randomly-selected
   * words, but may be updated with a user-specified name.
   *
   * @return the isDefault
   */
  public Boolean isIsDefault() {
    return isDefault;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this address prefix. Names must be unique within the VPC the address prefix resides in.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the zone.
   *
   * The zone this address prefix resides in.
   *
   * @return the zone
   */
  public ZoneReference getZone() {
    return zone;
  }
}

