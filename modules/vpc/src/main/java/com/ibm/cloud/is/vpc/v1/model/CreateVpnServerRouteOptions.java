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
 * The createVpnServerRoute options.
 */
public class CreateVpnServerRouteOptions extends GenericModel {

  /**
   * The action to perform with a packet matching the VPN route:
   * - `translate`: translate the source IP address to one of the private IP addresses of the VPN server, then deliver
   * the packet to target.
   * - `deliver`: deliver the packet to the target.
   * - `drop`: drop the packet
   *
   * The enumerated values for this property are expected to expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the VPN route on which the
   * unexpected property value was encountered.
   */
  public interface Action {
    /** deliver. */
    String DELIVER = "deliver";
    /** drop. */
    String DROP = "drop";
    /** translate. */
    String TRANSLATE = "translate";
  }

  protected String vpnServerId;
  protected String destination;
  protected String action;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private String vpnServerId;
    private String destination;
    private String action;
    private String name;

    /**
     * Instantiates a new Builder from an existing CreateVpnServerRouteOptions instance.
     *
     * @param createVpnServerRouteOptions the instance to initialize the Builder with
     */
    private Builder(CreateVpnServerRouteOptions createVpnServerRouteOptions) {
      this.vpnServerId = createVpnServerRouteOptions.vpnServerId;
      this.destination = createVpnServerRouteOptions.destination;
      this.action = createVpnServerRouteOptions.action;
      this.name = createVpnServerRouteOptions.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param vpnServerId the vpnServerId
     * @param destination the destination
     */
    public Builder(String vpnServerId, String destination) {
      this.vpnServerId = vpnServerId;
      this.destination = destination;
    }

    /**
     * Builds a CreateVpnServerRouteOptions.
     *
     * @return the new CreateVpnServerRouteOptions instance
     */
    public CreateVpnServerRouteOptions build() {
      return new CreateVpnServerRouteOptions(this);
    }

    /**
     * Set the vpnServerId.
     *
     * @param vpnServerId the vpnServerId
     * @return the CreateVpnServerRouteOptions builder
     */
    public Builder vpnServerId(String vpnServerId) {
      this.vpnServerId = vpnServerId;
      return this;
    }

    /**
     * Set the destination.
     *
     * @param destination the destination
     * @return the CreateVpnServerRouteOptions builder
     */
    public Builder destination(String destination) {
      this.destination = destination;
      return this;
    }

    /**
     * Set the action.
     *
     * @param action the action
     * @return the CreateVpnServerRouteOptions builder
     */
    public Builder action(String action) {
      this.action = action;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateVpnServerRouteOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected CreateVpnServerRouteOptions() { }

  protected CreateVpnServerRouteOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.vpnServerId,
      "vpnServerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.destination,
      "destination cannot be null");
    vpnServerId = builder.vpnServerId;
    destination = builder.destination;
    action = builder.action;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a CreateVpnServerRouteOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the vpnServerId.
   *
   * The VPN server identifier.
   *
   * @return the vpnServerId
   */
  public String vpnServerId() {
    return vpnServerId;
  }

  /**
   * Gets the destination.
   *
   * The destination to use for this VPN route in the VPN server. Must be unique within the VPN server. If an incoming
   * packet does not match any destination, it will be dropped.
   *
   * @return the destination
   */
  public String destination() {
    return destination;
  }

  /**
   * Gets the action.
   *
   * The action to perform with a packet matching the VPN route:
   * - `translate`: translate the source IP address to one of the private IP addresses of the VPN server, then deliver
   * the packet to target.
   * - `deliver`: deliver the packet to the target.
   * - `drop`: drop the packet
   *
   * The enumerated values for this property are expected to expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the VPN route on which the
   * unexpected property value was encountered.
   *
   * @return the action
   */
  public String action() {
    return action;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this VPN route. If unspecified, the name will be a hyphenated list of randomly-selected
   * words. Names must be unique within the VPN server the VPN route resides in.
   *
   * @return the name
   */
  public String name() {
    return name;
  }
}

