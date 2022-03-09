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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * InstanceGroupManagerPolicyPrototype.
 *
 * Classes which extend this class:
 * - InstanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototype
 */
public class InstanceGroupManagerPolicyPrototype extends GenericModel {

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

  protected String name;
  @SerializedName("metric_type")
  protected String metricType;
  @SerializedName("metric_value")
  protected Long metricValue;
  @SerializedName("policy_type")
  protected String policyType;

  protected InstanceGroupManagerPolicyPrototype() {
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this instance group manager policy. Names must be unique within the instance group
   * manager. If unspecified, the name will be a hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the metricType.
   *
   * The type of metric to be evaluated.
   *
   * @return the metricType
   */
  public String metricType() {
    return metricType;
  }

  /**
   * Gets the metricValue.
   *
   * The metric value to be evaluated.
   *
   * @return the metricValue
   */
  public Long metricValue() {
    return metricValue;
  }

  /**
   * Gets the policyType.
   *
   * The type of policy for the instance group.
   *
   * @return the policyType
   */
  public String policyType() {
    return policyType;
  }
}

