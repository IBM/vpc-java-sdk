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
 * InstanceCatalogOfferingPrototypeCatalogOfferingByOffering.
 */
public class InstanceCatalogOfferingPrototypeCatalogOfferingByOffering extends InstanceCatalogOfferingPrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private CatalogOfferingIdentity offering;

    /**
     * Instantiates a new Builder from an existing InstanceCatalogOfferingPrototypeCatalogOfferingByOffering instance.
     *
     * @param instanceCatalogOfferingPrototypeCatalogOfferingByOffering the instance to initialize the Builder with
     */
    public Builder(InstanceCatalogOfferingPrototype instanceCatalogOfferingPrototypeCatalogOfferingByOffering) {
      this.offering = instanceCatalogOfferingPrototypeCatalogOfferingByOffering.offering;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param offering the offering
     */
    public Builder(CatalogOfferingIdentity offering) {
      this.offering = offering;
    }

    /**
     * Builds a InstanceCatalogOfferingPrototypeCatalogOfferingByOffering.
     *
     * @return the new InstanceCatalogOfferingPrototypeCatalogOfferingByOffering instance
     */
    public InstanceCatalogOfferingPrototypeCatalogOfferingByOffering build() {
      return new InstanceCatalogOfferingPrototypeCatalogOfferingByOffering(this);
    }

    /**
     * Set the offering.
     *
     * @param offering the offering
     * @return the InstanceCatalogOfferingPrototypeCatalogOfferingByOffering builder
     */
    public Builder offering(CatalogOfferingIdentity offering) {
      this.offering = offering;
      return this;
    }
  }

  protected InstanceCatalogOfferingPrototypeCatalogOfferingByOffering() { }

  protected InstanceCatalogOfferingPrototypeCatalogOfferingByOffering(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.offering,
      "offering cannot be null");
    offering = builder.offering;
  }

  /**
   * New builder.
   *
   * @return a InstanceCatalogOfferingPrototypeCatalogOfferingByOffering builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

