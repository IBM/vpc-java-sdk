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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * BareMetalServerDiskAllowedUse.
 */
public class BareMetalServerDiskAllowedUse extends GenericModel {

  @SerializedName("api_version")
  protected String apiVersion;
  @SerializedName("bare_metal_server")
  protected String bareMetalServer;

  protected BareMetalServerDiskAllowedUse() { }

  /**
   * Gets the apiVersion.
   *
   * The API version with which to evaluate the expressions.
   *
   * If specified, the value must be between `2019-01-01` and today's date (in UTC). If unspecified, the `version` query
   * parameter value will be used.
   *
   * @return the apiVersion
   */
  public String getApiVersion() {
    return apiVersion;
  }

  /**
   * Gets the bareMetalServer.
   *
   * The expression that must be satisfied by the properties of a bare metal server provisioned using the image data in
   * this disk.
   *
   * The expression follows [Common Expression Language](https://github.com/google/cel-spec/blob/master/doc/langdef.md),
   * but does not support built-in functions and macros. In addition, the following variable is supported, corresponding
   * to the `BareMetalServer` property:
   * - `enable_secure_boot` (boolean): Indicates whether secure boot is enabled.
   *
   * @return the bareMetalServer
   */
  public String getBareMetalServer() {
    return bareMetalServer;
  }
}

