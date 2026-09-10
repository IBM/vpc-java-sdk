/*
 * (C) Copyright IBM Corp. 2023, 2024, 2025, 2026.
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
 * LoadBalancerPoolMemberTargetPrototypeFQDN.
 */
public class LoadBalancerPoolMemberTargetPrototypeFQDN extends LoadBalancerPoolMemberTargetPrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private String fqdn;

    /**
     * Instantiates a new Builder from an existing LoadBalancerPoolMemberTargetPrototypeFQDN instance.
     *
     * @param loadBalancerPoolMemberTargetPrototypeFqdn the instance to initialize the Builder with
     */
    public Builder(LoadBalancerPoolMemberTargetPrototype loadBalancerPoolMemberTargetPrototypeFqdn) {
      this.fqdn = loadBalancerPoolMemberTargetPrototypeFqdn.fqdn;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param fqdn the fqdn
     */
    public Builder(String fqdn) {
      this.fqdn = fqdn;
    }

    /**
     * Builds a LoadBalancerPoolMemberTargetPrototypeFQDN.
     *
     * @return the new LoadBalancerPoolMemberTargetPrototypeFQDN instance
     */
    public LoadBalancerPoolMemberTargetPrototypeFQDN build() {
      return new LoadBalancerPoolMemberTargetPrototypeFQDN(this);
    }

    /**
     * Set the fqdn.
     *
     * @param fqdn the fqdn
     * @return the LoadBalancerPoolMemberTargetPrototypeFQDN builder
     */
    public Builder fqdn(String fqdn) {
      this.fqdn = fqdn;
      return this;
    }
  }

  protected LoadBalancerPoolMemberTargetPrototypeFQDN() { }

  protected LoadBalancerPoolMemberTargetPrototypeFQDN(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.fqdn,
      "fqdn cannot be null");
    fqdn = builder.fqdn;
  }

  /**
   * New builder.
   *
   * @return a LoadBalancerPoolMemberTargetPrototypeFQDN builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

