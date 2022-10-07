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
 * KeyReference.
 */
public class KeyReference extends GenericModel {

  protected String crn;
  protected KeyReferenceDeleted deleted;
  protected String fingerprint;
  protected String href;
  protected String id;
  protected String name;

  protected KeyReference() { }

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
   * Gets the deleted.
   *
   * If present, this property indicates the referenced resource has been deleted, and provides
   * some supplementary information.
   *
   * @return the deleted
   */
  public KeyReferenceDeleted getDeleted() {
    return deleted;
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
   * Gets the name.
   *
   * The user-defined name for this key.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }
}

