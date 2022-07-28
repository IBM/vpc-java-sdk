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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * VPNServerPatch.
 */
public class VPNServerPatch extends GenericModel {

  /**
   * The transport protocol used by this VPN server.
   */
  public interface Protocol {
    /** tcp. */
    String TCP = "tcp";
    /** udp. */
    String UDP = "udp";
  }

  protected CertificateInstanceIdentity certificate;
  @SerializedName("client_authentication")
  protected List<VPNServerAuthenticationPrototype> clientAuthentication;
  @SerializedName("client_dns_server_ips")
  protected List<IP> clientDnsServerIps;
  @SerializedName("client_idle_timeout")
  protected Long clientIdleTimeout;
  @SerializedName("client_ip_pool")
  protected String clientIpPool;
  @SerializedName("enable_split_tunneling")
  protected Boolean enableSplitTunneling;
  protected String name;
  protected Long port;
  protected String protocol;
  protected List<SubnetIdentity> subnets;

  /**
   * Builder.
   */
  public static class Builder {
    private CertificateInstanceIdentity certificate;
    private List<VPNServerAuthenticationPrototype> clientAuthentication;
    private List<IP> clientDnsServerIps;
    private Long clientIdleTimeout;
    private String clientIpPool;
    private Boolean enableSplitTunneling;
    private String name;
    private Long port;
    private String protocol;
    private List<SubnetIdentity> subnets;

    private Builder(VPNServerPatch vpnServerPatch) {
      this.certificate = vpnServerPatch.certificate;
      this.clientAuthentication = vpnServerPatch.clientAuthentication;
      this.clientDnsServerIps = vpnServerPatch.clientDnsServerIps;
      this.clientIdleTimeout = vpnServerPatch.clientIdleTimeout;
      this.clientIpPool = vpnServerPatch.clientIpPool;
      this.enableSplitTunneling = vpnServerPatch.enableSplitTunneling;
      this.name = vpnServerPatch.name;
      this.port = vpnServerPatch.port;
      this.protocol = vpnServerPatch.protocol;
      this.subnets = vpnServerPatch.subnets;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a VPNServerPatch.
     *
     * @return the new VPNServerPatch instance
     */
    public VPNServerPatch build() {
      return new VPNServerPatch(this);
    }

    /**
     * Adds an clientAuthentication to clientAuthentication.
     *
     * @param clientAuthentication the new clientAuthentication
     * @return the VPNServerPatch builder
     */
    public Builder addClientAuthentication(VPNServerAuthenticationPrototype clientAuthentication) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(clientAuthentication,
        "clientAuthentication cannot be null");
      if (this.clientAuthentication == null) {
        this.clientAuthentication = new ArrayList<VPNServerAuthenticationPrototype>();
      }
      this.clientAuthentication.add(clientAuthentication);
      return this;
    }

    /**
     * Adds an clientDnsServerIps to clientDnsServerIps.
     *
     * @param clientDnsServerIps the new clientDnsServerIps
     * @return the VPNServerPatch builder
     */
    public Builder addClientDnsServerIps(IP clientDnsServerIps) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(clientDnsServerIps,
        "clientDnsServerIps cannot be null");
      if (this.clientDnsServerIps == null) {
        this.clientDnsServerIps = new ArrayList<IP>();
      }
      this.clientDnsServerIps.add(clientDnsServerIps);
      return this;
    }

    /**
     * Adds an subnets to subnets.
     *
     * @param subnets the new subnets
     * @return the VPNServerPatch builder
     */
    public Builder addSubnets(SubnetIdentity subnets) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(subnets,
        "subnets cannot be null");
      if (this.subnets == null) {
        this.subnets = new ArrayList<SubnetIdentity>();
      }
      this.subnets.add(subnets);
      return this;
    }

    /**
     * Set the certificate.
     *
     * @param certificate the certificate
     * @return the VPNServerPatch builder
     */
    public Builder certificate(CertificateInstanceIdentity certificate) {
      this.certificate = certificate;
      return this;
    }

    /**
     * Set the clientAuthentication.
     * Existing clientAuthentication will be replaced.
     *
     * @param clientAuthentication the clientAuthentication
     * @return the VPNServerPatch builder
     */
    public Builder clientAuthentication(List<VPNServerAuthenticationPrototype> clientAuthentication) {
      this.clientAuthentication = clientAuthentication;
      return this;
    }

    /**
     * Set the clientDnsServerIps.
     * Existing clientDnsServerIps will be replaced.
     *
     * @param clientDnsServerIps the clientDnsServerIps
     * @return the VPNServerPatch builder
     */
    public Builder clientDnsServerIps(List<IP> clientDnsServerIps) {
      this.clientDnsServerIps = clientDnsServerIps;
      return this;
    }

    /**
     * Set the clientIdleTimeout.
     *
     * @param clientIdleTimeout the clientIdleTimeout
     * @return the VPNServerPatch builder
     */
    public Builder clientIdleTimeout(long clientIdleTimeout) {
      this.clientIdleTimeout = clientIdleTimeout;
      return this;
    }

    /**
     * Set the clientIpPool.
     *
     * @param clientIpPool the clientIpPool
     * @return the VPNServerPatch builder
     */
    public Builder clientIpPool(String clientIpPool) {
      this.clientIpPool = clientIpPool;
      return this;
    }

    /**
     * Set the enableSplitTunneling.
     *
     * @param enableSplitTunneling the enableSplitTunneling
     * @return the VPNServerPatch builder
     */
    public Builder enableSplitTunneling(Boolean enableSplitTunneling) {
      this.enableSplitTunneling = enableSplitTunneling;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the VPNServerPatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the port.
     *
     * @param port the port
     * @return the VPNServerPatch builder
     */
    public Builder port(long port) {
      this.port = port;
      return this;
    }

    /**
     * Set the protocol.
     *
     * @param protocol the protocol
     * @return the VPNServerPatch builder
     */
    public Builder protocol(String protocol) {
      this.protocol = protocol;
      return this;
    }

    /**
     * Set the subnets.
     * Existing subnets will be replaced.
     *
     * @param subnets the subnets
     * @return the VPNServerPatch builder
     */
    public Builder subnets(List<SubnetIdentity> subnets) {
      this.subnets = subnets;
      return this;
    }
  }

  protected VPNServerPatch(Builder builder) {
    certificate = builder.certificate;
    clientAuthentication = builder.clientAuthentication;
    clientDnsServerIps = builder.clientDnsServerIps;
    clientIdleTimeout = builder.clientIdleTimeout;
    clientIpPool = builder.clientIpPool;
    enableSplitTunneling = builder.enableSplitTunneling;
    name = builder.name;
    port = builder.port;
    protocol = builder.protocol;
    subnets = builder.subnets;
  }

  /**
   * New builder.
   *
   * @return a VPNServerPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the certificate.
   *
   * The certificate instance for this VPN server.
   *
   * @return the certificate
   */
  public CertificateInstanceIdentity certificate() {
    return certificate;
  }

  /**
   * Gets the clientAuthentication.
   *
   * The authentication methods to use to authenticate VPN client on this VPN server
   * (replacing any existing methods).
   *
   * @return the clientAuthentication
   */
  public List<VPNServerAuthenticationPrototype> clientAuthentication() {
    return clientAuthentication;
  }

  /**
   * Gets the clientDnsServerIps.
   *
   * The DNS server addresses that will be provided to VPN clients connected to this VPN server (replacing any existing
   * addresses).
   *
   * @return the clientDnsServerIps
   */
  public List<IP> clientDnsServerIps() {
    return clientDnsServerIps;
  }

  /**
   * Gets the clientIdleTimeout.
   *
   * The seconds a VPN client can be idle before this VPN server will disconnect it.  If `0`, the server will not
   * disconnect idle clients.
   *
   * @return the clientIdleTimeout
   */
  public Long clientIdleTimeout() {
    return clientIdleTimeout;
  }

  /**
   * Gets the clientIpPool.
   *
   * The VPN client IPv4 address pool, expressed in CIDR format. The request must not overlap with any existing address
   * prefixes in the VPC or any of the following reserved address ranges:
   *   - `127.0.0.0/8` (IPv4 loopback addresses)
   *   - `161.26.0.0/16` (IBM services)
   *   - `166.8.0.0/14` (Cloud Service Endpoints)
   *   - `169.254.0.0/16` (IPv4 link-local addresses)
   *   - `224.0.0.0/4` (IPv4 multicast addresses)
   *
   * The prefix length of the client IP address pool's CIDR must be between
   * `/9` (8,388,608 addresses) and `/22` (1024 addresses). A CIDR block that contains twice the number of IP addresses
   * that are required to enable the maximum number of concurrent connections is recommended.
   *
   * @return the clientIpPool
   */
  public String clientIpPool() {
    return clientIpPool;
  }

  /**
   * Gets the enableSplitTunneling.
   *
   * Indicates whether the split tunneling is enabled on this VPN server.
   *
   * @return the enableSplitTunneling
   */
  public Boolean enableSplitTunneling() {
    return enableSplitTunneling;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this VPN server. Names must be unique within the VPC this VPN server is serving.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the port.
   *
   * The port number used by this VPN server.
   *
   * @return the port
   */
  public Long port() {
    return port;
  }

  /**
   * Gets the protocol.
   *
   * The transport protocol used by this VPN server.
   *
   * @return the protocol
   */
  public String protocol() {
    return protocol;
  }

  /**
   * Gets the subnets.
   *
   * The subnets to provision this VPN server in (replacing the existing subnets).
   *
   * @return the subnets
   */
  public List<SubnetIdentity> subnets() {
    return subnets;
  }

  /**
   * Construct a JSON merge-patch from the VPNServerPatch.
   *
   * Note that properties of the VPNServerPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the VPNServerPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }

}

