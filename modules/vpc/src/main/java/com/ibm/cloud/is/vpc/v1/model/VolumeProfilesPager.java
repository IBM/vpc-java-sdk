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

import com.ibm.cloud.is.vpc.v1.Vpc;
import com.ibm.cloud.sdk.core.util.UrlHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * VolumeProfilesPager can be used to simplify the use of the "listVolumeProfiles" method.
 */
public class VolumeProfilesPager {
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
  protected ListVolumeProfilesOptions options;
  protected Vpc client;
  protected PageContext pageContext;

  // Hide the default ctor.
  protected VolumeProfilesPager() { }

  /**
   * Constructs a new VolumeProfilesPager instance with the specified client and options model instance.
   * @param client the Vpc instance to be used to invoke the "listVolumeProfiles" method
   * @param options the ListVolumeProfilesOptions instance to be used to invoke the "listVolumeProfiles" method
   */
  public VolumeProfilesPager(Vpc client, ListVolumeProfilesOptions options) {
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
   * @return a List&lt;VolumeProfile&gt; that contains the next page of results
   */
  public List<VolumeProfile> getNext() {
    if (!hasNext()) {
      throw new NoSuchElementException("No more results available");
    }

    ListVolumeProfilesOptions.Builder builder = this.options.newBuilder();
    if (this.pageContext.getNext() != null) {
      builder.start(this.pageContext.getNext());
    }
    this.options = builder.build();

    VolumeProfileCollection result = client.listVolumeProfiles(options).execute().getResult();

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

    return result.getProfiles();
  }

  /**
   * Returns all results by invoking getNext() repeatedly until all pages of results have been retrieved.
   * @return a List&lt;VolumeProfile&gt; containing all results returned by the "listVolumeProfiles" method
   */
  public List<VolumeProfile> getAll() {
    List<VolumeProfile> results = new ArrayList<>();
    while (hasNext()) {
      List<VolumeProfile> nextPage = getNext();
      results.addAll(nextPage);
    }
    return results;
  }
}
