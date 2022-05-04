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

import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * DedicatedHostProfileDiskSupportedInterfaces.
 */
public class DedicatedHostProfileDiskSupportedInterfaces extends GenericModel {

  /**
   * The type for this profile field.
   */
  public interface Type {
    /** fixed. */
    String FIXED = "fixed";
  }

  /**
   * The disk interface used for attaching the disk.
   *
   * The enumerated values for this property are expected to expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the resource on which the
   * unexpected property value was encountered.
   */
  public interface Value {
    /** nvme. */
    String NVME = "nvme";
    /** virtio_blk. */
    String VIRTIO_BLK = "virtio_blk";
  }

  protected String type;
  protected List<String> value;

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
   * Gets the value.
   *
   * The instance disk interfaces supported for a dedicated host with this profile.
   *
   * @return the value
   */
  public List<String> getValue() {
    return value;
  }
}

