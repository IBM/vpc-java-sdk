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

/**
 * InstanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototype.
 */
public class InstanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototype extends InstanceGroupManagerPolicyPrototype {

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


  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String metricType;
    private Long metricValue;
    private String policyType;

    public Builder(InstanceGroupManagerPolicyPrototype instanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototype) {
      this.name = instanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototype.name;
      this.metricType = instanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototype.metricType;
      this.metricValue = instanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototype.metricValue;
      this.policyType = instanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototype.policyType;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param metricType the metricType
     * @param metricValue the metricValue
     * @param policyType the policyType
     */
    public Builder(String metricType, Long metricValue, String policyType) {
      this.metricType = metricType;
      this.metricValue = metricValue;
      this.policyType = policyType;
    }

    /**
     * Builds a InstanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototype.
     *
     * @return the new InstanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototype instance
     */
    public InstanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototype build() {
      return new InstanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototype(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the InstanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the metricType.
     *
     * @param metricType the metricType
     * @return the InstanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototype builder
     */
    public Builder metricType(String metricType) {
      this.metricType = metricType;
      return this;
    }

    /**
     * Set the metricValue.
     *
     * @param metricValue the metricValue
     * @return the InstanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototype builder
     */
    public Builder metricValue(long metricValue) {
      this.metricValue = metricValue;
      return this;
    }

    /**
     * Set the policyType.
     *
     * @param policyType the policyType
     * @return the InstanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototype builder
     */
    public Builder policyType(String policyType) {
      this.policyType = policyType;
      return this;
    }
  }

  protected InstanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.metricType,
      "metricType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.metricValue,
      "metricValue cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.policyType,
      "policyType cannot be null");
    name = builder.name;
    metricType = builder.metricType;
    metricValue = builder.metricValue;
    policyType = builder.policyType;
  }

  /**
   * New builder.
   *
   * @return a InstanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

