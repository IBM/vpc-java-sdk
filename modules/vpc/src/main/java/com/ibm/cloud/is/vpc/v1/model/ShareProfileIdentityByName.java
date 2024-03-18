/*
 * (C) Copyright IBM Corp. 2022, 2023, 2024.
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
 * ShareProfileIdentityByName.
 */
public class ShareProfileIdentityByName extends ShareProfileIdentity {


  /**
   * Builder.
   */
  public static class Builder {
    private String name;

    /**
     * Instantiates a new Builder from an existing ShareProfileIdentityByName instance.
     *
     * @param shareProfileIdentityByName the instance to initialize the Builder with
     */
    public Builder(ShareProfileIdentity shareProfileIdentityByName) {
      this.name = shareProfileIdentityByName.name;
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
     * Builds a ShareProfileIdentityByName.
     *
     * @return the new ShareProfileIdentityByName instance
     */
    public ShareProfileIdentityByName build() {
      return new ShareProfileIdentityByName(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ShareProfileIdentityByName builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected ShareProfileIdentityByName() { }

  protected ShareProfileIdentityByName(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a ShareProfileIdentityByName builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

