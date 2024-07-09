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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The metadata service configuration.
 */
public class InstanceMetadataService extends GenericModel {

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

  protected InstanceMetadataService() { }

  /**
   * Gets the enabled.
   *
   * Indicates whether the metadata service endpoint is available to the virtual server instance.
   *
   * @return the enabled
   */
  public Boolean isEnabled() {
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
  public String getProtocol() {
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
  public Long getResponseHopLimit() {
    return responseHopLimit;
  }
}

