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
 * BareMetalServerTrustedPlatformModule.
 */
public class BareMetalServerTrustedPlatformModule extends GenericModel {

  /**
   * The mode for the trusted platform module (TPM):
   * - `tpm_2`: Standard TPM 2 capabilities
   * - `tpm_2_with_txt`: Standard TPM 2 with Intel Trusted Execution Technology (TXT)
   *
   * The enumerated values for this property are expected to expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the resource on which the
   * unexpected property value was encountered.
   */
  public interface Mode {
    /** tpm_2. */
    String TPM_2 = "tpm_2";
    /** tpm_2_with_txt. */
    String TPM_2_WITH_TXT = "tpm_2_with_txt";
  }

  protected Boolean enabled;
  protected String mode;

  protected BareMetalServerTrustedPlatformModule() { }

  /**
   * Gets the enabled.
   *
   * Indicates whether the trusted platform module (TPM) is enabled. If enabled, `mode` will also be set.
   *
   * @return the enabled
   */
  public Boolean isEnabled() {
    return enabled;
  }

  /**
   * Gets the mode.
   *
   * The mode for the trusted platform module (TPM):
   * - `tpm_2`: Standard TPM 2 capabilities
   * - `tpm_2_with_txt`: Standard TPM 2 with Intel Trusted Execution Technology (TXT)
   *
   * The enumerated values for this property are expected to expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the resource on which the
   * unexpected property value was encountered.
   *
   * @return the mode
   */
  public String getMode() {
    return mode;
  }
}

