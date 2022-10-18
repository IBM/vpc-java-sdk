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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * NetworkACLPrototype.
 *
 * Classes which extend this class:
 * - NetworkACLPrototypeNetworkACLByRules
 * - NetworkACLPrototypeNetworkACLBySourceNetworkACL
 */
public class NetworkACLPrototype extends GenericModel {

  protected String name;
  @SerializedName("resource_group")
  protected ResourceGroupIdentity resourceGroup;
  protected VPCIdentity vpc;
  protected List<NetworkACLRulePrototypeNetworkACLContext> rules;
  @SerializedName("source_network_acl")
  protected NetworkACLIdentity sourceNetworkAcl;

  protected NetworkACLPrototype() { }

  /**
   * Gets the name.
   *
   * The user-defined name for this network ACL. Names must be unique within the VPC the network ACL resides in. If
   * unspecified, the name will be a hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
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
   * Gets the vpc.
   *
   * The VPC this network ACL will reside in.
   *
   * @return the vpc
   */
  public VPCIdentity vpc() {
    return vpc;
  }

  /**
   * Gets the rules.
   *
   * The prototype objects for rules to create along with this network ACL. If unspecified, no rules will be created,
   * resulting in all traffic being denied.
   *
   * @return the rules
   */
  public List<NetworkACLRulePrototypeNetworkACLContext> rules() {
    return rules;
  }

  /**
   * Gets the sourceNetworkAcl.
   *
   * Network ACL to copy rules from.
   *
   * @return the sourceNetworkAcl
   */
  public NetworkACLIdentity sourceNetworkAcl() {
    return sourceNetworkAcl;
  }
}

