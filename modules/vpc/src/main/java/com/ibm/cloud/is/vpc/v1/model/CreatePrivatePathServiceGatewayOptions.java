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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createPrivatePathServiceGateway options.
 */
public class CreatePrivatePathServiceGatewayOptions extends GenericModel {

  /**
   * The policy to use for bindings from accounts without an explicit account policy.
   */
  public interface DefaultAccessPolicy {
    /** deny. */
    String DENY = "deny";
    /** permit. */
    String PERMIT = "permit";
    /** review. */
    String REVIEW = "review";
  }

  protected LoadBalancerIdentity loadBalancer;
  protected List<String> serviceEndpoints;
  protected String defaultAccessPolicy;
  protected String name;
  protected ResourceGroupIdentity resourceGroup;
  protected Boolean zonalAffinity;

  /**
   * Builder.
   */
  public static class Builder {
    private LoadBalancerIdentity loadBalancer;
    private List<String> serviceEndpoints;
    private String defaultAccessPolicy;
    private String name;
    private ResourceGroupIdentity resourceGroup;
    private Boolean zonalAffinity;

    /**
     * Instantiates a new Builder from an existing CreatePrivatePathServiceGatewayOptions instance.
     *
     * @param createPrivatePathServiceGatewayOptions the instance to initialize the Builder with
     */
    private Builder(CreatePrivatePathServiceGatewayOptions createPrivatePathServiceGatewayOptions) {
      this.loadBalancer = createPrivatePathServiceGatewayOptions.loadBalancer;
      this.serviceEndpoints = createPrivatePathServiceGatewayOptions.serviceEndpoints;
      this.defaultAccessPolicy = createPrivatePathServiceGatewayOptions.defaultAccessPolicy;
      this.name = createPrivatePathServiceGatewayOptions.name;
      this.resourceGroup = createPrivatePathServiceGatewayOptions.resourceGroup;
      this.zonalAffinity = createPrivatePathServiceGatewayOptions.zonalAffinity;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param loadBalancer the loadBalancer
     * @param serviceEndpoints the serviceEndpoints
     */
    public Builder(LoadBalancerIdentity loadBalancer, List<String> serviceEndpoints) {
      this.loadBalancer = loadBalancer;
      this.serviceEndpoints = serviceEndpoints;
    }

    /**
     * Builds a CreatePrivatePathServiceGatewayOptions.
     *
     * @return the new CreatePrivatePathServiceGatewayOptions instance
     */
    public CreatePrivatePathServiceGatewayOptions build() {
      return new CreatePrivatePathServiceGatewayOptions(this);
    }

    /**
     * Adds a new element to serviceEndpoints.
     *
     * @param serviceEndpoints the new element to be added
     * @return the CreatePrivatePathServiceGatewayOptions builder
     */
    public Builder addServiceEndpoints(String serviceEndpoints) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(serviceEndpoints,
        "serviceEndpoints cannot be null");
      if (this.serviceEndpoints == null) {
        this.serviceEndpoints = new ArrayList<String>();
      }
      this.serviceEndpoints.add(serviceEndpoints);
      return this;
    }

    /**
     * Set the loadBalancer.
     *
     * @param loadBalancer the loadBalancer
     * @return the CreatePrivatePathServiceGatewayOptions builder
     */
    public Builder loadBalancer(LoadBalancerIdentity loadBalancer) {
      this.loadBalancer = loadBalancer;
      return this;
    }

    /**
     * Set the serviceEndpoints.
     * Existing serviceEndpoints will be replaced.
     *
     * @param serviceEndpoints the serviceEndpoints
     * @return the CreatePrivatePathServiceGatewayOptions builder
     */
    public Builder serviceEndpoints(List<String> serviceEndpoints) {
      this.serviceEndpoints = serviceEndpoints;
      return this;
    }

    /**
     * Set the defaultAccessPolicy.
     *
     * @param defaultAccessPolicy the defaultAccessPolicy
     * @return the CreatePrivatePathServiceGatewayOptions builder
     */
    public Builder defaultAccessPolicy(String defaultAccessPolicy) {
      this.defaultAccessPolicy = defaultAccessPolicy;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreatePrivatePathServiceGatewayOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the CreatePrivatePathServiceGatewayOptions builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the zonalAffinity.
     *
     * @param zonalAffinity the zonalAffinity
     * @return the CreatePrivatePathServiceGatewayOptions builder
     */
    public Builder zonalAffinity(Boolean zonalAffinity) {
      this.zonalAffinity = zonalAffinity;
      return this;
    }
  }

  protected CreatePrivatePathServiceGatewayOptions() { }

  protected CreatePrivatePathServiceGatewayOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.loadBalancer,
      "loadBalancer cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.serviceEndpoints,
      "serviceEndpoints cannot be null");
    loadBalancer = builder.loadBalancer;
    serviceEndpoints = builder.serviceEndpoints;
    defaultAccessPolicy = builder.defaultAccessPolicy;
    name = builder.name;
    resourceGroup = builder.resourceGroup;
    zonalAffinity = builder.zonalAffinity;
  }

  /**
   * New builder.
   *
   * @return a CreatePrivatePathServiceGatewayOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the loadBalancer.
   *
   * The load balancer for this private path service gateway. The load balancer must
   * have `is_private_path` set to `true`.
   *
   * The private path service gateway will reside in the same VPC as the specified load
   * balancer.
   *
   * @return the loadBalancer
   */
  public LoadBalancerIdentity loadBalancer() {
    return loadBalancer;
  }

  /**
   * Gets the serviceEndpoints.
   *
   * The fully qualified domain names for this private path service gateway. Any uppercase letters will be converted to
   * lowercase.
   *
   * @return the serviceEndpoints
   */
  public List<String> serviceEndpoints() {
    return serviceEndpoints;
  }

  /**
   * Gets the defaultAccessPolicy.
   *
   * The policy to use for bindings from accounts without an explicit account policy.
   *
   * @return the defaultAccessPolicy
   */
  public String defaultAccessPolicy() {
    return defaultAccessPolicy;
  }

  /**
   * Gets the name.
   *
   * The name for this private path service gateway. The name must not be used by another private path service gateway
   * in the VPC. If unspecified, the name will be a hyphenated list of randomly-selected words.
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

  /**
   * Gets the zonalAffinity.
   *
   * Indicates whether this private path service gateway has zonal affinity.
   * - `true`:  Traffic to the service from a zone the service resides in will remain in
   *            that zone.
   * - `false`: Traffic to the service from a zone will be load balanced across all zones
   *            in the region the service resides in.
   *
   * @return the zonalAffinity
   */
  public Boolean zonalAffinity() {
    return zonalAffinity;
  }
}

