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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * SecurityGroupRule.
 *
 * Classes which extend this class:
 * - SecurityGroupRuleSecurityGroupRuleProtocolAll
 * - SecurityGroupRuleSecurityGroupRuleProtocolICMP
 * - SecurityGroupRuleSecurityGroupRuleProtocolTCPUDP
 */
public class SecurityGroupRule extends GenericModel {
  @SuppressWarnings("unused")
  protected static String discriminatorPropertyName = "protocol";
  protected static java.util.Map<String, Class<?>> discriminatorMapping;
  static {
    discriminatorMapping = new java.util.HashMap<>();
    discriminatorMapping.put("all", SecurityGroupRuleSecurityGroupRuleProtocolAll.class);
    discriminatorMapping.put("icmp", SecurityGroupRuleSecurityGroupRuleProtocolICMP.class);
    discriminatorMapping.put("tcp", SecurityGroupRuleSecurityGroupRuleProtocolTCPUDP.class);
    discriminatorMapping.put("udp", SecurityGroupRuleSecurityGroupRuleProtocolTCPUDP.class);
  }
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
   * The name of the network protocol to allow.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Protocol {
    /** all. */
    String ALL = "all";
    /** icmp. */
    String ICMP = "icmp";
    /** tcp. */
    String TCP = "tcp";
    /** udp. */
    String UDP = "udp";
  }

  protected String direction;
  protected String href;
  protected String id;
  @SerializedName("ip_version")
  protected String ipVersion;
  protected SecurityGroupRuleLocal local;
  protected String protocol;
  protected SecurityGroupRuleRemote remote;
  protected Long code;
  protected Long type;
  @SerializedName("port_max")
  protected Long portMax;
  @SerializedName("port_min")
  protected Long portMin;

  protected SecurityGroupRule() { }

  /**
   * Gets the direction.
   *
   * The direction of traffic to allow.
   *
   * @return the direction
   */
  public String getDirection() {
    return direction;
  }

  /**
   * Gets the href.
   *
   * The URL for this security group rule.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this security group rule.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the ipVersion.
   *
   * The IP version to allow. The format of `local.address`, `remote.address`,
   * `local.cidr_block` or `remote.cidr_block` must match this property, if they are used.
   *
   * If `remote` references a security group, then this rule only applies to IP addresses in that group matching this IP
   * version.
   *
   * @return the ipVersion
   */
  public String getIpVersion() {
    return ipVersion;
  }

  /**
   * Gets the local.
   *
   * The local IP address or range of local IP addresses to which this rule will allow inbound
   * traffic (or from which, for outbound traffic). A CIDR block of `0.0.0.0/0` allows traffic
   * to all local IP addresses (or from all local IP addresses, for outbound rules).
   *
   * @return the local
   */
  public SecurityGroupRuleLocal getLocal() {
    return local;
  }

  /**
   * Gets the protocol.
   *
   * The name of the network protocol to allow.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the protocol
   */
  public String getProtocol() {
    return protocol;
  }

  /**
   * Gets the remote.
   *
   * The remote IP addresses or security groups from which this rule allows traffic (or to
   * which, for outbound rules). A CIDR block of `0.0.0.0/0` allows traffic from any source
   * (or to any destination, for outbound rules).
   *
   * @return the remote
   */
  public SecurityGroupRuleRemote getRemote() {
    return remote;
  }

  /**
   * Gets the code.
   *
   * The ICMP traffic code to allow. If absent, all codes are allowed.
   *
   * @return the code
   */
  public Long getCode() {
    return code;
  }

  /**
   * Gets the type.
   *
   * The ICMP traffic type to allow. If absent, all types are allowed.
   *
   * @return the type
   */
  public Long getType() {
    return type;
  }

  /**
   * Gets the portMax.
   *
   * The inclusive upper bound of the TCP or UDP destination port range.
   *
   * @return the portMax
   */
  public Long getPortMax() {
    return portMax;
  }

  /**
   * Gets the portMin.
   *
   * The inclusive lower bound of the TCP or UDP destination port range.
   *
   * @return the portMin
   */
  public Long getPortMin() {
    return portMin;
  }
}

