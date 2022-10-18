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
 * PublicGatewayFloatingIPPrototype.
 *
 * Classes which extend this class:
 * - PublicGatewayFloatingIPPrototypeFloatingIPIdentity
 * - PublicGatewayFloatingIPPrototypeFloatingIPPrototypeTargetContext
 */
public class PublicGatewayFloatingIPPrototype extends GenericModel {

  protected String id;
  protected String crn;
  protected String href;
  protected String address;
  protected String name;
  @SerializedName("resource_group")
  protected ResourceGroupIdentity resourceGroup;

  protected PublicGatewayFloatingIPPrototype() { }

  /**
   * Gets the id.
   *
   * The unique identifier for this floating IP.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the crn.
   *
   * The CRN for this floating IP.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
  }

  /**
   * Gets the href.
   *
   * The URL for this floating IP.
   *
   * @return the href
   */
  public String href() {
    return href;
  }

  /**
   * Gets the address.
   *
   * The globally unique IP address.
   *
   * @return the address
   */
  public String address() {
    return address;
  }

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
}

