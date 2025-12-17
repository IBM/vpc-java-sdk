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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * VPNGatewayPrototype.
 *
 * Classes which extend this class:
 * - VPNGatewayPrototypeVPNGatewayRouteModePrototype
 * - VPNGatewayPrototypeVPNGatewayPolicyModePrototype
 */
public class VPNGatewayPrototype extends GenericModel {

  /**
   * The mode for this VPN gateway.
   */
  public interface Mode {
    /** route. */
    String ROUTE = "route";
  }

  protected String name;
  @SerializedName("resource_group")
  protected ResourceGroupIdentity resourceGroup;
  protected SubnetIdentity subnet;
  @SerializedName("advertised_cidrs")
  protected List<String> advertisedCidrs;
  @SerializedName("local_asn")
  protected Long localAsn;
  protected String mode;

  protected VPNGatewayPrototype() { }

  /**
   * Gets the name.
   *
   * The name for this VPN gateway. The name must not be used by another VPN gateway in the VPC. If unspecified, the
   * name will be a hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group to use. If unspecified, the account's [default resource
   * group](https://cloud.ibm.com/apidocs/resource-manager#introduction) will be used.
   *
   * @return the resourceGroup
   */
  public ResourceGroupIdentity resourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the subnet.
   *
   * Identifies a subnet by a unique property.
   *
   * @return the subnet
   */
  public SubnetIdentity subnet() {
    return subnet;
  }

  /**
   * Gets the advertisedCidrs.
   *
   * The static CIDRs advertised through any enabled routing protocol (for example, BGP). The routing protocol will
   * advertise routes with these CIDRs as route destinations.
   *
   * @return the advertisedCidrs
   */
  public List<String> advertisedCidrs() {
    return advertisedCidrs;
  }

  /**
   * Gets the localAsn.
   *
   * The local autonomous system number (ASN) for this VPN gateway and its connections. The ASN values in the
   * [restricted ASN list](
   * https://cloud.ibm.com/docs/vpc?topic=vpc-planning-considerations-vpn#dynamic-route-based-considerations) are
   * reserved and unavailable.
   *
   * @return the localAsn
   */
  public Long localAsn() {
    return localAsn;
  }

  /**
   * Gets the mode.
   *
   * The mode for this VPN gateway.
   *
   * @return the mode
   */
  public String mode() {
    return mode;
  }
}

