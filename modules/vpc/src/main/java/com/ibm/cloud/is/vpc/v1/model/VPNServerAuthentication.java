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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * An authentication method for this VPN server.
 *
 * Classes which extend this class:
 * - VPNServerAuthenticationByUsername
 * - VPNServerAuthenticationByCertificate
 */
public class VPNServerAuthentication extends GenericModel {

  /**
   * The type of authentication.
   */
  public interface Method {
    /** certificate. */
    String CERTIFICATE = "certificate";
    /** username. */
    String USERNAME = "username";
  }

  protected String method;
  @SerializedName("identity_provider")
  protected VPNServerAuthenticationByUsernameIdProvider identityProvider;
  @SerializedName("client_ca")
  protected CertificateInstanceReference clientCa;
  protected String crl;

  protected VPNServerAuthentication() { }

  /**
   * Gets the method.
   *
   * The type of authentication.
   *
   * @return the method
   */
  public String getMethod() {
    return method;
  }

  /**
   * Gets the identityProvider.
   *
   * The type of identity provider to be used by VPN client.
   *
   * @return the identityProvider
   */
  public VPNServerAuthenticationByUsernameIdProvider getIdentityProvider() {
    return identityProvider;
  }

  /**
   * Gets the clientCa.
   *
   * The certificate instance used for the VPN client certificate authority (CA).
   *
   * @return the clientCa
   */
  public CertificateInstanceReference getClientCa() {
    return clientCa;
  }

  /**
   * Gets the crl.
   *
   * The certificate revocation list contents, encoded in PEM format.
   *
   * @return the crl
   */
  public String getCrl() {
    return crl;
  }
}

