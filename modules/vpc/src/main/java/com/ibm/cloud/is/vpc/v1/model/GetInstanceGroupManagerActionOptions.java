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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getInstanceGroupManagerAction options.
 */
public class GetInstanceGroupManagerActionOptions extends GenericModel {

  protected String instanceGroupId;
  protected String instanceGroupManagerId;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceGroupId;
    private String instanceGroupManagerId;
    private String id;

    private Builder(GetInstanceGroupManagerActionOptions getInstanceGroupManagerActionOptions) {
      this.instanceGroupId = getInstanceGroupManagerActionOptions.instanceGroupId;
      this.instanceGroupManagerId = getInstanceGroupManagerActionOptions.instanceGroupManagerId;
      this.id = getInstanceGroupManagerActionOptions.id;
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
     * Builds a GetInstanceGroupManagerActionOptions.
     *
     * @return the new GetInstanceGroupManagerActionOptions instance
     */
    public GetInstanceGroupManagerActionOptions build() {
      return new GetInstanceGroupManagerActionOptions(this);
    }

    /**
     * Set the instanceGroupId.
     *
     * @param instanceGroupId the instanceGroupId
     * @return the GetInstanceGroupManagerActionOptions builder
     */
    public Builder instanceGroupId(String instanceGroupId) {
      this.instanceGroupId = instanceGroupId;
      return this;
    }

    /**
     * Set the instanceGroupManagerId.
     *
     * @param instanceGroupManagerId the instanceGroupManagerId
     * @return the GetInstanceGroupManagerActionOptions builder
     */
    public Builder instanceGroupManagerId(String instanceGroupManagerId) {
      this.instanceGroupManagerId = instanceGroupManagerId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetInstanceGroupManagerActionOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected GetInstanceGroupManagerActionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceGroupId,
      "instanceGroupId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceGroupManagerId,
      "instanceGroupManagerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    instanceGroupId = builder.instanceGroupId;
    instanceGroupManagerId = builder.instanceGroupManagerId;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a GetInstanceGroupManagerActionOptions builder
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
   * The instance group manager action identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

