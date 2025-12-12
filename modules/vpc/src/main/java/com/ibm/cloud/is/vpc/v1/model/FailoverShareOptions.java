/*
 * (C) Copyright IBM Corp. 2025.
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
 * The failoverShare options.
 */
public class FailoverShareOptions extends GenericModel {

  /**
   * The action to take if the failover request is accepted but cannot be performed or times out:
   * - `fail`: Fail the operation, resulting in the replication relationship being unchanged.
   * - `split`: Split the replica from its source, resulting in two individual read-write
   *     file shares. Because the final sync was not completed, the replica may be
   *     out-of-date. This occurs in disaster recovery scenarios where the source is known to
   *     be unreachable.
   */
  public interface FallbackPolicy {
    /** fail. */
    String FAIL = "fail";
    /** split. */
    String SPLIT = "split";
  }

  protected String shareId;
  protected String fallbackPolicy;
  protected Long timeout;

  /**
   * Builder.
   */
  public static class Builder {
    private String shareId;
    private String fallbackPolicy;
    private Long timeout;

    /**
     * Instantiates a new Builder from an existing FailoverShareOptions instance.
     *
     * @param failoverShareOptions the instance to initialize the Builder with
     */
    private Builder(FailoverShareOptions failoverShareOptions) {
      this.shareId = failoverShareOptions.shareId;
      this.fallbackPolicy = failoverShareOptions.fallbackPolicy;
      this.timeout = failoverShareOptions.timeout;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param shareId the shareId
     */
    public Builder(String shareId) {
      this.shareId = shareId;
    }

    /**
     * Builds a FailoverShareOptions.
     *
     * @return the new FailoverShareOptions instance
     */
    public FailoverShareOptions build() {
      return new FailoverShareOptions(this);
    }

    /**
     * Set the shareId.
     *
     * @param shareId the shareId
     * @return the FailoverShareOptions builder
     */
    public Builder shareId(String shareId) {
      this.shareId = shareId;
      return this;
    }

    /**
     * Set the fallbackPolicy.
     *
     * @param fallbackPolicy the fallbackPolicy
     * @return the FailoverShareOptions builder
     */
    public Builder fallbackPolicy(String fallbackPolicy) {
      this.fallbackPolicy = fallbackPolicy;
      return this;
    }

    /**
     * Set the timeout.
     *
     * @param timeout the timeout
     * @return the FailoverShareOptions builder
     */
    public Builder timeout(long timeout) {
      this.timeout = timeout;
      return this;
    }
  }

  protected FailoverShareOptions() { }

  protected FailoverShareOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.shareId,
      "shareId cannot be empty");
    shareId = builder.shareId;
    fallbackPolicy = builder.fallbackPolicy;
    timeout = builder.timeout;
  }

  /**
   * New builder.
   *
   * @return a FailoverShareOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the shareId.
   *
   * The file share identifier.
   *
   * @return the shareId
   */
  public String shareId() {
    return shareId;
  }

  /**
   * Gets the fallbackPolicy.
   *
   * The action to take if the failover request is accepted but cannot be performed or times out:
   * - `fail`: Fail the operation, resulting in the replication relationship being unchanged.
   * - `split`: Split the replica from its source, resulting in two individual read-write
   *     file shares. Because the final sync was not completed, the replica may be
   *     out-of-date. This occurs in disaster recovery scenarios where the source is known to
   *     be unreachable.
   *
   * @return the fallbackPolicy
   */
  public String fallbackPolicy() {
    return fallbackPolicy;
  }

  /**
   * Gets the timeout.
   *
   * The failover timeout in seconds.
   *
   * If the timeout is reached, the `fallback_policy` will be triggered.
   *
   * @return the timeout
   */
  public Long timeout() {
    return timeout;
  }
}

