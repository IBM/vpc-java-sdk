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

/**
 * The VPC in which clients can mount the file share using this mount target.  The VPC must not be used by another mount
 * target for this share.
 *
 * Required if the share's `access_control_mode` is `vpc`.
 */
public class ShareMountTargetPrototypeShareMountTargetByAccessControlModeVPC extends ShareMountTargetPrototype {

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


  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String transitEncryption;
    private VPCIdentity vpc;

    /**
     * Instantiates a new Builder from an existing ShareMountTargetPrototypeShareMountTargetByAccessControlModeVPC instance.
     *
     * @param shareMountTargetPrototypeShareMountTargetByAccessControlModeVpc the instance to initialize the Builder with
     */
    public Builder(ShareMountTargetPrototype shareMountTargetPrototypeShareMountTargetByAccessControlModeVpc) {
      this.name = shareMountTargetPrototypeShareMountTargetByAccessControlModeVpc.name;
      this.transitEncryption = shareMountTargetPrototypeShareMountTargetByAccessControlModeVpc.transitEncryption;
      this.vpc = shareMountTargetPrototypeShareMountTargetByAccessControlModeVpc.vpc;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param vpc the vpc
     */
    public Builder(VPCIdentity vpc) {
      this.vpc = vpc;
    }

    /**
     * Builds a ShareMountTargetPrototypeShareMountTargetByAccessControlModeVPC.
     *
     * @return the new ShareMountTargetPrototypeShareMountTargetByAccessControlModeVPC instance
     */
    public ShareMountTargetPrototypeShareMountTargetByAccessControlModeVPC build() {
      return new ShareMountTargetPrototypeShareMountTargetByAccessControlModeVPC(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ShareMountTargetPrototypeShareMountTargetByAccessControlModeVPC builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the transitEncryption.
     *
     * @param transitEncryption the transitEncryption
     * @return the ShareMountTargetPrototypeShareMountTargetByAccessControlModeVPC builder
     */
    public Builder transitEncryption(String transitEncryption) {
      this.transitEncryption = transitEncryption;
      return this;
    }

    /**
     * Set the vpc.
     *
     * @param vpc the vpc
     * @return the ShareMountTargetPrototypeShareMountTargetByAccessControlModeVPC builder
     */
    public Builder vpc(VPCIdentity vpc) {
      this.vpc = vpc;
      return this;
    }
  }

  protected ShareMountTargetPrototypeShareMountTargetByAccessControlModeVPC() { }

  protected ShareMountTargetPrototypeShareMountTargetByAccessControlModeVPC(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.vpc,
      "vpc cannot be null");
    name = builder.name;
    transitEncryption = builder.transitEncryption;
    vpc = builder.vpc;
  }

  /**
   * New builder.
   *
   * @return a ShareMountTargetPrototypeShareMountTargetByAccessControlModeVPC builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

