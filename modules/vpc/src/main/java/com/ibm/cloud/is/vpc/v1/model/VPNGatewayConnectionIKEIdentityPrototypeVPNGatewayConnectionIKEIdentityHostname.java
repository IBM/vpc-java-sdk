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

/**
 * VPNGatewayConnectionIKEIdentityPrototypeVPNGatewayConnectionIKEIdentityHostname.
 */
public class VPNGatewayConnectionIKEIdentityPrototypeVPNGatewayConnectionIKEIdentityHostname extends VPNGatewayConnectionIKEIdentityPrototype {

  /**
   * The IKE identity type.
   */
  public interface Type {
    /** fqdn. */
    String FQDN = "fqdn";
    /** hostname. */
    String HOSTNAME = "hostname";
    /** ipv4_address. */
    String IPV4_ADDRESS = "ipv4_address";
    /** key_id. */
    String KEY_ID = "key_id";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String type;
    private String value;

    /**
     * Instantiates a new Builder from an existing VPNGatewayConnectionIKEIdentityPrototypeVPNGatewayConnectionIKEIdentityHostname instance.
     *
     * @param vpnGatewayConnectionIkeIdentityPrototypeVpnGatewayConnectionIkeIdentityHostname the instance to initialize the Builder with
     */
    public Builder(VPNGatewayConnectionIKEIdentityPrototype vpnGatewayConnectionIkeIdentityPrototypeVpnGatewayConnectionIkeIdentityHostname) {
      this.type = vpnGatewayConnectionIkeIdentityPrototypeVpnGatewayConnectionIkeIdentityHostname.type;
      this.value = vpnGatewayConnectionIkeIdentityPrototypeVpnGatewayConnectionIkeIdentityHostname.value;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param type the type
     * @param value the value
     */
    public Builder(String type, String value) {
      this.type = type;
      this.value = value;
    }

    /**
     * Builds a VPNGatewayConnectionIKEIdentityPrototypeVPNGatewayConnectionIKEIdentityHostname.
     *
     * @return the new VPNGatewayConnectionIKEIdentityPrototypeVPNGatewayConnectionIKEIdentityHostname instance
     */
    public VPNGatewayConnectionIKEIdentityPrototypeVPNGatewayConnectionIKEIdentityHostname build() {
      return new VPNGatewayConnectionIKEIdentityPrototypeVPNGatewayConnectionIKEIdentityHostname(this);
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the VPNGatewayConnectionIKEIdentityPrototypeVPNGatewayConnectionIKEIdentityHostname builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the VPNGatewayConnectionIKEIdentityPrototypeVPNGatewayConnectionIKEIdentityHostname builder
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }

  protected VPNGatewayConnectionIKEIdentityPrototypeVPNGatewayConnectionIKEIdentityHostname() { }

  protected VPNGatewayConnectionIKEIdentityPrototypeVPNGatewayConnectionIKEIdentityHostname(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.value,
      "value cannot be null");
    type = builder.type;
    value = builder.value;
  }

  /**
   * New builder.
   *
   * @return a VPNGatewayConnectionIKEIdentityPrototypeVPNGatewayConnectionIKEIdentityHostname builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

