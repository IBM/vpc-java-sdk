package com.ibm.cloud.is.vpc.v1.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

public class VolumePrototypeInstance extends GenericModel {
  protected Long capacity;
  @SerializedName("encryption_key")
  protected EncryptionKeyIdentity encryptionKey;
  protected Long iops;
  protected String name;
  protected VolumeProfileIdentity profile;
  @SerializedName("resource_group")
  protected ResourceGroupIdentity resourceGroup;
  @SerializedName("source_snapshot")
  protected SnapshotIdentity sourceSnapshot;
  @SerializedName("user_tags")
  protected List<String> userTags;
  protected String id;
  protected String crn;
  protected String href;

}
