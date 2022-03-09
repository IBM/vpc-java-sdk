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
 * VPNGatewayPrototype.
 *
 * Classes which extend this class:
 * - VPNGatewayPrototypeVPNGatewayRouteModePrototype
 * - VPNGatewayPrototypeVPNGatewayPolicyModePrototype
 */
public class VPNGatewayPrototype extends GenericModel {

  /**
   * Route mode VPN gateway.
   */
  public interface Mode {
    /** route. */
    String ROUTE = "route";
  }

  protected String name;
  @SerializedName("resource_group")
  protected ResourceGroupIdentity resourceGroup;
  protected SubnetIdentity subnet;
  protected String mode;

  protected VPNGatewayPrototype() {
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this VPN gateway.
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
   * group](https://cloud.ibm.com/apidocs/resource-manager#introduction) is used.
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
   * Gets the mode.
   *
   * Route mode VPN gateway.
   *
   * @return the mode
   */
  public String mode() {
    return mode;
  }
}

