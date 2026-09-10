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
 * The client authentication to use for this listener.
 *
 * Supported by load balancers with `mtls_supported` set to `true`. The listener must have a `protocol` of `https`.
 *
 * Specify `null` to remove an existing client authentication.
 */
public class LoadBalancerListenerClientAuthenticationPatch extends GenericModel {

  @SerializedName("certificate_authority")
  protected LoadBalancerListenerClientAuthenticationCertificateAuthorityPatch certificateAuthority;
  @SerializedName("certificate_revocation_list")
  protected String certificateRevocationList;

  /**
   * Builder.
   */
  public static class Builder {
    private LoadBalancerListenerClientAuthenticationCertificateAuthorityPatch certificateAuthority;
    private String certificateRevocationList;

    /**
     * Instantiates a new Builder from an existing LoadBalancerListenerClientAuthenticationPatch instance.
     *
     * @param loadBalancerListenerClientAuthenticationPatch the instance to initialize the Builder with
     */
    private Builder(LoadBalancerListenerClientAuthenticationPatch loadBalancerListenerClientAuthenticationPatch) {
      this.certificateAuthority = loadBalancerListenerClientAuthenticationPatch.certificateAuthority;
      this.certificateRevocationList = loadBalancerListenerClientAuthenticationPatch.certificateRevocationList;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a LoadBalancerListenerClientAuthenticationPatch.
     *
     * @return the new LoadBalancerListenerClientAuthenticationPatch instance
     */
    public LoadBalancerListenerClientAuthenticationPatch build() {
      return new LoadBalancerListenerClientAuthenticationPatch(this);
    }

    /**
     * Set the certificateAuthority.
     *
     * @param certificateAuthority the certificateAuthority
     * @return the LoadBalancerListenerClientAuthenticationPatch builder
     */
    public Builder certificateAuthority(LoadBalancerListenerClientAuthenticationCertificateAuthorityPatch certificateAuthority) {
      this.certificateAuthority = certificateAuthority;
      return this;
    }

    /**
     * Set the certificateRevocationList.
     *
     * @param certificateRevocationList the certificateRevocationList
     * @return the LoadBalancerListenerClientAuthenticationPatch builder
     */
    public Builder certificateRevocationList(String certificateRevocationList) {
      this.certificateRevocationList = certificateRevocationList;
      return this;
    }
  }

  protected LoadBalancerListenerClientAuthenticationPatch() { }

  protected LoadBalancerListenerClientAuthenticationPatch(Builder builder) {
    certificateAuthority = builder.certificateAuthority;
    certificateRevocationList = builder.certificateRevocationList;
  }

  /**
   * New builder.
   *
   * @return a LoadBalancerListenerClientAuthenticationPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the certificateAuthority.
   *
   * The certificate instance to use for the listener client certificate authority.
   *
   * Specify `null` to remove an existing certificate authority.
   *
   * @return the certificateAuthority
   */
  public LoadBalancerListenerClientAuthenticationCertificateAuthorityPatch certificateAuthority() {
    return certificateAuthority;
  }

  /**
   * Gets the certificateRevocationList.
   *
   * A [PEM-encoded](https://www.rfc-editor.org/rfc/rfc7468) (with the label `X509 CRL`) certificate revocation list
   * (CRL) to use for the listener.
   *
   * The CRL must be formatted using the X.509 standard as described in
   * [RFC 5280](https://www.rfc-editor.org/rfc/rfc5280).
   *
   * Specify `null` to remove an existing certificate revocation list.
   *
   * @return the certificateRevocationList
   */
  public String certificateRevocationList() {
    return certificateRevocationList;
  }
}

