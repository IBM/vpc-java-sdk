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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateKey options.
 */
public class UpdateKeyOptions extends GenericModel {

  protected String id;
  protected Map<String, Object> keyPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Map<String, Object> keyPatch;

    private Builder(UpdateKeyOptions updateKeyOptions) {
      this.id = updateKeyOptions.id;
      this.keyPatch = updateKeyOptions.keyPatch;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     * @param keyPatch the keyPatch
     */
    public Builder(String id, Map<String, Object> keyPatch) {
      this.id = id;
      this.keyPatch = keyPatch;
    }

    /**
     * Builds a UpdateKeyOptions.
     *
     * @return the new UpdateKeyOptions instance
     */
    public UpdateKeyOptions build() {
      return new UpdateKeyOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateKeyOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the keyPatch.
     *
     * @param keyPatch the keyPatch
     * @return the UpdateKeyOptions builder
     */
    public Builder keyPatch(Map<String, Object> keyPatch) {
      this.keyPatch = keyPatch;
      return this;
    }
  }

  protected UpdateKeyOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.keyPatch,
      "keyPatch cannot be null");
    id = builder.id;
    keyPatch = builder.keyPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateKeyOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The key identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the keyPatch.
   *
   * The key patch.
   *
   * @return the keyPatch
   */
  public Map<String, Object> keyPatch() {
    return keyPatch;
  }
}

