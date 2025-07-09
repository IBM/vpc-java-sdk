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
 * LoadBalancerStatistics.
 */
public class LoadBalancerStatistics extends GenericModel {

  @SerializedName("active_connections")
  protected Long activeConnections;
  @SerializedName("connection_rate")
  protected Float connectionRate;
  @SerializedName("data_processed_this_month")
  protected Long dataProcessedThisMonth;
  protected Float throughput;

  protected LoadBalancerStatistics() { }

  /**
   * Gets the activeConnections.
   *
   * The number of active connections for this load balancer.
   *
   * @return the activeConnections
   */
  public Long getActiveConnections() {
    return activeConnections;
  }

  /**
   * Gets the connectionRate.
   *
   * The current connection rate (connections per second) for this load balancer.
   *
   * @return the connectionRate
   */
  public Float getConnectionRate() {
    return connectionRate;
  }

  /**
   * Gets the dataProcessedThisMonth.
   *
   * The total number of bytes processed for this load balancer for the current calendar month.
   *
   * @return the dataProcessedThisMonth
   */
  public Long getDataProcessedThisMonth() {
    return dataProcessedThisMonth;
  }

  /**
   * Gets the throughput.
   *
   * The current throughput (in Mbps) for this load balancer.
   *
   * @return the throughput
   */
  public Float getThroughput() {
    return throughput;
  }
}

