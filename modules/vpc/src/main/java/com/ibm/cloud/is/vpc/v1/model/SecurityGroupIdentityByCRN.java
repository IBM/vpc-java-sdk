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

/**
 * SecurityGroupIdentityByCRN.
 */
public class SecurityGroupIdentityByCRN extends SecurityGroupIdentity {


  /**
   * Builder.
   */
  public static class Builder {
    private String crn;

    /**
     * Instantiates a new Builder from an existing SecurityGroupIdentityByCRN instance.
     *
     * @param securityGroupIdentityByCrn the instance to initialize the Builder with
     */
    public Builder(SecurityGroupIdentity securityGroupIdentityByCrn) {
      this.crn = securityGroupIdentityByCrn.crn;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param crn the crn
     */
    public Builder(String crn) {
      this.crn = crn;
    }

    /**
     * Builds a SecurityGroupIdentityByCRN.
     *
     * @return the new SecurityGroupIdentityByCRN instance
     */
    public SecurityGroupIdentityByCRN build() {
      return new SecurityGroupIdentityByCRN(this);
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the SecurityGroupIdentityByCRN builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }
  }

  protected SecurityGroupIdentityByCRN() { }

  protected SecurityGroupIdentityByCRN(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    crn = builder.crn;
  }

  /**
   * New builder.
   *
   * @return a SecurityGroupIdentityByCRN builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

