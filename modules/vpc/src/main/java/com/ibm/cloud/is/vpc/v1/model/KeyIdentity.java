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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Identifies a key by a unique property.
 *
 * Classes which extend this class:
 * - KeyIdentityById
 * - KeyIdentityByCRN
 * - KeyIdentityByHref
 * - KeyIdentityByFingerprint
 */
public class KeyIdentity extends GenericModel {

  protected String id;
  protected String crn;
  protected String href;
  protected String fingerprint;

  protected KeyIdentity() { }

  /**
   * Gets the id.
   *
   * The unique identifier for this key.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the crn.
   *
   * The CRN for this key.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
  }

  /**
   * Gets the href.
   *
   * The URL for this key.
   *
   * @return the href
   */
  public String href() {
    return href;
  }

  /**
   * Gets the fingerprint.
   *
   * The fingerprint for this key.  The value is returned base64-encoded and prefixed with the hash algorithm (always
   * `SHA256`).
   *
   * @return the fingerprint
   */
  public String fingerprint() {
    return fingerprint;
  }
}

