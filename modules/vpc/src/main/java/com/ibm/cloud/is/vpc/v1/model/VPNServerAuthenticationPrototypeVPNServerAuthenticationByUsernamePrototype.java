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
 * VPNServerAuthenticationPrototypeVPNServerAuthenticationByUsernamePrototype.
 */
public class VPNServerAuthenticationPrototypeVPNServerAuthenticationByUsernamePrototype extends VPNServerAuthenticationPrototype {

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
    private VPNServerAuthenticationByUsernameIdProvider identityProvider;

    public Builder(VPNServerAuthenticationPrototype vpnServerAuthenticationPrototypeVpnServerAuthenticationByUsernamePrototype) {
      this.method = vpnServerAuthenticationPrototypeVpnServerAuthenticationByUsernamePrototype.method;
      this.identityProvider = vpnServerAuthenticationPrototypeVpnServerAuthenticationByUsernamePrototype.identityProvider;
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
     * @param identityProvider the identityProvider
     */
    public Builder(String method, VPNServerAuthenticationByUsernameIdProvider identityProvider) {
      this.method = method;
      this.identityProvider = identityProvider;
    }

    /**
     * Builds a VPNServerAuthenticationPrototypeVPNServerAuthenticationByUsernamePrototype.
     *
     * @return the new VPNServerAuthenticationPrototypeVPNServerAuthenticationByUsernamePrototype instance
     */
    public VPNServerAuthenticationPrototypeVPNServerAuthenticationByUsernamePrototype build() {
      return new VPNServerAuthenticationPrototypeVPNServerAuthenticationByUsernamePrototype(this);
    }

    /**
     * Set the method.
     *
     * @param method the method
     * @return the VPNServerAuthenticationPrototypeVPNServerAuthenticationByUsernamePrototype builder
     */
    public Builder method(String method) {
      this.method = method;
      return this;
    }

    /**
     * Set the identityProvider.
     *
     * @param identityProvider the identityProvider
     * @return the VPNServerAuthenticationPrototypeVPNServerAuthenticationByUsernamePrototype builder
     */
    public Builder identityProvider(VPNServerAuthenticationByUsernameIdProvider identityProvider) {
      this.identityProvider = identityProvider;
      return this;
    }
  }

  protected VPNServerAuthenticationPrototypeVPNServerAuthenticationByUsernamePrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.method,
      "method cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.identityProvider,
      "identityProvider cannot be null");
    method = builder.method;
    identityProvider = builder.identityProvider;
  }

  /**
   * New builder.
   *
   * @return a VPNServerAuthenticationPrototypeVPNServerAuthenticationByUsernamePrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

