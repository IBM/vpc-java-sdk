/*
 * (C) Copyright IBM Corp. 2025.
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
 * ShareProfileAvailabilityModes.
 *
 * Classes which extend this class:
 * - ShareProfileAvailabilityModesEnum
 * - ShareProfileAvailabilityModesFixed
 */
public class ShareProfileAvailabilityModes extends GenericModel {

  /**
   * The default data availability mode for this profile.
   */
  public interface XDefault {
    /** regional. */
    String REGIONAL = "regional";
    /** zonal. */
    String ZONAL = "zonal";
  }

  /**
   * The type for this profile field.
   */
  public interface Type {
    /** enum. */
    String X_ENUM = "enum";
  }

  public interface Values {
    /** regional. */
    String REGIONAL = "regional";
    /** zonal. */
    String ZONAL = "zonal";
  }

  /**
   * The value for this profile field.
   */
  public interface Value {
    /** regional. */
    String REGIONAL = "regional";
    /** zonal. */
    String ZONAL = "zonal";
  }

  @SerializedName("default")
  protected String xDefault;
  protected String type;
  protected List<String> values;
  protected String value;

  protected ShareProfileAvailabilityModes() { }

  /**
   * Gets the xDefault.
   *
   * The default data availability mode for this profile.
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
   * The data availability mode of the share:
   * - `zonal`: The data availability of this share is limited only to a single zone of a
   *   given region as provided by the `zone` of the share.
   * - `regional`: The data availability of this share covers all zones in the region where
   *   the share is created.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the values
   */
  public List<String> getValues() {
    return values;
  }

  /**
   * Gets the value.
   *
   * The value for this profile field.
   *
   * @return the value
   */
  public String getValue() {
    return value;
  }
}

