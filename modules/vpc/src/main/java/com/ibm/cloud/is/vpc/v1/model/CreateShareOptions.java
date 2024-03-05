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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createShare options.
 */
public class CreateShareOptions extends GenericModel {

  protected SharePrototype sharePrototype;

  /**
   * Builder.
   */
  public static class Builder {
    private SharePrototype sharePrototype;

    /**
     * Instantiates a new Builder from an existing CreateShareOptions instance.
     *
     * @param createShareOptions the instance to initialize the Builder with
     */
    private Builder(CreateShareOptions createShareOptions) {
      this.sharePrototype = createShareOptions.sharePrototype;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param sharePrototype the sharePrototype
     */
    public Builder(SharePrototype sharePrototype) {
      this.sharePrototype = sharePrototype;
    }

    /**
     * Builds a CreateShareOptions.
     *
     * @return the new CreateShareOptions instance
     */
    public CreateShareOptions build() {
      return new CreateShareOptions(this);
    }

    /**
     * Set the sharePrototype.
     *
     * @param sharePrototype the sharePrototype
     * @return the CreateShareOptions builder
     */
    public Builder sharePrototype(SharePrototype sharePrototype) {
      this.sharePrototype = sharePrototype;
      return this;
    }
  }

  protected CreateShareOptions() { }

  protected CreateShareOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.sharePrototype,
      "sharePrototype cannot be null");
    sharePrototype = builder.sharePrototype;
  }

  /**
   * New builder.
   *
   * @return a CreateShareOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the sharePrototype.
   *
   * The file share prototype object.
   *
   * @return the sharePrototype
   */
  public SharePrototype sharePrototype() {
    return sharePrototype;
  }
}

