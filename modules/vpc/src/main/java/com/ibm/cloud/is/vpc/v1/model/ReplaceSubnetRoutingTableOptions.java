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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The replaceSubnetRoutingTable options.
 */
public class ReplaceSubnetRoutingTableOptions extends GenericModel {

  protected String id;
  protected RoutingTableIdentity routingTableIdentity;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private RoutingTableIdentity routingTableIdentity;

    private Builder(ReplaceSubnetRoutingTableOptions replaceSubnetRoutingTableOptions) {
      this.id = replaceSubnetRoutingTableOptions.id;
      this.routingTableIdentity = replaceSubnetRoutingTableOptions.routingTableIdentity;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     * @param routingTableIdentity the routingTableIdentity
     */
    public Builder(String id, RoutingTableIdentity routingTableIdentity) {
      this.id = id;
      this.routingTableIdentity = routingTableIdentity;
    }

    /**
     * Builds a ReplaceSubnetRoutingTableOptions.
     *
     * @return the new ReplaceSubnetRoutingTableOptions instance
     */
    public ReplaceSubnetRoutingTableOptions build() {
      return new ReplaceSubnetRoutingTableOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the ReplaceSubnetRoutingTableOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the routingTableIdentity.
     *
     * @param routingTableIdentity the routingTableIdentity
     * @return the ReplaceSubnetRoutingTableOptions builder
     */
    public Builder routingTableIdentity(RoutingTableIdentity routingTableIdentity) {
      this.routingTableIdentity = routingTableIdentity;
      return this;
    }
  }

  protected ReplaceSubnetRoutingTableOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.routingTableIdentity,
      "routingTableIdentity cannot be null");
    id = builder.id;
    routingTableIdentity = builder.routingTableIdentity;
  }

  /**
   * New builder.
   *
   * @return a ReplaceSubnetRoutingTableOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The subnet identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the routingTableIdentity.
   *
   * The routing table identity.
   *
   * @return the routingTableIdentity
   */
  public RoutingTableIdentity routingTableIdentity() {
    return routingTableIdentity;
  }
}

