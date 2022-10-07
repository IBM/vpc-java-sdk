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
 * ImageCatalogOffering.
 */
public class ImageCatalogOffering extends GenericModel {

  protected Boolean managed;
  protected CatalogOfferingVersionReference version;

  protected ImageCatalogOffering() { }

  /**
   * Gets the managed.
   *
   * Indicates whether this image is managed as part of a
   * [catalog](https://cloud.ibm.com/docs/account?topic=account-restrict-by-user) offering. If an image is managed,
   * accounts in the same
   * [enterprise](https://cloud.ibm.com/docs/account?topic=account-what-is-enterprise) with access to that catalog can
   * specify the image's catalog offering version CRN to provision virtual server instances using the image.
   *
   * @return the managed
   */
  public Boolean isManaged() {
    return managed;
  }

  /**
   * Gets the version.
   *
   * The [catalog](https://cloud.ibm.com/docs/account?topic=account-restrict-by-user)
   * offering version associated with this image.
   *
   * If absent, this image is not associated with a cloud catalog offering.
   *
   * @return the version
   */
  public CatalogOfferingVersionReference getVersion() {
    return version;
  }
}

