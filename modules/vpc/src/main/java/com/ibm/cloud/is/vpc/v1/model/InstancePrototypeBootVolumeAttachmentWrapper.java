package com.ibm.cloud.is.vpc.v1.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

public class InstancePrototypeBootVolumeAttachmentWrapper extends GenericModel {
  @SerializedName("delete_volume_on_instance_delete")
  protected Boolean deleteVolumeOnInstanceDelete;
  protected String name;
  protected VolumeAttachmentPrototypeInstanceWrapper volume;
}
