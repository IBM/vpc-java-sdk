/*
 * (C) Copyright IBM Corp. 2021, 2022, 2023.
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
 * ShareMountTargetVirtualNetworkInterfacePrototype.
 *
 * Classes which extend this class:
 * - ShareMountTargetVirtualNetworkInterfacePrototypeVirtualNetworkInterfacePrototypeShareMountTargetContext
 */
public class ShareMountTargetVirtualNetworkInterfacePrototype extends GenericModel {

  protected String name;
  @SerializedName("primary_ip")
  protected VirtualNetworkInterfacePrimaryIPPrototype primaryIp;
  @SerializedName("resource_group")
  protected ResourceGroupIdentity resourceGroup;
  @SerializedName("security_groups")
  protected List<SecurityGroupIdentity> securityGroups;
  protected SubnetIdentity subnet;

  protected ShareMountTargetVirtualNetworkInterfacePrototype() { }

  /**
   * Gets the name.
   *
   * The name for this virtual network interface. The name must not be used by another virtual network interface in the
   * VPC. If unspecified, the name will be a hyphenated list of randomly-selected words. Names beginning with `ibm-` are
   * reserved for provider-owned resources, and are not allowed.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the primaryIp.
   *
   * The primary IP address to bind to the virtual network interface. May be either a
   * reserved IP identity, or a reserved IP prototype object which will be used to create a
   * new reserved IP.
   *
   * If a reserved IP identity is provided, the specified reserved IP must be unbound.
   *
   * If a reserved IP prototype object with an address is provided, the address must be
   * available on the virtual network interface's subnet. If no address is specified,
   * an available address on the subnet will be automatically selected and reserved.
   *
   * @return the primaryIp
   */
  public VirtualNetworkInterfacePrimaryIPPrototype primaryIp() {
    return primaryIp;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group to use for this virtual network interface. If unspecified, the
   * share's resource group will be used.
   *
   * @return the resourceGroup
   */
  public ResourceGroupIdentity resourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the securityGroups.
   *
   * The security groups to use for this virtual network interface. If unspecified, the default security group of the
   * VPC for the subnet is used.
   *
   * @return the securityGroups
   */
  public List<SecurityGroupIdentity> securityGroups() {
    return securityGroups;
  }

  /**
   * Gets the subnet.
   *
   * The associated subnet. Required if `primary_ip` does not specify a reserved IP
   * identity.
   *
   * @return the subnet
   */
  public SubnetIdentity subnet() {
    return subnet;
  }
}

