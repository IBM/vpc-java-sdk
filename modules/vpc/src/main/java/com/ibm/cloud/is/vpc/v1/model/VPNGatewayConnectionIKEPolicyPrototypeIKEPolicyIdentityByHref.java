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
 * VPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityByHref.
 */
public class VPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityByHref extends VPNGatewayConnectionIKEPolicyPrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private String href;

    /**
     * Instantiates a new Builder from an existing VPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityByHref instance.
     *
     * @param vpnGatewayConnectionIkePolicyPrototypeIkePolicyIdentityByHref the instance to initialize the Builder with
     */
    public Builder(VPNGatewayConnectionIKEPolicyPrototype vpnGatewayConnectionIkePolicyPrototypeIkePolicyIdentityByHref) {
      this.href = vpnGatewayConnectionIkePolicyPrototypeIkePolicyIdentityByHref.href;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param href the href
     */
    public Builder(String href) {
      this.href = href;
    }

    /**
     * Builds a VPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityByHref.
     *
     * @return the new VPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityByHref instance
     */
    public VPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityByHref build() {
      return new VPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityByHref(this);
    }

    /**
     * Set the href.
     *
     * @param href the href
     * @return the VPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityByHref builder
     */
    public Builder href(String href) {
      this.href = href;
      return this;
    }
  }

  protected VPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityByHref() { }

  protected VPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityByHref(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.href,
      "href cannot be null");
    href = builder.href;
  }

  /**
   * New builder.
   *
   * @return a VPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityByHref builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

