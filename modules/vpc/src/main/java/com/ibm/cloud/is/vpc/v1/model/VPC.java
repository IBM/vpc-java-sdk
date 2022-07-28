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
 * VPC.
 */
public class VPC extends GenericModel {

  /**
   * The resource type.
   */
  public interface ResourceType {
    /** vpc. */
    String VPC = "vpc";
  }

  /**
   * The status of this VPC.
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

  @SerializedName("classic_access")
  protected Boolean classicAccess;
  @SerializedName("created_at")
  protected Date createdAt;
  protected String crn;
  @SerializedName("cse_source_ips")
  protected List<VPCCSESourceIP> cseSourceIps;
  @SerializedName("default_network_acl")
  protected NetworkACLReference defaultNetworkAcl;
  @SerializedName("default_routing_table")
  protected RoutingTableReference defaultRoutingTable;
  @SerializedName("default_security_group")
  protected SecurityGroupReference defaultSecurityGroup;
  protected String href;
  protected String id;
  protected String name;
  @SerializedName("resource_group")
  protected ResourceGroupReference resourceGroup;
  @SerializedName("resource_type")
  protected String resourceType;
  protected String status;

  /**
   * Gets the classicAccess.
   *
   * Indicates whether this VPC is connected to Classic Infrastructure. If true, this VPC's resources have private
   * network connectivity to the account's Classic Infrastructure resources. Only one VPC, per region, may be connected
   * in this way. This value is set at creation and subsequently immutable.
   *
   * @return the classicAccess
   */
  public Boolean isClassicAccess() {
    return classicAccess;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that the VPC was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the crn.
   *
   * The CRN for this VPC.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the cseSourceIps.
   *
   * The CSE ([Cloud Service Endpoint](https://cloud.ibm.com/docs/resources?topic=resources-service-endpoints)) source
   * IP addresses for the VPC. The VPC will have one CSE source IP address per zone.
   *
   * @return the cseSourceIps
   */
  public List<VPCCSESourceIP> getCseSourceIps() {
    return cseSourceIps;
  }

  /**
   * Gets the defaultNetworkAcl.
   *
   * The default network ACL to use for subnets created in this VPC.
   *
   * @return the defaultNetworkAcl
   */
  public NetworkACLReference getDefaultNetworkAcl() {
    return defaultNetworkAcl;
  }

  /**
   * Gets the defaultRoutingTable.
   *
   * The default routing table to use for subnets created in this VPC.
   *
   * @return the defaultRoutingTable
   */
  public RoutingTableReference getDefaultRoutingTable() {
    return defaultRoutingTable;
  }

  /**
   * Gets the defaultSecurityGroup.
   *
   * The default security group to use for network interfaces created in this VPC.
   *
   * @return the defaultSecurityGroup
   */
  public SecurityGroupReference getDefaultSecurityGroup() {
    return defaultSecurityGroup;
  }

  /**
   * Gets the href.
   *
   * The URL for this VPC.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this VPC.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * The unique user-defined name for this VPC.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group for this VPC.
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
   * The status of this VPC.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }
}

