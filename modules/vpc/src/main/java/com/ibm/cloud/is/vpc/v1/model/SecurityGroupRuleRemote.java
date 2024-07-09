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
 * The remote IP addresses or security groups from which this rule allows traffic (or to which, for outbound rules). A
 * CIDR block of `0.0.0.0/0` allows traffic from any source
 * (or to any destination, for outbound rules).
 *
 * Classes which extend this class:
 * - SecurityGroupRuleRemoteIP
 * - SecurityGroupRuleRemoteCIDR
 * - SecurityGroupRuleRemoteSecurityGroupReference
 */
public class SecurityGroupRuleRemote extends GenericModel {

  protected String address;
  @SerializedName("cidr_block")
  protected String cidrBlock;
  protected String crn;
  protected SecurityGroupReferenceDeleted deleted;
  protected String href;
  protected String id;
  protected String name;

  protected SecurityGroupRuleRemote() { }

  /**
   * Gets the address.
   *
   * The IP address.
   *
   * This property may [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) to support IPv6 addresses in
   * the future.
   *
   * @return the address
   */
  public String getAddress() {
    return address;
  }

  /**
   * Gets the cidrBlock.
   *
   * The CIDR block.
   *
   * This property may [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) to support IPv6 address
   * blocks in the future.
   *
   * @return the cidrBlock
   */
  public String getCidrBlock() {
    return cidrBlock;
  }

  /**
   * Gets the crn.
   *
   * The security group's CRN.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the deleted.
   *
   * If present, this property indicates the referenced resource has been deleted, and provides
   * some supplementary information.
   *
   * @return the deleted
   */
  public SecurityGroupReferenceDeleted getDeleted() {
    return deleted;
  }

  /**
   * Gets the href.
   *
   * The security group's canonical URL.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this security group.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * The name for this security group. The name is unique across all security groups for the VPC.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }
}

