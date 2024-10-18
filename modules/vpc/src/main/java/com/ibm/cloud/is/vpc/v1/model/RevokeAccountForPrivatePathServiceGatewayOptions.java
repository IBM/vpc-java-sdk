/*
 * (C) Copyright IBM Corp. 2022, 2023, 2024.
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
 * The revokeAccountForPrivatePathServiceGateway options.
 */
public class RevokeAccountForPrivatePathServiceGatewayOptions extends GenericModel {

  protected String privatePathServiceGatewayId;
  protected AccountIdentity account;

  /**
   * Builder.
   */
  public static class Builder {
    private String privatePathServiceGatewayId;
    private AccountIdentity account;

    /**
     * Instantiates a new Builder from an existing RevokeAccountForPrivatePathServiceGatewayOptions instance.
     *
     * @param revokeAccountForPrivatePathServiceGatewayOptions the instance to initialize the Builder with
     */
    private Builder(RevokeAccountForPrivatePathServiceGatewayOptions revokeAccountForPrivatePathServiceGatewayOptions) {
      this.privatePathServiceGatewayId = revokeAccountForPrivatePathServiceGatewayOptions.privatePathServiceGatewayId;
      this.account = revokeAccountForPrivatePathServiceGatewayOptions.account;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param privatePathServiceGatewayId the privatePathServiceGatewayId
     * @param account the account
     */
    public Builder(String privatePathServiceGatewayId, AccountIdentity account) {
      this.privatePathServiceGatewayId = privatePathServiceGatewayId;
      this.account = account;
    }

    /**
     * Builds a RevokeAccountForPrivatePathServiceGatewayOptions.
     *
     * @return the new RevokeAccountForPrivatePathServiceGatewayOptions instance
     */
    public RevokeAccountForPrivatePathServiceGatewayOptions build() {
      return new RevokeAccountForPrivatePathServiceGatewayOptions(this);
    }

    /**
     * Set the privatePathServiceGatewayId.
     *
     * @param privatePathServiceGatewayId the privatePathServiceGatewayId
     * @return the RevokeAccountForPrivatePathServiceGatewayOptions builder
     */
    public Builder privatePathServiceGatewayId(String privatePathServiceGatewayId) {
      this.privatePathServiceGatewayId = privatePathServiceGatewayId;
      return this;
    }

    /**
     * Set the account.
     *
     * @param account the account
     * @return the RevokeAccountForPrivatePathServiceGatewayOptions builder
     */
    public Builder account(AccountIdentity account) {
      this.account = account;
      return this;
    }
  }

  protected RevokeAccountForPrivatePathServiceGatewayOptions() { }

  protected RevokeAccountForPrivatePathServiceGatewayOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.privatePathServiceGatewayId,
      "privatePathServiceGatewayId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.account,
      "account cannot be null");
    privatePathServiceGatewayId = builder.privatePathServiceGatewayId;
    account = builder.account;
  }

  /**
   * New builder.
   *
   * @return a RevokeAccountForPrivatePathServiceGatewayOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the privatePathServiceGatewayId.
   *
   * The private path service gateway identifier.
   *
   * @return the privatePathServiceGatewayId
   */
  public String privatePathServiceGatewayId() {
    return privatePathServiceGatewayId;
  }

  /**
   * Gets the account.
   *
   * The account that will be revoked access to the private path service gateway.
   *
   * @return the account
   */
  public AccountIdentity account() {
    return account;
  }
}

