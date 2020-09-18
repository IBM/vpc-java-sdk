/*
 * (C) Copyright IBM Corp. 2020.
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

package com.ibm.cloud.is.vpc.v1;

import com.ibm.cloud.is.vpc.v1.model.InstanceCollection;
import com.ibm.cloud.is.vpc.v1.model.ListInstancesOptions;

import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ibm.cloud.sdk.core.http.Response;

public class VPCExamples {

  private static final Logger logger = LoggerFactory.getLogger(VPCExamples.class);
  protected VPCExamples() { }

  static {
      System.setProperty("IBM_CREDENTIALS_FILE", "../../vpc.env");
  }

  public static void main(String[] args) throws Exception {

    Vpc service = Vpc.newInstance();

    try {
      // begin-list_instances
      ListInstancesOptions listInstancesOptions = new ListInstancesOptions.Builder()
      .build();

      Response<InstanceCollection> response = service.listInstances(listInstancesOptions).execute();

      InstanceCollection instanceCollectionResult = response.getResult();
      System.out.println("List instances:\n" + instanceCollectionResult.toString());
      // end-list_instances
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }
  }
}
