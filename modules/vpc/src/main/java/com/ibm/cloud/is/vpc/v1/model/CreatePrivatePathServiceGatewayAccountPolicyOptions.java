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
 * The createPrivatePathServiceGatewayAccountPolicy options.
 */
public class CreatePrivatePathServiceGatewayAccountPolicyOptions extends GenericModel {

  /**
   * The access policy for the account. Updating the access policy only affects pending and future endpoint gateway
   * bindings.
   * - permit: access will be permitted
   * - deny: access will be denied
   * - review: access will be manually reviewed
   *
   * - Updating to `review` sets the status of future endpoint gateway bindings from
   *    this account to `pending`.
   * - Updating to `permit` updates both the status of any `pending` and future endpoint
   *   gateway bindings from this account to `permitted`.
   * - Updating to `deny` updates both the status of any `pending` and future endpoint
   *   gateway bindings from this account to `denied`.
   */
  public interface AccessPolicy {
    /** deny. */
    String DENY = "deny";
    /** permit. */
    String PERMIT = "permit";
    /** review. */
    String REVIEW = "review";
  }

  protected String privatePathServiceGatewayId;
  protected String accessPolicy;
  protected AccountIdentity account;

  /**
   * Builder.
   */
  public static class Builder {
    private String privatePathServiceGatewayId;
    private String accessPolicy;
    private AccountIdentity account;

    /**
     * Instantiates a new Builder from an existing CreatePrivatePathServiceGatewayAccountPolicyOptions instance.
     *
     * @param createPrivatePathServiceGatewayAccountPolicyOptions the instance to initialize the Builder with
     */
    private Builder(CreatePrivatePathServiceGatewayAccountPolicyOptions createPrivatePathServiceGatewayAccountPolicyOptions) {
      this.privatePathServiceGatewayId = createPrivatePathServiceGatewayAccountPolicyOptions.privatePathServiceGatewayId;
      this.accessPolicy = createPrivatePathServiceGatewayAccountPolicyOptions.accessPolicy;
      this.account = createPrivatePathServiceGatewayAccountPolicyOptions.account;
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
     * @param accessPolicy the accessPolicy
     * @param account the account
     */
    public Builder(String privatePathServiceGatewayId, String accessPolicy, AccountIdentity account) {
      this.privatePathServiceGatewayId = privatePathServiceGatewayId;
      this.accessPolicy = accessPolicy;
      this.account = account;
    }

    /**
     * Builds a CreatePrivatePathServiceGatewayAccountPolicyOptions.
     *
     * @return the new CreatePrivatePathServiceGatewayAccountPolicyOptions instance
     */
    public CreatePrivatePathServiceGatewayAccountPolicyOptions build() {
      return new CreatePrivatePathServiceGatewayAccountPolicyOptions(this);
    }

    /**
     * Set the privatePathServiceGatewayId.
     *
     * @param privatePathServiceGatewayId the privatePathServiceGatewayId
     * @return the CreatePrivatePathServiceGatewayAccountPolicyOptions builder
     */
    public Builder privatePathServiceGatewayId(String privatePathServiceGatewayId) {
      this.privatePathServiceGatewayId = privatePathServiceGatewayId;
      return this;
    }

    /**
     * Set the accessPolicy.
     *
     * @param accessPolicy the accessPolicy
     * @return the CreatePrivatePathServiceGatewayAccountPolicyOptions builder
     */
    public Builder accessPolicy(String accessPolicy) {
      this.accessPolicy = accessPolicy;
      return this;
    }

    /**
     * Set the account.
     *
     * @param account the account
     * @return the CreatePrivatePathServiceGatewayAccountPolicyOptions builder
     */
    public Builder account(AccountIdentity account) {
      this.account = account;
      return this;
    }
  }

  protected CreatePrivatePathServiceGatewayAccountPolicyOptions() { }

  protected CreatePrivatePathServiceGatewayAccountPolicyOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.privatePathServiceGatewayId,
      "privatePathServiceGatewayId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.accessPolicy,
      "accessPolicy cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.account,
      "account cannot be null");
    privatePathServiceGatewayId = builder.privatePathServiceGatewayId;
    accessPolicy = builder.accessPolicy;
    account = builder.account;
  }

  /**
   * New builder.
   *
   * @return a CreatePrivatePathServiceGatewayAccountPolicyOptions builder
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
   * Gets the accessPolicy.
   *
   * The access policy for the account. Updating the access policy only affects pending and future endpoint gateway
   * bindings.
   * - permit: access will be permitted
   * - deny: access will be denied
   * - review: access will be manually reviewed
   *
   * - Updating to `review` sets the status of future endpoint gateway bindings from
   *    this account to `pending`.
   * - Updating to `permit` updates both the status of any `pending` and future endpoint
   *   gateway bindings from this account to `permitted`.
   * - Updating to `deny` updates both the status of any `pending` and future endpoint
   *   gateway bindings from this account to `denied`.
   *
   * @return the accessPolicy
   */
  public String accessPolicy() {
    return accessPolicy;
  }

  /**
   * Gets the account.
   *
   * The account for this access policy. The account must be unique across all account
   * policies for this private path service gateway.
   *
   * @return the account
   */
  public AccountIdentity account() {
    return account;
  }
}

