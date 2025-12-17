/*
 * (C) Copyright IBM Corp. 2023, 2024, 2025.
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
 * LoadBalancerProfileTargetableResourceTypes.
 */
public class LoadBalancerProfileTargetableResourceTypes extends GenericModel {

  /**
   * The type for this profile field.
   */
  public interface Type {
    /** enum. */
    String X_ENUM = "enum";
  }

  /**
   * The [resource types](https://cloud.ibm.com/docs/vpc?topic=vpc-nlb-vs-elb&amp;interface=ui#lb-comparison-chart) that
   * can be targeted by the load balancer pool member:
   * - 'instance': Traffic is forwarded to the primary IP address for the instance's
   *   'primary_network_interface' or 'primary_network_attachment'.
   * - 'subnet_reserved_ip': Traffic is forwarded to the reserved IP address.
   * - `load_balancer`: Traffic is forwarded to the load balancer.
   * - `ip`: Traffic is forwarded to the IP address.
   */
  public interface Values {
    /** instance. */
    String INSTANCE = "instance";
    /** ip. */
    String IP = "ip";
    /** load_balancer. */
    String LOAD_BALANCER = "load_balancer";
    /** subnet_reserved_ip. */
    String SUBNET_RESERVED_IP = "subnet_reserved_ip";
  }

  protected String type;
  protected List<String> values;

  protected LoadBalancerProfileTargetableResourceTypes() { }

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
   * The resource types that pool members of load balancers with this profile can target.
   *
   * @return the values
   */
  public List<String> getValues() {
    return values;
  }
}

