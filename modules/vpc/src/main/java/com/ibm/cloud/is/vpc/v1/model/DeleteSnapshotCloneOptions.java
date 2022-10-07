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
 * The deleteSnapshotClone options.
 */
public class DeleteSnapshotCloneOptions extends GenericModel {

  protected String id;
  protected String zoneName;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String zoneName;

    /**
     * Instantiates a new Builder from an existing DeleteSnapshotCloneOptions instance.
     *
     * @param deleteSnapshotCloneOptions the instance to initialize the Builder with
     */
    private Builder(DeleteSnapshotCloneOptions deleteSnapshotCloneOptions) {
      this.id = deleteSnapshotCloneOptions.id;
      this.zoneName = deleteSnapshotCloneOptions.zoneName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     * @param zoneName the zoneName
     */
    public Builder(String id, String zoneName) {
      this.id = id;
      this.zoneName = zoneName;
    }

    /**
     * Builds a DeleteSnapshotCloneOptions.
     *
     * @return the new DeleteSnapshotCloneOptions instance
     */
    public DeleteSnapshotCloneOptions build() {
      return new DeleteSnapshotCloneOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DeleteSnapshotCloneOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the zoneName.
     *
     * @param zoneName the zoneName
     * @return the DeleteSnapshotCloneOptions builder
     */
    public Builder zoneName(String zoneName) {
      this.zoneName = zoneName;
      return this;
    }
  }

  protected DeleteSnapshotCloneOptions() { }

  protected DeleteSnapshotCloneOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.zoneName,
      "zoneName cannot be empty");
    id = builder.id;
    zoneName = builder.zoneName;
  }

  /**
   * New builder.
   *
   * @return a DeleteSnapshotCloneOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The snapshot identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the zoneName.
   *
   * The zone name.
   *
   * @return the zoneName
   */
  public String zoneName() {
    return zoneName;
  }
}

