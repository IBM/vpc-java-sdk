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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * LoadBalancerProfileAccessModes.
 */
public class LoadBalancerProfileAccessModes extends GenericModel {

  /**
   * The type for this profile field.
   */
  public interface Type {
    /** enum. */
    String X_ENUM = "enum";
  }

  /**
   * The access mode for this load balancer:
   * - `private`: reachable from within its VPC, at IP addresses in `private_ips`
   * - `private_path`: reachable through an endpoint gateway
   * - `public`: reachable from the internet at the IP addresses in `public_ips`.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Values {
    /** private. */
    String X_PRIVATE = "private";
    /** private_path. */
    String PRIVATE_PATH = "private_path";
    /** public. */
    String X_PUBLIC = "public";
  }

  protected String type;
  protected List<String> values;

  protected LoadBalancerProfileAccessModes() { }

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
   * The access modes supported by load balancers with this profile.
   *
   * @return the values
   */
  public List<String> getValues() {
    return values;
  }
}

