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
 * The possible resource types for this property are expected to expand in the future.
 *
 * Classes which extend this class:
 * - BareMetalServerBootTargetBareMetalServerDiskReference
 */
public class BareMetalServerBootTarget extends GenericModel {

  /**
   * The resource type.
   */
  public interface ResourceType {
    /** bare_metal_server_disk. */
    String BARE_METAL_SERVER_DISK = "bare_metal_server_disk";
  }

  protected BareMetalServerDiskReferenceDeleted deleted;
  protected String href;
  protected String id;
  protected String name;
  @SerializedName("resource_type")
  protected String resourceType;

  protected BareMetalServerBootTarget() {
  }

  /**
   * Gets the deleted.
   *
   * If present, this property indicates the referenced resource has been deleted and provides
   * some supplementary information.
   *
   * @return the deleted
   */
  public BareMetalServerDiskReferenceDeleted getDeleted() {
    return deleted;
  }

  /**
   * Gets the href.
   *
   * The URL for this bare metal server disk.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this bare metal server disk.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this disk.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the resourceType.
   *
   * The resource type.
   *
   * @return the resourceType
   */
  public String getResourceType() {
    return resourceType;
  }
}

