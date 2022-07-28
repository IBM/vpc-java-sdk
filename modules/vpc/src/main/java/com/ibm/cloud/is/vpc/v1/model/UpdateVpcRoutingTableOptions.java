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
 * The updateVpcRoutingTable options.
 */
public class UpdateVpcRoutingTableOptions extends GenericModel {

  protected String vpcId;
  protected String id;
  protected Map<String, Object> routingTablePatch;
  protected String ifMatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String vpcId;
    private String id;
    private Map<String, Object> routingTablePatch;
    private String ifMatch;

    private Builder(UpdateVpcRoutingTableOptions updateVpcRoutingTableOptions) {
      this.vpcId = updateVpcRoutingTableOptions.vpcId;
      this.id = updateVpcRoutingTableOptions.id;
      this.routingTablePatch = updateVpcRoutingTableOptions.routingTablePatch;
      this.ifMatch = updateVpcRoutingTableOptions.ifMatch;
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
     * @param routingTablePatch the routingTablePatch
     */
    public Builder(String vpcId, String id, Map<String, Object> routingTablePatch) {
      this.vpcId = vpcId;
      this.id = id;
      this.routingTablePatch = routingTablePatch;
    }

    /**
     * Builds a UpdateVpcRoutingTableOptions.
     *
     * @return the new UpdateVpcRoutingTableOptions instance
     */
    public UpdateVpcRoutingTableOptions build() {
      return new UpdateVpcRoutingTableOptions(this);
    }

    /**
     * Set the vpcId.
     *
     * @param vpcId the vpcId
     * @return the UpdateVpcRoutingTableOptions builder
     */
    public Builder vpcId(String vpcId) {
      this.vpcId = vpcId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateVpcRoutingTableOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the routingTablePatch.
     *
     * @param routingTablePatch the routingTablePatch
     * @return the UpdateVpcRoutingTableOptions builder
     */
    public Builder routingTablePatch(Map<String, Object> routingTablePatch) {
      this.routingTablePatch = routingTablePatch;
      return this;
    }

    /**
     * Set the ifMatch.
     *
     * @param ifMatch the ifMatch
     * @return the UpdateVpcRoutingTableOptions builder
     */
    public Builder ifMatch(String ifMatch) {
      this.ifMatch = ifMatch;
      return this;
    }
  }

  protected UpdateVpcRoutingTableOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.vpcId,
      "vpcId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.routingTablePatch,
      "routingTablePatch cannot be null");
    vpcId = builder.vpcId;
    id = builder.id;
    routingTablePatch = builder.routingTablePatch;
    ifMatch = builder.ifMatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateVpcRoutingTableOptions builder
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
   * The routing table identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the routingTablePatch.
   *
   * The routing table patch.
   *
   * @return the routingTablePatch
   */
  public Map<String, Object> routingTablePatch() {
    return routingTablePatch;
  }

  /**
   * Gets the ifMatch.
   *
   * If present, the request will fail if the specified ETag value does not match the resource's current ETag value.
   * Required if the request body includes an array.
   *
   * @return the ifMatch
   */
  public String ifMatch() {
    return ifMatch;
  }
}

