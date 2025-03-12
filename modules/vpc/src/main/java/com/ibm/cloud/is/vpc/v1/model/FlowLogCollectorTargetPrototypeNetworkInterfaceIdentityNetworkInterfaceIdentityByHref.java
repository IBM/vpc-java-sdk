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
 * FlowLogCollectorTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityByHref.
 */
public class FlowLogCollectorTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityByHref extends FlowLogCollectorTargetPrototypeNetworkInterfaceIdentity {


  /**
   * Builder.
   */
  public static class Builder {
    private String href;

    /**
     * Instantiates a new Builder from an existing FlowLogCollectorTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityByHref instance.
     *
     * @param flowLogCollectorTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityByHref the instance to initialize the Builder with
     */
    public Builder(FlowLogCollectorTargetPrototypeNetworkInterfaceIdentity flowLogCollectorTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityByHref) {
      this.href = flowLogCollectorTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityByHref.href;
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
     * Builds a FlowLogCollectorTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityByHref.
     *
     * @return the new FlowLogCollectorTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityByHref instance
     */
    public FlowLogCollectorTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityByHref build() {
      return new FlowLogCollectorTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityByHref(this);
    }

    /**
     * Set the href.
     *
     * @param href the href
     * @return the FlowLogCollectorTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityByHref builder
     */
    public Builder href(String href) {
      this.href = href;
      return this;
    }
  }

  protected FlowLogCollectorTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityByHref() { }

  protected FlowLogCollectorTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityByHref(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.href,
      "href cannot be null");
    href = builder.href;
  }

  /**
   * New builder.
   *
   * @return a FlowLogCollectorTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityByHref builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

