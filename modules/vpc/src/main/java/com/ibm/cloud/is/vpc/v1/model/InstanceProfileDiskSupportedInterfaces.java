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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * InstanceProfileDiskSupportedInterfaces.
 */
public class InstanceProfileDiskSupportedInterfaces extends GenericModel {

  /**
   * The disk interface used for attaching the disk.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface XDefault {
    /** nvme. */
    String NVME = "nvme";
    /** virtio_blk. */
    String VIRTIO_BLK = "virtio_blk";
  }

  /**
   * The type for this profile field.
   */
  public interface Type {
    /** enum. */
    String X_ENUM = "enum";
  }

  /**
   * The disk interface used for attaching the disk.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Values {
    /** nvme. */
    String NVME = "nvme";
    /** virtio_blk. */
    String VIRTIO_BLK = "virtio_blk";
  }

  @SerializedName("default")
  protected String xDefault;
  protected String type;
  protected List<String> values;

  protected InstanceProfileDiskSupportedInterfaces() { }

  /**
   * Gets the xDefault.
   *
   * The disk interface used for attaching the disk.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the xDefault
   */
  public String getXDefault() {
    return xDefault;
  }

  /**
   * Gets the type.
   *
   * The type for this profile field.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the values.
   *
   * The supported disk interfaces used for attaching the disk.
   *
   * @return the values
   */
  public List<String> getValues() {
    return values;
  }
}

