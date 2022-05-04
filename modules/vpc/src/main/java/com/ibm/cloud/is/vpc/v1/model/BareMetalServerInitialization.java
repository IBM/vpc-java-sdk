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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * BareMetalServerInitialization.
 */
public class BareMetalServerInitialization extends GenericModel {

  protected ImageReference image;
  protected List<KeyReference> keys;
  @SerializedName("user_accounts")
  protected List<BareMetalServerInitializationUserAccount> userAccounts;

  /**
   * Gets the image.
   *
   * The image the bare metal server was provisioned from.
   *
   * @return the image
   */
  public ImageReference getImage() {
    return image;
  }

  /**
   * Gets the keys.
   *
   * The public SSH keys used at initialization.
   *
   * @return the keys
   */
  public List<KeyReference> getKeys() {
    return keys;
  }

  /**
   * Gets the userAccounts.
   *
   * The user accounts that are created at initialization. There can be multiple account types distinguished by the
   * `resource_type` property.
   *
   * @return the userAccounts
   */
  public List<BareMetalServerInitializationUserAccount> getUserAccounts() {
    return userAccounts;
  }
}

