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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * SecurityGroupRulePatch.
 */
public class SecurityGroupRulePatch extends GenericModel {

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

  protected Long code;
  protected String direction;
  @SerializedName("ip_version")
  protected String ipVersion;
  @SerializedName("port_max")
  protected Long portMax;
  @SerializedName("port_min")
  protected Long portMin;
  protected SecurityGroupRuleRemotePatch remote;
  protected Long type;

  /**
   * Builder.
   */
  public static class Builder {
    private Long code;
    private String direction;
    private String ipVersion;
    private Long portMax;
    private Long portMin;
    private SecurityGroupRuleRemotePatch remote;
    private Long type;

    /**
     * Instantiates a new Builder from an existing SecurityGroupRulePatch instance.
     *
     * @param securityGroupRulePatch the instance to initialize the Builder with
     */
    private Builder(SecurityGroupRulePatch securityGroupRulePatch) {
      this.code = securityGroupRulePatch.code;
      this.direction = securityGroupRulePatch.direction;
      this.ipVersion = securityGroupRulePatch.ipVersion;
      this.portMax = securityGroupRulePatch.portMax;
      this.portMin = securityGroupRulePatch.portMin;
      this.remote = securityGroupRulePatch.remote;
      this.type = securityGroupRulePatch.type;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SecurityGroupRulePatch.
     *
     * @return the new SecurityGroupRulePatch instance
     */
    public SecurityGroupRulePatch build() {
      return new SecurityGroupRulePatch(this);
    }

    /**
     * Set the code.
     *
     * @param code the code
     * @return the SecurityGroupRulePatch builder
     */
    public Builder code(long code) {
      this.code = code;
      return this;
    }

    /**
     * Set the direction.
     *
     * @param direction the direction
     * @return the SecurityGroupRulePatch builder
     */
    public Builder direction(String direction) {
      this.direction = direction;
      return this;
    }

    /**
     * Set the ipVersion.
     *
     * @param ipVersion the ipVersion
     * @return the SecurityGroupRulePatch builder
     */
    public Builder ipVersion(String ipVersion) {
      this.ipVersion = ipVersion;
      return this;
    }

    /**
     * Set the portMax.
     *
     * @param portMax the portMax
     * @return the SecurityGroupRulePatch builder
     */
    public Builder portMax(long portMax) {
      this.portMax = portMax;
      return this;
    }

    /**
     * Set the portMin.
     *
     * @param portMin the portMin
     * @return the SecurityGroupRulePatch builder
     */
    public Builder portMin(long portMin) {
      this.portMin = portMin;
      return this;
    }

    /**
     * Set the remote.
     *
     * @param remote the remote
     * @return the SecurityGroupRulePatch builder
     */
    public Builder remote(SecurityGroupRuleRemotePatch remote) {
      this.remote = remote;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the SecurityGroupRulePatch builder
     */
    public Builder type(long type) {
      this.type = type;
      return this;
    }
  }

  protected SecurityGroupRulePatch() { }

  protected SecurityGroupRulePatch(Builder builder) {
    code = builder.code;
    direction = builder.direction;
    ipVersion = builder.ipVersion;
    portMax = builder.portMax;
    portMin = builder.portMin;
    remote = builder.remote;
    type = builder.type;
  }

  /**
   * New builder.
   *
   * @return a SecurityGroupRulePatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the code.
   *
   * The ICMP traffic code to allow. If set, `type` must also be set.
   *
   * Specify `null` to remove an existing ICMP traffic code.
   *
   * @return the code
   */
  public Long code() {
    return code;
  }

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
   * Gets the portMax.
   *
   * The inclusive upper bound of the protocol port range. If set, `port_min` must also be set, and must not be larger.
   *
   * Specify `null` to remove an existing upper bound.
   *
   * @return the portMax
   */
  public Long portMax() {
    return portMax;
  }

  /**
   * Gets the portMin.
   *
   * The inclusive lower bound of the protocol port range. If set, `port_max` must also be set, and must not be smaller.
   *
   * Specify `null` to remove an existing lower bound.
   *
   * @return the portMin
   */
  public Long portMin() {
    return portMin;
  }

  /**
   * Gets the remote.
   *
   * The IP addresses or security groups from which this rule will allow traffic (or to
   * which, for outbound rules). Can be specified as an IP address, a CIDR block, or a
   * security group. A CIDR block of `0.0.0.0/0` will allow traffic from any source (or to
   * any destination, for outbound rules).
   *
   * @return the remote
   */
  public SecurityGroupRuleRemotePatch remote() {
    return remote;
  }

  /**
   * Gets the type.
   *
   * The ICMP traffic type to allow.
   *
   * Specify `null` to remove an existing ICMP traffic type value.
   *
   * @return the type
   */
  public Long type() {
    return type;
  }

  /**
   * Construct a JSON merge-patch from the SecurityGroupRulePatch.
   *
   * Note that properties of the SecurityGroupRulePatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the SecurityGroupRulePatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }

}

