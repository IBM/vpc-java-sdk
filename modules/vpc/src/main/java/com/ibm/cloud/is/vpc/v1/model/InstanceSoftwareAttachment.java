/*
 * (C) Copyright IBM Corp. 2023, 2024, 2025, 2026.
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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * InstanceSoftwareAttachment.
 */
public class InstanceSoftwareAttachment extends GenericModel {

  /**
   * The lifecycle state of the instance software attachment.
   */
  public interface LifecycleState {
    /** deleting. */
    String DELETING = "deleting";
    /** failed. */
    String FAILED = "failed";
    /** pending. */
    String PENDING = "pending";
    /** stable. */
    String STABLE = "stable";
    /** suspended. */
    String SUSPENDED = "suspended";
    /** updating. */
    String UPDATING = "updating";
    /** waiting. */
    String WAITING = "waiting";
  }

  /**
   * The resource type.
   */
  public interface ResourceType {
    /** instance_software_attachment. */
    String INSTANCE_SOFTWARE_ATTACHMENT = "instance_software_attachment";
  }

  @SerializedName("catalog_offering")
  protected InstanceSoftwareAttachmentCatalogOffering catalogOffering;
  @SerializedName("created_at")
  protected Date createdAt;
  protected InstanceSoftwareAttachmentEntitlement entitlement;
  protected String href;
  protected String id;
  @SerializedName("lifecycle_reasons")
  protected List<InstanceSoftwareAttachmentLifecycleReason> lifecycleReasons;
  @SerializedName("lifecycle_state")
  protected String lifecycleState;
  protected String name;
  @SerializedName("offering_instance")
  protected InstanceSoftwareAttachmentOfferingInstance offeringInstance;
  @SerializedName("resource_type")
  protected String resourceType;

  protected InstanceSoftwareAttachment() { }

  /**
   * Gets the catalogOffering.
   *
   * The [catalog](https://cloud.ibm.com/docs/account?topic=account-restrict-by-user)
   * offering for this instance software attachment. May be absent if
   * `software_attachment.lifecycle_state` is not `stable`.
   *
   * @return the catalogOffering
   */
  public InstanceSoftwareAttachmentCatalogOffering getCatalogOffering() {
    return catalogOffering;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that the instance software attachment was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the entitlement.
   *
   * The entitlement for the licensed software for this instance software attachment.
   *
   * @return the entitlement
   */
  public InstanceSoftwareAttachmentEntitlement getEntitlement() {
    return entitlement;
  }

  /**
   * Gets the href.
   *
   * The URL for this instance software attachment.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this instance software attachment.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the lifecycleReasons.
   *
   * The lifecycle reasons for this instance software attachment (if any).
   *
   * @return the lifecycleReasons
   */
  public List<InstanceSoftwareAttachmentLifecycleReason> getLifecycleReasons() {
    return lifecycleReasons;
  }

  /**
   * Gets the lifecycleState.
   *
   * The lifecycle state of the instance software attachment.
   *
   * @return the lifecycleState
   */
  public String getLifecycleState() {
    return lifecycleState;
  }

  /**
   * Gets the name.
   *
   * The name for this instance software attachment. The name is unique across all instance software attachments for the
   * instance.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the offeringInstance.
   *
   * @return the offeringInstance
   */
  public InstanceSoftwareAttachmentOfferingInstance getOfferingInstance() {
    return offeringInstance;
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

