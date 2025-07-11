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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createClusterNetworkAttachment options.
 */
public class CreateClusterNetworkAttachmentOptions extends GenericModel {

  protected String instanceId;
  protected InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterface clusterNetworkInterface;
  protected InstanceClusterNetworkAttachmentBeforePrototype before;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterface clusterNetworkInterface;
    private InstanceClusterNetworkAttachmentBeforePrototype before;
    private String name;

    /**
     * Instantiates a new Builder from an existing CreateClusterNetworkAttachmentOptions instance.
     *
     * @param createClusterNetworkAttachmentOptions the instance to initialize the Builder with
     */
    private Builder(CreateClusterNetworkAttachmentOptions createClusterNetworkAttachmentOptions) {
      this.instanceId = createClusterNetworkAttachmentOptions.instanceId;
      this.clusterNetworkInterface = createClusterNetworkAttachmentOptions.clusterNetworkInterface;
      this.before = createClusterNetworkAttachmentOptions.before;
      this.name = createClusterNetworkAttachmentOptions.name;
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
     * @param clusterNetworkInterface the clusterNetworkInterface
     */
    public Builder(String instanceId, InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterface clusterNetworkInterface) {
      this.instanceId = instanceId;
      this.clusterNetworkInterface = clusterNetworkInterface;
    }

    /**
     * Builds a CreateClusterNetworkAttachmentOptions.
     *
     * @return the new CreateClusterNetworkAttachmentOptions instance
     */
    public CreateClusterNetworkAttachmentOptions build() {
      return new CreateClusterNetworkAttachmentOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the CreateClusterNetworkAttachmentOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the clusterNetworkInterface.
     *
     * @param clusterNetworkInterface the clusterNetworkInterface
     * @return the CreateClusterNetworkAttachmentOptions builder
     */
    public Builder clusterNetworkInterface(InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterface clusterNetworkInterface) {
      this.clusterNetworkInterface = clusterNetworkInterface;
      return this;
    }

    /**
     * Set the before.
     *
     * @param before the before
     * @return the CreateClusterNetworkAttachmentOptions builder
     */
    public Builder before(InstanceClusterNetworkAttachmentBeforePrototype before) {
      this.before = before;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateClusterNetworkAttachmentOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected CreateClusterNetworkAttachmentOptions() { }

  protected CreateClusterNetworkAttachmentOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.clusterNetworkInterface,
      "clusterNetworkInterface cannot be null");
    instanceId = builder.instanceId;
    clusterNetworkInterface = builder.clusterNetworkInterface;
    before = builder.before;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a CreateClusterNetworkAttachmentOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the instanceId.
   *
   * The virtual server instance identifier.
   *
   * @return the instanceId
   */
  public String instanceId() {
    return instanceId;
  }

  /**
   * Gets the clusterNetworkInterface.
   *
   * A cluster network interface for the instance cluster network attachment. This can be
   * specified using an existing cluster network interface that does not already have a
   * `target`, or a prototype object for a new cluster network interface.
   *
   * This instance must reside in the same VPC as the specified cluster network interface. The
   * cluster network interface must reside in the same cluster network as the
   * `cluster_network_interface` of any other `cluster_network_attachments` for this instance.
   *
   * @return the clusterNetworkInterface
   */
  public InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterface clusterNetworkInterface() {
    return clusterNetworkInterface;
  }

  /**
   * Gets the before.
   *
   * The instance cluster network attachment to insert this instance cluster network attachment
   * immediately before.
   *
   * If unspecified, this instance cluster network attachment will be inserted after all
   * existing instance cluster network attachments.
   *
   * @return the before
   */
  public InstanceClusterNetworkAttachmentBeforePrototype before() {
    return before;
  }

  /**
   * Gets the name.
   *
   * The name for this cluster network attachment. Names must be unique within the instance the cluster network
   * attachment resides in. If unspecified, the name will be a hyphenated list of randomly-selected words. Names
   * starting with `ibm-` are reserved for provider-owned resources, and are not allowed.
   *
   * @return the name
   */
  public String name() {
    return name;
  }
}

