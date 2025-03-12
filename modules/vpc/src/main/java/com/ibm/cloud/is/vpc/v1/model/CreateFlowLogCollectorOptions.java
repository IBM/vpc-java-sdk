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
 * The createFlowLogCollector options.
 */
public class CreateFlowLogCollectorOptions extends GenericModel {

  protected LegacyCloudObjectStorageBucketIdentity storageBucket;
  protected FlowLogCollectorTargetPrototype target;
  protected Boolean active;
  protected String name;
  protected ResourceGroupIdentity resourceGroup;

  /**
   * Builder.
   */
  public static class Builder {
    private LegacyCloudObjectStorageBucketIdentity storageBucket;
    private FlowLogCollectorTargetPrototype target;
    private Boolean active;
    private String name;
    private ResourceGroupIdentity resourceGroup;

    /**
     * Instantiates a new Builder from an existing CreateFlowLogCollectorOptions instance.
     *
     * @param createFlowLogCollectorOptions the instance to initialize the Builder with
     */
    private Builder(CreateFlowLogCollectorOptions createFlowLogCollectorOptions) {
      this.storageBucket = createFlowLogCollectorOptions.storageBucket;
      this.target = createFlowLogCollectorOptions.target;
      this.active = createFlowLogCollectorOptions.active;
      this.name = createFlowLogCollectorOptions.name;
      this.resourceGroup = createFlowLogCollectorOptions.resourceGroup;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param storageBucket the storageBucket
     * @param target the target
     */
    public Builder(LegacyCloudObjectStorageBucketIdentity storageBucket, FlowLogCollectorTargetPrototype target) {
      this.storageBucket = storageBucket;
      this.target = target;
    }

    /**
     * Builds a CreateFlowLogCollectorOptions.
     *
     * @return the new CreateFlowLogCollectorOptions instance
     */
    public CreateFlowLogCollectorOptions build() {
      return new CreateFlowLogCollectorOptions(this);
    }

    /**
     * Set the storageBucket.
     *
     * @param storageBucket the storageBucket
     * @return the CreateFlowLogCollectorOptions builder
     */
    public Builder storageBucket(LegacyCloudObjectStorageBucketIdentity storageBucket) {
      this.storageBucket = storageBucket;
      return this;
    }

    /**
     * Set the target.
     *
     * @param target the target
     * @return the CreateFlowLogCollectorOptions builder
     */
    public Builder target(FlowLogCollectorTargetPrototype target) {
      this.target = target;
      return this;
    }

    /**
     * Set the active.
     *
     * @param active the active
     * @return the CreateFlowLogCollectorOptions builder
     */
    public Builder active(Boolean active) {
      this.active = active;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateFlowLogCollectorOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the CreateFlowLogCollectorOptions builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }
  }

  protected CreateFlowLogCollectorOptions() { }

  protected CreateFlowLogCollectorOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.storageBucket,
      "storageBucket cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.target,
      "target cannot be null");
    storageBucket = builder.storageBucket;
    target = builder.target;
    active = builder.active;
    name = builder.name;
    resourceGroup = builder.resourceGroup;
  }

  /**
   * New builder.
   *
   * @return a CreateFlowLogCollectorOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the storageBucket.
   *
   * The Cloud Object Storage bucket where the collected flows will be logged.
   * The bucket must exist and an IAM service authorization must grant
   * `IBM Cloud Flow Logs` resources of `VPC Infrastructure Services` writer
   * access to the bucket. For more information, see [Creating a flow log
   * collector](https://cloud.ibm.com/docs/vpc?topic=vpc-ordering-flow-log-collector).
   *
   * @return the storageBucket
   */
  public LegacyCloudObjectStorageBucketIdentity storageBucket() {
    return storageBucket;
  }

  /**
   * Gets the target.
   *
   * The target this collector will collect flow logs for.
   *
   * If the target is an instance, subnet, or VPC, flow logs will not be collected for any
   * instance network attachments, virtual network interfaces or instance network interfaces
   * within the target that are themselves the target of a more specific flow log collector.
   *
   * The target must not be a virtual network interface that is attached to a bare metal server
   * network attachment or to a file share mount target.
   *
   * @return the target
   */
  public FlowLogCollectorTargetPrototype target() {
    return target;
  }

  /**
   * Gets the active.
   *
   * Indicates whether this collector will be active upon creation.
   *
   * @return the active
   */
  public Boolean active() {
    return active;
  }

  /**
   * Gets the name.
   *
   * The name for this flow log collector. The name must not be used by another flow log collector in the VPC. If
   * unspecified, the name will be a hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group to use. If unspecified, the account's [default resource
   * group](https://cloud.ibm.com/apidocs/resource-manager#introduction) will be used.
   *
   * @return the resourceGroup
   */
  public ResourceGroupIdentity resourceGroup() {
    return resourceGroup;
  }
}

