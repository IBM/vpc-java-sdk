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

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * PrivatePathServiceGatewayAccountPolicy.
 */
public class PrivatePathServiceGatewayAccountPolicy extends GenericModel {

  /**
   * The access policy for the account:
   * - permit: access will be permitted
   * - deny:  access will be denied
   * - review: access will be manually reviewed
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface AccessPolicy {
    /** deny. */
    String DENY = "deny";
    /** permit. */
    String PERMIT = "permit";
    /** review. */
    String REVIEW = "review";
  }

  /**
   * The resource type.
   */
  public interface ResourceType {
    /** private_path_service_gateway_account_policy. */
    String PRIVATE_PATH_SERVICE_GATEWAY_ACCOUNT_POLICY = "private_path_service_gateway_account_policy";
  }

  @SerializedName("access_policy")
  protected String accessPolicy;
  protected AccountReference account;
  @SerializedName("created_at")
  protected Date createdAt;
  protected String href;
  protected String id;
  @SerializedName("resource_type")
  protected String resourceType;

  protected PrivatePathServiceGatewayAccountPolicy() { }

  /**
   * Gets the accessPolicy.
   *
   * The access policy for the account:
   * - permit: access will be permitted
   * - deny:  access will be denied
   * - review: access will be manually reviewed
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the accessPolicy
   */
  public String getAccessPolicy() {
    return accessPolicy;
  }

  /**
   * Gets the account.
   *
   * The account for this access policy.
   *
   * @return the account
   */
  public AccountReference getAccount() {
    return account;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that the account policy was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the href.
   *
   * The URL for this account policy.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this account policy.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the resourceType.
   *
   * The resource type.
   *
   * @return the resourceType
   */
  public String getResourceType() {
    return resourceType;
  }
}

