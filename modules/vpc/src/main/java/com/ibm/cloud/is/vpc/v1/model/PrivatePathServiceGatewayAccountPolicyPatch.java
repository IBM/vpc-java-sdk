/*
 * (C) Copyright IBM Corp. 2025.
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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * PrivatePathServiceGatewayAccountPolicyPatch.
 */
public class PrivatePathServiceGatewayAccountPolicyPatch extends GenericModel {

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

  @SerializedName("access_policy")
  protected String accessPolicy;

  /**
   * Builder.
   */
  public static class Builder {
    private String accessPolicy;

    /**
     * Instantiates a new Builder from an existing PrivatePathServiceGatewayAccountPolicyPatch instance.
     *
     * @param privatePathServiceGatewayAccountPolicyPatch the instance to initialize the Builder with
     */
    private Builder(PrivatePathServiceGatewayAccountPolicyPatch privatePathServiceGatewayAccountPolicyPatch) {
      this.accessPolicy = privatePathServiceGatewayAccountPolicyPatch.accessPolicy;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PrivatePathServiceGatewayAccountPolicyPatch.
     *
     * @return the new PrivatePathServiceGatewayAccountPolicyPatch instance
     */
    public PrivatePathServiceGatewayAccountPolicyPatch build() {
      return new PrivatePathServiceGatewayAccountPolicyPatch(this);
    }

    /**
     * Set the accessPolicy.
     *
     * @param accessPolicy the accessPolicy
     * @return the PrivatePathServiceGatewayAccountPolicyPatch builder
     */
    public Builder accessPolicy(String accessPolicy) {
      this.accessPolicy = accessPolicy;
      return this;
    }
  }

  protected PrivatePathServiceGatewayAccountPolicyPatch() { }

  protected PrivatePathServiceGatewayAccountPolicyPatch(Builder builder) {
    accessPolicy = builder.accessPolicy;
  }

  /**
   * New builder.
   *
   * @return a PrivatePathServiceGatewayAccountPolicyPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
   * Construct a JSON merge-patch from the PrivatePathServiceGatewayAccountPolicyPatch.
   *
   * Note that properties of the PrivatePathServiceGatewayAccountPolicyPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the PrivatePathServiceGatewayAccountPolicyPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

