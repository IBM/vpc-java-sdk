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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The IP addresses or security groups from which this rule will allow traffic (or to which, for outbound rules). Can be
 * specified as an IP address, a CIDR block, or a security group. If omitted, a CIDR block of `0.0.0.0/0` will be used
 * to allow traffic from any source (or to any source, for outbound rules).
 *
 * Classes which extend this class:
 * - SecurityGroupRuleRemotePrototypeIP
 * - SecurityGroupRuleRemotePrototypeCIDR
 * - SecurityGroupRuleRemotePrototypeSecurityGroupIdentity
 */
public class SecurityGroupRuleRemotePrototype extends GenericModel {

  protected String address;
  @SerializedName("cidr_block")
  protected String cidrBlock;
  protected String id;
  protected String crn;
  protected String href;

  protected SecurityGroupRuleRemotePrototype() {
  }

  /**
   * Gets the address.
   *
   * The IP address.
   *
   * This property may add support for IPv6 addresses in the future. When processing a value in this property, verify
   * that the address is in an expected format. If it is not, log an error. Optionally halt processing and surface the
   * error, or bypass the resource on which the unexpected IP address format was encountered.
   *
   * @return the address
   */
  public String address() {
    return address;
  }

  /**
   * Gets the cidrBlock.
   *
   * The CIDR block. This property may add support for IPv6 CIDR blocks in the future. When processing a value in this
   * property, verify that the CIDR block is in an expected format. If it is not, log an error. Optionally halt
   * processing and surface the error, or bypass the resource on which the unexpected CIDR block format was encountered.
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
   * The security group's CRN.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
  }

  /**
   * Gets the href.
   *
   * The security group's canonical URL.
   *
   * @return the href
   */
  public String href() {
    return href;
  }
}

