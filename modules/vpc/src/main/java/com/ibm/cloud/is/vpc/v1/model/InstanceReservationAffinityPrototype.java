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
 * The reservation affinity settings for this virtual server instance. If specified,
 * `vcpu.tenancy` must be `dedicated`, and `vcpu.percentage` must be `100`.
 */
public class InstanceReservationAffinityPrototype extends GenericModel {

  /**
   * The reservation affinity policy to use for this virtual server instance:
   * - `disabled`: Reservations will not be used
   * - `manual`: Reservations in `pool` will be available for use
   * - `automatic`: Reservations with an `affinity_policy` of `automatic` that have the same
   *   `profile` and `zone` as this virtual server instance will be available for use.
   *
   * The policy will default to `manual` if `pool` is not empty. The policy will default to
   * `disabled` if a `placement_target` is set. The policy will default to `automatic` in all other cases.
   *
   * The policy must be `disabled` if `placement_target` is specified.
   */
  public interface Policy {
    /** automatic. */
    String AUTOMATIC = "automatic";
    /** disabled. */
    String DISABLED = "disabled";
    /** manual. */
    String MANUAL = "manual";
  }

  protected String policy;
  protected List<ReservationIdentity> pool;

  /**
   * Builder.
   */
  public static class Builder {
    private String policy;
    private List<ReservationIdentity> pool;

    /**
     * Instantiates a new Builder from an existing InstanceReservationAffinityPrototype instance.
     *
     * @param instanceReservationAffinityPrototype the instance to initialize the Builder with
     */
    private Builder(InstanceReservationAffinityPrototype instanceReservationAffinityPrototype) {
      this.policy = instanceReservationAffinityPrototype.policy;
      this.pool = instanceReservationAffinityPrototype.pool;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a InstanceReservationAffinityPrototype.
     *
     * @return the new InstanceReservationAffinityPrototype instance
     */
    public InstanceReservationAffinityPrototype build() {
      return new InstanceReservationAffinityPrototype(this);
    }

    /**
     * Adds a new element to pool.
     *
     * @param pool the new element to be added
     * @return the InstanceReservationAffinityPrototype builder
     */
    public Builder addPool(ReservationIdentity pool) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(pool,
        "pool cannot be null");
      if (this.pool == null) {
        this.pool = new ArrayList<ReservationIdentity>();
      }
      this.pool.add(pool);
      return this;
    }

    /**
     * Set the policy.
     *
     * @param policy the policy
     * @return the InstanceReservationAffinityPrototype builder
     */
    public Builder policy(String policy) {
      this.policy = policy;
      return this;
    }

    /**
     * Set the pool.
     * Existing pool will be replaced.
     *
     * @param pool the pool
     * @return the InstanceReservationAffinityPrototype builder
     */
    public Builder pool(List<ReservationIdentity> pool) {
      this.pool = pool;
      return this;
    }
  }

  protected InstanceReservationAffinityPrototype() { }

  protected InstanceReservationAffinityPrototype(Builder builder) {
    policy = builder.policy;
    pool = builder.pool;
  }

  /**
   * New builder.
   *
   * @return a InstanceReservationAffinityPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the policy.
   *
   * The reservation affinity policy to use for this virtual server instance:
   * - `disabled`: Reservations will not be used
   * - `manual`: Reservations in `pool` will be available for use
   * - `automatic`: Reservations with an `affinity_policy` of `automatic` that have the same
   *   `profile` and `zone` as this virtual server instance will be available for use.
   *
   * The policy will default to `manual` if `pool` is not empty. The policy will default to
   * `disabled` if a `placement_target` is set. The policy will default to `automatic` in all other cases.
   *
   * The policy must be `disabled` if `placement_target` is specified.
   *
   * @return the policy
   */
  public String policy() {
    return policy;
  }

  /**
   * Gets the pool.
   *
   * The pool of reservations available for use by this virtual server instance.
   *
   * Specified reservations must have a `status` of `active`, and have the same `profile` and `zone` as this virtual
   * server instance.
   *
   * If `policy` is `manual`, `pool` must be specified with one reservation. If `policy` is `disabled` or `automatic`
   * and `pool` is specified, it must be empty. If `policy` is `manual`, the `pool` must contain a reservation with
   * available capacity.
   *
   * @return the pool
   */
  public List<ReservationIdentity> pool() {
    return pool;
  }
}

