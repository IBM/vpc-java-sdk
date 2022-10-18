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
 * The updateSecurityGroup options.
 */
public class UpdateSecurityGroupOptions extends GenericModel {

  protected String id;
  protected Map<String, Object> securityGroupPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Map<String, Object> securityGroupPatch;

    /**
     * Instantiates a new Builder from an existing UpdateSecurityGroupOptions instance.
     *
     * @param updateSecurityGroupOptions the instance to initialize the Builder with
     */
    private Builder(UpdateSecurityGroupOptions updateSecurityGroupOptions) {
      this.id = updateSecurityGroupOptions.id;
      this.securityGroupPatch = updateSecurityGroupOptions.securityGroupPatch;
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
     * @param securityGroupPatch the securityGroupPatch
     */
    public Builder(String id, Map<String, Object> securityGroupPatch) {
      this.id = id;
      this.securityGroupPatch = securityGroupPatch;
    }

    /**
     * Builds a UpdateSecurityGroupOptions.
     *
     * @return the new UpdateSecurityGroupOptions instance
     */
    public UpdateSecurityGroupOptions build() {
      return new UpdateSecurityGroupOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateSecurityGroupOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the securityGroupPatch.
     *
     * @param securityGroupPatch the securityGroupPatch
     * @return the UpdateSecurityGroupOptions builder
     */
    public Builder securityGroupPatch(Map<String, Object> securityGroupPatch) {
      this.securityGroupPatch = securityGroupPatch;
      return this;
    }
  }

  protected UpdateSecurityGroupOptions() { }

  protected UpdateSecurityGroupOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.securityGroupPatch,
      "securityGroupPatch cannot be null");
    id = builder.id;
    securityGroupPatch = builder.securityGroupPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateSecurityGroupOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The security group identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the securityGroupPatch.
   *
   * The security group patch.
   *
   * @return the securityGroupPatch
   */
  public Map<String, Object> securityGroupPatch() {
    return securityGroupPatch;
  }
}

