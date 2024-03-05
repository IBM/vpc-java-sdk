/*
 * (C) Copyright IBM Corp. 2022, 2023, 2024.
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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createVpcDnsResolutionBinding options.
 */
public class CreateVpcDnsResolutionBindingOptions extends GenericModel {

  protected String vpcId;
  protected VPCIdentity vpc;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private String vpcId;
    private VPCIdentity vpc;
    private String name;

    /**
     * Instantiates a new Builder from an existing CreateVpcDnsResolutionBindingOptions instance.
     *
     * @param createVpcDnsResolutionBindingOptions the instance to initialize the Builder with
     */
    private Builder(CreateVpcDnsResolutionBindingOptions createVpcDnsResolutionBindingOptions) {
      this.vpcId = createVpcDnsResolutionBindingOptions.vpcId;
      this.vpc = createVpcDnsResolutionBindingOptions.vpc;
      this.name = createVpcDnsResolutionBindingOptions.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param vpcId the vpcId
     * @param vpc the vpc
     */
    public Builder(String vpcId, VPCIdentity vpc) {
      this.vpcId = vpcId;
      this.vpc = vpc;
    }

    /**
     * Builds a CreateVpcDnsResolutionBindingOptions.
     *
     * @return the new CreateVpcDnsResolutionBindingOptions instance
     */
    public CreateVpcDnsResolutionBindingOptions build() {
      return new CreateVpcDnsResolutionBindingOptions(this);
    }

    /**
     * Set the vpcId.
     *
     * @param vpcId the vpcId
     * @return the CreateVpcDnsResolutionBindingOptions builder
     */
    public Builder vpcId(String vpcId) {
      this.vpcId = vpcId;
      return this;
    }

    /**
     * Set the vpc.
     *
     * @param vpc the vpc
     * @return the CreateVpcDnsResolutionBindingOptions builder
     */
    public Builder vpc(VPCIdentity vpc) {
      this.vpc = vpc;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateVpcDnsResolutionBindingOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected CreateVpcDnsResolutionBindingOptions() { }

  protected CreateVpcDnsResolutionBindingOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.vpcId,
      "vpcId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.vpc,
      "vpc cannot be null");
    vpcId = builder.vpcId;
    vpc = builder.vpc;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a CreateVpcDnsResolutionBindingOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the vpcId.
   *
   * The VPC identifier.
   *
   * @return the vpcId
   */
  public String vpcId() {
    return vpcId;
  }

  /**
   * Gets the vpc.
   *
   * Another VPC to bind this VPC to for DNS resolution. The VPC must have
   * `dns.enable_hub` set to `true`, and may be in a different account (subject to
   * IAM policies).
   *
   * Additionally, the VPC specified in the URL (this VPC) must have `dns.enable_hub`
   * set to `false` and a `dns.resolution_binding_count` of zero.
   *
   * @return the vpc
   */
  public VPCIdentity vpc() {
    return vpc;
  }

  /**
   * Gets the name.
   *
   * The name for this DNS resolution binding. The name must not be used by another DNS resolution binding for the VPC.
   * If unspecified, the name will be a hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }
}

