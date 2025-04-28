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

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * LoadBalancerListenerPolicyRule.
 */
public class LoadBalancerListenerPolicyRule extends GenericModel {

  /**
   * The condition for the rule.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Condition {
    /** contains. */
    String CONTAINS = "contains";
    /** equals. */
    String EQUALS = "equals";
    /** matches_regex. */
    String MATCHES_REGEX = "matches_regex";
  }

  /**
   * The provisioning status of this rule
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface ProvisioningStatus {
    /** active. */
    String ACTIVE = "active";
    /** create_pending. */
    String CREATE_PENDING = "create_pending";
    /** delete_pending. */
    String DELETE_PENDING = "delete_pending";
    /** failed. */
    String FAILED = "failed";
    /** update_pending. */
    String UPDATE_PENDING = "update_pending";
  }

  /**
   * The type of the rule. Body rules are applied to form-encoded request bodies using the
   * `UTF-8` character set.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Type {
    /** body. */
    String BODY = "body";
    /** header. */
    String HEADER = "header";
    /** hostname. */
    String HOSTNAME = "hostname";
    /** path. */
    String PATH = "path";
    /** query. */
    String QUERY = "query";
    /** sni_hostname. */
    String SNI_HOSTNAME = "sni_hostname";
  }

  protected String condition;
  @SerializedName("created_at")
  protected Date createdAt;
  protected String field;
  protected String href;
  protected String id;
  @SerializedName("provisioning_status")
  protected String provisioningStatus;
  protected String type;
  protected String value;

  protected LoadBalancerListenerPolicyRule() { }

  /**
   * Gets the condition.
   *
   * The condition for the rule.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the condition
   */
  public String getCondition() {
    return condition;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that this rule was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the field.
   *
   * The field to match for this rule. If `condition` is not `matches_regex`, the value is percent-encoded.
   *
   * @return the field
   */
  public String getField() {
    return field;
  }

  /**
   * Gets the href.
   *
   * The URL for this load balancer listener policy rule.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this load balancer listener policy rule.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the provisioningStatus.
   *
   * The provisioning status of this rule
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the provisioningStatus
   */
  public String getProvisioningStatus() {
    return provisioningStatus;
  }

  /**
   * Gets the type.
   *
   * The type of the rule. Body rules are applied to form-encoded request bodies using the
   * `UTF-8` character set.
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
   * The value to be matched for the rule condition.
   *
   * If the rule type is `query` and the rule condition is not `matches_regex`, the value must be percent-encoded.
   *
   * @return the value
   */
  public String getValue() {
    return value;
  }
}

