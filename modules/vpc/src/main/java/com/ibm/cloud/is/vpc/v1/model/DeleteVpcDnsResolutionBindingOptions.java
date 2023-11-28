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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The deleteVpcDnsResolutionBinding options.
 */
public class DeleteVpcDnsResolutionBindingOptions extends GenericModel {

  protected String vpcId;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String vpcId;
    private String id;

    /**
     * Instantiates a new Builder from an existing DeleteVpcDnsResolutionBindingOptions instance.
     *
     * @param deleteVpcDnsResolutionBindingOptions the instance to initialize the Builder with
     */
    private Builder(DeleteVpcDnsResolutionBindingOptions deleteVpcDnsResolutionBindingOptions) {
      this.vpcId = deleteVpcDnsResolutionBindingOptions.vpcId;
      this.id = deleteVpcDnsResolutionBindingOptions.id;
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
     * @param id the id
     */
    public Builder(String vpcId, String id) {
      this.vpcId = vpcId;
      this.id = id;
    }

    /**
     * Builds a DeleteVpcDnsResolutionBindingOptions.
     *
     * @return the new DeleteVpcDnsResolutionBindingOptions instance
     */
    public DeleteVpcDnsResolutionBindingOptions build() {
      return new DeleteVpcDnsResolutionBindingOptions(this);
    }

    /**
     * Set the vpcId.
     *
     * @param vpcId the vpcId
     * @return the DeleteVpcDnsResolutionBindingOptions builder
     */
    public Builder vpcId(String vpcId) {
      this.vpcId = vpcId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DeleteVpcDnsResolutionBindingOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected DeleteVpcDnsResolutionBindingOptions() { }

  protected DeleteVpcDnsResolutionBindingOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.vpcId,
      "vpcId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    vpcId = builder.vpcId;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a DeleteVpcDnsResolutionBindingOptions builder
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
   * Gets the id.
   *
   * The DNS resolution binding identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

