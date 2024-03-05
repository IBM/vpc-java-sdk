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
 * BareMetalServerTrustedPlatformModulePrototype.
 */
public class BareMetalServerTrustedPlatformModulePrototype extends GenericModel {

  /**
   * The trusted platform module mode to use. The specified value must be listed in the bare metal server profile's
   * `supported_trusted_platform_module_modes`.
   */
  public interface Mode {
    /** disabled. */
    String DISABLED = "disabled";
    /** tpm_2. */
    String TPM_2 = "tpm_2";
  }

  protected String mode;

  /**
   * Builder.
   */
  public static class Builder {
    private String mode;

    /**
     * Instantiates a new Builder from an existing BareMetalServerTrustedPlatformModulePrototype instance.
     *
     * @param bareMetalServerTrustedPlatformModulePrototype the instance to initialize the Builder with
     */
    private Builder(BareMetalServerTrustedPlatformModulePrototype bareMetalServerTrustedPlatformModulePrototype) {
      this.mode = bareMetalServerTrustedPlatformModulePrototype.mode;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a BareMetalServerTrustedPlatformModulePrototype.
     *
     * @return the new BareMetalServerTrustedPlatformModulePrototype instance
     */
    public BareMetalServerTrustedPlatformModulePrototype build() {
      return new BareMetalServerTrustedPlatformModulePrototype(this);
    }

    /**
     * Set the mode.
     *
     * @param mode the mode
     * @return the BareMetalServerTrustedPlatformModulePrototype builder
     */
    public Builder mode(String mode) {
      this.mode = mode;
      return this;
    }
  }

  protected BareMetalServerTrustedPlatformModulePrototype() { }

  protected BareMetalServerTrustedPlatformModulePrototype(Builder builder) {
    mode = builder.mode;
  }

  /**
   * New builder.
   *
   * @return a BareMetalServerTrustedPlatformModulePrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the mode.
   *
   * The trusted platform module mode to use. The specified value must be listed in the bare metal server profile's
   * `supported_trusted_platform_module_modes`.
   *
   * @return the mode
   */
  public String mode() {
    return mode;
  }
}

