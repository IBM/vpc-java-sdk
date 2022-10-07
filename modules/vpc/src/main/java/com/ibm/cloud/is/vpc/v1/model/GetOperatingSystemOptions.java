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
 * The getOperatingSystem options.
 */
public class GetOperatingSystemOptions extends GenericModel {

  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;

    /**
     * Instantiates a new Builder from an existing GetOperatingSystemOptions instance.
     *
     * @param getOperatingSystemOptions the instance to initialize the Builder with
     */
    private Builder(GetOperatingSystemOptions getOperatingSystemOptions) {
      this.name = getOperatingSystemOptions.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param name the name
     */
    public Builder(String name) {
      this.name = name;
    }

    /**
     * Builds a GetOperatingSystemOptions.
     *
     * @return the new GetOperatingSystemOptions instance
     */
    public GetOperatingSystemOptions build() {
      return new GetOperatingSystemOptions(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the GetOperatingSystemOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected GetOperatingSystemOptions() { }

  protected GetOperatingSystemOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.name,
      "name cannot be empty");
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a GetOperatingSystemOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * The operating system name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }
}

