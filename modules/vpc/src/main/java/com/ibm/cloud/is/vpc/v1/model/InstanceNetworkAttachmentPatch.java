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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * InstanceNetworkAttachmentPatch.
 */
public class InstanceNetworkAttachmentPatch extends GenericModel {

  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;

    /**
     * Instantiates a new Builder from an existing InstanceNetworkAttachmentPatch instance.
     *
     * @param instanceNetworkAttachmentPatch the instance to initialize the Builder with
     */
    private Builder(InstanceNetworkAttachmentPatch instanceNetworkAttachmentPatch) {
      this.name = instanceNetworkAttachmentPatch.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a InstanceNetworkAttachmentPatch.
     *
     * @return the new InstanceNetworkAttachmentPatch instance
     */
    public InstanceNetworkAttachmentPatch build() {
      return new InstanceNetworkAttachmentPatch(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the InstanceNetworkAttachmentPatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected InstanceNetworkAttachmentPatch() { }

  protected InstanceNetworkAttachmentPatch(Builder builder) {
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a InstanceNetworkAttachmentPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * The name for this network attachment. The name must not be used by another network attachment for the instance.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Construct a JSON merge-patch from the InstanceNetworkAttachmentPatch.
   *
   * Note that properties of the InstanceNetworkAttachmentPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the InstanceNetworkAttachmentPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

