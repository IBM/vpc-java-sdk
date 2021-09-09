/*
 * (C) Copyright IBM Corp. 2021.
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

import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * SnapshotPatch.
 */
public class SnapshotPatch extends GenericModel {

  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;

    private Builder(SnapshotPatch snapshotPatch) {
      this.name = snapshotPatch.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SnapshotPatch.
     *
     * @return the new SnapshotPatch instance
     */
    public SnapshotPatch build() {
      return new SnapshotPatch(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the SnapshotPatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected SnapshotPatch(Builder builder) {
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a SnapshotPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this snapshot.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Construct a JSON merge-patch from the SnapshotPatch.
   *
   * Note that properties of the SnapshotPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the SnapshotPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }

}

