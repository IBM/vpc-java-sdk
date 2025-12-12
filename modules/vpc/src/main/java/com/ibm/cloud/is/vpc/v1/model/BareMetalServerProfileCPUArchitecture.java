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
 * BareMetalServerProfileCPUArchitecture.
 */
public class BareMetalServerProfileCPUArchitecture extends GenericModel {

  /**
   * The type for this profile field.
   */
  public interface Type {
    /** fixed. */
    String FIXED = "fixed";
  }

  /**
   * The CPU architecture for a bare metal server with this profile.
   */
  public interface Value {
    /** amd64. */
    String AMD64 = "amd64";
    /** s390x. */
    String S390X = "s390x";
  }

  protected String type;
  protected String value;

  protected BareMetalServerProfileCPUArchitecture() { }

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
   * Gets the value.
   *
   * The CPU architecture for a bare metal server with this profile.
   *
   * @return the value
   */
  public String getValue() {
    return value;
  }
}

