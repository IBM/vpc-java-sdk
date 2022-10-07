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
 * InstanceProfileIdentityByName.
 */
public class InstanceProfileIdentityByName extends InstanceProfileIdentity {


  /**
   * Builder.
   */
  public static class Builder {
    private String name;

    /**
     * Instantiates a new Builder from an existing InstanceProfileIdentityByName instance.
     *
     * @param instanceProfileIdentityByName the instance to initialize the Builder with
     */
    public Builder(InstanceProfileIdentity instanceProfileIdentityByName) {
      this.name = instanceProfileIdentityByName.name;
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
     * Builds a InstanceProfileIdentityByName.
     *
     * @return the new InstanceProfileIdentityByName instance
     */
    public InstanceProfileIdentityByName build() {
      return new InstanceProfileIdentityByName(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the InstanceProfileIdentityByName builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected InstanceProfileIdentityByName() { }

  protected InstanceProfileIdentityByName(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a InstanceProfileIdentityByName builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

