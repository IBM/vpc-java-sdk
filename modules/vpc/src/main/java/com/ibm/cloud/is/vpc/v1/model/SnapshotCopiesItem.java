/*
 * (C) Copyright IBM Corp. 2022, 2023, 2024.
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
 * SnapshotCopiesItem.
 */
public class SnapshotCopiesItem extends GenericModel {

  /**
   * The resource type.
   */
  public interface ResourceType {
    /** snapshot. */
    String SNAPSHOT = "snapshot";
  }

  protected String crn;
  protected SnapshotReferenceDeleted deleted;
  protected String href;
  protected String id;
  protected String name;
  protected SnapshotRemote remote;
  @SerializedName("resource_type")
  protected String resourceType;

  protected SnapshotCopiesItem() { }

  /**
   * Gets the crn.
   *
   * The CRN for the copied snapshot.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the deleted.
   *
   * If present, this property indicates the referenced resource has been deleted, and provides
   * some supplementary information.
   *
   * @return the deleted
   */
  public SnapshotReferenceDeleted getDeleted() {
    return deleted;
  }

  /**
   * Gets the href.
   *
   * The URL for the copied snapshot.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for the copied snapshot.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * The name for the copied snapshot.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the remote.
   *
   * If present, this property indicates that the resource associated with this reference
   * is remote and therefore may not be directly retrievable.
   *
   * @return the remote
   */
  public SnapshotRemote getRemote() {
    return remote;
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

