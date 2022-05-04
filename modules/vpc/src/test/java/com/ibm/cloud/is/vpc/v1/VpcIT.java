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

package com.ibm.cloud.is.vpc.v1;

import com.ibm.cloud.is.test.SdkIntegrationTestBase;
import com.ibm.cloud.is.vpc.v1.model.AddBareMetalServerNetworkInterfaceFloatingIpOptions;
import com.ibm.cloud.is.vpc.v1.model.AddEndpointGatewayIpOptions;
import com.ibm.cloud.is.vpc.v1.model.AddInstanceNetworkInterfaceFloatingIpOptions;
import com.ibm.cloud.is.vpc.v1.model.AddVpnGatewayConnectionLocalCidrOptions;
import com.ibm.cloud.is.vpc.v1.model.AddVpnGatewayConnectionPeerCidrOptions;
import com.ibm.cloud.is.vpc.v1.model.AddressPrefix;
import com.ibm.cloud.is.vpc.v1.model.AddressPrefixCollection;
import com.ibm.cloud.is.vpc.v1.model.AddressPrefixCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.AddressPrefixCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.AddressPrefixPatch;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServer;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerBootTarget;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerBootTargetBareMetalServerDiskReference;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerCPU;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerCollection;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerConsoleAccessToken;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerDisk;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerDiskCollection;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerDiskPatch;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerDiskReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerInitialization;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerInitializationPrototype;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerInitializationUserAccount;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerInitializationUserAccountBareMetalServerInitializationHostUserAccount;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkInterface;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkInterfaceByPCI;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkInterfaceByVLAN;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkInterfaceCollection;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkInterfaceCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkInterfaceCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkInterfacePatch;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkInterfacePrototype;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByPCIPrototype;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototype;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerPatch;
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
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileCollectionNext;
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
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileOSArchitecture;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileReference;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileSupportedTrustedPlatformModuleModes;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerStatusReason;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerTrustedPlatformModule;
import com.ibm.cloud.is.vpc.v1.model.CertificateInstanceIdentity;
import com.ibm.cloud.is.vpc.v1.model.CertificateInstanceIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.CertificateInstanceReference;
import com.ibm.cloud.is.vpc.v1.model.CheckVpnGatewayConnectionLocalCidrOptions;
import com.ibm.cloud.is.vpc.v1.model.CheckVpnGatewayConnectionPeerCidrOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateBareMetalServerConsoleAccessTokenOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateBareMetalServerNetworkInterfaceOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateBareMetalServerOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateDedicatedHostGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateDedicatedHostOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateEndpointGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateFloatingIpOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateFlowLogCollectorOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateIkePolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateImageOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateInstanceActionOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateInstanceConsoleAccessTokenOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateInstanceGroupManagerActionOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateInstanceGroupManagerOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateInstanceGroupManagerPolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateInstanceGroupOptions;
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
import com.ibm.cloud.is.vpc.v1.model.CreatePublicGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateSecurityGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateSecurityGroupRuleOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateSecurityGroupTargetBindingOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateSnapshotOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateSubnetOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateSubnetReservedIpOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateVolumeOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateVpcAddressPrefixOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateVpcOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateVpcRouteOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateVpcRoutingTableOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateVpcRoutingTableRouteOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateVpnGatewayConnectionOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateVpnGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHost;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostCollection;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostDisk;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostDiskCollection;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostDiskPatch;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostGroup;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostGroupCollection;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostGroupCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostGroupCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostGroupIdentity;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostGroupIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostGroupIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostGroupPatch;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostGroupPrototypeDedicatedHostByZoneContext;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostGroupReference;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostGroupReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostPatch;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfile;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileCollection;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileCollectionNext;
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
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileVCPURange;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostPrototype;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostPrototypeDedicatedHostByGroup;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostPrototypeDedicatedHostByZone;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostReference;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.DefaultNetworkACL;
import com.ibm.cloud.is.vpc.v1.model.DefaultRoutingTable;
import com.ibm.cloud.is.vpc.v1.model.DefaultSecurityGroup;
import com.ibm.cloud.is.vpc.v1.model.DeleteBareMetalServerNetworkInterfaceOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteBareMetalServerOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteDedicatedHostGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteDedicatedHostOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteEndpointGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteFloatingIpOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteFlowLogCollectorOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteIkePolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteImageOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteInstanceGroupLoadBalancerOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteInstanceGroupManagerActionOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteInstanceGroupManagerOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteInstanceGroupManagerPolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteInstanceGroupMembershipOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteInstanceGroupMembershipsOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteInstanceGroupOptions;
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
import com.ibm.cloud.is.vpc.v1.model.DeletePublicGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteSecurityGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteSecurityGroupRuleOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteSecurityGroupTargetBindingOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteSnapshotOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteSnapshotsOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteSubnetOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteSubnetReservedIpOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteVolumeOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteVpcAddressPrefixOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteVpcOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteVpcRouteOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteVpcRoutingTableOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteVpcRoutingTableRouteOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteVpnGatewayConnectionOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteVpnGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.EncryptionKeyIdentity;
import com.ibm.cloud.is.vpc.v1.model.EncryptionKeyIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.EncryptionKeyReference;
import com.ibm.cloud.is.vpc.v1.model.EndpointGateway;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayCollection;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayPatch;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayReservedIP;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayReservedIPReservedIPIdentity;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayReservedIPReservedIPIdentityReservedIPIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayReservedIPReservedIPIdentityReservedIPIdentityById;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayReservedIPReservedIPPrototypeTargetContext;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayTarget;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayTargetPrototype;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayTargetPrototypeProviderCloudServiceIdentity;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayTargetPrototypeProviderCloudServiceIdentityProviderCloudServiceIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayTargetPrototypeProviderInfrastructureServiceIdentity;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayTargetPrototypeProviderInfrastructureServiceIdentityProviderInfrastructureServiceIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayTargetProviderCloudServiceReference;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayTargetProviderInfrastructureServiceReference;
import com.ibm.cloud.is.vpc.v1.model.FloatingIP;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPByTargetNetworkInterfaceIdentity;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPByTargetNetworkInterfaceIdentityNetworkInterfaceIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPByTargetNetworkInterfaceIdentityNetworkInterfaceIdentityById;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPCollection;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPPatch;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPPrototype;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPPrototypeFloatingIPByTarget;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPPrototypeFloatingIPByZone;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPReference;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPTarget;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPTargetNetworkInterfaceReference;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPTargetPatch;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPTargetPatchNetworkInterfaceIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPTargetPatchNetworkInterfaceIdentityById;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPTargetPublicGatewayReference;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPUnpaginatedCollection;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollector;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorCollection;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorPatch;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTarget;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetInstanceReference;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetNetworkInterfaceReferenceTargetContext;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototype;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototypeInstanceIdentity;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototypeInstanceIdentityInstanceIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototypeInstanceIdentityInstanceIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototypeInstanceIdentityInstanceIdentityById;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototypeNetworkInterfaceIdentity;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityNetworkInterfaceIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityNetworkInterfaceIdentityById;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototypeSubnetIdentity;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototypeSubnetIdentitySubnetIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototypeSubnetIdentitySubnetIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototypeSubnetIdentitySubnetIdentityById;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototypeVPCIdentity;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototypeVPCIdentityVPCIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototypeVPCIdentityVPCIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototypeVPCIdentityVPCIdentityById;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetSubnetReference;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetVPCReference;
import com.ibm.cloud.is.vpc.v1.model.GenericResourceReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.GetBareMetalServerDiskOptions;
import com.ibm.cloud.is.vpc.v1.model.GetBareMetalServerInitializationOptions;
import com.ibm.cloud.is.vpc.v1.model.GetBareMetalServerNetworkInterfaceFloatingIpOptions;
import com.ibm.cloud.is.vpc.v1.model.GetBareMetalServerNetworkInterfaceIpOptions;
import com.ibm.cloud.is.vpc.v1.model.GetBareMetalServerNetworkInterfaceOptions;
import com.ibm.cloud.is.vpc.v1.model.GetBareMetalServerOptions;
import com.ibm.cloud.is.vpc.v1.model.GetBareMetalServerProfileOptions;
import com.ibm.cloud.is.vpc.v1.model.GetDedicatedHostDiskOptions;
import com.ibm.cloud.is.vpc.v1.model.GetDedicatedHostGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.GetDedicatedHostOptions;
import com.ibm.cloud.is.vpc.v1.model.GetDedicatedHostProfileOptions;
import com.ibm.cloud.is.vpc.v1.model.GetEndpointGatewayIpOptions;
import com.ibm.cloud.is.vpc.v1.model.GetEndpointGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.GetFloatingIpOptions;
import com.ibm.cloud.is.vpc.v1.model.GetFlowLogCollectorOptions;
import com.ibm.cloud.is.vpc.v1.model.GetIkePolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.GetImageOptions;
import com.ibm.cloud.is.vpc.v1.model.GetInstanceDiskOptions;
import com.ibm.cloud.is.vpc.v1.model.GetInstanceGroupManagerActionOptions;
import com.ibm.cloud.is.vpc.v1.model.GetInstanceGroupManagerOptions;
import com.ibm.cloud.is.vpc.v1.model.GetInstanceGroupManagerPolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.GetInstanceGroupMembershipOptions;
import com.ibm.cloud.is.vpc.v1.model.GetInstanceGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.GetInstanceInitializationOptions;
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
import com.ibm.cloud.is.vpc.v1.model.GetOperatingSystemOptions;
import com.ibm.cloud.is.vpc.v1.model.GetPlacementGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.GetPublicGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.GetRegionOptions;
import com.ibm.cloud.is.vpc.v1.model.GetRegionZoneOptions;
import com.ibm.cloud.is.vpc.v1.model.GetSecurityGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.GetSecurityGroupRuleOptions;
import com.ibm.cloud.is.vpc.v1.model.GetSecurityGroupTargetOptions;
import com.ibm.cloud.is.vpc.v1.model.GetSnapshotOptions;
import com.ibm.cloud.is.vpc.v1.model.GetSubnetNetworkAclOptions;
import com.ibm.cloud.is.vpc.v1.model.GetSubnetOptions;
import com.ibm.cloud.is.vpc.v1.model.GetSubnetPublicGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.GetSubnetReservedIpOptions;
import com.ibm.cloud.is.vpc.v1.model.GetSubnetRoutingTableOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVolumeOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVolumeProfileOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVpcAddressPrefixOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVpcDefaultNetworkAclOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVpcDefaultRoutingTableOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVpcDefaultSecurityGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVpcOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVpcRouteOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVpcRoutingTableOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVpcRoutingTableRouteOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVpnGatewayConnectionOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVpnGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.IKEPolicy;
import com.ibm.cloud.is.vpc.v1.model.IKEPolicyCollection;
import com.ibm.cloud.is.vpc.v1.model.IKEPolicyCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.IKEPolicyCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.IKEPolicyPatch;
import com.ibm.cloud.is.vpc.v1.model.IKEPolicyReference;
import com.ibm.cloud.is.vpc.v1.model.IKEPolicyReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.IP;
import com.ibm.cloud.is.vpc.v1.model.IPsecPolicy;
import com.ibm.cloud.is.vpc.v1.model.IPsecPolicyCollection;
import com.ibm.cloud.is.vpc.v1.model.IPsecPolicyCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.IPsecPolicyCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.IPsecPolicyPatch;
import com.ibm.cloud.is.vpc.v1.model.IPsecPolicyReference;
import com.ibm.cloud.is.vpc.v1.model.IPsecPolicyReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.Image;
import com.ibm.cloud.is.vpc.v1.model.ImageCollection;
import com.ibm.cloud.is.vpc.v1.model.ImageCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.ImageCollectionNext;
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
import com.ibm.cloud.is.vpc.v1.model.ImageReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.ImageStatusReason;
import com.ibm.cloud.is.vpc.v1.model.Instance;
import com.ibm.cloud.is.vpc.v1.model.InstanceAction;
import com.ibm.cloud.is.vpc.v1.model.InstanceAvailabilityPolicy;
import com.ibm.cloud.is.vpc.v1.model.InstanceAvailabilityPolicyPatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceAvailabilityPrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.InstanceCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.InstanceConsoleAccessToken;
import com.ibm.cloud.is.vpc.v1.model.InstanceDefaultTrustedProfilePrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceDisk;
import com.ibm.cloud.is.vpc.v1.model.InstanceDiskCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceDiskPatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceDiskReference;
import com.ibm.cloud.is.vpc.v1.model.InstanceDiskReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.InstanceGPU;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroup;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupCollectionNext;
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
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerActionReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerActionScheduledAction;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerActionScheduledActionGroupTarget;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerActionScheduledActionManagerTarget;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerActionsCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerActionsCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerActionsCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerAutoScale;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPolicy;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPolicyCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPolicyCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPolicyCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPolicyInstanceGroupManagerTargetPolicy;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPolicyPatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPolicyPrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPolicyReference;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPolicyReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPrototypeInstanceGroupManagerScheduledPrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerReference;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerScheduled;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerScheduledActionGroup;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerScheduledActionGroupPrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerScheduledActionManager;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerScheduledActionManagerAutoScale;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerScheduledActionManagerPrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeByHref;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeById;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupMembership;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupMembershipCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupMembershipCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupMembershipCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupMembershipPatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupPatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupReference;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.InstanceInitialization;
import com.ibm.cloud.is.vpc.v1.model.InstanceInitializationDefaultTrustedProfile;
import com.ibm.cloud.is.vpc.v1.model.InstanceInitializationPassword;
import com.ibm.cloud.is.vpc.v1.model.InstanceMetadataService;
import com.ibm.cloud.is.vpc.v1.model.InstanceMetadataServicePatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceMetadataServicePrototype;
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
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileOSArchitecture;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfilePortSpeed;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfilePortSpeedDependent;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfilePortSpeedFixed;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileReference;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileVCPU;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileVCPUArchitecture;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileVCPUDependent;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileVCPUEnum;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileVCPUFixed;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileVCPURange;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileVolumeBandwidth;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileVolumeBandwidthDependent;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileVolumeBandwidthEnum;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileVolumeBandwidthFixed;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileVolumeBandwidthRange;
import com.ibm.cloud.is.vpc.v1.model.InstancePrototype;
import com.ibm.cloud.is.vpc.v1.model.InstancePrototypeInstanceByImage;
import com.ibm.cloud.is.vpc.v1.model.InstancePrototypeInstanceBySourceSnapshot;
import com.ibm.cloud.is.vpc.v1.model.InstancePrototypeInstanceBySourceTemplate;
import com.ibm.cloud.is.vpc.v1.model.InstanceReference;
import com.ibm.cloud.is.vpc.v1.model.InstanceReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.InstanceStatusReason;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplate;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateIdentity;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateIdentityById;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateInstanceByImage;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplatePatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplatePrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplatePrototypeInstanceByImage;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplatePrototypeInstanceBySourceTemplate;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateReference;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.InstanceVCPU;
import com.ibm.cloud.is.vpc.v1.model.Key;
import com.ibm.cloud.is.vpc.v1.model.KeyCollection;
import com.ibm.cloud.is.vpc.v1.model.KeyCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.KeyCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.KeyIdentity;
import com.ibm.cloud.is.vpc.v1.model.KeyIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.KeyIdentityByFingerprint;
import com.ibm.cloud.is.vpc.v1.model.KeyIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.KeyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.KeyPatch;
import com.ibm.cloud.is.vpc.v1.model.KeyReference;
import com.ibm.cloud.is.vpc.v1.model.KeyReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.LegacyCloudObjectStorageBucketIdentity;
import com.ibm.cloud.is.vpc.v1.model.LegacyCloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.LegacyCloudObjectStorageBucketReference;
import com.ibm.cloud.is.vpc.v1.model.ListBareMetalServerDisksOptions;
import com.ibm.cloud.is.vpc.v1.model.ListBareMetalServerNetworkInterfaceFloatingIpsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListBareMetalServerNetworkInterfaceIpsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListBareMetalServerNetworkInterfacesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListBareMetalServerProfilesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListBareMetalServersOptions;
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
import com.ibm.cloud.is.vpc.v1.model.ListImagesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListInstanceDisksOptions;
import com.ibm.cloud.is.vpc.v1.model.ListInstanceGroupManagerActionsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListInstanceGroupManagerPoliciesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListInstanceGroupManagersOptions;
import com.ibm.cloud.is.vpc.v1.model.ListInstanceGroupMembershipsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListInstanceGroupsOptions;
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
import com.ibm.cloud.is.vpc.v1.model.ListOperatingSystemsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListPlacementGroupsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListPublicGatewaysOptions;
import com.ibm.cloud.is.vpc.v1.model.ListRegionZonesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListRegionsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListSecurityGroupRulesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListSecurityGroupTargetsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListSecurityGroupsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListSnapshotsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListSubnetReservedIpsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListSubnetsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVolumeProfilesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVolumesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVpcAddressPrefixesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVpcRoutesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVpcRoutingTableRoutesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVpcRoutingTablesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVpcsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVpnGatewayConnectionLocalCidrsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVpnGatewayConnectionPeerCidrsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVpnGatewayConnectionsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVpnGatewaysOptions;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancer;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerCollection;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerIdentity;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerIdentityById;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListener;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerCollection;
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
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyRule;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyRuleCollection;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyRulePatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyRulePrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyRuleReference;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyRuleReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTarget;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetLoadBalancerListenerHTTPSRedirect;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetLoadBalancerListenerPolicyRedirectURL;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetLoadBalancerPoolReference;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerHTTPSRedirectPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyRedirectURLPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetPatchLoadBalancerPoolIdentity;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetPatchLoadBalancerPoolIdentityLoadBalancerPoolIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetPatchLoadBalancerPoolIdentityLoadBalancerPoolIdentityById;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerHTTPSRedirectPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyRedirectURLPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetPrototypeLoadBalancerPoolIdentity;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetPrototypeLoadBalancerPoolIdentityLoadBalancerPoolIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetPrototypeLoadBalancerPoolIdentityLoadBalancerPoolIdentityById;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPrototypeLoadBalancerContext;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerReference;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerLogging;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerLoggingDatapath;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPool;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolCollection;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolHealthMonitor;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolHealthMonitorPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolHealthMonitorPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolIdentity;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolIdentityById;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMember;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberCollection;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberReference;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTarget;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTargetIP;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTargetInstanceReference;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTargetPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTargetPrototypeIP;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTargetPrototypeInstanceIdentity;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolReference;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolSessionPersistence;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolSessionPersistencePatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolSessionPersistencePrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPrivateIpsItem;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfile;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileCollection;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileIdentity;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileLoggingSupported;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileReference;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileRouteModeSupported;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileRouteModeSupportedDependent;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileRouteModeSupportedFixed;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileSecurityGroupsSupported;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileSecurityGroupsSupportedDependent;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileSecurityGroupsSupportedFixed;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileUDPSupported;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileUDPSupportedDependent;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileUDPSupportedFixed;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerStatistics;
import com.ibm.cloud.is.vpc.v1.model.NetworkACL;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLCollection;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLIdentity;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLIdentityById;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLPatch;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLPrototype;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLPrototypeNetworkACLByRules;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLPrototypeNetworkACLBySourceNetworkACL;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLReference;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRule;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleBeforePatch;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleBeforePatchNetworkACLRuleIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleBeforePatchNetworkACLRuleIdentityById;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleBeforePrototype;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleBeforePrototypeNetworkACLRuleIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleBeforePrototypeNetworkACLRuleIdentityById;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleCollection;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleCollectionNext;
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
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAll;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMP;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDP;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePrototypeNetworkACLRuleProtocolAll;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePrototypeNetworkACLRuleProtocolICMP;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePrototypeNetworkACLRuleProtocolTCPUDP;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleReference;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterface;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceBareMetalServerContextReference;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceBareMetalServerContextReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceIPPrototype;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceIPPrototypeReservedIPIdentity;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceIPPrototypeReservedIPIdentityReservedIPIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceIPPrototypeReservedIPIdentityReservedIPIdentityById;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceInstanceContextReference;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceInstanceContextReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfacePatch;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfacePrototype;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceReferenceTargetContextDeleted;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceUnpaginatedCollection;
import com.ibm.cloud.is.vpc.v1.model.OperatingSystem;
import com.ibm.cloud.is.vpc.v1.model.OperatingSystemCollection;
import com.ibm.cloud.is.vpc.v1.model.OperatingSystemCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.OperatingSystemCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.OperatingSystemIdentity;
import com.ibm.cloud.is.vpc.v1.model.OperatingSystemIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.OperatingSystemIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.OperatingSystemReference;
import com.ibm.cloud.is.vpc.v1.model.PlacementGroup;
import com.ibm.cloud.is.vpc.v1.model.PlacementGroupCollection;
import com.ibm.cloud.is.vpc.v1.model.PlacementGroupCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.PlacementGroupCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.PlacementGroupPatch;
import com.ibm.cloud.is.vpc.v1.model.PlacementGroupReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.PublicGateway;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayCollection;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayCollectionNext;
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
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.Region;
import com.ibm.cloud.is.vpc.v1.model.RegionCollection;
import com.ibm.cloud.is.vpc.v1.model.RegionReference;
import com.ibm.cloud.is.vpc.v1.model.RemoveBareMetalServerNetworkInterfaceFloatingIpOptions;
import com.ibm.cloud.is.vpc.v1.model.RemoveEndpointGatewayIpOptions;
import com.ibm.cloud.is.vpc.v1.model.RemoveInstanceNetworkInterfaceFloatingIpOptions;
import com.ibm.cloud.is.vpc.v1.model.RemoveVpnGatewayConnectionLocalCidrOptions;
import com.ibm.cloud.is.vpc.v1.model.RemoveVpnGatewayConnectionPeerCidrOptions;
import com.ibm.cloud.is.vpc.v1.model.ReplaceLoadBalancerPoolMembersOptions;
import com.ibm.cloud.is.vpc.v1.model.ReplaceSubnetNetworkAclOptions;
import com.ibm.cloud.is.vpc.v1.model.ReplaceSubnetRoutingTableOptions;
import com.ibm.cloud.is.vpc.v1.model.ReservedIP;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPCollection;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPCollectionEndpointGatewayContext;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPCollectionEndpointGatewayContextFirst;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPCollectionEndpointGatewayContextNext;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPCollectionNetworkInterfaceContext;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPCollectionNetworkInterfaceContextFirst;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPCollectionNetworkInterfaceContextNext;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPPatch;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPReference;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPTarget;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPTargetEndpointGatewayReference;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPTargetGenericResourceReference;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPTargetLoadBalancerReference;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPTargetNetworkInterfaceReferenceTargetContext;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPTargetPrototype;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPTargetPrototypeEndpointGatewayIdentity;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPTargetPrototypeEndpointGatewayIdentityEndpointGatewayIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPTargetPrototypeEndpointGatewayIdentityEndpointGatewayIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPTargetPrototypeEndpointGatewayIdentityEndpointGatewayIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPTargetVPNGatewayReference;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentity;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupReference;
import com.ibm.cloud.is.vpc.v1.model.RestartBareMetalServerOptions;
import com.ibm.cloud.is.vpc.v1.model.Route;
import com.ibm.cloud.is.vpc.v1.model.RouteCollection;
import com.ibm.cloud.is.vpc.v1.model.RouteCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.RouteCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.RouteNextHop;
import com.ibm.cloud.is.vpc.v1.model.RouteNextHopIP;
import com.ibm.cloud.is.vpc.v1.model.RouteNextHopPrototype;
import com.ibm.cloud.is.vpc.v1.model.RouteNextHopPrototypeRouteNextHopIP;
import com.ibm.cloud.is.vpc.v1.model.RouteNextHopPrototypeVPNGatewayConnectionIdentity;
import com.ibm.cloud.is.vpc.v1.model.RouteNextHopPrototypeVPNGatewayConnectionIdentityVPNGatewayConnectionIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.RouteNextHopPrototypeVPNGatewayConnectionIdentityVPNGatewayConnectionIdentityById;
import com.ibm.cloud.is.vpc.v1.model.RouteNextHopVPNGatewayConnectionReference;
import com.ibm.cloud.is.vpc.v1.model.RoutePatch;
import com.ibm.cloud.is.vpc.v1.model.RoutePrototype;
import com.ibm.cloud.is.vpc.v1.model.RouteReference;
import com.ibm.cloud.is.vpc.v1.model.RouteReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.RoutingTable;
import com.ibm.cloud.is.vpc.v1.model.RoutingTableCollection;
import com.ibm.cloud.is.vpc.v1.model.RoutingTableCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.RoutingTableCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.RoutingTableIdentity;
import com.ibm.cloud.is.vpc.v1.model.RoutingTableIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.RoutingTableIdentityById;
import com.ibm.cloud.is.vpc.v1.model.RoutingTablePatch;
import com.ibm.cloud.is.vpc.v1.model.RoutingTableReference;
import com.ibm.cloud.is.vpc.v1.model.RoutingTableReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroup;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupCollection;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupIdentity;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupPatch;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupReference;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRule;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleCollection;
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
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupTargetCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupTargetCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupTargetReference;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupTargetReferenceEndpointGatewayReference;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupTargetReferenceLoadBalancerReference;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupTargetReferenceNetworkInterfaceReferenceTargetContext;
import com.ibm.cloud.is.vpc.v1.model.SetSubnetPublicGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.Snapshot;
import com.ibm.cloud.is.vpc.v1.model.SnapshotCollection;
import com.ibm.cloud.is.vpc.v1.model.SnapshotCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.SnapshotCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.SnapshotIdentity;
import com.ibm.cloud.is.vpc.v1.model.SnapshotIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.SnapshotIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.SnapshotIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SnapshotPatch;
import com.ibm.cloud.is.vpc.v1.model.SnapshotPrototype;
import com.ibm.cloud.is.vpc.v1.model.SnapshotPrototypeSnapshotBySourceVolume;
import com.ibm.cloud.is.vpc.v1.model.SnapshotReference;
import com.ibm.cloud.is.vpc.v1.model.SnapshotReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.StartBareMetalServerOptions;
import com.ibm.cloud.is.vpc.v1.model.StopBareMetalServerOptions;
import com.ibm.cloud.is.vpc.v1.model.Subnet;
import com.ibm.cloud.is.vpc.v1.model.SubnetCollection;
import com.ibm.cloud.is.vpc.v1.model.SubnetCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.SubnetCollectionNext;
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
import com.ibm.cloud.is.vpc.v1.model.SubnetReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.TrustedProfileIdentity;
import com.ibm.cloud.is.vpc.v1.model.TrustedProfileIdentityTrustedProfileByCRN;
import com.ibm.cloud.is.vpc.v1.model.TrustedProfileIdentityTrustedProfileById;
import com.ibm.cloud.is.vpc.v1.model.TrustedProfileReference;
import com.ibm.cloud.is.vpc.v1.model.UnsetSubnetPublicGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateBareMetalServerDiskOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateBareMetalServerNetworkInterfaceOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateBareMetalServerOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateDedicatedHostDiskOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateDedicatedHostGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateDedicatedHostOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateEndpointGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateFloatingIpOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateFlowLogCollectorOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateIkePolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateImageOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateInstanceDiskOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateInstanceGroupManagerActionOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateInstanceGroupManagerOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateInstanceGroupManagerPolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateInstanceGroupMembershipOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateInstanceGroupOptions;
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
import com.ibm.cloud.is.vpc.v1.model.UpdatePublicGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateSecurityGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateSecurityGroupRuleOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateSnapshotOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateSubnetOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateSubnetReservedIpOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateVolumeOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateVpcAddressPrefixOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateVpcOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateVpcRouteOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateVpcRoutingTableOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateVpcRoutingTableRouteOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateVpnGatewayConnectionOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateVpnGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.VCPU;
import com.ibm.cloud.is.vpc.v1.model.VPC;
import com.ibm.cloud.is.vpc.v1.model.VPCCSESourceIP;
import com.ibm.cloud.is.vpc.v1.model.VPCCollection;
import com.ibm.cloud.is.vpc.v1.model.VPCCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.VPCCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.VPCIdentity;
import com.ibm.cloud.is.vpc.v1.model.VPCIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.VPCIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.VPCIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VPCPatch;
import com.ibm.cloud.is.vpc.v1.model.VPCReference;
import com.ibm.cloud.is.vpc.v1.model.VPCReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.VPNGateway;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayCollection;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnection;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionCollection;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionDPD;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionDPDPatch;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionDPDPrototype;
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
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionLocalCIDRs;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPatch;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPatchVPNGatewayConnectionStaticRouteModePatch;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPeerCIDRs;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPolicyMode;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPrototype;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototype;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionReference;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionStaticRouteMode;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionStaticRouteModeTunnel;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayMember;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayPatch;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayPolicyMode;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayPrototype;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayPrototypeVPNGatewayPolicyModePrototype;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayPrototypeVPNGatewayRouteModePrototype;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayRouteMode;
import com.ibm.cloud.is.vpc.v1.model.Volume;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachment;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentCollection;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentDevice;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPatch;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeInstanceByImageContext;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeInstanceBySourceSnapshotContext;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeInstanceContext;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeVolume;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeVolumeVolumeIdentity;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeVolumeVolumeIdentityVolumeIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeVolumeVolumeIdentityVolumeIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeVolumeVolumeIdentityVolumeIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeVolumeVolumePrototypeInstanceContext;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeVolumeVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeByCapacity;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeVolumeVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshot;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentReferenceInstanceContext;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentReferenceInstanceContextDeleted;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentReferenceVolumeContext;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentReferenceVolumeContextDeleted;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentVolumePrototypeInstanceContext;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentVolumePrototypeInstanceContextVolumeIdentity;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentVolumePrototypeInstanceContextVolumeIdentityVolumeIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentVolumePrototypeInstanceContextVolumeIdentityVolumeIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentVolumePrototypeInstanceContextVolumeIdentityVolumeIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContext;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeByCapacity;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshot;
import com.ibm.cloud.is.vpc.v1.model.VolumeCollection;
import com.ibm.cloud.is.vpc.v1.model.VolumeCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.VolumeCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.VolumeIdentity;
import com.ibm.cloud.is.vpc.v1.model.VolumeIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.VolumeIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.VolumeIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VolumePatch;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfile;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileCollection;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileIdentity;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileReference;
import com.ibm.cloud.is.vpc.v1.model.VolumePrototype;
import com.ibm.cloud.is.vpc.v1.model.VolumePrototypeInstanceByImageContext;
import com.ibm.cloud.is.vpc.v1.model.VolumePrototypeInstanceBySourceSnapshotContext;
import com.ibm.cloud.is.vpc.v1.model.VolumePrototypeVolumeByCapacity;
import com.ibm.cloud.is.vpc.v1.model.VolumeReference;
import com.ibm.cloud.is.vpc.v1.model.VolumeReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.VolumeStatusReason;
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
import java.util.Arrays;
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

  String version = "testString";
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
      .limit(Long.valueOf("1"))
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

  @Test
  public void testCreateVpc() throws Exception {
    try {
      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();

      CreateVpcOptions createVpcOptions = new CreateVpcOptions.Builder()
      .addressPrefixManagement("manual")
      .classicAccess(false)
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateVpc() throws Exception {
    try {
      VPCPatch vpcPatchModel = new VPCPatch.Builder()
      .name("my-vpc")
      .build();
      Map<String, Object> vpcPatchModelAsPatch = vpcPatchModel.asPatch();

      UpdateVpcOptions updateVpcOptions = new UpdateVpcOptions.Builder()
      .id("testString")
      .vpcPatch(vpcPatchModelAsPatch)
      .build();

      // Invoke operation
      Response<VPC> response = service.updateVpc(updateVpcOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VPC vpcResult = response.getResult();

      assertNotNull(vpcResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListVpcAddressPrefixes() throws Exception {
    try {
      ListVpcAddressPrefixesOptions listVpcAddressPrefixesOptions = new ListVpcAddressPrefixesOptions.Builder()
      .vpcId("testString")
      .start("testString")
      .limit(Long.valueOf("1"))
      .build();

      // Invoke operation
      Response<AddressPrefixCollection> response = service.listVpcAddressPrefixes(listVpcAddressPrefixesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      AddressPrefixCollection addressPrefixCollectionResult = response.getResult();

      assertNotNull(addressPrefixCollectionResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testCreateVpcAddressPrefix() throws Exception {
    try {
      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name("us-south-1")
      .build();

      CreateVpcAddressPrefixOptions createVpcAddressPrefixOptions = new CreateVpcAddressPrefixOptions.Builder()
      .vpcId("testString")
      .cidr("10.0.0.0/24")
      .zone(zoneIdentityModel)
      .isDefault(true)
      .name("my-address-prefix-2")
      .build();

      // Invoke operation
      Response<AddressPrefix> response = service.createVpcAddressPrefix(createVpcAddressPrefixOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      AddressPrefix addressPrefixResult = response.getResult();

      assertNotNull(addressPrefixResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateVpcAddressPrefix() throws Exception {
    try {
      AddressPrefixPatch addressPrefixPatchModel = new AddressPrefixPatch.Builder()
      .isDefault(false)
      .name("my-address-prefix-2")
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListVpcRoutes() throws Exception {
    try {
      ListVpcRoutesOptions listVpcRoutesOptions = new ListVpcRoutesOptions.Builder()
      .vpcId("testString")
      .zoneName("testString")
      .start("testString")
      .limit(Long.valueOf("1"))
      .build();

      // Invoke operation
      Response<RouteCollection> response = service.listVpcRoutes(listVpcRoutesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      RouteCollection routeCollectionResult = response.getResult();

      assertNotNull(routeCollectionResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testCreateVpcRoute() throws Exception {
    try {
      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name("us-south-1")
      .build();

      RouteNextHopPrototypeRouteNextHopIP routeNextHopPrototypeModel = new RouteNextHopPrototypeRouteNextHopIP.Builder()
      .address("192.168.3.4")
      .build();

      CreateVpcRouteOptions createVpcRouteOptions = new CreateVpcRouteOptions.Builder()
      .vpcId("testString")
      .destination("192.168.3.0/24")
      .zone(zoneIdentityModel)
      .action("deliver")
      .name("my-route-2")
      .nextHop(routeNextHopPrototypeModel)
      .build();

      // Invoke operation
      Response<Route> response = service.createVpcRoute(createVpcRouteOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      Route routeResult = response.getResult();

      assertNotNull(routeResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateVpcRoute() throws Exception {
    try {
      RoutePatch routePatchModel = new RoutePatch.Builder()
      .name("my-route-2")
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListVpcRoutingTables() throws Exception {
    try {
      ListVpcRoutingTablesOptions listVpcRoutingTablesOptions = new ListVpcRoutingTablesOptions.Builder()
      .vpcId("testString")
      .start("testString")
      .limit(Long.valueOf("1"))
      .isDefault(true)
      .build();

      // Invoke operation
      Response<RoutingTableCollection> response = service.listVpcRoutingTables(listVpcRoutingTablesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      RoutingTableCollection routingTableCollectionResult = response.getResult();

      assertNotNull(routingTableCollectionResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testCreateVpcRoutingTable() throws Exception {
    try {
      RouteNextHopPrototypeRouteNextHopIP routeNextHopPrototypeModel = new RouteNextHopPrototypeRouteNextHopIP.Builder()
      .address("192.168.3.4")
      .build();

      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name("us-south-1")
      .build();

      RoutePrototype routePrototypeModel = new RoutePrototype.Builder()
      .action("deliver")
      .destination("192.168.3.0/24")
      .name("my-route-2")
      .nextHop(routeNextHopPrototypeModel)
      .zone(zoneIdentityModel)
      .build();

      CreateVpcRoutingTableOptions createVpcRoutingTableOptions = new CreateVpcRoutingTableOptions.Builder()
      .vpcId("testString")
      .name("my-routing-table-2")
      .routeDirectLinkIngress(false)
      .routeTransitGatewayIngress(false)
      .routeVpcZoneIngress(false)
      .routes(new java.util.ArrayList<RoutePrototype>(java.util.Arrays.asList(routePrototypeModel)))
      .build();

      // Invoke operation
      Response<RoutingTable> response = service.createVpcRoutingTable(createVpcRoutingTableOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      RoutingTable routingTableResult = response.getResult();

      assertNotNull(routingTableResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateVpcRoutingTable() throws Exception {
    try {
      RoutingTablePatch routingTablePatchModel = new RoutingTablePatch.Builder()
      .name("my-routing-table-2")
      .routeDirectLinkIngress(true)
      .routeTransitGatewayIngress(true)
      .routeVpcZoneIngress(true)
      .build();
      Map<String, Object> routingTablePatchModelAsPatch = routingTablePatchModel.asPatch();

      UpdateVpcRoutingTableOptions updateVpcRoutingTableOptions = new UpdateVpcRoutingTableOptions.Builder()
      .vpcId("testString")
      .id("testString")
      .routingTablePatch(routingTablePatchModelAsPatch)
      .build();

      // Invoke operation
      Response<RoutingTable> response = service.updateVpcRoutingTable(updateVpcRoutingTableOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      RoutingTable routingTableResult = response.getResult();

      assertNotNull(routingTableResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListVpcRoutingTableRoutes() throws Exception {
    try {
      ListVpcRoutingTableRoutesOptions listVpcRoutingTableRoutesOptions = new ListVpcRoutingTableRoutesOptions.Builder()
      .vpcId("testString")
      .routingTableId("testString")
      .start("testString")
      .limit(Long.valueOf("1"))
      .build();

      // Invoke operation
      Response<RouteCollection> response = service.listVpcRoutingTableRoutes(listVpcRoutingTableRoutesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      RouteCollection routeCollectionResult = response.getResult();

      assertNotNull(routeCollectionResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testCreateVpcRoutingTableRoute() throws Exception {
    try {
      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name("us-south-1")
      .build();

      RouteNextHopPrototypeRouteNextHopIP routeNextHopPrototypeModel = new RouteNextHopPrototypeRouteNextHopIP.Builder()
      .address("192.168.3.4")
      .build();

      CreateVpcRoutingTableRouteOptions createVpcRoutingTableRouteOptions = new CreateVpcRoutingTableRouteOptions.Builder()
      .vpcId("testString")
      .routingTableId("testString")
      .destination("192.168.3.0/24")
      .zone(zoneIdentityModel)
      .action("deliver")
      .name("my-route-2")
      .nextHop(routeNextHopPrototypeModel)
      .build();

      // Invoke operation
      Response<Route> response = service.createVpcRoutingTableRoute(createVpcRoutingTableRouteOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      Route routeResult = response.getResult();

      assertNotNull(routeResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateVpcRoutingTableRoute() throws Exception {
    try {
      RoutePatch routePatchModel = new RoutePatch.Builder()
      .name("my-route-2")
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListSubnets() throws Exception {
    try {
      ListSubnetsOptions listSubnetsOptions = new ListSubnetsOptions.Builder()
      .start("testString")
      .limit(Long.valueOf("1"))
      .resourceGroupId("testString")
      .routingTableId("testString")
      .routingTableName("testString")
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

  @Test
  public void testCreateSubnet() throws Exception {
    try {
      NetworkACLIdentityById networkAclIdentityModel = new NetworkACLIdentityById.Builder()
      .id("a4e28308-8ee7-46ab-8108-9f881f22bdbf")
      .build();

      PublicGatewayIdentityPublicGatewayIdentityById publicGatewayIdentityModel = new PublicGatewayIdentityPublicGatewayIdentityById.Builder()
      .id("dc5431ef-1fc6-4861-adc9-a59d077d1241")
      .build();

      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();

      RoutingTableIdentityById routingTableIdentityModel = new RoutingTableIdentityById.Builder()
      .id("6885e83f-03b2-4603-8a86-db2a0f55c840")
      .build();

      VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
      .id("4727d842-f94f-4a2d-824a-9bc9b02c523b")
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateSubnet() throws Exception {
    try {
      NetworkACLIdentityById networkAclIdentityModel = new NetworkACLIdentityById.Builder()
      .id("a4e28308-8ee7-46ab-8108-9f881f22bdbf")
      .build();

      SubnetPublicGatewayPatchPublicGatewayIdentityById subnetPublicGatewayPatchModel = new SubnetPublicGatewayPatchPublicGatewayIdentityById.Builder()
      .id("dc5431ef-1fc6-4861-adc9-a59d077d1241")
      .build();

      RoutingTableIdentityById routingTableIdentityModel = new RoutingTableIdentityById.Builder()
      .id("6885e83f-03b2-4603-8a86-db2a0f55c840")
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testReplaceSubnetNetworkAcl() throws Exception {
    try {
      NetworkACLIdentityById networkAclIdentityModel = new NetworkACLIdentityById.Builder()
      .id("a4e28308-8ee7-46ab-8108-9f881f22bdbf")
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testSetSubnetPublicGateway() throws Exception {
    try {
      PublicGatewayIdentityPublicGatewayIdentityById publicGatewayIdentityModel = new PublicGatewayIdentityPublicGatewayIdentityById.Builder()
      .id("dc5431ef-1fc6-4861-adc9-a59d077d1241")
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testReplaceSubnetRoutingTable() throws Exception {
    try {
      RoutingTableIdentityById routingTableIdentityModel = new RoutingTableIdentityById.Builder()
      .id("1a15dca5-7e33-45e1-b7c5-bc690e569531")
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListSubnetReservedIps() throws Exception {
    try {
      ListSubnetReservedIpsOptions listSubnetReservedIpsOptions = new ListSubnetReservedIpsOptions.Builder()
      .subnetId("testString")
      .start("testString")
      .limit(Long.valueOf("1"))
      .sort("name")
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

  @Test
  public void testCreateSubnetReservedIp() throws Exception {
    try {
      ReservedIPTargetPrototypeEndpointGatewayIdentityEndpointGatewayIdentityById reservedIpTargetPrototypeModel = new ReservedIPTargetPrototypeEndpointGatewayIdentityEndpointGatewayIdentityById.Builder()
      .id("d7cc5196-9864-48c4-82d8-3f30da41fcc5")
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateSubnetReservedIp() throws Exception {
    try {
      ReservedIPPatch reservedIpPatchModel = new ReservedIPPatch.Builder()
      .autoDelete(false)
      .name("my-reserved-ip")
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 403
      // 404
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListImages() throws Exception {
    try {
      ListImagesOptions listImagesOptions = new ListImagesOptions.Builder()
      .start("testString")
      .limit(Long.valueOf("1"))
      .resourceGroupId("testString")
      .name("testString")
      .visibility("private")
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

  @Test
  public void testCreateImage() throws Exception {
    try {
      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();

      EncryptionKeyIdentityByCRN encryptionKeyIdentityModel = new EncryptionKeyIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:kms:us-south:a/dffc98a0f1f0f95f6613b3b752286b87:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179")
      .build();

      ImageFilePrototype imageFilePrototypeModel = new ImageFilePrototype.Builder()
      .href("cos://us-south/my-bucket/my-image.qcow2")
      .build();

      OperatingSystemIdentityByName operatingSystemIdentityModel = new OperatingSystemIdentityByName.Builder()
      .name("debian-9-amd64")
      .build();

      ImagePrototypeImageByFile imagePrototypeModel = new ImagePrototypeImageByFile.Builder()
      .name("my-image")
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateImage() throws Exception {
    try {
      ImagePatch imagePatchModel = new ImagePatch.Builder()
      .name("my-image")
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 403
      // 404
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListOperatingSystems() throws Exception {
    try {
      ListOperatingSystemsOptions listOperatingSystemsOptions = new ListOperatingSystemsOptions.Builder()
      .start("testString")
      .limit(Long.valueOf("1"))
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

  @Test
  public void testGetOperatingSystem() throws Exception {
    try {
      GetOperatingSystemOptions getOperatingSystemOptions = new GetOperatingSystemOptions.Builder()
      .name("testString")
      .build();

      // Invoke operation
      Response<OperatingSystem> response = service.getOperatingSystem(getOperatingSystemOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      OperatingSystem operatingSystemResult = response.getResult();

      assertNotNull(operatingSystemResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListKeys() throws Exception {
    try {
      ListKeysOptions listKeysOptions = new ListKeysOptions.Builder()
      .start("testString")
      .limit(Long.valueOf("1"))
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

  @Test
  public void testCreateKey() throws Exception {
    try {
      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();

      CreateKeyOptions createKeyOptions = new CreateKeyOptions.Builder()
      .publicKey("ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDDGe50Bxa5T5NDddrrtbx2Y4/VGbiCgXqnBsYToIUKoFSHTQl5IX3PasGnneKanhcLwWz5M5MoCRvhxTp66NKzIfAz7r+FX9rxgR+ZgcM253YAqOVeIpOU408simDZKriTlN8kYsXL7P34tsWuAJf4MgZtJAQxous/2byetpdCv8ddnT4X3ltOg9w+LqSCPYfNivqH00Eh7S1Ldz7I8aw5WOp5a+sQFP/RbwfpwHp+ny7DfeIOokcuI42tJkoBn7UsLTVpCSmXr2EDRlSWe/1M/iHNRBzaT3CK0+SwZWd2AEjePxSnWKNGIEUJDlUYp7hKhiQcgT5ZAnWU121oc5En")
      .name("my-key")
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateKey() throws Exception {
    try {
      KeyPatch keyPatchModel = new KeyPatch.Builder()
      .name("my-key")
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

  @Test
  public void testGetInstanceProfile() throws Exception {
    try {
      GetInstanceProfileOptions getInstanceProfileOptions = new GetInstanceProfileOptions.Builder()
      .name("testString")
      .build();

      // Invoke operation
      Response<InstanceProfile> response = service.getInstanceProfile(getInstanceProfileOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceProfile instanceProfileResult = response.getResult();

      assertNotNull(instanceProfileResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

  @Test
  public void testCreateInstanceTemplate() throws Exception {
    try {
      InstanceAvailabilityPrototype instanceAvailabilityPrototypeModel = new InstanceAvailabilityPrototype.Builder()
      .hostFailure("restart")
      .build();

      TrustedProfileIdentityTrustedProfileById trustedProfileIdentityModel = new TrustedProfileIdentityTrustedProfileById.Builder()
      .id("Profile-9fd84246-7df4-4667-94e4-8ecde51d5ac5")
      .build();

      InstanceDefaultTrustedProfilePrototype instanceDefaultTrustedProfilePrototypeModel = new InstanceDefaultTrustedProfilePrototype.Builder()
      .autoLink(false)
      .target(trustedProfileIdentityModel)
      .build();

      KeyIdentityById keyIdentityModel = new KeyIdentityById.Builder()
      .id("363f6d70-0000-0001-0000-00000013b96c")
      .build();

      InstanceMetadataServicePrototype instanceMetadataServicePrototypeModel = new InstanceMetadataServicePrototype.Builder()
      .enabled(true)
      .build();

      NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext networkInterfaceIpPrototypeModel = new NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext.Builder()
      .address("10.0.0.5")
      .autoDelete(false)
      .name("my-reserved-ip")
      .build();

      SecurityGroupIdentityById securityGroupIdentityModel = new SecurityGroupIdentityById.Builder()
      .id("be5df5ca-12a0-494b-907e-aa6ec2bfa271")
      .build();

      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
      .id("7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
      .build();

      NetworkInterfacePrototype networkInterfacePrototypeModel = new NetworkInterfacePrototype.Builder()
      .allowIpSpoofing(true)
      .name("my-network-interface")
      .primaryIp(networkInterfaceIpPrototypeModel)
      .securityGroups(new java.util.ArrayList<SecurityGroupIdentity>(java.util.Arrays.asList(securityGroupIdentityModel)))
      .subnet(subnetIdentityModel)
      .build();

      InstancePlacementTargetPrototypeDedicatedHostIdentityDedicatedHostIdentityById instancePlacementTargetPrototypeModel = new InstancePlacementTargetPrototypeDedicatedHostIdentityDedicatedHostIdentityById.Builder()
      .id("1e09281b-f177-46fb-baf1-bc152b2e391a")
      .build();

      InstanceProfileIdentityByName instanceProfileIdentityModel = new InstanceProfileIdentityByName.Builder()
      .name("bx2-2x8")
      .build();

      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();

      VolumeAttachmentVolumePrototypeInstanceContextVolumeIdentityVolumeIdentityById volumeAttachmentVolumePrototypeInstanceContextModel = new VolumeAttachmentVolumePrototypeInstanceContextVolumeIdentityVolumeIdentityById.Builder()
      .id("1a6b7274-678d-4dfb-8981-c71dd9d4daa5")
      .build();

      VolumeAttachmentPrototypeInstanceContext volumeAttachmentPrototypeInstanceContextModel = new VolumeAttachmentPrototypeInstanceContext.Builder()
      .deleteVolumeOnInstanceDelete(true)
      .name("my-volume-attachment")
      .volume(volumeAttachmentVolumePrototypeInstanceContextModel)
      .build();

      VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
      .id("dc201ab2-8536-4904-86a8-084d84582133")
      .build();

      EncryptionKeyIdentityByCRN encryptionKeyIdentityModel = new EncryptionKeyIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:kms:us-south:a/dffc98a0f1f0f95f6613b3b752286b87:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179")
      .build();

      VolumeProfileIdentityByName volumeProfileIdentityModel = new VolumeProfileIdentityByName.Builder()
      .name("general-purpose")
      .build();

      VolumePrototypeInstanceByImageContext volumePrototypeInstanceByImageContextModel = new VolumePrototypeInstanceByImageContext.Builder()
      .capacity(Long.valueOf("250"))
      .encryptionKey(encryptionKeyIdentityModel)
      .iops(Long.valueOf("10000"))
      .name("my-volume")
      .profile(volumeProfileIdentityModel)
      .build();

      VolumeAttachmentPrototypeInstanceByImageContext volumeAttachmentPrototypeInstanceByImageContextModel = new VolumeAttachmentPrototypeInstanceByImageContext.Builder()
      .deleteVolumeOnInstanceDelete(true)
      .name("my-volume-attachment")
      .volume(volumePrototypeInstanceByImageContextModel)
      .build();

      ImageIdentityById imageIdentityModel = new ImageIdentityById.Builder()
      .id("3f9a2d96-830e-4100-9b4c-663225a3f872")
      .build();

      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name("us-south-1")
      .build();

      InstanceTemplatePrototypeInstanceByImage instanceTemplatePrototypeModel = new InstanceTemplatePrototypeInstanceByImage.Builder()
      .availabilityPolicy(instanceAvailabilityPrototypeModel)
      .defaultTrustedProfile(instanceDefaultTrustedProfilePrototypeModel)
      .keys(new java.util.ArrayList<KeyIdentity>(java.util.Arrays.asList(keyIdentityModel)))
      .metadataService(instanceMetadataServicePrototypeModel)
      .name("my-instance-template")
      .networkInterfaces(new java.util.ArrayList<NetworkInterfacePrototype>(java.util.Arrays.asList(networkInterfacePrototypeModel)))
      .placementTarget(instancePlacementTargetPrototypeModel)
      .profile(instanceProfileIdentityModel)
      .resourceGroup(resourceGroupIdentityModel)
      .totalVolumeBandwidth(Long.valueOf("500"))
      .userData("testString")
      .volumeAttachments(new java.util.ArrayList<VolumeAttachmentPrototypeInstanceContext>(java.util.Arrays.asList(volumeAttachmentPrototypeInstanceContextModel)))
      .vpc(vpcIdentityModel)
      .bootVolumeAttachment(volumeAttachmentPrototypeInstanceByImageContextModel)
      .image(imageIdentityModel)
      .primaryNetworkInterface(networkInterfacePrototypeModel)
      .zone(zoneIdentityModel)
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateInstanceTemplate() throws Exception {
    try {
      InstanceTemplatePatch instanceTemplatePatchModel = new InstanceTemplatePatch.Builder()
      .name("my-instance-template")
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListInstances() throws Exception {
    try {
      ListInstancesOptions listInstancesOptions = new ListInstancesOptions.Builder()
      .start("testString")
      .limit(Long.valueOf("1"))
      .resourceGroupId("testString")
      .name("testString")
      .vpcId("testString")
      .vpcCrn("testString")
      .vpcName("testString")
      .dedicatedHostId("testString")
      .dedicatedHostCrn("testString")
      .dedicatedHostName("testString")
      .placementGroupId("testString")
      .placementGroupCrn("testString")
      .placementGroupName("testString")
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

  @Test
  public void testCreateInstance() throws Exception {
    try {
      InstanceAvailabilityPrototype instanceAvailabilityPrototypeModel = new InstanceAvailabilityPrototype.Builder()
      .hostFailure("restart")
      .build();

      TrustedProfileIdentityTrustedProfileById trustedProfileIdentityModel = new TrustedProfileIdentityTrustedProfileById.Builder()
      .id("Profile-9fd84246-7df4-4667-94e4-8ecde51d5ac5")
      .build();

      InstanceDefaultTrustedProfilePrototype instanceDefaultTrustedProfilePrototypeModel = new InstanceDefaultTrustedProfilePrototype.Builder()
      .autoLink(false)
      .target(trustedProfileIdentityModel)
      .build();

      KeyIdentityById keyIdentityModel = new KeyIdentityById.Builder()
      .id("363f6d70-0000-0001-0000-00000013b96c")
      .build();

      InstanceMetadataServicePrototype instanceMetadataServicePrototypeModel = new InstanceMetadataServicePrototype.Builder()
      .enabled(true)
      .build();

      NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext networkInterfaceIpPrototypeModel = new NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext.Builder()
      .address("10.0.0.5")
      .autoDelete(false)
      .name("my-reserved-ip")
      .build();

      SecurityGroupIdentityById securityGroupIdentityModel = new SecurityGroupIdentityById.Builder()
      .id("be5df5ca-12a0-494b-907e-aa6ec2bfa271")
      .build();

      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
      .id("7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
      .build();

      NetworkInterfacePrototype networkInterfacePrototypeModel = new NetworkInterfacePrototype.Builder()
      .allowIpSpoofing(true)
      .name("my-network-interface")
      .primaryIp(networkInterfaceIpPrototypeModel)
      .securityGroups(new java.util.ArrayList<SecurityGroupIdentity>(java.util.Arrays.asList(securityGroupIdentityModel)))
      .subnet(subnetIdentityModel)
      .build();

      InstancePlacementTargetPrototypeDedicatedHostIdentityDedicatedHostIdentityById instancePlacementTargetPrototypeModel = new InstancePlacementTargetPrototypeDedicatedHostIdentityDedicatedHostIdentityById.Builder()
      .id("0787-8c2a09be-ee18-4af2-8ef4-6a6060732221")
      .build();

      InstanceProfileIdentityByName instanceProfileIdentityModel = new InstanceProfileIdentityByName.Builder()
      .name("bx2-2x8")
      .build();

      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();

      VolumeProfileIdentityByName volumeProfileIdentityModel = new VolumeProfileIdentityByName.Builder()
      .name("5iops-tier")
      .build();

      EncryptionKeyIdentityByCRN encryptionKeyIdentityModel = new EncryptionKeyIdentityByCRN.Builder()
      .crn("crn:[...]")
      .build();

      VolumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeByCapacity volumeAttachmentVolumePrototypeInstanceContextModel = new VolumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeByCapacity.Builder()
      .iops(Long.valueOf("10000"))
      .name("my-data-volume")
      .profile(volumeProfileIdentityModel)
      .capacity(Long.valueOf("1000"))
      .encryptionKey(encryptionKeyIdentityModel)
      .build();

      VolumeAttachmentPrototypeInstanceContext volumeAttachmentPrototypeInstanceContextModel = new VolumeAttachmentPrototypeInstanceContext.Builder()
      .deleteVolumeOnInstanceDelete(true)
      .name("my-volume-attachment")
      .volume(volumeAttachmentVolumePrototypeInstanceContextModel)
      .build();

      VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
      .id("f0aae929-7047-46d1-92e1-9102b07a7f6f")
      .build();

      VolumePrototypeInstanceByImageContext volumePrototypeInstanceByImageContextModel = new VolumePrototypeInstanceByImageContext.Builder()
      .capacity(Long.valueOf("250"))
      .encryptionKey(encryptionKeyIdentityModel)
      .iops(Long.valueOf("10000"))
      .name("my-boot-volume")
      .profile(volumeProfileIdentityModel)
      .build();

      VolumeAttachmentPrototypeInstanceByImageContext volumeAttachmentPrototypeInstanceByImageContextModel = new VolumeAttachmentPrototypeInstanceByImageContext.Builder()
      .deleteVolumeOnInstanceDelete(true)
      .name("my-volume-attachment")
      .volume(volumePrototypeInstanceByImageContextModel)
      .build();

      ImageIdentityById imageIdentityModel = new ImageIdentityById.Builder()
      .id("9aaf3bcb-dcd7-4de7-bb60-24e39ff9d366")
      .build();

      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name("us-south-1")
      .build();

      InstancePrototypeInstanceByImage instancePrototypeModel = new InstancePrototypeInstanceByImage.Builder()
      .availabilityPolicy(instanceAvailabilityPrototypeModel)
      .defaultTrustedProfile(instanceDefaultTrustedProfilePrototypeModel)
      .keys(new java.util.ArrayList<KeyIdentity>(java.util.Arrays.asList(keyIdentityModel)))
      .metadataService(instanceMetadataServicePrototypeModel)
      .name("my-instance")
      .networkInterfaces(new java.util.ArrayList<NetworkInterfacePrototype>(java.util.Arrays.asList(networkInterfacePrototypeModel)))
      .placementTarget(instancePlacementTargetPrototypeModel)
      .profile(instanceProfileIdentityModel)
      .resourceGroup(resourceGroupIdentityModel)
      .totalVolumeBandwidth(Long.valueOf("500"))
      .userData("testString")
      .volumeAttachments(new java.util.ArrayList<VolumeAttachmentPrototypeInstanceContext>(java.util.Arrays.asList(volumeAttachmentPrototypeInstanceContextModel)))
      .vpc(vpcIdentityModel)
      .bootVolumeAttachment(volumeAttachmentPrototypeInstanceByImageContextModel)
      .image(imageIdentityModel)
      .primaryNetworkInterface(networkInterfacePrototypeModel)
      .zone(zoneIdentityModel)
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateInstance() throws Exception {
    try {
      InstanceAvailabilityPolicyPatch instanceAvailabilityPolicyPatchModel = new InstanceAvailabilityPolicyPatch.Builder()
      .hostFailure("restart")
      .build();

      InstanceMetadataServicePatch instanceMetadataServicePatchModel = new InstanceMetadataServicePatch.Builder()
      .enabled(true)
      .build();

      InstancePlacementTargetPatchDedicatedHostIdentityDedicatedHostIdentityById instancePlacementTargetPatchModel = new InstancePlacementTargetPatchDedicatedHostIdentityDedicatedHostIdentityById.Builder()
      .id("1e09281b-f177-46fb-baf1-bc152b2e391a")
      .build();

      InstancePatchProfileInstanceProfileIdentityByName instancePatchProfileModel = new InstancePatchProfileInstanceProfileIdentityByName.Builder()
      .name("bx2-4x16")
      .build();

      InstancePatch instancePatchModel = new InstancePatch.Builder()
      .availabilityPolicy(instanceAvailabilityPolicyPatchModel)
      .metadataService(instanceMetadataServicePatchModel)
      .name("my-instance")
      .placementTarget(instancePlacementTargetPatchModel)
      .profile(instancePatchProfileModel)
      .totalVolumeBandwidth(Long.valueOf("500"))
      .build();
      Map<String, Object> instancePatchModelAsPatch = instancePatchModel.asPatch();

      UpdateInstanceOptions updateInstanceOptions = new UpdateInstanceOptions.Builder()
      .id("testString")
      .instancePatch(instancePatchModelAsPatch)
      .build();

      // Invoke operation
      Response<Instance> response = service.updateInstance(updateInstanceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Instance instanceResult = response.getResult();

      assertNotNull(instanceResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testCreateInstanceNetworkInterface() throws Exception {
    try {
      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
      .id("7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
      .build();

      NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext networkInterfaceIpPrototypeModel = new NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext.Builder()
      .address("10.0.0.5")
      .autoDelete(false)
      .name("my-reserved-ip")
      .build();

      SecurityGroupIdentityById securityGroupIdentityModel = new SecurityGroupIdentityById.Builder()
      .id("be5df5ca-12a0-494b-907e-aa6ec2bfa271")
      .build();

      CreateInstanceNetworkInterfaceOptions createInstanceNetworkInterfaceOptions = new CreateInstanceNetworkInterfaceOptions.Builder()
      .instanceId("testString")
      .subnet(subnetIdentityModel)
      .allowIpSpoofing(true)
      .name("my-network-interface")
      .primaryIp(networkInterfaceIpPrototypeModel)
      .securityGroups(new java.util.ArrayList<SecurityGroupIdentity>(java.util.Arrays.asList(securityGroupIdentityModel)))
      .build();

      // Invoke operation
      Response<NetworkInterface> response = service.createInstanceNetworkInterface(createInstanceNetworkInterfaceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      NetworkInterface networkInterfaceResult = response.getResult();

      assertNotNull(networkInterfaceResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateInstanceNetworkInterface() throws Exception {
    try {
      NetworkInterfacePatch networkInterfacePatchModel = new NetworkInterfacePatch.Builder()
      .allowIpSpoofing(true)
      .name("my-network-interface-1")
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListInstanceNetworkInterfaceIps() throws Exception {
    try {
      ListInstanceNetworkInterfaceIpsOptions listInstanceNetworkInterfaceIpsOptions = new ListInstanceNetworkInterfaceIpsOptions.Builder()
      .instanceId("testString")
      .networkInterfaceId("testString")
      .start("testString")
      .limit(Long.valueOf("1"))
      .build();

      // Invoke operation
      Response<ReservedIPCollectionNetworkInterfaceContext> response = service.listInstanceNetworkInterfaceIps(listInstanceNetworkInterfaceIpsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ReservedIPCollectionNetworkInterfaceContext reservedIpCollectionNetworkInterfaceContextResult = response.getResult();

      assertNotNull(reservedIpCollectionNetworkInterfaceContextResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testCreateInstanceVolumeAttachment() throws Exception {
    try {
      VolumeAttachmentPrototypeVolumeVolumeIdentityVolumeIdentityById volumeAttachmentPrototypeVolumeModel = new VolumeAttachmentPrototypeVolumeVolumeIdentityVolumeIdentityById.Builder()
      .id("1a6b7274-678d-4dfb-8981-c71dd9d4daa5")
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListInstanceGroups() throws Exception {
    try {
      ListInstanceGroupsOptions listInstanceGroupsOptions = new ListInstanceGroupsOptions.Builder()
      .start("testString")
      .limit(Long.valueOf("1"))
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

  @Test
  public void testCreateInstanceGroup() throws Exception {
    try {
      InstanceTemplateIdentityById instanceTemplateIdentityModel = new InstanceTemplateIdentityById.Builder()
      .id("a6b1a881-2ce8-41a3-80fc-36316a73f803")
      .build();

      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
      .id("7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
      .build();

      LoadBalancerIdentityById loadBalancerIdentityModel = new LoadBalancerIdentityById.Builder()
      .id("dd754295-e9e0-4c9d-bf6c-58fbc59e5727")
      .build();

      LoadBalancerPoolIdentityById loadBalancerPoolIdentityModel = new LoadBalancerPoolIdentityById.Builder()
      .id("70294e14-4e61-11e8-bcf4-0242ac110004")
      .build();

      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();

      CreateInstanceGroupOptions createInstanceGroupOptions = new CreateInstanceGroupOptions.Builder()
      .instanceTemplate(instanceTemplateIdentityModel)
      .subnets(new java.util.ArrayList<SubnetIdentity>(java.util.Arrays.asList(subnetIdentityModel)))
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateInstanceGroup() throws Exception {
    try {
      InstanceTemplateIdentityById instanceTemplateIdentityModel = new InstanceTemplateIdentityById.Builder()
      .id("a6b1a881-2ce8-41a3-80fc-36316a73f803")
      .build();

      LoadBalancerIdentityById loadBalancerIdentityModel = new LoadBalancerIdentityById.Builder()
      .id("dd754295-e9e0-4c9d-bf6c-58fbc59e5727")
      .build();

      LoadBalancerPoolIdentityById loadBalancerPoolIdentityModel = new LoadBalancerPoolIdentityById.Builder()
      .id("70294e14-4e61-11e8-bcf4-0242ac110004")
      .build();

      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
      .id("7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
      .build();

      InstanceGroupPatch instanceGroupPatchModel = new InstanceGroupPatch.Builder()
      .applicationPort(Long.valueOf("22"))
      .instanceTemplate(instanceTemplateIdentityModel)
      .loadBalancer(loadBalancerIdentityModel)
      .loadBalancerPool(loadBalancerPoolIdentityModel)
      .membershipCount(Long.valueOf("10"))
      .name("my-instance-group")
      .subnets(new java.util.ArrayList<SubnetIdentity>(java.util.Arrays.asList(subnetIdentityModel)))
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListInstanceGroupManagers() throws Exception {
    try {
      ListInstanceGroupManagersOptions listInstanceGroupManagersOptions = new ListInstanceGroupManagersOptions.Builder()
      .instanceGroupId("testString")
      .start("testString")
      .limit(Long.valueOf("1"))
      .build();

      // Invoke operation
      Response<InstanceGroupManagerCollection> response = service.listInstanceGroupManagers(listInstanceGroupManagersOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceGroupManagerCollection instanceGroupManagerCollectionResult = response.getResult();

      assertNotNull(instanceGroupManagerCollectionResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateInstanceGroupManager() throws Exception {
    try {
      InstanceGroupManagerPatch instanceGroupManagerPatchModel = new InstanceGroupManagerPatch.Builder()
      .aggregationWindow(Long.valueOf("120"))
      .cooldown(Long.valueOf("210"))
      .managementEnabled(true)
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListInstanceGroupManagerActions() throws Exception {
    try {
      ListInstanceGroupManagerActionsOptions listInstanceGroupManagerActionsOptions = new ListInstanceGroupManagerActionsOptions.Builder()
      .instanceGroupId("testString")
      .instanceGroupManagerId("testString")
      .start("testString")
      .limit(Long.valueOf("1"))
      .build();

      // Invoke operation
      Response<InstanceGroupManagerActionsCollection> response = service.listInstanceGroupManagerActions(listInstanceGroupManagerActionsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceGroupManagerActionsCollection instanceGroupManagerActionsCollectionResult = response.getResult();

      assertNotNull(instanceGroupManagerActionsCollectionResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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
      .cronSpec("*/5 1,2,3 * * *")
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListInstanceGroupManagerPolicies() throws Exception {
    try {
      ListInstanceGroupManagerPoliciesOptions listInstanceGroupManagerPoliciesOptions = new ListInstanceGroupManagerPoliciesOptions.Builder()
      .instanceGroupId("testString")
      .instanceGroupManagerId("testString")
      .start("testString")
      .limit(Long.valueOf("1"))
      .build();

      // Invoke operation
      Response<InstanceGroupManagerPolicyCollection> response = service.listInstanceGroupManagerPolicies(listInstanceGroupManagerPoliciesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceGroupManagerPolicyCollection instanceGroupManagerPolicyCollectionResult = response.getResult();

      assertNotNull(instanceGroupManagerPolicyCollectionResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateInstanceGroupManagerPolicy() throws Exception {
    try {
      InstanceGroupManagerPolicyPatch instanceGroupManagerPolicyPatchModel = new InstanceGroupManagerPolicyPatch.Builder()
      .metricType("cpu")
      .metricValue(Long.valueOf("26"))
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListInstanceGroupMemberships() throws Exception {
    try {
      ListInstanceGroupMembershipsOptions listInstanceGroupMembershipsOptions = new ListInstanceGroupMembershipsOptions.Builder()
      .instanceGroupId("testString")
      .start("testString")
      .limit(Long.valueOf("1"))
      .build();

      // Invoke operation
      Response<InstanceGroupMembershipCollection> response = service.listInstanceGroupMemberships(listInstanceGroupMembershipsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceGroupMembershipCollection instanceGroupMembershipCollectionResult = response.getResult();

      assertNotNull(instanceGroupMembershipCollectionResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateInstanceGroupMembership() throws Exception {
    try {
      InstanceGroupMembershipPatch instanceGroupMembershipPatchModel = new InstanceGroupMembershipPatch.Builder()
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListDedicatedHostGroups() throws Exception {
    try {
      ListDedicatedHostGroupsOptions listDedicatedHostGroupsOptions = new ListDedicatedHostGroupsOptions.Builder()
      .start("testString")
      .limit(Long.valueOf("1"))
      .resourceGroupId("testString")
      .zoneName("testString")
      .name("testString")
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

  @Test
  public void testCreateDedicatedHostGroup() throws Exception {
    try {
      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();

      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name("us-south-1")
      .build();

      CreateDedicatedHostGroupOptions createDedicatedHostGroupOptions = new CreateDedicatedHostGroupOptions.Builder()
      .xClass("mx2")
      .family("balanced")
      .name("testString")
      .resourceGroup(resourceGroupIdentityModel)
      .zone(zoneIdentityModel)
      .build();

      // Invoke operation
      Response<DedicatedHostGroup> response = service.createDedicatedHostGroup(createDedicatedHostGroupOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      DedicatedHostGroup dedicatedHostGroupResult = response.getResult();

      assertNotNull(dedicatedHostGroupResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateDedicatedHostGroup() throws Exception {
    try {
      DedicatedHostGroupPatch dedicatedHostGroupPatchModel = new DedicatedHostGroupPatch.Builder()
      .name("my-host-group-modified")
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListDedicatedHostProfiles() throws Exception {
    try {
      ListDedicatedHostProfilesOptions listDedicatedHostProfilesOptions = new ListDedicatedHostProfilesOptions.Builder()
      .start("testString")
      .limit(Long.valueOf("1"))
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

  @Test
  public void testGetDedicatedHostProfile() throws Exception {
    try {
      GetDedicatedHostProfileOptions getDedicatedHostProfileOptions = new GetDedicatedHostProfileOptions.Builder()
      .name("testString")
      .build();

      // Invoke operation
      Response<DedicatedHostProfile> response = service.getDedicatedHostProfile(getDedicatedHostProfileOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DedicatedHostProfile dedicatedHostProfileResult = response.getResult();

      assertNotNull(dedicatedHostProfileResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListDedicatedHosts() throws Exception {
    try {
      ListDedicatedHostsOptions listDedicatedHostsOptions = new ListDedicatedHostsOptions.Builder()
      .dedicatedHostGroupId("testString")
      .start("testString")
      .limit(Long.valueOf("1"))
      .resourceGroupId("testString")
      .zoneName("testString")
      .name("testString")
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

  @Test
  public void testCreateDedicatedHost() throws Exception {
    try {
      DedicatedHostProfileIdentityByName dedicatedHostProfileIdentityModel = new DedicatedHostProfileIdentityByName.Builder()
      .name("m-62x496")
      .build();

      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();

      DedicatedHostGroupIdentityById dedicatedHostGroupIdentityModel = new DedicatedHostGroupIdentityById.Builder()
      .id("0c8eccb4-271c-4518-956c-32bfce5cf83b")
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateDedicatedHostDisk() throws Exception {
    try {
      DedicatedHostDiskPatch dedicatedHostDiskPatchModel = new DedicatedHostDiskPatch.Builder()
      .name("my-disk-updated")
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateDedicatedHost() throws Exception {
    try {
      DedicatedHostPatch dedicatedHostPatchModel = new DedicatedHostPatch.Builder()
      .instancePlacementEnabled(true)
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListPlacementGroups() throws Exception {
    try {
      ListPlacementGroupsOptions listPlacementGroupsOptions = new ListPlacementGroupsOptions.Builder()
      .start("testString")
      .limit(Long.valueOf("1"))
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

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdatePlacementGroup() throws Exception {
    try {
      PlacementGroupPatch placementGroupPatchModel = new PlacementGroupPatch.Builder()
      .name("my-placement-group")
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListBareMetalServerProfiles() throws Exception {
    try {
      ListBareMetalServerProfilesOptions listBareMetalServerProfilesOptions = new ListBareMetalServerProfilesOptions.Builder()
      .start("testString")
      .limit(Long.valueOf("1"))
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

  @Test
  public void testGetBareMetalServerProfile() throws Exception {
    try {
      GetBareMetalServerProfileOptions getBareMetalServerProfileOptions = new GetBareMetalServerProfileOptions.Builder()
      .name("testString")
      .build();

      // Invoke operation
      Response<BareMetalServerProfile> response = service.getBareMetalServerProfile(getBareMetalServerProfileOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      BareMetalServerProfile bareMetalServerProfileResult = response.getResult();

      assertNotNull(bareMetalServerProfileResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListBareMetalServers() throws Exception {
    try {
      ListBareMetalServersOptions listBareMetalServersOptions = new ListBareMetalServersOptions.Builder()
      .start("testString")
      .limit(Long.valueOf("1"))
      .resourceGroupId("testString")
      .name("testString")
      .vpcId("testString")
      .vpcCrn("testString")
      .vpcName("testString")
      .networkInterfacesSubnetId("testString")
      .networkInterfacesSubnetCrn("testString")
      .networkInterfacesSubnetName("testString")
      .sort("name")
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

  @Test
  public void testCreateBareMetalServer() throws Exception {
    try {
      ImageIdentityById imageIdentityModel = new ImageIdentityById.Builder()
      .id("72b27b5c-f4b0-48bb-b954-5becc7c1dcb8")
      .build();

      KeyIdentityById keyIdentityModel = new KeyIdentityById.Builder()
      .id("a6b1a881-2ce8-41a3-80fc-36316a73f803")
      .build();

      BareMetalServerInitializationPrototype bareMetalServerInitializationPrototypeModel = new BareMetalServerInitializationPrototype.Builder()
      .image(imageIdentityModel)
      .keys(new java.util.ArrayList<KeyIdentity>(java.util.Arrays.asList(keyIdentityModel)))
      .userData("testString")
      .build();

      NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext networkInterfaceIpPrototypeModel = new NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext.Builder()
      .address("10.0.0.5")
      .autoDelete(false)
      .name("my-reserved-ip")
      .build();

      SecurityGroupIdentityById securityGroupIdentityModel = new SecurityGroupIdentityById.Builder()
      .id("be5df5ca-12a0-494b-907e-aa6ec2bfa271")
      .build();

      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
      .id("7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
      .build();

      BareMetalServerPrimaryNetworkInterfacePrototype bareMetalServerPrimaryNetworkInterfacePrototypeModel = new BareMetalServerPrimaryNetworkInterfacePrototype.Builder()
      .allowIpSpoofing(true)
      .allowedVlans(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("4"))))
      .enableInfrastructureNat(true)
      .interfaceType("pci")
      .name("my-network-interface")
      .primaryIp(networkInterfaceIpPrototypeModel)
      .securityGroups(new java.util.ArrayList<SecurityGroupIdentity>(java.util.Arrays.asList(securityGroupIdentityModel)))
      .subnet(subnetIdentityModel)
      .build();

      BareMetalServerProfileIdentityByName bareMetalServerProfileIdentityModel = new BareMetalServerProfileIdentityByName.Builder()
      .name("bx2-metal-192x768")
      .build();

      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name("us-south-1")
      .build();

      BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototype bareMetalServerNetworkInterfacePrototypeModel = new BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototype.Builder()
      .allowIpSpoofing(true)
      .enableInfrastructureNat(true)
      .interfaceType("vlan")
      .name("my-network-interface")
      .primaryIp(networkInterfaceIpPrototypeModel)
      .securityGroups(new java.util.ArrayList<SecurityGroupIdentity>(java.util.Arrays.asList(securityGroupIdentityModel)))
      .subnet(subnetIdentityModel)
      .allowInterfaceToFloat(false)
      .vlan(Long.valueOf("4"))
      .build();

      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();

      VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
      .id("4727d842-f94f-4a2d-824a-9bc9b02c523b")
      .build();

      CreateBareMetalServerOptions createBareMetalServerOptions = new CreateBareMetalServerOptions.Builder()
      .initialization(bareMetalServerInitializationPrototypeModel)
      .primaryNetworkInterface(bareMetalServerPrimaryNetworkInterfacePrototypeModel)
      .profile(bareMetalServerProfileIdentityModel)
      .zone(zoneIdentityModel)
      .name("my-bare-metal-server")
      .networkInterfaces(new java.util.ArrayList<BareMetalServerNetworkInterfacePrototype>(java.util.Arrays.asList(bareMetalServerNetworkInterfacePrototypeModel)))
      .resourceGroup(resourceGroupIdentityModel)
      .vpc(vpcIdentityModel)
      .build();

      // Invoke operation
      Response<BareMetalServer> response = service.createBareMetalServer(createBareMetalServerOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      BareMetalServer bareMetalServerResult = response.getResult();

      assertNotNull(bareMetalServerResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListBareMetalServerNetworkInterfaces() throws Exception {
    try {
      ListBareMetalServerNetworkInterfacesOptions listBareMetalServerNetworkInterfacesOptions = new ListBareMetalServerNetworkInterfacesOptions.Builder()
      .bareMetalServerId("testString")
      .start("testString")
      .limit(Long.valueOf("1"))
      .build();

      // Invoke operation
      Response<BareMetalServerNetworkInterfaceCollection> response = service.listBareMetalServerNetworkInterfaces(listBareMetalServerNetworkInterfacesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      BareMetalServerNetworkInterfaceCollection bareMetalServerNetworkInterfaceCollectionResult = response.getResult();

      assertNotNull(bareMetalServerNetworkInterfaceCollectionResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testCreateBareMetalServerNetworkInterface() throws Exception {
    try {
      NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext networkInterfaceIpPrototypeModel = new NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext.Builder()
      .address("10.0.0.5")
      .autoDelete(false)
      .name("my-reserved-ip")
      .build();

      SecurityGroupIdentityById securityGroupIdentityModel = new SecurityGroupIdentityById.Builder()
      .id("be5df5ca-12a0-494b-907e-aa6ec2bfa271")
      .build();

      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
      .id("7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
      .build();

      BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototype bareMetalServerNetworkInterfacePrototypeModel = new BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototype.Builder()
      .allowIpSpoofing(true)
      .enableInfrastructureNat(true)
      .interfaceType("vlan")
      .name("my-network-interface")
      .primaryIp(networkInterfaceIpPrototypeModel)
      .securityGroups(new java.util.ArrayList<SecurityGroupIdentity>(java.util.Arrays.asList(securityGroupIdentityModel)))
      .subnet(subnetIdentityModel)
      .allowInterfaceToFloat(false)
      .vlan(Long.valueOf("4"))
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateBareMetalServerNetworkInterface() throws Exception {
    try {
      BareMetalServerNetworkInterfacePatch bareMetalServerNetworkInterfacePatchModel = new BareMetalServerNetworkInterfacePatch.Builder()
      .allowIpSpoofing(true)
      .allowedVlans(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("4"))))
      .enableInfrastructureNat(true)
      .name("my-network-interface")
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListBareMetalServerNetworkInterfaceIps() throws Exception {
    try {
      ListBareMetalServerNetworkInterfaceIpsOptions listBareMetalServerNetworkInterfaceIpsOptions = new ListBareMetalServerNetworkInterfaceIpsOptions.Builder()
      .bareMetalServerId("testString")
      .networkInterfaceId("testString")
      .build();

      // Invoke operation
      Response<ReservedIPCollectionNetworkInterfaceContext> response = service.listBareMetalServerNetworkInterfaceIps(listBareMetalServerNetworkInterfaceIpsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ReservedIPCollectionNetworkInterfaceContext reservedIpCollectionNetworkInterfaceContextResult = response.getResult();

      assertNotNull(reservedIpCollectionNetworkInterfaceContextResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateBareMetalServer() throws Exception {
    try {
      BareMetalServerPatch bareMetalServerPatchModel = new BareMetalServerPatch.Builder()
      .name("my-bare-metal-server")
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListVolumeProfiles() throws Exception {
    try {
      ListVolumeProfilesOptions listVolumeProfilesOptions = new ListVolumeProfilesOptions.Builder()
      .start("testString")
      .limit(Long.valueOf("1"))
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

  @Test
  public void testGetVolumeProfile() throws Exception {
    try {
      GetVolumeProfileOptions getVolumeProfileOptions = new GetVolumeProfileOptions.Builder()
      .name("testString")
      .build();

      // Invoke operation
      Response<VolumeProfile> response = service.getVolumeProfile(getVolumeProfileOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VolumeProfile volumeProfileResult = response.getResult();

      assertNotNull(volumeProfileResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListVolumes() throws Exception {
    try {
      ListVolumesOptions listVolumesOptions = new ListVolumesOptions.Builder()
      .start("testString")
      .limit(Long.valueOf("1"))
      .name("testString")
      .zoneName("testString")
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

  @Test
  public void testCreateVolume() throws Exception {
    try {
      VolumeProfileIdentityByName volumeProfileIdentityModel = new VolumeProfileIdentityByName.Builder()
      .name("5iops-tier")
      .build();

      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();

      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name("us-south-1")
      .build();

      EncryptionKeyIdentityByCRN encryptionKeyIdentityModel = new EncryptionKeyIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:kms:us-south:a/dffc98a0f1f0f95f6613b3b752286b87:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179")
      .build();

      VolumePrototypeVolumeByCapacity volumePrototypeModel = new VolumePrototypeVolumeByCapacity.Builder()
      .iops(Long.valueOf("10000"))
      .name("my-volume")
      .profile(volumeProfileIdentityModel)
      .resourceGroup(resourceGroupIdentityModel)
      .userTags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateVolume() throws Exception {
    try {
      VolumeProfileIdentityByName volumeProfileIdentityModel = new VolumeProfileIdentityByName.Builder()
      .name("general-purpose")
      .build();

      VolumePatch volumePatchModel = new VolumePatch.Builder()
      .capacity(Long.valueOf("100"))
      .iops(Long.valueOf("10000"))
      .name("my-volume")
      .profile(volumeProfileIdentityModel)
      .userTags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
      Map<String, Object> volumePatchModelAsPatch = volumePatchModel.asPatch();

      UpdateVolumeOptions updateVolumeOptions = new UpdateVolumeOptions.Builder()
      .id("testString")
      .volumePatch(volumePatchModelAsPatch)
      .ifMatch("96d225c4-56bd-43d9-98fc-d7148e5c5028")
      .build();

      // Invoke operation
      Response<Volume> response = service.updateVolume(updateVolumeOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Volume volumeResult = response.getResult();

      assertNotNull(volumeResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      // 412
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListSnapshots() throws Exception {
    try {
      ListSnapshotsOptions listSnapshotsOptions = new ListSnapshotsOptions.Builder()
      .start("testString")
      .limit(Long.valueOf("1"))
      .resourceGroupId("testString")
      .name("testString")
      .sourceVolumeId("testString")
      .sourceVolumeCrn("testString")
      .sourceImageId("testString")
      .sourceImageCrn("testString")
      .sort("name")
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

  @Test
  public void testCreateSnapshot() throws Exception {
    try {
      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();

      VolumeIdentityById volumeIdentityModel = new VolumeIdentityById.Builder()
      .id("1a6b7274-678d-4dfb-8981-c71dd9d4daa5")
      .build();

      SnapshotPrototypeSnapshotBySourceVolume snapshotPrototypeModel = new SnapshotPrototypeSnapshotBySourceVolume.Builder()
      .name("my-snapshot")
      .resourceGroup(resourceGroupIdentityModel)
      .userTags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateSnapshot() throws Exception {
    try {
      SnapshotPatch snapshotPatchModel = new SnapshotPatch.Builder()
      .name("my-snapshot")
      .userTags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
      Map<String, Object> snapshotPatchModelAsPatch = snapshotPatchModel.asPatch();

      UpdateSnapshotOptions updateSnapshotOptions = new UpdateSnapshotOptions.Builder()
      .id("testString")
      .snapshotPatch(snapshotPatchModelAsPatch)
      .ifMatch("96d225c4-56bd-43d9-98fc-d7148e5c5028")
      .build();

      // Invoke operation
      Response<Snapshot> response = service.updateSnapshot(updateSnapshotOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Snapshot snapshotResult = response.getResult();

      assertNotNull(snapshotResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      // 412
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

  @Test
  public void testGetRegion() throws Exception {
    try {
      GetRegionOptions getRegionOptions = new GetRegionOptions.Builder()
      .name("testString")
      .build();

      // Invoke operation
      Response<Region> response = service.getRegion(getRegionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Region regionResult = response.getResult();

      assertNotNull(regionResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListRegionZones() throws Exception {
    try {
      ListRegionZonesOptions listRegionZonesOptions = new ListRegionZonesOptions.Builder()
      .regionName("testString")
      .build();

      // Invoke operation
      Response<ZoneCollection> response = service.listRegionZones(listRegionZonesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ZoneCollection zoneCollectionResult = response.getResult();

      assertNotNull(zoneCollectionResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetRegionZone() throws Exception {
    try {
      GetRegionZoneOptions getRegionZoneOptions = new GetRegionZoneOptions.Builder()
      .regionName("testString")
      .name("testString")
      .build();

      // Invoke operation
      Response<Zone> response = service.getRegionZone(getRegionZoneOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Zone zoneResult = response.getResult();

      assertNotNull(zoneResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListPublicGateways() throws Exception {
    try {
      ListPublicGatewaysOptions listPublicGatewaysOptions = new ListPublicGatewaysOptions.Builder()
      .start("testString")
      .limit(Long.valueOf("1"))
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

  @Test
  public void testCreatePublicGateway() throws Exception {
    try {
      VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
      .id("4727d842-f94f-4a2d-824a-9bc9b02c523b")
      .build();

      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name("us-south-1")
      .build();

      PublicGatewayFloatingIPPrototypeFloatingIPIdentityFloatingIPIdentityById publicGatewayFloatingIpPrototypeModel = new PublicGatewayFloatingIPPrototypeFloatingIPIdentityFloatingIPIdentityById.Builder()
      .id("39300233-9995-4806-89a5-3c1b6eb88689")
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdatePublicGateway() throws Exception {
    try {
      PublicGatewayPatch publicGatewayPatchModel = new PublicGatewayPatch.Builder()
      .name("my-public-gateway")
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListFloatingIps() throws Exception {
    try {
      ListFloatingIpsOptions listFloatingIpsOptions = new ListFloatingIpsOptions.Builder()
      .start("testString")
      .limit(Long.valueOf("1"))
      .resourceGroupId("testString")
      .sort("name")
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

  @Test
  public void testCreateFloatingIp() throws Exception {
    try {
      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();

      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name("us-south-1")
      .build();

      FloatingIPPrototypeFloatingIPByZone floatingIpPrototypeModel = new FloatingIPPrototypeFloatingIPByZone.Builder()
      .name("my-floating-ip")
      .resourceGroup(resourceGroupIdentityModel)
      .zone(zoneIdentityModel)
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateFloatingIp() throws Exception {
    try {
      FloatingIPTargetPatchNetworkInterfaceIdentityById floatingIpTargetPatchModel = new FloatingIPTargetPatchNetworkInterfaceIdentityById.Builder()
      .id("10c02d81-0ecb-4dc5-897d-28392913b81e")
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListNetworkAcls() throws Exception {
    try {
      ListNetworkAclsOptions listNetworkAclsOptions = new ListNetworkAclsOptions.Builder()
      .start("testString")
      .limit(Long.valueOf("1"))
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

  @Test
  public void testCreateNetworkAcl() throws Exception {
    try {
      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();

      VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
      .id("f0aae929-7047-46d1-92e1-9102b07a7f6f")
      .build();

      NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDP networkAclRulePrototypeNetworkAclContextModel = new NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDP.Builder()
      .action("allow")
      .destination("192.168.3.2/32")
      .direction("inbound")
      .name("my-rule-2")
      .source("192.168.3.2/32")
      .destinationPortMax(Long.valueOf("22"))
      .destinationPortMin(Long.valueOf("22"))
      .protocol("udp")
      .sourcePortMax(Long.valueOf("65535"))
      .sourcePortMin(Long.valueOf("49152"))
      .build();

      NetworkACLPrototypeNetworkACLByRules networkAclPrototypeModel = new NetworkACLPrototypeNetworkACLByRules.Builder()
      .name("my-network-acl")
      .resourceGroup(resourceGroupIdentityModel)
      .vpc(vpcIdentityModel)
      .rules(new java.util.ArrayList<NetworkACLRulePrototypeNetworkACLContext>(java.util.Arrays.asList(networkAclRulePrototypeNetworkAclContextModel)))
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateNetworkAcl() throws Exception {
    try {
      NetworkACLPatch networkAclPatchModel = new NetworkACLPatch.Builder()
      .name("my-network-acl")
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListNetworkAclRules() throws Exception {
    try {
      ListNetworkAclRulesOptions listNetworkAclRulesOptions = new ListNetworkAclRulesOptions.Builder()
      .networkAclId("testString")
      .start("testString")
      .limit(Long.valueOf("1"))
      .direction("inbound")
      .build();

      // Invoke operation
      Response<NetworkACLRuleCollection> response = service.listNetworkAclRules(listNetworkAclRulesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      NetworkACLRuleCollection networkAclRuleCollectionResult = response.getResult();

      assertNotNull(networkAclRuleCollectionResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testCreateNetworkAclRule() throws Exception {
    try {
      NetworkACLRuleBeforePrototypeNetworkACLRuleIdentityById networkAclRuleBeforePrototypeModel = new NetworkACLRuleBeforePrototypeNetworkACLRuleIdentityById.Builder()
      .id("8daca77a-4980-4d33-8f3e-7038797be8f9")
      .build();

      NetworkACLRulePrototypeNetworkACLRuleProtocolICMP networkAclRulePrototypeModel = new NetworkACLRulePrototypeNetworkACLRuleProtocolICMP.Builder()
      .action("allow")
      .before(networkAclRuleBeforePrototypeModel)
      .destination("192.168.3.2/32")
      .direction("inbound")
      .name("my-rule-2")
      .source("192.168.3.2/32")
      .code(Long.valueOf("0"))
      .protocol("icmp")
      .type(Long.valueOf("8"))
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateNetworkAclRule() throws Exception {
    try {
      NetworkACLRuleBeforePatchNetworkACLRuleIdentityById networkAclRuleBeforePatchModel = new NetworkACLRuleBeforePatchNetworkACLRuleIdentityById.Builder()
      .id("8daca77a-4980-4d33-8f3e-7038797be8f9")
      .build();

      NetworkACLRulePatch networkAclRulePatchModel = new NetworkACLRulePatch.Builder()
      .action("allow")
      .before(networkAclRuleBeforePatchModel)
      .code(Long.valueOf("0"))
      .destination("192.168.3.2/32")
      .destinationPortMax(Long.valueOf("22"))
      .destinationPortMin(Long.valueOf("22"))
      .direction("inbound")
      .name("my-rule-2")
      .source("192.168.3.2/32")
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListSecurityGroups() throws Exception {
    try {
      ListSecurityGroupsOptions listSecurityGroupsOptions = new ListSecurityGroupsOptions.Builder()
      .start("testString")
      .limit(Long.valueOf("1"))
      .resourceGroupId("testString")
      .vpcId("testString")
      .vpcCrn("testString")
      .vpcName("testString")
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

  @Test
  public void testCreateSecurityGroup() throws Exception {
    try {
      VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
      .id("4727d842-f94f-4a2d-824a-9bc9b02c523b")
      .build();

      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();

      SecurityGroupRuleRemotePrototypeIP securityGroupRuleRemotePrototypeModel = new SecurityGroupRuleRemotePrototypeIP.Builder()
      .address("192.168.3.4")
      .build();

      SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP securityGroupRulePrototypeModel = new SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP.Builder()
      .code(Long.valueOf("0"))
      .direction("inbound")
      .ipVersion("ipv4")
      .protocol("icmp")
      .remote(securityGroupRuleRemotePrototypeModel)
      .type(Long.valueOf("8"))
      .build();

      CreateSecurityGroupOptions createSecurityGroupOptions = new CreateSecurityGroupOptions.Builder()
      .vpc(vpcIdentityModel)
      .name("my-security-group")
      .resourceGroup(resourceGroupIdentityModel)
      .rules(new java.util.ArrayList<SecurityGroupRulePrototype>(java.util.Arrays.asList(securityGroupRulePrototypeModel)))
      .build();

      // Invoke operation
      Response<SecurityGroup> response = service.createSecurityGroup(createSecurityGroupOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      SecurityGroup securityGroupResult = response.getResult();

      assertNotNull(securityGroupResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testCreateSecurityGroupRule() throws Exception {
    try {
      SecurityGroupRuleRemotePrototypeIP securityGroupRuleRemotePrototypeModel = new SecurityGroupRuleRemotePrototypeIP.Builder()
      .address("192.168.3.4")
      .build();

      SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP securityGroupRulePrototypeModel = new SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP.Builder()
      .code(Long.valueOf("0"))
      .direction("inbound")
      .ipVersion("ipv4")
      .protocol("icmp")
      .remote(securityGroupRuleRemotePrototypeModel)
      .type(Long.valueOf("8"))
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateSecurityGroupRule() throws Exception {
    try {
      SecurityGroupRuleRemotePatchIP securityGroupRuleRemotePatchModel = new SecurityGroupRuleRemotePatchIP.Builder()
      .address("192.168.3.4")
      .build();

      SecurityGroupRulePatch securityGroupRulePatchModel = new SecurityGroupRulePatch.Builder()
      .code(Long.valueOf("0"))
      .direction("inbound")
      .ipVersion("ipv4")
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListSecurityGroupTargets() throws Exception {
    try {
      ListSecurityGroupTargetsOptions listSecurityGroupTargetsOptions = new ListSecurityGroupTargetsOptions.Builder()
      .securityGroupId("testString")
      .start("testString")
      .limit(Long.valueOf("1"))
      .build();

      // Invoke operation
      Response<SecurityGroupTargetCollection> response = service.listSecurityGroupTargets(listSecurityGroupTargetsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SecurityGroupTargetCollection securityGroupTargetCollectionResult = response.getResult();

      assertNotNull(securityGroupTargetCollectionResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListIkePolicies() throws Exception {
    try {
      ListIkePoliciesOptions listIkePoliciesOptions = new ListIkePoliciesOptions.Builder()
      .start("testString")
      .limit(Long.valueOf("1"))
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

  @Test
  public void testCreateIkePolicy() throws Exception {
    try {
      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();

      CreateIkePolicyOptions createIkePolicyOptions = new CreateIkePolicyOptions.Builder()
      .authenticationAlgorithm("md5")
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateIkePolicy() throws Exception {
    try {
      IKEPolicyPatch ikePolicyPatchModel = new IKEPolicyPatch.Builder()
      .authenticationAlgorithm("md5")
      .dhGroup(Long.valueOf("14"))
      .encryptionAlgorithm("aes128")
      .ikeVersion(Long.valueOf("1"))
      .keyLifetime(Long.valueOf("28800"))
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListIkePolicyConnections() throws Exception {
    try {
      ListIkePolicyConnectionsOptions listIkePolicyConnectionsOptions = new ListIkePolicyConnectionsOptions.Builder()
      .id("testString")
      .build();

      // Invoke operation
      Response<VPNGatewayConnectionCollection> response = service.listIkePolicyConnections(listIkePolicyConnectionsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VPNGatewayConnectionCollection vpnGatewayConnectionCollectionResult = response.getResult();

      assertNotNull(vpnGatewayConnectionCollectionResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListIpsecPolicies() throws Exception {
    try {
      ListIpsecPoliciesOptions listIpsecPoliciesOptions = new ListIpsecPoliciesOptions.Builder()
      .start("testString")
      .limit(Long.valueOf("1"))
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

  @Test
  public void testCreateIpsecPolicy() throws Exception {
    try {
      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();

      CreateIpsecPolicyOptions createIpsecPolicyOptions = new CreateIpsecPolicyOptions.Builder()
      .authenticationAlgorithm("md5")
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateIpsecPolicy() throws Exception {
    try {
      IPsecPolicyPatch iPsecPolicyPatchModel = new IPsecPolicyPatch.Builder()
      .authenticationAlgorithm("md5")
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListIpsecPolicyConnections() throws Exception {
    try {
      ListIpsecPolicyConnectionsOptions listIpsecPolicyConnectionsOptions = new ListIpsecPolicyConnectionsOptions.Builder()
      .id("testString")
      .build();

      // Invoke operation
      Response<VPNGatewayConnectionCollection> response = service.listIpsecPolicyConnections(listIpsecPolicyConnectionsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VPNGatewayConnectionCollection vpnGatewayConnectionCollectionResult = response.getResult();

      assertNotNull(vpnGatewayConnectionCollectionResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListVpnGateways() throws Exception {
    try {
      ListVpnGatewaysOptions listVpnGatewaysOptions = new ListVpnGatewaysOptions.Builder()
      .start("testString")
      .limit(Long.valueOf("1"))
      .resourceGroupId("testString")
      .mode("route")
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

  @Test
  public void testCreateVpnGateway() throws Exception {
    try {
      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();

      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
      .id("7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateVpnGateway() throws Exception {
    try {
      VPNGatewayPatch vpnGatewayPatchModel = new VPNGatewayPatch.Builder()
      .name("my-vpn-gateway")
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListVpnGatewayConnections() throws Exception {
    try {
      ListVpnGatewayConnectionsOptions listVpnGatewayConnectionsOptions = new ListVpnGatewayConnectionsOptions.Builder()
      .vpnGatewayId("testString")
      .status("testString")
      .build();

      // Invoke operation
      Response<VPNGatewayConnectionCollection> response = service.listVpnGatewayConnections(listVpnGatewayConnectionsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VPNGatewayConnectionCollection vpnGatewayConnectionCollectionResult = response.getResult();

      assertNotNull(vpnGatewayConnectionCollectionResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testCreateVpnGatewayConnection() throws Exception {
    try {
      VPNGatewayConnectionDPDPrototype vpnGatewayConnectionDpdPrototypeModel = new VPNGatewayConnectionDPDPrototype.Builder()
      .action("restart")
      .interval(Long.valueOf("30"))
      .timeout(Long.valueOf("120"))
      .build();

      VPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityById vpnGatewayConnectionIkePolicyPrototypeModel = new VPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityById.Builder()
      .id("ddf51bec-3424-11e8-b467-0ed5f89f718b")
      .build();

      VPNGatewayConnectionIPsecPolicyPrototypeIPsecPolicyIdentityById vpnGatewayConnectionIPsecPolicyPrototypeModel = new VPNGatewayConnectionIPsecPolicyPrototypeIPsecPolicyIdentityById.Builder()
      .id("ddf51bec-3424-11e8-b467-0ed5f89f718b")
      .build();

      VPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototype vpnGatewayConnectionPrototypeModel = new VPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototype.Builder()
      .adminStateUp(true)
      .deadPeerDetection(vpnGatewayConnectionDpdPrototypeModel)
      .ikePolicy(vpnGatewayConnectionIkePolicyPrototypeModel)
      .ipsecPolicy(vpnGatewayConnectionIPsecPolicyPrototypeModel)
      .name("my-vpn-connection")
      .peerAddress("169.21.50.5")
      .psk("lkj14b1oi0alcniejkso")
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateVpnGatewayConnection() throws Exception {
    try {
      VPNGatewayConnectionDPDPatch vpnGatewayConnectionDpdPatchModel = new VPNGatewayConnectionDPDPatch.Builder()
      .action("restart")
      .interval(Long.valueOf("30"))
      .timeout(Long.valueOf("120"))
      .build();

      VPNGatewayConnectionIKEPolicyPatchIKEPolicyIdentityById vpnGatewayConnectionIkePolicyPatchModel = new VPNGatewayConnectionIKEPolicyPatchIKEPolicyIdentityById.Builder()
      .id("ddf51bec-3424-11e8-b467-0ed5f89f718b")
      .build();

      VPNGatewayConnectionIPsecPolicyPatchIPsecPolicyIdentityById vpnGatewayConnectionIPsecPolicyPatchModel = new VPNGatewayConnectionIPsecPolicyPatchIPsecPolicyIdentityById.Builder()
      .id("ddf51bec-3424-11e8-b467-0ed5f89f718b")
      .build();

      VPNGatewayConnectionPatchVPNGatewayConnectionStaticRouteModePatch vpnGatewayConnectionPatchModel = new VPNGatewayConnectionPatchVPNGatewayConnectionStaticRouteModePatch.Builder()
      .adminStateUp(true)
      .deadPeerDetection(vpnGatewayConnectionDpdPatchModel)
      .ikePolicy(vpnGatewayConnectionIkePolicyPatchModel)
      .ipsecPolicy(vpnGatewayConnectionIPsecPolicyPatchModel)
      .name("my-vpn-connection")
      .peerAddress("169.21.50.5")
      .psk("lkj14b1oi0alcniejkso")
      .routingProtocol("none")
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListVpnGatewayConnectionLocalCidrs() throws Exception {
    try {
      ListVpnGatewayConnectionLocalCidrsOptions listVpnGatewayConnectionLocalCidrsOptions = new ListVpnGatewayConnectionLocalCidrsOptions.Builder()
      .vpnGatewayId("testString")
      .id("testString")
      .build();

      // Invoke operation
      Response<VPNGatewayConnectionLocalCIDRs> response = service.listVpnGatewayConnectionLocalCidrs(listVpnGatewayConnectionLocalCidrsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VPNGatewayConnectionLocalCIDRs vpnGatewayConnectionLocalCidRsResult = response.getResult();

      assertNotNull(vpnGatewayConnectionLocalCidRsResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testCheckVpnGatewayConnectionLocalCidr() throws Exception {
    try {
      CheckVpnGatewayConnectionLocalCidrOptions checkVpnGatewayConnectionLocalCidrOptions = new CheckVpnGatewayConnectionLocalCidrOptions.Builder()
      .vpnGatewayId("testString")
      .id("testString")
      .cidrPrefix("testString")
      .prefixLength("testString")
      .build();

      // Invoke operation
      Response<Void> response = service.checkVpnGatewayConnectionLocalCidr(checkVpnGatewayConnectionLocalCidrOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testAddVpnGatewayConnectionLocalCidr() throws Exception {
    try {
      AddVpnGatewayConnectionLocalCidrOptions addVpnGatewayConnectionLocalCidrOptions = new AddVpnGatewayConnectionLocalCidrOptions.Builder()
      .vpnGatewayId("testString")
      .id("testString")
      .cidrPrefix("testString")
      .prefixLength("testString")
      .build();

      // Invoke operation
      Response<Void> response = service.addVpnGatewayConnectionLocalCidr(addVpnGatewayConnectionLocalCidrOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListVpnGatewayConnectionPeerCidrs() throws Exception {
    try {
      ListVpnGatewayConnectionPeerCidrsOptions listVpnGatewayConnectionPeerCidrsOptions = new ListVpnGatewayConnectionPeerCidrsOptions.Builder()
      .vpnGatewayId("testString")
      .id("testString")
      .build();

      // Invoke operation
      Response<VPNGatewayConnectionPeerCIDRs> response = service.listVpnGatewayConnectionPeerCidrs(listVpnGatewayConnectionPeerCidrsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VPNGatewayConnectionPeerCIDRs vpnGatewayConnectionPeerCidRsResult = response.getResult();

      assertNotNull(vpnGatewayConnectionPeerCidRsResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testCheckVpnGatewayConnectionPeerCidr() throws Exception {
    try {
      CheckVpnGatewayConnectionPeerCidrOptions checkVpnGatewayConnectionPeerCidrOptions = new CheckVpnGatewayConnectionPeerCidrOptions.Builder()
      .vpnGatewayId("testString")
      .id("testString")
      .cidrPrefix("testString")
      .prefixLength("testString")
      .build();

      // Invoke operation
      Response<Void> response = service.checkVpnGatewayConnectionPeerCidr(checkVpnGatewayConnectionPeerCidrOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testAddVpnGatewayConnectionPeerCidr() throws Exception {
    try {
      AddVpnGatewayConnectionPeerCidrOptions addVpnGatewayConnectionPeerCidrOptions = new AddVpnGatewayConnectionPeerCidrOptions.Builder()
      .vpnGatewayId("testString")
      .id("testString")
      .cidrPrefix("testString")
      .prefixLength("testString")
      .build();

      // Invoke operation
      Response<Void> response = service.addVpnGatewayConnectionPeerCidr(addVpnGatewayConnectionPeerCidrOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListLoadBalancerProfiles() throws Exception {
    try {
      ListLoadBalancerProfilesOptions listLoadBalancerProfilesOptions = new ListLoadBalancerProfilesOptions.Builder()
      .start("testString")
      .limit(Long.valueOf("1"))
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

  @Test
  public void testGetLoadBalancerProfile() throws Exception {
    try {
      GetLoadBalancerProfileOptions getLoadBalancerProfileOptions = new GetLoadBalancerProfileOptions.Builder()
      .name("testString")
      .build();

      // Invoke operation
      Response<LoadBalancerProfile> response = service.getLoadBalancerProfile(getLoadBalancerProfileOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancerProfile loadBalancerProfileResult = response.getResult();

      assertNotNull(loadBalancerProfileResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListLoadBalancers() throws Exception {
    try {
      ListLoadBalancersOptions listLoadBalancersOptions = new ListLoadBalancersOptions.Builder()
      .start("testString")
      .limit(Long.valueOf("1"))
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

  @Test
  public void testCreateLoadBalancer() throws Exception {
    try {
      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
      .id("7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
      .build();

      LoadBalancerPoolIdentityByName loadBalancerPoolIdentityByNameModel = new LoadBalancerPoolIdentityByName.Builder()
      .name("my-load-balancer-pool")
      .build();

      LoadBalancerListenerPrototypeLoadBalancerContext loadBalancerListenerPrototypeLoadBalancerContextModel = new LoadBalancerListenerPrototypeLoadBalancerContext.Builder()
      .acceptProxyProtocol(true)
      .connectionLimit(Long.valueOf("2000"))
      .defaultPool(loadBalancerPoolIdentityByNameModel)
      .port(Long.valueOf("443"))
      .portMax(Long.valueOf("499"))
      .portMin(Long.valueOf("443"))
      .protocol("http")
      .build();

      LoadBalancerLoggingDatapath loadBalancerLoggingDatapathModel = new LoadBalancerLoggingDatapath.Builder()
      .active(true)
      .build();

      LoadBalancerLogging loadBalancerLoggingModel = new LoadBalancerLogging.Builder()
      .datapath(loadBalancerLoggingDatapathModel)
      .build();

      LoadBalancerPoolHealthMonitorPrototype loadBalancerPoolHealthMonitorPrototypeModel = new LoadBalancerPoolHealthMonitorPrototype.Builder()
      .delay(Long.valueOf("5"))
      .maxRetries(Long.valueOf("2"))
      .port(Long.valueOf("22"))
      .timeout(Long.valueOf("2"))
      .type("http")
      .urlPath("/")
      .build();

      LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById loadBalancerPoolMemberTargetPrototypeModel = new LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById.Builder()
      .id("1e09281b-f177-46fb-baf1-bc152b2e391a")
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

      LoadBalancerPoolPrototype loadBalancerPoolPrototypeModel = new LoadBalancerPoolPrototype.Builder()
      .algorithm("least_connections")
      .healthMonitor(loadBalancerPoolHealthMonitorPrototypeModel)
      .members(new java.util.ArrayList<LoadBalancerPoolMemberPrototype>(java.util.Arrays.asList(loadBalancerPoolMemberPrototypeModel)))
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
      .id("be5df5ca-12a0-494b-907e-aa6ec2bfa271")
      .build();

      CreateLoadBalancerOptions createLoadBalancerOptions = new CreateLoadBalancerOptions.Builder()
      .isPublic(true)
      .subnets(new java.util.ArrayList<SubnetIdentity>(java.util.Arrays.asList(subnetIdentityModel)))
      .listeners(new java.util.ArrayList<LoadBalancerListenerPrototypeLoadBalancerContext>(java.util.Arrays.asList(loadBalancerListenerPrototypeLoadBalancerContextModel)))
      .logging(loadBalancerLoggingModel)
      .name("my-load-balancer")
      .pools(new java.util.ArrayList<LoadBalancerPoolPrototype>(java.util.Arrays.asList(loadBalancerPoolPrototypeModel)))
      .profile(loadBalancerProfileIdentityModel)
      .resourceGroup(resourceGroupIdentityModel)
      .routeMode(true)
      .securityGroups(new java.util.ArrayList<SecurityGroupIdentity>(java.util.Arrays.asList(securityGroupIdentityModel)))
      .build();

      // Invoke operation
      Response<LoadBalancer> response = service.createLoadBalancer(createLoadBalancerOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      LoadBalancer loadBalancerResult = response.getResult();

      assertNotNull(loadBalancerResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateLoadBalancer() throws Exception {
    try {
      LoadBalancerLoggingDatapath loadBalancerLoggingDatapathModel = new LoadBalancerLoggingDatapath.Builder()
      .active(true)
      .build();

      LoadBalancerLogging loadBalancerLoggingModel = new LoadBalancerLogging.Builder()
      .datapath(loadBalancerLoggingDatapathModel)
      .build();

      LoadBalancerPatch loadBalancerPatchModel = new LoadBalancerPatch.Builder()
      .logging(loadBalancerLoggingModel)
      .name("my-load-balancer")
      .build();
      Map<String, Object> loadBalancerPatchModelAsPatch = loadBalancerPatchModel.asPatch();

      UpdateLoadBalancerOptions updateLoadBalancerOptions = new UpdateLoadBalancerOptions.Builder()
      .id("testString")
      .loadBalancerPatch(loadBalancerPatchModelAsPatch)
      .build();

      // Invoke operation
      Response<LoadBalancer> response = service.updateLoadBalancer(updateLoadBalancerOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancer loadBalancerResult = response.getResult();

      assertNotNull(loadBalancerResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

  @Test
  public void testCreateLoadBalancerListener() throws Exception {
    try {
      CertificateInstanceIdentityByCRN certificateInstanceIdentityModel = new CertificateInstanceIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:secrets-manager:us-south:a/123456:36fa422d-080d-4d83-8d2d-86851b4001df:secret:2e786aab-42fa-63ed-14f8-d66d552f4dd5")
      .build();

      LoadBalancerPoolIdentityById loadBalancerPoolIdentityModel = new LoadBalancerPoolIdentityById.Builder()
      .id("70294e14-4e61-11e8-bcf4-0242ac110004")
      .build();

      LoadBalancerListenerIdentityById loadBalancerListenerIdentityModel = new LoadBalancerListenerIdentityById.Builder()
      .id("70294e14-4e61-11e8-bcf4-0242ac110004")
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

      LoadBalancerListenerPolicyTargetPrototypeLoadBalancerPoolIdentityLoadBalancerPoolIdentityById loadBalancerListenerPolicyTargetPrototypeModel = new LoadBalancerListenerPolicyTargetPrototypeLoadBalancerPoolIdentityLoadBalancerPoolIdentityById.Builder()
      .id("70294e14-4e61-11e8-bcf4-0242ac110004")
      .build();

      LoadBalancerListenerPolicyPrototype loadBalancerListenerPolicyPrototypeModel = new LoadBalancerListenerPolicyPrototype.Builder()
      .action("forward")
      .name("my-policy")
      .priority(Long.valueOf("5"))
      .rules(new java.util.ArrayList<LoadBalancerListenerPolicyRulePrototype>(java.util.Arrays.asList(loadBalancerListenerPolicyRulePrototypeModel)))
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
      .policies(new java.util.ArrayList<LoadBalancerListenerPolicyPrototype>(java.util.Arrays.asList(loadBalancerListenerPolicyPrototypeModel)))
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateLoadBalancerListener() throws Exception {
    try {
      CertificateInstanceIdentityByCRN certificateInstanceIdentityModel = new CertificateInstanceIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:secrets-manager:us-south:a/123456:36fa422d-080d-4d83-8d2d-86851b4001df:secret:2e786aab-42fa-63ed-14f8-d66d552f4dd5")
      .build();

      LoadBalancerPoolIdentityById loadBalancerPoolIdentityModel = new LoadBalancerPoolIdentityById.Builder()
      .id("70294e14-4e61-11e8-bcf4-0242ac110004")
      .build();

      LoadBalancerListenerIdentityById loadBalancerListenerIdentityModel = new LoadBalancerListenerIdentityById.Builder()
      .id("70294e14-4e61-11e8-bcf4-0242ac110004")
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
      .defaultPool(loadBalancerPoolIdentityModel)
      .httpsRedirect(loadBalancerListenerHttpsRedirectPatchModel)
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

  @Test
  public void testCreateLoadBalancerListenerPolicy() throws Exception {
    try {
      LoadBalancerListenerPolicyRulePrototype loadBalancerListenerPolicyRulePrototypeModel = new LoadBalancerListenerPolicyRulePrototype.Builder()
      .condition("contains")
      .field("MY-APP-HEADER")
      .type("body")
      .value("testString")
      .build();

      LoadBalancerListenerPolicyTargetPrototypeLoadBalancerPoolIdentityLoadBalancerPoolIdentityById loadBalancerListenerPolicyTargetPrototypeModel = new LoadBalancerListenerPolicyTargetPrototypeLoadBalancerPoolIdentityLoadBalancerPoolIdentityById.Builder()
      .id("70294e14-4e61-11e8-bcf4-0242ac110004")
      .build();

      CreateLoadBalancerListenerPolicyOptions createLoadBalancerListenerPolicyOptions = new CreateLoadBalancerListenerPolicyOptions.Builder()
      .loadBalancerId("testString")
      .listenerId("testString")
      .action("forward")
      .priority(Long.valueOf("5"))
      .name("my-policy")
      .rules(new java.util.ArrayList<LoadBalancerListenerPolicyRulePrototype>(java.util.Arrays.asList(loadBalancerListenerPolicyRulePrototypeModel)))
      .target(loadBalancerListenerPolicyTargetPrototypeModel)
      .build();

      // Invoke operation
      Response<LoadBalancerListenerPolicy> response = service.createLoadBalancerListenerPolicy(createLoadBalancerListenerPolicyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      LoadBalancerListenerPolicy loadBalancerListenerPolicyResult = response.getResult();

      assertNotNull(loadBalancerListenerPolicyResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateLoadBalancerListenerPolicy() throws Exception {
    try {
      LoadBalancerListenerPolicyTargetPatchLoadBalancerPoolIdentityLoadBalancerPoolIdentityById loadBalancerListenerPolicyTargetPatchModel = new LoadBalancerListenerPolicyTargetPatchLoadBalancerPoolIdentityLoadBalancerPoolIdentityById.Builder()
      .id("70294e14-4e61-11e8-bcf4-0242ac110004")
      .build();

      LoadBalancerListenerPolicyPatch loadBalancerListenerPolicyPatchModel = new LoadBalancerListenerPolicyPatch.Builder()
      .name("my-policy")
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateLoadBalancerListenerPolicyRule() throws Exception {
    try {
      LoadBalancerListenerPolicyRulePatch loadBalancerListenerPolicyRulePatchModel = new LoadBalancerListenerPolicyRulePatch.Builder()
      .condition("contains")
      .field("MY-APP-HEADER")
      .type("body")
      .value("testString")
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

  @Test
  public void testCreateLoadBalancerPool() throws Exception {
    try {
      LoadBalancerPoolHealthMonitorPrototype loadBalancerPoolHealthMonitorPrototypeModel = new LoadBalancerPoolHealthMonitorPrototype.Builder()
      .delay(Long.valueOf("5"))
      .maxRetries(Long.valueOf("2"))
      .port(Long.valueOf("22"))
      .timeout(Long.valueOf("2"))
      .type("http")
      .urlPath("/")
      .build();

      LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById loadBalancerPoolMemberTargetPrototypeModel = new LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById.Builder()
      .id("1e09281b-f177-46fb-baf1-bc152b2e391a")
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
      .members(new java.util.ArrayList<LoadBalancerPoolMemberPrototype>(java.util.Arrays.asList(loadBalancerPoolMemberPrototypeModel)))
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateLoadBalancerPool() throws Exception {
    try {
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
      .algorithm("least_connections")
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

  @Test
  public void testCreateLoadBalancerPoolMember() throws Exception {
    try {
      LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById loadBalancerPoolMemberTargetPrototypeModel = new LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById.Builder()
      .id("1e09281b-f177-46fb-baf1-bc152b2e391a")
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testReplaceLoadBalancerPoolMembers() throws Exception {
    try {
      LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById loadBalancerPoolMemberTargetPrototypeModel = new LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById.Builder()
      .id("1e09281b-f177-46fb-baf1-bc152b2e391a")
      .build();

      LoadBalancerPoolMemberPrototype loadBalancerPoolMemberPrototypeModel = new LoadBalancerPoolMemberPrototype.Builder()
      .port(Long.valueOf("80"))
      .target(loadBalancerPoolMemberTargetPrototypeModel)
      .weight(Long.valueOf("50"))
      .build();

      ReplaceLoadBalancerPoolMembersOptions replaceLoadBalancerPoolMembersOptions = new ReplaceLoadBalancerPoolMembersOptions.Builder()
      .loadBalancerId("testString")
      .poolId("testString")
      .members(new java.util.ArrayList<LoadBalancerPoolMemberPrototype>(java.util.Arrays.asList(loadBalancerPoolMemberPrototypeModel)))
      .build();

      // Invoke operation
      Response<LoadBalancerPoolMemberCollection> response = service.replaceLoadBalancerPoolMembers(replaceLoadBalancerPoolMembersOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      LoadBalancerPoolMemberCollection loadBalancerPoolMemberCollectionResult = response.getResult();

      assertNotNull(loadBalancerPoolMemberCollectionResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateLoadBalancerPoolMember() throws Exception {
    try {
      LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById loadBalancerPoolMemberTargetPrototypeModel = new LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById.Builder()
      .id("1e09281b-f177-46fb-baf1-bc152b2e391a")
      .build();

      LoadBalancerPoolMemberPatch loadBalancerPoolMemberPatchModel = new LoadBalancerPoolMemberPatch.Builder()
      .port(Long.valueOf("80"))
      .target(loadBalancerPoolMemberTargetPrototypeModel)
      .weight(Long.valueOf("50"))
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListEndpointGateways() throws Exception {
    try {
      ListEndpointGatewaysOptions listEndpointGatewaysOptions = new ListEndpointGatewaysOptions.Builder()
      .name("testString")
      .start("testString")
      .limit(Long.valueOf("1"))
      .resourceGroupId("testString")
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

  @Test
  public void testCreateEndpointGateway() throws Exception {
    try {
      EndpointGatewayTargetPrototypeProviderCloudServiceIdentityProviderCloudServiceIdentityByCRN endpointGatewayTargetPrototypeModel = new EndpointGatewayTargetPrototypeProviderCloudServiceIdentityProviderCloudServiceIdentityByCRN.Builder()
      .resourceType("provider_infrastructure_service")
      .crn("crn:v1:bluemix:public:cloudant:us-south:a/123456:3527280b-9327-4411-8020-591092e60353::")
      .build();

      VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
      .id("f025b503-ae66-46de-a011-3bd08fd5f7bf")
      .build();

      EndpointGatewayReservedIPReservedIPIdentityReservedIPIdentityById endpointGatewayReservedIpModel = new EndpointGatewayReservedIPReservedIPIdentityReservedIPIdentityById.Builder()
      .id("6d353a0f-aeb1-4ae1-832e-1110d10981bb")
      .build();

      ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();

      SecurityGroupIdentityById securityGroupIdentityModel = new SecurityGroupIdentityById.Builder()
      .id("be5df5ca-12a0-494b-907e-aa6ec2bfa271")
      .build();

      CreateEndpointGatewayOptions createEndpointGatewayOptions = new CreateEndpointGatewayOptions.Builder()
      .target(endpointGatewayTargetPrototypeModel)
      .vpc(vpcIdentityModel)
      .ips(new java.util.ArrayList<EndpointGatewayReservedIP>(java.util.Arrays.asList(endpointGatewayReservedIpModel)))
      .name("testString")
      .resourceGroup(resourceGroupIdentityModel)
      .securityGroups(new java.util.ArrayList<SecurityGroupIdentity>(java.util.Arrays.asList(securityGroupIdentityModel)))
      .build();

      // Invoke operation
      Response<EndpointGateway> response = service.createEndpointGateway(createEndpointGatewayOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      EndpointGateway endpointGatewayResult = response.getResult();

      assertNotNull(endpointGatewayResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListEndpointGatewayIps() throws Exception {
    try {
      ListEndpointGatewayIpsOptions listEndpointGatewayIpsOptions = new ListEndpointGatewayIpsOptions.Builder()
      .endpointGatewayId("testString")
      .start("testString")
      .limit(Long.valueOf("1"))
      .sort("name")
      .build();

      // Invoke operation
      Response<ReservedIPCollectionEndpointGatewayContext> response = service.listEndpointGatewayIps(listEndpointGatewayIpsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ReservedIPCollectionEndpointGatewayContext reservedIpCollectionEndpointGatewayContextResult = response.getResult();

      assertNotNull(reservedIpCollectionEndpointGatewayContextResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateEndpointGateway() throws Exception {
    try {
      EndpointGatewayPatch endpointGatewayPatchModel = new EndpointGatewayPatch.Builder()
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListFlowLogCollectors() throws Exception {
    try {
      ListFlowLogCollectorsOptions listFlowLogCollectorsOptions = new ListFlowLogCollectorsOptions.Builder()
      .start("testString")
      .limit(Long.valueOf("1"))
      .resourceGroupId("testString")
      .name("testString")
      .vpcId("testString")
      .vpcCrn("testString")
      .vpcName("testString")
      .targetId("testString")
      .targetResourceType("instance")
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

  @Test
  public void testCreateFlowLogCollector() throws Exception {
    try {
      LegacyCloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByName legacyCloudObjectStorageBucketIdentityModel = new LegacyCloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByName.Builder()
      .name("bucket-27200-lwx4cfvcue")
      .build();

      FlowLogCollectorTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityNetworkInterfaceIdentityById flowLogCollectorTargetPrototypeModel = new FlowLogCollectorTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityNetworkInterfaceIdentityById.Builder()
      .id("10c02d81-0ecb-4dc5-897d-28392913b81e")
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateFlowLogCollector() throws Exception {
    try {
      FlowLogCollectorPatch flowLogCollectorPatchModel = new FlowLogCollectorPatch.Builder()
      .active(true)
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testRemoveVpnGatewayConnectionPeerCidr() throws Exception {
    try {
      RemoveVpnGatewayConnectionPeerCidrOptions removeVpnGatewayConnectionPeerCidrOptions = new RemoveVpnGatewayConnectionPeerCidrOptions.Builder()
      .vpnGatewayId("testString")
      .id("testString")
      .cidrPrefix("testString")
      .prefixLength("testString")
      .build();

      // Invoke operation
      Response<Void> response = service.removeVpnGatewayConnectionPeerCidr(removeVpnGatewayConnectionPeerCidrOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testRemoveVpnGatewayConnectionLocalCidr() throws Exception {
    try {
      RemoveVpnGatewayConnectionLocalCidrOptions removeVpnGatewayConnectionLocalCidrOptions = new RemoveVpnGatewayConnectionLocalCidrOptions.Builder()
      .vpnGatewayId("testString")
      .id("testString")
      .cidrPrefix("testString")
      .prefixLength("testString")
      .build();

      // Invoke operation
      Response<Void> response = service.removeVpnGatewayConnectionLocalCidr(removeVpnGatewayConnectionLocalCidrOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDeleteVpcRoutingTable() throws Exception {
    try {
      DeleteVpcRoutingTableOptions deleteVpcRoutingTableOptions = new DeleteVpcRoutingTableOptions.Builder()
      .vpcId("testString")
      .id("testString")
      .build();

      // Invoke operation
      Response<Void> response = service.deleteVpcRoutingTable(deleteVpcRoutingTableOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 403
      // 404
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDeleteVpc() throws Exception {
    try {
      DeleteVpcOptions deleteVpcOptions = new DeleteVpcOptions.Builder()
      .id("testString")
      .build();

      // Invoke operation
      Response<Void> response = service.deleteVpc(deleteVpcOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDeleteVolume() throws Exception {
    try {
      DeleteVolumeOptions deleteVolumeOptions = new DeleteVolumeOptions.Builder()
      .id("testString")
      .ifMatch("96d225c4-56bd-43d9-98fc-d7148e5c5028")
      .build();

      // Invoke operation
      Response<Void> response = service.deleteVolume(deleteVolumeOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      // 409
      // 412
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 403
      // 404
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDeleteSnapshots() throws Exception {
    try {
      DeleteSnapshotsOptions deleteSnapshotsOptions = new DeleteSnapshotsOptions.Builder()
      .sourceVolumeId("testString")
      .build();

      // Invoke operation
      Response<Void> response = service.deleteSnapshots(deleteSnapshotsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 412
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDeleteSnapshot() throws Exception {
    try {
      DeleteSnapshotOptions deleteSnapshotOptions = new DeleteSnapshotOptions.Builder()
      .id("testString")
      .ifMatch("96d225c4-56bd-43d9-98fc-d7148e5c5028")
      .build();

      // Invoke operation
      Response<Void> response = service.deleteSnapshot(deleteSnapshotOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      // 412
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 403
      // 404
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 403
      // 404
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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
      assertEquals(response.getStatusCode(), 204);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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
      assertEquals(response.getStatusCode(), 204);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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
      assertEquals(response.getStatusCode(), 204);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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
      assertEquals(response.getStatusCode(), 204);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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
      assertEquals(response.getStatusCode(), 204);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDeleteLoadBalancer() throws Exception {
    try {
      DeleteLoadBalancerOptions deleteLoadBalancerOptions = new DeleteLoadBalancerOptions.Builder()
      .id("testString")
      .build();

      // Invoke operation
      Response<Void> response = service.deleteLoadBalancer(deleteLoadBalancerOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 403
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 403
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDeleteInstance() throws Exception {
    try {
      DeleteInstanceOptions deleteInstanceOptions = new DeleteInstanceOptions.Builder()
      .id("testString")
      .build();

      // Invoke operation
      Response<Void> response = service.deleteInstance(deleteInstanceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 403
      // 404
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      // 409
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
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

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 403
      // 404
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDeleteBareMetalServer() throws Exception {
    try {
      DeleteBareMetalServerOptions deleteBareMetalServerOptions = new DeleteBareMetalServerOptions.Builder()
      .id("testString")
      .build();

      // Invoke operation
      Response<Void> response = service.deleteBareMetalServer(deleteBareMetalServerOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      //
      //

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
