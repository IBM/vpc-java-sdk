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
 * The updatePublicGateway options.
 */
public class UpdatePublicGatewayOptions extends GenericModel {

  protected String id;
  protected Map<String, Object> publicGatewayPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Map<String, Object> publicGatewayPatch;

    private Builder(UpdatePublicGatewayOptions updatePublicGatewayOptions) {
      this.id = updatePublicGatewayOptions.id;
      this.publicGatewayPatch = updatePublicGatewayOptions.publicGatewayPatch;
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
     * @param publicGatewayPatch the publicGatewayPatch
     */
    public Builder(String id, Map<String, Object> publicGatewayPatch) {
      this.id = id;
      this.publicGatewayPatch = publicGatewayPatch;
    }

    /**
     * Builds a UpdatePublicGatewayOptions.
     *
     * @return the new UpdatePublicGatewayOptions instance
     */
    public UpdatePublicGatewayOptions build() {
      return new UpdatePublicGatewayOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdatePublicGatewayOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the publicGatewayPatch.
     *
     * @param publicGatewayPatch the publicGatewayPatch
     * @return the UpdatePublicGatewayOptions builder
     */
    public Builder publicGatewayPatch(Map<String, Object> publicGatewayPatch) {
      this.publicGatewayPatch = publicGatewayPatch;
      return this;
    }
  }

  protected UpdatePublicGatewayOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.publicGatewayPatch,
      "publicGatewayPatch cannot be null");
    id = builder.id;
    publicGatewayPatch = builder.publicGatewayPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdatePublicGatewayOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The public gateway identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the publicGatewayPatch.
   *
   * The public gateway patch.
   *
   * @return the publicGatewayPatch
   */
  public Map<String, Object> publicGatewayPatch() {
    return publicGatewayPatch;
  }
}

