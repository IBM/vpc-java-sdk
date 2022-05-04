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

/**
 * The permitted range for the number of CPU cores for a bare metal server with this profile.
 */
public class BareMetalServerProfileCPUCoreCountRange extends BareMetalServerProfileCPUCoreCount {

  /**
   * The type for this profile field.
   */
  public interface Type {
    /** range. */
    String RANGE = "range";
  }

}

