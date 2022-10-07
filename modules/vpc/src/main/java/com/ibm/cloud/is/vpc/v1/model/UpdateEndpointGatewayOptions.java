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
 * The updateEndpointGateway options.
 */
public class UpdateEndpointGatewayOptions extends GenericModel {

  protected String id;
  protected Map<String, Object> endpointGatewayPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Map<String, Object> endpointGatewayPatch;

    /**
     * Instantiates a new Builder from an existing UpdateEndpointGatewayOptions instance.
     *
     * @param updateEndpointGatewayOptions the instance to initialize the Builder with
     */
    private Builder(UpdateEndpointGatewayOptions updateEndpointGatewayOptions) {
      this.id = updateEndpointGatewayOptions.id;
      this.endpointGatewayPatch = updateEndpointGatewayOptions.endpointGatewayPatch;
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
     * @param endpointGatewayPatch the endpointGatewayPatch
     */
    public Builder(String id, Map<String, Object> endpointGatewayPatch) {
      this.id = id;
      this.endpointGatewayPatch = endpointGatewayPatch;
    }

    /**
     * Builds a UpdateEndpointGatewayOptions.
     *
     * @return the new UpdateEndpointGatewayOptions instance
     */
    public UpdateEndpointGatewayOptions build() {
      return new UpdateEndpointGatewayOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateEndpointGatewayOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the endpointGatewayPatch.
     *
     * @param endpointGatewayPatch the endpointGatewayPatch
     * @return the UpdateEndpointGatewayOptions builder
     */
    public Builder endpointGatewayPatch(Map<String, Object> endpointGatewayPatch) {
      this.endpointGatewayPatch = endpointGatewayPatch;
      return this;
    }
  }

  protected UpdateEndpointGatewayOptions() { }

  protected UpdateEndpointGatewayOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.endpointGatewayPatch,
      "endpointGatewayPatch cannot be null");
    id = builder.id;
    endpointGatewayPatch = builder.endpointGatewayPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateEndpointGatewayOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The endpoint gateway identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the endpointGatewayPatch.
   *
   * The endpoint gateway patch.
   *
   * @return the endpointGatewayPatch
   */
  public Map<String, Object> endpointGatewayPatch() {
    return endpointGatewayPatch;
  }
}

