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
 * A rule specifying the ICMP traffic to allow.
 */
public class SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP extends SecurityGroupRulePrototype {

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
   * The name of the network protocol.
   */
  public interface Protocol {
    /** icmp. */
    String ICMP = "icmp";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String direction;
    private String ipVersion;
    private SecurityGroupRuleLocalPrototype local;
    private SecurityGroupRuleRemotePrototype remote;
    private Long code;
    private String protocol;
    private Long type;

    /**
     * Instantiates a new Builder from an existing SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP instance.
     *
     * @param securityGroupRulePrototypeSecurityGroupRuleProtocolIcmp the instance to initialize the Builder with
     */
    public Builder(SecurityGroupRulePrototype securityGroupRulePrototypeSecurityGroupRuleProtocolIcmp) {
      this.direction = securityGroupRulePrototypeSecurityGroupRuleProtocolIcmp.direction;
      this.ipVersion = securityGroupRulePrototypeSecurityGroupRuleProtocolIcmp.ipVersion;
      this.local = securityGroupRulePrototypeSecurityGroupRuleProtocolIcmp.local;
      this.remote = securityGroupRulePrototypeSecurityGroupRuleProtocolIcmp.remote;
      this.code = securityGroupRulePrototypeSecurityGroupRuleProtocolIcmp.code;
      this.protocol = securityGroupRulePrototypeSecurityGroupRuleProtocolIcmp.protocol;
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
     * Set the local.
     *
     * @param local the local
     * @return the SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP builder
     */
    public Builder local(SecurityGroupRuleLocalPrototype local) {
      this.local = local;
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

  protected SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP() { }

  protected SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.direction,
      "direction cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.protocol,
      "protocol cannot be null");
    direction = builder.direction;
    ipVersion = builder.ipVersion;
    local = builder.local;
    remote = builder.remote;
    code = builder.code;
    protocol = builder.protocol;
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

