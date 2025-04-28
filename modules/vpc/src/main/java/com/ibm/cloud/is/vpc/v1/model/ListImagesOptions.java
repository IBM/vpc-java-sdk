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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listImages options.
 */
public class ListImagesOptions extends GenericModel {

  public interface Status {
    /** available. */
    String AVAILABLE = "available";
    /** deleting. */
    String DELETING = "deleting";
    /** deprecated. */
    String DEPRECATED = "deprecated";
    /** failed. */
    String FAILED = "failed";
    /** obsolete. */
    String OBSOLETE = "obsolete";
    /** pending. */
    String PENDING = "pending";
    /** unusable. */
    String UNUSABLE = "unusable";
  }

  /**
   * Filters the collection to images with a `visibility` property matching the specified value.
   */
  public interface Visibility {
    /** private. */
    String X_PRIVATE = "private";
    /** public. */
    String X_PUBLIC = "public";
  }

  public interface UserDataFormat {
    /** cloud_init. */
    String CLOUD_INIT = "cloud_init";
    /** esxi_kickstart. */
    String ESXI_KICKSTART = "esxi_kickstart";
    /** ipxe. */
    String IPXE = "ipxe";
  }

  /**
   * Filters the collection to images with an `owner_type` property matching the specified value.
   */
  public interface OwnerType {
    /** provider. */
    String PROVIDER = "provider";
    /** user. */
    String USER = "user";
  }

  protected String start;
  protected Long limit;
  protected String resourceGroupId;
  protected String name;
  protected List<String> status;
  protected String visibility;
  protected List<String> userDataFormat;
  protected String ownerType;

  /**
   * Builder.
   */
  public static class Builder {
    private String start;
    private Long limit;
    private String resourceGroupId;
    private String name;
    private List<String> status;
    private String visibility;
    private List<String> userDataFormat;
    private String ownerType;

    /**
     * Instantiates a new Builder from an existing ListImagesOptions instance.
     *
     * @param listImagesOptions the instance to initialize the Builder with
     */
    private Builder(ListImagesOptions listImagesOptions) {
      this.start = listImagesOptions.start;
      this.limit = listImagesOptions.limit;
      this.resourceGroupId = listImagesOptions.resourceGroupId;
      this.name = listImagesOptions.name;
      this.status = listImagesOptions.status;
      this.visibility = listImagesOptions.visibility;
      this.userDataFormat = listImagesOptions.userDataFormat;
      this.ownerType = listImagesOptions.ownerType;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListImagesOptions.
     *
     * @return the new ListImagesOptions instance
     */
    public ListImagesOptions build() {
      return new ListImagesOptions(this);
    }

    /**
     * Adds a new element to status.
     *
     * @param status the new element to be added
     * @return the ListImagesOptions builder
     */
    public Builder addStatus(String status) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(status,
        "status cannot be null");
      if (this.status == null) {
        this.status = new ArrayList<String>();
      }
      this.status.add(status);
      return this;
    }

    /**
     * Adds a new element to userDataFormat.
     *
     * @param userDataFormat the new element to be added
     * @return the ListImagesOptions builder
     */
    public Builder addUserDataFormat(String userDataFormat) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(userDataFormat,
        "userDataFormat cannot be null");
      if (this.userDataFormat == null) {
        this.userDataFormat = new ArrayList<String>();
      }
      this.userDataFormat.add(userDataFormat);
      return this;
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListImagesOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListImagesOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the resourceGroupId.
     *
     * @param resourceGroupId the resourceGroupId
     * @return the ListImagesOptions builder
     */
    public Builder resourceGroupId(String resourceGroupId) {
      this.resourceGroupId = resourceGroupId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ListImagesOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the status.
     * Existing status will be replaced.
     *
     * @param status the status
     * @return the ListImagesOptions builder
     */
    public Builder status(List<String> status) {
      this.status = status;
      return this;
    }

    /**
     * Set the visibility.
     *
     * @param visibility the visibility
     * @return the ListImagesOptions builder
     */
    public Builder visibility(String visibility) {
      this.visibility = visibility;
      return this;
    }

    /**
     * Set the userDataFormat.
     * Existing userDataFormat will be replaced.
     *
     * @param userDataFormat the userDataFormat
     * @return the ListImagesOptions builder
     */
    public Builder userDataFormat(List<String> userDataFormat) {
      this.userDataFormat = userDataFormat;
      return this;
    }

    /**
     * Set the ownerType.
     *
     * @param ownerType the ownerType
     * @return the ListImagesOptions builder
     */
    public Builder ownerType(String ownerType) {
      this.ownerType = ownerType;
      return this;
    }
  }

  protected ListImagesOptions() { }

  protected ListImagesOptions(Builder builder) {
    start = builder.start;
    limit = builder.limit;
    resourceGroupId = builder.resourceGroupId;
    name = builder.name;
    status = builder.status;
    visibility = builder.visibility;
    userDataFormat = builder.userDataFormat;
    ownerType = builder.ownerType;
  }

  /**
   * New builder.
   *
   * @return a ListImagesOptions builder
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
   * Gets the resourceGroupId.
   *
   * Filters the collection to resources with a `resource_group.id` property matching the specified identifier.
   *
   * @return the resourceGroupId
   */
  public String resourceGroupId() {
    return resourceGroupId;
  }

  /**
   * Gets the name.
   *
   * Filters the collection to resources with a `name` property matching the exact specified name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the status.
   *
   * Filters the collection to images with a `status` property matching one of the specified comma-separated values.
   *
   * @return the status
   */
  public List<String> status() {
    return status;
  }

  /**
   * Gets the visibility.
   *
   * Filters the collection to images with a `visibility` property matching the specified value.
   *
   * @return the visibility
   */
  public String visibility() {
    return visibility;
  }

  /**
   * Gets the userDataFormat.
   *
   * Filters the collection to images with a `user_data_format` property matching one of the specified comma-separated
   * values.
   *
   * @return the userDataFormat
   */
  public List<String> userDataFormat() {
    return userDataFormat;
  }

  /**
   * Gets the ownerType.
   *
   * Filters the collection to images with an `owner_type` property matching the specified value.
   *
   * @return the ownerType
   */
  public String ownerType() {
    return ownerType;
  }
}

