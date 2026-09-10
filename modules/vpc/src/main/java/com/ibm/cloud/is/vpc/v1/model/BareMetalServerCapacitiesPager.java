/*
 * (C) Copyright IBM Corp. 2023, 2024, 2025, 2026.
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

import com.ibm.cloud.is.vpc.v1.Vpc;
import com.ibm.cloud.sdk.core.util.UrlHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * BareMetalServerCapacitiesPager can be used to simplify the use of the "listBareMetalServerCapacities" method.
 */
public class BareMetalServerCapacitiesPager {
  private static class PageContext {
    private String next;
    public String getNext() {
      return next;
    }
    public void setNext(String next) {
      this.next = next;
    }
  }

  protected boolean hasNext;
  protected ListBareMetalServerCapacitiesOptions options;
  protected Vpc client;
  protected PageContext pageContext;

  // Hide the default ctor.
  protected BareMetalServerCapacitiesPager() { }

  /**
   * Constructs a new BareMetalServerCapacitiesPager instance with the specified client and options model instance.
   * @param client the Vpc instance to be used to invoke the "listBareMetalServerCapacities" method
   * @param options the ListBareMetalServerCapacitiesOptions instance to be used to invoke the "listBareMetalServerCapacities" method
   */
  public BareMetalServerCapacitiesPager(Vpc client, ListBareMetalServerCapacitiesOptions options) {
    if (options.start() != null) {
      throw new IllegalArgumentException("The options 'start' field should not be set");
    }

    this.hasNext = true;
    this.client = client;
    this.options = options.newBuilder().build();
    this.pageContext = new PageContext();
  }

  /**
   * Returns true if there are more results to be retrieved.
   * @return boolean
   */
  public boolean hasNext() {
    return hasNext;
  }

  /**
   * Returns the next page of results.
   * @return a List&lt;BareMetalServerCapacity&gt; that contains the next page of results
   */
  public List<BareMetalServerCapacity> getNext() {
    if (!hasNext()) {
      throw new NoSuchElementException("No more results available");
    }

    ListBareMetalServerCapacitiesOptions.Builder builder = this.options.newBuilder();
    if (this.pageContext.getNext() != null) {
      builder.start(this.pageContext.getNext());
    }
    this.options = builder.build();

    BareMetalServerCapacityCollection result = client.listBareMetalServerCapacities(options).execute().getResult();

    String next = null;
    if (result.getNext() != null) {
      String queryParam = UrlHelper.getQueryParam(result.getNext().getHref(), "start");
      if (queryParam != null) {
        next = queryParam;
      }
    }
    this.pageContext.setNext(next);
    if (next == null) {
      this.hasNext = false;
    }

    return result.getCapacities();
  }

  /**
   * Returns all results by invoking getNext() repeatedly until all pages of results have been retrieved.
   * @return a List&lt;BareMetalServerCapacity&gt; containing all results returned by the "listBareMetalServerCapacities" method
   */
  public List<BareMetalServerCapacity> getAll() {
    List<BareMetalServerCapacity> results = new ArrayList<>();
    while (hasNext()) {
      List<BareMetalServerCapacity> nextPage = getNext();
      results.addAll(nextPage);
    }
    return results;
  }
}
