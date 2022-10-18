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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createVpnServer options.
 */
public class CreateVpnServerOptions extends GenericModel {

  /**
   * The transport protocol to use for this VPN server.
   */
  public interface Protocol {
    /** tcp. */
    String TCP = "tcp";
    /** udp. */
    String UDP = "udp";
  }

  protected CertificateInstanceIdentity certificate;
  protected List<VPNServerAuthenticationPrototype> clientAuthentication;
  protected String clientIpPool;
  protected List<SubnetIdentity> subnets;
  protected List<IP> clientDnsServerIps;
  protected Long clientIdleTimeout;
  protected Boolean enableSplitTunneling;
  protected String name;
  protected Long port;
  protected String protocol;
  protected ResourceGroupIdentity resourceGroup;
  protected List<SecurityGroupIdentity> securityGroups;

  /**
   * Builder.
   */
  public static class Builder {
    private CertificateInstanceIdentity certificate;
    private List<VPNServerAuthenticationPrototype> clientAuthentication;
    private String clientIpPool;
    private List<SubnetIdentity> subnets;
    private List<IP> clientDnsServerIps;
    private Long clientIdleTimeout;
    private Boolean enableSplitTunneling;
    private String name;
    private Long port;
    private String protocol;
    private ResourceGroupIdentity resourceGroup;
    private List<SecurityGroupIdentity> securityGroups;

    /**
     * Instantiates a new Builder from an existing CreateVpnServerOptions instance.
     *
     * @param createVpnServerOptions the instance to initialize the Builder with
     */
    private Builder(CreateVpnServerOptions createVpnServerOptions) {
      this.certificate = createVpnServerOptions.certificate;
      this.clientAuthentication = createVpnServerOptions.clientAuthentication;
      this.clientIpPool = createVpnServerOptions.clientIpPool;
      this.subnets = createVpnServerOptions.subnets;
      this.clientDnsServerIps = createVpnServerOptions.clientDnsServerIps;
      this.clientIdleTimeout = createVpnServerOptions.clientIdleTimeout;
      this.enableSplitTunneling = createVpnServerOptions.enableSplitTunneling;
      this.name = createVpnServerOptions.name;
      this.port = createVpnServerOptions.port;
      this.protocol = createVpnServerOptions.protocol;
      this.resourceGroup = createVpnServerOptions.resourceGroup;
      this.securityGroups = createVpnServerOptions.securityGroups;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param certificate the certificate
     * @param clientAuthentication the clientAuthentication
     * @param clientIpPool the clientIpPool
     * @param subnets the subnets
     */
    public Builder(CertificateInstanceIdentity certificate, List<VPNServerAuthenticationPrototype> clientAuthentication, String clientIpPool, List<SubnetIdentity> subnets) {
      this.certificate = certificate;
      this.clientAuthentication = clientAuthentication;
      this.clientIpPool = clientIpPool;
      this.subnets = subnets;
    }

    /**
     * Builds a CreateVpnServerOptions.
     *
     * @return the new CreateVpnServerOptions instance
     */
    public CreateVpnServerOptions build() {
      return new CreateVpnServerOptions(this);
    }

    /**
     * Adds an clientAuthentication to clientAuthentication.
     *
     * @param clientAuthentication the new clientAuthentication
     * @return the CreateVpnServerOptions builder
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
     * Adds an subnets to subnets.
     *
     * @param subnets the new subnets
     * @return the CreateVpnServerOptions builder
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
     * Adds an clientDnsServerIps to clientDnsServerIps.
     *
     * @param clientDnsServerIps the new clientDnsServerIps
     * @return the CreateVpnServerOptions builder
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
     * Adds an securityGroups to securityGroups.
     *
     * @param securityGroups the new securityGroups
     * @return the CreateVpnServerOptions builder
     */
    public Builder addSecurityGroups(SecurityGroupIdentity securityGroups) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(securityGroups,
        "securityGroups cannot be null");
      if (this.securityGroups == null) {
        this.securityGroups = new ArrayList<SecurityGroupIdentity>();
      }
      this.securityGroups.add(securityGroups);
      return this;
    }

    /**
     * Set the certificate.
     *
     * @param certificate the certificate
     * @return the CreateVpnServerOptions builder
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
     * @return the CreateVpnServerOptions builder
     */
    public Builder clientAuthentication(List<VPNServerAuthenticationPrototype> clientAuthentication) {
      this.clientAuthentication = clientAuthentication;
      return this;
    }

    /**
     * Set the clientIpPool.
     *
     * @param clientIpPool the clientIpPool
     * @return the CreateVpnServerOptions builder
     */
    public Builder clientIpPool(String clientIpPool) {
      this.clientIpPool = clientIpPool;
      return this;
    }

    /**
     * Set the subnets.
     * Existing subnets will be replaced.
     *
     * @param subnets the subnets
     * @return the CreateVpnServerOptions builder
     */
    public Builder subnets(List<SubnetIdentity> subnets) {
      this.subnets = subnets;
      return this;
    }

    /**
     * Set the clientDnsServerIps.
     * Existing clientDnsServerIps will be replaced.
     *
     * @param clientDnsServerIps the clientDnsServerIps
     * @return the CreateVpnServerOptions builder
     */
    public Builder clientDnsServerIps(List<IP> clientDnsServerIps) {
      this.clientDnsServerIps = clientDnsServerIps;
      return this;
    }

    /**
     * Set the clientIdleTimeout.
     *
     * @param clientIdleTimeout the clientIdleTimeout
     * @return the CreateVpnServerOptions builder
     */
    public Builder clientIdleTimeout(long clientIdleTimeout) {
      this.clientIdleTimeout = clientIdleTimeout;
      return this;
    }

    /**
     * Set the enableSplitTunneling.
     *
     * @param enableSplitTunneling the enableSplitTunneling
     * @return the CreateVpnServerOptions builder
     */
    public Builder enableSplitTunneling(Boolean enableSplitTunneling) {
      this.enableSplitTunneling = enableSplitTunneling;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateVpnServerOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the port.
     *
     * @param port the port
     * @return the CreateVpnServerOptions builder
     */
    public Builder port(long port) {
      this.port = port;
      return this;
    }

    /**
     * Set the protocol.
     *
     * @param protocol the protocol
     * @return the CreateVpnServerOptions builder
     */
    public Builder protocol(String protocol) {
      this.protocol = protocol;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the CreateVpnServerOptions builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the securityGroups.
     * Existing securityGroups will be replaced.
     *
     * @param securityGroups the securityGroups
     * @return the CreateVpnServerOptions builder
     */
    public Builder securityGroups(List<SecurityGroupIdentity> securityGroups) {
      this.securityGroups = securityGroups;
      return this;
    }
  }

  protected CreateVpnServerOptions() { }

  protected CreateVpnServerOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.certificate,
      "certificate cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.clientAuthentication,
      "clientAuthentication cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.clientIpPool,
      "clientIpPool cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.subnets,
      "subnets cannot be null");
    certificate = builder.certificate;
    clientAuthentication = builder.clientAuthentication;
    clientIpPool = builder.clientIpPool;
    subnets = builder.subnets;
    clientDnsServerIps = builder.clientDnsServerIps;
    clientIdleTimeout = builder.clientIdleTimeout;
    enableSplitTunneling = builder.enableSplitTunneling;
    name = builder.name;
    port = builder.port;
    protocol = builder.protocol;
    resourceGroup = builder.resourceGroup;
    securityGroups = builder.securityGroups;
  }

  /**
   * New builder.
   *
   * @return a CreateVpnServerOptions builder
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
   * The methods used to authenticate VPN clients to this VPN server. VPN clients must authenticate against all
   * specified methods.
   *
   * @return the clientAuthentication
   */
  public List<VPNServerAuthenticationPrototype> clientAuthentication() {
    return clientAuthentication;
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
   * Gets the subnets.
   *
   * The subnets to provision this VPN server in.  Use subnets in different zones for high availability.
   *
   * @return the subnets
   */
  public List<SubnetIdentity> subnets() {
    return subnets;
  }

  /**
   * Gets the clientDnsServerIps.
   *
   * The DNS server addresses that will be provided to VPN clients connected to this VPN server.
   *
   * @return the clientDnsServerIps
   */
  public List<IP> clientDnsServerIps() {
    return clientDnsServerIps;
  }

  /**
   * Gets the clientIdleTimeout.
   *
   * The seconds a VPN client can be idle before this VPN server will disconnect it.   Specify `0` to prevent the server
   * from disconnecting idle clients.
   *
   * @return the clientIdleTimeout
   */
  public Long clientIdleTimeout() {
    return clientIdleTimeout;
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
   * The user-defined name for this VPN server. If unspecified, the name will be a hyphenated list of randomly-selected
   * words. Names must be unique within the VPC this VPN server is serving.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the port.
   *
   * The port number to use for this VPN server.
   *
   * @return the port
   */
  public Long port() {
    return port;
  }

  /**
   * Gets the protocol.
   *
   * The transport protocol to use for this VPN server.
   *
   * @return the protocol
   */
  public String protocol() {
    return protocol;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group to use. If unspecified, the account's [default resource
   * group](https://cloud.ibm.com/apidocs/resource-manager#introduction) is used.
   *
   * @return the resourceGroup
   */
  public ResourceGroupIdentity resourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the securityGroups.
   *
   * The security groups to use for this VPN server. If unspecified, the VPC's default security group is used.
   *
   * @return the securityGroups
   */
  public List<SecurityGroupIdentity> securityGroups() {
    return securityGroups;
  }
}

