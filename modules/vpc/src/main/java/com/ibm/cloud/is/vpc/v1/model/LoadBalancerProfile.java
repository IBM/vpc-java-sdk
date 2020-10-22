/*
 * (C) Copyright IBM Corp. 2020.
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
 * LoadBalancerProfile.
 */
public class LoadBalancerProfile extends GenericModel {

  protected String name;
  protected String href;
  protected String family;

  /**
   * Gets the name.
   *
   * The name for this load balancer profile.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the href.
   *
   * The URL for this load balancer profile.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the family.
   *
   * The product family this load balancer profile belongs to.
   *
   * @return the family
   */
  public String getFamily() {
    return family;
  }
}
