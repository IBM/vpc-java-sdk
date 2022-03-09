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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateInstanceNetworkInterface options.
 */
public class UpdateInstanceNetworkInterfaceOptions extends GenericModel {

  protected String instanceId;
  protected String id;
  protected Map<String, Object> networkInterfacePatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String id;
    private Map<String, Object> networkInterfacePatch;

    private Builder(UpdateInstanceNetworkInterfaceOptions updateInstanceNetworkInterfaceOptions) {
      this.instanceId = updateInstanceNetworkInterfaceOptions.instanceId;
      this.id = updateInstanceNetworkInterfaceOptions.id;
      this.networkInterfacePatch = updateInstanceNetworkInterfaceOptions.networkInterfacePatch;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param instanceId the instanceId
     * @param id the id
     * @param networkInterfacePatch the networkInterfacePatch
     */
    public Builder(String instanceId, String id, Map<String, Object> networkInterfacePatch) {
      this.instanceId = instanceId;
      this.id = id;
      this.networkInterfacePatch = networkInterfacePatch;
    }

    /**
     * Builds a UpdateInstanceNetworkInterfaceOptions.
     *
     * @return the new UpdateInstanceNetworkInterfaceOptions instance
     */
    public UpdateInstanceNetworkInterfaceOptions build() {
      return new UpdateInstanceNetworkInterfaceOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the UpdateInstanceNetworkInterfaceOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateInstanceNetworkInterfaceOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the networkInterfacePatch.
     *
     * @param networkInterfacePatch the networkInterfacePatch
     * @return the UpdateInstanceNetworkInterfaceOptions builder
     */
    public Builder networkInterfacePatch(Map<String, Object> networkInterfacePatch) {
      this.networkInterfacePatch = networkInterfacePatch;
      return this;
    }
  }

  protected UpdateInstanceNetworkInterfaceOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.networkInterfacePatch,
      "networkInterfacePatch cannot be null");
    instanceId = builder.instanceId;
    id = builder.id;
    networkInterfacePatch = builder.networkInterfacePatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateInstanceNetworkInterfaceOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the instanceId.
   *
   * The instance identifier.
   *
   * @return the instanceId
   */
  public String instanceId() {
    return instanceId;
  }

  /**
   * Gets the id.
   *
   * The network interface identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the networkInterfacePatch.
   *
   * The network interface patch.
   *
   * @return the networkInterfacePatch
   */
  public Map<String, Object> networkInterfacePatch() {
    return networkInterfacePatch;
  }
}

