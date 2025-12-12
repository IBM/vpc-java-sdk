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
 * ImageBareMetalServerProfileCollection.
 */
public class ImageBareMetalServerProfileCollection extends GenericModel {

  @SerializedName("bare_metal_server_profiles")
  protected List<BareMetalServerProfileReference> bareMetalServerProfiles;
  protected PageLink first;
  protected Long limit;
  protected PageLink next;
  @SerializedName("total_count")
  protected Long totalCount;

  protected ImageBareMetalServerProfileCollection() { }

  /**
   * Gets the bareMetalServerProfiles.
   *
   * A page of bare metal server profiles compatible with the image.
   *
   * @return the bareMetalServerProfiles
   */
  public List<BareMetalServerProfileReference> getBareMetalServerProfiles() {
    return bareMetalServerProfiles;
  }

  /**
   * Gets the first.
   *
   * A link to the first page of resources.
   *
   * @return the first
   */
  public PageLink getFirst() {
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
  public PageLink getNext() {
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

