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
 * The updateFlowLogCollector options.
 */
public class UpdateFlowLogCollectorOptions extends GenericModel {

  protected String id;
  protected Map<String, Object> flowLogCollectorPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Map<String, Object> flowLogCollectorPatch;

    private Builder(UpdateFlowLogCollectorOptions updateFlowLogCollectorOptions) {
      this.id = updateFlowLogCollectorOptions.id;
      this.flowLogCollectorPatch = updateFlowLogCollectorOptions.flowLogCollectorPatch;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     * @param flowLogCollectorPatch the flowLogCollectorPatch
     */
    public Builder(String id, Map<String, Object> flowLogCollectorPatch) {
      this.id = id;
      this.flowLogCollectorPatch = flowLogCollectorPatch;
    }

    /**
     * Builds a UpdateFlowLogCollectorOptions.
     *
     * @return the new UpdateFlowLogCollectorOptions instance
     */
    public UpdateFlowLogCollectorOptions build() {
      return new UpdateFlowLogCollectorOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateFlowLogCollectorOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the flowLogCollectorPatch.
     *
     * @param flowLogCollectorPatch the flowLogCollectorPatch
     * @return the UpdateFlowLogCollectorOptions builder
     */
    public Builder flowLogCollectorPatch(Map<String, Object> flowLogCollectorPatch) {
      this.flowLogCollectorPatch = flowLogCollectorPatch;
      return this;
    }
  }

  protected UpdateFlowLogCollectorOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.flowLogCollectorPatch,
      "flowLogCollectorPatch cannot be null");
    id = builder.id;
    flowLogCollectorPatch = builder.flowLogCollectorPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateFlowLogCollectorOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The flow log collector identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the flowLogCollectorPatch.
   *
   * The flow log collector patch.
   *
   * @return the flowLogCollectorPatch
   */
  public Map<String, Object> flowLogCollectorPatch() {
    return flowLogCollectorPatch;
  }
}

