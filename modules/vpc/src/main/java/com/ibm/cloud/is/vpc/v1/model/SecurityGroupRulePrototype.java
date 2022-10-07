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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * SecurityGroupRulePrototype.
 *
 * Classes which extend this class:
 * - SecurityGroupRulePrototypeSecurityGroupRuleProtocolAll
 * - SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP
 * - SecurityGroupRulePrototypeSecurityGroupRuleProtocolTCPUDP
 */
public class SecurityGroupRulePrototype extends GenericModel {
  @SuppressWarnings("unused")
  protected static String discriminatorPropertyName = "protocol";
  protected static java.util.Map<String, Class<?>> discriminatorMapping;
  static {
    discriminatorMapping = new java.util.HashMap<>();
    discriminatorMapping.put("all", SecurityGroupRulePrototypeSecurityGroupRuleProtocolAll.class);
    discriminatorMapping.put("icmp", SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP.class);
    discriminatorMapping.put("tcp", SecurityGroupRulePrototypeSecurityGroupRuleProtocolTCPUDP.class);
    discriminatorMapping.put("udp", SecurityGroupRulePrototypeSecurityGroupRuleProtocolTCPUDP.class);
  }

  /**
   * The direction of traffic to enforce.
   */
  public interface Direction {
    /** inbound. */
    String INBOUND = "inbound";
    /** outbound. */
    String OUTBOUND = "outbound";
  }

  /**
   * The IP version to enforce. The format of `remote.address` or `remote.cidr_block` must match this property, if they
   * are used. Alternatively, if `remote` references a security group, then this rule only applies to IP addresses
   * (network interfaces) in that group matching this IP version.
   */
  public interface IpVersion {
    /** ipv4. */
    String IPV4 = "ipv4";
  }

  /**
   * The protocol to enforce.
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
  @SerializedName("ip_version")
  protected String ipVersion;
  protected String protocol;
  protected SecurityGroupRuleRemotePrototype remote;
  protected Long code;
  protected Long type;
  @SerializedName("port_max")
  protected Long portMax;
  @SerializedName("port_min")
  protected Long portMin;

  protected SecurityGroupRulePrototype() { }

  /**
   * Gets the direction.
   *
   * The direction of traffic to enforce.
   *
   * @return the direction
   */
  public String direction() {
    return direction;
  }

  /**
   * Gets the ipVersion.
   *
   * The IP version to enforce. The format of `remote.address` or `remote.cidr_block` must match this property, if they
   * are used. Alternatively, if `remote` references a security group, then this rule only applies to IP addresses
   * (network interfaces) in that group matching this IP version.
   *
   * @return the ipVersion
   */
  public String ipVersion() {
    return ipVersion;
  }

  /**
   * Gets the protocol.
   *
   * The protocol to enforce.
   *
   * @return the protocol
   */
  public String protocol() {
    return protocol;
  }

  /**
   * Gets the remote.
   *
   * The IP addresses or security groups from which this rule will allow traffic (or to which,
   * for outbound rules). Can be specified as an IP address, a CIDR block, or a security group
   * within the VPC.
   *
   * If unspecified, a CIDR block of `0.0.0.0/0` will be used to allow traffic from any source
   * (or to any destination, for outbound rules).
   *
   * @return the remote
   */
  public SecurityGroupRuleRemotePrototype remote() {
    return remote;
  }

  /**
   * Gets the code.
   *
   * The ICMP traffic code to allow.
   *
   * If specified, `type` must also be specified.  If unspecified, all codes are allowed.
   *
   * @return the code
   */
  public Long code() {
    return code;
  }

  /**
   * Gets the type.
   *
   * The ICMP traffic type to allow.
   *
   * If unspecified, all types are allowed.
   *
   * @return the type
   */
  public Long type() {
    return type;
  }

  /**
   * Gets the portMax.
   *
   * The inclusive upper bound of TCP/UDP port range.
   *
   * If specified, `port_min` must also be specified, and must not be larger. If unspecified, `port_min` must also be
   * unspecified, allowing traffic on all ports.
   *
   * @return the portMax
   */
  public Long portMax() {
    return portMax;
  }

  /**
   * Gets the portMin.
   *
   * The inclusive lower bound of TCP/UDP port range
   *
   * If specified, `port_max` must also be specified, and must not be smaller. If unspecified, `port_max` must also be
   * unspecified, allowing traffic on all ports.
   *
   * @return the portMin
   */
  public Long portMin() {
    return portMin;
  }
}

