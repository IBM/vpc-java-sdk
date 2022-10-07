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
 * BareMetalServerInitializationUserAccount.
 *
 * Classes which extend this class:
 * - BareMetalServerInitializationUserAccountBareMetalServerInitializationHostUserAccount
 */
public class BareMetalServerInitializationUserAccount extends GenericModel {

  /**
   * The resource type.
   */
  public interface ResourceType {
    /** host_user_account. */
    String HOST_USER_ACCOUNT = "host_user_account";
  }

  @SerializedName("encrypted_password")
  protected byte[] encryptedPassword;
  @SerializedName("encryption_key")
  protected KeyReference encryptionKey;
  @SerializedName("resource_type")
  protected String resourceType;
  protected String username;

  protected BareMetalServerInitializationUserAccount() { }

  /**
   * Gets the encryptedPassword.
   *
   * The password at initialization, encrypted using `encryption_key`, and returned base64-encoded.
   *
   * @return the encryptedPassword
   */
  public byte[] getEncryptedPassword() {
    return encryptedPassword;
  }

  /**
   * Gets the encryptionKey.
   *
   * The public SSH key used to encrypt the password.
   *
   * @return the encryptionKey
   */
  public KeyReference getEncryptionKey() {
    return encryptionKey;
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
   * Gets the username.
   *
   * The username for the account created at initialization.
   *
   * @return the username
   */
  public String getUsername() {
    return username;
  }
}

