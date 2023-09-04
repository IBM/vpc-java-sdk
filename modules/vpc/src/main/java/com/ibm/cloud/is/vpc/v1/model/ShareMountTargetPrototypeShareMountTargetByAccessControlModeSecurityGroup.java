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

/**
 * The virtual network interface for this share mount target.  The virtual network interface's VPC must not be used by a
 * virtual network interface for another mount target for this share.
 *
 * Required if the share's `access_control_mode` is `security_group`.
 */
public class ShareMountTargetPrototypeShareMountTargetByAccessControlModeSecurityGroup extends ShareMountTargetPrototype {

  /**
   * The transit encryption mode to use for this share mount target:
   * - `none`: Not encrypted in transit.
   * - `user_managed`: Encrypted in transit using an instance identity certificate.  The
   *                   `access_control_mode` for the share must be `security_group`.
   */
  public interface TransitEncryption {
    /** none. */
    String NONE = "none";
    /** user_managed. */
    String USER_MANAGED = "user_managed";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String transitEncryption;
    private ShareMountTargetVirtualNetworkInterfacePrototype virtualNetworkInterface;

    /**
     * Instantiates a new Builder from an existing ShareMountTargetPrototypeShareMountTargetByAccessControlModeSecurityGroup instance.
     *
     * @param shareMountTargetPrototypeShareMountTargetByAccessControlModeSecurityGroup the instance to initialize the Builder with
     */
    public Builder(ShareMountTargetPrototype shareMountTargetPrototypeShareMountTargetByAccessControlModeSecurityGroup) {
      this.name = shareMountTargetPrototypeShareMountTargetByAccessControlModeSecurityGroup.name;
      this.transitEncryption = shareMountTargetPrototypeShareMountTargetByAccessControlModeSecurityGroup.transitEncryption;
      this.virtualNetworkInterface = shareMountTargetPrototypeShareMountTargetByAccessControlModeSecurityGroup.virtualNetworkInterface;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param virtualNetworkInterface the virtualNetworkInterface
     */
    public Builder(ShareMountTargetVirtualNetworkInterfacePrototype virtualNetworkInterface) {
      this.virtualNetworkInterface = virtualNetworkInterface;
    }

    /**
     * Builds a ShareMountTargetPrototypeShareMountTargetByAccessControlModeSecurityGroup.
     *
     * @return the new ShareMountTargetPrototypeShareMountTargetByAccessControlModeSecurityGroup instance
     */
    public ShareMountTargetPrototypeShareMountTargetByAccessControlModeSecurityGroup build() {
      return new ShareMountTargetPrototypeShareMountTargetByAccessControlModeSecurityGroup(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ShareMountTargetPrototypeShareMountTargetByAccessControlModeSecurityGroup builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the transitEncryption.
     *
     * @param transitEncryption the transitEncryption
     * @return the ShareMountTargetPrototypeShareMountTargetByAccessControlModeSecurityGroup builder
     */
    public Builder transitEncryption(String transitEncryption) {
      this.transitEncryption = transitEncryption;
      return this;
    }

    /**
     * Set the virtualNetworkInterface.
     *
     * @param virtualNetworkInterface the virtualNetworkInterface
     * @return the ShareMountTargetPrototypeShareMountTargetByAccessControlModeSecurityGroup builder
     */
    public Builder virtualNetworkInterface(ShareMountTargetVirtualNetworkInterfacePrototype virtualNetworkInterface) {
      this.virtualNetworkInterface = virtualNetworkInterface;
      return this;
    }
  }

  protected ShareMountTargetPrototypeShareMountTargetByAccessControlModeSecurityGroup() { }

  protected ShareMountTargetPrototypeShareMountTargetByAccessControlModeSecurityGroup(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.virtualNetworkInterface,
      "virtualNetworkInterface cannot be null");
    name = builder.name;
    transitEncryption = builder.transitEncryption;
    virtualNetworkInterface = builder.virtualNetworkInterface;
  }

  /**
   * New builder.
   *
   * @return a ShareMountTargetPrototypeShareMountTargetByAccessControlModeSecurityGroup builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

