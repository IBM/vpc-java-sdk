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
 * A DNS server.
 */
public class DNSServer extends GenericModel {

  protected String address;
  @SerializedName("zone_affinity")
  protected ZoneReference zoneAffinity;

  protected DNSServer() { }

  /**
   * Gets the address.
   *
   * The IP address.
   *
   * This property may [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) to support IPv6 addresses in
   * the future.
   *
   * @return the address
   */
  public String getAddress() {
    return address;
  }

  /**
   * Gets the zoneAffinity.
   *
   * If present, DHCP configuration for this zone will have this DNS server listed first.
   *
   * @return the zoneAffinity
   */
  public ZoneReference getZoneAffinity() {
    return zoneAffinity;
  }
}

