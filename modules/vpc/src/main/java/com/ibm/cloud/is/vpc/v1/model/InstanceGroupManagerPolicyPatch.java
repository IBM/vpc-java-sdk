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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * InstanceGroupManagerPolicyPatch.
 */
public class InstanceGroupManagerPolicyPatch extends GenericModel {

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

  @SerializedName("metric_type")
  protected String metricType;
  @SerializedName("metric_value")
  protected Long metricValue;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private String metricType;
    private Long metricValue;
    private String name;

    private Builder(InstanceGroupManagerPolicyPatch instanceGroupManagerPolicyPatch) {
      this.metricType = instanceGroupManagerPolicyPatch.metricType;
      this.metricValue = instanceGroupManagerPolicyPatch.metricValue;
      this.name = instanceGroupManagerPolicyPatch.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a InstanceGroupManagerPolicyPatch.
     *
     * @return the new InstanceGroupManagerPolicyPatch instance
     */
    public InstanceGroupManagerPolicyPatch build() {
      return new InstanceGroupManagerPolicyPatch(this);
    }

    /**
     * Set the metricType.
     *
     * @param metricType the metricType
     * @return the InstanceGroupManagerPolicyPatch builder
     */
    public Builder metricType(String metricType) {
      this.metricType = metricType;
      return this;
    }

    /**
     * Set the metricValue.
     *
     * @param metricValue the metricValue
     * @return the InstanceGroupManagerPolicyPatch builder
     */
    public Builder metricValue(long metricValue) {
      this.metricValue = metricValue;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the InstanceGroupManagerPolicyPatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected InstanceGroupManagerPolicyPatch(Builder builder) {
    metricType = builder.metricType;
    metricValue = builder.metricValue;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a InstanceGroupManagerPolicyPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
   * Gets the name.
   *
   * The user-defined name for this instance group manager policy.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Construct a JSON merge-patch from the InstanceGroupManagerPolicyPatch.
   *
   * Note that properties of the InstanceGroupManagerPolicyPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the InstanceGroupManagerPolicyPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }

}

