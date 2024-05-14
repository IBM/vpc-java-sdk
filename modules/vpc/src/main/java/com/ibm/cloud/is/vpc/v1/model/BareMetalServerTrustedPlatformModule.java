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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * BareMetalServerTrustedPlatformModule.
 */
public class BareMetalServerTrustedPlatformModule extends GenericModel {

  /**
   * The trusted platform module (TPM) mode:
   * - `disabled`: No TPM functionality
   * - `tpm_2`: TPM 2.0
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Mode {
    /** disabled. */
    String DISABLED = "disabled";
    /** tpm_2. */
    String TPM_2 = "tpm_2";
  }

  /**
   * The trusted platform module (TPM) mode:
   * - `disabled`: No TPM functionality
   * - `tpm_2`: TPM 2.0
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface SupportedModes {
    /** disabled. */
    String DISABLED = "disabled";
    /** tpm_2. */
    String TPM_2 = "tpm_2";
  }

  protected Boolean enabled;
  protected String mode;
  @SerializedName("supported_modes")
  protected List<String> supportedModes;

  protected BareMetalServerTrustedPlatformModule() { }

  /**
   * Gets the enabled.
   *
   * Indicates whether the trusted platform module is enabled.
   *
   * @return the enabled
   */
  public Boolean isEnabled() {
    return enabled;
  }

  /**
   * Gets the mode.
   *
   * The trusted platform module (TPM) mode:
   * - `disabled`: No TPM functionality
   * - `tpm_2`: TPM 2.0
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the mode
   */
  public String getMode() {
    return mode;
  }

  /**
   * Gets the supportedModes.
   *
   * The supported trusted platform module modes.
   *
   * @return the supportedModes
   */
  public List<String> getSupportedModes() {
    return supportedModes;
  }
}

