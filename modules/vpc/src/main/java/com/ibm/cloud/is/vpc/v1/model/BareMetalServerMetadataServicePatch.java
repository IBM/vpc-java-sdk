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
public class BareMetalServerMetadataServicePatch extends GenericModel {

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
     * Instantiates a new Builder from an existing BareMetalServerMetadataServicePatch instance.
     *
     * @param bareMetalServerMetadataServicePatch the instance to initialize the Builder with
     */
    private Builder(BareMetalServerMetadataServicePatch bareMetalServerMetadataServicePatch) {
      this.enabled = bareMetalServerMetadataServicePatch.enabled;
      this.protocol = bareMetalServerMetadataServicePatch.protocol;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a BareMetalServerMetadataServicePatch.
     *
     * @return the new BareMetalServerMetadataServicePatch instance
     */
    public BareMetalServerMetadataServicePatch build() {
      return new BareMetalServerMetadataServicePatch(this);
    }

    /**
     * Set the enabled.
     *
     * @param enabled the enabled
     * @return the BareMetalServerMetadataServicePatch builder
     */
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    /**
     * Set the protocol.
     *
     * @param protocol the protocol
     * @return the BareMetalServerMetadataServicePatch builder
     */
    public Builder protocol(String protocol) {
      this.protocol = protocol;
      return this;
    }
  }

  protected BareMetalServerMetadataServicePatch() { }

  protected BareMetalServerMetadataServicePatch(Builder builder) {
    enabled = builder.enabled;
    protocol = builder.protocol;
  }

  /**
   * New builder.
   *
   * @return a BareMetalServerMetadataServicePatch builder
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

