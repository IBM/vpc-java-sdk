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
 * ImageFileChecksums.
 */
public class ImageFileChecksums extends GenericModel {

  protected String sha256;

  protected ImageFileChecksums() { }

  /**
   * Gets the sha256.
   *
   * The SHA256 fingerprint of the image file.
   *
   * @return the sha256
   */
  public String getSha256() {
    return sha256;
  }
}

