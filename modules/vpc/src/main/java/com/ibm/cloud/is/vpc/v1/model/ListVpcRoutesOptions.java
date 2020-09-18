/*
 * (C) Copyright IBM Corp. 2020.
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

  /**
   * Builder.
   */
  public static class Builder {
    private String vpcId;
    private String zoneName;

    private Builder(ListVpcRoutesOptions listVpcRoutesOptions) {
      this.vpcId = listVpcRoutesOptions.vpcId;
      this.zoneName = listVpcRoutesOptions.zoneName;
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
  }

  protected ListVpcRoutesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.vpcId,
      "vpcId cannot be empty");
    vpcId = builder.vpcId;
    zoneName = builder.zoneName;
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
   * Filters the collection to resources in the zone with the exact specified name.
   *
   * @return the zoneName
   */
  public String zoneName() {
    return zoneName;
  }
}

