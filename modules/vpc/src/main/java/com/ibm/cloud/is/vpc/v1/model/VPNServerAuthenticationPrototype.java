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
 * - VPNServerAuthenticationPrototypeVPNServerAuthenticationByUsernamePrototype
 * - VPNServerAuthenticationPrototypeVPNServerAuthenticationByCertificatePrototype
 */
public class VPNServerAuthenticationPrototype extends GenericModel {
  @SuppressWarnings("unused")
  protected static String discriminatorPropertyName = "method";
  protected static java.util.Map<String, Class<?>> discriminatorMapping;
  static {
    discriminatorMapping = new java.util.HashMap<>();
    discriminatorMapping.put("certificate", VPNServerAuthenticationPrototypeVPNServerAuthenticationByCertificatePrototype.class);
    discriminatorMapping.put("username", VPNServerAuthenticationPrototypeVPNServerAuthenticationByUsernamePrototype.class);
  }

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
  protected CertificateInstanceIdentity clientCa;
  protected String crl;

  protected VPNServerAuthenticationPrototype() {
  }

  /**
   * Gets the method.
   *
   * The type of authentication.
   *
   * @return the method
   */
  public String method() {
    return method;
  }

  /**
   * Gets the identityProvider.
   *
   * The type of identity provider to be used by VPN client.
   *
   * @return the identityProvider
   */
  public VPNServerAuthenticationByUsernameIdProvider identityProvider() {
    return identityProvider;
  }

  /**
   * Gets the clientCa.
   *
   * The certificate instance to use for the VPN client certificate authority (CA).
   *
   * @return the clientCa
   */
  public CertificateInstanceIdentity clientCa() {
    return clientCa;
  }

  /**
   * Gets the crl.
   *
   * The certificate revocation list contents, encoded in PEM format.
   *
   * @return the crl
   */
  public String crl() {
    return crl;
  }
}

