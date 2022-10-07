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
 * The bare metal server console access token information.
 */
public class BareMetalServerConsoleAccessToken extends GenericModel {

  /**
   * The bare metal server console type for which this token may be used.
   */
  public interface ConsoleType {
    /** serial. */
    String SERIAL = "serial";
    /** vnc. */
    String VNC = "vnc";
  }

  @SerializedName("access_token")
  protected String accessToken;
  @SerializedName("console_type")
  protected String consoleType;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("expires_at")
  protected Date expiresAt;
  protected Boolean force;
  protected String href;

  protected BareMetalServerConsoleAccessToken() { }

  /**
   * Gets the accessToken.
   *
   * A URL safe single-use token used to access the console WebSocket.
   *
   * @return the accessToken
   */
  public String getAccessToken() {
    return accessToken;
  }

  /**
   * Gets the consoleType.
   *
   * The bare metal server console type for which this token may be used.
   *
   * @return the consoleType
   */
  public String getConsoleType() {
    return consoleType;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that the access token was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the expiresAt.
   *
   * The date and time that the access token will expire.
   *
   * @return the expiresAt
   */
  public Date getExpiresAt() {
    return expiresAt;
  }

  /**
   * Gets the force.
   *
   * Indicates whether to disconnect an existing serial console session as the serial console cannot be shared.  This
   * has no effect on VNC consoles.
   *
   * @return the force
   */
  public Boolean isForce() {
    return force;
  }

  /**
   * Gets the href.
   *
   * The URL to access this bare metal server console.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }
}

