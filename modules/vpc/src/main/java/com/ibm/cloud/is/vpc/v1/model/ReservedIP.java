/*
 * (C) Copyright IBM Corp. 2021.
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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * ReservedIP.
 */
public class ReservedIP extends GenericModel {

  /**
   * The owner of a reserved IP, defining whether it is managed by the user or the provider.
   */
  public interface Owner {
    /** provider. */
    String PROVIDER = "provider";
    /** user. */
    String USER = "user";
  }

  /**
   * The resource type.
   */
  public interface ResourceType {
    /** subnet_reserved_ip. */
    String SUBNET_RESERVED_IP = "subnet_reserved_ip";
  }

  protected String address;
  @SerializedName("auto_delete")
  protected Boolean autoDelete;
  @SerializedName("created_at")
  protected Date createdAt;
  protected String href;
  protected String id;
  protected String name;
  protected String owner;
  @SerializedName("resource_type")
  protected String resourceType;
  protected ReservedIPTarget target;

  /**
   * Gets the address.
   *
   * The IP address.
   *
   * If the address has not yet been selected, the value will be `0.0.0.0`.
   *
   * This property may add support for IPv6 addresses in the future. When processing a value in this property, verify
   * that the address is in an expected format. If it is not, log an error. Optionally halt processing and surface the
   * error, or bypass the resource on which the unexpected IP address format was encountered.
   *
   * @return the address
   */
  public String getAddress() {
    return address;
  }

  /**
   * Gets the autoDelete.
   *
   * If set to `true`, this reserved IP will be automatically deleted when the target is deleted or when the reserved IP
   * is unbound.
   *
   * @return the autoDelete
   */
  public Boolean isAutoDelete() {
    return autoDelete;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that the reserved IP was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the href.
   *
   * The URL for this reserved IP.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this reserved IP.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * The user-defined or system-provided name for this reserved IP.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the owner.
   *
   * The owner of a reserved IP, defining whether it is managed by the user or the provider.
   *
   * @return the owner
   */
  public String getOwner() {
    return owner;
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

  /**
   * Gets the target.
   *
   * The target of this reserved IP.
   *
   * @return the target
   */
  public ReservedIPTarget getTarget() {
    return target;
  }
}

