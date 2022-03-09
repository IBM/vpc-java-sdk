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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * IKEPolicy.
 */
public class IKEPolicy extends GenericModel {

  /**
   * The authentication algorithm.
   */
  public interface AuthenticationAlgorithm {
    /** md5. */
    String MD5 = "md5";
    /** sha1. */
    String SHA1 = "sha1";
    /** sha256. */
    String SHA256 = "sha256";
    /** sha512. */
    String SHA512 = "sha512";
  }

  /**
   * The encryption algorithm.
   */
  public interface EncryptionAlgorithm {
    /** aes128. */
    String AES128 = "aes128";
    /** aes256. */
    String AES256 = "aes256";
    /** triple_des. */
    String TRIPLE_DES = "triple_des";
  }

  /**
   * The IKE negotiation mode. Only `main` is supported.
   */
  public interface NegotiationMode {
    /** main. */
    String MAIN = "main";
  }

  /**
   * The resource type.
   */
  public interface ResourceType {
    /** ike_policy. */
    String IKE_POLICY = "ike_policy";
  }

  @SerializedName("authentication_algorithm")
  protected String authenticationAlgorithm;
  protected List<VPNGatewayConnectionReference> connections;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("dh_group")
  protected Long dhGroup;
  @SerializedName("encryption_algorithm")
  protected String encryptionAlgorithm;
  protected String href;
  protected String id;
  @SerializedName("ike_version")
  protected Long ikeVersion;
  @SerializedName("key_lifetime")
  protected Long keyLifetime;
  protected String name;
  @SerializedName("negotiation_mode")
  protected String negotiationMode;
  @SerializedName("resource_group")
  protected ResourceGroupReference resourceGroup;
  @SerializedName("resource_type")
  protected String resourceType;

  /**
   * Gets the authenticationAlgorithm.
   *
   * The authentication algorithm.
   *
   * @return the authenticationAlgorithm
   */
  public String getAuthenticationAlgorithm() {
    return authenticationAlgorithm;
  }

  /**
   * Gets the connections.
   *
   * The VPN gateway connections that use this IKE policy.
   *
   * @return the connections
   */
  public List<VPNGatewayConnectionReference> getConnections() {
    return connections;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that this IKE policy was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the dhGroup.
   *
   * The Diffie-Hellman group.
   *
   * @return the dhGroup
   */
  public Long getDhGroup() {
    return dhGroup;
  }

  /**
   * Gets the encryptionAlgorithm.
   *
   * The encryption algorithm.
   *
   * @return the encryptionAlgorithm
   */
  public String getEncryptionAlgorithm() {
    return encryptionAlgorithm;
  }

  /**
   * Gets the href.
   *
   * The IKE policy's canonical URL.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this IKE policy.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the ikeVersion.
   *
   * The IKE protocol version.
   *
   * @return the ikeVersion
   */
  public Long getIkeVersion() {
    return ikeVersion;
  }

  /**
   * Gets the keyLifetime.
   *
   * The key lifetime in seconds.
   *
   * @return the keyLifetime
   */
  public Long getKeyLifetime() {
    return keyLifetime;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this IKE policy.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the negotiationMode.
   *
   * The IKE negotiation mode. Only `main` is supported.
   *
   * @return the negotiationMode
   */
  public String getNegotiationMode() {
    return negotiationMode;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group for this IKE policy.
   *
   * @return the resourceGroup
   */
  public ResourceGroupReference getResourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the resourceType.
   *
   * The resource type.
   *
   * @return the resourceType
   */
  public String getResourceType() {
    return resourceType;
  }
}

