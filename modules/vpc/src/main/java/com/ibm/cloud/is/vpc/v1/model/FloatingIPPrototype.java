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
 * FloatingIPPrototype.
 *
 * Classes which extend this class:
 * - FloatingIPPrototypeFloatingIPByZone
 * - FloatingIPPrototypeFloatingIPByTarget
 */
public class FloatingIPPrototype extends GenericModel {

  protected String name;
  @SerializedName("resource_group")
  protected ResourceGroupIdentity resourceGroup;
  protected ZoneIdentity zone;
  protected FloatingIPByTargetNetworkInterfaceIdentity target;

  protected FloatingIPPrototype() { }

  /**
   * Gets the name.
   *
   * The unique user-defined name for this floating IP. If unspecified, the name will be a hyphenated list of
   * randomly-selected words.
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
   * Gets the zone.
   *
   * The zone this floating IP will reside in.
   *
   * @return the zone
   */
  public ZoneIdentity zone() {
    return zone;
  }

  /**
   * Gets the target.
   *
   * The network interface this floating IP is to be bound to.
   *
   * @return the target
   */
  public FloatingIPByTargetNetworkInterfaceIdentity target() {
    return target;
  }
}

