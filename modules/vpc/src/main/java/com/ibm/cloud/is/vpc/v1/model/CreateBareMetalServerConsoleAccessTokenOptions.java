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
 * The createBareMetalServerConsoleAccessToken options.
 */
public class CreateBareMetalServerConsoleAccessTokenOptions extends GenericModel {

  /**
   * The bare metal server console type for which this token may be used.
   */
  public interface ConsoleType {
    /** serial. */
    String SERIAL = "serial";
    /** vnc. */
    String VNC = "vnc";
  }

  protected String bareMetalServerId;
  protected String consoleType;
  protected Boolean force;

  /**
   * Builder.
   */
  public static class Builder {
    private String bareMetalServerId;
    private String consoleType;
    private Boolean force;

    private Builder(CreateBareMetalServerConsoleAccessTokenOptions createBareMetalServerConsoleAccessTokenOptions) {
      this.bareMetalServerId = createBareMetalServerConsoleAccessTokenOptions.bareMetalServerId;
      this.consoleType = createBareMetalServerConsoleAccessTokenOptions.consoleType;
      this.force = createBareMetalServerConsoleAccessTokenOptions.force;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param bareMetalServerId the bareMetalServerId
     * @param consoleType the consoleType
     */
    public Builder(String bareMetalServerId, String consoleType) {
      this.bareMetalServerId = bareMetalServerId;
      this.consoleType = consoleType;
    }

    /**
     * Builds a CreateBareMetalServerConsoleAccessTokenOptions.
     *
     * @return the new CreateBareMetalServerConsoleAccessTokenOptions instance
     */
    public CreateBareMetalServerConsoleAccessTokenOptions build() {
      return new CreateBareMetalServerConsoleAccessTokenOptions(this);
    }

    /**
     * Set the bareMetalServerId.
     *
     * @param bareMetalServerId the bareMetalServerId
     * @return the CreateBareMetalServerConsoleAccessTokenOptions builder
     */
    public Builder bareMetalServerId(String bareMetalServerId) {
      this.bareMetalServerId = bareMetalServerId;
      return this;
    }

    /**
     * Set the consoleType.
     *
     * @param consoleType the consoleType
     * @return the CreateBareMetalServerConsoleAccessTokenOptions builder
     */
    public Builder consoleType(String consoleType) {
      this.consoleType = consoleType;
      return this;
    }

    /**
     * Set the force.
     *
     * @param force the force
     * @return the CreateBareMetalServerConsoleAccessTokenOptions builder
     */
    public Builder force(Boolean force) {
      this.force = force;
      return this;
    }
  }

  protected CreateBareMetalServerConsoleAccessTokenOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.bareMetalServerId,
      "bareMetalServerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.consoleType,
      "consoleType cannot be null");
    bareMetalServerId = builder.bareMetalServerId;
    consoleType = builder.consoleType;
    force = builder.force;
  }

  /**
   * New builder.
   *
   * @return a CreateBareMetalServerConsoleAccessTokenOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the bareMetalServerId.
   *
   * The bare metal server identifier.
   *
   * @return the bareMetalServerId
   */
  public String bareMetalServerId() {
    return bareMetalServerId;
  }

  /**
   * Gets the consoleType.
   *
   * The bare metal server console type for which this token may be used.
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

