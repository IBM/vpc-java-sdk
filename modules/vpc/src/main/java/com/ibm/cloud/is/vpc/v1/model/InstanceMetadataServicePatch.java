/*
 * (C) Copyright IBM Corp. 2023, 2024, 2025.
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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The metadata service configuration.
 */
public class InstanceMetadataServicePatch extends GenericModel {

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
  @SerializedName("response_hop_limit")
  protected Long responseHopLimit;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean enabled;
    private String protocol;
    private Long responseHopLimit;

    /**
     * Instantiates a new Builder from an existing InstanceMetadataServicePatch instance.
     *
     * @param instanceMetadataServicePatch the instance to initialize the Builder with
     */
    private Builder(InstanceMetadataServicePatch instanceMetadataServicePatch) {
      this.enabled = instanceMetadataServicePatch.enabled;
      this.protocol = instanceMetadataServicePatch.protocol;
      this.responseHopLimit = instanceMetadataServicePatch.responseHopLimit;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a InstanceMetadataServicePatch.
     *
     * @return the new InstanceMetadataServicePatch instance
     */
    public InstanceMetadataServicePatch build() {
      return new InstanceMetadataServicePatch(this);
    }

    /**
     * Set the enabled.
     *
     * @param enabled the enabled
     * @return the InstanceMetadataServicePatch builder
     */
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    /**
     * Set the protocol.
     *
     * @param protocol the protocol
     * @return the InstanceMetadataServicePatch builder
     */
    public Builder protocol(String protocol) {
      this.protocol = protocol;
      return this;
    }

    /**
     * Set the responseHopLimit.
     *
     * @param responseHopLimit the responseHopLimit
     * @return the InstanceMetadataServicePatch builder
     */
    public Builder responseHopLimit(long responseHopLimit) {
      this.responseHopLimit = responseHopLimit;
      return this;
    }
  }

  protected InstanceMetadataServicePatch() { }

  protected InstanceMetadataServicePatch(Builder builder) {
    enabled = builder.enabled;
    protocol = builder.protocol;
    responseHopLimit = builder.responseHopLimit;
  }

  /**
   * New builder.
   *
   * @return a InstanceMetadataServicePatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the enabled.
   *
   * Indicates whether the metadata service endpoint will be available to the virtual server instance.
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

  /**
   * Gets the responseHopLimit.
   *
   * The hop limit (IP time to live) for IP response packets from the metadata service. Applies only when the metadata
   * service is enabled.
   *
   * @return the responseHopLimit
   */
  public Long responseHopLimit() {
    return responseHopLimit;
  }
}

