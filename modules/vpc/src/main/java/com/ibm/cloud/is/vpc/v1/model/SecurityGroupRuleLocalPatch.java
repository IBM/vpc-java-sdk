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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The local IP address or range of local IP addresses to which this rule will allow inbound traffic (or from which, for
 * outbound traffic). Can be specified as an IP address or a CIDR block.
 *
 * Specify a CIDR block of `0.0.0.0/0` to allow traffic to all local IP addresses (or from all local IP addresses, for
 * outbound rules).
 *
 * Classes which extend this class:
 * - SecurityGroupRuleLocalPatchIP
 * - SecurityGroupRuleLocalPatchCIDR
 */
public class SecurityGroupRuleLocalPatch extends GenericModel {

  protected String address;
  @SerializedName("cidr_block")
  protected String cidrBlock;

  protected SecurityGroupRuleLocalPatch() { }

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
}

