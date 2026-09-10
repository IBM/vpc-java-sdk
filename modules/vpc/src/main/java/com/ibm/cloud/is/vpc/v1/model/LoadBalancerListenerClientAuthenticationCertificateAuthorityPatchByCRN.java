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
 * LoadBalancerListenerClientAuthenticationCertificateAuthorityPatchByCRN.
 */
public class LoadBalancerListenerClientAuthenticationCertificateAuthorityPatchByCRN extends LoadBalancerListenerClientAuthenticationCertificateAuthorityPatch {


  /**
   * Builder.
   */
  public static class Builder {
    private String crn;

    /**
     * Instantiates a new Builder from an existing LoadBalancerListenerClientAuthenticationCertificateAuthorityPatchByCRN instance.
     *
     * @param loadBalancerListenerClientAuthenticationCertificateAuthorityPatchByCrn the instance to initialize the Builder with
     */
    public Builder(LoadBalancerListenerClientAuthenticationCertificateAuthorityPatch loadBalancerListenerClientAuthenticationCertificateAuthorityPatchByCrn) {
      this.crn = loadBalancerListenerClientAuthenticationCertificateAuthorityPatchByCrn.crn;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param crn the crn
     */
    public Builder(String crn) {
      this.crn = crn;
    }

    /**
     * Builds a LoadBalancerListenerClientAuthenticationCertificateAuthorityPatchByCRN.
     *
     * @return the new LoadBalancerListenerClientAuthenticationCertificateAuthorityPatchByCRN instance
     */
    public LoadBalancerListenerClientAuthenticationCertificateAuthorityPatchByCRN build() {
      return new LoadBalancerListenerClientAuthenticationCertificateAuthorityPatchByCRN(this);
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the LoadBalancerListenerClientAuthenticationCertificateAuthorityPatchByCRN builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }
  }

  protected LoadBalancerListenerClientAuthenticationCertificateAuthorityPatchByCRN() { }

  protected LoadBalancerListenerClientAuthenticationCertificateAuthorityPatchByCRN(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    crn = builder.crn;
  }

  /**
   * New builder.
   *
   * @return a LoadBalancerListenerClientAuthenticationCertificateAuthorityPatchByCRN builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

