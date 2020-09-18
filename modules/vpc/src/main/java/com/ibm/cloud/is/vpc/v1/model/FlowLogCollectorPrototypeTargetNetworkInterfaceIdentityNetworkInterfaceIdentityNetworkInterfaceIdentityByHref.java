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

/**
 * FlowLogCollectorPrototypeTargetNetworkInterfaceIdentityNetworkInterfaceIdentityNetworkInterfaceIdentityByHref.
 */
public class FlowLogCollectorPrototypeTargetNetworkInterfaceIdentityNetworkInterfaceIdentityNetworkInterfaceIdentityByHref extends FlowLogCollectorPrototypeTargetNetworkInterfaceIdentity {


  /**
   * Builder.
   */
  public static class Builder {
    private String href;

    public Builder(FlowLogCollectorPrototypeTargetNetworkInterfaceIdentity flowLogCollectorPrototypeTargetNetworkInterfaceIdentityNetworkInterfaceIdentityNetworkInterfaceIdentityByHref) {
      this.href = flowLogCollectorPrototypeTargetNetworkInterfaceIdentityNetworkInterfaceIdentityNetworkInterfaceIdentityByHref.href;
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
     * Builds a FlowLogCollectorPrototypeTargetNetworkInterfaceIdentityNetworkInterfaceIdentityNetworkInterfaceIdentityByHref.
     *
     * @return the new FlowLogCollectorPrototypeTargetNetworkInterfaceIdentityNetworkInterfaceIdentityNetworkInterfaceIdentityByHref instance
     */
    public FlowLogCollectorPrototypeTargetNetworkInterfaceIdentityNetworkInterfaceIdentityNetworkInterfaceIdentityByHref build() {
      return new FlowLogCollectorPrototypeTargetNetworkInterfaceIdentityNetworkInterfaceIdentityNetworkInterfaceIdentityByHref(this);
    }

    /**
     * Set the href.
     *
     * @param href the href
     * @return the FlowLogCollectorPrototypeTargetNetworkInterfaceIdentityNetworkInterfaceIdentityNetworkInterfaceIdentityByHref builder
     */
    public Builder href(String href) {
      this.href = href;
      return this;
    }
  }

  protected FlowLogCollectorPrototypeTargetNetworkInterfaceIdentityNetworkInterfaceIdentityNetworkInterfaceIdentityByHref(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.href,
      "href cannot be null");
    href = builder.href;
  }

  /**
   * New builder.
   *
   * @return a FlowLogCollectorPrototypeTargetNetworkInterfaceIdentityNetworkInterfaceIdentityNetworkInterfaceIdentityByHref builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

