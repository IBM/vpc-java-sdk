/*
 * (C) Copyright IBM Corp. 2025.
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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * InstanceClusterNetworkAttachmentPrototypeInstanceContext.
 */
public class InstanceClusterNetworkAttachmentPrototypeInstanceContext extends GenericModel {

  @SerializedName("cluster_network_interface")
  protected InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterface clusterNetworkInterface;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterface clusterNetworkInterface;
    private String name;

    /**
     * Instantiates a new Builder from an existing InstanceClusterNetworkAttachmentPrototypeInstanceContext instance.
     *
     * @param instanceClusterNetworkAttachmentPrototypeInstanceContext the instance to initialize the Builder with
     */
    private Builder(InstanceClusterNetworkAttachmentPrototypeInstanceContext instanceClusterNetworkAttachmentPrototypeInstanceContext) {
      this.clusterNetworkInterface = instanceClusterNetworkAttachmentPrototypeInstanceContext.clusterNetworkInterface;
      this.name = instanceClusterNetworkAttachmentPrototypeInstanceContext.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param clusterNetworkInterface the clusterNetworkInterface
     */
    public Builder(InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterface clusterNetworkInterface) {
      this.clusterNetworkInterface = clusterNetworkInterface;
    }

    /**
     * Builds a InstanceClusterNetworkAttachmentPrototypeInstanceContext.
     *
     * @return the new InstanceClusterNetworkAttachmentPrototypeInstanceContext instance
     */
    public InstanceClusterNetworkAttachmentPrototypeInstanceContext build() {
      return new InstanceClusterNetworkAttachmentPrototypeInstanceContext(this);
    }

    /**
     * Set the clusterNetworkInterface.
     *
     * @param clusterNetworkInterface the clusterNetworkInterface
     * @return the InstanceClusterNetworkAttachmentPrototypeInstanceContext builder
     */
    public Builder clusterNetworkInterface(InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterface clusterNetworkInterface) {
      this.clusterNetworkInterface = clusterNetworkInterface;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the InstanceClusterNetworkAttachmentPrototypeInstanceContext builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected InstanceClusterNetworkAttachmentPrototypeInstanceContext() { }

  protected InstanceClusterNetworkAttachmentPrototypeInstanceContext(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.clusterNetworkInterface,
      "clusterNetworkInterface cannot be null");
    clusterNetworkInterface = builder.clusterNetworkInterface;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a InstanceClusterNetworkAttachmentPrototypeInstanceContext builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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

