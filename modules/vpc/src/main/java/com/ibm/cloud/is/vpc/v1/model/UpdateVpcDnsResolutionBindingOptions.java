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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateVpcDnsResolutionBinding options.
 */
public class UpdateVpcDnsResolutionBindingOptions extends GenericModel {

  protected String vpcId;
  protected String id;
  protected Map<String, Object> vpcdnsResolutionBindingPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String vpcId;
    private String id;
    private Map<String, Object> vpcdnsResolutionBindingPatch;

    /**
     * Instantiates a new Builder from an existing UpdateVpcDnsResolutionBindingOptions instance.
     *
     * @param updateVpcDnsResolutionBindingOptions the instance to initialize the Builder with
     */
    private Builder(UpdateVpcDnsResolutionBindingOptions updateVpcDnsResolutionBindingOptions) {
      this.vpcId = updateVpcDnsResolutionBindingOptions.vpcId;
      this.id = updateVpcDnsResolutionBindingOptions.id;
      this.vpcdnsResolutionBindingPatch = updateVpcDnsResolutionBindingOptions.vpcdnsResolutionBindingPatch;
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
     * @param vpcdnsResolutionBindingPatch the vpcdnsResolutionBindingPatch
     */
    public Builder(String vpcId, String id, Map<String, Object> vpcdnsResolutionBindingPatch) {
      this.vpcId = vpcId;
      this.id = id;
      this.vpcdnsResolutionBindingPatch = vpcdnsResolutionBindingPatch;
    }

    /**
     * Builds a UpdateVpcDnsResolutionBindingOptions.
     *
     * @return the new UpdateVpcDnsResolutionBindingOptions instance
     */
    public UpdateVpcDnsResolutionBindingOptions build() {
      return new UpdateVpcDnsResolutionBindingOptions(this);
    }

    /**
     * Set the vpcId.
     *
     * @param vpcId the vpcId
     * @return the UpdateVpcDnsResolutionBindingOptions builder
     */
    public Builder vpcId(String vpcId) {
      this.vpcId = vpcId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateVpcDnsResolutionBindingOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the vpcdnsResolutionBindingPatch.
     *
     * @param vpcdnsResolutionBindingPatch the vpcdnsResolutionBindingPatch
     * @return the UpdateVpcDnsResolutionBindingOptions builder
     */
    public Builder vpcdnsResolutionBindingPatch(Map<String, Object> vpcdnsResolutionBindingPatch) {
      this.vpcdnsResolutionBindingPatch = vpcdnsResolutionBindingPatch;
      return this;
    }
  }

  protected UpdateVpcDnsResolutionBindingOptions() { }

  protected UpdateVpcDnsResolutionBindingOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.vpcId,
      "vpcId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.vpcdnsResolutionBindingPatch,
      "vpcdnsResolutionBindingPatch cannot be null");
    vpcId = builder.vpcId;
    id = builder.id;
    vpcdnsResolutionBindingPatch = builder.vpcdnsResolutionBindingPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateVpcDnsResolutionBindingOptions builder
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

  /**
   * Gets the vpcdnsResolutionBindingPatch.
   *
   * The DNS resolution binding patch.
   *
   * @return the vpcdnsResolutionBindingPatch
   */
  public Map<String, Object> vpcdnsResolutionBindingPatch() {
    return vpcdnsResolutionBindingPatch;
  }
}

