package com.ibm.cloud.is.vpc.v1.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

public class VolumeAttachmentPrototypeInstanceWrapper extends GenericModel {
  protected Long capacity;
  @SerializedName("encryption_key")
  protected EncryptionKeyIdentity encryptionKey;
  protected Long iops;
  protected String name;
  protected VolumeProfileIdentity profile;
  @SerializedName("source_snapshot")
  protected SnapshotIdentity sourceSnapshot;

}
