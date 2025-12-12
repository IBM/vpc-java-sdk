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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * BareMetalServerInitializationDefaultTrustedProfile.
 */
public class BareMetalServerInitializationDefaultTrustedProfile extends GenericModel {

  @SerializedName("auto_link")
  protected Boolean autoLink;
  protected TrustedProfileReference target;

  protected BareMetalServerInitializationDefaultTrustedProfile() { }

  /**
   * Gets the autoLink.
   *
   * If set to `true`, the system created a link to the specified `target` trusted profile during server initialization.
   * Regardless of whether a link was created by the system or manually using the IAM Identity service, the link will be
   * automatically deleted when the server is deleted.
   *
   * @return the autoLink
   */
  public Boolean isAutoLink() {
    return autoLink;
  }

  /**
   * Gets the target.
   *
   * The default IAM trusted profile to use for this bare metal server.
   *
   * @return the target
   */
  public TrustedProfileReference getTarget() {
    return target;
  }
}

