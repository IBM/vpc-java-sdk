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
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * LoadBalancerListenerPolicy.
 */
public class LoadBalancerListenerPolicy extends GenericModel {

  /**
   * The policy action.
   *
   * - `forward`: Requests will be forwarded to the specified `target` pool
   * - `https_redirect`: Requests will be redirected to the specified target listener. The
   *   listener must have a `protocol` of `http`, and the target listener must have a
   *   `protocol` of `https`
   * - `redirect`: Requests will be redirected to the specified `target.url`
   * - `reject`: Requests will be rejected with a `403` status code
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Action {
    /** forward. */
    String FORWARD = "forward";
    /** https_redirect. */
    String HTTPS_REDIRECT = "https_redirect";
    /** redirect. */
    String REDIRECT = "redirect";
    /** reject. */
    String REJECT = "reject";
  }

  /**
   * The provisioning status of this policy
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

  protected String action;
  @SerializedName("created_at")
  protected Date createdAt;
  protected String href;
  protected String id;
  protected String name;
  protected Long priority;
  @SerializedName("provisioning_status")
  protected String provisioningStatus;
  protected List<LoadBalancerListenerPolicyRuleReference> rules;
  protected LoadBalancerListenerPolicyTarget target;

  protected LoadBalancerListenerPolicy() { }

  /**
   * Gets the action.
   *
   * The policy action.
   *
   * - `forward`: Requests will be forwarded to the specified `target` pool
   * - `https_redirect`: Requests will be redirected to the specified target listener. The
   *   listener must have a `protocol` of `http`, and the target listener must have a
   *   `protocol` of `https`
   * - `redirect`: Requests will be redirected to the specified `target.url`
   * - `reject`: Requests will be rejected with a `403` status code
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the action
   */
  public String getAction() {
    return action;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that this policy was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the href.
   *
   * The listener policy's canonical URL.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The policy's unique identifier.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * The name for this load balancer listener policy. The name is unique across all policies for the load balancer
   * listener.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the priority.
   *
   * Priority of the policy. The priority is unique across all policies for this load balancer listener. Lower value
   * indicates higher priority.
   *
   * @return the priority
   */
  public Long getPriority() {
    return priority;
  }

  /**
   * Gets the provisioningStatus.
   *
   * The provisioning status of this policy
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
   * Gets the rules.
   *
   * The rules for this policy.
   *
   * @return the rules
   */
  public List<LoadBalancerListenerPolicyRuleReference> getRules() {
    return rules;
  }

  /**
   * Gets the target.
   *
   * - If `action` is `forward`, the response is a `LoadBalancerPoolReference`
   * - If `action` is `https_redirect`, the response is a
   * `LoadBalancerListenerPolicyHTTPSRedirect`
   * - If `action` is `redirect`, the response is a `LoadBalancerListenerPolicyRedirectURL`.
   *
   * @return the target
   */
  public LoadBalancerListenerPolicyTarget getTarget() {
    return target;
  }
}

