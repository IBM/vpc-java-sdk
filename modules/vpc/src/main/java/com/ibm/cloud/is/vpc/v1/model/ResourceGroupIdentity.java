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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The resource group to use. If unspecified, the account's [default resource
 * group](https://cloud.ibm.com/apidocs/resource-manager#introduction) is used.
 *
 * Classes which extend this class:
 * - ResourceGroupIdentityById
 */
public class ResourceGroupIdentity extends GenericModel {

  protected String id;

  protected ResourceGroupIdentity() {
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this resource group.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

