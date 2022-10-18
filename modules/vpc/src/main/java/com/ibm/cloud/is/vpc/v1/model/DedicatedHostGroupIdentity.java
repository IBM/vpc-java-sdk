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


/**
 * Identifies a dedicated host group by a unique property.
 *
 * Classes which extend this class:
 * - DedicatedHostGroupIdentityById
 * - DedicatedHostGroupIdentityByCRN
 * - DedicatedHostGroupIdentityByHref
 */
public class DedicatedHostGroupIdentity extends DedicatedHostPrototypeWrapper {

  protected DedicatedHostGroupIdentity() { }

  /**
   * Gets the id.
   *
   * The unique identifier for this dedicated host group.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the crn.
   *
   * The CRN for this dedicated host group.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
  }

  /**
   * Gets the href.
   *
   * The URL for this dedicated host group.
   *
   * @return the href
   */
  public String href() {
    return href;
  }
}

