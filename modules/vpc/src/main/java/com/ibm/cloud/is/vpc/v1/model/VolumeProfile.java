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
 * VolumeProfile.
 */
public class VolumeProfile extends GenericModel {

  /**
   * The product family this volume profile belongs to.
   *
   * The enumerated values for this property will expand in the future. When processing this property, check for and log
   * unknown values. Optionally halt processing and surface the error, or bypass the volume profile on which the
   * unexpected property value was encountered.
   */
  public interface Family {
    /** custom. */
    String CUSTOM = "custom";
    /** tiered. */
    String TIERED = "tiered";
  }

  protected String family;
  protected String href;
  protected String name;

  protected VolumeProfile() { }

  /**
   * Gets the family.
   *
   * The product family this volume profile belongs to.
   *
   * The enumerated values for this property will expand in the future. When processing this property, check for and log
   * unknown values. Optionally halt processing and surface the error, or bypass the volume profile on which the
   * unexpected property value was encountered.
   *
   * @return the family
   */
  public String getFamily() {
    return family;
  }

  /**
   * Gets the href.
   *
   * The URL for this volume profile.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the name.
   *
   * The globally unique name for this volume profile.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }
}

