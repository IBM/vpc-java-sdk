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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The IKE policy to use. If unspecified, [auto-negotiation will be
 * used](https://cloud.ibm.com/docs/vpc?topic=vpc-using-vpn&amp;interface=ui#ike-auto-negotiation-phase-1).
 *
 * Classes which extend this class:
 * - VPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityById
 * - VPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityByHref
 */
public class VPNGatewayConnectionIKEPolicyPrototype extends GenericModel {

  protected String id;
  protected String href;

  protected VPNGatewayConnectionIKEPolicyPrototype() { }

  /**
   * Gets the id.
   *
   * The unique identifier for this IKE policy.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the href.
   *
   * The IKE policy's canonical URL.
   *
   * @return the href
   */
  public String href() {
    return href;
  }
}

