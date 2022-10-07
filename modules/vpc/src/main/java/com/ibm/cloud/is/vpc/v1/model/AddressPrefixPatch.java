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
 * AddressPrefixPatch.
 */
public class AddressPrefixPatch extends GenericModel {

  @SerializedName("is_default")
  protected Boolean isDefault;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean isDefault;
    private String name;

    /**
     * Instantiates a new Builder from an existing AddressPrefixPatch instance.
     *
     * @param addressPrefixPatch the instance to initialize the Builder with
     */
    private Builder(AddressPrefixPatch addressPrefixPatch) {
      this.isDefault = addressPrefixPatch.isDefault;
      this.name = addressPrefixPatch.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a AddressPrefixPatch.
     *
     * @return the new AddressPrefixPatch instance
     */
    public AddressPrefixPatch build() {
      return new AddressPrefixPatch(this);
    }

    /**
     * Set the isDefault.
     *
     * @param isDefault the isDefault
     * @return the AddressPrefixPatch builder
     */
    public Builder isDefault(Boolean isDefault) {
      this.isDefault = isDefault;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the AddressPrefixPatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected AddressPrefixPatch() { }

  protected AddressPrefixPatch(Builder builder) {
    isDefault = builder.isDefault;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a AddressPrefixPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the isDefault.
   *
   * Indicates whether this is the default prefix for this zone in this VPC. Updating to true makes this prefix the
   * default prefix for this zone in this VPC, provided the VPC currently has no default address prefix for this zone.
   * Updating to false removes the default prefix for this zone in this VPC.
   *
   * @return the isDefault
   */
  public Boolean isDefault() {
    return isDefault;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this address prefix. Names must be unique within the VPC the address prefix resides in.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Construct a JSON merge-patch from the AddressPrefixPatch.
   *
   * Note that properties of the AddressPrefixPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the AddressPrefixPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }

}

