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

/**
 * The cluster network interface for this target.
 */
public class InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceInstanceClusterNetworkInterfacePrototypeInstanceClusterNetworkAttachment extends InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterface {


  /**
   * Builder.
   */
  public static class Builder {
    private Boolean autoDelete;
    private String name;
    private ClusterNetworkInterfacePrimaryIPPrototype primaryIp;
    private ClusterNetworkSubnetIdentity subnet;

    /**
     * Instantiates a new Builder from an existing InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceInstanceClusterNetworkInterfacePrototypeInstanceClusterNetworkAttachment instance.
     *
     * @param instanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceInstanceClusterNetworkInterfacePrototypeInstanceClusterNetworkAttachment the instance to initialize the Builder with
     */
    public Builder(InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterface instanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceInstanceClusterNetworkInterfacePrototypeInstanceClusterNetworkAttachment) {
      this.autoDelete = instanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceInstanceClusterNetworkInterfacePrototypeInstanceClusterNetworkAttachment.autoDelete;
      this.name = instanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceInstanceClusterNetworkInterfacePrototypeInstanceClusterNetworkAttachment.name;
      this.primaryIp = instanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceInstanceClusterNetworkInterfacePrototypeInstanceClusterNetworkAttachment.primaryIp;
      this.subnet = instanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceInstanceClusterNetworkInterfacePrototypeInstanceClusterNetworkAttachment.subnet;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceInstanceClusterNetworkInterfacePrototypeInstanceClusterNetworkAttachment.
     *
     * @return the new InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceInstanceClusterNetworkInterfacePrototypeInstanceClusterNetworkAttachment instance
     */
    public InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceInstanceClusterNetworkInterfacePrototypeInstanceClusterNetworkAttachment build() {
      return new InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceInstanceClusterNetworkInterfacePrototypeInstanceClusterNetworkAttachment(this);
    }

    /**
     * Set the autoDelete.
     *
     * @param autoDelete the autoDelete
     * @return the InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceInstanceClusterNetworkInterfacePrototypeInstanceClusterNetworkAttachment builder
     */
    public Builder autoDelete(Boolean autoDelete) {
      this.autoDelete = autoDelete;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceInstanceClusterNetworkInterfacePrototypeInstanceClusterNetworkAttachment builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the primaryIp.
     *
     * @param primaryIp the primaryIp
     * @return the InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceInstanceClusterNetworkInterfacePrototypeInstanceClusterNetworkAttachment builder
     */
    public Builder primaryIp(ClusterNetworkInterfacePrimaryIPPrototype primaryIp) {
      this.primaryIp = primaryIp;
      return this;
    }

    /**
     * Set the subnet.
     *
     * @param subnet the subnet
     * @return the InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceInstanceClusterNetworkInterfacePrototypeInstanceClusterNetworkAttachment builder
     */
    public Builder subnet(ClusterNetworkSubnetIdentity subnet) {
      this.subnet = subnet;
      return this;
    }
  }

  protected InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceInstanceClusterNetworkInterfacePrototypeInstanceClusterNetworkAttachment() { }

  protected InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceInstanceClusterNetworkInterfacePrototypeInstanceClusterNetworkAttachment(Builder builder) {
    autoDelete = builder.autoDelete;
    name = builder.name;
    primaryIp = builder.primaryIp;
    subnet = builder.subnet;
  }

  /**
   * New builder.
   *
   * @return a InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceInstanceClusterNetworkInterfacePrototypeInstanceClusterNetworkAttachment builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

