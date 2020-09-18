/*
 * (C) Copyright IBM Corp. 2020.
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
 * LoadBalancerPoolSessionPersistencePatch.
 */
public class LoadBalancerPoolSessionPersistencePatch extends GenericModel {

  /**
   * The session persistence type.
   */
  public interface Type {
    /** source_ip. */
    String SOURCE_IP = "source_ip";
  }

  protected String type;

  /**
   * Builder.
   */
  public static class Builder {
    private String type;

    private Builder(LoadBalancerPoolSessionPersistencePatch loadBalancerPoolSessionPersistencePatch) {
      this.type = loadBalancerPoolSessionPersistencePatch.type;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param type the type
     */
    public Builder(String type) {
      this.type = type;
    }

    /**
     * Builds a LoadBalancerPoolSessionPersistencePatch.
     *
     * @return the new LoadBalancerPoolSessionPersistencePatch instance
     */
    public LoadBalancerPoolSessionPersistencePatch build() {
      return new LoadBalancerPoolSessionPersistencePatch(this);
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the LoadBalancerPoolSessionPersistencePatch builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }

  protected LoadBalancerPoolSessionPersistencePatch(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    type = builder.type;
  }

  /**
   * New builder.
   *
   * @return a LoadBalancerPoolSessionPersistencePatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the type.
   *
   * The session persistence type.
   *
   * @return the type
   */
  public String type() {
    return type;
  }
}

