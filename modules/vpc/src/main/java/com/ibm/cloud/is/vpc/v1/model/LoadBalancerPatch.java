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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * LoadBalancerPatch.
 */
public class LoadBalancerPatch extends GenericModel {

  protected LoadBalancerLogging logging;
  protected String name;
  protected List<SubnetIdentity> subnets;

  /**
   * Builder.
   */
  public static class Builder {
    private LoadBalancerLogging logging;
    private String name;
    private List<SubnetIdentity> subnets;

    /**
     * Instantiates a new Builder from an existing LoadBalancerPatch instance.
     *
     * @param loadBalancerPatch the instance to initialize the Builder with
     */
    private Builder(LoadBalancerPatch loadBalancerPatch) {
      this.logging = loadBalancerPatch.logging;
      this.name = loadBalancerPatch.name;
      this.subnets = loadBalancerPatch.subnets;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a LoadBalancerPatch.
     *
     * @return the new LoadBalancerPatch instance
     */
    public LoadBalancerPatch build() {
      return new LoadBalancerPatch(this);
    }

    /**
     * Adds an subnets to subnets.
     *
     * @param subnets the new subnets
     * @return the LoadBalancerPatch builder
     */
    public Builder addSubnets(SubnetIdentity subnets) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(subnets,
        "subnets cannot be null");
      if (this.subnets == null) {
        this.subnets = new ArrayList<SubnetIdentity>();
      }
      this.subnets.add(subnets);
      return this;
    }

    /**
     * Set the logging.
     *
     * @param logging the logging
     * @return the LoadBalancerPatch builder
     */
    public Builder logging(LoadBalancerLogging logging) {
      this.logging = logging;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the LoadBalancerPatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the subnets.
     * Existing subnets will be replaced.
     *
     * @param subnets the subnets
     * @return the LoadBalancerPatch builder
     */
    public Builder subnets(List<SubnetIdentity> subnets) {
      this.subnets = subnets;
      return this;
    }
  }

  protected LoadBalancerPatch() { }

  protected LoadBalancerPatch(Builder builder) {
    logging = builder.logging;
    name = builder.name;
    subnets = builder.subnets;
  }

  /**
   * New builder.
   *
   * @return a LoadBalancerPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the logging.
   *
   * The logging configuration to use for this load balancer.
   *
   * To activate logging, the load balancer profile must support the specified logging type.
   *
   * @return the logging
   */
  public LoadBalancerLogging logging() {
    return logging;
  }

  /**
   * Gets the name.
   *
   * The unique user-defined name for this load balancer.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the subnets.
   *
   * The subnets to provision this load balancer in. The load balancer's availability will depend on the availability of
   * the zones that the subnets reside in.
   *
   * The specified subnets must be in the same VPC as the existing subnets, and will completely replace the existing
   * subnets.
   *
   * The load balancer must be in the `application` family.
   *
   * @return the subnets
   */
  public List<SubnetIdentity> subnets() {
    return subnets;
  }

  /**
   * Construct a JSON merge-patch from the LoadBalancerPatch.
   *
   * Note that properties of the LoadBalancerPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the LoadBalancerPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }

}

