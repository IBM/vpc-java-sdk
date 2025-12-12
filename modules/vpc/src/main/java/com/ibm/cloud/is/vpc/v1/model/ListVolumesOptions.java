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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listVolumes options.
 */
public class ListVolumesOptions extends GenericModel {

  /**
   * Filters the collection to volumes with an `attachment_state` property matching the specified value.
   */
  public interface AttachmentState {
    /** attached. */
    String ATTACHED = "attached";
    /** unattached. */
    String UNATTACHED = "unattached";
    /** unusable. */
    String UNUSABLE = "unusable";
  }

  /**
   * Filters the collection to resources with an `encryption` property matching the specified value.
   */
  public interface Encryption {
    /** provider_managed. */
    String PROVIDER_MANAGED = "provider_managed";
    /** user_managed. */
    String USER_MANAGED = "user_managed";
  }

  protected String start;
  protected Long limit;
  protected String attachmentState;
  protected String encryption;
  protected String name;
  protected String operatingSystemFamily;
  protected String operatingSystemArchitecture;
  protected String tag;
  protected String zoneName;

  /**
   * Builder.
   */
  public static class Builder {
    private String start;
    private Long limit;
    private String attachmentState;
    private String encryption;
    private String name;
    private String operatingSystemFamily;
    private String operatingSystemArchitecture;
    private String tag;
    private String zoneName;

    /**
     * Instantiates a new Builder from an existing ListVolumesOptions instance.
     *
     * @param listVolumesOptions the instance to initialize the Builder with
     */
    private Builder(ListVolumesOptions listVolumesOptions) {
      this.start = listVolumesOptions.start;
      this.limit = listVolumesOptions.limit;
      this.attachmentState = listVolumesOptions.attachmentState;
      this.encryption = listVolumesOptions.encryption;
      this.name = listVolumesOptions.name;
      this.operatingSystemFamily = listVolumesOptions.operatingSystemFamily;
      this.operatingSystemArchitecture = listVolumesOptions.operatingSystemArchitecture;
      this.tag = listVolumesOptions.tag;
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
     * Set the attachmentState.
     *
     * @param attachmentState the attachmentState
     * @return the ListVolumesOptions builder
     */
    public Builder attachmentState(String attachmentState) {
      this.attachmentState = attachmentState;
      return this;
    }

    /**
     * Set the encryption.
     *
     * @param encryption the encryption
     * @return the ListVolumesOptions builder
     */
    public Builder encryption(String encryption) {
      this.encryption = encryption;
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
     * Set the operatingSystemFamily.
     *
     * @param operatingSystemFamily the operatingSystemFamily
     * @return the ListVolumesOptions builder
     */
    public Builder operatingSystemFamily(String operatingSystemFamily) {
      this.operatingSystemFamily = operatingSystemFamily;
      return this;
    }

    /**
     * Set the operatingSystemArchitecture.
     *
     * @param operatingSystemArchitecture the operatingSystemArchitecture
     * @return the ListVolumesOptions builder
     */
    public Builder operatingSystemArchitecture(String operatingSystemArchitecture) {
      this.operatingSystemArchitecture = operatingSystemArchitecture;
      return this;
    }

    /**
     * Set the tag.
     *
     * @param tag the tag
     * @return the ListVolumesOptions builder
     */
    public Builder tag(String tag) {
      this.tag = tag;
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

  protected ListVolumesOptions() { }

  protected ListVolumesOptions(Builder builder) {
    start = builder.start;
    limit = builder.limit;
    attachmentState = builder.attachmentState;
    encryption = builder.encryption;
    name = builder.name;
    operatingSystemFamily = builder.operatingSystemFamily;
    operatingSystemArchitecture = builder.operatingSystemArchitecture;
    tag = builder.tag;
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
   * Gets the attachmentState.
   *
   * Filters the collection to volumes with an `attachment_state` property matching the specified value.
   *
   * @return the attachmentState
   */
  public String attachmentState() {
    return attachmentState;
  }

  /**
   * Gets the encryption.
   *
   * Filters the collection to resources with an `encryption` property matching the specified value.
   *
   * @return the encryption
   */
  public String encryption() {
    return encryption;
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
   * Gets the operatingSystemFamily.
   *
   * Filters the collection to resources with an `operating_system.family` property matching the specified operating
   * system family.
   *
   * This parameter also supports the values `null` and `not:null` which filter the collection to resources which have
   * no operating system or any operating system, respectively.
   *
   * @return the operatingSystemFamily
   */
  public String operatingSystemFamily() {
    return operatingSystemFamily;
  }

  /**
   * Gets the operatingSystemArchitecture.
   *
   * Filters the collection to resources with an `operating_system.architecture` property matching the specified
   * operating system architecture.
   *
   * This parameter also supports the values `null` and `not:null` which filter the collection to resources which have
   * no operating system or any operating system, respectively.
   *
   * @return the operatingSystemArchitecture
   */
  public String operatingSystemArchitecture() {
    return operatingSystemArchitecture;
  }

  /**
   * Gets the tag.
   *
   * Filters the collection to resources with an item in the `tags` property matching the exact specified tag.
   *
   * @return the tag
   */
  public String tag() {
    return tag;
  }

  /**
   * Gets the zoneName.
   *
   * Filters the collection to resources with a `zone.name` property matching the exact specified name.
   *
   * @return the zoneName
   */
  public String zoneName() {
    return zoneName;
  }
}

