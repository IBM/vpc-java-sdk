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
 * Identifies a load balancer pool by a unique property.
 *
 * Classes which extend this class:
 * - LoadBalancerPoolIdentityById
 * - LoadBalancerPoolIdentityByHref
 */
public class LoadBalancerPoolIdentity extends GenericModel {

  protected String id;
  protected String href;

  protected LoadBalancerPoolIdentity() {
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this load balancer pool.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the href.
   *
   * The pool's canonical URL.
   *
   * @return the href
   */
  public String href() {
    return href;
  }
}

