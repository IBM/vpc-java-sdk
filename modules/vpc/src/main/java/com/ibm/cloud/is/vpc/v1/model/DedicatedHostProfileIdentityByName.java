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
 * DedicatedHostProfileIdentityByName.
 */
public class DedicatedHostProfileIdentityByName extends DedicatedHostProfileIdentity {


  /**
   * Builder.
   */
  public static class Builder {
    private String name;

    /**
     * Instantiates a new Builder from an existing DedicatedHostProfileIdentityByName instance.
     *
     * @param dedicatedHostProfileIdentityByName the instance to initialize the Builder with
     */
    public Builder(DedicatedHostProfileIdentity dedicatedHostProfileIdentityByName) {
      this.name = dedicatedHostProfileIdentityByName.name;
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
     * Builds a DedicatedHostProfileIdentityByName.
     *
     * @return the new DedicatedHostProfileIdentityByName instance
     */
    public DedicatedHostProfileIdentityByName build() {
      return new DedicatedHostProfileIdentityByName(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the DedicatedHostProfileIdentityByName builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected DedicatedHostProfileIdentityByName() { }

  protected DedicatedHostProfileIdentityByName(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a DedicatedHostProfileIdentityByName builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

