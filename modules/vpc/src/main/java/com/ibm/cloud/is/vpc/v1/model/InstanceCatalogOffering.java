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
 * InstanceCatalogOffering.
 */
public class InstanceCatalogOffering extends GenericModel {

  protected CatalogOfferingVersionReference version;

  protected InstanceCatalogOffering() { }

  /**
   * Gets the version.
   *
   * The catalog offering version this virtual server instance was provisioned from.
   *
   * The catalog offering version is not managed by the IBM VPC service, and may no longer
   * exist, or may refer to a different image CRN than the `image.crn` for this virtual
   * server instance. However, all images associated with a catalog offering version will
   * have the same checksum, and therefore will have the same data.
   *
   * @return the version
   */
  public CatalogOfferingVersionReference getVersion() {
    return version;
  }
}

