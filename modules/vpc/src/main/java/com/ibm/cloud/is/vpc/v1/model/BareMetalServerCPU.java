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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The bare metal server CPU configuration.
 */
public class BareMetalServerCPU extends GenericModel {

  protected String architecture;
  @SerializedName("core_count")
  protected Long coreCount;
  @SerializedName("socket_count")
  protected Long socketCount;
  @SerializedName("threads_per_core")
  protected Long threadsPerCore;

  protected BareMetalServerCPU() { }

  /**
   * Gets the architecture.
   *
   * The CPU architecture.
   *
   * @return the architecture
   */
  public String getArchitecture() {
    return architecture;
  }

  /**
   * Gets the coreCount.
   *
   * The total number of cores.
   *
   * @return the coreCount
   */
  public Long getCoreCount() {
    return coreCount;
  }

  /**
   * Gets the socketCount.
   *
   * The total number of CPU sockets.
   *
   * @return the socketCount
   */
  public Long getSocketCount() {
    return socketCount;
  }

  /**
   * Gets the threadsPerCore.
   *
   * The total number of hardware threads per core.
   *
   * @return the threadsPerCore
   */
  public Long getThreadsPerCore() {
    return threadsPerCore;
  }
}

