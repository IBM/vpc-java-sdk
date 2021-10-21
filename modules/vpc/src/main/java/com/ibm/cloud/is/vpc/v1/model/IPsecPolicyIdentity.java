/*
 * (C) Copyright IBM Corp. 2021.
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
 * Identifies an IPsec policy by a unique property.
 *
 * Classes which extend this class:
 * - IPsecPolicyIdentityById
 * - IPsecPolicyIdentityByHref
 */
public class IPsecPolicyIdentity extends GenericModel {

  protected String id;
  protected String href;

  protected IPsecPolicyIdentity() {
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this IPsec policy.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the href.
   *
   * The IPsec policy's canonical URL.
   *
   * @return the href
   */
  public String href() {
    return href;
  }
}
