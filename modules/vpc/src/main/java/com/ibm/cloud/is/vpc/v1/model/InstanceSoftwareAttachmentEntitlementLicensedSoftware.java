/*
 * (C) Copyright IBM Corp. 2023, 2024, 2025, 2026.
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
 * The licensed software for the instance software attachment's entitlement.
 */
public class InstanceSoftwareAttachmentEntitlementLicensedSoftware extends GenericModel {

  protected String sku;
  protected InstanceSoftwareAttachmentEntitlementLicensedSoftwareVendor vendor;

  protected InstanceSoftwareAttachmentEntitlementLicensedSoftware() { }

  /**
   * Gets the sku.
   *
   * The SKU for this licensed software.
   *
   * @return the sku
   */
  public String getSku() {
    return sku;
  }

  /**
   * Gets the vendor.
   *
   * @return the vendor
   */
  public InstanceSoftwareAttachmentEntitlementLicensedSoftwareVendor getVendor() {
    return vendor;
  }
}

