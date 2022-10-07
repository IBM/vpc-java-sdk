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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * BareMetalServerProfileDiskSupportedInterfaces.
 */
public class BareMetalServerProfileDiskSupportedInterfaces extends GenericModel {

  /**
   * The disk interface used for attaching the disk.
   *
   * - `fcp`: Attached using Fiber Channel Protocol
   * - `sata`: Attached using Serial Advanced Technology Attachment
   * - `nvme`: Attached using Non-Volatile Memory Express
   *
   * The enumerated values for this property are expected to expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the resource on which the
   * unexpected property value was encountered.
   */
  public interface XDefault {
    /** fcp. */
    String FCP = "fcp";
    /** nvme. */
    String NVME = "nvme";
    /** sata. */
    String SATA = "sata";
  }

  /**
   * The type for this profile field.
   */
  public interface Type {
    /** enum. */
    String X_ENUM = "enum";
  }

  /**
   * The disk interface used for attaching the disk.
   *
   * - `fcp`: Attached using Fiber Channel Protocol
   * - `sata`: Attached using Serial Advanced Technology Attachment
   * - `nvme`: Attached using Non-Volatile Memory Express
   *
   * The enumerated values for this property are expected to expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the resource on which the
   * unexpected property value was encountered.
   */
  public interface Values {
    /** fcp. */
    String FCP = "fcp";
    /** nvme. */
    String NVME = "nvme";
    /** sata. */
    String SATA = "sata";
  }

  @SerializedName("default")
  protected String xDefault;
  protected String type;
  protected List<String> values;

  protected BareMetalServerProfileDiskSupportedInterfaces() { }

  /**
   * Gets the xDefault.
   *
   * The disk interface used for attaching the disk.
   *
   * - `fcp`: Attached using Fiber Channel Protocol
   * - `sata`: Attached using Serial Advanced Technology Attachment
   * - `nvme`: Attached using Non-Volatile Memory Express
   *
   * The enumerated values for this property are expected to expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the resource on which the
   * unexpected property value was encountered.
   *
   * @return the xDefault
   */
  public String getXDefault() {
    return xDefault;
  }

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
   * The supported disk interfaces used for attaching the disk.
   *
   * @return the values
   */
  public List<String> getValues() {
    return values;
  }
}

