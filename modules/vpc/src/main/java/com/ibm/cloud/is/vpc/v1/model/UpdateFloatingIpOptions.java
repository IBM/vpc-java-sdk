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
 * The updateFloatingIp options.
 */
public class UpdateFloatingIpOptions extends GenericModel {

  protected String id;
  protected String name;
  protected FloatingIPPatchTargetNetworkInterfaceIdentity target;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String name;
    private FloatingIPPatchTargetNetworkInterfaceIdentity target;

    private Builder(UpdateFloatingIpOptions updateFloatingIpOptions) {
      this.id = updateFloatingIpOptions.id;
      this.name = updateFloatingIpOptions.name;
      this.target = updateFloatingIpOptions.target;
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
     * Builds a UpdateFloatingIpOptions.
     *
     * @return the new UpdateFloatingIpOptions instance
     */
    public UpdateFloatingIpOptions build() {
      return new UpdateFloatingIpOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateFloatingIpOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateFloatingIpOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the target.
     *
     * @param target the target
     * @return the UpdateFloatingIpOptions builder
     */
    public Builder target(FloatingIPPatchTargetNetworkInterfaceIdentity target) {
      this.target = target;
      return this;
    }
  }

  protected UpdateFloatingIpOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    name = builder.name;
    target = builder.target;
  }

  /**
   * New builder.
   *
   * @return a UpdateFloatingIpOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The floating IP identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the name.
   *
   * The unique user-defined name for this floating IP.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the target.
   *
   * A new network interface to bind this floating IP to, replacing any existing binding.
   * For this request to succeed, the existing floating IP must not be required by another
   * resource, such as a public gateway.
   *
   * @return the target
   */
  public FloatingIPPatchTargetNetworkInterfaceIdentity target() {
    return target;
  }
}

