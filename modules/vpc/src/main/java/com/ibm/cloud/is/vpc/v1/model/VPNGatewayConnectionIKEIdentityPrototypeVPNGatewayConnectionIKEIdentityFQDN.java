/*
 * (C) Copyright IBM Corp. 2022, 2023, 2024.
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
 * VPNGatewayConnectionIKEIdentityPrototypeVPNGatewayConnectionIKEIdentityFQDN.
 */
public class VPNGatewayConnectionIKEIdentityPrototypeVPNGatewayConnectionIKEIdentityFQDN extends VPNGatewayConnectionIKEIdentityPrototype {

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
     * Instantiates a new Builder from an existing VPNGatewayConnectionIKEIdentityPrototypeVPNGatewayConnectionIKEIdentityFQDN instance.
     *
     * @param vpnGatewayConnectionIkeIdentityPrototypeVpnGatewayConnectionIkeIdentityFqdn the instance to initialize the Builder with
     */
    public Builder(VPNGatewayConnectionIKEIdentityPrototype vpnGatewayConnectionIkeIdentityPrototypeVpnGatewayConnectionIkeIdentityFqdn) {
      this.type = vpnGatewayConnectionIkeIdentityPrototypeVpnGatewayConnectionIkeIdentityFqdn.type;
      this.value = vpnGatewayConnectionIkeIdentityPrototypeVpnGatewayConnectionIkeIdentityFqdn.value;
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
     * Builds a VPNGatewayConnectionIKEIdentityPrototypeVPNGatewayConnectionIKEIdentityFQDN.
     *
     * @return the new VPNGatewayConnectionIKEIdentityPrototypeVPNGatewayConnectionIKEIdentityFQDN instance
     */
    public VPNGatewayConnectionIKEIdentityPrototypeVPNGatewayConnectionIKEIdentityFQDN build() {
      return new VPNGatewayConnectionIKEIdentityPrototypeVPNGatewayConnectionIKEIdentityFQDN(this);
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the VPNGatewayConnectionIKEIdentityPrototypeVPNGatewayConnectionIKEIdentityFQDN builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the VPNGatewayConnectionIKEIdentityPrototypeVPNGatewayConnectionIKEIdentityFQDN builder
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }

  protected VPNGatewayConnectionIKEIdentityPrototypeVPNGatewayConnectionIKEIdentityFQDN() { }

  protected VPNGatewayConnectionIKEIdentityPrototypeVPNGatewayConnectionIKEIdentityFQDN(Builder builder) {
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
   * @return a VPNGatewayConnectionIKEIdentityPrototypeVPNGatewayConnectionIKEIdentityFQDN builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

