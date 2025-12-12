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
 * BareMetalServerTrustedPlatformModulePatch.
 */
public class BareMetalServerTrustedPlatformModulePatch extends GenericModel {

  /**
   * The trusted platform module mode to use. The specified value must be listed in the bare metal server's
   * `supported_modes`.
   *
   * For the trusted platform module mode to be changed, the bare metal server `status` must be `stopped`.
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
     * Instantiates a new Builder from an existing BareMetalServerTrustedPlatformModulePatch instance.
     *
     * @param bareMetalServerTrustedPlatformModulePatch the instance to initialize the Builder with
     */
    private Builder(BareMetalServerTrustedPlatformModulePatch bareMetalServerTrustedPlatformModulePatch) {
      this.mode = bareMetalServerTrustedPlatformModulePatch.mode;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a BareMetalServerTrustedPlatformModulePatch.
     *
     * @return the new BareMetalServerTrustedPlatformModulePatch instance
     */
    public BareMetalServerTrustedPlatformModulePatch build() {
      return new BareMetalServerTrustedPlatformModulePatch(this);
    }

    /**
     * Set the mode.
     *
     * @param mode the mode
     * @return the BareMetalServerTrustedPlatformModulePatch builder
     */
    public Builder mode(String mode) {
      this.mode = mode;
      return this;
    }
  }

  protected BareMetalServerTrustedPlatformModulePatch() { }

  protected BareMetalServerTrustedPlatformModulePatch(Builder builder) {
    mode = builder.mode;
  }

  /**
   * New builder.
   *
   * @return a BareMetalServerTrustedPlatformModulePatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the mode.
   *
   * The trusted platform module mode to use. The specified value must be listed in the bare metal server's
   * `supported_modes`.
   *
   * For the trusted platform module mode to be changed, the bare metal server `status` must be `stopped`.
   *
   * @return the mode
   */
  public String mode() {
    return mode;
  }
}

