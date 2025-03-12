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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateVpc options.
 */
public class UpdateVpcOptions extends GenericModel {

  protected String id;
  protected Map<String, Object> vpcPatch;
  protected String ifMatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Map<String, Object> vpcPatch;
    private String ifMatch;

    /**
     * Instantiates a new Builder from an existing UpdateVpcOptions instance.
     *
     * @param updateVpcOptions the instance to initialize the Builder with
     */
    private Builder(UpdateVpcOptions updateVpcOptions) {
      this.id = updateVpcOptions.id;
      this.vpcPatch = updateVpcOptions.vpcPatch;
      this.ifMatch = updateVpcOptions.ifMatch;
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
     * @param vpcPatch the vpcPatch
     */
    public Builder(String id, Map<String, Object> vpcPatch) {
      this.id = id;
      this.vpcPatch = vpcPatch;
    }

    /**
     * Builds a UpdateVpcOptions.
     *
     * @return the new UpdateVpcOptions instance
     */
    public UpdateVpcOptions build() {
      return new UpdateVpcOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateVpcOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the vpcPatch.
     *
     * @param vpcPatch the vpcPatch
     * @return the UpdateVpcOptions builder
     */
    public Builder vpcPatch(Map<String, Object> vpcPatch) {
      this.vpcPatch = vpcPatch;
      return this;
    }

    /**
     * Set the ifMatch.
     *
     * @param ifMatch the ifMatch
     * @return the UpdateVpcOptions builder
     */
    public Builder ifMatch(String ifMatch) {
      this.ifMatch = ifMatch;
      return this;
    }
  }

  protected UpdateVpcOptions() { }

  protected UpdateVpcOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.vpcPatch,
      "vpcPatch cannot be null");
    id = builder.id;
    vpcPatch = builder.vpcPatch;
    ifMatch = builder.ifMatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateVpcOptions builder
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

  /**
   * Gets the vpcPatch.
   *
   * The VPC patch.
   *
   * @return the vpcPatch
   */
  public Map<String, Object> vpcPatch() {
    return vpcPatch;
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

