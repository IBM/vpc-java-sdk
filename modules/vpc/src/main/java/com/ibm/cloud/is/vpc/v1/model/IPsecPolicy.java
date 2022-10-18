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
 * IPsecPolicy.
 */
public class IPsecPolicy extends GenericModel {

  /**
   * The authentication algorithm
   *
   * The `md5` and `sha1` algorithms have been deprecated
   *
   * Must be `disabled` if and only if the `encryption_algorithm` is
   * `aes128gcm16`, `aes192gcm16`, or `aes256gcm16`.
   */
  public interface AuthenticationAlgorithm {
    /** disabled. */
    String DISABLED = "disabled";
    /** md5. */
    String MD5 = "md5";
    /** sha1. */
    String SHA1 = "sha1";
    /** sha256. */
    String SHA256 = "sha256";
    /** sha384. */
    String SHA384 = "sha384";
    /** sha512. */
    String SHA512 = "sha512";
  }

  /**
   * The encapsulation mode used. Only `tunnel` is supported.
   */
  public interface EncapsulationMode {
    /** tunnel. */
    String TUNNEL = "tunnel";
  }

  /**
   * The encryption algorithm
   *
   * The `triple_des` algorithm has been deprecated
   *
   * The `authentication_algorithm` must be `disabled` if and only if
   * `encryption_algorithm` is `aes128gcm16`, `aes192gcm16`, or
   * `aes256gcm16`.
   */
  public interface EncryptionAlgorithm {
    /** aes128. */
    String AES128 = "aes128";
    /** aes128gcm16. */
    String AES128GCM16 = "aes128gcm16";
    /** aes192. */
    String AES192 = "aes192";
    /** aes192gcm16. */
    String AES192GCM16 = "aes192gcm16";
    /** aes256. */
    String AES256 = "aes256";
    /** aes256gcm16. */
    String AES256GCM16 = "aes256gcm16";
    /** triple_des. */
    String TRIPLE_DES = "triple_des";
  }

  /**
   * Perfect Forward Secrecy
   *
   * Groups `group_2` and `group_5` have been deprecated.
   */
  public interface Pfs {
    /** disabled. */
    String DISABLED = "disabled";
    /** group_14. */
    String GROUP_14 = "group_14";
    /** group_15. */
    String GROUP_15 = "group_15";
    /** group_16. */
    String GROUP_16 = "group_16";
    /** group_17. */
    String GROUP_17 = "group_17";
    /** group_18. */
    String GROUP_18 = "group_18";
    /** group_19. */
    String GROUP_19 = "group_19";
    /** group_2. */
    String GROUP_2 = "group_2";
    /** group_20. */
    String GROUP_20 = "group_20";
    /** group_21. */
    String GROUP_21 = "group_21";
    /** group_22. */
    String GROUP_22 = "group_22";
    /** group_23. */
    String GROUP_23 = "group_23";
    /** group_24. */
    String GROUP_24 = "group_24";
    /** group_31. */
    String GROUP_31 = "group_31";
    /** group_5. */
    String GROUP_5 = "group_5";
  }

  /**
   * The resource type.
   */
  public interface ResourceType {
    /** ipsec_policy. */
    String IPSEC_POLICY = "ipsec_policy";
  }

  /**
   * The transform protocol used. Only `esp` is supported.
   */
  public interface TransformProtocol {
    /** esp. */
    String ESP = "esp";
  }

  @SerializedName("authentication_algorithm")
  protected String authenticationAlgorithm;
  protected List<VPNGatewayConnectionReference> connections;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("encapsulation_mode")
  protected String encapsulationMode;
  @SerializedName("encryption_algorithm")
  protected String encryptionAlgorithm;
  protected String href;
  protected String id;
  @SerializedName("key_lifetime")
  protected Long keyLifetime;
  protected String name;
  protected String pfs;
  @SerializedName("resource_group")
  protected ResourceGroupReference resourceGroup;
  @SerializedName("resource_type")
  protected String resourceType;
  @SerializedName("transform_protocol")
  protected String transformProtocol;

  protected IPsecPolicy() { }

  /**
   * Gets the authenticationAlgorithm.
   *
   * The authentication algorithm
   *
   * The `md5` and `sha1` algorithms have been deprecated
   *
   * Must be `disabled` if and only if the `encryption_algorithm` is
   * `aes128gcm16`, `aes192gcm16`, or `aes256gcm16`.
   *
   * @return the authenticationAlgorithm
   */
  public String getAuthenticationAlgorithm() {
    return authenticationAlgorithm;
  }

  /**
   * Gets the connections.
   *
   * The VPN gateway connections that use this IPsec policy.
   *
   * @return the connections
   */
  public List<VPNGatewayConnectionReference> getConnections() {
    return connections;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that this IPsec policy was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the encapsulationMode.
   *
   * The encapsulation mode used. Only `tunnel` is supported.
   *
   * @return the encapsulationMode
   */
  public String getEncapsulationMode() {
    return encapsulationMode;
  }

  /**
   * Gets the encryptionAlgorithm.
   *
   * The encryption algorithm
   *
   * The `triple_des` algorithm has been deprecated
   *
   * The `authentication_algorithm` must be `disabled` if and only if
   * `encryption_algorithm` is `aes128gcm16`, `aes192gcm16`, or
   * `aes256gcm16`.
   *
   * @return the encryptionAlgorithm
   */
  public String getEncryptionAlgorithm() {
    return encryptionAlgorithm;
  }

  /**
   * Gets the href.
   *
   * The IPsec policy's canonical URL.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this IPsec policy.
   *
   * @return the id
   */
  public String getId() {
    return id;
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
   * The user-defined name for this IPsec policy.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the pfs.
   *
   * Perfect Forward Secrecy
   *
   * Groups `group_2` and `group_5` have been deprecated.
   *
   * @return the pfs
   */
  public String getPfs() {
    return pfs;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group for this IPsec policy.
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

  /**
   * Gets the transformProtocol.
   *
   * The transform protocol used. Only `esp` is supported.
   *
   * @return the transformProtocol
   */
  public String getTransformProtocol() {
    return transformProtocol;
  }
}

