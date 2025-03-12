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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The profile to use for this virtual server instance. Any disks associated with the current profile will be deleted,
 * and any disks associated with the requested profile will be created.
 *
 * For the profile to be changed, the instance `status` must be `stopping` or `stopped`. In addition, the requested
 * profile must:
 * - Be compatible with any `placement_target` constraints. For example, if the
 *   instance is placed on a dedicated host, the requested profile `family` must be
 *   the same as the dedicated host `family`.
 * - Have the same `vcpu.architecture`.
 * - Support the number of network attachments or network interfaces the instance
 *   currently has.
 *
 * Classes which extend this class:
 * - InstancePatchProfileInstanceProfileIdentityByName
 * - InstancePatchProfileInstanceProfileIdentityByHref
 */
public class InstancePatchProfile extends GenericModel {

  protected String name;
  protected String href;

  protected InstancePatchProfile() { }

  /**
   * Gets the name.
   *
   * The globally unique name for this virtual server instance profile.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the href.
   *
   * The URL for this virtual server instance profile.
   *
   * @return the href
   */
  public String href() {
    return href;
  }
}

