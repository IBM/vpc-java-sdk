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
 * The updateEndpointGatewayResourceBinding options.
 */
public class UpdateEndpointGatewayResourceBindingOptions extends GenericModel {

  protected String endpointGatewayId;
  protected String id;
  protected Map<String, Object> endpointGatewayResourceBindingPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String endpointGatewayId;
    private String id;
    private Map<String, Object> endpointGatewayResourceBindingPatch;

    /**
     * Instantiates a new Builder from an existing UpdateEndpointGatewayResourceBindingOptions instance.
     *
     * @param updateEndpointGatewayResourceBindingOptions the instance to initialize the Builder with
     */
    private Builder(UpdateEndpointGatewayResourceBindingOptions updateEndpointGatewayResourceBindingOptions) {
      this.endpointGatewayId = updateEndpointGatewayResourceBindingOptions.endpointGatewayId;
      this.id = updateEndpointGatewayResourceBindingOptions.id;
      this.endpointGatewayResourceBindingPatch = updateEndpointGatewayResourceBindingOptions.endpointGatewayResourceBindingPatch;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param endpointGatewayId the endpointGatewayId
     * @param id the id
     * @param endpointGatewayResourceBindingPatch the endpointGatewayResourceBindingPatch
     */
    public Builder(String endpointGatewayId, String id, Map<String, Object> endpointGatewayResourceBindingPatch) {
      this.endpointGatewayId = endpointGatewayId;
      this.id = id;
      this.endpointGatewayResourceBindingPatch = endpointGatewayResourceBindingPatch;
    }

    /**
     * Builds a UpdateEndpointGatewayResourceBindingOptions.
     *
     * @return the new UpdateEndpointGatewayResourceBindingOptions instance
     */
    public UpdateEndpointGatewayResourceBindingOptions build() {
      return new UpdateEndpointGatewayResourceBindingOptions(this);
    }

    /**
     * Set the endpointGatewayId.
     *
     * @param endpointGatewayId the endpointGatewayId
     * @return the UpdateEndpointGatewayResourceBindingOptions builder
     */
    public Builder endpointGatewayId(String endpointGatewayId) {
      this.endpointGatewayId = endpointGatewayId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateEndpointGatewayResourceBindingOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the endpointGatewayResourceBindingPatch.
     *
     * @param endpointGatewayResourceBindingPatch the endpointGatewayResourceBindingPatch
     * @return the UpdateEndpointGatewayResourceBindingOptions builder
     */
    public Builder endpointGatewayResourceBindingPatch(Map<String, Object> endpointGatewayResourceBindingPatch) {
      this.endpointGatewayResourceBindingPatch = endpointGatewayResourceBindingPatch;
      return this;
    }
  }

  protected UpdateEndpointGatewayResourceBindingOptions() { }

  protected UpdateEndpointGatewayResourceBindingOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.endpointGatewayId,
      "endpointGatewayId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.endpointGatewayResourceBindingPatch,
      "endpointGatewayResourceBindingPatch cannot be null");
    endpointGatewayId = builder.endpointGatewayId;
    id = builder.id;
    endpointGatewayResourceBindingPatch = builder.endpointGatewayResourceBindingPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateEndpointGatewayResourceBindingOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the endpointGatewayId.
   *
   * The endpoint gateway identifier.
   *
   * @return the endpointGatewayId
   */
  public String endpointGatewayId() {
    return endpointGatewayId;
  }

  /**
   * Gets the id.
   *
   * The resource binding identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the endpointGatewayResourceBindingPatch.
   *
   * The endpoint gateway resource binding patch.
   *
   * @return the endpointGatewayResourceBindingPatch
   */
  public Map<String, Object> endpointGatewayResourceBindingPatch() {
    return endpointGatewayResourceBindingPatch;
  }
}

