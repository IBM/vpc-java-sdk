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
 * The remote IP addresses or security groups from which this rule will allow traffic (or to which, for outbound rules).
 * Can be specified as an IP address, a CIDR block, or a security group. A CIDR block of `0.0.0.0/0` will allow traffic
 * from any source (or to any destination, for outbound rules).
 *
 * Classes which extend this class:
 * - SecurityGroupRuleRemotePatchIP
 * - SecurityGroupRuleRemotePatchCIDR
 * - SecurityGroupRuleRemotePatchSecurityGroupIdentity
 */
public class SecurityGroupRuleRemotePatch extends GenericModel {

  protected String address;
  @SerializedName("cidr_block")
  protected String cidrBlock;
  protected String id;
  protected String crn;
  protected String href;

  protected SecurityGroupRuleRemotePatch() { }

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
  public String address() {
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
  public String cidrBlock() {
    return cidrBlock;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this security group.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the crn.
   *
   * The CRN for this security group.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
  }

  /**
   * Gets the href.
   *
   * The URL for this security group.
   *
   * @return the href
   */
  public String href() {
    return href;
  }
}

