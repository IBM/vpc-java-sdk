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

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * InstanceAction.
 */
public class InstanceAction extends GenericModel {

  /**
   * The current status of this action.
   */
  public interface Status {
    /** completed. */
    String COMPLETED = "completed";
    /** failed. */
    String FAILED = "failed";
    /** pending. */
    String PENDING = "pending";
    /** running. */
    String RUNNING = "running";
  }

  /**
   * The type of action.
   */
  public interface Type {
    /** reboot. */
    String REBOOT = "reboot";
    /** start. */
    String START = "start";
    /** stop. */
    String STOP = "stop";
  }

  @SerializedName("completed_at")
  protected Date completedAt;
  @SerializedName("created_at")
  protected Date createdAt;
  protected Boolean force;
  protected String href;
  protected String id;
  @SerializedName("started_at")
  protected Date startedAt;
  protected String status;
  protected String type;

  protected InstanceAction() { }

  /**
   * Gets the completedAt.
   *
   * The date and time that the action was completed.
   *
   * @return the completedAt
   */
  public Date getCompletedAt() {
    return completedAt;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that the action was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the force.
   *
   * If set to true, the action will be forced immediately, and all queued actions deleted. Ignored for the start
   * action.
   *
   * @return the force
   */
  public Boolean isForce() {
    return force;
  }

  /**
   * Gets the href.
   *
   * The URL for this instance action.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The identifier for this instance action.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the startedAt.
   *
   * The date and time that the action was started.
   *
   * @return the startedAt
   */
  public Date getStartedAt() {
    return startedAt;
  }

  /**
   * Gets the status.
   *
   * The current status of this action.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the type.
   *
   * The type of action.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }
}

