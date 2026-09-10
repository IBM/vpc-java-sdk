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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The client authentication to use for this pool.
 *
 * Supported by load balancers with `mtls_supported` set to `true`. The pool must have a `protocol` of `https`.
 */
public class LoadBalancerPoolClientAuthenticationPrototype extends GenericModel {

  @SerializedName("certificate_instance")
  protected CertificateInstanceIdentity certificateInstance;

  /**
   * Builder.
   */
  public static class Builder {
    private CertificateInstanceIdentity certificateInstance;

    /**
     * Instantiates a new Builder from an existing LoadBalancerPoolClientAuthenticationPrototype instance.
     *
     * @param loadBalancerPoolClientAuthenticationPrototype the instance to initialize the Builder with
     */
    private Builder(LoadBalancerPoolClientAuthenticationPrototype loadBalancerPoolClientAuthenticationPrototype) {
      this.certificateInstance = loadBalancerPoolClientAuthenticationPrototype.certificateInstance;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param certificateInstance the certificateInstance
     */
    public Builder(CertificateInstanceIdentity certificateInstance) {
      this.certificateInstance = certificateInstance;
    }

    /**
     * Builds a LoadBalancerPoolClientAuthenticationPrototype.
     *
     * @return the new LoadBalancerPoolClientAuthenticationPrototype instance
     */
    public LoadBalancerPoolClientAuthenticationPrototype build() {
      return new LoadBalancerPoolClientAuthenticationPrototype(this);
    }

    /**
     * Set the certificateInstance.
     *
     * @param certificateInstance the certificateInstance
     * @return the LoadBalancerPoolClientAuthenticationPrototype builder
     */
    public Builder certificateInstance(CertificateInstanceIdentity certificateInstance) {
      this.certificateInstance = certificateInstance;
      return this;
    }
  }

  protected LoadBalancerPoolClientAuthenticationPrototype() { }

  protected LoadBalancerPoolClientAuthenticationPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.certificateInstance,
      "certificateInstance cannot be null");
    certificateInstance = builder.certificateInstance;
  }

  /**
   * New builder.
   *
   * @return a LoadBalancerPoolClientAuthenticationPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the certificateInstance.
   *
   * The backend certificate instance to use for client
   * certificate verification.
   *
   * Supported by load balancers with `mtls_supported` set to `true`. The pool
   * must have a `protocol` of `https`.
   *
   * @return the certificateInstance
   */
  public CertificateInstanceIdentity certificateInstance() {
    return certificateInstance;
  }
}

