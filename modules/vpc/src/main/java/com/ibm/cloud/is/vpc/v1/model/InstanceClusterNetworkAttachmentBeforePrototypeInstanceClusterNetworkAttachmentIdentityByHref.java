/*
 * (C) Copyright IBM Corp. 2025.
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
 * InstanceClusterNetworkAttachmentBeforePrototypeInstanceClusterNetworkAttachmentIdentityByHref.
 */
public class InstanceClusterNetworkAttachmentBeforePrototypeInstanceClusterNetworkAttachmentIdentityByHref extends InstanceClusterNetworkAttachmentBeforePrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private String href;

    /**
     * Instantiates a new Builder from an existing InstanceClusterNetworkAttachmentBeforePrototypeInstanceClusterNetworkAttachmentIdentityByHref instance.
     *
     * @param instanceClusterNetworkAttachmentBeforePrototypeInstanceClusterNetworkAttachmentIdentityByHref the instance to initialize the Builder with
     */
    public Builder(InstanceClusterNetworkAttachmentBeforePrototype instanceClusterNetworkAttachmentBeforePrototypeInstanceClusterNetworkAttachmentIdentityByHref) {
      this.href = instanceClusterNetworkAttachmentBeforePrototypeInstanceClusterNetworkAttachmentIdentityByHref.href;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param href the href
     */
    public Builder(String href) {
      this.href = href;
    }

    /**
     * Builds a InstanceClusterNetworkAttachmentBeforePrototypeInstanceClusterNetworkAttachmentIdentityByHref.
     *
     * @return the new InstanceClusterNetworkAttachmentBeforePrototypeInstanceClusterNetworkAttachmentIdentityByHref instance
     */
    public InstanceClusterNetworkAttachmentBeforePrototypeInstanceClusterNetworkAttachmentIdentityByHref build() {
      return new InstanceClusterNetworkAttachmentBeforePrototypeInstanceClusterNetworkAttachmentIdentityByHref(this);
    }

    /**
     * Set the href.
     *
     * @param href the href
     * @return the InstanceClusterNetworkAttachmentBeforePrototypeInstanceClusterNetworkAttachmentIdentityByHref builder
     */
    public Builder href(String href) {
      this.href = href;
      return this;
    }
  }

  protected InstanceClusterNetworkAttachmentBeforePrototypeInstanceClusterNetworkAttachmentIdentityByHref() { }

  protected InstanceClusterNetworkAttachmentBeforePrototypeInstanceClusterNetworkAttachmentIdentityByHref(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.href,
      "href cannot be null");
    href = builder.href;
  }

  /**
   * New builder.
   *
   * @return a InstanceClusterNetworkAttachmentBeforePrototypeInstanceClusterNetworkAttachmentIdentityByHref builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

