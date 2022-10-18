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
 * InstanceCatalogOfferingPrototypeCatalogOfferingByVersion.
 */
public class InstanceCatalogOfferingPrototypeCatalogOfferingByVersion extends InstanceCatalogOfferingPrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private CatalogOfferingVersionIdentity version;

    /**
     * Instantiates a new Builder from an existing InstanceCatalogOfferingPrototypeCatalogOfferingByVersion instance.
     *
     * @param instanceCatalogOfferingPrototypeCatalogOfferingByVersion the instance to initialize the Builder with
     */
    public Builder(InstanceCatalogOfferingPrototype instanceCatalogOfferingPrototypeCatalogOfferingByVersion) {
      this.version = instanceCatalogOfferingPrototypeCatalogOfferingByVersion.version;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param version the version
     */
    public Builder(CatalogOfferingVersionIdentity version) {
      this.version = version;
    }

    /**
     * Builds a InstanceCatalogOfferingPrototypeCatalogOfferingByVersion.
     *
     * @return the new InstanceCatalogOfferingPrototypeCatalogOfferingByVersion instance
     */
    public InstanceCatalogOfferingPrototypeCatalogOfferingByVersion build() {
      return new InstanceCatalogOfferingPrototypeCatalogOfferingByVersion(this);
    }

    /**
     * Set the version.
     *
     * @param version the version
     * @return the InstanceCatalogOfferingPrototypeCatalogOfferingByVersion builder
     */
    public Builder version(CatalogOfferingVersionIdentity version) {
      this.version = version;
      return this;
    }
  }

  protected InstanceCatalogOfferingPrototypeCatalogOfferingByVersion() { }

  protected InstanceCatalogOfferingPrototypeCatalogOfferingByVersion(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.version,
      "version cannot be null");
    version = builder.version;
  }

  /**
   * New builder.
   *
   * @return a InstanceCatalogOfferingPrototypeCatalogOfferingByVersion builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

