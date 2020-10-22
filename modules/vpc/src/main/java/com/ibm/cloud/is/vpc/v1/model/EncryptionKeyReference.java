/*
 * (C) Copyright IBM Corp. 2020.
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
 * EncryptionKeyReference.
 */
public class EncryptionKeyReference extends GenericModel {

  protected String crn;

  /**
   * Builder.
   */
  public static class Builder {
    private String crn;

    private Builder(EncryptionKeyReference encryptionKeyReference) {
      this.crn = encryptionKeyReference.crn;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param crn the crn
     */
    public Builder(String crn) {
      this.crn = crn;
    }

    /**
     * Builds a EncryptionKeyReference.
     *
     * @return the new EncryptionKeyReference instance
     */
    public EncryptionKeyReference build() {
      return new EncryptionKeyReference(this);
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the EncryptionKeyReference builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }
  }

  protected EncryptionKeyReference(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    crn = builder.crn;
  }

  /**
   * New builder.
   *
   * @return a EncryptionKeyReference builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the crn.
   *
   * The CRN of the [Key Protect Root
   * Key](https://cloud.ibm.com/docs/key-protect?topic=key-protect-getting-started-tutorial) or [Hyper Protect Crypto
   * Service Root Key](https://cloud.ibm.com/docs/hs-crypto?topic=hs-crypto-get-started) for this resource.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
  }
}

