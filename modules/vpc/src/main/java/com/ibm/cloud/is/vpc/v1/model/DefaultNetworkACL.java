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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * DefaultNetworkACL.
 */
public class DefaultNetworkACL extends GenericModel {

  @SerializedName("created_at")
  protected Date createdAt;
  protected String crn;
  protected String href;
  protected String id;
  protected String name;
  @SerializedName("resource_group")
  protected ResourceGroupReference resourceGroup;
  protected List<NetworkACLRuleItem> rules;
  protected List<SubnetReference> subnets;
  protected VPCReference vpc;

  protected DefaultNetworkACL() { }

  /**
   * Gets the createdAt.
   *
   * The date and time that the network ACL was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the crn.
   *
   * The CRN for this network ACL.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the href.
   *
   * The URL for this network ACL.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this network ACL.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * The name of the default network ACL created for a VPC. The name will be a hyphenated list of randomly-selected
   * words at creation, but may be changed.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group for the default network ACL for a VPC. Set to the VPC's
   * resource group at creation.
   *
   * @return the resourceGroup
   */
  public ResourceGroupReference getResourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the rules.
   *
   * The ordered rules for the default network ACL for a VPC. Created with:
   * - The first rule, named `allow-inbound`, allowing ICMP, TCP and UDP inbound traffic.
   * - The second rule, named `allow-outbound`, allowing ICMP, TCP, and UDP outbound
   *   traffic.
   *
   *  Rules for the default network ACL may be changed, added, or removed.
   *
   * @return the rules
   */
  public List<NetworkACLRuleItem> getRules() {
    return rules;
  }

  /**
   * Gets the subnets.
   *
   * The subnets to which this network ACL is attached.
   *
   * @return the subnets
   */
  public List<SubnetReference> getSubnets() {
    return subnets;
  }

  /**
   * Gets the vpc.
   *
   * The VPC this network ACL resides in.
   *
   * @return the vpc
   */
  public VPCReference getVpc() {
    return vpc;
  }
}

