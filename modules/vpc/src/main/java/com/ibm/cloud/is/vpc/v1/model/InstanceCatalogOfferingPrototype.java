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
 * The [catalog](https://cloud.ibm.com/docs/account?topic=account-restrict-by-user) offering or offering version to use
 * when provisioning this virtual server instance.
 *
 * If an offering is specified, the latest version of that offering will be used.
 *
 * The specified offering or offering version may be in a different account, subject to IAM policies.
 *
 * Classes which extend this class:
 * - InstanceCatalogOfferingPrototypeCatalogOfferingByOffering
 * - InstanceCatalogOfferingPrototypeCatalogOfferingByVersion
 */
public class InstanceCatalogOfferingPrototype extends GenericModel {

  protected CatalogOfferingVersionPlanIdentity plan;
  protected CatalogOfferingIdentity offering;
  protected CatalogOfferingVersionIdentity version;

  protected InstanceCatalogOfferingPrototype() { }

  /**
   * Gets the plan.
   *
   * The billing plan to use for the catalog offering version. If unspecified, no billing
   * plan will be used (free). Must be specified for catalog offering versions that require
   * a billing plan to be used.
   *
   * @return the plan
   */
  public CatalogOfferingVersionPlanIdentity plan() {
    return plan;
  }

  /**
   * Gets the offering.
   *
   * Identifies a [catalog](https://cloud.ibm.com/docs/account?topic=account-restrict-by-user)
   * offering by a unique property.
   *
   * @return the offering
   */
  public CatalogOfferingIdentity offering() {
    return offering;
  }

  /**
   * Gets the version.
   *
   * Identifies a version of a
   * [catalog](https://cloud.ibm.com/docs/account?topic=account-restrict-by-user) offering by a
   * unique property.
   *
   * @return the version
   */
  public CatalogOfferingVersionIdentity version() {
    return version;
  }
}

