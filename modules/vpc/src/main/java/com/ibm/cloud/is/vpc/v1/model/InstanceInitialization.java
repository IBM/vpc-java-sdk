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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * InstanceInitialization.
 */
public class InstanceInitialization extends GenericModel {

  @SerializedName("default_trusted_profile")
  protected InstanceInitializationDefaultTrustedProfile defaultTrustedProfile;
  protected List<KeyReference> keys;
  protected InstanceInitializationPassword password;

  protected InstanceInitialization() { }

  /**
   * Gets the defaultTrustedProfile.
   *
   * The default trusted profile configuration specified at virtual server instance
   * creation. If absent, no default trusted profile was specified.
   *
   * @return the defaultTrustedProfile
   */
  public InstanceInitializationDefaultTrustedProfile getDefaultTrustedProfile() {
    return defaultTrustedProfile;
  }

  /**
   * Gets the keys.
   *
   * The public SSH keys used at instance initialization.
   *
   * @return the keys
   */
  public List<KeyReference> getKeys() {
    return keys;
  }

  /**
   * Gets the password.
   *
   * @return the password
   */
  public InstanceInitializationPassword getPassword() {
    return password;
  }
}

