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
 * Region.
 */
public class Region extends GenericModel {

  /**
   * The availability status of this region.
   */
  public interface Status {
    /** available. */
    String AVAILABLE = "available";
    /** unavailable. */
    String UNAVAILABLE = "unavailable";
  }

  protected String endpoint;
  protected String href;
  protected String name;
  protected String status;

  /**
   * Gets the endpoint.
   *
   * The API endpoint for this region.
   *
   * @return the endpoint
   */
  public String getEndpoint() {
    return endpoint;
  }

  /**
   * Gets the href.
   *
   * The URL for this region.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the name.
   *
   * The globally unique name for this region.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the status.
   *
   * The availability status of this region.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }
}

