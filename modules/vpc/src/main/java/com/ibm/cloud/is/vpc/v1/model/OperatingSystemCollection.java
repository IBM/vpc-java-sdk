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
 * OperatingSystemCollection.
 */
public class OperatingSystemCollection extends GenericModel {

  protected OperatingSystemCollectionFirst first;
  protected Long limit;
  protected OperatingSystemCollectionNext next;
  @SerializedName("operating_systems")
  protected List<OperatingSystem> operatingSystems;

  protected OperatingSystemCollection() { }

  /**
   * Gets the first.
   *
   * A link to the first page of resources.
   *
   * @return the first
   */
  public OperatingSystemCollectionFirst getFirst() {
    return first;
  }

  /**
   * Gets the limit.
   *
   * The maximum number of resources that can be returned by the request.
   *
   * @return the limit
   */
  public Long getLimit() {
    return limit;
  }

  /**
   * Gets the next.
   *
   * A link to the next page of resources. This property is present for all pages
   * except the last page.
   *
   * @return the next
   */
  public OperatingSystemCollectionNext getNext() {
    return next;
  }

  /**
   * Gets the operatingSystems.
   *
   * Collection of operating systems.
   *
   * @return the operatingSystems
   */
  public List<OperatingSystem> getOperatingSystems() {
    return operatingSystems;
  }
}

