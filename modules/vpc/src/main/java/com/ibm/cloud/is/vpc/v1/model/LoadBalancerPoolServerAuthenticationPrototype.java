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
 * The server authentication to use for this pool.
 *
 * Supported by load balancers with `mtls_supported` set to `true`. The pool must have a `protocol` of `https`.
 */
public class LoadBalancerPoolServerAuthenticationPrototype extends GenericModel {

  @SerializedName("certificate_authority")
  protected CertificateInstanceIdentity certificateAuthority;
  @SerializedName("verify_certificate")
  protected Boolean verifyCertificate;

  /**
   * Builder.
   */
  public static class Builder {
    private CertificateInstanceIdentity certificateAuthority;
    private Boolean verifyCertificate;

    /**
     * Instantiates a new Builder from an existing LoadBalancerPoolServerAuthenticationPrototype instance.
     *
     * @param loadBalancerPoolServerAuthenticationPrototype the instance to initialize the Builder with
     */
    private Builder(LoadBalancerPoolServerAuthenticationPrototype loadBalancerPoolServerAuthenticationPrototype) {
      this.certificateAuthority = loadBalancerPoolServerAuthenticationPrototype.certificateAuthority;
      this.verifyCertificate = loadBalancerPoolServerAuthenticationPrototype.verifyCertificate;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a LoadBalancerPoolServerAuthenticationPrototype.
     *
     * @return the new LoadBalancerPoolServerAuthenticationPrototype instance
     */
    public LoadBalancerPoolServerAuthenticationPrototype build() {
      return new LoadBalancerPoolServerAuthenticationPrototype(this);
    }

    /**
     * Set the certificateAuthority.
     *
     * @param certificateAuthority the certificateAuthority
     * @return the LoadBalancerPoolServerAuthenticationPrototype builder
     */
    public Builder certificateAuthority(CertificateInstanceIdentity certificateAuthority) {
      this.certificateAuthority = certificateAuthority;
      return this;
    }

    /**
     * Set the verifyCertificate.
     *
     * @param verifyCertificate the verifyCertificate
     * @return the LoadBalancerPoolServerAuthenticationPrototype builder
     */
    public Builder verifyCertificate(Boolean verifyCertificate) {
      this.verifyCertificate = verifyCertificate;
      return this;
    }
  }

  protected LoadBalancerPoolServerAuthenticationPrototype() { }

  protected LoadBalancerPoolServerAuthenticationPrototype(Builder builder) {
    certificateAuthority = builder.certificateAuthority;
    verifyCertificate = builder.verifyCertificate;
  }

  /**
   * New builder.
   *
   * @return a LoadBalancerPoolServerAuthenticationPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the certificateAuthority.
   *
   * The backend server certificate authority instance to use for server
   * certificate verification.
   *
   * Supported by load balancers with `mtls_supported` set to `true`. The pool must
   * have a `protocol` of `https`.
   *
   * If specified, `verify_certificate` must be `true`.
   *
   * @return the certificateAuthority
   */
  public CertificateInstanceIdentity certificateAuthority() {
    return certificateAuthority;
  }

  /**
   * Gets the verifyCertificate.
   *
   * Indicates whether server certificate verification is enabled.
   *
   * If set to `true`, the backend server certificate is verified by:
   * - `certificate_authority`, if specified.
   * - the system default certificate authorities, if `certificate_authority`
   *   is not specified.
   *
   * @return the verifyCertificate
   */
  public Boolean verifyCertificate() {
    return verifyCertificate;
  }
}

