/*
 * (C) Copyright IBM Corp. 2022, 2023, 2024.
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
 * InstanceReservationAffinityPatch.
 */
public class InstanceReservationAffinityPatch extends GenericModel {

  /**
   * The reservation affinity policy to use for this virtual server instance:
   * - `disabled`: Reservations will not be used
   * - `manual`: Reservations in `pool` are available for use.
   */
  public interface Policy {
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
     * Instantiates a new Builder from an existing InstanceReservationAffinityPatch instance.
     *
     * @param instanceReservationAffinityPatch the instance to initialize the Builder with
     */
    private Builder(InstanceReservationAffinityPatch instanceReservationAffinityPatch) {
      this.policy = instanceReservationAffinityPatch.policy;
      this.pool = instanceReservationAffinityPatch.pool;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a InstanceReservationAffinityPatch.
     *
     * @return the new InstanceReservationAffinityPatch instance
     */
    public InstanceReservationAffinityPatch build() {
      return new InstanceReservationAffinityPatch(this);
    }

    /**
     * Adds a new element to pool.
     *
     * @param pool the new element to be added
     * @return the InstanceReservationAffinityPatch builder
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
     * @return the InstanceReservationAffinityPatch builder
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
     * @return the InstanceReservationAffinityPatch builder
     */
    public Builder pool(List<ReservationIdentity> pool) {
      this.pool = pool;
      return this;
    }
  }

  protected InstanceReservationAffinityPatch() { }

  protected InstanceReservationAffinityPatch(Builder builder) {
    policy = builder.policy;
    pool = builder.pool;
  }

  /**
   * New builder.
   *
   * @return a InstanceReservationAffinityPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the policy.
   *
   * The reservation affinity policy to use for this virtual server instance:
   * - `disabled`: Reservations will not be used
   * - `manual`: Reservations in `pool` are available for use.
   *
   * @return the policy
   */
  public String policy() {
    return policy;
  }

  /**
   * Gets the pool.
   *
   * The pool of reservations available for use by this virtual server instance, replacing the existing pool of
   * reservations.
   *
   * Specified reservations must have a `status` of `active`, and have the same `profile` and
   * `zone` as this virtual server instance.
   *
   * If `policy` is `manual`, a pool must be specified with at least one reservation. If
   * `policy` is `disabled` and a pool is specified, it must be empty.
   *
   * @return the pool
   */
  public List<ReservationIdentity> pool() {
    return pool;
  }
}

