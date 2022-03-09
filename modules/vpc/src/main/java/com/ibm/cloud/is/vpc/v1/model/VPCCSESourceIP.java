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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * VPCCSESourceIP.
 */
public class VPCCSESourceIP extends GenericModel {

  protected IP ip;
  protected ZoneReference zone;

  /**
   * Gets the ip.
   *
   * The cloud service endpoint source IP address for this zone.
   *
   * @return the ip
   */
  public IP getIp() {
    return ip;
  }

  /**
   * Gets the zone.
   *
   * The zone this cloud service endpoint source IP resides in.
   *
   * @return the zone
   */
  public ZoneReference getZone() {
    return zone;
  }
}

