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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateVpcRoute options.
 */
public class UpdateVpcRouteOptions extends GenericModel {

  protected String vpcId;
  protected String id;
  protected Map<String, Object> routePatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String vpcId;
    private String id;
    private Map<String, Object> routePatch;

    /**
     * Instantiates a new Builder from an existing UpdateVpcRouteOptions instance.
     *
     * @param updateVpcRouteOptions the instance to initialize the Builder with
     */
    private Builder(UpdateVpcRouteOptions updateVpcRouteOptions) {
      this.vpcId = updateVpcRouteOptions.vpcId;
      this.id = updateVpcRouteOptions.id;
      this.routePatch = updateVpcRouteOptions.routePatch;
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
     * @param routePatch the routePatch
     */
    public Builder(String vpcId, String id, Map<String, Object> routePatch) {
      this.vpcId = vpcId;
      this.id = id;
      this.routePatch = routePatch;
    }

    /**
     * Builds a UpdateVpcRouteOptions.
     *
     * @return the new UpdateVpcRouteOptions instance
     */
    public UpdateVpcRouteOptions build() {
      return new UpdateVpcRouteOptions(this);
    }

    /**
     * Set the vpcId.
     *
     * @param vpcId the vpcId
     * @return the UpdateVpcRouteOptions builder
     */
    public Builder vpcId(String vpcId) {
      this.vpcId = vpcId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateVpcRouteOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the routePatch.
     *
     * @param routePatch the routePatch
     * @return the UpdateVpcRouteOptions builder
     */
    public Builder routePatch(Map<String, Object> routePatch) {
      this.routePatch = routePatch;
      return this;
    }
  }

  protected UpdateVpcRouteOptions() { }

  protected UpdateVpcRouteOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.vpcId,
      "vpcId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.routePatch,
      "routePatch cannot be null");
    vpcId = builder.vpcId;
    id = builder.id;
    routePatch = builder.routePatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateVpcRouteOptions builder
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
   * The route identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the routePatch.
   *
   * The route patch.
   *
   * @return the routePatch
   */
  public Map<String, Object> routePatch() {
    return routePatch;
  }
}

