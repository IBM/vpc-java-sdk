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
 * PublicGateway.
 */
public class PublicGateway extends GenericModel {

  /**
   * The resource type.
   */
  public interface ResourceType {
    /** public_gateway. */
    String PUBLIC_GATEWAY = "public_gateway";
  }

  /**
   * The status of this public gateway.
   */
  public interface Status {
    /** available. */
    String AVAILABLE = "available";
    /** deleting. */
    String DELETING = "deleting";
    /** failed. */
    String FAILED = "failed";
    /** pending. */
    String PENDING = "pending";
  }

  @SerializedName("created_at")
  protected Date createdAt;
  protected String crn;
  @SerializedName("floating_ip")
  protected PublicGatewayFloatingIp floatingIp;
  protected String href;
  protected String id;
  protected String name;
  @SerializedName("resource_group")
  protected ResourceGroupReference resourceGroup;
  @SerializedName("resource_type")
  protected String resourceType;
  protected String status;
  protected VPCReference vpc;
  protected ZoneReference zone;

  protected PublicGateway() { }

  /**
   * Gets the createdAt.
   *
   * The date and time that the public gateway was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the crn.
   *
   * The CRN for this public gateway.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the floatingIp.
   *
   * The floating IP bound to this public gateway.
   *
   * @return the floatingIp
   */
  public PublicGatewayFloatingIp getFloatingIp() {
    return floatingIp;
  }

  /**
   * Gets the href.
   *
   * The URL for this public gateway.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this public gateway.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this public gateway.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group for this public gateway.
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
   * Gets the status.
   *
   * The status of this public gateway.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the vpc.
   *
   * The VPC this public gateway resides in.
   *
   * @return the vpc
   */
  public VPCReference getVpc() {
    return vpc;
  }

  /**
   * Gets the zone.
   *
   * The zone this public gateway resides in.
   *
   * @return the zone
   */
  public ZoneReference getZone() {
    return zone;
  }
}

