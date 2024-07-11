/*
 * (C) Copyright IBM Corp. 2022, 2023, 2024.
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
 * FlowLogCollectorTargetInstanceNetworkAttachmentReference.
 */
public class FlowLogCollectorTargetInstanceNetworkAttachmentReference extends FlowLogCollectorTarget {

  /**
   * The resource type.
   */
  public interface ResourceType {
    /** instance_network_attachment. */
    String INSTANCE_NETWORK_ATTACHMENT = "instance_network_attachment";
  }


  protected FlowLogCollectorTargetInstanceNetworkAttachmentReference() { }
}

