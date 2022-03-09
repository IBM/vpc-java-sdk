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
 * The updateFloatingIp options.
 */
public class UpdateFloatingIpOptions extends GenericModel {

  protected String id;
  protected Map<String, Object> floatingIpPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Map<String, Object> floatingIpPatch;

    private Builder(UpdateFloatingIpOptions updateFloatingIpOptions) {
      this.id = updateFloatingIpOptions.id;
      this.floatingIpPatch = updateFloatingIpOptions.floatingIpPatch;
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
     * @param floatingIpPatch the floatingIpPatch
     */
    public Builder(String id, Map<String, Object> floatingIpPatch) {
      this.id = id;
      this.floatingIpPatch = floatingIpPatch;
    }

    /**
     * Builds a UpdateFloatingIpOptions.
     *
     * @return the new UpdateFloatingIpOptions instance
     */
    public UpdateFloatingIpOptions build() {
      return new UpdateFloatingIpOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateFloatingIpOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the floatingIpPatch.
     *
     * @param floatingIpPatch the floatingIpPatch
     * @return the UpdateFloatingIpOptions builder
     */
    public Builder floatingIpPatch(Map<String, Object> floatingIpPatch) {
      this.floatingIpPatch = floatingIpPatch;
      return this;
    }
  }

  protected UpdateFloatingIpOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.floatingIpPatch,
      "floatingIpPatch cannot be null");
    id = builder.id;
    floatingIpPatch = builder.floatingIpPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateFloatingIpOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The floating IP identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the floatingIpPatch.
   *
   * The floating IP patch.
   *
   * @return the floatingIpPatch
   */
  public Map<String, Object> floatingIpPatch() {
    return floatingIpPatch;
  }
}

