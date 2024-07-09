/*
 * (C) Copyright IBM Corp. 2022, 2023, 2024.
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
 * BackupPolicyPlanRemoteRegionPolicy.
 */
public class BackupPolicyPlanRemoteRegionPolicy extends GenericModel {

  @SerializedName("delete_over_count")
  protected Long deleteOverCount;
  @SerializedName("encryption_key")
  protected EncryptionKeyReference encryptionKey;
  protected RegionReference region;

  protected BackupPolicyPlanRemoteRegionPolicy() { }

  /**
   * Gets the deleteOverCount.
   *
   * The region this backup policy plan will create backups in.
   *
   * @return the deleteOverCount
   */
  public Long getDeleteOverCount() {
    return deleteOverCount;
  }

  /**
   * Gets the encryptionKey.
   *
   * The root key used to rewrap the data encryption key for the backup (snapshot).
   *
   * @return the encryptionKey
   */
  public EncryptionKeyReference getEncryptionKey() {
    return encryptionKey;
  }

  /**
   * Gets the region.
   *
   * The region this backup policy plan will create backups in.
   *
   * @return the region
   */
  public RegionReference getRegion() {
    return region;
  }
}

