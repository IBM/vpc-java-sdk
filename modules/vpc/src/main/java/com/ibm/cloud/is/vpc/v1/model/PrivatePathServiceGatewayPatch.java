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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * PrivatePathServiceGatewayPatch.
 */
public class PrivatePathServiceGatewayPatch extends GenericModel {

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

  @SerializedName("default_access_policy")
  protected String defaultAccessPolicy;
  @SerializedName("load_balancer")
  protected LoadBalancerIdentity loadBalancer;
  protected String name;
  @SerializedName("zonal_affinity")
  protected Boolean zonalAffinity;

  /**
   * Builder.
   */
  public static class Builder {
    private String defaultAccessPolicy;
    private LoadBalancerIdentity loadBalancer;
    private String name;
    private Boolean zonalAffinity;

    /**
     * Instantiates a new Builder from an existing PrivatePathServiceGatewayPatch instance.
     *
     * @param privatePathServiceGatewayPatch the instance to initialize the Builder with
     */
    private Builder(PrivatePathServiceGatewayPatch privatePathServiceGatewayPatch) {
      this.defaultAccessPolicy = privatePathServiceGatewayPatch.defaultAccessPolicy;
      this.loadBalancer = privatePathServiceGatewayPatch.loadBalancer;
      this.name = privatePathServiceGatewayPatch.name;
      this.zonalAffinity = privatePathServiceGatewayPatch.zonalAffinity;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PrivatePathServiceGatewayPatch.
     *
     * @return the new PrivatePathServiceGatewayPatch instance
     */
    public PrivatePathServiceGatewayPatch build() {
      return new PrivatePathServiceGatewayPatch(this);
    }

    /**
     * Set the defaultAccessPolicy.
     *
     * @param defaultAccessPolicy the defaultAccessPolicy
     * @return the PrivatePathServiceGatewayPatch builder
     */
    public Builder defaultAccessPolicy(String defaultAccessPolicy) {
      this.defaultAccessPolicy = defaultAccessPolicy;
      return this;
    }

    /**
     * Set the loadBalancer.
     *
     * @param loadBalancer the loadBalancer
     * @return the PrivatePathServiceGatewayPatch builder
     */
    public Builder loadBalancer(LoadBalancerIdentity loadBalancer) {
      this.loadBalancer = loadBalancer;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the PrivatePathServiceGatewayPatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the zonalAffinity.
     *
     * @param zonalAffinity the zonalAffinity
     * @return the PrivatePathServiceGatewayPatch builder
     */
    public Builder zonalAffinity(Boolean zonalAffinity) {
      this.zonalAffinity = zonalAffinity;
      return this;
    }
  }

  protected PrivatePathServiceGatewayPatch() { }

  protected PrivatePathServiceGatewayPatch(Builder builder) {
    defaultAccessPolicy = builder.defaultAccessPolicy;
    loadBalancer = builder.loadBalancer;
    name = builder.name;
    zonalAffinity = builder.zonalAffinity;
  }

  /**
   * New builder.
   *
   * @return a PrivatePathServiceGatewayPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
   * Gets the loadBalancer.
   *
   * The load balancer for this private path service gateway. The load balancer must
   * have `is_private_path` set to `true`, and must be in the same VPC as the private
   * path service gateway.
   *
   * @return the loadBalancer
   */
  public LoadBalancerIdentity loadBalancer() {
    return loadBalancer;
  }

  /**
   * Gets the name.
   *
   * The name for this private path service gateway. The name must not be used by another private path service gateway
   * in the VPC.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the zonalAffinity.
   *
   * Updating the value of `zonal_affinity` changes how traffic for existing and future endpoint gateway bindings will
   * be routed:
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

  /**
   * Construct a JSON merge-patch from the PrivatePathServiceGatewayPatch.
   *
   * Note that properties of the PrivatePathServiceGatewayPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the PrivatePathServiceGatewayPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

