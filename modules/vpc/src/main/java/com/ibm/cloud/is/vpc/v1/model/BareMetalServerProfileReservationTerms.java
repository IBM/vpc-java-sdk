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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * BareMetalServerProfileReservationTerms.
 */
public class BareMetalServerProfileReservationTerms extends GenericModel {

  /**
   * The type for this profile field.
   */
  public interface Type {
    /** enum. */
    String X_ENUM = "enum";
  }

  public interface Values {
    /** one_year. */
    String ONE_YEAR = "one_year";
    /** three_year. */
    String THREE_YEAR = "three_year";
  }

  protected String type;
  protected List<String> values;

  protected BareMetalServerProfileReservationTerms() { }

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
   * The supported committed use terms for a reservation using this profile.
   *
   * @return the values
   */
  public List<String> getValues() {
    return values;
  }
}

