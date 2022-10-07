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
 * The updateNetworkAcl options.
 */
public class UpdateNetworkAclOptions extends GenericModel {

  protected String id;
  protected Map<String, Object> networkAclPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Map<String, Object> networkAclPatch;

    /**
     * Instantiates a new Builder from an existing UpdateNetworkAclOptions instance.
     *
     * @param updateNetworkAclOptions the instance to initialize the Builder with
     */
    private Builder(UpdateNetworkAclOptions updateNetworkAclOptions) {
      this.id = updateNetworkAclOptions.id;
      this.networkAclPatch = updateNetworkAclOptions.networkAclPatch;
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
     * @param networkAclPatch the networkAclPatch
     */
    public Builder(String id, Map<String, Object> networkAclPatch) {
      this.id = id;
      this.networkAclPatch = networkAclPatch;
    }

    /**
     * Builds a UpdateNetworkAclOptions.
     *
     * @return the new UpdateNetworkAclOptions instance
     */
    public UpdateNetworkAclOptions build() {
      return new UpdateNetworkAclOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateNetworkAclOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the networkAclPatch.
     *
     * @param networkAclPatch the networkAclPatch
     * @return the UpdateNetworkAclOptions builder
     */
    public Builder networkAclPatch(Map<String, Object> networkAclPatch) {
      this.networkAclPatch = networkAclPatch;
      return this;
    }
  }

  protected UpdateNetworkAclOptions() { }

  protected UpdateNetworkAclOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.networkAclPatch,
      "networkAclPatch cannot be null");
    id = builder.id;
    networkAclPatch = builder.networkAclPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateNetworkAclOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The network ACL identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the networkAclPatch.
   *
   * The network ACL patch.
   *
   * @return the networkAclPatch
   */
  public Map<String, Object> networkAclPatch() {
    return networkAclPatch;
  }
}

