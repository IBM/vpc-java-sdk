/*
 * (C) Copyright IBM Corp. 2021.
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

/**
 * The identity of the auto scale manager to update and the property or properties to be updated. Exactly one of `id` or
 * `href` must be provided in addition to at least one of
 * `min_membership_count` and `max_membership_count`.
 *
 * Classes which extend this class:
 * - InstanceGroupManagerScheduledActionByManagerManagerAutoScalePrototypeInstanceGroupManagerScheduledActionManagerAutoScalePrototypeInstanceGroupManagerIdentityById
 * - InstanceGroupManagerScheduledActionByManagerManagerAutoScalePrototypeInstanceGroupManagerScheduledActionManagerAutoScalePrototypeInstanceGroupManagerIdentityByHref
 */
public class InstanceGroupManagerScheduledActionByManagerManagerAutoScalePrototype extends InstanceGroupManagerScheduledActionByManagerManager {


  protected InstanceGroupManagerScheduledActionByManagerManagerAutoScalePrototype() {
  }
}

