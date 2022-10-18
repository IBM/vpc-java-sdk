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
 * NetworkACL.
 */
public class NetworkACL extends GenericModel {

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

  protected NetworkACL() { }

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
   * The user-defined name for this network ACL.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group for this network ACL.
   *
   * @return the resourceGroup
   */
  public ResourceGroupReference getResourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the rules.
   *
   * The ordered rules for this network ACL. If no rules exist, all traffic will be denied.
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

