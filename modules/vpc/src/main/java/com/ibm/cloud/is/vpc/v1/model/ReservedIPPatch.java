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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * ReservedIPPatch.
 */
public class ReservedIPPatch extends GenericModel {

  @SerializedName("auto_delete")
  protected Boolean autoDelete;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean autoDelete;
    private String name;

    private Builder(ReservedIPPatch reservedIpPatch) {
      this.autoDelete = reservedIpPatch.autoDelete;
      this.name = reservedIpPatch.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ReservedIPPatch.
     *
     * @return the new ReservedIPPatch instance
     */
    public ReservedIPPatch build() {
      return new ReservedIPPatch(this);
    }

    /**
     * Set the autoDelete.
     *
     * @param autoDelete the autoDelete
     * @return the ReservedIPPatch builder
     */
    public Builder autoDelete(Boolean autoDelete) {
      this.autoDelete = autoDelete;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ReservedIPPatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected ReservedIPPatch(Builder builder) {
    autoDelete = builder.autoDelete;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a ReservedIPPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the autoDelete.
   *
   * Indicates whether this reserved IP member will be automatically deleted when either
   * `target` is deleted, or the reserved IP is unbound. Must be `false` if the reserved IP is unbound.
   *
   * @return the autoDelete
   */
  public Boolean autoDelete() {
    return autoDelete;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this reserved IP. Names must be unique within the subnet the reserved IP resides in.
   * Names beginning with `ibm-` are reserved for provider-owned resources.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Construct a JSON merge-patch from the ReservedIPPatch.
   *
   * Note that properties of the ReservedIPPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the ReservedIPPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }

}

