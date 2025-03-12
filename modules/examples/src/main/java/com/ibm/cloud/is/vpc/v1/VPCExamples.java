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

import com.ibm.cloud.is.vpc.v1.model.ActivateReservationOptions;
import com.ibm.cloud.is.vpc.v1.model.AddBareMetalServerNetworkInterfaceFloatingIpOptions;
import com.ibm.cloud.is.vpc.v1.model.AddEndpointGatewayIpOptions;
import com.ibm.cloud.is.vpc.v1.model.AddInstanceNetworkInterfaceFloatingIpOptions;
import com.ibm.cloud.is.vpc.v1.model.AddVpnGatewayConnectionsLocalCidrOptions;
import com.ibm.cloud.is.vpc.v1.model.AddVpnGatewayConnectionsPeerCidrOptions;
import com.ibm.cloud.is.vpc.v1.model.AddressPrefix;
import com.ibm.cloud.is.vpc.v1.model.AddressPrefixPatch;
import com.ibm.cloud.is.vpc.v1.model.BackupPoliciesPager;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicy;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyJob;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyJobsPager;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPatch;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlan;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlanCollection;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlanPatch;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlanRemoteRegionPolicyPrototype;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototype;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServer;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerConsoleAccessToken;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerDisk;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerDiskCollection;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerDiskPatch;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerInitialization;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerInitializationPrototype;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkInterface;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkInterfacePatch;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkInterfacesPager;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototype;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerPatch;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerPrimaryNetworkInterfacePrototype;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfile;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfilesPager;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerPrototypeBareMetalServerByNetworkInterface;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServersPager;
import com.ibm.cloud.is.vpc.v1.model.CertificateInstanceIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.CheckVpnGatewayConnectionsLocalCidrOptions;
import com.ibm.cloud.is.vpc.v1.model.CheckVpnGatewayConnectionsPeerCidrOptions;
import com.ibm.cloud.is.vpc.v1.model.CloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetwork;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkInterface;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkInterfacePatch;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkInterfacesPager;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkPatch;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkProfile;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkProfilesPager;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkSubnet;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkSubnetPatch;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkSubnetPrototypeClusterNetworkSubnetByTotalCountPrototype;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkSubnetReservedIP;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkSubnetReservedIPPatch;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkSubnetReservedIpsPager;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkSubnetsPager;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworksPager;
import com.ibm.cloud.is.vpc.v1.model.CreateBackupPolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateBackupPolicyPlanOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateBareMetalServerConsoleAccessTokenOptions;
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
import com.ibm.cloud.is.vpc.v1.model.CreateReservationOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateSecurityGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateSecurityGroupRuleOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateSecurityGroupTargetBindingOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateShareMountTargetOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateShareOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateSnapshotCloneOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateSnapshotOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateSubnetOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateSubnetReservedIpOptions;
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
import com.ibm.cloud.is.vpc.v1.model.DedicatedHost;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostDisk;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostDiskCollection;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostDiskPatch;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostGroup;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostGroupPatch;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostPatch;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostGroupsPager;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfile;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfilesPager;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostPrototypeDedicatedHostByGroup;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostsPager;
import com.ibm.cloud.is.vpc.v1.model.DefaultNetworkACL;
import com.ibm.cloud.is.vpc.v1.model.DefaultRoutingTable;
import com.ibm.cloud.is.vpc.v1.model.DefaultSecurityGroup;
import com.ibm.cloud.is.vpc.v1.model.DeleteBackupPolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteBackupPolicyPlanOptions;
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
import com.ibm.cloud.is.vpc.v1.model.DeleteReservationOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteSecurityGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteSecurityGroupRuleOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteSecurityGroupTargetBindingOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteShareMountTargetOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteShareOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteShareSourceOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteSnapshotCloneOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteSnapshotOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteSnapshotsOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteSubnetOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteSubnetReservedIpOptions;
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
import com.ibm.cloud.is.vpc.v1.model.DeprecateImageOptions;
import com.ibm.cloud.is.vpc.v1.model.DisconnectVpnClientOptions;
import com.ibm.cloud.is.vpc.v1.model.EncryptionKeyIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.EndpointGateway;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayIpsPager;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayPatch;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayReservedIP;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayReservedIPReservedIPIdentity;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayReservedIPReservedIPIdentityById;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderCloudServicePrototype;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewaysPager;
import com.ibm.cloud.is.vpc.v1.model.FailoverShareOptions;
import com.ibm.cloud.is.vpc.v1.model.FloatingIP;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPPatch;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPPrototypeFloatingIPByZone;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPUnpaginatedCollection;
import com.ibm.cloud.is.vpc.v1.model.FloatingIpsPager;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollector;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorPatch;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityById;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorsPager;
import com.ibm.cloud.is.vpc.v1.model.GetBackupPolicyJobOptions;
import com.ibm.cloud.is.vpc.v1.model.GetBackupPolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.GetBackupPolicyPlanOptions;
import com.ibm.cloud.is.vpc.v1.model.GetBareMetalServerDiskOptions;
import com.ibm.cloud.is.vpc.v1.model.GetBareMetalServerInitializationOptions;
import com.ibm.cloud.is.vpc.v1.model.GetBareMetalServerNetworkInterfaceFloatingIpOptions;
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
import com.ibm.cloud.is.vpc.v1.model.GetReservationOptions;
import com.ibm.cloud.is.vpc.v1.model.GetSecurityGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.GetSecurityGroupRuleOptions;
import com.ibm.cloud.is.vpc.v1.model.GetSecurityGroupTargetOptions;
import com.ibm.cloud.is.vpc.v1.model.GetShareMountTargetOptions;
import com.ibm.cloud.is.vpc.v1.model.GetShareOptions;
import com.ibm.cloud.is.vpc.v1.model.GetShareProfileOptions;
import com.ibm.cloud.is.vpc.v1.model.GetShareSourceOptions;
import com.ibm.cloud.is.vpc.v1.model.GetSnapshotCloneOptions;
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
import com.ibm.cloud.is.vpc.v1.model.IKEPolicyPatch;
import com.ibm.cloud.is.vpc.v1.model.IPsecPolicyConnectionCollection;
import com.ibm.cloud.is.vpc.v1.model.IPsecPolicy;
import com.ibm.cloud.is.vpc.v1.model.IPsecPolicyPatch;
import com.ibm.cloud.is.vpc.v1.model.IkePoliciesPager;
import com.ibm.cloud.is.vpc.v1.model.IKEPolicyConnectionCollection;
import com.ibm.cloud.is.vpc.v1.model.Image;
import com.ibm.cloud.is.vpc.v1.model.ImageExportJob;
import com.ibm.cloud.is.vpc.v1.model.ImageExportJobPatch;
import com.ibm.cloud.is.vpc.v1.model.ImageExportJobUnpaginatedCollection;
import com.ibm.cloud.is.vpc.v1.model.ImageFilePrototype;
import com.ibm.cloud.is.vpc.v1.model.ImageIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ImagePatch;
import com.ibm.cloud.is.vpc.v1.model.ImagePrototypeImageByFile;
import com.ibm.cloud.is.vpc.v1.model.ImagesPager;
import com.ibm.cloud.is.vpc.v1.model.Instance;
import com.ibm.cloud.is.vpc.v1.model.InstanceAction;
import com.ibm.cloud.is.vpc.v1.model.InstanceClusterNetworkAttachment;
import com.ibm.cloud.is.vpc.v1.model.InstanceClusterNetworkAttachmentPatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceInstanceClusterNetworkInterfacePrototypeInstanceClusterNetworkAttachment;
import com.ibm.cloud.is.vpc.v1.model.InstanceClusterNetworkAttachmentsPager;
import com.ibm.cloud.is.vpc.v1.model.InstanceConsoleAccessToken;
import com.ibm.cloud.is.vpc.v1.model.InstanceDisk;
import com.ibm.cloud.is.vpc.v1.model.InstanceDiskCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceDiskPatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroup;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManager;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerAction;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerActionPatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByGroup;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerActionsPager;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPoliciesPager;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPolicy;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPolicyPatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerScheduledActionGroupPrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagersPager;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupMembership;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupMembershipPatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupMembershipsPager;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupPatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupsPager;
import com.ibm.cloud.is.vpc.v1.model.InstanceInitialization;
import com.ibm.cloud.is.vpc.v1.model.InstanceNetworkInterfaceIpsPager;
import com.ibm.cloud.is.vpc.v1.model.InstancePatch;
import com.ibm.cloud.is.vpc.v1.model.InstancePlacementTargetPrototypeDedicatedHostIdentityDedicatedHostIdentityById;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfile;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.InstancePrototypeInstanceByImageInstanceByImageInstanceByNetworkInterface;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplate;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateIdentityById;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplatePatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkInterface;
import com.ibm.cloud.is.vpc.v1.model.InstancesPager;
import com.ibm.cloud.is.vpc.v1.model.IpsecPoliciesPager;
import com.ibm.cloud.is.vpc.v1.model.Key;
import com.ibm.cloud.is.vpc.v1.model.KeyIdentity;
import com.ibm.cloud.is.vpc.v1.model.KeyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.KeyPatch;
import com.ibm.cloud.is.vpc.v1.model.KeysPager;
import com.ibm.cloud.is.vpc.v1.model.LegacyCloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.ListBackupPoliciesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListBackupPolicyJobsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListBackupPolicyPlansOptions;
import com.ibm.cloud.is.vpc.v1.model.ListBareMetalServerDisksOptions;
import com.ibm.cloud.is.vpc.v1.model.ListBareMetalServerNetworkInterfaceFloatingIpsOptions;
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
import com.ibm.cloud.is.vpc.v1.model.ListReservationsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListSecurityGroupRulesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListSecurityGroupTargetsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListSecurityGroupsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListShareMountTargetsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListShareProfilesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListSharesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListSnapshotClonesOptions;
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
import com.ibm.cloud.is.vpc.v1.model.ListVpnGatewayConnectionsLocalCidrsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVpnGatewayConnectionsPeerCidrsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVpnGatewayConnectionsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVpnGatewaysOptions;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancer;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListener;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerCollection;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicy;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyCollection;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyRule;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyRuleCollection;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyRulePatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPool;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolCollection;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMember;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberCollection;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfile;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfilesPager;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerStatistics;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancersPager;
import com.ibm.cloud.is.vpc.v1.model.ListVpcDnsResolutionBindingsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVpnServerClientsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVpnServerRoutesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVpnServersOptions;
import com.ibm.cloud.is.vpc.v1.model.NetworkACL;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLIdentityById;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLPatch;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLPrototypeNetworkACLByRules;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRule;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleItem;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePatch;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePrototypeNetworkACLRuleProtocolICMPPrototype;
import com.ibm.cloud.is.vpc.v1.model.NetworkAclRulesPager;
import com.ibm.cloud.is.vpc.v1.model.NetworkAclsPager;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterface;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfacePatch;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfacePrototype;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceUnpaginatedCollection;
import com.ibm.cloud.is.vpc.v1.model.ObsoleteImageOptions;
import com.ibm.cloud.is.vpc.v1.model.OperatingSystem;
import com.ibm.cloud.is.vpc.v1.model.OperatingSystemIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.OperatingSystemsPager;
import com.ibm.cloud.is.vpc.v1.model.PlacementGroup;
import com.ibm.cloud.is.vpc.v1.model.PlacementGroupPatch;
import com.ibm.cloud.is.vpc.v1.model.PlacementGroupsPager;
import com.ibm.cloud.is.vpc.v1.model.PublicGateway;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayIdentityPublicGatewayIdentityById;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayPatch;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewaysPager;
import com.ibm.cloud.is.vpc.v1.model.Region;
import com.ibm.cloud.is.vpc.v1.model.RegionCollection;
import com.ibm.cloud.is.vpc.v1.model.RegionIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.RemoveBareMetalServerNetworkInterfaceFloatingIpOptions;
import com.ibm.cloud.is.vpc.v1.model.RemoveEndpointGatewayIpOptions;
import com.ibm.cloud.is.vpc.v1.model.RemoveInstanceNetworkInterfaceFloatingIpOptions;
import com.ibm.cloud.is.vpc.v1.model.RemoveVpnGatewayConnectionsLocalCidrOptions;
import com.ibm.cloud.is.vpc.v1.model.RemoveVpnGatewayConnectionsPeerCidrOptions;
import com.ibm.cloud.is.vpc.v1.model.ReplaceLoadBalancerPoolMembersOptions;
import com.ibm.cloud.is.vpc.v1.model.ReplaceSubnetNetworkAclOptions;
import com.ibm.cloud.is.vpc.v1.model.ReplaceSubnetRoutingTableOptions;
import com.ibm.cloud.is.vpc.v1.model.ReservedIP;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPPatch;
import com.ibm.cloud.is.vpc.v1.model.RestartBareMetalServerOptions;
import com.ibm.cloud.is.vpc.v1.model.Route;
import com.ibm.cloud.is.vpc.v1.model.RouteNextHopPrototypeRouteNextHopIPRouteNextHopIPUnicastIP;
import com.ibm.cloud.is.vpc.v1.model.RoutePatch;
import com.ibm.cloud.is.vpc.v1.model.RoutingTable;
import com.ibm.cloud.is.vpc.v1.model.RoutingTableIdentityById;
import com.ibm.cloud.is.vpc.v1.model.RoutingTablePatch;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroup;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupPatch;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRule;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleCollection;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRulePatch;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupTargetReference;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupTargetsPager;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupsPager;
import com.ibm.cloud.is.vpc.v1.model.SetSubnetPublicGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.Share;
import com.ibm.cloud.is.vpc.v1.model.ShareIdentity;
import com.ibm.cloud.is.vpc.v1.model.ShareIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ShareMountTarget;
import com.ibm.cloud.is.vpc.v1.model.ShareMountTargetPatch;
import com.ibm.cloud.is.vpc.v1.model.ShareMountTargetPrototypeShareMountTargetByAccessControlModeSecurityGroup;
import com.ibm.cloud.is.vpc.v1.model.ShareMountTargetVirtualNetworkInterfacePrototypeVirtualNetworkInterfacePrototypeShareMountTargetContext;
import com.ibm.cloud.is.vpc.v1.model.ShareMountTargetsPager;
import com.ibm.cloud.is.vpc.v1.model.SharePatch;
import com.ibm.cloud.is.vpc.v1.model.ShareProfile;
import com.ibm.cloud.is.vpc.v1.model.ShareProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.ShareProfilesPager;
import com.ibm.cloud.is.vpc.v1.model.SharePrototypeShareBySize;
import com.ibm.cloud.is.vpc.v1.model.SharePrototypeShareBySourceShare;
import com.ibm.cloud.is.vpc.v1.model.ShareReference;
import com.ibm.cloud.is.vpc.v1.model.SharesPager;
import com.ibm.cloud.is.vpc.v1.model.SnapshotClone;
import com.ibm.cloud.is.vpc.v1.model.SnapshotCloneCollection;
import com.ibm.cloud.is.vpc.v1.model.Snapshot;
import com.ibm.cloud.is.vpc.v1.model.SnapshotIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.SnapshotPatch;
import com.ibm.cloud.is.vpc.v1.model.SnapshotPrototypeSnapshotBySourceSnapshot;
import com.ibm.cloud.is.vpc.v1.model.SnapshotPrototypeSnapshotBySourceVolume;
import com.ibm.cloud.is.vpc.v1.model.SnapshotsPager;
import com.ibm.cloud.is.vpc.v1.model.StartBareMetalServerOptions;
import com.ibm.cloud.is.vpc.v1.model.StopBareMetalServerOptions;
import com.ibm.cloud.is.vpc.v1.model.Subnet;
import com.ibm.cloud.is.vpc.v1.model.SubnetIdentity;
import com.ibm.cloud.is.vpc.v1.model.SubnetIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SubnetPatch;
import com.ibm.cloud.is.vpc.v1.model.SubnetPrototypeSubnetByTotalCount;
import com.ibm.cloud.is.vpc.v1.model.SubnetReservedIpsPager;
import com.ibm.cloud.is.vpc.v1.model.SubnetsPager;
import com.ibm.cloud.is.vpc.v1.model.Reservation;
import com.ibm.cloud.is.vpc.v1.model.ReservationCapacityPrototype;
import com.ibm.cloud.is.vpc.v1.model.ReservationCommittedUsePrototype;
import com.ibm.cloud.is.vpc.v1.model.ReservationPatch;
import com.ibm.cloud.is.vpc.v1.model.ReservationProfilePrototype;
import com.ibm.cloud.is.vpc.v1.model.ReservationsPager;
import com.ibm.cloud.is.vpc.v1.model.UnsetSubnetPublicGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateBackupPolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateBackupPolicyPlanOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateBareMetalServerDiskOptions;
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
import com.ibm.cloud.is.vpc.v1.model.UpdateReservationOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateSecurityGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateSecurityGroupRuleOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateShareMountTargetOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateShareOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateSnapshotOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateSubnetOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateSubnetReservedIpOptions;
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
import com.ibm.cloud.is.vpc.v1.model.VPC;
import com.ibm.cloud.is.vpc.v1.model.VPCIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VPCPatch;
import com.ibm.cloud.is.vpc.v1.model.VPNGateway;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnection;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionCollection;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionCIDRs;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPatch;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionStaticRouteModePeerPrototypeVPNGatewayConnectionPeerByAddress;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototype;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayPatch;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayPrototypeVPNGatewayRouteModePrototype;
import com.ibm.cloud.is.vpc.v1.model.VPNServer;
import com.ibm.cloud.is.vpc.v1.model.VPNServerAuthenticationByUsernameIdProviderByIAM;
import com.ibm.cloud.is.vpc.v1.model.VPNServerAuthenticationPrototype;
import com.ibm.cloud.is.vpc.v1.model.VPNServerAuthenticationPrototypeVPNServerAuthenticationByUsernamePrototype;
import com.ibm.cloud.is.vpc.v1.model.VPNServerClient;
import com.ibm.cloud.is.vpc.v1.model.VPNServerPatch;
import com.ibm.cloud.is.vpc.v1.model.VPNServerRoute;
import com.ibm.cloud.is.vpc.v1.model.VPNServerRoutePatch;
import com.ibm.cloud.is.vpc.v1.model.Volume;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachment;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentCollection;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPatch;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeInstanceByImageContext;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototype;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeVolumeVolumeIdentityVolumeIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeVolumeVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeByCapacity;
import com.ibm.cloud.is.vpc.v1.model.VolumeIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VolumePatch;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfile;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfilesPager;
import com.ibm.cloud.is.vpc.v1.model.VolumePrototypeInstanceByImageContext;
import com.ibm.cloud.is.vpc.v1.model.VolumePrototypeVolumeByCapacity;
import com.ibm.cloud.is.vpc.v1.model.VolumesPager;
import com.ibm.cloud.is.vpc.v1.model.VpcAddressPrefixesPager;
import com.ibm.cloud.is.vpc.v1.model.VPCDNSPrototype;
import com.ibm.cloud.is.vpc.v1.model.VPCDNSResolutionBinding;
import com.ibm.cloud.is.vpc.v1.model.VPCDNSResolutionBindingPatch;
import com.ibm.cloud.is.vpc.v1.model.VpcDnsResolutionBindingsPager;
import com.ibm.cloud.is.vpc.v1.model.VpcRoutesPager;
import com.ibm.cloud.is.vpc.v1.model.VpcRoutingTableRoutesPager;
import com.ibm.cloud.is.vpc.v1.model.VpcRoutingTablesPager;
import com.ibm.cloud.is.vpc.v1.model.VpcsPager;
import com.ibm.cloud.is.vpc.v1.model.VpnGatewaysPager;
import com.ibm.cloud.is.vpc.v1.model.VpnServerClientsPager;
import com.ibm.cloud.is.vpc.v1.model.VpnServerRoutesPager;
import com.ibm.cloud.is.vpc.v1.model.VpnServersPager;
import com.ibm.cloud.is.vpc.v1.model.Zone;
import com.ibm.cloud.is.vpc.v1.model.ZoneCollection;
import com.ibm.cloud.is.vpc.v1.model.ZoneIdentityByName;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


//
// This file provides an example of how to use the vpc service.
//
// The following configuration properties are assumed to be defined:
// VPC_URL=<service base url>
// VPC_AUTH_TYPE=iam
// VPC_APIKEY=<IAM apikey>
// VPC_AUTH_URL=<IAM token service base URL - omit this if using the production environment>
//
// These configuration properties can be exported as environment variables, or stored
// in a configuration file and then:
// export IBM_CREDENTIALS_FILE=<name of configuration file>
//
public class VPCExamples {
  private static final Logger logger = LoggerFactory.getLogger(VPCExamples.class);
  static String crn = "crn:v1:bluemix:public:cloudant:us-south:a/123456:3527280b-9327-4411-8020-591092e60353::";
  static String certificateCrn = "crn:v1:bluemix:public:secrets-manager:us-south:a/123456:36fa422d-080d-4d83-8d2d-86851b4001df:secret:2e786aab-42fa-63ed-14f8-d66d552f4dd5";
  static String cosBucketName = "bucket-27200-lwx4cfvcue";
  static String cosBucketUrl = "cos://us-south/my-bucket/my-image.qcow2";
  static String clusterNetworkId;
  static String clusterNetworkSubnetId;
  static String clusterNetworkSubnetReservedIpId;
  static String clusterNetworkInterfaceId;
  static String clusterNetworkProfileName;
  static String instanceClusterNetworkAttachmentId;
  static String dedicatedHostId;
  static String dedicatedHostDiskId;
  static String dedicatedHostGroupId;
  static String dedicatedHostProfileClassName = "mx2";
  static String dedicatedHostProfileFamilyName = "balanced";
  static String dedicatedHostProfileName;
  static String floatingIpId;
  static String vpcId;
  static String secondVpcId;
  static String routingTableId;
  static String routingTableRouteId;
  static String subnetId;
  static String reservedIpId;
  static String operatingSystemName;
  static String keyId;
  static String addressPrefixId;
  static String imageId;
  static String imageExportJobId;
  static String volumeId;
  static String endpointGatewayId;
  static String endpointGatewayIpId;
  static String flowLogCollectorId;
  static String ikePolicyId;
  static String iPsecPolicyId;
  static String instanceId;
  static String instanceDiskId;
  static String instanceProfileName;
  static String instanceNetworkInterfaceId;
  static String instanceNetworkInterfaceReservedIp;
  static String instanceVolumeAttachmentId;
  static String instanceGroupId;
  static String instanceGroupManagerId;
  static String instanceGroupManagerPolicyId;
  static String instanceGroupManagerActionId;
  static String instanceGroupManagerMembershipId;
  static String instanceTemplateId;
  static String loadBalancerProfileName;
  static String loadBalancerListenerId;
  static String loadBalancerPoolId;
  static String loadBalancerPoolMemberId;
  static String loadBalancerListenerPolicyId;
  static String loadBalancerListenerPolicyRuleId;
  static String loadBalancerId;
  static String networkAclId;
  static String networkAclRuleId;
  static String placementGroupId;
  static String publicGatewayId;
  static String volumeProfileName;
  static String vpcRouteId;
  static String vpcdnsResolutionBindingId;
  static String vpnGatewayId;
  static String vpnGatewayConnectionId;
  static String regionName = "us-east";
  static String crossRegionName = "us-south";
  static String reservationId;
  static String securityGroupId;
  static String securityGroupRuleId;
  static String securityGroupTargetId;
  static String snapshotId;
  static String snapshotCopyCRN;
  static String snapshotCopyId;
  static String sourceVolume;
  static String shareId;
  static String shareProfileName;
  static String shareReplicaId;
  static String ifMatchShare;
  static String ifMatchShareReplica;
  static String shareMountTargetId;
  static String targetId;
  static String zoneName = "us-east-1";
  static String bareMetalServerProfileName;
  static String bareMetalServerId;
  static String bareMetalServerDiskId;
  static String bareMetalServerNetworkInterfaceId;
  static String bareMetalServerNetworkInterfaceReservedIp;
  static String backupPolicyId;
  static String backupPolicyJobId;
  static String backupPolicyPlanId;
  static String backupPolicyRemoteCopyPlanId;
  static String ifMatchBackupPolicy;
  static String ifMatchBackupPolicyPlan;
  static String ifMatchBackupPolicyRemoteCopyPlan;
  static String ifMatchVpnServer;
  static String ifMatchSnapshot;
  static String ifMatchSnapshotCopy;
  static String vpnServerId;
  static String vpnServerClientId;
  static String vpnServerRouteId;

  protected VPCExamples() { }

  @SuppressWarnings("checkstyle:methodlength")
  public static void main(String[] args) throws Exception {
    Vpc vpcService = Vpc.newInstance();

    // Load up our test-specific config properties.
    Map<String, String> config = CredentialUtils.getServiceProperties(Vpc.DEFAULT_SERVICE_NAME);

    try {
      System.out.println("listVpcs() result:");
      // begin-list_vpcs
      ListVpcsOptions listVpcsOptions = new ListVpcsOptions.Builder()
        .classicAccess(true)
        .limit(Long.valueOf(10))
        .build();

      VpcsPager pager = new VpcsPager(vpcService, listVpcsOptions);
      List<VPC> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<VPC> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_vpcs
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createVpc() result:");
      // begin-create_vpc
      CreateVpcOptions createVpcOptions = new CreateVpcOptions.Builder()
        .name("my-vpc")
        .build();

      Response<VPC> response = vpcService.createVpc(createVpcOptions).execute();
      VPC vpc = response.getResult();

      // end-create_vpc
      vpcId = vpc.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getVpc() result:");
      // begin-get_vpc
      GetVpcOptions getVpcOptions = new GetVpcOptions.Builder()
        .id(vpcId)
        .build();

      Response<VPC> response = vpcService.getVpc(getVpcOptions).execute();
      VPC vpc = response.getResult();

      // end-get_vpc
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateVpc() result:");
      // begin-update_vpc
      VPCPatch vpcPatchModel = new VPCPatch.Builder()
        .name("my-vpc-update")
        .build();
      Map<String, Object> vpcPatchModelAsPatch = vpcPatchModel.asPatch();
      UpdateVpcOptions updateVpcOptions = new UpdateVpcOptions.Builder()
        .id(vpcId)
        .vpcPatch(vpcPatchModelAsPatch)
        .build();

      Response<VPC> response = vpcService.updateVpc(updateVpcOptions).execute();
      VPC vpc = response.getResult();

      // end-update_vpc
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getVpcDefaultNetworkAcl() result:");
      // begin-get_vpc_default_network_acl
      GetVpcDefaultNetworkAclOptions getVpcDefaultNetworkAclOptions = new GetVpcDefaultNetworkAclOptions.Builder()
        .id(vpcId)
        .build();

      Response<DefaultNetworkACL> response = vpcService.getVpcDefaultNetworkAcl(getVpcDefaultNetworkAclOptions).execute();
      DefaultNetworkACL defaultNetworkAcl = response.getResult();

      // end-get_vpc_default_network_acl
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getVpcDefaultRoutingTable() result:");
      // begin-get_vpc_default_routing_table
      GetVpcDefaultRoutingTableOptions getVpcDefaultRoutingTableOptions = new GetVpcDefaultRoutingTableOptions.Builder()
        .id(vpcId)
        .build();

      Response<DefaultRoutingTable> response = vpcService.getVpcDefaultRoutingTable(getVpcDefaultRoutingTableOptions).execute();
      DefaultRoutingTable defaultRoutingTable = response.getResult();

      // end-get_vpc_default_routing_table
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getVpcDefaultSecurityGroup() result:");
      // begin-get_vpc_default_security_group
      GetVpcDefaultSecurityGroupOptions getVpcDefaultSecurityGroupOptions = new GetVpcDefaultSecurityGroupOptions.Builder()
        .id(vpcId)
        .build();

      Response<DefaultSecurityGroup> response = vpcService.getVpcDefaultSecurityGroup(getVpcDefaultSecurityGroupOptions).execute();
      DefaultSecurityGroup defaultSecurityGroup = response.getResult();

      // end-get_vpc_default_security_group
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listVpcAddressPrefixes() result:");
      // begin-list_vpc_address_prefixes
      ListVpcAddressPrefixesOptions listVpcAddressPrefixesOptions = new ListVpcAddressPrefixesOptions.Builder()
        .vpcId(vpcId)
        .limit(Long.valueOf(10))
        .build();

      VpcAddressPrefixesPager pager = new VpcAddressPrefixesPager(vpcService, listVpcAddressPrefixesOptions);
      List<AddressPrefix> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<AddressPrefix> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_vpc_address_prefixes
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createVpcAddressPrefix() result:");
      // begin-create_vpc_address_prefix
      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
        .name(zoneName)
        .build();
      CreateVpcAddressPrefixOptions createVpcAddressPrefixOptions = new CreateVpcAddressPrefixOptions.Builder()
        .vpcId(vpcId)
        .cidr("10.0.0.0/24")
        .name("my-vpc-address-prefix")
        .zone(zoneIdentityModel)
        .build();

      Response<AddressPrefix> response = vpcService.createVpcAddressPrefix(createVpcAddressPrefixOptions).execute();
      AddressPrefix addressPrefix = response.getResult();

      // end-create_vpc_address_prefix
      addressPrefixId = addressPrefix.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getVpcAddressPrefix() result:");
      // begin-get_vpc_address_prefix
      GetVpcAddressPrefixOptions getVpcAddressPrefixOptions = new GetVpcAddressPrefixOptions.Builder()
        .vpcId(vpcId)
        .id(addressPrefixId)
        .build();

      Response<AddressPrefix> response = vpcService.getVpcAddressPrefix(getVpcAddressPrefixOptions).execute();
      AddressPrefix addressPrefix = response.getResult();

      // end-get_vpc_address_prefix
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateVpcAddressPrefix() result:");
      // begin-update_vpc_address_prefix
      AddressPrefixPatch addressPrefixPatchModel = new AddressPrefixPatch.Builder()
        .name("my-vpc-address-prefix-update")
        .build();
      Map<String, Object> addressPrefixPatchModelAsPatch = addressPrefixPatchModel.asPatch();
      UpdateVpcAddressPrefixOptions updateVpcAddressPrefixOptions = new UpdateVpcAddressPrefixOptions.Builder()
        .vpcId(vpcId)
        .id(addressPrefixId)
        .addressPrefixPatch(addressPrefixPatchModelAsPatch)
        .build();

      Response<AddressPrefix> response = vpcService.updateVpcAddressPrefix(updateVpcAddressPrefixOptions).execute();
      AddressPrefix addressPrefix = response.getResult();

      // end-update_vpc_address_prefix
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createVpcDnsResolutionBinding() result:");
      VPCDNSPrototype vpcdnsPrototype = new VPCDNSPrototype.Builder()
        .enableHub(true)
        .build();
      CreateVpcOptions createVpcOptions = new CreateVpcOptions.Builder()
        .name("my-vpc-second")
        .dns(vpcdnsPrototype)
        .build();

      Response<VPC> vpcresponse = vpcService.createVpc(createVpcOptions).execute();
      VPC vpc = vpcresponse.getResult();
      secondVpcId = vpc.getId();
      // begin-create_vpc_dns_resolution_binding
      VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
        .id(secondVpcId)
        .build();
      CreateVpcDnsResolutionBindingOptions createVpcDnsResolutionBindingOptions = new CreateVpcDnsResolutionBindingOptions.Builder()
        .vpcId(vpcId)
        .name("vpc-dns-resolution-binding")
        .vpc(vpcIdentityModel)
        .build();

      Response<VPCDNSResolutionBinding> response = vpcService.createVpcDnsResolutionBinding(createVpcDnsResolutionBindingOptions).execute();
      VPCDNSResolutionBinding vpcdnsResolutionBinding = response.getResult();

      // end-create_vpc_dns_resolution_binding
      vpcdnsResolutionBindingId = vpcdnsResolutionBinding.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listVpcDnsResolutionBindings() result:");
      // begin-list_vpc_dns_resolution_bindings
      ListVpcDnsResolutionBindingsOptions listVpcDnsResolutionBindingsOptions = new ListVpcDnsResolutionBindingsOptions.Builder()
        .vpcId(secondVpcId)
        .build();

      VpcDnsResolutionBindingsPager pager = new VpcDnsResolutionBindingsPager(vpcService, listVpcDnsResolutionBindingsOptions);
      List<VPCDNSResolutionBinding> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<VPCDNSResolutionBinding> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_vpc_dns_resolution_bindings
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getVpcDnsResolutionBinding() result:");
      // begin-get_vpc_dns_resolution_binding
      GetVpcDnsResolutionBindingOptions getVpcDnsResolutionBindingOptions = new GetVpcDnsResolutionBindingOptions.Builder()
        .vpcId(vpcId)
        .id(vpcdnsResolutionBindingId)
        .build();

      Response<VPCDNSResolutionBinding> response = vpcService.getVpcDnsResolutionBinding(getVpcDnsResolutionBindingOptions).execute();
      VPCDNSResolutionBinding vpcdnsResolutionBinding = response.getResult();

      // end-get_vpc_dns_resolution_binding
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateVpcDnsResolutionBinding() result:");
      // begin-update_vpc_dns_resolution_binding
      VPCDNSResolutionBindingPatch vpcdnsResolutionBindingPatchModel = new VPCDNSResolutionBindingPatch.Builder()
        .name("vpc-dns-resolution-binding-updated")
        .build();
      Map<String, Object> vpcdnsResolutionBindingPatchModelAsPatch = vpcdnsResolutionBindingPatchModel.asPatch();
      UpdateVpcDnsResolutionBindingOptions updateVpcDnsResolutionBindingOptions = new UpdateVpcDnsResolutionBindingOptions.Builder()
        .vpcId(vpcId)
        .id(vpcdnsResolutionBindingId)
        .vpcdnsResolutionBindingPatch(vpcdnsResolutionBindingPatchModelAsPatch)
        .build();

      Response<VPCDNSResolutionBinding> response = vpcService.updateVpcDnsResolutionBinding(updateVpcDnsResolutionBindingOptions).execute();
      VPCDNSResolutionBinding vpcdnsResolutionBinding = response.getResult();

      // end-update_vpc_dns_resolution_binding
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listVpcRoutes() result:");
      // begin-list_vpc_routes
      ListVpcRoutesOptions listVpcRoutesOptions = new ListVpcRoutesOptions.Builder()
        .vpcId(vpcId)
        .limit(Long.valueOf(10))
        .build();

      VpcRoutesPager pager = new VpcRoutesPager(vpcService, listVpcRoutesOptions);
      List<Route> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<Route> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_vpc_routes
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createVpcRoute() result:");
      // begin-create_vpc_route
      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
        .name(zoneName)
        .build();
        RouteNextHopPrototypeRouteNextHopIPRouteNextHopIPUnicastIP routePrototypeNextHopRouteNextHopPrototypeRouteNextHopIP = new RouteNextHopPrototypeRouteNextHopIPRouteNextHopIPUnicastIP.Builder()
        .address("192.168.3.4")
        .build();
      CreateVpcRouteOptions createVpcRouteOptions = new CreateVpcRouteOptions.Builder()
        .vpcId(vpcId)
        .name("my-vpc-route")
        .action("delegate_vpc")
        .destination("192.168.3.0/24")
        .nextHop(routePrototypeNextHopRouteNextHopPrototypeRouteNextHopIP)
        .zone(zoneIdentityModel)
        .build();
      Response<Route> response = vpcService.createVpcRoute(createVpcRouteOptions).execute();
      Route route = response.getResult();
      // end-create_vpc_route
      vpcRouteId = route.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getVpcRoute() result:");
      // begin-get_vpc_route
      GetVpcRouteOptions getVpcRouteOptions = new GetVpcRouteOptions.Builder()
        .vpcId(vpcId)
        .id(vpcRouteId)
        .build();

      Response<Route> response = vpcService.getVpcRoute(getVpcRouteOptions).execute();
      Route route = response.getResult();
      // end-get_vpc_route
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateVpcRoute() result:");
      // begin-update_vpc_route
      RoutePatch routePatchModel = new RoutePatch.Builder()
        .name("my-vpc-route-update")
        .build();
      Map<String, Object> routePatchModelAsPatch = routePatchModel.asPatch();
      UpdateVpcRouteOptions updateVpcRouteOptions = new UpdateVpcRouteOptions.Builder()
        .vpcId(vpcId)
        .id(vpcRouteId)
        .routePatch(routePatchModelAsPatch)
        .build();

      Response<Route> response = vpcService.updateVpcRoute(updateVpcRouteOptions).execute();
      Route route = response.getResult();
      // end-update_vpc_route
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listVpcRoutingTables() result:");
      // begin-list_vpc_routing_tables
      ListVpcRoutingTablesOptions listVpcRoutingTablesOptions = new ListVpcRoutingTablesOptions.Builder()
        .vpcId(vpcId)
        .limit(Long.valueOf(10))
        .build();

      VpcRoutingTablesPager pager = new VpcRoutingTablesPager(vpcService, listVpcRoutingTablesOptions);
      List<RoutingTable> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<RoutingTable> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_vpc_routing_tables
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createVpcRoutingTable() result:");
      // begin-create_vpc_routing_table
      CreateVpcRoutingTableOptions createVpcRoutingTableOptions = new CreateVpcRoutingTableOptions.Builder()
        .vpcId(vpcId)
        .name("my-vpc-routing-table")
        .build();

      Response<RoutingTable> response = vpcService.createVpcRoutingTable(createVpcRoutingTableOptions).execute();
      RoutingTable routingTable = response.getResult();

      // end-create_vpc_routing_table
      routingTableId = routingTable.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getVpcRoutingTable() result:");
      // begin-get_vpc_routing_table
      GetVpcRoutingTableOptions getVpcRoutingTableOptions = new GetVpcRoutingTableOptions.Builder()
        .vpcId(vpcId)
        .id(routingTableId)
        .build();

      Response<RoutingTable> response = vpcService.getVpcRoutingTable(getVpcRoutingTableOptions).execute();
      RoutingTable routingTable = response.getResult();

      // end-get_vpc_routing_table
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateVpcRoutingTable() result:");
      // begin-update_vpc_routing_table
      RoutingTablePatch routingTablePatchModel = new RoutingTablePatch.Builder()
        .name("my-vpc-routing-table-update")
        .build();
      Map<String, Object> routingTablePatchModelAsPatch = routingTablePatchModel.asPatch();
      UpdateVpcRoutingTableOptions updateVpcRoutingTableOptions = new UpdateVpcRoutingTableOptions.Builder()
        .vpcId(vpcId)
        .id(routingTableId)
        .routingTablePatch(routingTablePatchModelAsPatch)
        .build();

      Response<RoutingTable> response = vpcService.updateVpcRoutingTable(updateVpcRoutingTableOptions).execute();
      RoutingTable routingTable = response.getResult();

      // end-update_vpc_routing_table
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listVpcRoutingTableRoutes() result:");
      // begin-list_vpc_routing_table_routes
      ListVpcRoutingTableRoutesOptions listVpcRoutingTableRoutesOptions = new ListVpcRoutingTableRoutesOptions.Builder()
        .vpcId(vpcId)
        .routingTableId(routingTableId)
        .limit(Long.valueOf(10))
        .build();

      VpcRoutingTableRoutesPager pager = new VpcRoutingTableRoutesPager(vpcService, listVpcRoutingTableRoutesOptions);
      List<Route> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<Route> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_vpc_routing_table_routes
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createVpcRoutingTableRoute() result:");
      // begin-create_vpc_routing_table_route
      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
        .name(zoneName)
        .build();
      CreateVpcRoutingTableRouteOptions createVpcRoutingTableRouteOptions = new CreateVpcRoutingTableRouteOptions.Builder()
        .vpcId(vpcId)
        .name("my-vpc-routing-table-route")
        .routingTableId(routingTableId)
        .destination("192.168.3.0/24")
        .action("delegate_vpc")
        .zone(zoneIdentityModel)
        .build();

      Response<Route> response = vpcService.createVpcRoutingTableRoute(createVpcRoutingTableRouteOptions).execute();
      Route route = response.getResult();

      // end-create_vpc_routing_table_route
      routingTableRouteId = route.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getVpcRoutingTableRoute() result:");
      // begin-get_vpc_routing_table_route
      GetVpcRoutingTableRouteOptions getVpcRoutingTableRouteOptions = new GetVpcRoutingTableRouteOptions.Builder()
        .vpcId(vpcId)
        .routingTableId(routingTableId)
        .id(routingTableRouteId)
        .build();

      Response<Route> response = vpcService.getVpcRoutingTableRoute(getVpcRoutingTableRouteOptions).execute();
      Route route = response.getResult();

      // end-get_vpc_routing_table_route
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateVpcRoutingTableRoute() result:");
      // begin-update_vpc_routing_table_route
      RoutePatch routePatchModel = new RoutePatch.Builder()
        .name("my-routing-table-route-update")
        .build();
      Map<String, Object> routePatchModelAsPatch = routePatchModel.asPatch();
      UpdateVpcRoutingTableRouteOptions updateVpcRoutingTableRouteOptions = new UpdateVpcRoutingTableRouteOptions.Builder()
        .vpcId(vpcId)
        .routingTableId(routingTableId)
        .id(routingTableRouteId)
        .routePatch(routePatchModelAsPatch)
        .build();

      Response<Route> response = vpcService.updateVpcRoutingTableRoute(updateVpcRoutingTableRouteOptions).execute();
      Route route = response.getResult();

      // end-update_vpc_routing_table_route
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listSubnets() result:");
      // begin-list_subnets
      ListSubnetsOptions listSubnetsOptions = new ListSubnetsOptions.Builder()
        .limit(Long.valueOf(10))
        .build();

      SubnetsPager pager = new SubnetsPager(vpcService, listSubnetsOptions);
      List<Subnet> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<Subnet> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_subnets
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createSubnet() result:");
      // begin-create_subnet
      VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
        .id(vpcId)
        .build();
      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
        .name(zoneName)
        .build();
      SubnetPrototypeSubnetByTotalCount subnetPrototypeModel = new SubnetPrototypeSubnetByTotalCount.Builder()
        .vpc(vpcIdentityModel)
        .name("my-subnet")
        .totalIpv4AddressCount(Long.valueOf("256"))
        .zone(zoneIdentityModel)
        .build();
      CreateSubnetOptions createSubnetOptions = new CreateSubnetOptions.Builder()
        .subnetPrototype(subnetPrototypeModel)
        .build();

      Response<Subnet> response = vpcService.createSubnet(createSubnetOptions).execute();
      Subnet subnet = response.getResult();

      // end-create_subnet
      subnetId = subnet.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getSubnet() result:");
      // begin-get_subnet
      GetSubnetOptions getSubnetOptions = new GetSubnetOptions.Builder()
        .id(subnetId)
        .build();

      Response<Subnet> response = vpcService.getSubnet(getSubnetOptions).execute();
      Subnet subnet = response.getResult();

      // end-get_subnet
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateSubnet() result:");
      // begin-update_subnet
      SubnetPatch subnetPatchModel = new SubnetPatch.Builder()
        .name("my-subnet-update")
        .build();
      Map<String, Object> subnetPatchModelAsPatch = subnetPatchModel.asPatch();
      UpdateSubnetOptions updateSubnetOptions = new UpdateSubnetOptions.Builder()
        .id(subnetId)
        .subnetPatch(subnetPatchModelAsPatch)
        .build();

      Response<Subnet> response = vpcService.updateSubnet(updateSubnetOptions).execute();
      Subnet subnet = response.getResult();

      // end-update_subnet
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getSubnetNetworkAcl() result:");
      // begin-get_subnet_network_acl
      GetSubnetNetworkAclOptions getSubnetNetworkAclOptions = new GetSubnetNetworkAclOptions.Builder()
        .id(subnetId)
        .build();

      Response<NetworkACL> response = vpcService.getSubnetNetworkAcl(getSubnetNetworkAclOptions).execute();
      NetworkACL networkAcl = response.getResult();

      // end-get_subnet_network_acl
      networkAclId = networkAcl.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("replaceSubnetNetworkAcl() result:");
      // begin-replace_subnet_network_acl
      NetworkACLIdentityById networkAclIdentityModel = new NetworkACLIdentityById.Builder()
        .id(networkAclId)
        .build();
      ReplaceSubnetNetworkAclOptions replaceSubnetNetworkAclOptions = new ReplaceSubnetNetworkAclOptions.Builder()
        .id(subnetId)
        .networkAclIdentity(networkAclIdentityModel)
        .build();

      Response<NetworkACL> response = vpcService.replaceSubnetNetworkAcl(replaceSubnetNetworkAclOptions).execute();
      NetworkACL networkAcl = response.getResult();

      // end-replace_subnet_network_acl
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createPublicGateway() result:");
      // begin-create_public_gateway
      VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
              .id(vpcId)
              .build();
      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
              .name(zoneName)
              .build();
      CreatePublicGatewayOptions createPublicGatewayOptions = new CreatePublicGatewayOptions.Builder()
              .name("my-public-gateway")
              .vpc(vpcIdentityModel)
              .zone(zoneIdentityModel)
              .build();

      Response<PublicGateway> response = vpcService.createPublicGateway(createPublicGatewayOptions).execute();
      PublicGateway publicGateway = response.getResult();

      // end-create_public_gateway
      publicGatewayId = publicGateway.getId();
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getPublicGateway() result:");
      // begin-get_public_gateway
      GetPublicGatewayOptions getPublicGatewayOptions = new GetPublicGatewayOptions.Builder()
              .id(publicGatewayId)
              .build();

      Response<PublicGateway> response = vpcService.getPublicGateway(getPublicGatewayOptions).execute();
      PublicGateway publicGateway = response.getResult();

      // end-get_public_gateway
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updatePublicGateway() result:");
      // begin-update_public_gateway
      PublicGatewayPatch publicGatewayPatchModel = new PublicGatewayPatch.Builder()
              .name("my-public-gateway-update")
              .build();
      Map<String, Object> publicGatewayPatchModelAsPatch = publicGatewayPatchModel.asPatch();
      UpdatePublicGatewayOptions updatePublicGatewayOptions = new UpdatePublicGatewayOptions.Builder()
              .id(publicGatewayId)
              .publicGatewayPatch(publicGatewayPatchModelAsPatch)
              .build();

      Response<PublicGateway> response = vpcService.updatePublicGateway(updatePublicGatewayOptions).execute();
      PublicGateway publicGateway = response.getResult();

      // end-update_public_gateway
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("setSubnetPublicGateway() result:");
      // begin-set_subnet_public_gateway
      PublicGatewayIdentityPublicGatewayIdentityById publicGatewayIdentityModel = new PublicGatewayIdentityPublicGatewayIdentityById.Builder()
        .id(publicGatewayId)
        .build();
      SetSubnetPublicGatewayOptions setSubnetPublicGatewayOptions = new SetSubnetPublicGatewayOptions.Builder()
        .id(subnetId)
        .publicGatewayIdentity(publicGatewayIdentityModel)
        .build();

      Response<PublicGateway> response = vpcService.setSubnetPublicGateway(setSubnetPublicGatewayOptions).execute();
      PublicGateway publicGateway = response.getResult();

      // end-set_subnet_public_gateway
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getSubnetPublicGateway() result:");
      // begin-get_subnet_public_gateway
      GetSubnetPublicGatewayOptions getSubnetPublicGatewayOptions = new GetSubnetPublicGatewayOptions.Builder()
              .id(subnetId)
              .build();

      Response<PublicGateway> response = vpcService.getSubnetPublicGateway(getSubnetPublicGatewayOptions).execute();
      PublicGateway publicGateway = response.getResult();

      // end-get_subnet_public_gateway
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getSubnetRoutingTable() result:");
      // begin-get_subnet_routing_table
      GetSubnetRoutingTableOptions getSubnetRoutingTableOptions = new GetSubnetRoutingTableOptions.Builder()
        .id(subnetId)
        .build();

      Response<RoutingTable> response = vpcService.getSubnetRoutingTable(getSubnetRoutingTableOptions).execute();
      RoutingTable routingTable = response.getResult();

      // end-get_subnet_routing_table
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("replaceSubnetRoutingTable() result:");
      // begin-replace_subnet_routing_table
      RoutingTableIdentityById routingTableIdentityModel = new RoutingTableIdentityById.Builder()
        .id(routingTableId)
        .build();
      ReplaceSubnetRoutingTableOptions replaceSubnetRoutingTableOptions = new ReplaceSubnetRoutingTableOptions.Builder()
        .id(subnetId)
        .routingTableIdentity(routingTableIdentityModel)
        .build();

      Response<RoutingTable> response = vpcService.replaceSubnetRoutingTable(replaceSubnetRoutingTableOptions).execute();
      RoutingTable routingTable = response.getResult();

      // end-replace_subnet_routing_table
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listSubnetReservedIps() result:");
      // begin-list_subnet_reserved_ips
      ListSubnetReservedIpsOptions listSubnetReservedIpsOptions = new ListSubnetReservedIpsOptions.Builder()
        .subnetId(subnetId)
        .sort("name")
        .limit(Long.valueOf(10))
        .build();

      SubnetReservedIpsPager pager = new SubnetReservedIpsPager(vpcService, listSubnetReservedIpsOptions);
      List<ReservedIP> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<ReservedIP> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_subnet_reserved_ips
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createSubnetReservedIp() result:");
      // begin-create_subnet_reserved_ip
      CreateSubnetReservedIpOptions createSubnetReservedIpOptions = new CreateSubnetReservedIpOptions.Builder()
        .name("my-reserved-ip")
        .subnetId(subnetId)
        .build();

      Response<ReservedIP> response = vpcService.createSubnetReservedIp(createSubnetReservedIpOptions).execute();
      ReservedIP reservedIp = response.getResult();

      // end-create_subnet_reserved_ip
      reservedIpId = reservedIp.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getSubnetReservedIp() result:");
      // begin-get_subnet_reserved_ip
      GetSubnetReservedIpOptions getSubnetReservedIpOptions = new GetSubnetReservedIpOptions.Builder()
        .subnetId(subnetId)
        .id(reservedIpId)
        .build();

      Response<ReservedIP> response = vpcService.getSubnetReservedIp(getSubnetReservedIpOptions).execute();
      ReservedIP reservedIp = response.getResult();

      // end-get_subnet_reserved_ip
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateSubnetReservedIp() result:");
      // begin-update_subnet_reserved_ip
      ReservedIPPatch reservedIpPatchModel = new ReservedIPPatch.Builder()
        .name("my-reserved-ip-update")
        .build();
      Map<String, Object> reservedIpPatchModelAsPatch = reservedIpPatchModel.asPatch();
      UpdateSubnetReservedIpOptions updateSubnetReservedIpOptions = new UpdateSubnetReservedIpOptions.Builder()
        .subnetId(subnetId)
        .id(reservedIpId)
        .reservedIpPatch(reservedIpPatchModelAsPatch)
        .build();

      Response<ReservedIP> response = vpcService.updateSubnetReservedIp(updateSubnetReservedIpOptions).execute();
      ReservedIP reservedIp = response.getResult();

      // end-update_subnet_reserved_ip
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listOperatingSystems() result:");
      // begin-list_operating_systems
      ListOperatingSystemsOptions listOperatingSystemsOptions = new ListOperatingSystemsOptions.Builder()
        .limit(Long.valueOf(10))
        .build();

      OperatingSystemsPager pager = new OperatingSystemsPager(vpcService, listOperatingSystemsOptions);
      List<OperatingSystem> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<OperatingSystem> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_operating_systems
      operatingSystemName = allResults.get(0).getName();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getOperatingSystem() result:");
      // begin-get_operating_system
      GetOperatingSystemOptions getOperatingSystemOptions = new GetOperatingSystemOptions.Builder()
        .name(operatingSystemName)
        .build();

      Response<OperatingSystem> response = vpcService.getOperatingSystem(getOperatingSystemOptions).execute();
      OperatingSystem operatingSystem = response.getResult();

      // end-get_operating_system
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listImages() result:");
      // begin-list_images
      ListImagesOptions listImagesOptions = new ListImagesOptions.Builder()
        .limit(Long.valueOf(10))
        .build();

      ImagesPager pager = new ImagesPager(vpcService, listImagesOptions);
      List<Image> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<Image> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_images
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createImage() result:");
      // begin-create_image
      ImageFilePrototype imageFilePrototypeModel = new ImageFilePrototype.Builder()
        .href(cosBucketUrl)
        .build();
      OperatingSystemIdentityByName operatingSystemIdentityModel = new OperatingSystemIdentityByName.Builder()
        .name(operatingSystemName)
        .build();
      ImagePrototypeImageByFile imagePrototypeModel = new ImagePrototypeImageByFile.Builder()
        .name("my-image")
        .file(imageFilePrototypeModel)
        .operatingSystem(operatingSystemIdentityModel)
        .build();
      CreateImageOptions createImageOptions = new CreateImageOptions.Builder()
        .imagePrototype(imagePrototypeModel)
        .build();

      Response<Image> response = vpcService.createImage(createImageOptions).execute();
      Image image = response.getResult();

      // end-create_image
      imageId = image.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getImage() result:");
      // begin-get_image
      GetImageOptions getImageOptions = new GetImageOptions.Builder()
        .id(imageId)
        .build();

      Response<Image> response = vpcService.getImage(getImageOptions).execute();
      Image image = response.getResult();

      // end-get_image
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateImage() result:");
      // begin-update_image
      ImagePatch imagePatchModel = new ImagePatch.Builder()
        .name("my-image-update")
        .build();
      Map<String, Object> imagePatchModelAsPatch = imagePatchModel.asPatch();
      UpdateImageOptions updateImageOptions = new UpdateImageOptions.Builder()
        .id(imageId)
        .imagePatch(imagePatchModelAsPatch)
        .build();

      Response<Image> response = vpcService.updateImage(updateImageOptions).execute();
      Image image = response.getResult();

      // end-update_image
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }


    try {
      // begin-deprecate_image
      DeprecateImageOptions deprecateImageOptions = new DeprecateImageOptions.Builder()
        .id(imageId)
        .build();

      Response<Void> response = vpcService.deprecateImage(deprecateImageOptions).execute();
      // end-deprecate_image
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-obsolete_image
      ObsoleteImageOptions obsoleteImageOptions = new ObsoleteImageOptions.Builder()
        .id(imageId)
        .build();

      Response<Void> response = vpcService.obsoleteImage(obsoleteImageOptions).execute();
      // end-obsolete_image
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }
    try {
      System.out.println("listImageExportJobs() result:");
      // begin-list_image_export_jobs
      ListImageExportJobsOptions listImageExportJobsOptions = new ListImageExportJobsOptions.Builder()
        .imageId("testString")
        .build();

      Response<ImageExportJobUnpaginatedCollection> response = vpcService.listImageExportJobs(listImageExportJobsOptions).execute();
      ImageExportJobUnpaginatedCollection imageExportJobUnpaginatedCollection = response.getResult();

      System.out.println(imageExportJobUnpaginatedCollection);
      // end-list_image_export_jobs
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createImageExportJob() result:");
      // begin-create_image_export_job
      CloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByName cloudObjectStorageBucketIdentityModel = new CloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByName.Builder()
        .name(cosBucketName)
        .build();
      CreateImageExportJobOptions createImageExportJobOptions = new CreateImageExportJobOptions.Builder()
        .imageId(imageId)
        .storageBucket(cloudObjectStorageBucketIdentityModel)
        .name("my-image-export")
        .build();

      Response<ImageExportJob> response = vpcService.createImageExportJob(createImageExportJobOptions).execute();
      ImageExportJob imageExportJob = response.getResult();

      // end-create_image_export_job
      imageExportJobId = imageExportJob.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getImageExportJob() result:");
      // begin-get_image_export_job
      GetImageExportJobOptions getImageExportJobOptions = new GetImageExportJobOptions.Builder()
        .imageId(imageId)
        .id(imageExportJobId)
        .build();

      Response<ImageExportJob> response = vpcService.getImageExportJob(getImageExportJobOptions).execute();
      ImageExportJob imageExportJob = response.getResult();

      // end-get_image_export_job
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateImageExportJob() result:");
      // begin-update_image_export_job
      ImageExportJobPatch imageExportJobPatchModel = new ImageExportJobPatch.Builder()
        .name("my-image-export-update")
        .build();
      Map<String, Object> imageExportJobPatchModelAsPatch = imageExportJobPatchModel.asPatch();
      UpdateImageExportJobOptions updateImageExportJobOptions = new UpdateImageExportJobOptions.Builder()
        .imageId(imageId)
        .id(imageExportJobId)
        .imageExportJobPatch(imageExportJobPatchModelAsPatch)
        .build();

      Response<ImageExportJob> response = vpcService.updateImageExportJob(updateImageExportJobOptions).execute();
      ImageExportJob imageExportJob = response.getResult();

      // end-update_image_export_job
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listKeys() result:");
      // begin-list_keys
      ListKeysOptions listKeysOptions = new ListKeysOptions.Builder()
        .limit(Long.valueOf(10))
        .build();

      KeysPager pager = new KeysPager(vpcService, listKeysOptions);
      List<Key> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<Key> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_keys
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createKey() result:");
      // begin-create_key
      CreateKeyOptions createKeyOptions = new CreateKeyOptions.Builder()
        .name("my-key")
        .publicKey("AAAAB3NzaC1yc2EAAAADAQABAAABAQDDGe50Bxa5T5NDddrrtbx2Y4/VGbiCgXqnBsYToIUKoFSHTQl5IX3PasGnneKanhcLwWz5M5MoCRvhxTp66NKzIfAz7r+FX9rxgR+ZgcM253YAqOVeIpOU408simDZKriTlN8kYsXL7P34tsWuAJf4MgZtJAQxous/2byetpdCv8ddnT4X3ltOg9w+LqSCPYfNivqH00Eh7S1Ldz7I8aw5WOp5a+sQFP/RbwfpwHp+ny7DfeIOokcuI42tJkoBn7UsLTVpCSmXr2EDRlSWe/1M/iHNRBzaT3CK0+SwZWd2AEjePxSnWKNGIEUJDlUYp7hKhiQcgT5ZAnWU121oc5En")
        .build();

      Response<Key> response = vpcService.createKey(createKeyOptions).execute();
      Key key = response.getResult();

      // end-create_key
      keyId = key.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getKey() result:");
      // begin-get_key
      GetKeyOptions getKeyOptions = new GetKeyOptions.Builder()
        .id(keyId)
        .build();

      Response<Key> response = vpcService.getKey(getKeyOptions).execute();
      Key key = response.getResult();

      // end-get_key
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateKey() result:");
      // begin-update_key
      KeyPatch keyPatchModel = new KeyPatch.Builder()
        .name("my-key-update")
        .build();
      Map<String, Object> keyPatchModelAsPatch = keyPatchModel.asPatch();
      UpdateKeyOptions updateKeyOptions = new UpdateKeyOptions.Builder()
        .id(keyId)
        .keyPatch(keyPatchModelAsPatch)
        .build();

      Response<Key> response = vpcService.updateKey(updateKeyOptions).execute();
      Key key = response.getResult();

      // end-update_key
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listInstanceProfiles() result:");
      // begin-list_instance_profiles
      ListInstanceProfilesOptions listInstanceProfilesOptions = new ListInstanceProfilesOptions();

      Response<InstanceProfileCollection> response = vpcService.listInstanceProfiles(listInstanceProfilesOptions).execute();
      InstanceProfileCollection instanceProfileCollection = response.getResult();

      // end-list_instance_profiles
      instanceProfileName = instanceProfileCollection.getProfiles().get(0).getName();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getInstanceProfile() result:");
      // begin-get_instance_profile
      GetInstanceProfileOptions getInstanceProfileOptions = new GetInstanceProfileOptions.Builder()
        .name(instanceProfileName)
        .build();

      Response<InstanceProfile> response = vpcService.getInstanceProfile(getInstanceProfileOptions).execute();
      InstanceProfile instanceProfile = response.getResult();

      // end-get_instance_profile
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }


    try {
      System.out.println("listReservations() result:");
      // begin-list_reservations
      ListReservationsOptions listReservationsOptions = new ListReservationsOptions.Builder()
          .limit(Long.valueOf("10"))
          .name("testString")
          .resourceGroupId("testString")
          .zoneName("us-south-1")
          .build();

      ReservationsPager pager = new ReservationsPager(vpcService, listReservationsOptions);
      List<Reservation> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<Reservation> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      System.out.println(GsonSingleton.getGson().toJson(allResults));
      // end-list_reservations
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createReservation() result:");
      // begin-create_reservation
      ReservationCapacityPrototype reservationCapacityPrototypeModel = new ReservationCapacityPrototype.Builder()
          .total(Long.valueOf("10"))
          .build();
      ReservationCommittedUsePrototype reservationCommittedUsePrototypeModel = new ReservationCommittedUsePrototype.Builder()
          .term("one_year")
          .build();
      ReservationProfilePrototype reservationProfilePrototypeModel = new ReservationProfilePrototype.Builder()
          .name(instanceProfileName)
          .resourceType("instance_profile")
          .build();
      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
          .name("us-south-1")
          .build();
      CreateReservationOptions createReservationOptions = new CreateReservationOptions.Builder()
          .capacity(reservationCapacityPrototypeModel)
          .committedUse(reservationCommittedUsePrototypeModel)
          .name("my-reservation")
          .profile(reservationProfilePrototypeModel)
          .zone(zoneIdentityModel)
          .build();

      Response<Reservation> response = vpcService.createReservation(createReservationOptions).execute();
      Reservation reservation = response.getResult();

      // end-create_reservation
      reservationId = reservation.getId();
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getReservation() result:");
      // begin-get_reservation
      GetReservationOptions getReservationOptions = new GetReservationOptions.Builder()
          .id(reservationId)
          .build();

      Response<Reservation> response = vpcService.getReservation(getReservationOptions).execute();
      Reservation reservation = response.getResult();

      // end-get_reservation
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateReservation() result:");
      // begin-update_reservation
      ReservationPatch reservationPatchModel = new ReservationPatch.Builder()
          .name("my-reservation-updated")
          .build();
      Map<String, Object> reservationPatchModelAsPatch = reservationPatchModel.asPatch();
      UpdateReservationOptions updateReservationOptions = new UpdateReservationOptions.Builder()
          .id(reservationId)
          .reservationPatch(reservationPatchModelAsPatch)
          .build();

      Response<Reservation> response = vpcService.updateReservation(updateReservationOptions).execute();
      Reservation reservation = response.getResult();

      // end-update_reservation
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-activate_reservation
      ActivateReservationOptions activateReservationOptions = new ActivateReservationOptions.Builder()
          .id(reservationId)
          .build();

      Response<Void> response = vpcService.activateReservation(activateReservationOptions).execute();
      // end-activate_reservation
      System.out.printf("activateReservation() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listInstanceTemplates() result:");
      // begin-list_instance_templates
      ListInstanceTemplatesOptions listInstanceTemplatesOptions = new ListInstanceTemplatesOptions();

      Response<InstanceTemplateCollection> response = vpcService.listInstanceTemplates(listInstanceTemplatesOptions).execute();
      InstanceTemplateCollection instanceTemplateCollection = response.getResult();

      // end-list_instance_templates
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createInstanceTemplate() result:");
      // begin-create_instance_template
      KeyIdentityById keyIdentityModel = new KeyIdentityById.Builder()
        .id(keyId)
        .build();
      InstanceProfileIdentityByName instanceProfileIdentityModel = new InstanceProfileIdentityByName.Builder()
        .name(instanceProfileName)
        .build();
      VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
        .id(vpcId)
        .build();
      ImageIdentityById imageIdentityModel = new ImageIdentityById.Builder()
        .id(imageId)
        .build();
      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
        .id(subnetId)
        .build();
      NetworkInterfacePrototype networkInterfacePrototypeModel = new NetworkInterfacePrototype.Builder()
        .subnet(subnetIdentityModel)
        .build();
      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
        .name(zoneName)
        .build();
      InstanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkInterface instanceTemplatePrototypeModel = new InstanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkInterface.Builder()
        .keys(new java.util.ArrayList<KeyIdentity>(java.util.Arrays.asList(keyIdentityModel)))
        .name("my-instance-template")
        .profile(instanceProfileIdentityModel)
        .vpc(vpcIdentityModel)
        .image(imageIdentityModel)
        .primaryNetworkInterface(networkInterfacePrototypeModel)
        .zone(zoneIdentityModel)
        .build();
      CreateInstanceTemplateOptions createInstanceTemplateOptions = new CreateInstanceTemplateOptions.Builder()
        .instanceTemplatePrototype(instanceTemplatePrototypeModel)
        .build();

      Response<InstanceTemplate> response = vpcService.createInstanceTemplate(createInstanceTemplateOptions).execute();
      InstanceTemplate instanceTemplate = response.getResult();

      // end-create_instance_template
      instanceTemplateId = instanceTemplate.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getInstanceTemplate() result:");
      // begin-get_instance_template
      GetInstanceTemplateOptions getInstanceTemplateOptions = new GetInstanceTemplateOptions.Builder()
        .id(instanceTemplateId)
        .build();

      Response<InstanceTemplate> response = vpcService.getInstanceTemplate(getInstanceTemplateOptions).execute();
      InstanceTemplate instanceTemplate = response.getResult();

      // end-get_instance_template
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateInstanceTemplate() result:");
      // begin-update_instance_template
      InstanceTemplatePatch instanceTemplatePatchModel = new InstanceTemplatePatch.Builder()
        .name("my-template-update")
        .build();
      Map<String, Object> instanceTemplatePatchModelAsPatch = instanceTemplatePatchModel.asPatch();
      UpdateInstanceTemplateOptions updateInstanceTemplateOptions = new UpdateInstanceTemplateOptions.Builder()
        .id(instanceTemplateId)
        .instanceTemplatePatch(instanceTemplatePatchModelAsPatch)
        .build();

      Response<InstanceTemplate> response = vpcService.updateInstanceTemplate(updateInstanceTemplateOptions).execute();
      InstanceTemplate instanceTemplate = response.getResult();

      // end-update_instance_template
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listDedicatedHostGroups() result:");
      // begin-list_dedicated_host_groups
      ListDedicatedHostGroupsOptions listDedicatedHostGroupsOptions = new ListDedicatedHostGroupsOptions.Builder()
              .limit(Long.valueOf(10))
              .build();

      DedicatedHostGroupsPager pager = new DedicatedHostGroupsPager(vpcService, listDedicatedHostGroupsOptions);
      List<DedicatedHostGroup> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<DedicatedHostGroup> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_dedicated_host_groups
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createDedicatedHostGroup() result:");
      // begin-create_dedicated_host_group
      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
              .name(zoneName)
              .build();
      CreateDedicatedHostGroupOptions createDedicatedHostGroupOptions = new CreateDedicatedHostGroupOptions.Builder()
              .xClass(dedicatedHostProfileClassName)
              .name("my-dh-group")
              .family(dedicatedHostProfileFamilyName)
              .zone(zoneIdentityModel)
              .build();

      Response<DedicatedHostGroup> response = vpcService.createDedicatedHostGroup(createDedicatedHostGroupOptions).execute();
      DedicatedHostGroup dedicatedHostGroup = response.getResult();

      // end-create_dedicated_host_group
      dedicatedHostGroupId = dedicatedHostGroup.getId();
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getDedicatedHostGroup() result:");
      // begin-get_dedicated_host_group
      GetDedicatedHostGroupOptions getDedicatedHostGroupOptions = new GetDedicatedHostGroupOptions.Builder()
              .id(dedicatedHostGroupId)
              .build();

      Response<DedicatedHostGroup> response = vpcService.getDedicatedHostGroup(getDedicatedHostGroupOptions).execute();
      DedicatedHostGroup dedicatedHostGroup = response.getResult();

      // end-get_dedicated_host_group
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateDedicatedHostGroup() result:");
      // begin-update_dedicated_host_group
      DedicatedHostGroupPatch dedicatedHostGroupPatchModel = new DedicatedHostGroupPatch.Builder()
              .name("my-host-group-update")
              .build();
      Map<String, Object> dedicatedHostGroupPatchModelAsPatch = dedicatedHostGroupPatchModel.asPatch();
      UpdateDedicatedHostGroupOptions updateDedicatedHostGroupOptions = new UpdateDedicatedHostGroupOptions.Builder()
              .id(dedicatedHostGroupId)
              .dedicatedHostGroupPatch(dedicatedHostGroupPatchModelAsPatch)
              .build();

      Response<DedicatedHostGroup> response = vpcService.updateDedicatedHostGroup(updateDedicatedHostGroupOptions).execute();
      DedicatedHostGroup dedicatedHostGroup = response.getResult();

      // end-update_dedicated_host_group
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }


    try {
      System.out.println("listBackupPolicies() result:");
      // begin-list_backup_policies
      ListBackupPoliciesOptions listBackupPoliciesOptions = new ListBackupPoliciesOptions.Builder()
        .build();

      BackupPoliciesPager pager = new BackupPoliciesPager(vpcService, listBackupPoliciesOptions);
      List<BackupPolicy> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<BackupPolicy> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_backup_policies
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createBackupPolicy() result:");
      List<String> matchUserTags = Arrays.asList("tag1", "tag2");
      // begin-create_backup_policy
      BackupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototype backupPolicyPrototype = new BackupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototype.Builder()
      .name("my-backup-policy")
      .matchUserTags(matchUserTags)
      .build();

      CreateBackupPolicyOptions createBackupPolicyOptions = new CreateBackupPolicyOptions.Builder()
        .backupPolicyPrototype(backupPolicyPrototype)
        .build();
      Response<BackupPolicy> response = vpcService.createBackupPolicy(createBackupPolicyOptions).execute();
      BackupPolicy backupPolicy = response.getResult();

      // end-create_backup_policy
      backupPolicyId = backupPolicy.getId();
      ifMatchBackupPolicy = response.getHeaders().values("etag").get(0);
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }


    try {
      System.out.println("listBackupPolicyJobs() result:");
      // begin-list_backup_policy_jobs
      ListBackupPolicyJobsOptions listBackupPolicyJobsOptions = new ListBackupPolicyJobsOptions.Builder()
        .backupPolicyId(backupPolicyId)
        .build();

      BackupPolicyJobsPager pager = new BackupPolicyJobsPager(vpcService, listBackupPolicyJobsOptions);
      List<BackupPolicyJob> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<BackupPolicyJob> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_backup_policy_jobs
      backupPolicyJobId = allResults.get(0).getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getBackupPolicyJob() result:");
      // begin-get_backup_policy_job
      GetBackupPolicyJobOptions getBackupPolicyJobOptions = new GetBackupPolicyJobOptions.Builder()
        .backupPolicyId(backupPolicyId)
        .id(backupPolicyJobId)
        .build();

      Response<BackupPolicyJob> response = vpcService.getBackupPolicyJob(getBackupPolicyJobOptions).execute();
      BackupPolicyJob backupPolicyJob = response.getResult();

      // end-get_backup_policy_job
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listBackupPolicyPlans() result:");
      // begin-list_backup_policy_plans
      ListBackupPolicyPlansOptions listBackupPolicyPlansOptions = new ListBackupPolicyPlansOptions.Builder()
        .backupPolicyId(backupPolicyId)
        .build();

      Response<BackupPolicyPlanCollection> response = vpcService.listBackupPolicyPlans(listBackupPolicyPlansOptions).execute();
      BackupPolicyPlanCollection backupPolicyPlanCollection = response.getResult();

      // end-list_backup_policy_plans
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createBackupPolicyPlan() result:");
      // begin-create_backup_policy_plan
      RegionIdentityByName regionIdentityByName = new RegionIdentityByName.Builder(crossRegionName).build();
      BackupPolicyPlanRemoteRegionPolicyPrototype backupPolicyPlanRemoteRegionPolicyPrototype = new BackupPolicyPlanRemoteRegionPolicyPrototype.Builder()
        .region(regionIdentityByName)
        .build();
      CreateBackupPolicyPlanOptions createBackupPolicyPlanRemoteCopyOptions = new CreateBackupPolicyPlanOptions.Builder()
        .backupPolicyId(backupPolicyId)
        .name("my-backup-policy-plan-remote-copy")
        .cronSpec("*/5 1,2,3 * * *")
        .remoteRegionPolicies(Arrays.asList(backupPolicyPlanRemoteRegionPolicyPrototype))
        .build();

      Response<BackupPolicyPlan> remoteCopyResponse = vpcService.createBackupPolicyPlan(createBackupPolicyPlanRemoteCopyOptions).execute();
      BackupPolicyPlan backupPolicyRemoteCopyPlan = remoteCopyResponse.getResult();

      CreateBackupPolicyPlanOptions createBackupPolicyPlanOptions = new CreateBackupPolicyPlanOptions.Builder()
        .backupPolicyId(backupPolicyId)
        .name("my-backup-policy-plan")
        .cronSpec("*/5 1,2,3 * * *")
        .build();

      Response<BackupPolicyPlan> response = vpcService.createBackupPolicyPlan(createBackupPolicyPlanOptions).execute();
      BackupPolicyPlan backupPolicyPlan = response.getResult();

      // end-create_backup_policy_plan
      backupPolicyPlanId = backupPolicyPlan.getId();
      ifMatchBackupPolicyPlan = response.getHeaders().values("etag").get(0);
      backupPolicyRemoteCopyPlanId = backupPolicyRemoteCopyPlan.getId();
      ifMatchBackupPolicyRemoteCopyPlan = remoteCopyResponse.getHeaders().values("etag").get(0);

    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getBackupPolicyPlan() result:");
      // begin-get_backup_policy_plan
      GetBackupPolicyPlanOptions getBackupPolicyPlanOptions = new GetBackupPolicyPlanOptions.Builder()
        .backupPolicyId(backupPolicyId)
        .id(backupPolicyPlanId)
        .build();

      Response<BackupPolicyPlan> response = vpcService.getBackupPolicyPlan(getBackupPolicyPlanOptions).execute();
      BackupPolicyPlan backupPolicyPlan = response.getResult();

      // end-get_backup_policy_plan
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateBackupPolicyPlan() result:");
      // begin-update_backup_policy_plan
      BackupPolicyPlanPatch backupPolicyPlanPatchModel = new BackupPolicyPlanPatch.Builder()
        .name("my-backup-policy-plan-update")
        .build();
      Map<String, Object> backupPolicyPlanPatchModelAsPatch = backupPolicyPlanPatchModel.asPatch();
      UpdateBackupPolicyPlanOptions updateBackupPolicyPlanOptions = new UpdateBackupPolicyPlanOptions.Builder()
        .backupPolicyId(backupPolicyId)
        .id(backupPolicyPlanId)
        .backupPolicyPlanPatch(backupPolicyPlanPatchModelAsPatch)
        .ifMatch(ifMatchBackupPolicyPlan)
        .build();

      Response<BackupPolicyPlan> response = vpcService.updateBackupPolicyPlan(updateBackupPolicyPlanOptions).execute();
      BackupPolicyPlan backupPolicyPlan = response.getResult();

      // end-update_backup_policy_plan
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getBackupPolicy() result:");
      // begin-get_backup_policy
      GetBackupPolicyOptions getBackupPolicyOptions = new GetBackupPolicyOptions.Builder()
        .id(backupPolicyId)
        .build();

      Response<BackupPolicy> response = vpcService.getBackupPolicy(getBackupPolicyOptions).execute();
      BackupPolicy backupPolicy = response.getResult();

      // end-get_backup_policy
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateBackupPolicy() result:");
      // begin-update_backup_policy
      BackupPolicyPatch backupPolicyPatchModel = new BackupPolicyPatch.Builder()
        .name("my-backup-policy-update")
        .build();
      Map<String, Object> backupPolicyPatchModelAsPatch = backupPolicyPatchModel.asPatch();
      UpdateBackupPolicyOptions updateBackupPolicyOptions = new UpdateBackupPolicyOptions.Builder()
        .id(backupPolicyId)
        .backupPolicyPatch(backupPolicyPatchModelAsPatch)
        .ifMatch(ifMatchBackupPolicy)
        .build();

      Response<BackupPolicy> response = vpcService.updateBackupPolicy(updateBackupPolicyOptions).execute();
      BackupPolicy backupPolicy = response.getResult();

      // end-update_backup_policy
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }


    try {
      System.out.println("listDedicatedHostProfiles() result:");
      // begin-list_dedicated_host_profiles
      ListDedicatedHostProfilesOptions listDedicatedHostProfilesOptions = new ListDedicatedHostProfilesOptions.Builder()
              .limit(Long.valueOf(10))
              .build();

      DedicatedHostProfilesPager pager = new DedicatedHostProfilesPager(vpcService, listDedicatedHostProfilesOptions);
      List<DedicatedHostProfile> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<DedicatedHostProfile> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_dedicated_host_profiles
      for (DedicatedHostProfile profile : allResults) {
        if (profile.getFamily().equalsIgnoreCase("balanced-disk")) {
          dedicatedHostProfileName = profile.getName();
        }
      }
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getDedicatedHostProfile() result:");
      // begin-get_dedicated_host_profile
      GetDedicatedHostProfileOptions getDedicatedHostProfileOptions = new GetDedicatedHostProfileOptions.Builder()
              .name(dedicatedHostProfileName)
              .build();

      Response<DedicatedHostProfile> response = vpcService.getDedicatedHostProfile(getDedicatedHostProfileOptions).execute();
      DedicatedHostProfile dedicatedHostProfile = response.getResult();

      // end-get_dedicated_host_profile
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listDedicatedHosts() result:");
      // begin-list_dedicated_hosts
      ListDedicatedHostsOptions listDedicatedHostsOptions = new ListDedicatedHostsOptions.Builder()
              .limit(Long.valueOf(10))
              .build();

      DedicatedHostsPager pager = new DedicatedHostsPager(vpcService, listDedicatedHostsOptions);
      List<DedicatedHost> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<DedicatedHost> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_dedicated_hosts
      for (DedicatedHost dedicatedHost : allResults) {
        if (dedicatedHost.getDisks().size() > 0) {
          dedicatedHostDiskId = dedicatedHost.getDisks().get(0).getId();
          dedicatedHostId = dedicatedHost.getId();
          break;
        }
      }
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createDedicatedHost() result:");
      // begin-create_dedicated_host
      DedicatedHostProfileIdentityByName dedicatedHostProfileIdentityModel = new DedicatedHostProfileIdentityByName.Builder()
              .name(dedicatedHostProfileName)
              .build();
      DedicatedHostGroupIdentityById dedicatedHostGroupIdentityModel = new DedicatedHostGroupIdentityById.Builder()
              .id(dedicatedHostGroupId)
              .build();
      DedicatedHostPrototypeDedicatedHostByGroup dedicatedHostPrototypeModel = new DedicatedHostPrototypeDedicatedHostByGroup.Builder()
              .name("my-dedicated-host")
              .profile(dedicatedHostProfileIdentityModel)
              .group(dedicatedHostGroupIdentityModel)
              .build();
      CreateDedicatedHostOptions createDedicatedHostOptions = new CreateDedicatedHostOptions.Builder()
              .dedicatedHostPrototype(dedicatedHostPrototypeModel)
              .build();

      Response<DedicatedHost> response = vpcService.createDedicatedHost(createDedicatedHostOptions).execute();
      DedicatedHost dedicatedHost = response.getResult();

      // end-create_dedicated_host
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listDedicatedHostDisks() result:");
      // begin-list_dedicated_host_disks
      ListDedicatedHostDisksOptions listDedicatedHostDisksOptions = new ListDedicatedHostDisksOptions.Builder()
              .dedicatedHostId(dedicatedHostId)
              .build();

      Response<DedicatedHostDiskCollection> response = vpcService.listDedicatedHostDisks(listDedicatedHostDisksOptions).execute();
      DedicatedHostDiskCollection dedicatedHostDiskCollection = response.getResult();

      // end-list_dedicated_host_disks
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getDedicatedHostDisk() result:");
      // begin-get_dedicated_host_disk
      GetDedicatedHostDiskOptions getDedicatedHostDiskOptions = new GetDedicatedHostDiskOptions.Builder()
              .dedicatedHostId(dedicatedHostId)
              .id(dedicatedHostDiskId)
              .build();

      Response<DedicatedHostDisk> response = vpcService.getDedicatedHostDisk(getDedicatedHostDiskOptions).execute();
      DedicatedHostDisk dedicatedHostDisk = response.getResult();

      // end-get_dedicated_host_disk
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateDedicatedHostDisk() result:");
      // begin-update_dedicated_host_disk
      DedicatedHostDiskPatch dedicatedHostDiskPatchModel = new DedicatedHostDiskPatch.Builder()
              .name("my-host-disk-update")
              .build();
      Map<String, Object> dedicatedHostDiskPatchModelAsPatch = dedicatedHostDiskPatchModel.asPatch();
      UpdateDedicatedHostDiskOptions updateDedicatedHostDiskOptions = new UpdateDedicatedHostDiskOptions.Builder()
              .dedicatedHostId(dedicatedHostId)
              .id(dedicatedHostDiskId)
              .dedicatedHostDiskPatch(dedicatedHostDiskPatchModelAsPatch)
              .build();

      Response<DedicatedHostDisk> response = vpcService.updateDedicatedHostDisk(updateDedicatedHostDiskOptions).execute();
      DedicatedHostDisk dedicatedHostDisk = response.getResult();

      // end-update_dedicated_host_disk
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getDedicatedHost() result:");
      // begin-get_dedicated_host
      GetDedicatedHostOptions getDedicatedHostOptions = new GetDedicatedHostOptions.Builder()
              .id(dedicatedHostId)
              .build();

      Response<DedicatedHost> response = vpcService.getDedicatedHost(getDedicatedHostOptions).execute();
      DedicatedHost dedicatedHost = response.getResult();

      // end-get_dedicated_host
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateDedicatedHost() result:");
      // begin-update_dedicated_host
      DedicatedHostPatch dedicatedHostPatchModel = new DedicatedHostPatch.Builder()
              .name("my-dedicatedhost-update")
              .build();
      Map<String, Object> dedicatedHostPatchModelAsPatch = dedicatedHostPatchModel.asPatch();
      UpdateDedicatedHostOptions updateDedicatedHostOptions = new UpdateDedicatedHostOptions.Builder()
              .id(dedicatedHostId)
              .dedicatedHostPatch(dedicatedHostPatchModelAsPatch)
              .build();

      Response<DedicatedHost> response = vpcService.updateDedicatedHost(updateDedicatedHostOptions).execute();
      DedicatedHost dedicatedHost = response.getResult();

      // end-update_dedicated_host
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listFloatingIps() result:");
      // begin-list_floating_ips
      ListFloatingIpsOptions listFloatingIpsOptions = new ListFloatingIpsOptions.Builder()
              .limit(Long.valueOf(10))
              .build();

      FloatingIpsPager pager = new FloatingIpsPager(vpcService, listFloatingIpsOptions);
      List<FloatingIP> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<FloatingIP> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_floating_ips
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createFloatingIp() result:");
      // begin-create_floating_ip
      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
              .name(zoneName)
              .build();
      FloatingIPPrototypeFloatingIPByZone floatingIpPrototypeModel = new FloatingIPPrototypeFloatingIPByZone.Builder()
              .name("my-floating-ip")
              .zone(zoneIdentityModel)
              .build();
      CreateFloatingIpOptions createFloatingIpOptions = new CreateFloatingIpOptions.Builder()
              .floatingIpPrototype(floatingIpPrototypeModel)
              .build();

      Response<FloatingIP> response = vpcService.createFloatingIp(createFloatingIpOptions).execute();
      FloatingIP floatingIp = response.getResult();

      // end-create_floating_ip
      floatingIpId = floatingIp.getId();
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getFloatingIp() result:");
      // begin-get_floating_ip
      GetFloatingIpOptions getFloatingIpOptions = new GetFloatingIpOptions.Builder()
              .id(floatingIpId)
              .build();

      Response<FloatingIP> response = vpcService.getFloatingIp(getFloatingIpOptions).execute();
      FloatingIP floatingIp = response.getResult();

      // end-get_floating_ip
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateFloatingIp() result:");
      // begin-update_floating_ip
      FloatingIPPatch floatingIpPatchModel = new FloatingIPPatch.Builder()
              .name("my-floating-ip-update")
              .build();
      Map<String, Object> floatingIpPatchModelAsPatch = floatingIpPatchModel.asPatch();
      UpdateFloatingIpOptions updateFloatingIpOptions = new UpdateFloatingIpOptions.Builder()
              .id(floatingIpId)
              .floatingIpPatch(floatingIpPatchModelAsPatch)
              .build();

      Response<FloatingIP> response = vpcService.updateFloatingIp(updateFloatingIpOptions).execute();
      FloatingIP floatingIp = response.getResult();

      // end-update_floating_ip
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listVolumeProfiles() result:");
      // begin-list_volume_profiles
      ListVolumeProfilesOptions listVolumeProfilesOptions = new ListVolumeProfilesOptions.Builder()
              .limit(Long.valueOf(10))
              .build();

      VolumeProfilesPager pager = new VolumeProfilesPager(vpcService, listVolumeProfilesOptions);
      List<VolumeProfile> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<VolumeProfile> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_volume_profiles
      volumeProfileName = allResults.get(0).getName();
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getVolumeProfile() result:");
      // begin-get_volume_profile
      GetVolumeProfileOptions getVolumeProfileOptions = new GetVolumeProfileOptions.Builder()
              .name(volumeProfileName)
              .build();

      Response<VolumeProfile> response = vpcService.getVolumeProfile(getVolumeProfileOptions).execute();
      VolumeProfile volumeProfile = response.getResult();

      // end-get_volume_profile
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listVolumes() result:");
      // begin-list_volumes
      ListVolumesOptions listVolumesOptions = new ListVolumesOptions.Builder()
              .limit(Long.valueOf(10))
              .build();

      VolumesPager pager = new VolumesPager(vpcService, listVolumesOptions);
      List<Volume> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<Volume> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_volumes
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createVolume() result:");
      // begin-create_volume
      VolumeProfileIdentityByName volumeProfileIdentityModel = new VolumeProfileIdentityByName.Builder()
              .name(volumeProfileName)
              .build();
      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
              .name(zoneName)
              .build();
      VolumePrototypeVolumeByCapacity volumePrototypeModel = new VolumePrototypeVolumeByCapacity.Builder()
              .name("my-volume")
              .profile(volumeProfileIdentityModel)
              .zone(zoneIdentityModel)
              .capacity(Long.valueOf("100"))
              .build();
      CreateVolumeOptions createVolumeOptions = new CreateVolumeOptions.Builder()
              .volumePrototype(volumePrototypeModel)
              .build();

      Response<Volume> response = vpcService.createVolume(createVolumeOptions).execute();
      Volume volume = response.getResult();

      // end-create_volume
      volumeId = volume.getId();
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getVolume() result:");
      // begin-get_volume
      GetVolumeOptions getVolumeOptions = new GetVolumeOptions.Builder()
              .id(volumeId)
              .build();

      Response<Volume> response = vpcService.getVolume(getVolumeOptions).execute();
      Volume volume = response.getResult();

      // end-get_volume
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateVolume() result:");
      // begin-update_volume
      VolumePatch volumePatchModel = new VolumePatch.Builder()
              .name("my-volume-update")
              .build();
      Map<String, Object> volumePatchModelAsPatch = volumePatchModel.asPatch();
      UpdateVolumeOptions updateVolumeOptions = new UpdateVolumeOptions.Builder()
              .id(volumeId)
              .volumePatch(volumePatchModelAsPatch)
              .build();

      Response<Volume> response = vpcService.updateVolume(updateVolumeOptions).execute();
      Volume volume = response.getResult();

      // end-update_volume
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listInstances() result:");
      // begin-list_instances
      ListInstancesOptions listInstancesOptions = new ListInstancesOptions.Builder()
        .limit(Long.valueOf(10))
        .build();

      InstancesPager pager = new InstancesPager(vpcService, listInstancesOptions);
      List<Instance> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<Instance> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_instances
      for (Instance instance : allResults) {
        if (instance.getDisks().size() > 0) {
          instanceId = instance.getId();
          instanceDiskId = instance.getDisks().get(0).getId();
          break;
        }
      }
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createInstance() result:");
      // begin-create_instance
      KeyIdentityById keyIdentityModel = new KeyIdentityById.Builder()
        .id(keyId)
        .build();
      InstancePlacementTargetPrototypeDedicatedHostIdentityDedicatedHostIdentityById instancePlacementTargetPrototypeModel = new InstancePlacementTargetPrototypeDedicatedHostIdentityDedicatedHostIdentityById.Builder()
        .id(dedicatedHostId)
        .build();
      InstanceProfileIdentityByName instanceProfileIdentityModel = new InstanceProfileIdentityByName.Builder()
        .name(instanceProfileName)
        .build();
      VolumeProfileIdentityByName volumeProfileIdentityModel = new VolumeProfileIdentityByName.Builder()
        .name(volumeProfileName)
        .build();
      EncryptionKeyIdentityByCRN encryptionKeyIdentityModel = new EncryptionKeyIdentityByCRN.Builder()
        .crn(crn)
        .build();
      VolumeAttachmentPrototypeVolumeVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeByCapacity volumeAttachmentPrototypeVolumeVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeByCapacityModel = new VolumeAttachmentPrototypeVolumeVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeByCapacity.Builder()
        .name("my-data-volume")
        .profile(volumeProfileIdentityModel)
        .capacity(Long.valueOf("1000"))
        .encryptionKey(encryptionKeyIdentityModel)
        .build();
        VolumeAttachmentPrototype volumeAttachmentPrototypeModel = new VolumeAttachmentPrototype.Builder()
        .volume(volumeAttachmentPrototypeVolumeVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeByCapacityModel)
        .build();
      VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
        .id(vpcId)
        .build();
      VolumePrototypeInstanceByImageContext volumePrototypeInstanceByImageContextModel = new VolumePrototypeInstanceByImageContext.Builder()
        .encryptionKey(encryptionKeyIdentityModel)
        .name("my-boot-volume")
        .profile(volumeProfileIdentityModel)
        .build();
      VolumeAttachmentPrototypeInstanceByImageContext volumeAttachmentPrototypeInstanceByImageContextModel = new VolumeAttachmentPrototypeInstanceByImageContext.Builder()
        .volume(volumePrototypeInstanceByImageContextModel)
        .build();
      ImageIdentityById imageIdentityModel = new ImageIdentityById.Builder()
        .id(imageId)
        .build();
      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
        .id(subnetId)
        .build();
      NetworkInterfacePrototype networkInterfacePrototypeModel = new NetworkInterfacePrototype.Builder()
        .name("my-network-interface")
        .subnet(subnetIdentityModel)
        .build();
      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
        .name(zoneName)
        .build();
      InstancePrototypeInstanceByImageInstanceByImageInstanceByNetworkInterface instancePrototypeModel = new InstancePrototypeInstanceByImageInstanceByImageInstanceByNetworkInterface.Builder()
        .keys(new java.util.ArrayList<KeyIdentity>(java.util.Arrays.asList(keyIdentityModel)))
        .name("my-instance")
        .placementTarget(instancePlacementTargetPrototypeModel)
        .profile(instanceProfileIdentityModel)
        .volumeAttachments(new java.util.ArrayList<VolumeAttachmentPrototype>(java.util.Arrays.asList(volumeAttachmentPrototypeModel)))
        .vpc(vpcIdentityModel)
        .bootVolumeAttachment(volumeAttachmentPrototypeInstanceByImageContextModel)
        .image(imageIdentityModel)
        .primaryNetworkInterface(networkInterfacePrototypeModel)
        .zone(zoneIdentityModel)
        .build();
      CreateInstanceOptions createInstanceOptions = new CreateInstanceOptions.Builder()
        .instancePrototype(instancePrototypeModel)
        .build();

      Response<Instance> response = vpcService.createInstance(createInstanceOptions).execute();
      Instance instance = response.getResult();

      // end-create_instance
      sourceVolume = instance.getBootVolumeAttachment().getVolume().getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getInstance() result:");
      // begin-get_instance
      GetInstanceOptions getInstanceOptions = new GetInstanceOptions.Builder()
        .id(instanceId)
        .build();

      Response<Instance> response = vpcService.getInstance(getInstanceOptions).execute();
      Instance instance = response.getResult();

      // end-get_instance
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateInstance() result:");
      // begin-update_instance
      InstancePatch instancePatchModel = new InstancePatch.Builder()
        .name("my-instance-update")
        .build();
      Map<String, Object> instancePatchModelAsPatch = instancePatchModel.asPatch();
      UpdateInstanceOptions updateInstanceOptions = new UpdateInstanceOptions.Builder()
        .id(instanceId)
        .instancePatch(instancePatchModelAsPatch)
        .build();

      Response<Instance> response = vpcService.updateInstance(updateInstanceOptions).execute();
      Instance instance = response.getResult();

      // end-update_instance
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getInstanceInitialization() result:");
      // begin-get_instance_initialization
      GetInstanceInitializationOptions getInstanceInitializationOptions = new GetInstanceInitializationOptions.Builder()
        .id(instanceId)
        .build();

      Response<InstanceInitialization> response = vpcService.getInstanceInitialization(getInstanceInitializationOptions).execute();
      InstanceInitialization instanceInitialization = response.getResult();

      // end-get_instance_initialization
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createInstanceAction() result:");
      // begin-create_instance_action
      CreateInstanceActionOptions createInstanceActionOptions = new CreateInstanceActionOptions.Builder()
        .instanceId(instanceId)
        .type("reboot")
        .build();

      Response<InstanceAction> response = vpcService.createInstanceAction(createInstanceActionOptions).execute();
      InstanceAction instanceAction = response.getResult();

      // end-create_instance_action
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }


    try {
      System.out.println("listInstanceClusterNetworkAttachments() result:");
      // begin-list_instance_cluster_network_attachments
      ListInstanceClusterNetworkAttachmentsOptions listInstanceClusterNetworkAttachmentsOptions = new ListInstanceClusterNetworkAttachmentsOptions.Builder()
        .instanceId(instanceId)
        .limit(Long.valueOf("10"))
        .build();

      InstanceClusterNetworkAttachmentsPager pager = new InstanceClusterNetworkAttachmentsPager(vpcService, listInstanceClusterNetworkAttachmentsOptions);
      List<InstanceClusterNetworkAttachment> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<InstanceClusterNetworkAttachment> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_instance_cluster_network_attachments
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createClusterNetworkAttachment() result:");
      // begin-create_cluster_network_attachment
      InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceInstanceClusterNetworkInterfacePrototypeInstanceClusterNetworkAttachment instanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceModel = new InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceInstanceClusterNetworkInterfacePrototypeInstanceClusterNetworkAttachment.Builder()
        .name("my-instance-network-attachment")
        .build();
      CreateClusterNetworkAttachmentOptions createClusterNetworkAttachmentOptions = new CreateClusterNetworkAttachmentOptions.Builder()
        .instanceId(instanceId)
        .clusterNetworkInterface(instanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceModel)
        .build();

      Response<InstanceClusterNetworkAttachment> response = vpcService.createClusterNetworkAttachment(createClusterNetworkAttachmentOptions).execute();
      InstanceClusterNetworkAttachment instanceClusterNetworkAttachment = response.getResult();

      // end-create_cluster_network_attachment
      instanceClusterNetworkAttachmentId = instanceClusterNetworkAttachment.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getInstanceClusterNetworkAttachment() result:");
      // begin-get_instance_cluster_network_attachment
      GetInstanceClusterNetworkAttachmentOptions getInstanceClusterNetworkAttachmentOptions = new GetInstanceClusterNetworkAttachmentOptions.Builder()
        .instanceId(instanceId)
        .id(instanceClusterNetworkAttachmentId)
        .build();

      Response<InstanceClusterNetworkAttachment> response = vpcService.getInstanceClusterNetworkAttachment(getInstanceClusterNetworkAttachmentOptions).execute();
      InstanceClusterNetworkAttachment instanceClusterNetworkAttachment = response.getResult();

      // end-get_instance_cluster_network_attachment
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateInstanceClusterNetworkAttachment() result:");
      // begin-update_instance_cluster_network_attachment
      InstanceClusterNetworkAttachmentPatch instanceClusterNetworkAttachmentPatchModel = new InstanceClusterNetworkAttachmentPatch.Builder()
        .name("my-instance-network-attachment-updated")
        .build();
      Map<String, Object> instanceClusterNetworkAttachmentPatchModelAsPatch = instanceClusterNetworkAttachmentPatchModel.asPatch();
      UpdateInstanceClusterNetworkAttachmentOptions updateInstanceClusterNetworkAttachmentOptions = new UpdateInstanceClusterNetworkAttachmentOptions.Builder()
        .instanceId(instanceId)
        .id(instanceClusterNetworkAttachmentId)
        .instanceClusterNetworkAttachmentPatch(instanceClusterNetworkAttachmentPatchModelAsPatch)
        .build();

      Response<InstanceClusterNetworkAttachment> response = vpcService.updateInstanceClusterNetworkAttachment(updateInstanceClusterNetworkAttachmentOptions).execute();
      InstanceClusterNetworkAttachment instanceClusterNetworkAttachment = response.getResult();

      // end-update_instance_cluster_network_attachment
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }


    try {
      System.out.println("createInstanceConsoleAccessToken() result:");
      // begin-create_instance_console_access_token
      CreateInstanceConsoleAccessTokenOptions createInstanceConsoleAccessTokenOptions = new CreateInstanceConsoleAccessTokenOptions.Builder()
        .instanceId(instanceId)
        .consoleType("serial")
        .build();

      Response<InstanceConsoleAccessToken> response = vpcService.createInstanceConsoleAccessToken(createInstanceConsoleAccessTokenOptions).execute();
      InstanceConsoleAccessToken instanceConsoleAccessToken = response.getResult();

      // end-create_instance_console_access_token
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listInstanceDisks() result:");
      // begin-list_instance_disks
      ListInstanceDisksOptions listInstanceDisksOptions = new ListInstanceDisksOptions.Builder()
        .instanceId(instanceId)
        .build();

      Response<InstanceDiskCollection> response = vpcService.listInstanceDisks(listInstanceDisksOptions).execute();
      InstanceDiskCollection instanceDiskCollection = response.getResult();

      // end-list_instance_disks
      instanceDiskId = instanceDiskCollection.getDisks().get(0).getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getInstanceDisk() result:");
      // begin-get_instance_disk
      GetInstanceDiskOptions getInstanceDiskOptions = new GetInstanceDiskOptions.Builder()
        .instanceId(instanceId)
        .id(instanceDiskId)
        .build();

      Response<InstanceDisk> response = vpcService.getInstanceDisk(getInstanceDiskOptions).execute();
      InstanceDisk instanceDisk = response.getResult();

      // end-get_instance_disk
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateInstanceDisk() result:");
      // begin-update_instance_disk
      InstanceDiskPatch instanceDiskPatchModel = new InstanceDiskPatch.Builder()
        .name("my-disk-update")
        .build();
      Map<String, Object> instanceDiskPatchModelAsPatch = instanceDiskPatchModel.asPatch();
      UpdateInstanceDiskOptions updateInstanceDiskOptions = new UpdateInstanceDiskOptions.Builder()
        .instanceId(instanceId)
        .id(instanceDiskId)
        .instanceDiskPatch(instanceDiskPatchModelAsPatch)
        .build();

      Response<InstanceDisk> response = vpcService.updateInstanceDisk(updateInstanceDiskOptions).execute();
      InstanceDisk instanceDisk = response.getResult();

      // end-update_instance_disk
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listInstanceNetworkInterfaces() result:");
      // begin-list_instance_network_interfaces
      ListInstanceNetworkInterfacesOptions listInstanceNetworkInterfacesOptions = new ListInstanceNetworkInterfacesOptions.Builder()
        .instanceId(instanceId)
        .build();

      Response<NetworkInterfaceUnpaginatedCollection> response = vpcService.listInstanceNetworkInterfaces(listInstanceNetworkInterfacesOptions).execute();
      NetworkInterfaceUnpaginatedCollection networkInterfaceUnpaginatedCollection = response.getResult();

      // end-list_instance_network_interfaces
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createInstanceNetworkInterface() result:");
      // begin-create_instance_network_interface
      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
        .id(subnetId)
        .build();
      CreateInstanceNetworkInterfaceOptions createInstanceNetworkInterfaceOptions = new CreateInstanceNetworkInterfaceOptions.Builder()
        .instanceId(instanceId)
        .name("my-network-interface")
        .subnet(subnetIdentityModel)
        .build();

      Response<NetworkInterface> response = vpcService.createInstanceNetworkInterface(createInstanceNetworkInterfaceOptions).execute();
      NetworkInterface networkInterface = response.getResult();

      // end-create_instance_network_interface
      instanceNetworkInterfaceId = networkInterface.getId();
      instanceNetworkInterfaceReservedIp = networkInterface.getPrimaryIp().getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getInstanceNetworkInterface() result:");
      // begin-get_instance_network_interface
      GetInstanceNetworkInterfaceOptions getInstanceNetworkInterfaceOptions = new GetInstanceNetworkInterfaceOptions.Builder()
        .instanceId(instanceId)
        .id(instanceNetworkInterfaceId)
        .build();

      Response<NetworkInterface> response = vpcService.getInstanceNetworkInterface(getInstanceNetworkInterfaceOptions).execute();
      NetworkInterface networkInterface = response.getResult();

      // end-get_instance_network_interface
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateInstanceNetworkInterface() result:");
      // begin-update_instance_network_interface
      NetworkInterfacePatch networkInterfacePatchModel = new NetworkInterfacePatch.Builder()
        .name("my-network-interface-update")
        .build();
      Map<String, Object> networkInterfacePatchModelAsPatch = networkInterfacePatchModel.asPatch();
      UpdateInstanceNetworkInterfaceOptions updateInstanceNetworkInterfaceOptions = new UpdateInstanceNetworkInterfaceOptions.Builder()
        .instanceId(instanceId)
        .id(instanceNetworkInterfaceId)
        .networkInterfacePatch(networkInterfacePatchModelAsPatch)
        .build();

      Response<NetworkInterface> response = vpcService.updateInstanceNetworkInterface(updateInstanceNetworkInterfaceOptions).execute();
      NetworkInterface networkInterface = response.getResult();

      // end-update_instance_network_interface
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listInstanceNetworkInterfaceFloatingIps() result:");
      // begin-list_instance_network_interface_floating_ips
      ListInstanceNetworkInterfaceFloatingIpsOptions listInstanceNetworkInterfaceFloatingIpsOptions = new ListInstanceNetworkInterfaceFloatingIpsOptions.Builder()
        .instanceId(instanceId)
        .networkInterfaceId(instanceNetworkInterfaceId)
        .build();

      Response<FloatingIPUnpaginatedCollection> response = vpcService.listInstanceNetworkInterfaceFloatingIps(listInstanceNetworkInterfaceFloatingIpsOptions).execute();
      FloatingIPUnpaginatedCollection floatingIpUnpaginatedCollection = response.getResult();

      // end-list_instance_network_interface_floating_ips
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("addInstanceNetworkInterfaceFloatingIp() result:");
      // begin-add_instance_network_interface_floating_ip
      AddInstanceNetworkInterfaceFloatingIpOptions addInstanceNetworkInterfaceFloatingIpOptions = new AddInstanceNetworkInterfaceFloatingIpOptions.Builder()
              .instanceId(instanceId)
              .networkInterfaceId(instanceNetworkInterfaceId)
              .id(floatingIpId)
              .build();

      Response<FloatingIP> response = vpcService.addInstanceNetworkInterfaceFloatingIp(addInstanceNetworkInterfaceFloatingIpOptions).execute();
      FloatingIP floatingIp = response.getResult();

      // end-add_instance_network_interface_floating_ip
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getInstanceNetworkInterfaceFloatingIp() result:");
      // begin-get_instance_network_interface_floating_ip
      GetInstanceNetworkInterfaceFloatingIpOptions getInstanceNetworkInterfaceFloatingIpOptions = new GetInstanceNetworkInterfaceFloatingIpOptions.Builder()
        .instanceId(instanceId)
        .networkInterfaceId(instanceNetworkInterfaceId)
        .id(floatingIpId)
        .build();

      Response<FloatingIP> response = vpcService.getInstanceNetworkInterfaceFloatingIp(getInstanceNetworkInterfaceFloatingIpOptions).execute();
      FloatingIP floatingIp = response.getResult();

      // end-get_instance_network_interface_floating_ip
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listInstanceNetworkInterfaceIps() result:");
      // begin-list_instance_network_interface_ips
      ListInstanceNetworkInterfaceIpsOptions listInstanceNetworkInterfaceIpsOptions = new ListInstanceNetworkInterfaceIpsOptions.Builder()
        .instanceId(instanceId)
        .networkInterfaceId(instanceNetworkInterfaceId)
        .build();

      InstanceNetworkInterfaceIpsPager pager = new InstanceNetworkInterfaceIpsPager(vpcService, listInstanceNetworkInterfaceIpsOptions);
      List<ReservedIP> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<ReservedIP> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_instance_network_interface_ips
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getInstanceNetworkInterfaceIp() result:");
      // begin-get_instance_network_interface_ip
      GetInstanceNetworkInterfaceIpOptions getInstanceNetworkInterfaceIpOptions = new GetInstanceNetworkInterfaceIpOptions.Builder()
        .instanceId(instanceId)
        .networkInterfaceId(instanceNetworkInterfaceId)
        .id(instanceNetworkInterfaceReservedIp)
        .build();

      Response<ReservedIP> response = vpcService.getInstanceNetworkInterfaceIp(getInstanceNetworkInterfaceIpOptions).execute();
      ReservedIP reservedIp = response.getResult();

      // end-get_instance_network_interface_ip
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listInstanceVolumeAttachments() result:");
      // begin-list_instance_volume_attachments
      ListInstanceVolumeAttachmentsOptions listInstanceVolumeAttachmentsOptions = new ListInstanceVolumeAttachmentsOptions.Builder()
        .instanceId(instanceId)
        .build();

      Response<VolumeAttachmentCollection> response = vpcService.listInstanceVolumeAttachments(listInstanceVolumeAttachmentsOptions).execute();
      VolumeAttachmentCollection volumeAttachmentCollection = response.getResult();

      // end-list_instance_volume_attachments
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createInstanceVolumeAttachment() result:");
      // begin-create_instance_volume_attachment
      VolumeAttachmentPrototypeVolumeVolumeIdentityVolumeIdentityById volumeAttachmentPrototypeVolumeModel = new VolumeAttachmentPrototypeVolumeVolumeIdentityVolumeIdentityById.Builder()
        .id(volumeId)
        .build();
      CreateInstanceVolumeAttachmentOptions createInstanceVolumeAttachmentOptions = new CreateInstanceVolumeAttachmentOptions.Builder()
        .instanceId(instanceId)
        .name("my-volume-attachment")
        .volume(volumeAttachmentPrototypeVolumeModel)
        .build();

      Response<VolumeAttachment> response = vpcService.createInstanceVolumeAttachment(createInstanceVolumeAttachmentOptions).execute();
      VolumeAttachment volumeAttachment = response.getResult();

      // end-create_instance_volume_attachment
      instanceVolumeAttachmentId = volumeAttachment.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getInstanceVolumeAttachment() result:");
      // begin-get_instance_volume_attachment
      GetInstanceVolumeAttachmentOptions getInstanceVolumeAttachmentOptions = new GetInstanceVolumeAttachmentOptions.Builder()
        .instanceId(instanceId)
        .id(instanceVolumeAttachmentId)
        .build();

      Response<VolumeAttachment> response = vpcService.getInstanceVolumeAttachment(getInstanceVolumeAttachmentOptions).execute();
      VolumeAttachment volumeAttachment = response.getResult();

      // end-get_instance_volume_attachment
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateInstanceVolumeAttachment() result:");
      // begin-update_instance_volume_attachment
      VolumeAttachmentPatch volumeAttachmentPatchModel = new VolumeAttachmentPatch.Builder()
        .name("my-volume-attachment-update")
        .build();
      Map<String, Object> volumeAttachmentPatchModelAsPatch = volumeAttachmentPatchModel.asPatch();
      UpdateInstanceVolumeAttachmentOptions updateInstanceVolumeAttachmentOptions = new UpdateInstanceVolumeAttachmentOptions.Builder()
        .instanceId(instanceId)
        .id(instanceVolumeAttachmentId)
        .volumeAttachmentPatch(volumeAttachmentPatchModelAsPatch)
        .build();

      Response<VolumeAttachment> response = vpcService.updateInstanceVolumeAttachment(updateInstanceVolumeAttachmentOptions).execute();
      VolumeAttachment volumeAttachment = response.getResult();

      // end-update_instance_volume_attachment
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listInstanceGroups() result:");
      // begin-list_instance_groups
      ListInstanceGroupsOptions listInstanceGroupsOptions = new ListInstanceGroupsOptions.Builder()
        .limit(Long.valueOf(10))
        .build();

      InstanceGroupsPager pager = new InstanceGroupsPager(vpcService, listInstanceGroupsOptions);
      List<InstanceGroup> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<InstanceGroup> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_instance_groups
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createInstanceGroup() result:");
      // begin-create_instance_group
      InstanceTemplateIdentityById instanceTemplateIdentityModel = new InstanceTemplateIdentityById.Builder()
        .id(instanceTemplateId)
        .build();
      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
        .id(subnetId)
        .build();
      CreateInstanceGroupOptions createInstanceGroupOptions = new CreateInstanceGroupOptions.Builder()
        .instanceTemplate(instanceTemplateIdentityModel)
        .name("my-instance-group")
        .subnets(new java.util.ArrayList<SubnetIdentity>(java.util.Arrays.asList(subnetIdentityModel)))
        .build();

      Response<InstanceGroup> response = vpcService.createInstanceGroup(createInstanceGroupOptions).execute();
      InstanceGroup instanceGroup = response.getResult();

      // end-create_instance_group
      instanceGroupId = instanceGroup.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getInstanceGroup() result:");
      // begin-get_instance_group
      GetInstanceGroupOptions getInstanceGroupOptions = new GetInstanceGroupOptions.Builder()
        .id(instanceGroupId)
        .build();

      Response<InstanceGroup> response = vpcService.getInstanceGroup(getInstanceGroupOptions).execute();
      InstanceGroup instanceGroup = response.getResult();

      // end-get_instance_group
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateInstanceGroup() result:");
      // begin-update_instance_group
      InstanceGroupPatch instanceGroupPatchModel = new InstanceGroupPatch.Builder()
        .name("my-instancegroup-update")
        .build();
      Map<String, Object> instanceGroupPatchModelAsPatch = instanceGroupPatchModel.asPatch();
      UpdateInstanceGroupOptions updateInstanceGroupOptions = new UpdateInstanceGroupOptions.Builder()
        .id(instanceGroupId)
        .instanceGroupPatch(instanceGroupPatchModelAsPatch)
        .build();

      Response<InstanceGroup> response = vpcService.updateInstanceGroup(updateInstanceGroupOptions).execute();
      InstanceGroup instanceGroup = response.getResult();

      // end-update_instance_group
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listInstanceGroupManagers() result:");
      // begin-list_instance_group_managers
      ListInstanceGroupManagersOptions listInstanceGroupManagersOptions = new ListInstanceGroupManagersOptions.Builder()
        .instanceGroupId(instanceGroupId)
        .limit(Long.valueOf(10))
        .build();

      InstanceGroupManagersPager pager = new InstanceGroupManagersPager(vpcService, listInstanceGroupManagersOptions);
      List<InstanceGroupManager> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<InstanceGroupManager> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_instance_group_managers
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createInstanceGroupManager() result:");
      // begin-create_instance_group_manager
      InstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype instanceGroupManagerPrototypeModel = new InstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype.Builder()
        .managerType("autoscale")
        .maxMembershipCount(Long.valueOf("10"))
        .build();
      CreateInstanceGroupManagerOptions createInstanceGroupManagerOptions = new CreateInstanceGroupManagerOptions.Builder()
        .instanceGroupId(instanceGroupId)
        .instanceGroupManagerPrototype(instanceGroupManagerPrototypeModel)
        .build();

      Response<InstanceGroupManager> response = vpcService.createInstanceGroupManager(createInstanceGroupManagerOptions).execute();
      InstanceGroupManager instanceGroupManager = response.getResult();

      // end-create_instance_group_manager
      instanceGroupManagerId = instanceGroupManager.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getInstanceGroupManager() result:");
      // begin-get_instance_group_manager
      GetInstanceGroupManagerOptions getInstanceGroupManagerOptions = new GetInstanceGroupManagerOptions.Builder()
        .instanceGroupId(instanceGroupId)
        .id(instanceGroupManagerId)
        .build();

      Response<InstanceGroupManager> response = vpcService.getInstanceGroupManager(getInstanceGroupManagerOptions).execute();
      InstanceGroupManager instanceGroupManager = response.getResult();

      // end-get_instance_group_manager
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateInstanceGroupManager() result:");
      // begin-update_instance_group_manager
      InstanceGroupManagerPatch instanceGroupManagerPatchModel = new InstanceGroupManagerPatch.Builder()
        .name("my-instancegroupmanager-update")
        .build();
      Map<String, Object> instanceGroupManagerPatchModelAsPatch = instanceGroupManagerPatchModel.asPatch();
      UpdateInstanceGroupManagerOptions updateInstanceGroupManagerOptions = new UpdateInstanceGroupManagerOptions.Builder()
        .instanceGroupId(instanceGroupId)
        .id(instanceGroupManagerId)
        .instanceGroupManagerPatch(instanceGroupManagerPatchModelAsPatch)
        .build();

      Response<InstanceGroupManager> response = vpcService.updateInstanceGroupManager(updateInstanceGroupManagerOptions).execute();
      InstanceGroupManager instanceGroupManager = response.getResult();

      // end-update_instance_group_manager
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listInstanceGroupManagerActions() result:");
      // begin-list_instance_group_manager_actions
      ListInstanceGroupManagerActionsOptions listInstanceGroupManagerActionsOptions = new ListInstanceGroupManagerActionsOptions.Builder()
        .instanceGroupId(instanceGroupId)
        .instanceGroupManagerId(instanceGroupManagerId)
        .limit(Long.valueOf(10))
        .build();

      InstanceGroupManagerActionsPager pager = new InstanceGroupManagerActionsPager(vpcService, listInstanceGroupManagerActionsOptions);
      List<InstanceGroupManagerAction> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<InstanceGroupManagerAction> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_instance_group_manager_actions
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createInstanceGroupManagerAction() result:");
      // begin-create_instance_group_manager_action
      InstanceGroupManagerScheduledActionGroupPrototype instanceGroupManagerScheduledActionGroupPrototypeModel = new InstanceGroupManagerScheduledActionGroupPrototype.Builder()
        .membershipCount(Long.valueOf("10"))
        .build();
      InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByGroup instanceGroupManagerActionPrototypeModel = new InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByGroup.Builder()
        .group(instanceGroupManagerScheduledActionGroupPrototypeModel).cronSpec("*/5 1,2,3 * * *")
        .build();
      CreateInstanceGroupManagerActionOptions createInstanceGroupManagerActionOptions = new CreateInstanceGroupManagerActionOptions.Builder()
        .instanceGroupId(instanceGroupId)
        .instanceGroupManagerId(instanceGroupManagerId)
        .instanceGroupManagerActionPrototype(instanceGroupManagerActionPrototypeModel)
        .build();

      Response<InstanceGroupManagerAction> response = vpcService.createInstanceGroupManagerAction(createInstanceGroupManagerActionOptions).execute();
      InstanceGroupManagerAction instanceGroupManagerAction = response.getResult();

      // end-create_instance_group_manager_action
      instanceGroupManagerActionId = instanceGroupManagerAction.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getInstanceGroupManagerAction() result:");
      // begin-get_instance_group_manager_action
      GetInstanceGroupManagerActionOptions getInstanceGroupManagerActionOptions = new GetInstanceGroupManagerActionOptions.Builder()
        .instanceGroupId(instanceGroupId)
        .instanceGroupManagerId(instanceGroupManagerId)
        .id(instanceGroupManagerActionId)
        .build();

      Response<InstanceGroupManagerAction> response = vpcService.getInstanceGroupManagerAction(getInstanceGroupManagerActionOptions).execute();
      InstanceGroupManagerAction instanceGroupManagerAction = response.getResult();

      // end-get_instance_group_manager_action
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateInstanceGroupManagerAction() result:");
      // begin-update_instance_group_manager_action
      InstanceGroupManagerActionPatch instanceGroupManagerActionPatchModel = new InstanceGroupManagerActionPatch.Builder()
        .name("my-igmanageraction-update")
        .build();
      Map<String, Object> instanceGroupManagerActionPatchModelAsPatch = instanceGroupManagerActionPatchModel.asPatch();
      UpdateInstanceGroupManagerActionOptions updateInstanceGroupManagerActionOptions = new UpdateInstanceGroupManagerActionOptions.Builder()
        .instanceGroupId(instanceGroupId)
        .instanceGroupManagerId(instanceGroupManagerId)
        .id(instanceGroupManagerActionId)
        .instanceGroupManagerActionPatch(instanceGroupManagerActionPatchModelAsPatch)
        .build();

      Response<InstanceGroupManagerAction> response = vpcService.updateInstanceGroupManagerAction(updateInstanceGroupManagerActionOptions).execute();
      InstanceGroupManagerAction instanceGroupManagerAction = response.getResult();

      // end-update_instance_group_manager_action
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listInstanceGroupManagerPolicies() result:");
      // begin-list_instance_group_manager_policies
      ListInstanceGroupManagerPoliciesOptions listInstanceGroupManagerPoliciesOptions = new ListInstanceGroupManagerPoliciesOptions.Builder()
        .instanceGroupId(instanceGroupId)
        .instanceGroupManagerId(instanceGroupManagerId)
        .limit(Long.valueOf(10))
        .build();

      InstanceGroupManagerPoliciesPager pager = new InstanceGroupManagerPoliciesPager(vpcService, listInstanceGroupManagerPoliciesOptions);
      List<InstanceGroupManagerPolicy> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<InstanceGroupManagerPolicy> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_instance_group_manager_policies
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createInstanceGroupManagerPolicy() result:");
      // begin-create_instance_group_manager_policy
      InstanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototype instanceGroupManagerPolicyPrototypeModel = new InstanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototype.Builder()
        .metricType("cpu")
        .metricValue(Long.valueOf("26"))
        .policyType("target")
        .build();
      CreateInstanceGroupManagerPolicyOptions createInstanceGroupManagerPolicyOptions = new CreateInstanceGroupManagerPolicyOptions.Builder()
        .instanceGroupId(instanceGroupId)
        .instanceGroupManagerId(instanceGroupManagerId)
        .instanceGroupManagerPolicyPrototype(instanceGroupManagerPolicyPrototypeModel)
        .build();

      Response<InstanceGroupManagerPolicy> response = vpcService.createInstanceGroupManagerPolicy(createInstanceGroupManagerPolicyOptions).execute();
      InstanceGroupManagerPolicy instanceGroupManagerPolicy = response.getResult();

      // end-create_instance_group_manager_policy
      instanceGroupManagerPolicyId = instanceGroupManagerPolicy.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getInstanceGroupManagerPolicy() result:");
      // begin-get_instance_group_manager_policy
      GetInstanceGroupManagerPolicyOptions getInstanceGroupManagerPolicyOptions = new GetInstanceGroupManagerPolicyOptions.Builder()
        .instanceGroupId(instanceGroupId)
        .instanceGroupManagerId(instanceGroupManagerId)
        .id(instanceGroupManagerPolicyId)
        .build();

      Response<InstanceGroupManagerPolicy> response = vpcService.getInstanceGroupManagerPolicy(getInstanceGroupManagerPolicyOptions).execute();
      InstanceGroupManagerPolicy instanceGroupManagerPolicy = response.getResult();

      // end-get_instance_group_manager_policy
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateInstanceGroupManagerPolicy() result:");
      // begin-update_instance_group_manager_policy
      InstanceGroupManagerPolicyPatch instanceGroupManagerPolicyPatchModel = new InstanceGroupManagerPolicyPatch.Builder()
        .name("my-igmanagerpolicy-update")
        .build();
      Map<String, Object> instanceGroupManagerPolicyPatchModelAsPatch = instanceGroupManagerPolicyPatchModel.asPatch();
      UpdateInstanceGroupManagerPolicyOptions updateInstanceGroupManagerPolicyOptions = new UpdateInstanceGroupManagerPolicyOptions.Builder()
        .instanceGroupId(instanceGroupId)
        .instanceGroupManagerId(instanceGroupManagerId)
        .id(instanceGroupManagerPolicyId)
        .instanceGroupManagerPolicyPatch(instanceGroupManagerPolicyPatchModelAsPatch)
        .build();

      Response<InstanceGroupManagerPolicy> response = vpcService.updateInstanceGroupManagerPolicy(updateInstanceGroupManagerPolicyOptions).execute();
      InstanceGroupManagerPolicy instanceGroupManagerPolicy = response.getResult();

      // end-update_instance_group_manager_policy
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listInstanceGroupMemberships() result:");
      // begin-list_instance_group_memberships
      ListInstanceGroupMembershipsOptions listInstanceGroupMembershipsOptions = new ListInstanceGroupMembershipsOptions.Builder()
        .instanceGroupId(instanceGroupId)
        .limit(Long.valueOf(10))
        .build();

      InstanceGroupMembershipsPager pager = new InstanceGroupMembershipsPager(vpcService, listInstanceGroupMembershipsOptions);
      List<InstanceGroupMembership> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<InstanceGroupMembership> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_instance_group_memberships
      instanceGroupManagerMembershipId = allResults.get(0).getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getInstanceGroupMembership() result:");
      // begin-get_instance_group_membership
      GetInstanceGroupMembershipOptions getInstanceGroupMembershipOptions = new GetInstanceGroupMembershipOptions.Builder()
        .instanceGroupId(instanceGroupId)
        .id(instanceGroupManagerMembershipId)
        .build();

      Response<InstanceGroupMembership> response = vpcService.getInstanceGroupMembership(getInstanceGroupMembershipOptions).execute();
      InstanceGroupMembership instanceGroupMembership = response.getResult();

      // end-get_instance_group_membership
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateInstanceGroupMembership() result:");
      // begin-update_instance_group_membership
      InstanceGroupMembershipPatch instanceGroupMembershipPatchModel = new InstanceGroupMembershipPatch.Builder()
        .name("my-igmembership-update")
        .build();
      Map<String, Object> instanceGroupMembershipPatchModelAsPatch = instanceGroupMembershipPatchModel.asPatch();
      UpdateInstanceGroupMembershipOptions updateInstanceGroupMembershipOptions = new UpdateInstanceGroupMembershipOptions.Builder()
        .instanceGroupId(instanceGroupId)
        .id(instanceGroupManagerMembershipId)
        .instanceGroupMembershipPatch(instanceGroupMembershipPatchModelAsPatch)
        .build();

      Response<InstanceGroupMembership> response = vpcService.updateInstanceGroupMembership(updateInstanceGroupMembershipOptions).execute();
      InstanceGroupMembership instanceGroupMembership = response.getResult();

      // end-update_instance_group_membership
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listPlacementGroups() result:");
      // begin-list_placement_groups
      ListPlacementGroupsOptions listPlacementGroupsOptions = new ListPlacementGroupsOptions.Builder()
        .limit(Long.valueOf(10))
        .build();

      PlacementGroupsPager pager = new PlacementGroupsPager(vpcService, listPlacementGroupsOptions);
      List<PlacementGroup> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<PlacementGroup> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_placement_groups
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createPlacementGroup() result:");
      // begin-create_placement_group
      CreatePlacementGroupOptions createPlacementGroupOptions = new CreatePlacementGroupOptions.Builder()
        .name("my-placement-group")
        .strategy("host_spread")
        .build();

      Response<PlacementGroup> response = vpcService.createPlacementGroup(createPlacementGroupOptions).execute();
      PlacementGroup placementGroup = response.getResult();

      // end-create_placement_group
      placementGroupId = placementGroup.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getPlacementGroup() result:");
      // begin-get_placement_group
      GetPlacementGroupOptions getPlacementGroupOptions = new GetPlacementGroupOptions.Builder()
        .id(placementGroupId)
        .build();

      Response<PlacementGroup> response = vpcService.getPlacementGroup(getPlacementGroupOptions).execute();
      PlacementGroup placementGroup = response.getResult();

      // end-get_placement_group
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updatePlacementGroup() result:");
      // begin-update_placement_group
      PlacementGroupPatch placementGroupPatchModel = new PlacementGroupPatch.Builder()
        .name("my-placement-group-update")
        .build();
      Map<String, Object> placementGroupPatchModelAsPatch = placementGroupPatchModel.asPatch();
      UpdatePlacementGroupOptions updatePlacementGroupOptions = new UpdatePlacementGroupOptions.Builder()
        .id(placementGroupId)
        .placementGroupPatch(placementGroupPatchModelAsPatch)
        .build();

      Response<PlacementGroup> response = vpcService.updatePlacementGroup(updatePlacementGroupOptions).execute();
      PlacementGroup placementGroup = response.getResult();

      // end-update_placement_group
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listBareMetalServerProfiles() result:");
      // begin-list_bare_metal_server_profiles
      ListBareMetalServerProfilesOptions listBareMetalServerProfilesOptions = new ListBareMetalServerProfilesOptions.Builder()
              .build();

      BareMetalServerProfilesPager pager = new BareMetalServerProfilesPager(vpcService, listBareMetalServerProfilesOptions);
      List<BareMetalServerProfile> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<BareMetalServerProfile> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_bare_metal_server_profiles
      bareMetalServerProfileName = allResults.get(0).getName();
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getBareMetalServerProfile() result:");
      // begin-get_bare_metal_server_profile
      GetBareMetalServerProfileOptions getBareMetalServerProfileOptions = new GetBareMetalServerProfileOptions.Builder()
              .name(bareMetalServerProfileName)
              .build();

      Response<BareMetalServerProfile> response = vpcService.getBareMetalServerProfile(getBareMetalServerProfileOptions).execute();
      BareMetalServerProfile bareMetalServerProfile = response.getResult();

      // end-get_bare_metal_server_profile
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listBareMetalServers() result:");
      // begin-list_bare_metal_servers
      ListBareMetalServersOptions listBareMetalServersOptions = new ListBareMetalServersOptions.Builder()
              .build();

      BareMetalServersPager pager = new BareMetalServersPager(vpcService, listBareMetalServersOptions);
      List<BareMetalServer> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<BareMetalServer> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_bare_metal_servers
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createBareMetalServer() result:");
      // begin-create_bare_metal_server
      ImageIdentityById imageIdentityModel = new ImageIdentityById.Builder()
              .id(imageId)
              .build();
      KeyIdentityById keyIdentityModel = new KeyIdentityById.Builder()
              .id(keyId)
              .build();
      BareMetalServerInitializationPrototype bareMetalServerInitializationPrototypeModel = new BareMetalServerInitializationPrototype.Builder()
              .image(imageIdentityModel)
              .keys(new java.util.ArrayList<KeyIdentity>(java.util.Arrays.asList(keyIdentityModel)))
              .build();
      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
              .id(subnetId)
              .build();
      Long[] allowedValns = {4L};
      BareMetalServerPrimaryNetworkInterfacePrototype bareMetalServerPrimaryNetworkInterfacePrototypeModel = new BareMetalServerPrimaryNetworkInterfacePrototype.Builder()
              .interfaceType("pci")
              .allowedVlans(new java.util.ArrayList<Long>(java.util.Arrays.asList(allowedValns)))
              .enableInfrastructureNat(true)
              .name("my-bare-metal-server-network-interface")
              .subnet(subnetIdentityModel)
              .build();
      BareMetalServerProfileIdentityByName bareMetalServerProfileIdentityModel = new BareMetalServerProfileIdentityByName.Builder()
              .name(bareMetalServerProfileName)
              .build();
      VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
              .id(vpcId)
              .build();
      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
              .name(zoneName)
              .build();
      BareMetalServerPrototypeBareMetalServerByNetworkInterface bareMetalServerPrototype = new BareMetalServerPrototypeBareMetalServerByNetworkInterface.Builder()
              .initialization(bareMetalServerInitializationPrototypeModel)
              .primaryNetworkInterface(bareMetalServerPrimaryNetworkInterfacePrototypeModel)
              .profile(bareMetalServerProfileIdentityModel)
              .name("my-bare-metal-server")
              .vpc(vpcIdentityModel)
              .zone(zoneIdentityModel)
              .build();
      CreateBareMetalServerOptions createBareMetalServerOptions = new CreateBareMetalServerOptions.Builder()
              .bareMetalServerPrototype(bareMetalServerPrototype)
              .build();

      Response<BareMetalServer> response = vpcService.createBareMetalServer(createBareMetalServerOptions).execute();
      BareMetalServer bareMetalServer = response.getResult();

      // end-create_bare_metal_server
      bareMetalServerId = bareMetalServer.getId();
      bareMetalServerDiskId = bareMetalServer.getDisks().get(0).getId();
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

   try {
     System.out.println("createBareMetalServerConsoleAccessToken() result:");
     // begin-create_bare_metal_server_console_access_token
     CreateBareMetalServerConsoleAccessTokenOptions createBareMetalServerConsoleAccessTokenOptions = new CreateBareMetalServerConsoleAccessTokenOptions.Builder()
             .bareMetalServerId(bareMetalServerId)
             .consoleType("serial")
             .build();

     Response<BareMetalServerConsoleAccessToken> response = vpcService.createBareMetalServerConsoleAccessToken(createBareMetalServerConsoleAccessTokenOptions).execute();
     BareMetalServerConsoleAccessToken bareMetalServerConsoleAccessToken = response.getResult();

     // end-create_bare_metal_server_console_access_token
   } catch (ServiceResponseException e) {
     logger.error(String.format("Service returned status code %s: %s%nError details: %s",
             e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
   }

    try {
      System.out.println("listBareMetalServerDisks() result:");
      // begin-list_bare_metal_server_disks
      ListBareMetalServerDisksOptions listBareMetalServerDisksOptions = new ListBareMetalServerDisksOptions.Builder()
              .bareMetalServerId(bareMetalServerId)
              .build();

      Response<BareMetalServerDiskCollection> response = vpcService.listBareMetalServerDisks(listBareMetalServerDisksOptions).execute();
      BareMetalServerDiskCollection bareMetalServerDiskCollection = response.getResult();

      // end-list_bare_metal_server_disks
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getBareMetalServerDisk() result:");
      // begin-get_bare_metal_server_disk
      GetBareMetalServerDiskOptions getBareMetalServerDiskOptions = new GetBareMetalServerDiskOptions.Builder()
              .bareMetalServerId(bareMetalServerId)
              .id(bareMetalServerDiskId)
              .build();

      Response<BareMetalServerDisk> response = vpcService.getBareMetalServerDisk(getBareMetalServerDiskOptions).execute();
      BareMetalServerDisk bareMetalServerDisk = response.getResult();

      // end-get_bare_metal_server_disk
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateBareMetalServerDisk() result:");
      // begin-update_bare_metal_server_disk
      BareMetalServerDiskPatch bareMetalServerDiskPatchModel = new BareMetalServerDiskPatch.Builder()
              .name("my-bare-metal-server-disk-update")
              .build();
      Map<String, Object> bareMetalServerDiskPatchModelAsPatch = bareMetalServerDiskPatchModel.asPatch();
      UpdateBareMetalServerDiskOptions updateBareMetalServerDiskOptions = new UpdateBareMetalServerDiskOptions.Builder()
              .bareMetalServerId(bareMetalServerId)
              .id(bareMetalServerDiskId)
              .bareMetalServerDiskPatch(bareMetalServerDiskPatchModelAsPatch)
              .build();

      Response<BareMetalServerDisk> response = vpcService.updateBareMetalServerDisk(updateBareMetalServerDiskOptions).execute();
      BareMetalServerDisk bareMetalServerDisk = response.getResult();

      // end-update_bare_metal_server_disk
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listBareMetalServerNetworkInterfaces() result:");
      // begin-list_bare_metal_server_network_interfaces
      ListBareMetalServerNetworkInterfacesOptions listBareMetalServerNetworkInterfacesOptions = new ListBareMetalServerNetworkInterfacesOptions.Builder()
              .bareMetalServerId(bareMetalServerId)
              .build();

      BareMetalServerNetworkInterfacesPager pager = new BareMetalServerNetworkInterfacesPager(vpcService, listBareMetalServerNetworkInterfacesOptions);
      List<BareMetalServerNetworkInterface> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<BareMetalServerNetworkInterface> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_bare_metal_server_network_interfaces
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createBareMetalServerNetworkInterface() result:");
      // begin-create_bare_metal_server_network_interface
      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
              .id(subnetId)
              .build();
      BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototype bareMetalServerNetworkInterfacePrototypeModel = new BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototype.Builder()
              .interfaceType("vlan")
              .name("my-bare-metal-server-network-interface")
              .enableInfrastructureNat(true)
              .subnet(subnetIdentityModel)
              .vlan(Long.valueOf("4"))
              .build();
      CreateBareMetalServerNetworkInterfaceOptions createBareMetalServerNetworkInterfaceOptions = new CreateBareMetalServerNetworkInterfaceOptions.Builder()
              .bareMetalServerId(bareMetalServerId)
              .bareMetalServerNetworkInterfacePrototype(bareMetalServerNetworkInterfacePrototypeModel)
              .build();

      Response<BareMetalServerNetworkInterface> response = vpcService.createBareMetalServerNetworkInterface(createBareMetalServerNetworkInterfaceOptions).execute();
      BareMetalServerNetworkInterface bareMetalServerNetworkInterface = response.getResult();

      // end-create_bare_metal_server_network_interface
      bareMetalServerNetworkInterfaceId = bareMetalServerNetworkInterface.getId();
      bareMetalServerNetworkInterfaceReservedIp = bareMetalServerNetworkInterface.getPrimaryIp().getId();
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getBareMetalServerNetworkInterface() result:");
      // begin-get_bare_metal_server_network_interface
      GetBareMetalServerNetworkInterfaceOptions getBareMetalServerNetworkInterfaceOptions = new GetBareMetalServerNetworkInterfaceOptions.Builder()
              .bareMetalServerId(bareMetalServerId)
              .id(bareMetalServerNetworkInterfaceId)
              .build();

      Response<BareMetalServerNetworkInterface> response = vpcService.getBareMetalServerNetworkInterface(getBareMetalServerNetworkInterfaceOptions).execute();
      BareMetalServerNetworkInterface bareMetalServerNetworkInterface = response.getResult();

      // end-get_bare_metal_server_network_interface
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateBareMetalServerNetworkInterface() result:");
      // begin-update_bare_metal_server_network_interface
      BareMetalServerNetworkInterfacePatch bareMetalServerNetworkInterfacePatchModel = new BareMetalServerNetworkInterfacePatch.Builder()
              .name("my-bare-metal-server-network-interface-update")
              .build();
      Map<String, Object> bareMetalServerNetworkInterfacePatchModelAsPatch = bareMetalServerNetworkInterfacePatchModel.asPatch();
      UpdateBareMetalServerNetworkInterfaceOptions updateBareMetalServerNetworkInterfaceOptions = new UpdateBareMetalServerNetworkInterfaceOptions.Builder()
              .bareMetalServerId(bareMetalServerId)
              .id(bareMetalServerNetworkInterfaceId)
              .bareMetalServerNetworkInterfacePatch(bareMetalServerNetworkInterfacePatchModelAsPatch)
              .build();

      Response<BareMetalServerNetworkInterface> response = vpcService.updateBareMetalServerNetworkInterface(updateBareMetalServerNetworkInterfaceOptions).execute();
      BareMetalServerNetworkInterface bareMetalServerNetworkInterface = response.getResult();

      // end-update_bare_metal_server_network_interface
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("addBareMetalServerNetworkInterfaceFloatingIp() result:");
      // begin-add_bare_metal_server_network_interface_floating_ip
      AddBareMetalServerNetworkInterfaceFloatingIpOptions addBareMetalServerNetworkInterfaceFloatingIpOptions = new AddBareMetalServerNetworkInterfaceFloatingIpOptions.Builder()
              .bareMetalServerId(bareMetalServerId)
              .networkInterfaceId(bareMetalServerNetworkInterfaceId)
              .id(floatingIpId)
              .build();

      Response<FloatingIP> response = vpcService.addBareMetalServerNetworkInterfaceFloatingIp(addBareMetalServerNetworkInterfaceFloatingIpOptions).execute();
      FloatingIP floatingIp = response.getResult();

      // end-add_bare_metal_server_network_interface_floating_ip
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listBareMetalServerNetworkInterfaceFloatingIps() result:");
      // begin-list_bare_metal_server_network_interface_floating_ips
      ListBareMetalServerNetworkInterfaceFloatingIpsOptions listBareMetalServerNetworkInterfaceFloatingIpsOptions = new ListBareMetalServerNetworkInterfaceFloatingIpsOptions.Builder()
              .bareMetalServerId(bareMetalServerId)
              .networkInterfaceId(bareMetalServerNetworkInterfaceId)
              .build();

      Response<FloatingIPUnpaginatedCollection> response = vpcService.listBareMetalServerNetworkInterfaceFloatingIps(listBareMetalServerNetworkInterfaceFloatingIpsOptions).execute();
      FloatingIPUnpaginatedCollection floatingIpUnpaginatedCollection = response.getResult();

      // end-list_bare_metal_server_network_interface_floating_ips
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getBareMetalServerNetworkInterfaceFloatingIp() result:");
      // begin-get_bare_metal_server_network_interface_floating_ip
      GetBareMetalServerNetworkInterfaceFloatingIpOptions getBareMetalServerNetworkInterfaceFloatingIpOptions = new GetBareMetalServerNetworkInterfaceFloatingIpOptions.Builder()
              .bareMetalServerId(bareMetalServerId)
              .networkInterfaceId(bareMetalServerNetworkInterfaceId)
              .id(floatingIpId)
              .build();

      Response<FloatingIP> response = vpcService.getBareMetalServerNetworkInterfaceFloatingIp(getBareMetalServerNetworkInterfaceFloatingIpOptions).execute();
      FloatingIP floatingIp = response.getResult();

      // end-get_bare_metal_server_network_interface_floating_ip
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getBareMetalServer() result:");
      // begin-get_bare_metal_server
      GetBareMetalServerOptions getBareMetalServerOptions = new GetBareMetalServerOptions.Builder()
              .id(bareMetalServerId)
              .build();

      Response<BareMetalServer> response = vpcService.getBareMetalServer(getBareMetalServerOptions).execute();
      BareMetalServer bareMetalServer = response.getResult();

      // end-get_bare_metal_server
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateBareMetalServer() result:");
      // begin-update_bare_metal_server
      BareMetalServerPatch bareMetalServerPatchModel = new BareMetalServerPatch.Builder()
              .build();
      Map<String, Object> bareMetalServerPatchModelAsPatch = bareMetalServerPatchModel.asPatch();
      UpdateBareMetalServerOptions updateBareMetalServerOptions = new UpdateBareMetalServerOptions.Builder()
              .id(bareMetalServerId)
              .bareMetalServerPatch(bareMetalServerPatchModelAsPatch)
              .build();

      Response<BareMetalServer> response = vpcService.updateBareMetalServer(updateBareMetalServerOptions).execute();
      BareMetalServer bareMetalServer = response.getResult();

      // end-update_bare_metal_server
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getBareMetalServerInitialization() result:");
      // begin-get_bare_metal_server_initialization
      GetBareMetalServerInitializationOptions getBareMetalServerInitializationOptions = new GetBareMetalServerInitializationOptions.Builder()
              .id(bareMetalServerId)
              .build();

      Response<BareMetalServerInitialization> response = vpcService.getBareMetalServerInitialization(getBareMetalServerInitializationOptions).execute();
      BareMetalServerInitialization bareMetalServerInitialization = response.getResult();

      // end-get_bare_metal_server_initialization
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-restart_bare_metal_server
      RestartBareMetalServerOptions restartBareMetalServerOptions = new RestartBareMetalServerOptions.Builder()
              .id(bareMetalServerId)
              .build();

      Response<Void> response = vpcService.restartBareMetalServer(restartBareMetalServerOptions).execute();
      // end-restart_bare_metal_server
      System.out.printf("restartBareMetalServer() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-stop_bare_metal_server
      StopBareMetalServerOptions stopBareMetalServerOptions = new StopBareMetalServerOptions.Builder()
              .id(bareMetalServerId)
              .type("soft")
              .build();

      Response<Void> response = vpcService.stopBareMetalServer(stopBareMetalServerOptions).execute();
      // end-stop_bare_metal_server
      System.out.printf("stopBareMetalServer() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-start_bare_metal_server
      StartBareMetalServerOptions startBareMetalServerOptions = new StartBareMetalServerOptions.Builder()
              .id(bareMetalServerId)
              .build();

      Response<Void> response = vpcService.startBareMetalServer(startBareMetalServerOptions).execute();
      // end-start_bare_metal_server
      System.out.printf("startBareMetalServer() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listSnapshots() result:");
      // begin-list_snapshots
      ListSnapshotsOptions listSnapshotsOptions = new ListSnapshotsOptions.Builder()
        .sort("name")
        .limit(Long.valueOf(10))
        .build();

      SnapshotsPager pager = new SnapshotsPager(vpcService, listSnapshotsOptions);
      List<Snapshot> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<Snapshot> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_snapshots
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createSnapshot() result:");
      VolumeIdentityById volumeIdentityModel1 = new VolumeIdentityById.Builder()
              .id(sourceVolume)
              .build();
      SnapshotPrototypeSnapshotBySourceVolume snapshotPrototypeModel = new SnapshotPrototypeSnapshotBySourceVolume.Builder()
              .sourceVolume(volumeIdentityModel1)
              .name("my-snapshot-1")
              .build();
      CreateSnapshotOptions createSnapshotOptions1 = new CreateSnapshotOptions.Builder()
              .snapshotPrototype(snapshotPrototypeModel)
              .build();

      Response<Snapshot> response1 = vpcService.createSnapshot(createSnapshotOptions1).execute();
      Snapshot snapshot1 = response1.getResult();

      snapshotCopyCRN = snapshot1.getCrn();
      // begin-create_snapshot

      SnapshotIdentityByCRN snapshotIdentityByCRN = new SnapshotIdentityByCRN.Builder()
              .crn(snapshotCopyCRN)
              .build();
      SnapshotPrototypeSnapshotBySourceSnapshot snapshotPrototypeCopyModel = new SnapshotPrototypeSnapshotBySourceSnapshot.Builder()
              .sourceSnapshot(snapshotIdentityByCRN)
              .name("my-snapshot-copy")
              .build();
      CreateSnapshotOptions createSnapshotCopyOptions = new CreateSnapshotOptions.Builder()
              .snapshotPrototype(snapshotPrototypeCopyModel)
              .build();

      Response<Snapshot> responsesnapshotcopy = vpcService.createSnapshot(createSnapshotCopyOptions).execute();
      Snapshot snapshotcopy = responsesnapshotcopy.getResult();


      VolumeIdentityById volumeIdentityModel = new VolumeIdentityById.Builder()
        .id(sourceVolume)
        .build();
      SnapshotPrototypeSnapshotBySourceVolume snapshotPrototypeModel1 = new SnapshotPrototypeSnapshotBySourceVolume.Builder()
        .sourceVolume(volumeIdentityModel)
        .name("my-snapshot")
        .build();
      CreateSnapshotOptions createSnapshotOptions = new CreateSnapshotOptions.Builder()
        .snapshotPrototype(snapshotPrototypeModel1)
        .build();

      Response<Snapshot> response = vpcService.createSnapshot(createSnapshotOptions).execute();
      Snapshot snapshot = response.getResult();

      // end-create_snapshot
      snapshotCopyId = snapshotcopy.getId();
      ifMatchSnapshotCopy = responsesnapshotcopy.getHeaders().values("etag").get(0);
      snapshotId = snapshot.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getSnapshot() result:");
      // begin-get_snapshot
      GetSnapshotOptions getSnapshotOptions = new GetSnapshotOptions.Builder()
        .id(snapshotId)
        .build();

      Response<Snapshot> response = vpcService.getSnapshot(getSnapshotOptions).execute();
      Snapshot snapshot = response.getResult();

      // end-get_snapshot
      ifMatchSnapshotCopy = response.getHeaders().values("etag").get(0);
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateSnapshot() result:");
      // begin-update_snapshot
      SnapshotPatch snapshotPatchModel = new SnapshotPatch.Builder()
        .name("my-snapshot-update")
        .build();
      Map<String, Object> snapshotPatchModelAsPatch = snapshotPatchModel.asPatch();
      UpdateSnapshotOptions updateSnapshotOptions = new UpdateSnapshotOptions.Builder()
        .id(snapshotId)
        .snapshotPatch(snapshotPatchModelAsPatch)
        .build();

      Response<Snapshot> response = vpcService.updateSnapshot(updateSnapshotOptions).execute();
      Snapshot snapshot = response.getResult();

      // end-update_snapshot
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createSnapshotClone() result:");
      // begin-create_snapshot_clone
      CreateSnapshotCloneOptions createSnapshotCloneOptions = new CreateSnapshotCloneOptions.Builder()
        .id(snapshotId)
        .zoneName(zoneName)
        .build();

      Response<SnapshotClone> response = vpcService.createSnapshotClone(createSnapshotCloneOptions).execute();
      SnapshotClone snapshotClone = response.getResult();

      // end-create_snapshot_clone
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listShareProfiles() result:");
      // begin-list_share_profiles
      ListShareProfilesOptions listShareProfilesOptions = new ListShareProfilesOptions.Builder()
        .limit(Long.valueOf("10"))
        .sort("name")
        .build();

      ShareProfilesPager pager = new ShareProfilesPager(vpcService, listShareProfilesOptions);
      List<ShareProfile> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<ShareProfile> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }
      // end-list_share_profiles
      shareProfileName = allResults.get(0).getName();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getShareProfile() result:");
      // begin-get_share_profile
      GetShareProfileOptions getShareProfileOptions = new GetShareProfileOptions.Builder()
        .name(shareProfileName)
        .build();

      Response<ShareProfile> response = vpcService.getShareProfile(getShareProfileOptions).execute();
      ShareProfile shareProfile = response.getResult();

      // end-get_share_profile
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listShares() result:");
      // begin-list_shares
      ListSharesOptions listSharesOptions = new ListSharesOptions.Builder()
        .limit(Long.valueOf("10"))
        .sort("name")
        .build();

      SharesPager pager = new SharesPager(vpcService, listSharesOptions);
      List<Share> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<Share> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_shares
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createShare() result:");
      // begin-create_share
      ShareProfileIdentityByName shareProfileIdentityModel = new ShareProfileIdentityByName.Builder()
        .name(shareProfileName)
        .build();
      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
        .name(zoneName)
        .build();
      SharePrototypeShareBySize sharePrototypeModel = new SharePrototypeShareBySize.Builder()
        .profile(shareProfileIdentityModel)
        .zone(zoneIdentityModel)
        .size(Long.valueOf("200"))
        .name("my-share")
        .build();
      CreateShareOptions createShareOptions = new CreateShareOptions.Builder()
        .sharePrototype(sharePrototypeModel)
        .build();

      Response<Share> response = vpcService.createShare(createShareOptions).execute();
      Share share = response.getResult();

      // share replica
      ShareIdentity shareIdentity = new ShareIdentityById.Builder()
        .id(share.getId())
        .build();
      SharePrototypeShareBySourceShare shareReplicaPrototypeModel = new SharePrototypeShareBySourceShare.Builder()
        .profile(shareProfileIdentityModel)
        .zone(zoneIdentityModel)
        .name("my-share-replica")
        .sourceShare(shareIdentity)
        .build();
      CreateShareOptions createReplicaShareOptions = new CreateShareOptions.Builder()
        .sharePrototype(shareReplicaPrototypeModel)
        .build();
      Response<Share> responseReplica = vpcService.createShare(createReplicaShareOptions).execute();
      Share shareReplica = response.getResult();
      // end-create_share
      shareId = share.getId();
      shareReplicaId = shareReplica.getId();
      ifMatchShareReplica = responseReplica.getHeaders().values("etag").get(0);
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getShare() result:");
      // begin-get_share
      GetShareOptions getShareOptions = new GetShareOptions.Builder()
        .id(shareId)
        .build();

      Response<Share> response = vpcService.getShare(getShareOptions).execute();
      Share share = response.getResult();

      // end-get_share
      ifMatchShare = response.getHeaders().values("etag").get(0);
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateShare() result:");
      // begin-update_share
      SharePatch sharePatchModel = new SharePatch.Builder()
        .name("my-share-update")
        .build();
      Map<String, Object> sharePatchModelAsPatch = sharePatchModel.asPatch();
      UpdateShareOptions updateShareOptions = new UpdateShareOptions.Builder()
        .id(shareId)
        .sharePatch(sharePatchModelAsPatch)
        .ifMatch(ifMatchShare)
        .build();

      Response<Share> response = vpcService.updateShare(updateShareOptions).execute();
      Share share = response.getResult();

      // end-update_share
      ifMatchShare = response.getHeaders().values("etag").get(0);

    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-failover_share
      FailoverShareOptions failoverShareOptions = new FailoverShareOptions.Builder()
        .shareId(shareReplicaId)
        .build();

      Response<Void> response = vpcService.failoverShare(failoverShareOptions).execute();
      // end-failover_share
      System.out.printf("failoverShare() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listShareMountTargets() result:");
      // begin-list_share_mount_targets
      ListShareMountTargetsOptions listShareMountTargetsOptions = new ListShareMountTargetsOptions.Builder()
        .limit(Long.valueOf("10"))
        .build();

      ShareMountTargetsPager pager = new ShareMountTargetsPager(vpcService, listShareMountTargetsOptions);
      List<ShareMountTarget> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<ShareMountTarget> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_share_mount_targets
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createShareMountTarget() result:");
      // begin-create_share_mount_target
      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
        .id(subnetId)
        .build();
      ShareMountTargetVirtualNetworkInterfacePrototypeVirtualNetworkInterfacePrototypeShareMountTargetContext shareMountTargetVirtualNetworkInterfacePrototypeModel = new ShareMountTargetVirtualNetworkInterfacePrototypeVirtualNetworkInterfacePrototypeShareMountTargetContext.Builder()
        .name("my-share-vni")
        .subnet(subnetIdentityModel)
        .build();
      ShareMountTargetPrototypeShareMountTargetByAccessControlModeSecurityGroup shareMountTargetPrototypeModel = new ShareMountTargetPrototypeShareMountTargetByAccessControlModeSecurityGroup.Builder()
        .virtualNetworkInterface(shareMountTargetVirtualNetworkInterfacePrototypeModel)
        .name("my-share-mount-target")
        .build();
      CreateShareMountTargetOptions createShareMountTargetOptions = new CreateShareMountTargetOptions.Builder()
        .shareId(shareId)
        .shareMountTargetPrototype(shareMountTargetPrototypeModel)
        .build();

      Response<ShareMountTarget> response = vpcService.createShareMountTarget(createShareMountTargetOptions).execute();
      ShareMountTarget shareMountTarget = response.getResult();

      // end-create_share_mount_target
      shareMountTargetId = shareMountTarget.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getShareMountTarget() result:");
      // begin-get_share_mount_target
      GetShareMountTargetOptions getShareMountTargetOptions = new GetShareMountTargetOptions.Builder()
        .shareId(shareId)
        .id(shareMountTargetId)
        .build();

      Response<ShareMountTarget> response = vpcService.getShareMountTarget(getShareMountTargetOptions).execute();
      ShareMountTarget shareMountTarget = response.getResult();

      // end-get_share_mount_target
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateShareMountTarget() result:");
      // begin-update_share_mount_target
      ShareMountTargetPatch shareMountTargetPatchModel = new ShareMountTargetPatch.Builder()
        .name("my-share-mount-target-updated")
        .build();
      Map<String, Object> shareMountTargetPatchModelAsPatch = shareMountTargetPatchModel.asPatch();
      UpdateShareMountTargetOptions updateShareMountTargetOptions = new UpdateShareMountTargetOptions.Builder()
        .shareId(shareId)
        .id(shareMountTargetId)
        .shareMountTargetPatch(shareMountTargetPatchModelAsPatch)
        .build();

      Response<ShareMountTarget> response = vpcService.updateShareMountTarget(updateShareMountTargetOptions).execute();
      ShareMountTarget shareMountTarget = response.getResult();

      System.out.println(shareMountTarget);
      // end-update_share_mount_target
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getShareSource() result:");
      // begin-get_share_source
      GetShareSourceOptions getShareSourceOptions = new GetShareSourceOptions.Builder()
        .shareId(shareId)
        .build();

      Response<ShareReference> response = vpcService.getShareSource(getShareSourceOptions).execute();
      ShareReference share = response.getResult();

      // end-get_share_source
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listSnapshotClones() result:");
      // begin-list_snapshot_clones
      ListSnapshotClonesOptions listSnapshotClonesOptions = new ListSnapshotClonesOptions.Builder()
        .id(snapshotId)
        .build();

      Response<SnapshotCloneCollection> response = vpcService.listSnapshotClones(listSnapshotClonesOptions).execute();
      SnapshotCloneCollection snapshotCloneCollection = response.getResult();

      // end-list_snapshot_clones
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getSnapshotClone() result:");
      // begin-get_snapshot_clone
      GetSnapshotCloneOptions getSnapshotCloneOptions = new GetSnapshotCloneOptions.Builder()
        .id(snapshotId)
        .zoneName(zoneName)
        .build();

      Response<SnapshotClone> response = vpcService.getSnapshotClone(getSnapshotCloneOptions).execute();
      SnapshotClone snapshotClone = response.getResult();

      // end-get_snapshot_clone
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listRegions() result:");
      // begin-list_regions
      ListRegionsOptions listRegionsOptions = new ListRegionsOptions();

      Response<RegionCollection> response = vpcService.listRegions(listRegionsOptions).execute();
      RegionCollection regionCollection = response.getResult();

      // end-list_regions
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getRegion() result:");
      // begin-get_region
      GetRegionOptions getRegionOptions = new GetRegionOptions.Builder()
        .name(regionName)
        .build();

      Response<Region> response = vpcService.getRegion(getRegionOptions).execute();
      Region region = response.getResult();

      // end-get_region
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listRegionZones() result:");
      // begin-list_region_zones
      ListRegionZonesOptions listRegionZonesOptions = new ListRegionZonesOptions.Builder()
        .regionName(regionName)
        .build();

      Response<ZoneCollection> response = vpcService.listRegionZones(listRegionZonesOptions).execute();
      ZoneCollection zoneCollection = response.getResult();

      // end-list_region_zones
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getRegionZone() result:");
      // begin-get_region_zone
      GetRegionZoneOptions getRegionZoneOptions = new GetRegionZoneOptions.Builder()
        .regionName(regionName)
        .name(zoneName)
        .build();

      Response<Zone> response = vpcService.getRegionZone(getRegionZoneOptions).execute();
      Zone zone = response.getResult();

      // end-get_region_zone
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }


    try {
      System.out.println("listClusterNetworkProfiles() result:");
      // begin-list_cluster_network_profiles
      ListClusterNetworkProfilesOptions listClusterNetworkProfilesOptions = new ListClusterNetworkProfilesOptions.Builder()
        .limit(Long.valueOf("10"))
        .build();

      ClusterNetworkProfilesPager pager = new ClusterNetworkProfilesPager(vpcService, listClusterNetworkProfilesOptions);
      List<ClusterNetworkProfile> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<ClusterNetworkProfile> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_cluster_network_profiles
      clusterNetworkProfileName = allResults.get(0).getName();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getClusterNetworkProfile() result:");
      // begin-get_cluster_network_profile
      GetClusterNetworkProfileOptions getClusterNetworkProfileOptions = new GetClusterNetworkProfileOptions.Builder()
        .name(clusterNetworkProfileName)
        .build();

      Response<ClusterNetworkProfile> response = vpcService.getClusterNetworkProfile(getClusterNetworkProfileOptions).execute();
      ClusterNetworkProfile clusterNetworkProfile = response.getResult();

      System.out.println(clusterNetworkProfile);
      // end-get_cluster_network_profile
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listClusterNetworks() result:");
      // begin-list_cluster_networks
      ListClusterNetworksOptions listClusterNetworksOptions = new ListClusterNetworksOptions.Builder()
        .limit(Long.valueOf("10"))
        .vpcId(vpcId)
        .build();

      ClusterNetworksPager pager = new ClusterNetworksPager(vpcService, listClusterNetworksOptions);
      List<ClusterNetwork> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<ClusterNetwork> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_cluster_networks
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createClusterNetwork() result:");
      // begin-create_cluster_network
      ClusterNetworkProfileIdentityByName clusterNetworkProfileIdentityModel = new ClusterNetworkProfileIdentityByName.Builder()
        .name(clusterNetworkProfileName)
        .build();
      VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
        .id(vpcId)
        .build();
      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
        .name(zoneName)
        .build();
      CreateClusterNetworkOptions createClusterNetworkOptions = new CreateClusterNetworkOptions.Builder()
        .profile(clusterNetworkProfileIdentityModel)
        .name("my-cluster-network")
        .vpc(vpcIdentityModel)
        .zone(zoneIdentityModel)
        .build();

      Response<ClusterNetwork> response = vpcService.createClusterNetwork(createClusterNetworkOptions).execute();
      ClusterNetwork clusterNetwork = response.getResult();

      // end-create_cluster_network
      clusterNetworkId = clusterNetwork.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listClusterNetworkInterfaces() result:");
      // begin-list_cluster_network_interfaces
      ListClusterNetworkInterfacesOptions listClusterNetworkInterfacesOptions = new ListClusterNetworkInterfacesOptions.Builder()
        .clusterNetworkId(clusterNetworkId)
        .limit(Long.valueOf("10"))
        .build();

      ClusterNetworkInterfacesPager pager = new ClusterNetworkInterfacesPager(vpcService, listClusterNetworkInterfacesOptions);
      List<ClusterNetworkInterface> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<ClusterNetworkInterface> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_cluster_network_interfaces
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createClusterNetworkInterface() result:");
      // begin-create_cluster_network_interface
      CreateClusterNetworkInterfaceOptions createClusterNetworkInterfaceOptions = new CreateClusterNetworkInterfaceOptions.Builder()
        .clusterNetworkId(clusterNetworkId)
        .name("my-cluster-network-interface")
        .build();

      Response<ClusterNetworkInterface> response = vpcService.createClusterNetworkInterface(createClusterNetworkInterfaceOptions).execute();
      ClusterNetworkInterface clusterNetworkInterface = response.getResult();

      // end-create_cluster_network_interface
      clusterNetworkInterfaceId = clusterNetworkInterface.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getClusterNetworkInterface() result:");
      // begin-get_cluster_network_interface
      GetClusterNetworkInterfaceOptions getClusterNetworkInterfaceOptions = new GetClusterNetworkInterfaceOptions.Builder()
        .clusterNetworkId(clusterNetworkId)
        .id(clusterNetworkInterfaceId)
        .build();

      Response<ClusterNetworkInterface> response = vpcService.getClusterNetworkInterface(getClusterNetworkInterfaceOptions).execute();
      ClusterNetworkInterface clusterNetworkInterface = response.getResult();

      // end-get_cluster_network_interface
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateClusterNetworkInterface() result:");
      // begin-update_cluster_network_interface
      ClusterNetworkInterfacePatch clusterNetworkInterfacePatchModel = new ClusterNetworkInterfacePatch.Builder()
        .name("my-cluster-network-interface-updated")
        .build();
      Map<String, Object> clusterNetworkInterfacePatchModelAsPatch = clusterNetworkInterfacePatchModel.asPatch();
      UpdateClusterNetworkInterfaceOptions updateClusterNetworkInterfaceOptions = new UpdateClusterNetworkInterfaceOptions.Builder()
        .clusterNetworkId(clusterNetworkId)
        .id(clusterNetworkInterfaceId)
        .clusterNetworkInterfacePatch(clusterNetworkInterfacePatchModelAsPatch)
        .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
        .build();

      Response<ClusterNetworkInterface> response = vpcService.updateClusterNetworkInterface(updateClusterNetworkInterfaceOptions).execute();
      ClusterNetworkInterface clusterNetworkInterface = response.getResult();

      // end-update_cluster_network_interface
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listClusterNetworkSubnets() result:");
      // begin-list_cluster_network_subnets
      ListClusterNetworkSubnetsOptions listClusterNetworkSubnetsOptions = new ListClusterNetworkSubnetsOptions.Builder()
        .clusterNetworkId(clusterNetworkId)
        .limit(Long.valueOf("10"))
        .build();

      ClusterNetworkSubnetsPager pager = new ClusterNetworkSubnetsPager(vpcService, listClusterNetworkSubnetsOptions);
      List<ClusterNetworkSubnet> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<ClusterNetworkSubnet> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_cluster_network_subnets
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createClusterNetworkSubnet() result:");
      // begin-create_cluster_network_subnet
      ClusterNetworkSubnetPrototypeClusterNetworkSubnetByTotalCountPrototype clusterNetworkSubnetPrototypeModel = new ClusterNetworkSubnetPrototypeClusterNetworkSubnetByTotalCountPrototype.Builder()
        .name("my-cluster-network-subnet")
        .totalIpv4AddressCount(Long.valueOf("256"))
        .build();
      CreateClusterNetworkSubnetOptions createClusterNetworkSubnetOptions = new CreateClusterNetworkSubnetOptions.Builder()
        .clusterNetworkId(clusterNetworkId)
        .clusterNetworkSubnetPrototype(clusterNetworkSubnetPrototypeModel)
        .build();

      Response<ClusterNetworkSubnet> response = vpcService.createClusterNetworkSubnet(createClusterNetworkSubnetOptions).execute();
      ClusterNetworkSubnet clusterNetworkSubnet = response.getResult();

      // end-create_cluster_network_subnet
      clusterNetworkSubnetId = clusterNetworkSubnet.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listClusterNetworkSubnetReservedIps() result:");
      // begin-list_cluster_network_subnet_reserved_ips
      ListClusterNetworkSubnetReservedIpsOptions listClusterNetworkSubnetReservedIpsOptions = new ListClusterNetworkSubnetReservedIpsOptions.Builder()
        .clusterNetworkId(clusterNetworkId)
        .clusterNetworkSubnetId(clusterNetworkSubnetId)
        .limit(Long.valueOf("10"))
        .build();

      ClusterNetworkSubnetReservedIpsPager pager = new ClusterNetworkSubnetReservedIpsPager(vpcService, listClusterNetworkSubnetReservedIpsOptions);
      List<ClusterNetworkSubnetReservedIP> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<ClusterNetworkSubnetReservedIP> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_cluster_network_subnet_reserved_ips
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createClusterNetworkSubnetReservedIp() result:");
      // begin-create_cluster_network_subnet_reserved_ip
      CreateClusterNetworkSubnetReservedIpOptions createClusterNetworkSubnetReservedIpOptions = new CreateClusterNetworkSubnetReservedIpOptions.Builder()
        .clusterNetworkId(clusterNetworkId)
        .clusterNetworkSubnetId(clusterNetworkSubnetId)
        .build();

      Response<ClusterNetworkSubnetReservedIP> response = vpcService.createClusterNetworkSubnetReservedIp(createClusterNetworkSubnetReservedIpOptions).execute();
      ClusterNetworkSubnetReservedIP clusterNetworkSubnetReservedIp = response.getResult();

      // end-create_cluster_network_subnet_reserved_ip
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getClusterNetworkSubnetReservedIp() result:");
      // begin-get_cluster_network_subnet_reserved_ip
      GetClusterNetworkSubnetReservedIpOptions getClusterNetworkSubnetReservedIpOptions = new GetClusterNetworkSubnetReservedIpOptions.Builder()
        .clusterNetworkId(clusterNetworkId)
        .clusterNetworkSubnetId(clusterNetworkSubnetId)
        .id(clusterNetworkSubnetReservedIpId)
        .build();

      Response<ClusterNetworkSubnetReservedIP> response = vpcService.getClusterNetworkSubnetReservedIp(getClusterNetworkSubnetReservedIpOptions).execute();
      ClusterNetworkSubnetReservedIP clusterNetworkSubnetReservedIp = response.getResult();

      // end-get_cluster_network_subnet_reserved_ip
      clusterNetworkSubnetReservedIpId = clusterNetworkSubnetReservedIp.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateClusterNetworkSubnetReservedIp() result:");
      // begin-update_cluster_network_subnet_reserved_ip
      ClusterNetworkSubnetReservedIPPatch clusterNetworkSubnetReservedIpPatchModel = new ClusterNetworkSubnetReservedIPPatch.Builder()
        .build();
      Map<String, Object> clusterNetworkSubnetReservedIpPatchModelAsPatch = clusterNetworkSubnetReservedIpPatchModel.asPatch();
      UpdateClusterNetworkSubnetReservedIpOptions updateClusterNetworkSubnetReservedIpOptions = new UpdateClusterNetworkSubnetReservedIpOptions.Builder()
        .clusterNetworkId(clusterNetworkId)
        .clusterNetworkSubnetId(clusterNetworkSubnetId)
        .id(clusterNetworkSubnetReservedIpId)
        .clusterNetworkSubnetReservedIpPatch(clusterNetworkSubnetReservedIpPatchModelAsPatch)
        .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
        .build();

      Response<ClusterNetworkSubnetReservedIP> response = vpcService.updateClusterNetworkSubnetReservedIp(updateClusterNetworkSubnetReservedIpOptions).execute();
      ClusterNetworkSubnetReservedIP clusterNetworkSubnetReservedIp = response.getResult();

      // end-update_cluster_network_subnet_reserved_ip
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getClusterNetworkSubnet() result:");
      // begin-get_cluster_network_subnet
      GetClusterNetworkSubnetOptions getClusterNetworkSubnetOptions = new GetClusterNetworkSubnetOptions.Builder()
        .clusterNetworkId(clusterNetworkId)
        .id(clusterNetworkSubnetId)
        .build();

      Response<ClusterNetworkSubnet> response = vpcService.getClusterNetworkSubnet(getClusterNetworkSubnetOptions).execute();
      ClusterNetworkSubnet clusterNetworkSubnet = response.getResult();

      // end-get_cluster_network_subnet
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateClusterNetworkSubnet() result:");
      // begin-update_cluster_network_subnet
      ClusterNetworkSubnetPatch clusterNetworkSubnetPatchModel = new ClusterNetworkSubnetPatch.Builder()
        .name("my-cluster-network-subnet-updated")
        .build();
      Map<String, Object> clusterNetworkSubnetPatchModelAsPatch = clusterNetworkSubnetPatchModel.asPatch();
      UpdateClusterNetworkSubnetOptions updateClusterNetworkSubnetOptions = new UpdateClusterNetworkSubnetOptions.Builder()
        .clusterNetworkId(clusterNetworkId)
        .id(clusterNetworkSubnetId)
        .clusterNetworkSubnetPatch(clusterNetworkSubnetPatchModelAsPatch)
        .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
        .build();

      Response<ClusterNetworkSubnet> response = vpcService.updateClusterNetworkSubnet(updateClusterNetworkSubnetOptions).execute();
      ClusterNetworkSubnet clusterNetworkSubnet = response.getResult();

      // end-update_cluster_network_subnet
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getClusterNetwork() result:");
      // begin-get_cluster_network
      GetClusterNetworkOptions getClusterNetworkOptions = new GetClusterNetworkOptions.Builder()
        .id(clusterNetworkId)
        .build();

      Response<ClusterNetwork> response = vpcService.getClusterNetwork(getClusterNetworkOptions).execute();
      ClusterNetwork clusterNetwork = response.getResult();

      // end-get_cluster_network
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateClusterNetwork() result:");
      // begin-update_cluster_network
      ClusterNetworkPatch clusterNetworkPatchModel = new ClusterNetworkPatch.Builder()
        .name("my-cluster-network-updated")
        .build();
      Map<String, Object> clusterNetworkPatchModelAsPatch = clusterNetworkPatchModel.asPatch();
      UpdateClusterNetworkOptions updateClusterNetworkOptions = new UpdateClusterNetworkOptions.Builder()
        .id(clusterNetworkId)
        .clusterNetworkPatch(clusterNetworkPatchModelAsPatch)
        .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
        .build();

      Response<ClusterNetwork> response = vpcService.updateClusterNetwork(updateClusterNetworkOptions).execute();
      ClusterNetwork clusterNetwork = response.getResult();

      // end-update_cluster_network
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listPublicGateways() result:");
      // begin-list_public_gateways
      ListPublicGatewaysOptions listPublicGatewaysOptions = new ListPublicGatewaysOptions.Builder()
        .limit(Long.valueOf(10))
        .build();

      PublicGatewaysPager pager = new PublicGatewaysPager(vpcService, listPublicGatewaysOptions);
      List<PublicGateway> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<PublicGateway> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_public_gateways
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listNetworkAcls() result:");
      // begin-list_network_acls
      ListNetworkAclsOptions listNetworkAclsOptions = new ListNetworkAclsOptions.Builder()
        .limit(Long.valueOf(10))
        .build();

      NetworkAclsPager pager = new NetworkAclsPager(vpcService, listNetworkAclsOptions);
      List<NetworkACL> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<NetworkACL> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_network_acls
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createNetworkAcl() result:");
      // begin-create_network_acl
      VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
        .id(vpcId)
        .build();
      NetworkACLPrototypeNetworkACLByRules networkAclPrototypeModel = new NetworkACLPrototypeNetworkACLByRules.Builder()
        .name("my-network-acl")
        .vpc(vpcIdentityModel)
        .build();
      CreateNetworkAclOptions createNetworkAclOptions = new CreateNetworkAclOptions.Builder()
        .networkAclPrototype(networkAclPrototypeModel)
        .build();

      Response<NetworkACL> response = vpcService.createNetworkAcl(createNetworkAclOptions).execute();
      NetworkACL networkAcl = response.getResult();

      // end-create_network_acl
      networkAclId = networkAcl.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getNetworkAcl() result:");
      // begin-get_network_acl
      GetNetworkAclOptions getNetworkAclOptions = new GetNetworkAclOptions.Builder()
        .id(networkAclId)
        .build();

      Response<NetworkACL> response = vpcService.getNetworkAcl(getNetworkAclOptions).execute();
      NetworkACL networkAcl = response.getResult();

      // end-get_network_acl
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateNetworkAcl() result:");
      // begin-update_network_acl
      NetworkACLPatch networkAclPatchModel = new NetworkACLPatch.Builder()
        .name("my-networkacl-update")
        .build();
      Map<String, Object> networkAclPatchModelAsPatch = networkAclPatchModel.asPatch();
      UpdateNetworkAclOptions updateNetworkAclOptions = new UpdateNetworkAclOptions.Builder()
        .id(networkAclId)
        .networkAclPatch(networkAclPatchModelAsPatch)
        .build();

      Response<NetworkACL> response = vpcService.updateNetworkAcl(updateNetworkAclOptions).execute();
      NetworkACL networkAcl = response.getResult();

      // end-update_network_acl
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listNetworkAclRules() result:");
      // begin-list_network_acl_rules
      ListNetworkAclRulesOptions listNetworkAclRulesOptions = new ListNetworkAclRulesOptions.Builder()
        .networkAclId(networkAclId)
        .limit(Long.valueOf(10))
        .build();

      NetworkAclRulesPager pager = new NetworkAclRulesPager(vpcService, listNetworkAclRulesOptions);
      List<NetworkACLRuleItem> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<NetworkACLRuleItem> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_network_acl_rules
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createNetworkAclRule() result:");
      // begin-create_network_acl_rule
      NetworkACLRulePrototypeNetworkACLRuleProtocolICMPPrototype networkACLRulePrototypeNetworkACLRuleProtocolICMPPrototypeModel = new NetworkACLRulePrototypeNetworkACLRuleProtocolICMPPrototype.Builder()
        .action("allow")
        .destination("192.168.3.2/32")
        .direction("inbound")
        .name("my-networkacl-rule")
        .source("192.168.3.2/32")
        .protocol("icmp")
        .build();
      CreateNetworkAclRuleOptions createNetworkAclRuleOptions = new CreateNetworkAclRuleOptions.Builder()
        .networkAclId(networkAclId)
        .networkAclRulePrototype(networkACLRulePrototypeNetworkACLRuleProtocolICMPPrototypeModel)
        .build();

      Response<NetworkACLRule> response = vpcService.createNetworkAclRule(createNetworkAclRuleOptions).execute();
      NetworkACLRule networkAclRule = response.getResult();

      // end-create_network_acl_rule
      networkAclRuleId = networkAclRule.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getNetworkAclRule() result:");
      // begin-get_network_acl_rule
      GetNetworkAclRuleOptions getNetworkAclRuleOptions = new GetNetworkAclRuleOptions.Builder()
        .networkAclId(networkAclId)
        .id(networkAclRuleId)
        .build();

      Response<NetworkACLRule> response = vpcService.getNetworkAclRule(getNetworkAclRuleOptions).execute();
      NetworkACLRule networkAclRule = response.getResult();

      // end-get_network_acl_rule
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateNetworkAclRule() result:");
      // begin-update_network_acl_rule
      NetworkACLRulePatch networkAclRulePatchModel = new NetworkACLRulePatch.Builder()
        .name("my-networkacl-rule-update")
        .build();
      Map<String, Object> networkAclRulePatchModelAsPatch = networkAclRulePatchModel.asPatch();
      UpdateNetworkAclRuleOptions updateNetworkAclRuleOptions = new UpdateNetworkAclRuleOptions.Builder()
        .networkAclId(networkAclId)
        .id(networkAclRuleId)
        .networkAclRulePatch(networkAclRulePatchModelAsPatch)
        .build();

      Response<NetworkACLRule> response = vpcService.updateNetworkAclRule(updateNetworkAclRuleOptions).execute();
      NetworkACLRule networkAclRule = response.getResult();

      // end-update_network_acl_rule
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listSecurityGroups() result:");
      // begin-list_security_groups
      ListSecurityGroupsOptions listSecurityGroupsOptions = new ListSecurityGroupsOptions.Builder()
        .limit(Long.valueOf(10))
        .build();

      SecurityGroupsPager pager = new SecurityGroupsPager(vpcService, listSecurityGroupsOptions);
      List<SecurityGroup> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<SecurityGroup> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_security_groups
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createSecurityGroup() result:");
      // begin-create_security_group
      VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
        .id(vpcId)
        .build();
      CreateSecurityGroupOptions createSecurityGroupOptions = new CreateSecurityGroupOptions.Builder()
        .name("my-security-group")
        .vpc(vpcIdentityModel)
        .build();

      Response<SecurityGroup> response = vpcService.createSecurityGroup(createSecurityGroupOptions).execute();
      SecurityGroup securityGroup = response.getResult();

      // end-create_security_group
      securityGroupId = securityGroup.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getSecurityGroup() result:");
      // begin-get_security_group
      GetSecurityGroupOptions getSecurityGroupOptions = new GetSecurityGroupOptions.Builder()
        .id(securityGroupId)
        .build();

      Response<SecurityGroup> response = vpcService.getSecurityGroup(getSecurityGroupOptions).execute();
      SecurityGroup securityGroup = response.getResult();

      // end-get_security_group
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateSecurityGroup() result:");
      // begin-update_security_group
      SecurityGroupPatch securityGroupPatchModel = new SecurityGroupPatch.Builder()
        .name("my-securitygroup-update")
        .build();
      Map<String, Object> securityGroupPatchModelAsPatch = securityGroupPatchModel.asPatch();
      UpdateSecurityGroupOptions updateSecurityGroupOptions = new UpdateSecurityGroupOptions.Builder()
        .id(securityGroupId)
        .securityGroupPatch(securityGroupPatchModelAsPatch)
        .build();

      Response<SecurityGroup> response = vpcService.updateSecurityGroup(updateSecurityGroupOptions).execute();
      SecurityGroup securityGroup = response.getResult();

      // end-update_security_group
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listSecurityGroupRules() result:");
      // begin-list_security_group_rules
      ListSecurityGroupRulesOptions listSecurityGroupRulesOptions = new ListSecurityGroupRulesOptions.Builder()
        .securityGroupId(securityGroupId)
        .build();

      Response<SecurityGroupRuleCollection> response = vpcService.listSecurityGroupRules(listSecurityGroupRulesOptions).execute();
      SecurityGroupRuleCollection securityGroupRuleCollection = response.getResult();

      // end-list_security_group_rules
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createSecurityGroupRule() result:");
      // begin-create_security_group_rule
      SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP securityGroupRulePrototypeModel = new SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP.Builder()
        .direction("inbound")
        .protocol("icmp")
        .build();
      CreateSecurityGroupRuleOptions createSecurityGroupRuleOptions = new CreateSecurityGroupRuleOptions.Builder()
        .securityGroupId(securityGroupId)
        .securityGroupRulePrototype(securityGroupRulePrototypeModel)
        .build();

      Response<SecurityGroupRule> response = vpcService.createSecurityGroupRule(createSecurityGroupRuleOptions).execute();
      SecurityGroupRule securityGroupRule = response.getResult();

      // end-create_security_group_rule
      securityGroupRuleId = securityGroupRule.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getSecurityGroupRule() result:");
      // begin-get_security_group_rule
      GetSecurityGroupRuleOptions getSecurityGroupRuleOptions = new GetSecurityGroupRuleOptions.Builder()
        .securityGroupId(securityGroupId)
        .id(securityGroupRuleId)
        .build();

      Response<SecurityGroupRule> response = vpcService.getSecurityGroupRule(getSecurityGroupRuleOptions).execute();
      SecurityGroupRule securityGroupRule = response.getResult();

      // end-get_security_group_rule
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateSecurityGroupRule() result:");
      // begin-update_security_group_rule
      SecurityGroupRulePatch securityGroupRulePatchModel = new SecurityGroupRulePatch.Builder()
        .code(Long.valueOf("81"))
        .build();
      Map<String, Object> securityGroupRulePatchModelAsPatch = securityGroupRulePatchModel.asPatch();
      UpdateSecurityGroupRuleOptions updateSecurityGroupRuleOptions = new UpdateSecurityGroupRuleOptions.Builder()
        .securityGroupId(securityGroupId)
        .id(securityGroupRuleId)
        .securityGroupRulePatch(securityGroupRulePatchModelAsPatch)
        .build();

      Response<SecurityGroupRule> response = vpcService.updateSecurityGroupRule(updateSecurityGroupRuleOptions).execute();
      SecurityGroupRule securityGroupRule = response.getResult();

      // end-update_security_group_rule
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createSecurityGroupTargetBinding() result:");
      // begin-create_security_group_target_binding
      CreateSecurityGroupTargetBindingOptions createSecurityGroupTargetBindingOptions = new CreateSecurityGroupTargetBindingOptions.Builder()
        .securityGroupId(securityGroupId)
        .id(instanceNetworkInterfaceId)
        .build();

      Response<SecurityGroupTargetReference> response = vpcService.createSecurityGroupTargetBinding(createSecurityGroupTargetBindingOptions).execute();
      SecurityGroupTargetReference securityGroupTargetReference = response.getResult();
      targetId = securityGroupTargetReference.getId();

      // end-create_security_group_target_binding
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listSecurityGroupTargets() result:");
      // begin-list_security_group_targets
      ListSecurityGroupTargetsOptions listSecurityGroupTargetsOptions = new ListSecurityGroupTargetsOptions.Builder()
        .securityGroupId(securityGroupId)
        .limit(Long.valueOf(10))
        .build();

      SecurityGroupTargetsPager pager = new SecurityGroupTargetsPager(vpcService, listSecurityGroupTargetsOptions);
      List<SecurityGroupTargetReference> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<SecurityGroupTargetReference> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_security_group_targets
      securityGroupTargetId = allResults.get(0).getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getSecurityGroupTarget() result:");
      // begin-get_security_group_target
      GetSecurityGroupTargetOptions getSecurityGroupTargetOptions = new GetSecurityGroupTargetOptions.Builder()
        .securityGroupId(securityGroupId)
        .id(securityGroupTargetId)
        .build();

      Response<SecurityGroupTargetReference> response = vpcService.getSecurityGroupTarget(getSecurityGroupTargetOptions).execute();
      SecurityGroupTargetReference securityGroupTargetReference = response.getResult();

      // end-get_security_group_target
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listIkePolicies() result:");
      // begin-list_ike_policies
      ListIkePoliciesOptions listIkePoliciesOptions = new ListIkePoliciesOptions.Builder()
        .limit(Long.valueOf(10))
        .build();

      IkePoliciesPager pager = new IkePoliciesPager(vpcService, listIkePoliciesOptions);
      List<IKEPolicy> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<IKEPolicy> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_ike_policies
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createIkePolicy() result:");
      // begin-create_ike_policy
      CreateIkePolicyOptions createIkePolicyOptions = new CreateIkePolicyOptions.Builder()
        .authenticationAlgorithm("sha512")
        .name("my-ike-policy")
        .dhGroup(Long.valueOf("14"))
        .encryptionAlgorithm("aes128")
        .ikeVersion(Long.valueOf("1"))
        .build();

      Response<IKEPolicy> response = vpcService.createIkePolicy(createIkePolicyOptions).execute();
      IKEPolicy ikePolicy = response.getResult();

      // end-create_ike_policy
      ikePolicyId = ikePolicy.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getIkePolicy() result:");
      // begin-get_ike_policy
      GetIkePolicyOptions getIkePolicyOptions = new GetIkePolicyOptions.Builder()
        .id(ikePolicyId)
        .build();

      Response<IKEPolicy> response = vpcService.getIkePolicy(getIkePolicyOptions).execute();
      IKEPolicy ikePolicy = response.getResult();

      // end-get_ike_policy
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateIkePolicy() result:");
      // begin-update_ike_policy
      IKEPolicyPatch ikePolicyPatchModel = new IKEPolicyPatch.Builder()
        .name("my-ikepolicy-update")
        .build();
      Map<String, Object> ikePolicyPatchModelAsPatch = ikePolicyPatchModel.asPatch();
      UpdateIkePolicyOptions updateIkePolicyOptions = new UpdateIkePolicyOptions.Builder()
        .id(ikePolicyId)
        .ikePolicyPatch(ikePolicyPatchModelAsPatch)
        .build();

      Response<IKEPolicy> response = vpcService.updateIkePolicy(updateIkePolicyOptions).execute();
      IKEPolicy ikePolicy = response.getResult();

      // end-update_ike_policy
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listIkePolicyConnections() result:");
      // begin-list_ike_policy_connections
      ListIkePolicyConnectionsOptions listIkePolicyConnectionsOptions = new ListIkePolicyConnectionsOptions.Builder()
        .id(ikePolicyId)
        .build();

      Response<IKEPolicyConnectionCollection> response = vpcService.listIkePolicyConnections(listIkePolicyConnectionsOptions).execute();
      IKEPolicyConnectionCollection ikePolicyConnectionCollection = response.getResult();

      // end-list_ike_policy_connections
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listIpsecPolicies() result:");
      // begin-list_ipsec_policies
      ListIpsecPoliciesOptions listIpsecPoliciesOptions = new ListIpsecPoliciesOptions.Builder()
        .limit(Long.valueOf(10))
        .build();

      IpsecPoliciesPager pager = new IpsecPoliciesPager(vpcService, listIpsecPoliciesOptions);
      List<IPsecPolicy> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<IPsecPolicy> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_ipsec_policies
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createIpsecPolicy() result:");
      // begin-create_ipsec_policy
      CreateIpsecPolicyOptions createIpsecPolicyOptions = new CreateIpsecPolicyOptions.Builder()
        .name("my-ipsec-policy")
        .authenticationAlgorithm("sha512")
        .encryptionAlgorithm("aes128")
        .pfs("disabled")
        .build();

      Response<IPsecPolicy> response = vpcService.createIpsecPolicy(createIpsecPolicyOptions).execute();
      IPsecPolicy iPsecPolicy = response.getResult();

      // end-create_ipsec_policy
      iPsecPolicyId = iPsecPolicy.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getIpsecPolicy() result:");
      // begin-get_ipsec_policy
      GetIpsecPolicyOptions getIpsecPolicyOptions = new GetIpsecPolicyOptions.Builder()
        .id(iPsecPolicyId)
        .build();

      Response<IPsecPolicy> response = vpcService.getIpsecPolicy(getIpsecPolicyOptions).execute();
      IPsecPolicy iPsecPolicy = response.getResult();

      // end-get_ipsec_policy
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateIpsecPolicy() result:");
      // begin-update_ipsec_policy
      IPsecPolicyPatch iPsecPolicyPatchModel = new IPsecPolicyPatch.Builder()
        .name("my-ipsecpolicy-update")
        .build();
      Map<String, Object> iPsecPolicyPatchModelAsPatch = iPsecPolicyPatchModel.asPatch();
      UpdateIpsecPolicyOptions updateIpsecPolicyOptions = new UpdateIpsecPolicyOptions.Builder()
        .id(iPsecPolicyId)
        .iPsecPolicyPatch(iPsecPolicyPatchModelAsPatch)
        .build();

      Response<IPsecPolicy> response = vpcService.updateIpsecPolicy(updateIpsecPolicyOptions).execute();
      IPsecPolicy iPsecPolicy = response.getResult();

      // end-update_ipsec_policy
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listIpsecPolicyConnections() result:");
      // begin-list_ipsec_policy_connections
      ListIpsecPolicyConnectionsOptions listIpsecPolicyConnectionsOptions = new ListIpsecPolicyConnectionsOptions.Builder()
        .id(iPsecPolicyId)
        .build();

      Response<IPsecPolicyConnectionCollection> response = vpcService.listIpsecPolicyConnections(listIpsecPolicyConnectionsOptions).execute();
      IPsecPolicyConnectionCollection ipsecPolicyConnectionCollection = response.getResult();

      // end-list_ipsec_policy_connections
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listVpnGateways() result:");
      // begin-list_vpn_gateways
      ListVpnGatewaysOptions listVpnGatewaysOptions = new ListVpnGatewaysOptions.Builder()
        .mode("route")
        .limit(Long.valueOf(10))
        .build();

      VpnGatewaysPager pager = new VpnGatewaysPager(vpcService, listVpnGatewaysOptions);
      List<VPNGateway> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<VPNGateway> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_vpn_gateways
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createVpnGateway() result:");
      // begin-create_vpn_gateway
      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
        .id(subnetId)
        .build();
      VPNGatewayPrototypeVPNGatewayRouteModePrototype vpnGatewayPrototypeModel = new VPNGatewayPrototypeVPNGatewayRouteModePrototype.Builder()
        .name("my-vpn-gateway")
        .subnet(subnetIdentityModel)
        .build();
      CreateVpnGatewayOptions createVpnGatewayOptions = new CreateVpnGatewayOptions.Builder()
        .vpnGatewayPrototype(vpnGatewayPrototypeModel)
        .build();

      Response<VPNGateway> response = vpcService.createVpnGateway(createVpnGatewayOptions).execute();
      VPNGateway vpnGateway = response.getResult();

      // end-create_vpn_gateway
      vpnGatewayId = vpnGateway.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getVpnGateway() result:");
      // begin-get_vpn_gateway
      GetVpnGatewayOptions getVpnGatewayOptions = new GetVpnGatewayOptions.Builder()
        .id(vpnGatewayId)
        .build();

      Response<VPNGateway> response = vpcService.getVpnGateway(getVpnGatewayOptions).execute();
      VPNGateway vpnGateway = response.getResult();

      // end-get_vpn_gateway
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateVpnGateway() result:");
      // begin-update_vpn_gateway
      VPNGatewayPatch vpnGatewayPatchModel = new VPNGatewayPatch.Builder()
        .name("my-vpngateway-update")
        .build();
      Map<String, Object> vpnGatewayPatchModelAsPatch = vpnGatewayPatchModel.asPatch();
      UpdateVpnGatewayOptions updateVpnGatewayOptions = new UpdateVpnGatewayOptions.Builder()
        .id(vpnGatewayId)
        .vpnGatewayPatch(vpnGatewayPatchModelAsPatch)
        .build();

      Response<VPNGateway> response = vpcService.updateVpnGateway(updateVpnGatewayOptions).execute();
      VPNGateway vpnGateway = response.getResult();

      // end-update_vpn_gateway
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listVpnGatewayConnections() result:");
      // begin-list_vpn_gateway_connections
      ListVpnGatewayConnectionsOptions listVpnGatewayConnectionsOptions = new ListVpnGatewayConnectionsOptions.Builder()
        .vpnGatewayId(vpnGatewayId)
        .build();

      Response<VPNGatewayConnectionCollection> response = vpcService.listVpnGatewayConnections(listVpnGatewayConnectionsOptions).execute();
      VPNGatewayConnectionCollection vpnGatewayConnectionCollection = response.getResult();

      // end-list_vpn_gateway_connections
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createVpnGatewayConnection() result:");
      // begin-create_vpn_gateway_connection
      VPNGatewayConnectionStaticRouteModePeerPrototypeVPNGatewayConnectionPeerByAddress vpnGatewayConnectionStaticRouteModePeerPrototypeModel = new VPNGatewayConnectionStaticRouteModePeerPrototypeVPNGatewayConnectionPeerByAddress.Builder()
        .address("169.21.50.5")
        .build();
      VPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototype vpnGatewayConnectionPrototypeModel = new VPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototype.Builder()
        .name("my-vpn-gateway-connection")
        .peer(vpnGatewayConnectionStaticRouteModePeerPrototypeModel)
        .psk("lkj14b1oi0alcniejkso")
        .build();
      CreateVpnGatewayConnectionOptions createVpnGatewayConnectionOptions = new CreateVpnGatewayConnectionOptions.Builder()
        .vpnGatewayId(vpnGatewayId)
        .vpnGatewayConnectionPrototype(vpnGatewayConnectionPrototypeModel)
        .build();

      Response<VPNGatewayConnection> response = vpcService.createVpnGatewayConnection(createVpnGatewayConnectionOptions).execute();
      VPNGatewayConnection vpnGatewayConnection = response.getResult();

      // end-create_vpn_gateway_connection
      vpnGatewayConnectionId  = vpnGatewayConnection.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getVpnGatewayConnection() result:");
      // begin-get_vpn_gateway_connection
      GetVpnGatewayConnectionOptions getVpnGatewayConnectionOptions = new GetVpnGatewayConnectionOptions.Builder()
        .vpnGatewayId(vpnGatewayId)
        .id(vpnGatewayConnectionId)
        .build();

      Response<VPNGatewayConnection> response = vpcService.getVpnGatewayConnection(getVpnGatewayConnectionOptions).execute();
      VPNGatewayConnection vpnGatewayConnection = response.getResult();

      // end-get_vpn_gateway_connection
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateVpnGatewayConnection() result:");
      // begin-update_vpn_gateway_connection
      VPNGatewayConnectionPatch vpnGatewayConnectionPatchModel = new VPNGatewayConnectionPatch.Builder()
        .name("my-vpngetwayconnection-update")
        .build();
      Map<String, Object> vpnGatewayConnectionPatchModelAsPatch = vpnGatewayConnectionPatchModel.asPatch();
      UpdateVpnGatewayConnectionOptions updateVpnGatewayConnectionOptions = new UpdateVpnGatewayConnectionOptions.Builder()
        .vpnGatewayId(vpnGatewayId)
        .id(vpnGatewayConnectionId)
        .vpnGatewayConnectionPatch(vpnGatewayConnectionPatchModelAsPatch)
        .build();

      Response<VPNGatewayConnection> response = vpcService.updateVpnGatewayConnection(updateVpnGatewayConnectionOptions).execute();
      VPNGatewayConnection vpnGatewayConnection = response.getResult();

      // end-update_vpn_gateway_connection
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listVpnGatewayConnectionsLocalCidrs() result:");
      // begin-list_vpn_gateway_connections_local_cidrs
      ListVpnGatewayConnectionsLocalCidrsOptions listVpnGatewayConnectionsLocalCidrsOptions = new ListVpnGatewayConnectionsLocalCidrsOptions.Builder()
        .vpnGatewayId(vpnGatewayId)
        .id(vpnGatewayConnectionId)
        .build();

      Response<VPNGatewayConnectionCIDRs> response = vpcService.listVpnGatewayConnectionsLocalCidrs(listVpnGatewayConnectionsLocalCidrsOptions).execute();
      VPNGatewayConnectionCIDRs vpnGatewayConnectionCidRs = response.getResult();

      // end-list_vpn_gateway_connections_local_cidrs
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-check_vpn_gateway_connections_local_cidr
      CheckVpnGatewayConnectionsLocalCidrOptions checkVpnGatewayConnectionsLocalCidrOptions = new CheckVpnGatewayConnectionsLocalCidrOptions.Builder()
        .vpnGatewayId(vpnGatewayId)
        .id(vpnGatewayConnectionId)
        .cidr("192.134.0.0/28")
        .build();

      Response<Void> response = vpcService.checkVpnGatewayConnectionsLocalCidr(checkVpnGatewayConnectionsLocalCidrOptions).execute();
      // end-check_vpn_gateway_connections_local_cidr
      System.out.printf("checkVpnGatewayConnectionsLocalCidr() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-add_vpn_gateway_connections_local_cidr
      AddVpnGatewayConnectionsLocalCidrOptions addVpnGatewayConnectionsLocalCidrOptions = new AddVpnGatewayConnectionsLocalCidrOptions.Builder()
        .vpnGatewayId(vpnGatewayId)
        .id(vpnGatewayConnectionId)
        .cidr("192.134.0.0/28")
        .build();

      Response<Void> response = vpcService.addVpnGatewayConnectionsLocalCidr(addVpnGatewayConnectionsLocalCidrOptions).execute();
      // end-add_vpn_gateway_connections_local_cidr
      System.out.printf("addVpnGatewayConnectionsLocalCidr() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listVpnGatewayConnectionsPeerCidrs() result:");
      // begin-list_vpn_gateway_connections_peer_cidrs
      ListVpnGatewayConnectionsPeerCidrsOptions listVpnGatewayConnectionsPeerCidrsOptions = new ListVpnGatewayConnectionsPeerCidrsOptions.Builder()
        .vpnGatewayId(vpnGatewayId)
        .id(vpnGatewayConnectionId)
        .build();

      Response<VPNGatewayConnectionCIDRs> response = vpcService.listVpnGatewayConnectionsPeerCidrs(listVpnGatewayConnectionsPeerCidrsOptions).execute();
      VPNGatewayConnectionCIDRs vpnGatewayConnectionCidRs = response.getResult();

      // end-list_vpn_gateway_connections_peer_cidrs
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-check_vpn_gateway_connections_peer_cidr
      CheckVpnGatewayConnectionsPeerCidrOptions checkVpnGatewayConnectionsPeerCidrOptions = new CheckVpnGatewayConnectionsPeerCidrOptions.Builder()
        .vpnGatewayId(vpnGatewayId)
        .id(vpnGatewayConnectionId)
        .cidr("192.134.0.0/28")
        .build();

      Response<Void> response = vpcService.checkVpnGatewayConnectionsPeerCidr(checkVpnGatewayConnectionsPeerCidrOptions).execute();
      // end-check_vpn_gateway_connections_peer_cidr
      System.out.printf("checkVpnGatewayConnectionsPeerCidr() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-add_vpn_gateway_connections_peer_cidr
      AddVpnGatewayConnectionsPeerCidrOptions addVpnGatewayConnectionsPeerCidrOptions = new AddVpnGatewayConnectionsPeerCidrOptions.Builder()
        .vpnGatewayId(vpnGatewayId)
        .id(vpnGatewayConnectionId)
        .cidr("192.134.0.0/28")
        .build();

      Response<Void> response = vpcService.addVpnGatewayConnectionsPeerCidr(addVpnGatewayConnectionsPeerCidrOptions).execute();
      // end-add_vpn_gateway_connections_peer_cidr
      System.out.printf("addVpnGatewayConnectionsPeerCidr() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listVpnServers() result:");
      // begin-list_vpn_servers
      ListVpnServersOptions listVpnServersOptions = new ListVpnServersOptions.Builder()
        .sort("name")
        .build();

      VpnServersPager pager = new VpnServersPager(vpcService, listVpnServersOptions);
      List<VPNServer> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<VPNServer> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_vpn_servers
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createVpnServer() result:");
      // begin-create_vpn_server
      CertificateInstanceIdentityByCRN certificateInstanceIdentityModel = new CertificateInstanceIdentityByCRN.Builder()
        .crn(certificateCrn)
        .build();
      VPNServerAuthenticationByUsernameIdProviderByIAM vpnServerAuthenticationByUsernameIdProviderModel = new VPNServerAuthenticationByUsernameIdProviderByIAM.Builder()
        .providerType("iam")
        .build();
      VPNServerAuthenticationPrototypeVPNServerAuthenticationByUsernamePrototype vpnServerAuthenticationPrototypeModel = new VPNServerAuthenticationPrototypeVPNServerAuthenticationByUsernamePrototype.Builder()
        .method("certificate")
        .identityProvider(vpnServerAuthenticationByUsernameIdProviderModel)
        .build();
      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
        .id(subnetId)
        .build();
      CreateVpnServerOptions createVpnServerOptions = new CreateVpnServerOptions.Builder()
        .certificate(certificateInstanceIdentityModel)
        .name("my-vpn-server")
        .clientAuthentication(new java.util.ArrayList<VPNServerAuthenticationPrototype>(java.util.Arrays.asList(vpnServerAuthenticationPrototypeModel)))
        .clientIpPool("172.16.0.0/16")
        .subnets(new java.util.ArrayList<SubnetIdentity>(java.util.Arrays.asList(subnetIdentityModel)))
        .build();

      Response<VPNServer> response = vpcService.createVpnServer(createVpnServerOptions).execute();
      VPNServer vpnServer = response.getResult();

      // end-create_vpn_server
      vpnServerId = vpnServer.getId();
      ifMatchVpnServer = response.getHeaders().values("etag").get(0);
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getVpnServer() result:");
      // begin-get_vpn_server
      GetVpnServerOptions getVpnServerOptions = new GetVpnServerOptions.Builder()
        .id(vpnServerId)
        .build();

      Response<VPNServer> response = vpcService.getVpnServer(getVpnServerOptions).execute();
      VPNServer vpnServer = response.getResult();

      // end-get_vpn_server
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateVpnServer() result:");
      // begin-update_vpn_server
      VPNServerPatch vpnServerPatchModel = new VPNServerPatch.Builder()
        .name("my-vpn-server-update")
        .build();
      Map<String, Object> vpnServerPatchModelAsPatch = vpnServerPatchModel.asPatch();
      UpdateVpnServerOptions updateVpnServerOptions = new UpdateVpnServerOptions.Builder()
        .id(vpnServerId)
        .vpnServerPatch(vpnServerPatchModelAsPatch)
        .ifMatch(ifMatchVpnServer)
        .build();

      Response<VPNServer> response = vpcService.updateVpnServer(updateVpnServerOptions).execute();
      VPNServer vpnServer = response.getResult();

      // end-update_vpn_server
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getVpnServerClientConfiguration() result:");
      // begin-get_vpn_server_client_configuration
      GetVpnServerClientConfigurationOptions getVpnServerClientConfigurationOptions = new GetVpnServerClientConfigurationOptions.Builder()
        .id(vpnServerId)
        .build();

      Response<String> response = vpcService.getVpnServerClientConfiguration(getVpnServerClientConfigurationOptions).execute();
      String vpnServerClientConfiguration = response.getResult();

      // end-get_vpn_server_client_configuration
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listVpnServerClients() result:");
      // begin-list_vpn_server_clients
      ListVpnServerClientsOptions listVpnServerClientsOptions = new ListVpnServerClientsOptions.Builder()
        .vpnServerId(vpnServerId)
        .sort("created_at")
        .build();

      VpnServerClientsPager pager = new VpnServerClientsPager(vpcService, listVpnServerClientsOptions);
      List<VPNServerClient> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<VPNServerClient> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_vpn_server_clients
      vpnServerClientId = allResults.get(0).getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getVpnServerClient() result:");
      // begin-get_vpn_server_client
      GetVpnServerClientOptions getVpnServerClientOptions = new GetVpnServerClientOptions.Builder()
        .vpnServerId(vpnServerId)
        .id(vpnServerClientId)
        .build();

      Response<VPNServerClient> response = vpcService.getVpnServerClient(getVpnServerClientOptions).execute();
      VPNServerClient vpnServerClient = response.getResult();

      // end-get_vpn_server_client
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-disconnect_vpn_client
      DisconnectVpnClientOptions disconnectVpnClientOptions = new DisconnectVpnClientOptions.Builder()
        .vpnServerId(vpnServerId)
        .id(vpnServerClientId)
        .build();

      Response<Void> response = vpcService.disconnectVpnClient(disconnectVpnClientOptions).execute();
      // end-disconnect_vpn_client
      System.out.printf("disconnectVpnClient() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listVpnServerRoutes() result:");
      // begin-list_vpn_server_routes
      ListVpnServerRoutesOptions listVpnServerRoutesOptions = new ListVpnServerRoutesOptions.Builder()
        .vpnServerId(vpnServerId)
        .sort("name")
        .build();

      VpnServerRoutesPager pager = new VpnServerRoutesPager(vpcService, listVpnServerRoutesOptions);
      List<VPNServerRoute> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<VPNServerRoute> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_vpn_server_routes
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createVpnServerRoute() result:");
      // begin-create_vpn_server_route
      CreateVpnServerRouteOptions createVpnServerRouteOptions = new CreateVpnServerRouteOptions.Builder()
        .vpnServerId(vpnServerId)
        .name("my-vpn-server-route")
        .destination("172.16.0.0/16")
        .build();

      Response<VPNServerRoute> response = vpcService.createVpnServerRoute(createVpnServerRouteOptions).execute();
      VPNServerRoute vpnServerRoute = response.getResult();

      // end-create_vpn_server_route
      vpnServerRouteId = vpnServerRoute.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getVpnServerRoute() result:");
      // begin-get_vpn_server_route
      GetVpnServerRouteOptions getVpnServerRouteOptions = new GetVpnServerRouteOptions.Builder()
        .vpnServerId(vpnServerId)
        .id(vpnServerRouteId)
        .build();

      Response<VPNServerRoute> response = vpcService.getVpnServerRoute(getVpnServerRouteOptions).execute();
      VPNServerRoute vpnServerRoute = response.getResult();

      // end-get_vpn_server_route
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateVpnServerRoute() result:");
      // begin-update_vpn_server_route
      VPNServerRoutePatch vpnServerRoutePatchModel = new VPNServerRoutePatch.Builder()
        .build();
      Map<String, Object> vpnServerRoutePatchModelAsPatch = vpnServerRoutePatchModel.asPatch();
      UpdateVpnServerRouteOptions updateVpnServerRouteOptions = new UpdateVpnServerRouteOptions.Builder()
        .vpnServerId(vpnServerId)
        .id(vpnServerRouteId)
        .vpnServerRoutePatch(vpnServerRoutePatchModelAsPatch)
        .build();

      Response<VPNServerRoute> response = vpcService.updateVpnServerRoute(updateVpnServerRouteOptions).execute();
      VPNServerRoute vpnServerRoute = response.getResult();

      // end-update_vpn_server_route
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }


    try {
      System.out.println("listLoadBalancerProfiles() result:");
      // begin-list_load_balancer_profiles
      ListLoadBalancerProfilesOptions listLoadBalancerProfilesOptions = new ListLoadBalancerProfilesOptions.Builder()
        .limit(Long.valueOf(10))
        .build();

      LoadBalancerProfilesPager pager = new LoadBalancerProfilesPager(vpcService, listLoadBalancerProfilesOptions);
      List<LoadBalancerProfile> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<LoadBalancerProfile> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_load_balancer_profiles
      loadBalancerProfileName = allResults.get(0).getName();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getLoadBalancerProfile() result:");
      // begin-get_load_balancer_profile
      GetLoadBalancerProfileOptions getLoadBalancerProfileOptions = new GetLoadBalancerProfileOptions.Builder()
        .name(loadBalancerProfileName)
        .build();

      Response<LoadBalancerProfile> response = vpcService.getLoadBalancerProfile(getLoadBalancerProfileOptions).execute();
      LoadBalancerProfile loadBalancerProfile = response.getResult();

      // end-get_load_balancer_profile
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listLoadBalancers() result:");
      // begin-list_load_balancers
      ListLoadBalancersOptions listLoadBalancersOptions = new ListLoadBalancersOptions.Builder()
        .limit(Long.valueOf(10))
        .build();

      LoadBalancersPager pager = new LoadBalancersPager(vpcService, listLoadBalancersOptions);
      List<LoadBalancer> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<LoadBalancer> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_load_balancers
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createLoadBalancer() result:");
      // begin-create_load_balancer
      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
        .id(subnetId)
        .build();
      CreateLoadBalancerOptions createLoadBalancerOptions = new CreateLoadBalancerOptions.Builder()
        .name("my-lb")
        .isPublic(true)
        .subnets(new java.util.ArrayList<SubnetIdentity>(java.util.Arrays.asList(subnetIdentityModel)))
        .build();

      Response<LoadBalancer> response = vpcService.createLoadBalancer(createLoadBalancerOptions).execute();
      LoadBalancer loadBalancer = response.getResult();

      // end-create_load_balancer
      loadBalancerId = loadBalancer.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getLoadBalancer() result:");
      // begin-get_load_balancer
      GetLoadBalancerOptions getLoadBalancerOptions = new GetLoadBalancerOptions.Builder()
        .id(loadBalancerId)
        .build();

      Response<LoadBalancer> response = vpcService.getLoadBalancer(getLoadBalancerOptions).execute();
      LoadBalancer loadBalancer = response.getResult();

      // end-get_load_balancer
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateLoadBalancer() result:");
      // begin-update_load_balancer
      LoadBalancerPatch loadBalancerPatchModel = new LoadBalancerPatch.Builder()
        .name("my-lb-update")
        .build();
      Map<String, Object> loadBalancerPatchModelAsPatch = loadBalancerPatchModel.asPatch();
      UpdateLoadBalancerOptions updateLoadBalancerOptions = new UpdateLoadBalancerOptions.Builder()
        .id(loadBalancerId)
        .loadBalancerPatch(loadBalancerPatchModelAsPatch)
        .build();

      Response<LoadBalancer> response = vpcService.updateLoadBalancer(updateLoadBalancerOptions).execute();
      LoadBalancer loadBalancer = response.getResult();

      // end-update_load_balancer
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getLoadBalancerStatistics() result:");
      // begin-get_load_balancer_statistics
      GetLoadBalancerStatisticsOptions getLoadBalancerStatisticsOptions = new GetLoadBalancerStatisticsOptions.Builder()
        .id(loadBalancerId)
        .build();

      Response<LoadBalancerStatistics> response = vpcService.getLoadBalancerStatistics(getLoadBalancerStatisticsOptions).execute();
      LoadBalancerStatistics loadBalancerStatistics = response.getResult();

      // end-get_load_balancer_statistics
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listLoadBalancerListeners() result:");
      // begin-list_load_balancer_listeners
      ListLoadBalancerListenersOptions listLoadBalancerListenersOptions = new ListLoadBalancerListenersOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .build();

      Response<LoadBalancerListenerCollection> response = vpcService.listLoadBalancerListeners(listLoadBalancerListenersOptions).execute();
      LoadBalancerListenerCollection loadBalancerListenerCollection = response.getResult();

      // end-list_load_balancer_listeners
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createLoadBalancerListener() result:");
      // begin-create_load_balancer_listener
      CreateLoadBalancerListenerOptions createLoadBalancerListenerOptions = new CreateLoadBalancerListenerOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .port(Long.valueOf("443"))
        .protocol("http")
        .build();

      Response<LoadBalancerListener> response = vpcService.createLoadBalancerListener(createLoadBalancerListenerOptions).execute();
      LoadBalancerListener loadBalancerListener = response.getResult();

      // end-create_load_balancer_listener
      loadBalancerListenerId = loadBalancerListener.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getLoadBalancerListener() result:");
      // begin-get_load_balancer_listener
      GetLoadBalancerListenerOptions getLoadBalancerListenerOptions = new GetLoadBalancerListenerOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .id(loadBalancerListenerId)
        .build();

      Response<LoadBalancerListener> response = vpcService.getLoadBalancerListener(getLoadBalancerListenerOptions).execute();
      LoadBalancerListener loadBalancerListener = response.getResult();

      // end-get_load_balancer_listener
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateLoadBalancerListener() result:");
      // begin-update_load_balancer_listener
      LoadBalancerListenerPatch loadBalancerListenerPatchModel = new LoadBalancerListenerPatch.Builder()
        .port(Long.valueOf("81"))
        .build();
      Map<String, Object> loadBalancerListenerPatchModelAsPatch = loadBalancerListenerPatchModel.asPatch();
      UpdateLoadBalancerListenerOptions updateLoadBalancerListenerOptions = new UpdateLoadBalancerListenerOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .id(loadBalancerListenerId)
        .loadBalancerListenerPatch(loadBalancerListenerPatchModelAsPatch)
        .build();

      Response<LoadBalancerListener> response = vpcService.updateLoadBalancerListener(updateLoadBalancerListenerOptions).execute();
      LoadBalancerListener loadBalancerListener = response.getResult();

      // end-update_load_balancer_listener
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listLoadBalancerListenerPolicies() result:");
      // begin-list_load_balancer_listener_policies
      ListLoadBalancerListenerPoliciesOptions listLoadBalancerListenerPoliciesOptions = new ListLoadBalancerListenerPoliciesOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .listenerId(loadBalancerListenerId)
        .build();

      Response<LoadBalancerListenerPolicyCollection> response = vpcService.listLoadBalancerListenerPolicies(listLoadBalancerListenerPoliciesOptions).execute();
      LoadBalancerListenerPolicyCollection loadBalancerListenerPolicyCollection = response.getResult();

      // end-list_load_balancer_listener_policies
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createLoadBalancerListenerPolicy() result:");
      // begin-create_load_balancer_listener_policy
      CreateLoadBalancerListenerPolicyOptions createLoadBalancerListenerPolicyOptions = new CreateLoadBalancerListenerPolicyOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .listenerId(loadBalancerListenerId)
        .action("forward")
        .priority(Long.valueOf("5"))
        .build();

      Response<LoadBalancerListenerPolicy> response = vpcService.createLoadBalancerListenerPolicy(createLoadBalancerListenerPolicyOptions).execute();
      LoadBalancerListenerPolicy loadBalancerListenerPolicy = response.getResult();

      // end-create_load_balancer_listener_policy
      loadBalancerListenerPolicyId = loadBalancerListenerPolicy.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getLoadBalancerListenerPolicy() result:");
      // begin-get_load_balancer_listener_policy
      GetLoadBalancerListenerPolicyOptions getLoadBalancerListenerPolicyOptions = new GetLoadBalancerListenerPolicyOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .listenerId(loadBalancerListenerId)
        .id(loadBalancerListenerPolicyId)
        .build();

      Response<LoadBalancerListenerPolicy> response = vpcService.getLoadBalancerListenerPolicy(getLoadBalancerListenerPolicyOptions).execute();
      LoadBalancerListenerPolicy loadBalancerListenerPolicy = response.getResult();

      // end-get_load_balancer_listener_policy
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateLoadBalancerListenerPolicy() result:");
      // begin-update_load_balancer_listener_policy
      LoadBalancerListenerPolicyPatch loadBalancerListenerPolicyPatchModel = new LoadBalancerListenerPolicyPatch.Builder()
        .name("my-lblistenerpolicy-update")
        .priority(5L)
        .build();
      Map<String, Object> loadBalancerListenerPolicyPatchModelAsPatch = loadBalancerListenerPolicyPatchModel.asPatch();
      UpdateLoadBalancerListenerPolicyOptions updateLoadBalancerListenerPolicyOptions = new UpdateLoadBalancerListenerPolicyOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .listenerId(loadBalancerListenerId)
        .id(loadBalancerListenerPolicyId)
        .loadBalancerListenerPolicyPatch(loadBalancerListenerPolicyPatchModelAsPatch)
        .build();
      Response<LoadBalancerListenerPolicy> response = vpcService.updateLoadBalancerListenerPolicy(updateLoadBalancerListenerPolicyOptions).execute();
      LoadBalancerListenerPolicy loadBalancerListenerPolicy = response.getResult();

      // end-update_load_balancer_listener_policy
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listLoadBalancerListenerPolicyRules() result:");
      // begin-list_load_balancer_listener_policy_rules
      ListLoadBalancerListenerPolicyRulesOptions listLoadBalancerListenerPolicyRulesOptions = new ListLoadBalancerListenerPolicyRulesOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .listenerId(loadBalancerListenerId)
        .policyId(loadBalancerListenerPolicyId)
        .build();

      Response<LoadBalancerListenerPolicyRuleCollection> response = vpcService.listLoadBalancerListenerPolicyRules(listLoadBalancerListenerPolicyRulesOptions).execute();
      LoadBalancerListenerPolicyRuleCollection loadBalancerListenerPolicyRuleCollection = response.getResult();

      // end-list_load_balancer_listener_policy_rules
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createLoadBalancerListenerPolicyRule() result:");
      // begin-create_load_balancer_listener_policy_rule
      CreateLoadBalancerListenerPolicyRuleOptions createLoadBalancerListenerPolicyRuleOptions = new CreateLoadBalancerListenerPolicyRuleOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .listenerId(loadBalancerListenerId)
        .policyId(loadBalancerListenerPolicyId)
        .condition("contains")
        .type("header")
        .value("2")
        .field("MY-APP-HEADER")
        .build();

      Response<LoadBalancerListenerPolicyRule> response = vpcService.createLoadBalancerListenerPolicyRule(createLoadBalancerListenerPolicyRuleOptions).execute();
      LoadBalancerListenerPolicyRule loadBalancerListenerPolicyRule = response.getResult();

      // end-create_load_balancer_listener_policy_rule
      loadBalancerListenerPolicyRuleId = loadBalancerListenerPolicyRule.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getLoadBalancerListenerPolicyRule() result:");
      // begin-get_load_balancer_listener_policy_rule
      GetLoadBalancerListenerPolicyRuleOptions getLoadBalancerListenerPolicyRuleOptions = new GetLoadBalancerListenerPolicyRuleOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .listenerId(loadBalancerListenerId)
        .policyId(loadBalancerListenerPolicyId)
        .id(loadBalancerListenerPolicyRuleId)
        .build();

      Response<LoadBalancerListenerPolicyRule> response = vpcService.getLoadBalancerListenerPolicyRule(getLoadBalancerListenerPolicyRuleOptions).execute();
      LoadBalancerListenerPolicyRule loadBalancerListenerPolicyRule = response.getResult();

      // end-get_load_balancer_listener_policy_rule
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateLoadBalancerListenerPolicyRule() result:");
      // begin-update_load_balancer_listener_policy_rule
      LoadBalancerListenerPolicyRulePatch loadBalancerListenerPolicyRulePatchModel = new LoadBalancerListenerPolicyRulePatch.Builder()
        .condition("contains")
        .type("header")
        .field("MY-APP-HEADER-UPDATE")
        .value("1")
        .build();
      Map<String, Object> loadBalancerListenerPolicyRulePatchModelAsPatch = loadBalancerListenerPolicyRulePatchModel.asPatch();
      UpdateLoadBalancerListenerPolicyRuleOptions updateLoadBalancerListenerPolicyRuleOptions = new UpdateLoadBalancerListenerPolicyRuleOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .listenerId(loadBalancerListenerId)
        .policyId(loadBalancerListenerPolicyId)
        .id(loadBalancerListenerPolicyRuleId)
        .loadBalancerListenerPolicyRulePatch(loadBalancerListenerPolicyRulePatchModelAsPatch)
        .build();

      Response<LoadBalancerListenerPolicyRule> response = vpcService.updateLoadBalancerListenerPolicyRule(updateLoadBalancerListenerPolicyRuleOptions).execute();
      LoadBalancerListenerPolicyRule loadBalancerListenerPolicyRule = response.getResult();

      // end-update_load_balancer_listener_policy_rule
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listLoadBalancerPools() result:");
      // begin-list_load_balancer_pools
      ListLoadBalancerPoolsOptions listLoadBalancerPoolsOptions = new ListLoadBalancerPoolsOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .build();

      Response<LoadBalancerPoolCollection> response = vpcService.listLoadBalancerPools(listLoadBalancerPoolsOptions).execute();
      LoadBalancerPoolCollection loadBalancerPoolCollection = response.getResult();

      // end-list_load_balancer_pools
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createLoadBalancerPool() result:");
      // begin-create_load_balancer_pool
      LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSPrototype loadBalancerPoolHealthMonitorPrototypeModel = new LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSPrototype.Builder()
        .delay(Long.valueOf("5"))
        .maxRetries(Long.valueOf("2"))
        .timeout(Long.valueOf("2"))
        .type("http")
        .build();
      CreateLoadBalancerPoolOptions createLoadBalancerPoolOptions = new CreateLoadBalancerPoolOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .algorithm("least_connections")
        .healthMonitor(loadBalancerPoolHealthMonitorPrototypeModel)
        .protocol("http")
        .build();

      Response<LoadBalancerPool> response = vpcService.createLoadBalancerPool(createLoadBalancerPoolOptions).execute();
      LoadBalancerPool loadBalancerPool = response.getResult();

      // end-create_load_balancer_pool
      loadBalancerPoolId = loadBalancerPool.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getLoadBalancerPool() result:");
      // begin-get_load_balancer_pool
      GetLoadBalancerPoolOptions getLoadBalancerPoolOptions = new GetLoadBalancerPoolOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .id(loadBalancerPoolId)
        .build();

      Response<LoadBalancerPool> response = vpcService.getLoadBalancerPool(getLoadBalancerPoolOptions).execute();
      LoadBalancerPool loadBalancerPool = response.getResult();

      // end-get_load_balancer_pool
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateLoadBalancerPool() result:");
      // begin-update_load_balancer_pool
      LoadBalancerPoolPatch loadBalancerPoolPatchModel = new LoadBalancerPoolPatch.Builder()
        .name("my-lbpool-update")
        .build();
      Map<String, Object> loadBalancerPoolPatchModelAsPatch = loadBalancerPoolPatchModel.asPatch();
      UpdateLoadBalancerPoolOptions updateLoadBalancerPoolOptions = new UpdateLoadBalancerPoolOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .id(loadBalancerPoolId)
        .loadBalancerPoolPatch(loadBalancerPoolPatchModelAsPatch)
        .build();

      Response<LoadBalancerPool> response = vpcService.updateLoadBalancerPool(updateLoadBalancerPoolOptions).execute();
      LoadBalancerPool loadBalancerPool = response.getResult();

      // end-update_load_balancer_pool
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listLoadBalancerPoolMembers() result:");
      // begin-list_load_balancer_pool_members
      ListLoadBalancerPoolMembersOptions listLoadBalancerPoolMembersOptions = new ListLoadBalancerPoolMembersOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .poolId(loadBalancerPoolId)
        .build();

      Response<LoadBalancerPoolMemberCollection> response = vpcService.listLoadBalancerPoolMembers(listLoadBalancerPoolMembersOptions).execute();
      LoadBalancerPoolMemberCollection loadBalancerPoolMemberCollection = response.getResult();

      // end-list_load_balancer_pool_members
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createLoadBalancerPoolMember() result:");
      // begin-create_load_balancer_pool_member
      LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById loadBalancerPoolMemberTargetPrototypeModel = new LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById.Builder()
        .id(instanceId)
        .build();
      CreateLoadBalancerPoolMemberOptions createLoadBalancerPoolMemberOptions = new CreateLoadBalancerPoolMemberOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .poolId(loadBalancerPoolId)
        .port(Long.valueOf("80"))
        .target(loadBalancerPoolMemberTargetPrototypeModel)
        .build();

      Response<LoadBalancerPoolMember> response = vpcService.createLoadBalancerPoolMember(createLoadBalancerPoolMemberOptions).execute();
      LoadBalancerPoolMember loadBalancerPoolMember = response.getResult();

      // end-create_load_balancer_pool_member
      loadBalancerPoolMemberId = loadBalancerPoolMember.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("replaceLoadBalancerPoolMembers() result:");
      // begin-replace_load_balancer_pool_members
      LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById loadBalancerPoolMemberTargetPrototypeModel = new LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById.Builder()
        .id(instanceId)
        .build();
      LoadBalancerPoolMemberPrototype loadBalancerPoolMemberPrototypeModel = new LoadBalancerPoolMemberPrototype.Builder()
        .port(Long.valueOf("80"))
        .target(loadBalancerPoolMemberTargetPrototypeModel)
        .build();
      ReplaceLoadBalancerPoolMembersOptions replaceLoadBalancerPoolMembersOptions = new ReplaceLoadBalancerPoolMembersOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .poolId(loadBalancerPoolId)
        .members(new java.util.ArrayList<LoadBalancerPoolMemberPrototype>(java.util.Arrays.asList(loadBalancerPoolMemberPrototypeModel)))
        .build();

      Response<LoadBalancerPoolMemberCollection> response = vpcService.replaceLoadBalancerPoolMembers(replaceLoadBalancerPoolMembersOptions).execute();
      LoadBalancerPoolMemberCollection loadBalancerPoolMemberCollection = response.getResult();

      // end-replace_load_balancer_pool_members
      loadBalancerPoolMemberId = loadBalancerPoolMemberCollection.getMembers().get(0).getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getLoadBalancerPoolMember() result:");
      // begin-get_load_balancer_pool_member
      GetLoadBalancerPoolMemberOptions getLoadBalancerPoolMemberOptions = new GetLoadBalancerPoolMemberOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .poolId(loadBalancerPoolId)
        .id(loadBalancerPoolMemberId)
        .build();

      Response<LoadBalancerPoolMember> response = vpcService.getLoadBalancerPoolMember(getLoadBalancerPoolMemberOptions).execute();
      LoadBalancerPoolMember loadBalancerPoolMember = response.getResult();

      // end-get_load_balancer_pool_member
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateLoadBalancerPoolMember() result:");
      // begin-update_load_balancer_pool_member
      LoadBalancerPoolMemberPatch loadBalancerPoolMemberPatchModel = new LoadBalancerPoolMemberPatch.Builder()
        .port(Long.valueOf("81"))
        .build();
      Map<String, Object> loadBalancerPoolMemberPatchModelAsPatch = loadBalancerPoolMemberPatchModel.asPatch();
      UpdateLoadBalancerPoolMemberOptions updateLoadBalancerPoolMemberOptions = new UpdateLoadBalancerPoolMemberOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .poolId(loadBalancerPoolId)
        .id(loadBalancerPoolMemberId)
        .loadBalancerPoolMemberPatch(loadBalancerPoolMemberPatchModelAsPatch)
        .build();

      Response<LoadBalancerPoolMember> response = vpcService.updateLoadBalancerPoolMember(updateLoadBalancerPoolMemberOptions).execute();
      LoadBalancerPoolMember loadBalancerPoolMember = response.getResult();

      // end-update_load_balancer_pool_member
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listEndpointGateways() result:");
      // begin-list_endpoint_gateways
      ListEndpointGatewaysOptions listEndpointGatewaysOptions = new ListEndpointGatewaysOptions.Builder()
        .limit(Long.valueOf(10))
        .build();

      EndpointGatewaysPager pager = new EndpointGatewaysPager(vpcService, listEndpointGatewaysOptions);
      List<EndpointGateway> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<EndpointGateway> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_endpoint_gateways
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createEndpointGateway() result:");
      // begin-create_endpoint_gateway
      EndpointGatewayReservedIPReservedIPIdentity endpointGatewayReservedIPReservedIPIdentity = new EndpointGatewayReservedIPReservedIPIdentityById.Builder()
        .id(reservedIpId)
        .build();
        EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderCloudServicePrototype endpointGatewayTargetPrototypeModel = new EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderCloudServicePrototype.Builder()
        .resourceType("provider_infrastructure_service")
        .crn(crn)
        .build();
      VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
        .id(vpcId)
        .build();
      CreateEndpointGatewayOptions createEndpointGatewayOptions = new CreateEndpointGatewayOptions.Builder()
        .name("my-endpoint-gateway")
        .ips(new java.util.ArrayList<EndpointGatewayReservedIP>(java.util.Arrays.asList(endpointGatewayReservedIPReservedIPIdentity)))
        .target(endpointGatewayTargetPrototypeModel)
        .vpc(vpcIdentityModel)
        .build();

      Response<EndpointGateway> response = vpcService.createEndpointGateway(createEndpointGatewayOptions).execute();
      EndpointGateway endpointGateway = response.getResult();

      // end-create_endpoint_gateway
      endpointGatewayId = endpointGateway.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listEndpointGatewayIps() result:");
      // begin-list_endpoint_gateway_ips
      ListEndpointGatewayIpsOptions listEndpointGatewayIpsOptions = new ListEndpointGatewayIpsOptions.Builder()
        .endpointGatewayId(endpointGatewayId)
        .sort("name")
        .limit(Long.valueOf(10))
        .build();

      EndpointGatewayIpsPager pager = new EndpointGatewayIpsPager(vpcService, listEndpointGatewayIpsOptions);
      List<ReservedIP> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<ReservedIP> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_endpoint_gateway_ips
      endpointGatewayIpId = allResults.get(0).getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getEndpointGatewayIp() result:");
      // begin-get_endpoint_gateway_ip
      GetEndpointGatewayIpOptions getEndpointGatewayIpOptions = new GetEndpointGatewayIpOptions.Builder()
        .endpointGatewayId(endpointGatewayId)
        .id(endpointGatewayIpId)
        .build();

      Response<ReservedIP> response = vpcService.getEndpointGatewayIp(getEndpointGatewayIpOptions).execute();
      ReservedIP reservedIp = response.getResult();

      // end-get_endpoint_gateway_ip
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("addEndpointGatewayIp() result:");
      // begin-add_endpoint_gateway_ip
      AddEndpointGatewayIpOptions addEndpointGatewayIpOptions = new AddEndpointGatewayIpOptions.Builder()
        .endpointGatewayId(endpointGatewayId)
        .id(endpointGatewayIpId)
        .build();

      Response<ReservedIP> response = vpcService.addEndpointGatewayIp(addEndpointGatewayIpOptions).execute();
      ReservedIP reservedIp = response.getResult();

      // end-add_endpoint_gateway_ip
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getEndpointGateway() result:");
      // begin-get_endpoint_gateway
      GetEndpointGatewayOptions getEndpointGatewayOptions = new GetEndpointGatewayOptions.Builder()
        .id(endpointGatewayId)
        .build();

      Response<EndpointGateway> response = vpcService.getEndpointGateway(getEndpointGatewayOptions).execute();
      EndpointGateway endpointGateway = response.getResult();

      // end-get_endpoint_gateway
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateEndpointGateway() result:");
      // begin-update_endpoint_gateway
      EndpointGatewayPatch endpointGatewayPatchModel = new EndpointGatewayPatch.Builder()
        .name("my-endpoint-gateway-update")
        .build();
      Map<String, Object> endpointGatewayPatchModelAsPatch = endpointGatewayPatchModel.asPatch();
      UpdateEndpointGatewayOptions updateEndpointGatewayOptions = new UpdateEndpointGatewayOptions.Builder()
        .id(endpointGatewayId)
        .endpointGatewayPatch(endpointGatewayPatchModelAsPatch)
        .build();

      Response<EndpointGateway> response = vpcService.updateEndpointGateway(updateEndpointGatewayOptions).execute();
      EndpointGateway endpointGateway = response.getResult();

      // end-update_endpoint_gateway
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listFlowLogCollectors() result:");
      // begin-list_flow_log_collectors
      ListFlowLogCollectorsOptions listFlowLogCollectorsOptions = new ListFlowLogCollectorsOptions.Builder()
        .limit(Long.valueOf(10))
        .build();

      FlowLogCollectorsPager pager = new FlowLogCollectorsPager(vpcService, listFlowLogCollectorsOptions);
      List<FlowLogCollector> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<FlowLogCollector> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      // end-list_flow_log_collectors
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createFlowLogCollector() result:");
      // begin-create_flow_log_collector
      LegacyCloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByName legacyCloudObjectStorageBucketIdentityModel = new LegacyCloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByName.Builder()
        .name(cosBucketName)
        .build();
      FlowLogCollectorTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityById flowLogCollectorTargetPrototypeModel = new FlowLogCollectorTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityById.Builder()
        .id(instanceNetworkInterfaceId)
        .build();
      CreateFlowLogCollectorOptions createFlowLogCollectorOptions = new CreateFlowLogCollectorOptions.Builder()
        .name("my-flow-log-collector")
        .storageBucket(legacyCloudObjectStorageBucketIdentityModel)
        .target(flowLogCollectorTargetPrototypeModel)
        .build();

      Response<FlowLogCollector> response = vpcService.createFlowLogCollector(createFlowLogCollectorOptions).execute();
      FlowLogCollector flowLogCollector = response.getResult();

      // end-create_flow_log_collector
      flowLogCollectorId = flowLogCollector.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getFlowLogCollector() result:");
      // begin-get_flow_log_collector
      GetFlowLogCollectorOptions getFlowLogCollectorOptions = new GetFlowLogCollectorOptions.Builder()
        .id(flowLogCollectorId)
        .build();

      Response<FlowLogCollector> response = vpcService.getFlowLogCollector(getFlowLogCollectorOptions).execute();
      FlowLogCollector flowLogCollector = response.getResult();

      // end-get_flow_log_collector
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateFlowLogCollector() result:");
      // begin-update_flow_log_collector
      FlowLogCollectorPatch flowLogCollectorPatchModel = new FlowLogCollectorPatch.Builder()
        .name("my-flow-log-collector-update")
        .build();
      Map<String, Object> flowLogCollectorPatchModelAsPatch = flowLogCollectorPatchModel.asPatch();
      UpdateFlowLogCollectorOptions updateFlowLogCollectorOptions = new UpdateFlowLogCollectorOptions.Builder()
        .id(flowLogCollectorId)
        .flowLogCollectorPatch(flowLogCollectorPatchModelAsPatch)
        .build();

      Response<FlowLogCollector> response = vpcService.updateFlowLogCollector(updateFlowLogCollectorOptions).execute();
      FlowLogCollector flowLogCollector = response.getResult();

      // end-update_flow_log_collector
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }


    try {
      System.out.println("deleteClusterNetworkInterface() result:");
      // begin-delete_cluster_network_interface
      DeleteClusterNetworkInterfaceOptions deleteClusterNetworkInterfaceOptions = new DeleteClusterNetworkInterfaceOptions.Builder()
        .clusterNetworkId(clusterNetworkId)
        .id(clusterNetworkInterfaceId)
        .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
        .build();

      Response<ClusterNetworkInterface> response = vpcService.deleteClusterNetworkInterface(deleteClusterNetworkInterfaceOptions).execute();
      ClusterNetworkInterface clusterNetworkInterface = response.getResult();

      // end-delete_cluster_network_interface
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("deleteClusterNetworkSubnetReservedIp() result:");
      // begin-delete_cluster_network_subnet_reserved_ip
      DeleteClusterNetworkSubnetReservedIpOptions deleteClusterNetworkSubnetReservedIpOptions = new DeleteClusterNetworkSubnetReservedIpOptions.Builder()
        .clusterNetworkId(clusterNetworkId)
        .clusterNetworkSubnetId(clusterNetworkInterfaceId)
        .id(clusterNetworkSubnetReservedIpId)
        .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
        .build();

      Response<ClusterNetworkSubnetReservedIP> response = vpcService.deleteClusterNetworkSubnetReservedIp(deleteClusterNetworkSubnetReservedIpOptions).execute();
      ClusterNetworkSubnetReservedIP clusterNetworkSubnetReservedIp = response.getResult();

      // end-delete_cluster_network_subnet_reserved_ip
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("deleteClusterNetworkSubnet() result:");
      // begin-delete_cluster_network_subnet
      DeleteClusterNetworkSubnetOptions deleteClusterNetworkSubnetOptions = new DeleteClusterNetworkSubnetOptions.Builder()
        .clusterNetworkId(clusterNetworkId)
        .id(clusterNetworkInterfaceId)
        .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
        .build();

      Response<ClusterNetworkSubnet> response = vpcService.deleteClusterNetworkSubnet(deleteClusterNetworkSubnetOptions).execute();
      ClusterNetworkSubnet clusterNetworkSubnet = response.getResult();

      System.out.println(clusterNetworkSubnet);
      // end-delete_cluster_network_subnet
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("deleteClusterNetwork() result:");
      // begin-delete_cluster_network
      DeleteClusterNetworkOptions deleteClusterNetworkOptions = new DeleteClusterNetworkOptions.Builder()
        .id(clusterNetworkId)
        .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
        .build();

      Response<ClusterNetwork> response = vpcService.deleteClusterNetwork(deleteClusterNetworkOptions).execute();
      ClusterNetwork clusterNetwork = response.getResult();

      System.out.println(clusterNetwork);
      // end-delete_cluster_network
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }


    try {
      // begin-unset_subnet_public_gateway
      UnsetSubnetPublicGatewayOptions unsetSubnetPublicGatewayOptions = new UnsetSubnetPublicGatewayOptions.Builder()
        .id(subnetId)
        .build();

      Response<Void> response = vpcService.unsetSubnetPublicGateway(unsetSubnetPublicGatewayOptions).execute();
      // end-unset_subnet_public_gateway
      System.out.printf("unsetSubnetPublicGateway() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-remove_vpn_gateway_connections_local_cidr
      RemoveVpnGatewayConnectionsLocalCidrOptions removeVpnGatewayConnectionsLocalCidrOptions = new RemoveVpnGatewayConnectionsLocalCidrOptions.Builder()
        .vpnGatewayId(vpnGatewayId)
        .id(vpnGatewayConnectionId)
        .cidr("192.134.0.0/28")
        .build();

      Response<Void> response = vpcService.removeVpnGatewayConnectionsLocalCidr(removeVpnGatewayConnectionsLocalCidrOptions).execute();
      // end-remove_vpn_gateway_connections_local_cidr
      System.out.printf("removeVpnGatewayConnectionsLocalCidr() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-remove_vpn_gateway_connections_peer_cidr
      RemoveVpnGatewayConnectionsPeerCidrOptions removeVpnGatewayConnectionsPeerCidrOptions = new RemoveVpnGatewayConnectionsPeerCidrOptions.Builder()
        .vpnGatewayId(vpnGatewayId)
        .id(vpnGatewayConnectionId)
        .cidr("192.134.0.0/28")
        .build();

      Response<Void> response = vpcService.removeVpnGatewayConnectionsPeerCidr(removeVpnGatewayConnectionsPeerCidrOptions).execute();
      // end-remove_vpn_gateway_connections_peer_cidr
      System.out.printf("removeVpnGatewayConnectionsPeerCidr() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-remove_instance_network_interface_floating_ip
      RemoveInstanceNetworkInterfaceFloatingIpOptions removeInstanceNetworkInterfaceFloatingIpOptions = new RemoveInstanceNetworkInterfaceFloatingIpOptions.Builder()
        .instanceId(instanceId)
        .networkInterfaceId(instanceNetworkInterfaceId)
        .id(floatingIpId)
        .build();

      Response<Void> response = vpcService.removeInstanceNetworkInterfaceFloatingIp(removeInstanceNetworkInterfaceFloatingIpOptions).execute();
      // end-remove_instance_network_interface_floating_ip
      System.out.printf("removeInstanceNetworkInterfaceFloatingIp() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_security_group_target_binding
      DeleteSecurityGroupTargetBindingOptions deleteSecurityGroupTargetBindingOptions = new DeleteSecurityGroupTargetBindingOptions.Builder()
              .securityGroupId(securityGroupId)
              .id(targetId)
              .build();

      Response<Void> response = vpcService.deleteSecurityGroupTargetBinding(deleteSecurityGroupTargetBindingOptions).execute();
      // end-delete_security_group_target_binding
      System.out.printf("deleteSecurityGroupTargetBinding() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-remove_bare_metal_server_network_interface_floating_ip
      RemoveBareMetalServerNetworkInterfaceFloatingIpOptions removeBareMetalServerNetworkInterfaceFloatingIpOptions = new RemoveBareMetalServerNetworkInterfaceFloatingIpOptions.Builder()
              .bareMetalServerId(bareMetalServerId)
              .networkInterfaceId(bareMetalServerNetworkInterfaceId)
              .id(floatingIpId)
              .build();

      Response<Void> response = vpcService.removeBareMetalServerNetworkInterfaceFloatingIp(removeBareMetalServerNetworkInterfaceFloatingIpOptions).execute();
      // end-remove_bare_metal_server_network_interface_floating_ip
      System.out.printf("removeBareMetalServerNetworkInterfaceFloatingIp() response status code: %d%n", response.getStatusCode());

    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_bare_metal_server_network_interface
      DeleteBareMetalServerNetworkInterfaceOptions deleteBareMetalServerNetworkInterfaceOptions = new DeleteBareMetalServerNetworkInterfaceOptions.Builder()
              .bareMetalServerId(bareMetalServerId)
              .id(bareMetalServerNetworkInterfaceId)
              .build();

      Response<Void> response = vpcService.deleteBareMetalServerNetworkInterface(deleteBareMetalServerNetworkInterfaceOptions).execute();
      // end-delete_bare_metal_server_network_interface
      System.out.printf("deleteBareMetalServerNetworkInterface() response status code: %d%n", response.getStatusCode());

    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_bare_metal_server
      DeleteBareMetalServerOptions deleteBareMetalServerOptions = new DeleteBareMetalServerOptions.Builder()
              .id(bareMetalServerId)
              .build();

      Response<Void> response = vpcService.deleteBareMetalServer(deleteBareMetalServerOptions).execute();
      // end-delete_bare_metal_server
      System.out.printf("deleteBareMetalServer() response status code: %d%n", response.getStatusCode());

    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-remove_endpoint_gateway_ip
      RemoveEndpointGatewayIpOptions removeEndpointGatewayIpOptions = new RemoveEndpointGatewayIpOptions.Builder()
        .endpointGatewayId(endpointGatewayId)
        .id(endpointGatewayIpId)
        .build();

      Response<Void> response = vpcService.removeEndpointGatewayIp(removeEndpointGatewayIpOptions).execute();
      // end-remove_endpoint_gateway_ip
      System.out.printf("removeEndpointGatewayIp() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }


    try {
      // begin-delete_vpn_server_route
      DeleteVpnServerRouteOptions deleteVpnServerRouteOptions = new DeleteVpnServerRouteOptions.Builder()
        .vpnServerId(vpnServerId)
        .id(vpnServerRouteId)
        .build();

      Response<Void> response = vpcService.deleteVpnServerRoute(deleteVpnServerRouteOptions).execute();
      // end-delete_vpn_server_route
      System.out.printf("deleteVpnServerRoute() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_vpn_server_client
      DeleteVpnServerClientOptions deleteVpnServerClientOptions = new DeleteVpnServerClientOptions.Builder()
        .vpnServerId(vpnServerId)
        .id(vpnServerClientId)
        .build();

      Response<Void> response = vpcService.deleteVpnServerClient(deleteVpnServerClientOptions).execute();
      // end-delete_vpn_server_client
      System.out.printf("deleteVpnServerClient() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_vpn_server
      DeleteVpnServerOptions deleteVpnServerOptions = new DeleteVpnServerOptions.Builder()
        .id(vpnServerId)
        .ifMatch(ifMatchVpnServer)
        .build();

      Response<Void> response = vpcService.deleteVpnServer(deleteVpnServerOptions).execute();
      // end-delete_vpn_server
      System.out.printf("deleteVpnServer() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_vpn_gateway_connection
      DeleteVpnGatewayConnectionOptions deleteVpnGatewayConnectionOptions = new DeleteVpnGatewayConnectionOptions.Builder()
        .vpnGatewayId(vpnGatewayId)
        .id(vpnGatewayConnectionId)
        .build();

      Response<Void> response = vpcService.deleteVpnGatewayConnection(deleteVpnGatewayConnectionOptions).execute();
      // end-delete_vpn_gateway_connection
      System.out.printf("deleteVpnGatewayConnection() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_vpn_gateway
      DeleteVpnGatewayOptions deleteVpnGatewayOptions = new DeleteVpnGatewayOptions.Builder()
        .id(vpnGatewayId)
        .build();

      Response<Void> response = vpcService.deleteVpnGateway(deleteVpnGatewayOptions).execute();
      // end-delete_vpn_gateway
      System.out.printf("deleteVpnGateway() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }


    try {
      // begin-delete_subnet_reserved_ip
      DeleteSubnetReservedIpOptions deleteSubnetReservedIpOptions = new DeleteSubnetReservedIpOptions.Builder()
              .subnetId(subnetId)
              .id(reservedIpId)
              .build();

      Response<Void> response = vpcService.deleteSubnetReservedIp(deleteSubnetReservedIpOptions).execute();
      // end-delete_subnet_reserved_ip
      System.out.printf("deleteSubnetReservedIp() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_subnet
      DeleteSubnetOptions deleteSubnetOptions = new DeleteSubnetOptions.Builder()
              .id(subnetId)
              .build();

      Response<Void> response = vpcService.deleteSubnet(deleteSubnetOptions).execute();
      // end-delete_subnet
      System.out.printf("deleteSubnet() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_vpc_routing_table_route
      DeleteVpcRoutingTableRouteOptions deleteVpcRoutingTableRouteOptions = new DeleteVpcRoutingTableRouteOptions.Builder()
        .vpcId(vpcId)
        .routingTableId(routingTableId)
        .id(routingTableRouteId)
        .build();

      Response<Void> response = vpcService.deleteVpcRoutingTableRoute(deleteVpcRoutingTableRouteOptions).execute();
      // end-delete_vpc_routing_table_route
      System.out.printf("deleteVpcRoutingTableRoute() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_vpc_routing_table
      DeleteVpcRoutingTableOptions deleteVpcRoutingTableOptions = new DeleteVpcRoutingTableOptions.Builder()
        .vpcId(vpcId)
        .id(routingTableId)
        .build();

      Response<Void> response = vpcService.deleteVpcRoutingTable(deleteVpcRoutingTableOptions).execute();
      // end-delete_vpc_routing_table
      System.out.printf("deleteVpcRoutingTable() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {

      // begin-delete_vpc_dns_resolution_binding
      DeleteVpcDnsResolutionBindingOptions deleteVpcDnsResolutionBindingOptions = new DeleteVpcDnsResolutionBindingOptions.Builder()
        .vpcId(vpcId)
        .id(vpcdnsResolutionBindingId)
        .build();

      Response<VPCDNSResolutionBinding> response = vpcService.deleteVpcDnsResolutionBinding(deleteVpcDnsResolutionBindingOptions).execute();
      // end-delete_vpc_dns_resolution_binding
      System.out.printf("deleteVpcDnsResolutionBinding() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_vpc_route
      DeleteVpcRouteOptions deleteVpcRouteOptions = new DeleteVpcRouteOptions.Builder()
        .vpcId(vpcId)
        .id(vpcRouteId)
        .build();

      Response<Void> response = vpcService.deleteVpcRoute(deleteVpcRouteOptions).execute();
      // end-delete_vpc_route
      System.out.printf("deleteVpcRoute() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_vpc_address_prefix
      DeleteVpcAddressPrefixOptions deleteVpcAddressPrefixOptions = new DeleteVpcAddressPrefixOptions.Builder()
        .vpcId(vpcId)
        .id(addressPrefixId)
        .build();

      Response<Void> response = vpcService.deleteVpcAddressPrefix(deleteVpcAddressPrefixOptions).execute();
      // end-delete_vpc_address_prefix
      System.out.printf("deleteVpcAddressPrefix() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_vpc
      DeleteVpcOptions deleteVpcOptions = new DeleteVpcOptions.Builder()
        .id(vpcId)
        .build();

      Response<Void> response = vpcService.deleteVpc(deleteVpcOptions).execute();
      // end-delete_vpc
      System.out.printf("deleteVpc() response status code: %d%n", response.getStatusCode());
      deleteVpcOptions = new DeleteVpcOptions.Builder()
        .id(secondVpcId)
        .build();
      response = vpcService.deleteVpc(deleteVpcOptions).execute();
      System.out.printf("deleteVpc() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_snapshot_clone
      DeleteSnapshotCloneOptions deleteSnapshotCloneOptions = new DeleteSnapshotCloneOptions.Builder()
        .id(snapshotId)
        .zoneName(zoneName)
        .build();

      Response<Void> response = vpcService.deleteSnapshotClone(deleteSnapshotCloneOptions).execute();
      // end-delete_snapshot_clone
      System.out.printf("deleteSnapshotClone() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_share_source
      DeleteShareSourceOptions deleteShareSourceOptions = new DeleteShareSourceOptions.Builder()
        .shareId(shareId)
        .build();

      Response<Void> response = vpcService.deleteShareSource(deleteShareSourceOptions).execute();
      // end-delete_share_source
      System.out.printf("deleteShareSource() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("deleteShareMountTarget() result:");
      // begin-delete_share_mount_target
      DeleteShareMountTargetOptions deleteShareMountTargetOptions = new DeleteShareMountTargetOptions.Builder()
        .shareId(shareId)
        .id(shareMountTargetId)
        .build();

      Response<ShareMountTarget> response = vpcService.deleteShareMountTarget(deleteShareMountTargetOptions).execute();
      ShareMountTarget shareMountTarget = response.getResult();
      System.out.printf("deleteShareMountTarget() response status code: %d%n", response.getStatusCode());

      // end-delete_share_mount_target
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("deleteShare() result:");
      // begin-delete_share
      DeleteShareOptions deleteShareOptions = new DeleteShareOptions.Builder()
        .id("testString")
        .ifMatch(ifMatchShare)
        .build();

      Response<Share> response = vpcService.deleteShare(deleteShareOptions).execute();
      Share share = response.getResult();

      // delete share replica
      DeleteShareOptions deleteShareReplicaOptions = new DeleteShareOptions.Builder()
        .id(shareReplicaId)
        .ifMatch(ifMatchShareReplica)
        .build();

      Response<Share> responseReplica = vpcService.deleteShare(deleteShareOptions).execute();
      System.out.printf("deleteShare() response status code: %d%n", response.getStatusCode());
      System.out.printf("deleteShare() response status code: %d%n", responseReplica.getStatusCode());

      // end-delete_share
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      DeleteSnapshotOptions deleteSnapshotCopyOptions = new DeleteSnapshotOptions.Builder()
        .id(snapshotCopyId)
        .ifMatch(ifMatchSnapshotCopy)
        .build();

      Response<Snapshot> responseCopy = vpcService.deleteSnapshot(deleteSnapshotCopyOptions).execute();
      System.out.printf("deleteSnapshot() copy response status code: %d%n", responseCopy.getStatusCode());
      // begin-delete_snapshot
      DeleteSnapshotOptions deleteSnapshotOptions = new DeleteSnapshotOptions.Builder()
        .id(snapshotId)
        .ifMatch(ifMatchSnapshotCopy)
        .build();

      Response<Snapshot> response = vpcService.deleteSnapshot(deleteSnapshotOptions).execute();
      // end-delete_snapshot
      System.out.printf("deleteSnapshot() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_snapshots
      DeleteSnapshotsOptions deleteSnapshotsOptions = new DeleteSnapshotsOptions.Builder()
              .sourceVolumeId(sourceVolume)
              .build();

      Response<Void> response = vpcService.deleteSnapshots(deleteSnapshotsOptions).execute();
      // end-delete_snapshots
      System.out.printf("deleteSnapshots() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_security_group_rule
      DeleteSecurityGroupRuleOptions deleteSecurityGroupRuleOptions = new DeleteSecurityGroupRuleOptions.Builder()
        .securityGroupId(securityGroupId)
        .id(securityGroupRuleId)
        .build();

      Response<Void> response = vpcService.deleteSecurityGroupRule(deleteSecurityGroupRuleOptions).execute();
      // end-delete_security_group_rule
      System.out.printf("deleteSecurityGroupRule() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_security_group
      DeleteSecurityGroupOptions deleteSecurityGroupOptions = new DeleteSecurityGroupOptions.Builder()
        .id(securityGroupId)
        .build();

      Response<Void> response = vpcService.deleteSecurityGroup(deleteSecurityGroupOptions).execute();
      // end-delete_security_group
      System.out.printf("deleteSecurityGroup() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_public_gateway
      DeletePublicGatewayOptions deletePublicGatewayOptions = new DeletePublicGatewayOptions.Builder()
        .id(publicGatewayId)
        .build();

      Response<Void> response = vpcService.deletePublicGateway(deletePublicGatewayOptions).execute();
      // end-delete_public_gateway
      System.out.printf("deletePublicGateway() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_placement_group
      DeletePlacementGroupOptions deletePlacementGroupOptions = new DeletePlacementGroupOptions.Builder()
        .id(placementGroupId)
        .build();

      Response<Void> response = vpcService.deletePlacementGroup(deletePlacementGroupOptions).execute();
      // end-delete_placement_group
      System.out.printf("deletePlacementGroup() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_network_acl_rule
      DeleteNetworkAclRuleOptions deleteNetworkAclRuleOptions = new DeleteNetworkAclRuleOptions.Builder()
        .networkAclId(networkAclId)
        .id(networkAclRuleId)
        .build();

      Response<Void> response = vpcService.deleteNetworkAclRule(deleteNetworkAclRuleOptions).execute();
      // end-delete_network_acl_rule
      System.out.printf("deleteNetworkAclRule() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_network_acl
      DeleteNetworkAclOptions deleteNetworkAclOptions = new DeleteNetworkAclOptions.Builder()
        .id(networkAclId)
        .build();

      Response<Void> response = vpcService.deleteNetworkAcl(deleteNetworkAclOptions).execute();
      // end-delete_network_acl
      System.out.printf("deleteNetworkAcl() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_load_balancer_pool_member
      DeleteLoadBalancerPoolMemberOptions deleteLoadBalancerPoolMemberOptions = new DeleteLoadBalancerPoolMemberOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .poolId(loadBalancerPoolId)
        .id(loadBalancerPoolMemberId)
        .build();

      Response<Void> response = vpcService.deleteLoadBalancerPoolMember(deleteLoadBalancerPoolMemberOptions).execute();
      // end-delete_load_balancer_pool_member
      System.out.printf("deleteLoadBalancerPoolMember() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_load_balancer_pool
      DeleteLoadBalancerPoolOptions deleteLoadBalancerPoolOptions = new DeleteLoadBalancerPoolOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .id(loadBalancerPoolId)
        .build();

      Response<Void> response = vpcService.deleteLoadBalancerPool(deleteLoadBalancerPoolOptions).execute();
      // end-delete_load_balancer_pool
      System.out.printf("deleteLoadBalancerPool() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_load_balancer_listener_policy_rule
      DeleteLoadBalancerListenerPolicyRuleOptions deleteLoadBalancerListenerPolicyRuleOptions = new DeleteLoadBalancerListenerPolicyRuleOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .listenerId(loadBalancerListenerId)
        .policyId(loadBalancerListenerPolicyId)
        .id(loadBalancerListenerPolicyRuleId)
        .build();

      Response<Void> response = vpcService.deleteLoadBalancerListenerPolicyRule(deleteLoadBalancerListenerPolicyRuleOptions).execute();
      // end-delete_load_balancer_listener_policy_rule
      System.out.printf("deleteLoadBalancerListenerPolicyRule() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_load_balancer_listener_policy
      DeleteLoadBalancerListenerPolicyOptions deleteLoadBalancerListenerPolicyOptions = new DeleteLoadBalancerListenerPolicyOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .listenerId(loadBalancerListenerId)
        .id(loadBalancerListenerPolicyId)
        .build();

      Response<Void> response = vpcService.deleteLoadBalancerListenerPolicy(deleteLoadBalancerListenerPolicyOptions).execute();
      // end-delete_load_balancer_listener_policy
      System.out.printf("deleteLoadBalancerListenerPolicy() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_load_balancer_listener
      DeleteLoadBalancerListenerOptions deleteLoadBalancerListenerOptions = new DeleteLoadBalancerListenerOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .id(loadBalancerListenerId)
        .build();

      Response<Void> response = vpcService.deleteLoadBalancerListener(deleteLoadBalancerListenerOptions).execute();
      // end-delete_load_balancer_listener
      System.out.printf("deleteLoadBalancerListener() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_load_balancer
      DeleteLoadBalancerOptions deleteLoadBalancerOptions = new DeleteLoadBalancerOptions.Builder()
        .id(loadBalancerId)
        .build();

      Response<Void> response = vpcService.deleteLoadBalancer(deleteLoadBalancerOptions).execute();
      // end-delete_load_balancer
      System.out.printf("deleteLoadBalancer() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_image_export_job
      DeleteImageExportJobOptions deleteImageExportJobOptions = new DeleteImageExportJobOptions.Builder()
        .imageId(imageId)
        .id(imageExportJobId)
        .build();

      Response<Void> response = vpcService.deleteImageExportJob(deleteImageExportJobOptions).execute();
      // end-delete_image_export_job
      System.out.printf("deleteImageExportJob() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_key
      DeleteKeyOptions deleteKeyOptions = new DeleteKeyOptions.Builder()
        .id(keyId)
        .build();

      Response<Void> response = vpcService.deleteKey(deleteKeyOptions).execute();
      // end-delete_key
      System.out.printf("deleteKey() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_ipsec_policy
      DeleteIpsecPolicyOptions deleteIpsecPolicyOptions = new DeleteIpsecPolicyOptions.Builder()
        .id(iPsecPolicyId)
        .build();

      Response<Void> response = vpcService.deleteIpsecPolicy(deleteIpsecPolicyOptions).execute();
      // end-delete_ipsec_policy
      System.out.printf("deleteIpsecPolicy() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }


    try {
      System.out.println("deleteInstanceClusterNetworkAttachment() result:");
      // begin-delete_instance_cluster_network_attachment
      DeleteInstanceClusterNetworkAttachmentOptions deleteInstanceClusterNetworkAttachmentOptions = new DeleteInstanceClusterNetworkAttachmentOptions.Builder()
        .instanceId(instanceId)
        .id(instanceClusterNetworkAttachmentId)
        .build();

      Response<InstanceClusterNetworkAttachment> response = vpcService.deleteInstanceClusterNetworkAttachment(deleteInstanceClusterNetworkAttachmentOptions).execute();
      InstanceClusterNetworkAttachment instanceClusterNetworkAttachment = response.getResult();

      // end-delete_instance_cluster_network_attachment
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }


    try {
      // begin-delete_instance_volume_attachment
      DeleteInstanceVolumeAttachmentOptions deleteInstanceVolumeAttachmentOptions = new DeleteInstanceVolumeAttachmentOptions.Builder()
        .instanceId(instanceId)
        .id(instanceVolumeAttachmentId)
        .build();

      Response<Void> response = vpcService.deleteInstanceVolumeAttachment(deleteInstanceVolumeAttachmentOptions).execute();
      // end-delete_instance_volume_attachment
      System.out.printf("deleteInstanceVolumeAttachment() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_volume
      DeleteVolumeOptions deleteVolumeOptions = new DeleteVolumeOptions.Builder()
              .id(volumeId)
              .build();

      Response<Void> response = vpcService.deleteVolume(deleteVolumeOptions).execute();
      // end-delete_volume
      System.out.printf("deleteVolume() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_instance_template
      DeleteInstanceTemplateOptions deleteInstanceTemplateOptions = new DeleteInstanceTemplateOptions.Builder()
        .id(instanceTemplateId)
        .build();

      Response<Void> response = vpcService.deleteInstanceTemplate(deleteInstanceTemplateOptions).execute();
      // end-delete_instance_template
      System.out.printf("deleteInstanceTemplate() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_instance_network_interface
      DeleteInstanceNetworkInterfaceOptions deleteInstanceNetworkInterfaceOptions = new DeleteInstanceNetworkInterfaceOptions.Builder()
        .instanceId(instanceId)
        .id(instanceNetworkInterfaceId)
        .build();

      Response<Void> response = vpcService.deleteInstanceNetworkInterface(deleteInstanceNetworkInterfaceOptions).execute();
      // end-delete_instance_network_interface
      System.out.printf("deleteInstanceNetworkInterface() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_instance_group_memberships
      DeleteInstanceGroupMembershipsOptions deleteInstanceGroupMembershipsOptions = new DeleteInstanceGroupMembershipsOptions.Builder()
        .instanceGroupId(instanceGroupId)
        .build();

      Response<Void> response = vpcService.deleteInstanceGroupMemberships(deleteInstanceGroupMembershipsOptions).execute();
      // end-delete_instance_group_memberships
      System.out.printf("deleteInstanceGroupMemberships() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_instance_group_membership
      DeleteInstanceGroupMembershipOptions deleteInstanceGroupMembershipOptions = new DeleteInstanceGroupMembershipOptions.Builder()
        .instanceGroupId(instanceGroupId)
        .id(instanceGroupManagerMembershipId)
        .build();

      Response<Void> response = vpcService.deleteInstanceGroupMembership(deleteInstanceGroupMembershipOptions).execute();
      // end-delete_instance_group_membership
      System.out.printf("deleteInstanceGroupMembership() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_instance_group_manager_policy
      DeleteInstanceGroupManagerPolicyOptions deleteInstanceGroupManagerPolicyOptions = new DeleteInstanceGroupManagerPolicyOptions.Builder()
        .instanceGroupId(instanceGroupId)
        .instanceGroupManagerId(instanceGroupManagerId)
        .id(instanceGroupManagerPolicyId)
        .build();

      Response<Void> response = vpcService.deleteInstanceGroupManagerPolicy(deleteInstanceGroupManagerPolicyOptions).execute();
      // end-delete_instance_group_manager_policy
      System.out.printf("deleteInstanceGroupManagerPolicy() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_instance_group_manager_action
      DeleteInstanceGroupManagerActionOptions deleteInstanceGroupManagerActionOptions = new DeleteInstanceGroupManagerActionOptions.Builder()
        .instanceGroupId(instanceGroupId)
        .instanceGroupManagerId(instanceGroupManagerId)
        .id(instanceGroupManagerActionId)
        .build();

      Response<Void> response = vpcService.deleteInstanceGroupManagerAction(deleteInstanceGroupManagerActionOptions).execute();
      // end-delete_instance_group_manager_action
      System.out.printf("deleteInstanceGroupManagerAction() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_instance_group_manager
      DeleteInstanceGroupManagerOptions deleteInstanceGroupManagerOptions = new DeleteInstanceGroupManagerOptions.Builder()
        .instanceGroupId(instanceGroupId)
        .id(instanceGroupManagerId)
        .build();

      Response<Void> response = vpcService.deleteInstanceGroupManager(deleteInstanceGroupManagerOptions).execute();
      // end-delete_instance_group_manager
      System.out.printf("deleteInstanceGroupManager() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_instance_group_load_balancer
      DeleteInstanceGroupLoadBalancerOptions deleteInstanceGroupLoadBalancerOptions = new DeleteInstanceGroupLoadBalancerOptions.Builder()
        .instanceGroupId(instanceGroupId)
        .build();

      Response<Void> response = vpcService.deleteInstanceGroupLoadBalancer(deleteInstanceGroupLoadBalancerOptions).execute();
      // end-delete_instance_group_load_balancer
      System.out.printf("deleteInstanceGroupLoadBalancer() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_instance_group
      DeleteInstanceGroupOptions deleteInstanceGroupOptions = new DeleteInstanceGroupOptions.Builder()
        .id(instanceGroupId)
        .build();

      Response<Void> response = vpcService.deleteInstanceGroup(deleteInstanceGroupOptions).execute();
      // end-delete_instance_group
      System.out.printf("deleteInstanceGroup() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_instance
      DeleteInstanceOptions deleteInstanceOptions = new DeleteInstanceOptions.Builder()
        .id(instanceId)
        .build();

      Response<Void> response = vpcService.deleteInstance(deleteInstanceOptions).execute();
      // end-delete_instance
      System.out.printf("deleteInstance() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("deleteReservation() result:");
      // begin-delete_reservation
      DeleteReservationOptions deleteReservationOptions = new DeleteReservationOptions.Builder()
          .id(reservationId)
          .build();

      Response<Reservation> response = vpcService.deleteReservation(deleteReservationOptions).execute();
      Reservation reservation = response.getResult();

      System.out.println(reservation);
      // end-delete_reservation
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_image
      DeleteImageOptions deleteImageOptions = new DeleteImageOptions.Builder()
        .id(imageId)
        .build();

      Response<Void> response = vpcService.deleteImage(deleteImageOptions).execute();
      // end-delete_image
      System.out.printf("deleteImage() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_ike_policy
      DeleteIkePolicyOptions deleteIkePolicyOptions = new DeleteIkePolicyOptions.Builder()
        .id(ikePolicyId)
        .build();

      Response<Void> response = vpcService.deleteIkePolicy(deleteIkePolicyOptions).execute();
      // end-delete_ike_policy
      System.out.printf("deleteIkePolicy() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_flow_log_collector
      DeleteFlowLogCollectorOptions deleteFlowLogCollectorOptions = new DeleteFlowLogCollectorOptions.Builder()
        .id(flowLogCollectorId)
        .build();

      Response<Void> response = vpcService.deleteFlowLogCollector(deleteFlowLogCollectorOptions).execute();
      // end-delete_flow_log_collector
      System.out.printf("deleteFlowLogCollector() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_floating_ip
      DeleteFloatingIpOptions deleteFloatingIpOptions = new DeleteFloatingIpOptions.Builder()
        .id(floatingIpId)
        .build();

      Response<Void> response = vpcService.deleteFloatingIp(deleteFloatingIpOptions).execute();
      // end-delete_floating_ip
      System.out.printf("deleteFloatingIp() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_endpoint_gateway
      DeleteEndpointGatewayOptions deleteEndpointGatewayOptions = new DeleteEndpointGatewayOptions.Builder()
        .id(endpointGatewayId)
        .build();

      Response<Void> response = vpcService.deleteEndpointGateway(deleteEndpointGatewayOptions).execute();
      // end-delete_endpoint_gateway
      System.out.printf("deleteEndpointGateway() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_dedicated_host_group
      DeleteDedicatedHostGroupOptions deleteDedicatedHostGroupOptions = new DeleteDedicatedHostGroupOptions.Builder()
        .id(dedicatedHostGroupId)
        .build();

      Response<Void> response = vpcService.deleteDedicatedHostGroup(deleteDedicatedHostGroupOptions).execute();
      // end-delete_dedicated_host_group
      System.out.printf("deleteDedicatedHostGroup() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_dedicated_host
      DeleteDedicatedHostOptions deleteDedicatedHostOptions = new DeleteDedicatedHostOptions.Builder()
        .id(dedicatedHostId)
        .build();

      Response<Void> response = vpcService.deleteDedicatedHost(deleteDedicatedHostOptions).execute();
      // end-delete_dedicated_host
      System.out.printf("deleteDedicatedHost() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("deleteBackupPolicyPlan() result:");
      DeleteBackupPolicyPlanOptions deleteBackupPolicyRemoteCopyPlanOptions = new DeleteBackupPolicyPlanOptions.Builder()
        .backupPolicyId(backupPolicyId)
        .id(backupPolicyRemoteCopyPlanId)
        .ifMatch(ifMatchBackupPolicyRemoteCopyPlan)
        .build();

      Response<BackupPolicyPlan> remoteCopyResponse = vpcService.deleteBackupPolicyPlan(deleteBackupPolicyRemoteCopyPlanOptions).execute();
      BackupPolicyPlan backupPolicyRemoteCopyPlan = remoteCopyResponse.getResult();
      System.out.printf("deleteBackupPolicyPlan() remote copy response status code: %d%n", remoteCopyResponse.getStatusCode());
      // begin-delete_backup_policy_plan
      DeleteBackupPolicyPlanOptions deleteBackupPolicyPlanOptions = new DeleteBackupPolicyPlanOptions.Builder()
        .backupPolicyId(backupPolicyId)
        .id(backupPolicyPlanId)
        .ifMatch(ifMatchBackupPolicyPlan)
        .build();

      Response<BackupPolicyPlan> response = vpcService.deleteBackupPolicyPlan(deleteBackupPolicyPlanOptions).execute();
      BackupPolicyPlan backupPolicyPlan = response.getResult();

      // end-delete_backup_policy_plan
      System.out.printf("deleteBackupPolicyPlan() response status code: %d%n", response.getStatusCode());

    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("deleteBackupPolicy() result:");
      // begin-delete_backup_policy
      DeleteBackupPolicyOptions deleteBackupPolicyOptions = new DeleteBackupPolicyOptions.Builder()
        .id(backupPolicyId)
        .ifMatch(ifMatchBackupPolicy)
        .build();

      Response<BackupPolicy> response = vpcService.deleteBackupPolicy(deleteBackupPolicyOptions).execute();
      BackupPolicy backupPolicy = response.getResult();

      // end-delete_backup_policy
      System.out.printf("deleteBackupPolicy() response status code: %d%n", response.getStatusCode());

    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

  }
}
