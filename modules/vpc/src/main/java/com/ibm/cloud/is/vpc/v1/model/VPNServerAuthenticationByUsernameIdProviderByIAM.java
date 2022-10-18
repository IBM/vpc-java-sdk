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

/**
 * VPNServerAuthenticationByUsernameIdProviderByIAM.
 */
public class VPNServerAuthenticationByUsernameIdProviderByIAM extends VPNServerAuthenticationByUsernameIdProvider {

  /**
   * The type of identity provider to be used by the VPN client.
   * - `iam`: IBM identity and access management
   *
   * The enumerated values for this property are expected to expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the route on which the
   * unexpected property value was encountered.
   */
  public interface ProviderType {
    /** iam. */
    String IAM = "iam";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String providerType;

    /**
     * Instantiates a new Builder from an existing VPNServerAuthenticationByUsernameIdProviderByIAM instance.
     *
     * @param vpnServerAuthenticationByUsernameIdProviderByIam the instance to initialize the Builder with
     */
    public Builder(VPNServerAuthenticationByUsernameIdProvider vpnServerAuthenticationByUsernameIdProviderByIam) {
      this.providerType = vpnServerAuthenticationByUsernameIdProviderByIam.providerType;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param providerType the providerType
     */
    public Builder(String providerType) {
      this.providerType = providerType;
    }

    /**
     * Builds a VPNServerAuthenticationByUsernameIdProviderByIAM.
     *
     * @return the new VPNServerAuthenticationByUsernameIdProviderByIAM instance
     */
    public VPNServerAuthenticationByUsernameIdProviderByIAM build() {
      return new VPNServerAuthenticationByUsernameIdProviderByIAM(this);
    }

    /**
     * Set the providerType.
     *
     * @param providerType the providerType
     * @return the VPNServerAuthenticationByUsernameIdProviderByIAM builder
     */
    public Builder providerType(String providerType) {
      this.providerType = providerType;
      return this;
    }
  }

  protected VPNServerAuthenticationByUsernameIdProviderByIAM() { }

  protected VPNServerAuthenticationByUsernameIdProviderByIAM(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.providerType,
      "providerType cannot be null");
    providerType = builder.providerType;
  }

  /**
   * New builder.
   *
   * @return a VPNServerAuthenticationByUsernameIdProviderByIAM builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

