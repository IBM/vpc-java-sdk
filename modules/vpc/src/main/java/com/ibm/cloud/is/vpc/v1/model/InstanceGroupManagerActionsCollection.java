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
 * InstanceGroupManagerActionsCollection.
 */
public class InstanceGroupManagerActionsCollection extends GenericModel {

  protected List<InstanceGroupManagerAction> actions;
  protected InstanceGroupManagerActionsCollectionFirst first;
  protected Long limit;
  protected InstanceGroupManagerActionsCollectionNext next;
  @SerializedName("total_count")
  protected Long totalCount;

  /**
   * Gets the actions.
   *
   * Collection of instance group manager actions.
   *
   * @return the actions
   */
  public List<InstanceGroupManagerAction> getActions() {
    return actions;
  }

  /**
   * Gets the first.
   *
   * A link to the first page of resources.
   *
   * @return the first
   */
  public InstanceGroupManagerActionsCollectionFirst getFirst() {
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
  public InstanceGroupManagerActionsCollectionNext getNext() {
    return next;
  }

  /**
   * Gets the totalCount.
   *
   * The total number of resources across all pages.
   *
   * @return the totalCount
   */
  public Long getTotalCount() {
    return totalCount;
  }
}

