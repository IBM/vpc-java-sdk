/*
 * (C) Copyright IBM Corp. 2025.
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
 * The metadata service configuration for the bare metal server.
 */
public class BareMetalServerMetadataServicePrototype extends GenericModel {

  /**
   * The communication protocol to use for the metadata service endpoint. Applies only when the metadata service is
   * enabled.
   * - `http`: HTTP protocol (unencrypted)
   * - `https`: HTTP Secure protocol.
   */
  public interface Protocol {
    /** http. */
    String HTTP = "http";
    /** https. */
    String HTTPS = "https";
  }

  protected Boolean enabled;
  protected String protocol;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean enabled;
    private String protocol;

    /**
     * Instantiates a new Builder from an existing BareMetalServerMetadataServicePrototype instance.
     *
     * @param bareMetalServerMetadataServicePrototype the instance to initialize the Builder with
     */
    private Builder(BareMetalServerMetadataServicePrototype bareMetalServerMetadataServicePrototype) {
      this.enabled = bareMetalServerMetadataServicePrototype.enabled;
      this.protocol = bareMetalServerMetadataServicePrototype.protocol;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a BareMetalServerMetadataServicePrototype.
     *
     * @return the new BareMetalServerMetadataServicePrototype instance
     */
    public BareMetalServerMetadataServicePrototype build() {
      return new BareMetalServerMetadataServicePrototype(this);
    }

    /**
     * Set the enabled.
     *
     * @param enabled the enabled
     * @return the BareMetalServerMetadataServicePrototype builder
     */
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    /**
     * Set the protocol.
     *
     * @param protocol the protocol
     * @return the BareMetalServerMetadataServicePrototype builder
     */
    public Builder protocol(String protocol) {
      this.protocol = protocol;
      return this;
    }
  }

  protected BareMetalServerMetadataServicePrototype() { }

  protected BareMetalServerMetadataServicePrototype(Builder builder) {
    enabled = builder.enabled;
    protocol = builder.protocol;
  }

  /**
   * New builder.
   *
   * @return a BareMetalServerMetadataServicePrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the enabled.
   *
   * Indicates whether the metadata service endpoint will be available to the bare metal server.
   *
   * @return the enabled
   */
  public Boolean enabled() {
    return enabled;
  }

  /**
   * Gets the protocol.
   *
   * The communication protocol to use for the metadata service endpoint. Applies only when the metadata service is
   * enabled.
   * - `http`: HTTP protocol (unencrypted)
   * - `https`: HTTP Secure protocol.
   *
   * @return the protocol
   */
  public String protocol() {
    return protocol;
  }
}

