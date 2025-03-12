/*
 * (C) Copyright IBM Corp. 2023, 2024, 2025.
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
 * LoadBalancerPoolSessionPersistencePrototype.
 */
public class LoadBalancerPoolSessionPersistencePrototype extends GenericModel {

  /**
   * The session persistence type.
   *
   * If `http_cookie` or `app_cookie` is specified, the pool protocol must be `http` or
   * `https`.
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

    /**
     * Instantiates a new Builder from an existing LoadBalancerPoolSessionPersistencePrototype instance.
     *
     * @param loadBalancerPoolSessionPersistencePrototype the instance to initialize the Builder with
     */
    private Builder(LoadBalancerPoolSessionPersistencePrototype loadBalancerPoolSessionPersistencePrototype) {
      this.cookieName = loadBalancerPoolSessionPersistencePrototype.cookieName;
      this.type = loadBalancerPoolSessionPersistencePrototype.type;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param type the type
     */
    public Builder(String type) {
      this.type = type;
    }

    /**
     * Builds a LoadBalancerPoolSessionPersistencePrototype.
     *
     * @return the new LoadBalancerPoolSessionPersistencePrototype instance
     */
    public LoadBalancerPoolSessionPersistencePrototype build() {
      return new LoadBalancerPoolSessionPersistencePrototype(this);
    }

    /**
     * Set the cookieName.
     *
     * @param cookieName the cookieName
     * @return the LoadBalancerPoolSessionPersistencePrototype builder
     */
    public Builder cookieName(String cookieName) {
      this.cookieName = cookieName;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the LoadBalancerPoolSessionPersistencePrototype builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }

  protected LoadBalancerPoolSessionPersistencePrototype() { }

  protected LoadBalancerPoolSessionPersistencePrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    cookieName = builder.cookieName;
    type = builder.type;
  }

  /**
   * New builder.
   *
   * @return a LoadBalancerPoolSessionPersistencePrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the cookieName.
   *
   * The session persistence cookie name. Names starting with `IBM` are not allowed.
   *
   * If specified, the session persistence type must be `app_cookie`.
   *
   * @return the cookieName
   */
  public String cookieName() {
    return cookieName;
  }

  /**
   * Gets the type.
   *
   * The session persistence type.
   *
   * If `http_cookie` or `app_cookie` is specified, the pool protocol must be `http` or
   * `https`.
   *
   * @return the type
   */
  public String type() {
    return type;
  }
}

