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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * InstanceDefaultTrustedProfilePrototype.
 */
public class InstanceDefaultTrustedProfilePrototype extends GenericModel {

  @SerializedName("auto_link")
  protected Boolean autoLink;
  protected TrustedProfileIdentity target;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean autoLink;
    private TrustedProfileIdentity target;

    private Builder(InstanceDefaultTrustedProfilePrototype instanceDefaultTrustedProfilePrototype) {
      this.autoLink = instanceDefaultTrustedProfilePrototype.autoLink;
      this.target = instanceDefaultTrustedProfilePrototype.target;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param target the target
     */
    public Builder(TrustedProfileIdentity target) {
      this.target = target;
    }

    /**
     * Builds a InstanceDefaultTrustedProfilePrototype.
     *
     * @return the new InstanceDefaultTrustedProfilePrototype instance
     */
    public InstanceDefaultTrustedProfilePrototype build() {
      return new InstanceDefaultTrustedProfilePrototype(this);
    }

    /**
     * Set the autoLink.
     *
     * @param autoLink the autoLink
     * @return the InstanceDefaultTrustedProfilePrototype builder
     */
    public Builder autoLink(Boolean autoLink) {
      this.autoLink = autoLink;
      return this;
    }

    /**
     * Set the target.
     *
     * @param target the target
     * @return the InstanceDefaultTrustedProfilePrototype builder
     */
    public Builder target(TrustedProfileIdentity target) {
      this.target = target;
      return this;
    }
  }

  protected InstanceDefaultTrustedProfilePrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.target,
      "target cannot be null");
    autoLink = builder.autoLink;
    target = builder.target;
  }

  /**
   * New builder.
   *
   * @return a InstanceDefaultTrustedProfilePrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the autoLink.
   *
   * If set to `true`, the system will create a link to the specified `target` trusted profile during instance creation.
   * Regardless of whether a link is created by the system or manually using the IAM Identity service, it will be
   * automatically deleted when the instance is deleted.
   *
   * @return the autoLink
   */
  public Boolean autoLink() {
    return autoLink;
  }

  /**
   * Gets the target.
   *
   * The default IAM trusted profile to use for this virtual server instance.
   *
   * @return the target
   */
  public TrustedProfileIdentity target() {
    return target;
  }
}

