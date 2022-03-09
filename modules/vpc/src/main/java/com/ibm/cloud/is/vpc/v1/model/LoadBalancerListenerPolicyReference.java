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
 * LoadBalancerListenerPolicyReference.
 */
public class LoadBalancerListenerPolicyReference extends GenericModel {

  protected LoadBalancerListenerPolicyReferenceDeleted deleted;
  protected String href;
  protected String id;

  /**
   * Gets the deleted.
   *
   * If present, this property indicates the referenced resource has been deleted and provides
   * some supplementary information.
   *
   * @return the deleted
   */
  public LoadBalancerListenerPolicyReferenceDeleted getDeleted() {
    return deleted;
  }

  /**
   * Gets the href.
   *
   * The listener policy's canonical URL.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The policy's unique identifier.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }
}

