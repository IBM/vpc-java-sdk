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
 * The server authentication used for this pool.
 *
 * This property will be absent if the `pool.protocol` is not `https`.
 */
public class LoadBalancerPoolServerAuthentication extends GenericModel {

  @SerializedName("certificate_authority")
  protected CertificateInstanceReference certificateAuthority;
  @SerializedName("verify_certificate")
  protected Boolean verifyCertificate;

  protected LoadBalancerPoolServerAuthentication() { }

  /**
   * Gets the certificateAuthority.
   *
   * The backend server certificate authority instance used for server
   * certificate verification.
   *
   * @return the certificateAuthority
   */
  public CertificateInstanceReference getCertificateAuthority() {
    return certificateAuthority;
  }

  /**
   * Gets the verifyCertificate.
   *
   * If set to `true`, the backend server certificate is verified.
   *
   * @return the verifyCertificate
   */
  public Boolean isVerifyCertificate() {
    return verifyCertificate;
  }
}

