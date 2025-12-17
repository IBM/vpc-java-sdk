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
 * The createEndpointGatewayResourceBinding options.
 */
public class CreateEndpointGatewayResourceBindingOptions extends GenericModel {

  protected String endpointGatewayId;
  protected EndpointGatewayResourceBindingTargetPrototype target;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private String endpointGatewayId;
    private EndpointGatewayResourceBindingTargetPrototype target;
    private String name;

    /**
     * Instantiates a new Builder from an existing CreateEndpointGatewayResourceBindingOptions instance.
     *
     * @param createEndpointGatewayResourceBindingOptions the instance to initialize the Builder with
     */
    private Builder(CreateEndpointGatewayResourceBindingOptions createEndpointGatewayResourceBindingOptions) {
      this.endpointGatewayId = createEndpointGatewayResourceBindingOptions.endpointGatewayId;
      this.target = createEndpointGatewayResourceBindingOptions.target;
      this.name = createEndpointGatewayResourceBindingOptions.name;
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
     * @param target the target
     */
    public Builder(String endpointGatewayId, EndpointGatewayResourceBindingTargetPrototype target) {
      this.endpointGatewayId = endpointGatewayId;
      this.target = target;
    }

    /**
     * Builds a CreateEndpointGatewayResourceBindingOptions.
     *
     * @return the new CreateEndpointGatewayResourceBindingOptions instance
     */
    public CreateEndpointGatewayResourceBindingOptions build() {
      return new CreateEndpointGatewayResourceBindingOptions(this);
    }

    /**
     * Set the endpointGatewayId.
     *
     * @param endpointGatewayId the endpointGatewayId
     * @return the CreateEndpointGatewayResourceBindingOptions builder
     */
    public Builder endpointGatewayId(String endpointGatewayId) {
      this.endpointGatewayId = endpointGatewayId;
      return this;
    }

    /**
     * Set the target.
     *
     * @param target the target
     * @return the CreateEndpointGatewayResourceBindingOptions builder
     */
    public Builder target(EndpointGatewayResourceBindingTargetPrototype target) {
      this.target = target;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateEndpointGatewayResourceBindingOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected CreateEndpointGatewayResourceBindingOptions() { }

  protected CreateEndpointGatewayResourceBindingOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.endpointGatewayId,
      "endpointGatewayId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.target,
      "target cannot be null");
    endpointGatewayId = builder.endpointGatewayId;
    target = builder.target;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a CreateEndpointGatewayResourceBindingOptions builder
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
   * Gets the target.
   *
   * The target to use for this resource binding.
   *
   * @return the target
   */
  public EndpointGatewayResourceBindingTargetPrototype target() {
    return target;
  }

  /**
   * Gets the name.
   *
   * The name for this resource binding. The name must not be used by another resource binding for the endpoint gateway.
   * If unspecified, the name will be a hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }
}

