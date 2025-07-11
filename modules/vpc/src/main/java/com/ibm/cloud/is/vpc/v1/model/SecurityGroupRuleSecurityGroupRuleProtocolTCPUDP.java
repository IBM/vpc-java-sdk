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

/**
 * A rule specifying the TCP or UDP traffic to allow.
 *
 * Either both `port_min` and `port_max` will be present, or neither. When neither is present, all destination ports are
 * allowed for the protocol. When both have the same value, that single destination port is allowed.
 */
public class SecurityGroupRuleSecurityGroupRuleProtocolTCPUDP extends SecurityGroupRule {

  /**
   * The direction of traffic to allow.
   */
  public interface Direction {
    /** inbound. */
    String INBOUND = "inbound";
    /** outbound. */
    String OUTBOUND = "outbound";
  }

  /**
   * The IP version to allow. The format of `local.address`, `remote.address`,
   * `local.cidr_block` or `remote.cidr_block` must match this property, if they are used.
   *
   * If `remote` references a security group, then this rule only applies to IP addresses in that group matching this IP
   * version.
   */
  public interface IpVersion {
    /** ipv4. */
    String IPV4 = "ipv4";
  }

  /**
   * The network protocol.
   */
  public interface Protocol {
    /** tcp. */
    String TCP = "tcp";
    /** udp. */
    String UDP = "udp";
  }


  protected SecurityGroupRuleSecurityGroupRuleProtocolTCPUDP() { }
}

