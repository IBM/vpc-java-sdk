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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * ShareProfileAllowedTransitEncryptionModes.
 *
 * Classes which extend this class:
 * - ShareProfileAllowedTransitEncryptionModesSubset
 */
public class ShareProfileAllowedTransitEncryptionModes extends GenericModel {

  public interface XDefault {
    /** ipsec. */
    String IPSEC = "ipsec";
    /** none. */
    String NONE = "none";
    /** stunnel. */
    String STUNNEL = "stunnel";
  }

  /**
   * The type for this profile field.
   */
  public interface Type {
    /** subset. */
    String SUBSET = "subset";
  }

  public interface Values {
    /** ipsec. */
    String IPSEC = "ipsec";
    /** none. */
    String NONE = "none";
    /** stunnel. */
    String STUNNEL = "stunnel";
  }

  @SerializedName("default")
  protected List<String> xDefault;
  protected String type;
  protected List<String> values;

  protected ShareProfileAllowedTransitEncryptionModes() { }

  /**
   * Gets the xDefault.
   *
   * The default allowed transit encryption modes for shares with this profile.
   *
   * @return the xDefault
   */
  public List<String> getXDefault() {
    return xDefault;
  }

  /**
   * Gets the type.
   *
   * The type for this profile field.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the values.
   *
   * The allowed [transit encryption
   * modes](https://cloud.ibm.com/docs/vpc?topic=vpc-file-storage-vpc-about&amp;interface=ui#fs-eit) for a share with
   * this profile:
   * - `none`: Not encrypted in transit.
   * - `ipsec`: Encrypted in transit using an instance identity certificate.
   * - `stunnel`: Encrypted in transit using a connection via an stunnel connection.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the values
   */
  public List<String> getValues() {
    return values;
  }
}

