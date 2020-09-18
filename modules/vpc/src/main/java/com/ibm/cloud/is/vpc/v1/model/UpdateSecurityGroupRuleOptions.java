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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateSecurityGroupRule options.
 */
public class UpdateSecurityGroupRuleOptions extends GenericModel {

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

  protected String securityGroupId;
  protected String id;
  protected SecurityGroupRulePatchRemote remote;
  protected String direction;
  protected String ipVersion;
  protected Long code;
  protected Long portMax;
  protected Long portMin;
  protected Long type;

  /**
   * Builder.
   */
  public static class Builder {
    private String securityGroupId;
    private String id;
    private SecurityGroupRulePatchRemote remote;
    private String direction;
    private String ipVersion;
    private Long code;
    private Long portMax;
    private Long portMin;
    private Long type;

    private Builder(UpdateSecurityGroupRuleOptions updateSecurityGroupRuleOptions) {
      this.securityGroupId = updateSecurityGroupRuleOptions.securityGroupId;
      this.id = updateSecurityGroupRuleOptions.id;
      this.remote = updateSecurityGroupRuleOptions.remote;
      this.direction = updateSecurityGroupRuleOptions.direction;
      this.ipVersion = updateSecurityGroupRuleOptions.ipVersion;
      this.code = updateSecurityGroupRuleOptions.code;
      this.portMax = updateSecurityGroupRuleOptions.portMax;
      this.portMin = updateSecurityGroupRuleOptions.portMin;
      this.type = updateSecurityGroupRuleOptions.type;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param securityGroupId the securityGroupId
     * @param id the id
     */
    public Builder(String securityGroupId, String id) {
      this.securityGroupId = securityGroupId;
      this.id = id;
    }

    /**
     * Builds a UpdateSecurityGroupRuleOptions.
     *
     * @return the new UpdateSecurityGroupRuleOptions instance
     */
    public UpdateSecurityGroupRuleOptions build() {
      return new UpdateSecurityGroupRuleOptions(this);
    }

    /**
     * Set the securityGroupId.
     *
     * @param securityGroupId the securityGroupId
     * @return the UpdateSecurityGroupRuleOptions builder
     */
    public Builder securityGroupId(String securityGroupId) {
      this.securityGroupId = securityGroupId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateSecurityGroupRuleOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the remote.
     *
     * @param remote the remote
     * @return the UpdateSecurityGroupRuleOptions builder
     */
    public Builder remote(SecurityGroupRulePatchRemote remote) {
      this.remote = remote;
      return this;
    }

    /**
     * Set the direction.
     *
     * @param direction the direction
     * @return the UpdateSecurityGroupRuleOptions builder
     */
    public Builder direction(String direction) {
      this.direction = direction;
      return this;
    }

    /**
     * Set the ipVersion.
     *
     * @param ipVersion the ipVersion
     * @return the UpdateSecurityGroupRuleOptions builder
     */
    public Builder ipVersion(String ipVersion) {
      this.ipVersion = ipVersion;
      return this;
    }

    /**
     * Set the code.
     *
     * @param code the code
     * @return the UpdateSecurityGroupRuleOptions builder
     */
    public Builder code(long code) {
      this.code = code;
      return this;
    }

    /**
     * Set the portMax.
     *
     * @param portMax the portMax
     * @return the UpdateSecurityGroupRuleOptions builder
     */
    public Builder portMax(long portMax) {
      this.portMax = portMax;
      return this;
    }

    /**
     * Set the portMin.
     *
     * @param portMin the portMin
     * @return the UpdateSecurityGroupRuleOptions builder
     */
    public Builder portMin(long portMin) {
      this.portMin = portMin;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the UpdateSecurityGroupRuleOptions builder
     */
    public Builder type(long type) {
      this.type = type;
      return this;
    }
  }

  protected UpdateSecurityGroupRuleOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.securityGroupId,
      "securityGroupId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    securityGroupId = builder.securityGroupId;
    id = builder.id;
    remote = builder.remote;
    direction = builder.direction;
    ipVersion = builder.ipVersion;
    code = builder.code;
    portMax = builder.portMax;
    portMin = builder.portMin;
    type = builder.type;
  }

  /**
   * New builder.
   *
   * @return a UpdateSecurityGroupRuleOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the securityGroupId.
   *
   * The security group identifier.
   *
   * @return the securityGroupId
   */
  public String securityGroupId() {
    return securityGroupId;
  }

  /**
   * Gets the id.
   *
   * The rule identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the remote.
   *
   * The IP addresses or security groups from which this rule will allow traffic (or to
   * which, for outbound rules). Can be specified as an IP address, a CIDR block, or a
   * security group. A CIDR block of `0.0.0.0/0` will allow traffic from any source (or to
   * any source, for outbound rules).
   *
   * @return the remote
   */
  public SecurityGroupRulePatchRemote remote() {
    return remote;
  }

  /**
   * Gets the direction.
   *
   * The direction of traffic to enforce, either `inbound` or `outbound`.
   *
   * @return the direction
   */
  public String direction() {
    return direction;
  }

  /**
   * Gets the ipVersion.
   *
   * The IP version to enforce. The format of `remote.address` or `remote.cidr_block` must match this field, if they are
   * used. Alternatively, if `remote` references a security group, then this rule only applies to IP addresses (network
   * interfaces) in that group matching this IP version.
   *
   * @return the ipVersion
   */
  public String ipVersion() {
    return ipVersion;
  }

  /**
   * Gets the code.
   *
   * The ICMP traffic code to allow.
   *
   * @return the code
   */
  public Long code() {
    return code;
  }

  /**
   * Gets the portMax.
   *
   * The inclusive upper bound of TCP/UDP port range.
   *
   * @return the portMax
   */
  public Long portMax() {
    return portMax;
  }

  /**
   * Gets the portMin.
   *
   * The inclusive lower bound of TCP/UDP port range.
   *
   * @return the portMin
   */
  public Long portMin() {
    return portMin;
  }

  /**
   * Gets the type.
   *
   * The ICMP traffic type to allow.
   *
   * @return the type
   */
  public Long type() {
    return type;
  }
}

