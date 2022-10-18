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
 * The createInstanceAction options.
 */
public class CreateInstanceActionOptions extends GenericModel {

  /**
   * The type of action.
   */
  public interface Type {
    /** reboot. */
    String REBOOT = "reboot";
    /** start. */
    String START = "start";
    /** stop. */
    String STOP = "stop";
  }

  protected String instanceId;
  protected String type;
  protected Boolean force;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String type;
    private Boolean force;

    /**
     * Instantiates a new Builder from an existing CreateInstanceActionOptions instance.
     *
     * @param createInstanceActionOptions the instance to initialize the Builder with
     */
    private Builder(CreateInstanceActionOptions createInstanceActionOptions) {
      this.instanceId = createInstanceActionOptions.instanceId;
      this.type = createInstanceActionOptions.type;
      this.force = createInstanceActionOptions.force;
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
     * @param type the type
     */
    public Builder(String instanceId, String type) {
      this.instanceId = instanceId;
      this.type = type;
    }

    /**
     * Builds a CreateInstanceActionOptions.
     *
     * @return the new CreateInstanceActionOptions instance
     */
    public CreateInstanceActionOptions build() {
      return new CreateInstanceActionOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the CreateInstanceActionOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the CreateInstanceActionOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the force.
     *
     * @param force the force
     * @return the CreateInstanceActionOptions builder
     */
    public Builder force(Boolean force) {
      this.force = force;
      return this;
    }
  }

  protected CreateInstanceActionOptions() { }

  protected CreateInstanceActionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    instanceId = builder.instanceId;
    type = builder.type;
    force = builder.force;
  }

  /**
   * New builder.
   *
   * @return a CreateInstanceActionOptions builder
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
   * Gets the type.
   *
   * The type of action.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the force.
   *
   * If set to true, the action will be forced immediately, and all queued actions deleted. Ignored for the start
   * action.
   *
   * @return the force
   */
  public Boolean force() {
    return force;
  }
}

