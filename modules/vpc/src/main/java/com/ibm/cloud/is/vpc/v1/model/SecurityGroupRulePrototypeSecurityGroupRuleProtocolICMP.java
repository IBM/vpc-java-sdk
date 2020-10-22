/*
 * (C) Copyright IBM Corp. 2020.
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
 * When `protocol` is `icmp`, then the rule may also contain fields to specify an ICMP `type` and `code`. Field `code`
 * may only be specified if `type` is also specified. If type is not specified, then traffic is allowed for all types
 * and codes. If type is specified and code is not specified, then traffic is allowed with the specified type for all
 * codes.
 */
public class SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP extends SecurityGroupRulePrototype {

  /**
   * The direction of traffic to enforce, either `inbound` or `outbound`.
   */
  public interface Direction {
    /** inbound. */
    String INBOUND = "inbound";
    /** outbound. */
    String OUTBOUND = "outbound";
  }

  /**
   * The IP version to enforce. The format of `remote.address` or `remote.cidr_block` must match this field, if they are
   * used. Alternatively, if `remote` references a security group, then this rule only applies to IP addresses (network
   * interfaces) in that group matching this IP version.
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


  /**
   * Builder.
   */
  public static class Builder {
    private String direction;
    private String ipVersion;
    private String protocol;
    private SecurityGroupRulePrototypeRemote remote;
    private Long code;
    private Long type;

    public Builder(SecurityGroupRulePrototype securityGroupRulePrototypeSecurityGroupRuleProtocolIcmp) {
      this.direction = securityGroupRulePrototypeSecurityGroupRuleProtocolIcmp.direction;
      this.ipVersion = securityGroupRulePrototypeSecurityGroupRuleProtocolIcmp.ipVersion;
      this.protocol = securityGroupRulePrototypeSecurityGroupRuleProtocolIcmp.protocol;
      this.remote = securityGroupRulePrototypeSecurityGroupRuleProtocolIcmp.remote;
      this.code = securityGroupRulePrototypeSecurityGroupRuleProtocolIcmp.code;
      this.type = securityGroupRulePrototypeSecurityGroupRuleProtocolIcmp.type;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP.
     *
     * @return the new SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP instance
     */
    public SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP build() {
      return new SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP(this);
    }

    /**
     * Set the direction.
     *
     * @param direction the direction
     * @return the SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP builder
     */
    public Builder direction(String direction) {
      this.direction = direction;
      return this;
    }

    /**
     * Set the ipVersion.
     *
     * @param ipVersion the ipVersion
     * @return the SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP builder
     */
    public Builder ipVersion(String ipVersion) {
      this.ipVersion = ipVersion;
      return this;
    }

    /**
     * Set the protocol.
     *
     * @param protocol the protocol
     * @return the SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP builder
     */
    public Builder protocol(String protocol) {
      this.protocol = protocol;
      return this;
    }

    /**
     * Set the remote.
     *
     * @param remote the remote
     * @return the SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP builder
     */
    public Builder remote(SecurityGroupRulePrototypeRemote remote) {
      this.remote = remote;
      return this;
    }

    /**
     * Set the code.
     *
     * @param code the code
     * @return the SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP builder
     */
    public Builder code(long code) {
      this.code = code;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP builder
     */
    public Builder type(long type) {
      this.type = type;
      return this;
    }
  }

  protected SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.direction,
      "direction cannot be null");
    direction = builder.direction;
    ipVersion = builder.ipVersion;
    protocol = builder.protocol;
    remote = builder.remote;
    code = builder.code;
    type = builder.type;
  }

  /**
   * New builder.
   *
   * @return a SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

