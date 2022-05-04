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
 * ImageFile.
 */
public class ImageFile extends GenericModel {

  protected ImageFileChecksums checksums;
  protected Long size;

  /**
   * Gets the checksums.
   *
   * Checksums for this image file.
   *
   * This property may be absent if the associated image has a `status` of `pending` or
   * `failed`.
   *
   * @return the checksums
   */
  public ImageFileChecksums getChecksums() {
    return checksums;
  }

  /**
   * Gets the size.
   *
   * The size of the stored image file rounded up to the next gigabyte.
   *
   * This property may be absent if the associated image has a `status` of `pending` or
   * `failed`.
   *
   * @return the size
   */
  public Long getSize() {
    return size;
  }
}

