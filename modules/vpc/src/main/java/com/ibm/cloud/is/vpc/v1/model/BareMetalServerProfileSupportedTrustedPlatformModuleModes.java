/*
 * (C) Copyright IBM Corp. 2021, 2022, 2023.
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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The supported trusted platform module modes for this bare metal server profile.
 */
public class BareMetalServerProfileSupportedTrustedPlatformModuleModes extends GenericModel {

  /**
   * The type for this profile field.
   */
  public interface Type {
    /** enum. */
    String X_ENUM = "enum";
  }

  /**
   * The trusted platform module (TPM) mode:
   * - `disabled`: No TPM functionality
   * - `tpm_2`: TPM 2.0
   *
   * The enumerated values for this property are expected to expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the resource on which the
   * unexpected property value was encountered.
   */
  public interface Values {
    /** disabled. */
    String DISABLED = "disabled";
    /** tpm_2. */
    String TPM_2 = "tpm_2";
  }

  protected String type;
  protected List<String> values;

  protected BareMetalServerProfileSupportedTrustedPlatformModuleModes() { }

  /**
   * Gets the type.
   *
   * The type for this profile field.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the values.
   *
   * The supported trusted platform module modes.
   *
   * @return the values
   */
  public List<String> getValues() {
    return values;
  }
}

