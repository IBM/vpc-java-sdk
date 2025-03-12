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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listEndpointGateways options.
 */
public class ListEndpointGatewaysOptions extends GenericModel {

  public interface LifecycleState {
    /** deleting. */
    String DELETING = "deleting";
    /** failed. */
    String FAILED = "failed";
    /** pending. */
    String PENDING = "pending";
    /** stable. */
    String STABLE = "stable";
    /** suspended. */
    String SUSPENDED = "suspended";
    /** updating. */
    String UPDATING = "updating";
    /** waiting. */
    String WAITING = "waiting";
  }

  protected String name;
  protected String start;
  protected Long limit;
  protected String resourceGroupId;
  protected List<String> lifecycleState;
  protected String vpcId;
  protected String vpcCrn;
  protected String vpcName;
  protected Boolean allowDnsResolutionBinding;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String start;
    private Long limit;
    private String resourceGroupId;
    private List<String> lifecycleState;
    private String vpcId;
    private String vpcCrn;
    private String vpcName;
    private Boolean allowDnsResolutionBinding;

    /**
     * Instantiates a new Builder from an existing ListEndpointGatewaysOptions instance.
     *
     * @param listEndpointGatewaysOptions the instance to initialize the Builder with
     */
    private Builder(ListEndpointGatewaysOptions listEndpointGatewaysOptions) {
      this.name = listEndpointGatewaysOptions.name;
      this.start = listEndpointGatewaysOptions.start;
      this.limit = listEndpointGatewaysOptions.limit;
      this.resourceGroupId = listEndpointGatewaysOptions.resourceGroupId;
      this.lifecycleState = listEndpointGatewaysOptions.lifecycleState;
      this.vpcId = listEndpointGatewaysOptions.vpcId;
      this.vpcCrn = listEndpointGatewaysOptions.vpcCrn;
      this.vpcName = listEndpointGatewaysOptions.vpcName;
      this.allowDnsResolutionBinding = listEndpointGatewaysOptions.allowDnsResolutionBinding;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListEndpointGatewaysOptions.
     *
     * @return the new ListEndpointGatewaysOptions instance
     */
    public ListEndpointGatewaysOptions build() {
      return new ListEndpointGatewaysOptions(this);
    }

    /**
     * Adds a new element to lifecycleState.
     *
     * @param lifecycleState the new element to be added
     * @return the ListEndpointGatewaysOptions builder
     */
    public Builder addLifecycleState(String lifecycleState) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(lifecycleState,
        "lifecycleState cannot be null");
      if (this.lifecycleState == null) {
        this.lifecycleState = new ArrayList<String>();
      }
      this.lifecycleState.add(lifecycleState);
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ListEndpointGatewaysOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListEndpointGatewaysOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListEndpointGatewaysOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the resourceGroupId.
     *
     * @param resourceGroupId the resourceGroupId
     * @return the ListEndpointGatewaysOptions builder
     */
    public Builder resourceGroupId(String resourceGroupId) {
      this.resourceGroupId = resourceGroupId;
      return this;
    }

    /**
     * Set the lifecycleState.
     * Existing lifecycleState will be replaced.
     *
     * @param lifecycleState the lifecycleState
     * @return the ListEndpointGatewaysOptions builder
     */
    public Builder lifecycleState(List<String> lifecycleState) {
      this.lifecycleState = lifecycleState;
      return this;
    }

    /**
     * Set the vpcId.
     *
     * @param vpcId the vpcId
     * @return the ListEndpointGatewaysOptions builder
     */
    public Builder vpcId(String vpcId) {
      this.vpcId = vpcId;
      return this;
    }

    /**
     * Set the vpcCrn.
     *
     * @param vpcCrn the vpcCrn
     * @return the ListEndpointGatewaysOptions builder
     */
    public Builder vpcCrn(String vpcCrn) {
      this.vpcCrn = vpcCrn;
      return this;
    }

    /**
     * Set the vpcName.
     *
     * @param vpcName the vpcName
     * @return the ListEndpointGatewaysOptions builder
     */
    public Builder vpcName(String vpcName) {
      this.vpcName = vpcName;
      return this;
    }

    /**
     * Set the allowDnsResolutionBinding.
     *
     * @param allowDnsResolutionBinding the allowDnsResolutionBinding
     * @return the ListEndpointGatewaysOptions builder
     */
    public Builder allowDnsResolutionBinding(Boolean allowDnsResolutionBinding) {
      this.allowDnsResolutionBinding = allowDnsResolutionBinding;
      return this;
    }
  }

  protected ListEndpointGatewaysOptions() { }

  protected ListEndpointGatewaysOptions(Builder builder) {
    name = builder.name;
    start = builder.start;
    limit = builder.limit;
    resourceGroupId = builder.resourceGroupId;
    lifecycleState = builder.lifecycleState;
    vpcId = builder.vpcId;
    vpcCrn = builder.vpcCrn;
    vpcName = builder.vpcName;
    allowDnsResolutionBinding = builder.allowDnsResolutionBinding;
  }

  /**
   * New builder.
   *
   * @return a ListEndpointGatewaysOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Filters the collection to resources with a `name` property matching the exact specified name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the start.
   *
   * A server-provided token determining what resource to start the page on.
   *
   * @return the start
   */
  public String start() {
    return start;
  }

  /**
   * Gets the limit.
   *
   * The number of resources to return on a page.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }

  /**
   * Gets the resourceGroupId.
   *
   * Filters the collection to resources with a `resource_group.id` property matching the specified identifier.
   *
   * @return the resourceGroupId
   */
  public String resourceGroupId() {
    return resourceGroupId;
  }

  /**
   * Gets the lifecycleState.
   *
   * Filters the collection to resources with a `lifecycle_state` property matching one of the specified comma-separated
   * values.
   *
   * @return the lifecycleState
   */
  public List<String> lifecycleState() {
    return lifecycleState;
  }

  /**
   * Gets the vpcId.
   *
   * Filters the collection to resources with a `vpc.id` property matching the specified identifier.
   *
   * @return the vpcId
   */
  public String vpcId() {
    return vpcId;
  }

  /**
   * Gets the vpcCrn.
   *
   * Filters the collection to resources with a `vpc.crn` property matching the specified CRN.
   *
   * @return the vpcCrn
   */
  public String vpcCrn() {
    return vpcCrn;
  }

  /**
   * Gets the vpcName.
   *
   * Filters the collection to resources with a `vpc.name` property matching the exact specified name.
   *
   * @return the vpcName
   */
  public String vpcName() {
    return vpcName;
  }

  /**
   * Gets the allowDnsResolutionBinding.
   *
   * Filters the collection to endpoint gateways with an `allow_dns_resolution_binding` property matching the specified
   * value.
   *
   * @return the allowDnsResolutionBinding
   */
  public Boolean allowDnsResolutionBinding() {
    return allowDnsResolutionBinding;
  }
}

