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
 * The createNetworkAcl options.
 */
public class CreateNetworkAclOptions extends GenericModel {

  protected NetworkACLPrototype networkAclPrototype;

  /**
   * Builder.
   */
  public static class Builder {
    private NetworkACLPrototype networkAclPrototype;

    /**
     * Instantiates a new Builder from an existing CreateNetworkAclOptions instance.
     *
     * @param createNetworkAclOptions the instance to initialize the Builder with
     */
    private Builder(CreateNetworkAclOptions createNetworkAclOptions) {
      this.networkAclPrototype = createNetworkAclOptions.networkAclPrototype;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateNetworkAclOptions.
     *
     * @return the new CreateNetworkAclOptions instance
     */
    public CreateNetworkAclOptions build() {
      return new CreateNetworkAclOptions(this);
    }

    /**
     * Set the networkAclPrototype.
     *
     * @param networkAclPrototype the networkAclPrototype
     * @return the CreateNetworkAclOptions builder
     */
    public Builder networkAclPrototype(NetworkACLPrototype networkAclPrototype) {
      this.networkAclPrototype = networkAclPrototype;
      return this;
    }
  }

  protected CreateNetworkAclOptions() { }

  protected CreateNetworkAclOptions(Builder builder) {
    networkAclPrototype = builder.networkAclPrototype;
  }

  /**
   * New builder.
   *
   * @return a CreateNetworkAclOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the networkAclPrototype.
   *
   * The network ACL prototype object.
   *
   * @return the networkAclPrototype
   */
  public NetworkACLPrototype networkAclPrototype() {
    return networkAclPrototype;
  }
}

