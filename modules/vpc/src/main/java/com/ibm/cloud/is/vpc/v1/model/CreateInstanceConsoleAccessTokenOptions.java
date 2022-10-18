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
 * The createInstanceConsoleAccessToken options.
 */
public class CreateInstanceConsoleAccessTokenOptions extends GenericModel {

  /**
   * The instance console type for which this token may be used.
   */
  public interface ConsoleType {
    /** serial. */
    String SERIAL = "serial";
    /** vnc. */
    String VNC = "vnc";
  }

  protected String instanceId;
  protected String consoleType;
  protected Boolean force;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String consoleType;
    private Boolean force;

    /**
     * Instantiates a new Builder from an existing CreateInstanceConsoleAccessTokenOptions instance.
     *
     * @param createInstanceConsoleAccessTokenOptions the instance to initialize the Builder with
     */
    private Builder(CreateInstanceConsoleAccessTokenOptions createInstanceConsoleAccessTokenOptions) {
      this.instanceId = createInstanceConsoleAccessTokenOptions.instanceId;
      this.consoleType = createInstanceConsoleAccessTokenOptions.consoleType;
      this.force = createInstanceConsoleAccessTokenOptions.force;
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
     * @param consoleType the consoleType
     */
    public Builder(String instanceId, String consoleType) {
      this.instanceId = instanceId;
      this.consoleType = consoleType;
    }

    /**
     * Builds a CreateInstanceConsoleAccessTokenOptions.
     *
     * @return the new CreateInstanceConsoleAccessTokenOptions instance
     */
    public CreateInstanceConsoleAccessTokenOptions build() {
      return new CreateInstanceConsoleAccessTokenOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the CreateInstanceConsoleAccessTokenOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the consoleType.
     *
     * @param consoleType the consoleType
     * @return the CreateInstanceConsoleAccessTokenOptions builder
     */
    public Builder consoleType(String consoleType) {
      this.consoleType = consoleType;
      return this;
    }

    /**
     * Set the force.
     *
     * @param force the force
     * @return the CreateInstanceConsoleAccessTokenOptions builder
     */
    public Builder force(Boolean force) {
      this.force = force;
      return this;
    }
  }

  protected CreateInstanceConsoleAccessTokenOptions() { }

  protected CreateInstanceConsoleAccessTokenOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.consoleType,
      "consoleType cannot be null");
    instanceId = builder.instanceId;
    consoleType = builder.consoleType;
    force = builder.force;
  }

  /**
   * New builder.
   *
   * @return a CreateInstanceConsoleAccessTokenOptions builder
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
   * Gets the consoleType.
   *
   * The instance console type for which this token may be used.
   *
   * @return the consoleType
   */
  public String consoleType() {
    return consoleType;
  }

  /**
   * Gets the force.
   *
   * Indicates whether to disconnect an existing serial console session as the serial console cannot be shared.  This
   * has no effect on VNC consoles.
   *
   * @return the force
   */
  public Boolean force() {
    return force;
  }
}

