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
 * PublicGatewaysPager can be used to simplify the use of the "listPublicGateways" method.
 */
public class PublicGatewaysPager {
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
  protected ListPublicGatewaysOptions options;
  protected Vpc client;
  protected PageContext pageContext;

  // Hide the default ctor.
  protected PublicGatewaysPager() { }

  /**
   * Constructs a new PublicGatewaysPager instance with the specified client and options model instance.
   * @param client the Vpc instance to be used to invoke the "listPublicGateways" method
   * @param options the ListPublicGatewaysOptions instance to be used to invoke the "listPublicGateways" method
   */
  public PublicGatewaysPager(Vpc client, ListPublicGatewaysOptions options) {
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
   * @return a List&lt;PublicGateway&gt; that contains the next page of results
   */
  public List<PublicGateway> getNext() {
    if (!hasNext()) {
      throw new NoSuchElementException("No more results available");
    }

    ListPublicGatewaysOptions.Builder builder = this.options.newBuilder();
    if (this.pageContext.getNext() != null) {
      builder.start(this.pageContext.getNext());
    }
    this.options = builder.build();

    PublicGatewayCollection result = client.listPublicGateways(options).execute().getResult();

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

    return result.getPublicGateways();
  }

  /**
   * Returns all results by invoking getNext() repeatedly until all pages of results have been retrieved.
   * @return a List&lt;PublicGateway&gt; containing all results returned by the "listPublicGateways" method
   */
  public List<PublicGateway> getAll() {
    List<PublicGateway> results = new ArrayList<>();
    while (hasNext()) {
      List<PublicGateway> nextPage = getNext();
      results.addAll(nextPage);
    }
    return results;
  }
}
