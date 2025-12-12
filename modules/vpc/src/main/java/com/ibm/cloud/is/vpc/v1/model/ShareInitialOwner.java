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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * ShareInitialOwner.
 */
public class ShareInitialOwner extends GenericModel {

  protected Long gid;
  protected Long uid;

  /**
   * Builder.
   */
  public static class Builder {
    private Long gid;
    private Long uid;

    /**
     * Instantiates a new Builder from an existing ShareInitialOwner instance.
     *
     * @param shareInitialOwner the instance to initialize the Builder with
     */
    private Builder(ShareInitialOwner shareInitialOwner) {
      this.gid = shareInitialOwner.gid;
      this.uid = shareInitialOwner.uid;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ShareInitialOwner.
     *
     * @return the new ShareInitialOwner instance
     */
    public ShareInitialOwner build() {
      return new ShareInitialOwner(this);
    }

    /**
     * Set the gid.
     *
     * @param gid the gid
     * @return the ShareInitialOwner builder
     */
    public Builder gid(long gid) {
      this.gid = gid;
      return this;
    }

    /**
     * Set the uid.
     *
     * @param uid the uid
     * @return the ShareInitialOwner builder
     */
    public Builder uid(long uid) {
      this.uid = uid;
      return this;
    }
  }

  protected ShareInitialOwner() { }

  protected ShareInitialOwner(Builder builder) {
    gid = builder.gid;
    uid = builder.uid;
  }

  /**
   * New builder.
   *
   * @return a ShareInitialOwner builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the gid.
   *
   * The initial group identifier for the file share.
   *
   * @return the gid
   */
  public Long gid() {
    return gid;
  }

  /**
   * Gets the uid.
   *
   * The initial user identifier for the file share.
   *
   * @return the uid
   */
  public Long uid() {
    return uid;
  }
}

