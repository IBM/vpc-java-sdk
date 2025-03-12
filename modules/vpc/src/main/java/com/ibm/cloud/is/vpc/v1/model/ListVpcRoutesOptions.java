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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listVpcRoutes options.
 */
public class ListVpcRoutesOptions extends GenericModel {

  protected String vpcId;
  protected String zoneName;
  protected String start;
  protected Long limit;

  /**
   * Builder.
   */
  public static class Builder {
    private String vpcId;
    private String zoneName;
    private String start;
    private Long limit;

    /**
     * Instantiates a new Builder from an existing ListVpcRoutesOptions instance.
     *
     * @param listVpcRoutesOptions the instance to initialize the Builder with
     */
    private Builder(ListVpcRoutesOptions listVpcRoutesOptions) {
      this.vpcId = listVpcRoutesOptions.vpcId;
      this.zoneName = listVpcRoutesOptions.zoneName;
      this.start = listVpcRoutesOptions.start;
      this.limit = listVpcRoutesOptions.limit;
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
     */
    public Builder(String vpcId) {
      this.vpcId = vpcId;
    }

    /**
     * Builds a ListVpcRoutesOptions.
     *
     * @return the new ListVpcRoutesOptions instance
     */
    public ListVpcRoutesOptions build() {
      return new ListVpcRoutesOptions(this);
    }

    /**
     * Set the vpcId.
     *
     * @param vpcId the vpcId
     * @return the ListVpcRoutesOptions builder
     */
    public Builder vpcId(String vpcId) {
      this.vpcId = vpcId;
      return this;
    }

    /**
     * Set the zoneName.
     *
     * @param zoneName the zoneName
     * @return the ListVpcRoutesOptions builder
     */
    public Builder zoneName(String zoneName) {
      this.zoneName = zoneName;
      return this;
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListVpcRoutesOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListVpcRoutesOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }
  }

  protected ListVpcRoutesOptions() { }

  protected ListVpcRoutesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.vpcId,
      "vpcId cannot be empty");
    vpcId = builder.vpcId;
    zoneName = builder.zoneName;
    start = builder.start;
    limit = builder.limit;
  }

  /**
   * New builder.
   *
   * @return a ListVpcRoutesOptions builder
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
   * Gets the zoneName.
   *
   * Filters the collection to resources with a `zone.name` property matching the exact specified name.
   *
   * @return the zoneName
   */
  public String zoneName() {
    return zoneName;
  }

  /**
   * Gets the start.
   *
   * A server-provided token determining what resource to start the page on.
   *
   * @return the start
   */
  public String start() {
    return start;
  }

  /**
   * Gets the limit.
   *
   * The number of resources to return on a page.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }
}

