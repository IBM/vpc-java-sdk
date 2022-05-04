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
 * The listVolumes options.
 */
public class ListVolumesOptions extends GenericModel {

  protected String start;
  protected Long limit;
  protected String name;
  protected String zoneName;

  /**
   * Builder.
   */
  public static class Builder {
    private String start;
    private Long limit;
    private String name;
    private String zoneName;

    private Builder(ListVolumesOptions listVolumesOptions) {
      this.start = listVolumesOptions.start;
      this.limit = listVolumesOptions.limit;
      this.name = listVolumesOptions.name;
      this.zoneName = listVolumesOptions.zoneName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListVolumesOptions.
     *
     * @return the new ListVolumesOptions instance
     */
    public ListVolumesOptions build() {
      return new ListVolumesOptions(this);
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListVolumesOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListVolumesOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ListVolumesOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the zoneName.
     *
     * @param zoneName the zoneName
     * @return the ListVolumesOptions builder
     */
    public Builder zoneName(String zoneName) {
      this.zoneName = zoneName;
      return this;
    }
  }

  protected ListVolumesOptions(Builder builder) {
    start = builder.start;
    limit = builder.limit;
    name = builder.name;
    zoneName = builder.zoneName;
  }

  /**
   * New builder.
   *
   * @return a ListVolumesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the start.
   *
   * A server-provided token determining what resource to start the page on.
   *
   * @return the start
   */
  public String start() {
    return start;
  }

  /**
   * Gets the limit.
   *
   * The number of resources to return on a page.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }

  /**
   * Gets the name.
   *
   * Filters the collection to resources with the exact specified name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the zoneName.
   *
   * Filters the collection to resources in the zone with the exact specified name.
   *
   * @return the zoneName
   */
  public String zoneName() {
    return zoneName;
  }
}

