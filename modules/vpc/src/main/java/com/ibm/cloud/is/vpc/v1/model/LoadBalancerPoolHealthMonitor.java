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
 * LoadBalancerPoolHealthMonitor.
 *
 * Classes which extend this class:
 * - LoadBalancerPoolHealthMonitorTypeTCP
 * - LoadBalancerPoolHealthMonitorTypeHTTPHTTPS
 */
public class LoadBalancerPoolHealthMonitor extends GenericModel {

  /**
   * The protocol type used for health checks.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Type {
    /** http. */
    String HTTP = "http";
    /** https. */
    String HTTPS = "https";
    /** tcp. */
    String TCP = "tcp";
  }

  protected Long delay;
  @SerializedName("max_retries")
  protected Long maxRetries;
  protected Long port;
  protected Long timeout;
  protected String type;
  @SerializedName("url_path")
  protected String urlPath;

  protected LoadBalancerPoolHealthMonitor() { }

  /**
   * Gets the delay.
   *
   * The seconds to wait between health checks.
   *
   * @return the delay
   */
  public Long getDelay() {
    return delay;
  }

  /**
   * Gets the maxRetries.
   *
   * The health check max retries.
   *
   * @return the maxRetries
   */
  public Long getMaxRetries() {
    return maxRetries;
  }

  /**
   * Gets the port.
   *
   * The health check port.
   *
   * If present, this overrides the pool member port values.
   *
   * @return the port
   */
  public Long getPort() {
    return port;
  }

  /**
   * Gets the timeout.
   *
   * The seconds to wait for a response to a health check.
   *
   * @return the timeout
   */
  public Long getTimeout() {
    return timeout;
  }

  /**
   * Gets the type.
   *
   * The protocol type used for health checks.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the urlPath.
   *
   * The health check URL path, in the format of an [origin-form request
   * target](https://tools.ietf.org/html/rfc7230#section-5.3.1).
   *
   * @return the urlPath
   */
  public String getUrlPath() {
    return urlPath;
  }
}

