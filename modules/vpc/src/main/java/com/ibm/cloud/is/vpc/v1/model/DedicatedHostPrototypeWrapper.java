package com.ibm.cloud.is.vpc.v1.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

public class DedicatedHostPrototypeWrapper extends GenericModel {

  protected String id;
  protected String crn;
  protected String href;
  protected String name;
  @SerializedName("resource_group")
  protected ResourceGroupIdentity resourceGroup;

}
