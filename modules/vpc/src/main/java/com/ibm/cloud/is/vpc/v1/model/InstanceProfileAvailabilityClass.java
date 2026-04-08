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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * InstanceProfileAvailabilityClass.
 *
 * Classes which extend this class:
 * - InstanceProfileAvailabilityClassEnum
 * - InstanceProfileAvailabilityClassFixed
 */
public class InstanceProfileAvailabilityClass extends GenericModel {

  /**
   * The default availability class for an instance with this profile.
   */
  public interface XDefault {
    /** spot. */
    String SPOT = "spot";
    /** standard. */
    String STANDARD = "standard";
  }

  /**
   * The type for this profile field.
   */
  public interface Type {
    /** enum. */
    String X_ENUM = "enum";
  }

  /**
   * The availability class for the virtual server instance:
   * - `spot`: The virtual server instance may be preempted.
   * - `standard`: The virtual server instance will not be preempted.
   *
   * See [virtual server instance availability
   * class](https://cloud.ibm.com/docs/vpc?topic=vpc-spot-instances-virtual-servers) for details.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Values {
    /** spot. */
    String SPOT = "spot";
    /** standard. */
    String STANDARD = "standard";
  }

  /**
   * The availability class for the virtual server instance:
   * - `spot`: The virtual server instance may be preempted.
   * - `standard`: The virtual server instance will not be preempted.
   *
   * See [virtual server instance availability
   * class](https://cloud.ibm.com/docs/vpc?topic=vpc-spot-instances-virtual-servers) for details.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Value {
    /** spot. */
    String SPOT = "spot";
    /** standard. */
    String STANDARD = "standard";
  }

  @SerializedName("default")
  protected String xDefault;
  protected String type;
  protected List<String> values;
  protected String value;

  protected InstanceProfileAvailabilityClass() { }

  /**
   * Gets the xDefault.
   *
   * The default availability class for an instance with this profile.
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
   * The permitted values for this profile field.
   *
   * @return the values
   */
  public List<String> getValues() {
    return values;
  }

  /**
   * Gets the value.
   *
   * The availability class for the virtual server instance:
   * - `spot`: The virtual server instance may be preempted.
   * - `standard`: The virtual server instance will not be preempted.
   *
   * See [virtual server instance availability
   * class](https://cloud.ibm.com/docs/vpc?topic=vpc-spot-instances-virtual-servers) for details.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the value
   */
  public String getValue() {
    return value;
  }
}

