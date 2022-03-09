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
 * The session persistence configuration. Specify `null` to remove any existing session persistence configuration.
 */
public class LoadBalancerPoolSessionPersistencePatch extends GenericModel {

  /**
   * The session persistence type. The `http_cookie` and `app_cookie` types are applicable only to the `http` and
   * `https` protocols.
   */
  public interface Type {
    /** app_cookie. */
    String APP_COOKIE = "app_cookie";
    /** http_cookie. */
    String HTTP_COOKIE = "http_cookie";
    /** source_ip. */
    String SOURCE_IP = "source_ip";
  }

  @SerializedName("cookie_name")
  protected String cookieName;
  protected String type;

  /**
   * Builder.
   */
  public static class Builder {
    private String cookieName;
    private String type;

    private Builder(LoadBalancerPoolSessionPersistencePatch loadBalancerPoolSessionPersistencePatch) {
      this.cookieName = loadBalancerPoolSessionPersistencePatch.cookieName;
      this.type = loadBalancerPoolSessionPersistencePatch.type;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a LoadBalancerPoolSessionPersistencePatch.
     *
     * @return the new LoadBalancerPoolSessionPersistencePatch instance
     */
    public LoadBalancerPoolSessionPersistencePatch build() {
      return new LoadBalancerPoolSessionPersistencePatch(this);
    }

    /**
     * Set the cookieName.
     *
     * @param cookieName the cookieName
     * @return the LoadBalancerPoolSessionPersistencePatch builder
     */
    public Builder cookieName(String cookieName) {
      this.cookieName = cookieName;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the LoadBalancerPoolSessionPersistencePatch builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }

  protected LoadBalancerPoolSessionPersistencePatch(Builder builder) {
    cookieName = builder.cookieName;
    type = builder.type;
  }

  /**
   * New builder.
   *
   * @return a LoadBalancerPoolSessionPersistencePatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the cookieName.
   *
   * The session persistence cookie name. Applicable only for type `app_cookie`. Names starting with `IBM` are not
   * allowed.
   *
   * @return the cookieName
   */
  public String cookieName() {
    return cookieName;
  }

  /**
   * Gets the type.
   *
   * The session persistence type. The `http_cookie` and `app_cookie` types are applicable only to the `http` and
   * `https` protocols.
   *
   * @return the type
   */
  public String type() {
    return type;
  }
}

