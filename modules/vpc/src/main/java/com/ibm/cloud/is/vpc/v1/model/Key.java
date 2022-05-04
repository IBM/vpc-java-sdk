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
 * Key.
 */
public class Key extends GenericModel {

  /**
   * The crypto-system used by this key.
   */
  public interface Type {
    /** rsa. */
    String RSA = "rsa";
  }

  @SerializedName("created_at")
  protected Date createdAt;
  protected String crn;
  protected String fingerprint;
  protected String href;
  protected String id;
  protected Long length;
  protected String name;
  @SerializedName("public_key")
  protected String publicKey;
  @SerializedName("resource_group")
  protected ResourceGroupReference resourceGroup;
  protected String type;

  /**
   * Gets the createdAt.
   *
   * The date and time that the key was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the crn.
   *
   * The CRN for this key.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the fingerprint.
   *
   * The fingerprint for this key.  The value is returned base64-encoded and prefixed with the hash algorithm (always
   * `SHA256`).
   *
   * @return the fingerprint
   */
  public String getFingerprint() {
    return fingerprint;
  }

  /**
   * Gets the href.
   *
   * The URL for this key.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this key.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the length.
   *
   * The length of this key (in bits).
   *
   * @return the length
   */
  public Long getLength() {
    return length;
  }

  /**
   * Gets the name.
   *
   * The unique user-defined name for this key. If unspecified, the name will be a hyphenated list of randomly-selected
   * words.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the publicKey.
   *
   * The public SSH key, consisting of two space-separated fields: the algorithm name, and the base64-encoded key.
   *
   * @return the publicKey
   */
  public String getPublicKey() {
    return publicKey;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group for this key.
   *
   * @return the resourceGroup
   */
  public ResourceGroupReference getResourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the type.
   *
   * The crypto-system used by this key.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }
}

