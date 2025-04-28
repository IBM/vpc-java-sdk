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
 * ShareMountTargetPrototype.
 *
 * Classes which extend this class:
 * - ShareMountTargetPrototypeShareMountTargetByAccessControlModeSecurityGroup
 * - ShareMountTargetPrototypeShareMountTargetByAccessControlModeVPC
 */
public class ShareMountTargetPrototype extends GenericModel {

  /**
   * The transit encryption mode to use for this share mount target:
   * - `none`: Not encrypted in transit.
   * - `user_managed`: Encrypted in transit using an instance identity certificate.  The
   *                   `access_control_mode` for the share must be `security_group`.
   *
   * The specified value must be listed in the share's
   * `allowed_transit_encryption_modes`.
   */
  public interface TransitEncryption {
    /** none. */
    String NONE = "none";
    /** user_managed. */
    String USER_MANAGED = "user_managed";
  }

  protected String name;
  @SerializedName("transit_encryption")
  protected String transitEncryption;
  @SerializedName("virtual_network_interface")
  protected ShareMountTargetVirtualNetworkInterfacePrototype virtualNetworkInterface;
  protected VPCIdentity vpc;

  protected ShareMountTargetPrototype() { }

  /**
   * Gets the name.
   *
   * The name for this share mount target. The name must not be used by another mount target for the file share. If
   * unspecified, the name will be a hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the transitEncryption.
   *
   * The transit encryption mode to use for this share mount target:
   * - `none`: Not encrypted in transit.
   * - `user_managed`: Encrypted in transit using an instance identity certificate.  The
   *                   `access_control_mode` for the share must be `security_group`.
   *
   * The specified value must be listed in the share's
   * `allowed_transit_encryption_modes`.
   *
   * @return the transitEncryption
   */
  public String transitEncryption() {
    return transitEncryption;
  }

  /**
   * Gets the virtualNetworkInterface.
   *
   * @return the virtualNetworkInterface
   */
  public ShareMountTargetVirtualNetworkInterfacePrototype virtualNetworkInterface() {
    return virtualNetworkInterface;
  }

  /**
   * Gets the vpc.
   *
   * Identifies a VPC by a unique property.
   *
   * @return the vpc
   */
  public VPCIdentity vpc() {
    return vpc;
  }
}

