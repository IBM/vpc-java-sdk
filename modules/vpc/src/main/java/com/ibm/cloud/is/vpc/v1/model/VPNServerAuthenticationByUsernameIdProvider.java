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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The type of identity provider to be used by VPN client.
 *
 * Classes which extend this class:
 * - VPNServerAuthenticationByUsernameIdProviderByIAM
 */
public class VPNServerAuthenticationByUsernameIdProvider extends GenericModel {

  /**
   * The type of identity provider to be used by the VPN client:
   * - `iam`: IBM identity and access management
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface ProviderType {
    /** iam. */
    String IAM = "iam";
  }

  @SerializedName("provider_type")
  protected String providerType;

  protected VPNServerAuthenticationByUsernameIdProvider() { }

  /**
   * Gets the providerType.
   *
   * The type of identity provider to be used by the VPN client:
   * - `iam`: IBM identity and access management
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the providerType
   */
  public String providerType() {
    return providerType;
  }
}

