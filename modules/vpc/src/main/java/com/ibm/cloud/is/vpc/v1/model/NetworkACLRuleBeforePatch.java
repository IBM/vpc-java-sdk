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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The rule to move this rule immediately before.
 *
 * Specify `null` to move this rule after all existing rules.
 *
 * Classes which extend this class:
 * - NetworkACLRuleBeforePatchNetworkACLRuleIdentityById
 * - NetworkACLRuleBeforePatchNetworkACLRuleIdentityByHref
 */
public class NetworkACLRuleBeforePatch extends GenericModel {

  protected String id;
  protected String href;

  protected NetworkACLRuleBeforePatch() { }

  /**
   * Gets the id.
   *
   * The unique identifier for this network ACL rule.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the href.
   *
   * The URL for this network ACL rule.
   *
   * @return the href
   */
  public String href() {
    return href;
  }
}

