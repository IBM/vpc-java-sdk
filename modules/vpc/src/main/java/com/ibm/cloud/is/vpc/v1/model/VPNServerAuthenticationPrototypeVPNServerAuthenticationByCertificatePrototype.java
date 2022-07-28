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

/**
 * VPNServerAuthenticationPrototypeVPNServerAuthenticationByCertificatePrototype.
 */
public class VPNServerAuthenticationPrototypeVPNServerAuthenticationByCertificatePrototype extends VPNServerAuthenticationPrototype {

  /**
   * The type of authentication.
   */
  public interface Method {
    /** certificate. */
    String CERTIFICATE = "certificate";
    /** username. */
    String USERNAME = "username";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String method;
    private CertificateInstanceIdentity clientCa;
    private String crl;

    public Builder(VPNServerAuthenticationPrototype vpnServerAuthenticationPrototypeVpnServerAuthenticationByCertificatePrototype) {
      this.method = vpnServerAuthenticationPrototypeVpnServerAuthenticationByCertificatePrototype.method;
      this.clientCa = vpnServerAuthenticationPrototypeVpnServerAuthenticationByCertificatePrototype.clientCa;
      this.crl = vpnServerAuthenticationPrototypeVpnServerAuthenticationByCertificatePrototype.crl;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param method the method
     * @param clientCa the clientCa
     */
    public Builder(String method, CertificateInstanceIdentity clientCa) {
      this.method = method;
      this.clientCa = clientCa;
    }

    /**
     * Builds a VPNServerAuthenticationPrototypeVPNServerAuthenticationByCertificatePrototype.
     *
     * @return the new VPNServerAuthenticationPrototypeVPNServerAuthenticationByCertificatePrototype instance
     */
    public VPNServerAuthenticationPrototypeVPNServerAuthenticationByCertificatePrototype build() {
      return new VPNServerAuthenticationPrototypeVPNServerAuthenticationByCertificatePrototype(this);
    }

    /**
     * Set the method.
     *
     * @param method the method
     * @return the VPNServerAuthenticationPrototypeVPNServerAuthenticationByCertificatePrototype builder
     */
    public Builder method(String method) {
      this.method = method;
      return this;
    }

    /**
     * Set the clientCa.
     *
     * @param clientCa the clientCa
     * @return the VPNServerAuthenticationPrototypeVPNServerAuthenticationByCertificatePrototype builder
     */
    public Builder clientCa(CertificateInstanceIdentity clientCa) {
      this.clientCa = clientCa;
      return this;
    }

    /**
     * Set the crl.
     *
     * @param crl the crl
     * @return the VPNServerAuthenticationPrototypeVPNServerAuthenticationByCertificatePrototype builder
     */
    public Builder crl(String crl) {
      this.crl = crl;
      return this;
    }
  }

  protected VPNServerAuthenticationPrototypeVPNServerAuthenticationByCertificatePrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.method,
      "method cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.clientCa,
      "clientCa cannot be null");
    method = builder.method;
    clientCa = builder.clientCa;
    crl = builder.crl;
  }

  /**
   * New builder.
   *
   * @return a VPNServerAuthenticationPrototypeVPNServerAuthenticationByCertificatePrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

