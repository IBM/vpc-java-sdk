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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * SnapshotClonePrototype.
 */
public class SnapshotClonePrototype extends GenericModel {

  protected ZoneIdentity zone;

  /**
   * Builder.
   */
  public static class Builder {
    private ZoneIdentity zone;

    private Builder(SnapshotClonePrototype snapshotClonePrototype) {
      this.zone = snapshotClonePrototype.zone;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param zone the zone
     */
    public Builder(ZoneIdentity zone) {
      this.zone = zone;
    }

    /**
     * Builds a SnapshotClonePrototype.
     *
     * @return the new SnapshotClonePrototype instance
     */
    public SnapshotClonePrototype build() {
      return new SnapshotClonePrototype(this);
    }

    /**
     * Set the zone.
     *
     * @param zone the zone
     * @return the SnapshotClonePrototype builder
     */
    public Builder zone(ZoneIdentity zone) {
      this.zone = zone;
      return this;
    }
  }

  protected SnapshotClonePrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.zone,
      "zone cannot be null");
    zone = builder.zone;
  }

  /**
   * New builder.
   *
   * @return a SnapshotClonePrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the zone.
   *
   * The zone this snapshot clone will reside in. Must be in the same region as the
   * snapshot.
   *
   * @return the zone
   */
  public ZoneIdentity zone() {
    return zone;
  }
}

