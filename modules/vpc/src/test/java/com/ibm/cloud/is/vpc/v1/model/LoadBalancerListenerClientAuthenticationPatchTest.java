/*
 * (C) Copyright IBM Corp. 2023, 2024, 2025, 2026.
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

import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerClientAuthenticationCertificateAuthorityPatchByCRN;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerClientAuthenticationPatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the LoadBalancerListenerClientAuthenticationPatch model.
 */
public class LoadBalancerListenerClientAuthenticationPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testLoadBalancerListenerClientAuthenticationPatch() throws Throwable {
    LoadBalancerListenerClientAuthenticationCertificateAuthorityPatchByCRN loadBalancerListenerClientAuthenticationCertificateAuthorityPatchModel = new LoadBalancerListenerClientAuthenticationCertificateAuthorityPatchByCRN.Builder()
      .crn("crn:v1:bluemix:public:secrets-manager:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34:36fa422d-080d-4d83-8d2d-86851b4001df:secret:2e786aab-42fa-63ed-14f8-d66d552f4dd5")
      .build();
    assertEquals(loadBalancerListenerClientAuthenticationCertificateAuthorityPatchModel.crn(), "crn:v1:bluemix:public:secrets-manager:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34:36fa422d-080d-4d83-8d2d-86851b4001df:secret:2e786aab-42fa-63ed-14f8-d66d552f4dd5");

    LoadBalancerListenerClientAuthenticationPatch loadBalancerListenerClientAuthenticationPatchModel = new LoadBalancerListenerClientAuthenticationPatch.Builder()
      .certificateAuthority(loadBalancerListenerClientAuthenticationCertificateAuthorityPatchModel)
      .certificateRevocationList("-----BEGIN X509 CRL-----\nMIICvTCBpgIBATANBgkqhkiG9w0BAQsFADBMMQswCQYDVQQGEwJVUzEOMAwGA1UE\nCAwFZGVsYXMxDDAKBgNVBAoMA0lCTTENMAsGA1UECwwEcm9vdDEQMA4GA1UEAwwH\ncm9vdC1jYRcNMjUwOTA4MDUwMjQwWhcNMjUxMDA4MDUwMjQwWjAVMBMCAhAAFw0y\nNTA5MDgwNTAxNTlaoA8wDTALBgNVHRQEBAICEAAwDQYJKoZIhvcNAQELBQADggIB\nACeEcj7ompUepc5qTvTrNA5PoK5bN71gNI7Rbhq/Bxf1YPMp2iU3qMSj7YpVP7aw\nGNrxFoIZcQ4X7PYyHMfDk6Z83PSTVMnSOVk09fZW49tyVTWmzBVLz3R1bPasnWTZ\n0hRIv9j9n7Lemin+0ubIR/2zmsfBs1JFAFEbbRcgwg+qotsfZNLkX6bjHDpsRQzE\nmXUEu4/AqAsWPbFzG2uMKZ9pKOK+Nn3bt/NEK+AFlnSmgjEqzQ+0zhsrCExIReJV\nc2oiLBkLG6rBwxlGDog+PqwjP+1wGNIL1J3c2lMW1IGMNcts/aDBO5LtPVIY1LsQ\nFoeaTfm3U3GKC/pTczoDk/pKN756f8O05nTWUHgktcNsPvgqDKnpvEkI3VPf9Y4a\nfMOzKgVTgY1dSgjzHO8+4ZfcVGpBePsjOe0/RCUwkgtgOyGtcmBPTMJa0elJzjaM\njD9myqIXkB359sqbuEmcrjgo5uUUvubFYpmT/W0YxOi/py/bDK+7uUs38nUElNkZ\n+YFRpNWjLF9JtAghX5MhA5BwhTTuATvWYuDdK769ifi9qcYvE4u+VNxYfOpPY6sv\nx4FnkZ9+A7s2hk11d+DEq29Efa0xak8rO1LzT5hCSFT0P3KfZEZMpbuXpzVGiZoM\ng5cWHgYcNnzhUatKodvzZizAOVGRR7UFg42O4ylhxDVe\n-----END X509 CRL-----\n")
      .build();
    assertEquals(loadBalancerListenerClientAuthenticationPatchModel.certificateAuthority(), loadBalancerListenerClientAuthenticationCertificateAuthorityPatchModel);
    assertEquals(loadBalancerListenerClientAuthenticationPatchModel.certificateRevocationList(), "-----BEGIN X509 CRL-----\nMIICvTCBpgIBATANBgkqhkiG9w0BAQsFADBMMQswCQYDVQQGEwJVUzEOMAwGA1UE\nCAwFZGVsYXMxDDAKBgNVBAoMA0lCTTENMAsGA1UECwwEcm9vdDEQMA4GA1UEAwwH\ncm9vdC1jYRcNMjUwOTA4MDUwMjQwWhcNMjUxMDA4MDUwMjQwWjAVMBMCAhAAFw0y\nNTA5MDgwNTAxNTlaoA8wDTALBgNVHRQEBAICEAAwDQYJKoZIhvcNAQELBQADggIB\nACeEcj7ompUepc5qTvTrNA5PoK5bN71gNI7Rbhq/Bxf1YPMp2iU3qMSj7YpVP7aw\nGNrxFoIZcQ4X7PYyHMfDk6Z83PSTVMnSOVk09fZW49tyVTWmzBVLz3R1bPasnWTZ\n0hRIv9j9n7Lemin+0ubIR/2zmsfBs1JFAFEbbRcgwg+qotsfZNLkX6bjHDpsRQzE\nmXUEu4/AqAsWPbFzG2uMKZ9pKOK+Nn3bt/NEK+AFlnSmgjEqzQ+0zhsrCExIReJV\nc2oiLBkLG6rBwxlGDog+PqwjP+1wGNIL1J3c2lMW1IGMNcts/aDBO5LtPVIY1LsQ\nFoeaTfm3U3GKC/pTczoDk/pKN756f8O05nTWUHgktcNsPvgqDKnpvEkI3VPf9Y4a\nfMOzKgVTgY1dSgjzHO8+4ZfcVGpBePsjOe0/RCUwkgtgOyGtcmBPTMJa0elJzjaM\njD9myqIXkB359sqbuEmcrjgo5uUUvubFYpmT/W0YxOi/py/bDK+7uUs38nUElNkZ\n+YFRpNWjLF9JtAghX5MhA5BwhTTuATvWYuDdK769ifi9qcYvE4u+VNxYfOpPY6sv\nx4FnkZ9+A7s2hk11d+DEq29Efa0xak8rO1LzT5hCSFT0P3KfZEZMpbuXpzVGiZoM\ng5cWHgYcNnzhUatKodvzZizAOVGRR7UFg42O4ylhxDVe\n-----END X509 CRL-----\n");

    String json = TestUtilities.serialize(loadBalancerListenerClientAuthenticationPatchModel);

    LoadBalancerListenerClientAuthenticationPatch loadBalancerListenerClientAuthenticationPatchModelNew = TestUtilities.deserialize(json, LoadBalancerListenerClientAuthenticationPatch.class);
    assertTrue(loadBalancerListenerClientAuthenticationPatchModelNew instanceof LoadBalancerListenerClientAuthenticationPatch);
    assertEquals(loadBalancerListenerClientAuthenticationPatchModelNew.certificateAuthority().toString(), loadBalancerListenerClientAuthenticationCertificateAuthorityPatchModel.toString());
    assertEquals(loadBalancerListenerClientAuthenticationPatchModelNew.certificateRevocationList(), "-----BEGIN X509 CRL-----\nMIICvTCBpgIBATANBgkqhkiG9w0BAQsFADBMMQswCQYDVQQGEwJVUzEOMAwGA1UE\nCAwFZGVsYXMxDDAKBgNVBAoMA0lCTTENMAsGA1UECwwEcm9vdDEQMA4GA1UEAwwH\ncm9vdC1jYRcNMjUwOTA4MDUwMjQwWhcNMjUxMDA4MDUwMjQwWjAVMBMCAhAAFw0y\nNTA5MDgwNTAxNTlaoA8wDTALBgNVHRQEBAICEAAwDQYJKoZIhvcNAQELBQADggIB\nACeEcj7ompUepc5qTvTrNA5PoK5bN71gNI7Rbhq/Bxf1YPMp2iU3qMSj7YpVP7aw\nGNrxFoIZcQ4X7PYyHMfDk6Z83PSTVMnSOVk09fZW49tyVTWmzBVLz3R1bPasnWTZ\n0hRIv9j9n7Lemin+0ubIR/2zmsfBs1JFAFEbbRcgwg+qotsfZNLkX6bjHDpsRQzE\nmXUEu4/AqAsWPbFzG2uMKZ9pKOK+Nn3bt/NEK+AFlnSmgjEqzQ+0zhsrCExIReJV\nc2oiLBkLG6rBwxlGDog+PqwjP+1wGNIL1J3c2lMW1IGMNcts/aDBO5LtPVIY1LsQ\nFoeaTfm3U3GKC/pTczoDk/pKN756f8O05nTWUHgktcNsPvgqDKnpvEkI3VPf9Y4a\nfMOzKgVTgY1dSgjzHO8+4ZfcVGpBePsjOe0/RCUwkgtgOyGtcmBPTMJa0elJzjaM\njD9myqIXkB359sqbuEmcrjgo5uUUvubFYpmT/W0YxOi/py/bDK+7uUs38nUElNkZ\n+YFRpNWjLF9JtAghX5MhA5BwhTTuATvWYuDdK769ifi9qcYvE4u+VNxYfOpPY6sv\nx4FnkZ9+A7s2hk11d+DEq29Efa0xak8rO1LzT5hCSFT0P3KfZEZMpbuXpzVGiZoM\ng5cWHgYcNnzhUatKodvzZizAOVGRR7UFg42O4ylhxDVe\n-----END X509 CRL-----\n");
  }
}