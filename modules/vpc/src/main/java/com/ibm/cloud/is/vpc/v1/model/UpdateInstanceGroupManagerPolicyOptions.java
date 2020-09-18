/*
 * (C) Copyright IBM Corp. 2020.
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
 * The updateInstanceGroupManagerPolicy options.
 */
public class UpdateInstanceGroupManagerPolicyOptions extends GenericModel {

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

  protected String instanceGroupId;
  protected String instanceGroupManagerId;
  protected String id;
  protected String name;
  protected String metricType;
  protected Long metricValue;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceGroupId;
    private String instanceGroupManagerId;
    private String id;
    private String name;
    private String metricType;
    private Long metricValue;

    private Builder(UpdateInstanceGroupManagerPolicyOptions updateInstanceGroupManagerPolicyOptions) {
      this.instanceGroupId = updateInstanceGroupManagerPolicyOptions.instanceGroupId;
      this.instanceGroupManagerId = updateInstanceGroupManagerPolicyOptions.instanceGroupManagerId;
      this.id = updateInstanceGroupManagerPolicyOptions.id;
      this.name = updateInstanceGroupManagerPolicyOptions.name;
      this.metricType = updateInstanceGroupManagerPolicyOptions.metricType;
      this.metricValue = updateInstanceGroupManagerPolicyOptions.metricValue;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param instanceGroupId the instanceGroupId
     * @param instanceGroupManagerId the instanceGroupManagerId
     * @param id the id
     */
    public Builder(String instanceGroupId, String instanceGroupManagerId, String id) {
      this.instanceGroupId = instanceGroupId;
      this.instanceGroupManagerId = instanceGroupManagerId;
      this.id = id;
    }

    /**
     * Builds a UpdateInstanceGroupManagerPolicyOptions.
     *
     * @return the new UpdateInstanceGroupManagerPolicyOptions instance
     */
    public UpdateInstanceGroupManagerPolicyOptions build() {
      return new UpdateInstanceGroupManagerPolicyOptions(this);
    }

    /**
     * Set the instanceGroupId.
     *
     * @param instanceGroupId the instanceGroupId
     * @return the UpdateInstanceGroupManagerPolicyOptions builder
     */
    public Builder instanceGroupId(String instanceGroupId) {
      this.instanceGroupId = instanceGroupId;
      return this;
    }

    /**
     * Set the instanceGroupManagerId.
     *
     * @param instanceGroupManagerId the instanceGroupManagerId
     * @return the UpdateInstanceGroupManagerPolicyOptions builder
     */
    public Builder instanceGroupManagerId(String instanceGroupManagerId) {
      this.instanceGroupManagerId = instanceGroupManagerId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateInstanceGroupManagerPolicyOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateInstanceGroupManagerPolicyOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the metricType.
     *
     * @param metricType the metricType
     * @return the UpdateInstanceGroupManagerPolicyOptions builder
     */
    public Builder metricType(String metricType) {
      this.metricType = metricType;
      return this;
    }

    /**
     * Set the metricValue.
     *
     * @param metricValue the metricValue
     * @return the UpdateInstanceGroupManagerPolicyOptions builder
     */
    public Builder metricValue(long metricValue) {
      this.metricValue = metricValue;
      return this;
    }
  }

  protected UpdateInstanceGroupManagerPolicyOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceGroupId,
      "instanceGroupId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceGroupManagerId,
      "instanceGroupManagerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    instanceGroupId = builder.instanceGroupId;
    instanceGroupManagerId = builder.instanceGroupManagerId;
    id = builder.id;
    name = builder.name;
    metricType = builder.metricType;
    metricValue = builder.metricValue;
  }

  /**
   * New builder.
   *
   * @return a UpdateInstanceGroupManagerPolicyOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the instanceGroupId.
   *
   * The instance group identifier.
   *
   * @return the instanceGroupId
   */
  public String instanceGroupId() {
    return instanceGroupId;
  }

  /**
   * Gets the instanceGroupManagerId.
   *
   * The instance group manager identifier.
   *
   * @return the instanceGroupManagerId
   */
  public String instanceGroupManagerId() {
    return instanceGroupManagerId;
  }

  /**
   * Gets the id.
   *
   * The instance group manager policy identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this instance group manager policy. Names must be unique within the instance group
   * manager.
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
}

