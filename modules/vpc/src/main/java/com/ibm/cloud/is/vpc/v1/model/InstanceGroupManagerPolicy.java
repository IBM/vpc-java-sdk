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
 * InstanceGroupManagerPolicy.
 *
 * Classes which extend this class:
 * - InstanceGroupManagerPolicyInstanceGroupManagerTargetPolicy
 */
public class InstanceGroupManagerPolicy extends GenericModel {

  /**
   * The type of metric to be evaluated.
   */
  public interface MetricType {
    /** cpu. */
    String CPU = "cpu";
    /** memory. */
    String MEMORY = "memory";
    /** network_in. */
    String NETWORK_IN = "network_in";
    /** network_out. */
    String NETWORK_OUT = "network_out";
  }

  /**
   * The type of policy for the instance group.
   */
  public interface PolicyType {
    /** target. */
    String TARGET = "target";
  }

  @SerializedName("created_at")
  protected Date createdAt;
  protected String href;
  protected String id;
  protected String name;
  @SerializedName("updated_at")
  protected Date updatedAt;
  @SerializedName("metric_type")
  protected String metricType;
  @SerializedName("metric_value")
  protected Long metricValue;
  @SerializedName("policy_type")
  protected String policyType;

  protected InstanceGroupManagerPolicy() { }

  /**
   * Gets the createdAt.
   *
   * The date and time that the instance group manager policy was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the href.
   *
   * The URL for this instance group manager policy.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this instance group manager policy.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this instance group manager policy.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the updatedAt.
   *
   * The date and time that the instance group manager policy was updated.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Gets the metricType.
   *
   * The type of metric to be evaluated.
   *
   * @return the metricType
   */
  public String getMetricType() {
    return metricType;
  }

  /**
   * Gets the metricValue.
   *
   * The metric value to be evaluated.
   *
   * @return the metricValue
   */
  public Long getMetricValue() {
    return metricValue;
  }

  /**
   * Gets the policyType.
   *
   * The type of policy for the instance group.
   *
   * @return the policyType
   */
  public String getPolicyType() {
    return policyType;
  }
}

