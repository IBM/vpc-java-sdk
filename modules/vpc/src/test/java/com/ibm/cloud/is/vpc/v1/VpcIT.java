/*
 * (C) Copyright IBM Corp. 2023, 2024, 2025.
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

import com.ibm.cloud.is.test.SdkIntegrationTestBase;
import com.ibm.cloud.is.vpc.v1.model.AccountIdentity;
import com.ibm.cloud.is.vpc.v1.model.AccountIdentityById;
import com.ibm.cloud.is.vpc.v1.model.AccountReference;
import com.ibm.cloud.is.vpc.v1.model.ActivateReservationOptions;
import com.ibm.cloud.is.vpc.v1.model.AddBareMetalServerNetworkInterfaceFloatingIpOptions;
import com.ibm.cloud.is.vpc.v1.model.AddEndpointGatewayIpOptions;
import com.ibm.cloud.is.vpc.v1.model.AddInstanceNetworkInterfaceFloatingIpOptions;
import com.ibm.cloud.is.vpc.v1.model.AddNetworkInterfaceFloatingIpOptions;
import com.ibm.cloud.is.vpc.v1.model.AddVirtualNetworkInterfaceIpOptions;
import com.ibm.cloud.is.vpc.v1.model.AddVpnGatewayConnectionsLocalCidrOptions;
import com.ibm.cloud.is.vpc.v1.model.AddVpnGatewayConnectionsPeerCidrOptions;
import com.ibm.cloud.is.vpc.v1.model.AddressPrefix;
import com.ibm.cloud.is.vpc.v1.model.AddressPrefixCollection;
import com.ibm.cloud.is.vpc.v1.model.AddressPrefixPatch;
import com.ibm.cloud.is.vpc.v1.model.BackupPoliciesPager;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicy;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyCollection;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyHealthReason;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyJob;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyJobCollection;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyJobSource;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyJobSourceInstanceReference;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyJobSourceShareReference;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyJobSourceVolumeReference;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyJobStatusReason;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyJobsPager;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyMatchResourceTypeInstance;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyMatchResourceTypeShare;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyMatchResourceTypeVolume;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPatch;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlan;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlanClonePolicy;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlanClonePolicyPatch;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlanClonePolicyPrototype;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlanCollection;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlanDeletionTrigger;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlanDeletionTriggerPatch;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlanDeletionTriggerPrototype;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlanPatch;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlanPrototype;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlanReference;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlanRemote;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlanRemoteRegionPolicy;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlanRemoteRegionPolicyPrototype;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPrototype;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototype;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPrototypeBackupPolicyMatchResourceTypeSharePrototype;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPrototypeBackupPolicyMatchResourceTypeVolumePrototype;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyScope;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyScopeAccountReference;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyScopeEnterpriseReference;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyScopePrototype;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyScopePrototypeEnterpriseIdentity;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyScopePrototypeEnterpriseIdentityEnterpriseIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyTargetSnapshot;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyTargetSnapshotShareSnapshotReference;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyTargetSnapshotSnapshotReference;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServer;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerBootTarget;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerBootTargetBareMetalServerDiskReference;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerCPU;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerCollection;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerConsoleAccessToken;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerDisk;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerDiskCollection;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerDiskPatch;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerFirmware;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerHealthReason;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerInitialization;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerInitializationPrototype;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerInitializationUserAccount;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerInitializationUserAccountBareMetalServerInitializationHostUserAccount;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerLifecycleReason;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkAttachment;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkAttachmentByPCI;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkAttachmentByVLAN;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkAttachmentCollection;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkAttachmentPatch;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkAttachmentPrototype;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByPCIPrototype;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVLANPrototype;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterface;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfaceIdentity;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityById;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkAttachmentReference;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkAttachmentsPager;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkInterface;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkInterfaceByHiperSocket;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkInterfaceByPCI;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkInterfaceByVLAN;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkInterfaceCollection;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkInterfacePatch;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkInterfacePrototype;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByHiperSocketPrototype;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByPCIPrototype;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototype;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkInterfacesPager;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerPatch;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerPrimaryNetworkAttachmentPrototype;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerPrimaryNetworkAttachmentPrototypeBareMetalServerPrimaryNetworkAttachmentByPCIPrototype;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerPrimaryNetworkInterfacePrototype;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfile;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileBandwidth;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileBandwidthDependent;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileBandwidthEnum;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileBandwidthFixed;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileBandwidthRange;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileCPUArchitecture;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileCPUCoreCount;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileCPUCoreCountDependent;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileCPUCoreCountEnum;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileCPUCoreCountFixed;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileCPUCoreCountRange;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileCPUSocketCount;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileCPUSocketCountDependent;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileCPUSocketCountEnum;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileCPUSocketCountFixed;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileCPUSocketCountRange;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileCollection;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileConsoleTypes;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileDisk;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileDiskQuantity;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileDiskQuantityDependent;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileDiskQuantityEnum;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileDiskQuantityFixed;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileDiskQuantityRange;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileDiskSize;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileDiskSizeDependent;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileDiskSizeEnum;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileDiskSizeFixed;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileDiskSizeRange;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileDiskSupportedInterfaces;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileIdentity;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileMemory;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileMemoryDependent;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileMemoryEnum;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileMemoryFixed;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileMemoryRange;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileNetworkAttachmentCount;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileNetworkAttachmentCountDependent;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileNetworkAttachmentCountRange;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileNetworkInterfaceCount;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileNetworkInterfaceCountDependent;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileNetworkInterfaceCountRange;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileOSArchitecture;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileReference;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileReservationTerms;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileSupportedTrustedPlatformModuleModes;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileVirtualNetworkInterfacesSupported;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfilesPager;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerPrototype;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerPrototypeBareMetalServerByNetworkAttachment;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerPrototypeBareMetalServerByNetworkInterface;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerReservationAffinity;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerReservationAffinityPatch;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerReservationAffinityPrototype;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerStatusReason;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerTrustedPlatformModule;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerTrustedPlatformModulePatch;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerTrustedPlatformModulePrototype;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServersPager;
import com.ibm.cloud.is.vpc.v1.model.CatalogOfferingIdentity;
import com.ibm.cloud.is.vpc.v1.model.CatalogOfferingIdentityCatalogOfferingByCRN;
import com.ibm.cloud.is.vpc.v1.model.CatalogOfferingVersionIdentity;
import com.ibm.cloud.is.vpc.v1.model.CatalogOfferingVersionIdentityCatalogOfferingVersionByCRN;
import com.ibm.cloud.is.vpc.v1.model.CatalogOfferingVersionPlanIdentity;
import com.ibm.cloud.is.vpc.v1.model.CatalogOfferingVersionPlanIdentityCatalogOfferingVersionPlanByCRN;
import com.ibm.cloud.is.vpc.v1.model.CatalogOfferingVersionPlanReference;
import com.ibm.cloud.is.vpc.v1.model.CatalogOfferingVersionReference;
import com.ibm.cloud.is.vpc.v1.model.CertificateInstanceIdentity;
import com.ibm.cloud.is.vpc.v1.model.CertificateInstanceIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.CertificateInstanceReference;
import com.ibm.cloud.is.vpc.v1.model.CheckVpnGatewayConnectionsLocalCidrOptions;
import com.ibm.cloud.is.vpc.v1.model.CheckVpnGatewayConnectionsPeerCidrOptions;
import com.ibm.cloud.is.vpc.v1.model.CloudObjectStorageBucketIdentity;
import com.ibm.cloud.is.vpc.v1.model.CloudObjectStorageBucketIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.CloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.CloudObjectStorageBucketReference;
import com.ibm.cloud.is.vpc.v1.model.CloudObjectStorageObjectReference;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetwork;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkCollection;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkInterface;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkInterfaceCollection;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkInterfaceLifecycleReason;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkInterfacePatch;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkInterfacePrimaryIPPrototype;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPIdentityClusterNetworkInterfacePrimaryIPContext;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPIdentityClusterNetworkInterfacePrimaryIPContextByHref;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPIdentityClusterNetworkInterfacePrimaryIPContextById;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPPrototypeClusterNetworkInterfacePrimaryIPContext;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkInterfaceReference;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkInterfaceTarget;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkInterfaceTargetInstanceClusterNetworkAttachmentReferenceClusterNetworkInterfaceContext;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkInterfacesPager;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkLifecycleReason;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkPatch;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkProfile;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkProfileCollection;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkProfileIdentity;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkProfileIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkProfileReference;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkProfilesPager;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkReference;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkSubnet;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkSubnetCollection;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkSubnetIdentity;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkSubnetIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkSubnetIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkSubnetLifecycleReason;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkSubnetPatch;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkSubnetPrefix;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkSubnetPrefixPrototype;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkSubnetPrototype;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkSubnetPrototypeClusterNetworkSubnetByIPv4CIDRBlockPrototype;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkSubnetPrototypeClusterNetworkSubnetByTotalCountPrototype;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkSubnetReference;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkSubnetReservedIP;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkSubnetReservedIPCollection;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkSubnetReservedIPLifecycleReason;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkSubnetReservedIPPatch;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkSubnetReservedIPReference;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkSubnetReservedIPTarget;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkSubnetReservedIPTargetClusterNetworkInterfaceReferenceClusterNetworkSubnetReservedIPTargetContext;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkSubnetReservedIpsPager;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkSubnetsPager;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworksPager;
import com.ibm.cloud.is.vpc.v1.model.CreateBackupPolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateBackupPolicyPlanOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateBareMetalServerConsoleAccessTokenOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateBareMetalServerNetworkAttachmentOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateBareMetalServerNetworkInterfaceOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateBareMetalServerOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateClusterNetworkAttachmentOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateClusterNetworkInterfaceOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateClusterNetworkOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateClusterNetworkSubnetOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateClusterNetworkSubnetReservedIpOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateDedicatedHostGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateDedicatedHostOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateEndpointGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateFloatingIpOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateFlowLogCollectorOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateIkePolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateImageExportJobOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateImageOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateInstanceActionOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateInstanceConsoleAccessTokenOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateInstanceGroupManagerActionOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateInstanceGroupManagerOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateInstanceGroupManagerPolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateInstanceGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateInstanceNetworkAttachmentOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateInstanceNetworkInterfaceOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateInstanceOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateInstanceTemplateOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateInstanceVolumeAttachmentOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateIpsecPolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateKeyOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateLoadBalancerListenerOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateLoadBalancerListenerPolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateLoadBalancerListenerPolicyRuleOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateLoadBalancerOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateLoadBalancerPoolMemberOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateLoadBalancerPoolOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateNetworkAclOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateNetworkAclRuleOptions;
import com.ibm.cloud.is.vpc.v1.model.CreatePlacementGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.CreatePrivatePathServiceGatewayAccountPolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.CreatePrivatePathServiceGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.CreatePublicGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateReservationOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateSecurityGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateSecurityGroupRuleOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateSecurityGroupTargetBindingOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateShareMountTargetOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateShareOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateShareSnapshotOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateSnapshotCloneOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateSnapshotConsistencyGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateSnapshotOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateSubnetOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateSubnetReservedIpOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateVirtualNetworkInterfaceOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateVolumeOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateVpcAddressPrefixOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateVpcDnsResolutionBindingOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateVpcOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateVpcRouteOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateVpcRoutingTableOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateVpcRoutingTableRouteOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateVpnGatewayConnectionOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateVpnGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateVpnServerOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateVpnServerRouteOptions;
import com.ibm.cloud.is.vpc.v1.model.DNSInstanceIdentity;
import com.ibm.cloud.is.vpc.v1.model.DNSInstanceIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.DNSInstanceReferenceLoadBalancerDNSContext;
import com.ibm.cloud.is.vpc.v1.model.DNSServer;
import com.ibm.cloud.is.vpc.v1.model.DNSServerPrototype;
import com.ibm.cloud.is.vpc.v1.model.DNSZoneIdentity;
import com.ibm.cloud.is.vpc.v1.model.DNSZoneIdentityById;
import com.ibm.cloud.is.vpc.v1.model.DNSZoneReference;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHost;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostCollection;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostDisk;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostDiskCollection;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostDiskPatch;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostGroup;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostGroupCollection;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostGroupIdentity;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostGroupIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostGroupIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostGroupPatch;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostGroupPrototypeDedicatedHostByZoneContext;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostGroupReference;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostGroupsPager;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostNUMA;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostNUMANode;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostPatch;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfile;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileCollection;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileDisk;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileDiskInterface;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileDiskQuantity;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileDiskSize;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileDiskSupportedInterfaces;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileIdentity;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileMemory;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileMemoryDependent;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileMemoryEnum;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileMemoryFixed;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileMemoryRange;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileReference;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileSocket;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileSocketDependent;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileSocketEnum;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileSocketFixed;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileSocketRange;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileVCPU;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileVCPUArchitecture;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileVCPUDependent;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileVCPUEnum;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileVCPUFixed;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileVCPUManufacturer;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileVCPURange;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfilesPager;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostPrototype;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostPrototypeDedicatedHostByGroup;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostPrototypeDedicatedHostByZone;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostReference;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostsPager;
import com.ibm.cloud.is.vpc.v1.model.DefaultNetworkACL;
import com.ibm.cloud.is.vpc.v1.model.DefaultRoutingTable;
import com.ibm.cloud.is.vpc.v1.model.DefaultSecurityGroup;
import com.ibm.cloud.is.vpc.v1.model.DeleteBackupPolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteBackupPolicyPlanOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteBareMetalServerNetworkAttachmentOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteBareMetalServerNetworkInterfaceOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteBareMetalServerOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteClusterNetworkInterfaceOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteClusterNetworkOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteClusterNetworkSubnetOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteClusterNetworkSubnetReservedIpOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteDedicatedHostGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteDedicatedHostOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteEndpointGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteFloatingIpOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteFlowLogCollectorOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteIkePolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteImageExportJobOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteImageOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteInstanceClusterNetworkAttachmentOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteInstanceGroupLoadBalancerOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteInstanceGroupManagerActionOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteInstanceGroupManagerOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteInstanceGroupManagerPolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteInstanceGroupMembershipOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteInstanceGroupMembershipsOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteInstanceGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteInstanceNetworkAttachmentOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteInstanceNetworkInterfaceOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteInstanceOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteInstanceTemplateOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteInstanceVolumeAttachmentOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteIpsecPolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteKeyOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteLoadBalancerListenerOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteLoadBalancerListenerPolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteLoadBalancerListenerPolicyRuleOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteLoadBalancerOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteLoadBalancerPoolMemberOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteLoadBalancerPoolOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteNetworkAclOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteNetworkAclRuleOptions;
import com.ibm.cloud.is.vpc.v1.model.DeletePlacementGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.DeletePrivatePathServiceGatewayAccountPolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.DeletePrivatePathServiceGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.DeletePublicGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteReservationOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteSecurityGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteSecurityGroupRuleOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteSecurityGroupTargetBindingOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteShareAccessorBindingOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteShareMountTargetOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteShareOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteShareSnapshotOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteShareSourceOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteSnapshotCloneOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteSnapshotConsistencyGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteSnapshotOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteSnapshotsOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteSubnetOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteSubnetReservedIpOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteVirtualNetworkInterfacesOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteVolumeOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteVpcAddressPrefixOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteVpcDnsResolutionBindingOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteVpcOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteVpcRouteOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteVpcRoutingTableOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteVpcRoutingTableRouteOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteVpnGatewayConnectionOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteVpnGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteVpnServerClientOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteVpnServerOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteVpnServerRouteOptions;
import com.ibm.cloud.is.vpc.v1.model.Deleted;
import com.ibm.cloud.is.vpc.v1.model.DenyPrivatePathServiceGatewayEndpointGatewayBindingOptions;
import com.ibm.cloud.is.vpc.v1.model.DeprecateImageOptions;
import com.ibm.cloud.is.vpc.v1.model.DisconnectVpnClientOptions;
import com.ibm.cloud.is.vpc.v1.model.EncryptionKeyIdentity;
import com.ibm.cloud.is.vpc.v1.model.EncryptionKeyIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.EncryptionKeyReference;
import com.ibm.cloud.is.vpc.v1.model.EndpointGateway;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayCollection;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayIpsPager;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayLifecycleReason;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayPatch;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayReferenceRemote;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayRemote;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayReservedIP;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayReservedIPReservedIPIdentity;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayReservedIPReservedIPIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayReservedIPReservedIPIdentityById;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayReservedIPReservedIPPrototypeTargetContext;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayTarget;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayTargetPrivatePathServiceGatewayReference;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayTargetPrototype;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypePrivatePathServiceGatewayPrototype;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderCloudServicePrototype;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderInfrastructureServicePrototype;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayTargetProviderCloudServiceReference;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayTargetProviderInfrastructureServiceReference;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewaysPager;
import com.ibm.cloud.is.vpc.v1.model.FailoverShareOptions;
import com.ibm.cloud.is.vpc.v1.model.FloatingIP;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPCollection;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPCollectionVirtualNetworkInterfaceContext;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPPatch;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPPrototype;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPPrototypeFloatingIPByTarget;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPPrototypeFloatingIPByZone;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPReference;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPTarget;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPTargetBareMetalServerNetworkInterfaceReference;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPTargetNetworkInterfaceReference;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPTargetPatch;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPTargetPatchBareMetalServerNetworkInterfaceIdentity;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPTargetPatchBareMetalServerNetworkInterfaceIdentityBareMetalServerNetworkInterfaceIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPTargetPatchBareMetalServerNetworkInterfaceIdentityBareMetalServerNetworkInterfaceIdentityById;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPTargetPatchNetworkInterfaceIdentity;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPTargetPatchNetworkInterfaceIdentityNetworkInterfaceIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPTargetPatchNetworkInterfaceIdentityNetworkInterfaceIdentityById;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPTargetPatchVirtualNetworkInterfaceIdentity;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPTargetPatchVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPTargetPatchVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPTargetPatchVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityById;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPTargetPrototype;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPTargetPrototypeBareMetalServerNetworkInterfaceIdentity;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPTargetPrototypeBareMetalServerNetworkInterfaceIdentityBareMetalServerNetworkInterfaceIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPTargetPrototypeBareMetalServerNetworkInterfaceIdentityBareMetalServerNetworkInterfaceIdentityById;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPTargetPrototypeNetworkInterfaceIdentity;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityById;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPTargetPrototypeVirtualNetworkInterfaceIdentity;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPTargetPrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPTargetPrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPTargetPrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityById;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPTargetPublicGatewayReference;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPTargetVirtualNetworkInterfaceReference;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPUnpaginatedCollection;
import com.ibm.cloud.is.vpc.v1.model.FloatingIpsPager;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollector;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorCollection;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorPatch;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTarget;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetInstanceNetworkAttachmentReference;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetInstanceReference;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetNetworkInterfaceReferenceTargetContext;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototype;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototypeInstanceIdentity;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototypeInstanceIdentityInstanceIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototypeInstanceIdentityInstanceIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototypeInstanceIdentityInstanceIdentityById;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototypeInstanceNetworkAttachmentIdentity;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototypeInstanceNetworkAttachmentIdentityInstanceNetworkAttachmentIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototypeInstanceNetworkAttachmentIdentityInstanceNetworkAttachmentIdentityById;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototypeNetworkInterfaceIdentity;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityById;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototypeSubnetIdentity;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototypeSubnetIdentitySubnetIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototypeSubnetIdentitySubnetIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototypeSubnetIdentitySubnetIdentityById;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototypeVPCIdentity;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototypeVPCIdentityVPCIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototypeVPCIdentityVPCIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototypeVPCIdentityVPCIdentityById;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototypeVirtualNetworkInterfaceIdentity;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityById;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetSubnetReference;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetVPCReference;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetVirtualNetworkInterfaceReferenceAttachmentContext;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorsPager;
import com.ibm.cloud.is.vpc.v1.model.GetBackupPolicyJobOptions;
import com.ibm.cloud.is.vpc.v1.model.GetBackupPolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.GetBackupPolicyPlanOptions;
import com.ibm.cloud.is.vpc.v1.model.GetBareMetalServerDiskOptions;
import com.ibm.cloud.is.vpc.v1.model.GetBareMetalServerInitializationOptions;
import com.ibm.cloud.is.vpc.v1.model.GetBareMetalServerNetworkAttachmentOptions;
import com.ibm.cloud.is.vpc.v1.model.GetBareMetalServerNetworkInterfaceFloatingIpOptions;
import com.ibm.cloud.is.vpc.v1.model.GetBareMetalServerNetworkInterfaceIpOptions;
import com.ibm.cloud.is.vpc.v1.model.GetBareMetalServerNetworkInterfaceOptions;
import com.ibm.cloud.is.vpc.v1.model.GetBareMetalServerOptions;
import com.ibm.cloud.is.vpc.v1.model.GetBareMetalServerProfileOptions;
import com.ibm.cloud.is.vpc.v1.model.GetClusterNetworkInterfaceOptions;
import com.ibm.cloud.is.vpc.v1.model.GetClusterNetworkOptions;
import com.ibm.cloud.is.vpc.v1.model.GetClusterNetworkProfileOptions;
import com.ibm.cloud.is.vpc.v1.model.GetClusterNetworkSubnetOptions;
import com.ibm.cloud.is.vpc.v1.model.GetClusterNetworkSubnetReservedIpOptions;
import com.ibm.cloud.is.vpc.v1.model.GetDedicatedHostDiskOptions;
import com.ibm.cloud.is.vpc.v1.model.GetDedicatedHostGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.GetDedicatedHostOptions;
import com.ibm.cloud.is.vpc.v1.model.GetDedicatedHostProfileOptions;
import com.ibm.cloud.is.vpc.v1.model.GetEndpointGatewayIpOptions;
import com.ibm.cloud.is.vpc.v1.model.GetEndpointGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.GetFloatingIpOptions;
import com.ibm.cloud.is.vpc.v1.model.GetFlowLogCollectorOptions;
import com.ibm.cloud.is.vpc.v1.model.GetIkePolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.GetImageExportJobOptions;
import com.ibm.cloud.is.vpc.v1.model.GetImageOptions;
import com.ibm.cloud.is.vpc.v1.model.GetInstanceClusterNetworkAttachmentOptions;
import com.ibm.cloud.is.vpc.v1.model.GetInstanceDiskOptions;
import com.ibm.cloud.is.vpc.v1.model.GetInstanceGroupManagerActionOptions;
import com.ibm.cloud.is.vpc.v1.model.GetInstanceGroupManagerOptions;
import com.ibm.cloud.is.vpc.v1.model.GetInstanceGroupManagerPolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.GetInstanceGroupMembershipOptions;
import com.ibm.cloud.is.vpc.v1.model.GetInstanceGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.GetInstanceInitializationOptions;
import com.ibm.cloud.is.vpc.v1.model.GetInstanceNetworkAttachmentOptions;
import com.ibm.cloud.is.vpc.v1.model.GetInstanceNetworkInterfaceFloatingIpOptions;
import com.ibm.cloud.is.vpc.v1.model.GetInstanceNetworkInterfaceIpOptions;
import com.ibm.cloud.is.vpc.v1.model.GetInstanceNetworkInterfaceOptions;
import com.ibm.cloud.is.vpc.v1.model.GetInstanceOptions;
import com.ibm.cloud.is.vpc.v1.model.GetInstanceProfileOptions;
import com.ibm.cloud.is.vpc.v1.model.GetInstanceTemplateOptions;
import com.ibm.cloud.is.vpc.v1.model.GetInstanceVolumeAttachmentOptions;
import com.ibm.cloud.is.vpc.v1.model.GetIpsecPolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.GetKeyOptions;
import com.ibm.cloud.is.vpc.v1.model.GetLoadBalancerListenerOptions;
import com.ibm.cloud.is.vpc.v1.model.GetLoadBalancerListenerPolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.GetLoadBalancerListenerPolicyRuleOptions;
import com.ibm.cloud.is.vpc.v1.model.GetLoadBalancerOptions;
import com.ibm.cloud.is.vpc.v1.model.GetLoadBalancerPoolMemberOptions;
import com.ibm.cloud.is.vpc.v1.model.GetLoadBalancerPoolOptions;
import com.ibm.cloud.is.vpc.v1.model.GetLoadBalancerProfileOptions;
import com.ibm.cloud.is.vpc.v1.model.GetLoadBalancerStatisticsOptions;
import com.ibm.cloud.is.vpc.v1.model.GetNetworkAclOptions;
import com.ibm.cloud.is.vpc.v1.model.GetNetworkAclRuleOptions;
import com.ibm.cloud.is.vpc.v1.model.GetNetworkInterfaceFloatingIpOptions;
import com.ibm.cloud.is.vpc.v1.model.GetOperatingSystemOptions;
import com.ibm.cloud.is.vpc.v1.model.GetPlacementGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.GetPrivatePathServiceGatewayAccountPolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.GetPrivatePathServiceGatewayEndpointGatewayBindingOptions;
import com.ibm.cloud.is.vpc.v1.model.GetPrivatePathServiceGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.GetPublicGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.GetRegionOptions;
import com.ibm.cloud.is.vpc.v1.model.GetRegionZoneOptions;
import com.ibm.cloud.is.vpc.v1.model.GetReservationOptions;
import com.ibm.cloud.is.vpc.v1.model.GetSecurityGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.GetSecurityGroupRuleOptions;
import com.ibm.cloud.is.vpc.v1.model.GetSecurityGroupTargetOptions;
import com.ibm.cloud.is.vpc.v1.model.GetShareAccessorBindingOptions;
import com.ibm.cloud.is.vpc.v1.model.GetShareMountTargetOptions;
import com.ibm.cloud.is.vpc.v1.model.GetShareOptions;
import com.ibm.cloud.is.vpc.v1.model.GetShareProfileOptions;
import com.ibm.cloud.is.vpc.v1.model.GetShareSnapshotOptions;
import com.ibm.cloud.is.vpc.v1.model.GetShareSourceOptions;
import com.ibm.cloud.is.vpc.v1.model.GetSnapshotCloneOptions;
import com.ibm.cloud.is.vpc.v1.model.GetSnapshotConsistencyGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.GetSnapshotOptions;
import com.ibm.cloud.is.vpc.v1.model.GetSubnetNetworkAclOptions;
import com.ibm.cloud.is.vpc.v1.model.GetSubnetOptions;
import com.ibm.cloud.is.vpc.v1.model.GetSubnetPublicGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.GetSubnetReservedIpOptions;
import com.ibm.cloud.is.vpc.v1.model.GetSubnetRoutingTableOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVirtualNetworkInterfaceIpOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVirtualNetworkInterfaceOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVolumeOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVolumeProfileOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVpcAddressPrefixOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVpcDefaultNetworkAclOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVpcDefaultRoutingTableOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVpcDefaultSecurityGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVpcDnsResolutionBindingOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVpcOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVpcRouteOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVpcRoutingTableOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVpcRoutingTableRouteOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVpnGatewayConnectionOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVpnGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVpnServerClientConfigurationOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVpnServerClientOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVpnServerOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVpnServerRouteOptions;
import com.ibm.cloud.is.vpc.v1.model.IKEPolicy;
import com.ibm.cloud.is.vpc.v1.model.IKEPolicyCollection;
import com.ibm.cloud.is.vpc.v1.model.IKEPolicyConnectionCollection;
import com.ibm.cloud.is.vpc.v1.model.IKEPolicyPatch;
import com.ibm.cloud.is.vpc.v1.model.IKEPolicyReference;
import com.ibm.cloud.is.vpc.v1.model.IP;
import com.ibm.cloud.is.vpc.v1.model.IPsecPolicy;
import com.ibm.cloud.is.vpc.v1.model.IPsecPolicyCollection;
import com.ibm.cloud.is.vpc.v1.model.IPsecPolicyConnectionCollection;
import com.ibm.cloud.is.vpc.v1.model.IPsecPolicyPatch;
import com.ibm.cloud.is.vpc.v1.model.IPsecPolicyReference;
import com.ibm.cloud.is.vpc.v1.model.IkePoliciesPager;
import com.ibm.cloud.is.vpc.v1.model.IkePolicyConnectionsPager;
import com.ibm.cloud.is.vpc.v1.model.Image;
import com.ibm.cloud.is.vpc.v1.model.ImageCatalogOffering;
import com.ibm.cloud.is.vpc.v1.model.ImageCollection;
import com.ibm.cloud.is.vpc.v1.model.ImageExportJob;
import com.ibm.cloud.is.vpc.v1.model.ImageExportJobPatch;
import com.ibm.cloud.is.vpc.v1.model.ImageExportJobStatusReason;
import com.ibm.cloud.is.vpc.v1.model.ImageExportJobUnpaginatedCollection;
import com.ibm.cloud.is.vpc.v1.model.ImageFile;
import com.ibm.cloud.is.vpc.v1.model.ImageFileChecksums;
import com.ibm.cloud.is.vpc.v1.model.ImageFilePrototype;
import com.ibm.cloud.is.vpc.v1.model.ImageIdentity;
import com.ibm.cloud.is.vpc.v1.model.ImageIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.ImageIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.ImageIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ImagePatch;
import com.ibm.cloud.is.vpc.v1.model.ImagePrototype;
import com.ibm.cloud.is.vpc.v1.model.ImagePrototypeImageByFile;
import com.ibm.cloud.is.vpc.v1.model.ImagePrototypeImageBySourceVolume;
import com.ibm.cloud.is.vpc.v1.model.ImageReference;
import com.ibm.cloud.is.vpc.v1.model.ImageRemoteContextImageReference;
import com.ibm.cloud.is.vpc.v1.model.ImageStatusReason;
import com.ibm.cloud.is.vpc.v1.model.ImagesPager;
import com.ibm.cloud.is.vpc.v1.model.Instance;
import com.ibm.cloud.is.vpc.v1.model.InstanceAction;
import com.ibm.cloud.is.vpc.v1.model.InstanceAvailabilityPolicy;
import com.ibm.cloud.is.vpc.v1.model.InstanceAvailabilityPolicyPatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceAvailabilityPolicyPrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceCatalogOffering;
import com.ibm.cloud.is.vpc.v1.model.InstanceCatalogOfferingPrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceCatalogOfferingPrototypeCatalogOfferingByOffering;
import com.ibm.cloud.is.vpc.v1.model.InstanceCatalogOfferingPrototypeCatalogOfferingByVersion;
import com.ibm.cloud.is.vpc.v1.model.InstanceClusterNetworkAttachment;
import com.ibm.cloud.is.vpc.v1.model.InstanceClusterNetworkAttachmentBefore;
import com.ibm.cloud.is.vpc.v1.model.InstanceClusterNetworkAttachmentBeforePrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceClusterNetworkAttachmentBeforePrototypeInstanceClusterNetworkAttachmentIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.InstanceClusterNetworkAttachmentBeforePrototypeInstanceClusterNetworkAttachmentIdentityById;
import com.ibm.cloud.is.vpc.v1.model.InstanceClusterNetworkAttachmentCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceClusterNetworkAttachmentLifecycleReason;
import com.ibm.cloud.is.vpc.v1.model.InstanceClusterNetworkAttachmentPatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterface;
import com.ibm.cloud.is.vpc.v1.model.InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceClusterNetworkInterfaceIdentity;
import com.ibm.cloud.is.vpc.v1.model.InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceClusterNetworkInterfaceIdentityClusterNetworkInterfaceIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceClusterNetworkInterfaceIdentityClusterNetworkInterfaceIdentityById;
import com.ibm.cloud.is.vpc.v1.model.InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceInstanceClusterNetworkInterfacePrototypeInstanceClusterNetworkAttachment;
import com.ibm.cloud.is.vpc.v1.model.InstanceClusterNetworkAttachmentPrototypeInstanceContext;
import com.ibm.cloud.is.vpc.v1.model.InstanceClusterNetworkAttachmentReference;
import com.ibm.cloud.is.vpc.v1.model.InstanceClusterNetworkAttachmentsPager;
import com.ibm.cloud.is.vpc.v1.model.InstanceCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceConsoleAccessToken;
import com.ibm.cloud.is.vpc.v1.model.InstanceDefaultTrustedProfilePrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceDisk;
import com.ibm.cloud.is.vpc.v1.model.InstanceDiskCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceDiskPatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceDiskReference;
import com.ibm.cloud.is.vpc.v1.model.InstanceGPU;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroup;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupLifecycleReason;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManager;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerAction;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerActionGroupPatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerActionManagerPatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerActionPatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerActionPrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerActionPrototypeScheduledActionPrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpec;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByGroup;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByManager;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAt;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByGroup;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByManager;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerActionReference;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerActionScheduledAction;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerActionScheduledActionGroupTarget;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerActionScheduledActionManagerTarget;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerActionsCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerActionsPager;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerAutoScale;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPoliciesPager;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPolicy;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPolicyCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPolicyInstanceGroupManagerTargetPolicy;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPolicyPatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPolicyPrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPolicyReference;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPrototypeInstanceGroupManagerScheduledPrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerReference;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerScheduled;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerScheduledActionGroup;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerScheduledActionGroupPrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerScheduledActionManager;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerScheduledActionManagerAutoScale;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerScheduledActionManagerPrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeByHref;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeById;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagersPager;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupMembership;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupMembershipCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupMembershipPatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupMembershipsPager;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupPatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupReference;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupsPager;
import com.ibm.cloud.is.vpc.v1.model.InstanceHealthReason;
import com.ibm.cloud.is.vpc.v1.model.InstanceInitialization;
import com.ibm.cloud.is.vpc.v1.model.InstanceInitializationDefaultTrustedProfile;
import com.ibm.cloud.is.vpc.v1.model.InstanceInitializationPassword;
import com.ibm.cloud.is.vpc.v1.model.InstanceLifecycleReason;
import com.ibm.cloud.is.vpc.v1.model.InstanceMetadataService;
import com.ibm.cloud.is.vpc.v1.model.InstanceMetadataServicePatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceMetadataServicePrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceNetworkAttachment;
import com.ibm.cloud.is.vpc.v1.model.InstanceNetworkAttachmentCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceNetworkAttachmentPatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceNetworkAttachmentPrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceNetworkAttachmentPrototypeVirtualNetworkInterface;
import com.ibm.cloud.is.vpc.v1.model.InstanceNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfaceIdentity;
import com.ibm.cloud.is.vpc.v1.model.InstanceNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.InstanceNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.InstanceNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityById;
import com.ibm.cloud.is.vpc.v1.model.InstanceNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeInstanceNetworkAttachmentContext;
import com.ibm.cloud.is.vpc.v1.model.InstanceNetworkAttachmentReference;
import com.ibm.cloud.is.vpc.v1.model.InstanceNetworkInterfaceIpsPager;
import com.ibm.cloud.is.vpc.v1.model.InstancePatch;
import com.ibm.cloud.is.vpc.v1.model.InstancePatchProfile;
import com.ibm.cloud.is.vpc.v1.model.InstancePatchProfileInstanceProfileIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.InstancePatchProfileInstanceProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.InstancePlacementTarget;
import com.ibm.cloud.is.vpc.v1.model.InstancePlacementTargetDedicatedHostGroupReference;
import com.ibm.cloud.is.vpc.v1.model.InstancePlacementTargetDedicatedHostReference;
import com.ibm.cloud.is.vpc.v1.model.InstancePlacementTargetPatch;
import com.ibm.cloud.is.vpc.v1.model.InstancePlacementTargetPatchDedicatedHostGroupIdentity;
import com.ibm.cloud.is.vpc.v1.model.InstancePlacementTargetPatchDedicatedHostGroupIdentityDedicatedHostGroupIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.InstancePlacementTargetPatchDedicatedHostGroupIdentityDedicatedHostGroupIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.InstancePlacementTargetPatchDedicatedHostGroupIdentityDedicatedHostGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.InstancePlacementTargetPatchDedicatedHostIdentity;
import com.ibm.cloud.is.vpc.v1.model.InstancePlacementTargetPatchDedicatedHostIdentityDedicatedHostIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.InstancePlacementTargetPatchDedicatedHostIdentityDedicatedHostIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.InstancePlacementTargetPatchDedicatedHostIdentityDedicatedHostIdentityById;
import com.ibm.cloud.is.vpc.v1.model.InstancePlacementTargetPlacementGroupReference;
import com.ibm.cloud.is.vpc.v1.model.InstancePlacementTargetPrototype;
import com.ibm.cloud.is.vpc.v1.model.InstancePlacementTargetPrototypeDedicatedHostGroupIdentity;
import com.ibm.cloud.is.vpc.v1.model.InstancePlacementTargetPrototypeDedicatedHostGroupIdentityDedicatedHostGroupIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.InstancePlacementTargetPrototypeDedicatedHostGroupIdentityDedicatedHostGroupIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.InstancePlacementTargetPrototypeDedicatedHostGroupIdentityDedicatedHostGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.InstancePlacementTargetPrototypeDedicatedHostIdentity;
import com.ibm.cloud.is.vpc.v1.model.InstancePlacementTargetPrototypeDedicatedHostIdentityDedicatedHostIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.InstancePlacementTargetPrototypeDedicatedHostIdentityDedicatedHostIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.InstancePlacementTargetPrototypeDedicatedHostIdentityDedicatedHostIdentityById;
import com.ibm.cloud.is.vpc.v1.model.InstancePlacementTargetPrototypePlacementGroupIdentity;
import com.ibm.cloud.is.vpc.v1.model.InstancePlacementTargetPrototypePlacementGroupIdentityPlacementGroupIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.InstancePlacementTargetPrototypePlacementGroupIdentityPlacementGroupIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.InstancePlacementTargetPrototypePlacementGroupIdentityPlacementGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfile;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileBandwidth;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileBandwidthDependent;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileBandwidthEnum;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileBandwidthFixed;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileBandwidthRange;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileClusterNetworkAttachmentCount;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileClusterNetworkAttachmentCountDependent;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileClusterNetworkAttachmentCountEnum;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileClusterNetworkAttachmentCountRange;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileDisk;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileDiskQuantity;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileDiskQuantityDependent;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileDiskQuantityEnum;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileDiskQuantityFixed;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileDiskQuantityRange;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileDiskSize;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileDiskSizeDependent;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileDiskSizeEnum;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileDiskSizeFixed;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileDiskSizeRange;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileDiskSupportedInterfaces;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileGPU;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileGPUDependent;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileGPUEnum;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileGPUFixed;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileGPUManufacturer;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileGPUMemory;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileGPUMemoryDependent;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileGPUMemoryEnum;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileGPUMemoryFixed;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileGPUMemoryRange;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileGPUModel;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileGPURange;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileIdentity;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileMemory;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileMemoryDependent;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileMemoryEnum;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileMemoryFixed;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileMemoryRange;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileNUMACount;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileNUMACountDependent;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileNUMACountFixed;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileNetworkAttachmentCount;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileNetworkAttachmentCountDependent;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileNetworkAttachmentCountRange;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileNetworkInterfaceCount;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileNetworkInterfaceCountDependent;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileNetworkInterfaceCountRange;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileOSArchitecture;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfilePortSpeed;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfilePortSpeedDependent;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfilePortSpeedFixed;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileReference;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileReservationTerms;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileSupportedConfidentialComputeModes;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileSupportedSecureBootModes;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileVCPU;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileVCPUArchitecture;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileVCPUDependent;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileVCPUEnum;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileVCPUFixed;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileVCPUManufacturer;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileVCPURange;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileVolumeBandwidth;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileVolumeBandwidthDependent;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileVolumeBandwidthEnum;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileVolumeBandwidthFixed;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileVolumeBandwidthRange;
import com.ibm.cloud.is.vpc.v1.model.InstancePrototype;
import com.ibm.cloud.is.vpc.v1.model.InstancePrototypeInstanceByCatalogOffering;
import com.ibm.cloud.is.vpc.v1.model.InstancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment;
import com.ibm.cloud.is.vpc.v1.model.InstancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkInterface;
import com.ibm.cloud.is.vpc.v1.model.InstancePrototypeInstanceByImage;
import com.ibm.cloud.is.vpc.v1.model.InstancePrototypeInstanceByImageInstanceByImageInstanceByNetworkAttachment;
import com.ibm.cloud.is.vpc.v1.model.InstancePrototypeInstanceByImageInstanceByImageInstanceByNetworkInterface;
import com.ibm.cloud.is.vpc.v1.model.InstancePrototypeInstanceBySourceSnapshot;
import com.ibm.cloud.is.vpc.v1.model.InstancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment;
import com.ibm.cloud.is.vpc.v1.model.InstancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkInterface;
import com.ibm.cloud.is.vpc.v1.model.InstancePrototypeInstanceBySourceTemplate;
import com.ibm.cloud.is.vpc.v1.model.InstancePrototypeInstanceByVolume;
import com.ibm.cloud.is.vpc.v1.model.InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment;
import com.ibm.cloud.is.vpc.v1.model.InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterface;
import com.ibm.cloud.is.vpc.v1.model.InstanceReference;
import com.ibm.cloud.is.vpc.v1.model.InstanceReservationAffinity;
import com.ibm.cloud.is.vpc.v1.model.InstanceReservationAffinityPatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceReservationAffinityPrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceStatusReason;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplate;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateIdentity;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateIdentityById;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateInstanceByCatalogOfferingInstanceTemplateContext;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateInstanceByCatalogOfferingInstanceTemplateContextInstanceByCatalogOfferingInstanceTemplateContextInstanceByNetworkAttachment;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateInstanceByCatalogOfferingInstanceTemplateContextInstanceByCatalogOfferingInstanceTemplateContextInstanceByNetworkInterface;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateInstanceByImageInstanceTemplateContext;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateInstanceByImageInstanceTemplateContextInstanceByImageInstanceTemplateContextInstanceByNetworkAttachment;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateInstanceByImageInstanceTemplateContextInstanceByImageInstanceTemplateContextInstanceByNetworkInterface;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateInstanceBySourceSnapshotInstanceTemplateContext;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateInstanceBySourceSnapshotInstanceTemplateContextInstanceBySourceSnapshotInstanceTemplateContextInstanceByNetworkAttachment;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateInstanceBySourceSnapshotInstanceTemplateContextInstanceBySourceSnapshotInstanceTemplateContextInstanceByNetworkInterface;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplatePatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplatePrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplatePrototypeInstanceTemplateByCatalogOffering;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkAttachment;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplatePrototypeInstanceTemplateByImage;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachment;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkInterface;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplatePrototypeInstanceTemplateBySourceSnapshot;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkAttachment;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplatePrototypeInstanceTemplateBySourceTemplate;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateReference;
import com.ibm.cloud.is.vpc.v1.model.InstanceVCPU;
import com.ibm.cloud.is.vpc.v1.model.InstancesPager;
import com.ibm.cloud.is.vpc.v1.model.IpsecPoliciesPager;
import com.ibm.cloud.is.vpc.v1.model.IpsecPolicyConnectionsPager;
import com.ibm.cloud.is.vpc.v1.model.Key;
import com.ibm.cloud.is.vpc.v1.model.KeyCollection;
import com.ibm.cloud.is.vpc.v1.model.KeyIdentity;
import com.ibm.cloud.is.vpc.v1.model.KeyIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.KeyIdentityByFingerprint;
import com.ibm.cloud.is.vpc.v1.model.KeyIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.KeyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.KeyPatch;
import com.ibm.cloud.is.vpc.v1.model.KeyReference;
import com.ibm.cloud.is.vpc.v1.model.KeysPager;
import com.ibm.cloud.is.vpc.v1.model.LegacyCloudObjectStorageBucketIdentity;
import com.ibm.cloud.is.vpc.v1.model.LegacyCloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.LegacyCloudObjectStorageBucketReference;
import com.ibm.cloud.is.vpc.v1.model.ListBackupPoliciesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListBackupPolicyJobsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListBackupPolicyPlansOptions;
import com.ibm.cloud.is.vpc.v1.model.ListBareMetalServerDisksOptions;
import com.ibm.cloud.is.vpc.v1.model.ListBareMetalServerNetworkAttachmentsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListBareMetalServerNetworkInterfaceFloatingIpsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListBareMetalServerNetworkInterfaceIpsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListBareMetalServerNetworkInterfacesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListBareMetalServerProfilesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListBareMetalServersOptions;
import com.ibm.cloud.is.vpc.v1.model.ListClusterNetworkInterfacesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListClusterNetworkProfilesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListClusterNetworkSubnetReservedIpsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListClusterNetworkSubnetsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListClusterNetworksOptions;
import com.ibm.cloud.is.vpc.v1.model.ListDedicatedHostDisksOptions;
import com.ibm.cloud.is.vpc.v1.model.ListDedicatedHostGroupsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListDedicatedHostProfilesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListDedicatedHostsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListEndpointGatewayIpsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListEndpointGatewaysOptions;
import com.ibm.cloud.is.vpc.v1.model.ListFloatingIpsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListFlowLogCollectorsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListIkePoliciesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListIkePolicyConnectionsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListImageExportJobsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListImagesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListInstanceClusterNetworkAttachmentsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListInstanceDisksOptions;
import com.ibm.cloud.is.vpc.v1.model.ListInstanceGroupManagerActionsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListInstanceGroupManagerPoliciesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListInstanceGroupManagersOptions;
import com.ibm.cloud.is.vpc.v1.model.ListInstanceGroupMembershipsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListInstanceGroupsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListInstanceNetworkAttachmentsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListInstanceNetworkInterfaceFloatingIpsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListInstanceNetworkInterfaceIpsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListInstanceNetworkInterfacesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListInstanceProfilesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListInstanceTemplatesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListInstanceVolumeAttachmentsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListInstancesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListIpsecPoliciesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListIpsecPolicyConnectionsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListKeysOptions;
import com.ibm.cloud.is.vpc.v1.model.ListLoadBalancerListenerPoliciesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListLoadBalancerListenerPolicyRulesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListLoadBalancerListenersOptions;
import com.ibm.cloud.is.vpc.v1.model.ListLoadBalancerPoolMembersOptions;
import com.ibm.cloud.is.vpc.v1.model.ListLoadBalancerPoolsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListLoadBalancerProfilesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListLoadBalancersOptions;
import com.ibm.cloud.is.vpc.v1.model.ListNetworkAclRulesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListNetworkAclsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListNetworkInterfaceFloatingIpsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListOperatingSystemsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListPlacementGroupsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListPrivatePathServiceGatewayAccountPoliciesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListPrivatePathServiceGatewayEndpointGatewayBindingsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListPrivatePathServiceGatewaysOptions;
import com.ibm.cloud.is.vpc.v1.model.ListPublicGatewaysOptions;
import com.ibm.cloud.is.vpc.v1.model.ListRegionZonesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListRegionsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListReservationsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListSecurityGroupRulesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListSecurityGroupTargetsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListSecurityGroupsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListShareAccessorBindingsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListShareMountTargetsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListShareProfilesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListShareSnapshotsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListSharesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListSnapshotClonesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListSnapshotConsistencyGroupsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListSnapshotsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListSubnetReservedIpsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListSubnetsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVirtualNetworkInterfaceIpsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVirtualNetworkInterfacesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVolumeProfilesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVolumesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVpcAddressPrefixesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVpcDnsResolutionBindingsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVpcRoutesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVpcRoutingTableRoutesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVpcRoutingTablesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVpcsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVpnGatewayConnectionsLocalCidrsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVpnGatewayConnectionsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVpnGatewayConnectionsPeerCidrsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVpnGatewaysOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVpnServerClientsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVpnServerRoutesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVpnServersOptions;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancer;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerCollection;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerDNS;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerDNSPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerDNSPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerIdentity;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerIdentityById;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListener;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerCollection;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerDefaultPoolPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerDefaultPoolPatchLoadBalancerPoolIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerDefaultPoolPatchLoadBalancerPoolIdentityById;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerHTTPSRedirect;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerHTTPSRedirectPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerHTTPSRedirectPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerIdentity;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerIdentityById;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicy;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyCollection;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyReference;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyRule;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyRuleCollection;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyRulePatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyRulePrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyRuleReference;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTarget;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetLoadBalancerListenerPolicyHTTPSRedirect;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetLoadBalancerListenerPolicyRedirectURL;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetLoadBalancerListenerReference;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetLoadBalancerPoolReference;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerIdentity;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerIdentityLoadBalancerListenerIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerIdentityLoadBalancerListenerIdentityById;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyHTTPSRedirectPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyRedirectURLPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetPatchLoadBalancerPoolIdentity;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetPatchLoadBalancerPoolIdentityLoadBalancerPoolIdentityLoadBalancerPoolIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetPatchLoadBalancerPoolIdentityLoadBalancerPoolIdentityLoadBalancerPoolIdentityById;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerIdentity;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerIdentityLoadBalancerListenerIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerIdentityLoadBalancerListenerIdentityById;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyHTTPSRedirectPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyRedirectURLPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetPrototypeLoadBalancerPoolIdentity;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetPrototypeLoadBalancerPoolIdentityLoadBalancerPoolIdentityLoadBalancerPoolIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetPrototypeLoadBalancerPoolIdentityLoadBalancerPoolIdentityLoadBalancerPoolIdentityById;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPrototypeLoadBalancerContext;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerReference;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerLogging;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerLoggingDatapath;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerLoggingDatapathPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerLoggingDatapathPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerLoggingPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerLoggingPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPool;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolCollection;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolFailsafePolicy;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolFailsafePolicyPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolFailsafePolicyPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolFailsafePolicyTargetPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolFailsafePolicyTargetPatchLoadBalancerPoolIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolFailsafePolicyTargetPatchLoadBalancerPoolIdentityById;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolHealthMonitor;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolHealthMonitorPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolHealthMonitorPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTCPPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolHealthMonitorTypeHTTPHTTPS;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolHealthMonitorTypeTCP;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolIdentity;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolIdentityLoadBalancerPoolIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolIdentityLoadBalancerPoolIdentityById;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMember;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberCollection;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberReference;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTarget;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTargetIP;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTargetInstanceReference;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTargetLoadBalancerReference;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTargetPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTargetPrototypeIP;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTargetPrototypeInstanceIdentity;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTargetPrototypeLoadBalancerIdentity;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTargetPrototypeLoadBalancerIdentityLoadBalancerIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTargetPrototypeLoadBalancerIdentityLoadBalancerIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTargetPrototypeLoadBalancerIdentityLoadBalancerIdentityById;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolPrototypeLoadBalancerContext;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolReference;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolSessionPersistence;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolSessionPersistencePatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolSessionPersistencePrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfile;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileAccessModes;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileAvailability;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileAvailabilityDependent;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileAvailabilityFixed;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileCollection;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileFailsafePolicyActions;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileFailsafePolicyActionsDependent;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileFailsafePolicyActionsEnum;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileIdentity;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileInstanceGroupsSupported;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileInstanceGroupsSupportedDependent;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileInstanceGroupsSupportedFixed;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileLoggingSupported;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileReference;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileRouteModeSupported;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileRouteModeSupportedDependent;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileRouteModeSupportedFixed;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileSecurityGroupsSupported;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileSecurityGroupsSupportedDependent;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileSecurityGroupsSupportedFixed;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileSourceIPSessionPersistenceSupported;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileSourceIPSessionPersistenceSupportedDependent;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileSourceIPSessionPersistenceSupportedFixed;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileUDPSupported;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileUDPSupportedDependent;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileUDPSupportedFixed;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfilesPager;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerReference;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerStatistics;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancersPager;
import com.ibm.cloud.is.vpc.v1.model.NetworkACL;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLCollection;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLIdentity;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLIdentityById;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLPatch;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLPrototype;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLPrototypeNetworkACLByRules;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLPrototypeNetworkACLBySourceNetworkACL;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLReference;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRule;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleBeforePatch;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleBeforePatchNetworkACLRuleIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleBeforePatchNetworkACLRuleIdentityById;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleBeforePrototype;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleBeforePrototypeNetworkACLRuleIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleBeforePrototypeNetworkACLRuleIdentityById;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleCollection;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleItem;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleItemNetworkACLRuleProtocolAll;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleItemNetworkACLRuleProtocolICMP;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleItemNetworkACLRuleProtocolTCPUDP;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleNetworkACLRuleProtocolAll;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleNetworkACLRuleProtocolICMP;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleNetworkACLRuleProtocolTCPUDP;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePatch;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePrototype;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePrototypeNetworkACLContext;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAllPrototype;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMPPrototype;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDPPrototype;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePrototypeNetworkACLRuleProtocolAllPrototype;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePrototypeNetworkACLRuleProtocolICMPPrototype;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePrototypeNetworkACLRuleProtocolTCPUDPPrototype;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleReference;
import com.ibm.cloud.is.vpc.v1.model.NetworkAclRulesPager;
import com.ibm.cloud.is.vpc.v1.model.NetworkAclsPager;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterface;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceBareMetalServerContextReference;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceFloatingIpsPager;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceIPPrototype;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceIPPrototypeReservedIPIdentity;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceIPPrototypeReservedIPIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceIPPrototypeReservedIPIdentityById;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceInstanceContextReference;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfacePatch;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfacePrototype;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceUnpaginatedCollection;
import com.ibm.cloud.is.vpc.v1.model.ObsoleteImageOptions;
import com.ibm.cloud.is.vpc.v1.model.OperatingSystem;
import com.ibm.cloud.is.vpc.v1.model.OperatingSystemCollection;
import com.ibm.cloud.is.vpc.v1.model.OperatingSystemIdentity;
import com.ibm.cloud.is.vpc.v1.model.OperatingSystemIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.OperatingSystemIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.OperatingSystemsPager;
import com.ibm.cloud.is.vpc.v1.model.PageLink;
import com.ibm.cloud.is.vpc.v1.model.PermitPrivatePathServiceGatewayEndpointGatewayBindingOptions;
import com.ibm.cloud.is.vpc.v1.model.PlacementGroup;
import com.ibm.cloud.is.vpc.v1.model.PlacementGroupCollection;
import com.ibm.cloud.is.vpc.v1.model.PlacementGroupPatch;
import com.ibm.cloud.is.vpc.v1.model.PlacementGroupsPager;
import com.ibm.cloud.is.vpc.v1.model.PrivatePathServiceGateway;
import com.ibm.cloud.is.vpc.v1.model.PrivatePathServiceGatewayAccountPoliciesPager;
import com.ibm.cloud.is.vpc.v1.model.PrivatePathServiceGatewayAccountPolicy;
import com.ibm.cloud.is.vpc.v1.model.PrivatePathServiceGatewayAccountPolicyCollection;
import com.ibm.cloud.is.vpc.v1.model.PrivatePathServiceGatewayAccountPolicyPatch;
import com.ibm.cloud.is.vpc.v1.model.PrivatePathServiceGatewayCollection;
import com.ibm.cloud.is.vpc.v1.model.PrivatePathServiceGatewayEndpointGatewayBinding;
import com.ibm.cloud.is.vpc.v1.model.PrivatePathServiceGatewayEndpointGatewayBindingCollection;
import com.ibm.cloud.is.vpc.v1.model.PrivatePathServiceGatewayEndpointGatewayBindingsPager;
import com.ibm.cloud.is.vpc.v1.model.PrivatePathServiceGatewayPatch;
import com.ibm.cloud.is.vpc.v1.model.PrivatePathServiceGatewayRemote;
import com.ibm.cloud.is.vpc.v1.model.PrivatePathServiceGatewaysPager;
import com.ibm.cloud.is.vpc.v1.model.PublicGateway;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayCollection;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayFloatingIPPrototype;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayFloatingIPPrototypeFloatingIPIdentity;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayFloatingIPPrototypeFloatingIPIdentityFloatingIPIdentityByAddress;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayFloatingIPPrototypeFloatingIPIdentityFloatingIPIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayFloatingIPPrototypeFloatingIPIdentityFloatingIPIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayFloatingIPPrototypeFloatingIPIdentityFloatingIPIdentityById;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayFloatingIPPrototypeFloatingIPPrototypeTargetContext;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayFloatingIp;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayIdentity;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayIdentityPublicGatewayIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayIdentityPublicGatewayIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayIdentityPublicGatewayIdentityById;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayPatch;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayReference;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewaysPager;
import com.ibm.cloud.is.vpc.v1.model.PublishPrivatePathServiceGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.Region;
import com.ibm.cloud.is.vpc.v1.model.RegionCollection;
import com.ibm.cloud.is.vpc.v1.model.RegionIdentity;
import com.ibm.cloud.is.vpc.v1.model.RegionIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.RegionIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.RegionReference;
import com.ibm.cloud.is.vpc.v1.model.RemoveBareMetalServerNetworkInterfaceFloatingIpOptions;
import com.ibm.cloud.is.vpc.v1.model.RemoveEndpointGatewayIpOptions;
import com.ibm.cloud.is.vpc.v1.model.RemoveInstanceNetworkInterfaceFloatingIpOptions;
import com.ibm.cloud.is.vpc.v1.model.RemoveNetworkInterfaceFloatingIpOptions;
import com.ibm.cloud.is.vpc.v1.model.RemoveVirtualNetworkInterfaceIpOptions;
import com.ibm.cloud.is.vpc.v1.model.RemoveVpnGatewayConnectionsLocalCidrOptions;
import com.ibm.cloud.is.vpc.v1.model.RemoveVpnGatewayConnectionsPeerCidrOptions;
import com.ibm.cloud.is.vpc.v1.model.ReplaceBareMetalServerInitializationOptions;
import com.ibm.cloud.is.vpc.v1.model.ReplaceLoadBalancerPoolMembersOptions;
import com.ibm.cloud.is.vpc.v1.model.ReplaceSubnetNetworkAclOptions;
import com.ibm.cloud.is.vpc.v1.model.ReplaceSubnetRoutingTableOptions;
import com.ibm.cloud.is.vpc.v1.model.Reservation;
import com.ibm.cloud.is.vpc.v1.model.ReservationCapacity;
import com.ibm.cloud.is.vpc.v1.model.ReservationCapacityPatch;
import com.ibm.cloud.is.vpc.v1.model.ReservationCapacityPrototype;
import com.ibm.cloud.is.vpc.v1.model.ReservationCollection;
import com.ibm.cloud.is.vpc.v1.model.ReservationCommittedUse;
import com.ibm.cloud.is.vpc.v1.model.ReservationCommittedUsePatch;
import com.ibm.cloud.is.vpc.v1.model.ReservationCommittedUsePrototype;
import com.ibm.cloud.is.vpc.v1.model.ReservationIdentity;
import com.ibm.cloud.is.vpc.v1.model.ReservationIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.ReservationIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.ReservationIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ReservationPatch;
import com.ibm.cloud.is.vpc.v1.model.ReservationProfile;
import com.ibm.cloud.is.vpc.v1.model.ReservationProfileBareMetalServerProfileReference;
import com.ibm.cloud.is.vpc.v1.model.ReservationProfileInstanceProfileReference;
import com.ibm.cloud.is.vpc.v1.model.ReservationProfilePatch;
import com.ibm.cloud.is.vpc.v1.model.ReservationProfilePrototype;
import com.ibm.cloud.is.vpc.v1.model.ReservationReference;
import com.ibm.cloud.is.vpc.v1.model.ReservationStatusReason;
import com.ibm.cloud.is.vpc.v1.model.ReservationsPager;
import com.ibm.cloud.is.vpc.v1.model.ReservedIP;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPCollection;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPCollectionBareMetalServerNetworkInterfaceContext;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPCollectionEndpointGatewayContext;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPCollectionInstanceNetworkInterfaceContext;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPCollectionVirtualNetworkInterfaceContext;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPPatch;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPReference;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPTarget;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPTargetBareMetalServerNetworkInterfaceReferenceTargetContext;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPTargetEndpointGatewayReference;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPTargetGenericResourceReference;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPTargetLoadBalancerReference;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPTargetNetworkInterfaceReferenceTargetContext;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPTargetPrototype;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPTargetPrototypeEndpointGatewayIdentity;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPTargetPrototypeEndpointGatewayIdentityEndpointGatewayIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPTargetPrototypeEndpointGatewayIdentityEndpointGatewayIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPTargetPrototypeEndpointGatewayIdentityEndpointGatewayIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPTargetPrototypeVirtualNetworkInterfaceIdentity;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPTargetPrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPTargetPrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPTargetPrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPTargetVPNGatewayReference;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPTargetVPNServerReference;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPTargetVirtualNetworkInterfaceReferenceReservedIPTargetContext;
import com.ibm.cloud.is.vpc.v1.model.ResourceFilter;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentity;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupReference;
import com.ibm.cloud.is.vpc.v1.model.RestartBareMetalServerOptions;
import com.ibm.cloud.is.vpc.v1.model.RevokeAccountForPrivatePathServiceGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.Route;
import com.ibm.cloud.is.vpc.v1.model.RouteCollection;
import com.ibm.cloud.is.vpc.v1.model.RouteCollectionVPCContext;
import com.ibm.cloud.is.vpc.v1.model.RouteCreator;
import com.ibm.cloud.is.vpc.v1.model.RouteCreatorVPNGatewayReference;
import com.ibm.cloud.is.vpc.v1.model.RouteCreatorVPNServerReference;
import com.ibm.cloud.is.vpc.v1.model.RouteNextHop;
import com.ibm.cloud.is.vpc.v1.model.RouteNextHopIP;
import com.ibm.cloud.is.vpc.v1.model.RouteNextHopPatch;
import com.ibm.cloud.is.vpc.v1.model.RouteNextHopPatchRouteNextHopIP;
import com.ibm.cloud.is.vpc.v1.model.RouteNextHopPatchRouteNextHopIPRouteNextHopIPSentinelIP;
import com.ibm.cloud.is.vpc.v1.model.RouteNextHopPatchRouteNextHopIPRouteNextHopIPUnicastIP;
import com.ibm.cloud.is.vpc.v1.model.RouteNextHopPatchVPNGatewayConnectionIdentity;
import com.ibm.cloud.is.vpc.v1.model.RouteNextHopPatchVPNGatewayConnectionIdentityVPNGatewayConnectionIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.RouteNextHopPatchVPNGatewayConnectionIdentityVPNGatewayConnectionIdentityById;
import com.ibm.cloud.is.vpc.v1.model.RouteNextHopPrototype;
import com.ibm.cloud.is.vpc.v1.model.RouteNextHopPrototypeRouteNextHopIP;
import com.ibm.cloud.is.vpc.v1.model.RouteNextHopPrototypeRouteNextHopIPRouteNextHopIPSentinelIP;
import com.ibm.cloud.is.vpc.v1.model.RouteNextHopPrototypeRouteNextHopIPRouteNextHopIPUnicastIP;
import com.ibm.cloud.is.vpc.v1.model.RouteNextHopPrototypeVPNGatewayConnectionIdentity;
import com.ibm.cloud.is.vpc.v1.model.RouteNextHopPrototypeVPNGatewayConnectionIdentityVPNGatewayConnectionIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.RouteNextHopPrototypeVPNGatewayConnectionIdentityVPNGatewayConnectionIdentityById;
import com.ibm.cloud.is.vpc.v1.model.RouteNextHopVPNGatewayConnectionReference;
import com.ibm.cloud.is.vpc.v1.model.RoutePatch;
import com.ibm.cloud.is.vpc.v1.model.RoutePrototype;
import com.ibm.cloud.is.vpc.v1.model.RouteReference;
import com.ibm.cloud.is.vpc.v1.model.RoutingTable;
import com.ibm.cloud.is.vpc.v1.model.RoutingTableCollection;
import com.ibm.cloud.is.vpc.v1.model.RoutingTableIdentity;
import com.ibm.cloud.is.vpc.v1.model.RoutingTableIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.RoutingTableIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.RoutingTableIdentityById;
import com.ibm.cloud.is.vpc.v1.model.RoutingTablePatch;
import com.ibm.cloud.is.vpc.v1.model.RoutingTableReference;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroup;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupCollection;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupIdentity;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupPatch;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupReference;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRule;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleCollection;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleLocal;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleLocalCIDR;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleLocalIP;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleLocalPatch;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleLocalPatchCIDR;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleLocalPatchIP;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleLocalPrototype;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleLocalPrototypeCIDR;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleLocalPrototypeIP;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRulePatch;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRulePrototype;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRulePrototypeSecurityGroupRuleProtocolAll;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRulePrototypeSecurityGroupRuleProtocolTCPUDP;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleRemote;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleRemoteCIDR;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleRemoteIP;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleRemotePatch;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleRemotePatchCIDR;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleRemotePatchIP;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleRemotePatchSecurityGroupIdentity;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleRemotePatchSecurityGroupIdentitySecurityGroupIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleRemotePatchSecurityGroupIdentitySecurityGroupIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleRemotePatchSecurityGroupIdentitySecurityGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleRemotePrototype;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleRemotePrototypeCIDR;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleRemotePrototypeIP;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleRemotePrototypeSecurityGroupIdentity;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleRemotePrototypeSecurityGroupIdentitySecurityGroupIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleRemotePrototypeSecurityGroupIdentitySecurityGroupIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleRemotePrototypeSecurityGroupIdentitySecurityGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleRemoteSecurityGroupReference;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleSecurityGroupRuleProtocolAll;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleSecurityGroupRuleProtocolICMP;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleSecurityGroupRuleProtocolTCPUDP;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupTargetCollection;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupTargetReference;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupTargetReferenceBareMetalServerNetworkInterfaceReferenceTargetContext;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupTargetReferenceEndpointGatewayReference;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupTargetReferenceLoadBalancerReference;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupTargetReferenceNetworkInterfaceReferenceTargetContext;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupTargetReferenceVPNServerReference;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupTargetReferenceVirtualNetworkInterfaceReference;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupTargetsPager;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupsPager;
import com.ibm.cloud.is.vpc.v1.model.SetSubnetPublicGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.Share;
import com.ibm.cloud.is.vpc.v1.model.ShareAccessorBinding;
import com.ibm.cloud.is.vpc.v1.model.ShareAccessorBindingAccessor;
import com.ibm.cloud.is.vpc.v1.model.ShareAccessorBindingAccessorShareReference;
import com.ibm.cloud.is.vpc.v1.model.ShareAccessorBindingAccessorWatsonxMachineLearningReference;
import com.ibm.cloud.is.vpc.v1.model.ShareAccessorBindingCollection;
import com.ibm.cloud.is.vpc.v1.model.ShareAccessorBindingReference;
import com.ibm.cloud.is.vpc.v1.model.ShareAccessorBindingsPager;
import com.ibm.cloud.is.vpc.v1.model.ShareCollection;
import com.ibm.cloud.is.vpc.v1.model.ShareIdentity;
import com.ibm.cloud.is.vpc.v1.model.ShareIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.ShareIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.ShareIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ShareInitialOwner;
import com.ibm.cloud.is.vpc.v1.model.ShareJob;
import com.ibm.cloud.is.vpc.v1.model.ShareJobStatusReason;
import com.ibm.cloud.is.vpc.v1.model.ShareLatestSync;
import com.ibm.cloud.is.vpc.v1.model.ShareLifecycleReason;
import com.ibm.cloud.is.vpc.v1.model.ShareMountTarget;
import com.ibm.cloud.is.vpc.v1.model.ShareMountTargetCollection;
import com.ibm.cloud.is.vpc.v1.model.ShareMountTargetPatch;
import com.ibm.cloud.is.vpc.v1.model.ShareMountTargetPrototype;
import com.ibm.cloud.is.vpc.v1.model.ShareMountTargetPrototypeShareMountTargetByAccessControlModeSecurityGroup;
import com.ibm.cloud.is.vpc.v1.model.ShareMountTargetPrototypeShareMountTargetByAccessControlModeVPC;
import com.ibm.cloud.is.vpc.v1.model.ShareMountTargetReference;
import com.ibm.cloud.is.vpc.v1.model.ShareMountTargetVirtualNetworkInterfacePrototype;
import com.ibm.cloud.is.vpc.v1.model.ShareMountTargetVirtualNetworkInterfacePrototypeVirtualNetworkInterfaceIdentity;
import com.ibm.cloud.is.vpc.v1.model.ShareMountTargetVirtualNetworkInterfacePrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.ShareMountTargetVirtualNetworkInterfacePrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.ShareMountTargetVirtualNetworkInterfacePrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ShareMountTargetVirtualNetworkInterfacePrototypeVirtualNetworkInterfacePrototypeShareMountTargetContext;
import com.ibm.cloud.is.vpc.v1.model.ShareMountTargetsPager;
import com.ibm.cloud.is.vpc.v1.model.SharePatch;
import com.ibm.cloud.is.vpc.v1.model.ShareProfile;
import com.ibm.cloud.is.vpc.v1.model.ShareProfileCapacity;
import com.ibm.cloud.is.vpc.v1.model.ShareProfileCapacityDependentRange;
import com.ibm.cloud.is.vpc.v1.model.ShareProfileCapacityEnum;
import com.ibm.cloud.is.vpc.v1.model.ShareProfileCapacityFixed;
import com.ibm.cloud.is.vpc.v1.model.ShareProfileCapacityRange;
import com.ibm.cloud.is.vpc.v1.model.ShareProfileCollection;
import com.ibm.cloud.is.vpc.v1.model.ShareProfileIOPS;
import com.ibm.cloud.is.vpc.v1.model.ShareProfileIOPSDependent;
import com.ibm.cloud.is.vpc.v1.model.ShareProfileIOPSDependentRange;
import com.ibm.cloud.is.vpc.v1.model.ShareProfileIOPSEnum;
import com.ibm.cloud.is.vpc.v1.model.ShareProfileIOPSFixed;
import com.ibm.cloud.is.vpc.v1.model.ShareProfileIOPSRange;
import com.ibm.cloud.is.vpc.v1.model.ShareProfileIdentity;
import com.ibm.cloud.is.vpc.v1.model.ShareProfileIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.ShareProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.ShareProfileReference;
import com.ibm.cloud.is.vpc.v1.model.ShareProfilesPager;
import com.ibm.cloud.is.vpc.v1.model.SharePrototype;
import com.ibm.cloud.is.vpc.v1.model.SharePrototypeShareByOriginShare;
import com.ibm.cloud.is.vpc.v1.model.SharePrototypeShareBySize;
import com.ibm.cloud.is.vpc.v1.model.SharePrototypeShareBySourceShare;
import com.ibm.cloud.is.vpc.v1.model.SharePrototypeShareBySourceSnapshot;
import com.ibm.cloud.is.vpc.v1.model.SharePrototypeShareContext;
import com.ibm.cloud.is.vpc.v1.model.ShareReference;
import com.ibm.cloud.is.vpc.v1.model.ShareRemote;
import com.ibm.cloud.is.vpc.v1.model.ShareReplicationStatusReason;
import com.ibm.cloud.is.vpc.v1.model.ShareSnapshot;
import com.ibm.cloud.is.vpc.v1.model.ShareSnapshotCollection;
import com.ibm.cloud.is.vpc.v1.model.ShareSnapshotLifecycleReason;
import com.ibm.cloud.is.vpc.v1.model.ShareSnapshotPatch;
import com.ibm.cloud.is.vpc.v1.model.ShareSnapshotStatusReason;
import com.ibm.cloud.is.vpc.v1.model.ShareSnapshotsPager;
import com.ibm.cloud.is.vpc.v1.model.ShareSourceSnapshot;
import com.ibm.cloud.is.vpc.v1.model.ShareSourceSnapshotPrototype;
import com.ibm.cloud.is.vpc.v1.model.ShareSourceSnapshotPrototypeShareSnapshotIdentity;
import com.ibm.cloud.is.vpc.v1.model.ShareSourceSnapshotPrototypeShareSnapshotIdentityShareSnapshotIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.ShareSourceSnapshotPrototypeShareSnapshotIdentityShareSnapshotIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.ShareSourceSnapshotPrototypeShareSnapshotIdentityShareSnapshotIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ShareSourceSnapshotShareSnapshotReference;
import com.ibm.cloud.is.vpc.v1.model.SharesPager;
import com.ibm.cloud.is.vpc.v1.model.Snapshot;
import com.ibm.cloud.is.vpc.v1.model.SnapshotCatalogOffering;
import com.ibm.cloud.is.vpc.v1.model.SnapshotClone;
import com.ibm.cloud.is.vpc.v1.model.SnapshotCloneCollection;
import com.ibm.cloud.is.vpc.v1.model.SnapshotClonePrototype;
import com.ibm.cloud.is.vpc.v1.model.SnapshotCollection;
import com.ibm.cloud.is.vpc.v1.model.SnapshotConsistencyGroup;
import com.ibm.cloud.is.vpc.v1.model.SnapshotConsistencyGroupCollection;
import com.ibm.cloud.is.vpc.v1.model.SnapshotConsistencyGroupPatch;
import com.ibm.cloud.is.vpc.v1.model.SnapshotConsistencyGroupPrototype;
import com.ibm.cloud.is.vpc.v1.model.SnapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshots;
import com.ibm.cloud.is.vpc.v1.model.SnapshotConsistencyGroupReference;
import com.ibm.cloud.is.vpc.v1.model.SnapshotConsistencyGroupsPager;
import com.ibm.cloud.is.vpc.v1.model.SnapshotCopiesItem;
import com.ibm.cloud.is.vpc.v1.model.SnapshotIdentity;
import com.ibm.cloud.is.vpc.v1.model.SnapshotIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.SnapshotIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.SnapshotIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SnapshotPatch;
import com.ibm.cloud.is.vpc.v1.model.SnapshotPrototype;
import com.ibm.cloud.is.vpc.v1.model.SnapshotPrototypeSnapshotBySourceSnapshot;
import com.ibm.cloud.is.vpc.v1.model.SnapshotPrototypeSnapshotBySourceVolume;
import com.ibm.cloud.is.vpc.v1.model.SnapshotPrototypeSnapshotConsistencyGroupContext;
import com.ibm.cloud.is.vpc.v1.model.SnapshotReference;
import com.ibm.cloud.is.vpc.v1.model.SnapshotRemote;
import com.ibm.cloud.is.vpc.v1.model.SnapshotSourceSnapshot;
import com.ibm.cloud.is.vpc.v1.model.SnapshotsPager;
import com.ibm.cloud.is.vpc.v1.model.StartBareMetalServerOptions;
import com.ibm.cloud.is.vpc.v1.model.StopBareMetalServerOptions;
import com.ibm.cloud.is.vpc.v1.model.Subnet;
import com.ibm.cloud.is.vpc.v1.model.SubnetCollection;
import com.ibm.cloud.is.vpc.v1.model.SubnetIdentity;
import com.ibm.cloud.is.vpc.v1.model.SubnetIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.SubnetIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.SubnetIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SubnetPatch;
import com.ibm.cloud.is.vpc.v1.model.SubnetPrototype;
import com.ibm.cloud.is.vpc.v1.model.SubnetPrototypeSubnetByCIDR;
import com.ibm.cloud.is.vpc.v1.model.SubnetPrototypeSubnetByTotalCount;
import com.ibm.cloud.is.vpc.v1.model.SubnetPublicGatewayPatch;
import com.ibm.cloud.is.vpc.v1.model.SubnetPublicGatewayPatchPublicGatewayIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.SubnetPublicGatewayPatchPublicGatewayIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.SubnetPublicGatewayPatchPublicGatewayIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SubnetReference;
import com.ibm.cloud.is.vpc.v1.model.SubnetReservedIpsPager;
import com.ibm.cloud.is.vpc.v1.model.SubnetsPager;
import com.ibm.cloud.is.vpc.v1.model.TrustedProfileIdentity;
import com.ibm.cloud.is.vpc.v1.model.TrustedProfileIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.TrustedProfileIdentityById;
import com.ibm.cloud.is.vpc.v1.model.TrustedProfileReference;
import com.ibm.cloud.is.vpc.v1.model.UnpublishPrivatePathServiceGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.UnsetSubnetPublicGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateBackupPolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateBackupPolicyPlanOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateBareMetalServerDiskOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateBareMetalServerNetworkAttachmentOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateBareMetalServerNetworkInterfaceOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateBareMetalServerOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateClusterNetworkInterfaceOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateClusterNetworkOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateClusterNetworkSubnetOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateClusterNetworkSubnetReservedIpOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateDedicatedHostDiskOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateDedicatedHostGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateDedicatedHostOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateEndpointGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateFirmwareForBareMetalServerOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateFloatingIpOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateFlowLogCollectorOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateIkePolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateImageExportJobOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateImageOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateInstanceClusterNetworkAttachmentOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateInstanceDiskOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateInstanceGroupManagerActionOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateInstanceGroupManagerOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateInstanceGroupManagerPolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateInstanceGroupMembershipOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateInstanceGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateInstanceNetworkAttachmentOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateInstanceNetworkInterfaceOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateInstanceOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateInstanceTemplateOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateInstanceVolumeAttachmentOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateIpsecPolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateKeyOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateLoadBalancerListenerOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateLoadBalancerListenerPolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateLoadBalancerListenerPolicyRuleOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateLoadBalancerOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateLoadBalancerPoolMemberOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateLoadBalancerPoolOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateNetworkAclOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateNetworkAclRuleOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdatePlacementGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdatePrivatePathServiceGatewayAccountPolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdatePrivatePathServiceGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdatePublicGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateReservationOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateSecurityGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateSecurityGroupRuleOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateShareMountTargetOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateShareOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateShareSnapshotOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateSnapshotConsistencyGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateSnapshotOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateSubnetOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateSubnetReservedIpOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateVirtualNetworkInterfaceOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateVolumeOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateVpcAddressPrefixOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateVpcDnsResolutionBindingOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateVpcOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateVpcRouteOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateVpcRoutingTableOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateVpcRoutingTableRouteOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateVpnGatewayConnectionOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateVpnGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateVpnServerOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateVpnServerRouteOptions;
import com.ibm.cloud.is.vpc.v1.model.VCPU;
import com.ibm.cloud.is.vpc.v1.model.VPC;
import com.ibm.cloud.is.vpc.v1.model.VPCCSESourceIP;
import com.ibm.cloud.is.vpc.v1.model.VPCCollection;
import com.ibm.cloud.is.vpc.v1.model.VPCDNS;
import com.ibm.cloud.is.vpc.v1.model.VPCDNSPatch;
import com.ibm.cloud.is.vpc.v1.model.VPCDNSPrototype;
import com.ibm.cloud.is.vpc.v1.model.VPCDNSResolutionBinding;
import com.ibm.cloud.is.vpc.v1.model.VPCDNSResolutionBindingCollection;
import com.ibm.cloud.is.vpc.v1.model.VPCDNSResolutionBindingHealthReason;
import com.ibm.cloud.is.vpc.v1.model.VPCDNSResolutionBindingPatch;
import com.ibm.cloud.is.vpc.v1.model.VPCDNSResolver;
import com.ibm.cloud.is.vpc.v1.model.VPCDNSResolverPatch;
import com.ibm.cloud.is.vpc.v1.model.VPCDNSResolverPrototype;
import com.ibm.cloud.is.vpc.v1.model.VPCDNSResolverPrototypeVPCDNSResolverTypeManualPrototype;
import com.ibm.cloud.is.vpc.v1.model.VPCDNSResolverPrototypeVPCDNSResolverTypeSystemPrototype;
import com.ibm.cloud.is.vpc.v1.model.VPCDNSResolverTypeDelegated;
import com.ibm.cloud.is.vpc.v1.model.VPCDNSResolverTypeManual;
import com.ibm.cloud.is.vpc.v1.model.VPCDNSResolverTypeSystem;
import com.ibm.cloud.is.vpc.v1.model.VPCDNSResolverVPCPatch;
import com.ibm.cloud.is.vpc.v1.model.VPCDNSResolverVPCPatchVPCIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.VPCDNSResolverVPCPatchVPCIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.VPCDNSResolverVPCPatchVPCIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VPCHealthReason;
import com.ibm.cloud.is.vpc.v1.model.VPCIdentity;
import com.ibm.cloud.is.vpc.v1.model.VPCIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.VPCIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.VPCIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VPCPatch;
import com.ibm.cloud.is.vpc.v1.model.VPCReference;
import com.ibm.cloud.is.vpc.v1.model.VPCReferenceDNSResolverContext;
import com.ibm.cloud.is.vpc.v1.model.VPCReferenceRemote;
import com.ibm.cloud.is.vpc.v1.model.VPCRemote;
import com.ibm.cloud.is.vpc.v1.model.VPNGateway;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayCollection;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnection;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionCIDRs;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionCollection;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionDPD;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionDPDPatch;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionDPDPrototype;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionIKEIdentity;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionIKEIdentityPrototype;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionIKEIdentityPrototypeVPNGatewayConnectionIKEIdentityFQDN;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionIKEIdentityPrototypeVPNGatewayConnectionIKEIdentityHostname;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionIKEIdentityPrototypeVPNGatewayConnectionIKEIdentityIPv4;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionIKEIdentityPrototypeVPNGatewayConnectionIKEIdentityKeyID;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionIKEIdentityVPNGatewayConnectionIKEIdentityFQDN;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionIKEIdentityVPNGatewayConnectionIKEIdentityHostname;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionIKEIdentityVPNGatewayConnectionIKEIdentityIPv4;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionIKEIdentityVPNGatewayConnectionIKEIdentityKeyID;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionIKEPolicyPatch;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionIKEPolicyPatchIKEPolicyIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionIKEPolicyPatchIKEPolicyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionIKEPolicyPrototype;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionIPsecPolicyPatch;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionIPsecPolicyPatchIPsecPolicyIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionIPsecPolicyPatchIPsecPolicyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionIPsecPolicyPrototype;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionIPsecPolicyPrototypeIPsecPolicyIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionIPsecPolicyPrototypeIPsecPolicyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPatch;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPeerPatch;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPeerPatchVPNGatewayConnectionPolicyModePeerPatch;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPeerAddressPatch;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPeerFQDNPatch;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPeerPatchVPNGatewayConnectionStaticRouteModePeerPatch;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionPeerAddressPatch;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionPeerFQDNPatch;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPolicyMode;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPolicyModeLocal;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPolicyModeLocalPrototype;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPolicyModePeer;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPolicyModePeerPrototype;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPolicyModePeerPrototypeVPNGatewayConnectionPeerByAddress;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPolicyModePeerPrototypeVPNGatewayConnectionPeerByFQDN;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPolicyModePeerVPNGatewayConnectionPeerByAddress;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPolicyModePeerVPNGatewayConnectionPeerByFQDN;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPrototype;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototype;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionReference;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionRouteMode;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionRouteModeVPNGatewayConnectionStaticRouteMode;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionStaticRouteModeLocal;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionStaticRouteModeLocalPrototype;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionStaticRouteModePeer;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionStaticRouteModePeerPrototype;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionStaticRouteModePeerPrototypeVPNGatewayConnectionPeerByAddress;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionStaticRouteModePeerPrototypeVPNGatewayConnectionPeerByFQDN;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionStaticRouteModePeerVPNGatewayConnectionPeerByAddress;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionStaticRouteModePeerVPNGatewayConnectionPeerByFQDN;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionStaticRouteModeTunnel;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionStatusReason;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionTunnelStatusReason;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayHealthReason;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayLifecycleReason;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayMember;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayMemberHealthReason;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayMemberLifecycleReason;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayPatch;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayPolicyMode;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayPrototype;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayPrototypeVPNGatewayPolicyModePrototype;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayPrototypeVPNGatewayRouteModePrototype;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayRouteMode;
import com.ibm.cloud.is.vpc.v1.model.VPNServer;
import com.ibm.cloud.is.vpc.v1.model.VPNServerAuthentication;
import com.ibm.cloud.is.vpc.v1.model.VPNServerAuthenticationByCertificate;
import com.ibm.cloud.is.vpc.v1.model.VPNServerAuthenticationByUsername;
import com.ibm.cloud.is.vpc.v1.model.VPNServerAuthenticationByUsernameIdProvider;
import com.ibm.cloud.is.vpc.v1.model.VPNServerAuthenticationByUsernameIdProviderByIAM;
import com.ibm.cloud.is.vpc.v1.model.VPNServerAuthenticationPrototype;
import com.ibm.cloud.is.vpc.v1.model.VPNServerAuthenticationPrototypeVPNServerAuthenticationByCertificatePrototype;
import com.ibm.cloud.is.vpc.v1.model.VPNServerAuthenticationPrototypeVPNServerAuthenticationByUsernamePrototype;
import com.ibm.cloud.is.vpc.v1.model.VPNServerClient;
import com.ibm.cloud.is.vpc.v1.model.VPNServerClientCollection;
import com.ibm.cloud.is.vpc.v1.model.VPNServerCollection;
import com.ibm.cloud.is.vpc.v1.model.VPNServerHealthReason;
import com.ibm.cloud.is.vpc.v1.model.VPNServerLifecycleReason;
import com.ibm.cloud.is.vpc.v1.model.VPNServerPatch;
import com.ibm.cloud.is.vpc.v1.model.VPNServerRoute;
import com.ibm.cloud.is.vpc.v1.model.VPNServerRouteCollection;
import com.ibm.cloud.is.vpc.v1.model.VPNServerRouteHealthReason;
import com.ibm.cloud.is.vpc.v1.model.VPNServerRouteLifecycleReason;
import com.ibm.cloud.is.vpc.v1.model.VPNServerRoutePatch;
import com.ibm.cloud.is.vpc.v1.model.VirtualNetworkInterface;
import com.ibm.cloud.is.vpc.v1.model.VirtualNetworkInterfaceCollection;
import com.ibm.cloud.is.vpc.v1.model.VirtualNetworkInterfaceIPPrototype;
import com.ibm.cloud.is.vpc.v1.model.VirtualNetworkInterfaceIPPrototypeReservedIPIdentityVirtualNetworkInterfaceIPsContext;
import com.ibm.cloud.is.vpc.v1.model.VirtualNetworkInterfaceIPPrototypeReservedIPIdentityVirtualNetworkInterfaceIPsContextByHref;
import com.ibm.cloud.is.vpc.v1.model.VirtualNetworkInterfaceIPPrototypeReservedIPIdentityVirtualNetworkInterfaceIPsContextById;
import com.ibm.cloud.is.vpc.v1.model.VirtualNetworkInterfaceIPPrototypeReservedIPPrototypeVirtualNetworkInterfaceIPsContext;
import com.ibm.cloud.is.vpc.v1.model.VirtualNetworkInterfaceIpsPager;
import com.ibm.cloud.is.vpc.v1.model.VirtualNetworkInterfacePatch;
import com.ibm.cloud.is.vpc.v1.model.VirtualNetworkInterfacePrimaryIPPrototype;
import com.ibm.cloud.is.vpc.v1.model.VirtualNetworkInterfacePrimaryIPPrototypeReservedIPIdentityVirtualNetworkInterfacePrimaryIPContext;
import com.ibm.cloud.is.vpc.v1.model.VirtualNetworkInterfacePrimaryIPPrototypeReservedIPIdentityVirtualNetworkInterfacePrimaryIPContextByHref;
import com.ibm.cloud.is.vpc.v1.model.VirtualNetworkInterfacePrimaryIPPrototypeReservedIPIdentityVirtualNetworkInterfacePrimaryIPContextById;
import com.ibm.cloud.is.vpc.v1.model.VirtualNetworkInterfacePrimaryIPPrototypeReservedIPPrototypeVirtualNetworkInterfacePrimaryIPContext;
import com.ibm.cloud.is.vpc.v1.model.VirtualNetworkInterfaceReferenceAttachmentContext;
import com.ibm.cloud.is.vpc.v1.model.VirtualNetworkInterfaceTarget;
import com.ibm.cloud.is.vpc.v1.model.VirtualNetworkInterfaceTargetBareMetalServerNetworkAttachmentReferenceVirtualNetworkInterfaceContext;
import com.ibm.cloud.is.vpc.v1.model.VirtualNetworkInterfaceTargetInstanceNetworkAttachmentReferenceVirtualNetworkInterfaceContext;
import com.ibm.cloud.is.vpc.v1.model.VirtualNetworkInterfaceTargetShareMountTargetReference;
import com.ibm.cloud.is.vpc.v1.model.VirtualNetworkInterfacesPager;
import com.ibm.cloud.is.vpc.v1.model.Volume;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachment;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentCollection;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentDevice;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPatch;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototype;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeInstanceByImageContext;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeInstanceBySourceSnapshotContext;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeInstanceByVolumeContext;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeVolume;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeVolumeVolumeIdentity;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeVolumeVolumeIdentityVolumeIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeVolumeVolumeIdentityVolumeIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeVolumeVolumeIdentityVolumeIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeVolumeVolumePrototypeInstanceContext;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeVolumeVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeByCapacity;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeVolumeVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshot;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentReferenceInstanceContext;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentReferenceVolumeContext;
import com.ibm.cloud.is.vpc.v1.model.VolumeCatalogOffering;
import com.ibm.cloud.is.vpc.v1.model.VolumeCollection;
import com.ibm.cloud.is.vpc.v1.model.VolumeHealthReason;
import com.ibm.cloud.is.vpc.v1.model.VolumeIdentity;
import com.ibm.cloud.is.vpc.v1.model.VolumeIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.VolumeIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.VolumeIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VolumePatch;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfile;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileAdjustableCapacityStates;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileAdjustableIOPSStates;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileBandwidth;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileBandwidthDependent;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileBandwidthDependentRange;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileBandwidthEnum;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileBandwidthFixed;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileBandwidthRange;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileBootCapacity;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileBootCapacityDependentRange;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileBootCapacityEnum;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileBootCapacityFixed;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileBootCapacityRange;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileCapacity;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileCapacityDependentRange;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileCapacityEnum;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileCapacityFixed;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileCapacityRange;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileCollection;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileIOPS;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileIOPSDependentRange;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileIOPSEnum;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileIOPSFixed;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileIOPSRange;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileIdentity;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileReference;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileStorageGenerationFixed;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfilesPager;
import com.ibm.cloud.is.vpc.v1.model.VolumePrototype;
import com.ibm.cloud.is.vpc.v1.model.VolumePrototypeInstanceByImageContext;
import com.ibm.cloud.is.vpc.v1.model.VolumePrototypeInstanceBySourceSnapshotContext;
import com.ibm.cloud.is.vpc.v1.model.VolumePrototypeVolumeByCapacity;
import com.ibm.cloud.is.vpc.v1.model.VolumePrototypeVolumeBySourceSnapshot;
import com.ibm.cloud.is.vpc.v1.model.VolumeReference;
import com.ibm.cloud.is.vpc.v1.model.VolumeReferenceVolumeAttachmentContext;
import com.ibm.cloud.is.vpc.v1.model.VolumeRemote;
import com.ibm.cloud.is.vpc.v1.model.VolumeStatusReason;
import com.ibm.cloud.is.vpc.v1.model.VolumesPager;
import com.ibm.cloud.is.vpc.v1.model.VpcAddressPrefixesPager;
import com.ibm.cloud.is.vpc.v1.model.VpcDnsResolutionBindingsPager;
import com.ibm.cloud.is.vpc.v1.model.VpcRoutesPager;
import com.ibm.cloud.is.vpc.v1.model.VpcRoutingTableRoutesPager;
import com.ibm.cloud.is.vpc.v1.model.VpcRoutingTablesPager;
import com.ibm.cloud.is.vpc.v1.model.VpcsPager;
import com.ibm.cloud.is.vpc.v1.model.VpnGatewayConnectionsPager;
import com.ibm.cloud.is.vpc.v1.model.VpnGatewaysPager;
import com.ibm.cloud.is.vpc.v1.model.VpnServerClientsPager;
import com.ibm.cloud.is.vpc.v1.model.VpnServerRoutesPager;
import com.ibm.cloud.is.vpc.v1.model.VpnServersPager;
import com.ibm.cloud.is.vpc.v1.model.Zone;
import com.ibm.cloud.is.vpc.v1.model.ZoneCollection;
import com.ibm.cloud.is.vpc.v1.model.ZoneIdentity;
import com.ibm.cloud.is.vpc.v1.model.ZoneIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.ZoneIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.ZoneReference;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Integration test class for the Vpc service.
 */
public class VpcIT extends SdkIntegrationTestBase {
  public Vpc service = null;
  public static Map<String, String> config = null;
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  String version = "2024-06-23";
  /**
   * This method provides our config filename to the base class.
   */

  public String getConfigFilename() {
    return "../../vpc_v1.env";
  }

  @BeforeClass
  public void constructService() {
    // Ask super if we should skip the tests.
    if (skipTests()) {
      return;
    }

    service = Vpc.newInstance(version);
    assertNotNull(service);
    assertNotNull(service.getServiceUrl());

    // Load up our test-specific config properties.
    config = CredentialUtils.getServiceProperties(Vpc.DEFAULT_SERVICE_NAME);
    assertNotNull(config);
    assertFalse(config.isEmpty());
    assertEquals(service.getServiceUrl(), config.get("URL"));

    service.enableRetries(4, 30);

    System.out.println("Setup complete.");
  }

  @Test
  public void testListVpcs() throws Exception {
    try {
      ListVpcsOptions listVpcsOptions = new ListVpcsOptions.Builder()
        .start("testString")
        .limit(Long.valueOf("10"))
        .resourceGroupId("testString")
        .classicAccess(true)
        .build();

      // Invoke operation
      Response<VPCCollection> response = service.listVpcs(listVpcsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VPCCollection vpcCollectionResult = response.getResult();
      assertNotNull(vpcCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListVpcs" })
  public void testListVpcsWithPager() throws Exception {
    try {
      ListVpcsOptions options = new ListVpcsOptions.Builder()
        .limit(Long.valueOf("10"))
        .resourceGroupId("testString")
        .classicAccess(true)
        .build();

      // Test getNext().
      List<VPC> allResults = new ArrayList<>();
      VpcsPager pager = new VpcsPager(service, options);
      while (pager.hasNext()) {
        List<VPC> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new VpcsPager(service, options);
      List<VPC> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListVpcs" })
  public void testCreateVpc() throws Exception {
    try {
      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
        .name("us-south-1")
        .build();

      DNSServerPrototype dnsServerPrototypeModel = new DNSServerPrototype.Builder()
        .address("192.168.3.4")
        .zoneAffinity(zoneIdentityModel)
        .build();

      VPCDNSResolverPrototypeVPCDNSResolverTypeManualPrototype vpcdnsResolverPrototypeModel = new VPCDNSResolverPrototypeVPCDNSResolverTypeManualPrototype.Builder()
        .manualServers(java.util.Arrays.asList(dnsServerPrototypeModel))
        .type("manual")
        .build();

      VPCDNSPrototype vpcdnsPrototypeModel = new VPCDNSPrototype.Builder()
        .enableHub(false)
        .resolver(vpcdnsResolverPrototypeModel)
        .build();

      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
        .id("fee82deba12e4c0fb69c3b09d1f12345")
        .build();

      CreateVpcOptions createVpcOptions = new CreateVpcOptions.Builder()
        .addressPrefixManagement("auto")
        .classicAccess(false)
        .dns(vpcdnsPrototypeModel)
        .name("my-vpc")
        .resourceGroup(resourceGroupIdentityModel)
        .build();

      // Invoke operation
      Response<VPC> response = service.createVpc(createVpcOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      VPC vpcResult = response.getResult();
      assertNotNull(vpcResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateVpc" })
  public void testGetVpc() throws Exception {
    try {
      GetVpcOptions getVpcOptions = new GetVpcOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<VPC> response = service.getVpc(getVpcOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VPC vpcResult = response.getResult();
      assertNotNull(vpcResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetVpc" })
  public void testUpdateVpc() throws Exception {
    try {
      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
        .name("us-south-1")
        .build();

      DNSServerPrototype dnsServerPrototypeModel = new DNSServerPrototype.Builder()
        .address("192.168.3.4")
        .zoneAffinity(zoneIdentityModel)
        .build();

      VPCDNSResolverVPCPatchVPCIdentityById vpcdnsResolverVpcPatchModel = new VPCDNSResolverVPCPatchVPCIdentityById.Builder()
        .id("r006-4727d842-f94f-4a2d-824a-9bc9b02c523b")
        .build();

      VPCDNSResolverPatch vpcdnsResolverPatchModel = new VPCDNSResolverPatch.Builder()
        .manualServers(java.util.Arrays.asList(dnsServerPrototypeModel))
        .type("delegated")
        .vpc(vpcdnsResolverVpcPatchModel)
        .build();

      VPCDNSPatch vpcdnsPatchModel = new VPCDNSPatch.Builder()
        .enableHub(true)
        .resolver(vpcdnsResolverPatchModel)
        .build();

      VPCPatch vpcPatchModel = new VPCPatch.Builder()
        .dns(vpcdnsPatchModel)
        .name("my-vpc")
        .build();
      Map<String, Object> vpcPatchModelAsPatch = vpcPatchModel.asPatch();

      UpdateVpcOptions updateVpcOptions = new UpdateVpcOptions.Builder()
        .id("testString")
        .vpcPatch(vpcPatchModelAsPatch)
        .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
        .build();

      // Invoke operation
      Response<VPC> response = service.updateVpc(updateVpcOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VPC vpcResult = response.getResult();
      assertNotNull(vpcResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateVpc" })
  public void testGetVpcDefaultNetworkAcl() throws Exception {
    try {
      GetVpcDefaultNetworkAclOptions getVpcDefaultNetworkAclOptions = new GetVpcDefaultNetworkAclOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<DefaultNetworkACL> response = service.getVpcDefaultNetworkAcl(getVpcDefaultNetworkAclOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DefaultNetworkACL defaultNetworkAclResult = response.getResult();
      assertNotNull(defaultNetworkAclResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetVpcDefaultNetworkAcl" })
  public void testGetVpcDefaultRoutingTable() throws Exception {
    try {
      GetVpcDefaultRoutingTableOptions getVpcDefaultRoutingTableOptions = new GetVpcDefaultRoutingTableOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<DefaultRoutingTable> response = service.getVpcDefaultRoutingTable(getVpcDefaultRoutingTableOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DefaultRoutingTable defaultRoutingTableResult = response.getResult();
      assertNotNull(defaultRoutingTableResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetVpcDefaultRoutingTable" })
  public void testGetVpcDefaultSecurityGroup() throws Exception {
    try {
      GetVpcDefaultSecurityGroupOptions getVpcDefaultSecurityGroupOptions = new GetVpcDefaultSecurityGroupOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<DefaultSecurityGroup> response = service.getVpcDefaultSecurityGroup(getVpcDefaultSecurityGroupOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DefaultSecurityGroup defaultSecurityGroupResult = response.getResult();
      assertNotNull(defaultSecurityGroupResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetVpcDefaultSecurityGroup" })
  public void testListVpcAddressPrefixes() throws Exception {
    try {
      ListVpcAddressPrefixesOptions listVpcAddressPrefixesOptions = new ListVpcAddressPrefixesOptions.Builder()
        .vpcId("testString")
        .start("testString")
        .limit(Long.valueOf("10"))
        .build();

      // Invoke operation
      Response<AddressPrefixCollection> response = service.listVpcAddressPrefixes(listVpcAddressPrefixesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      AddressPrefixCollection addressPrefixCollectionResult = response.getResult();
      assertNotNull(addressPrefixCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListVpcAddressPrefixes" })
  public void testListVpcAddressPrefixesWithPager() throws Exception {
    try {
      ListVpcAddressPrefixesOptions options = new ListVpcAddressPrefixesOptions.Builder()
        .vpcId("testString")
        .limit(Long.valueOf("10"))
        .build();

      // Test getNext().
      List<AddressPrefix> allResults = new ArrayList<>();
      VpcAddressPrefixesPager pager = new VpcAddressPrefixesPager(service, options);
      while (pager.hasNext()) {
        List<AddressPrefix> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new VpcAddressPrefixesPager(service, options);
      List<AddressPrefix> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListVpcAddressPrefixes" })
  public void testCreateVpcAddressPrefix() throws Exception {
    try {
      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
        .name("us-south-1")
        .build();

      CreateVpcAddressPrefixOptions createVpcAddressPrefixOptions = new CreateVpcAddressPrefixOptions.Builder()
        .vpcId("testString")
        .cidr("10.240.0.0/18")
        .zone(zoneIdentityModel)
        .isDefault(true)
        .name("my-vpc-address-prefix-zone-1")
        .build();

      // Invoke operation
      Response<AddressPrefix> response = service.createVpcAddressPrefix(createVpcAddressPrefixOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      AddressPrefix addressPrefixResult = response.getResult();
      assertNotNull(addressPrefixResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateVpcAddressPrefix" })
  public void testGetVpcAddressPrefix() throws Exception {
    try {
      GetVpcAddressPrefixOptions getVpcAddressPrefixOptions = new GetVpcAddressPrefixOptions.Builder()
        .vpcId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<AddressPrefix> response = service.getVpcAddressPrefix(getVpcAddressPrefixOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      AddressPrefix addressPrefixResult = response.getResult();
      assertNotNull(addressPrefixResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetVpcAddressPrefix" })
  public void testUpdateVpcAddressPrefix() throws Exception {
    try {
      AddressPrefixPatch addressPrefixPatchModel = new AddressPrefixPatch.Builder()
        .isDefault(false)
        .name("my-vpc-address-prefix-updated")
        .build();
      Map<String, Object> addressPrefixPatchModelAsPatch = addressPrefixPatchModel.asPatch();

      UpdateVpcAddressPrefixOptions updateVpcAddressPrefixOptions = new UpdateVpcAddressPrefixOptions.Builder()
        .vpcId("testString")
        .id("testString")
        .addressPrefixPatch(addressPrefixPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<AddressPrefix> response = service.updateVpcAddressPrefix(updateVpcAddressPrefixOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      AddressPrefix addressPrefixResult = response.getResult();
      assertNotNull(addressPrefixResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateVpcAddressPrefix" })
  public void testListVpcDnsResolutionBindings() throws Exception {
    try {
      ListVpcDnsResolutionBindingsOptions listVpcDnsResolutionBindingsOptions = new ListVpcDnsResolutionBindingsOptions.Builder()
        .vpcId("testString")
        .sort("name")
        .start("testString")
        .limit(Long.valueOf("10"))
        .name("my-name")
        .vpcCrn("crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::vpc:r006-4727d842-f94f-4a2d-824a-9bc9b02c523b")
        .vpcName("my-vpc")
        .accountId("bb1b52262f7441a586f49068482f1e60")
        .build();

      // Invoke operation
      Response<VPCDNSResolutionBindingCollection> response = service.listVpcDnsResolutionBindings(listVpcDnsResolutionBindingsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VPCDNSResolutionBindingCollection vpcdnsResolutionBindingCollectionResult = response.getResult();
      assertNotNull(vpcdnsResolutionBindingCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListVpcDnsResolutionBindings" })
  public void testListVpcDnsResolutionBindingsWithPager() throws Exception {
    try {
      ListVpcDnsResolutionBindingsOptions options = new ListVpcDnsResolutionBindingsOptions.Builder()
        .vpcId("testString")
        .sort("name")
        .limit(Long.valueOf("10"))
        .name("my-name")
        .vpcCrn("crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::vpc:r006-4727d842-f94f-4a2d-824a-9bc9b02c523b")
        .vpcName("my-vpc")
        .accountId("bb1b52262f7441a586f49068482f1e60")
        .build();

      // Test getNext().
      List<VPCDNSResolutionBinding> allResults = new ArrayList<>();
      VpcDnsResolutionBindingsPager pager = new VpcDnsResolutionBindingsPager(service, options);
      while (pager.hasNext()) {
        List<VPCDNSResolutionBinding> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new VpcDnsResolutionBindingsPager(service, options);
      List<VPCDNSResolutionBinding> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListVpcDnsResolutionBindings" })
  public void testCreateVpcDnsResolutionBinding() throws Exception {
    try {
      VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
        .id("r006-4727d842-f94f-4a2d-824a-9bc9b02c523b")
        .build();

      CreateVpcDnsResolutionBindingOptions createVpcDnsResolutionBindingOptions = new CreateVpcDnsResolutionBindingOptions.Builder()
        .vpcId("testString")
        .vpc(vpcIdentityModel)
        .name("my-dns-resolution-binding")
        .build();

      // Invoke operation
      Response<VPCDNSResolutionBinding> response = service.createVpcDnsResolutionBinding(createVpcDnsResolutionBindingOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      VPCDNSResolutionBinding vpcdnsResolutionBindingResult = response.getResult();
      assertNotNull(vpcdnsResolutionBindingResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateVpcDnsResolutionBinding" })
  public void testGetVpcDnsResolutionBinding() throws Exception {
    try {
      GetVpcDnsResolutionBindingOptions getVpcDnsResolutionBindingOptions = new GetVpcDnsResolutionBindingOptions.Builder()
        .vpcId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<VPCDNSResolutionBinding> response = service.getVpcDnsResolutionBinding(getVpcDnsResolutionBindingOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VPCDNSResolutionBinding vpcdnsResolutionBindingResult = response.getResult();
      assertNotNull(vpcdnsResolutionBindingResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetVpcDnsResolutionBinding" })
  public void testUpdateVpcDnsResolutionBinding() throws Exception {
    try {
      VPCDNSResolutionBindingPatch vpcdnsResolutionBindingPatchModel = new VPCDNSResolutionBindingPatch.Builder()
        .name("my-dns-resolution-binding-updated")
        .build();
      Map<String, Object> vpcdnsResolutionBindingPatchModelAsPatch = vpcdnsResolutionBindingPatchModel.asPatch();

      UpdateVpcDnsResolutionBindingOptions updateVpcDnsResolutionBindingOptions = new UpdateVpcDnsResolutionBindingOptions.Builder()
        .vpcId("testString")
        .id("testString")
        .vpcdnsResolutionBindingPatch(vpcdnsResolutionBindingPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<VPCDNSResolutionBinding> response = service.updateVpcDnsResolutionBinding(updateVpcDnsResolutionBindingOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VPCDNSResolutionBinding vpcdnsResolutionBindingResult = response.getResult();
      assertNotNull(vpcdnsResolutionBindingResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateVpcDnsResolutionBinding" })
  public void testListVpcRoutes() throws Exception {
    try {
      ListVpcRoutesOptions listVpcRoutesOptions = new ListVpcRoutesOptions.Builder()
        .vpcId("testString")
        .zoneName("us-south-1")
        .start("testString")
        .limit(Long.valueOf("10"))
        .build();

      // Invoke operation
      Response<RouteCollectionVPCContext> response = service.listVpcRoutes(listVpcRoutesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      RouteCollectionVPCContext routeCollectionVpcContextResult = response.getResult();
      assertNotNull(routeCollectionVpcContextResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListVpcRoutes" })
  public void testListVpcRoutesWithPager() throws Exception {
    try {
      ListVpcRoutesOptions options = new ListVpcRoutesOptions.Builder()
        .vpcId("testString")
        .zoneName("us-south-1")
        .limit(Long.valueOf("10"))
        .build();

      // Test getNext().
      List<Route> allResults = new ArrayList<>();
      VpcRoutesPager pager = new VpcRoutesPager(service, options);
      while (pager.hasNext()) {
        List<Route> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new VpcRoutesPager(service, options);
      List<Route> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListVpcRoutes" })
  public void testCreateVpcRoute() throws Exception {
    try {
      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
        .name("us-south-1")
        .build();

      RouteNextHopPrototypeRouteNextHopIPRouteNextHopIPSentinelIP routeNextHopPrototypeModel = new RouteNextHopPrototypeRouteNextHopIPRouteNextHopIPSentinelIP.Builder()
        .address("0.0.0.0")
        .build();

      CreateVpcRouteOptions createVpcRouteOptions = new CreateVpcRouteOptions.Builder()
        .vpcId("testString")
        .destination("192.168.3.0/24")
        .zone(zoneIdentityModel)
        .action("deliver")
        .advertise(false)
        .name("my-vpc-routing-table-route")
        .nextHop(routeNextHopPrototypeModel)
        .priority(Long.valueOf("1"))
        .build();

      // Invoke operation
      Response<Route> response = service.createVpcRoute(createVpcRouteOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      Route routeResult = response.getResult();
      assertNotNull(routeResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateVpcRoute" })
  public void testGetVpcRoute() throws Exception {
    try {
      GetVpcRouteOptions getVpcRouteOptions = new GetVpcRouteOptions.Builder()
        .vpcId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<Route> response = service.getVpcRoute(getVpcRouteOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Route routeResult = response.getResult();
      assertNotNull(routeResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetVpcRoute" })
  public void testUpdateVpcRoute() throws Exception {
    try {
      RouteNextHopPatchRouteNextHopIPRouteNextHopIPSentinelIP routeNextHopPatchModel = new RouteNextHopPatchRouteNextHopIPRouteNextHopIPSentinelIP.Builder()
        .address("10.240.0.12")
        .build();

      RoutePatch routePatchModel = new RoutePatch.Builder()
        .advertise(true)
        .name("my-vpc-routing-table-route")
        .nextHop(routeNextHopPatchModel)
        .priority(Long.valueOf("1"))
        .build();
      Map<String, Object> routePatchModelAsPatch = routePatchModel.asPatch();

      UpdateVpcRouteOptions updateVpcRouteOptions = new UpdateVpcRouteOptions.Builder()
        .vpcId("testString")
        .id("testString")
        .routePatch(routePatchModelAsPatch)
        .build();

      // Invoke operation
      Response<Route> response = service.updateVpcRoute(updateVpcRouteOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Route routeResult = response.getResult();
      assertNotNull(routeResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateVpcRoute" })
  public void testListVpcRoutingTables() throws Exception {
    try {
      ListVpcRoutingTablesOptions listVpcRoutingTablesOptions = new ListVpcRoutingTablesOptions.Builder()
        .vpcId("testString")
        .start("testString")
        .limit(Long.valueOf("10"))
        .isDefault(true)
        .build();

      // Invoke operation
      Response<RoutingTableCollection> response = service.listVpcRoutingTables(listVpcRoutingTablesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      RoutingTableCollection routingTableCollectionResult = response.getResult();
      assertNotNull(routingTableCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListVpcRoutingTables" })
  public void testListVpcRoutingTablesWithPager() throws Exception {
    try {
      ListVpcRoutingTablesOptions options = new ListVpcRoutingTablesOptions.Builder()
        .vpcId("testString")
        .limit(Long.valueOf("10"))
        .isDefault(true)
        .build();

      // Test getNext().
      List<RoutingTable> allResults = new ArrayList<>();
      VpcRoutingTablesPager pager = new VpcRoutingTablesPager(service, options);
      while (pager.hasNext()) {
        List<RoutingTable> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new VpcRoutingTablesPager(service, options);
      List<RoutingTable> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListVpcRoutingTables" })
  public void testCreateVpcRoutingTable() throws Exception {
    try {
      ResourceFilter resourceFilterModel = new ResourceFilter.Builder()
        .resourceType("vpn_server")
        .build();

      RouteNextHopPrototypeRouteNextHopIPRouteNextHopIPSentinelIP routeNextHopPrototypeModel = new RouteNextHopPrototypeRouteNextHopIPRouteNextHopIPSentinelIP.Builder()
        .address("0.0.0.0")
        .build();

      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
        .name("us-south-1")
        .build();

      RoutePrototype routePrototypeModel = new RoutePrototype.Builder()
        .action("deliver")
        .advertise(false)
        .destination("192.168.3.0/24")
        .name("my-vpc-routing-table-route")
        .nextHop(routeNextHopPrototypeModel)
        .priority(Long.valueOf("1"))
        .zone(zoneIdentityModel)
        .build();

      CreateVpcRoutingTableOptions createVpcRoutingTableOptions = new CreateVpcRoutingTableOptions.Builder()
        .vpcId("testString")
        .acceptRoutesFrom(java.util.Arrays.asList(resourceFilterModel))
        .advertiseRoutesTo(java.util.Arrays.asList())
        .name("my-routing-table-1")
        .routeDirectLinkIngress(false)
        .routeInternetIngress(false)
        .routeTransitGatewayIngress(false)
        .routeVpcZoneIngress(false)
        .routes(java.util.Arrays.asList(routePrototypeModel))
        .build();

      // Invoke operation
      Response<RoutingTable> response = service.createVpcRoutingTable(createVpcRoutingTableOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      RoutingTable routingTableResult = response.getResult();
      assertNotNull(routingTableResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateVpcRoutingTable" })
  public void testGetVpcRoutingTable() throws Exception {
    try {
      GetVpcRoutingTableOptions getVpcRoutingTableOptions = new GetVpcRoutingTableOptions.Builder()
        .vpcId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<RoutingTable> response = service.getVpcRoutingTable(getVpcRoutingTableOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      RoutingTable routingTableResult = response.getResult();
      assertNotNull(routingTableResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetVpcRoutingTable" })
  public void testUpdateVpcRoutingTable() throws Exception {
    try {
      ResourceFilter resourceFilterModel = new ResourceFilter.Builder()
        .resourceType("vpn_server")
        .build();

      RoutingTablePatch routingTablePatchModel = new RoutingTablePatch.Builder()
        .acceptRoutesFrom(java.util.Arrays.asList(resourceFilterModel))
        .advertiseRoutesTo(java.util.Arrays.asList("transit_gateway"))
        .name("my-routing-table-2")
        .routeDirectLinkIngress(true)
        .routeInternetIngress(true)
        .routeTransitGatewayIngress(true)
        .routeVpcZoneIngress(true)
        .build();
      Map<String, Object> routingTablePatchModelAsPatch = routingTablePatchModel.asPatch();

      UpdateVpcRoutingTableOptions updateVpcRoutingTableOptions = new UpdateVpcRoutingTableOptions.Builder()
        .vpcId("testString")
        .id("testString")
        .routingTablePatch(routingTablePatchModelAsPatch)
        .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
        .build();

      // Invoke operation
      Response<RoutingTable> response = service.updateVpcRoutingTable(updateVpcRoutingTableOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      RoutingTable routingTableResult = response.getResult();
      assertNotNull(routingTableResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateVpcRoutingTable" })
  public void testListVpcRoutingTableRoutes() throws Exception {
    try {
      ListVpcRoutingTableRoutesOptions listVpcRoutingTableRoutesOptions = new ListVpcRoutingTableRoutesOptions.Builder()
        .vpcId("testString")
        .routingTableId("testString")
        .start("testString")
        .limit(Long.valueOf("10"))
        .build();

      // Invoke operation
      Response<RouteCollection> response = service.listVpcRoutingTableRoutes(listVpcRoutingTableRoutesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      RouteCollection routeCollectionResult = response.getResult();
      assertNotNull(routeCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListVpcRoutingTableRoutes" })
  public void testListVpcRoutingTableRoutesWithPager() throws Exception {
    try {
      ListVpcRoutingTableRoutesOptions options = new ListVpcRoutingTableRoutesOptions.Builder()
        .vpcId("testString")
        .routingTableId("testString")
        .limit(Long.valueOf("10"))
        .build();

      // Test getNext().
      List<Route> allResults = new ArrayList<>();
      VpcRoutingTableRoutesPager pager = new VpcRoutingTableRoutesPager(service, options);
      while (pager.hasNext()) {
        List<Route> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new VpcRoutingTableRoutesPager(service, options);
      List<Route> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListVpcRoutingTableRoutes" })
  public void testCreateVpcRoutingTableRoute() throws Exception {
    try {
      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
        .name("us-south-1")
        .build();

      RouteNextHopPrototypeRouteNextHopIPRouteNextHopIPSentinelIP routeNextHopPrototypeModel = new RouteNextHopPrototypeRouteNextHopIPRouteNextHopIPSentinelIP.Builder()
        .address("0.0.0.0")
        .build();

      CreateVpcRoutingTableRouteOptions createVpcRoutingTableRouteOptions = new CreateVpcRoutingTableRouteOptions.Builder()
        .vpcId("testString")
        .routingTableId("testString")
        .destination("192.168.3.0/24")
        .zone(zoneIdentityModel)
        .action("deliver")
        .advertise(false)
        .name("my-vpc-routing-table-route")
        .nextHop(routeNextHopPrototypeModel)
        .priority(Long.valueOf("1"))
        .build();

      // Invoke operation
      Response<Route> response = service.createVpcRoutingTableRoute(createVpcRoutingTableRouteOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      Route routeResult = response.getResult();
      assertNotNull(routeResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateVpcRoutingTableRoute" })
  public void testGetVpcRoutingTableRoute() throws Exception {
    try {
      GetVpcRoutingTableRouteOptions getVpcRoutingTableRouteOptions = new GetVpcRoutingTableRouteOptions.Builder()
        .vpcId("testString")
        .routingTableId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<Route> response = service.getVpcRoutingTableRoute(getVpcRoutingTableRouteOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Route routeResult = response.getResult();
      assertNotNull(routeResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetVpcRoutingTableRoute" })
  public void testUpdateVpcRoutingTableRoute() throws Exception {
    try {
      RouteNextHopPatchRouteNextHopIPRouteNextHopIPSentinelIP routeNextHopPatchModel = new RouteNextHopPatchRouteNextHopIPRouteNextHopIPSentinelIP.Builder()
        .address("0.0.0.0")
        .build();

      RoutePatch routePatchModel = new RoutePatch.Builder()
        .advertise(false)
        .name("my-vpc-routing-table-route")
        .nextHop(routeNextHopPatchModel)
        .priority(Long.valueOf("1"))
        .build();
      Map<String, Object> routePatchModelAsPatch = routePatchModel.asPatch();

      UpdateVpcRoutingTableRouteOptions updateVpcRoutingTableRouteOptions = new UpdateVpcRoutingTableRouteOptions.Builder()
        .vpcId("testString")
        .routingTableId("testString")
        .id("testString")
        .routePatch(routePatchModelAsPatch)
        .build();

      // Invoke operation
      Response<Route> response = service.updateVpcRoutingTableRoute(updateVpcRoutingTableRouteOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Route routeResult = response.getResult();
      assertNotNull(routeResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateVpcRoutingTableRoute" })
  public void testListSubnets() throws Exception {
    try {
      ListSubnetsOptions listSubnetsOptions = new ListSubnetsOptions.Builder()
        .start("testString")
        .limit(Long.valueOf("10"))
        .resourceGroupId("testString")
        .zoneName("us-south-1")
        .vpcId("testString")
        .vpcCrn("crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::vpc:r006-4727d842-f94f-4a2d-824a-9bc9b02c523b")
        .vpcName("my-vpc")
        .routingTableId("testString")
        .routingTableName("my-routing-table")
        .build();

      // Invoke operation
      Response<SubnetCollection> response = service.listSubnets(listSubnetsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SubnetCollection subnetCollectionResult = response.getResult();
      assertNotNull(subnetCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListSubnets" })
  public void testListSubnetsWithPager() throws Exception {
    try {
      ListSubnetsOptions options = new ListSubnetsOptions.Builder()
        .limit(Long.valueOf("10"))
        .resourceGroupId("testString")
        .zoneName("us-south-1")
        .vpcId("testString")
        .vpcCrn("crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::vpc:r006-4727d842-f94f-4a2d-824a-9bc9b02c523b")
        .vpcName("my-vpc")
        .routingTableId("testString")
        .routingTableName("my-routing-table")
        .build();

      // Test getNext().
      List<Subnet> allResults = new ArrayList<>();
      SubnetsPager pager = new SubnetsPager(service, options);
      while (pager.hasNext()) {
        List<Subnet> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new SubnetsPager(service, options);
      List<Subnet> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListSubnets" })
  public void testCreateSubnet() throws Exception {
    try {
      NetworkACLIdentityById networkAclIdentityModel = new NetworkACLIdentityById.Builder()
        .id("r006-a4e28308-8ee7-46ab-8108-9f881f22bdbf")
        .build();

      PublicGatewayIdentityPublicGatewayIdentityById publicGatewayIdentityModel = new PublicGatewayIdentityPublicGatewayIdentityById.Builder()
        .id("r006-dc5431ef-1fc6-4861-adc9-a59d077d1241")
        .build();

      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
        .id("fee82deba12e4c0fb69c3b09d1f12345")
        .build();

      RoutingTableIdentityByCRN routingTableIdentityModel = new RoutingTableIdentityByCRN.Builder()
        .crn("crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::vpc-routing-table:r006-4727d842-f94f-4a2d-824a-9bc9b02c523b/r006-6885e83f-03b2-4603-8a86-db2a0f55c840")
        .build();

      VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
        .id("r006-4727d842-f94f-4a2d-824a-9bc9b02c523b")
        .build();

      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
        .name("us-south-1")
        .build();

      SubnetPrototypeSubnetByTotalCount subnetPrototypeModel = new SubnetPrototypeSubnetByTotalCount.Builder()
        .ipVersion("ipv4")
        .name("my-subnet")
        .networkAcl(networkAclIdentityModel)
        .publicGateway(publicGatewayIdentityModel)
        .resourceGroup(resourceGroupIdentityModel)
        .routingTable(routingTableIdentityModel)
        .vpc(vpcIdentityModel)
        .totalIpv4AddressCount(Long.valueOf("256"))
        .zone(zoneIdentityModel)
        .build();

      CreateSubnetOptions createSubnetOptions = new CreateSubnetOptions.Builder()
        .subnetPrototype(subnetPrototypeModel)
        .build();

      // Invoke operation
      Response<Subnet> response = service.createSubnet(createSubnetOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      Subnet subnetResult = response.getResult();
      assertNotNull(subnetResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateSubnet" })
  public void testGetSubnet() throws Exception {
    try {
      GetSubnetOptions getSubnetOptions = new GetSubnetOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<Subnet> response = service.getSubnet(getSubnetOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Subnet subnetResult = response.getResult();
      assertNotNull(subnetResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSubnet" })
  public void testUpdateSubnet() throws Exception {
    try {
      NetworkACLIdentityById networkAclIdentityModel = new NetworkACLIdentityById.Builder()
        .id("r006-a4e28308-8ee7-46ab-8108-9f881f22bdbf")
        .build();

      SubnetPublicGatewayPatchPublicGatewayIdentityById subnetPublicGatewayPatchModel = new SubnetPublicGatewayPatchPublicGatewayIdentityById.Builder()
        .id("r006-dc5431ef-1fc6-4861-adc9-a59d077d1241")
        .build();

      RoutingTableIdentityByCRN routingTableIdentityModel = new RoutingTableIdentityByCRN.Builder()
        .crn("crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::vpc-routing-table:r006-4727d842-f94f-4a2d-824a-9bc9b02c523b/r006-6885e83f-03b2-4603-8a86-db2a0f55c840")
        .build();

      SubnetPatch subnetPatchModel = new SubnetPatch.Builder()
        .name("my-subnet")
        .networkAcl(networkAclIdentityModel)
        .publicGateway(subnetPublicGatewayPatchModel)
        .routingTable(routingTableIdentityModel)
        .build();
      Map<String, Object> subnetPatchModelAsPatch = subnetPatchModel.asPatch();

      UpdateSubnetOptions updateSubnetOptions = new UpdateSubnetOptions.Builder()
        .id("testString")
        .subnetPatch(subnetPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<Subnet> response = service.updateSubnet(updateSubnetOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Subnet subnetResult = response.getResult();
      assertNotNull(subnetResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateSubnet" })
  public void testGetSubnetNetworkAcl() throws Exception {
    try {
      GetSubnetNetworkAclOptions getSubnetNetworkAclOptions = new GetSubnetNetworkAclOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<NetworkACL> response = service.getSubnetNetworkAcl(getSubnetNetworkAclOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      NetworkACL networkAclResult = response.getResult();
      assertNotNull(networkAclResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSubnetNetworkAcl" })
  public void testReplaceSubnetNetworkAcl() throws Exception {
    try {
      NetworkACLIdentityById networkAclIdentityModel = new NetworkACLIdentityById.Builder()
        .id("r006-a4e28308-8ee7-46ab-8108-9f881f22bdbf")
        .build();

      ReplaceSubnetNetworkAclOptions replaceSubnetNetworkAclOptions = new ReplaceSubnetNetworkAclOptions.Builder()
        .id("testString")
        .networkAclIdentity(networkAclIdentityModel)
        .build();

      // Invoke operation
      Response<NetworkACL> response = service.replaceSubnetNetworkAcl(replaceSubnetNetworkAclOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      NetworkACL networkAclResult = response.getResult();
      assertNotNull(networkAclResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testReplaceSubnetNetworkAcl" })
  public void testGetSubnetPublicGateway() throws Exception {
    try {
      GetSubnetPublicGatewayOptions getSubnetPublicGatewayOptions = new GetSubnetPublicGatewayOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<PublicGateway> response = service.getSubnetPublicGateway(getSubnetPublicGatewayOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PublicGateway publicGatewayResult = response.getResult();
      assertNotNull(publicGatewayResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSubnetPublicGateway" })
  public void testSetSubnetPublicGateway() throws Exception {
    try {
      PublicGatewayIdentityPublicGatewayIdentityById publicGatewayIdentityModel = new PublicGatewayIdentityPublicGatewayIdentityById.Builder()
        .id("r006-dc5431ef-1fc6-4861-adc9-a59d077d1241")
        .build();

      SetSubnetPublicGatewayOptions setSubnetPublicGatewayOptions = new SetSubnetPublicGatewayOptions.Builder()
        .id("testString")
        .publicGatewayIdentity(publicGatewayIdentityModel)
        .build();

      // Invoke operation
      Response<PublicGateway> response = service.setSubnetPublicGateway(setSubnetPublicGatewayOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      PublicGateway publicGatewayResult = response.getResult();
      assertNotNull(publicGatewayResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testSetSubnetPublicGateway" })
  public void testGetSubnetRoutingTable() throws Exception {
    try {
      GetSubnetRoutingTableOptions getSubnetRoutingTableOptions = new GetSubnetRoutingTableOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<RoutingTable> response = service.getSubnetRoutingTable(getSubnetRoutingTableOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      RoutingTable routingTableResult = response.getResult();
      assertNotNull(routingTableResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSubnetRoutingTable" })
  public void testReplaceSubnetRoutingTable() throws Exception {
    try {
      RoutingTableIdentityByCRN routingTableIdentityModel = new RoutingTableIdentityByCRN.Builder()
        .crn("crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::vpc-routing-table:r006-4727d842-f94f-4a2d-824a-9bc9b02c523b/r006-6885e83f-03b2-4603-8a86-db2a0f55c840")
        .build();

      ReplaceSubnetRoutingTableOptions replaceSubnetRoutingTableOptions = new ReplaceSubnetRoutingTableOptions.Builder()
        .id("testString")
        .routingTableIdentity(routingTableIdentityModel)
        .build();

      // Invoke operation
      Response<RoutingTable> response = service.replaceSubnetRoutingTable(replaceSubnetRoutingTableOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      RoutingTable routingTableResult = response.getResult();
      assertNotNull(routingTableResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testReplaceSubnetRoutingTable" })
  public void testListSubnetReservedIps() throws Exception {
    try {
      ListSubnetReservedIpsOptions listSubnetReservedIpsOptions = new ListSubnetReservedIpsOptions.Builder()
        .subnetId("testString")
        .start("testString")
        .limit(Long.valueOf("10"))
        .sort("name")
        .targetId("testString")
        .targetCrn("crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::load-balancer:r006-dd754295-e9e0-4c9d-bf6c-58fbc59e5727")
        .targetName("my-resource")
        .targetResourceType("testString")
        .build();

      // Invoke operation
      Response<ReservedIPCollection> response = service.listSubnetReservedIps(listSubnetReservedIpsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ReservedIPCollection reservedIpCollectionResult = response.getResult();
      assertNotNull(reservedIpCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListSubnetReservedIps" })
  public void testListSubnetReservedIpsWithPager() throws Exception {
    try {
      ListSubnetReservedIpsOptions options = new ListSubnetReservedIpsOptions.Builder()
        .subnetId("testString")
        .limit(Long.valueOf("10"))
        .sort("name")
        .targetId("testString")
        .targetCrn("crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::load-balancer:r006-dd754295-e9e0-4c9d-bf6c-58fbc59e5727")
        .targetName("my-resource")
        .targetResourceType("testString")
        .build();

      // Test getNext().
      List<ReservedIP> allResults = new ArrayList<>();
      SubnetReservedIpsPager pager = new SubnetReservedIpsPager(service, options);
      while (pager.hasNext()) {
        List<ReservedIP> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new SubnetReservedIpsPager(service, options);
      List<ReservedIP> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListSubnetReservedIps" })
  public void testCreateSubnetReservedIp() throws Exception {
    try {
      ReservedIPTargetPrototypeEndpointGatewayIdentityEndpointGatewayIdentityById reservedIpTargetPrototypeModel = new ReservedIPTargetPrototypeEndpointGatewayIdentityEndpointGatewayIdentityById.Builder()
        .id("r006-7610ebfb-f5dc-4d42-bc18-287d47f7a5b0")
        .build();

      CreateSubnetReservedIpOptions createSubnetReservedIpOptions = new CreateSubnetReservedIpOptions.Builder()
        .subnetId("testString")
        .address("192.168.3.4")
        .autoDelete(false)
        .name("my-reserved-ip")
        .target(reservedIpTargetPrototypeModel)
        .build();

      // Invoke operation
      Response<ReservedIP> response = service.createSubnetReservedIp(createSubnetReservedIpOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      ReservedIP reservedIpResult = response.getResult();
      assertNotNull(reservedIpResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateSubnetReservedIp" })
  public void testGetSubnetReservedIp() throws Exception {
    try {
      GetSubnetReservedIpOptions getSubnetReservedIpOptions = new GetSubnetReservedIpOptions.Builder()
        .subnetId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<ReservedIP> response = service.getSubnetReservedIp(getSubnetReservedIpOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ReservedIP reservedIpResult = response.getResult();
      assertNotNull(reservedIpResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSubnetReservedIp" })
  public void testUpdateSubnetReservedIp() throws Exception {
    try {
      ReservedIPPatch reservedIpPatchModel = new ReservedIPPatch.Builder()
        .autoDelete(false)
        .name("my-reserved-ip-updated")
        .build();
      Map<String, Object> reservedIpPatchModelAsPatch = reservedIpPatchModel.asPatch();

      UpdateSubnetReservedIpOptions updateSubnetReservedIpOptions = new UpdateSubnetReservedIpOptions.Builder()
        .subnetId("testString")
        .id("testString")
        .reservedIpPatch(reservedIpPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<ReservedIP> response = service.updateSubnetReservedIp(updateSubnetReservedIpOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ReservedIP reservedIpResult = response.getResult();
      assertNotNull(reservedIpResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateSubnetReservedIp" })
  public void testListImages() throws Exception {
    try {
      ListImagesOptions listImagesOptions = new ListImagesOptions.Builder()
        .start("testString")
        .limit(Long.valueOf("10"))
        .resourceGroupId("testString")
        .name("my-name")
        .status(java.util.Arrays.asList("available"))
        .visibility("private")
        .userDataFormat(java.util.Arrays.asList("cloud_init"))
        .ownerType("provider")
        .build();

      // Invoke operation
      Response<ImageCollection> response = service.listImages(listImagesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ImageCollection imageCollectionResult = response.getResult();
      assertNotNull(imageCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListImages" })
  public void testListImagesWithPager() throws Exception {
    try {
      ListImagesOptions options = new ListImagesOptions.Builder()
        .limit(Long.valueOf("10"))
        .resourceGroupId("testString")
        .name("my-name")
        .status(java.util.Arrays.asList("available"))
        .visibility("private")
        .userDataFormat(java.util.Arrays.asList("cloud_init"))
        .ownerType("provider")
        .build();

      // Test getNext().
      List<Image> allResults = new ArrayList<>();
      ImagesPager pager = new ImagesPager(service, options);
      while (pager.hasNext()) {
        List<Image> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new ImagesPager(service, options);
      List<Image> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListImages" })
  public void testCreateImage() throws Exception {
    try {
      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
        .id("fee82deba12e4c0fb69c3b09d1f12345")
        .build();

      EncryptionKeyIdentityByCRN encryptionKeyIdentityModel = new EncryptionKeyIdentityByCRN.Builder()
        .crn("crn:v1:bluemix:public:kms:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179")
        .build();

      ImageFilePrototype imageFilePrototypeModel = new ImageFilePrototype.Builder()
        .href("cos://us-south/my-bucket/my-image.qcow2")
        .build();

      OperatingSystemIdentityByName operatingSystemIdentityModel = new OperatingSystemIdentityByName.Builder()
        .name("debian-9-amd64")
        .build();

      ImagePrototypeImageByFile imagePrototypeModel = new ImagePrototypeImageByFile.Builder()
        .deprecationAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
        .name("my-image")
        .obsolescenceAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
        .resourceGroup(resourceGroupIdentityModel)
        .encryptedDataKey("testString")
        .encryptionKey(encryptionKeyIdentityModel)
        .file(imageFilePrototypeModel)
        .operatingSystem(operatingSystemIdentityModel)
        .build();

      CreateImageOptions createImageOptions = new CreateImageOptions.Builder()
        .imagePrototype(imagePrototypeModel)
        .build();

      // Invoke operation
      Response<Image> response = service.createImage(createImageOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      Image imageResult = response.getResult();
      assertNotNull(imageResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateImage" })
  public void testGetImage() throws Exception {
    try {
      GetImageOptions getImageOptions = new GetImageOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<Image> response = service.getImage(getImageOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Image imageResult = response.getResult();
      assertNotNull(imageResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetImage" })
  public void testUpdateImage() throws Exception {
    try {
      ImagePatch imagePatchModel = new ImagePatch.Builder()
        .deprecationAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
        .name("my-image")
        .obsolescenceAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
        .build();
      Map<String, Object> imagePatchModelAsPatch = imagePatchModel.asPatch();

      UpdateImageOptions updateImageOptions = new UpdateImageOptions.Builder()
        .id("testString")
        .imagePatch(imagePatchModelAsPatch)
        .build();

      // Invoke operation
      Response<Image> response = service.updateImage(updateImageOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Image imageResult = response.getResult();
      assertNotNull(imageResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateImage" })
  public void testDeprecateImage() throws Exception {
    try {
      DeprecateImageOptions deprecateImageOptions = new DeprecateImageOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deprecateImage(deprecateImageOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeprecateImage" })
  public void testObsoleteImage() throws Exception {
    try {
      ObsoleteImageOptions obsoleteImageOptions = new ObsoleteImageOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.obsoleteImage(obsoleteImageOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testObsoleteImage" })
  public void testListImageExportJobs() throws Exception {
    try {
      ListImageExportJobsOptions listImageExportJobsOptions = new ListImageExportJobsOptions.Builder()
        .imageId("testString")
        .name("my-name")
        .build();

      // Invoke operation
      Response<ImageExportJobUnpaginatedCollection> response = service.listImageExportJobs(listImageExportJobsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ImageExportJobUnpaginatedCollection imageExportJobUnpaginatedCollectionResult = response.getResult();
      assertNotNull(imageExportJobUnpaginatedCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListImageExportJobs" })
  public void testCreateImageExportJob() throws Exception {
    try {
      CloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByName cloudObjectStorageBucketIdentityModel = new CloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByName.Builder()
        .name("bucket-27200-lwx4cfvcue")
        .build();

      CreateImageExportJobOptions createImageExportJobOptions = new CreateImageExportJobOptions.Builder()
        .imageId("testString")
        .storageBucket(cloudObjectStorageBucketIdentityModel)
        .format("qcow2")
        .name("my-image-export")
        .build();

      // Invoke operation
      Response<ImageExportJob> response = service.createImageExportJob(createImageExportJobOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      ImageExportJob imageExportJobResult = response.getResult();
      assertNotNull(imageExportJobResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateImageExportJob" })
  public void testGetImageExportJob() throws Exception {
    try {
      GetImageExportJobOptions getImageExportJobOptions = new GetImageExportJobOptions.Builder()
        .imageId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<ImageExportJob> response = service.getImageExportJob(getImageExportJobOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ImageExportJob imageExportJobResult = response.getResult();
      assertNotNull(imageExportJobResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetImageExportJob" })
  public void testUpdateImageExportJob() throws Exception {
    try {
      ImageExportJobPatch imageExportJobPatchModel = new ImageExportJobPatch.Builder()
        .name("my-image-export-job-updated")
        .build();
      Map<String, Object> imageExportJobPatchModelAsPatch = imageExportJobPatchModel.asPatch();

      UpdateImageExportJobOptions updateImageExportJobOptions = new UpdateImageExportJobOptions.Builder()
        .imageId("testString")
        .id("testString")
        .imageExportJobPatch(imageExportJobPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<ImageExportJob> response = service.updateImageExportJob(updateImageExportJobOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ImageExportJob imageExportJobResult = response.getResult();
      assertNotNull(imageExportJobResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateImageExportJob" })
  public void testListOperatingSystems() throws Exception {
    try {
      ListOperatingSystemsOptions listOperatingSystemsOptions = new ListOperatingSystemsOptions.Builder()
        .start("testString")
        .limit(Long.valueOf("10"))
        .build();

      // Invoke operation
      Response<OperatingSystemCollection> response = service.listOperatingSystems(listOperatingSystemsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      OperatingSystemCollection operatingSystemCollectionResult = response.getResult();
      assertNotNull(operatingSystemCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListOperatingSystems" })
  public void testListOperatingSystemsWithPager() throws Exception {
    try {
      ListOperatingSystemsOptions options = new ListOperatingSystemsOptions.Builder()
        .limit(Long.valueOf("10"))
        .build();

      // Test getNext().
      List<OperatingSystem> allResults = new ArrayList<>();
      OperatingSystemsPager pager = new OperatingSystemsPager(service, options);
      while (pager.hasNext()) {
        List<OperatingSystem> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new OperatingSystemsPager(service, options);
      List<OperatingSystem> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListOperatingSystems" })
  public void testGetOperatingSystem() throws Exception {
    try {
      GetOperatingSystemOptions getOperatingSystemOptions = new GetOperatingSystemOptions.Builder()
        .name("red-7-amd64")
        .build();

      // Invoke operation
      Response<OperatingSystem> response = service.getOperatingSystem(getOperatingSystemOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      OperatingSystem operatingSystemResult = response.getResult();
      assertNotNull(operatingSystemResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetOperatingSystem" })
  public void testListKeys() throws Exception {
    try {
      ListKeysOptions listKeysOptions = new ListKeysOptions.Builder()
        .start("testString")
        .limit(Long.valueOf("10"))
        .resourceGroupId("testString")
        .build();

      // Invoke operation
      Response<KeyCollection> response = service.listKeys(listKeysOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      KeyCollection keyCollectionResult = response.getResult();
      assertNotNull(keyCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListKeys" })
  public void testListKeysWithPager() throws Exception {
    try {
      ListKeysOptions options = new ListKeysOptions.Builder()
        .limit(Long.valueOf("10"))
        .resourceGroupId("testString")
        .build();

      // Test getNext().
      List<Key> allResults = new ArrayList<>();
      KeysPager pager = new KeysPager(service, options);
      while (pager.hasNext()) {
        List<Key> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new KeysPager(service, options);
      List<Key> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListKeys" })
  public void testCreateKey() throws Exception {
    try {
      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
        .id("fee82deba12e4c0fb69c3b09d1f12345")
        .build();

      CreateKeyOptions createKeyOptions = new CreateKeyOptions.Builder()
        .publicKey("ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDDGe50Bxa5T5NDddrrtbx2Y4/VGbiCgXqnBsYToIUKoFSHTQl5IX3PasGnneKanhcLwWz5M5MoCRvhxTp66NKzIfAz7r+FX9rxgR+ZgcM253YAqOVeIpOU408simDZKriTlN8kYsXL7P34tsWuAJf4MgZtJAQxous/2byetpdCv8ddnT4X3ltOg9w+LqSCPYfNivqH00Eh7S1Ldz7I8aw5WOp5a+sQFP/RbwfpwHp+ny7DfeIOokcuI42tJkoBn7UsLTVpCSmXr2EDRlSWe/1M/iHNRBzaT3CK0+SwZWd2AEjePxSnWKNGIEUJDlUYp7hKhiQcgT5ZAnWU121oc5En")
        .name("my-key-1")
        .resourceGroup(resourceGroupIdentityModel)
        .type("rsa")
        .build();

      // Invoke operation
      Response<Key> response = service.createKey(createKeyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      Key keyResult = response.getResult();
      assertNotNull(keyResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateKey" })
  public void testGetKey() throws Exception {
    try {
      GetKeyOptions getKeyOptions = new GetKeyOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<Key> response = service.getKey(getKeyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Key keyResult = response.getResult();
      assertNotNull(keyResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetKey" })
  public void testUpdateKey() throws Exception {
    try {
      KeyPatch keyPatchModel = new KeyPatch.Builder()
        .name("my-key-1")
        .build();
      Map<String, Object> keyPatchModelAsPatch = keyPatchModel.asPatch();

      UpdateKeyOptions updateKeyOptions = new UpdateKeyOptions.Builder()
        .id("testString")
        .keyPatch(keyPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<Key> response = service.updateKey(updateKeyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Key keyResult = response.getResult();
      assertNotNull(keyResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateKey" })
  public void testListInstanceProfiles() throws Exception {
    try {
      ListInstanceProfilesOptions listInstanceProfilesOptions = new ListInstanceProfilesOptions();

      // Invoke operation
      Response<InstanceProfileCollection> response = service.listInstanceProfiles(listInstanceProfilesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceProfileCollection instanceProfileCollectionResult = response.getResult();
      assertNotNull(instanceProfileCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListInstanceProfiles" })
  public void testGetInstanceProfile() throws Exception {
    try {
      GetInstanceProfileOptions getInstanceProfileOptions = new GetInstanceProfileOptions.Builder()
        .name("mx2-host-152x1216")
        .build();

      // Invoke operation
      Response<InstanceProfile> response = service.getInstanceProfile(getInstanceProfileOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceProfile instanceProfileResult = response.getResult();
      assertNotNull(instanceProfileResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetInstanceProfile" })
  public void testListInstanceTemplates() throws Exception {
    try {
      ListInstanceTemplatesOptions listInstanceTemplatesOptions = new ListInstanceTemplatesOptions();

      // Invoke operation
      Response<InstanceTemplateCollection> response = service.listInstanceTemplates(listInstanceTemplatesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceTemplateCollection instanceTemplateCollectionResult = response.getResult();
      assertNotNull(instanceTemplateCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListInstanceTemplates" })
  public void testCreateInstanceTemplate() throws Exception {
    try {
      InstanceAvailabilityPolicyPrototype instanceAvailabilityPolicyPrototypeModel = new InstanceAvailabilityPolicyPrototype.Builder()
        .hostFailure("restart")
        .build();

      ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPPrototypeClusterNetworkInterfacePrimaryIPContext clusterNetworkInterfacePrimaryIpPrototypeModel = new ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPPrototypeClusterNetworkInterfacePrimaryIPContext.Builder()
        .address("10.0.0.5")
        .autoDelete(false)
        .name("my-cluster-network-subnet-reserved-ip")
        .build();

      ClusterNetworkSubnetIdentityById clusterNetworkSubnetIdentityModel = new ClusterNetworkSubnetIdentityById.Builder()
        .id("0717-7931845c-65c4-4b0a-80cd-7d9c1a6d7930")
        .build();

      InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceInstanceClusterNetworkInterfacePrototypeInstanceClusterNetworkAttachment instanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceModel = new InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceInstanceClusterNetworkInterfacePrototypeInstanceClusterNetworkAttachment.Builder()
        .autoDelete(false)
        .name("my-cluster-network-interface")
        .primaryIp(clusterNetworkInterfacePrimaryIpPrototypeModel)
        .subnet(clusterNetworkSubnetIdentityModel)
        .build();

      InstanceClusterNetworkAttachmentPrototypeInstanceContext instanceClusterNetworkAttachmentPrototypeInstanceContextModel = new InstanceClusterNetworkAttachmentPrototypeInstanceContext.Builder()
        .clusterNetworkInterface(instanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceModel)
        .name("my-instance-network-attachment")
        .build();

      TrustedProfileIdentityById trustedProfileIdentityModel = new TrustedProfileIdentityById.Builder()
        .id("Profile-9fd84246-7df4-4667-94e4-8ecde51d5ac5")
        .build();

      InstanceDefaultTrustedProfilePrototype instanceDefaultTrustedProfilePrototypeModel = new InstanceDefaultTrustedProfilePrototype.Builder()
        .autoLink(false)
        .target(trustedProfileIdentityModel)
        .build();

      KeyIdentityById keyIdentityModel = new KeyIdentityById.Builder()
        .id("r006-82679077-ac3b-4c10-be16-63e9c21f0f45")
        .build();

      InstanceMetadataServicePrototype instanceMetadataServicePrototypeModel = new InstanceMetadataServicePrototype.Builder()
        .enabled(false)
        .protocol("https")
        .responseHopLimit(Long.valueOf("2"))
        .build();

      InstancePlacementTargetPrototypeDedicatedHostIdentityDedicatedHostIdentityById instancePlacementTargetPrototypeModel = new InstancePlacementTargetPrototypeDedicatedHostIdentityDedicatedHostIdentityById.Builder()
        .id("0717-1e09281b-f177-46fb-baf1-bc152b2e391a")
        .build();

      InstanceProfileIdentityByName instanceProfileIdentityModel = new InstanceProfileIdentityByName.Builder()
        .name("bx2-4x16")
        .build();

      ReservationIdentityById reservationIdentityModel = new ReservationIdentityById.Builder()
        .id("0717-ba49df72-37b8-43ac-98da-f8e029de0e63")
        .build();

      InstanceReservationAffinityPrototype instanceReservationAffinityPrototypeModel = new InstanceReservationAffinityPrototype.Builder()
        .policy("automatic")
        .pool(java.util.Arrays.asList(reservationIdentityModel))
        .build();

      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
        .id("fee82deba12e4c0fb69c3b09d1f12345")
        .build();

      VolumeAttachmentPrototypeVolumeVolumeIdentityVolumeIdentityById volumeAttachmentPrototypeVolumeModel = new VolumeAttachmentPrototypeVolumeVolumeIdentityVolumeIdentityById.Builder()
        .id("r006-1a6b7274-678d-4dfb-8981-c71dd9d4daa5")
        .build();

      VolumeAttachmentPrototype volumeAttachmentPrototypeModel = new VolumeAttachmentPrototype.Builder()
        .deleteVolumeOnInstanceDelete(false)
        .name("my-volume-attachment")
        .volume(volumeAttachmentPrototypeVolumeModel)
        .build();

      VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
        .id("r006-4727d842-f94f-4a2d-824a-9bc9b02c523b")
        .build();

      EncryptionKeyIdentityByCRN encryptionKeyIdentityModel = new EncryptionKeyIdentityByCRN.Builder()
        .crn("crn:v1:bluemix:public:kms:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179")
        .build();

      VolumeProfileIdentityByName volumeProfileIdentityModel = new VolumeProfileIdentityByName.Builder()
        .name("general-purpose")
        .build();

      VolumePrototypeInstanceByImageContext volumePrototypeInstanceByImageContextModel = new VolumePrototypeInstanceByImageContext.Builder()
        .bandwidth(Long.valueOf("1000"))
        .capacity(Long.valueOf("100"))
        .encryptionKey(encryptionKeyIdentityModel)
        .iops(Long.valueOf("10000"))
        .name("my-boot-volume")
        .profile(volumeProfileIdentityModel)
        .resourceGroup(resourceGroupIdentityModel)
        .userTags(java.util.Arrays.asList())
        .build();

      VolumeAttachmentPrototypeInstanceByImageContext volumeAttachmentPrototypeInstanceByImageContextModel = new VolumeAttachmentPrototypeInstanceByImageContext.Builder()
        .deleteVolumeOnInstanceDelete(true)
        .name("my-volume-attachment")
        .volume(volumePrototypeInstanceByImageContextModel)
        .build();

      ImageIdentityById imageIdentityModel = new ImageIdentityById.Builder()
        .id("r006-72b27b5c-f4b0-48bb-b954-5becc7c1dcb8")
        .build();

      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
        .name("us-south-1")
        .build();

      VirtualNetworkInterfaceIPPrototypeReservedIPPrototypeVirtualNetworkInterfaceIPsContext virtualNetworkInterfaceIpPrototypeModel = new VirtualNetworkInterfaceIPPrototypeReservedIPPrototypeVirtualNetworkInterfaceIPsContext.Builder()
        .address("10.0.0.5")
        .autoDelete(false)
        .name("my-reserved-ip")
        .build();

      VirtualNetworkInterfacePrimaryIPPrototypeReservedIPPrototypeVirtualNetworkInterfacePrimaryIPContext virtualNetworkInterfacePrimaryIpPrototypeModel = new VirtualNetworkInterfacePrimaryIPPrototypeReservedIPPrototypeVirtualNetworkInterfacePrimaryIPContext.Builder()
        .address("10.0.0.5")
        .autoDelete(false)
        .name("my-reserved-ip")
        .build();

      SecurityGroupIdentityById securityGroupIdentityModel = new SecurityGroupIdentityById.Builder()
        .id("r006-be5df5ca-12a0-494b-907e-aa6ec2bfa271")
        .build();

      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
        .id("0717-7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
        .build();

      InstanceNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeInstanceNetworkAttachmentContext instanceNetworkAttachmentPrototypeVirtualNetworkInterfaceModel = new InstanceNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeInstanceNetworkAttachmentContext.Builder()
        .allowIpSpoofing(true)
        .autoDelete(false)
        .enableInfrastructureNat(true)
        .ips(java.util.Arrays.asList(virtualNetworkInterfaceIpPrototypeModel))
        .name("my-virtual-network-interface")
        .primaryIp(virtualNetworkInterfacePrimaryIpPrototypeModel)
        .protocolStateFilteringMode("auto")
        .resourceGroup(resourceGroupIdentityModel)
        .securityGroups(java.util.Arrays.asList(securityGroupIdentityModel))
        .subnet(subnetIdentityModel)
        .build();

      InstanceNetworkAttachmentPrototype instanceNetworkAttachmentPrototypeModel = new InstanceNetworkAttachmentPrototype.Builder()
        .name("my-instance-network-attachment")
        .virtualNetworkInterface(instanceNetworkAttachmentPrototypeVirtualNetworkInterfaceModel)
        .build();

      InstanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachment instanceTemplatePrototypeModel = new InstanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachment.Builder()
        .availabilityPolicy(instanceAvailabilityPolicyPrototypeModel)
        .clusterNetworkAttachments(java.util.Arrays.asList(instanceClusterNetworkAttachmentPrototypeInstanceContextModel))
        .confidentialComputeMode("disabled")
        .defaultTrustedProfile(instanceDefaultTrustedProfilePrototypeModel)
        .enableSecureBoot(true)
        .keys(java.util.Arrays.asList(keyIdentityModel))
        .metadataService(instanceMetadataServicePrototypeModel)
        .name("my-instance")
        .placementTarget(instancePlacementTargetPrototypeModel)
        .profile(instanceProfileIdentityModel)
        .reservationAffinity(instanceReservationAffinityPrototypeModel)
        .resourceGroup(resourceGroupIdentityModel)
        .totalVolumeBandwidth(Long.valueOf("500"))
        .userData("testString")
        .volumeAttachments(java.util.Arrays.asList(volumeAttachmentPrototypeModel))
        .vpc(vpcIdentityModel)
        .bootVolumeAttachment(volumeAttachmentPrototypeInstanceByImageContextModel)
        .image(imageIdentityModel)
        .zone(zoneIdentityModel)
        .networkAttachments(java.util.Arrays.asList(instanceNetworkAttachmentPrototypeModel))
        .primaryNetworkAttachment(instanceNetworkAttachmentPrototypeModel)
        .build();

      CreateInstanceTemplateOptions createInstanceTemplateOptions = new CreateInstanceTemplateOptions.Builder()
        .instanceTemplatePrototype(instanceTemplatePrototypeModel)
        .build();

      // Invoke operation
      Response<InstanceTemplate> response = service.createInstanceTemplate(createInstanceTemplateOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      InstanceTemplate instanceTemplateResult = response.getResult();
      assertNotNull(instanceTemplateResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateInstanceTemplate" })
  public void testGetInstanceTemplate() throws Exception {
    try {
      GetInstanceTemplateOptions getInstanceTemplateOptions = new GetInstanceTemplateOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<InstanceTemplate> response = service.getInstanceTemplate(getInstanceTemplateOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceTemplate instanceTemplateResult = response.getResult();
      assertNotNull(instanceTemplateResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetInstanceTemplate" })
  public void testUpdateInstanceTemplate() throws Exception {
    try {
      InstanceTemplatePatch instanceTemplatePatchModel = new InstanceTemplatePatch.Builder()
        .name("my-instance-template-updated")
        .build();
      Map<String, Object> instanceTemplatePatchModelAsPatch = instanceTemplatePatchModel.asPatch();

      UpdateInstanceTemplateOptions updateInstanceTemplateOptions = new UpdateInstanceTemplateOptions.Builder()
        .id("testString")
        .instanceTemplatePatch(instanceTemplatePatchModelAsPatch)
        .build();

      // Invoke operation
      Response<InstanceTemplate> response = service.updateInstanceTemplate(updateInstanceTemplateOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceTemplate instanceTemplateResult = response.getResult();
      assertNotNull(instanceTemplateResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateInstanceTemplate" })
  public void testListInstances() throws Exception {
    try {
      ListInstancesOptions listInstancesOptions = new ListInstancesOptions.Builder()
        .start("testString")
        .limit(Long.valueOf("10"))
        .resourceGroupId("testString")
        .name("my-name")
        .clusterNetworkId("testString")
        .clusterNetworkCrn("crn:v1:bluemix:public:is:us-south-1:a/aa2432b1fa4d4ace891e9b80fc104e34::cluster-network:0717-da0df18c-7598-4633-a648-fdaac28a5573")
        .clusterNetworkName("my-cluster-network")
        .dedicatedHostId("testString")
        .dedicatedHostCrn("crn:v1:bluemix:public:is:us-south-1:a/aa2432b1fa4d4ace891e9b80fc104e34::dedicated-host:0717-1e09281b-f177-46fb-baf1-bc152b2e391a")
        .dedicatedHostName("my-dedicated-host")
        .placementGroupId("testString")
        .placementGroupCrn("crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::placement-group:r006-418fe842-a3e9-47b9-a938-1aa5bd632871")
        .placementGroupName("my-placement-group")
        .reservationAffinityPolicy("automatic")
        .reservationId("testString")
        .reservationCrn("crn:v1:bluemix:public:is:us-south-1:a/aa2432b1fa4d4ace891e9b80fc104e34::reservation:0717-ba49df72-37b8-43ac-98da-f8e029de0e63")
        .reservationName("my-reservation")
        .vpcId("testString")
        .vpcCrn("crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::vpc:r006-4727d842-f94f-4a2d-824a-9bc9b02c523b")
        .vpcName("my-vpc")
        .build();

      // Invoke operation
      Response<InstanceCollection> response = service.listInstances(listInstancesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceCollection instanceCollectionResult = response.getResult();
      assertNotNull(instanceCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListInstances" })
  public void testListInstancesWithPager() throws Exception {
    try {
      ListInstancesOptions options = new ListInstancesOptions.Builder()
        .limit(Long.valueOf("10"))
        .resourceGroupId("testString")
        .name("my-name")
        .clusterNetworkId("testString")
        .clusterNetworkCrn("crn:v1:bluemix:public:is:us-south-1:a/aa2432b1fa4d4ace891e9b80fc104e34::cluster-network:0717-da0df18c-7598-4633-a648-fdaac28a5573")
        .clusterNetworkName("my-cluster-network")
        .dedicatedHostId("testString")
        .dedicatedHostCrn("crn:v1:bluemix:public:is:us-south-1:a/aa2432b1fa4d4ace891e9b80fc104e34::dedicated-host:0717-1e09281b-f177-46fb-baf1-bc152b2e391a")
        .dedicatedHostName("my-dedicated-host")
        .placementGroupId("testString")
        .placementGroupCrn("crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::placement-group:r006-418fe842-a3e9-47b9-a938-1aa5bd632871")
        .placementGroupName("my-placement-group")
        .reservationAffinityPolicy("automatic")
        .reservationId("testString")
        .reservationCrn("crn:v1:bluemix:public:is:us-south-1:a/aa2432b1fa4d4ace891e9b80fc104e34::reservation:0717-ba49df72-37b8-43ac-98da-f8e029de0e63")
        .reservationName("my-reservation")
        .vpcId("testString")
        .vpcCrn("crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::vpc:r006-4727d842-f94f-4a2d-824a-9bc9b02c523b")
        .vpcName("my-vpc")
        .build();

      // Test getNext().
      List<Instance> allResults = new ArrayList<>();
      InstancesPager pager = new InstancesPager(service, options);
      while (pager.hasNext()) {
        List<Instance> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new InstancesPager(service, options);
      List<Instance> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListInstances" })
  public void testCreateInstance() throws Exception {
    try {
      InstanceAvailabilityPolicyPrototype instanceAvailabilityPolicyPrototypeModel = new InstanceAvailabilityPolicyPrototype.Builder()
        .hostFailure("restart")
        .build();

      ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPPrototypeClusterNetworkInterfacePrimaryIPContext clusterNetworkInterfacePrimaryIpPrototypeModel = new ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPPrototypeClusterNetworkInterfacePrimaryIPContext.Builder()
        .address("10.0.0.5")
        .autoDelete(false)
        .name("my-cluster-network-subnet-reserved-ip")
        .build();

      ClusterNetworkSubnetIdentityById clusterNetworkSubnetIdentityModel = new ClusterNetworkSubnetIdentityById.Builder()
        .id("0717-7931845c-65c4-4b0a-80cd-7d9c1a6d7930")
        .build();

      InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceInstanceClusterNetworkInterfacePrototypeInstanceClusterNetworkAttachment instanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceModel = new InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceInstanceClusterNetworkInterfacePrototypeInstanceClusterNetworkAttachment.Builder()
        .autoDelete(false)
        .name("my-cluster-network-interface")
        .primaryIp(clusterNetworkInterfacePrimaryIpPrototypeModel)
        .subnet(clusterNetworkSubnetIdentityModel)
        .build();

      InstanceClusterNetworkAttachmentPrototypeInstanceContext instanceClusterNetworkAttachmentPrototypeInstanceContextModel = new InstanceClusterNetworkAttachmentPrototypeInstanceContext.Builder()
        .clusterNetworkInterface(instanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceModel)
        .name("my-instance-network-attachment")
        .build();

      TrustedProfileIdentityById trustedProfileIdentityModel = new TrustedProfileIdentityById.Builder()
        .id("Profile-9fd84246-7df4-4667-94e4-8ecde51d5ac5")
        .build();

      InstanceDefaultTrustedProfilePrototype instanceDefaultTrustedProfilePrototypeModel = new InstanceDefaultTrustedProfilePrototype.Builder()
        .autoLink(false)
        .target(trustedProfileIdentityModel)
        .build();

      KeyIdentityById keyIdentityModel = new KeyIdentityById.Builder()
        .id("r006-82679077-ac3b-4c10-be16-63e9c21f0f45")
        .build();

      InstanceMetadataServicePrototype instanceMetadataServicePrototypeModel = new InstanceMetadataServicePrototype.Builder()
        .enabled(false)
        .protocol("https")
        .responseHopLimit(Long.valueOf("2"))
        .build();

      InstancePlacementTargetPrototypeDedicatedHostIdentityDedicatedHostIdentityById instancePlacementTargetPrototypeModel = new InstancePlacementTargetPrototypeDedicatedHostIdentityDedicatedHostIdentityById.Builder()
        .id("r006-418fe842-a3e9-47b9-a938-1aa5bd632871")
        .build();

      InstanceProfileIdentityByName instanceProfileIdentityModel = new InstanceProfileIdentityByName.Builder()
        .name("bx2-2x8")
        .build();

      ReservationIdentityById reservationIdentityModel = new ReservationIdentityById.Builder()
        .id("0717-ba49df72-37b8-43ac-98da-f8e029de0e63")
        .build();

      InstanceReservationAffinityPrototype instanceReservationAffinityPrototypeModel = new InstanceReservationAffinityPrototype.Builder()
        .policy("automatic")
        .pool(java.util.Arrays.asList(reservationIdentityModel))
        .build();

      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
        .id("fee82deba12e4c0fb69c3b09d1f12345")
        .build();

      VolumeProfileIdentityByName volumeProfileIdentityModel = new VolumeProfileIdentityByName.Builder()
        .name("5iops-tier")
        .build();

      EncryptionKeyIdentityByCRN encryptionKeyIdentityModel = new EncryptionKeyIdentityByCRN.Builder()
        .crn("crn:v1:bluemix:public:kms:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179")
        .build();

      VolumeAttachmentPrototypeVolumeVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeByCapacity volumeAttachmentPrototypeVolumeModel = new VolumeAttachmentPrototypeVolumeVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeByCapacity.Builder()
        .bandwidth(Long.valueOf("1000"))
        .iops(Long.valueOf("10000"))
        .name("my-data-volume")
        .profile(volumeProfileIdentityModel)
        .resourceGroup(resourceGroupIdentityModel)
        .userTags(java.util.Arrays.asList())
        .capacity(Long.valueOf("1000"))
        .encryptionKey(encryptionKeyIdentityModel)
        .build();

      VolumeAttachmentPrototype volumeAttachmentPrototypeModel = new VolumeAttachmentPrototype.Builder()
        .deleteVolumeOnInstanceDelete(false)
        .name("my-volume-attachment")
        .volume(volumeAttachmentPrototypeVolumeModel)
        .build();

      VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
        .id("r006-4727d842-f94f-4a2d-824a-9bc9b02c523b")
        .build();

      VolumePrototypeInstanceByImageContext volumePrototypeInstanceByImageContextModel = new VolumePrototypeInstanceByImageContext.Builder()
        .bandwidth(Long.valueOf("1000"))
        .capacity(Long.valueOf("100"))
        .encryptionKey(encryptionKeyIdentityModel)
        .iops(Long.valueOf("10000"))
        .name("my-boot-volume")
        .profile(volumeProfileIdentityModel)
        .resourceGroup(resourceGroupIdentityModel)
        .userTags(java.util.Arrays.asList())
        .build();

      VolumeAttachmentPrototypeInstanceByImageContext volumeAttachmentPrototypeInstanceByImageContextModel = new VolumeAttachmentPrototypeInstanceByImageContext.Builder()
        .deleteVolumeOnInstanceDelete(true)
        .name("my-volume-attachment")
        .volume(volumePrototypeInstanceByImageContextModel)
        .build();

      ImageIdentityById imageIdentityModel = new ImageIdentityById.Builder()
        .id("r006-72b27b5c-f4b0-48bb-b954-5becc7c1dcb8")
        .build();

      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
        .name("us-south-1")
        .build();

      NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext networkInterfaceIpPrototypeModel = new NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext.Builder()
        .address("10.0.0.5")
        .autoDelete(false)
        .name("my-reserved-ip")
        .build();

      SecurityGroupIdentityById securityGroupIdentityModel = new SecurityGroupIdentityById.Builder()
        .id("r006-be5df5ca-12a0-494b-907e-aa6ec2bfa271")
        .build();

      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
        .id("0717-7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
        .build();

      NetworkInterfacePrototype networkInterfacePrototypeModel = new NetworkInterfacePrototype.Builder()
        .allowIpSpoofing(true)
        .name("my-instance-network-interface")
        .primaryIp(networkInterfaceIpPrototypeModel)
        .securityGroups(java.util.Arrays.asList(securityGroupIdentityModel))
        .subnet(subnetIdentityModel)
        .build();

      InstancePrototypeInstanceByImageInstanceByImageInstanceByNetworkInterface instancePrototypeModel = new InstancePrototypeInstanceByImageInstanceByImageInstanceByNetworkInterface.Builder()
        .availabilityPolicy(instanceAvailabilityPolicyPrototypeModel)
        .clusterNetworkAttachments(java.util.Arrays.asList(instanceClusterNetworkAttachmentPrototypeInstanceContextModel))
        .confidentialComputeMode("disabled")
        .defaultTrustedProfile(instanceDefaultTrustedProfilePrototypeModel)
        .enableSecureBoot(true)
        .keys(java.util.Arrays.asList(keyIdentityModel))
        .metadataService(instanceMetadataServicePrototypeModel)
        .name("my-instance")
        .placementTarget(instancePlacementTargetPrototypeModel)
        .profile(instanceProfileIdentityModel)
        .reservationAffinity(instanceReservationAffinityPrototypeModel)
        .resourceGroup(resourceGroupIdentityModel)
        .totalVolumeBandwidth(Long.valueOf("500"))
        .userData("testString")
        .volumeAttachments(java.util.Arrays.asList(volumeAttachmentPrototypeModel))
        .vpc(vpcIdentityModel)
        .bootVolumeAttachment(volumeAttachmentPrototypeInstanceByImageContextModel)
        .image(imageIdentityModel)
        .zone(zoneIdentityModel)
        .networkInterfaces(java.util.Arrays.asList(networkInterfacePrototypeModel))
        .primaryNetworkInterface(networkInterfacePrototypeModel)
        .build();

      CreateInstanceOptions createInstanceOptions = new CreateInstanceOptions.Builder()
        .instancePrototype(instancePrototypeModel)
        .build();

      // Invoke operation
      Response<Instance> response = service.createInstance(createInstanceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      Instance instanceResult = response.getResult();
      assertNotNull(instanceResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateInstance" })
  public void testGetInstance() throws Exception {
    try {
      GetInstanceOptions getInstanceOptions = new GetInstanceOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<Instance> response = service.getInstance(getInstanceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Instance instanceResult = response.getResult();
      assertNotNull(instanceResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetInstance" })
  public void testUpdateInstance() throws Exception {
    try {
      InstanceAvailabilityPolicyPatch instanceAvailabilityPolicyPatchModel = new InstanceAvailabilityPolicyPatch.Builder()
        .hostFailure("restart")
        .build();

      InstanceMetadataServicePatch instanceMetadataServicePatchModel = new InstanceMetadataServicePatch.Builder()
        .enabled(true)
        .protocol("http")
        .responseHopLimit(Long.valueOf("1"))
        .build();

      InstancePlacementTargetPatchDedicatedHostIdentityDedicatedHostIdentityById instancePlacementTargetPatchModel = new InstancePlacementTargetPatchDedicatedHostIdentityDedicatedHostIdentityById.Builder()
        .id("0717-1e09281b-f177-46fb-baf1-bc152b2e391a")
        .build();

      InstancePatchProfileInstanceProfileIdentityByName instancePatchProfileModel = new InstancePatchProfileInstanceProfileIdentityByName.Builder()
        .name("bx2-4x16")
        .build();

      ReservationIdentityById reservationIdentityModel = new ReservationIdentityById.Builder()
        .id("0717-ba49df72-37b8-43ac-98da-f8e029de0e63")
        .build();

      InstanceReservationAffinityPatch instanceReservationAffinityPatchModel = new InstanceReservationAffinityPatch.Builder()
        .policy("automatic")
        .pool(java.util.Arrays.asList(reservationIdentityModel))
        .build();

      InstancePatch instancePatchModel = new InstancePatch.Builder()
        .availabilityPolicy(instanceAvailabilityPolicyPatchModel)
        .confidentialComputeMode("disabled")
        .enableSecureBoot(true)
        .metadataService(instanceMetadataServicePatchModel)
        .name("my-instance")
        .placementTarget(instancePlacementTargetPatchModel)
        .profile(instancePatchProfileModel)
        .reservationAffinity(instanceReservationAffinityPatchModel)
        .totalVolumeBandwidth(Long.valueOf("500"))
        .build();
      Map<String, Object> instancePatchModelAsPatch = instancePatchModel.asPatch();

      UpdateInstanceOptions updateInstanceOptions = new UpdateInstanceOptions.Builder()
        .id("testString")
        .instancePatch(instancePatchModelAsPatch)
        .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
        .build();

      // Invoke operation
      Response<Instance> response = service.updateInstance(updateInstanceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Instance instanceResult = response.getResult();
      assertNotNull(instanceResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateInstance" })
  public void testGetInstanceInitialization() throws Exception {
    try {
      GetInstanceInitializationOptions getInstanceInitializationOptions = new GetInstanceInitializationOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<InstanceInitialization> response = service.getInstanceInitialization(getInstanceInitializationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceInitialization instanceInitializationResult = response.getResult();
      assertNotNull(instanceInitializationResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetInstanceInitialization" })
  public void testCreateInstanceAction() throws Exception {
    try {
      CreateInstanceActionOptions createInstanceActionOptions = new CreateInstanceActionOptions.Builder()
        .instanceId("testString")
        .type("reboot")
        .force(true)
        .build();

      // Invoke operation
      Response<InstanceAction> response = service.createInstanceAction(createInstanceActionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      InstanceAction instanceActionResult = response.getResult();
      assertNotNull(instanceActionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateInstanceAction" })
  public void testListInstanceClusterNetworkAttachments() throws Exception {
    try {
      ListInstanceClusterNetworkAttachmentsOptions listInstanceClusterNetworkAttachmentsOptions = new ListInstanceClusterNetworkAttachmentsOptions.Builder()
        .instanceId("testString")
        .start("testString")
        .limit(Long.valueOf("10"))
        .build();

      // Invoke operation
      Response<InstanceClusterNetworkAttachmentCollection> response = service.listInstanceClusterNetworkAttachments(listInstanceClusterNetworkAttachmentsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceClusterNetworkAttachmentCollection instanceClusterNetworkAttachmentCollectionResult = response.getResult();
      assertNotNull(instanceClusterNetworkAttachmentCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListInstanceClusterNetworkAttachments" })
  public void testListInstanceClusterNetworkAttachmentsWithPager() throws Exception {
    try {
      ListInstanceClusterNetworkAttachmentsOptions options = new ListInstanceClusterNetworkAttachmentsOptions.Builder()
        .instanceId("testString")
        .limit(Long.valueOf("10"))
        .build();

      // Test getNext().
      List<InstanceClusterNetworkAttachment> allResults = new ArrayList<>();
      InstanceClusterNetworkAttachmentsPager pager = new InstanceClusterNetworkAttachmentsPager(service, options);
      while (pager.hasNext()) {
        List<InstanceClusterNetworkAttachment> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new InstanceClusterNetworkAttachmentsPager(service, options);
      List<InstanceClusterNetworkAttachment> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListInstanceClusterNetworkAttachments" })
  public void testCreateClusterNetworkAttachment() throws Exception {
    try {
      ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPPrototypeClusterNetworkInterfacePrimaryIPContext clusterNetworkInterfacePrimaryIpPrototypeModel = new ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPPrototypeClusterNetworkInterfacePrimaryIPContext.Builder()
        .address("10.0.0.5")
        .autoDelete(false)
        .name("my-cluster-network-subnet-reserved-ip")
        .build();

      ClusterNetworkSubnetIdentityById clusterNetworkSubnetIdentityModel = new ClusterNetworkSubnetIdentityById.Builder()
        .id("0717-7931845c-65c4-4b0a-80cd-7d9c1a6d7930")
        .build();

      InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceInstanceClusterNetworkInterfacePrototypeInstanceClusterNetworkAttachment instanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceModel = new InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceInstanceClusterNetworkInterfacePrototypeInstanceClusterNetworkAttachment.Builder()
        .autoDelete(false)
        .name("my-cluster-network-interface")
        .primaryIp(clusterNetworkInterfacePrimaryIpPrototypeModel)
        .subnet(clusterNetworkSubnetIdentityModel)
        .build();

      InstanceClusterNetworkAttachmentBeforePrototypeInstanceClusterNetworkAttachmentIdentityById instanceClusterNetworkAttachmentBeforePrototypeModel = new InstanceClusterNetworkAttachmentBeforePrototypeInstanceClusterNetworkAttachmentIdentityById.Builder()
        .id("0717-fb880975-db45-4459-8548-64e3995ac213")
        .build();

      CreateClusterNetworkAttachmentOptions createClusterNetworkAttachmentOptions = new CreateClusterNetworkAttachmentOptions.Builder()
        .instanceId("testString")
        .clusterNetworkInterface(instanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceModel)
        .before(instanceClusterNetworkAttachmentBeforePrototypeModel)
        .name("my-instance-network-attachment")
        .build();

      // Invoke operation
      Response<InstanceClusterNetworkAttachment> response = service.createClusterNetworkAttachment(createClusterNetworkAttachmentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      InstanceClusterNetworkAttachment instanceClusterNetworkAttachmentResult = response.getResult();
      assertNotNull(instanceClusterNetworkAttachmentResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateClusterNetworkAttachment" })
  public void testGetInstanceClusterNetworkAttachment() throws Exception {
    try {
      GetInstanceClusterNetworkAttachmentOptions getInstanceClusterNetworkAttachmentOptions = new GetInstanceClusterNetworkAttachmentOptions.Builder()
        .instanceId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<InstanceClusterNetworkAttachment> response = service.getInstanceClusterNetworkAttachment(getInstanceClusterNetworkAttachmentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceClusterNetworkAttachment instanceClusterNetworkAttachmentResult = response.getResult();
      assertNotNull(instanceClusterNetworkAttachmentResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetInstanceClusterNetworkAttachment" })
  public void testUpdateInstanceClusterNetworkAttachment() throws Exception {
    try {
      InstanceClusterNetworkAttachmentPatch instanceClusterNetworkAttachmentPatchModel = new InstanceClusterNetworkAttachmentPatch.Builder()
        .name("my-instance-network-attachment-updated")
        .build();
      Map<String, Object> instanceClusterNetworkAttachmentPatchModelAsPatch = instanceClusterNetworkAttachmentPatchModel.asPatch();

      UpdateInstanceClusterNetworkAttachmentOptions updateInstanceClusterNetworkAttachmentOptions = new UpdateInstanceClusterNetworkAttachmentOptions.Builder()
        .instanceId("testString")
        .id("testString")
        .instanceClusterNetworkAttachmentPatch(instanceClusterNetworkAttachmentPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<InstanceClusterNetworkAttachment> response = service.updateInstanceClusterNetworkAttachment(updateInstanceClusterNetworkAttachmentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceClusterNetworkAttachment instanceClusterNetworkAttachmentResult = response.getResult();
      assertNotNull(instanceClusterNetworkAttachmentResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateInstanceClusterNetworkAttachment" })
  public void testCreateInstanceConsoleAccessToken() throws Exception {
    try {
      CreateInstanceConsoleAccessTokenOptions createInstanceConsoleAccessTokenOptions = new CreateInstanceConsoleAccessTokenOptions.Builder()
        .instanceId("testString")
        .consoleType("serial")
        .force(false)
        .build();

      // Invoke operation
      Response<InstanceConsoleAccessToken> response = service.createInstanceConsoleAccessToken(createInstanceConsoleAccessTokenOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceConsoleAccessToken instanceConsoleAccessTokenResult = response.getResult();
      assertNotNull(instanceConsoleAccessTokenResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateInstanceConsoleAccessToken" })
  public void testListInstanceDisks() throws Exception {
    try {
      ListInstanceDisksOptions listInstanceDisksOptions = new ListInstanceDisksOptions.Builder()
        .instanceId("testString")
        .build();

      // Invoke operation
      Response<InstanceDiskCollection> response = service.listInstanceDisks(listInstanceDisksOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceDiskCollection instanceDiskCollectionResult = response.getResult();
      assertNotNull(instanceDiskCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListInstanceDisks" })
  public void testGetInstanceDisk() throws Exception {
    try {
      GetInstanceDiskOptions getInstanceDiskOptions = new GetInstanceDiskOptions.Builder()
        .instanceId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<InstanceDisk> response = service.getInstanceDisk(getInstanceDiskOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceDisk instanceDiskResult = response.getResult();
      assertNotNull(instanceDiskResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetInstanceDisk" })
  public void testUpdateInstanceDisk() throws Exception {
    try {
      InstanceDiskPatch instanceDiskPatchModel = new InstanceDiskPatch.Builder()
        .name("my-instance-disk-updated")
        .build();
      Map<String, Object> instanceDiskPatchModelAsPatch = instanceDiskPatchModel.asPatch();

      UpdateInstanceDiskOptions updateInstanceDiskOptions = new UpdateInstanceDiskOptions.Builder()
        .instanceId("testString")
        .id("testString")
        .instanceDiskPatch(instanceDiskPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<InstanceDisk> response = service.updateInstanceDisk(updateInstanceDiskOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceDisk instanceDiskResult = response.getResult();
      assertNotNull(instanceDiskResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateInstanceDisk" })
  public void testListInstanceNetworkAttachments() throws Exception {
    try {
      ListInstanceNetworkAttachmentsOptions listInstanceNetworkAttachmentsOptions = new ListInstanceNetworkAttachmentsOptions.Builder()
        .instanceId("testString")
        .build();

      // Invoke operation
      Response<InstanceNetworkAttachmentCollection> response = service.listInstanceNetworkAttachments(listInstanceNetworkAttachmentsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceNetworkAttachmentCollection instanceNetworkAttachmentCollectionResult = response.getResult();
      assertNotNull(instanceNetworkAttachmentCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListInstanceNetworkAttachments" })
  public void testCreateInstanceNetworkAttachment() throws Exception {
    try {
      VirtualNetworkInterfaceIPPrototypeReservedIPPrototypeVirtualNetworkInterfaceIPsContext virtualNetworkInterfaceIpPrototypeModel = new VirtualNetworkInterfaceIPPrototypeReservedIPPrototypeVirtualNetworkInterfaceIPsContext.Builder()
        .address("10.0.0.5")
        .autoDelete(false)
        .name("my-reserved-ip")
        .build();

      VirtualNetworkInterfacePrimaryIPPrototypeReservedIPPrototypeVirtualNetworkInterfacePrimaryIPContext virtualNetworkInterfacePrimaryIpPrototypeModel = new VirtualNetworkInterfacePrimaryIPPrototypeReservedIPPrototypeVirtualNetworkInterfacePrimaryIPContext.Builder()
        .address("10.0.0.7")
        .autoDelete(false)
        .name("my-reserved-ip")
        .build();

      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
        .id("fee82deba12e4c0fb69c3b09d1f12345")
        .build();

      SecurityGroupIdentityById securityGroupIdentityModel = new SecurityGroupIdentityById.Builder()
        .id("r006-be5df5ca-12a0-494b-907e-aa6ec2bfa271")
        .build();

      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
        .id("0717-7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
        .build();

      InstanceNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeInstanceNetworkAttachmentContext instanceNetworkAttachmentPrototypeVirtualNetworkInterfaceModel = new InstanceNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeInstanceNetworkAttachmentContext.Builder()
        .allowIpSpoofing(true)
        .autoDelete(false)
        .enableInfrastructureNat(true)
        .ips(java.util.Arrays.asList(virtualNetworkInterfaceIpPrototypeModel))
        .name("my-virtual-network-interface")
        .primaryIp(virtualNetworkInterfacePrimaryIpPrototypeModel)
        .protocolStateFilteringMode("auto")
        .resourceGroup(resourceGroupIdentityModel)
        .securityGroups(java.util.Arrays.asList(securityGroupIdentityModel))
        .subnet(subnetIdentityModel)
        .build();

      CreateInstanceNetworkAttachmentOptions createInstanceNetworkAttachmentOptions = new CreateInstanceNetworkAttachmentOptions.Builder()
        .instanceId("testString")
        .virtualNetworkInterface(instanceNetworkAttachmentPrototypeVirtualNetworkInterfaceModel)
        .name("testString")
        .build();

      // Invoke operation
      Response<InstanceNetworkAttachment> response = service.createInstanceNetworkAttachment(createInstanceNetworkAttachmentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      InstanceNetworkAttachment instanceNetworkAttachmentResult = response.getResult();
      assertNotNull(instanceNetworkAttachmentResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateInstanceNetworkAttachment" })
  public void testGetInstanceNetworkAttachment() throws Exception {
    try {
      GetInstanceNetworkAttachmentOptions getInstanceNetworkAttachmentOptions = new GetInstanceNetworkAttachmentOptions.Builder()
        .instanceId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<InstanceNetworkAttachment> response = service.getInstanceNetworkAttachment(getInstanceNetworkAttachmentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceNetworkAttachment instanceNetworkAttachmentResult = response.getResult();
      assertNotNull(instanceNetworkAttachmentResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetInstanceNetworkAttachment" })
  public void testUpdateInstanceNetworkAttachment() throws Exception {
    try {
      InstanceNetworkAttachmentPatch instanceNetworkAttachmentPatchModel = new InstanceNetworkAttachmentPatch.Builder()
        .name("my-instance-network-attachment-updated")
        .build();
      Map<String, Object> instanceNetworkAttachmentPatchModelAsPatch = instanceNetworkAttachmentPatchModel.asPatch();

      UpdateInstanceNetworkAttachmentOptions updateInstanceNetworkAttachmentOptions = new UpdateInstanceNetworkAttachmentOptions.Builder()
        .instanceId("testString")
        .id("testString")
        .instanceNetworkAttachmentPatch(instanceNetworkAttachmentPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<InstanceNetworkAttachment> response = service.updateInstanceNetworkAttachment(updateInstanceNetworkAttachmentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceNetworkAttachment instanceNetworkAttachmentResult = response.getResult();
      assertNotNull(instanceNetworkAttachmentResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateInstanceNetworkAttachment" })
  public void testListInstanceNetworkInterfaces() throws Exception {
    try {
      ListInstanceNetworkInterfacesOptions listInstanceNetworkInterfacesOptions = new ListInstanceNetworkInterfacesOptions.Builder()
        .instanceId("testString")
        .build();

      // Invoke operation
      Response<NetworkInterfaceUnpaginatedCollection> response = service.listInstanceNetworkInterfaces(listInstanceNetworkInterfacesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      NetworkInterfaceUnpaginatedCollection networkInterfaceUnpaginatedCollectionResult = response.getResult();
      assertNotNull(networkInterfaceUnpaginatedCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListInstanceNetworkInterfaces" })
  public void testCreateInstanceNetworkInterface() throws Exception {
    try {
      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
        .id("0717-7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
        .build();

      NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext networkInterfaceIpPrototypeModel = new NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext.Builder()
        .address("10.0.0.5")
        .autoDelete(false)
        .name("my-reserved-ip")
        .build();

      SecurityGroupIdentityById securityGroupIdentityModel = new SecurityGroupIdentityById.Builder()
        .id("r006-be5df5ca-12a0-494b-907e-aa6ec2bfa271")
        .build();

      CreateInstanceNetworkInterfaceOptions createInstanceNetworkInterfaceOptions = new CreateInstanceNetworkInterfaceOptions.Builder()
        .instanceId("testString")
        .subnet(subnetIdentityModel)
        .allowIpSpoofing(true)
        .name("my-instance-network-interface")
        .primaryIp(networkInterfaceIpPrototypeModel)
        .securityGroups(java.util.Arrays.asList(securityGroupIdentityModel))
        .build();

      // Invoke operation
      Response<NetworkInterface> response = service.createInstanceNetworkInterface(createInstanceNetworkInterfaceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      NetworkInterface networkInterfaceResult = response.getResult();
      assertNotNull(networkInterfaceResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateInstanceNetworkInterface" })
  public void testGetInstanceNetworkInterface() throws Exception {
    try {
      GetInstanceNetworkInterfaceOptions getInstanceNetworkInterfaceOptions = new GetInstanceNetworkInterfaceOptions.Builder()
        .instanceId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<NetworkInterface> response = service.getInstanceNetworkInterface(getInstanceNetworkInterfaceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      NetworkInterface networkInterfaceResult = response.getResult();
      assertNotNull(networkInterfaceResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetInstanceNetworkInterface" })
  public void testUpdateInstanceNetworkInterface() throws Exception {
    try {
      NetworkInterfacePatch networkInterfacePatchModel = new NetworkInterfacePatch.Builder()
        .allowIpSpoofing(true)
        .name("my-network-interface-updated")
        .build();
      Map<String, Object> networkInterfacePatchModelAsPatch = networkInterfacePatchModel.asPatch();

      UpdateInstanceNetworkInterfaceOptions updateInstanceNetworkInterfaceOptions = new UpdateInstanceNetworkInterfaceOptions.Builder()
        .instanceId("testString")
        .id("testString")
        .networkInterfacePatch(networkInterfacePatchModelAsPatch)
        .build();

      // Invoke operation
      Response<NetworkInterface> response = service.updateInstanceNetworkInterface(updateInstanceNetworkInterfaceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      NetworkInterface networkInterfaceResult = response.getResult();
      assertNotNull(networkInterfaceResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateInstanceNetworkInterface" })
  public void testListInstanceNetworkInterfaceFloatingIps() throws Exception {
    try {
      ListInstanceNetworkInterfaceFloatingIpsOptions listInstanceNetworkInterfaceFloatingIpsOptions = new ListInstanceNetworkInterfaceFloatingIpsOptions.Builder()
        .instanceId("testString")
        .networkInterfaceId("testString")
        .build();

      // Invoke operation
      Response<FloatingIPUnpaginatedCollection> response = service.listInstanceNetworkInterfaceFloatingIps(listInstanceNetworkInterfaceFloatingIpsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      FloatingIPUnpaginatedCollection floatingIpUnpaginatedCollectionResult = response.getResult();
      assertNotNull(floatingIpUnpaginatedCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListInstanceNetworkInterfaceFloatingIps" })
  public void testGetInstanceNetworkInterfaceFloatingIp() throws Exception {
    try {
      GetInstanceNetworkInterfaceFloatingIpOptions getInstanceNetworkInterfaceFloatingIpOptions = new GetInstanceNetworkInterfaceFloatingIpOptions.Builder()
        .instanceId("testString")
        .networkInterfaceId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<FloatingIP> response = service.getInstanceNetworkInterfaceFloatingIp(getInstanceNetworkInterfaceFloatingIpOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      FloatingIP floatingIpResult = response.getResult();
      assertNotNull(floatingIpResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetInstanceNetworkInterfaceFloatingIp" })
  public void testAddInstanceNetworkInterfaceFloatingIp() throws Exception {
    try {
      AddInstanceNetworkInterfaceFloatingIpOptions addInstanceNetworkInterfaceFloatingIpOptions = new AddInstanceNetworkInterfaceFloatingIpOptions.Builder()
        .instanceId("testString")
        .networkInterfaceId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<FloatingIP> response = service.addInstanceNetworkInterfaceFloatingIp(addInstanceNetworkInterfaceFloatingIpOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      FloatingIP floatingIpResult = response.getResult();
      assertNotNull(floatingIpResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testAddInstanceNetworkInterfaceFloatingIp" })
  public void testListInstanceNetworkInterfaceIps() throws Exception {
    try {
      ListInstanceNetworkInterfaceIpsOptions listInstanceNetworkInterfaceIpsOptions = new ListInstanceNetworkInterfaceIpsOptions.Builder()
        .instanceId("testString")
        .networkInterfaceId("testString")
        .start("testString")
        .limit(Long.valueOf("10"))
        .build();

      // Invoke operation
      Response<ReservedIPCollectionInstanceNetworkInterfaceContext> response = service.listInstanceNetworkInterfaceIps(listInstanceNetworkInterfaceIpsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ReservedIPCollectionInstanceNetworkInterfaceContext reservedIpCollectionInstanceNetworkInterfaceContextResult = response.getResult();
      assertNotNull(reservedIpCollectionInstanceNetworkInterfaceContextResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListInstanceNetworkInterfaceIps" })
  public void testListInstanceNetworkInterfaceIpsWithPager() throws Exception {
    try {
      ListInstanceNetworkInterfaceIpsOptions options = new ListInstanceNetworkInterfaceIpsOptions.Builder()
        .instanceId("testString")
        .networkInterfaceId("testString")
        .limit(Long.valueOf("10"))
        .build();

      // Test getNext().
      List<ReservedIP> allResults = new ArrayList<>();
      InstanceNetworkInterfaceIpsPager pager = new InstanceNetworkInterfaceIpsPager(service, options);
      while (pager.hasNext()) {
        List<ReservedIP> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new InstanceNetworkInterfaceIpsPager(service, options);
      List<ReservedIP> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListInstanceNetworkInterfaceIps" })
  public void testGetInstanceNetworkInterfaceIp() throws Exception {
    try {
      GetInstanceNetworkInterfaceIpOptions getInstanceNetworkInterfaceIpOptions = new GetInstanceNetworkInterfaceIpOptions.Builder()
        .instanceId("testString")
        .networkInterfaceId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<ReservedIP> response = service.getInstanceNetworkInterfaceIp(getInstanceNetworkInterfaceIpOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ReservedIP reservedIpResult = response.getResult();
      assertNotNull(reservedIpResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetInstanceNetworkInterfaceIp" })
  public void testListInstanceVolumeAttachments() throws Exception {
    try {
      ListInstanceVolumeAttachmentsOptions listInstanceVolumeAttachmentsOptions = new ListInstanceVolumeAttachmentsOptions.Builder()
        .instanceId("testString")
        .build();

      // Invoke operation
      Response<VolumeAttachmentCollection> response = service.listInstanceVolumeAttachments(listInstanceVolumeAttachmentsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VolumeAttachmentCollection volumeAttachmentCollectionResult = response.getResult();
      assertNotNull(volumeAttachmentCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListInstanceVolumeAttachments" })
  public void testCreateInstanceVolumeAttachment() throws Exception {
    try {
      VolumeAttachmentPrototypeVolumeVolumeIdentityVolumeIdentityById volumeAttachmentPrototypeVolumeModel = new VolumeAttachmentPrototypeVolumeVolumeIdentityVolumeIdentityById.Builder()
        .id("r006-1a6b7274-678d-4dfb-8981-c71dd9d4daa5")
        .build();

      CreateInstanceVolumeAttachmentOptions createInstanceVolumeAttachmentOptions = new CreateInstanceVolumeAttachmentOptions.Builder()
        .instanceId("testString")
        .volume(volumeAttachmentPrototypeVolumeModel)
        .deleteVolumeOnInstanceDelete(false)
        .name("my-volume-attachment")
        .build();

      // Invoke operation
      Response<VolumeAttachment> response = service.createInstanceVolumeAttachment(createInstanceVolumeAttachmentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      VolumeAttachment volumeAttachmentResult = response.getResult();
      assertNotNull(volumeAttachmentResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateInstanceVolumeAttachment" })
  public void testGetInstanceVolumeAttachment() throws Exception {
    try {
      GetInstanceVolumeAttachmentOptions getInstanceVolumeAttachmentOptions = new GetInstanceVolumeAttachmentOptions.Builder()
        .instanceId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<VolumeAttachment> response = service.getInstanceVolumeAttachment(getInstanceVolumeAttachmentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VolumeAttachment volumeAttachmentResult = response.getResult();
      assertNotNull(volumeAttachmentResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetInstanceVolumeAttachment" })
  public void testUpdateInstanceVolumeAttachment() throws Exception {
    try {
      VolumeAttachmentPatch volumeAttachmentPatchModel = new VolumeAttachmentPatch.Builder()
        .deleteVolumeOnInstanceDelete(true)
        .name("my-volume-attachment")
        .build();
      Map<String, Object> volumeAttachmentPatchModelAsPatch = volumeAttachmentPatchModel.asPatch();

      UpdateInstanceVolumeAttachmentOptions updateInstanceVolumeAttachmentOptions = new UpdateInstanceVolumeAttachmentOptions.Builder()
        .instanceId("testString")
        .id("testString")
        .volumeAttachmentPatch(volumeAttachmentPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<VolumeAttachment> response = service.updateInstanceVolumeAttachment(updateInstanceVolumeAttachmentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VolumeAttachment volumeAttachmentResult = response.getResult();
      assertNotNull(volumeAttachmentResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateInstanceVolumeAttachment" })
  public void testListInstanceGroups() throws Exception {
    try {
      ListInstanceGroupsOptions listInstanceGroupsOptions = new ListInstanceGroupsOptions.Builder()
        .start("testString")
        .limit(Long.valueOf("10"))
        .build();

      // Invoke operation
      Response<InstanceGroupCollection> response = service.listInstanceGroups(listInstanceGroupsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceGroupCollection instanceGroupCollectionResult = response.getResult();
      assertNotNull(instanceGroupCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListInstanceGroups" })
  public void testListInstanceGroupsWithPager() throws Exception {
    try {
      ListInstanceGroupsOptions options = new ListInstanceGroupsOptions.Builder()
        .limit(Long.valueOf("10"))
        .build();

      // Test getNext().
      List<InstanceGroup> allResults = new ArrayList<>();
      InstanceGroupsPager pager = new InstanceGroupsPager(service, options);
      while (pager.hasNext()) {
        List<InstanceGroup> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new InstanceGroupsPager(service, options);
      List<InstanceGroup> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListInstanceGroups" })
  public void testCreateInstanceGroup() throws Exception {
    try {
      InstanceTemplateIdentityById instanceTemplateIdentityModel = new InstanceTemplateIdentityById.Builder()
        .id("0717-e6c2c7d8-ad57-4f38-a21c-a86265b6aeb2")
        .build();

      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
        .id("0717-7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
        .build();

      LoadBalancerIdentityById loadBalancerIdentityModel = new LoadBalancerIdentityById.Builder()
        .id("r006-dd754295-e9e0-4c9d-bf6c-58fbc59e5727")
        .build();

      LoadBalancerPoolIdentityLoadBalancerPoolIdentityById loadBalancerPoolIdentityModel = new LoadBalancerPoolIdentityLoadBalancerPoolIdentityById.Builder()
        .id("r006-70294e14-4e61-11e8-bcf4-0242ac110004")
        .build();

      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
        .id("fee82deba12e4c0fb69c3b09d1f12345")
        .build();

      CreateInstanceGroupOptions createInstanceGroupOptions = new CreateInstanceGroupOptions.Builder()
        .instanceTemplate(instanceTemplateIdentityModel)
        .subnets(java.util.Arrays.asList(subnetIdentityModel))
        .applicationPort(Long.valueOf("22"))
        .loadBalancer(loadBalancerIdentityModel)
        .loadBalancerPool(loadBalancerPoolIdentityModel)
        .membershipCount(Long.valueOf("10"))
        .name("my-instance-group")
        .resourceGroup(resourceGroupIdentityModel)
        .build();

      // Invoke operation
      Response<InstanceGroup> response = service.createInstanceGroup(createInstanceGroupOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      InstanceGroup instanceGroupResult = response.getResult();
      assertNotNull(instanceGroupResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateInstanceGroup" })
  public void testGetInstanceGroup() throws Exception {
    try {
      GetInstanceGroupOptions getInstanceGroupOptions = new GetInstanceGroupOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<InstanceGroup> response = service.getInstanceGroup(getInstanceGroupOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceGroup instanceGroupResult = response.getResult();
      assertNotNull(instanceGroupResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetInstanceGroup" })
  public void testUpdateInstanceGroup() throws Exception {
    try {
      InstanceTemplateIdentityById instanceTemplateIdentityModel = new InstanceTemplateIdentityById.Builder()
        .id("0717-e6c2c7d8-ad57-4f38-a21c-a86265b6aeb2")
        .build();

      LoadBalancerIdentityById loadBalancerIdentityModel = new LoadBalancerIdentityById.Builder()
        .id("r006-dd754295-e9e0-4c9d-bf6c-58fbc59e5727")
        .build();

      LoadBalancerPoolIdentityLoadBalancerPoolIdentityById loadBalancerPoolIdentityModel = new LoadBalancerPoolIdentityLoadBalancerPoolIdentityById.Builder()
        .id("r006-70294e14-4e61-11e8-bcf4-0242ac110004")
        .build();

      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
        .id("0717-7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
        .build();

      InstanceGroupPatch instanceGroupPatchModel = new InstanceGroupPatch.Builder()
        .applicationPort(Long.valueOf("22"))
        .instanceTemplate(instanceTemplateIdentityModel)
        .loadBalancer(loadBalancerIdentityModel)
        .loadBalancerPool(loadBalancerPoolIdentityModel)
        .membershipCount(Long.valueOf("20"))
        .name("my-instance-group")
        .subnets(java.util.Arrays.asList(subnetIdentityModel))
        .build();
      Map<String, Object> instanceGroupPatchModelAsPatch = instanceGroupPatchModel.asPatch();

      UpdateInstanceGroupOptions updateInstanceGroupOptions = new UpdateInstanceGroupOptions.Builder()
        .id("testString")
        .instanceGroupPatch(instanceGroupPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<InstanceGroup> response = service.updateInstanceGroup(updateInstanceGroupOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceGroup instanceGroupResult = response.getResult();
      assertNotNull(instanceGroupResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateInstanceGroup" })
  public void testListInstanceGroupManagers() throws Exception {
    try {
      ListInstanceGroupManagersOptions listInstanceGroupManagersOptions = new ListInstanceGroupManagersOptions.Builder()
        .instanceGroupId("testString")
        .start("testString")
        .limit(Long.valueOf("10"))
        .build();

      // Invoke operation
      Response<InstanceGroupManagerCollection> response = service.listInstanceGroupManagers(listInstanceGroupManagersOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceGroupManagerCollection instanceGroupManagerCollectionResult = response.getResult();
      assertNotNull(instanceGroupManagerCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListInstanceGroupManagers" })
  public void testListInstanceGroupManagersWithPager() throws Exception {
    try {
      ListInstanceGroupManagersOptions options = new ListInstanceGroupManagersOptions.Builder()
        .instanceGroupId("testString")
        .limit(Long.valueOf("10"))
        .build();

      // Test getNext().
      List<InstanceGroupManager> allResults = new ArrayList<>();
      InstanceGroupManagersPager pager = new InstanceGroupManagersPager(service, options);
      while (pager.hasNext()) {
        List<InstanceGroupManager> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new InstanceGroupManagersPager(service, options);
      List<InstanceGroupManager> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListInstanceGroupManagers" })
  public void testCreateInstanceGroupManager() throws Exception {
    try {
      InstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype instanceGroupManagerPrototypeModel = new InstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype.Builder()
        .managementEnabled(true)
        .name("my-instance-group-manager")
        .aggregationWindow(Long.valueOf("120"))
        .cooldown(Long.valueOf("210"))
        .managerType("autoscale")
        .maxMembershipCount(Long.valueOf("10"))
        .minMembershipCount(Long.valueOf("10"))
        .build();

      CreateInstanceGroupManagerOptions createInstanceGroupManagerOptions = new CreateInstanceGroupManagerOptions.Builder()
        .instanceGroupId("testString")
        .instanceGroupManagerPrototype(instanceGroupManagerPrototypeModel)
        .build();

      // Invoke operation
      Response<InstanceGroupManager> response = service.createInstanceGroupManager(createInstanceGroupManagerOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      InstanceGroupManager instanceGroupManagerResult = response.getResult();
      assertNotNull(instanceGroupManagerResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateInstanceGroupManager" })
  public void testGetInstanceGroupManager() throws Exception {
    try {
      GetInstanceGroupManagerOptions getInstanceGroupManagerOptions = new GetInstanceGroupManagerOptions.Builder()
        .instanceGroupId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<InstanceGroupManager> response = service.getInstanceGroupManager(getInstanceGroupManagerOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceGroupManager instanceGroupManagerResult = response.getResult();
      assertNotNull(instanceGroupManagerResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetInstanceGroupManager" })
  public void testUpdateInstanceGroupManager() throws Exception {
    try {
      InstanceGroupManagerPatch instanceGroupManagerPatchModel = new InstanceGroupManagerPatch.Builder()
        .aggregationWindow(Long.valueOf("120"))
        .cooldown(Long.valueOf("210"))
        .managementEnabled(false)
        .maxMembershipCount(Long.valueOf("10"))
        .minMembershipCount(Long.valueOf("10"))
        .name("my-instance-group-manager")
        .build();
      Map<String, Object> instanceGroupManagerPatchModelAsPatch = instanceGroupManagerPatchModel.asPatch();

      UpdateInstanceGroupManagerOptions updateInstanceGroupManagerOptions = new UpdateInstanceGroupManagerOptions.Builder()
        .instanceGroupId("testString")
        .id("testString")
        .instanceGroupManagerPatch(instanceGroupManagerPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<InstanceGroupManager> response = service.updateInstanceGroupManager(updateInstanceGroupManagerOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceGroupManager instanceGroupManagerResult = response.getResult();
      assertNotNull(instanceGroupManagerResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateInstanceGroupManager" })
  public void testListInstanceGroupManagerActions() throws Exception {
    try {
      ListInstanceGroupManagerActionsOptions listInstanceGroupManagerActionsOptions = new ListInstanceGroupManagerActionsOptions.Builder()
        .instanceGroupId("testString")
        .instanceGroupManagerId("testString")
        .start("testString")
        .limit(Long.valueOf("10"))
        .build();

      // Invoke operation
      Response<InstanceGroupManagerActionsCollection> response = service.listInstanceGroupManagerActions(listInstanceGroupManagerActionsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceGroupManagerActionsCollection instanceGroupManagerActionsCollectionResult = response.getResult();
      assertNotNull(instanceGroupManagerActionsCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListInstanceGroupManagerActions" })
  public void testListInstanceGroupManagerActionsWithPager() throws Exception {
    try {
      ListInstanceGroupManagerActionsOptions options = new ListInstanceGroupManagerActionsOptions.Builder()
        .instanceGroupId("testString")
        .instanceGroupManagerId("testString")
        .limit(Long.valueOf("10"))
        .build();

      // Test getNext().
      List<InstanceGroupManagerAction> allResults = new ArrayList<>();
      InstanceGroupManagerActionsPager pager = new InstanceGroupManagerActionsPager(service, options);
      while (pager.hasNext()) {
        List<InstanceGroupManagerAction> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new InstanceGroupManagerActionsPager(service, options);
      List<InstanceGroupManagerAction> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListInstanceGroupManagerActions" })
  public void testCreateInstanceGroupManagerAction() throws Exception {
    try {
      InstanceGroupManagerScheduledActionGroupPrototype instanceGroupManagerScheduledActionGroupPrototypeModel = new InstanceGroupManagerScheduledActionGroupPrototype.Builder()
        .membershipCount(Long.valueOf("10"))
        .build();

      InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByGroup instanceGroupManagerActionPrototypeModel = new InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByGroup.Builder()
        .name("my-instance-group-manager-action")
        .runAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
        .group(instanceGroupManagerScheduledActionGroupPrototypeModel)
        .build();

      CreateInstanceGroupManagerActionOptions createInstanceGroupManagerActionOptions = new CreateInstanceGroupManagerActionOptions.Builder()
        .instanceGroupId("testString")
        .instanceGroupManagerId("testString")
        .instanceGroupManagerActionPrototype(instanceGroupManagerActionPrototypeModel)
        .build();

      // Invoke operation
      Response<InstanceGroupManagerAction> response = service.createInstanceGroupManagerAction(createInstanceGroupManagerActionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      InstanceGroupManagerAction instanceGroupManagerActionResult = response.getResult();
      assertNotNull(instanceGroupManagerActionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateInstanceGroupManagerAction" })
  public void testGetInstanceGroupManagerAction() throws Exception {
    try {
      GetInstanceGroupManagerActionOptions getInstanceGroupManagerActionOptions = new GetInstanceGroupManagerActionOptions.Builder()
        .instanceGroupId("testString")
        .instanceGroupManagerId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<InstanceGroupManagerAction> response = service.getInstanceGroupManagerAction(getInstanceGroupManagerActionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceGroupManagerAction instanceGroupManagerActionResult = response.getResult();
      assertNotNull(instanceGroupManagerActionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetInstanceGroupManagerAction" })
  public void testUpdateInstanceGroupManagerAction() throws Exception {
    try {
      InstanceGroupManagerActionGroupPatch instanceGroupManagerActionGroupPatchModel = new InstanceGroupManagerActionGroupPatch.Builder()
        .membershipCount(Long.valueOf("10"))
        .build();

      InstanceGroupManagerActionManagerPatch instanceGroupManagerActionManagerPatchModel = new InstanceGroupManagerActionManagerPatch.Builder()
        .maxMembershipCount(Long.valueOf("10"))
        .minMembershipCount(Long.valueOf("10"))
        .build();

      InstanceGroupManagerActionPatch instanceGroupManagerActionPatchModel = new InstanceGroupManagerActionPatch.Builder()
        .autoDelete(false)
        .autoDeleteTimeout(Long.valueOf("24"))
        .cronSpec("30 */2 * * 1-5")
        .group(instanceGroupManagerActionGroupPatchModel)
        .manager(instanceGroupManagerActionManagerPatchModel)
        .name("my-instance-group-manager-action")
        .runAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
        .build();
      Map<String, Object> instanceGroupManagerActionPatchModelAsPatch = instanceGroupManagerActionPatchModel.asPatch();

      UpdateInstanceGroupManagerActionOptions updateInstanceGroupManagerActionOptions = new UpdateInstanceGroupManagerActionOptions.Builder()
        .instanceGroupId("testString")
        .instanceGroupManagerId("testString")
        .id("testString")
        .instanceGroupManagerActionPatch(instanceGroupManagerActionPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<InstanceGroupManagerAction> response = service.updateInstanceGroupManagerAction(updateInstanceGroupManagerActionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceGroupManagerAction instanceGroupManagerActionResult = response.getResult();
      assertNotNull(instanceGroupManagerActionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateInstanceGroupManagerAction" })
  public void testListInstanceGroupManagerPolicies() throws Exception {
    try {
      ListInstanceGroupManagerPoliciesOptions listInstanceGroupManagerPoliciesOptions = new ListInstanceGroupManagerPoliciesOptions.Builder()
        .instanceGroupId("testString")
        .instanceGroupManagerId("testString")
        .start("testString")
        .limit(Long.valueOf("10"))
        .build();

      // Invoke operation
      Response<InstanceGroupManagerPolicyCollection> response = service.listInstanceGroupManagerPolicies(listInstanceGroupManagerPoliciesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceGroupManagerPolicyCollection instanceGroupManagerPolicyCollectionResult = response.getResult();
      assertNotNull(instanceGroupManagerPolicyCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListInstanceGroupManagerPolicies" })
  public void testListInstanceGroupManagerPoliciesWithPager() throws Exception {
    try {
      ListInstanceGroupManagerPoliciesOptions options = new ListInstanceGroupManagerPoliciesOptions.Builder()
        .instanceGroupId("testString")
        .instanceGroupManagerId("testString")
        .limit(Long.valueOf("10"))
        .build();

      // Test getNext().
      List<InstanceGroupManagerPolicy> allResults = new ArrayList<>();
      InstanceGroupManagerPoliciesPager pager = new InstanceGroupManagerPoliciesPager(service, options);
      while (pager.hasNext()) {
        List<InstanceGroupManagerPolicy> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new InstanceGroupManagerPoliciesPager(service, options);
      List<InstanceGroupManagerPolicy> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListInstanceGroupManagerPolicies" })
  public void testCreateInstanceGroupManagerPolicy() throws Exception {
    try {
      InstanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototype instanceGroupManagerPolicyPrototypeModel = new InstanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototype.Builder()
        .name("my-instance-group-manager-policy")
        .metricType("cpu")
        .metricValue(Long.valueOf("26"))
        .policyType("target")
        .build();

      CreateInstanceGroupManagerPolicyOptions createInstanceGroupManagerPolicyOptions = new CreateInstanceGroupManagerPolicyOptions.Builder()
        .instanceGroupId("testString")
        .instanceGroupManagerId("testString")
        .instanceGroupManagerPolicyPrototype(instanceGroupManagerPolicyPrototypeModel)
        .build();

      // Invoke operation
      Response<InstanceGroupManagerPolicy> response = service.createInstanceGroupManagerPolicy(createInstanceGroupManagerPolicyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      InstanceGroupManagerPolicy instanceGroupManagerPolicyResult = response.getResult();
      assertNotNull(instanceGroupManagerPolicyResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateInstanceGroupManagerPolicy" })
  public void testGetInstanceGroupManagerPolicy() throws Exception {
    try {
      GetInstanceGroupManagerPolicyOptions getInstanceGroupManagerPolicyOptions = new GetInstanceGroupManagerPolicyOptions.Builder()
        .instanceGroupId("testString")
        .instanceGroupManagerId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<InstanceGroupManagerPolicy> response = service.getInstanceGroupManagerPolicy(getInstanceGroupManagerPolicyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceGroupManagerPolicy instanceGroupManagerPolicyResult = response.getResult();
      assertNotNull(instanceGroupManagerPolicyResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetInstanceGroupManagerPolicy" })
  public void testUpdateInstanceGroupManagerPolicy() throws Exception {
    try {
      InstanceGroupManagerPolicyPatch instanceGroupManagerPolicyPatchModel = new InstanceGroupManagerPolicyPatch.Builder()
        .metricType("cpu")
        .metricValue(Long.valueOf("75"))
        .name("my-instance-group-manager-policy")
        .build();
      Map<String, Object> instanceGroupManagerPolicyPatchModelAsPatch = instanceGroupManagerPolicyPatchModel.asPatch();

      UpdateInstanceGroupManagerPolicyOptions updateInstanceGroupManagerPolicyOptions = new UpdateInstanceGroupManagerPolicyOptions.Builder()
        .instanceGroupId("testString")
        .instanceGroupManagerId("testString")
        .id("testString")
        .instanceGroupManagerPolicyPatch(instanceGroupManagerPolicyPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<InstanceGroupManagerPolicy> response = service.updateInstanceGroupManagerPolicy(updateInstanceGroupManagerPolicyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceGroupManagerPolicy instanceGroupManagerPolicyResult = response.getResult();
      assertNotNull(instanceGroupManagerPolicyResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateInstanceGroupManagerPolicy" })
  public void testListInstanceGroupMemberships() throws Exception {
    try {
      ListInstanceGroupMembershipsOptions listInstanceGroupMembershipsOptions = new ListInstanceGroupMembershipsOptions.Builder()
        .instanceGroupId("testString")
        .start("testString")
        .limit(Long.valueOf("10"))
        .build();

      // Invoke operation
      Response<InstanceGroupMembershipCollection> response = service.listInstanceGroupMemberships(listInstanceGroupMembershipsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceGroupMembershipCollection instanceGroupMembershipCollectionResult = response.getResult();
      assertNotNull(instanceGroupMembershipCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListInstanceGroupMemberships" })
  public void testListInstanceGroupMembershipsWithPager() throws Exception {
    try {
      ListInstanceGroupMembershipsOptions options = new ListInstanceGroupMembershipsOptions.Builder()
        .instanceGroupId("testString")
        .limit(Long.valueOf("10"))
        .build();

      // Test getNext().
      List<InstanceGroupMembership> allResults = new ArrayList<>();
      InstanceGroupMembershipsPager pager = new InstanceGroupMembershipsPager(service, options);
      while (pager.hasNext()) {
        List<InstanceGroupMembership> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new InstanceGroupMembershipsPager(service, options);
      List<InstanceGroupMembership> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListInstanceGroupMemberships" })
  public void testGetInstanceGroupMembership() throws Exception {
    try {
      GetInstanceGroupMembershipOptions getInstanceGroupMembershipOptions = new GetInstanceGroupMembershipOptions.Builder()
        .instanceGroupId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<InstanceGroupMembership> response = service.getInstanceGroupMembership(getInstanceGroupMembershipOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceGroupMembership instanceGroupMembershipResult = response.getResult();
      assertNotNull(instanceGroupMembershipResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetInstanceGroupMembership" })
  public void testUpdateInstanceGroupMembership() throws Exception {
    try {
      InstanceGroupMembershipPatch instanceGroupMembershipPatchModel = new InstanceGroupMembershipPatch.Builder()
        .deleteInstanceOnMembershipDelete(false)
        .name("my-instance-group-membership")
        .build();
      Map<String, Object> instanceGroupMembershipPatchModelAsPatch = instanceGroupMembershipPatchModel.asPatch();

      UpdateInstanceGroupMembershipOptions updateInstanceGroupMembershipOptions = new UpdateInstanceGroupMembershipOptions.Builder()
        .instanceGroupId("testString")
        .id("testString")
        .instanceGroupMembershipPatch(instanceGroupMembershipPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<InstanceGroupMembership> response = service.updateInstanceGroupMembership(updateInstanceGroupMembershipOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceGroupMembership instanceGroupMembershipResult = response.getResult();
      assertNotNull(instanceGroupMembershipResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateInstanceGroupMembership" })
  public void testListReservations() throws Exception {
    try {
      ListReservationsOptions listReservationsOptions = new ListReservationsOptions.Builder()
        .start("testString")
        .limit(Long.valueOf("10"))
        .name("my-name")
        .profileResourceType("testString")
        .affinityPolicy("automatic")
        .resourceGroupId("testString")
        .zoneName("us-south-1")
        .build();

      // Invoke operation
      Response<ReservationCollection> response = service.listReservations(listReservationsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ReservationCollection reservationCollectionResult = response.getResult();
      assertNotNull(reservationCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListReservations" })
  public void testListReservationsWithPager() throws Exception {
    try {
      ListReservationsOptions options = new ListReservationsOptions.Builder()
        .limit(Long.valueOf("10"))
        .name("my-name")
        .profileResourceType("testString")
        .affinityPolicy("automatic")
        .resourceGroupId("testString")
        .zoneName("us-south-1")
        .build();

      // Test getNext().
      List<Reservation> allResults = new ArrayList<>();
      ReservationsPager pager = new ReservationsPager(service, options);
      while (pager.hasNext()) {
        List<Reservation> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new ReservationsPager(service, options);
      List<Reservation> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListReservations" })
  public void testCreateReservation() throws Exception {
    try {
      ReservationCapacityPrototype reservationCapacityPrototypeModel = new ReservationCapacityPrototype.Builder()
        .total(Long.valueOf("10"))
        .build();

      ReservationCommittedUsePrototype reservationCommittedUsePrototypeModel = new ReservationCommittedUsePrototype.Builder()
        .expirationPolicy("release")
        .term("testString")
        .build();

      ReservationProfilePrototype reservationProfilePrototypeModel = new ReservationProfilePrototype.Builder()
        .name("bx2-4x16")
        .resourceType("bare_metal_server_profile")
        .build();

      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
        .name("us-south-1")
        .build();

      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
        .id("fee82deba12e4c0fb69c3b09d1f12345")
        .build();

      CreateReservationOptions createReservationOptions = new CreateReservationOptions.Builder()
        .capacity(reservationCapacityPrototypeModel)
        .committedUse(reservationCommittedUsePrototypeModel)
        .profile(reservationProfilePrototypeModel)
        .zone(zoneIdentityModel)
        .affinityPolicy("automatic")
        .name("my-reservation")
        .resourceGroup(resourceGroupIdentityModel)
        .build();

      // Invoke operation
      Response<Reservation> response = service.createReservation(createReservationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      Reservation reservationResult = response.getResult();
      assertNotNull(reservationResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateReservation" })
  public void testGetReservation() throws Exception {
    try {
      GetReservationOptions getReservationOptions = new GetReservationOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<Reservation> response = service.getReservation(getReservationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Reservation reservationResult = response.getResult();
      assertNotNull(reservationResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetReservation" })
  public void testUpdateReservation() throws Exception {
    try {
      ReservationCapacityPatch reservationCapacityPatchModel = new ReservationCapacityPatch.Builder()
        .total(Long.valueOf("10"))
        .build();

      ReservationCommittedUsePatch reservationCommittedUsePatchModel = new ReservationCommittedUsePatch.Builder()
        .expirationPolicy("release")
        .term("testString")
        .build();

      ReservationProfilePatch reservationProfilePatchModel = new ReservationProfilePatch.Builder()
        .name("bx2-4x16")
        .resourceType("bare_metal_server_profile")
        .build();

      ReservationPatch reservationPatchModel = new ReservationPatch.Builder()
        .affinityPolicy("automatic")
        .capacity(reservationCapacityPatchModel)
        .committedUse(reservationCommittedUsePatchModel)
        .name("my-reservation")
        .profile(reservationProfilePatchModel)
        .build();
      Map<String, Object> reservationPatchModelAsPatch = reservationPatchModel.asPatch();

      UpdateReservationOptions updateReservationOptions = new UpdateReservationOptions.Builder()
        .id("testString")
        .reservationPatch(reservationPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<Reservation> response = service.updateReservation(updateReservationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Reservation reservationResult = response.getResult();
      assertNotNull(reservationResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateReservation" })
  public void testActivateReservation() throws Exception {
    try {
      ActivateReservationOptions activateReservationOptions = new ActivateReservationOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.activateReservation(activateReservationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testActivateReservation" })
  public void testListDedicatedHostGroups() throws Exception {
    try {
      ListDedicatedHostGroupsOptions listDedicatedHostGroupsOptions = new ListDedicatedHostGroupsOptions.Builder()
        .start("testString")
        .limit(Long.valueOf("10"))
        .resourceGroupId("testString")
        .zoneName("us-south-1")
        .name("my-name")
        .build();

      // Invoke operation
      Response<DedicatedHostGroupCollection> response = service.listDedicatedHostGroups(listDedicatedHostGroupsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DedicatedHostGroupCollection dedicatedHostGroupCollectionResult = response.getResult();
      assertNotNull(dedicatedHostGroupCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDedicatedHostGroups" })
  public void testListDedicatedHostGroupsWithPager() throws Exception {
    try {
      ListDedicatedHostGroupsOptions options = new ListDedicatedHostGroupsOptions.Builder()
        .limit(Long.valueOf("10"))
        .resourceGroupId("testString")
        .zoneName("us-south-1")
        .name("my-name")
        .build();

      // Test getNext().
      List<DedicatedHostGroup> allResults = new ArrayList<>();
      DedicatedHostGroupsPager pager = new DedicatedHostGroupsPager(service, options);
      while (pager.hasNext()) {
        List<DedicatedHostGroup> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new DedicatedHostGroupsPager(service, options);
      List<DedicatedHostGroup> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDedicatedHostGroups" })
  public void testCreateDedicatedHostGroup() throws Exception {
    try {
      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
        .name("us-south-1")
        .build();

      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
        .id("fee82deba12e4c0fb69c3b09d1f12345")
        .build();

      CreateDedicatedHostGroupOptions createDedicatedHostGroupOptions = new CreateDedicatedHostGroupOptions.Builder()
        .xClass("mx2")
        .family("balanced")
        .zone(zoneIdentityModel)
        .name("testString")
        .resourceGroup(resourceGroupIdentityModel)
        .build();

      // Invoke operation
      Response<DedicatedHostGroup> response = service.createDedicatedHostGroup(createDedicatedHostGroupOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      DedicatedHostGroup dedicatedHostGroupResult = response.getResult();
      assertNotNull(dedicatedHostGroupResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateDedicatedHostGroup" })
  public void testGetDedicatedHostGroup() throws Exception {
    try {
      GetDedicatedHostGroupOptions getDedicatedHostGroupOptions = new GetDedicatedHostGroupOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<DedicatedHostGroup> response = service.getDedicatedHostGroup(getDedicatedHostGroupOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DedicatedHostGroup dedicatedHostGroupResult = response.getResult();
      assertNotNull(dedicatedHostGroupResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDedicatedHostGroup" })
  public void testUpdateDedicatedHostGroup() throws Exception {
    try {
      DedicatedHostGroupPatch dedicatedHostGroupPatchModel = new DedicatedHostGroupPatch.Builder()
        .name("my-dedicated-host-group-updated")
        .build();
      Map<String, Object> dedicatedHostGroupPatchModelAsPatch = dedicatedHostGroupPatchModel.asPatch();

      UpdateDedicatedHostGroupOptions updateDedicatedHostGroupOptions = new UpdateDedicatedHostGroupOptions.Builder()
        .id("testString")
        .dedicatedHostGroupPatch(dedicatedHostGroupPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<DedicatedHostGroup> response = service.updateDedicatedHostGroup(updateDedicatedHostGroupOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DedicatedHostGroup dedicatedHostGroupResult = response.getResult();
      assertNotNull(dedicatedHostGroupResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateDedicatedHostGroup" })
  public void testListDedicatedHostProfiles() throws Exception {
    try {
      ListDedicatedHostProfilesOptions listDedicatedHostProfilesOptions = new ListDedicatedHostProfilesOptions.Builder()
        .start("testString")
        .limit(Long.valueOf("10"))
        .build();

      // Invoke operation
      Response<DedicatedHostProfileCollection> response = service.listDedicatedHostProfiles(listDedicatedHostProfilesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DedicatedHostProfileCollection dedicatedHostProfileCollectionResult = response.getResult();
      assertNotNull(dedicatedHostProfileCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDedicatedHostProfiles" })
  public void testListDedicatedHostProfilesWithPager() throws Exception {
    try {
      ListDedicatedHostProfilesOptions options = new ListDedicatedHostProfilesOptions.Builder()
        .limit(Long.valueOf("10"))
        .build();

      // Test getNext().
      List<DedicatedHostProfile> allResults = new ArrayList<>();
      DedicatedHostProfilesPager pager = new DedicatedHostProfilesPager(service, options);
      while (pager.hasNext()) {
        List<DedicatedHostProfile> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new DedicatedHostProfilesPager(service, options);
      List<DedicatedHostProfile> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDedicatedHostProfiles" })
  public void testGetDedicatedHostProfile() throws Exception {
    try {
      GetDedicatedHostProfileOptions getDedicatedHostProfileOptions = new GetDedicatedHostProfileOptions.Builder()
        .name("mx2-host-152x1216")
        .build();

      // Invoke operation
      Response<DedicatedHostProfile> response = service.getDedicatedHostProfile(getDedicatedHostProfileOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DedicatedHostProfile dedicatedHostProfileResult = response.getResult();
      assertNotNull(dedicatedHostProfileResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDedicatedHostProfile" })
  public void testListDedicatedHosts() throws Exception {
    try {
      ListDedicatedHostsOptions listDedicatedHostsOptions = new ListDedicatedHostsOptions.Builder()
        .dedicatedHostGroupId("testString")
        .start("testString")
        .limit(Long.valueOf("10"))
        .resourceGroupId("testString")
        .zoneName("us-south-1")
        .name("my-name")
        .build();

      // Invoke operation
      Response<DedicatedHostCollection> response = service.listDedicatedHosts(listDedicatedHostsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DedicatedHostCollection dedicatedHostCollectionResult = response.getResult();
      assertNotNull(dedicatedHostCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDedicatedHosts" })
  public void testListDedicatedHostsWithPager() throws Exception {
    try {
      ListDedicatedHostsOptions options = new ListDedicatedHostsOptions.Builder()
        .dedicatedHostGroupId("testString")
        .limit(Long.valueOf("10"))
        .resourceGroupId("testString")
        .zoneName("us-south-1")
        .name("my-name")
        .build();

      // Test getNext().
      List<DedicatedHost> allResults = new ArrayList<>();
      DedicatedHostsPager pager = new DedicatedHostsPager(service, options);
      while (pager.hasNext()) {
        List<DedicatedHost> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new DedicatedHostsPager(service, options);
      List<DedicatedHost> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDedicatedHosts" })
  public void testCreateDedicatedHost() throws Exception {
    try {
      DedicatedHostProfileIdentityByName dedicatedHostProfileIdentityModel = new DedicatedHostProfileIdentityByName.Builder()
        .name("mx2-host-152x1216")
        .build();

      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
        .id("fee82deba12e4c0fb69c3b09d1f12345")
        .build();

      DedicatedHostGroupIdentityById dedicatedHostGroupIdentityModel = new DedicatedHostGroupIdentityById.Builder()
        .id("0717-bcc5b834-1258-4b9c-c3b4-43bc9cf5cde0")
        .build();

      DedicatedHostPrototypeDedicatedHostByGroup dedicatedHostPrototypeModel = new DedicatedHostPrototypeDedicatedHostByGroup.Builder()
        .instancePlacementEnabled(true)
        .name("my-host")
        .profile(dedicatedHostProfileIdentityModel)
        .resourceGroup(resourceGroupIdentityModel)
        .group(dedicatedHostGroupIdentityModel)
        .build();

      CreateDedicatedHostOptions createDedicatedHostOptions = new CreateDedicatedHostOptions.Builder()
        .dedicatedHostPrototype(dedicatedHostPrototypeModel)
        .build();

      // Invoke operation
      Response<DedicatedHost> response = service.createDedicatedHost(createDedicatedHostOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      DedicatedHost dedicatedHostResult = response.getResult();
      assertNotNull(dedicatedHostResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateDedicatedHost" })
  public void testListDedicatedHostDisks() throws Exception {
    try {
      ListDedicatedHostDisksOptions listDedicatedHostDisksOptions = new ListDedicatedHostDisksOptions.Builder()
        .dedicatedHostId("testString")
        .build();

      // Invoke operation
      Response<DedicatedHostDiskCollection> response = service.listDedicatedHostDisks(listDedicatedHostDisksOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DedicatedHostDiskCollection dedicatedHostDiskCollectionResult = response.getResult();
      assertNotNull(dedicatedHostDiskCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDedicatedHostDisks" })
  public void testGetDedicatedHostDisk() throws Exception {
    try {
      GetDedicatedHostDiskOptions getDedicatedHostDiskOptions = new GetDedicatedHostDiskOptions.Builder()
        .dedicatedHostId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<DedicatedHostDisk> response = service.getDedicatedHostDisk(getDedicatedHostDiskOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DedicatedHostDisk dedicatedHostDiskResult = response.getResult();
      assertNotNull(dedicatedHostDiskResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDedicatedHostDisk" })
  public void testUpdateDedicatedHostDisk() throws Exception {
    try {
      DedicatedHostDiskPatch dedicatedHostDiskPatchModel = new DedicatedHostDiskPatch.Builder()
        .name("my-dedicated-host-disk-updated")
        .build();
      Map<String, Object> dedicatedHostDiskPatchModelAsPatch = dedicatedHostDiskPatchModel.asPatch();

      UpdateDedicatedHostDiskOptions updateDedicatedHostDiskOptions = new UpdateDedicatedHostDiskOptions.Builder()
        .dedicatedHostId("testString")
        .id("testString")
        .dedicatedHostDiskPatch(dedicatedHostDiskPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<DedicatedHostDisk> response = service.updateDedicatedHostDisk(updateDedicatedHostDiskOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DedicatedHostDisk dedicatedHostDiskResult = response.getResult();
      assertNotNull(dedicatedHostDiskResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateDedicatedHostDisk" })
  public void testGetDedicatedHost() throws Exception {
    try {
      GetDedicatedHostOptions getDedicatedHostOptions = new GetDedicatedHostOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<DedicatedHost> response = service.getDedicatedHost(getDedicatedHostOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DedicatedHost dedicatedHostResult = response.getResult();
      assertNotNull(dedicatedHostResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDedicatedHost" })
  public void testUpdateDedicatedHost() throws Exception {
    try {
      DedicatedHostPatch dedicatedHostPatchModel = new DedicatedHostPatch.Builder()
        .instancePlacementEnabled(false)
        .name("my-host")
        .build();
      Map<String, Object> dedicatedHostPatchModelAsPatch = dedicatedHostPatchModel.asPatch();

      UpdateDedicatedHostOptions updateDedicatedHostOptions = new UpdateDedicatedHostOptions.Builder()
        .id("testString")
        .dedicatedHostPatch(dedicatedHostPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<DedicatedHost> response = service.updateDedicatedHost(updateDedicatedHostOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DedicatedHost dedicatedHostResult = response.getResult();
      assertNotNull(dedicatedHostResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateDedicatedHost" })
  public void testListPlacementGroups() throws Exception {
    try {
      ListPlacementGroupsOptions listPlacementGroupsOptions = new ListPlacementGroupsOptions.Builder()
        .start("testString")
        .limit(Long.valueOf("10"))
        .build();

      // Invoke operation
      Response<PlacementGroupCollection> response = service.listPlacementGroups(listPlacementGroupsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PlacementGroupCollection placementGroupCollectionResult = response.getResult();
      assertNotNull(placementGroupCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListPlacementGroups" })
  public void testListPlacementGroupsWithPager() throws Exception {
    try {
      ListPlacementGroupsOptions options = new ListPlacementGroupsOptions.Builder()
        .limit(Long.valueOf("10"))
        .build();

      // Test getNext().
      List<PlacementGroup> allResults = new ArrayList<>();
      PlacementGroupsPager pager = new PlacementGroupsPager(service, options);
      while (pager.hasNext()) {
        List<PlacementGroup> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new PlacementGroupsPager(service, options);
      List<PlacementGroup> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListPlacementGroups" })
  public void testCreatePlacementGroup() throws Exception {
    try {
      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
        .id("fee82deba12e4c0fb69c3b09d1f12345")
        .build();

      CreatePlacementGroupOptions createPlacementGroupOptions = new CreatePlacementGroupOptions.Builder()
        .strategy("host_spread")
        .name("my-placement-group")
        .resourceGroup(resourceGroupIdentityModel)
        .build();

      // Invoke operation
      Response<PlacementGroup> response = service.createPlacementGroup(createPlacementGroupOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      PlacementGroup placementGroupResult = response.getResult();
      assertNotNull(placementGroupResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreatePlacementGroup" })
  public void testGetPlacementGroup() throws Exception {
    try {
      GetPlacementGroupOptions getPlacementGroupOptions = new GetPlacementGroupOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<PlacementGroup> response = service.getPlacementGroup(getPlacementGroupOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PlacementGroup placementGroupResult = response.getResult();
      assertNotNull(placementGroupResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetPlacementGroup" })
  public void testUpdatePlacementGroup() throws Exception {
    try {
      PlacementGroupPatch placementGroupPatchModel = new PlacementGroupPatch.Builder()
        .name("my-placement-group-updated")
        .build();
      Map<String, Object> placementGroupPatchModelAsPatch = placementGroupPatchModel.asPatch();

      UpdatePlacementGroupOptions updatePlacementGroupOptions = new UpdatePlacementGroupOptions.Builder()
        .id("testString")
        .placementGroupPatch(placementGroupPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<PlacementGroup> response = service.updatePlacementGroup(updatePlacementGroupOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PlacementGroup placementGroupResult = response.getResult();
      assertNotNull(placementGroupResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdatePlacementGroup" })
  public void testListBareMetalServerProfiles() throws Exception {
    try {
      ListBareMetalServerProfilesOptions listBareMetalServerProfilesOptions = new ListBareMetalServerProfilesOptions.Builder()
        .start("testString")
        .limit(Long.valueOf("10"))
        .build();

      // Invoke operation
      Response<BareMetalServerProfileCollection> response = service.listBareMetalServerProfiles(listBareMetalServerProfilesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      BareMetalServerProfileCollection bareMetalServerProfileCollectionResult = response.getResult();
      assertNotNull(bareMetalServerProfileCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListBareMetalServerProfiles" })
  public void testListBareMetalServerProfilesWithPager() throws Exception {
    try {
      ListBareMetalServerProfilesOptions options = new ListBareMetalServerProfilesOptions.Builder()
        .limit(Long.valueOf("10"))
        .build();

      // Test getNext().
      List<BareMetalServerProfile> allResults = new ArrayList<>();
      BareMetalServerProfilesPager pager = new BareMetalServerProfilesPager(service, options);
      while (pager.hasNext()) {
        List<BareMetalServerProfile> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new BareMetalServerProfilesPager(service, options);
      List<BareMetalServerProfile> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListBareMetalServerProfiles" })
  public void testGetBareMetalServerProfile() throws Exception {
    try {
      GetBareMetalServerProfileOptions getBareMetalServerProfileOptions = new GetBareMetalServerProfileOptions.Builder()
        .name("bx2-metal-192x768")
        .build();

      // Invoke operation
      Response<BareMetalServerProfile> response = service.getBareMetalServerProfile(getBareMetalServerProfileOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      BareMetalServerProfile bareMetalServerProfileResult = response.getResult();
      assertNotNull(bareMetalServerProfileResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetBareMetalServerProfile" })
  public void testListBareMetalServers() throws Exception {
    try {
      ListBareMetalServersOptions listBareMetalServersOptions = new ListBareMetalServersOptions.Builder()
        .start("testString")
        .limit(Long.valueOf("10"))
        .resourceGroupId("testString")
        .name("my-name")
        .reservationId("testString")
        .reservationCrn("crn:v1:bluemix:public:is:us-south-1:a/aa2432b1fa4d4ace891e9b80fc104e34::reservation:0717-ba49df72-37b8-43ac-98da-f8e029de0e63")
        .reservationName("my-reservation")
        .vpcId("testString")
        .vpcCrn("crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::vpc:r006-4727d842-f94f-4a2d-824a-9bc9b02c523b")
        .vpcName("my-vpc")
        .build();

      // Invoke operation
      Response<BareMetalServerCollection> response = service.listBareMetalServers(listBareMetalServersOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      BareMetalServerCollection bareMetalServerCollectionResult = response.getResult();
      assertNotNull(bareMetalServerCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListBareMetalServers" })
  public void testListBareMetalServersWithPager() throws Exception {
    try {
      ListBareMetalServersOptions options = new ListBareMetalServersOptions.Builder()
        .limit(Long.valueOf("10"))
        .resourceGroupId("testString")
        .name("my-name")
        .reservationId("testString")
        .reservationCrn("crn:v1:bluemix:public:is:us-south-1:a/aa2432b1fa4d4ace891e9b80fc104e34::reservation:0717-ba49df72-37b8-43ac-98da-f8e029de0e63")
        .reservationName("my-reservation")
        .vpcId("testString")
        .vpcCrn("crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::vpc:r006-4727d842-f94f-4a2d-824a-9bc9b02c523b")
        .vpcName("my-vpc")
        .build();

      // Test getNext().
      List<BareMetalServer> allResults = new ArrayList<>();
      BareMetalServersPager pager = new BareMetalServersPager(service, options);
      while (pager.hasNext()) {
        List<BareMetalServer> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new BareMetalServersPager(service, options);
      List<BareMetalServer> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListBareMetalServers" })
  public void testCreateBareMetalServer() throws Exception {
    try {
      ImageIdentityById imageIdentityModel = new ImageIdentityById.Builder()
        .id("r006-72b27b5c-f4b0-48bb-b954-5becc7c1dcb8")
        .build();

      KeyIdentityById keyIdentityModel = new KeyIdentityById.Builder()
        .id("r006-82679077-ac3b-4c10-be16-63e9c21f0f45")
        .build();

      BareMetalServerInitializationPrototype bareMetalServerInitializationPrototypeModel = new BareMetalServerInitializationPrototype.Builder()
        .image(imageIdentityModel)
        .keys(java.util.Arrays.asList(keyIdentityModel))
        .userData("testString")
        .build();

      BareMetalServerProfileIdentityByName bareMetalServerProfileIdentityModel = new BareMetalServerProfileIdentityByName.Builder()
        .name("bx2-metal-192x768")
        .build();

      ReservationIdentityById reservationIdentityModel = new ReservationIdentityById.Builder()
        .id("0717-ba49df72-37b8-43ac-98da-f8e029de0e63")
        .build();

      BareMetalServerReservationAffinityPrototype bareMetalServerReservationAffinityPrototypeModel = new BareMetalServerReservationAffinityPrototype.Builder()
        .policy("automatic")
        .pool(java.util.Arrays.asList(reservationIdentityModel))
        .build();

      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
        .id("fee82deba12e4c0fb69c3b09d1f12345")
        .build();

      BareMetalServerTrustedPlatformModulePrototype bareMetalServerTrustedPlatformModulePrototypeModel = new BareMetalServerTrustedPlatformModulePrototype.Builder()
        .mode("disabled")
        .build();

      VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
        .id("r006-4727d842-f94f-4a2d-824a-9bc9b02c523b")
        .build();

      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
        .name("us-south-1")
        .build();

      VirtualNetworkInterfaceIPPrototypeReservedIPPrototypeVirtualNetworkInterfaceIPsContext virtualNetworkInterfaceIpPrototypeModel = new VirtualNetworkInterfaceIPPrototypeReservedIPPrototypeVirtualNetworkInterfaceIPsContext.Builder()
        .address("10.0.0.5")
        .autoDelete(false)
        .name("my-reserved-ip")
        .build();

      VirtualNetworkInterfacePrimaryIPPrototypeReservedIPPrototypeVirtualNetworkInterfacePrimaryIPContext virtualNetworkInterfacePrimaryIpPrototypeModel = new VirtualNetworkInterfacePrimaryIPPrototypeReservedIPPrototypeVirtualNetworkInterfacePrimaryIPContext.Builder()
        .address("10.0.0.5")
        .autoDelete(false)
        .name("my-reserved-ip")
        .build();

      SecurityGroupIdentityById securityGroupIdentityModel = new SecurityGroupIdentityById.Builder()
        .id("r006-be5df5ca-12a0-494b-907e-aa6ec2bfa271")
        .build();

      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
        .id("0717-7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
        .build();

      BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceModel = new BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext.Builder()
        .allowIpSpoofing(true)
        .autoDelete(false)
        .enableInfrastructureNat(true)
        .ips(java.util.Arrays.asList(virtualNetworkInterfaceIpPrototypeModel))
        .name("my-virtual-network-interface")
        .primaryIp(virtualNetworkInterfacePrimaryIpPrototypeModel)
        .protocolStateFilteringMode("auto")
        .resourceGroup(resourceGroupIdentityModel)
        .securityGroups(java.util.Arrays.asList(securityGroupIdentityModel))
        .subnet(subnetIdentityModel)
        .build();

      BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByPCIPrototype bareMetalServerNetworkAttachmentPrototypeModel = new BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByPCIPrototype.Builder()
        .name("my-bare-metal-server-network-attachment")
        .virtualNetworkInterface(bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceModel)
        .allowedVlans(java.util.Arrays.asList(Long.valueOf("")))
        .interfaceType("pci")
        .build();

      BareMetalServerPrimaryNetworkAttachmentPrototypeBareMetalServerPrimaryNetworkAttachmentByPCIPrototype bareMetalServerPrimaryNetworkAttachmentPrototypeModel = new BareMetalServerPrimaryNetworkAttachmentPrototypeBareMetalServerPrimaryNetworkAttachmentByPCIPrototype.Builder()
        .name("my-bare-metal-server-network-attachment")
        .virtualNetworkInterface(bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceModel)
        .allowedVlans(java.util.Arrays.asList(Long.valueOf("")))
        .interfaceType("pci")
        .build();

      BareMetalServerPrototypeBareMetalServerByNetworkAttachment bareMetalServerPrototypeModel = new BareMetalServerPrototypeBareMetalServerByNetworkAttachment.Builder()
        .bandwidth(Long.valueOf("20000"))
        .enableSecureBoot(false)
        .initialization(bareMetalServerInitializationPrototypeModel)
        .name("my-bare-metal-server")
        .profile(bareMetalServerProfileIdentityModel)
        .reservationAffinity(bareMetalServerReservationAffinityPrototypeModel)
        .resourceGroup(resourceGroupIdentityModel)
        .trustedPlatformModule(bareMetalServerTrustedPlatformModulePrototypeModel)
        .vpc(vpcIdentityModel)
        .zone(zoneIdentityModel)
        .networkAttachments(java.util.Arrays.asList(bareMetalServerNetworkAttachmentPrototypeModel))
        .primaryNetworkAttachment(bareMetalServerPrimaryNetworkAttachmentPrototypeModel)
        .build();

      CreateBareMetalServerOptions createBareMetalServerOptions = new CreateBareMetalServerOptions.Builder()
        .bareMetalServerPrototype(bareMetalServerPrototypeModel)
        .build();

      // Invoke operation
      Response<BareMetalServer> response = service.createBareMetalServer(createBareMetalServerOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      BareMetalServer bareMetalServerResult = response.getResult();
      assertNotNull(bareMetalServerResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateBareMetalServer" })
  public void testCreateBareMetalServerConsoleAccessToken() throws Exception {
    try {
      CreateBareMetalServerConsoleAccessTokenOptions createBareMetalServerConsoleAccessTokenOptions = new CreateBareMetalServerConsoleAccessTokenOptions.Builder()
        .bareMetalServerId("testString")
        .consoleType("serial")
        .force(false)
        .build();

      // Invoke operation
      Response<BareMetalServerConsoleAccessToken> response = service.createBareMetalServerConsoleAccessToken(createBareMetalServerConsoleAccessTokenOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      BareMetalServerConsoleAccessToken bareMetalServerConsoleAccessTokenResult = response.getResult();
      assertNotNull(bareMetalServerConsoleAccessTokenResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateBareMetalServerConsoleAccessToken" })
  public void testListBareMetalServerDisks() throws Exception {
    try {
      ListBareMetalServerDisksOptions listBareMetalServerDisksOptions = new ListBareMetalServerDisksOptions.Builder()
        .bareMetalServerId("testString")
        .build();

      // Invoke operation
      Response<BareMetalServerDiskCollection> response = service.listBareMetalServerDisks(listBareMetalServerDisksOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      BareMetalServerDiskCollection bareMetalServerDiskCollectionResult = response.getResult();
      assertNotNull(bareMetalServerDiskCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListBareMetalServerDisks" })
  public void testGetBareMetalServerDisk() throws Exception {
    try {
      GetBareMetalServerDiskOptions getBareMetalServerDiskOptions = new GetBareMetalServerDiskOptions.Builder()
        .bareMetalServerId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<BareMetalServerDisk> response = service.getBareMetalServerDisk(getBareMetalServerDiskOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      BareMetalServerDisk bareMetalServerDiskResult = response.getResult();
      assertNotNull(bareMetalServerDiskResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetBareMetalServerDisk" })
  public void testUpdateBareMetalServerDisk() throws Exception {
    try {
      BareMetalServerDiskPatch bareMetalServerDiskPatchModel = new BareMetalServerDiskPatch.Builder()
        .name("my-bare-metal-server-disk-updated")
        .build();
      Map<String, Object> bareMetalServerDiskPatchModelAsPatch = bareMetalServerDiskPatchModel.asPatch();

      UpdateBareMetalServerDiskOptions updateBareMetalServerDiskOptions = new UpdateBareMetalServerDiskOptions.Builder()
        .bareMetalServerId("testString")
        .id("testString")
        .bareMetalServerDiskPatch(bareMetalServerDiskPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<BareMetalServerDisk> response = service.updateBareMetalServerDisk(updateBareMetalServerDiskOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      BareMetalServerDisk bareMetalServerDiskResult = response.getResult();
      assertNotNull(bareMetalServerDiskResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateBareMetalServerDisk" })
  public void testListBareMetalServerNetworkAttachments() throws Exception {
    try {
      ListBareMetalServerNetworkAttachmentsOptions listBareMetalServerNetworkAttachmentsOptions = new ListBareMetalServerNetworkAttachmentsOptions.Builder()
        .bareMetalServerId("testString")
        .start("testString")
        .limit(Long.valueOf("10"))
        .build();

      // Invoke operation
      Response<BareMetalServerNetworkAttachmentCollection> response = service.listBareMetalServerNetworkAttachments(listBareMetalServerNetworkAttachmentsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      BareMetalServerNetworkAttachmentCollection bareMetalServerNetworkAttachmentCollectionResult = response.getResult();
      assertNotNull(bareMetalServerNetworkAttachmentCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListBareMetalServerNetworkAttachments" })
  public void testListBareMetalServerNetworkAttachmentsWithPager() throws Exception {
    try {
      ListBareMetalServerNetworkAttachmentsOptions options = new ListBareMetalServerNetworkAttachmentsOptions.Builder()
        .bareMetalServerId("testString")
        .limit(Long.valueOf("10"))
        .build();

      // Test getNext().
      List<BareMetalServerNetworkAttachment> allResults = new ArrayList<>();
      BareMetalServerNetworkAttachmentsPager pager = new BareMetalServerNetworkAttachmentsPager(service, options);
      while (pager.hasNext()) {
        List<BareMetalServerNetworkAttachment> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new BareMetalServerNetworkAttachmentsPager(service, options);
      List<BareMetalServerNetworkAttachment> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListBareMetalServerNetworkAttachments" })
  public void testCreateBareMetalServerNetworkAttachment() throws Exception {
    try {
      VirtualNetworkInterfaceIPPrototypeReservedIPPrototypeVirtualNetworkInterfaceIPsContext virtualNetworkInterfaceIpPrototypeModel = new VirtualNetworkInterfaceIPPrototypeReservedIPPrototypeVirtualNetworkInterfaceIPsContext.Builder()
        .address("10.0.0.5")
        .autoDelete(false)
        .name("my-reserved-ip")
        .build();

      VirtualNetworkInterfacePrimaryIPPrototypeReservedIPPrototypeVirtualNetworkInterfacePrimaryIPContext virtualNetworkInterfacePrimaryIpPrototypeModel = new VirtualNetworkInterfacePrimaryIPPrototypeReservedIPPrototypeVirtualNetworkInterfacePrimaryIPContext.Builder()
        .address("10.0.0.5")
        .autoDelete(false)
        .name("my-reserved-ip")
        .build();

      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
        .id("fee82deba12e4c0fb69c3b09d1f12345")
        .build();

      SecurityGroupIdentityById securityGroupIdentityModel = new SecurityGroupIdentityById.Builder()
        .id("r006-be5df5ca-12a0-494b-907e-aa6ec2bfa271")
        .build();

      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
        .id("0717-7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
        .build();

      BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceModel = new BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext.Builder()
        .allowIpSpoofing(true)
        .autoDelete(false)
        .enableInfrastructureNat(true)
        .ips(java.util.Arrays.asList(virtualNetworkInterfaceIpPrototypeModel))
        .name("my-virtual-network-interface")
        .primaryIp(virtualNetworkInterfacePrimaryIpPrototypeModel)
        .protocolStateFilteringMode("auto")
        .resourceGroup(resourceGroupIdentityModel)
        .securityGroups(java.util.Arrays.asList(securityGroupIdentityModel))
        .subnet(subnetIdentityModel)
        .build();

      BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByPCIPrototype bareMetalServerNetworkAttachmentPrototypeModel = new BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByPCIPrototype.Builder()
        .name("my-bare-metal-server-network-attachment")
        .virtualNetworkInterface(bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceModel)
        .allowedVlans(java.util.Arrays.asList(Long.valueOf("")))
        .interfaceType("pci")
        .build();

      CreateBareMetalServerNetworkAttachmentOptions createBareMetalServerNetworkAttachmentOptions = new CreateBareMetalServerNetworkAttachmentOptions.Builder()
        .bareMetalServerId("testString")
        .bareMetalServerNetworkAttachmentPrototype(bareMetalServerNetworkAttachmentPrototypeModel)
        .build();

      // Invoke operation
      Response<BareMetalServerNetworkAttachment> response = service.createBareMetalServerNetworkAttachment(createBareMetalServerNetworkAttachmentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      BareMetalServerNetworkAttachment bareMetalServerNetworkAttachmentResult = response.getResult();
      assertNotNull(bareMetalServerNetworkAttachmentResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateBareMetalServerNetworkAttachment" })
  public void testGetBareMetalServerNetworkAttachment() throws Exception {
    try {
      GetBareMetalServerNetworkAttachmentOptions getBareMetalServerNetworkAttachmentOptions = new GetBareMetalServerNetworkAttachmentOptions.Builder()
        .bareMetalServerId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<BareMetalServerNetworkAttachment> response = service.getBareMetalServerNetworkAttachment(getBareMetalServerNetworkAttachmentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      BareMetalServerNetworkAttachment bareMetalServerNetworkAttachmentResult = response.getResult();
      assertNotNull(bareMetalServerNetworkAttachmentResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetBareMetalServerNetworkAttachment" })
  public void testUpdateBareMetalServerNetworkAttachment() throws Exception {
    try {
      BareMetalServerNetworkAttachmentPatch bareMetalServerNetworkAttachmentPatchModel = new BareMetalServerNetworkAttachmentPatch.Builder()
        .allowedVlans(java.util.Arrays.asList(Long.valueOf("4")))
        .name("my-bare-metal-server-network-attachment-updated")
        .build();
      Map<String, Object> bareMetalServerNetworkAttachmentPatchModelAsPatch = bareMetalServerNetworkAttachmentPatchModel.asPatch();

      UpdateBareMetalServerNetworkAttachmentOptions updateBareMetalServerNetworkAttachmentOptions = new UpdateBareMetalServerNetworkAttachmentOptions.Builder()
        .bareMetalServerId("testString")
        .id("testString")
        .bareMetalServerNetworkAttachmentPatch(bareMetalServerNetworkAttachmentPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<BareMetalServerNetworkAttachment> response = service.updateBareMetalServerNetworkAttachment(updateBareMetalServerNetworkAttachmentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      BareMetalServerNetworkAttachment bareMetalServerNetworkAttachmentResult = response.getResult();
      assertNotNull(bareMetalServerNetworkAttachmentResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateBareMetalServerNetworkAttachment" })
  public void testListBareMetalServerNetworkInterfaces() throws Exception {
    try {
      ListBareMetalServerNetworkInterfacesOptions listBareMetalServerNetworkInterfacesOptions = new ListBareMetalServerNetworkInterfacesOptions.Builder()
        .bareMetalServerId("testString")
        .start("testString")
        .limit(Long.valueOf("10"))
        .build();

      // Invoke operation
      Response<BareMetalServerNetworkInterfaceCollection> response = service.listBareMetalServerNetworkInterfaces(listBareMetalServerNetworkInterfacesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      BareMetalServerNetworkInterfaceCollection bareMetalServerNetworkInterfaceCollectionResult = response.getResult();
      assertNotNull(bareMetalServerNetworkInterfaceCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListBareMetalServerNetworkInterfaces" })
  public void testListBareMetalServerNetworkInterfacesWithPager() throws Exception {
    try {
      ListBareMetalServerNetworkInterfacesOptions options = new ListBareMetalServerNetworkInterfacesOptions.Builder()
        .bareMetalServerId("testString")
        .limit(Long.valueOf("10"))
        .build();

      // Test getNext().
      List<BareMetalServerNetworkInterface> allResults = new ArrayList<>();
      BareMetalServerNetworkInterfacesPager pager = new BareMetalServerNetworkInterfacesPager(service, options);
      while (pager.hasNext()) {
        List<BareMetalServerNetworkInterface> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new BareMetalServerNetworkInterfacesPager(service, options);
      List<BareMetalServerNetworkInterface> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListBareMetalServerNetworkInterfaces" })
  public void testCreateBareMetalServerNetworkInterface() throws Exception {
    try {
      NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext networkInterfaceIpPrototypeModel = new NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext.Builder()
        .address("10.0.0.5")
        .autoDelete(false)
        .name("my-reserved-ip")
        .build();

      SecurityGroupIdentityById securityGroupIdentityModel = new SecurityGroupIdentityById.Builder()
        .id("r006-be5df5ca-12a0-494b-907e-aa6ec2bfa271")
        .build();

      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
        .id("0717-7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
        .build();

      BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByHiperSocketPrototype bareMetalServerNetworkInterfacePrototypeModel = new BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByHiperSocketPrototype.Builder()
        .allowIpSpoofing(true)
        .enableInfrastructureNat(true)
        .name("my-bare-metal-server-network-interface")
        .primaryIp(networkInterfaceIpPrototypeModel)
        .securityGroups(java.util.Arrays.asList(securityGroupIdentityModel))
        .subnet(subnetIdentityModel)
        .interfaceType("hipersocket")
        .build();

      CreateBareMetalServerNetworkInterfaceOptions createBareMetalServerNetworkInterfaceOptions = new CreateBareMetalServerNetworkInterfaceOptions.Builder()
        .bareMetalServerId("testString")
        .bareMetalServerNetworkInterfacePrototype(bareMetalServerNetworkInterfacePrototypeModel)
        .build();

      // Invoke operation
      Response<BareMetalServerNetworkInterface> response = service.createBareMetalServerNetworkInterface(createBareMetalServerNetworkInterfaceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      BareMetalServerNetworkInterface bareMetalServerNetworkInterfaceResult = response.getResult();
      assertNotNull(bareMetalServerNetworkInterfaceResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateBareMetalServerNetworkInterface" })
  public void testGetBareMetalServerNetworkInterface() throws Exception {
    try {
      GetBareMetalServerNetworkInterfaceOptions getBareMetalServerNetworkInterfaceOptions = new GetBareMetalServerNetworkInterfaceOptions.Builder()
        .bareMetalServerId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<BareMetalServerNetworkInterface> response = service.getBareMetalServerNetworkInterface(getBareMetalServerNetworkInterfaceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      BareMetalServerNetworkInterface bareMetalServerNetworkInterfaceResult = response.getResult();
      assertNotNull(bareMetalServerNetworkInterfaceResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetBareMetalServerNetworkInterface" })
  public void testUpdateBareMetalServerNetworkInterface() throws Exception {
    try {
      BareMetalServerNetworkInterfacePatch bareMetalServerNetworkInterfacePatchModel = new BareMetalServerNetworkInterfacePatch.Builder()
        .allowIpSpoofing(true)
        .allowedVlans(java.util.Arrays.asList(Long.valueOf("4")))
        .enableInfrastructureNat(true)
        .name("my-bare-metal-server-network-interface")
        .build();
      Map<String, Object> bareMetalServerNetworkInterfacePatchModelAsPatch = bareMetalServerNetworkInterfacePatchModel.asPatch();

      UpdateBareMetalServerNetworkInterfaceOptions updateBareMetalServerNetworkInterfaceOptions = new UpdateBareMetalServerNetworkInterfaceOptions.Builder()
        .bareMetalServerId("testString")
        .id("testString")
        .bareMetalServerNetworkInterfacePatch(bareMetalServerNetworkInterfacePatchModelAsPatch)
        .build();

      // Invoke operation
      Response<BareMetalServerNetworkInterface> response = service.updateBareMetalServerNetworkInterface(updateBareMetalServerNetworkInterfaceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      BareMetalServerNetworkInterface bareMetalServerNetworkInterfaceResult = response.getResult();
      assertNotNull(bareMetalServerNetworkInterfaceResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateBareMetalServerNetworkInterface" })
  public void testListBareMetalServerNetworkInterfaceFloatingIps() throws Exception {
    try {
      ListBareMetalServerNetworkInterfaceFloatingIpsOptions listBareMetalServerNetworkInterfaceFloatingIpsOptions = new ListBareMetalServerNetworkInterfaceFloatingIpsOptions.Builder()
        .bareMetalServerId("testString")
        .networkInterfaceId("testString")
        .build();

      // Invoke operation
      Response<FloatingIPUnpaginatedCollection> response = service.listBareMetalServerNetworkInterfaceFloatingIps(listBareMetalServerNetworkInterfaceFloatingIpsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      FloatingIPUnpaginatedCollection floatingIpUnpaginatedCollectionResult = response.getResult();
      assertNotNull(floatingIpUnpaginatedCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListBareMetalServerNetworkInterfaceFloatingIps" })
  public void testGetBareMetalServerNetworkInterfaceFloatingIp() throws Exception {
    try {
      GetBareMetalServerNetworkInterfaceFloatingIpOptions getBareMetalServerNetworkInterfaceFloatingIpOptions = new GetBareMetalServerNetworkInterfaceFloatingIpOptions.Builder()
        .bareMetalServerId("testString")
        .networkInterfaceId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<FloatingIP> response = service.getBareMetalServerNetworkInterfaceFloatingIp(getBareMetalServerNetworkInterfaceFloatingIpOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      FloatingIP floatingIpResult = response.getResult();
      assertNotNull(floatingIpResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetBareMetalServerNetworkInterfaceFloatingIp" })
  public void testAddBareMetalServerNetworkInterfaceFloatingIp() throws Exception {
    try {
      AddBareMetalServerNetworkInterfaceFloatingIpOptions addBareMetalServerNetworkInterfaceFloatingIpOptions = new AddBareMetalServerNetworkInterfaceFloatingIpOptions.Builder()
        .bareMetalServerId("testString")
        .networkInterfaceId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<FloatingIP> response = service.addBareMetalServerNetworkInterfaceFloatingIp(addBareMetalServerNetworkInterfaceFloatingIpOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      FloatingIP floatingIpResult = response.getResult();
      assertNotNull(floatingIpResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testAddBareMetalServerNetworkInterfaceFloatingIp" })
  public void testListBareMetalServerNetworkInterfaceIps() throws Exception {
    try {
      ListBareMetalServerNetworkInterfaceIpsOptions listBareMetalServerNetworkInterfaceIpsOptions = new ListBareMetalServerNetworkInterfaceIpsOptions.Builder()
        .bareMetalServerId("testString")
        .networkInterfaceId("testString")
        .build();

      // Invoke operation
      Response<ReservedIPCollectionBareMetalServerNetworkInterfaceContext> response = service.listBareMetalServerNetworkInterfaceIps(listBareMetalServerNetworkInterfaceIpsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ReservedIPCollectionBareMetalServerNetworkInterfaceContext reservedIpCollectionBareMetalServerNetworkInterfaceContextResult = response.getResult();
      assertNotNull(reservedIpCollectionBareMetalServerNetworkInterfaceContextResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListBareMetalServerNetworkInterfaceIps" })
  public void testGetBareMetalServerNetworkInterfaceIp() throws Exception {
    try {
      GetBareMetalServerNetworkInterfaceIpOptions getBareMetalServerNetworkInterfaceIpOptions = new GetBareMetalServerNetworkInterfaceIpOptions.Builder()
        .bareMetalServerId("testString")
        .networkInterfaceId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<ReservedIP> response = service.getBareMetalServerNetworkInterfaceIp(getBareMetalServerNetworkInterfaceIpOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ReservedIP reservedIpResult = response.getResult();
      assertNotNull(reservedIpResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetBareMetalServerNetworkInterfaceIp" })
  public void testGetBareMetalServer() throws Exception {
    try {
      GetBareMetalServerOptions getBareMetalServerOptions = new GetBareMetalServerOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<BareMetalServer> response = service.getBareMetalServer(getBareMetalServerOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      BareMetalServer bareMetalServerResult = response.getResult();
      assertNotNull(bareMetalServerResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetBareMetalServer" })
  public void testUpdateBareMetalServer() throws Exception {
    try {
      ReservationIdentityById reservationIdentityModel = new ReservationIdentityById.Builder()
        .id("0717-ba49df72-37b8-43ac-98da-f8e029de0e63")
        .build();

      BareMetalServerReservationAffinityPatch bareMetalServerReservationAffinityPatchModel = new BareMetalServerReservationAffinityPatch.Builder()
        .policy("automatic")
        .pool(java.util.Arrays.asList(reservationIdentityModel))
        .build();

      BareMetalServerTrustedPlatformModulePatch bareMetalServerTrustedPlatformModulePatchModel = new BareMetalServerTrustedPlatformModulePatch.Builder()
        .mode("disabled")
        .build();

      BareMetalServerPatch bareMetalServerPatchModel = new BareMetalServerPatch.Builder()
        .bandwidth(Long.valueOf("20000"))
        .enableSecureBoot(false)
        .name("my-bare-metal-server")
        .reservationAffinity(bareMetalServerReservationAffinityPatchModel)
        .trustedPlatformModule(bareMetalServerTrustedPlatformModulePatchModel)
        .build();
      Map<String, Object> bareMetalServerPatchModelAsPatch = bareMetalServerPatchModel.asPatch();

      UpdateBareMetalServerOptions updateBareMetalServerOptions = new UpdateBareMetalServerOptions.Builder()
        .id("testString")
        .bareMetalServerPatch(bareMetalServerPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<BareMetalServer> response = service.updateBareMetalServer(updateBareMetalServerOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      BareMetalServer bareMetalServerResult = response.getResult();
      assertNotNull(bareMetalServerResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateBareMetalServer" })
  public void testUpdateFirmwareForBareMetalServer() throws Exception {
    try {
      UpdateFirmwareForBareMetalServerOptions updateFirmwareForBareMetalServerOptions = new UpdateFirmwareForBareMetalServerOptions.Builder()
        .id("testString")
        .autoStart(true)
        .build();

      // Invoke operation
      Response<Void> response = service.updateFirmwareForBareMetalServer(updateFirmwareForBareMetalServerOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateFirmwareForBareMetalServer" })
  public void testGetBareMetalServerInitialization() throws Exception {
    try {
      GetBareMetalServerInitializationOptions getBareMetalServerInitializationOptions = new GetBareMetalServerInitializationOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<BareMetalServerInitialization> response = service.getBareMetalServerInitialization(getBareMetalServerInitializationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      BareMetalServerInitialization bareMetalServerInitializationResult = response.getResult();
      assertNotNull(bareMetalServerInitializationResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetBareMetalServerInitialization" })
  public void testReplaceBareMetalServerInitialization() throws Exception {
    try {
      ImageIdentityById imageIdentityModel = new ImageIdentityById.Builder()
        .id("r006-72b27b5c-f4b0-48bb-b954-5becc7c1dcb8")
        .build();

      KeyIdentityById keyIdentityModel = new KeyIdentityById.Builder()
        .id("r006-82679077-ac3b-4c10-be16-63e9c21f0f45")
        .build();

      ReplaceBareMetalServerInitializationOptions replaceBareMetalServerInitializationOptions = new ReplaceBareMetalServerInitializationOptions.Builder()
        .id("testString")
        .image(imageIdentityModel)
        .keys(java.util.Arrays.asList(keyIdentityModel))
        .userData("testString")
        .build();

      // Invoke operation
      Response<BareMetalServerInitialization> response = service.replaceBareMetalServerInitialization(replaceBareMetalServerInitializationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      BareMetalServerInitialization bareMetalServerInitializationResult = response.getResult();
      assertNotNull(bareMetalServerInitializationResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testReplaceBareMetalServerInitialization" })
  public void testRestartBareMetalServer() throws Exception {
    try {
      RestartBareMetalServerOptions restartBareMetalServerOptions = new RestartBareMetalServerOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.restartBareMetalServer(restartBareMetalServerOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testRestartBareMetalServer" })
  public void testStartBareMetalServer() throws Exception {
    try {
      StartBareMetalServerOptions startBareMetalServerOptions = new StartBareMetalServerOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.startBareMetalServer(startBareMetalServerOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testStartBareMetalServer" })
  public void testStopBareMetalServer() throws Exception {
    try {
      StopBareMetalServerOptions stopBareMetalServerOptions = new StopBareMetalServerOptions.Builder()
        .id("testString")
        .type("hard")
        .build();

      // Invoke operation
      Response<Void> response = service.stopBareMetalServer(stopBareMetalServerOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testStopBareMetalServer" })
  public void testListVolumeProfiles() throws Exception {
    try {
      ListVolumeProfilesOptions listVolumeProfilesOptions = new ListVolumeProfilesOptions.Builder()
        .start("testString")
        .limit(Long.valueOf("10"))
        .build();

      // Invoke operation
      Response<VolumeProfileCollection> response = service.listVolumeProfiles(listVolumeProfilesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VolumeProfileCollection volumeProfileCollectionResult = response.getResult();
      assertNotNull(volumeProfileCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListVolumeProfiles" })
  public void testListVolumeProfilesWithPager() throws Exception {
    try {
      ListVolumeProfilesOptions options = new ListVolumeProfilesOptions.Builder()
        .limit(Long.valueOf("10"))
        .build();

      // Test getNext().
      List<VolumeProfile> allResults = new ArrayList<>();
      VolumeProfilesPager pager = new VolumeProfilesPager(service, options);
      while (pager.hasNext()) {
        List<VolumeProfile> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new VolumeProfilesPager(service, options);
      List<VolumeProfile> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListVolumeProfiles" })
  public void testGetVolumeProfile() throws Exception {
    try {
      GetVolumeProfileOptions getVolumeProfileOptions = new GetVolumeProfileOptions.Builder()
        .name("10iops-tier")
        .build();

      // Invoke operation
      Response<VolumeProfile> response = service.getVolumeProfile(getVolumeProfileOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VolumeProfile volumeProfileResult = response.getResult();
      assertNotNull(volumeProfileResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetVolumeProfile" })
  public void testListVolumes() throws Exception {
    try {
      ListVolumesOptions listVolumesOptions = new ListVolumesOptions.Builder()
        .start("testString")
        .limit(Long.valueOf("10"))
        .attachmentState("attached")
        .encryption("provider_managed")
        .name("my-name")
        .operatingSystemFamily("Ubuntu Server")
        .operatingSystemArchitecture("amd64")
        .tag("testString")
        .zoneName("us-south-1")
        .build();

      // Invoke operation
      Response<VolumeCollection> response = service.listVolumes(listVolumesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VolumeCollection volumeCollectionResult = response.getResult();
      assertNotNull(volumeCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListVolumes" })
  public void testListVolumesWithPager() throws Exception {
    try {
      ListVolumesOptions options = new ListVolumesOptions.Builder()
        .limit(Long.valueOf("10"))
        .attachmentState("attached")
        .encryption("provider_managed")
        .name("my-name")
        .operatingSystemFamily("Ubuntu Server")
        .operatingSystemArchitecture("amd64")
        .tag("testString")
        .zoneName("us-south-1")
        .build();

      // Test getNext().
      List<Volume> allResults = new ArrayList<>();
      VolumesPager pager = new VolumesPager(service, options);
      while (pager.hasNext()) {
        List<Volume> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new VolumesPager(service, options);
      List<Volume> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListVolumes" })
  public void testCreateVolume() throws Exception {
    try {
      VolumeProfileIdentityByName volumeProfileIdentityModel = new VolumeProfileIdentityByName.Builder()
        .name("custom")
        .build();

      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
        .id("fee82deba12e4c0fb69c3b09d1f12345")
        .build();

      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
        .name("us-south-1")
        .build();

      EncryptionKeyIdentityByCRN encryptionKeyIdentityModel = new EncryptionKeyIdentityByCRN.Builder()
        .crn("crn:v1:bluemix:public:kms:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179")
        .build();

      VolumePrototypeVolumeByCapacity volumePrototypeModel = new VolumePrototypeVolumeByCapacity.Builder()
        .bandwidth(Long.valueOf("1000"))
        .iops(Long.valueOf("10000"))
        .name("my-volume")
        .profile(volumeProfileIdentityModel)
        .resourceGroup(resourceGroupIdentityModel)
        .userTags(java.util.Arrays.asList())
        .zone(zoneIdentityModel)
        .capacity(Long.valueOf("100"))
        .encryptionKey(encryptionKeyIdentityModel)
        .build();

      CreateVolumeOptions createVolumeOptions = new CreateVolumeOptions.Builder()
        .volumePrototype(volumePrototypeModel)
        .build();

      // Invoke operation
      Response<Volume> response = service.createVolume(createVolumeOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      Volume volumeResult = response.getResult();
      assertNotNull(volumeResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateVolume" })
  public void testGetVolume() throws Exception {
    try {
      GetVolumeOptions getVolumeOptions = new GetVolumeOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<Volume> response = service.getVolume(getVolumeOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Volume volumeResult = response.getResult();
      assertNotNull(volumeResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetVolume" })
  public void testUpdateVolume() throws Exception {
    try {
      VolumeProfileIdentityByName volumeProfileIdentityModel = new VolumeProfileIdentityByName.Builder()
        .name("general-purpose")
        .build();

      VolumePatch volumePatchModel = new VolumePatch.Builder()
        .bandwidth(Long.valueOf("1000"))
        .capacity(Long.valueOf("100"))
        .iops(Long.valueOf("10000"))
        .name("my-volume")
        .profile(volumeProfileIdentityModel)
        .userTags(java.util.Arrays.asList("testString"))
        .build();
      Map<String, Object> volumePatchModelAsPatch = volumePatchModel.asPatch();

      UpdateVolumeOptions updateVolumeOptions = new UpdateVolumeOptions.Builder()
        .id("testString")
        .volumePatch(volumePatchModelAsPatch)
        .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
        .build();

      // Invoke operation
      Response<Volume> response = service.updateVolume(updateVolumeOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Volume volumeResult = response.getResult();
      assertNotNull(volumeResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateVolume" })
  public void testListSnapshotConsistencyGroups() throws Exception {
    try {
      ListSnapshotConsistencyGroupsOptions listSnapshotConsistencyGroupsOptions = new ListSnapshotConsistencyGroupsOptions.Builder()
        .start("testString")
        .limit(Long.valueOf("10"))
        .resourceGroupId("testString")
        .name("my-name")
        .sort("name")
        .backupPolicyPlanId("testString")
        .build();

      // Invoke operation
      Response<SnapshotConsistencyGroupCollection> response = service.listSnapshotConsistencyGroups(listSnapshotConsistencyGroupsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SnapshotConsistencyGroupCollection snapshotConsistencyGroupCollectionResult = response.getResult();
      assertNotNull(snapshotConsistencyGroupCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListSnapshotConsistencyGroups" })
  public void testListSnapshotConsistencyGroupsWithPager() throws Exception {
    try {
      ListSnapshotConsistencyGroupsOptions options = new ListSnapshotConsistencyGroupsOptions.Builder()
        .limit(Long.valueOf("10"))
        .resourceGroupId("testString")
        .name("my-name")
        .sort("name")
        .backupPolicyPlanId("testString")
        .build();

      // Test getNext().
      List<SnapshotConsistencyGroup> allResults = new ArrayList<>();
      SnapshotConsistencyGroupsPager pager = new SnapshotConsistencyGroupsPager(service, options);
      while (pager.hasNext()) {
        List<SnapshotConsistencyGroup> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new SnapshotConsistencyGroupsPager(service, options);
      List<SnapshotConsistencyGroup> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListSnapshotConsistencyGroups" })
  public void testCreateSnapshotConsistencyGroup() throws Exception {
    try {
      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
        .id("fee82deba12e4c0fb69c3b09d1f12345")
        .build();

      VolumeIdentityById volumeIdentityModel = new VolumeIdentityById.Builder()
        .id("r006-1a6b7274-678d-4dfb-8981-c71dd9d4daa5")
        .build();

      SnapshotPrototypeSnapshotConsistencyGroupContext snapshotPrototypeSnapshotConsistencyGroupContextModel = new SnapshotPrototypeSnapshotConsistencyGroupContext.Builder()
        .name("my-snapshot")
        .sourceVolume(volumeIdentityModel)
        .userTags(java.util.Arrays.asList("testString"))
        .build();

      SnapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshots snapshotConsistencyGroupPrototypeModel = new SnapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshots.Builder()
        .deleteSnapshotsOnDelete(true)
        .name("my-snapshot-consistency-group")
        .resourceGroup(resourceGroupIdentityModel)
        .snapshots(java.util.Arrays.asList(snapshotPrototypeSnapshotConsistencyGroupContextModel))
        .build();

      CreateSnapshotConsistencyGroupOptions createSnapshotConsistencyGroupOptions = new CreateSnapshotConsistencyGroupOptions.Builder()
        .snapshotConsistencyGroupPrototype(snapshotConsistencyGroupPrototypeModel)
        .build();

      // Invoke operation
      Response<SnapshotConsistencyGroup> response = service.createSnapshotConsistencyGroup(createSnapshotConsistencyGroupOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      SnapshotConsistencyGroup snapshotConsistencyGroupResult = response.getResult();
      assertNotNull(snapshotConsistencyGroupResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateSnapshotConsistencyGroup" })
  public void testGetSnapshotConsistencyGroup() throws Exception {
    try {
      GetSnapshotConsistencyGroupOptions getSnapshotConsistencyGroupOptions = new GetSnapshotConsistencyGroupOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<SnapshotConsistencyGroup> response = service.getSnapshotConsistencyGroup(getSnapshotConsistencyGroupOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SnapshotConsistencyGroup snapshotConsistencyGroupResult = response.getResult();
      assertNotNull(snapshotConsistencyGroupResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSnapshotConsistencyGroup" })
  public void testUpdateSnapshotConsistencyGroup() throws Exception {
    try {
      SnapshotConsistencyGroupPatch snapshotConsistencyGroupPatchModel = new SnapshotConsistencyGroupPatch.Builder()
        .deleteSnapshotsOnDelete(false)
        .name("my-snapshot-consistency-group")
        .build();
      Map<String, Object> snapshotConsistencyGroupPatchModelAsPatch = snapshotConsistencyGroupPatchModel.asPatch();

      UpdateSnapshotConsistencyGroupOptions updateSnapshotConsistencyGroupOptions = new UpdateSnapshotConsistencyGroupOptions.Builder()
        .id("testString")
        .snapshotConsistencyGroupPatch(snapshotConsistencyGroupPatchModelAsPatch)
        .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
        .build();

      // Invoke operation
      Response<SnapshotConsistencyGroup> response = service.updateSnapshotConsistencyGroup(updateSnapshotConsistencyGroupOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SnapshotConsistencyGroup snapshotConsistencyGroupResult = response.getResult();
      assertNotNull(snapshotConsistencyGroupResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateSnapshotConsistencyGroup" })
  public void testListSnapshots() throws Exception {
    try {
      ListSnapshotsOptions listSnapshotsOptions = new ListSnapshotsOptions.Builder()
        .start("testString")
        .limit(Long.valueOf("10"))
        .tag("testString")
        .resourceGroupId("testString")
        .name("my-name")
        .sourceVolumeId("testString")
        .sourceVolumeCrn("crn:v1:bluemix:public:is:us-south-1:a/aa2432b1fa4d4ace891e9b80fc104e34::volume:r006-1a6b7274-678d-4dfb-8981-c71dd9d4daa5")
        .sourceImageId("testString")
        .sourceImageCrn("crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::image:r006-72b27b5c-f4b0-48bb-b954-5becc7c1dcb8")
        .sort("name")
        .backupPolicyPlanId("testString")
        .copiesId("testString")
        .copiesName("my-snapshot-copy")
        .copiesCrn("crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::snapshot:r006-f6bfa329-0e36-433f-a3bb-0df632e79263")
        .copiesRemoteRegionName("us-south")
        .sourceSnapshotId("testString")
        .sourceSnapshotRemoteRegionName("us-south")
        .sourceVolumeRemoteRegionName("us-east")
        .sourceImageRemoteRegionName("us-south")
        .clonesZoneName("us-south-1")
        .snapshotConsistencyGroupId("testString")
        .snapshotConsistencyGroupCrn("crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::snapshot-consistency-group:r006-fa329f6b-0e36-433f-a3bb-0df632e79263")
        .build();

      // Invoke operation
      Response<SnapshotCollection> response = service.listSnapshots(listSnapshotsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SnapshotCollection snapshotCollectionResult = response.getResult();
      assertNotNull(snapshotCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListSnapshots" })
  public void testListSnapshotsWithPager() throws Exception {
    try {
      ListSnapshotsOptions options = new ListSnapshotsOptions.Builder()
        .limit(Long.valueOf("10"))
        .tag("testString")
        .resourceGroupId("testString")
        .name("my-name")
        .sourceVolumeId("testString")
        .sourceVolumeCrn("crn:v1:bluemix:public:is:us-south-1:a/aa2432b1fa4d4ace891e9b80fc104e34::volume:r006-1a6b7274-678d-4dfb-8981-c71dd9d4daa5")
        .sourceImageId("testString")
        .sourceImageCrn("crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::image:r006-72b27b5c-f4b0-48bb-b954-5becc7c1dcb8")
        .sort("name")
        .backupPolicyPlanId("testString")
        .copiesId("testString")
        .copiesName("my-snapshot-copy")
        .copiesCrn("crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::snapshot:r006-f6bfa329-0e36-433f-a3bb-0df632e79263")
        .copiesRemoteRegionName("us-south")
        .sourceSnapshotId("testString")
        .sourceSnapshotRemoteRegionName("us-south")
        .sourceVolumeRemoteRegionName("us-east")
        .sourceImageRemoteRegionName("us-south")
        .clonesZoneName("us-south-1")
        .snapshotConsistencyGroupId("testString")
        .snapshotConsistencyGroupCrn("crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::snapshot-consistency-group:r006-fa329f6b-0e36-433f-a3bb-0df632e79263")
        .build();

      // Test getNext().
      List<Snapshot> allResults = new ArrayList<>();
      SnapshotsPager pager = new SnapshotsPager(service, options);
      while (pager.hasNext()) {
        List<Snapshot> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new SnapshotsPager(service, options);
      List<Snapshot> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListSnapshots" })
  public void testCreateSnapshot() throws Exception {
    try {
      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
        .name("us-south-1")
        .build();

      SnapshotClonePrototype snapshotClonePrototypeModel = new SnapshotClonePrototype.Builder()
        .zone(zoneIdentityModel)
        .build();

      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
        .id("fee82deba12e4c0fb69c3b09d1f12345")
        .build();

      VolumeIdentityById volumeIdentityModel = new VolumeIdentityById.Builder()
        .id("r006-1a6b7274-678d-4dfb-8981-c71dd9d4daa5")
        .build();

      SnapshotPrototypeSnapshotBySourceVolume snapshotPrototypeModel = new SnapshotPrototypeSnapshotBySourceVolume.Builder()
        .clones(java.util.Arrays.asList(snapshotClonePrototypeModel))
        .name("my-snapshot")
        .resourceGroup(resourceGroupIdentityModel)
        .userTags(java.util.Arrays.asList())
        .sourceVolume(volumeIdentityModel)
        .build();

      CreateSnapshotOptions createSnapshotOptions = new CreateSnapshotOptions.Builder()
        .snapshotPrototype(snapshotPrototypeModel)
        .build();

      // Invoke operation
      Response<Snapshot> response = service.createSnapshot(createSnapshotOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      Snapshot snapshotResult = response.getResult();
      assertNotNull(snapshotResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateSnapshot" })
  public void testGetSnapshot() throws Exception {
    try {
      GetSnapshotOptions getSnapshotOptions = new GetSnapshotOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<Snapshot> response = service.getSnapshot(getSnapshotOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Snapshot snapshotResult = response.getResult();
      assertNotNull(snapshotResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSnapshot" })
  public void testUpdateSnapshot() throws Exception {
    try {
      SnapshotPatch snapshotPatchModel = new SnapshotPatch.Builder()
        .name("my-snapshot-updated")
        .userTags(java.util.Arrays.asList("testString"))
        .build();
      Map<String, Object> snapshotPatchModelAsPatch = snapshotPatchModel.asPatch();

      UpdateSnapshotOptions updateSnapshotOptions = new UpdateSnapshotOptions.Builder()
        .id("testString")
        .snapshotPatch(snapshotPatchModelAsPatch)
        .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
        .build();

      // Invoke operation
      Response<Snapshot> response = service.updateSnapshot(updateSnapshotOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Snapshot snapshotResult = response.getResult();
      assertNotNull(snapshotResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateSnapshot" })
  public void testListSnapshotClones() throws Exception {
    try {
      ListSnapshotClonesOptions listSnapshotClonesOptions = new ListSnapshotClonesOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<SnapshotCloneCollection> response = service.listSnapshotClones(listSnapshotClonesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SnapshotCloneCollection snapshotCloneCollectionResult = response.getResult();
      assertNotNull(snapshotCloneCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListSnapshotClones" })
  public void testGetSnapshotClone() throws Exception {
    try {
      GetSnapshotCloneOptions getSnapshotCloneOptions = new GetSnapshotCloneOptions.Builder()
        .id("testString")
        .zoneName("us-south-1")
        .build();

      // Invoke operation
      Response<SnapshotClone> response = service.getSnapshotClone(getSnapshotCloneOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SnapshotClone snapshotCloneResult = response.getResult();
      assertNotNull(snapshotCloneResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSnapshotClone" })
  public void testCreateSnapshotClone() throws Exception {
    try {
      CreateSnapshotCloneOptions createSnapshotCloneOptions = new CreateSnapshotCloneOptions.Builder()
        .id("testString")
        .zoneName("us-south-1")
        .build();

      // Invoke operation
      Response<SnapshotClone> response = service.createSnapshotClone(createSnapshotCloneOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SnapshotClone snapshotCloneResult = response.getResult();
      assertNotNull(snapshotCloneResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateSnapshotClone" })
  public void testListShareProfiles() throws Exception {
    try {
      ListShareProfilesOptions listShareProfilesOptions = new ListShareProfilesOptions.Builder()
        .start("testString")
        .limit(Long.valueOf("10"))
        .sort("name")
        .build();

      // Invoke operation
      Response<ShareProfileCollection> response = service.listShareProfiles(listShareProfilesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ShareProfileCollection shareProfileCollectionResult = response.getResult();
      assertNotNull(shareProfileCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListShareProfiles" })
  public void testListShareProfilesWithPager() throws Exception {
    try {
      ListShareProfilesOptions options = new ListShareProfilesOptions.Builder()
        .limit(Long.valueOf("10"))
        .sort("name")
        .build();

      // Test getNext().
      List<ShareProfile> allResults = new ArrayList<>();
      ShareProfilesPager pager = new ShareProfilesPager(service, options);
      while (pager.hasNext()) {
        List<ShareProfile> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new ShareProfilesPager(service, options);
      List<ShareProfile> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListShareProfiles" })
  public void testGetShareProfile() throws Exception {
    try {
      GetShareProfileOptions getShareProfileOptions = new GetShareProfileOptions.Builder()
        .name("dp2")
        .build();

      // Invoke operation
      Response<ShareProfile> response = service.getShareProfile(getShareProfileOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ShareProfile shareProfileResult = response.getResult();
      assertNotNull(shareProfileResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetShareProfile" })
  public void testListShares() throws Exception {
    try {
      ListSharesOptions listSharesOptions = new ListSharesOptions.Builder()
        .start("testString")
        .limit(Long.valueOf("10"))
        .resourceGroupId("testString")
        .name("my-name")
        .sort("name")
        .replicationRole("none")
        .build();

      // Invoke operation
      Response<ShareCollection> response = service.listShares(listSharesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ShareCollection shareCollectionResult = response.getResult();
      assertNotNull(shareCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListShares" })
  public void testListSharesWithPager() throws Exception {
    try {
      ListSharesOptions options = new ListSharesOptions.Builder()
        .limit(Long.valueOf("10"))
        .resourceGroupId("testString")
        .name("my-name")
        .sort("name")
        .replicationRole("none")
        .build();

      // Test getNext().
      List<Share> allResults = new ArrayList<>();
      SharesPager pager = new SharesPager(service, options);
      while (pager.hasNext()) {
        List<Share> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new SharesPager(service, options);
      List<Share> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListShares" })
  public void testCreateShare() throws Exception {
    try {
      VirtualNetworkInterfaceIPPrototypeReservedIPPrototypeVirtualNetworkInterfaceIPsContext virtualNetworkInterfaceIpPrototypeModel = new VirtualNetworkInterfaceIPPrototypeReservedIPPrototypeVirtualNetworkInterfaceIPsContext.Builder()
        .address("10.0.0.5")
        .autoDelete(false)
        .name("my-reserved-ip")
        .build();

      VirtualNetworkInterfacePrimaryIPPrototypeReservedIPPrototypeVirtualNetworkInterfacePrimaryIPContext virtualNetworkInterfacePrimaryIpPrototypeModel = new VirtualNetworkInterfacePrimaryIPPrototypeReservedIPPrototypeVirtualNetworkInterfacePrimaryIPContext.Builder()
        .address("10.0.0.5")
        .autoDelete(false)
        .name("my-reserved-ip")
        .build();

      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
        .id("fee82deba12e4c0fb69c3b09d1f12345")
        .build();

      SecurityGroupIdentityById securityGroupIdentityModel = new SecurityGroupIdentityById.Builder()
        .id("r006-be5df5ca-12a0-494b-907e-aa6ec2bfa271")
        .build();

      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
        .id("0717-7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
        .build();

      ShareMountTargetVirtualNetworkInterfacePrototypeVirtualNetworkInterfacePrototypeShareMountTargetContext shareMountTargetVirtualNetworkInterfacePrototypeModel = new ShareMountTargetVirtualNetworkInterfacePrototypeVirtualNetworkInterfacePrototypeShareMountTargetContext.Builder()
        .allowIpSpoofing(true)
        .autoDelete(false)
        .enableInfrastructureNat(true)
        .ips(java.util.Arrays.asList(virtualNetworkInterfaceIpPrototypeModel))
        .name("my-virtual-network-interface")
        .primaryIp(virtualNetworkInterfacePrimaryIpPrototypeModel)
        .protocolStateFilteringMode("auto")
        .resourceGroup(resourceGroupIdentityModel)
        .securityGroups(java.util.Arrays.asList(securityGroupIdentityModel))
        .subnet(subnetIdentityModel)
        .build();

      ShareMountTargetPrototypeShareMountTargetByAccessControlModeSecurityGroup shareMountTargetPrototypeModel = new ShareMountTargetPrototypeShareMountTargetByAccessControlModeSecurityGroup.Builder()
        .name("my-share-mount-target")
        .transitEncryption("none")
        .virtualNetworkInterface(shareMountTargetVirtualNetworkInterfacePrototypeModel)
        .build();

      ShareProfileIdentityByName shareProfileIdentityModel = new ShareProfileIdentityByName.Builder()
        .name("tier-3iops")
        .build();

      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
        .name("us-south-1")
        .build();

      SharePrototypeShareContext sharePrototypeShareContextModel = new SharePrototypeShareContext.Builder()
        .allowedTransitEncryptionModes(java.util.Arrays.asList("none"))
        .iops(Long.valueOf("100"))
        .mountTargets(java.util.Arrays.asList(shareMountTargetPrototypeModel))
        .name("my-share")
        .profile(shareProfileIdentityModel)
        .replicationCronSpec("0 */5 * * *")
        .resourceGroup(resourceGroupIdentityModel)
        .userTags(java.util.Arrays.asList())
        .zone(zoneIdentityModel)
        .build();

      EncryptionKeyIdentityByCRN encryptionKeyIdentityModel = new EncryptionKeyIdentityByCRN.Builder()
        .crn("crn:v1:bluemix:public:kms:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179")
        .build();

      ShareInitialOwner shareInitialOwnerModel = new ShareInitialOwner.Builder()
        .gid(Long.valueOf("50"))
        .uid(Long.valueOf("50"))
        .build();

      SharePrototypeShareBySize sharePrototypeModel = new SharePrototypeShareBySize.Builder()
        .allowedTransitEncryptionModes(java.util.Arrays.asList("none"))
        .mountTargets(java.util.Arrays.asList(shareMountTargetPrototypeModel))
        .name("my-share")
        .replicaShare(sharePrototypeShareContextModel)
        .userTags(java.util.Arrays.asList())
        .accessControlMode("security_group")
        .encryptionKey(encryptionKeyIdentityModel)
        .initialOwner(shareInitialOwnerModel)
        .iops(Long.valueOf("100"))
        .profile(shareProfileIdentityModel)
        .resourceGroup(resourceGroupIdentityModel)
        .size(Long.valueOf("200"))
        .zone(zoneIdentityModel)
        .build();

      CreateShareOptions createShareOptions = new CreateShareOptions.Builder()
        .sharePrototype(sharePrototypeModel)
        .build();

      // Invoke operation
      Response<Share> response = service.createShare(createShareOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      Share shareResult = response.getResult();
      assertNotNull(shareResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateShare" })
  public void testGetShare() throws Exception {
    try {
      GetShareOptions getShareOptions = new GetShareOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<Share> response = service.getShare(getShareOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Share shareResult = response.getResult();
      assertNotNull(shareResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetShare" })
  public void testUpdateShare() throws Exception {
    try {
      ShareProfileIdentityByName shareProfileIdentityModel = new ShareProfileIdentityByName.Builder()
        .name("tier-3iops")
        .build();

      SharePatch sharePatchModel = new SharePatch.Builder()
        .accessControlMode("security_group")
        .allowedTransitEncryptionModes(java.util.Arrays.asList("none"))
        .iops(Long.valueOf("100"))
        .name("my-share")
        .profile(shareProfileIdentityModel)
        .replicationCronSpec("0 */5 * * *")
        .size(Long.valueOf("8000"))
        .userTags(java.util.Arrays.asList("testString"))
        .build();
      Map<String, Object> sharePatchModelAsPatch = sharePatchModel.asPatch();

      UpdateShareOptions updateShareOptions = new UpdateShareOptions.Builder()
        .id("testString")
        .sharePatch(sharePatchModelAsPatch)
        .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
        .build();

      // Invoke operation
      Response<Share> response = service.updateShare(updateShareOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Share shareResult = response.getResult();
      assertNotNull(shareResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateShare" })
  public void testListShareAccessorBindings() throws Exception {
    try {
      ListShareAccessorBindingsOptions listShareAccessorBindingsOptions = new ListShareAccessorBindingsOptions.Builder()
        .id("testString")
        .start("testString")
        .limit(Long.valueOf("10"))
        .build();

      // Invoke operation
      Response<ShareAccessorBindingCollection> response = service.listShareAccessorBindings(listShareAccessorBindingsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ShareAccessorBindingCollection shareAccessorBindingCollectionResult = response.getResult();
      assertNotNull(shareAccessorBindingCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListShareAccessorBindings" })
  public void testListShareAccessorBindingsWithPager() throws Exception {
    try {
      ListShareAccessorBindingsOptions options = new ListShareAccessorBindingsOptions.Builder()
        .id("testString")
        .limit(Long.valueOf("10"))
        .build();

      // Test getNext().
      List<ShareAccessorBinding> allResults = new ArrayList<>();
      ShareAccessorBindingsPager pager = new ShareAccessorBindingsPager(service, options);
      while (pager.hasNext()) {
        List<ShareAccessorBinding> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new ShareAccessorBindingsPager(service, options);
      List<ShareAccessorBinding> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListShareAccessorBindings" })
  public void testGetShareAccessorBinding() throws Exception {
    try {
      GetShareAccessorBindingOptions getShareAccessorBindingOptions = new GetShareAccessorBindingOptions.Builder()
        .shareId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<ShareAccessorBinding> response = service.getShareAccessorBinding(getShareAccessorBindingOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ShareAccessorBinding shareAccessorBindingResult = response.getResult();
      assertNotNull(shareAccessorBindingResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetShareAccessorBinding" })
  public void testFailoverShare() throws Exception {
    try {
      FailoverShareOptions failoverShareOptions = new FailoverShareOptions.Builder()
        .shareId("testString")
        .fallbackPolicy("fail")
        .timeout(Long.valueOf("600"))
        .build();

      // Invoke operation
      Response<Void> response = service.failoverShare(failoverShareOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testFailoverShare" })
  public void testListShareMountTargets() throws Exception {
    try {
      ListShareMountTargetsOptions listShareMountTargetsOptions = new ListShareMountTargetsOptions.Builder()
        .shareId("testString")
        .name("my-name")
        .start("testString")
        .limit(Long.valueOf("10"))
        .build();

      // Invoke operation
      Response<ShareMountTargetCollection> response = service.listShareMountTargets(listShareMountTargetsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ShareMountTargetCollection shareMountTargetCollectionResult = response.getResult();
      assertNotNull(shareMountTargetCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListShareMountTargets" })
  public void testListShareMountTargetsWithPager() throws Exception {
    try {
      ListShareMountTargetsOptions options = new ListShareMountTargetsOptions.Builder()
        .shareId("testString")
        .name("my-name")
        .limit(Long.valueOf("10"))
        .build();

      // Test getNext().
      List<ShareMountTarget> allResults = new ArrayList<>();
      ShareMountTargetsPager pager = new ShareMountTargetsPager(service, options);
      while (pager.hasNext()) {
        List<ShareMountTarget> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new ShareMountTargetsPager(service, options);
      List<ShareMountTarget> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListShareMountTargets" })
  public void testCreateShareMountTarget() throws Exception {
    try {
      VirtualNetworkInterfaceIPPrototypeReservedIPPrototypeVirtualNetworkInterfaceIPsContext virtualNetworkInterfaceIpPrototypeModel = new VirtualNetworkInterfaceIPPrototypeReservedIPPrototypeVirtualNetworkInterfaceIPsContext.Builder()
        .address("10.0.0.5")
        .autoDelete(false)
        .name("my-reserved-ip")
        .build();

      VirtualNetworkInterfacePrimaryIPPrototypeReservedIPPrototypeVirtualNetworkInterfacePrimaryIPContext virtualNetworkInterfacePrimaryIpPrototypeModel = new VirtualNetworkInterfacePrimaryIPPrototypeReservedIPPrototypeVirtualNetworkInterfacePrimaryIPContext.Builder()
        .address("10.0.0.5")
        .autoDelete(false)
        .name("my-reserved-ip")
        .build();

      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
        .id("fee82deba12e4c0fb69c3b09d1f12345")
        .build();

      SecurityGroupIdentityById securityGroupIdentityModel = new SecurityGroupIdentityById.Builder()
        .id("r006-be5df5ca-12a0-494b-907e-aa6ec2bfa271")
        .build();

      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
        .id("0717-7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
        .build();

      ShareMountTargetVirtualNetworkInterfacePrototypeVirtualNetworkInterfacePrototypeShareMountTargetContext shareMountTargetVirtualNetworkInterfacePrototypeModel = new ShareMountTargetVirtualNetworkInterfacePrototypeVirtualNetworkInterfacePrototypeShareMountTargetContext.Builder()
        .allowIpSpoofing(true)
        .autoDelete(false)
        .enableInfrastructureNat(true)
        .ips(java.util.Arrays.asList(virtualNetworkInterfaceIpPrototypeModel))
        .name("my-virtual-network-interface")
        .primaryIp(virtualNetworkInterfacePrimaryIpPrototypeModel)
        .protocolStateFilteringMode("auto")
        .resourceGroup(resourceGroupIdentityModel)
        .securityGroups(java.util.Arrays.asList(securityGroupIdentityModel))
        .subnet(subnetIdentityModel)
        .build();

      ShareMountTargetPrototypeShareMountTargetByAccessControlModeSecurityGroup shareMountTargetPrototypeModel = new ShareMountTargetPrototypeShareMountTargetByAccessControlModeSecurityGroup.Builder()
        .name("my-share-mount-target")
        .transitEncryption("none")
        .virtualNetworkInterface(shareMountTargetVirtualNetworkInterfacePrototypeModel)
        .build();

      CreateShareMountTargetOptions createShareMountTargetOptions = new CreateShareMountTargetOptions.Builder()
        .shareId("testString")
        .shareMountTargetPrototype(shareMountTargetPrototypeModel)
        .build();

      // Invoke operation
      Response<ShareMountTarget> response = service.createShareMountTarget(createShareMountTargetOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      ShareMountTarget shareMountTargetResult = response.getResult();
      assertNotNull(shareMountTargetResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateShareMountTarget" })
  public void testGetShareMountTarget() throws Exception {
    try {
      GetShareMountTargetOptions getShareMountTargetOptions = new GetShareMountTargetOptions.Builder()
        .shareId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<ShareMountTarget> response = service.getShareMountTarget(getShareMountTargetOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ShareMountTarget shareMountTargetResult = response.getResult();
      assertNotNull(shareMountTargetResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetShareMountTarget" })
  public void testUpdateShareMountTarget() throws Exception {
    try {
      ShareMountTargetPatch shareMountTargetPatchModel = new ShareMountTargetPatch.Builder()
        .name("my-share-mount-target")
        .build();
      Map<String, Object> shareMountTargetPatchModelAsPatch = shareMountTargetPatchModel.asPatch();

      UpdateShareMountTargetOptions updateShareMountTargetOptions = new UpdateShareMountTargetOptions.Builder()
        .shareId("testString")
        .id("testString")
        .shareMountTargetPatch(shareMountTargetPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<ShareMountTarget> response = service.updateShareMountTarget(updateShareMountTargetOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ShareMountTarget shareMountTargetResult = response.getResult();
      assertNotNull(shareMountTargetResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateShareMountTarget" })
  public void testListShareSnapshots() throws Exception {
    try {
      ListShareSnapshotsOptions listShareSnapshotsOptions = new ListShareSnapshotsOptions.Builder()
        .shareId("testString")
        .backupPolicyPlanId("testString")
        .name("my-name")
        .start("testString")
        .limit(Long.valueOf("10"))
        .sort("name")
        .build();

      // Invoke operation
      Response<ShareSnapshotCollection> response = service.listShareSnapshots(listShareSnapshotsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ShareSnapshotCollection shareSnapshotCollectionResult = response.getResult();
      assertNotNull(shareSnapshotCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListShareSnapshots" })
  public void testListShareSnapshotsWithPager() throws Exception {
    try {
      ListShareSnapshotsOptions options = new ListShareSnapshotsOptions.Builder()
        .shareId("testString")
        .backupPolicyPlanId("testString")
        .name("my-name")
        .limit(Long.valueOf("10"))
        .sort("name")
        .build();

      // Test getNext().
      List<ShareSnapshot> allResults = new ArrayList<>();
      ShareSnapshotsPager pager = new ShareSnapshotsPager(service, options);
      while (pager.hasNext()) {
        List<ShareSnapshot> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new ShareSnapshotsPager(service, options);
      List<ShareSnapshot> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListShareSnapshots" })
  public void testCreateShareSnapshot() throws Exception {
    try {
      CreateShareSnapshotOptions createShareSnapshotOptions = new CreateShareSnapshotOptions.Builder()
        .shareId("testString")
        .name("my-share-snapshot")
        .userTags(java.util.Arrays.asList("testString"))
        .build();

      // Invoke operation
      Response<ShareSnapshot> response = service.createShareSnapshot(createShareSnapshotOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      ShareSnapshot shareSnapshotResult = response.getResult();
      assertNotNull(shareSnapshotResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateShareSnapshot" })
  public void testGetShareSnapshot() throws Exception {
    try {
      GetShareSnapshotOptions getShareSnapshotOptions = new GetShareSnapshotOptions.Builder()
        .shareId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<ShareSnapshot> response = service.getShareSnapshot(getShareSnapshotOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ShareSnapshot shareSnapshotResult = response.getResult();
      assertNotNull(shareSnapshotResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetShareSnapshot" })
  public void testUpdateShareSnapshot() throws Exception {
    try {
      ShareSnapshotPatch shareSnapshotPatchModel = new ShareSnapshotPatch.Builder()
        .userTags(java.util.Arrays.asList("testString"))
        .build();
      Map<String, Object> shareSnapshotPatchModelAsPatch = shareSnapshotPatchModel.asPatch();

      UpdateShareSnapshotOptions updateShareSnapshotOptions = new UpdateShareSnapshotOptions.Builder()
        .shareId("testString")
        .id("testString")
        .shareSnapshotPatch(shareSnapshotPatchModelAsPatch)
        .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
        .build();

      // Invoke operation
      Response<ShareSnapshot> response = service.updateShareSnapshot(updateShareSnapshotOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ShareSnapshot shareSnapshotResult = response.getResult();
      assertNotNull(shareSnapshotResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateShareSnapshot" })
  public void testGetShareSource() throws Exception {
    try {
      GetShareSourceOptions getShareSourceOptions = new GetShareSourceOptions.Builder()
        .shareId("testString")
        .build();

      // Invoke operation
      Response<ShareReference> response = service.getShareSource(getShareSourceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ShareReference shareReferenceResult = response.getResult();
      assertNotNull(shareReferenceResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetShareSource" })
  public void testListBackupPolicies() throws Exception {
    try {
      ListBackupPoliciesOptions listBackupPoliciesOptions = new ListBackupPoliciesOptions.Builder()
        .start("testString")
        .limit(Long.valueOf("10"))
        .resourceGroupId("testString")
        .name("my-name")
        .tag("testString")
        .build();

      // Invoke operation
      Response<BackupPolicyCollection> response = service.listBackupPolicies(listBackupPoliciesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      BackupPolicyCollection backupPolicyCollectionResult = response.getResult();
      assertNotNull(backupPolicyCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListBackupPolicies" })
  public void testListBackupPoliciesWithPager() throws Exception {
    try {
      ListBackupPoliciesOptions options = new ListBackupPoliciesOptions.Builder()
        .limit(Long.valueOf("10"))
        .resourceGroupId("testString")
        .name("my-name")
        .tag("testString")
        .build();

      // Test getNext().
      List<BackupPolicy> allResults = new ArrayList<>();
      BackupPoliciesPager pager = new BackupPoliciesPager(service, options);
      while (pager.hasNext()) {
        List<BackupPolicy> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new BackupPoliciesPager(service, options);
      List<BackupPolicy> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListBackupPolicies" })
  public void testCreateBackupPolicy() throws Exception {
    try {
      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
        .name("us-south-1")
        .build();

      BackupPolicyPlanClonePolicyPrototype backupPolicyPlanClonePolicyPrototypeModel = new BackupPolicyPlanClonePolicyPrototype.Builder()
        .maxSnapshots(Long.valueOf("5"))
        .zones(java.util.Arrays.asList(zoneIdentityModel))
        .build();

      BackupPolicyPlanDeletionTriggerPrototype backupPolicyPlanDeletionTriggerPrototypeModel = new BackupPolicyPlanDeletionTriggerPrototype.Builder()
        .deleteAfter(Long.valueOf("20"))
        .deleteOverCount(Long.valueOf("20"))
        .build();

      EncryptionKeyIdentityByCRN encryptionKeyIdentityModel = new EncryptionKeyIdentityByCRN.Builder()
        .crn("crn:v1:bluemix:public:kms:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179")
        .build();

      RegionIdentityByName regionIdentityModel = new RegionIdentityByName.Builder()
        .name("us-south")
        .build();

      BackupPolicyPlanRemoteRegionPolicyPrototype backupPolicyPlanRemoteRegionPolicyPrototypeModel = new BackupPolicyPlanRemoteRegionPolicyPrototype.Builder()
        .deleteOverCount(Long.valueOf("5"))
        .encryptionKey(encryptionKeyIdentityModel)
        .region(regionIdentityModel)
        .build();

      BackupPolicyPlanPrototype backupPolicyPlanPrototypeModel = new BackupPolicyPlanPrototype.Builder()
        .active(true)
        .attachUserTags(java.util.Arrays.asList("my-daily-backup-plan"))
        .clonePolicy(backupPolicyPlanClonePolicyPrototypeModel)
        .copyUserTags(true)
        .cronSpec("30 */2 * * 1-5")
        .deletionTrigger(backupPolicyPlanDeletionTriggerPrototypeModel)
        .name("my-policy-plan")
        .remoteRegionPolicies(java.util.Arrays.asList(backupPolicyPlanRemoteRegionPolicyPrototypeModel))
        .build();

      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
        .id("fee82deba12e4c0fb69c3b09d1f12345")
        .build();

      BackupPolicyScopePrototypeEnterpriseIdentityEnterpriseIdentityByCRN backupPolicyScopePrototypeModel = new BackupPolicyScopePrototypeEnterpriseIdentityEnterpriseIdentityByCRN.Builder()
        .crn("crn:v1:bluemix:public:enterprise::a/aa2432b1fa4d4ace891e9b80fc104e34::enterprise:ebc2b430240943458b9e91e1432cfcce")
        .build();

      BackupPolicyPrototypeBackupPolicyMatchResourceTypeVolumePrototype backupPolicyPrototypeModel = new BackupPolicyPrototypeBackupPolicyMatchResourceTypeVolumePrototype.Builder()
        .matchUserTags(java.util.Arrays.asList("my-daily-backup-policy"))
        .name("my-backup-policy")
        .plans(java.util.Arrays.asList(backupPolicyPlanPrototypeModel))
        .resourceGroup(resourceGroupIdentityModel)
        .scope(backupPolicyScopePrototypeModel)
        .matchResourceType("volume")
        .build();

      CreateBackupPolicyOptions createBackupPolicyOptions = new CreateBackupPolicyOptions.Builder()
        .backupPolicyPrototype(backupPolicyPrototypeModel)
        .build();

      // Invoke operation
      Response<BackupPolicy> response = service.createBackupPolicy(createBackupPolicyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      BackupPolicy backupPolicyResult = response.getResult();
      assertNotNull(backupPolicyResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateBackupPolicy" })
  public void testListBackupPolicyJobs() throws Exception {
    try {
      ListBackupPolicyJobsOptions listBackupPolicyJobsOptions = new ListBackupPolicyJobsOptions.Builder()
        .backupPolicyId("testString")
        .status("failed")
        .backupPolicyPlanId("testString")
        .start("testString")
        .limit(Long.valueOf("10"))
        .sort("name")
        .sourceId("testString")
        .targetSnapshotsId("testString")
        .targetSnapshotsCrn("crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::snapshot:r006-f6bfa329-0e36-433f-a3bb-0df632e79263")
        .build();

      // Invoke operation
      Response<BackupPolicyJobCollection> response = service.listBackupPolicyJobs(listBackupPolicyJobsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      BackupPolicyJobCollection backupPolicyJobCollectionResult = response.getResult();
      assertNotNull(backupPolicyJobCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListBackupPolicyJobs" })
  public void testListBackupPolicyJobsWithPager() throws Exception {
    try {
      ListBackupPolicyJobsOptions options = new ListBackupPolicyJobsOptions.Builder()
        .backupPolicyId("testString")
        .status("failed")
        .backupPolicyPlanId("testString")
        .limit(Long.valueOf("10"))
        .sort("name")
        .sourceId("testString")
        .targetSnapshotsId("testString")
        .targetSnapshotsCrn("crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::snapshot:r006-f6bfa329-0e36-433f-a3bb-0df632e79263")
        .build();

      // Test getNext().
      List<BackupPolicyJob> allResults = new ArrayList<>();
      BackupPolicyJobsPager pager = new BackupPolicyJobsPager(service, options);
      while (pager.hasNext()) {
        List<BackupPolicyJob> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new BackupPolicyJobsPager(service, options);
      List<BackupPolicyJob> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListBackupPolicyJobs" })
  public void testGetBackupPolicyJob() throws Exception {
    try {
      GetBackupPolicyJobOptions getBackupPolicyJobOptions = new GetBackupPolicyJobOptions.Builder()
        .backupPolicyId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<BackupPolicyJob> response = service.getBackupPolicyJob(getBackupPolicyJobOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      BackupPolicyJob backupPolicyJobResult = response.getResult();
      assertNotNull(backupPolicyJobResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetBackupPolicyJob" })
  public void testListBackupPolicyPlans() throws Exception {
    try {
      ListBackupPolicyPlansOptions listBackupPolicyPlansOptions = new ListBackupPolicyPlansOptions.Builder()
        .backupPolicyId("testString")
        .name("my-name")
        .build();

      // Invoke operation
      Response<BackupPolicyPlanCollection> response = service.listBackupPolicyPlans(listBackupPolicyPlansOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      BackupPolicyPlanCollection backupPolicyPlanCollectionResult = response.getResult();
      assertNotNull(backupPolicyPlanCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListBackupPolicyPlans" })
  public void testCreateBackupPolicyPlan() throws Exception {
    try {
      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
        .name("us-south-1")
        .build();

      BackupPolicyPlanClonePolicyPrototype backupPolicyPlanClonePolicyPrototypeModel = new BackupPolicyPlanClonePolicyPrototype.Builder()
        .maxSnapshots(Long.valueOf("5"))
        .zones(java.util.Arrays.asList(zoneIdentityModel))
        .build();

      BackupPolicyPlanDeletionTriggerPrototype backupPolicyPlanDeletionTriggerPrototypeModel = new BackupPolicyPlanDeletionTriggerPrototype.Builder()
        .deleteAfter(Long.valueOf("20"))
        .deleteOverCount(Long.valueOf("20"))
        .build();

      EncryptionKeyIdentityByCRN encryptionKeyIdentityModel = new EncryptionKeyIdentityByCRN.Builder()
        .crn("crn:v1:bluemix:public:kms:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179")
        .build();

      RegionIdentityByName regionIdentityModel = new RegionIdentityByName.Builder()
        .name("us-south")
        .build();

      BackupPolicyPlanRemoteRegionPolicyPrototype backupPolicyPlanRemoteRegionPolicyPrototypeModel = new BackupPolicyPlanRemoteRegionPolicyPrototype.Builder()
        .deleteOverCount(Long.valueOf("5"))
        .encryptionKey(encryptionKeyIdentityModel)
        .region(regionIdentityModel)
        .build();

      CreateBackupPolicyPlanOptions createBackupPolicyPlanOptions = new CreateBackupPolicyPlanOptions.Builder()
        .backupPolicyId("testString")
        .cronSpec("30 */2 * * 1-5")
        .active(true)
        .attachUserTags(java.util.Arrays.asList("my-daily-backup-plan"))
        .clonePolicy(backupPolicyPlanClonePolicyPrototypeModel)
        .copyUserTags(true)
        .deletionTrigger(backupPolicyPlanDeletionTriggerPrototypeModel)
        .name("my-policy-plan")
        .remoteRegionPolicies(java.util.Arrays.asList(backupPolicyPlanRemoteRegionPolicyPrototypeModel))
        .build();

      // Invoke operation
      Response<BackupPolicyPlan> response = service.createBackupPolicyPlan(createBackupPolicyPlanOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      BackupPolicyPlan backupPolicyPlanResult = response.getResult();
      assertNotNull(backupPolicyPlanResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateBackupPolicyPlan" })
  public void testGetBackupPolicyPlan() throws Exception {
    try {
      GetBackupPolicyPlanOptions getBackupPolicyPlanOptions = new GetBackupPolicyPlanOptions.Builder()
        .backupPolicyId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<BackupPolicyPlan> response = service.getBackupPolicyPlan(getBackupPolicyPlanOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      BackupPolicyPlan backupPolicyPlanResult = response.getResult();
      assertNotNull(backupPolicyPlanResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetBackupPolicyPlan" })
  public void testUpdateBackupPolicyPlan() throws Exception {
    try {
      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
        .name("us-south-1")
        .build();

      BackupPolicyPlanClonePolicyPatch backupPolicyPlanClonePolicyPatchModel = new BackupPolicyPlanClonePolicyPatch.Builder()
        .maxSnapshots(Long.valueOf("1"))
        .zones(java.util.Arrays.asList(zoneIdentityModel))
        .build();

      BackupPolicyPlanDeletionTriggerPatch backupPolicyPlanDeletionTriggerPatchModel = new BackupPolicyPlanDeletionTriggerPatch.Builder()
        .deleteAfter(Long.valueOf("20"))
        .deleteOverCount(Long.valueOf("1"))
        .build();

      EncryptionKeyIdentityByCRN encryptionKeyIdentityModel = new EncryptionKeyIdentityByCRN.Builder()
        .crn("crn:v1:bluemix:public:kms:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179")
        .build();

      RegionIdentityByName regionIdentityModel = new RegionIdentityByName.Builder()
        .name("us-south")
        .build();

      BackupPolicyPlanRemoteRegionPolicyPrototype backupPolicyPlanRemoteRegionPolicyPrototypeModel = new BackupPolicyPlanRemoteRegionPolicyPrototype.Builder()
        .deleteOverCount(Long.valueOf("5"))
        .encryptionKey(encryptionKeyIdentityModel)
        .region(regionIdentityModel)
        .build();

      BackupPolicyPlanPatch backupPolicyPlanPatchModel = new BackupPolicyPlanPatch.Builder()
        .active(true)
        .attachUserTags(java.util.Arrays.asList("my-daily-backup-plan"))
        .clonePolicy(backupPolicyPlanClonePolicyPatchModel)
        .copyUserTags(false)
        .cronSpec("30 */2 * * 1-5")
        .deletionTrigger(backupPolicyPlanDeletionTriggerPatchModel)
        .name("my-policy-plan")
        .remoteRegionPolicies(java.util.Arrays.asList(backupPolicyPlanRemoteRegionPolicyPrototypeModel))
        .build();
      Map<String, Object> backupPolicyPlanPatchModelAsPatch = backupPolicyPlanPatchModel.asPatch();

      UpdateBackupPolicyPlanOptions updateBackupPolicyPlanOptions = new UpdateBackupPolicyPlanOptions.Builder()
        .backupPolicyId("testString")
        .id("testString")
        .backupPolicyPlanPatch(backupPolicyPlanPatchModelAsPatch)
        .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
        .build();

      // Invoke operation
      Response<BackupPolicyPlan> response = service.updateBackupPolicyPlan(updateBackupPolicyPlanOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      BackupPolicyPlan backupPolicyPlanResult = response.getResult();
      assertNotNull(backupPolicyPlanResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateBackupPolicyPlan" })
  public void testGetBackupPolicy() throws Exception {
    try {
      GetBackupPolicyOptions getBackupPolicyOptions = new GetBackupPolicyOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<BackupPolicy> response = service.getBackupPolicy(getBackupPolicyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      BackupPolicy backupPolicyResult = response.getResult();
      assertNotNull(backupPolicyResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetBackupPolicy" })
  public void testUpdateBackupPolicy() throws Exception {
    try {
      BackupPolicyPatch backupPolicyPatchModel = new BackupPolicyPatch.Builder()
        .includedContent(java.util.Arrays.asList("data_volumes"))
        .matchUserTags(java.util.Arrays.asList("my-tag-1", "my-tag-2", "my-tag-3"))
        .name("my-backup-policy")
        .build();
      Map<String, Object> backupPolicyPatchModelAsPatch = backupPolicyPatchModel.asPatch();

      UpdateBackupPolicyOptions updateBackupPolicyOptions = new UpdateBackupPolicyOptions.Builder()
        .id("testString")
        .backupPolicyPatch(backupPolicyPatchModelAsPatch)
        .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
        .build();

      // Invoke operation
      Response<BackupPolicy> response = service.updateBackupPolicy(updateBackupPolicyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      BackupPolicy backupPolicyResult = response.getResult();
      assertNotNull(backupPolicyResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateBackupPolicy" })
  public void testListRegions() throws Exception {
    try {
      ListRegionsOptions listRegionsOptions = new ListRegionsOptions();

      // Invoke operation
      Response<RegionCollection> response = service.listRegions(listRegionsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      RegionCollection regionCollectionResult = response.getResult();
      assertNotNull(regionCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListRegions" })
  public void testGetRegion() throws Exception {
    try {
      GetRegionOptions getRegionOptions = new GetRegionOptions.Builder()
        .name("us-south")
        .build();

      // Invoke operation
      Response<Region> response = service.getRegion(getRegionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Region regionResult = response.getResult();
      assertNotNull(regionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetRegion" })
  public void testListRegionZones() throws Exception {
    try {
      ListRegionZonesOptions listRegionZonesOptions = new ListRegionZonesOptions.Builder()
        .regionName("us-south")
        .build();

      // Invoke operation
      Response<ZoneCollection> response = service.listRegionZones(listRegionZonesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ZoneCollection zoneCollectionResult = response.getResult();
      assertNotNull(zoneCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListRegionZones" })
  public void testGetRegionZone() throws Exception {
    try {
      GetRegionZoneOptions getRegionZoneOptions = new GetRegionZoneOptions.Builder()
        .regionName("us-south")
        .name("us-south-1")
        .build();

      // Invoke operation
      Response<Zone> response = service.getRegionZone(getRegionZoneOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Zone zoneResult = response.getResult();
      assertNotNull(zoneResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetRegionZone" })
  public void testListVirtualNetworkInterfaces() throws Exception {
    try {
      ListVirtualNetworkInterfacesOptions listVirtualNetworkInterfacesOptions = new ListVirtualNetworkInterfacesOptions.Builder()
        .start("testString")
        .limit(Long.valueOf("10"))
        .resourceGroupId("testString")
        .build();

      // Invoke operation
      Response<VirtualNetworkInterfaceCollection> response = service.listVirtualNetworkInterfaces(listVirtualNetworkInterfacesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VirtualNetworkInterfaceCollection virtualNetworkInterfaceCollectionResult = response.getResult();
      assertNotNull(virtualNetworkInterfaceCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListVirtualNetworkInterfaces" })
  public void testListVirtualNetworkInterfacesWithPager() throws Exception {
    try {
      ListVirtualNetworkInterfacesOptions options = new ListVirtualNetworkInterfacesOptions.Builder()
        .limit(Long.valueOf("10"))
        .resourceGroupId("testString")
        .build();

      // Test getNext().
      List<VirtualNetworkInterface> allResults = new ArrayList<>();
      VirtualNetworkInterfacesPager pager = new VirtualNetworkInterfacesPager(service, options);
      while (pager.hasNext()) {
        List<VirtualNetworkInterface> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new VirtualNetworkInterfacesPager(service, options);
      List<VirtualNetworkInterface> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListVirtualNetworkInterfaces" })
  public void testCreateVirtualNetworkInterface() throws Exception {
    try {
      VirtualNetworkInterfaceIPPrototypeReservedIPIdentityVirtualNetworkInterfaceIPsContextById virtualNetworkInterfaceIpPrototypeModel = new VirtualNetworkInterfaceIPPrototypeReservedIPIdentityVirtualNetworkInterfaceIPsContextById.Builder()
        .id("0717-6d353a0f-aeb1-4ae1-832e-1110d10981bb")
        .build();

      VirtualNetworkInterfacePrimaryIPPrototypeReservedIPIdentityVirtualNetworkInterfacePrimaryIPContextById virtualNetworkInterfacePrimaryIpPrototypeModel = new VirtualNetworkInterfacePrimaryIPPrototypeReservedIPIdentityVirtualNetworkInterfacePrimaryIPContextById.Builder()
        .id("0717-6d353a0f-aeb1-4ae1-832e-1110d10981bb")
        .build();

      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
        .id("fee82deba12e4c0fb69c3b09d1f12345")
        .build();

      SecurityGroupIdentityById securityGroupIdentityModel = new SecurityGroupIdentityById.Builder()
        .id("r006-be5df5ca-12a0-494b-907e-aa6ec2bfa271")
        .build();

      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
        .id("69e55145-cc7d-4d8e-9e1f-cc3fb60b1793")
        .build();

      CreateVirtualNetworkInterfaceOptions createVirtualNetworkInterfaceOptions = new CreateVirtualNetworkInterfaceOptions.Builder()
        .allowIpSpoofing(false)
        .autoDelete(false)
        .enableInfrastructureNat(true)
        .ips(java.util.Arrays.asList(virtualNetworkInterfaceIpPrototypeModel))
        .name("my-virtual-network-interface")
        .primaryIp(virtualNetworkInterfacePrimaryIpPrototypeModel)
        .protocolStateFilteringMode("auto")
        .resourceGroup(resourceGroupIdentityModel)
        .securityGroups(java.util.Arrays.asList(securityGroupIdentityModel))
        .subnet(subnetIdentityModel)
        .build();

      // Invoke operation
      Response<VirtualNetworkInterface> response = service.createVirtualNetworkInterface(createVirtualNetworkInterfaceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      VirtualNetworkInterface virtualNetworkInterfaceResult = response.getResult();
      assertNotNull(virtualNetworkInterfaceResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateVirtualNetworkInterface" })
  public void testGetVirtualNetworkInterface() throws Exception {
    try {
      GetVirtualNetworkInterfaceOptions getVirtualNetworkInterfaceOptions = new GetVirtualNetworkInterfaceOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<VirtualNetworkInterface> response = service.getVirtualNetworkInterface(getVirtualNetworkInterfaceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VirtualNetworkInterface virtualNetworkInterfaceResult = response.getResult();
      assertNotNull(virtualNetworkInterfaceResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetVirtualNetworkInterface" })
  public void testUpdateVirtualNetworkInterface() throws Exception {
    try {
      VirtualNetworkInterfacePatch virtualNetworkInterfacePatchModel = new VirtualNetworkInterfacePatch.Builder()
        .allowIpSpoofing(true)
        .autoDelete(false)
        .enableInfrastructureNat(true)
        .name("my-virtual-network-interface")
        .protocolStateFilteringMode("auto")
        .build();
      Map<String, Object> virtualNetworkInterfacePatchModelAsPatch = virtualNetworkInterfacePatchModel.asPatch();

      UpdateVirtualNetworkInterfaceOptions updateVirtualNetworkInterfaceOptions = new UpdateVirtualNetworkInterfaceOptions.Builder()
        .id("testString")
        .virtualNetworkInterfacePatch(virtualNetworkInterfacePatchModelAsPatch)
        .build();

      // Invoke operation
      Response<VirtualNetworkInterface> response = service.updateVirtualNetworkInterface(updateVirtualNetworkInterfaceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VirtualNetworkInterface virtualNetworkInterfaceResult = response.getResult();
      assertNotNull(virtualNetworkInterfaceResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateVirtualNetworkInterface" })
  public void testListNetworkInterfaceFloatingIps() throws Exception {
    try {
      ListNetworkInterfaceFloatingIpsOptions listNetworkInterfaceFloatingIpsOptions = new ListNetworkInterfaceFloatingIpsOptions.Builder()
        .virtualNetworkInterfaceId("testString")
        .start("testString")
        .limit(Long.valueOf("10"))
        .sort("name")
        .build();

      // Invoke operation
      Response<FloatingIPCollectionVirtualNetworkInterfaceContext> response = service.listNetworkInterfaceFloatingIps(listNetworkInterfaceFloatingIpsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      FloatingIPCollectionVirtualNetworkInterfaceContext floatingIpCollectionVirtualNetworkInterfaceContextResult = response.getResult();
      assertNotNull(floatingIpCollectionVirtualNetworkInterfaceContextResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListNetworkInterfaceFloatingIps" })
  public void testListNetworkInterfaceFloatingIpsWithPager() throws Exception {
    try {
      ListNetworkInterfaceFloatingIpsOptions options = new ListNetworkInterfaceFloatingIpsOptions.Builder()
        .virtualNetworkInterfaceId("testString")
        .limit(Long.valueOf("10"))
        .sort("name")
        .build();

      // Test getNext().
      List<FloatingIPReference> allResults = new ArrayList<>();
      NetworkInterfaceFloatingIpsPager pager = new NetworkInterfaceFloatingIpsPager(service, options);
      while (pager.hasNext()) {
        List<FloatingIPReference> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new NetworkInterfaceFloatingIpsPager(service, options);
      List<FloatingIPReference> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListNetworkInterfaceFloatingIps" })
  public void testGetNetworkInterfaceFloatingIp() throws Exception {
    try {
      GetNetworkInterfaceFloatingIpOptions getNetworkInterfaceFloatingIpOptions = new GetNetworkInterfaceFloatingIpOptions.Builder()
        .virtualNetworkInterfaceId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<FloatingIPReference> response = service.getNetworkInterfaceFloatingIp(getNetworkInterfaceFloatingIpOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      FloatingIPReference floatingIpReferenceResult = response.getResult();
      assertNotNull(floatingIpReferenceResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetNetworkInterfaceFloatingIp" })
  public void testAddNetworkInterfaceFloatingIp() throws Exception {
    try {
      AddNetworkInterfaceFloatingIpOptions addNetworkInterfaceFloatingIpOptions = new AddNetworkInterfaceFloatingIpOptions.Builder()
        .virtualNetworkInterfaceId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<FloatingIPReference> response = service.addNetworkInterfaceFloatingIp(addNetworkInterfaceFloatingIpOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      FloatingIPReference floatingIpReferenceResult = response.getResult();
      assertNotNull(floatingIpReferenceResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testAddNetworkInterfaceFloatingIp" })
  public void testListVirtualNetworkInterfaceIps() throws Exception {
    try {
      ListVirtualNetworkInterfaceIpsOptions listVirtualNetworkInterfaceIpsOptions = new ListVirtualNetworkInterfaceIpsOptions.Builder()
        .virtualNetworkInterfaceId("testString")
        .start("testString")
        .limit(Long.valueOf("10"))
        .sort("name")
        .build();

      // Invoke operation
      Response<ReservedIPCollectionVirtualNetworkInterfaceContext> response = service.listVirtualNetworkInterfaceIps(listVirtualNetworkInterfaceIpsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ReservedIPCollectionVirtualNetworkInterfaceContext reservedIpCollectionVirtualNetworkInterfaceContextResult = response.getResult();
      assertNotNull(reservedIpCollectionVirtualNetworkInterfaceContextResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListVirtualNetworkInterfaceIps" })
  public void testListVirtualNetworkInterfaceIpsWithPager() throws Exception {
    try {
      ListVirtualNetworkInterfaceIpsOptions options = new ListVirtualNetworkInterfaceIpsOptions.Builder()
        .virtualNetworkInterfaceId("testString")
        .limit(Long.valueOf("10"))
        .sort("name")
        .build();

      // Test getNext().
      List<ReservedIPReference> allResults = new ArrayList<>();
      VirtualNetworkInterfaceIpsPager pager = new VirtualNetworkInterfaceIpsPager(service, options);
      while (pager.hasNext()) {
        List<ReservedIPReference> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new VirtualNetworkInterfaceIpsPager(service, options);
      List<ReservedIPReference> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListVirtualNetworkInterfaceIps" })
  public void testGetVirtualNetworkInterfaceIp() throws Exception {
    try {
      GetVirtualNetworkInterfaceIpOptions getVirtualNetworkInterfaceIpOptions = new GetVirtualNetworkInterfaceIpOptions.Builder()
        .virtualNetworkInterfaceId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<ReservedIPReference> response = service.getVirtualNetworkInterfaceIp(getVirtualNetworkInterfaceIpOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ReservedIPReference reservedIpReferenceResult = response.getResult();
      assertNotNull(reservedIpReferenceResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetVirtualNetworkInterfaceIp" })
  public void testAddVirtualNetworkInterfaceIp() throws Exception {
    try {
      AddVirtualNetworkInterfaceIpOptions addVirtualNetworkInterfaceIpOptions = new AddVirtualNetworkInterfaceIpOptions.Builder()
        .virtualNetworkInterfaceId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<ReservedIPReference> response = service.addVirtualNetworkInterfaceIp(addVirtualNetworkInterfaceIpOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ReservedIPReference reservedIpReferenceResult = response.getResult();
      assertNotNull(reservedIpReferenceResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testAddVirtualNetworkInterfaceIp" })
  public void testListClusterNetworkProfiles() throws Exception {
    try {
      ListClusterNetworkProfilesOptions listClusterNetworkProfilesOptions = new ListClusterNetworkProfilesOptions.Builder()
        .start("testString")
        .limit(Long.valueOf("10"))
        .build();

      // Invoke operation
      Response<ClusterNetworkProfileCollection> response = service.listClusterNetworkProfiles(listClusterNetworkProfilesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ClusterNetworkProfileCollection clusterNetworkProfileCollectionResult = response.getResult();
      assertNotNull(clusterNetworkProfileCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListClusterNetworkProfiles" })
  public void testListClusterNetworkProfilesWithPager() throws Exception {
    try {
      ListClusterNetworkProfilesOptions options = new ListClusterNetworkProfilesOptions.Builder()
        .limit(Long.valueOf("10"))
        .build();

      // Test getNext().
      List<ClusterNetworkProfile> allResults = new ArrayList<>();
      ClusterNetworkProfilesPager pager = new ClusterNetworkProfilesPager(service, options);
      while (pager.hasNext()) {
        List<ClusterNetworkProfile> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new ClusterNetworkProfilesPager(service, options);
      List<ClusterNetworkProfile> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListClusterNetworkProfiles" })
  public void testGetClusterNetworkProfile() throws Exception {
    try {
      GetClusterNetworkProfileOptions getClusterNetworkProfileOptions = new GetClusterNetworkProfileOptions.Builder()
        .name("h100")
        .build();

      // Invoke operation
      Response<ClusterNetworkProfile> response = service.getClusterNetworkProfile(getClusterNetworkProfileOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ClusterNetworkProfile clusterNetworkProfileResult = response.getResult();
      assertNotNull(clusterNetworkProfileResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetClusterNetworkProfile" })
  public void testListClusterNetworks() throws Exception {
    try {
      ListClusterNetworksOptions listClusterNetworksOptions = new ListClusterNetworksOptions.Builder()
        .start("testString")
        .limit(Long.valueOf("10"))
        .resourceGroupId("testString")
        .name("my-name")
        .sort("name")
        .vpcId("testString")
        .vpcCrn("crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::vpc:r006-4727d842-f94f-4a2d-824a-9bc9b02c523b")
        .vpcName("my-vpc")
        .build();

      // Invoke operation
      Response<ClusterNetworkCollection> response = service.listClusterNetworks(listClusterNetworksOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ClusterNetworkCollection clusterNetworkCollectionResult = response.getResult();
      assertNotNull(clusterNetworkCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListClusterNetworks" })
  public void testListClusterNetworksWithPager() throws Exception {
    try {
      ListClusterNetworksOptions options = new ListClusterNetworksOptions.Builder()
        .limit(Long.valueOf("10"))
        .resourceGroupId("testString")
        .name("my-name")
        .sort("name")
        .vpcId("testString")
        .vpcCrn("crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::vpc:r006-4727d842-f94f-4a2d-824a-9bc9b02c523b")
        .vpcName("my-vpc")
        .build();

      // Test getNext().
      List<ClusterNetwork> allResults = new ArrayList<>();
      ClusterNetworksPager pager = new ClusterNetworksPager(service, options);
      while (pager.hasNext()) {
        List<ClusterNetwork> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new ClusterNetworksPager(service, options);
      List<ClusterNetwork> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListClusterNetworks" })
  public void testCreateClusterNetwork() throws Exception {
    try {
      ClusterNetworkProfileIdentityByName clusterNetworkProfileIdentityModel = new ClusterNetworkProfileIdentityByName.Builder()
        .name("h100")
        .build();

      VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
        .id("r006-4727d842-f94f-4a2d-824a-9bc9b02c523b")
        .build();

      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
        .name("us-south-1")
        .build();

      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
        .id("fee82deba12e4c0fb69c3b09d1f12345")
        .build();

      ClusterNetworkSubnetPrefixPrototype clusterNetworkSubnetPrefixPrototypeModel = new ClusterNetworkSubnetPrefixPrototype.Builder()
        .cidr("10.0.0.0/24")
        .build();

      CreateClusterNetworkOptions createClusterNetworkOptions = new CreateClusterNetworkOptions.Builder()
        .profile(clusterNetworkProfileIdentityModel)
        .vpc(vpcIdentityModel)
        .zone(zoneIdentityModel)
        .name("my-cluster-network")
        .resourceGroup(resourceGroupIdentityModel)
        .subnetPrefixes(java.util.Arrays.asList(clusterNetworkSubnetPrefixPrototypeModel))
        .build();

      // Invoke operation
      Response<ClusterNetwork> response = service.createClusterNetwork(createClusterNetworkOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      ClusterNetwork clusterNetworkResult = response.getResult();
      assertNotNull(clusterNetworkResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateClusterNetwork" })
  public void testListClusterNetworkInterfaces() throws Exception {
    try {
      ListClusterNetworkInterfacesOptions listClusterNetworkInterfacesOptions = new ListClusterNetworkInterfacesOptions.Builder()
        .clusterNetworkId("testString")
        .start("testString")
        .limit(Long.valueOf("10"))
        .name("my-name")
        .sort("name")
        .build();

      // Invoke operation
      Response<ClusterNetworkInterfaceCollection> response = service.listClusterNetworkInterfaces(listClusterNetworkInterfacesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ClusterNetworkInterfaceCollection clusterNetworkInterfaceCollectionResult = response.getResult();
      assertNotNull(clusterNetworkInterfaceCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListClusterNetworkInterfaces" })
  public void testListClusterNetworkInterfacesWithPager() throws Exception {
    try {
      ListClusterNetworkInterfacesOptions options = new ListClusterNetworkInterfacesOptions.Builder()
        .clusterNetworkId("testString")
        .limit(Long.valueOf("10"))
        .name("my-name")
        .sort("name")
        .build();

      // Test getNext().
      List<ClusterNetworkInterface> allResults = new ArrayList<>();
      ClusterNetworkInterfacesPager pager = new ClusterNetworkInterfacesPager(service, options);
      while (pager.hasNext()) {
        List<ClusterNetworkInterface> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new ClusterNetworkInterfacesPager(service, options);
      List<ClusterNetworkInterface> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListClusterNetworkInterfaces" })
  public void testCreateClusterNetworkInterface() throws Exception {
    try {
      ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPPrototypeClusterNetworkInterfacePrimaryIPContext clusterNetworkInterfacePrimaryIpPrototypeModel = new ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPPrototypeClusterNetworkInterfacePrimaryIPContext.Builder()
        .address("10.0.0.5")
        .autoDelete(false)
        .name("my-cluster-network-subnet-reserved-ip")
        .build();

      ClusterNetworkSubnetIdentityById clusterNetworkSubnetIdentityModel = new ClusterNetworkSubnetIdentityById.Builder()
        .id("0717-7931845c-65c4-4b0a-80cd-7d9c1a6d7930")
        .build();

      CreateClusterNetworkInterfaceOptions createClusterNetworkInterfaceOptions = new CreateClusterNetworkInterfaceOptions.Builder()
        .clusterNetworkId("testString")
        .name("my-cluster-network-interface")
        .primaryIp(clusterNetworkInterfacePrimaryIpPrototypeModel)
        .subnet(clusterNetworkSubnetIdentityModel)
        .build();

      // Invoke operation
      Response<ClusterNetworkInterface> response = service.createClusterNetworkInterface(createClusterNetworkInterfaceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      ClusterNetworkInterface clusterNetworkInterfaceResult = response.getResult();
      assertNotNull(clusterNetworkInterfaceResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateClusterNetworkInterface" })
  public void testGetClusterNetworkInterface() throws Exception {
    try {
      GetClusterNetworkInterfaceOptions getClusterNetworkInterfaceOptions = new GetClusterNetworkInterfaceOptions.Builder()
        .clusterNetworkId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<ClusterNetworkInterface> response = service.getClusterNetworkInterface(getClusterNetworkInterfaceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ClusterNetworkInterface clusterNetworkInterfaceResult = response.getResult();
      assertNotNull(clusterNetworkInterfaceResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetClusterNetworkInterface" })
  public void testUpdateClusterNetworkInterface() throws Exception {
    try {
      ClusterNetworkInterfacePatch clusterNetworkInterfacePatchModel = new ClusterNetworkInterfacePatch.Builder()
        .autoDelete(false)
        .name("my-cluster-network-interface")
        .build();
      Map<String, Object> clusterNetworkInterfacePatchModelAsPatch = clusterNetworkInterfacePatchModel.asPatch();

      UpdateClusterNetworkInterfaceOptions updateClusterNetworkInterfaceOptions = new UpdateClusterNetworkInterfaceOptions.Builder()
        .clusterNetworkId("testString")
        .id("testString")
        .clusterNetworkInterfacePatch(clusterNetworkInterfacePatchModelAsPatch)
        .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
        .build();

      // Invoke operation
      Response<ClusterNetworkInterface> response = service.updateClusterNetworkInterface(updateClusterNetworkInterfaceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ClusterNetworkInterface clusterNetworkInterfaceResult = response.getResult();
      assertNotNull(clusterNetworkInterfaceResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateClusterNetworkInterface" })
  public void testListClusterNetworkSubnets() throws Exception {
    try {
      ListClusterNetworkSubnetsOptions listClusterNetworkSubnetsOptions = new ListClusterNetworkSubnetsOptions.Builder()
        .clusterNetworkId("testString")
        .start("testString")
        .limit(Long.valueOf("10"))
        .name("my-name")
        .sort("name")
        .build();

      // Invoke operation
      Response<ClusterNetworkSubnetCollection> response = service.listClusterNetworkSubnets(listClusterNetworkSubnetsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ClusterNetworkSubnetCollection clusterNetworkSubnetCollectionResult = response.getResult();
      assertNotNull(clusterNetworkSubnetCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListClusterNetworkSubnets" })
  public void testListClusterNetworkSubnetsWithPager() throws Exception {
    try {
      ListClusterNetworkSubnetsOptions options = new ListClusterNetworkSubnetsOptions.Builder()
        .clusterNetworkId("testString")
        .limit(Long.valueOf("10"))
        .name("my-name")
        .sort("name")
        .build();

      // Test getNext().
      List<ClusterNetworkSubnet> allResults = new ArrayList<>();
      ClusterNetworkSubnetsPager pager = new ClusterNetworkSubnetsPager(service, options);
      while (pager.hasNext()) {
        List<ClusterNetworkSubnet> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new ClusterNetworkSubnetsPager(service, options);
      List<ClusterNetworkSubnet> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListClusterNetworkSubnets" })
  public void testCreateClusterNetworkSubnet() throws Exception {
    try {
      ClusterNetworkSubnetPrototypeClusterNetworkSubnetByTotalCountPrototype clusterNetworkSubnetPrototypeModel = new ClusterNetworkSubnetPrototypeClusterNetworkSubnetByTotalCountPrototype.Builder()
        .ipVersion("ipv4")
        .name("my-cluster-network-subnet")
        .totalIpv4AddressCount(Long.valueOf("256"))
        .build();

      CreateClusterNetworkSubnetOptions createClusterNetworkSubnetOptions = new CreateClusterNetworkSubnetOptions.Builder()
        .clusterNetworkId("testString")
        .clusterNetworkSubnetPrototype(clusterNetworkSubnetPrototypeModel)
        .build();

      // Invoke operation
      Response<ClusterNetworkSubnet> response = service.createClusterNetworkSubnet(createClusterNetworkSubnetOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      ClusterNetworkSubnet clusterNetworkSubnetResult = response.getResult();
      assertNotNull(clusterNetworkSubnetResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateClusterNetworkSubnet" })
  public void testListClusterNetworkSubnetReservedIps() throws Exception {
    try {
      ListClusterNetworkSubnetReservedIpsOptions listClusterNetworkSubnetReservedIpsOptions = new ListClusterNetworkSubnetReservedIpsOptions.Builder()
        .clusterNetworkId("testString")
        .clusterNetworkSubnetId("testString")
        .start("testString")
        .limit(Long.valueOf("10"))
        .name("my-name")
        .sort("name")
        .build();

      // Invoke operation
      Response<ClusterNetworkSubnetReservedIPCollection> response = service.listClusterNetworkSubnetReservedIps(listClusterNetworkSubnetReservedIpsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ClusterNetworkSubnetReservedIPCollection clusterNetworkSubnetReservedIpCollectionResult = response.getResult();
      assertNotNull(clusterNetworkSubnetReservedIpCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListClusterNetworkSubnetReservedIps" })
  public void testListClusterNetworkSubnetReservedIpsWithPager() throws Exception {
    try {
      ListClusterNetworkSubnetReservedIpsOptions options = new ListClusterNetworkSubnetReservedIpsOptions.Builder()
        .clusterNetworkId("testString")
        .clusterNetworkSubnetId("testString")
        .limit(Long.valueOf("10"))
        .name("my-name")
        .sort("name")
        .build();

      // Test getNext().
      List<ClusterNetworkSubnetReservedIP> allResults = new ArrayList<>();
      ClusterNetworkSubnetReservedIpsPager pager = new ClusterNetworkSubnetReservedIpsPager(service, options);
      while (pager.hasNext()) {
        List<ClusterNetworkSubnetReservedIP> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new ClusterNetworkSubnetReservedIpsPager(service, options);
      List<ClusterNetworkSubnetReservedIP> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListClusterNetworkSubnetReservedIps" })
  public void testCreateClusterNetworkSubnetReservedIp() throws Exception {
    try {
      CreateClusterNetworkSubnetReservedIpOptions createClusterNetworkSubnetReservedIpOptions = new CreateClusterNetworkSubnetReservedIpOptions.Builder()
        .clusterNetworkId("testString")
        .clusterNetworkSubnetId("testString")
        .address("192.168.3.4")
        .name("my-cluster-network-subnet-reserved-ip")
        .build();

      // Invoke operation
      Response<ClusterNetworkSubnetReservedIP> response = service.createClusterNetworkSubnetReservedIp(createClusterNetworkSubnetReservedIpOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      ClusterNetworkSubnetReservedIP clusterNetworkSubnetReservedIpResult = response.getResult();
      assertNotNull(clusterNetworkSubnetReservedIpResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateClusterNetworkSubnetReservedIp" })
  public void testGetClusterNetworkSubnetReservedIp() throws Exception {
    try {
      GetClusterNetworkSubnetReservedIpOptions getClusterNetworkSubnetReservedIpOptions = new GetClusterNetworkSubnetReservedIpOptions.Builder()
        .clusterNetworkId("testString")
        .clusterNetworkSubnetId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<ClusterNetworkSubnetReservedIP> response = service.getClusterNetworkSubnetReservedIp(getClusterNetworkSubnetReservedIpOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ClusterNetworkSubnetReservedIP clusterNetworkSubnetReservedIpResult = response.getResult();
      assertNotNull(clusterNetworkSubnetReservedIpResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetClusterNetworkSubnetReservedIp" })
  public void testUpdateClusterNetworkSubnetReservedIp() throws Exception {
    try {
      ClusterNetworkSubnetReservedIPPatch clusterNetworkSubnetReservedIpPatchModel = new ClusterNetworkSubnetReservedIPPatch.Builder()
        .autoDelete(false)
        .name("my-cluster-network-subnet-reserved-ip")
        .build();
      Map<String, Object> clusterNetworkSubnetReservedIpPatchModelAsPatch = clusterNetworkSubnetReservedIpPatchModel.asPatch();

      UpdateClusterNetworkSubnetReservedIpOptions updateClusterNetworkSubnetReservedIpOptions = new UpdateClusterNetworkSubnetReservedIpOptions.Builder()
        .clusterNetworkId("testString")
        .clusterNetworkSubnetId("testString")
        .id("testString")
        .clusterNetworkSubnetReservedIpPatch(clusterNetworkSubnetReservedIpPatchModelAsPatch)
        .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
        .build();

      // Invoke operation
      Response<ClusterNetworkSubnetReservedIP> response = service.updateClusterNetworkSubnetReservedIp(updateClusterNetworkSubnetReservedIpOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ClusterNetworkSubnetReservedIP clusterNetworkSubnetReservedIpResult = response.getResult();
      assertNotNull(clusterNetworkSubnetReservedIpResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateClusterNetworkSubnetReservedIp" })
  public void testGetClusterNetworkSubnet() throws Exception {
    try {
      GetClusterNetworkSubnetOptions getClusterNetworkSubnetOptions = new GetClusterNetworkSubnetOptions.Builder()
        .clusterNetworkId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<ClusterNetworkSubnet> response = service.getClusterNetworkSubnet(getClusterNetworkSubnetOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ClusterNetworkSubnet clusterNetworkSubnetResult = response.getResult();
      assertNotNull(clusterNetworkSubnetResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetClusterNetworkSubnet" })
  public void testUpdateClusterNetworkSubnet() throws Exception {
    try {
      ClusterNetworkSubnetPatch clusterNetworkSubnetPatchModel = new ClusterNetworkSubnetPatch.Builder()
        .name("my-cluster-network-subnet")
        .build();
      Map<String, Object> clusterNetworkSubnetPatchModelAsPatch = clusterNetworkSubnetPatchModel.asPatch();

      UpdateClusterNetworkSubnetOptions updateClusterNetworkSubnetOptions = new UpdateClusterNetworkSubnetOptions.Builder()
        .clusterNetworkId("testString")
        .id("testString")
        .clusterNetworkSubnetPatch(clusterNetworkSubnetPatchModelAsPatch)
        .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
        .build();

      // Invoke operation
      Response<ClusterNetworkSubnet> response = service.updateClusterNetworkSubnet(updateClusterNetworkSubnetOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ClusterNetworkSubnet clusterNetworkSubnetResult = response.getResult();
      assertNotNull(clusterNetworkSubnetResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateClusterNetworkSubnet" })
  public void testGetClusterNetwork() throws Exception {
    try {
      GetClusterNetworkOptions getClusterNetworkOptions = new GetClusterNetworkOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<ClusterNetwork> response = service.getClusterNetwork(getClusterNetworkOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ClusterNetwork clusterNetworkResult = response.getResult();
      assertNotNull(clusterNetworkResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetClusterNetwork" })
  public void testUpdateClusterNetwork() throws Exception {
    try {
      ClusterNetworkPatch clusterNetworkPatchModel = new ClusterNetworkPatch.Builder()
        .name("my-cluster-network")
        .build();
      Map<String, Object> clusterNetworkPatchModelAsPatch = clusterNetworkPatchModel.asPatch();

      UpdateClusterNetworkOptions updateClusterNetworkOptions = new UpdateClusterNetworkOptions.Builder()
        .id("testString")
        .clusterNetworkPatch(clusterNetworkPatchModelAsPatch)
        .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
        .build();

      // Invoke operation
      Response<ClusterNetwork> response = service.updateClusterNetwork(updateClusterNetworkOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ClusterNetwork clusterNetworkResult = response.getResult();
      assertNotNull(clusterNetworkResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateClusterNetwork" })
  public void testListPublicGateways() throws Exception {
    try {
      ListPublicGatewaysOptions listPublicGatewaysOptions = new ListPublicGatewaysOptions.Builder()
        .start("testString")
        .limit(Long.valueOf("10"))
        .resourceGroupId("testString")
        .build();

      // Invoke operation
      Response<PublicGatewayCollection> response = service.listPublicGateways(listPublicGatewaysOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PublicGatewayCollection publicGatewayCollectionResult = response.getResult();
      assertNotNull(publicGatewayCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListPublicGateways" })
  public void testListPublicGatewaysWithPager() throws Exception {
    try {
      ListPublicGatewaysOptions options = new ListPublicGatewaysOptions.Builder()
        .limit(Long.valueOf("10"))
        .resourceGroupId("testString")
        .build();

      // Test getNext().
      List<PublicGateway> allResults = new ArrayList<>();
      PublicGatewaysPager pager = new PublicGatewaysPager(service, options);
      while (pager.hasNext()) {
        List<PublicGateway> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new PublicGatewaysPager(service, options);
      List<PublicGateway> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListPublicGateways" })
  public void testCreatePublicGateway() throws Exception {
    try {
      VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
        .id("r006-4727d842-f94f-4a2d-824a-9bc9b02c523b")
        .build();

      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
        .name("us-south-1")
        .build();

      PublicGatewayFloatingIPPrototypeFloatingIPIdentityFloatingIPIdentityById publicGatewayFloatingIpPrototypeModel = new PublicGatewayFloatingIPPrototypeFloatingIPIdentityFloatingIPIdentityById.Builder()
        .id("r006-f45e0d90-12a8-4460-8210-290ff2ab75cd")
        .build();

      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
        .id("fee82deba12e4c0fb69c3b09d1f12345")
        .build();

      CreatePublicGatewayOptions createPublicGatewayOptions = new CreatePublicGatewayOptions.Builder()
        .vpc(vpcIdentityModel)
        .zone(zoneIdentityModel)
        .floatingIp(publicGatewayFloatingIpPrototypeModel)
        .name("my-public-gateway")
        .resourceGroup(resourceGroupIdentityModel)
        .build();

      // Invoke operation
      Response<PublicGateway> response = service.createPublicGateway(createPublicGatewayOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      PublicGateway publicGatewayResult = response.getResult();
      assertNotNull(publicGatewayResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreatePublicGateway" })
  public void testGetPublicGateway() throws Exception {
    try {
      GetPublicGatewayOptions getPublicGatewayOptions = new GetPublicGatewayOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<PublicGateway> response = service.getPublicGateway(getPublicGatewayOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PublicGateway publicGatewayResult = response.getResult();
      assertNotNull(publicGatewayResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetPublicGateway" })
  public void testUpdatePublicGateway() throws Exception {
    try {
      PublicGatewayPatch publicGatewayPatchModel = new PublicGatewayPatch.Builder()
        .name("my-public-gateway-updated")
        .build();
      Map<String, Object> publicGatewayPatchModelAsPatch = publicGatewayPatchModel.asPatch();

      UpdatePublicGatewayOptions updatePublicGatewayOptions = new UpdatePublicGatewayOptions.Builder()
        .id("testString")
        .publicGatewayPatch(publicGatewayPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<PublicGateway> response = service.updatePublicGateway(updatePublicGatewayOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PublicGateway publicGatewayResult = response.getResult();
      assertNotNull(publicGatewayResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdatePublicGateway" })
  public void testListFloatingIps() throws Exception {
    try {
      ListFloatingIpsOptions listFloatingIpsOptions = new ListFloatingIpsOptions.Builder()
        .start("testString")
        .limit(Long.valueOf("10"))
        .resourceGroupId("testString")
        .sort("name")
        .targetId("testString")
        .targetCrn("crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::load-balancer:r006-dd754295-e9e0-4c9d-bf6c-58fbc59e5727")
        .targetName("my-resource")
        .targetResourceType("testString")
        .build();

      // Invoke operation
      Response<FloatingIPCollection> response = service.listFloatingIps(listFloatingIpsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      FloatingIPCollection floatingIpCollectionResult = response.getResult();
      assertNotNull(floatingIpCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListFloatingIps" })
  public void testListFloatingIpsWithPager() throws Exception {
    try {
      ListFloatingIpsOptions options = new ListFloatingIpsOptions.Builder()
        .limit(Long.valueOf("10"))
        .resourceGroupId("testString")
        .sort("name")
        .targetId("testString")
        .targetCrn("crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::load-balancer:r006-dd754295-e9e0-4c9d-bf6c-58fbc59e5727")
        .targetName("my-resource")
        .targetResourceType("testString")
        .build();

      // Test getNext().
      List<FloatingIP> allResults = new ArrayList<>();
      FloatingIpsPager pager = new FloatingIpsPager(service, options);
      while (pager.hasNext()) {
        List<FloatingIP> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new FloatingIpsPager(service, options);
      List<FloatingIP> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListFloatingIps" })
  public void testCreateFloatingIp() throws Exception {
    try {
      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
        .id("fee82deba12e4c0fb69c3b09d1f12345")
        .build();

      FloatingIPTargetPrototypeBareMetalServerNetworkInterfaceIdentityBareMetalServerNetworkInterfaceIdentityById floatingIpTargetPrototypeModel = new FloatingIPTargetPrototypeBareMetalServerNetworkInterfaceIdentityBareMetalServerNetworkInterfaceIdentityById.Builder()
        .id("0717-54eb57ee-86f2-4796-90bb-d7874e0831ef")
        .build();

      FloatingIPPrototypeFloatingIPByTarget floatingIpPrototypeModel = new FloatingIPPrototypeFloatingIPByTarget.Builder()
        .name("my-floating-ip")
        .resourceGroup(resourceGroupIdentityModel)
        .target(floatingIpTargetPrototypeModel)
        .build();

      CreateFloatingIpOptions createFloatingIpOptions = new CreateFloatingIpOptions.Builder()
        .floatingIpPrototype(floatingIpPrototypeModel)
        .build();

      // Invoke operation
      Response<FloatingIP> response = service.createFloatingIp(createFloatingIpOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      FloatingIP floatingIpResult = response.getResult();
      assertNotNull(floatingIpResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateFloatingIp" })
  public void testGetFloatingIp() throws Exception {
    try {
      GetFloatingIpOptions getFloatingIpOptions = new GetFloatingIpOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<FloatingIP> response = service.getFloatingIp(getFloatingIpOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      FloatingIP floatingIpResult = response.getResult();
      assertNotNull(floatingIpResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetFloatingIp" })
  public void testUpdateFloatingIp() throws Exception {
    try {
      FloatingIPTargetPatchBareMetalServerNetworkInterfaceIdentityBareMetalServerNetworkInterfaceIdentityById floatingIpTargetPatchModel = new FloatingIPTargetPatchBareMetalServerNetworkInterfaceIdentityBareMetalServerNetworkInterfaceIdentityById.Builder()
        .id("0717-da8c43ec-b6ca-4bd2-871e-72e288c66ee6")
        .build();

      FloatingIPPatch floatingIpPatchModel = new FloatingIPPatch.Builder()
        .name("my-floating-ip")
        .target(floatingIpTargetPatchModel)
        .build();
      Map<String, Object> floatingIpPatchModelAsPatch = floatingIpPatchModel.asPatch();

      UpdateFloatingIpOptions updateFloatingIpOptions = new UpdateFloatingIpOptions.Builder()
        .id("testString")
        .floatingIpPatch(floatingIpPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<FloatingIP> response = service.updateFloatingIp(updateFloatingIpOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      FloatingIP floatingIpResult = response.getResult();
      assertNotNull(floatingIpResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateFloatingIp" })
  public void testListNetworkAcls() throws Exception {
    try {
      ListNetworkAclsOptions listNetworkAclsOptions = new ListNetworkAclsOptions.Builder()
        .start("testString")
        .limit(Long.valueOf("10"))
        .resourceGroupId("testString")
        .build();

      // Invoke operation
      Response<NetworkACLCollection> response = service.listNetworkAcls(listNetworkAclsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      NetworkACLCollection networkAclCollectionResult = response.getResult();
      assertNotNull(networkAclCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListNetworkAcls" })
  public void testListNetworkAclsWithPager() throws Exception {
    try {
      ListNetworkAclsOptions options = new ListNetworkAclsOptions.Builder()
        .limit(Long.valueOf("10"))
        .resourceGroupId("testString")
        .build();

      // Test getNext().
      List<NetworkACL> allResults = new ArrayList<>();
      NetworkAclsPager pager = new NetworkAclsPager(service, options);
      while (pager.hasNext()) {
        List<NetworkACL> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new NetworkAclsPager(service, options);
      List<NetworkACL> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListNetworkAcls" })
  public void testCreateNetworkAcl() throws Exception {
    try {
      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
        .id("fee82deba12e4c0fb69c3b09d1f12345")
        .build();

      VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
        .id("r006-4727d842-f94f-4a2d-824a-9bc9b02c523b")
        .build();

      NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAllPrototype networkAclRulePrototypeNetworkAclContextModel = new NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAllPrototype.Builder()
        .action("allow")
        .destination("192.168.3.2/32")
        .direction("inbound")
        .ipVersion("ipv4")
        .name("my-network-acl-rule")
        .source("192.168.3.2/32")
        .protocol("all")
        .build();

      NetworkACLPrototypeNetworkACLByRules networkAclPrototypeModel = new NetworkACLPrototypeNetworkACLByRules.Builder()
        .name("my-network-acl")
        .resourceGroup(resourceGroupIdentityModel)
        .vpc(vpcIdentityModel)
        .rules(java.util.Arrays.asList(networkAclRulePrototypeNetworkAclContextModel))
        .build();

      CreateNetworkAclOptions createNetworkAclOptions = new CreateNetworkAclOptions.Builder()
        .networkAclPrototype(networkAclPrototypeModel)
        .build();

      // Invoke operation
      Response<NetworkACL> response = service.createNetworkAcl(createNetworkAclOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      NetworkACL networkAclResult = response.getResult();
      assertNotNull(networkAclResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateNetworkAcl" })
  public void testGetNetworkAcl() throws Exception {
    try {
      GetNetworkAclOptions getNetworkAclOptions = new GetNetworkAclOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<NetworkACL> response = service.getNetworkAcl(getNetworkAclOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      NetworkACL networkAclResult = response.getResult();
      assertNotNull(networkAclResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetNetworkAcl" })
  public void testUpdateNetworkAcl() throws Exception {
    try {
      NetworkACLPatch networkAclPatchModel = new NetworkACLPatch.Builder()
        .name("my-network-acl-updated")
        .build();
      Map<String, Object> networkAclPatchModelAsPatch = networkAclPatchModel.asPatch();

      UpdateNetworkAclOptions updateNetworkAclOptions = new UpdateNetworkAclOptions.Builder()
        .id("testString")
        .networkAclPatch(networkAclPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<NetworkACL> response = service.updateNetworkAcl(updateNetworkAclOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      NetworkACL networkAclResult = response.getResult();
      assertNotNull(networkAclResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateNetworkAcl" })
  public void testListNetworkAclRules() throws Exception {
    try {
      ListNetworkAclRulesOptions listNetworkAclRulesOptions = new ListNetworkAclRulesOptions.Builder()
        .networkAclId("testString")
        .start("testString")
        .limit(Long.valueOf("10"))
        .direction("inbound")
        .build();

      // Invoke operation
      Response<NetworkACLRuleCollection> response = service.listNetworkAclRules(listNetworkAclRulesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      NetworkACLRuleCollection networkAclRuleCollectionResult = response.getResult();
      assertNotNull(networkAclRuleCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListNetworkAclRules" })
  public void testListNetworkAclRulesWithPager() throws Exception {
    try {
      ListNetworkAclRulesOptions options = new ListNetworkAclRulesOptions.Builder()
        .networkAclId("testString")
        .limit(Long.valueOf("10"))
        .direction("inbound")
        .build();

      // Test getNext().
      List<NetworkACLRuleItem> allResults = new ArrayList<>();
      NetworkAclRulesPager pager = new NetworkAclRulesPager(service, options);
      while (pager.hasNext()) {
        List<NetworkACLRuleItem> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new NetworkAclRulesPager(service, options);
      List<NetworkACLRuleItem> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListNetworkAclRules" })
  public void testCreateNetworkAclRule() throws Exception {
    try {
      NetworkACLRuleBeforePrototypeNetworkACLRuleIdentityById networkAclRuleBeforePrototypeModel = new NetworkACLRuleBeforePrototypeNetworkACLRuleIdentityById.Builder()
        .id("r006-8daca77a-4980-4d33-8f3e-7038797be8f9")
        .build();

      NetworkACLRulePrototypeNetworkACLRuleProtocolAllPrototype networkAclRulePrototypeModel = new NetworkACLRulePrototypeNetworkACLRuleProtocolAllPrototype.Builder()
        .action("allow")
        .before(networkAclRuleBeforePrototypeModel)
        .destination("192.168.3.2/32")
        .direction("inbound")
        .ipVersion("ipv4")
        .name("my-network-acl-rule")
        .source("192.168.3.2/32")
        .protocol("all")
        .build();

      CreateNetworkAclRuleOptions createNetworkAclRuleOptions = new CreateNetworkAclRuleOptions.Builder()
        .networkAclId("testString")
        .networkAclRulePrototype(networkAclRulePrototypeModel)
        .build();

      // Invoke operation
      Response<NetworkACLRule> response = service.createNetworkAclRule(createNetworkAclRuleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      NetworkACLRule networkAclRuleResult = response.getResult();
      assertNotNull(networkAclRuleResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateNetworkAclRule" })
  public void testGetNetworkAclRule() throws Exception {
    try {
      GetNetworkAclRuleOptions getNetworkAclRuleOptions = new GetNetworkAclRuleOptions.Builder()
        .networkAclId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<NetworkACLRule> response = service.getNetworkAclRule(getNetworkAclRuleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      NetworkACLRule networkAclRuleResult = response.getResult();
      assertNotNull(networkAclRuleResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetNetworkAclRule" })
  public void testUpdateNetworkAclRule() throws Exception {
    try {
      NetworkACLRuleBeforePatchNetworkACLRuleIdentityById networkAclRuleBeforePatchModel = new NetworkACLRuleBeforePatchNetworkACLRuleIdentityById.Builder()
        .id("r006-8daca77a-4980-4d33-8f3e-7038797be8f9")
        .build();

      NetworkACLRulePatch networkAclRulePatchModel = new NetworkACLRulePatch.Builder()
        .action("allow")
        .before(networkAclRuleBeforePatchModel)
        .code(Long.valueOf("0"))
        .destination("192.168.3.2/32")
        .destinationPortMax(Long.valueOf("22"))
        .destinationPortMin(Long.valueOf("22"))
        .direction("inbound")
        .name("my-network-acl-rule")
        .source("10.0.0.0/0")
        .sourcePortMax(Long.valueOf("65535"))
        .sourcePortMin(Long.valueOf("49152"))
        .type(Long.valueOf("8"))
        .build();
      Map<String, Object> networkAclRulePatchModelAsPatch = networkAclRulePatchModel.asPatch();

      UpdateNetworkAclRuleOptions updateNetworkAclRuleOptions = new UpdateNetworkAclRuleOptions.Builder()
        .networkAclId("testString")
        .id("testString")
        .networkAclRulePatch(networkAclRulePatchModelAsPatch)
        .build();

      // Invoke operation
      Response<NetworkACLRule> response = service.updateNetworkAclRule(updateNetworkAclRuleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      NetworkACLRule networkAclRuleResult = response.getResult();
      assertNotNull(networkAclRuleResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateNetworkAclRule" })
  public void testListSecurityGroups() throws Exception {
    try {
      ListSecurityGroupsOptions listSecurityGroupsOptions = new ListSecurityGroupsOptions.Builder()
        .start("testString")
        .limit(Long.valueOf("10"))
        .resourceGroupId("testString")
        .vpcId("testString")
        .vpcCrn("crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::vpc:r006-4727d842-f94f-4a2d-824a-9bc9b02c523b")
        .vpcName("my-vpc")
        .build();

      // Invoke operation
      Response<SecurityGroupCollection> response = service.listSecurityGroups(listSecurityGroupsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SecurityGroupCollection securityGroupCollectionResult = response.getResult();
      assertNotNull(securityGroupCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListSecurityGroups" })
  public void testListSecurityGroupsWithPager() throws Exception {
    try {
      ListSecurityGroupsOptions options = new ListSecurityGroupsOptions.Builder()
        .limit(Long.valueOf("10"))
        .resourceGroupId("testString")
        .vpcId("testString")
        .vpcCrn("crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::vpc:r006-4727d842-f94f-4a2d-824a-9bc9b02c523b")
        .vpcName("my-vpc")
        .build();

      // Test getNext().
      List<SecurityGroup> allResults = new ArrayList<>();
      SecurityGroupsPager pager = new SecurityGroupsPager(service, options);
      while (pager.hasNext()) {
        List<SecurityGroup> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new SecurityGroupsPager(service, options);
      List<SecurityGroup> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListSecurityGroups" })
  public void testCreateSecurityGroup() throws Exception {
    try {
      VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
        .id("r006-4727d842-f94f-4a2d-824a-9bc9b02c523b")
        .build();

      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
        .id("fee82deba12e4c0fb69c3b09d1f12345")
        .build();

      SecurityGroupRuleLocalPrototypeIP securityGroupRuleLocalPrototypeModel = new SecurityGroupRuleLocalPrototypeIP.Builder()
        .address("192.168.3.4")
        .build();

      SecurityGroupRuleRemotePrototypeIP securityGroupRuleRemotePrototypeModel = new SecurityGroupRuleRemotePrototypeIP.Builder()
        .address("192.168.3.4")
        .build();

      SecurityGroupRulePrototypeSecurityGroupRuleProtocolAll securityGroupRulePrototypeModel = new SecurityGroupRulePrototypeSecurityGroupRuleProtocolAll.Builder()
        .direction("inbound")
        .ipVersion("ipv4")
        .local(securityGroupRuleLocalPrototypeModel)
        .remote(securityGroupRuleRemotePrototypeModel)
        .protocol("all")
        .build();

      CreateSecurityGroupOptions createSecurityGroupOptions = new CreateSecurityGroupOptions.Builder()
        .vpc(vpcIdentityModel)
        .name("my-security-group")
        .resourceGroup(resourceGroupIdentityModel)
        .rules(java.util.Arrays.asList(securityGroupRulePrototypeModel))
        .build();

      // Invoke operation
      Response<SecurityGroup> response = service.createSecurityGroup(createSecurityGroupOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      SecurityGroup securityGroupResult = response.getResult();
      assertNotNull(securityGroupResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateSecurityGroup" })
  public void testGetSecurityGroup() throws Exception {
    try {
      GetSecurityGroupOptions getSecurityGroupOptions = new GetSecurityGroupOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<SecurityGroup> response = service.getSecurityGroup(getSecurityGroupOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SecurityGroup securityGroupResult = response.getResult();
      assertNotNull(securityGroupResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSecurityGroup" })
  public void testUpdateSecurityGroup() throws Exception {
    try {
      SecurityGroupPatch securityGroupPatchModel = new SecurityGroupPatch.Builder()
        .name("my-security-group")
        .build();
      Map<String, Object> securityGroupPatchModelAsPatch = securityGroupPatchModel.asPatch();

      UpdateSecurityGroupOptions updateSecurityGroupOptions = new UpdateSecurityGroupOptions.Builder()
        .id("testString")
        .securityGroupPatch(securityGroupPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<SecurityGroup> response = service.updateSecurityGroup(updateSecurityGroupOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SecurityGroup securityGroupResult = response.getResult();
      assertNotNull(securityGroupResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateSecurityGroup" })
  public void testListSecurityGroupRules() throws Exception {
    try {
      ListSecurityGroupRulesOptions listSecurityGroupRulesOptions = new ListSecurityGroupRulesOptions.Builder()
        .securityGroupId("testString")
        .build();

      // Invoke operation
      Response<SecurityGroupRuleCollection> response = service.listSecurityGroupRules(listSecurityGroupRulesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SecurityGroupRuleCollection securityGroupRuleCollectionResult = response.getResult();
      assertNotNull(securityGroupRuleCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListSecurityGroupRules" })
  public void testCreateSecurityGroupRule() throws Exception {
    try {
      SecurityGroupRuleLocalPrototypeIP securityGroupRuleLocalPrototypeModel = new SecurityGroupRuleLocalPrototypeIP.Builder()
        .address("192.168.3.4")
        .build();

      SecurityGroupRuleRemotePrototypeIP securityGroupRuleRemotePrototypeModel = new SecurityGroupRuleRemotePrototypeIP.Builder()
        .address("192.168.3.4")
        .build();

      SecurityGroupRulePrototypeSecurityGroupRuleProtocolAll securityGroupRulePrototypeModel = new SecurityGroupRulePrototypeSecurityGroupRuleProtocolAll.Builder()
        .direction("inbound")
        .ipVersion("ipv4")
        .local(securityGroupRuleLocalPrototypeModel)
        .remote(securityGroupRuleRemotePrototypeModel)
        .protocol("all")
        .build();

      CreateSecurityGroupRuleOptions createSecurityGroupRuleOptions = new CreateSecurityGroupRuleOptions.Builder()
        .securityGroupId("testString")
        .securityGroupRulePrototype(securityGroupRulePrototypeModel)
        .build();

      // Invoke operation
      Response<SecurityGroupRule> response = service.createSecurityGroupRule(createSecurityGroupRuleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      SecurityGroupRule securityGroupRuleResult = response.getResult();
      assertNotNull(securityGroupRuleResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateSecurityGroupRule" })
  public void testGetSecurityGroupRule() throws Exception {
    try {
      GetSecurityGroupRuleOptions getSecurityGroupRuleOptions = new GetSecurityGroupRuleOptions.Builder()
        .securityGroupId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<SecurityGroupRule> response = service.getSecurityGroupRule(getSecurityGroupRuleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SecurityGroupRule securityGroupRuleResult = response.getResult();
      assertNotNull(securityGroupRuleResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSecurityGroupRule" })
  public void testUpdateSecurityGroupRule() throws Exception {
    try {
      SecurityGroupRuleLocalPatchIP securityGroupRuleLocalPatchModel = new SecurityGroupRuleLocalPatchIP.Builder()
        .address("192.168.3.4")
        .build();

      SecurityGroupRuleRemotePatchCIDR securityGroupRuleRemotePatchModel = new SecurityGroupRuleRemotePatchCIDR.Builder()
        .cidrBlock("10.0.0.0/8")
        .build();

      SecurityGroupRulePatch securityGroupRulePatchModel = new SecurityGroupRulePatch.Builder()
        .code(Long.valueOf("0"))
        .direction("inbound")
        .ipVersion("ipv4")
        .local(securityGroupRuleLocalPatchModel)
        .portMax(Long.valueOf("22"))
        .portMin(Long.valueOf("22"))
        .remote(securityGroupRuleRemotePatchModel)
        .type(Long.valueOf("8"))
        .build();
      Map<String, Object> securityGroupRulePatchModelAsPatch = securityGroupRulePatchModel.asPatch();

      UpdateSecurityGroupRuleOptions updateSecurityGroupRuleOptions = new UpdateSecurityGroupRuleOptions.Builder()
        .securityGroupId("testString")
        .id("testString")
        .securityGroupRulePatch(securityGroupRulePatchModelAsPatch)
        .build();

      // Invoke operation
      Response<SecurityGroupRule> response = service.updateSecurityGroupRule(updateSecurityGroupRuleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SecurityGroupRule securityGroupRuleResult = response.getResult();
      assertNotNull(securityGroupRuleResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateSecurityGroupRule" })
  public void testListSecurityGroupTargets() throws Exception {
    try {
      ListSecurityGroupTargetsOptions listSecurityGroupTargetsOptions = new ListSecurityGroupTargetsOptions.Builder()
        .securityGroupId("testString")
        .start("testString")
        .limit(Long.valueOf("10"))
        .build();

      // Invoke operation
      Response<SecurityGroupTargetCollection> response = service.listSecurityGroupTargets(listSecurityGroupTargetsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SecurityGroupTargetCollection securityGroupTargetCollectionResult = response.getResult();
      assertNotNull(securityGroupTargetCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListSecurityGroupTargets" })
  public void testListSecurityGroupTargetsWithPager() throws Exception {
    try {
      ListSecurityGroupTargetsOptions options = new ListSecurityGroupTargetsOptions.Builder()
        .securityGroupId("testString")
        .limit(Long.valueOf("10"))
        .build();

      // Test getNext().
      List<SecurityGroupTargetReference> allResults = new ArrayList<>();
      SecurityGroupTargetsPager pager = new SecurityGroupTargetsPager(service, options);
      while (pager.hasNext()) {
        List<SecurityGroupTargetReference> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new SecurityGroupTargetsPager(service, options);
      List<SecurityGroupTargetReference> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListSecurityGroupTargets" })
  public void testGetSecurityGroupTarget() throws Exception {
    try {
      GetSecurityGroupTargetOptions getSecurityGroupTargetOptions = new GetSecurityGroupTargetOptions.Builder()
        .securityGroupId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<SecurityGroupTargetReference> response = service.getSecurityGroupTarget(getSecurityGroupTargetOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SecurityGroupTargetReference securityGroupTargetReferenceResult = response.getResult();
      assertNotNull(securityGroupTargetReferenceResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSecurityGroupTarget" })
  public void testCreateSecurityGroupTargetBinding() throws Exception {
    try {
      CreateSecurityGroupTargetBindingOptions createSecurityGroupTargetBindingOptions = new CreateSecurityGroupTargetBindingOptions.Builder()
        .securityGroupId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<SecurityGroupTargetReference> response = service.createSecurityGroupTargetBinding(createSecurityGroupTargetBindingOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SecurityGroupTargetReference securityGroupTargetReferenceResult = response.getResult();
      assertNotNull(securityGroupTargetReferenceResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateSecurityGroupTargetBinding" })
  public void testListIkePolicies() throws Exception {
    try {
      ListIkePoliciesOptions listIkePoliciesOptions = new ListIkePoliciesOptions.Builder()
        .start("testString")
        .limit(Long.valueOf("10"))
        .build();

      // Invoke operation
      Response<IKEPolicyCollection> response = service.listIkePolicies(listIkePoliciesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      IKEPolicyCollection ikePolicyCollectionResult = response.getResult();
      assertNotNull(ikePolicyCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListIkePolicies" })
  public void testListIkePoliciesWithPager() throws Exception {
    try {
      ListIkePoliciesOptions options = new ListIkePoliciesOptions.Builder()
        .limit(Long.valueOf("10"))
        .build();

      // Test getNext().
      List<IKEPolicy> allResults = new ArrayList<>();
      IkePoliciesPager pager = new IkePoliciesPager(service, options);
      while (pager.hasNext()) {
        List<IKEPolicy> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new IkePoliciesPager(service, options);
      List<IKEPolicy> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListIkePolicies" })
  public void testCreateIkePolicy() throws Exception {
    try {
      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
        .id("fee82deba12e4c0fb69c3b09d1f12345")
        .build();

      CreateIkePolicyOptions createIkePolicyOptions = new CreateIkePolicyOptions.Builder()
        .authenticationAlgorithm("sha256")
        .dhGroup(Long.valueOf("14"))
        .encryptionAlgorithm("aes128")
        .ikeVersion(Long.valueOf("1"))
        .keyLifetime(Long.valueOf("28800"))
        .name("my-ike-policy")
        .resourceGroup(resourceGroupIdentityModel)
        .build();

      // Invoke operation
      Response<IKEPolicy> response = service.createIkePolicy(createIkePolicyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      IKEPolicy ikePolicyResult = response.getResult();
      assertNotNull(ikePolicyResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateIkePolicy" })
  public void testGetIkePolicy() throws Exception {
    try {
      GetIkePolicyOptions getIkePolicyOptions = new GetIkePolicyOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<IKEPolicy> response = service.getIkePolicy(getIkePolicyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      IKEPolicy ikePolicyResult = response.getResult();
      assertNotNull(ikePolicyResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetIkePolicy" })
  public void testUpdateIkePolicy() throws Exception {
    try {
      IKEPolicyPatch ikePolicyPatchModel = new IKEPolicyPatch.Builder()
        .authenticationAlgorithm("sha256")
        .dhGroup(Long.valueOf("14"))
        .encryptionAlgorithm("aes128")
        .ikeVersion(Long.valueOf("1"))
        .keyLifetime(Long.valueOf("86400"))
        .name("my-ike-policy")
        .build();
      Map<String, Object> ikePolicyPatchModelAsPatch = ikePolicyPatchModel.asPatch();

      UpdateIkePolicyOptions updateIkePolicyOptions = new UpdateIkePolicyOptions.Builder()
        .id("testString")
        .ikePolicyPatch(ikePolicyPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<IKEPolicy> response = service.updateIkePolicy(updateIkePolicyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      IKEPolicy ikePolicyResult = response.getResult();
      assertNotNull(ikePolicyResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateIkePolicy" })
  public void testListIkePolicyConnections() throws Exception {
    try {
      ListIkePolicyConnectionsOptions listIkePolicyConnectionsOptions = new ListIkePolicyConnectionsOptions.Builder()
        .id("testString")
        .start("testString")
        .limit(Long.valueOf("10"))
        .build();

      // Invoke operation
      Response<IKEPolicyConnectionCollection> response = service.listIkePolicyConnections(listIkePolicyConnectionsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      IKEPolicyConnectionCollection ikePolicyConnectionCollectionResult = response.getResult();
      assertNotNull(ikePolicyConnectionCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListIkePolicyConnections" })
  public void testListIkePolicyConnectionsWithPager() throws Exception {
    try {
      ListIkePolicyConnectionsOptions options = new ListIkePolicyConnectionsOptions.Builder()
        .id("testString")
        .limit(Long.valueOf("10"))
        .build();

      // Test getNext().
      List<VPNGatewayConnection> allResults = new ArrayList<>();
      IkePolicyConnectionsPager pager = new IkePolicyConnectionsPager(service, options);
      while (pager.hasNext()) {
        List<VPNGatewayConnection> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new IkePolicyConnectionsPager(service, options);
      List<VPNGatewayConnection> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListIkePolicyConnections" })
  public void testListIpsecPolicies() throws Exception {
    try {
      ListIpsecPoliciesOptions listIpsecPoliciesOptions = new ListIpsecPoliciesOptions.Builder()
        .start("testString")
        .limit(Long.valueOf("10"))
        .build();

      // Invoke operation
      Response<IPsecPolicyCollection> response = service.listIpsecPolicies(listIpsecPoliciesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      IPsecPolicyCollection iPsecPolicyCollectionResult = response.getResult();
      assertNotNull(iPsecPolicyCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListIpsecPolicies" })
  public void testListIpsecPoliciesWithPager() throws Exception {
    try {
      ListIpsecPoliciesOptions options = new ListIpsecPoliciesOptions.Builder()
        .limit(Long.valueOf("10"))
        .build();

      // Test getNext().
      List<IPsecPolicy> allResults = new ArrayList<>();
      IpsecPoliciesPager pager = new IpsecPoliciesPager(service, options);
      while (pager.hasNext()) {
        List<IPsecPolicy> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new IpsecPoliciesPager(service, options);
      List<IPsecPolicy> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListIpsecPolicies" })
  public void testCreateIpsecPolicy() throws Exception {
    try {
      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
        .id("fee82deba12e4c0fb69c3b09d1f12345")
        .build();

      CreateIpsecPolicyOptions createIpsecPolicyOptions = new CreateIpsecPolicyOptions.Builder()
        .authenticationAlgorithm("disabled")
        .encryptionAlgorithm("aes128")
        .pfs("disabled")
        .keyLifetime(Long.valueOf("3600"))
        .name("my-ipsec-policy")
        .resourceGroup(resourceGroupIdentityModel)
        .build();

      // Invoke operation
      Response<IPsecPolicy> response = service.createIpsecPolicy(createIpsecPolicyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      IPsecPolicy iPsecPolicyResult = response.getResult();
      assertNotNull(iPsecPolicyResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateIpsecPolicy" })
  public void testGetIpsecPolicy() throws Exception {
    try {
      GetIpsecPolicyOptions getIpsecPolicyOptions = new GetIpsecPolicyOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<IPsecPolicy> response = service.getIpsecPolicy(getIpsecPolicyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      IPsecPolicy iPsecPolicyResult = response.getResult();
      assertNotNull(iPsecPolicyResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetIpsecPolicy" })
  public void testUpdateIpsecPolicy() throws Exception {
    try {
      IPsecPolicyPatch iPsecPolicyPatchModel = new IPsecPolicyPatch.Builder()
        .authenticationAlgorithm("disabled")
        .encryptionAlgorithm("aes128")
        .keyLifetime(Long.valueOf("3600"))
        .name("my-ipsec-policy")
        .pfs("disabled")
        .build();
      Map<String, Object> iPsecPolicyPatchModelAsPatch = iPsecPolicyPatchModel.asPatch();

      UpdateIpsecPolicyOptions updateIpsecPolicyOptions = new UpdateIpsecPolicyOptions.Builder()
        .id("testString")
        .iPsecPolicyPatch(iPsecPolicyPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<IPsecPolicy> response = service.updateIpsecPolicy(updateIpsecPolicyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      IPsecPolicy iPsecPolicyResult = response.getResult();
      assertNotNull(iPsecPolicyResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateIpsecPolicy" })
  public void testListIpsecPolicyConnections() throws Exception {
    try {
      ListIpsecPolicyConnectionsOptions listIpsecPolicyConnectionsOptions = new ListIpsecPolicyConnectionsOptions.Builder()
        .id("testString")
        .start("testString")
        .limit(Long.valueOf("10"))
        .build();

      // Invoke operation
      Response<IPsecPolicyConnectionCollection> response = service.listIpsecPolicyConnections(listIpsecPolicyConnectionsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      IPsecPolicyConnectionCollection iPsecPolicyConnectionCollectionResult = response.getResult();
      assertNotNull(iPsecPolicyConnectionCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListIpsecPolicyConnections" })
  public void testListIpsecPolicyConnectionsWithPager() throws Exception {
    try {
      ListIpsecPolicyConnectionsOptions options = new ListIpsecPolicyConnectionsOptions.Builder()
        .id("testString")
        .limit(Long.valueOf("10"))
        .build();

      // Test getNext().
      List<VPNGatewayConnection> allResults = new ArrayList<>();
      IpsecPolicyConnectionsPager pager = new IpsecPolicyConnectionsPager(service, options);
      while (pager.hasNext()) {
        List<VPNGatewayConnection> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new IpsecPolicyConnectionsPager(service, options);
      List<VPNGatewayConnection> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListIpsecPolicyConnections" })
  public void testListVpnGateways() throws Exception {
    try {
      ListVpnGatewaysOptions listVpnGatewaysOptions = new ListVpnGatewaysOptions.Builder()
        .start("testString")
        .limit(Long.valueOf("10"))
        .resourceGroupId("testString")
        .sort("name")
        .mode("policy")
        .build();

      // Invoke operation
      Response<VPNGatewayCollection> response = service.listVpnGateways(listVpnGatewaysOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VPNGatewayCollection vpnGatewayCollectionResult = response.getResult();
      assertNotNull(vpnGatewayCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListVpnGateways" })
  public void testListVpnGatewaysWithPager() throws Exception {
    try {
      ListVpnGatewaysOptions options = new ListVpnGatewaysOptions.Builder()
        .limit(Long.valueOf("10"))
        .resourceGroupId("testString")
        .sort("name")
        .mode("policy")
        .build();

      // Test getNext().
      List<VPNGateway> allResults = new ArrayList<>();
      VpnGatewaysPager pager = new VpnGatewaysPager(service, options);
      while (pager.hasNext()) {
        List<VPNGateway> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new VpnGatewaysPager(service, options);
      List<VPNGateway> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListVpnGateways" })
  public void testCreateVpnGateway() throws Exception {
    try {
      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
        .id("fee82deba12e4c0fb69c3b09d1f12345")
        .build();

      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
        .id("0717-7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
        .build();

      VPNGatewayPrototypeVPNGatewayRouteModePrototype vpnGatewayPrototypeModel = new VPNGatewayPrototypeVPNGatewayRouteModePrototype.Builder()
        .name("my-vpn-gateway")
        .resourceGroup(resourceGroupIdentityModel)
        .subnet(subnetIdentityModel)
        .mode("route")
        .build();

      CreateVpnGatewayOptions createVpnGatewayOptions = new CreateVpnGatewayOptions.Builder()
        .vpnGatewayPrototype(vpnGatewayPrototypeModel)
        .build();

      // Invoke operation
      Response<VPNGateway> response = service.createVpnGateway(createVpnGatewayOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      VPNGateway vpnGatewayResult = response.getResult();
      assertNotNull(vpnGatewayResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateVpnGateway" })
  public void testGetVpnGateway() throws Exception {
    try {
      GetVpnGatewayOptions getVpnGatewayOptions = new GetVpnGatewayOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<VPNGateway> response = service.getVpnGateway(getVpnGatewayOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VPNGateway vpnGatewayResult = response.getResult();
      assertNotNull(vpnGatewayResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetVpnGateway" })
  public void testUpdateVpnGateway() throws Exception {
    try {
      VPNGatewayPatch vpnGatewayPatchModel = new VPNGatewayPatch.Builder()
        .name("my-vpn-gateway-updated")
        .build();
      Map<String, Object> vpnGatewayPatchModelAsPatch = vpnGatewayPatchModel.asPatch();

      UpdateVpnGatewayOptions updateVpnGatewayOptions = new UpdateVpnGatewayOptions.Builder()
        .id("testString")
        .vpnGatewayPatch(vpnGatewayPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<VPNGateway> response = service.updateVpnGateway(updateVpnGatewayOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VPNGateway vpnGatewayResult = response.getResult();
      assertNotNull(vpnGatewayResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateVpnGateway" })
  public void testListVpnGatewayConnections() throws Exception {
    try {
      ListVpnGatewayConnectionsOptions listVpnGatewayConnectionsOptions = new ListVpnGatewayConnectionsOptions.Builder()
        .vpnGatewayId("testString")
        .start("testString")
        .limit(Long.valueOf("10"))
        .status("down")
        .build();

      // Invoke operation
      Response<VPNGatewayConnectionCollection> response = service.listVpnGatewayConnections(listVpnGatewayConnectionsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VPNGatewayConnectionCollection vpnGatewayConnectionCollectionResult = response.getResult();
      assertNotNull(vpnGatewayConnectionCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListVpnGatewayConnections" })
  public void testListVpnGatewayConnectionsWithPager() throws Exception {
    try {
      ListVpnGatewayConnectionsOptions options = new ListVpnGatewayConnectionsOptions.Builder()
        .vpnGatewayId("testString")
        .limit(Long.valueOf("10"))
        .status("down")
        .build();

      // Test getNext().
      List<VPNGatewayConnection> allResults = new ArrayList<>();
      VpnGatewayConnectionsPager pager = new VpnGatewayConnectionsPager(service, options);
      while (pager.hasNext()) {
        List<VPNGatewayConnection> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new VpnGatewayConnectionsPager(service, options);
      List<VPNGatewayConnection> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListVpnGatewayConnections" })
  public void testCreateVpnGatewayConnection() throws Exception {
    try {
      VPNGatewayConnectionDPDPrototype vpnGatewayConnectionDpdPrototypeModel = new VPNGatewayConnectionDPDPrototype.Builder()
        .action("restart")
        .interval(Long.valueOf("30"))
        .timeout(Long.valueOf("120"))
        .build();

      VPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityById vpnGatewayConnectionIkePolicyPrototypeModel = new VPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityById.Builder()
        .id("r006-e98f46a3-1e4e-4195-b4e5-b8155192689d")
        .build();

      VPNGatewayConnectionIPsecPolicyPrototypeIPsecPolicyIdentityById vpnGatewayConnectionIPsecPolicyPrototypeModel = new VPNGatewayConnectionIPsecPolicyPrototypeIPsecPolicyIdentityById.Builder()
        .id("r006-51eae621-dbbc-4c47-b623-b57a43c19876")
        .build();

      VPNGatewayConnectionIKEIdentityPrototypeVPNGatewayConnectionIKEIdentityFQDN vpnGatewayConnectionIkeIdentityPrototypeModel = new VPNGatewayConnectionIKEIdentityPrototypeVPNGatewayConnectionIKEIdentityFQDN.Builder()
        .type("fqdn")
        .value("my-service.example.com")
        .build();

      VPNGatewayConnectionStaticRouteModeLocalPrototype vpnGatewayConnectionStaticRouteModeLocalPrototypeModel = new VPNGatewayConnectionStaticRouteModeLocalPrototype.Builder()
        .ikeIdentities(java.util.Arrays.asList(vpnGatewayConnectionIkeIdentityPrototypeModel))
        .build();

      VPNGatewayConnectionStaticRouteModePeerPrototypeVPNGatewayConnectionPeerByAddress vpnGatewayConnectionStaticRouteModePeerPrototypeModel = new VPNGatewayConnectionStaticRouteModePeerPrototypeVPNGatewayConnectionPeerByAddress.Builder()
        .ikeIdentity(vpnGatewayConnectionIkeIdentityPrototypeModel)
        .address("192.0.2.5")
        .build();

      VPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototype vpnGatewayConnectionPrototypeModel = new VPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototype.Builder()
        .adminStateUp(true)
        .deadPeerDetection(vpnGatewayConnectionDpdPrototypeModel)
        .establishMode("bidirectional")
        .ikePolicy(vpnGatewayConnectionIkePolicyPrototypeModel)
        .ipsecPolicy(vpnGatewayConnectionIPsecPolicyPrototypeModel)
        .name("my-vpn-gateway-connection")
        .psk("lkj14b1oi0alcniejkso")
        .distributeTraffic(false)
        .local(vpnGatewayConnectionStaticRouteModeLocalPrototypeModel)
        .peer(vpnGatewayConnectionStaticRouteModePeerPrototypeModel)
        .routingProtocol("none")
        .build();

      CreateVpnGatewayConnectionOptions createVpnGatewayConnectionOptions = new CreateVpnGatewayConnectionOptions.Builder()
        .vpnGatewayId("testString")
        .vpnGatewayConnectionPrototype(vpnGatewayConnectionPrototypeModel)
        .build();

      // Invoke operation
      Response<VPNGatewayConnection> response = service.createVpnGatewayConnection(createVpnGatewayConnectionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      VPNGatewayConnection vpnGatewayConnectionResult = response.getResult();
      assertNotNull(vpnGatewayConnectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateVpnGatewayConnection" })
  public void testGetVpnGatewayConnection() throws Exception {
    try {
      GetVpnGatewayConnectionOptions getVpnGatewayConnectionOptions = new GetVpnGatewayConnectionOptions.Builder()
        .vpnGatewayId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<VPNGatewayConnection> response = service.getVpnGatewayConnection(getVpnGatewayConnectionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VPNGatewayConnection vpnGatewayConnectionResult = response.getResult();
      assertNotNull(vpnGatewayConnectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetVpnGatewayConnection" })
  public void testUpdateVpnGatewayConnection() throws Exception {
    try {
      VPNGatewayConnectionDPDPatch vpnGatewayConnectionDpdPatchModel = new VPNGatewayConnectionDPDPatch.Builder()
        .action("restart")
        .interval(Long.valueOf("30"))
        .timeout(Long.valueOf("120"))
        .build();

      VPNGatewayConnectionIKEPolicyPatchIKEPolicyIdentityById vpnGatewayConnectionIkePolicyPatchModel = new VPNGatewayConnectionIKEPolicyPatchIKEPolicyIdentityById.Builder()
        .id("r006-e98f46a3-1e4e-4195-b4e5-b8155192689d")
        .build();

      VPNGatewayConnectionIPsecPolicyPatchIPsecPolicyIdentityById vpnGatewayConnectionIPsecPolicyPatchModel = new VPNGatewayConnectionIPsecPolicyPatchIPsecPolicyIdentityById.Builder()
        .id("r006-51eae621-dbbc-4c47-b623-b57a43c19876")
        .build();

      VPNGatewayConnectionPeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPeerAddressPatch vpnGatewayConnectionPeerPatchModel = new VPNGatewayConnectionPeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPeerAddressPatch.Builder()
        .address("192.0.2.5")
        .build();

      VPNGatewayConnectionPatch vpnGatewayConnectionPatchModel = new VPNGatewayConnectionPatch.Builder()
        .adminStateUp(true)
        .deadPeerDetection(vpnGatewayConnectionDpdPatchModel)
        .distributeTraffic(true)
        .establishMode("bidirectional")
        .ikePolicy(vpnGatewayConnectionIkePolicyPatchModel)
        .ipsecPolicy(vpnGatewayConnectionIPsecPolicyPatchModel)
        .name("my-vpn-gateway-connection")
        .peer(vpnGatewayConnectionPeerPatchModel)
        .psk("lkj14b1oi0alcniejkso")
        .build();
      Map<String, Object> vpnGatewayConnectionPatchModelAsPatch = vpnGatewayConnectionPatchModel.asPatch();

      UpdateVpnGatewayConnectionOptions updateVpnGatewayConnectionOptions = new UpdateVpnGatewayConnectionOptions.Builder()
        .vpnGatewayId("testString")
        .id("testString")
        .vpnGatewayConnectionPatch(vpnGatewayConnectionPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<VPNGatewayConnection> response = service.updateVpnGatewayConnection(updateVpnGatewayConnectionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VPNGatewayConnection vpnGatewayConnectionResult = response.getResult();
      assertNotNull(vpnGatewayConnectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateVpnGatewayConnection" })
  public void testListVpnGatewayConnectionsLocalCidrs() throws Exception {
    try {
      ListVpnGatewayConnectionsLocalCidrsOptions listVpnGatewayConnectionsLocalCidrsOptions = new ListVpnGatewayConnectionsLocalCidrsOptions.Builder()
        .vpnGatewayId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<VPNGatewayConnectionCIDRs> response = service.listVpnGatewayConnectionsLocalCidrs(listVpnGatewayConnectionsLocalCidrsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VPNGatewayConnectionCIDRs vpnGatewayConnectionCidRsResult = response.getResult();
      assertNotNull(vpnGatewayConnectionCidRsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListVpnGatewayConnectionsLocalCidrs" })
  public void testCheckVpnGatewayConnectionsLocalCidr() throws Exception {
    try {
      CheckVpnGatewayConnectionsLocalCidrOptions checkVpnGatewayConnectionsLocalCidrOptions = new CheckVpnGatewayConnectionsLocalCidrOptions.Builder()
        .vpnGatewayId("testString")
        .id("testString")
        .cidr("192.168.1.0/24")
        .build();

      // Invoke operation
      Response<Void> response = service.checkVpnGatewayConnectionsLocalCidr(checkVpnGatewayConnectionsLocalCidrOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCheckVpnGatewayConnectionsLocalCidr" })
  public void testAddVpnGatewayConnectionsLocalCidr() throws Exception {
    try {
      AddVpnGatewayConnectionsLocalCidrOptions addVpnGatewayConnectionsLocalCidrOptions = new AddVpnGatewayConnectionsLocalCidrOptions.Builder()
        .vpnGatewayId("testString")
        .id("testString")
        .cidr("192.168.1.0/24")
        .build();

      // Invoke operation
      Response<Void> response = service.addVpnGatewayConnectionsLocalCidr(addVpnGatewayConnectionsLocalCidrOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testAddVpnGatewayConnectionsLocalCidr" })
  public void testListVpnGatewayConnectionsPeerCidrs() throws Exception {
    try {
      ListVpnGatewayConnectionsPeerCidrsOptions listVpnGatewayConnectionsPeerCidrsOptions = new ListVpnGatewayConnectionsPeerCidrsOptions.Builder()
        .vpnGatewayId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<VPNGatewayConnectionCIDRs> response = service.listVpnGatewayConnectionsPeerCidrs(listVpnGatewayConnectionsPeerCidrsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VPNGatewayConnectionCIDRs vpnGatewayConnectionCidRsResult = response.getResult();
      assertNotNull(vpnGatewayConnectionCidRsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListVpnGatewayConnectionsPeerCidrs" })
  public void testCheckVpnGatewayConnectionsPeerCidr() throws Exception {
    try {
      CheckVpnGatewayConnectionsPeerCidrOptions checkVpnGatewayConnectionsPeerCidrOptions = new CheckVpnGatewayConnectionsPeerCidrOptions.Builder()
        .vpnGatewayId("testString")
        .id("testString")
        .cidr("192.168.1.0/24")
        .build();

      // Invoke operation
      Response<Void> response = service.checkVpnGatewayConnectionsPeerCidr(checkVpnGatewayConnectionsPeerCidrOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCheckVpnGatewayConnectionsPeerCidr" })
  public void testAddVpnGatewayConnectionsPeerCidr() throws Exception {
    try {
      AddVpnGatewayConnectionsPeerCidrOptions addVpnGatewayConnectionsPeerCidrOptions = new AddVpnGatewayConnectionsPeerCidrOptions.Builder()
        .vpnGatewayId("testString")
        .id("testString")
        .cidr("192.168.1.0/24")
        .build();

      // Invoke operation
      Response<Void> response = service.addVpnGatewayConnectionsPeerCidr(addVpnGatewayConnectionsPeerCidrOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testAddVpnGatewayConnectionsPeerCidr" })
  public void testListVpnServers() throws Exception {
    try {
      ListVpnServersOptions listVpnServersOptions = new ListVpnServersOptions.Builder()
        .name("my-name")
        .start("testString")
        .limit(Long.valueOf("10"))
        .resourceGroupId("testString")
        .sort("name")
        .build();

      // Invoke operation
      Response<VPNServerCollection> response = service.listVpnServers(listVpnServersOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VPNServerCollection vpnServerCollectionResult = response.getResult();
      assertNotNull(vpnServerCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListVpnServers" })
  public void testListVpnServersWithPager() throws Exception {
    try {
      ListVpnServersOptions options = new ListVpnServersOptions.Builder()
        .name("my-name")
        .limit(Long.valueOf("10"))
        .resourceGroupId("testString")
        .sort("name")
        .build();

      // Test getNext().
      List<VPNServer> allResults = new ArrayList<>();
      VpnServersPager pager = new VpnServersPager(service, options);
      while (pager.hasNext()) {
        List<VPNServer> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new VpnServersPager(service, options);
      List<VPNServer> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListVpnServers" })
  public void testCreateVpnServer() throws Exception {
    try {
      CertificateInstanceIdentityByCRN certificateInstanceIdentityModel = new CertificateInstanceIdentityByCRN.Builder()
        .crn("crn:v1:bluemix:public:secrets-manager:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34:36fa422d-080d-4d83-8d2d-86851b4001df:secret:2e786aab-42fa-63ed-14f8-d66d552f4dd5")
        .build();

      VPNServerAuthenticationByUsernameIdProviderByIAM vpnServerAuthenticationByUsernameIdProviderModel = new VPNServerAuthenticationByUsernameIdProviderByIAM.Builder()
        .providerType("iam")
        .build();

      VPNServerAuthenticationPrototypeVPNServerAuthenticationByUsernamePrototype vpnServerAuthenticationPrototypeModel = new VPNServerAuthenticationPrototypeVPNServerAuthenticationByUsernamePrototype.Builder()
        .method("certificate")
        .identityProvider(vpnServerAuthenticationByUsernameIdProviderModel)
        .build();

      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
        .id("0717-7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
        .build();

      IP ipModel = new IP.Builder()
        .address("192.168.3.4")
        .build();

      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
        .id("fee82deba12e4c0fb69c3b09d1f12345")
        .build();

      SecurityGroupIdentityById securityGroupIdentityModel = new SecurityGroupIdentityById.Builder()
        .id("r006-be5df5ca-12a0-494b-907e-aa6ec2bfa271")
        .build();

      CreateVpnServerOptions createVpnServerOptions = new CreateVpnServerOptions.Builder()
        .certificate(certificateInstanceIdentityModel)
        .clientAuthentication(java.util.Arrays.asList(vpnServerAuthenticationPrototypeModel))
        .clientIpPool("172.16.0.0/16")
        .subnets(java.util.Arrays.asList(subnetIdentityModel))
        .clientDnsServerIps(java.util.Arrays.asList(ipModel))
        .clientIdleTimeout(Long.valueOf("600"))
        .enableSplitTunneling(false)
        .name("my-vpn-server")
        .port(Long.valueOf("443"))
        .protocol("udp")
        .resourceGroup(resourceGroupIdentityModel)
        .securityGroups(java.util.Arrays.asList(securityGroupIdentityModel))
        .build();

      // Invoke operation
      Response<VPNServer> response = service.createVpnServer(createVpnServerOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      VPNServer vpnServerResult = response.getResult();
      assertNotNull(vpnServerResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateVpnServer" })
  public void testGetVpnServer() throws Exception {
    try {
      GetVpnServerOptions getVpnServerOptions = new GetVpnServerOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<VPNServer> response = service.getVpnServer(getVpnServerOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VPNServer vpnServerResult = response.getResult();
      assertNotNull(vpnServerResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetVpnServer" })
  public void testUpdateVpnServer() throws Exception {
    try {
      CertificateInstanceIdentityByCRN certificateInstanceIdentityModel = new CertificateInstanceIdentityByCRN.Builder()
        .crn("crn:v1:bluemix:public:secrets-manager:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34:36fa422d-080d-4d83-8d2d-86851b4001df:secret:2e786aab-42fa-63ed-14f8-d66d552f4dd5")
        .build();

      VPNServerAuthenticationByUsernameIdProviderByIAM vpnServerAuthenticationByUsernameIdProviderModel = new VPNServerAuthenticationByUsernameIdProviderByIAM.Builder()
        .providerType("iam")
        .build();

      VPNServerAuthenticationPrototypeVPNServerAuthenticationByUsernamePrototype vpnServerAuthenticationPrototypeModel = new VPNServerAuthenticationPrototypeVPNServerAuthenticationByUsernamePrototype.Builder()
        .method("certificate")
        .identityProvider(vpnServerAuthenticationByUsernameIdProviderModel)
        .build();

      IP ipModel = new IP.Builder()
        .address("192.168.3.4")
        .build();

      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
        .id("0717-7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
        .build();

      VPNServerPatch vpnServerPatchModel = new VPNServerPatch.Builder()
        .certificate(certificateInstanceIdentityModel)
        .clientAuthentication(java.util.Arrays.asList(vpnServerAuthenticationPrototypeModel))
        .clientDnsServerIps(java.util.Arrays.asList(ipModel))
        .clientIdleTimeout(Long.valueOf("600"))
        .clientIpPool("172.16.0.0/16")
        .enableSplitTunneling(true)
        .name("my-vpn-server-updated")
        .port(Long.valueOf("443"))
        .protocol("tcp")
        .subnets(java.util.Arrays.asList(subnetIdentityModel))
        .build();
      Map<String, Object> vpnServerPatchModelAsPatch = vpnServerPatchModel.asPatch();

      UpdateVpnServerOptions updateVpnServerOptions = new UpdateVpnServerOptions.Builder()
        .id("testString")
        .vpnServerPatch(vpnServerPatchModelAsPatch)
        .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
        .build();

      // Invoke operation
      Response<VPNServer> response = service.updateVpnServer(updateVpnServerOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VPNServer vpnServerResult = response.getResult();
      assertNotNull(vpnServerResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateVpnServer" })
  public void testGetVpnServerClientConfiguration() throws Exception {
    try {
      GetVpnServerClientConfigurationOptions getVpnServerClientConfigurationOptions = new GetVpnServerClientConfigurationOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<String> response = service.getVpnServerClientConfiguration(getVpnServerClientConfigurationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      String resultResult = response.getResult();
      assertNotNull(resultResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetVpnServerClientConfiguration" })
  public void testListVpnServerClients() throws Exception {
    try {
      ListVpnServerClientsOptions listVpnServerClientsOptions = new ListVpnServerClientsOptions.Builder()
        .vpnServerId("testString")
        .start("testString")
        .limit(Long.valueOf("10"))
        .sort("created_at")
        .build();

      // Invoke operation
      Response<VPNServerClientCollection> response = service.listVpnServerClients(listVpnServerClientsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VPNServerClientCollection vpnServerClientCollectionResult = response.getResult();
      assertNotNull(vpnServerClientCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListVpnServerClients" })
  public void testListVpnServerClientsWithPager() throws Exception {
    try {
      ListVpnServerClientsOptions options = new ListVpnServerClientsOptions.Builder()
        .vpnServerId("testString")
        .limit(Long.valueOf("10"))
        .sort("created_at")
        .build();

      // Test getNext().
      List<VPNServerClient> allResults = new ArrayList<>();
      VpnServerClientsPager pager = new VpnServerClientsPager(service, options);
      while (pager.hasNext()) {
        List<VPNServerClient> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new VpnServerClientsPager(service, options);
      List<VPNServerClient> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListVpnServerClients" })
  public void testGetVpnServerClient() throws Exception {
    try {
      GetVpnServerClientOptions getVpnServerClientOptions = new GetVpnServerClientOptions.Builder()
        .vpnServerId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<VPNServerClient> response = service.getVpnServerClient(getVpnServerClientOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VPNServerClient vpnServerClientResult = response.getResult();
      assertNotNull(vpnServerClientResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetVpnServerClient" })
  public void testDisconnectVpnClient() throws Exception {
    try {
      DisconnectVpnClientOptions disconnectVpnClientOptions = new DisconnectVpnClientOptions.Builder()
        .vpnServerId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.disconnectVpnClient(disconnectVpnClientOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDisconnectVpnClient" })
  public void testListVpnServerRoutes() throws Exception {
    try {
      ListVpnServerRoutesOptions listVpnServerRoutesOptions = new ListVpnServerRoutesOptions.Builder()
        .vpnServerId("testString")
        .start("testString")
        .limit(Long.valueOf("10"))
        .sort("name")
        .build();

      // Invoke operation
      Response<VPNServerRouteCollection> response = service.listVpnServerRoutes(listVpnServerRoutesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VPNServerRouteCollection vpnServerRouteCollectionResult = response.getResult();
      assertNotNull(vpnServerRouteCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListVpnServerRoutes" })
  public void testListVpnServerRoutesWithPager() throws Exception {
    try {
      ListVpnServerRoutesOptions options = new ListVpnServerRoutesOptions.Builder()
        .vpnServerId("testString")
        .limit(Long.valueOf("10"))
        .sort("name")
        .build();

      // Test getNext().
      List<VPNServerRoute> allResults = new ArrayList<>();
      VpnServerRoutesPager pager = new VpnServerRoutesPager(service, options);
      while (pager.hasNext()) {
        List<VPNServerRoute> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new VpnServerRoutesPager(service, options);
      List<VPNServerRoute> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListVpnServerRoutes" })
  public void testCreateVpnServerRoute() throws Exception {
    try {
      CreateVpnServerRouteOptions createVpnServerRouteOptions = new CreateVpnServerRouteOptions.Builder()
        .vpnServerId("testString")
        .destination("172.16.0.0/16")
        .action("deliver")
        .name("my-vpn-route-2")
        .build();

      // Invoke operation
      Response<VPNServerRoute> response = service.createVpnServerRoute(createVpnServerRouteOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      VPNServerRoute vpnServerRouteResult = response.getResult();
      assertNotNull(vpnServerRouteResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateVpnServerRoute" })
  public void testGetVpnServerRoute() throws Exception {
    try {
      GetVpnServerRouteOptions getVpnServerRouteOptions = new GetVpnServerRouteOptions.Builder()
        .vpnServerId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<VPNServerRoute> response = service.getVpnServerRoute(getVpnServerRouteOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VPNServerRoute vpnServerRouteResult = response.getResult();
      assertNotNull(vpnServerRouteResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetVpnServerRoute" })
  public void testUpdateVpnServerRoute() throws Exception {
    try {
      VPNServerRoutePatch vpnServerRoutePatchModel = new VPNServerRoutePatch.Builder()
        .name("my-vpn-server-route-updated")
        .build();
      Map<String, Object> vpnServerRoutePatchModelAsPatch = vpnServerRoutePatchModel.asPatch();

      UpdateVpnServerRouteOptions updateVpnServerRouteOptions = new UpdateVpnServerRouteOptions.Builder()
        .vpnServerId("testString")
        .id("testString")
        .vpnServerRoutePatch(vpnServerRoutePatchModelAsPatch)
        .build();

      // Invoke operation
      Response<VPNServerRoute> response = service.updateVpnServerRoute(updateVpnServerRouteOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VPNServerRoute vpnServerRouteResult = response.getResult();
      assertNotNull(vpnServerRouteResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateVpnServerRoute" })
  public void testListLoadBalancerProfiles() throws Exception {
    try {
      ListLoadBalancerProfilesOptions listLoadBalancerProfilesOptions = new ListLoadBalancerProfilesOptions.Builder()
        .start("testString")
        .limit(Long.valueOf("10"))
        .build();

      // Invoke operation
      Response<LoadBalancerProfileCollection> response = service.listLoadBalancerProfiles(listLoadBalancerProfilesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancerProfileCollection loadBalancerProfileCollectionResult = response.getResult();
      assertNotNull(loadBalancerProfileCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListLoadBalancerProfiles" })
  public void testListLoadBalancerProfilesWithPager() throws Exception {
    try {
      ListLoadBalancerProfilesOptions options = new ListLoadBalancerProfilesOptions.Builder()
        .limit(Long.valueOf("10"))
        .build();

      // Test getNext().
      List<LoadBalancerProfile> allResults = new ArrayList<>();
      LoadBalancerProfilesPager pager = new LoadBalancerProfilesPager(service, options);
      while (pager.hasNext()) {
        List<LoadBalancerProfile> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new LoadBalancerProfilesPager(service, options);
      List<LoadBalancerProfile> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListLoadBalancerProfiles" })
  public void testGetLoadBalancerProfile() throws Exception {
    try {
      GetLoadBalancerProfileOptions getLoadBalancerProfileOptions = new GetLoadBalancerProfileOptions.Builder()
        .name("network-fixed")
        .build();

      // Invoke operation
      Response<LoadBalancerProfile> response = service.getLoadBalancerProfile(getLoadBalancerProfileOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancerProfile loadBalancerProfileResult = response.getResult();
      assertNotNull(loadBalancerProfileResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetLoadBalancerProfile" })
  public void testListLoadBalancers() throws Exception {
    try {
      ListLoadBalancersOptions listLoadBalancersOptions = new ListLoadBalancersOptions.Builder()
        .start("testString")
        .limit(Long.valueOf("10"))
        .build();

      // Invoke operation
      Response<LoadBalancerCollection> response = service.listLoadBalancers(listLoadBalancersOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancerCollection loadBalancerCollectionResult = response.getResult();
      assertNotNull(loadBalancerCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListLoadBalancers" })
  public void testListLoadBalancersWithPager() throws Exception {
    try {
      ListLoadBalancersOptions options = new ListLoadBalancersOptions.Builder()
        .limit(Long.valueOf("10"))
        .build();

      // Test getNext().
      List<LoadBalancer> allResults = new ArrayList<>();
      LoadBalancersPager pager = new LoadBalancersPager(service, options);
      while (pager.hasNext()) {
        List<LoadBalancer> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new LoadBalancersPager(service, options);
      List<LoadBalancer> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListLoadBalancers" })
  public void testCreateLoadBalancer() throws Exception {
    try {
      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
        .id("0717-7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
        .build();

      DNSInstanceIdentityByCRN dnsInstanceIdentityModel = new DNSInstanceIdentityByCRN.Builder()
        .crn("crn:v1:bluemix:public:dns-svcs:global:a/bb1b52262f7441a586f49068482f1e60:f761b566-030a-4696-8649-cc9d09889e88::")
        .build();

      DNSZoneIdentityById dnsZoneIdentityModel = new DNSZoneIdentityById.Builder()
        .id("d66662cc-aa23-4fe1-9987-858487a61f45")
        .build();

      LoadBalancerDNSPrototype loadBalancerDnsPrototypeModel = new LoadBalancerDNSPrototype.Builder()
        .instance(dnsInstanceIdentityModel)
        .zone(dnsZoneIdentityModel)
        .build();

      CertificateInstanceIdentityByCRN certificateInstanceIdentityModel = new CertificateInstanceIdentityByCRN.Builder()
        .crn("crn:v1:bluemix:public:secrets-manager:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34:36fa422d-080d-4d83-8d2d-86851b4001df:secret:2e786aab-42fa-63ed-14f8-d66d552f4dd5")
        .build();

      LoadBalancerPoolIdentityByName loadBalancerPoolIdentityByNameModel = new LoadBalancerPoolIdentityByName.Builder()
        .name("my-load-balancer-pool")
        .build();

      LoadBalancerListenerIdentityById loadBalancerListenerIdentityModel = new LoadBalancerListenerIdentityById.Builder()
        .id("r006-97c05c26-4748-4db8-ac3f-d8a9c79a7091")
        .build();

      LoadBalancerListenerHTTPSRedirectPrototype loadBalancerListenerHttpsRedirectPrototypeModel = new LoadBalancerListenerHTTPSRedirectPrototype.Builder()
        .httpStatusCode(Long.valueOf("301"))
        .listener(loadBalancerListenerIdentityModel)
        .uri("/example?doc=get")
        .build();

      LoadBalancerListenerPrototypeLoadBalancerContext loadBalancerListenerPrototypeLoadBalancerContextModel = new LoadBalancerListenerPrototypeLoadBalancerContext.Builder()
        .acceptProxyProtocol(true)
        .certificateInstance(certificateInstanceIdentityModel)
        .connectionLimit(Long.valueOf("2000"))
        .defaultPool(loadBalancerPoolIdentityByNameModel)
        .httpsRedirect(loadBalancerListenerHttpsRedirectPrototypeModel)
        .idleConnectionTimeout(Long.valueOf("100"))
        .port(Long.valueOf("443"))
        .portMax(Long.valueOf("499"))
        .portMin(Long.valueOf("443"))
        .protocol("http")
        .build();

      LoadBalancerLoggingDatapathPrototype loadBalancerLoggingDatapathPrototypeModel = new LoadBalancerLoggingDatapathPrototype.Builder()
        .active(true)
        .build();

      LoadBalancerLoggingPrototype loadBalancerLoggingPrototypeModel = new LoadBalancerLoggingPrototype.Builder()
        .datapath(loadBalancerLoggingDatapathPrototypeModel)
        .build();

      LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTCPPrototype loadBalancerPoolHealthMonitorPrototypeModel = new LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTCPPrototype.Builder()
        .delay(Long.valueOf("5"))
        .maxRetries(Long.valueOf("2"))
        .port(Long.valueOf("22"))
        .timeout(Long.valueOf("2"))
        .type("tcp")
        .build();

      LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById loadBalancerPoolMemberTargetPrototypeModel = new LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById.Builder()
        .id("0717_e21b7391-2ca2-4ab5-84a8-b92157a633b0")
        .build();

      LoadBalancerPoolMemberPrototype loadBalancerPoolMemberPrototypeModel = new LoadBalancerPoolMemberPrototype.Builder()
        .port(Long.valueOf("80"))
        .target(loadBalancerPoolMemberTargetPrototypeModel)
        .weight(Long.valueOf("50"))
        .build();

      LoadBalancerPoolSessionPersistencePrototype loadBalancerPoolSessionPersistencePrototypeModel = new LoadBalancerPoolSessionPersistencePrototype.Builder()
        .cookieName("my-cookie-name")
        .type("app_cookie")
        .build();

      LoadBalancerPoolPrototypeLoadBalancerContext loadBalancerPoolPrototypeLoadBalancerContextModel = new LoadBalancerPoolPrototypeLoadBalancerContext.Builder()
        .algorithm("least_connections")
        .healthMonitor(loadBalancerPoolHealthMonitorPrototypeModel)
        .members(java.util.Arrays.asList(loadBalancerPoolMemberPrototypeModel))
        .name("my-load-balancer-pool")
        .protocol("http")
        .proxyProtocol("disabled")
        .sessionPersistence(loadBalancerPoolSessionPersistencePrototypeModel)
        .build();

      LoadBalancerProfileIdentityByName loadBalancerProfileIdentityModel = new LoadBalancerProfileIdentityByName.Builder()
        .name("network-fixed")
        .build();

      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
        .id("fee82deba12e4c0fb69c3b09d1f12345")
        .build();

      SecurityGroupIdentityById securityGroupIdentityModel = new SecurityGroupIdentityById.Builder()
        .id("r006-be5df5ca-12a0-494b-907e-aa6ec2bfa271")
        .build();

      CreateLoadBalancerOptions createLoadBalancerOptions = new CreateLoadBalancerOptions.Builder()
        .isPublic(true)
        .subnets(java.util.Arrays.asList(subnetIdentityModel))
        .dns(loadBalancerDnsPrototypeModel)
        .isPrivatePath(true)
        .listeners(java.util.Arrays.asList(loadBalancerListenerPrototypeLoadBalancerContextModel))
        .logging(loadBalancerLoggingPrototypeModel)
        .name("my-load-balancer")
        .pools(java.util.Arrays.asList(loadBalancerPoolPrototypeLoadBalancerContextModel))
        .profile(loadBalancerProfileIdentityModel)
        .resourceGroup(resourceGroupIdentityModel)
        .routeMode(true)
        .securityGroups(java.util.Arrays.asList(securityGroupIdentityModel))
        .build();

      // Invoke operation
      Response<LoadBalancer> response = service.createLoadBalancer(createLoadBalancerOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      LoadBalancer loadBalancerResult = response.getResult();
      assertNotNull(loadBalancerResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateLoadBalancer" })
  public void testGetLoadBalancer() throws Exception {
    try {
      GetLoadBalancerOptions getLoadBalancerOptions = new GetLoadBalancerOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<LoadBalancer> response = service.getLoadBalancer(getLoadBalancerOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancer loadBalancerResult = response.getResult();
      assertNotNull(loadBalancerResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetLoadBalancer" })
  public void testUpdateLoadBalancer() throws Exception {
    try {
      DNSInstanceIdentityByCRN dnsInstanceIdentityModel = new DNSInstanceIdentityByCRN.Builder()
        .crn("crn:v1:bluemix:public:dns-svcs:global:a/bb1b52262f7441a586f49068482f1e60:f761b566-030a-4696-8649-cc9d09889e88::")
        .build();

      DNSZoneIdentityById dnsZoneIdentityModel = new DNSZoneIdentityById.Builder()
        .id("d66662cc-aa23-4fe1-9987-858487a61f45")
        .build();

      LoadBalancerDNSPatch loadBalancerDnsPatchModel = new LoadBalancerDNSPatch.Builder()
        .instance(dnsInstanceIdentityModel)
        .zone(dnsZoneIdentityModel)
        .build();

      LoadBalancerLoggingDatapathPatch loadBalancerLoggingDatapathPatchModel = new LoadBalancerLoggingDatapathPatch.Builder()
        .active(true)
        .build();

      LoadBalancerLoggingPatch loadBalancerLoggingPatchModel = new LoadBalancerLoggingPatch.Builder()
        .datapath(loadBalancerLoggingDatapathPatchModel)
        .build();

      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
        .id("0717-7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
        .build();

      LoadBalancerPatch loadBalancerPatchModel = new LoadBalancerPatch.Builder()
        .dns(loadBalancerDnsPatchModel)
        .logging(loadBalancerLoggingPatchModel)
        .name("my-load-balancer")
        .subnets(java.util.Arrays.asList(subnetIdentityModel))
        .build();
      Map<String, Object> loadBalancerPatchModelAsPatch = loadBalancerPatchModel.asPatch();

      UpdateLoadBalancerOptions updateLoadBalancerOptions = new UpdateLoadBalancerOptions.Builder()
        .id("testString")
        .loadBalancerPatch(loadBalancerPatchModelAsPatch)
        .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
        .build();

      // Invoke operation
      Response<LoadBalancer> response = service.updateLoadBalancer(updateLoadBalancerOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancer loadBalancerResult = response.getResult();
      assertNotNull(loadBalancerResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateLoadBalancer" })
  public void testGetLoadBalancerStatistics() throws Exception {
    try {
      GetLoadBalancerStatisticsOptions getLoadBalancerStatisticsOptions = new GetLoadBalancerStatisticsOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<LoadBalancerStatistics> response = service.getLoadBalancerStatistics(getLoadBalancerStatisticsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancerStatistics loadBalancerStatisticsResult = response.getResult();
      assertNotNull(loadBalancerStatisticsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetLoadBalancerStatistics" })
  public void testListLoadBalancerListeners() throws Exception {
    try {
      ListLoadBalancerListenersOptions listLoadBalancerListenersOptions = new ListLoadBalancerListenersOptions.Builder()
        .loadBalancerId("testString")
        .build();

      // Invoke operation
      Response<LoadBalancerListenerCollection> response = service.listLoadBalancerListeners(listLoadBalancerListenersOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancerListenerCollection loadBalancerListenerCollectionResult = response.getResult();
      assertNotNull(loadBalancerListenerCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListLoadBalancerListeners" })
  public void testCreateLoadBalancerListener() throws Exception {
    try {
      CertificateInstanceIdentityByCRN certificateInstanceIdentityModel = new CertificateInstanceIdentityByCRN.Builder()
        .crn("crn:v1:bluemix:public:secrets-manager:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34:36fa422d-080d-4d83-8d2d-86851b4001df:secret:2e786aab-42fa-63ed-14f8-d66d552f4dd5")
        .build();

      LoadBalancerPoolIdentityLoadBalancerPoolIdentityById loadBalancerPoolIdentityModel = new LoadBalancerPoolIdentityLoadBalancerPoolIdentityById.Builder()
        .id("r006-70294e14-4e61-11e8-bcf4-0242ac110004")
        .build();

      LoadBalancerListenerIdentityById loadBalancerListenerIdentityModel = new LoadBalancerListenerIdentityById.Builder()
        .id("r006-97c05c26-4748-4db8-ac3f-d8a9c79a7091")
        .build();

      LoadBalancerListenerHTTPSRedirectPrototype loadBalancerListenerHttpsRedirectPrototypeModel = new LoadBalancerListenerHTTPSRedirectPrototype.Builder()
        .httpStatusCode(Long.valueOf("301"))
        .listener(loadBalancerListenerIdentityModel)
        .uri("/example?doc=get")
        .build();

      LoadBalancerListenerPolicyRulePrototype loadBalancerListenerPolicyRulePrototypeModel = new LoadBalancerListenerPolicyRulePrototype.Builder()
        .condition("contains")
        .field("MY-APP-HEADER")
        .type("body")
        .value("testString")
        .build();

      LoadBalancerListenerPolicyTargetPrototypeLoadBalancerPoolIdentityLoadBalancerPoolIdentityLoadBalancerPoolIdentityById loadBalancerListenerPolicyTargetPrototypeModel = new LoadBalancerListenerPolicyTargetPrototypeLoadBalancerPoolIdentityLoadBalancerPoolIdentityLoadBalancerPoolIdentityById.Builder()
        .id("r006-70294e14-4e61-11e8-bcf4-0242ac110004")
        .build();

      LoadBalancerListenerPolicyPrototype loadBalancerListenerPolicyPrototypeModel = new LoadBalancerListenerPolicyPrototype.Builder()
        .action("forward_to_listener")
        .name("my-load-balancer-listener-policy")
        .priority(Long.valueOf("5"))
        .rules(java.util.Arrays.asList(loadBalancerListenerPolicyRulePrototypeModel))
        .target(loadBalancerListenerPolicyTargetPrototypeModel)
        .build();

      CreateLoadBalancerListenerOptions createLoadBalancerListenerOptions = new CreateLoadBalancerListenerOptions.Builder()
        .loadBalancerId("testString")
        .protocol("http")
        .acceptProxyProtocol(true)
        .certificateInstance(certificateInstanceIdentityModel)
        .connectionLimit(Long.valueOf("2000"))
        .defaultPool(loadBalancerPoolIdentityModel)
        .httpsRedirect(loadBalancerListenerHttpsRedirectPrototypeModel)
        .idleConnectionTimeout(Long.valueOf("100"))
        .policies(java.util.Arrays.asList(loadBalancerListenerPolicyPrototypeModel))
        .port(Long.valueOf("443"))
        .portMax(Long.valueOf("499"))
        .portMin(Long.valueOf("443"))
        .build();

      // Invoke operation
      Response<LoadBalancerListener> response = service.createLoadBalancerListener(createLoadBalancerListenerOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      LoadBalancerListener loadBalancerListenerResult = response.getResult();
      assertNotNull(loadBalancerListenerResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateLoadBalancerListener" })
  public void testGetLoadBalancerListener() throws Exception {
    try {
      GetLoadBalancerListenerOptions getLoadBalancerListenerOptions = new GetLoadBalancerListenerOptions.Builder()
        .loadBalancerId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<LoadBalancerListener> response = service.getLoadBalancerListener(getLoadBalancerListenerOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancerListener loadBalancerListenerResult = response.getResult();
      assertNotNull(loadBalancerListenerResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetLoadBalancerListener" })
  public void testUpdateLoadBalancerListener() throws Exception {
    try {
      CertificateInstanceIdentityByCRN certificateInstanceIdentityModel = new CertificateInstanceIdentityByCRN.Builder()
        .crn("crn:v1:bluemix:public:secrets-manager:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34:36fa422d-080d-4d83-8d2d-86851b4001df:secret:2e786aab-42fa-63ed-14f8-d66d552f4dd5")
        .build();

      LoadBalancerListenerDefaultPoolPatchLoadBalancerPoolIdentityById loadBalancerListenerDefaultPoolPatchModel = new LoadBalancerListenerDefaultPoolPatchLoadBalancerPoolIdentityById.Builder()
        .id("r006-70294e14-4e61-11e8-bcf4-0242ac110004")
        .build();

      LoadBalancerListenerIdentityById loadBalancerListenerIdentityModel = new LoadBalancerListenerIdentityById.Builder()
        .id("r006-97c05c26-4748-4db8-ac3f-d8a9c79a7091")
        .build();

      LoadBalancerListenerHTTPSRedirectPatch loadBalancerListenerHttpsRedirectPatchModel = new LoadBalancerListenerHTTPSRedirectPatch.Builder()
        .httpStatusCode(Long.valueOf("301"))
        .listener(loadBalancerListenerIdentityModel)
        .uri("/example?doc=get")
        .build();

      LoadBalancerListenerPatch loadBalancerListenerPatchModel = new LoadBalancerListenerPatch.Builder()
        .acceptProxyProtocol(true)
        .certificateInstance(certificateInstanceIdentityModel)
        .connectionLimit(Long.valueOf("2000"))
        .defaultPool(loadBalancerListenerDefaultPoolPatchModel)
        .httpsRedirect(loadBalancerListenerHttpsRedirectPatchModel)
        .idleConnectionTimeout(Long.valueOf("100"))
        .port(Long.valueOf("443"))
        .portMax(Long.valueOf("499"))
        .portMin(Long.valueOf("443"))
        .protocol("http")
        .build();
      Map<String, Object> loadBalancerListenerPatchModelAsPatch = loadBalancerListenerPatchModel.asPatch();

      UpdateLoadBalancerListenerOptions updateLoadBalancerListenerOptions = new UpdateLoadBalancerListenerOptions.Builder()
        .loadBalancerId("testString")
        .id("testString")
        .loadBalancerListenerPatch(loadBalancerListenerPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<LoadBalancerListener> response = service.updateLoadBalancerListener(updateLoadBalancerListenerOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancerListener loadBalancerListenerResult = response.getResult();
      assertNotNull(loadBalancerListenerResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateLoadBalancerListener" })
  public void testListLoadBalancerListenerPolicies() throws Exception {
    try {
      ListLoadBalancerListenerPoliciesOptions listLoadBalancerListenerPoliciesOptions = new ListLoadBalancerListenerPoliciesOptions.Builder()
        .loadBalancerId("testString")
        .listenerId("testString")
        .build();

      // Invoke operation
      Response<LoadBalancerListenerPolicyCollection> response = service.listLoadBalancerListenerPolicies(listLoadBalancerListenerPoliciesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancerListenerPolicyCollection loadBalancerListenerPolicyCollectionResult = response.getResult();
      assertNotNull(loadBalancerListenerPolicyCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListLoadBalancerListenerPolicies" })
  public void testCreateLoadBalancerListenerPolicy() throws Exception {
    try {
      LoadBalancerListenerPolicyRulePrototype loadBalancerListenerPolicyRulePrototypeModel = new LoadBalancerListenerPolicyRulePrototype.Builder()
        .condition("contains")
        .field("MY-APP-HEADER")
        .type("body")
        .value("testString")
        .build();

      LoadBalancerListenerPolicyTargetPrototypeLoadBalancerPoolIdentityLoadBalancerPoolIdentityLoadBalancerPoolIdentityById loadBalancerListenerPolicyTargetPrototypeModel = new LoadBalancerListenerPolicyTargetPrototypeLoadBalancerPoolIdentityLoadBalancerPoolIdentityLoadBalancerPoolIdentityById.Builder()
        .id("r006-70294e14-4e61-11e8-bcf4-0242ac110004")
        .build();

      CreateLoadBalancerListenerPolicyOptions createLoadBalancerListenerPolicyOptions = new CreateLoadBalancerListenerPolicyOptions.Builder()
        .loadBalancerId("testString")
        .listenerId("testString")
        .action("forward_to_listener")
        .priority(Long.valueOf("5"))
        .name("my-load-balancer-listener-policy")
        .rules(java.util.Arrays.asList(loadBalancerListenerPolicyRulePrototypeModel))
        .target(loadBalancerListenerPolicyTargetPrototypeModel)
        .build();

      // Invoke operation
      Response<LoadBalancerListenerPolicy> response = service.createLoadBalancerListenerPolicy(createLoadBalancerListenerPolicyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      LoadBalancerListenerPolicy loadBalancerListenerPolicyResult = response.getResult();
      assertNotNull(loadBalancerListenerPolicyResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateLoadBalancerListenerPolicy" })
  public void testGetLoadBalancerListenerPolicy() throws Exception {
    try {
      GetLoadBalancerListenerPolicyOptions getLoadBalancerListenerPolicyOptions = new GetLoadBalancerListenerPolicyOptions.Builder()
        .loadBalancerId("testString")
        .listenerId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<LoadBalancerListenerPolicy> response = service.getLoadBalancerListenerPolicy(getLoadBalancerListenerPolicyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancerListenerPolicy loadBalancerListenerPolicyResult = response.getResult();
      assertNotNull(loadBalancerListenerPolicyResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetLoadBalancerListenerPolicy" })
  public void testUpdateLoadBalancerListenerPolicy() throws Exception {
    try {
      LoadBalancerListenerPolicyTargetPatchLoadBalancerPoolIdentityLoadBalancerPoolIdentityLoadBalancerPoolIdentityById loadBalancerListenerPolicyTargetPatchModel = new LoadBalancerListenerPolicyTargetPatchLoadBalancerPoolIdentityLoadBalancerPoolIdentityLoadBalancerPoolIdentityById.Builder()
        .id("r006-70294e14-4e61-11e8-bcf4-0242ac110004")
        .build();

      LoadBalancerListenerPolicyPatch loadBalancerListenerPolicyPatchModel = new LoadBalancerListenerPolicyPatch.Builder()
        .name("my-load-balancer-listener-policy-updated")
        .priority(Long.valueOf("5"))
        .target(loadBalancerListenerPolicyTargetPatchModel)
        .build();
      Map<String, Object> loadBalancerListenerPolicyPatchModelAsPatch = loadBalancerListenerPolicyPatchModel.asPatch();

      UpdateLoadBalancerListenerPolicyOptions updateLoadBalancerListenerPolicyOptions = new UpdateLoadBalancerListenerPolicyOptions.Builder()
        .loadBalancerId("testString")
        .listenerId("testString")
        .id("testString")
        .loadBalancerListenerPolicyPatch(loadBalancerListenerPolicyPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<LoadBalancerListenerPolicy> response = service.updateLoadBalancerListenerPolicy(updateLoadBalancerListenerPolicyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancerListenerPolicy loadBalancerListenerPolicyResult = response.getResult();
      assertNotNull(loadBalancerListenerPolicyResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateLoadBalancerListenerPolicy" })
  public void testListLoadBalancerListenerPolicyRules() throws Exception {
    try {
      ListLoadBalancerListenerPolicyRulesOptions listLoadBalancerListenerPolicyRulesOptions = new ListLoadBalancerListenerPolicyRulesOptions.Builder()
        .loadBalancerId("testString")
        .listenerId("testString")
        .policyId("testString")
        .build();

      // Invoke operation
      Response<LoadBalancerListenerPolicyRuleCollection> response = service.listLoadBalancerListenerPolicyRules(listLoadBalancerListenerPolicyRulesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancerListenerPolicyRuleCollection loadBalancerListenerPolicyRuleCollectionResult = response.getResult();
      assertNotNull(loadBalancerListenerPolicyRuleCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListLoadBalancerListenerPolicyRules" })
  public void testCreateLoadBalancerListenerPolicyRule() throws Exception {
    try {
      CreateLoadBalancerListenerPolicyRuleOptions createLoadBalancerListenerPolicyRuleOptions = new CreateLoadBalancerListenerPolicyRuleOptions.Builder()
        .loadBalancerId("testString")
        .listenerId("testString")
        .policyId("testString")
        .condition("contains")
        .type("body")
        .value("testString")
        .field("MY-APP-HEADER")
        .build();

      // Invoke operation
      Response<LoadBalancerListenerPolicyRule> response = service.createLoadBalancerListenerPolicyRule(createLoadBalancerListenerPolicyRuleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      LoadBalancerListenerPolicyRule loadBalancerListenerPolicyRuleResult = response.getResult();
      assertNotNull(loadBalancerListenerPolicyRuleResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateLoadBalancerListenerPolicyRule" })
  public void testGetLoadBalancerListenerPolicyRule() throws Exception {
    try {
      GetLoadBalancerListenerPolicyRuleOptions getLoadBalancerListenerPolicyRuleOptions = new GetLoadBalancerListenerPolicyRuleOptions.Builder()
        .loadBalancerId("testString")
        .listenerId("testString")
        .policyId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<LoadBalancerListenerPolicyRule> response = service.getLoadBalancerListenerPolicyRule(getLoadBalancerListenerPolicyRuleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancerListenerPolicyRule loadBalancerListenerPolicyRuleResult = response.getResult();
      assertNotNull(loadBalancerListenerPolicyRuleResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetLoadBalancerListenerPolicyRule" })
  public void testUpdateLoadBalancerListenerPolicyRule() throws Exception {
    try {
      LoadBalancerListenerPolicyRulePatch loadBalancerListenerPolicyRulePatchModel = new LoadBalancerListenerPolicyRulePatch.Builder()
        .condition("contains")
        .field("MY-APP-HEADER")
        .type("body")
        .value("my-example-hostname-updated")
        .build();
      Map<String, Object> loadBalancerListenerPolicyRulePatchModelAsPatch = loadBalancerListenerPolicyRulePatchModel.asPatch();

      UpdateLoadBalancerListenerPolicyRuleOptions updateLoadBalancerListenerPolicyRuleOptions = new UpdateLoadBalancerListenerPolicyRuleOptions.Builder()
        .loadBalancerId("testString")
        .listenerId("testString")
        .policyId("testString")
        .id("testString")
        .loadBalancerListenerPolicyRulePatch(loadBalancerListenerPolicyRulePatchModelAsPatch)
        .build();

      // Invoke operation
      Response<LoadBalancerListenerPolicyRule> response = service.updateLoadBalancerListenerPolicyRule(updateLoadBalancerListenerPolicyRuleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancerListenerPolicyRule loadBalancerListenerPolicyRuleResult = response.getResult();
      assertNotNull(loadBalancerListenerPolicyRuleResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateLoadBalancerListenerPolicyRule" })
  public void testListLoadBalancerPools() throws Exception {
    try {
      ListLoadBalancerPoolsOptions listLoadBalancerPoolsOptions = new ListLoadBalancerPoolsOptions.Builder()
        .loadBalancerId("testString")
        .build();

      // Invoke operation
      Response<LoadBalancerPoolCollection> response = service.listLoadBalancerPools(listLoadBalancerPoolsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancerPoolCollection loadBalancerPoolCollectionResult = response.getResult();
      assertNotNull(loadBalancerPoolCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListLoadBalancerPools" })
  public void testCreateLoadBalancerPool() throws Exception {
    try {
      LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTCPPrototype loadBalancerPoolHealthMonitorPrototypeModel = new LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTCPPrototype.Builder()
        .delay(Long.valueOf("5"))
        .maxRetries(Long.valueOf("2"))
        .port(Long.valueOf("22"))
        .timeout(Long.valueOf("2"))
        .type("tcp")
        .build();

      LoadBalancerPoolIdentityLoadBalancerPoolIdentityById loadBalancerPoolIdentityModel = new LoadBalancerPoolIdentityLoadBalancerPoolIdentityById.Builder()
        .id("r006-70294e14-4e61-11e8-bcf4-0242ac110004")
        .build();

      LoadBalancerPoolFailsafePolicyPrototype loadBalancerPoolFailsafePolicyPrototypeModel = new LoadBalancerPoolFailsafePolicyPrototype.Builder()
        .action("forward")
        .target(loadBalancerPoolIdentityModel)
        .build();

      LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById loadBalancerPoolMemberTargetPrototypeModel = new LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById.Builder()
        .id("0717_e21b7391-2ca2-4ab5-84a8-b92157a633b0")
        .build();

      LoadBalancerPoolMemberPrototype loadBalancerPoolMemberPrototypeModel = new LoadBalancerPoolMemberPrototype.Builder()
        .port(Long.valueOf("80"))
        .target(loadBalancerPoolMemberTargetPrototypeModel)
        .weight(Long.valueOf("50"))
        .build();

      LoadBalancerPoolSessionPersistencePrototype loadBalancerPoolSessionPersistencePrototypeModel = new LoadBalancerPoolSessionPersistencePrototype.Builder()
        .cookieName("my-cookie-name")
        .type("app_cookie")
        .build();

      CreateLoadBalancerPoolOptions createLoadBalancerPoolOptions = new CreateLoadBalancerPoolOptions.Builder()
        .loadBalancerId("testString")
        .algorithm("least_connections")
        .healthMonitor(loadBalancerPoolHealthMonitorPrototypeModel)
        .protocol("http")
        .failsafePolicy(loadBalancerPoolFailsafePolicyPrototypeModel)
        .members(java.util.Arrays.asList(loadBalancerPoolMemberPrototypeModel))
        .name("my-load-balancer-pool")
        .proxyProtocol("disabled")
        .sessionPersistence(loadBalancerPoolSessionPersistencePrototypeModel)
        .build();

      // Invoke operation
      Response<LoadBalancerPool> response = service.createLoadBalancerPool(createLoadBalancerPoolOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      LoadBalancerPool loadBalancerPoolResult = response.getResult();
      assertNotNull(loadBalancerPoolResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateLoadBalancerPool" })
  public void testGetLoadBalancerPool() throws Exception {
    try {
      GetLoadBalancerPoolOptions getLoadBalancerPoolOptions = new GetLoadBalancerPoolOptions.Builder()
        .loadBalancerId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<LoadBalancerPool> response = service.getLoadBalancerPool(getLoadBalancerPoolOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancerPool loadBalancerPoolResult = response.getResult();
      assertNotNull(loadBalancerPoolResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetLoadBalancerPool" })
  public void testUpdateLoadBalancerPool() throws Exception {
    try {
      LoadBalancerPoolFailsafePolicyTargetPatchLoadBalancerPoolIdentityById loadBalancerPoolFailsafePolicyTargetPatchModel = new LoadBalancerPoolFailsafePolicyTargetPatchLoadBalancerPoolIdentityById.Builder()
        .id("r006-70294e14-4e61-11e8-bcf4-0242ac110004")
        .build();

      LoadBalancerPoolFailsafePolicyPatch loadBalancerPoolFailsafePolicyPatchModel = new LoadBalancerPoolFailsafePolicyPatch.Builder()
        .action("forward")
        .target(loadBalancerPoolFailsafePolicyTargetPatchModel)
        .build();

      LoadBalancerPoolHealthMonitorPatch loadBalancerPoolHealthMonitorPatchModel = new LoadBalancerPoolHealthMonitorPatch.Builder()
        .delay(Long.valueOf("5"))
        .maxRetries(Long.valueOf("2"))
        .port(Long.valueOf("22"))
        .timeout(Long.valueOf("2"))
        .type("http")
        .urlPath("/")
        .build();

      LoadBalancerPoolSessionPersistencePatch loadBalancerPoolSessionPersistencePatchModel = new LoadBalancerPoolSessionPersistencePatch.Builder()
        .cookieName("my-cookie-name")
        .type("app_cookie")
        .build();

      LoadBalancerPoolPatch loadBalancerPoolPatchModel = new LoadBalancerPoolPatch.Builder()
        .algorithm("weighted_round_robin")
        .failsafePolicy(loadBalancerPoolFailsafePolicyPatchModel)
        .healthMonitor(loadBalancerPoolHealthMonitorPatchModel)
        .name("my-load-balancer-pool")
        .protocol("http")
        .proxyProtocol("disabled")
        .sessionPersistence(loadBalancerPoolSessionPersistencePatchModel)
        .build();
      Map<String, Object> loadBalancerPoolPatchModelAsPatch = loadBalancerPoolPatchModel.asPatch();

      UpdateLoadBalancerPoolOptions updateLoadBalancerPoolOptions = new UpdateLoadBalancerPoolOptions.Builder()
        .loadBalancerId("testString")
        .id("testString")
        .loadBalancerPoolPatch(loadBalancerPoolPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<LoadBalancerPool> response = service.updateLoadBalancerPool(updateLoadBalancerPoolOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancerPool loadBalancerPoolResult = response.getResult();
      assertNotNull(loadBalancerPoolResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateLoadBalancerPool" })
  public void testListLoadBalancerPoolMembers() throws Exception {
    try {
      ListLoadBalancerPoolMembersOptions listLoadBalancerPoolMembersOptions = new ListLoadBalancerPoolMembersOptions.Builder()
        .loadBalancerId("testString")
        .poolId("testString")
        .build();

      // Invoke operation
      Response<LoadBalancerPoolMemberCollection> response = service.listLoadBalancerPoolMembers(listLoadBalancerPoolMembersOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancerPoolMemberCollection loadBalancerPoolMemberCollectionResult = response.getResult();
      assertNotNull(loadBalancerPoolMemberCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListLoadBalancerPoolMembers" })
  public void testCreateLoadBalancerPoolMember() throws Exception {
    try {
      LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById loadBalancerPoolMemberTargetPrototypeModel = new LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById.Builder()
        .id("0717_e21b7391-2ca2-4ab5-84a8-b92157a633b0")
        .build();

      CreateLoadBalancerPoolMemberOptions createLoadBalancerPoolMemberOptions = new CreateLoadBalancerPoolMemberOptions.Builder()
        .loadBalancerId("testString")
        .poolId("testString")
        .port(Long.valueOf("80"))
        .target(loadBalancerPoolMemberTargetPrototypeModel)
        .weight(Long.valueOf("50"))
        .build();

      // Invoke operation
      Response<LoadBalancerPoolMember> response = service.createLoadBalancerPoolMember(createLoadBalancerPoolMemberOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      LoadBalancerPoolMember loadBalancerPoolMemberResult = response.getResult();
      assertNotNull(loadBalancerPoolMemberResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateLoadBalancerPoolMember" })
  public void testReplaceLoadBalancerPoolMembers() throws Exception {
    try {
      LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById loadBalancerPoolMemberTargetPrototypeModel = new LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById.Builder()
        .id("0717_e21b7391-2ca2-4ab5-84a8-b92157a633b0")
        .build();

      LoadBalancerPoolMemberPrototype loadBalancerPoolMemberPrototypeModel = new LoadBalancerPoolMemberPrototype.Builder()
        .port(Long.valueOf("80"))
        .target(loadBalancerPoolMemberTargetPrototypeModel)
        .weight(Long.valueOf("50"))
        .build();

      ReplaceLoadBalancerPoolMembersOptions replaceLoadBalancerPoolMembersOptions = new ReplaceLoadBalancerPoolMembersOptions.Builder()
        .loadBalancerId("testString")
        .poolId("testString")
        .members(java.util.Arrays.asList(loadBalancerPoolMemberPrototypeModel))
        .build();

      // Invoke operation
      Response<LoadBalancerPoolMemberCollection> response = service.replaceLoadBalancerPoolMembers(replaceLoadBalancerPoolMembersOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancerPoolMemberCollection loadBalancerPoolMemberCollectionResult = response.getResult();
      assertNotNull(loadBalancerPoolMemberCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testReplaceLoadBalancerPoolMembers" })
  public void testGetLoadBalancerPoolMember() throws Exception {
    try {
      GetLoadBalancerPoolMemberOptions getLoadBalancerPoolMemberOptions = new GetLoadBalancerPoolMemberOptions.Builder()
        .loadBalancerId("testString")
        .poolId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<LoadBalancerPoolMember> response = service.getLoadBalancerPoolMember(getLoadBalancerPoolMemberOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancerPoolMember loadBalancerPoolMemberResult = response.getResult();
      assertNotNull(loadBalancerPoolMemberResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetLoadBalancerPoolMember" })
  public void testUpdateLoadBalancerPoolMember() throws Exception {
    try {
      LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById loadBalancerPoolMemberTargetPrototypeModel = new LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById.Builder()
        .id("0717_e21b7391-2ca2-4ab5-84a8-b92157a633b0")
        .build();

      LoadBalancerPoolMemberPatch loadBalancerPoolMemberPatchModel = new LoadBalancerPoolMemberPatch.Builder()
        .port(Long.valueOf("80"))
        .target(loadBalancerPoolMemberTargetPrototypeModel)
        .weight(Long.valueOf("99"))
        .build();
      Map<String, Object> loadBalancerPoolMemberPatchModelAsPatch = loadBalancerPoolMemberPatchModel.asPatch();

      UpdateLoadBalancerPoolMemberOptions updateLoadBalancerPoolMemberOptions = new UpdateLoadBalancerPoolMemberOptions.Builder()
        .loadBalancerId("testString")
        .poolId("testString")
        .id("testString")
        .loadBalancerPoolMemberPatch(loadBalancerPoolMemberPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<LoadBalancerPoolMember> response = service.updateLoadBalancerPoolMember(updateLoadBalancerPoolMemberOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancerPoolMember loadBalancerPoolMemberResult = response.getResult();
      assertNotNull(loadBalancerPoolMemberResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateLoadBalancerPoolMember" })
  public void testListEndpointGateways() throws Exception {
    try {
      ListEndpointGatewaysOptions listEndpointGatewaysOptions = new ListEndpointGatewaysOptions.Builder()
        .name("my-name")
        .start("testString")
        .limit(Long.valueOf("10"))
        .resourceGroupId("testString")
        .lifecycleState(java.util.Arrays.asList("stable"))
        .vpcId("testString")
        .vpcCrn("crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::vpc:r006-4727d842-f94f-4a2d-824a-9bc9b02c523b")
        .vpcName("my-vpc")
        .allowDnsResolutionBinding(true)
        .build();

      // Invoke operation
      Response<EndpointGatewayCollection> response = service.listEndpointGateways(listEndpointGatewaysOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      EndpointGatewayCollection endpointGatewayCollectionResult = response.getResult();
      assertNotNull(endpointGatewayCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListEndpointGateways" })
  public void testListEndpointGatewaysWithPager() throws Exception {
    try {
      ListEndpointGatewaysOptions options = new ListEndpointGatewaysOptions.Builder()
        .name("my-name")
        .limit(Long.valueOf("10"))
        .resourceGroupId("testString")
        .lifecycleState(java.util.Arrays.asList("stable"))
        .vpcId("testString")
        .vpcCrn("crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::vpc:r006-4727d842-f94f-4a2d-824a-9bc9b02c523b")
        .vpcName("my-vpc")
        .allowDnsResolutionBinding(true)
        .build();

      // Test getNext().
      List<EndpointGateway> allResults = new ArrayList<>();
      EndpointGatewaysPager pager = new EndpointGatewaysPager(service, options);
      while (pager.hasNext()) {
        List<EndpointGateway> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new EndpointGatewaysPager(service, options);
      List<EndpointGateway> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListEndpointGateways" })
  public void testCreateEndpointGateway() throws Exception {
    try {
      EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderInfrastructureServicePrototype endpointGatewayTargetPrototypeModel = new EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderInfrastructureServicePrototype.Builder()
        .name("ibm-ntp-server")
        .resourceType("provider_infrastructure_service")
        .build();

      VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
        .id("r006-4727d842-f94f-4a2d-824a-9bc9b02c523b")
        .build();

      EndpointGatewayReservedIPReservedIPIdentityById endpointGatewayReservedIpModel = new EndpointGatewayReservedIPReservedIPIdentityById.Builder()
        .id("0717-6d353a0f-aeb1-4ae1-832e-1110d10981bb")
        .build();

      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
        .id("fee82deba12e4c0fb69c3b09d1f12345")
        .build();

      SecurityGroupIdentityById securityGroupIdentityModel = new SecurityGroupIdentityById.Builder()
        .id("r006-be5df5ca-12a0-494b-907e-aa6ec2bfa271")
        .build();

      CreateEndpointGatewayOptions createEndpointGatewayOptions = new CreateEndpointGatewayOptions.Builder()
        .target(endpointGatewayTargetPrototypeModel)
        .vpc(vpcIdentityModel)
        .allowDnsResolutionBinding(true)
        .ips(java.util.Arrays.asList(endpointGatewayReservedIpModel))
        .name("testString")
        .resourceGroup(resourceGroupIdentityModel)
        .securityGroups(java.util.Arrays.asList(securityGroupIdentityModel))
        .build();

      // Invoke operation
      Response<EndpointGateway> response = service.createEndpointGateway(createEndpointGatewayOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      EndpointGateway endpointGatewayResult = response.getResult();
      assertNotNull(endpointGatewayResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateEndpointGateway" })
  public void testListEndpointGatewayIps() throws Exception {
    try {
      ListEndpointGatewayIpsOptions listEndpointGatewayIpsOptions = new ListEndpointGatewayIpsOptions.Builder()
        .endpointGatewayId("testString")
        .start("testString")
        .limit(Long.valueOf("10"))
        .sort("name")
        .build();

      // Invoke operation
      Response<ReservedIPCollectionEndpointGatewayContext> response = service.listEndpointGatewayIps(listEndpointGatewayIpsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ReservedIPCollectionEndpointGatewayContext reservedIpCollectionEndpointGatewayContextResult = response.getResult();
      assertNotNull(reservedIpCollectionEndpointGatewayContextResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListEndpointGatewayIps" })
  public void testListEndpointGatewayIpsWithPager() throws Exception {
    try {
      ListEndpointGatewayIpsOptions options = new ListEndpointGatewayIpsOptions.Builder()
        .endpointGatewayId("testString")
        .limit(Long.valueOf("10"))
        .sort("name")
        .build();

      // Test getNext().
      List<ReservedIP> allResults = new ArrayList<>();
      EndpointGatewayIpsPager pager = new EndpointGatewayIpsPager(service, options);
      while (pager.hasNext()) {
        List<ReservedIP> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new EndpointGatewayIpsPager(service, options);
      List<ReservedIP> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListEndpointGatewayIps" })
  public void testGetEndpointGatewayIp() throws Exception {
    try {
      GetEndpointGatewayIpOptions getEndpointGatewayIpOptions = new GetEndpointGatewayIpOptions.Builder()
        .endpointGatewayId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<ReservedIP> response = service.getEndpointGatewayIp(getEndpointGatewayIpOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ReservedIP reservedIpResult = response.getResult();
      assertNotNull(reservedIpResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetEndpointGatewayIp" })
  public void testAddEndpointGatewayIp() throws Exception {
    try {
      AddEndpointGatewayIpOptions addEndpointGatewayIpOptions = new AddEndpointGatewayIpOptions.Builder()
        .endpointGatewayId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<ReservedIP> response = service.addEndpointGatewayIp(addEndpointGatewayIpOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      ReservedIP reservedIpResult = response.getResult();
      assertNotNull(reservedIpResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testAddEndpointGatewayIp" })
  public void testGetEndpointGateway() throws Exception {
    try {
      GetEndpointGatewayOptions getEndpointGatewayOptions = new GetEndpointGatewayOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<EndpointGateway> response = service.getEndpointGateway(getEndpointGatewayOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      EndpointGateway endpointGatewayResult = response.getResult();
      assertNotNull(endpointGatewayResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetEndpointGateway" })
  public void testUpdateEndpointGateway() throws Exception {
    try {
      EndpointGatewayPatch endpointGatewayPatchModel = new EndpointGatewayPatch.Builder()
        .allowDnsResolutionBinding(false)
        .name("my-endpoint-gateway")
        .build();
      Map<String, Object> endpointGatewayPatchModelAsPatch = endpointGatewayPatchModel.asPatch();

      UpdateEndpointGatewayOptions updateEndpointGatewayOptions = new UpdateEndpointGatewayOptions.Builder()
        .id("testString")
        .endpointGatewayPatch(endpointGatewayPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<EndpointGateway> response = service.updateEndpointGateway(updateEndpointGatewayOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      EndpointGateway endpointGatewayResult = response.getResult();
      assertNotNull(endpointGatewayResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateEndpointGateway" })
  public void testListFlowLogCollectors() throws Exception {
    try {
      ListFlowLogCollectorsOptions listFlowLogCollectorsOptions = new ListFlowLogCollectorsOptions.Builder()
        .start("testString")
        .limit(Long.valueOf("10"))
        .resourceGroupId("testString")
        .name("my-name")
        .vpcId("testString")
        .vpcCrn("crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::vpc:r006-4727d842-f94f-4a2d-824a-9bc9b02c523b")
        .vpcName("my-vpc")
        .targetId("testString")
        .targetResourceType("testString")
        .build();

      // Invoke operation
      Response<FlowLogCollectorCollection> response = service.listFlowLogCollectors(listFlowLogCollectorsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      FlowLogCollectorCollection flowLogCollectorCollectionResult = response.getResult();
      assertNotNull(flowLogCollectorCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListFlowLogCollectors" })
  public void testListFlowLogCollectorsWithPager() throws Exception {
    try {
      ListFlowLogCollectorsOptions options = new ListFlowLogCollectorsOptions.Builder()
        .limit(Long.valueOf("10"))
        .resourceGroupId("testString")
        .name("my-name")
        .vpcId("testString")
        .vpcCrn("crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::vpc:r006-4727d842-f94f-4a2d-824a-9bc9b02c523b")
        .vpcName("my-vpc")
        .targetId("testString")
        .targetResourceType("testString")
        .build();

      // Test getNext().
      List<FlowLogCollector> allResults = new ArrayList<>();
      FlowLogCollectorsPager pager = new FlowLogCollectorsPager(service, options);
      while (pager.hasNext()) {
        List<FlowLogCollector> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new FlowLogCollectorsPager(service, options);
      List<FlowLogCollector> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListFlowLogCollectors" })
  public void testCreateFlowLogCollector() throws Exception {
    try {
      LegacyCloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByName legacyCloudObjectStorageBucketIdentityModel = new LegacyCloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByName.Builder()
        .name("bucket-27200-lwx4cfvcue")
        .build();

      FlowLogCollectorTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityById flowLogCollectorTargetPrototypeModel = new FlowLogCollectorTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityById.Builder()
        .id("0717-d54eb633-98ea-459d-aa00-6a8e780175a7")
        .build();

      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
        .id("fee82deba12e4c0fb69c3b09d1f12345")
        .build();

      CreateFlowLogCollectorOptions createFlowLogCollectorOptions = new CreateFlowLogCollectorOptions.Builder()
        .storageBucket(legacyCloudObjectStorageBucketIdentityModel)
        .target(flowLogCollectorTargetPrototypeModel)
        .active(false)
        .name("my-flow-log-collector")
        .resourceGroup(resourceGroupIdentityModel)
        .build();

      // Invoke operation
      Response<FlowLogCollector> response = service.createFlowLogCollector(createFlowLogCollectorOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      FlowLogCollector flowLogCollectorResult = response.getResult();
      assertNotNull(flowLogCollectorResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateFlowLogCollector" })
  public void testGetFlowLogCollector() throws Exception {
    try {
      GetFlowLogCollectorOptions getFlowLogCollectorOptions = new GetFlowLogCollectorOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<FlowLogCollector> response = service.getFlowLogCollector(getFlowLogCollectorOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      FlowLogCollector flowLogCollectorResult = response.getResult();
      assertNotNull(flowLogCollectorResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetFlowLogCollector" })
  public void testUpdateFlowLogCollector() throws Exception {
    try {
      FlowLogCollectorPatch flowLogCollectorPatchModel = new FlowLogCollectorPatch.Builder()
        .active(false)
        .name("my-flow-log-collector")
        .build();
      Map<String, Object> flowLogCollectorPatchModelAsPatch = flowLogCollectorPatchModel.asPatch();

      UpdateFlowLogCollectorOptions updateFlowLogCollectorOptions = new UpdateFlowLogCollectorOptions.Builder()
        .id("testString")
        .flowLogCollectorPatch(flowLogCollectorPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<FlowLogCollector> response = service.updateFlowLogCollector(updateFlowLogCollectorOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      FlowLogCollector flowLogCollectorResult = response.getResult();
      assertNotNull(flowLogCollectorResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateFlowLogCollector" })
  public void testListPrivatePathServiceGateways() throws Exception {
    try {
      ListPrivatePathServiceGatewaysOptions listPrivatePathServiceGatewaysOptions = new ListPrivatePathServiceGatewaysOptions.Builder()
        .start("testString")
        .limit(Long.valueOf("10"))
        .resourceGroupId("testString")
        .build();

      // Invoke operation
      Response<PrivatePathServiceGatewayCollection> response = service.listPrivatePathServiceGateways(listPrivatePathServiceGatewaysOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PrivatePathServiceGatewayCollection privatePathServiceGatewayCollectionResult = response.getResult();
      assertNotNull(privatePathServiceGatewayCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListPrivatePathServiceGateways" })
  public void testListPrivatePathServiceGatewaysWithPager() throws Exception {
    try {
      ListPrivatePathServiceGatewaysOptions options = new ListPrivatePathServiceGatewaysOptions.Builder()
        .limit(Long.valueOf("10"))
        .resourceGroupId("testString")
        .build();

      // Test getNext().
      List<PrivatePathServiceGateway> allResults = new ArrayList<>();
      PrivatePathServiceGatewaysPager pager = new PrivatePathServiceGatewaysPager(service, options);
      while (pager.hasNext()) {
        List<PrivatePathServiceGateway> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new PrivatePathServiceGatewaysPager(service, options);
      List<PrivatePathServiceGateway> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListPrivatePathServiceGateways" })
  public void testCreatePrivatePathServiceGateway() throws Exception {
    try {
      LoadBalancerIdentityById loadBalancerIdentityModel = new LoadBalancerIdentityById.Builder()
        .id("r006-dd754295-e9e0-4c9d-bf6c-58fbc59e5727")
        .build();

      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
        .id("fee82deba12e4c0fb69c3b09d1f12345")
        .build();

      CreatePrivatePathServiceGatewayOptions createPrivatePathServiceGatewayOptions = new CreatePrivatePathServiceGatewayOptions.Builder()
        .loadBalancer(loadBalancerIdentityModel)
        .serviceEndpoints(java.util.Arrays.asList("*.example.com"))
        .defaultAccessPolicy("deny")
        .name("my-private-path-service-gateway")
        .resourceGroup(resourceGroupIdentityModel)
        .zonalAffinity(false)
        .build();

      // Invoke operation
      Response<PrivatePathServiceGateway> response = service.createPrivatePathServiceGateway(createPrivatePathServiceGatewayOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      PrivatePathServiceGateway privatePathServiceGatewayResult = response.getResult();
      assertNotNull(privatePathServiceGatewayResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreatePrivatePathServiceGateway" })
  public void testGetPrivatePathServiceGateway() throws Exception {
    try {
      GetPrivatePathServiceGatewayOptions getPrivatePathServiceGatewayOptions = new GetPrivatePathServiceGatewayOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<PrivatePathServiceGateway> response = service.getPrivatePathServiceGateway(getPrivatePathServiceGatewayOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PrivatePathServiceGateway privatePathServiceGatewayResult = response.getResult();
      assertNotNull(privatePathServiceGatewayResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetPrivatePathServiceGateway" })
  public void testUpdatePrivatePathServiceGateway() throws Exception {
    try {
      LoadBalancerIdentityById loadBalancerIdentityModel = new LoadBalancerIdentityById.Builder()
        .id("r006-dd754295-e9e0-4c9d-bf6c-58fbc59e5727")
        .build();

      PrivatePathServiceGatewayPatch privatePathServiceGatewayPatchModel = new PrivatePathServiceGatewayPatch.Builder()
        .defaultAccessPolicy("deny")
        .loadBalancer(loadBalancerIdentityModel)
        .name("my-private-path-service-gateway")
        .zonalAffinity(true)
        .build();
      Map<String, Object> privatePathServiceGatewayPatchModelAsPatch = privatePathServiceGatewayPatchModel.asPatch();

      UpdatePrivatePathServiceGatewayOptions updatePrivatePathServiceGatewayOptions = new UpdatePrivatePathServiceGatewayOptions.Builder()
        .id("testString")
        .privatePathServiceGatewayPatch(privatePathServiceGatewayPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<PrivatePathServiceGateway> response = service.updatePrivatePathServiceGateway(updatePrivatePathServiceGatewayOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PrivatePathServiceGateway privatePathServiceGatewayResult = response.getResult();
      assertNotNull(privatePathServiceGatewayResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdatePrivatePathServiceGateway" })
  public void testListPrivatePathServiceGatewayAccountPolicies() throws Exception {
    try {
      ListPrivatePathServiceGatewayAccountPoliciesOptions listPrivatePathServiceGatewayAccountPoliciesOptions = new ListPrivatePathServiceGatewayAccountPoliciesOptions.Builder()
        .privatePathServiceGatewayId("testString")
        .start("testString")
        .limit(Long.valueOf("10"))
        .accountId("bb1b52262f7441a586f49068482f1e60")
        .build();

      // Invoke operation
      Response<PrivatePathServiceGatewayAccountPolicyCollection> response = service.listPrivatePathServiceGatewayAccountPolicies(listPrivatePathServiceGatewayAccountPoliciesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PrivatePathServiceGatewayAccountPolicyCollection privatePathServiceGatewayAccountPolicyCollectionResult = response.getResult();
      assertNotNull(privatePathServiceGatewayAccountPolicyCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListPrivatePathServiceGatewayAccountPolicies" })
  public void testListPrivatePathServiceGatewayAccountPoliciesWithPager() throws Exception {
    try {
      ListPrivatePathServiceGatewayAccountPoliciesOptions options = new ListPrivatePathServiceGatewayAccountPoliciesOptions.Builder()
        .privatePathServiceGatewayId("testString")
        .limit(Long.valueOf("10"))
        .accountId("bb1b52262f7441a586f49068482f1e60")
        .build();

      // Test getNext().
      List<PrivatePathServiceGatewayAccountPolicy> allResults = new ArrayList<>();
      PrivatePathServiceGatewayAccountPoliciesPager pager = new PrivatePathServiceGatewayAccountPoliciesPager(service, options);
      while (pager.hasNext()) {
        List<PrivatePathServiceGatewayAccountPolicy> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new PrivatePathServiceGatewayAccountPoliciesPager(service, options);
      List<PrivatePathServiceGatewayAccountPolicy> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListPrivatePathServiceGatewayAccountPolicies" })
  public void testCreatePrivatePathServiceGatewayAccountPolicy() throws Exception {
    try {
      AccountIdentityById accountIdentityModel = new AccountIdentityById.Builder()
        .id("bb1b52262f7441a586f49068482f1e60")
        .build();

      CreatePrivatePathServiceGatewayAccountPolicyOptions createPrivatePathServiceGatewayAccountPolicyOptions = new CreatePrivatePathServiceGatewayAccountPolicyOptions.Builder()
        .privatePathServiceGatewayId("testString")
        .accessPolicy("deny")
        .account(accountIdentityModel)
        .build();

      // Invoke operation
      Response<PrivatePathServiceGatewayAccountPolicy> response = service.createPrivatePathServiceGatewayAccountPolicy(createPrivatePathServiceGatewayAccountPolicyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      PrivatePathServiceGatewayAccountPolicy privatePathServiceGatewayAccountPolicyResult = response.getResult();
      assertNotNull(privatePathServiceGatewayAccountPolicyResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreatePrivatePathServiceGatewayAccountPolicy" })
  public void testGetPrivatePathServiceGatewayAccountPolicy() throws Exception {
    try {
      GetPrivatePathServiceGatewayAccountPolicyOptions getPrivatePathServiceGatewayAccountPolicyOptions = new GetPrivatePathServiceGatewayAccountPolicyOptions.Builder()
        .privatePathServiceGatewayId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<PrivatePathServiceGatewayAccountPolicy> response = service.getPrivatePathServiceGatewayAccountPolicy(getPrivatePathServiceGatewayAccountPolicyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PrivatePathServiceGatewayAccountPolicy privatePathServiceGatewayAccountPolicyResult = response.getResult();
      assertNotNull(privatePathServiceGatewayAccountPolicyResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetPrivatePathServiceGatewayAccountPolicy" })
  public void testUpdatePrivatePathServiceGatewayAccountPolicy() throws Exception {
    try {
      PrivatePathServiceGatewayAccountPolicyPatch privatePathServiceGatewayAccountPolicyPatchModel = new PrivatePathServiceGatewayAccountPolicyPatch.Builder()
        .accessPolicy("review")
        .build();
      Map<String, Object> privatePathServiceGatewayAccountPolicyPatchModelAsPatch = privatePathServiceGatewayAccountPolicyPatchModel.asPatch();

      UpdatePrivatePathServiceGatewayAccountPolicyOptions updatePrivatePathServiceGatewayAccountPolicyOptions = new UpdatePrivatePathServiceGatewayAccountPolicyOptions.Builder()
        .privatePathServiceGatewayId("testString")
        .id("testString")
        .privatePathServiceGatewayAccountPolicyPatch(privatePathServiceGatewayAccountPolicyPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<PrivatePathServiceGatewayAccountPolicy> response = service.updatePrivatePathServiceGatewayAccountPolicy(updatePrivatePathServiceGatewayAccountPolicyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PrivatePathServiceGatewayAccountPolicy privatePathServiceGatewayAccountPolicyResult = response.getResult();
      assertNotNull(privatePathServiceGatewayAccountPolicyResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdatePrivatePathServiceGatewayAccountPolicy" })
  public void testListPrivatePathServiceGatewayEndpointGatewayBindings() throws Exception {
    try {
      ListPrivatePathServiceGatewayEndpointGatewayBindingsOptions listPrivatePathServiceGatewayEndpointGatewayBindingsOptions = new ListPrivatePathServiceGatewayEndpointGatewayBindingsOptions.Builder()
        .privatePathServiceGatewayId("testString")
        .start("testString")
        .limit(Long.valueOf("10"))
        .status("abandoned")
        .accountId("bb1b52262f7441a586f49068482f1e60")
        .build();

      // Invoke operation
      Response<PrivatePathServiceGatewayEndpointGatewayBindingCollection> response = service.listPrivatePathServiceGatewayEndpointGatewayBindings(listPrivatePathServiceGatewayEndpointGatewayBindingsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PrivatePathServiceGatewayEndpointGatewayBindingCollection privatePathServiceGatewayEndpointGatewayBindingCollectionResult = response.getResult();
      assertNotNull(privatePathServiceGatewayEndpointGatewayBindingCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListPrivatePathServiceGatewayEndpointGatewayBindings" })
  public void testListPrivatePathServiceGatewayEndpointGatewayBindingsWithPager() throws Exception {
    try {
      ListPrivatePathServiceGatewayEndpointGatewayBindingsOptions options = new ListPrivatePathServiceGatewayEndpointGatewayBindingsOptions.Builder()
        .privatePathServiceGatewayId("testString")
        .limit(Long.valueOf("10"))
        .status("abandoned")
        .accountId("bb1b52262f7441a586f49068482f1e60")
        .build();

      // Test getNext().
      List<PrivatePathServiceGatewayEndpointGatewayBinding> allResults = new ArrayList<>();
      PrivatePathServiceGatewayEndpointGatewayBindingsPager pager = new PrivatePathServiceGatewayEndpointGatewayBindingsPager(service, options);
      while (pager.hasNext()) {
        List<PrivatePathServiceGatewayEndpointGatewayBinding> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new PrivatePathServiceGatewayEndpointGatewayBindingsPager(service, options);
      List<PrivatePathServiceGatewayEndpointGatewayBinding> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListPrivatePathServiceGatewayEndpointGatewayBindings" })
  public void testGetPrivatePathServiceGatewayEndpointGatewayBinding() throws Exception {
    try {
      GetPrivatePathServiceGatewayEndpointGatewayBindingOptions getPrivatePathServiceGatewayEndpointGatewayBindingOptions = new GetPrivatePathServiceGatewayEndpointGatewayBindingOptions.Builder()
        .privatePathServiceGatewayId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<PrivatePathServiceGatewayEndpointGatewayBinding> response = service.getPrivatePathServiceGatewayEndpointGatewayBinding(getPrivatePathServiceGatewayEndpointGatewayBindingOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PrivatePathServiceGatewayEndpointGatewayBinding privatePathServiceGatewayEndpointGatewayBindingResult = response.getResult();
      assertNotNull(privatePathServiceGatewayEndpointGatewayBindingResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetPrivatePathServiceGatewayEndpointGatewayBinding" })
  public void testDenyPrivatePathServiceGatewayEndpointGatewayBinding() throws Exception {
    try {
      DenyPrivatePathServiceGatewayEndpointGatewayBindingOptions denyPrivatePathServiceGatewayEndpointGatewayBindingOptions = new DenyPrivatePathServiceGatewayEndpointGatewayBindingOptions.Builder()
        .privatePathServiceGatewayId("testString")
        .id("testString")
        .setAccountPolicy(true)
        .build();

      // Invoke operation
      Response<Void> response = service.denyPrivatePathServiceGatewayEndpointGatewayBinding(denyPrivatePathServiceGatewayEndpointGatewayBindingOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDenyPrivatePathServiceGatewayEndpointGatewayBinding" })
  public void testPermitPrivatePathServiceGatewayEndpointGatewayBinding() throws Exception {
    try {
      PermitPrivatePathServiceGatewayEndpointGatewayBindingOptions permitPrivatePathServiceGatewayEndpointGatewayBindingOptions = new PermitPrivatePathServiceGatewayEndpointGatewayBindingOptions.Builder()
        .privatePathServiceGatewayId("testString")
        .id("testString")
        .setAccountPolicy(true)
        .build();

      // Invoke operation
      Response<Void> response = service.permitPrivatePathServiceGatewayEndpointGatewayBinding(permitPrivatePathServiceGatewayEndpointGatewayBindingOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testPermitPrivatePathServiceGatewayEndpointGatewayBinding" })
  public void testPublishPrivatePathServiceGateway() throws Exception {
    try {
      PublishPrivatePathServiceGatewayOptions publishPrivatePathServiceGatewayOptions = new PublishPrivatePathServiceGatewayOptions.Builder()
        .privatePathServiceGatewayId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.publishPrivatePathServiceGateway(publishPrivatePathServiceGatewayOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testPublishPrivatePathServiceGateway" })
  public void testRevokeAccountForPrivatePathServiceGateway() throws Exception {
    try {
      AccountIdentityById accountIdentityModel = new AccountIdentityById.Builder()
        .id("bb1b52262f7441a586f49068482f1e60")
        .build();

      RevokeAccountForPrivatePathServiceGatewayOptions revokeAccountForPrivatePathServiceGatewayOptions = new RevokeAccountForPrivatePathServiceGatewayOptions.Builder()
        .privatePathServiceGatewayId("testString")
        .account(accountIdentityModel)
        .build();

      // Invoke operation
      Response<Void> response = service.revokeAccountForPrivatePathServiceGateway(revokeAccountForPrivatePathServiceGatewayOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testRevokeAccountForPrivatePathServiceGateway" })
  public void testUnpublishPrivatePathServiceGateway() throws Exception {
    try {
      UnpublishPrivatePathServiceGatewayOptions unpublishPrivatePathServiceGatewayOptions = new UnpublishPrivatePathServiceGatewayOptions.Builder()
        .privatePathServiceGatewayId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.unpublishPrivatePathServiceGateway(unpublishPrivatePathServiceGatewayOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUnpublishPrivatePathServiceGateway" })
  public void testDeleteVpc() throws Exception {
    try {
      DeleteVpcOptions deleteVpcOptions = new DeleteVpcOptions.Builder()
        .id("testString")
        .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteVpc(deleteVpcOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteVpc" })
  public void testDeleteVpcAddressPrefix() throws Exception {
    try {
      DeleteVpcAddressPrefixOptions deleteVpcAddressPrefixOptions = new DeleteVpcAddressPrefixOptions.Builder()
        .vpcId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteVpcAddressPrefix(deleteVpcAddressPrefixOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteVpcAddressPrefix" })
  public void testDeleteVpcDnsResolutionBinding() throws Exception {
    try {
      DeleteVpcDnsResolutionBindingOptions deleteVpcDnsResolutionBindingOptions = new DeleteVpcDnsResolutionBindingOptions.Builder()
        .vpcId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<VPCDNSResolutionBinding> response = service.deleteVpcDnsResolutionBinding(deleteVpcDnsResolutionBindingOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      VPCDNSResolutionBinding vpcdnsResolutionBindingResult = response.getResult();
      assertNotNull(vpcdnsResolutionBindingResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteVpcDnsResolutionBinding" })
  public void testDeleteVpcRoute() throws Exception {
    try {
      DeleteVpcRouteOptions deleteVpcRouteOptions = new DeleteVpcRouteOptions.Builder()
        .vpcId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteVpcRoute(deleteVpcRouteOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteVpcRoute" })
  public void testDeleteVpcRoutingTable() throws Exception {
    try {
      DeleteVpcRoutingTableOptions deleteVpcRoutingTableOptions = new DeleteVpcRoutingTableOptions.Builder()
        .vpcId("testString")
        .id("testString")
        .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteVpcRoutingTable(deleteVpcRoutingTableOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteVpcRoutingTable" })
  public void testDeleteVpcRoutingTableRoute() throws Exception {
    try {
      DeleteVpcRoutingTableRouteOptions deleteVpcRoutingTableRouteOptions = new DeleteVpcRoutingTableRouteOptions.Builder()
        .vpcId("testString")
        .routingTableId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteVpcRoutingTableRoute(deleteVpcRoutingTableRouteOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteVpcRoutingTableRoute" })
  public void testDeleteSubnet() throws Exception {
    try {
      DeleteSubnetOptions deleteSubnetOptions = new DeleteSubnetOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteSubnet(deleteSubnetOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteSubnet" })
  public void testUnsetSubnetPublicGateway() throws Exception {
    try {
      UnsetSubnetPublicGatewayOptions unsetSubnetPublicGatewayOptions = new UnsetSubnetPublicGatewayOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.unsetSubnetPublicGateway(unsetSubnetPublicGatewayOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUnsetSubnetPublicGateway" })
  public void testDeleteSubnetReservedIp() throws Exception {
    try {
      DeleteSubnetReservedIpOptions deleteSubnetReservedIpOptions = new DeleteSubnetReservedIpOptions.Builder()
        .subnetId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteSubnetReservedIp(deleteSubnetReservedIpOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteSubnetReservedIp" })
  public void testDeleteImage() throws Exception {
    try {
      DeleteImageOptions deleteImageOptions = new DeleteImageOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteImage(deleteImageOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteImage" })
  public void testDeleteImageExportJob() throws Exception {
    try {
      DeleteImageExportJobOptions deleteImageExportJobOptions = new DeleteImageExportJobOptions.Builder()
        .imageId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteImageExportJob(deleteImageExportJobOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteImageExportJob" })
  public void testDeleteKey() throws Exception {
    try {
      DeleteKeyOptions deleteKeyOptions = new DeleteKeyOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteKey(deleteKeyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteKey" })
  public void testDeleteInstanceTemplate() throws Exception {
    try {
      DeleteInstanceTemplateOptions deleteInstanceTemplateOptions = new DeleteInstanceTemplateOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteInstanceTemplate(deleteInstanceTemplateOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteInstanceTemplate" })
  public void testDeleteInstance() throws Exception {
    try {
      DeleteInstanceOptions deleteInstanceOptions = new DeleteInstanceOptions.Builder()
        .id("testString")
        .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteInstance(deleteInstanceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteInstance" })
  public void testDeleteInstanceClusterNetworkAttachment() throws Exception {
    try {
      DeleteInstanceClusterNetworkAttachmentOptions deleteInstanceClusterNetworkAttachmentOptions = new DeleteInstanceClusterNetworkAttachmentOptions.Builder()
        .instanceId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<InstanceClusterNetworkAttachment> response = service.deleteInstanceClusterNetworkAttachment(deleteInstanceClusterNetworkAttachmentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      InstanceClusterNetworkAttachment instanceClusterNetworkAttachmentResult = response.getResult();
      assertNotNull(instanceClusterNetworkAttachmentResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteInstanceClusterNetworkAttachment" })
  public void testDeleteInstanceNetworkAttachment() throws Exception {
    try {
      DeleteInstanceNetworkAttachmentOptions deleteInstanceNetworkAttachmentOptions = new DeleteInstanceNetworkAttachmentOptions.Builder()
        .instanceId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteInstanceNetworkAttachment(deleteInstanceNetworkAttachmentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteInstanceNetworkAttachment" })
  public void testDeleteInstanceNetworkInterface() throws Exception {
    try {
      DeleteInstanceNetworkInterfaceOptions deleteInstanceNetworkInterfaceOptions = new DeleteInstanceNetworkInterfaceOptions.Builder()
        .instanceId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteInstanceNetworkInterface(deleteInstanceNetworkInterfaceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteInstanceNetworkInterface" })
  public void testRemoveInstanceNetworkInterfaceFloatingIp() throws Exception {
    try {
      RemoveInstanceNetworkInterfaceFloatingIpOptions removeInstanceNetworkInterfaceFloatingIpOptions = new RemoveInstanceNetworkInterfaceFloatingIpOptions.Builder()
        .instanceId("testString")
        .networkInterfaceId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.removeInstanceNetworkInterfaceFloatingIp(removeInstanceNetworkInterfaceFloatingIpOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testRemoveInstanceNetworkInterfaceFloatingIp" })
  public void testDeleteInstanceVolumeAttachment() throws Exception {
    try {
      DeleteInstanceVolumeAttachmentOptions deleteInstanceVolumeAttachmentOptions = new DeleteInstanceVolumeAttachmentOptions.Builder()
        .instanceId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteInstanceVolumeAttachment(deleteInstanceVolumeAttachmentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteInstanceVolumeAttachment" })
  public void testDeleteInstanceGroup() throws Exception {
    try {
      DeleteInstanceGroupOptions deleteInstanceGroupOptions = new DeleteInstanceGroupOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteInstanceGroup(deleteInstanceGroupOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteInstanceGroup" })
  public void testDeleteInstanceGroupLoadBalancer() throws Exception {
    try {
      DeleteInstanceGroupLoadBalancerOptions deleteInstanceGroupLoadBalancerOptions = new DeleteInstanceGroupLoadBalancerOptions.Builder()
        .instanceGroupId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteInstanceGroupLoadBalancer(deleteInstanceGroupLoadBalancerOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteInstanceGroupLoadBalancer" })
  public void testDeleteInstanceGroupManager() throws Exception {
    try {
      DeleteInstanceGroupManagerOptions deleteInstanceGroupManagerOptions = new DeleteInstanceGroupManagerOptions.Builder()
        .instanceGroupId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteInstanceGroupManager(deleteInstanceGroupManagerOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteInstanceGroupManager" })
  public void testDeleteInstanceGroupManagerAction() throws Exception {
    try {
      DeleteInstanceGroupManagerActionOptions deleteInstanceGroupManagerActionOptions = new DeleteInstanceGroupManagerActionOptions.Builder()
        .instanceGroupId("testString")
        .instanceGroupManagerId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteInstanceGroupManagerAction(deleteInstanceGroupManagerActionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteInstanceGroupManagerAction" })
  public void testDeleteInstanceGroupManagerPolicy() throws Exception {
    try {
      DeleteInstanceGroupManagerPolicyOptions deleteInstanceGroupManagerPolicyOptions = new DeleteInstanceGroupManagerPolicyOptions.Builder()
        .instanceGroupId("testString")
        .instanceGroupManagerId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteInstanceGroupManagerPolicy(deleteInstanceGroupManagerPolicyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteInstanceGroupManagerPolicy" })
  public void testDeleteInstanceGroupMemberships() throws Exception {
    try {
      DeleteInstanceGroupMembershipsOptions deleteInstanceGroupMembershipsOptions = new DeleteInstanceGroupMembershipsOptions.Builder()
        .instanceGroupId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteInstanceGroupMemberships(deleteInstanceGroupMembershipsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteInstanceGroupMemberships" })
  public void testDeleteInstanceGroupMembership() throws Exception {
    try {
      DeleteInstanceGroupMembershipOptions deleteInstanceGroupMembershipOptions = new DeleteInstanceGroupMembershipOptions.Builder()
        .instanceGroupId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteInstanceGroupMembership(deleteInstanceGroupMembershipOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteInstanceGroupMembership" })
  public void testDeleteReservation() throws Exception {
    try {
      DeleteReservationOptions deleteReservationOptions = new DeleteReservationOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<Reservation> response = service.deleteReservation(deleteReservationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      Reservation reservationResult = response.getResult();
      assertNotNull(reservationResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteReservation" })
  public void testDeleteDedicatedHostGroup() throws Exception {
    try {
      DeleteDedicatedHostGroupOptions deleteDedicatedHostGroupOptions = new DeleteDedicatedHostGroupOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteDedicatedHostGroup(deleteDedicatedHostGroupOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteDedicatedHostGroup" })
  public void testDeleteDedicatedHost() throws Exception {
    try {
      DeleteDedicatedHostOptions deleteDedicatedHostOptions = new DeleteDedicatedHostOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteDedicatedHost(deleteDedicatedHostOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteDedicatedHost" })
  public void testDeletePlacementGroup() throws Exception {
    try {
      DeletePlacementGroupOptions deletePlacementGroupOptions = new DeletePlacementGroupOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deletePlacementGroup(deletePlacementGroupOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeletePlacementGroup" })
  public void testDeleteBareMetalServerNetworkAttachment() throws Exception {
    try {
      DeleteBareMetalServerNetworkAttachmentOptions deleteBareMetalServerNetworkAttachmentOptions = new DeleteBareMetalServerNetworkAttachmentOptions.Builder()
        .bareMetalServerId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteBareMetalServerNetworkAttachment(deleteBareMetalServerNetworkAttachmentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteBareMetalServerNetworkAttachment" })
  public void testDeleteBareMetalServerNetworkInterface() throws Exception {
    try {
      DeleteBareMetalServerNetworkInterfaceOptions deleteBareMetalServerNetworkInterfaceOptions = new DeleteBareMetalServerNetworkInterfaceOptions.Builder()
        .bareMetalServerId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteBareMetalServerNetworkInterface(deleteBareMetalServerNetworkInterfaceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteBareMetalServerNetworkInterface" })
  public void testRemoveBareMetalServerNetworkInterfaceFloatingIp() throws Exception {
    try {
      RemoveBareMetalServerNetworkInterfaceFloatingIpOptions removeBareMetalServerNetworkInterfaceFloatingIpOptions = new RemoveBareMetalServerNetworkInterfaceFloatingIpOptions.Builder()
        .bareMetalServerId("testString")
        .networkInterfaceId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.removeBareMetalServerNetworkInterfaceFloatingIp(removeBareMetalServerNetworkInterfaceFloatingIpOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testRemoveBareMetalServerNetworkInterfaceFloatingIp" })
  public void testDeleteBareMetalServer() throws Exception {
    try {
      DeleteBareMetalServerOptions deleteBareMetalServerOptions = new DeleteBareMetalServerOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteBareMetalServer(deleteBareMetalServerOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteBareMetalServer" })
  public void testDeleteVolume() throws Exception {
    try {
      DeleteVolumeOptions deleteVolumeOptions = new DeleteVolumeOptions.Builder()
        .id("testString")
        .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteVolume(deleteVolumeOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteVolume" })
  public void testDeleteSnapshotConsistencyGroup() throws Exception {
    try {
      DeleteSnapshotConsistencyGroupOptions deleteSnapshotConsistencyGroupOptions = new DeleteSnapshotConsistencyGroupOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<SnapshotConsistencyGroup> response = service.deleteSnapshotConsistencyGroup(deleteSnapshotConsistencyGroupOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      SnapshotConsistencyGroup snapshotConsistencyGroupResult = response.getResult();
      assertNotNull(snapshotConsistencyGroupResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteSnapshotConsistencyGroup" })
  public void testDeleteSnapshots() throws Exception {
    try {
      DeleteSnapshotsOptions deleteSnapshotsOptions = new DeleteSnapshotsOptions.Builder()
        .sourceVolumeId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteSnapshots(deleteSnapshotsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteSnapshots" })
  public void testDeleteSnapshot() throws Exception {
    try {
      DeleteSnapshotOptions deleteSnapshotOptions = new DeleteSnapshotOptions.Builder()
        .id("testString")
        .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteSnapshot(deleteSnapshotOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteSnapshot" })
  public void testDeleteSnapshotClone() throws Exception {
    try {
      DeleteSnapshotCloneOptions deleteSnapshotCloneOptions = new DeleteSnapshotCloneOptions.Builder()
        .id("testString")
        .zoneName("us-south-1")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteSnapshotClone(deleteSnapshotCloneOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteSnapshotClone" })
  public void testDeleteShare() throws Exception {
    try {
      DeleteShareOptions deleteShareOptions = new DeleteShareOptions.Builder()
        .id("testString")
        .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
        .build();

      // Invoke operation
      Response<Share> response = service.deleteShare(deleteShareOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      Share shareResult = response.getResult();
      assertNotNull(shareResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteShare" })
  public void testDeleteShareAccessorBinding() throws Exception {
    try {
      DeleteShareAccessorBindingOptions deleteShareAccessorBindingOptions = new DeleteShareAccessorBindingOptions.Builder()
        .shareId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteShareAccessorBinding(deleteShareAccessorBindingOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteShareAccessorBinding" })
  public void testDeleteShareMountTarget() throws Exception {
    try {
      DeleteShareMountTargetOptions deleteShareMountTargetOptions = new DeleteShareMountTargetOptions.Builder()
        .shareId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<ShareMountTarget> response = service.deleteShareMountTarget(deleteShareMountTargetOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      ShareMountTarget shareMountTargetResult = response.getResult();
      assertNotNull(shareMountTargetResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteShareMountTarget" })
  public void testDeleteShareSnapshot() throws Exception {
    try {
      DeleteShareSnapshotOptions deleteShareSnapshotOptions = new DeleteShareSnapshotOptions.Builder()
        .shareId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<ShareSnapshot> response = service.deleteShareSnapshot(deleteShareSnapshotOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      ShareSnapshot shareSnapshotResult = response.getResult();
      assertNotNull(shareSnapshotResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteShareSnapshot" })
  public void testDeleteShareSource() throws Exception {
    try {
      DeleteShareSourceOptions deleteShareSourceOptions = new DeleteShareSourceOptions.Builder()
        .shareId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteShareSource(deleteShareSourceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteShareSource" })
  public void testDeleteBackupPolicyPlan() throws Exception {
    try {
      DeleteBackupPolicyPlanOptions deleteBackupPolicyPlanOptions = new DeleteBackupPolicyPlanOptions.Builder()
        .backupPolicyId("testString")
        .id("testString")
        .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
        .build();

      // Invoke operation
      Response<BackupPolicyPlan> response = service.deleteBackupPolicyPlan(deleteBackupPolicyPlanOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      BackupPolicyPlan backupPolicyPlanResult = response.getResult();
      assertNotNull(backupPolicyPlanResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteBackupPolicyPlan" })
  public void testDeleteBackupPolicy() throws Exception {
    try {
      DeleteBackupPolicyOptions deleteBackupPolicyOptions = new DeleteBackupPolicyOptions.Builder()
        .id("testString")
        .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
        .build();

      // Invoke operation
      Response<BackupPolicy> response = service.deleteBackupPolicy(deleteBackupPolicyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      BackupPolicy backupPolicyResult = response.getResult();
      assertNotNull(backupPolicyResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteBackupPolicy" })
  public void testDeleteVirtualNetworkInterfaces() throws Exception {
    try {
      DeleteVirtualNetworkInterfacesOptions deleteVirtualNetworkInterfacesOptions = new DeleteVirtualNetworkInterfacesOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<VirtualNetworkInterface> response = service.deleteVirtualNetworkInterfaces(deleteVirtualNetworkInterfacesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      VirtualNetworkInterface virtualNetworkInterfaceResult = response.getResult();
      assertNotNull(virtualNetworkInterfaceResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteVirtualNetworkInterfaces" })
  public void testRemoveNetworkInterfaceFloatingIp() throws Exception {
    try {
      RemoveNetworkInterfaceFloatingIpOptions removeNetworkInterfaceFloatingIpOptions = new RemoveNetworkInterfaceFloatingIpOptions.Builder()
        .virtualNetworkInterfaceId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.removeNetworkInterfaceFloatingIp(removeNetworkInterfaceFloatingIpOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testRemoveNetworkInterfaceFloatingIp" })
  public void testRemoveVirtualNetworkInterfaceIp() throws Exception {
    try {
      RemoveVirtualNetworkInterfaceIpOptions removeVirtualNetworkInterfaceIpOptions = new RemoveVirtualNetworkInterfaceIpOptions.Builder()
        .virtualNetworkInterfaceId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.removeVirtualNetworkInterfaceIp(removeVirtualNetworkInterfaceIpOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testRemoveVirtualNetworkInterfaceIp" })
  public void testDeleteClusterNetworkInterface() throws Exception {
    try {
      DeleteClusterNetworkInterfaceOptions deleteClusterNetworkInterfaceOptions = new DeleteClusterNetworkInterfaceOptions.Builder()
        .clusterNetworkId("testString")
        .id("testString")
        .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
        .build();

      // Invoke operation
      Response<ClusterNetworkInterface> response = service.deleteClusterNetworkInterface(deleteClusterNetworkInterfaceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      ClusterNetworkInterface clusterNetworkInterfaceResult = response.getResult();
      assertNotNull(clusterNetworkInterfaceResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteClusterNetworkInterface" })
  public void testDeleteClusterNetworkSubnetReservedIp() throws Exception {
    try {
      DeleteClusterNetworkSubnetReservedIpOptions deleteClusterNetworkSubnetReservedIpOptions = new DeleteClusterNetworkSubnetReservedIpOptions.Builder()
        .clusterNetworkId("testString")
        .clusterNetworkSubnetId("testString")
        .id("testString")
        .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
        .build();

      // Invoke operation
      Response<ClusterNetworkSubnetReservedIP> response = service.deleteClusterNetworkSubnetReservedIp(deleteClusterNetworkSubnetReservedIpOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      ClusterNetworkSubnetReservedIP clusterNetworkSubnetReservedIpResult = response.getResult();
      assertNotNull(clusterNetworkSubnetReservedIpResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteClusterNetworkSubnetReservedIp" })
  public void testDeleteClusterNetworkSubnet() throws Exception {
    try {
      DeleteClusterNetworkSubnetOptions deleteClusterNetworkSubnetOptions = new DeleteClusterNetworkSubnetOptions.Builder()
        .clusterNetworkId("testString")
        .id("testString")
        .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
        .build();

      // Invoke operation
      Response<ClusterNetworkSubnet> response = service.deleteClusterNetworkSubnet(deleteClusterNetworkSubnetOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      ClusterNetworkSubnet clusterNetworkSubnetResult = response.getResult();
      assertNotNull(clusterNetworkSubnetResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteClusterNetworkSubnet" })
  public void testDeleteClusterNetwork() throws Exception {
    try {
      DeleteClusterNetworkOptions deleteClusterNetworkOptions = new DeleteClusterNetworkOptions.Builder()
        .id("testString")
        .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
        .build();

      // Invoke operation
      Response<ClusterNetwork> response = service.deleteClusterNetwork(deleteClusterNetworkOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      ClusterNetwork clusterNetworkResult = response.getResult();
      assertNotNull(clusterNetworkResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteClusterNetwork" })
  public void testDeletePublicGateway() throws Exception {
    try {
      DeletePublicGatewayOptions deletePublicGatewayOptions = new DeletePublicGatewayOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deletePublicGateway(deletePublicGatewayOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeletePublicGateway" })
  public void testDeleteFloatingIp() throws Exception {
    try {
      DeleteFloatingIpOptions deleteFloatingIpOptions = new DeleteFloatingIpOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteFloatingIp(deleteFloatingIpOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteFloatingIp" })
  public void testDeleteNetworkAcl() throws Exception {
    try {
      DeleteNetworkAclOptions deleteNetworkAclOptions = new DeleteNetworkAclOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteNetworkAcl(deleteNetworkAclOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteNetworkAcl" })
  public void testDeleteNetworkAclRule() throws Exception {
    try {
      DeleteNetworkAclRuleOptions deleteNetworkAclRuleOptions = new DeleteNetworkAclRuleOptions.Builder()
        .networkAclId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteNetworkAclRule(deleteNetworkAclRuleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteNetworkAclRule" })
  public void testDeleteSecurityGroup() throws Exception {
    try {
      DeleteSecurityGroupOptions deleteSecurityGroupOptions = new DeleteSecurityGroupOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteSecurityGroup(deleteSecurityGroupOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteSecurityGroup" })
  public void testDeleteSecurityGroupRule() throws Exception {
    try {
      DeleteSecurityGroupRuleOptions deleteSecurityGroupRuleOptions = new DeleteSecurityGroupRuleOptions.Builder()
        .securityGroupId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteSecurityGroupRule(deleteSecurityGroupRuleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteSecurityGroupRule" })
  public void testDeleteSecurityGroupTargetBinding() throws Exception {
    try {
      DeleteSecurityGroupTargetBindingOptions deleteSecurityGroupTargetBindingOptions = new DeleteSecurityGroupTargetBindingOptions.Builder()
        .securityGroupId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteSecurityGroupTargetBinding(deleteSecurityGroupTargetBindingOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteSecurityGroupTargetBinding" })
  public void testDeleteIkePolicy() throws Exception {
    try {
      DeleteIkePolicyOptions deleteIkePolicyOptions = new DeleteIkePolicyOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteIkePolicy(deleteIkePolicyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteIkePolicy" })
  public void testDeleteIpsecPolicy() throws Exception {
    try {
      DeleteIpsecPolicyOptions deleteIpsecPolicyOptions = new DeleteIpsecPolicyOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteIpsecPolicy(deleteIpsecPolicyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteIpsecPolicy" })
  public void testDeleteVpnGateway() throws Exception {
    try {
      DeleteVpnGatewayOptions deleteVpnGatewayOptions = new DeleteVpnGatewayOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteVpnGateway(deleteVpnGatewayOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteVpnGateway" })
  public void testDeleteVpnGatewayConnection() throws Exception {
    try {
      DeleteVpnGatewayConnectionOptions deleteVpnGatewayConnectionOptions = new DeleteVpnGatewayConnectionOptions.Builder()
        .vpnGatewayId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteVpnGatewayConnection(deleteVpnGatewayConnectionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteVpnGatewayConnection" })
  public void testRemoveVpnGatewayConnectionsLocalCidr() throws Exception {
    try {
      RemoveVpnGatewayConnectionsLocalCidrOptions removeVpnGatewayConnectionsLocalCidrOptions = new RemoveVpnGatewayConnectionsLocalCidrOptions.Builder()
        .vpnGatewayId("testString")
        .id("testString")
        .cidr("192.168.1.0/24")
        .build();

      // Invoke operation
      Response<Void> response = service.removeVpnGatewayConnectionsLocalCidr(removeVpnGatewayConnectionsLocalCidrOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testRemoveVpnGatewayConnectionsLocalCidr" })
  public void testRemoveVpnGatewayConnectionsPeerCidr() throws Exception {
    try {
      RemoveVpnGatewayConnectionsPeerCidrOptions removeVpnGatewayConnectionsPeerCidrOptions = new RemoveVpnGatewayConnectionsPeerCidrOptions.Builder()
        .vpnGatewayId("testString")
        .id("testString")
        .cidr("192.168.1.0/24")
        .build();

      // Invoke operation
      Response<Void> response = service.removeVpnGatewayConnectionsPeerCidr(removeVpnGatewayConnectionsPeerCidrOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testRemoveVpnGatewayConnectionsPeerCidr" })
  public void testDeleteVpnServer() throws Exception {
    try {
      DeleteVpnServerOptions deleteVpnServerOptions = new DeleteVpnServerOptions.Builder()
        .id("testString")
        .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteVpnServer(deleteVpnServerOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteVpnServer" })
  public void testDeleteVpnServerClient() throws Exception {
    try {
      DeleteVpnServerClientOptions deleteVpnServerClientOptions = new DeleteVpnServerClientOptions.Builder()
        .vpnServerId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteVpnServerClient(deleteVpnServerClientOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteVpnServerClient" })
  public void testDeleteVpnServerRoute() throws Exception {
    try {
      DeleteVpnServerRouteOptions deleteVpnServerRouteOptions = new DeleteVpnServerRouteOptions.Builder()
        .vpnServerId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteVpnServerRoute(deleteVpnServerRouteOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteVpnServerRoute" })
  public void testDeleteLoadBalancer() throws Exception {
    try {
      DeleteLoadBalancerOptions deleteLoadBalancerOptions = new DeleteLoadBalancerOptions.Builder()
        .id("testString")
        .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteLoadBalancer(deleteLoadBalancerOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteLoadBalancer" })
  public void testDeleteLoadBalancerListener() throws Exception {
    try {
      DeleteLoadBalancerListenerOptions deleteLoadBalancerListenerOptions = new DeleteLoadBalancerListenerOptions.Builder()
        .loadBalancerId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteLoadBalancerListener(deleteLoadBalancerListenerOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteLoadBalancerListener" })
  public void testDeleteLoadBalancerListenerPolicy() throws Exception {
    try {
      DeleteLoadBalancerListenerPolicyOptions deleteLoadBalancerListenerPolicyOptions = new DeleteLoadBalancerListenerPolicyOptions.Builder()
        .loadBalancerId("testString")
        .listenerId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteLoadBalancerListenerPolicy(deleteLoadBalancerListenerPolicyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteLoadBalancerListenerPolicy" })
  public void testDeleteLoadBalancerListenerPolicyRule() throws Exception {
    try {
      DeleteLoadBalancerListenerPolicyRuleOptions deleteLoadBalancerListenerPolicyRuleOptions = new DeleteLoadBalancerListenerPolicyRuleOptions.Builder()
        .loadBalancerId("testString")
        .listenerId("testString")
        .policyId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteLoadBalancerListenerPolicyRule(deleteLoadBalancerListenerPolicyRuleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteLoadBalancerListenerPolicyRule" })
  public void testDeleteLoadBalancerPool() throws Exception {
    try {
      DeleteLoadBalancerPoolOptions deleteLoadBalancerPoolOptions = new DeleteLoadBalancerPoolOptions.Builder()
        .loadBalancerId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteLoadBalancerPool(deleteLoadBalancerPoolOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteLoadBalancerPool" })
  public void testDeleteLoadBalancerPoolMember() throws Exception {
    try {
      DeleteLoadBalancerPoolMemberOptions deleteLoadBalancerPoolMemberOptions = new DeleteLoadBalancerPoolMemberOptions.Builder()
        .loadBalancerId("testString")
        .poolId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteLoadBalancerPoolMember(deleteLoadBalancerPoolMemberOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteLoadBalancerPoolMember" })
  public void testRemoveEndpointGatewayIp() throws Exception {
    try {
      RemoveEndpointGatewayIpOptions removeEndpointGatewayIpOptions = new RemoveEndpointGatewayIpOptions.Builder()
        .endpointGatewayId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.removeEndpointGatewayIp(removeEndpointGatewayIpOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testRemoveEndpointGatewayIp" })
  public void testDeleteEndpointGateway() throws Exception {
    try {
      DeleteEndpointGatewayOptions deleteEndpointGatewayOptions = new DeleteEndpointGatewayOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteEndpointGateway(deleteEndpointGatewayOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteEndpointGateway" })
  public void testDeleteFlowLogCollector() throws Exception {
    try {
      DeleteFlowLogCollectorOptions deleteFlowLogCollectorOptions = new DeleteFlowLogCollectorOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteFlowLogCollector(deleteFlowLogCollectorOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteFlowLogCollector" })
  public void testDeletePrivatePathServiceGateway() throws Exception {
    try {
      DeletePrivatePathServiceGatewayOptions deletePrivatePathServiceGatewayOptions = new DeletePrivatePathServiceGatewayOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deletePrivatePathServiceGateway(deletePrivatePathServiceGatewayOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeletePrivatePathServiceGateway" })
  public void testDeletePrivatePathServiceGatewayAccountPolicy() throws Exception {
    try {
      DeletePrivatePathServiceGatewayAccountPolicyOptions deletePrivatePathServiceGatewayAccountPolicyOptions = new DeletePrivatePathServiceGatewayAccountPolicyOptions.Builder()
        .privatePathServiceGatewayId("testString")
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deletePrivatePathServiceGatewayAccountPolicy(deletePrivatePathServiceGatewayAccountPolicyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @AfterClass
  public void tearDown() {
    // Add any clean up logic here
    System.out.println("Clean up complete.");
  }
 }
