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

/**
 * OperatingSystemIdentityByName.
 */
public class OperatingSystemIdentityByName extends OperatingSystemIdentity {


  /**
   * Builder.
   */
  public static class Builder {
    private String name;

    public Builder(OperatingSystemIdentity operatingSystemIdentityByName) {
      this.name = operatingSystemIdentityByName.name;
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
     * Builds a OperatingSystemIdentityByName.
     *
     * @return the new OperatingSystemIdentityByName instance
     */
    public OperatingSystemIdentityByName build() {
      return new OperatingSystemIdentityByName(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the OperatingSystemIdentityByName builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected OperatingSystemIdentityByName(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a OperatingSystemIdentityByName builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

