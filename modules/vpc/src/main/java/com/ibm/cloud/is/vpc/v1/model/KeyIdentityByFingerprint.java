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

/**
 * KeyIdentityByFingerprint.
 */
public class KeyIdentityByFingerprint extends KeyIdentity {


  /**
   * Builder.
   */
  public static class Builder {
    private String fingerprint;

    /**
     * Instantiates a new Builder from an existing KeyIdentityByFingerprint instance.
     *
     * @param keyIdentityByFingerprint the instance to initialize the Builder with
     */
    public Builder(KeyIdentity keyIdentityByFingerprint) {
      this.fingerprint = keyIdentityByFingerprint.fingerprint;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param fingerprint the fingerprint
     */
    public Builder(String fingerprint) {
      this.fingerprint = fingerprint;
    }

    /**
     * Builds a KeyIdentityByFingerprint.
     *
     * @return the new KeyIdentityByFingerprint instance
     */
    public KeyIdentityByFingerprint build() {
      return new KeyIdentityByFingerprint(this);
    }

    /**
     * Set the fingerprint.
     *
     * @param fingerprint the fingerprint
     * @return the KeyIdentityByFingerprint builder
     */
    public Builder fingerprint(String fingerprint) {
      this.fingerprint = fingerprint;
      return this;
    }
  }

  protected KeyIdentityByFingerprint() { }

  protected KeyIdentityByFingerprint(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.fingerprint,
      "fingerprint cannot be null");
    fingerprint = builder.fingerprint;
  }

  /**
   * New builder.
   *
   * @return a KeyIdentityByFingerprint builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

