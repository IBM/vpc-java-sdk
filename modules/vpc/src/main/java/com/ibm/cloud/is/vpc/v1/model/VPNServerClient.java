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

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * VPNServerClient.
 */
public class VPNServerClient extends GenericModel {

  /**
   * The resource type.
   */
  public interface ResourceType {
    /** vpn_server_client. */
    String VPN_SERVER_CLIENT = "vpn_server_client";
  }

  /**
   * The status of the VPN client:
   * - `connected`: the VPN client is `connected` to this VPN server.
   * - `disconnected`: the VPN client is `disconnected` from this VPN server.
   *
   * The enumerated values for this property are expected to expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the VPN client on which the
   * unexpected property value was encountered.
   */
  public interface Status {
    /** connected. */
    String CONNECTED = "connected";
    /** disconnected. */
    String DISCONNECTED = "disconnected";
  }

  @SerializedName("client_ip")
  protected IP clientIp;
  @SerializedName("common_name")
  protected String commonName;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("disconnected_at")
  protected Date disconnectedAt;
  protected String href;
  protected String id;
  @SerializedName("remote_ip")
  protected IP remoteIp;
  @SerializedName("remote_port")
  protected Long remotePort;
  @SerializedName("resource_type")
  protected String resourceType;
  protected String status;
  protected String username;

  /**
   * Gets the clientIp.
   *
   * The IP address assigned to this VPN client from `client_ip_pool`.
   *
   * @return the clientIp
   */
  public IP getClientIp() {
    return clientIp;
  }

  /**
   * Gets the commonName.
   *
   * The common name of client certificate that the VPN client provided when connecting to the server.
   *
   * This property will be present only when the `certificate` client authentication method is enabled on the VPN
   * server.
   *
   * @return the commonName
   */
  public String getCommonName() {
    return commonName;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that the VPN client was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the disconnectedAt.
   *
   * The date and time that the VPN client was disconnected.
   *
   * This property will be present only when the client `status` is `disconnected`.
   *
   * @return the disconnectedAt
   */
  public Date getDisconnectedAt() {
    return disconnectedAt;
  }

  /**
   * Gets the href.
   *
   * The URL for this VPN client.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this VPN client.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the remoteIp.
   *
   * The remote IP address of this VPN client.
   *
   * @return the remoteIp
   */
  public IP getRemoteIp() {
    return remoteIp;
  }

  /**
   * Gets the remotePort.
   *
   * The remote port of this VPN client.
   *
   * @return the remotePort
   */
  public Long getRemotePort() {
    return remotePort;
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
   * Gets the status.
   *
   * The status of the VPN client:
   * - `connected`: the VPN client is `connected` to this VPN server.
   * - `disconnected`: the VPN client is `disconnected` from this VPN server.
   *
   * The enumerated values for this property are expected to expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the VPN client on which the
   * unexpected property value was encountered.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the username.
   *
   * The username that this VPN client provided when connecting to the VPN server.
   *
   * This property will be present only when the `username` client authentication method is enabled on the VPN server.
   *
   * @return the username
   */
  public String getUsername() {
    return username;
  }
}

