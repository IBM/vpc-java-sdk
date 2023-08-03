/*
 * (C) Copyright IBM Corp. 2021, 2022, 2023.
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
 * BackupPolicyPlanRemoteRegionPolicyPrototype.
 */
public class BackupPolicyPlanRemoteRegionPolicyPrototype extends GenericModel {

  @SerializedName("delete_over_count")
  protected Long deleteOverCount;
  @SerializedName("encryption_key")
  protected EncryptionKeyIdentity encryptionKey;
  protected RegionIdentity region;

  /**
   * Builder.
   */
  public static class Builder {
    private Long deleteOverCount;
    private EncryptionKeyIdentity encryptionKey;
    private RegionIdentity region;

    /**
     * Instantiates a new Builder from an existing BackupPolicyPlanRemoteRegionPolicyPrototype instance.
     *
     * @param backupPolicyPlanRemoteRegionPolicyPrototype the instance to initialize the Builder with
     */
    private Builder(BackupPolicyPlanRemoteRegionPolicyPrototype backupPolicyPlanRemoteRegionPolicyPrototype) {
      this.deleteOverCount = backupPolicyPlanRemoteRegionPolicyPrototype.deleteOverCount;
      this.encryptionKey = backupPolicyPlanRemoteRegionPolicyPrototype.encryptionKey;
      this.region = backupPolicyPlanRemoteRegionPolicyPrototype.region;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param region the region
     */
    public Builder(RegionIdentity region) {
      this.region = region;
    }

    /**
     * Builds a BackupPolicyPlanRemoteRegionPolicyPrototype.
     *
     * @return the new BackupPolicyPlanRemoteRegionPolicyPrototype instance
     */
    public BackupPolicyPlanRemoteRegionPolicyPrototype build() {
      return new BackupPolicyPlanRemoteRegionPolicyPrototype(this);
    }

    /**
     * Set the deleteOverCount.
     *
     * @param deleteOverCount the deleteOverCount
     * @return the BackupPolicyPlanRemoteRegionPolicyPrototype builder
     */
    public Builder deleteOverCount(long deleteOverCount) {
      this.deleteOverCount = deleteOverCount;
      return this;
    }

    /**
     * Set the encryptionKey.
     *
     * @param encryptionKey the encryptionKey
     * @return the BackupPolicyPlanRemoteRegionPolicyPrototype builder
     */
    public Builder encryptionKey(EncryptionKeyIdentity encryptionKey) {
      this.encryptionKey = encryptionKey;
      return this;
    }

    /**
     * Set the region.
     *
     * @param region the region
     * @return the BackupPolicyPlanRemoteRegionPolicyPrototype builder
     */
    public Builder region(RegionIdentity region) {
      this.region = region;
      return this;
    }
  }

  protected BackupPolicyPlanRemoteRegionPolicyPrototype() { }

  protected BackupPolicyPlanRemoteRegionPolicyPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.region,
      "region cannot be null");
    deleteOverCount = builder.deleteOverCount;
    encryptionKey = builder.encryptionKey;
    region = builder.region;
  }

  /**
   * New builder.
   *
   * @return a BackupPolicyPlanRemoteRegionPolicyPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the deleteOverCount.
   *
   * The region this backup policy plan will create backups in.
   *
   * @return the deleteOverCount
   */
  public Long deleteOverCount() {
    return deleteOverCount;
  }

  /**
   * Gets the encryptionKey.
   *
   * The root key to use to rewrap the data encryption key for the backup (snapshot).
   *
   * If unspecified, the source's `encryption_key` will be used.
   * The specified key may be in a different account, subject to IAM policies.
   *
   * @return the encryptionKey
   */
  public EncryptionKeyIdentity encryptionKey() {
    return encryptionKey;
  }

  /**
   * Gets the region.
   *
   * The region this backup policy plan will create backups in.
   *
   * @return the region
   */
  public RegionIdentity region() {
    return region;
  }
}

