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

import com.ibm.cloud.is.vpc.v1.model.Deleted;
import com.ibm.cloud.is.vpc.v1.model.RouteCreatorVPNGatewayReference;
import com.ibm.cloud.is.vpc.v1.model.RouteNextHopIP;
import com.ibm.cloud.is.vpc.v1.model.UpdateVpcRouteResponse;
import com.ibm.cloud.is.vpc.v1.model.ZoneReference;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateVpcRouteResponse model.
 */
public class UpdateVpcRouteResponseTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateVpcRouteResponse() throws Throwable {
    UpdateVpcRouteResponse updateVpcRouteResponseModel = new UpdateVpcRouteResponse();
    assertNull(updateVpcRouteResponseModel.getAction());
    assertNull(updateVpcRouteResponseModel.isAdvertise());
    assertNull(updateVpcRouteResponseModel.getCreatedAt());
    assertNull(updateVpcRouteResponseModel.getCreator());
    assertNull(updateVpcRouteResponseModel.getDestination());
    assertNull(updateVpcRouteResponseModel.getHref());
    assertNull(updateVpcRouteResponseModel.getId());
    assertNull(updateVpcRouteResponseModel.getLifecycleState());
    assertNull(updateVpcRouteResponseModel.getName());
    assertNull(updateVpcRouteResponseModel.getNextHop());
    assertNull(updateVpcRouteResponseModel.getOrigin());
    assertNull(updateVpcRouteResponseModel.getPriority());
    assertNull(updateVpcRouteResponseModel.getZone());
  }
}