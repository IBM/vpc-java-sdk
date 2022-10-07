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
 * The createSubnetReservedIp options.
 */
public class CreateSubnetReservedIpOptions extends GenericModel {

  protected String subnetId;
  protected String address;
  protected Boolean autoDelete;
  protected String name;
  protected ReservedIPTargetPrototype target;

  /**
   * Builder.
   */
  public static class Builder {
    private String subnetId;
    private String address;
    private Boolean autoDelete;
    private String name;
    private ReservedIPTargetPrototype target;

    /**
     * Instantiates a new Builder from an existing CreateSubnetReservedIpOptions instance.
     *
     * @param createSubnetReservedIpOptions the instance to initialize the Builder with
     */
    private Builder(CreateSubnetReservedIpOptions createSubnetReservedIpOptions) {
      this.subnetId = createSubnetReservedIpOptions.subnetId;
      this.address = createSubnetReservedIpOptions.address;
      this.autoDelete = createSubnetReservedIpOptions.autoDelete;
      this.name = createSubnetReservedIpOptions.name;
      this.target = createSubnetReservedIpOptions.target;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param subnetId the subnetId
     */
    public Builder(String subnetId) {
      this.subnetId = subnetId;
    }

    /**
     * Builds a CreateSubnetReservedIpOptions.
     *
     * @return the new CreateSubnetReservedIpOptions instance
     */
    public CreateSubnetReservedIpOptions build() {
      return new CreateSubnetReservedIpOptions(this);
    }

    /**
     * Set the subnetId.
     *
     * @param subnetId the subnetId
     * @return the CreateSubnetReservedIpOptions builder
     */
    public Builder subnetId(String subnetId) {
      this.subnetId = subnetId;
      return this;
    }

    /**
     * Set the address.
     *
     * @param address the address
     * @return the CreateSubnetReservedIpOptions builder
     */
    public Builder address(String address) {
      this.address = address;
      return this;
    }

    /**
     * Set the autoDelete.
     *
     * @param autoDelete the autoDelete
     * @return the CreateSubnetReservedIpOptions builder
     */
    public Builder autoDelete(Boolean autoDelete) {
      this.autoDelete = autoDelete;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateSubnetReservedIpOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the target.
     *
     * @param target the target
     * @return the CreateSubnetReservedIpOptions builder
     */
    public Builder target(ReservedIPTargetPrototype target) {
      this.target = target;
      return this;
    }
  }

  protected CreateSubnetReservedIpOptions() { }

  protected CreateSubnetReservedIpOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.subnetId,
      "subnetId cannot be empty");
    subnetId = builder.subnetId;
    address = builder.address;
    autoDelete = builder.autoDelete;
    name = builder.name;
    target = builder.target;
  }

  /**
   * New builder.
   *
   * @return a CreateSubnetReservedIpOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the subnetId.
   *
   * The subnet identifier.
   *
   * @return the subnetId
   */
  public String subnetId() {
    return subnetId;
  }

  /**
   * Gets the address.
   *
   * The IP address to reserve, which must not already be reserved on the subnet.
   *
   * If unspecified, an available address on the subnet will automatically be selected.
   *
   * @return the address
   */
  public String address() {
    return address;
  }

  /**
   * Gets the autoDelete.
   *
   * Indicates whether this reserved IP member will be automatically deleted when either
   * `target` is deleted, or the reserved IP is unbound. Must be `false` if the reserved IP is unbound.
   *
   * @return the autoDelete
   */
  public Boolean autoDelete() {
    return autoDelete;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this reserved IP. If unspecified, the name will be a hyphenated list of randomly-selected
   * words. Names must be unique within the subnet the reserved IP resides in. Names beginning with `ibm-` are reserved
   * for provider-owned resources.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the target.
   *
   * The target to bind this reserved IP to.  The target must be in the same VPC.
   *
   * At present, only endpoint gateway targets are supported.  The endpoint gateway must
   * not be already bound to a reserved IP in the subnet's zone.
   *
   * If unspecified, the reserved IP will be created unbound.
   *
   * @return the target
   */
  public ReservedIPTargetPrototype target() {
    return target;
  }
}

