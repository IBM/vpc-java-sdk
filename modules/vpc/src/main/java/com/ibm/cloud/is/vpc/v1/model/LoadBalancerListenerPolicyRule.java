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

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * LoadBalancerListenerPolicyRule.
 */
public class LoadBalancerListenerPolicyRule extends GenericModel {

  /**
   * The condition of the rule.
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
   * The provisioning status of this rule.
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
    /** maintenance_pending. */
    String MAINTENANCE_PENDING = "maintenance_pending";
    /** update_pending. */
    String UPDATE_PENDING = "update_pending";
  }

  /**
   * The type of the rule.
   *
   * Body rules are applied to form-encoded request bodies using the `UTF-8` character set.
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

  /**
   * Gets the condition.
   *
   * The condition of the rule.
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
   * The field. This is applicable to `header`, `query`, and `body` rule types.
   *
   * If the rule type is `header`, this property is required.
   *
   * If the rule type is `query`, this is optional. If specified and the rule condition is not
   * `matches_regex`, the value must be percent-encoded.
   *
   * If the rule type is `body`, this is optional.
   *
   * @return the field
   */
  public String getField() {
    return field;
  }

  /**
   * Gets the href.
   *
   * The rule's canonical URL.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The rule's unique identifier.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the provisioningStatus.
   *
   * The provisioning status of this rule.
   *
   * @return the provisioningStatus
   */
  public String getProvisioningStatus() {
    return provisioningStatus;
  }

  /**
   * Gets the type.
   *
   * The type of the rule.
   *
   * Body rules are applied to form-encoded request bodies using the `UTF-8` character set.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the value.
   *
   * Value to be matched for rule condition.
   *
   * If the rule type is `query` and the rule condition is not `matches_regex`, the value must be percent-encoded.
   *
   * @return the value
   */
  public String getValue() {
    return value;
  }
}

