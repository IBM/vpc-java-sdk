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
 * The getInstanceProfile options.
 */
public class GetInstanceProfileOptions extends GenericModel {

  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;

    private Builder(GetInstanceProfileOptions getInstanceProfileOptions) {
      this.name = getInstanceProfileOptions.name;
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
     * Builds a GetInstanceProfileOptions.
     *
     * @return the new GetInstanceProfileOptions instance
     */
    public GetInstanceProfileOptions build() {
      return new GetInstanceProfileOptions(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the GetInstanceProfileOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected GetInstanceProfileOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.name,
      "name cannot be empty");
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a GetInstanceProfileOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * The instance profile name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }
}

