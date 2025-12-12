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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The VCPU configuration.
 */
public class VCPU extends GenericModel {

  /**
   * The VCPU architecture.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Architecture {
    /** amd64. */
    String AMD64 = "amd64";
    /** s390x. */
    String S390X = "s390x";
  }

  /**
   * The VCPU manufacturer.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Manufacturer {
    /** amd. */
    String AMD = "amd";
    /** ibm. */
    String IBM = "ibm";
    /** intel. */
    String INTEL = "intel";
  }

  protected String architecture;
  protected Long count;
  protected String manufacturer;

  protected VCPU() { }

  /**
   * Gets the architecture.
   *
   * The VCPU architecture.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the architecture
   */
  public String getArchitecture() {
    return architecture;
  }

  /**
   * Gets the count.
   *
   * The number of VCPUs assigned.
   *
   * @return the count
   */
  public Long getCount() {
    return count;
  }

  /**
   * Gets the manufacturer.
   *
   * The VCPU manufacturer.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the manufacturer
   */
  public String getManufacturer() {
    return manufacturer;
  }
}

