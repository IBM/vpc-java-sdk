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

/**
 * When `protocol` is `icmp`, the `type` property may optionally be specified. If specified, then ICMP traffic is
 * allowed only for the specified ICMP type. Further, if `type` is specified, the `code` property may optionally be
 * specified to allow traffic only for the specified ICMP code.
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
    /** icmp. */
    String ICMP = "icmp";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private Long code;
    private String direction;
    private String ipVersion;
    private String protocol;
    private SecurityGroupRuleRemotePrototype remote;
    private Long type;

    public Builder(SecurityGroupRulePrototype securityGroupRulePrototypeSecurityGroupRuleProtocolIcmp) {
      this.code = securityGroupRulePrototypeSecurityGroupRuleProtocolIcmp.code;
      this.direction = securityGroupRulePrototypeSecurityGroupRuleProtocolIcmp.direction;
      this.ipVersion = securityGroupRulePrototypeSecurityGroupRuleProtocolIcmp.ipVersion;
      this.protocol = securityGroupRulePrototypeSecurityGroupRuleProtocolIcmp.protocol;
      this.remote = securityGroupRulePrototypeSecurityGroupRuleProtocolIcmp.remote;
      this.type = securityGroupRulePrototypeSecurityGroupRuleProtocolIcmp.type;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param direction the direction
     * @param protocol the protocol
     */
    public Builder(String direction, String protocol) {
      this.direction = direction;
      this.protocol = protocol;
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
    public Builder remote(SecurityGroupRuleRemotePrototype remote) {
      this.remote = remote;
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
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.protocol,
      "protocol cannot be null");
    code = builder.code;
    direction = builder.direction;
    ipVersion = builder.ipVersion;
    protocol = builder.protocol;
    remote = builder.remote;
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

