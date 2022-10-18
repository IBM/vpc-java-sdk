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
 * The getVpcDefaultRoutingTable options.
 */
public class GetVpcDefaultRoutingTableOptions extends GenericModel {

  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;

    /**
     * Instantiates a new Builder from an existing GetVpcDefaultRoutingTableOptions instance.
     *
     * @param getVpcDefaultRoutingTableOptions the instance to initialize the Builder with
     */
    private Builder(GetVpcDefaultRoutingTableOptions getVpcDefaultRoutingTableOptions) {
      this.id = getVpcDefaultRoutingTableOptions.id;
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
     */
    public Builder(String id) {
      this.id = id;
    }

    /**
     * Builds a GetVpcDefaultRoutingTableOptions.
     *
     * @return the new GetVpcDefaultRoutingTableOptions instance
     */
    public GetVpcDefaultRoutingTableOptions build() {
      return new GetVpcDefaultRoutingTableOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetVpcDefaultRoutingTableOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected GetVpcDefaultRoutingTableOptions() { }

  protected GetVpcDefaultRoutingTableOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a GetVpcDefaultRoutingTableOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The VPC identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

