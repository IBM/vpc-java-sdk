/*
 * (C) Copyright IBM Corp. 2023, 2024, 2025.
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
 * CloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByName.
 */
public class CloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByName extends CloudObjectStorageBucketIdentity {


  /**
   * Builder.
   */
  public static class Builder {
    private String name;

    /**
     * Instantiates a new Builder from an existing CloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByName instance.
     *
     * @param cloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByName the instance to initialize the Builder with
     */
    public Builder(CloudObjectStorageBucketIdentity cloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByName) {
      this.name = cloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByName.name;
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
     * Builds a CloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByName.
     *
     * @return the new CloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByName instance
     */
    public CloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByName build() {
      return new CloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByName(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByName builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected CloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByName() { }

  protected CloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByName(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a CloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByName builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

