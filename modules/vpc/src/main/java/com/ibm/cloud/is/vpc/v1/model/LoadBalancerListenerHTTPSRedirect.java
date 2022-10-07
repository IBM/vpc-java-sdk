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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * LoadBalancerListenerHTTPSRedirect.
 */
public class LoadBalancerListenerHTTPSRedirect extends GenericModel {

  @SerializedName("http_status_code")
  protected Long httpStatusCode;
  protected LoadBalancerListenerReference listener;
  protected String uri;

  protected LoadBalancerListenerHTTPSRedirect() { }

  /**
   * Gets the httpStatusCode.
   *
   * The HTTP status code for this redirect.
   *
   * @return the httpStatusCode
   */
  public Long getHttpStatusCode() {
    return httpStatusCode;
  }

  /**
   * Gets the listener.
   *
   * @return the listener
   */
  public LoadBalancerListenerReference getListener() {
    return listener;
  }

  /**
   * Gets the uri.
   *
   * The redirect relative target URI.
   *
   * @return the uri
   */
  public String getUri() {
    return uri;
  }
}

