/*
 * (C) Copyright IBM Corp. 2022, 2023, 2024.
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
 * VolumeCatalogOffering.
 */
public class VolumeCatalogOffering extends GenericModel {

  protected CatalogOfferingVersionPlanReference plan;
  protected CatalogOfferingVersionReference version;

  protected VolumeCatalogOffering() { }

  /**
   * Gets the plan.
   *
   * The billing plan associated with the catalog offering version.
   *
   * If absent, no billing plan is associated with the catalog offering version
   * (free).
   *
   * @return the plan
   */
  public CatalogOfferingVersionPlanReference getPlan() {
    return plan;
  }

  /**
   * Gets the version.
   *
   * The [catalog](https://cloud.ibm.com/docs/account?topic=account-restrict-by-user)
   * offering version this volume was created from.
   *
   * @return the version
   */
  public CatalogOfferingVersionReference getVersion() {
    return version;
  }
}

