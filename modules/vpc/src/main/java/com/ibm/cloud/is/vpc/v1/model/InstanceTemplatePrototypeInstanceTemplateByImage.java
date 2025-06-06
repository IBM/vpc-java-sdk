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

/**
 * Create an instance template that creates instances by using an image.
 *
 * The image's `user_data_format` must be `cloud_init`.
 *
 * Classes which extend this class:
 * - InstanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachment
 * - InstanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkInterface
 */
public class InstanceTemplatePrototypeInstanceTemplateByImage extends InstanceTemplatePrototype {

  /**
   * The confidential compute mode to use for this virtual server instance.
   *
   * If unspecified, the default confidential compute mode from the profile will be used.
   */
  public interface ConfidentialComputeMode {
    /** disabled. */
    String DISABLED = "disabled";
    /** sgx. */
    String SGX = "sgx";
    /** tdx. */
    String TDX = "tdx";
  }


  protected InstanceTemplatePrototypeInstanceTemplateByImage() { }
}

