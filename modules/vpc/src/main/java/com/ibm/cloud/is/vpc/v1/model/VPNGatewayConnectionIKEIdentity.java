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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * VPNGatewayConnectionIKEIdentity.
 *
 * Classes which extend this class:
 * - VPNGatewayConnectionIKEIdentityVPNGatewayConnectionIKEIdentityFQDN
 * - VPNGatewayConnectionIKEIdentityVPNGatewayConnectionIKEIdentityHostname
 * - VPNGatewayConnectionIKEIdentityVPNGatewayConnectionIKEIdentityIPv4
 * - VPNGatewayConnectionIKEIdentityVPNGatewayConnectionIKEIdentityKeyID
 */
public class VPNGatewayConnectionIKEIdentity extends GenericModel {

  /**
   * The IKE identity type.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Type {
    /** fqdn. */
    String FQDN = "fqdn";
    /** hostname. */
    String HOSTNAME = "hostname";
    /** ipv4_address. */
    String IPV4_ADDRESS = "ipv4_address";
    /** key_id. */
    String KEY_ID = "key_id";
  }

  protected String type;
  protected String value;

  protected VPNGatewayConnectionIKEIdentity() { }

  /**
   * Gets the type.
   *
   * The IKE identity type.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the value.
   *
   * The IKE identity FQDN value.
   *
   * @return the value
   */
  public String getValue() {
    return value;
  }
}

