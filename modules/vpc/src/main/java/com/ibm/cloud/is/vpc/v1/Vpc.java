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

/*
 * IBM OpenAPI SDK Code Generator Version: 3.102.0-615ec964-20250307-203034
 */

package com.ibm.cloud.is.vpc.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.is.common.SdkCommon;
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
import com.ibm.cloud.is.vpc.v1.model.BackupPolicy;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyCollection;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyJob;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyJobCollection;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlan;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlanCollection;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServer;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerCollection;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerConsoleAccessToken;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerDisk;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerDiskCollection;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerInitialization;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkAttachment;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkAttachmentCollection;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkInterface;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkInterfaceCollection;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfile;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileCollection;
import com.ibm.cloud.is.vpc.v1.model.CheckVpnGatewayConnectionsLocalCidrOptions;
import com.ibm.cloud.is.vpc.v1.model.CheckVpnGatewayConnectionsPeerCidrOptions;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetwork;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkCollection;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkInterface;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkInterfaceCollection;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkProfile;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkProfileCollection;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkSubnet;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkSubnetCollection;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkSubnetReservedIP;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkSubnetReservedIPCollection;
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
import com.ibm.cloud.is.vpc.v1.model.DedicatedHost;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostCollection;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostDisk;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostDiskCollection;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostGroup;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostGroupCollection;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfile;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileCollection;
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
import com.ibm.cloud.is.vpc.v1.model.DenyPrivatePathServiceGatewayEndpointGatewayBindingOptions;
import com.ibm.cloud.is.vpc.v1.model.DeprecateImageOptions;
import com.ibm.cloud.is.vpc.v1.model.DisconnectVpnClientOptions;
import com.ibm.cloud.is.vpc.v1.model.EndpointGateway;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayCollection;
import com.ibm.cloud.is.vpc.v1.model.FailoverShareOptions;
import com.ibm.cloud.is.vpc.v1.model.FloatingIP;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPCollection;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPCollectionVirtualNetworkInterfaceContext;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPReference;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPUnpaginatedCollection;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollector;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorCollection;
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
import com.ibm.cloud.is.vpc.v1.model.IPsecPolicy;
import com.ibm.cloud.is.vpc.v1.model.IPsecPolicyCollection;
import com.ibm.cloud.is.vpc.v1.model.IPsecPolicyConnectionCollection;
import com.ibm.cloud.is.vpc.v1.model.Image;
import com.ibm.cloud.is.vpc.v1.model.ImageCollection;
import com.ibm.cloud.is.vpc.v1.model.ImageExportJob;
import com.ibm.cloud.is.vpc.v1.model.ImageExportJobUnpaginatedCollection;
import com.ibm.cloud.is.vpc.v1.model.Instance;
import com.ibm.cloud.is.vpc.v1.model.InstanceAction;
import com.ibm.cloud.is.vpc.v1.model.InstanceClusterNetworkAttachment;
import com.ibm.cloud.is.vpc.v1.model.InstanceClusterNetworkAttachmentCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceConsoleAccessToken;
import com.ibm.cloud.is.vpc.v1.model.InstanceDisk;
import com.ibm.cloud.is.vpc.v1.model.InstanceDiskCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroup;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManager;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerAction;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerActionsCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPolicy;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPolicyCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupMembership;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupMembershipCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceInitialization;
import com.ibm.cloud.is.vpc.v1.model.InstanceNetworkAttachment;
import com.ibm.cloud.is.vpc.v1.model.InstanceNetworkAttachmentCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfile;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplate;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateCollection;
import com.ibm.cloud.is.vpc.v1.model.Key;
import com.ibm.cloud.is.vpc.v1.model.KeyCollection;
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
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListener;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerCollection;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicy;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyCollection;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyRule;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyRuleCollection;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPool;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolCollection;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMember;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberCollection;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfile;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileCollection;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerStatistics;
import com.ibm.cloud.is.vpc.v1.model.NetworkACL;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLCollection;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRule;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleCollection;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterface;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceUnpaginatedCollection;
import com.ibm.cloud.is.vpc.v1.model.ObsoleteImageOptions;
import com.ibm.cloud.is.vpc.v1.model.OperatingSystem;
import com.ibm.cloud.is.vpc.v1.model.OperatingSystemCollection;
import com.ibm.cloud.is.vpc.v1.model.PermitPrivatePathServiceGatewayEndpointGatewayBindingOptions;
import com.ibm.cloud.is.vpc.v1.model.PlacementGroup;
import com.ibm.cloud.is.vpc.v1.model.PlacementGroupCollection;
import com.ibm.cloud.is.vpc.v1.model.PrivatePathServiceGateway;
import com.ibm.cloud.is.vpc.v1.model.PrivatePathServiceGatewayAccountPolicy;
import com.ibm.cloud.is.vpc.v1.model.PrivatePathServiceGatewayAccountPolicyCollection;
import com.ibm.cloud.is.vpc.v1.model.PrivatePathServiceGatewayCollection;
import com.ibm.cloud.is.vpc.v1.model.PrivatePathServiceGatewayEndpointGatewayBinding;
import com.ibm.cloud.is.vpc.v1.model.PrivatePathServiceGatewayEndpointGatewayBindingCollection;
import com.ibm.cloud.is.vpc.v1.model.PublicGateway;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayCollection;
import com.ibm.cloud.is.vpc.v1.model.PublishPrivatePathServiceGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.Region;
import com.ibm.cloud.is.vpc.v1.model.RegionCollection;
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
import com.ibm.cloud.is.vpc.v1.model.ReservationCollection;
import com.ibm.cloud.is.vpc.v1.model.ReservedIP;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPCollection;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPCollectionBareMetalServerNetworkInterfaceContext;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPCollectionEndpointGatewayContext;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPCollectionInstanceNetworkInterfaceContext;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPCollectionVirtualNetworkInterfaceContext;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPReference;
import com.ibm.cloud.is.vpc.v1.model.RestartBareMetalServerOptions;
import com.ibm.cloud.is.vpc.v1.model.RevokeAccountForPrivatePathServiceGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.Route;
import com.ibm.cloud.is.vpc.v1.model.RouteCollection;
import com.ibm.cloud.is.vpc.v1.model.RouteCollectionVPCContext;
import com.ibm.cloud.is.vpc.v1.model.RoutingTable;
import com.ibm.cloud.is.vpc.v1.model.RoutingTableCollection;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroup;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupCollection;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRule;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleCollection;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupTargetCollection;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupTargetReference;
import com.ibm.cloud.is.vpc.v1.model.SetSubnetPublicGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.Share;
import com.ibm.cloud.is.vpc.v1.model.ShareAccessorBinding;
import com.ibm.cloud.is.vpc.v1.model.ShareAccessorBindingCollection;
import com.ibm.cloud.is.vpc.v1.model.ShareCollection;
import com.ibm.cloud.is.vpc.v1.model.ShareMountTarget;
import com.ibm.cloud.is.vpc.v1.model.ShareMountTargetCollection;
import com.ibm.cloud.is.vpc.v1.model.ShareProfile;
import com.ibm.cloud.is.vpc.v1.model.ShareProfileCollection;
import com.ibm.cloud.is.vpc.v1.model.ShareReference;
import com.ibm.cloud.is.vpc.v1.model.ShareSnapshot;
import com.ibm.cloud.is.vpc.v1.model.ShareSnapshotCollection;
import com.ibm.cloud.is.vpc.v1.model.Snapshot;
import com.ibm.cloud.is.vpc.v1.model.SnapshotClone;
import com.ibm.cloud.is.vpc.v1.model.SnapshotCloneCollection;
import com.ibm.cloud.is.vpc.v1.model.SnapshotCollection;
import com.ibm.cloud.is.vpc.v1.model.SnapshotConsistencyGroup;
import com.ibm.cloud.is.vpc.v1.model.SnapshotConsistencyGroupCollection;
import com.ibm.cloud.is.vpc.v1.model.StartBareMetalServerOptions;
import com.ibm.cloud.is.vpc.v1.model.StopBareMetalServerOptions;
import com.ibm.cloud.is.vpc.v1.model.Subnet;
import com.ibm.cloud.is.vpc.v1.model.SubnetCollection;
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
import com.ibm.cloud.is.vpc.v1.model.VPC;
import com.ibm.cloud.is.vpc.v1.model.VPCCollection;
import com.ibm.cloud.is.vpc.v1.model.VPCDNSResolutionBinding;
import com.ibm.cloud.is.vpc.v1.model.VPCDNSResolutionBindingCollection;
import com.ibm.cloud.is.vpc.v1.model.VPNGateway;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayCollection;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnection;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionCIDRs;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionCollection;
import com.ibm.cloud.is.vpc.v1.model.VPNServer;
import com.ibm.cloud.is.vpc.v1.model.VPNServerClient;
import com.ibm.cloud.is.vpc.v1.model.VPNServerClientCollection;
import com.ibm.cloud.is.vpc.v1.model.VPNServerCollection;
import com.ibm.cloud.is.vpc.v1.model.VPNServerRoute;
import com.ibm.cloud.is.vpc.v1.model.VPNServerRouteCollection;
import com.ibm.cloud.is.vpc.v1.model.VirtualNetworkInterface;
import com.ibm.cloud.is.vpc.v1.model.VirtualNetworkInterfaceCollection;
import com.ibm.cloud.is.vpc.v1.model.Volume;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachment;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentCollection;
import com.ibm.cloud.is.vpc.v1.model.VolumeCollection;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfile;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileCollection;
import com.ibm.cloud.is.vpc.v1.model.Zone;
import com.ibm.cloud.is.vpc.v1.model.ZoneCollection;
import com.ibm.cloud.sdk.core.http.RequestBuilder;
import com.ibm.cloud.sdk.core.http.ResponseConverter;
import com.ibm.cloud.sdk.core.http.ServiceCall;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.ConfigBasedAuthenticatorFactory;
import com.ibm.cloud.sdk.core.service.BaseService;
import com.ibm.cloud.sdk.core.util.RequestUtils;
import com.ibm.cloud.sdk.core.util.ResponseConverterUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Logger;

/**
 * The IBM Cloud Virtual Private Cloud (VPC) API can be used to programmatically provision and manage virtual server
 * instances, along with subnets, volumes, load balancers, and more.
 *
 * API Version: 2025-03-10
 */
public class Vpc extends BaseService {
  private static final Logger LOGGER = Logger.getLogger(Vpc.class.getName());

  /**
   * Default service name used when configuring the `Vpc` client.
   */
  public static final String DEFAULT_SERVICE_NAME = "vpc";

  /**
   * Default service endpoint URL.
   */
  public static final String DEFAULT_SERVICE_URL = "https://us-south.iaas.cloud.ibm.com/v1";

  private static final Map<String, String> _regionalEndpoints;
  static {
    Map<String, String> m = new HashMap<>();
    m.put("au-syd", "https://au-syd.iaas.cloud.ibm.com/v1"); // Australia (Sydney)

    m.put("br-sao", "https://br-sao.iaas.cloud.ibm.com/v1"); // Brazil (Sao Paulo)

    m.put("ca-mon", "https://ca-mon.iaas.cloud.ibm.com/v1"); // Canada (Montreal)

    m.put("ca-tor", "https://ca-tor.iaas.cloud.ibm.com/v1"); // Canada (Toronto)

    m.put("eu-de", "https://eu-de.iaas.cloud.ibm.com/v1"); // Germany (Frankfurt)

    m.put("eu-es", "https://eu-es.iaas.cloud.ibm.com/v1"); // Spain (Madrid)

    m.put("eu-gb", "https://eu-gb.iaas.cloud.ibm.com/v1"); // United Kingdom (London)

    m.put("jp-osa", "https://jp-osa.iaas.cloud.ibm.com/v1"); // Japan (Osaka)

    m.put("jp-tok", "https://jp-tok.iaas.cloud.ibm.com/v1"); // Japan (Tokyo)

    m.put("us-east", "https://us-east.iaas.cloud.ibm.com/v1"); // US East (Washington DC)

    m.put("us-south", "https://us-south.iaas.cloud.ibm.com/v1"); // US South (Dallas)
    _regionalEndpoints = Collections.unmodifiableMap(m);
  }

  /**
   * Returns the service URL associated with the specified region.
   * @param region a string representing the region
   * @return the service URL associated with the specified region or null
   * if no mapping for the region exists
   */
  public static String getServiceUrlForRegion(String region) {
    return _regionalEndpoints.get(region);
  }

  private Long generation = Long.valueOf("2");

  private String version = "2025-04-22";

 /**
   * Class method which constructs an instance of the `Vpc` client.
   * The default service name is used to configure the client instance.
   *
   * @return an instance of the `Vpc` client using external configuration
   */
  public static Vpc newInstance() {
    return newInstance(DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `Vpc` client.
   * The specified service name is used to configure the client instance.
   *
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `Vpc` client using external configuration
   */
  public static Vpc newInstance(String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    Vpc service = new Vpc(serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `Vpc` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public Vpc(String serviceName, Authenticator authenticator) {
    super(serviceName, authenticator);
    setServiceUrl(DEFAULT_SERVICE_URL);
    setVersion(version);
  }

  /**
   * Gets the generation.
   *
   * The infrastructure generation. For the API behavior documented here, specify
   * `2`.
   *
   * @return the generation
   */
  public Long getGeneration() {
    return this.generation;
  }

  /**
   * Sets the generation.
   *
   * @param generation the new generation
   */
  public void setGeneration(final long generation) {
    this.generation = generation;
  }

  /**
   * Gets the version.
   *
   * The API version, in format `YYYY-MM-DD`. For the API behavior documented here, specify any date between
   * `2025-04-08` and `2025-04-23`.
   *
   * @return the version
   */
  public String getVersion() {
    return this.version;
  }

  /**
   * Sets the version.
   *
   * @param version the new version
   */
  public void setVersion(final String version) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(version, "version cannot be empty.");
    this.version = version;
  }

  /**
   * List VPCs.
   *
   * This request lists VPCs in the region. A VPC is a virtual network that belongs to an account and provides logical
   * isolation from other networks. A VPC is made up of resources in one or more zones. VPCs are regional, and each VPC
   * can contain resources in multiple zones in a region.
   *
   * @param listVpcsOptions the {@link ListVpcsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VPCCollection}
   */
  public ServiceCall<VPCCollection> listVpcs(ListVpcsOptions listVpcsOptions) {
    if (listVpcsOptions == null) {
      listVpcsOptions = new ListVpcsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpcs"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listVpcs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listVpcsOptions.start() != null) {
      builder.query("start", String.valueOf(listVpcsOptions.start()));
    }
    if (listVpcsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listVpcsOptions.limit()));
    }
    if (listVpcsOptions.resourceGroupId() != null) {
      builder.query("resource_group.id", String.valueOf(listVpcsOptions.resourceGroupId()));
    }
    if (listVpcsOptions.classicAccess() != null) {
      builder.query("classic_access", String.valueOf(listVpcsOptions.classicAccess()));
    }
    ResponseConverter<VPCCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VPCCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List VPCs.
   *
   * This request lists VPCs in the region. A VPC is a virtual network that belongs to an account and provides logical
   * isolation from other networks. A VPC is made up of resources in one or more zones. VPCs are regional, and each VPC
   * can contain resources in multiple zones in a region.
   *
   * @return a {@link ServiceCall} with a result of type {@link VPCCollection}
   */
  public ServiceCall<VPCCollection> listVpcs() {
    return listVpcs(null);
  }

  /**
   * Create a VPC.
   *
   * This request creates a new VPC from a VPC prototype object. The prototype object is structured in the same way as a
   * retrieved VPC, and contains the information necessary to create the new VPC.
   *
   * @param createVpcOptions the {@link CreateVpcOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VPC}
   */
  public ServiceCall<VPC> createVpc(CreateVpcOptions createVpcOptions) {
    boolean skipBody = false;
    if (createVpcOptions == null) {
      createVpcOptions = new CreateVpcOptions.Builder().build();
      skipBody = true;
    }
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpcs"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createVpc");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (createVpcOptions.addressPrefixManagement() != null) {
        contentJson.addProperty("address_prefix_management", createVpcOptions.addressPrefixManagement());
      }
      if (createVpcOptions.classicAccess() != null) {
        contentJson.addProperty("classic_access", createVpcOptions.classicAccess());
      }
      if (createVpcOptions.dns() != null) {
        contentJson.add("dns", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createVpcOptions.dns()));
      }
      if (createVpcOptions.name() != null) {
        contentJson.addProperty("name", createVpcOptions.name());
      }
      if (createVpcOptions.resourceGroup() != null) {
        contentJson.add("resource_group", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createVpcOptions.resourceGroup()));
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<VPC> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VPC>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a VPC.
   *
   * This request creates a new VPC from a VPC prototype object. The prototype object is structured in the same way as a
   * retrieved VPC, and contains the information necessary to create the new VPC.
   *
   * @return a {@link ServiceCall} with a result of type {@link VPC}
   */
  public ServiceCall<VPC> createVpc() {
    return createVpc(null);
  }

  /**
   * Delete a VPC.
   *
   * This request deletes a VPC. This operation cannot be reversed.
   *
   * For this request to succeed:
   * - Instances, subnets, public gateways, endpoint gateways, and private path service
   *   gateways must not reside in this VPC
   * - The VPC must not be providing DNS resolution for any other VPCs
   * - If `dns.enable_hub` is `true`, `dns.resolution_binding_count` must be zero
   *
   * All security groups and network ACLs associated with the VPC are automatically deleted. All flow log collectors
   * with `auto_delete` set to `true` targeting the VPC or any resource in the VPC are automatically deleted.
   *
   * @param deleteVpcOptions the {@link DeleteVpcOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteVpc(DeleteVpcOptions deleteVpcOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteVpcOptions,
      "deleteVpcOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteVpcOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpcs/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteVpc");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteVpcOptions.ifMatch() != null) {
      builder.header("If-Match", deleteVpcOptions.ifMatch());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a VPC.
   *
   * This request retrieves a single VPC specified by the identifier in the URL.
   *
   * @param getVpcOptions the {@link GetVpcOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VPC}
   */
  public ServiceCall<VPC> getVpc(GetVpcOptions getVpcOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getVpcOptions,
      "getVpcOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getVpcOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpcs/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getVpc");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<VPC> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VPC>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a VPC.
   *
   * This request updates a VPC with the information provided in a VPC patch object. The patch object is structured in
   * the same way as a retrieved VPC and needs to contain only the information to be updated.
   *
   * @param updateVpcOptions the {@link UpdateVpcOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VPC}
   */
  public ServiceCall<VPC> updateVpc(UpdateVpcOptions updateVpcOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateVpcOptions,
      "updateVpcOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateVpcOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpcs/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateVpc");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateVpcOptions.ifMatch() != null) {
      builder.header("If-Match", updateVpcOptions.ifMatch());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateVpcOptions.vpcPatch()), "application/merge-patch+json");
    ResponseConverter<VPC> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VPC>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a VPC's default network ACL.
   *
   * This request retrieves the default network ACL for the VPC specified by the identifier in the URL. The default
   * network ACL is applied to any new subnets in the VPC which do not specify a network ACL.
   *
   * @param getVpcDefaultNetworkAclOptions the {@link GetVpcDefaultNetworkAclOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DefaultNetworkACL}
   */
  public ServiceCall<DefaultNetworkACL> getVpcDefaultNetworkAcl(GetVpcDefaultNetworkAclOptions getVpcDefaultNetworkAclOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getVpcDefaultNetworkAclOptions,
      "getVpcDefaultNetworkAclOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getVpcDefaultNetworkAclOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpcs/{id}/default_network_acl", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getVpcDefaultNetworkAcl");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<DefaultNetworkACL> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DefaultNetworkACL>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a VPC's default routing table.
   *
   * This request retrieves the default routing table for the VPC specified by the identifier in the URL. The default
   * routing table is associated with any subnets in the VPC which have not been explicitly associated with another
   * routing table.
   *
   * @param getVpcDefaultRoutingTableOptions the {@link GetVpcDefaultRoutingTableOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DefaultRoutingTable}
   */
  public ServiceCall<DefaultRoutingTable> getVpcDefaultRoutingTable(GetVpcDefaultRoutingTableOptions getVpcDefaultRoutingTableOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getVpcDefaultRoutingTableOptions,
      "getVpcDefaultRoutingTableOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getVpcDefaultRoutingTableOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpcs/{id}/default_routing_table", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getVpcDefaultRoutingTable");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<DefaultRoutingTable> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DefaultRoutingTable>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a VPC's default security group.
   *
   * This request retrieves the default security group for the VPC specified by the identifier in the URL. Resources
   * created in this VPC that allow a security group to be optionally specified will use this security group by default.
   *
   * @param getVpcDefaultSecurityGroupOptions the {@link GetVpcDefaultSecurityGroupOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DefaultSecurityGroup}
   */
  public ServiceCall<DefaultSecurityGroup> getVpcDefaultSecurityGroup(GetVpcDefaultSecurityGroupOptions getVpcDefaultSecurityGroupOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getVpcDefaultSecurityGroupOptions,
      "getVpcDefaultSecurityGroupOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getVpcDefaultSecurityGroupOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpcs/{id}/default_security_group", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getVpcDefaultSecurityGroup");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<DefaultSecurityGroup> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DefaultSecurityGroup>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List address prefixes for a VPC.
   *
   * This request lists address pool prefixes for a VPC.
   *
   * @param listVpcAddressPrefixesOptions the {@link ListVpcAddressPrefixesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AddressPrefixCollection}
   */
  public ServiceCall<AddressPrefixCollection> listVpcAddressPrefixes(ListVpcAddressPrefixesOptions listVpcAddressPrefixesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listVpcAddressPrefixesOptions,
      "listVpcAddressPrefixesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpc_id", listVpcAddressPrefixesOptions.vpcId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpcs/{vpc_id}/address_prefixes", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listVpcAddressPrefixes");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listVpcAddressPrefixesOptions.start() != null) {
      builder.query("start", String.valueOf(listVpcAddressPrefixesOptions.start()));
    }
    if (listVpcAddressPrefixesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listVpcAddressPrefixesOptions.limit()));
    }
    ResponseConverter<AddressPrefixCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AddressPrefixCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create an address prefix for a VPC.
   *
   * This request creates a new prefix from a prefix prototype object. The prototype object is structured in the same
   * way as a retrieved prefix, and contains the information necessary to create the new prefix.
   *
   * @param createVpcAddressPrefixOptions the {@link CreateVpcAddressPrefixOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AddressPrefix}
   */
  public ServiceCall<AddressPrefix> createVpcAddressPrefix(CreateVpcAddressPrefixOptions createVpcAddressPrefixOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createVpcAddressPrefixOptions,
      "createVpcAddressPrefixOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpc_id", createVpcAddressPrefixOptions.vpcId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpcs/{vpc_id}/address_prefixes", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createVpcAddressPrefix");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("cidr", createVpcAddressPrefixOptions.cidr());
    contentJson.add("zone", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createVpcAddressPrefixOptions.zone()));
    if (createVpcAddressPrefixOptions.isDefault() != null) {
      contentJson.addProperty("is_default", createVpcAddressPrefixOptions.isDefault());
    }
    if (createVpcAddressPrefixOptions.name() != null) {
      contentJson.addProperty("name", createVpcAddressPrefixOptions.name());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<AddressPrefix> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AddressPrefix>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete an address prefix.
   *
   * This request deletes a prefix. This operation cannot be reversed. The request will fail if any subnets use
   * addresses from this prefix.
   *
   * @param deleteVpcAddressPrefixOptions the {@link DeleteVpcAddressPrefixOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteVpcAddressPrefix(DeleteVpcAddressPrefixOptions deleteVpcAddressPrefixOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteVpcAddressPrefixOptions,
      "deleteVpcAddressPrefixOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpc_id", deleteVpcAddressPrefixOptions.vpcId());
    pathParamsMap.put("id", deleteVpcAddressPrefixOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpcs/{vpc_id}/address_prefixes/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteVpcAddressPrefix");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve an address prefix.
   *
   * This request retrieves a single prefix specified by the identifier in the URL.
   *
   * @param getVpcAddressPrefixOptions the {@link GetVpcAddressPrefixOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AddressPrefix}
   */
  public ServiceCall<AddressPrefix> getVpcAddressPrefix(GetVpcAddressPrefixOptions getVpcAddressPrefixOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getVpcAddressPrefixOptions,
      "getVpcAddressPrefixOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpc_id", getVpcAddressPrefixOptions.vpcId());
    pathParamsMap.put("id", getVpcAddressPrefixOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpcs/{vpc_id}/address_prefixes/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getVpcAddressPrefix");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<AddressPrefix> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AddressPrefix>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update an address prefix.
   *
   * This request updates a prefix with the information in a provided prefix patch. The prefix patch object is
   * structured in the same way as a retrieved prefix and contains only the information to be updated.
   *
   * @param updateVpcAddressPrefixOptions the {@link UpdateVpcAddressPrefixOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AddressPrefix}
   */
  public ServiceCall<AddressPrefix> updateVpcAddressPrefix(UpdateVpcAddressPrefixOptions updateVpcAddressPrefixOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateVpcAddressPrefixOptions,
      "updateVpcAddressPrefixOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpc_id", updateVpcAddressPrefixOptions.vpcId());
    pathParamsMap.put("id", updateVpcAddressPrefixOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpcs/{vpc_id}/address_prefixes/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateVpcAddressPrefix");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateVpcAddressPrefixOptions.addressPrefixPatch()), "application/merge-patch+json");
    ResponseConverter<AddressPrefix> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AddressPrefix>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List DNS resolution bindings for a VPC.
   *
   * This request lists DNS resolution bindings for a VPC. A DNS resolution binding represents an association with
   * another VPC for centralizing DNS name resolution.
   *
   * If the VPC specified by the identifier in the URL is a DNS hub VPC (has `dns.enable_hub` set to `true`) then there
   * is one binding for each VPC bound to the hub VPC. The endpoint gateways in the bound VPCs can allow (using
   * `allow_dns_resolution_binding`) the hub VPC to centralize resolution of their DNS names.
   *
   * If the VPC specified by the identifier in the URL is not a DNS hub VPC, then there is at most one binding (to a hub
   * VPC). The endpoint gateways in the VPC specified by the identifier in the URL can allow (using
   * `allow_dns_resolution_binding`) its hub VPC to centralize resolution of their DNS names.
   *
   * To make use of centralized DNS resolution, a VPC bound to a DNS hub VPC must delegate DNS resolution to its hub VPC
   * by setting `dns.resolver.type` to `delegate`.
   *
   * The bindings will be sorted by their `created_at` property values, with newest bindings first. Bindings with
   * identical `created_at` property values will in turn be sorted by ascending `name` property values.
   *
   * @param listVpcDnsResolutionBindingsOptions the {@link ListVpcDnsResolutionBindingsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VPCDNSResolutionBindingCollection}
   */
  public ServiceCall<VPCDNSResolutionBindingCollection> listVpcDnsResolutionBindings(ListVpcDnsResolutionBindingsOptions listVpcDnsResolutionBindingsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listVpcDnsResolutionBindingsOptions,
      "listVpcDnsResolutionBindingsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpc_id", listVpcDnsResolutionBindingsOptions.vpcId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpcs/{vpc_id}/dns_resolution_bindings", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listVpcDnsResolutionBindings");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listVpcDnsResolutionBindingsOptions.sort() != null) {
      builder.query("sort", String.valueOf(listVpcDnsResolutionBindingsOptions.sort()));
    }
    if (listVpcDnsResolutionBindingsOptions.start() != null) {
      builder.query("start", String.valueOf(listVpcDnsResolutionBindingsOptions.start()));
    }
    if (listVpcDnsResolutionBindingsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listVpcDnsResolutionBindingsOptions.limit()));
    }
    if (listVpcDnsResolutionBindingsOptions.name() != null) {
      builder.query("name", String.valueOf(listVpcDnsResolutionBindingsOptions.name()));
    }
    if (listVpcDnsResolutionBindingsOptions.vpcCrn() != null) {
      builder.query("vpc.crn", String.valueOf(listVpcDnsResolutionBindingsOptions.vpcCrn()));
    }
    if (listVpcDnsResolutionBindingsOptions.vpcName() != null) {
      builder.query("vpc.name", String.valueOf(listVpcDnsResolutionBindingsOptions.vpcName()));
    }
    if (listVpcDnsResolutionBindingsOptions.accountId() != null) {
      builder.query("account.id", String.valueOf(listVpcDnsResolutionBindingsOptions.accountId()));
    }
    ResponseConverter<VPCDNSResolutionBindingCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VPCDNSResolutionBindingCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a DNS resolution binding.
   *
   * This request creates a new DNS resolution binding from a DNS resolution binding prototype object. The prototype
   * object is structured in the same way as a retrieved DNS resolution binding, and contains the information necessary
   * to create the new DNS resolution binding.
   *
   * For this request to succeed, `dns.enable_hub` must be `false` for the VPC specified by the identifier in the URL,
   * and the VPC must not already have a DNS resolution binding.
   *
   * See [About DNS sharing for VPE gateways](/docs/vpc?topic=vpc-vpe-dns-sharing) for more information.
   *
   * @param createVpcDnsResolutionBindingOptions the {@link CreateVpcDnsResolutionBindingOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VPCDNSResolutionBinding}
   */
  public ServiceCall<VPCDNSResolutionBinding> createVpcDnsResolutionBinding(CreateVpcDnsResolutionBindingOptions createVpcDnsResolutionBindingOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createVpcDnsResolutionBindingOptions,
      "createVpcDnsResolutionBindingOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpc_id", createVpcDnsResolutionBindingOptions.vpcId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpcs/{vpc_id}/dns_resolution_bindings", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createVpcDnsResolutionBinding");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("vpc", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createVpcDnsResolutionBindingOptions.vpc()));
    if (createVpcDnsResolutionBindingOptions.name() != null) {
      contentJson.addProperty("name", createVpcDnsResolutionBindingOptions.name());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<VPCDNSResolutionBinding> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VPCDNSResolutionBinding>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a DNS resolution binding.
   *
   * This request deletes a DNS resolution binding. This operation cannot be reversed.
   *
   * For this request to succeed, the VPC specified by the identifier in the URL must not have
   * `dns.resolver.type` set to `delegated`.
   *
   * @param deleteVpcDnsResolutionBindingOptions the {@link DeleteVpcDnsResolutionBindingOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VPCDNSResolutionBinding}
   */
  public ServiceCall<VPCDNSResolutionBinding> deleteVpcDnsResolutionBinding(DeleteVpcDnsResolutionBindingOptions deleteVpcDnsResolutionBindingOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteVpcDnsResolutionBindingOptions,
      "deleteVpcDnsResolutionBindingOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpc_id", deleteVpcDnsResolutionBindingOptions.vpcId());
    pathParamsMap.put("id", deleteVpcDnsResolutionBindingOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpcs/{vpc_id}/dns_resolution_bindings/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteVpcDnsResolutionBinding");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<VPCDNSResolutionBinding> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VPCDNSResolutionBinding>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a DNS resolution binding.
   *
   * This request retrieves a single DNS resolution binding specified by the identifier in the URL.
   *
   * @param getVpcDnsResolutionBindingOptions the {@link GetVpcDnsResolutionBindingOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VPCDNSResolutionBinding}
   */
  public ServiceCall<VPCDNSResolutionBinding> getVpcDnsResolutionBinding(GetVpcDnsResolutionBindingOptions getVpcDnsResolutionBindingOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getVpcDnsResolutionBindingOptions,
      "getVpcDnsResolutionBindingOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpc_id", getVpcDnsResolutionBindingOptions.vpcId());
    pathParamsMap.put("id", getVpcDnsResolutionBindingOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpcs/{vpc_id}/dns_resolution_bindings/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getVpcDnsResolutionBinding");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<VPCDNSResolutionBinding> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VPCDNSResolutionBinding>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a DNS resolution binding.
   *
   * This request updates a DNS resolution binding with the information in a provided DNS resolution binding patch. The
   * DNS resolution binding patch object is structured in the same way as a retrieved DNS resolution binding and
   * contains only the information to be updated.
   *
   * @param updateVpcDnsResolutionBindingOptions the {@link UpdateVpcDnsResolutionBindingOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VPCDNSResolutionBinding}
   */
  public ServiceCall<VPCDNSResolutionBinding> updateVpcDnsResolutionBinding(UpdateVpcDnsResolutionBindingOptions updateVpcDnsResolutionBindingOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateVpcDnsResolutionBindingOptions,
      "updateVpcDnsResolutionBindingOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpc_id", updateVpcDnsResolutionBindingOptions.vpcId());
    pathParamsMap.put("id", updateVpcDnsResolutionBindingOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpcs/{vpc_id}/dns_resolution_bindings/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateVpcDnsResolutionBinding");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateVpcDnsResolutionBindingOptions.vpcdnsResolutionBindingPatch()), "application/merge-patch+json");
    ResponseConverter<VPCDNSResolutionBinding> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VPCDNSResolutionBinding>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List routes in a VPC's default routing table.
   *
   * This request lists routes in the VPC's default routing table. Each route is zone-specific and directs any packets
   * matching its destination CIDR block to a `next_hop` IP address. The most specific route matching a packet's
   * destination will be used. If multiple equally-specific routes exist, traffic will be distributed across them.
   *
   * @param listVpcRoutesOptions the {@link ListVpcRoutesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RouteCollectionVPCContext}
   * @deprecated this method is deprecated and may be removed in a future release
   */
   @Deprecated
  public ServiceCall<RouteCollectionVPCContext> listVpcRoutes(ListVpcRoutesOptions listVpcRoutesOptions) {
    LOGGER.warning("A deprecated operation has been invoked: listVpcRoutes");
    com.ibm.cloud.sdk.core.util.Validator.notNull(listVpcRoutesOptions,
      "listVpcRoutesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpc_id", listVpcRoutesOptions.vpcId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpcs/{vpc_id}/routes", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listVpcRoutes");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listVpcRoutesOptions.zoneName() != null) {
      builder.query("zone.name", String.valueOf(listVpcRoutesOptions.zoneName()));
    }
    if (listVpcRoutesOptions.start() != null) {
      builder.query("start", String.valueOf(listVpcRoutesOptions.start()));
    }
    if (listVpcRoutesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listVpcRoutesOptions.limit()));
    }
    ResponseConverter<RouteCollectionVPCContext> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RouteCollectionVPCContext>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a route in a VPC's default routing table.
   *
   * This request creates a new route in the VPC's default routing table. The route prototype object is structured in
   * the same way as a retrieved route, and contains the information necessary to create the new route. The request will
   * fail if the new route will cause a loop.
   *
   * @param createVpcRouteOptions the {@link CreateVpcRouteOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Route}
   * @deprecated this method is deprecated and may be removed in a future release
   */
   @Deprecated
  public ServiceCall<Route> createVpcRoute(CreateVpcRouteOptions createVpcRouteOptions) {
    LOGGER.warning("A deprecated operation has been invoked: createVpcRoute");
    com.ibm.cloud.sdk.core.util.Validator.notNull(createVpcRouteOptions,
      "createVpcRouteOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpc_id", createVpcRouteOptions.vpcId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpcs/{vpc_id}/routes", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createVpcRoute");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("destination", createVpcRouteOptions.destination());
    contentJson.add("zone", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createVpcRouteOptions.zone()));
    if (createVpcRouteOptions.action() != null) {
      contentJson.addProperty("action", createVpcRouteOptions.action());
    }
    if (createVpcRouteOptions.advertise() != null) {
      contentJson.addProperty("advertise", createVpcRouteOptions.advertise());
    }
    if (createVpcRouteOptions.name() != null) {
      contentJson.addProperty("name", createVpcRouteOptions.name());
    }
    if (createVpcRouteOptions.nextHop() != null) {
      contentJson.add("next_hop", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createVpcRouteOptions.nextHop()));
    }
    if (createVpcRouteOptions.priority() != null) {
      contentJson.addProperty("priority", createVpcRouteOptions.priority());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Route> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Route>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a VPC route.
   *
   * This request deletes a route. This operation cannot be reversed.
   *
   * @param deleteVpcRouteOptions the {@link DeleteVpcRouteOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   * @deprecated this method is deprecated and may be removed in a future release
   */
   @Deprecated
  public ServiceCall<Void> deleteVpcRoute(DeleteVpcRouteOptions deleteVpcRouteOptions) {
    LOGGER.warning("A deprecated operation has been invoked: deleteVpcRoute");
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteVpcRouteOptions,
      "deleteVpcRouteOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpc_id", deleteVpcRouteOptions.vpcId());
    pathParamsMap.put("id", deleteVpcRouteOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpcs/{vpc_id}/routes/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteVpcRoute");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a VPC route.
   *
   * This request retrieves a single route specified by the identifier in the URL.
   *
   * @param getVpcRouteOptions the {@link GetVpcRouteOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Route}
   * @deprecated this method is deprecated and may be removed in a future release
   */
   @Deprecated
  public ServiceCall<Route> getVpcRoute(GetVpcRouteOptions getVpcRouteOptions) {
    LOGGER.warning("A deprecated operation has been invoked: getVpcRoute");
    com.ibm.cloud.sdk.core.util.Validator.notNull(getVpcRouteOptions,
      "getVpcRouteOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpc_id", getVpcRouteOptions.vpcId());
    pathParamsMap.put("id", getVpcRouteOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpcs/{vpc_id}/routes/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getVpcRoute");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Route> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Route>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a VPC route.
   *
   * This request updates a route with the information in a provided route patch. The route patch object is structured
   * in the same way as a retrieved route and contains only the information to be updated.
   *
   * @param updateVpcRouteOptions the {@link UpdateVpcRouteOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Route}
   * @deprecated this method is deprecated and may be removed in a future release
   */
   @Deprecated
  public ServiceCall<Route> updateVpcRoute(UpdateVpcRouteOptions updateVpcRouteOptions) {
    LOGGER.warning("A deprecated operation has been invoked: updateVpcRoute");
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateVpcRouteOptions,
      "updateVpcRouteOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpc_id", updateVpcRouteOptions.vpcId());
    pathParamsMap.put("id", updateVpcRouteOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpcs/{vpc_id}/routes/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateVpcRoute");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateVpcRouteOptions.routePatch()), "application/merge-patch+json");
    ResponseConverter<Route> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Route>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List routing tables for a VPC.
   *
   * This request lists routing tables for a VPC. Each subnet in a VPC is associated with a routing table, which
   * controls delivery of packets sent on that subnet according to the action of the most specific matching route in the
   * table. If multiple equally-specific routes exist, traffic will be distributed across them. If no routes match,
   * delivery will be controlled by the system's built-in routes.
   *
   * @param listVpcRoutingTablesOptions the {@link ListVpcRoutingTablesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RoutingTableCollection}
   */
  public ServiceCall<RoutingTableCollection> listVpcRoutingTables(ListVpcRoutingTablesOptions listVpcRoutingTablesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listVpcRoutingTablesOptions,
      "listVpcRoutingTablesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpc_id", listVpcRoutingTablesOptions.vpcId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpcs/{vpc_id}/routing_tables", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listVpcRoutingTables");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listVpcRoutingTablesOptions.start() != null) {
      builder.query("start", String.valueOf(listVpcRoutingTablesOptions.start()));
    }
    if (listVpcRoutingTablesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listVpcRoutingTablesOptions.limit()));
    }
    if (listVpcRoutingTablesOptions.isDefault() != null) {
      builder.query("is_default", String.valueOf(listVpcRoutingTablesOptions.isDefault()));
    }
    ResponseConverter<RoutingTableCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RoutingTableCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a routing table for a VPC.
   *
   * This request creates a routing table from a routing table prototype object. The prototype object is structured in
   * the same way as a retrieved routing table, and contains the information necessary to create the new routing table.
   *
   * At present, the routing table's `resource_group` will be inherited from its VPC, but may be specifiable in the
   * future.
   *
   * @param createVpcRoutingTableOptions the {@link CreateVpcRoutingTableOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RoutingTable}
   */
  public ServiceCall<RoutingTable> createVpcRoutingTable(CreateVpcRoutingTableOptions createVpcRoutingTableOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createVpcRoutingTableOptions,
      "createVpcRoutingTableOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpc_id", createVpcRoutingTableOptions.vpcId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpcs/{vpc_id}/routing_tables", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createVpcRoutingTable");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    if (createVpcRoutingTableOptions.acceptRoutesFrom() != null) {
      contentJson.add("accept_routes_from", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createVpcRoutingTableOptions.acceptRoutesFrom()));
    }
    if (createVpcRoutingTableOptions.advertiseRoutesTo() != null) {
      contentJson.add("advertise_routes_to", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createVpcRoutingTableOptions.advertiseRoutesTo()));
    }
    if (createVpcRoutingTableOptions.name() != null) {
      contentJson.addProperty("name", createVpcRoutingTableOptions.name());
    }
    if (createVpcRoutingTableOptions.routeDirectLinkIngress() != null) {
      contentJson.addProperty("route_direct_link_ingress", createVpcRoutingTableOptions.routeDirectLinkIngress());
    }
    if (createVpcRoutingTableOptions.routeInternetIngress() != null) {
      contentJson.addProperty("route_internet_ingress", createVpcRoutingTableOptions.routeInternetIngress());
    }
    if (createVpcRoutingTableOptions.routeTransitGatewayIngress() != null) {
      contentJson.addProperty("route_transit_gateway_ingress", createVpcRoutingTableOptions.routeTransitGatewayIngress());
    }
    if (createVpcRoutingTableOptions.routeVpcZoneIngress() != null) {
      contentJson.addProperty("route_vpc_zone_ingress", createVpcRoutingTableOptions.routeVpcZoneIngress());
    }
    if (createVpcRoutingTableOptions.routes() != null) {
      contentJson.add("routes", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createVpcRoutingTableOptions.routes()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<RoutingTable> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RoutingTable>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a VPC routing table.
   *
   * This request deletes a routing table.  A routing table cannot be deleted if it is associated with any subnets in
   * the VPC. Additionally, a VPC's default routing table cannot be deleted. This operation cannot be reversed.
   *
   * @param deleteVpcRoutingTableOptions the {@link DeleteVpcRoutingTableOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteVpcRoutingTable(DeleteVpcRoutingTableOptions deleteVpcRoutingTableOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteVpcRoutingTableOptions,
      "deleteVpcRoutingTableOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpc_id", deleteVpcRoutingTableOptions.vpcId());
    pathParamsMap.put("id", deleteVpcRoutingTableOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpcs/{vpc_id}/routing_tables/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteVpcRoutingTable");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteVpcRoutingTableOptions.ifMatch() != null) {
      builder.header("If-Match", deleteVpcRoutingTableOptions.ifMatch());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a VPC routing table.
   *
   * This request retrieves a single routing table specified by the identifier in the URL.
   *
   * @param getVpcRoutingTableOptions the {@link GetVpcRoutingTableOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RoutingTable}
   */
  public ServiceCall<RoutingTable> getVpcRoutingTable(GetVpcRoutingTableOptions getVpcRoutingTableOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getVpcRoutingTableOptions,
      "getVpcRoutingTableOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpc_id", getVpcRoutingTableOptions.vpcId());
    pathParamsMap.put("id", getVpcRoutingTableOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpcs/{vpc_id}/routing_tables/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getVpcRoutingTable");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<RoutingTable> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RoutingTable>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a VPC routing table.
   *
   * This request updates a routing table with the information in a provided routing table patch. The patch object is
   * structured in the same way as a retrieved table and contains only the information to be updated.
   *
   * @param updateVpcRoutingTableOptions the {@link UpdateVpcRoutingTableOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RoutingTable}
   */
  public ServiceCall<RoutingTable> updateVpcRoutingTable(UpdateVpcRoutingTableOptions updateVpcRoutingTableOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateVpcRoutingTableOptions,
      "updateVpcRoutingTableOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpc_id", updateVpcRoutingTableOptions.vpcId());
    pathParamsMap.put("id", updateVpcRoutingTableOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpcs/{vpc_id}/routing_tables/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateVpcRoutingTable");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateVpcRoutingTableOptions.ifMatch() != null) {
      builder.header("If-Match", updateVpcRoutingTableOptions.ifMatch());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateVpcRoutingTableOptions.routingTablePatch()), "application/merge-patch+json");
    ResponseConverter<RoutingTable> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RoutingTable>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List routes in a VPC routing table.
   *
   * This request lists routes in a VPC routing table. If subnets are associated with this routing table, delivery of
   * packets sent on a subnet is performed according to the action of the most specific matching route in the table
   * (provided the subnet and route are in the same zone). If multiple equally-specific routes exist, the route with the
   * highest priority will be used. If two matching routes have the same destination and priority, traffic will be
   * distributed between them. If no routes match, delivery will be controlled by the system's built-in routes.
   *
   * @param listVpcRoutingTableRoutesOptions the {@link ListVpcRoutingTableRoutesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RouteCollection}
   */
  public ServiceCall<RouteCollection> listVpcRoutingTableRoutes(ListVpcRoutingTableRoutesOptions listVpcRoutingTableRoutesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listVpcRoutingTableRoutesOptions,
      "listVpcRoutingTableRoutesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpc_id", listVpcRoutingTableRoutesOptions.vpcId());
    pathParamsMap.put("routing_table_id", listVpcRoutingTableRoutesOptions.routingTableId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpcs/{vpc_id}/routing_tables/{routing_table_id}/routes", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listVpcRoutingTableRoutes");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listVpcRoutingTableRoutesOptions.start() != null) {
      builder.query("start", String.valueOf(listVpcRoutingTableRoutesOptions.start()));
    }
    if (listVpcRoutingTableRoutesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listVpcRoutingTableRoutesOptions.limit()));
    }
    ResponseConverter<RouteCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RouteCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a route in a VPC routing table.
   *
   * This request creates a new VPC route from a VPC route prototype object. The prototype object is structured in the
   * same way as a retrieved VPC route and contains the information necessary to create the route.
   *
   * @param createVpcRoutingTableRouteOptions the {@link CreateVpcRoutingTableRouteOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Route}
   */
  public ServiceCall<Route> createVpcRoutingTableRoute(CreateVpcRoutingTableRouteOptions createVpcRoutingTableRouteOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createVpcRoutingTableRouteOptions,
      "createVpcRoutingTableRouteOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpc_id", createVpcRoutingTableRouteOptions.vpcId());
    pathParamsMap.put("routing_table_id", createVpcRoutingTableRouteOptions.routingTableId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpcs/{vpc_id}/routing_tables/{routing_table_id}/routes", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createVpcRoutingTableRoute");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("destination", createVpcRoutingTableRouteOptions.destination());
    contentJson.add("zone", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createVpcRoutingTableRouteOptions.zone()));
    if (createVpcRoutingTableRouteOptions.action() != null) {
      contentJson.addProperty("action", createVpcRoutingTableRouteOptions.action());
    }
    if (createVpcRoutingTableRouteOptions.advertise() != null) {
      contentJson.addProperty("advertise", createVpcRoutingTableRouteOptions.advertise());
    }
    if (createVpcRoutingTableRouteOptions.name() != null) {
      contentJson.addProperty("name", createVpcRoutingTableRouteOptions.name());
    }
    if (createVpcRoutingTableRouteOptions.nextHop() != null) {
      contentJson.add("next_hop", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createVpcRoutingTableRouteOptions.nextHop()));
    }
    if (createVpcRoutingTableRouteOptions.priority() != null) {
      contentJson.addProperty("priority", createVpcRoutingTableRouteOptions.priority());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Route> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Route>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a VPC routing table route.
   *
   * This request deletes a VPC route. This operation cannot be reversed. Only VPC routes with an `origin` of `user` are
   * allowed to be deleted.
   *
   * @param deleteVpcRoutingTableRouteOptions the {@link DeleteVpcRoutingTableRouteOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteVpcRoutingTableRoute(DeleteVpcRoutingTableRouteOptions deleteVpcRoutingTableRouteOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteVpcRoutingTableRouteOptions,
      "deleteVpcRoutingTableRouteOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpc_id", deleteVpcRoutingTableRouteOptions.vpcId());
    pathParamsMap.put("routing_table_id", deleteVpcRoutingTableRouteOptions.routingTableId());
    pathParamsMap.put("id", deleteVpcRoutingTableRouteOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpcs/{vpc_id}/routing_tables/{routing_table_id}/routes/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteVpcRoutingTableRoute");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a VPC routing table route.
   *
   * This request retrieves a single VPC route specified by the identifier in the URL path.
   *
   * @param getVpcRoutingTableRouteOptions the {@link GetVpcRoutingTableRouteOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Route}
   */
  public ServiceCall<Route> getVpcRoutingTableRoute(GetVpcRoutingTableRouteOptions getVpcRoutingTableRouteOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getVpcRoutingTableRouteOptions,
      "getVpcRoutingTableRouteOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpc_id", getVpcRoutingTableRouteOptions.vpcId());
    pathParamsMap.put("routing_table_id", getVpcRoutingTableRouteOptions.routingTableId());
    pathParamsMap.put("id", getVpcRoutingTableRouteOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpcs/{vpc_id}/routing_tables/{routing_table_id}/routes/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getVpcRoutingTableRoute");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Route> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Route>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a VPC routing table route.
   *
   * This request updates a VPC route with the information provided in a route patch object. The patch object is
   * structured in the same way as a retrieved VPC route and needs to contain only the information to be updated. Only
   * VPC routes with an `origin` of `user` are allowed to be updated.
   *
   * @param updateVpcRoutingTableRouteOptions the {@link UpdateVpcRoutingTableRouteOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Route}
   */
  public ServiceCall<Route> updateVpcRoutingTableRoute(UpdateVpcRoutingTableRouteOptions updateVpcRoutingTableRouteOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateVpcRoutingTableRouteOptions,
      "updateVpcRoutingTableRouteOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpc_id", updateVpcRoutingTableRouteOptions.vpcId());
    pathParamsMap.put("routing_table_id", updateVpcRoutingTableRouteOptions.routingTableId());
    pathParamsMap.put("id", updateVpcRoutingTableRouteOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpcs/{vpc_id}/routing_tables/{routing_table_id}/routes/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateVpcRoutingTableRoute");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateVpcRoutingTableRouteOptions.routePatch()), "application/merge-patch+json");
    ResponseConverter<Route> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Route>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List subnets.
   *
   * This request lists subnets in the region. Subnets are contiguous ranges of IP addresses specified in CIDR block
   * notation. Each subnet is within a particular zone and cannot span multiple zones or regions.
   *
   * @param listSubnetsOptions the {@link ListSubnetsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SubnetCollection}
   */
  public ServiceCall<SubnetCollection> listSubnets(ListSubnetsOptions listSubnetsOptions) {
    if (listSubnetsOptions == null) {
      listSubnetsOptions = new ListSubnetsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/subnets"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listSubnets");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listSubnetsOptions.start() != null) {
      builder.query("start", String.valueOf(listSubnetsOptions.start()));
    }
    if (listSubnetsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listSubnetsOptions.limit()));
    }
    if (listSubnetsOptions.resourceGroupId() != null) {
      builder.query("resource_group.id", String.valueOf(listSubnetsOptions.resourceGroupId()));
    }
    if (listSubnetsOptions.zoneName() != null) {
      builder.query("zone.name", String.valueOf(listSubnetsOptions.zoneName()));
    }
    if (listSubnetsOptions.vpcId() != null) {
      builder.query("vpc.id", String.valueOf(listSubnetsOptions.vpcId()));
    }
    if (listSubnetsOptions.vpcCrn() != null) {
      builder.query("vpc.crn", String.valueOf(listSubnetsOptions.vpcCrn()));
    }
    if (listSubnetsOptions.vpcName() != null) {
      builder.query("vpc.name", String.valueOf(listSubnetsOptions.vpcName()));
    }
    if (listSubnetsOptions.routingTableId() != null) {
      builder.query("routing_table.id", String.valueOf(listSubnetsOptions.routingTableId()));
    }
    if (listSubnetsOptions.routingTableName() != null) {
      builder.query("routing_table.name", String.valueOf(listSubnetsOptions.routingTableName()));
    }
    ResponseConverter<SubnetCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SubnetCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List subnets.
   *
   * This request lists subnets in the region. Subnets are contiguous ranges of IP addresses specified in CIDR block
   * notation. Each subnet is within a particular zone and cannot span multiple zones or regions.
   *
   * @return a {@link ServiceCall} with a result of type {@link SubnetCollection}
   */
  public ServiceCall<SubnetCollection> listSubnets() {
    return listSubnets(null);
  }

  /**
   * Create a subnet.
   *
   * This request creates a new subnet from a subnet prototype object. The prototype object is structured in the same
   * way as a retrieved subnet, and contains the information necessary to create the new subnet. For this request to
   * succeed, the prototype's CIDR block must not overlap with an existing subnet in the VPC.
   *
   * @param createSubnetOptions the {@link CreateSubnetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Subnet}
   */
  public ServiceCall<Subnet> createSubnet(CreateSubnetOptions createSubnetOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createSubnetOptions,
      "createSubnetOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/subnets"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createSubnet");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createSubnetOptions.subnetPrototype()), "application/json");
    ResponseConverter<Subnet> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Subnet>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a subnet.
   *
   * This request deletes a subnet. This operation cannot be reversed. For this request to succeed, the subnet must not
   * be referenced by any bare metal server network interfaces, instance network interfaces, virtual network interfaces,
   * VPN gateways, or load balancers. A delete operation automatically detaches the subnet from any network ACLs, public
   * gateways, or endpoint gateways. All flow log collectors with `auto_delete` set to `true` targeting the subnet or
   * any resource in the subnet are automatically deleted.
   *
   * @param deleteSubnetOptions the {@link DeleteSubnetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteSubnet(DeleteSubnetOptions deleteSubnetOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteSubnetOptions,
      "deleteSubnetOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteSubnetOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/subnets/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteSubnet");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a subnet.
   *
   * This request retrieves a single subnet specified by the identifier in the URL.
   *
   * @param getSubnetOptions the {@link GetSubnetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Subnet}
   */
  public ServiceCall<Subnet> getSubnet(GetSubnetOptions getSubnetOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSubnetOptions,
      "getSubnetOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getSubnetOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/subnets/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getSubnet");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Subnet> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Subnet>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a subnet.
   *
   * This request updates a subnet with the information in a provided subnet patch. The subnet patch object is
   * structured in the same way as a retrieved subnet and contains only the information to be updated.
   *
   * @param updateSubnetOptions the {@link UpdateSubnetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Subnet}
   */
  public ServiceCall<Subnet> updateSubnet(UpdateSubnetOptions updateSubnetOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateSubnetOptions,
      "updateSubnetOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateSubnetOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/subnets/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateSubnet");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateSubnetOptions.subnetPatch()), "application/merge-patch+json");
    ResponseConverter<Subnet> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Subnet>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a subnet's attached network ACL.
   *
   * This request retrieves the network ACL attached to the subnet specified by the identifier in the URL.
   *
   * @param getSubnetNetworkAclOptions the {@link GetSubnetNetworkAclOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link NetworkACL}
   */
  public ServiceCall<NetworkACL> getSubnetNetworkAcl(GetSubnetNetworkAclOptions getSubnetNetworkAclOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSubnetNetworkAclOptions,
      "getSubnetNetworkAclOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getSubnetNetworkAclOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/subnets/{id}/network_acl", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getSubnetNetworkAcl");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<NetworkACL> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<NetworkACL>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Replace the network ACL for a subnet.
   *
   * This request replaces the existing network ACL for a subnet with the network ACL specified in the request body.
   *
   * @param replaceSubnetNetworkAclOptions the {@link ReplaceSubnetNetworkAclOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link NetworkACL}
   */
  public ServiceCall<NetworkACL> replaceSubnetNetworkAcl(ReplaceSubnetNetworkAclOptions replaceSubnetNetworkAclOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceSubnetNetworkAclOptions,
      "replaceSubnetNetworkAclOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", replaceSubnetNetworkAclOptions.id());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/subnets/{id}/network_acl", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "replaceSubnetNetworkAcl");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(replaceSubnetNetworkAclOptions.networkAclIdentity()), "application/json");
    ResponseConverter<NetworkACL> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<NetworkACL>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Detach a public gateway from a subnet.
   *
   * This request detaches the public gateway from the subnet specified by the subnet identifier in the URL.
   *
   * @param unsetSubnetPublicGatewayOptions the {@link UnsetSubnetPublicGatewayOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> unsetSubnetPublicGateway(UnsetSubnetPublicGatewayOptions unsetSubnetPublicGatewayOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(unsetSubnetPublicGatewayOptions,
      "unsetSubnetPublicGatewayOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", unsetSubnetPublicGatewayOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/subnets/{id}/public_gateway", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "unsetSubnetPublicGateway");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a subnet's attached public gateway.
   *
   * This request retrieves the public gateway attached to the subnet specified by the identifier in the URL.
   *
   * @param getSubnetPublicGatewayOptions the {@link GetSubnetPublicGatewayOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PublicGateway}
   */
  public ServiceCall<PublicGateway> getSubnetPublicGateway(GetSubnetPublicGatewayOptions getSubnetPublicGatewayOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSubnetPublicGatewayOptions,
      "getSubnetPublicGatewayOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getSubnetPublicGatewayOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/subnets/{id}/public_gateway", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getSubnetPublicGateway");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<PublicGateway> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PublicGateway>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Attach a public gateway to a subnet.
   *
   * This request attaches the public gateway, specified in the request body, to the subnet specified by the subnet
   * identifier in the URL. The public gateway must have the same VPC and zone as the subnet.
   *
   * @param setSubnetPublicGatewayOptions the {@link SetSubnetPublicGatewayOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PublicGateway}
   */
  public ServiceCall<PublicGateway> setSubnetPublicGateway(SetSubnetPublicGatewayOptions setSubnetPublicGatewayOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(setSubnetPublicGatewayOptions,
      "setSubnetPublicGatewayOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", setSubnetPublicGatewayOptions.id());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/subnets/{id}/public_gateway", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "setSubnetPublicGateway");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(setSubnetPublicGatewayOptions.publicGatewayIdentity()), "application/json");
    ResponseConverter<PublicGateway> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PublicGateway>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a subnet's attached routing table.
   *
   * This request retrieves the routing table attached to the subnet specified by the identifier in the URL.
   *
   * @param getSubnetRoutingTableOptions the {@link GetSubnetRoutingTableOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RoutingTable}
   */
  public ServiceCall<RoutingTable> getSubnetRoutingTable(GetSubnetRoutingTableOptions getSubnetRoutingTableOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSubnetRoutingTableOptions,
      "getSubnetRoutingTableOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getSubnetRoutingTableOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/subnets/{id}/routing_table", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getSubnetRoutingTable");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<RoutingTable> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RoutingTable>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Replace the routing table for a subnet.
   *
   * This request replaces the existing routing table for a subnet with the routing table specified in the request body.
   *
   * For this request to succeed, the routing table `route_direct_link_ingress`,
   * `route_internet_ingress`, `route_transit_gateway_ingress`, and `route_vpc_zone_ingress` properties must be `false`.
   *
   * @param replaceSubnetRoutingTableOptions the {@link ReplaceSubnetRoutingTableOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RoutingTable}
   */
  public ServiceCall<RoutingTable> replaceSubnetRoutingTable(ReplaceSubnetRoutingTableOptions replaceSubnetRoutingTableOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceSubnetRoutingTableOptions,
      "replaceSubnetRoutingTableOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", replaceSubnetRoutingTableOptions.id());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/subnets/{id}/routing_table", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "replaceSubnetRoutingTable");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(replaceSubnetRoutingTableOptions.routingTableIdentity()), "application/json");
    ResponseConverter<RoutingTable> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RoutingTable>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List reserved IPs in a subnet.
   *
   * This request lists reserved IPs in a subnet. A reserved IP resource will exist for every address in the subnet
   * which is not available for use.
   *
   * @param listSubnetReservedIpsOptions the {@link ListSubnetReservedIpsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ReservedIPCollection}
   */
  public ServiceCall<ReservedIPCollection> listSubnetReservedIps(ListSubnetReservedIpsOptions listSubnetReservedIpsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listSubnetReservedIpsOptions,
      "listSubnetReservedIpsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("subnet_id", listSubnetReservedIpsOptions.subnetId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/subnets/{subnet_id}/reserved_ips", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listSubnetReservedIps");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listSubnetReservedIpsOptions.start() != null) {
      builder.query("start", String.valueOf(listSubnetReservedIpsOptions.start()));
    }
    if (listSubnetReservedIpsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listSubnetReservedIpsOptions.limit()));
    }
    if (listSubnetReservedIpsOptions.sort() != null) {
      builder.query("sort", String.valueOf(listSubnetReservedIpsOptions.sort()));
    }
    if (listSubnetReservedIpsOptions.targetId() != null) {
      builder.query("target.id", String.valueOf(listSubnetReservedIpsOptions.targetId()));
    }
    if (listSubnetReservedIpsOptions.targetCrn() != null) {
      builder.query("target.crn", String.valueOf(listSubnetReservedIpsOptions.targetCrn()));
    }
    if (listSubnetReservedIpsOptions.targetName() != null) {
      builder.query("target.name", String.valueOf(listSubnetReservedIpsOptions.targetName()));
    }
    if (listSubnetReservedIpsOptions.targetResourceType() != null) {
      builder.query("target.resource_type", String.valueOf(listSubnetReservedIpsOptions.targetResourceType()));
    }
    ResponseConverter<ReservedIPCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ReservedIPCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Reserve an IP in a subnet.
   *
   * This request reserves an IP address in a subnet. If the provided prototype object includes an `address`, the
   * address must not already be reserved.
   *
   * @param createSubnetReservedIpOptions the {@link CreateSubnetReservedIpOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ReservedIP}
   */
  public ServiceCall<ReservedIP> createSubnetReservedIp(CreateSubnetReservedIpOptions createSubnetReservedIpOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createSubnetReservedIpOptions,
      "createSubnetReservedIpOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("subnet_id", createSubnetReservedIpOptions.subnetId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/subnets/{subnet_id}/reserved_ips", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createSubnetReservedIp");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    if (createSubnetReservedIpOptions.address() != null) {
      contentJson.addProperty("address", createSubnetReservedIpOptions.address());
    }
    if (createSubnetReservedIpOptions.autoDelete() != null) {
      contentJson.addProperty("auto_delete", createSubnetReservedIpOptions.autoDelete());
    }
    if (createSubnetReservedIpOptions.name() != null) {
      contentJson.addProperty("name", createSubnetReservedIpOptions.name());
    }
    if (createSubnetReservedIpOptions.target() != null) {
      contentJson.add("target", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createSubnetReservedIpOptions.target()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ReservedIP> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ReservedIP>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a reserved IP.
   *
   * This request releases a reserved IP. This operation cannot be reversed.
   *
   * For this request to succeed, the reserved IP must not be required by another resource, such as a bare metal server
   * network interface, instance network interface or virtual network interface for which it is the primary IP. A
   * provider-owned reserved IP is not allowed to be deleted.
   *
   * @param deleteSubnetReservedIpOptions the {@link DeleteSubnetReservedIpOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteSubnetReservedIp(DeleteSubnetReservedIpOptions deleteSubnetReservedIpOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteSubnetReservedIpOptions,
      "deleteSubnetReservedIpOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("subnet_id", deleteSubnetReservedIpOptions.subnetId());
    pathParamsMap.put("id", deleteSubnetReservedIpOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/subnets/{subnet_id}/reserved_ips/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteSubnetReservedIp");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a reserved IP.
   *
   * This request retrieves a single reserved IP specified by the identifier in the URL.
   *
   * @param getSubnetReservedIpOptions the {@link GetSubnetReservedIpOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ReservedIP}
   */
  public ServiceCall<ReservedIP> getSubnetReservedIp(GetSubnetReservedIpOptions getSubnetReservedIpOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSubnetReservedIpOptions,
      "getSubnetReservedIpOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("subnet_id", getSubnetReservedIpOptions.subnetId());
    pathParamsMap.put("id", getSubnetReservedIpOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/subnets/{subnet_id}/reserved_ips/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getSubnetReservedIp");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<ReservedIP> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ReservedIP>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a reserved IP.
   *
   * This request updates a reserved IP with the information in a provided reserved IP patch. The reserved IP patch
   * object is structured in the same way as a retrieved reserved IP and contains only the information to be updated.
   *
   * A provider-owned reserved IP is not allowed to be updated.
   *
   * @param updateSubnetReservedIpOptions the {@link UpdateSubnetReservedIpOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ReservedIP}
   */
  public ServiceCall<ReservedIP> updateSubnetReservedIp(UpdateSubnetReservedIpOptions updateSubnetReservedIpOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateSubnetReservedIpOptions,
      "updateSubnetReservedIpOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("subnet_id", updateSubnetReservedIpOptions.subnetId());
    pathParamsMap.put("id", updateSubnetReservedIpOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/subnets/{subnet_id}/reserved_ips/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateSubnetReservedIp");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateSubnetReservedIpOptions.reservedIpPatch()), "application/merge-patch+json");
    ResponseConverter<ReservedIP> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ReservedIP>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List images.
   *
   * This request lists images available in the region. An image provides source data for a volume. Images are either
   * system-provided, or created from another source, such as importing from Cloud Object Storage.
   *
   * @param listImagesOptions the {@link ListImagesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ImageCollection}
   */
  public ServiceCall<ImageCollection> listImages(ListImagesOptions listImagesOptions) {
    if (listImagesOptions == null) {
      listImagesOptions = new ListImagesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/images"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listImages");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listImagesOptions.start() != null) {
      builder.query("start", String.valueOf(listImagesOptions.start()));
    }
    if (listImagesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listImagesOptions.limit()));
    }
    if (listImagesOptions.resourceGroupId() != null) {
      builder.query("resource_group.id", String.valueOf(listImagesOptions.resourceGroupId()));
    }
    if (listImagesOptions.name() != null) {
      builder.query("name", String.valueOf(listImagesOptions.name()));
    }
    if (listImagesOptions.status() != null) {
      builder.query("status", RequestUtils.join(listImagesOptions.status(), ","));
    }
    if (listImagesOptions.visibility() != null) {
      builder.query("visibility", String.valueOf(listImagesOptions.visibility()));
    }
    if (listImagesOptions.userDataFormat() != null) {
      builder.query("user_data_format", RequestUtils.join(listImagesOptions.userDataFormat(), ","));
    }
    if (listImagesOptions.ownerType() != null) {
      builder.query("owner_type", String.valueOf(listImagesOptions.ownerType()));
    }
    ResponseConverter<ImageCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ImageCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List images.
   *
   * This request lists images available in the region. An image provides source data for a volume. Images are either
   * system-provided, or created from another source, such as importing from Cloud Object Storage.
   *
   * @return a {@link ServiceCall} with a result of type {@link ImageCollection}
   */
  public ServiceCall<ImageCollection> listImages() {
    return listImages(null);
  }

  /**
   * Create an image.
   *
   * This request creates a new image from an image prototype object. The prototype object is structured in the same way
   * as a retrieved image, and contains the information necessary to create the new image. If an image is being
   * imported, a URL to the image file on object storage must be specified. If an image is being created from an
   * existing volume, that volume must be specified.
   *
   * @param createImageOptions the {@link CreateImageOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Image}
   */
  public ServiceCall<Image> createImage(CreateImageOptions createImageOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createImageOptions,
      "createImageOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/images"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createImage");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createImageOptions.imagePrototype()), "application/json");
    ResponseConverter<Image> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Image>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete an image.
   *
   * This request deletes an image. Any active image export jobs will be completed first. This operation cannot be
   * reversed. A system-provided image is not allowed to be deleted. Additionally, an image cannot be deleted if it:
   * - has a `status` of `deleting`
   * - has a `status` of `pending` with a `status_reasons` code of `image_request_in_progress`
   * - has `catalog_offering.managed` set to `true`.
   *
   * @param deleteImageOptions the {@link DeleteImageOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteImage(DeleteImageOptions deleteImageOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteImageOptions,
      "deleteImageOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteImageOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/images/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteImage");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve an image.
   *
   * This request retrieves a single image specified by the identifier in the URL.
   *
   * @param getImageOptions the {@link GetImageOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Image}
   */
  public ServiceCall<Image> getImage(GetImageOptions getImageOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getImageOptions,
      "getImageOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getImageOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/images/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getImage");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Image> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Image>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update an image.
   *
   * This request updates an image with the information in a provided image patch. The image patch object is structured
   * in the same way as a retrieved image and contains only the information to be updated. A system-provided image is
   * not allowed to be updated. An image with a `status` of `deleting` cannot be updated.
   *
   * @param updateImageOptions the {@link UpdateImageOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Image}
   */
  public ServiceCall<Image> updateImage(UpdateImageOptions updateImageOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateImageOptions,
      "updateImageOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateImageOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/images/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateImage");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateImageOptions.imagePatch()), "application/merge-patch+json");
    ResponseConverter<Image> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Image>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Deprecate an image.
   *
   * This request deprecates an image, resulting in its `status` becoming `deprecated` and
   * `deprecation_at` being set to the current date and time.
   *
   * The image must:
   * - have a `status` of `available`
   * - have `catalog_offering.managed` set to `false`
   * - not have `deprecation_at` set
   *
   * The image must not have `deprecation_at` set, must have `catalog_offering.managed` set to
   * `false`, and must have a `status` of `available`.
   *
   * A system-provided image is not allowed to be deprecated.
   *
   * @param deprecateImageOptions the {@link DeprecateImageOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deprecateImage(DeprecateImageOptions deprecateImageOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deprecateImageOptions,
      "deprecateImageOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deprecateImageOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/images/{id}/deprecate", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deprecateImage");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Obsolete an image.
   *
   * This request obsoletes an image, resulting in its `status` becoming `obsolete` and
   * `obsolescence_at` being set to the current date and time.
   *
   * The image must:
   * - have a `status` of `available` or `deprecated`
   * - have `catalog_offering.managed` set to `false`
   * - not have `deprecation_at` set in the future
   * - not have `obsolescence_at` set
   *
   * A system-provided image is not allowed to be obsoleted.
   *
   * @param obsoleteImageOptions the {@link ObsoleteImageOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> obsoleteImage(ObsoleteImageOptions obsoleteImageOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(obsoleteImageOptions,
      "obsoleteImageOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", obsoleteImageOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/images/{id}/obsolete", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "obsoleteImage");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List export jobs for an image.
   *
   * This request lists export jobs for an image. Each job tracks the exporting of the image to another location, such
   * as a bucket within cloud object storage.
   *
   * The jobs will be sorted by their `created_at` property values, with newest jobs first. Jobs with identical
   * `created_at` property values will in turn be sorted by ascending
   * `name` property values.
   *
   * @param listImageExportJobsOptions the {@link ListImageExportJobsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ImageExportJobUnpaginatedCollection}
   */
  public ServiceCall<ImageExportJobUnpaginatedCollection> listImageExportJobs(ListImageExportJobsOptions listImageExportJobsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listImageExportJobsOptions,
      "listImageExportJobsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("image_id", listImageExportJobsOptions.imageId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/images/{image_id}/export_jobs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listImageExportJobs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listImageExportJobsOptions.name() != null) {
      builder.query("name", String.valueOf(listImageExportJobsOptions.name()));
    }
    ResponseConverter<ImageExportJobUnpaginatedCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ImageExportJobUnpaginatedCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create an export job for an image.
   *
   * This request creates and queues a new export job for the image specified in the URL using the image export job
   * prototype object. The image must be owned by the account and be in the `available`, `deprecated`, `obsolete`, or
   * `unusable` state. The prototype object is structured in the same way as a retrieved image export job, and contains
   * the information necessary to create and queue the new image export job.
   *
   * @param createImageExportJobOptions the {@link CreateImageExportJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ImageExportJob}
   */
  public ServiceCall<ImageExportJob> createImageExportJob(CreateImageExportJobOptions createImageExportJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createImageExportJobOptions,
      "createImageExportJobOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("image_id", createImageExportJobOptions.imageId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/images/{image_id}/export_jobs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createImageExportJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("storage_bucket", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createImageExportJobOptions.storageBucket()));
    if (createImageExportJobOptions.format() != null) {
      contentJson.addProperty("format", createImageExportJobOptions.format());
    }
    if (createImageExportJobOptions.name() != null) {
      contentJson.addProperty("name", createImageExportJobOptions.name());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ImageExportJob> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ImageExportJob>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete an image export job.
   *
   * This request deletes an image export job. This operation cannot be reversed. If the job has not completed, the job
   * will be canceled, and the incomplete exported image object deleted. If the job has completed, the exported image
   * object will not be deleted.
   *
   * @param deleteImageExportJobOptions the {@link DeleteImageExportJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteImageExportJob(DeleteImageExportJobOptions deleteImageExportJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteImageExportJobOptions,
      "deleteImageExportJobOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("image_id", deleteImageExportJobOptions.imageId());
    pathParamsMap.put("id", deleteImageExportJobOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/images/{image_id}/export_jobs/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteImageExportJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve an image export job.
   *
   * This request retrieves a single image export job specified by the identifier in the URL.
   *
   * @param getImageExportJobOptions the {@link GetImageExportJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ImageExportJob}
   */
  public ServiceCall<ImageExportJob> getImageExportJob(GetImageExportJobOptions getImageExportJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getImageExportJobOptions,
      "getImageExportJobOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("image_id", getImageExportJobOptions.imageId());
    pathParamsMap.put("id", getImageExportJobOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/images/{image_id}/export_jobs/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getImageExportJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<ImageExportJob> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ImageExportJob>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update an image export job.
   *
   * This request updates an image export job with the information in a provided image export job patch. The image
   * export job patch object is structured in the same way as a retrieved image export job and contains only the
   * information to be updated.
   *
   * @param updateImageExportJobOptions the {@link UpdateImageExportJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ImageExportJob}
   */
  public ServiceCall<ImageExportJob> updateImageExportJob(UpdateImageExportJobOptions updateImageExportJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateImageExportJobOptions,
      "updateImageExportJobOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("image_id", updateImageExportJobOptions.imageId());
    pathParamsMap.put("id", updateImageExportJobOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/images/{image_id}/export_jobs/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateImageExportJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateImageExportJobOptions.imageExportJobPatch()), "application/merge-patch+json");
    ResponseConverter<ImageExportJob> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ImageExportJob>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List operating systems.
   *
   * This request lists operating systems in the region.
   *
   * @param listOperatingSystemsOptions the {@link ListOperatingSystemsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link OperatingSystemCollection}
   */
  public ServiceCall<OperatingSystemCollection> listOperatingSystems(ListOperatingSystemsOptions listOperatingSystemsOptions) {
    if (listOperatingSystemsOptions == null) {
      listOperatingSystemsOptions = new ListOperatingSystemsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/operating_systems"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listOperatingSystems");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listOperatingSystemsOptions.start() != null) {
      builder.query("start", String.valueOf(listOperatingSystemsOptions.start()));
    }
    if (listOperatingSystemsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listOperatingSystemsOptions.limit()));
    }
    ResponseConverter<OperatingSystemCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<OperatingSystemCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List operating systems.
   *
   * This request lists operating systems in the region.
   *
   * @return a {@link ServiceCall} with a result of type {@link OperatingSystemCollection}
   */
  public ServiceCall<OperatingSystemCollection> listOperatingSystems() {
    return listOperatingSystems(null);
  }

  /**
   * Retrieve an operating system.
   *
   * This request retrieves a single operating system specified by the name in the URL.
   *
   * @param getOperatingSystemOptions the {@link GetOperatingSystemOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link OperatingSystem}
   */
  public ServiceCall<OperatingSystem> getOperatingSystem(GetOperatingSystemOptions getOperatingSystemOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getOperatingSystemOptions,
      "getOperatingSystemOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("name", getOperatingSystemOptions.name());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/operating_systems/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getOperatingSystem");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<OperatingSystem> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<OperatingSystem>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List keys.
   *
   * This request lists keys in the region. A key contains a public SSH key which may be installed on instances when
   * they are created. Private keys are not stored.
   *
   * @param listKeysOptions the {@link ListKeysOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link KeyCollection}
   */
  public ServiceCall<KeyCollection> listKeys(ListKeysOptions listKeysOptions) {
    if (listKeysOptions == null) {
      listKeysOptions = new ListKeysOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/keys"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listKeys");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listKeysOptions.start() != null) {
      builder.query("start", String.valueOf(listKeysOptions.start()));
    }
    if (listKeysOptions.limit() != null) {
      builder.query("limit", String.valueOf(listKeysOptions.limit()));
    }
    if (listKeysOptions.resourceGroupId() != null) {
      builder.query("resource_group.id", String.valueOf(listKeysOptions.resourceGroupId()));
    }
    ResponseConverter<KeyCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<KeyCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List keys.
   *
   * This request lists keys in the region. A key contains a public SSH key which may be installed on instances when
   * they are created. Private keys are not stored.
   *
   * @return a {@link ServiceCall} with a result of type {@link KeyCollection}
   */
  public ServiceCall<KeyCollection> listKeys() {
    return listKeys(null);
  }

  /**
   * Create a key.
   *
   * This request creates a new SSH key from an key prototype object. The prototype object is structured in the same way
   * as a retrieved key, and contains the information necessary to create the new key. The public key value must be
   * provided.
   *
   * @param createKeyOptions the {@link CreateKeyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Key}
   */
  public ServiceCall<Key> createKey(CreateKeyOptions createKeyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createKeyOptions,
      "createKeyOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/keys"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createKey");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("public_key", createKeyOptions.publicKey());
    if (createKeyOptions.name() != null) {
      contentJson.addProperty("name", createKeyOptions.name());
    }
    if (createKeyOptions.resourceGroup() != null) {
      contentJson.add("resource_group", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createKeyOptions.resourceGroup()));
    }
    if (createKeyOptions.type() != null) {
      contentJson.addProperty("type", createKeyOptions.type());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Key> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Key>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a key.
   *
   * This request deletes a key. This operation cannot be reversed.
   *
   * @param deleteKeyOptions the {@link DeleteKeyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteKey(DeleteKeyOptions deleteKeyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteKeyOptions,
      "deleteKeyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteKeyOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/keys/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteKey");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a key.
   *
   * This request retrieves a single key specified by the identifier in the URL.
   *
   * @param getKeyOptions the {@link GetKeyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Key}
   */
  public ServiceCall<Key> getKey(GetKeyOptions getKeyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getKeyOptions,
      "getKeyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getKeyOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/keys/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getKey");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Key> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Key>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a key.
   *
   * This request updates a key's name.
   *
   * @param updateKeyOptions the {@link UpdateKeyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Key}
   */
  public ServiceCall<Key> updateKey(UpdateKeyOptions updateKeyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateKeyOptions,
      "updateKeyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateKeyOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/keys/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateKey");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateKeyOptions.keyPatch()), "application/merge-patch+json");
    ResponseConverter<Key> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Key>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List instance profiles.
   *
   * This request lists provisionable [instance profiles](https://cloud.ibm.com/docs/vpc?topic=vpc-profiles) in the
   * region. An instance profile specifies the performance characteristics and pricing model for an instance.
   *
   * @param listInstanceProfilesOptions the {@link ListInstanceProfilesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InstanceProfileCollection}
   */
  public ServiceCall<InstanceProfileCollection> listInstanceProfiles(ListInstanceProfilesOptions listInstanceProfilesOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instance/profiles"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listInstanceProfiles");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<InstanceProfileCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InstanceProfileCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List instance profiles.
   *
   * This request lists provisionable [instance profiles](https://cloud.ibm.com/docs/vpc?topic=vpc-profiles) in the
   * region. An instance profile specifies the performance characteristics and pricing model for an instance.
   *
   * @return a {@link ServiceCall} with a result of type {@link InstanceProfileCollection}
   */
  public ServiceCall<InstanceProfileCollection> listInstanceProfiles() {
    return listInstanceProfiles(null);
  }

  /**
   * Retrieve an instance profile.
   *
   * This request retrieves a single instance profile specified by the name in the URL.
   *
   * @param getInstanceProfileOptions the {@link GetInstanceProfileOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InstanceProfile}
   */
  public ServiceCall<InstanceProfile> getInstanceProfile(GetInstanceProfileOptions getInstanceProfileOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getInstanceProfileOptions,
      "getInstanceProfileOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("name", getInstanceProfileOptions.name());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instance/profiles/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getInstanceProfile");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<InstanceProfile> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InstanceProfile>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List instance templates.
   *
   * This request lists instance templates in the region.
   *
   * @param listInstanceTemplatesOptions the {@link ListInstanceTemplatesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InstanceTemplateCollection}
   */
  public ServiceCall<InstanceTemplateCollection> listInstanceTemplates(ListInstanceTemplatesOptions listInstanceTemplatesOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instance/templates"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listInstanceTemplates");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<InstanceTemplateCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InstanceTemplateCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List instance templates.
   *
   * This request lists instance templates in the region.
   *
   * @return a {@link ServiceCall} with a result of type {@link InstanceTemplateCollection}
   */
  public ServiceCall<InstanceTemplateCollection> listInstanceTemplates() {
    return listInstanceTemplates(null);
  }

  /**
   * Create an instance template.
   *
   * This request creates a new instance template. The prototype object is structured in the same way as a retrieved
   * instance template, and contains the information necessary to provision a new instance from the template.
   *
   * If a `source_template` is specified in the prototype object, its contents are copied into the new template prior to
   * copying any other properties provided in the prototype object.
   *
   * @param createInstanceTemplateOptions the {@link CreateInstanceTemplateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InstanceTemplate}
   */
  public ServiceCall<InstanceTemplate> createInstanceTemplate(CreateInstanceTemplateOptions createInstanceTemplateOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createInstanceTemplateOptions,
      "createInstanceTemplateOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instance/templates"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createInstanceTemplate");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createInstanceTemplateOptions.instanceTemplatePrototype()), "application/json");
    ResponseConverter<InstanceTemplate> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InstanceTemplate>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete an instance template.
   *
   * This request deletes the instance template. This operation cannot be reversed.
   *
   * @param deleteInstanceTemplateOptions the {@link DeleteInstanceTemplateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteInstanceTemplate(DeleteInstanceTemplateOptions deleteInstanceTemplateOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteInstanceTemplateOptions,
      "deleteInstanceTemplateOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteInstanceTemplateOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instance/templates/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteInstanceTemplate");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve an instance template.
   *
   * This request retrieves a single instance template specified by the identifier in the URL.
   *
   * @param getInstanceTemplateOptions the {@link GetInstanceTemplateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InstanceTemplate}
   */
  public ServiceCall<InstanceTemplate> getInstanceTemplate(GetInstanceTemplateOptions getInstanceTemplateOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getInstanceTemplateOptions,
      "getInstanceTemplateOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getInstanceTemplateOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instance/templates/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getInstanceTemplate");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<InstanceTemplate> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InstanceTemplate>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update an instance template.
   *
   * This request updates an instance template with the information provided in the instance template patch. The
   * instance template patch object is structured in the same way as a retrieved instance template and contains only the
   * information to be updated.
   *
   * @param updateInstanceTemplateOptions the {@link UpdateInstanceTemplateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InstanceTemplate}
   */
  public ServiceCall<InstanceTemplate> updateInstanceTemplate(UpdateInstanceTemplateOptions updateInstanceTemplateOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateInstanceTemplateOptions,
      "updateInstanceTemplateOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateInstanceTemplateOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instance/templates/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateInstanceTemplate");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateInstanceTemplateOptions.instanceTemplatePatch()), "application/merge-patch+json");
    ResponseConverter<InstanceTemplate> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InstanceTemplate>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List instances.
   *
   * This request lists instances in the region.
   *
   * @param listInstancesOptions the {@link ListInstancesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InstanceCollection}
   */
  public ServiceCall<InstanceCollection> listInstances(ListInstancesOptions listInstancesOptions) {
    if (listInstancesOptions == null) {
      listInstancesOptions = new ListInstancesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listInstances");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listInstancesOptions.start() != null) {
      builder.query("start", String.valueOf(listInstancesOptions.start()));
    }
    if (listInstancesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listInstancesOptions.limit()));
    }
    if (listInstancesOptions.resourceGroupId() != null) {
      builder.query("resource_group.id", String.valueOf(listInstancesOptions.resourceGroupId()));
    }
    if (listInstancesOptions.name() != null) {
      builder.query("name", String.valueOf(listInstancesOptions.name()));
    }
    if (listInstancesOptions.clusterNetworkId() != null) {
      builder.query("cluster_network.id", String.valueOf(listInstancesOptions.clusterNetworkId()));
    }
    if (listInstancesOptions.clusterNetworkCrn() != null) {
      builder.query("cluster_network.crn", String.valueOf(listInstancesOptions.clusterNetworkCrn()));
    }
    if (listInstancesOptions.clusterNetworkName() != null) {
      builder.query("cluster_network.name", String.valueOf(listInstancesOptions.clusterNetworkName()));
    }
    if (listInstancesOptions.dedicatedHostId() != null) {
      builder.query("dedicated_host.id", String.valueOf(listInstancesOptions.dedicatedHostId()));
    }
    if (listInstancesOptions.dedicatedHostCrn() != null) {
      builder.query("dedicated_host.crn", String.valueOf(listInstancesOptions.dedicatedHostCrn()));
    }
    if (listInstancesOptions.dedicatedHostName() != null) {
      builder.query("dedicated_host.name", String.valueOf(listInstancesOptions.dedicatedHostName()));
    }
    if (listInstancesOptions.placementGroupId() != null) {
      builder.query("placement_group.id", String.valueOf(listInstancesOptions.placementGroupId()));
    }
    if (listInstancesOptions.placementGroupCrn() != null) {
      builder.query("placement_group.crn", String.valueOf(listInstancesOptions.placementGroupCrn()));
    }
    if (listInstancesOptions.placementGroupName() != null) {
      builder.query("placement_group.name", String.valueOf(listInstancesOptions.placementGroupName()));
    }
    if (listInstancesOptions.reservationAffinityPolicy() != null) {
      builder.query("reservation_affinity.policy", String.valueOf(listInstancesOptions.reservationAffinityPolicy()));
    }
    if (listInstancesOptions.reservationId() != null) {
      builder.query("reservation.id", String.valueOf(listInstancesOptions.reservationId()));
    }
    if (listInstancesOptions.reservationCrn() != null) {
      builder.query("reservation.crn", String.valueOf(listInstancesOptions.reservationCrn()));
    }
    if (listInstancesOptions.reservationName() != null) {
      builder.query("reservation.name", String.valueOf(listInstancesOptions.reservationName()));
    }
    if (listInstancesOptions.vpcId() != null) {
      builder.query("vpc.id", String.valueOf(listInstancesOptions.vpcId()));
    }
    if (listInstancesOptions.vpcCrn() != null) {
      builder.query("vpc.crn", String.valueOf(listInstancesOptions.vpcCrn()));
    }
    if (listInstancesOptions.vpcName() != null) {
      builder.query("vpc.name", String.valueOf(listInstancesOptions.vpcName()));
    }
    ResponseConverter<InstanceCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InstanceCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List instances.
   *
   * This request lists instances in the region.
   *
   * @return a {@link ServiceCall} with a result of type {@link InstanceCollection}
   */
  public ServiceCall<InstanceCollection> listInstances() {
    return listInstances(null);
  }

  /**
   * Create an instance.
   *
   * This request provisions a new instance from an instance prototype object. The prototype object is structured in the
   * same way as a retrieved instance, and contains the information necessary to provision the new instance. The
   * instance is automatically started.
   *
   * @param createInstanceOptions the {@link CreateInstanceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Instance}
   */
  public ServiceCall<Instance> createInstance(CreateInstanceOptions createInstanceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createInstanceOptions,
      "createInstanceOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createInstance");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createInstanceOptions.instancePrototype()), "application/json");
    ResponseConverter<Instance> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Instance>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete an instance.
   *
   * This request deletes an instance. This operation cannot be reversed. Any floating IPs associated with instance
   * network interfaces are implicitly disassociated. All virtual network interfaces with `auto_delete` set to `true`
   * targeting instance network attachments on the instance are automatically deleted. All flow log collectors with
   * `auto_delete` set to `true` targeting the instance, the instance network attachments, the instance network
   * interfaces, or the automatically deleted virtual network interfaces are automatically deleted.
   *
   * @param deleteInstanceOptions the {@link DeleteInstanceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteInstance(DeleteInstanceOptions deleteInstanceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteInstanceOptions,
      "deleteInstanceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteInstanceOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteInstance");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteInstanceOptions.ifMatch() != null) {
      builder.header("If-Match", deleteInstanceOptions.ifMatch());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve an instance.
   *
   * This request retrieves a single instance specified by the identifier in the URL.
   *
   * @param getInstanceOptions the {@link GetInstanceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Instance}
   */
  public ServiceCall<Instance> getInstance(GetInstanceOptions getInstanceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getInstanceOptions,
      "getInstanceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getInstanceOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getInstance");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Instance> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Instance>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update an instance.
   *
   * This request updates an instance with the information in a provided instance patch. The instance patch object is
   * structured in the same way as a retrieved instance and contains only the information to be updated.
   *
   * @param updateInstanceOptions the {@link UpdateInstanceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Instance}
   */
  public ServiceCall<Instance> updateInstance(UpdateInstanceOptions updateInstanceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateInstanceOptions,
      "updateInstanceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateInstanceOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateInstance");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateInstanceOptions.ifMatch() != null) {
      builder.header("If-Match", updateInstanceOptions.ifMatch());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateInstanceOptions.instancePatch()), "application/merge-patch+json");
    ResponseConverter<Instance> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Instance>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve initialization configuration for an instance.
   *
   * This request retrieves configuration used to initialize the instance, such as SSH keys and the Windows
   * administrator password. These can subsequently be changed on the instance and therefore may not be current.
   *
   * @param getInstanceInitializationOptions the {@link GetInstanceInitializationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InstanceInitialization}
   */
  public ServiceCall<InstanceInitialization> getInstanceInitialization(GetInstanceInitializationOptions getInstanceInitializationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getInstanceInitializationOptions,
      "getInstanceInitializationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getInstanceInitializationOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{id}/initialization", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getInstanceInitialization");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<InstanceInitialization> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InstanceInitialization>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create an instance action.
   *
   * This request creates a new action which will be queued up to run as soon as any pending or running actions have
   * completed.
   *
   * @param createInstanceActionOptions the {@link CreateInstanceActionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InstanceAction}
   */
  public ServiceCall<InstanceAction> createInstanceAction(CreateInstanceActionOptions createInstanceActionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createInstanceActionOptions,
      "createInstanceActionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", createInstanceActionOptions.instanceId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/actions", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createInstanceAction");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("type", createInstanceActionOptions.type());
    if (createInstanceActionOptions.force() != null) {
      contentJson.addProperty("force", createInstanceActionOptions.force());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<InstanceAction> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InstanceAction>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List cluster network attachments on an instance.
   *
   * This request lists cluster network attachments on an instance. A cluster network attachment represents a device on
   * the instance to which a cluster network interface is attached.
   *
   * @param listInstanceClusterNetworkAttachmentsOptions the {@link ListInstanceClusterNetworkAttachmentsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InstanceClusterNetworkAttachmentCollection}
   */
  public ServiceCall<InstanceClusterNetworkAttachmentCollection> listInstanceClusterNetworkAttachments(ListInstanceClusterNetworkAttachmentsOptions listInstanceClusterNetworkAttachmentsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listInstanceClusterNetworkAttachmentsOptions,
      "listInstanceClusterNetworkAttachmentsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", listInstanceClusterNetworkAttachmentsOptions.instanceId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/cluster_network_attachments", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listInstanceClusterNetworkAttachments");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listInstanceClusterNetworkAttachmentsOptions.start() != null) {
      builder.query("start", String.valueOf(listInstanceClusterNetworkAttachmentsOptions.start()));
    }
    if (listInstanceClusterNetworkAttachmentsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listInstanceClusterNetworkAttachmentsOptions.limit()));
    }
    ResponseConverter<InstanceClusterNetworkAttachmentCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InstanceClusterNetworkAttachmentCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a cluster network attachment.
   *
   * This request creates a cluster network attachment from an instance cluster network attachment prototype object. A
   * cluster network attachment will attach the instance to a cluster network. The cluster network attachment prototype
   * must specify a cluster network interface identity or a cluster network interface prototype.
   *
   * The instance must be in a `stopped` or `stopping` state to create an instance cluster network attachment.
   *
   * @param createClusterNetworkAttachmentOptions the {@link CreateClusterNetworkAttachmentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InstanceClusterNetworkAttachment}
   */
  public ServiceCall<InstanceClusterNetworkAttachment> createClusterNetworkAttachment(CreateClusterNetworkAttachmentOptions createClusterNetworkAttachmentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createClusterNetworkAttachmentOptions,
      "createClusterNetworkAttachmentOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", createClusterNetworkAttachmentOptions.instanceId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/cluster_network_attachments", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createClusterNetworkAttachment");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("cluster_network_interface", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createClusterNetworkAttachmentOptions.clusterNetworkInterface()));
    if (createClusterNetworkAttachmentOptions.before() != null) {
      contentJson.add("before", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createClusterNetworkAttachmentOptions.before()));
    }
    if (createClusterNetworkAttachmentOptions.name() != null) {
      contentJson.addProperty("name", createClusterNetworkAttachmentOptions.name());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<InstanceClusterNetworkAttachment> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InstanceClusterNetworkAttachment>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete an instance cluster network attachment.
   *
   * This request deletes an instance cluster network attachment. The instance must be in a
   * `stopped` or `stopping` state to delete an instance cluster network attachment.
   *
   * This operation cannot be reversed.
   *
   * @param deleteInstanceClusterNetworkAttachmentOptions the {@link DeleteInstanceClusterNetworkAttachmentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InstanceClusterNetworkAttachment}
   */
  public ServiceCall<InstanceClusterNetworkAttachment> deleteInstanceClusterNetworkAttachment(DeleteInstanceClusterNetworkAttachmentOptions deleteInstanceClusterNetworkAttachmentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteInstanceClusterNetworkAttachmentOptions,
      "deleteInstanceClusterNetworkAttachmentOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", deleteInstanceClusterNetworkAttachmentOptions.instanceId());
    pathParamsMap.put("id", deleteInstanceClusterNetworkAttachmentOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/cluster_network_attachments/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteInstanceClusterNetworkAttachment");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<InstanceClusterNetworkAttachment> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InstanceClusterNetworkAttachment>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve an instance cluster network attachment.
   *
   * This request retrieves a single instance cluster network attachment specified by the identifier in the URL.
   *
   * @param getInstanceClusterNetworkAttachmentOptions the {@link GetInstanceClusterNetworkAttachmentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InstanceClusterNetworkAttachment}
   */
  public ServiceCall<InstanceClusterNetworkAttachment> getInstanceClusterNetworkAttachment(GetInstanceClusterNetworkAttachmentOptions getInstanceClusterNetworkAttachmentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getInstanceClusterNetworkAttachmentOptions,
      "getInstanceClusterNetworkAttachmentOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", getInstanceClusterNetworkAttachmentOptions.instanceId());
    pathParamsMap.put("id", getInstanceClusterNetworkAttachmentOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/cluster_network_attachments/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getInstanceClusterNetworkAttachment");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<InstanceClusterNetworkAttachment> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InstanceClusterNetworkAttachment>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update an instance cluster network attachment.
   *
   * This request updates an instance cluster network attachment with the information provided in an instance network
   * interface patch object. The instance cluster network attachment patch object is structured in the same way as a
   * retrieved instance cluster network attachment and needs to contain only the information to be updated.
   *
   * @param updateInstanceClusterNetworkAttachmentOptions the {@link UpdateInstanceClusterNetworkAttachmentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InstanceClusterNetworkAttachment}
   */
  public ServiceCall<InstanceClusterNetworkAttachment> updateInstanceClusterNetworkAttachment(UpdateInstanceClusterNetworkAttachmentOptions updateInstanceClusterNetworkAttachmentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateInstanceClusterNetworkAttachmentOptions,
      "updateInstanceClusterNetworkAttachmentOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", updateInstanceClusterNetworkAttachmentOptions.instanceId());
    pathParamsMap.put("id", updateInstanceClusterNetworkAttachmentOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/cluster_network_attachments/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateInstanceClusterNetworkAttachment");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateInstanceClusterNetworkAttachmentOptions.instanceClusterNetworkAttachmentPatch()), "application/merge-patch+json");
    ResponseConverter<InstanceClusterNetworkAttachment> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InstanceClusterNetworkAttachment>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a console access token for an instance.
   *
   * This request creates a new single-use console access token for an instance. All console configuration is provided
   * at token create time, and the token is subsequently used in the `access_token` query parameter for the WebSocket
   * request.  The access token is only valid for a short period of time, and a maximum of one token is valid for a
   * given instance at a time.
   *
   * @param createInstanceConsoleAccessTokenOptions the {@link CreateInstanceConsoleAccessTokenOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InstanceConsoleAccessToken}
   */
  public ServiceCall<InstanceConsoleAccessToken> createInstanceConsoleAccessToken(CreateInstanceConsoleAccessTokenOptions createInstanceConsoleAccessTokenOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createInstanceConsoleAccessTokenOptions,
      "createInstanceConsoleAccessTokenOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", createInstanceConsoleAccessTokenOptions.instanceId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/console_access_token", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createInstanceConsoleAccessToken");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("console_type", createInstanceConsoleAccessTokenOptions.consoleType());
    if (createInstanceConsoleAccessTokenOptions.force() != null) {
      contentJson.addProperty("force", createInstanceConsoleAccessTokenOptions.force());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<InstanceConsoleAccessToken> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InstanceConsoleAccessToken>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List disks on an instance.
   *
   * This request lists disks on an instance.  A disk is a block device that is locally attached to the instance's
   * physical host and is also referred to as instance storage. By default, the listed disks are sorted by their
   * `created_at` property values, with the newest disk first.
   *
   * @param listInstanceDisksOptions the {@link ListInstanceDisksOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InstanceDiskCollection}
   */
  public ServiceCall<InstanceDiskCollection> listInstanceDisks(ListInstanceDisksOptions listInstanceDisksOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listInstanceDisksOptions,
      "listInstanceDisksOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", listInstanceDisksOptions.instanceId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/disks", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listInstanceDisks");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<InstanceDiskCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InstanceDiskCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve an instance disk.
   *
   * This request retrieves a single instance disk specified by the identifier in the URL.
   *
   * @param getInstanceDiskOptions the {@link GetInstanceDiskOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InstanceDisk}
   */
  public ServiceCall<InstanceDisk> getInstanceDisk(GetInstanceDiskOptions getInstanceDiskOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getInstanceDiskOptions,
      "getInstanceDiskOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", getInstanceDiskOptions.instanceId());
    pathParamsMap.put("id", getInstanceDiskOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/disks/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getInstanceDisk");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<InstanceDisk> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InstanceDisk>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update an instance disk.
   *
   * This request updates the instance disk with the information in a provided patch.
   *
   * @param updateInstanceDiskOptions the {@link UpdateInstanceDiskOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InstanceDisk}
   */
  public ServiceCall<InstanceDisk> updateInstanceDisk(UpdateInstanceDiskOptions updateInstanceDiskOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateInstanceDiskOptions,
      "updateInstanceDiskOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", updateInstanceDiskOptions.instanceId());
    pathParamsMap.put("id", updateInstanceDiskOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/disks/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateInstanceDisk");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateInstanceDiskOptions.instanceDiskPatch()), "application/merge-patch+json");
    ResponseConverter<InstanceDisk> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InstanceDisk>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List network attachments on an instance.
   *
   * This request lists network attachments on an instance. A network attachment represents a device on the instance to
   * which a virtual network interface is attached.
   *
   * The network attachments will be sorted by their `created_at` property values, with newest network attachments
   * first. Network attachments with identical `created_at` property values will in turn be sorted by ascending `name`
   * property values.
   *
   * @param listInstanceNetworkAttachmentsOptions the {@link ListInstanceNetworkAttachmentsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InstanceNetworkAttachmentCollection}
   */
  public ServiceCall<InstanceNetworkAttachmentCollection> listInstanceNetworkAttachments(ListInstanceNetworkAttachmentsOptions listInstanceNetworkAttachmentsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listInstanceNetworkAttachmentsOptions,
      "listInstanceNetworkAttachmentsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", listInstanceNetworkAttachmentsOptions.instanceId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/network_attachments", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listInstanceNetworkAttachments");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<InstanceNetworkAttachmentCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InstanceNetworkAttachmentCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a network attachment on an instance.
   *
   * This request creates a new instance network attachment from an instance network attachment prototype object. The
   * prototype object is structured in the same way as a retrieved instance network attachment, and contains the
   * information necessary to create the new instance network attachment.
   *
   * @param createInstanceNetworkAttachmentOptions the {@link CreateInstanceNetworkAttachmentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InstanceNetworkAttachment}
   */
  public ServiceCall<InstanceNetworkAttachment> createInstanceNetworkAttachment(CreateInstanceNetworkAttachmentOptions createInstanceNetworkAttachmentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createInstanceNetworkAttachmentOptions,
      "createInstanceNetworkAttachmentOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", createInstanceNetworkAttachmentOptions.instanceId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/network_attachments", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createInstanceNetworkAttachment");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("virtual_network_interface", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createInstanceNetworkAttachmentOptions.virtualNetworkInterface()));
    if (createInstanceNetworkAttachmentOptions.name() != null) {
      contentJson.addProperty("name", createInstanceNetworkAttachmentOptions.name());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<InstanceNetworkAttachment> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InstanceNetworkAttachment>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete an instance network attachment.
   *
   * This request deletes an instance network attachment. This operation cannot be reversed. Any floating IPs associated
   * with the instance network attachment are implicitly disassociated. All flow log collectors with `auto_delete` set
   * to `true` targeting the instance network attachment are automatically deleted. The primary instance network
   * attachment is not allowed to be deleted.
   *
   * @param deleteInstanceNetworkAttachmentOptions the {@link DeleteInstanceNetworkAttachmentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteInstanceNetworkAttachment(DeleteInstanceNetworkAttachmentOptions deleteInstanceNetworkAttachmentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteInstanceNetworkAttachmentOptions,
      "deleteInstanceNetworkAttachmentOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", deleteInstanceNetworkAttachmentOptions.instanceId());
    pathParamsMap.put("id", deleteInstanceNetworkAttachmentOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/network_attachments/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteInstanceNetworkAttachment");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve an instance network attachment.
   *
   * This request retrieves a single instance network attachment specified by the identifier in the URL.
   *
   * @param getInstanceNetworkAttachmentOptions the {@link GetInstanceNetworkAttachmentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InstanceNetworkAttachment}
   */
  public ServiceCall<InstanceNetworkAttachment> getInstanceNetworkAttachment(GetInstanceNetworkAttachmentOptions getInstanceNetworkAttachmentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getInstanceNetworkAttachmentOptions,
      "getInstanceNetworkAttachmentOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", getInstanceNetworkAttachmentOptions.instanceId());
    pathParamsMap.put("id", getInstanceNetworkAttachmentOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/network_attachments/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getInstanceNetworkAttachment");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<InstanceNetworkAttachment> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InstanceNetworkAttachment>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update an instance network attachment.
   *
   * This request updates an instance network attachment with the information provided in an instance network interface
   * patch object. The instance network attachment patch object is structured in the same way as a retrieved instance
   * network attachment and needs to contain only the information to be updated.
   *
   * @param updateInstanceNetworkAttachmentOptions the {@link UpdateInstanceNetworkAttachmentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InstanceNetworkAttachment}
   */
  public ServiceCall<InstanceNetworkAttachment> updateInstanceNetworkAttachment(UpdateInstanceNetworkAttachmentOptions updateInstanceNetworkAttachmentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateInstanceNetworkAttachmentOptions,
      "updateInstanceNetworkAttachmentOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", updateInstanceNetworkAttachmentOptions.instanceId());
    pathParamsMap.put("id", updateInstanceNetworkAttachmentOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/network_attachments/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateInstanceNetworkAttachment");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateInstanceNetworkAttachmentOptions.instanceNetworkAttachmentPatch()), "application/merge-patch+json");
    ResponseConverter<InstanceNetworkAttachment> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InstanceNetworkAttachment>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List network interfaces on an instance.
   *
   * This request lists network interfaces on an instance. An instance network interface is an abstract representation
   * of a network device and attaches an instance to a single subnet. Each network interface on an instance can attach
   * to any subnet in the zone, including subnets that are already attached to the instance. Multiple network interfaces
   * on the instance may also attach to the same subnet.
   *
   * If this instance has network attachments, each returned network interface is a [read-only
   * representation](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients) of its corresponding
   * network attachment and its attached virtual network interface.
   *
   * @param listInstanceNetworkInterfacesOptions the {@link ListInstanceNetworkInterfacesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link NetworkInterfaceUnpaginatedCollection}
   */
  public ServiceCall<NetworkInterfaceUnpaginatedCollection> listInstanceNetworkInterfaces(ListInstanceNetworkInterfacesOptions listInstanceNetworkInterfacesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listInstanceNetworkInterfacesOptions,
      "listInstanceNetworkInterfacesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", listInstanceNetworkInterfacesOptions.instanceId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/network_interfaces", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listInstanceNetworkInterfaces");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<NetworkInterfaceUnpaginatedCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<NetworkInterfaceUnpaginatedCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a network interface on an instance.
   *
   * This request creates a new instance network interface from an instance network interface prototype object. The
   * prototype object is structured in the same way as a retrieved instance network interface, and contains the
   * information necessary to create the new instance network interface. Any subnet in the instance's VPC may be
   * specified. Addresses on the instance network interface must be within the specified subnet's CIDR blocks.
   *
   * If this instance has network attachments, each network interface is a [read-only
   * representation](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients) of its corresponding
   * network attachment and its attached virtual network interface, and new network interfaces are not allowed to be
   * created.
   *
   * @param createInstanceNetworkInterfaceOptions the {@link CreateInstanceNetworkInterfaceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link NetworkInterface}
   */
  public ServiceCall<NetworkInterface> createInstanceNetworkInterface(CreateInstanceNetworkInterfaceOptions createInstanceNetworkInterfaceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createInstanceNetworkInterfaceOptions,
      "createInstanceNetworkInterfaceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", createInstanceNetworkInterfaceOptions.instanceId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/network_interfaces", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createInstanceNetworkInterface");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("subnet", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createInstanceNetworkInterfaceOptions.subnet()));
    if (createInstanceNetworkInterfaceOptions.allowIpSpoofing() != null) {
      contentJson.addProperty("allow_ip_spoofing", createInstanceNetworkInterfaceOptions.allowIpSpoofing());
    }
    if (createInstanceNetworkInterfaceOptions.name() != null) {
      contentJson.addProperty("name", createInstanceNetworkInterfaceOptions.name());
    }
    if (createInstanceNetworkInterfaceOptions.primaryIp() != null) {
      contentJson.add("primary_ip", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createInstanceNetworkInterfaceOptions.primaryIp()));
    }
    if (createInstanceNetworkInterfaceOptions.securityGroups() != null) {
      contentJson.add("security_groups", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createInstanceNetworkInterfaceOptions.securityGroups()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<NetworkInterface> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<NetworkInterface>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete an instance network interface.
   *
   * This request deletes an instance network interface. This operation cannot be reversed. Any floating IPs associated
   * with the instance network interface are implicitly disassociated. All flow log collectors with `auto_delete` set to
   * `true` targeting the instance network interface are automatically deleted. The primary instance network interface
   * is not allowed to be deleted.
   *
   * If this instance has network attachments, this network interface is a [read-only
   * representation](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients) of its corresponding
   * network attachment and its attached virtual network interface, and is not allowed to be deleted.
   *
   * @param deleteInstanceNetworkInterfaceOptions the {@link DeleteInstanceNetworkInterfaceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteInstanceNetworkInterface(DeleteInstanceNetworkInterfaceOptions deleteInstanceNetworkInterfaceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteInstanceNetworkInterfaceOptions,
      "deleteInstanceNetworkInterfaceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", deleteInstanceNetworkInterfaceOptions.instanceId());
    pathParamsMap.put("id", deleteInstanceNetworkInterfaceOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/network_interfaces/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteInstanceNetworkInterface");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve an instance network interface.
   *
   * This request retrieves a single instance network interface specified by the identifier in the URL.
   *
   * If this instance has network attachments, the retrieved network interface is a
   * [read-only representation](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients) of its
   * corresponding network attachment and its attached virtual network interface.
   *
   * @param getInstanceNetworkInterfaceOptions the {@link GetInstanceNetworkInterfaceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link NetworkInterface}
   */
  public ServiceCall<NetworkInterface> getInstanceNetworkInterface(GetInstanceNetworkInterfaceOptions getInstanceNetworkInterfaceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getInstanceNetworkInterfaceOptions,
      "getInstanceNetworkInterfaceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", getInstanceNetworkInterfaceOptions.instanceId());
    pathParamsMap.put("id", getInstanceNetworkInterfaceOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/network_interfaces/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getInstanceNetworkInterface");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<NetworkInterface> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<NetworkInterface>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update an instance network interface.
   *
   * This request updates an instance network interface with the information provided in an instance network interface
   * patch object. The instance network interface patch object is structured in the same way as a retrieved instance
   * network interface and needs to contain only the information to be updated.
   *
   * If this instance has network attachments, this network interface is a [read-only
   * representation](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients) of its corresponding
   * network attachment and its attached virtual network interface, and is not allowed to be updated.
   *
   * @param updateInstanceNetworkInterfaceOptions the {@link UpdateInstanceNetworkInterfaceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link NetworkInterface}
   */
  public ServiceCall<NetworkInterface> updateInstanceNetworkInterface(UpdateInstanceNetworkInterfaceOptions updateInstanceNetworkInterfaceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateInstanceNetworkInterfaceOptions,
      "updateInstanceNetworkInterfaceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", updateInstanceNetworkInterfaceOptions.instanceId());
    pathParamsMap.put("id", updateInstanceNetworkInterfaceOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/network_interfaces/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateInstanceNetworkInterface");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateInstanceNetworkInterfaceOptions.networkInterfacePatch()), "application/merge-patch+json");
    ResponseConverter<NetworkInterface> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<NetworkInterface>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List floating IPs associated with an instance network interface.
   *
   * This request lists floating IPs associated with an instance network interface.
   *
   * @param listInstanceNetworkInterfaceFloatingIpsOptions the {@link ListInstanceNetworkInterfaceFloatingIpsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link FloatingIPUnpaginatedCollection}
   */
  public ServiceCall<FloatingIPUnpaginatedCollection> listInstanceNetworkInterfaceFloatingIps(ListInstanceNetworkInterfaceFloatingIpsOptions listInstanceNetworkInterfaceFloatingIpsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listInstanceNetworkInterfaceFloatingIpsOptions,
      "listInstanceNetworkInterfaceFloatingIpsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", listInstanceNetworkInterfaceFloatingIpsOptions.instanceId());
    pathParamsMap.put("network_interface_id", listInstanceNetworkInterfaceFloatingIpsOptions.networkInterfaceId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/network_interfaces/{network_interface_id}/floating_ips", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listInstanceNetworkInterfaceFloatingIps");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<FloatingIPUnpaginatedCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<FloatingIPUnpaginatedCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Disassociate a floating IP from an instance network interface.
   *
   * This request disassociates the specified floating IP from the specified instance network interface.
   *
   * @param removeInstanceNetworkInterfaceFloatingIpOptions the {@link RemoveInstanceNetworkInterfaceFloatingIpOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> removeInstanceNetworkInterfaceFloatingIp(RemoveInstanceNetworkInterfaceFloatingIpOptions removeInstanceNetworkInterfaceFloatingIpOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(removeInstanceNetworkInterfaceFloatingIpOptions,
      "removeInstanceNetworkInterfaceFloatingIpOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", removeInstanceNetworkInterfaceFloatingIpOptions.instanceId());
    pathParamsMap.put("network_interface_id", removeInstanceNetworkInterfaceFloatingIpOptions.networkInterfaceId());
    pathParamsMap.put("id", removeInstanceNetworkInterfaceFloatingIpOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/network_interfaces/{network_interface_id}/floating_ips/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "removeInstanceNetworkInterfaceFloatingIp");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve associated floating IP.
   *
   * This request retrieves a specified floating IP address if it is associated with the instance network interface and
   * instance specified in the URL.
   *
   * @param getInstanceNetworkInterfaceFloatingIpOptions the {@link GetInstanceNetworkInterfaceFloatingIpOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link FloatingIP}
   */
  public ServiceCall<FloatingIP> getInstanceNetworkInterfaceFloatingIp(GetInstanceNetworkInterfaceFloatingIpOptions getInstanceNetworkInterfaceFloatingIpOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getInstanceNetworkInterfaceFloatingIpOptions,
      "getInstanceNetworkInterfaceFloatingIpOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", getInstanceNetworkInterfaceFloatingIpOptions.instanceId());
    pathParamsMap.put("network_interface_id", getInstanceNetworkInterfaceFloatingIpOptions.networkInterfaceId());
    pathParamsMap.put("id", getInstanceNetworkInterfaceFloatingIpOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/network_interfaces/{network_interface_id}/floating_ips/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getInstanceNetworkInterfaceFloatingIp");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<FloatingIP> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<FloatingIP>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Associate a floating IP with an instance network interface.
   *
   * This request associates the specified floating IP with the specified instance network interface, replacing any
   * existing association.
   *
   * The existing floating IP must:
   * - not be required by another resource, such as a public gateway
   * - be in the same `zone` as the instance
   *
   * A request body is not required, and if provided, is ignored.
   *
   * @param addInstanceNetworkInterfaceFloatingIpOptions the {@link AddInstanceNetworkInterfaceFloatingIpOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link FloatingIP}
   */
  public ServiceCall<FloatingIP> addInstanceNetworkInterfaceFloatingIp(AddInstanceNetworkInterfaceFloatingIpOptions addInstanceNetworkInterfaceFloatingIpOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(addInstanceNetworkInterfaceFloatingIpOptions,
      "addInstanceNetworkInterfaceFloatingIpOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", addInstanceNetworkInterfaceFloatingIpOptions.instanceId());
    pathParamsMap.put("network_interface_id", addInstanceNetworkInterfaceFloatingIpOptions.networkInterfaceId());
    pathParamsMap.put("id", addInstanceNetworkInterfaceFloatingIpOptions.id());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/network_interfaces/{network_interface_id}/floating_ips/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "addInstanceNetworkInterfaceFloatingIp");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<FloatingIP> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<FloatingIP>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List the primary reserved IP for an instance network interface.
   *
   * This request lists the primary reserved IP for an instance network interface.
   *
   * @param listInstanceNetworkInterfaceIpsOptions the {@link ListInstanceNetworkInterfaceIpsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ReservedIPCollectionInstanceNetworkInterfaceContext}
   * @deprecated this method is deprecated and may be removed in a future release
   */
   @Deprecated
  public ServiceCall<ReservedIPCollectionInstanceNetworkInterfaceContext> listInstanceNetworkInterfaceIps(ListInstanceNetworkInterfaceIpsOptions listInstanceNetworkInterfaceIpsOptions) {
    LOGGER.warning("A deprecated operation has been invoked: listInstanceNetworkInterfaceIps");
    com.ibm.cloud.sdk.core.util.Validator.notNull(listInstanceNetworkInterfaceIpsOptions,
      "listInstanceNetworkInterfaceIpsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", listInstanceNetworkInterfaceIpsOptions.instanceId());
    pathParamsMap.put("network_interface_id", listInstanceNetworkInterfaceIpsOptions.networkInterfaceId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/network_interfaces/{network_interface_id}/ips", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listInstanceNetworkInterfaceIps");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listInstanceNetworkInterfaceIpsOptions.start() != null) {
      builder.query("start", String.valueOf(listInstanceNetworkInterfaceIpsOptions.start()));
    }
    if (listInstanceNetworkInterfaceIpsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listInstanceNetworkInterfaceIpsOptions.limit()));
    }
    ResponseConverter<ReservedIPCollectionInstanceNetworkInterfaceContext> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ReservedIPCollectionInstanceNetworkInterfaceContext>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve the primary reserved IP.
   *
   * This request retrieves the primary reserved IP for an instance network interface.
   *
   * @param getInstanceNetworkInterfaceIpOptions the {@link GetInstanceNetworkInterfaceIpOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ReservedIP}
   * @deprecated this method is deprecated and may be removed in a future release
   */
   @Deprecated
  public ServiceCall<ReservedIP> getInstanceNetworkInterfaceIp(GetInstanceNetworkInterfaceIpOptions getInstanceNetworkInterfaceIpOptions) {
    LOGGER.warning("A deprecated operation has been invoked: getInstanceNetworkInterfaceIp");
    com.ibm.cloud.sdk.core.util.Validator.notNull(getInstanceNetworkInterfaceIpOptions,
      "getInstanceNetworkInterfaceIpOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", getInstanceNetworkInterfaceIpOptions.instanceId());
    pathParamsMap.put("network_interface_id", getInstanceNetworkInterfaceIpOptions.networkInterfaceId());
    pathParamsMap.put("id", getInstanceNetworkInterfaceIpOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/network_interfaces/{network_interface_id}/ips/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getInstanceNetworkInterfaceIp");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<ReservedIP> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ReservedIP>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List volumes attachments on an instance.
   *
   * This request lists volume attachments on an instance. A volume attachment connects a volume to an instance. Each
   * instance may have many volume attachments but each volume attachment connects exactly one instance to exactly one
   * volume.
   *
   * @param listInstanceVolumeAttachmentsOptions the {@link ListInstanceVolumeAttachmentsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VolumeAttachmentCollection}
   */
  public ServiceCall<VolumeAttachmentCollection> listInstanceVolumeAttachments(ListInstanceVolumeAttachmentsOptions listInstanceVolumeAttachmentsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listInstanceVolumeAttachmentsOptions,
      "listInstanceVolumeAttachmentsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", listInstanceVolumeAttachmentsOptions.instanceId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/volume_attachments", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listInstanceVolumeAttachments");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<VolumeAttachmentCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VolumeAttachmentCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a volume attachment on an instance.
   *
   * This request creates a new volume attachment from a volume attachment prototype object, connecting a volume to an
   * instance. For this request to succeed, the specified volume must not be busy. The prototype object is structured in
   * the same way as a retrieved volume attachment, and contains the information necessary to create the new volume
   * attachment.
   *
   * @param createInstanceVolumeAttachmentOptions the {@link CreateInstanceVolumeAttachmentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VolumeAttachment}
   */
  public ServiceCall<VolumeAttachment> createInstanceVolumeAttachment(CreateInstanceVolumeAttachmentOptions createInstanceVolumeAttachmentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createInstanceVolumeAttachmentOptions,
      "createInstanceVolumeAttachmentOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", createInstanceVolumeAttachmentOptions.instanceId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/volume_attachments", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createInstanceVolumeAttachment");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("volume", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createInstanceVolumeAttachmentOptions.volume()));
    if (createInstanceVolumeAttachmentOptions.deleteVolumeOnInstanceDelete() != null) {
      contentJson.addProperty("delete_volume_on_instance_delete", createInstanceVolumeAttachmentOptions.deleteVolumeOnInstanceDelete());
    }
    if (createInstanceVolumeAttachmentOptions.name() != null) {
      contentJson.addProperty("name", createInstanceVolumeAttachmentOptions.name());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<VolumeAttachment> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VolumeAttachment>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a volume attachment.
   *
   * This request deletes a volume attachment. This operation cannot be reversed, but a new volume attachment may
   * subsequently be created for the volume.  For this request to succeed, the volume must not be busy.
   *
   * @param deleteInstanceVolumeAttachmentOptions the {@link DeleteInstanceVolumeAttachmentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteInstanceVolumeAttachment(DeleteInstanceVolumeAttachmentOptions deleteInstanceVolumeAttachmentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteInstanceVolumeAttachmentOptions,
      "deleteInstanceVolumeAttachmentOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", deleteInstanceVolumeAttachmentOptions.instanceId());
    pathParamsMap.put("id", deleteInstanceVolumeAttachmentOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/volume_attachments/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteInstanceVolumeAttachment");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a volume attachment.
   *
   * This request retrieves a single volume attachment specified by the identifier in the URL.
   *
   * @param getInstanceVolumeAttachmentOptions the {@link GetInstanceVolumeAttachmentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VolumeAttachment}
   */
  public ServiceCall<VolumeAttachment> getInstanceVolumeAttachment(GetInstanceVolumeAttachmentOptions getInstanceVolumeAttachmentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getInstanceVolumeAttachmentOptions,
      "getInstanceVolumeAttachmentOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", getInstanceVolumeAttachmentOptions.instanceId());
    pathParamsMap.put("id", getInstanceVolumeAttachmentOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/volume_attachments/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getInstanceVolumeAttachment");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<VolumeAttachment> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VolumeAttachment>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a volume attachment.
   *
   * This request updates a volume attachment with the information provided in a volume attachment patch object. The
   * volume attachment patch object is structured in the same way as a retrieved volume attachment and needs to contain
   * only the information to be updated.
   *
   * @param updateInstanceVolumeAttachmentOptions the {@link UpdateInstanceVolumeAttachmentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VolumeAttachment}
   */
  public ServiceCall<VolumeAttachment> updateInstanceVolumeAttachment(UpdateInstanceVolumeAttachmentOptions updateInstanceVolumeAttachmentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateInstanceVolumeAttachmentOptions,
      "updateInstanceVolumeAttachmentOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", updateInstanceVolumeAttachmentOptions.instanceId());
    pathParamsMap.put("id", updateInstanceVolumeAttachmentOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/volume_attachments/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateInstanceVolumeAttachment");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateInstanceVolumeAttachmentOptions.volumeAttachmentPatch()), "application/merge-patch+json");
    ResponseConverter<VolumeAttachment> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VolumeAttachment>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List instance groups.
   *
   * This request lists instance groups in the region.
   *
   * @param listInstanceGroupsOptions the {@link ListInstanceGroupsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InstanceGroupCollection}
   */
  public ServiceCall<InstanceGroupCollection> listInstanceGroups(ListInstanceGroupsOptions listInstanceGroupsOptions) {
    if (listInstanceGroupsOptions == null) {
      listInstanceGroupsOptions = new ListInstanceGroupsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instance_groups"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listInstanceGroups");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listInstanceGroupsOptions.start() != null) {
      builder.query("start", String.valueOf(listInstanceGroupsOptions.start()));
    }
    if (listInstanceGroupsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listInstanceGroupsOptions.limit()));
    }
    ResponseConverter<InstanceGroupCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InstanceGroupCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List instance groups.
   *
   * This request lists instance groups in the region.
   *
   * @return a {@link ServiceCall} with a result of type {@link InstanceGroupCollection}
   */
  public ServiceCall<InstanceGroupCollection> listInstanceGroups() {
    return listInstanceGroups(null);
  }

  /**
   * Create an instance group.
   *
   * This request creates a new instance group.
   *
   * @param createInstanceGroupOptions the {@link CreateInstanceGroupOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InstanceGroup}
   */
  public ServiceCall<InstanceGroup> createInstanceGroup(CreateInstanceGroupOptions createInstanceGroupOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createInstanceGroupOptions,
      "createInstanceGroupOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instance_groups"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createInstanceGroup");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("instance_template", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createInstanceGroupOptions.instanceTemplate()));
    contentJson.add("subnets", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createInstanceGroupOptions.subnets()));
    if (createInstanceGroupOptions.applicationPort() != null) {
      contentJson.addProperty("application_port", createInstanceGroupOptions.applicationPort());
    }
    if (createInstanceGroupOptions.loadBalancer() != null) {
      contentJson.add("load_balancer", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createInstanceGroupOptions.loadBalancer()));
    }
    if (createInstanceGroupOptions.loadBalancerPool() != null) {
      contentJson.add("load_balancer_pool", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createInstanceGroupOptions.loadBalancerPool()));
    }
    if (createInstanceGroupOptions.membershipCount() != null) {
      contentJson.addProperty("membership_count", createInstanceGroupOptions.membershipCount());
    }
    if (createInstanceGroupOptions.name() != null) {
      contentJson.addProperty("name", createInstanceGroupOptions.name());
    }
    if (createInstanceGroupOptions.resourceGroup() != null) {
      contentJson.add("resource_group", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createInstanceGroupOptions.resourceGroup()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<InstanceGroup> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InstanceGroup>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete an instance group.
   *
   * This request deletes an instance group. This operation cannot be reversed. Any instances associated with the group
   * will be deleted.
   *
   * @param deleteInstanceGroupOptions the {@link DeleteInstanceGroupOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteInstanceGroup(DeleteInstanceGroupOptions deleteInstanceGroupOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteInstanceGroupOptions,
      "deleteInstanceGroupOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteInstanceGroupOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instance_groups/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteInstanceGroup");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve an instance group.
   *
   * This request retrieves a single instance group specified by identifier in the URL.
   *
   * @param getInstanceGroupOptions the {@link GetInstanceGroupOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InstanceGroup}
   */
  public ServiceCall<InstanceGroup> getInstanceGroup(GetInstanceGroupOptions getInstanceGroupOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getInstanceGroupOptions,
      "getInstanceGroupOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getInstanceGroupOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instance_groups/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getInstanceGroup");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<InstanceGroup> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InstanceGroup>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update an instance group.
   *
   * This request updates an instance group with the information provided instance group patch. The instance group patch
   * object is structured in the same way as a retrieved instance group and contains only the information to be updated.
   *
   * @param updateInstanceGroupOptions the {@link UpdateInstanceGroupOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InstanceGroup}
   */
  public ServiceCall<InstanceGroup> updateInstanceGroup(UpdateInstanceGroupOptions updateInstanceGroupOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateInstanceGroupOptions,
      "updateInstanceGroupOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateInstanceGroupOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instance_groups/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateInstanceGroup");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateInstanceGroupOptions.instanceGroupPatch()), "application/merge-patch+json");
    ResponseConverter<InstanceGroup> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InstanceGroup>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete an instance group load balancer.
   *
   * This request unbinds the instance group from the load balancer pool, and deletes the load balancer pool members.
   *
   * @param deleteInstanceGroupLoadBalancerOptions the {@link DeleteInstanceGroupLoadBalancerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteInstanceGroupLoadBalancer(DeleteInstanceGroupLoadBalancerOptions deleteInstanceGroupLoadBalancerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteInstanceGroupLoadBalancerOptions,
      "deleteInstanceGroupLoadBalancerOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_group_id", deleteInstanceGroupLoadBalancerOptions.instanceGroupId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instance_groups/{instance_group_id}/load_balancer", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteInstanceGroupLoadBalancer");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List managers for an instance group.
   *
   * This request lists managers for an instance group.
   *
   * @param listInstanceGroupManagersOptions the {@link ListInstanceGroupManagersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InstanceGroupManagerCollection}
   */
  public ServiceCall<InstanceGroupManagerCollection> listInstanceGroupManagers(ListInstanceGroupManagersOptions listInstanceGroupManagersOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listInstanceGroupManagersOptions,
      "listInstanceGroupManagersOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_group_id", listInstanceGroupManagersOptions.instanceGroupId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instance_groups/{instance_group_id}/managers", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listInstanceGroupManagers");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listInstanceGroupManagersOptions.start() != null) {
      builder.query("start", String.valueOf(listInstanceGroupManagersOptions.start()));
    }
    if (listInstanceGroupManagersOptions.limit() != null) {
      builder.query("limit", String.valueOf(listInstanceGroupManagersOptions.limit()));
    }
    ResponseConverter<InstanceGroupManagerCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InstanceGroupManagerCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a manager for an instance group.
   *
   * This request creates a new instance group manager.
   *
   * @param createInstanceGroupManagerOptions the {@link CreateInstanceGroupManagerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InstanceGroupManager}
   */
  public ServiceCall<InstanceGroupManager> createInstanceGroupManager(CreateInstanceGroupManagerOptions createInstanceGroupManagerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createInstanceGroupManagerOptions,
      "createInstanceGroupManagerOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_group_id", createInstanceGroupManagerOptions.instanceGroupId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instance_groups/{instance_group_id}/managers", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createInstanceGroupManager");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createInstanceGroupManagerOptions.instanceGroupManagerPrototype()), "application/json");
    ResponseConverter<InstanceGroupManager> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InstanceGroupManager>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete an instance group manager.
   *
   * This request deletes an instance group manager. This operation cannot be reversed.
   *
   * @param deleteInstanceGroupManagerOptions the {@link DeleteInstanceGroupManagerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteInstanceGroupManager(DeleteInstanceGroupManagerOptions deleteInstanceGroupManagerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteInstanceGroupManagerOptions,
      "deleteInstanceGroupManagerOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_group_id", deleteInstanceGroupManagerOptions.instanceGroupId());
    pathParamsMap.put("id", deleteInstanceGroupManagerOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instance_groups/{instance_group_id}/managers/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteInstanceGroupManager");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve an instance group manager.
   *
   * This request retrieves a single instance group manager specified by identifier in the URL.
   *
   * @param getInstanceGroupManagerOptions the {@link GetInstanceGroupManagerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InstanceGroupManager}
   */
  public ServiceCall<InstanceGroupManager> getInstanceGroupManager(GetInstanceGroupManagerOptions getInstanceGroupManagerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getInstanceGroupManagerOptions,
      "getInstanceGroupManagerOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_group_id", getInstanceGroupManagerOptions.instanceGroupId());
    pathParamsMap.put("id", getInstanceGroupManagerOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instance_groups/{instance_group_id}/managers/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getInstanceGroupManager");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<InstanceGroupManager> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InstanceGroupManager>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update an instance group manager.
   *
   * This request updates an instance group manager with the information provided instance group manager patch.
   *
   * @param updateInstanceGroupManagerOptions the {@link UpdateInstanceGroupManagerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InstanceGroupManager}
   */
  public ServiceCall<InstanceGroupManager> updateInstanceGroupManager(UpdateInstanceGroupManagerOptions updateInstanceGroupManagerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateInstanceGroupManagerOptions,
      "updateInstanceGroupManagerOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_group_id", updateInstanceGroupManagerOptions.instanceGroupId());
    pathParamsMap.put("id", updateInstanceGroupManagerOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instance_groups/{instance_group_id}/managers/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateInstanceGroupManager");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateInstanceGroupManagerOptions.instanceGroupManagerPatch()), "application/merge-patch+json");
    ResponseConverter<InstanceGroupManager> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InstanceGroupManager>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List actions for an instance group manager.
   *
   * This request lists instance group actions for an instance group manager.
   *
   * @param listInstanceGroupManagerActionsOptions the {@link ListInstanceGroupManagerActionsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InstanceGroupManagerActionsCollection}
   */
  public ServiceCall<InstanceGroupManagerActionsCollection> listInstanceGroupManagerActions(ListInstanceGroupManagerActionsOptions listInstanceGroupManagerActionsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listInstanceGroupManagerActionsOptions,
      "listInstanceGroupManagerActionsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_group_id", listInstanceGroupManagerActionsOptions.instanceGroupId());
    pathParamsMap.put("instance_group_manager_id", listInstanceGroupManagerActionsOptions.instanceGroupManagerId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instance_groups/{instance_group_id}/managers/{instance_group_manager_id}/actions", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listInstanceGroupManagerActions");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listInstanceGroupManagerActionsOptions.start() != null) {
      builder.query("start", String.valueOf(listInstanceGroupManagerActionsOptions.start()));
    }
    if (listInstanceGroupManagerActionsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listInstanceGroupManagerActionsOptions.limit()));
    }
    ResponseConverter<InstanceGroupManagerActionsCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InstanceGroupManagerActionsCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create an instance group manager action.
   *
   * This request creates a new instance group manager action.
   *
   * @param createInstanceGroupManagerActionOptions the {@link CreateInstanceGroupManagerActionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InstanceGroupManagerAction}
   */
  public ServiceCall<InstanceGroupManagerAction> createInstanceGroupManagerAction(CreateInstanceGroupManagerActionOptions createInstanceGroupManagerActionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createInstanceGroupManagerActionOptions,
      "createInstanceGroupManagerActionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_group_id", createInstanceGroupManagerActionOptions.instanceGroupId());
    pathParamsMap.put("instance_group_manager_id", createInstanceGroupManagerActionOptions.instanceGroupManagerId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instance_groups/{instance_group_id}/managers/{instance_group_manager_id}/actions", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createInstanceGroupManagerAction");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createInstanceGroupManagerActionOptions.instanceGroupManagerActionPrototype()), "application/json");
    ResponseConverter<InstanceGroupManagerAction> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InstanceGroupManagerAction>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete specified instance group manager action.
   *
   * This request deletes an instance group manager action. This operation cannot be reversed.
   *
   * @param deleteInstanceGroupManagerActionOptions the {@link DeleteInstanceGroupManagerActionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteInstanceGroupManagerAction(DeleteInstanceGroupManagerActionOptions deleteInstanceGroupManagerActionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteInstanceGroupManagerActionOptions,
      "deleteInstanceGroupManagerActionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_group_id", deleteInstanceGroupManagerActionOptions.instanceGroupId());
    pathParamsMap.put("instance_group_manager_id", deleteInstanceGroupManagerActionOptions.instanceGroupManagerId());
    pathParamsMap.put("id", deleteInstanceGroupManagerActionOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instance_groups/{instance_group_id}/managers/{instance_group_manager_id}/actions/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteInstanceGroupManagerAction");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve specified instance group manager action.
   *
   * This request retrieves a single instance group manager action specified by identifier in the URL.
   *
   * @param getInstanceGroupManagerActionOptions the {@link GetInstanceGroupManagerActionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InstanceGroupManagerAction}
   */
  public ServiceCall<InstanceGroupManagerAction> getInstanceGroupManagerAction(GetInstanceGroupManagerActionOptions getInstanceGroupManagerActionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getInstanceGroupManagerActionOptions,
      "getInstanceGroupManagerActionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_group_id", getInstanceGroupManagerActionOptions.instanceGroupId());
    pathParamsMap.put("instance_group_manager_id", getInstanceGroupManagerActionOptions.instanceGroupManagerId());
    pathParamsMap.put("id", getInstanceGroupManagerActionOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instance_groups/{instance_group_id}/managers/{instance_group_manager_id}/actions/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getInstanceGroupManagerAction");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<InstanceGroupManagerAction> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InstanceGroupManagerAction>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update specified instance group manager action.
   *
   * This request updates an instance group manager action.
   *
   * @param updateInstanceGroupManagerActionOptions the {@link UpdateInstanceGroupManagerActionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InstanceGroupManagerAction}
   */
  public ServiceCall<InstanceGroupManagerAction> updateInstanceGroupManagerAction(UpdateInstanceGroupManagerActionOptions updateInstanceGroupManagerActionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateInstanceGroupManagerActionOptions,
      "updateInstanceGroupManagerActionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_group_id", updateInstanceGroupManagerActionOptions.instanceGroupId());
    pathParamsMap.put("instance_group_manager_id", updateInstanceGroupManagerActionOptions.instanceGroupManagerId());
    pathParamsMap.put("id", updateInstanceGroupManagerActionOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instance_groups/{instance_group_id}/managers/{instance_group_manager_id}/actions/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateInstanceGroupManagerAction");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateInstanceGroupManagerActionOptions.instanceGroupManagerActionPatch()), "application/merge-patch+json");
    ResponseConverter<InstanceGroupManagerAction> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InstanceGroupManagerAction>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List policies for an instance group manager.
   *
   * This request lists policies for an instance group manager.
   *
   * @param listInstanceGroupManagerPoliciesOptions the {@link ListInstanceGroupManagerPoliciesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InstanceGroupManagerPolicyCollection}
   */
  public ServiceCall<InstanceGroupManagerPolicyCollection> listInstanceGroupManagerPolicies(ListInstanceGroupManagerPoliciesOptions listInstanceGroupManagerPoliciesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listInstanceGroupManagerPoliciesOptions,
      "listInstanceGroupManagerPoliciesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_group_id", listInstanceGroupManagerPoliciesOptions.instanceGroupId());
    pathParamsMap.put("instance_group_manager_id", listInstanceGroupManagerPoliciesOptions.instanceGroupManagerId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instance_groups/{instance_group_id}/managers/{instance_group_manager_id}/policies", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listInstanceGroupManagerPolicies");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listInstanceGroupManagerPoliciesOptions.start() != null) {
      builder.query("start", String.valueOf(listInstanceGroupManagerPoliciesOptions.start()));
    }
    if (listInstanceGroupManagerPoliciesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listInstanceGroupManagerPoliciesOptions.limit()));
    }
    ResponseConverter<InstanceGroupManagerPolicyCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InstanceGroupManagerPolicyCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a policy for an instance group manager.
   *
   * This request creates a new instance group manager policy.
   *
   * @param createInstanceGroupManagerPolicyOptions the {@link CreateInstanceGroupManagerPolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InstanceGroupManagerPolicy}
   */
  public ServiceCall<InstanceGroupManagerPolicy> createInstanceGroupManagerPolicy(CreateInstanceGroupManagerPolicyOptions createInstanceGroupManagerPolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createInstanceGroupManagerPolicyOptions,
      "createInstanceGroupManagerPolicyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_group_id", createInstanceGroupManagerPolicyOptions.instanceGroupId());
    pathParamsMap.put("instance_group_manager_id", createInstanceGroupManagerPolicyOptions.instanceGroupManagerId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instance_groups/{instance_group_id}/managers/{instance_group_manager_id}/policies", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createInstanceGroupManagerPolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createInstanceGroupManagerPolicyOptions.instanceGroupManagerPolicyPrototype()), "application/json");
    ResponseConverter<InstanceGroupManagerPolicy> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InstanceGroupManagerPolicy>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete an instance group manager policy.
   *
   * This request deletes an instance group manager policy. This operation cannot be reversed.
   *
   * @param deleteInstanceGroupManagerPolicyOptions the {@link DeleteInstanceGroupManagerPolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteInstanceGroupManagerPolicy(DeleteInstanceGroupManagerPolicyOptions deleteInstanceGroupManagerPolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteInstanceGroupManagerPolicyOptions,
      "deleteInstanceGroupManagerPolicyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_group_id", deleteInstanceGroupManagerPolicyOptions.instanceGroupId());
    pathParamsMap.put("instance_group_manager_id", deleteInstanceGroupManagerPolicyOptions.instanceGroupManagerId());
    pathParamsMap.put("id", deleteInstanceGroupManagerPolicyOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instance_groups/{instance_group_id}/managers/{instance_group_manager_id}/policies/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteInstanceGroupManagerPolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve an instance group manager policy.
   *
   * This request retrieves a single instance group manager policy specified by identifier in the URL.
   *
   * @param getInstanceGroupManagerPolicyOptions the {@link GetInstanceGroupManagerPolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InstanceGroupManagerPolicy}
   */
  public ServiceCall<InstanceGroupManagerPolicy> getInstanceGroupManagerPolicy(GetInstanceGroupManagerPolicyOptions getInstanceGroupManagerPolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getInstanceGroupManagerPolicyOptions,
      "getInstanceGroupManagerPolicyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_group_id", getInstanceGroupManagerPolicyOptions.instanceGroupId());
    pathParamsMap.put("instance_group_manager_id", getInstanceGroupManagerPolicyOptions.instanceGroupManagerId());
    pathParamsMap.put("id", getInstanceGroupManagerPolicyOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instance_groups/{instance_group_id}/managers/{instance_group_manager_id}/policies/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getInstanceGroupManagerPolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<InstanceGroupManagerPolicy> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InstanceGroupManagerPolicy>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update an instance group manager policy.
   *
   * This request updates an instance group manager policy.
   *
   * @param updateInstanceGroupManagerPolicyOptions the {@link UpdateInstanceGroupManagerPolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InstanceGroupManagerPolicy}
   */
  public ServiceCall<InstanceGroupManagerPolicy> updateInstanceGroupManagerPolicy(UpdateInstanceGroupManagerPolicyOptions updateInstanceGroupManagerPolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateInstanceGroupManagerPolicyOptions,
      "updateInstanceGroupManagerPolicyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_group_id", updateInstanceGroupManagerPolicyOptions.instanceGroupId());
    pathParamsMap.put("instance_group_manager_id", updateInstanceGroupManagerPolicyOptions.instanceGroupManagerId());
    pathParamsMap.put("id", updateInstanceGroupManagerPolicyOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instance_groups/{instance_group_id}/managers/{instance_group_manager_id}/policies/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateInstanceGroupManagerPolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateInstanceGroupManagerPolicyOptions.instanceGroupManagerPolicyPatch()), "application/merge-patch+json");
    ResponseConverter<InstanceGroupManagerPolicy> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InstanceGroupManagerPolicy>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete memberships from an instance group.
   *
   * This request deletes memberships of an instance group. This operation cannot be reversed. Memberships that have
   * `delete_instance_on_membership_delete` set to `true` will also have their instances deleted.
   *
   * @param deleteInstanceGroupMembershipsOptions the {@link DeleteInstanceGroupMembershipsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteInstanceGroupMemberships(DeleteInstanceGroupMembershipsOptions deleteInstanceGroupMembershipsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteInstanceGroupMembershipsOptions,
      "deleteInstanceGroupMembershipsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_group_id", deleteInstanceGroupMembershipsOptions.instanceGroupId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instance_groups/{instance_group_id}/memberships", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteInstanceGroupMemberships");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List memberships for an instance group.
   *
   * This request lists instance group memberships for an instance group.
   *
   * @param listInstanceGroupMembershipsOptions the {@link ListInstanceGroupMembershipsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InstanceGroupMembershipCollection}
   */
  public ServiceCall<InstanceGroupMembershipCollection> listInstanceGroupMemberships(ListInstanceGroupMembershipsOptions listInstanceGroupMembershipsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listInstanceGroupMembershipsOptions,
      "listInstanceGroupMembershipsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_group_id", listInstanceGroupMembershipsOptions.instanceGroupId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instance_groups/{instance_group_id}/memberships", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listInstanceGroupMemberships");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listInstanceGroupMembershipsOptions.start() != null) {
      builder.query("start", String.valueOf(listInstanceGroupMembershipsOptions.start()));
    }
    if (listInstanceGroupMembershipsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listInstanceGroupMembershipsOptions.limit()));
    }
    ResponseConverter<InstanceGroupMembershipCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InstanceGroupMembershipCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete an instance group membership.
   *
   * This request deletes a memberships of an instance group. This operation cannot be reversed. reversed. If the
   * membership has `delete_instance_on_membership_delete` set to `true`, the instance will also be deleted.
   *
   * @param deleteInstanceGroupMembershipOptions the {@link DeleteInstanceGroupMembershipOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteInstanceGroupMembership(DeleteInstanceGroupMembershipOptions deleteInstanceGroupMembershipOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteInstanceGroupMembershipOptions,
      "deleteInstanceGroupMembershipOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_group_id", deleteInstanceGroupMembershipOptions.instanceGroupId());
    pathParamsMap.put("id", deleteInstanceGroupMembershipOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instance_groups/{instance_group_id}/memberships/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteInstanceGroupMembership");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve an instance group membership.
   *
   * This request retrieves a single instance group membership specified by identifier in the URL.
   *
   * @param getInstanceGroupMembershipOptions the {@link GetInstanceGroupMembershipOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InstanceGroupMembership}
   */
  public ServiceCall<InstanceGroupMembership> getInstanceGroupMembership(GetInstanceGroupMembershipOptions getInstanceGroupMembershipOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getInstanceGroupMembershipOptions,
      "getInstanceGroupMembershipOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_group_id", getInstanceGroupMembershipOptions.instanceGroupId());
    pathParamsMap.put("id", getInstanceGroupMembershipOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instance_groups/{instance_group_id}/memberships/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getInstanceGroupMembership");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<InstanceGroupMembership> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InstanceGroupMembership>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update an instance group membership.
   *
   * This request updates an instance group membership with the information provided instance group membership patch.
   *
   * @param updateInstanceGroupMembershipOptions the {@link UpdateInstanceGroupMembershipOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InstanceGroupMembership}
   */
  public ServiceCall<InstanceGroupMembership> updateInstanceGroupMembership(UpdateInstanceGroupMembershipOptions updateInstanceGroupMembershipOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateInstanceGroupMembershipOptions,
      "updateInstanceGroupMembershipOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_group_id", updateInstanceGroupMembershipOptions.instanceGroupId());
    pathParamsMap.put("id", updateInstanceGroupMembershipOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instance_groups/{instance_group_id}/memberships/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateInstanceGroupMembership");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateInstanceGroupMembershipOptions.instanceGroupMembershipPatch()), "application/merge-patch+json");
    ResponseConverter<InstanceGroupMembership> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InstanceGroupMembership>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List reservations.
   *
   * This request lists reservations in the region. A reservation provides reserved capacity for a specified profile in
   * a specified zone. A reservation can also include a long-term committed use discount.
   *
   * The reservations will be sorted by their `created_at` property values, with newest reservations first. Reservations
   * with identical `created_at` property values will in turn be sorted by ascending `name` property values.
   *
   * @param listReservationsOptions the {@link ListReservationsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ReservationCollection}
   */
  public ServiceCall<ReservationCollection> listReservations(ListReservationsOptions listReservationsOptions) {
    if (listReservationsOptions == null) {
      listReservationsOptions = new ListReservationsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/reservations"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listReservations");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listReservationsOptions.start() != null) {
      builder.query("start", String.valueOf(listReservationsOptions.start()));
    }
    if (listReservationsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listReservationsOptions.limit()));
    }
    if (listReservationsOptions.name() != null) {
      builder.query("name", String.valueOf(listReservationsOptions.name()));
    }
    if (listReservationsOptions.profileResourceType() != null) {
      builder.query("profile.resource_type", String.valueOf(listReservationsOptions.profileResourceType()));
    }
    if (listReservationsOptions.affinityPolicy() != null) {
      builder.query("affinity_policy", String.valueOf(listReservationsOptions.affinityPolicy()));
    }
    if (listReservationsOptions.resourceGroupId() != null) {
      builder.query("resource_group.id", String.valueOf(listReservationsOptions.resourceGroupId()));
    }
    if (listReservationsOptions.zoneName() != null) {
      builder.query("zone.name", String.valueOf(listReservationsOptions.zoneName()));
    }
    ResponseConverter<ReservationCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ReservationCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List reservations.
   *
   * This request lists reservations in the region. A reservation provides reserved capacity for a specified profile in
   * a specified zone. A reservation can also include a long-term committed use discount.
   *
   * The reservations will be sorted by their `created_at` property values, with newest reservations first. Reservations
   * with identical `created_at` property values will in turn be sorted by ascending `name` property values.
   *
   * @return a {@link ServiceCall} with a result of type {@link ReservationCollection}
   */
  public ServiceCall<ReservationCollection> listReservations() {
    return listReservations(null);
  }

  /**
   * Create a reservation.
   *
   * This request creates a new reservation from a reservation prototype object. The prototype object is structured in
   * the same way as a retrieved reservation, and contains the information necessary to create the new reservation.
   *
   * @param createReservationOptions the {@link CreateReservationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Reservation}
   */
  public ServiceCall<Reservation> createReservation(CreateReservationOptions createReservationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createReservationOptions,
      "createReservationOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/reservations"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createReservation");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("capacity", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createReservationOptions.capacity()));
    contentJson.add("committed_use", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createReservationOptions.committedUse()));
    contentJson.add("profile", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createReservationOptions.profile()));
    contentJson.add("zone", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createReservationOptions.zone()));
    if (createReservationOptions.affinityPolicy() != null) {
      contentJson.addProperty("affinity_policy", createReservationOptions.affinityPolicy());
    }
    if (createReservationOptions.name() != null) {
      contentJson.addProperty("name", createReservationOptions.name());
    }
    if (createReservationOptions.resourceGroup() != null) {
      contentJson.add("resource_group", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createReservationOptions.resourceGroup()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Reservation> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Reservation>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a reservation.
   *
   * This request deletes a reservation. This operation cannot be reversed. Reservations with a `status` of `active` are
   * not allowed to be deleted.
   *
   * @param deleteReservationOptions the {@link DeleteReservationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Reservation}
   */
  public ServiceCall<Reservation> deleteReservation(DeleteReservationOptions deleteReservationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteReservationOptions,
      "deleteReservationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteReservationOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/reservations/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteReservation");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Reservation> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Reservation>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a reservation.
   *
   * This request retrieves a single reservation specified by identifier in the URL.
   *
   * @param getReservationOptions the {@link GetReservationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Reservation}
   */
  public ServiceCall<Reservation> getReservation(GetReservationOptions getReservationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getReservationOptions,
      "getReservationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getReservationOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/reservations/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getReservation");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Reservation> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Reservation>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a reservation.
   *
   * This request updates a reservation with the information provided in a reservation patch object. The patch object is
   * structured in the same way as a retrieved reservation and needs to contain only the information to be updated.
   *
   * @param updateReservationOptions the {@link UpdateReservationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Reservation}
   */
  public ServiceCall<Reservation> updateReservation(UpdateReservationOptions updateReservationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateReservationOptions,
      "updateReservationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateReservationOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/reservations/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateReservation");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateReservationOptions.reservationPatch()), "application/merge-patch+json");
    ResponseConverter<Reservation> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Reservation>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Activate a reservation.
   *
   * This request activates a reservation. For this request to succeed, the reservation status must be `inactive`.
   *
   * @param activateReservationOptions the {@link ActivateReservationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> activateReservation(ActivateReservationOptions activateReservationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(activateReservationOptions,
      "activateReservationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", activateReservationOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/reservations/{id}/activate", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "activateReservation");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List dedicated host groups.
   *
   * This request lists dedicated host groups in the region. Each dedicated host must belong to exactly one group, which
   * controls placement of instances. Dedicated host groups do not span zones.
   *
   * @param listDedicatedHostGroupsOptions the {@link ListDedicatedHostGroupsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DedicatedHostGroupCollection}
   */
  public ServiceCall<DedicatedHostGroupCollection> listDedicatedHostGroups(ListDedicatedHostGroupsOptions listDedicatedHostGroupsOptions) {
    if (listDedicatedHostGroupsOptions == null) {
      listDedicatedHostGroupsOptions = new ListDedicatedHostGroupsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/dedicated_host/groups"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listDedicatedHostGroups");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listDedicatedHostGroupsOptions.start() != null) {
      builder.query("start", String.valueOf(listDedicatedHostGroupsOptions.start()));
    }
    if (listDedicatedHostGroupsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listDedicatedHostGroupsOptions.limit()));
    }
    if (listDedicatedHostGroupsOptions.resourceGroupId() != null) {
      builder.query("resource_group.id", String.valueOf(listDedicatedHostGroupsOptions.resourceGroupId()));
    }
    if (listDedicatedHostGroupsOptions.zoneName() != null) {
      builder.query("zone.name", String.valueOf(listDedicatedHostGroupsOptions.zoneName()));
    }
    if (listDedicatedHostGroupsOptions.name() != null) {
      builder.query("name", String.valueOf(listDedicatedHostGroupsOptions.name()));
    }
    ResponseConverter<DedicatedHostGroupCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DedicatedHostGroupCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List dedicated host groups.
   *
   * This request lists dedicated host groups in the region. Each dedicated host must belong to exactly one group, which
   * controls placement of instances. Dedicated host groups do not span zones.
   *
   * @return a {@link ServiceCall} with a result of type {@link DedicatedHostGroupCollection}
   */
  public ServiceCall<DedicatedHostGroupCollection> listDedicatedHostGroups() {
    return listDedicatedHostGroups(null);
  }

  /**
   * Create a dedicated host group.
   *
   * This request creates a new dedicated host group.
   *
   * @param createDedicatedHostGroupOptions the {@link CreateDedicatedHostGroupOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DedicatedHostGroup}
   */
  public ServiceCall<DedicatedHostGroup> createDedicatedHostGroup(CreateDedicatedHostGroupOptions createDedicatedHostGroupOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createDedicatedHostGroupOptions,
      "createDedicatedHostGroupOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/dedicated_host/groups"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createDedicatedHostGroup");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("class", createDedicatedHostGroupOptions.xClass());
    contentJson.addProperty("family", createDedicatedHostGroupOptions.family());
    contentJson.add("zone", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDedicatedHostGroupOptions.zone()));
    if (createDedicatedHostGroupOptions.name() != null) {
      contentJson.addProperty("name", createDedicatedHostGroupOptions.name());
    }
    if (createDedicatedHostGroupOptions.resourceGroup() != null) {
      contentJson.add("resource_group", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDedicatedHostGroupOptions.resourceGroup()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<DedicatedHostGroup> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DedicatedHostGroup>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a dedicated host group.
   *
   * This request deletes a dedicated host group.
   *
   * @param deleteDedicatedHostGroupOptions the {@link DeleteDedicatedHostGroupOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteDedicatedHostGroup(DeleteDedicatedHostGroupOptions deleteDedicatedHostGroupOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteDedicatedHostGroupOptions,
      "deleteDedicatedHostGroupOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteDedicatedHostGroupOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/dedicated_host/groups/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteDedicatedHostGroup");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a dedicated host group.
   *
   * This request retrieves a single dedicated host group specified by the identifier in the URL.
   *
   * @param getDedicatedHostGroupOptions the {@link GetDedicatedHostGroupOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DedicatedHostGroup}
   */
  public ServiceCall<DedicatedHostGroup> getDedicatedHostGroup(GetDedicatedHostGroupOptions getDedicatedHostGroupOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDedicatedHostGroupOptions,
      "getDedicatedHostGroupOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getDedicatedHostGroupOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/dedicated_host/groups/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getDedicatedHostGroup");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<DedicatedHostGroup> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DedicatedHostGroup>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a dedicated host group.
   *
   * This request updates a dedicated host group with the information in a provided dedicated host group patch. The
   * dedicated host group patch object is structured in the same way as a retrieved dedicated host group and contains
   * only the information to be updated.
   *
   * @param updateDedicatedHostGroupOptions the {@link UpdateDedicatedHostGroupOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DedicatedHostGroup}
   */
  public ServiceCall<DedicatedHostGroup> updateDedicatedHostGroup(UpdateDedicatedHostGroupOptions updateDedicatedHostGroupOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateDedicatedHostGroupOptions,
      "updateDedicatedHostGroupOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateDedicatedHostGroupOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/dedicated_host/groups/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateDedicatedHostGroup");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateDedicatedHostGroupOptions.dedicatedHostGroupPatch()), "application/merge-patch+json");
    ResponseConverter<DedicatedHostGroup> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DedicatedHostGroup>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List dedicated host profiles.
   *
   * This request lists provisionable [dedicated host profiles](https://cloud.ibm.com/docs/vpc?topic=vpc-dh-profiles) in
   * the region. A dedicated host profile specifies the hardware characteristics for a dedicated host.
   *
   * @param listDedicatedHostProfilesOptions the {@link ListDedicatedHostProfilesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DedicatedHostProfileCollection}
   */
  public ServiceCall<DedicatedHostProfileCollection> listDedicatedHostProfiles(ListDedicatedHostProfilesOptions listDedicatedHostProfilesOptions) {
    if (listDedicatedHostProfilesOptions == null) {
      listDedicatedHostProfilesOptions = new ListDedicatedHostProfilesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/dedicated_host/profiles"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listDedicatedHostProfiles");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listDedicatedHostProfilesOptions.start() != null) {
      builder.query("start", String.valueOf(listDedicatedHostProfilesOptions.start()));
    }
    if (listDedicatedHostProfilesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listDedicatedHostProfilesOptions.limit()));
    }
    ResponseConverter<DedicatedHostProfileCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DedicatedHostProfileCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List dedicated host profiles.
   *
   * This request lists provisionable [dedicated host profiles](https://cloud.ibm.com/docs/vpc?topic=vpc-dh-profiles) in
   * the region. A dedicated host profile specifies the hardware characteristics for a dedicated host.
   *
   * @return a {@link ServiceCall} with a result of type {@link DedicatedHostProfileCollection}
   */
  public ServiceCall<DedicatedHostProfileCollection> listDedicatedHostProfiles() {
    return listDedicatedHostProfiles(null);
  }

  /**
   * Retrieve a dedicated host profile.
   *
   * This request retrieves a single dedicated host profile specified by the name in the URL.
   *
   * @param getDedicatedHostProfileOptions the {@link GetDedicatedHostProfileOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DedicatedHostProfile}
   */
  public ServiceCall<DedicatedHostProfile> getDedicatedHostProfile(GetDedicatedHostProfileOptions getDedicatedHostProfileOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDedicatedHostProfileOptions,
      "getDedicatedHostProfileOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("name", getDedicatedHostProfileOptions.name());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/dedicated_host/profiles/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getDedicatedHostProfile");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<DedicatedHostProfile> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DedicatedHostProfile>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List dedicated hosts.
   *
   * This request lists dedicated hosts in the region.
   *
   * @param listDedicatedHostsOptions the {@link ListDedicatedHostsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DedicatedHostCollection}
   */
  public ServiceCall<DedicatedHostCollection> listDedicatedHosts(ListDedicatedHostsOptions listDedicatedHostsOptions) {
    if (listDedicatedHostsOptions == null) {
      listDedicatedHostsOptions = new ListDedicatedHostsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/dedicated_hosts"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listDedicatedHosts");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listDedicatedHostsOptions.dedicatedHostGroupId() != null) {
      builder.query("dedicated_host_group.id", String.valueOf(listDedicatedHostsOptions.dedicatedHostGroupId()));
    }
    if (listDedicatedHostsOptions.start() != null) {
      builder.query("start", String.valueOf(listDedicatedHostsOptions.start()));
    }
    if (listDedicatedHostsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listDedicatedHostsOptions.limit()));
    }
    if (listDedicatedHostsOptions.resourceGroupId() != null) {
      builder.query("resource_group.id", String.valueOf(listDedicatedHostsOptions.resourceGroupId()));
    }
    if (listDedicatedHostsOptions.zoneName() != null) {
      builder.query("zone.name", String.valueOf(listDedicatedHostsOptions.zoneName()));
    }
    if (listDedicatedHostsOptions.name() != null) {
      builder.query("name", String.valueOf(listDedicatedHostsOptions.name()));
    }
    ResponseConverter<DedicatedHostCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DedicatedHostCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List dedicated hosts.
   *
   * This request lists dedicated hosts in the region.
   *
   * @return a {@link ServiceCall} with a result of type {@link DedicatedHostCollection}
   */
  public ServiceCall<DedicatedHostCollection> listDedicatedHosts() {
    return listDedicatedHosts(null);
  }

  /**
   * Create a dedicated host.
   *
   * This request creates a new dedicated host.
   *
   * @param createDedicatedHostOptions the {@link CreateDedicatedHostOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DedicatedHost}
   */
  public ServiceCall<DedicatedHost> createDedicatedHost(CreateDedicatedHostOptions createDedicatedHostOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createDedicatedHostOptions,
      "createDedicatedHostOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/dedicated_hosts"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createDedicatedHost");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createDedicatedHostOptions.dedicatedHostPrototype()), "application/json");
    ResponseConverter<DedicatedHost> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DedicatedHost>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List disks on a dedicated host.
   *
   * This request lists disks on a dedicated host.  A disk is a physical device that is locally attached to the compute
   * node. By default, the listed disks are sorted by their
   * `created_at` property values, with the newest disk first.
   *
   * @param listDedicatedHostDisksOptions the {@link ListDedicatedHostDisksOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DedicatedHostDiskCollection}
   */
  public ServiceCall<DedicatedHostDiskCollection> listDedicatedHostDisks(ListDedicatedHostDisksOptions listDedicatedHostDisksOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listDedicatedHostDisksOptions,
      "listDedicatedHostDisksOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("dedicated_host_id", listDedicatedHostDisksOptions.dedicatedHostId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/dedicated_hosts/{dedicated_host_id}/disks", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listDedicatedHostDisks");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<DedicatedHostDiskCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DedicatedHostDiskCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a dedicated host disk.
   *
   * This request retrieves a single dedicated host disk specified by the identifier in the URL.
   *
   * @param getDedicatedHostDiskOptions the {@link GetDedicatedHostDiskOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DedicatedHostDisk}
   */
  public ServiceCall<DedicatedHostDisk> getDedicatedHostDisk(GetDedicatedHostDiskOptions getDedicatedHostDiskOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDedicatedHostDiskOptions,
      "getDedicatedHostDiskOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("dedicated_host_id", getDedicatedHostDiskOptions.dedicatedHostId());
    pathParamsMap.put("id", getDedicatedHostDiskOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/dedicated_hosts/{dedicated_host_id}/disks/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getDedicatedHostDisk");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<DedicatedHostDisk> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DedicatedHostDisk>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a dedicated host disk.
   *
   * This request updates the dedicated host disk with the information in a provided patch.
   *
   * @param updateDedicatedHostDiskOptions the {@link UpdateDedicatedHostDiskOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DedicatedHostDisk}
   */
  public ServiceCall<DedicatedHostDisk> updateDedicatedHostDisk(UpdateDedicatedHostDiskOptions updateDedicatedHostDiskOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateDedicatedHostDiskOptions,
      "updateDedicatedHostDiskOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("dedicated_host_id", updateDedicatedHostDiskOptions.dedicatedHostId());
    pathParamsMap.put("id", updateDedicatedHostDiskOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/dedicated_hosts/{dedicated_host_id}/disks/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateDedicatedHostDisk");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateDedicatedHostDiskOptions.dedicatedHostDiskPatch()), "application/merge-patch+json");
    ResponseConverter<DedicatedHostDisk> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DedicatedHostDisk>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a dedicated host.
   *
   * This request deletes a dedicated host. This operation cannot be reversed. For this request to succeed, `instances`
   * must be empty and `instance_placement_enabled` must be `false`.
   *
   * @param deleteDedicatedHostOptions the {@link DeleteDedicatedHostOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteDedicatedHost(DeleteDedicatedHostOptions deleteDedicatedHostOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteDedicatedHostOptions,
      "deleteDedicatedHostOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteDedicatedHostOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/dedicated_hosts/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteDedicatedHost");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a dedicated host.
   *
   * This request retrieves a single dedicated host specified by the identifiers in the URL.
   *
   * @param getDedicatedHostOptions the {@link GetDedicatedHostOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DedicatedHost}
   */
  public ServiceCall<DedicatedHost> getDedicatedHost(GetDedicatedHostOptions getDedicatedHostOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDedicatedHostOptions,
      "getDedicatedHostOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getDedicatedHostOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/dedicated_hosts/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getDedicatedHost");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<DedicatedHost> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DedicatedHost>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a dedicated host.
   *
   * This request updates a dedicated host with the information in a provided dedicated host patch. The dedicated host
   * patch object is structured in the same way as a retrieved dedicated host and contains only the information to be
   * updated.
   *
   * @param updateDedicatedHostOptions the {@link UpdateDedicatedHostOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DedicatedHost}
   */
  public ServiceCall<DedicatedHost> updateDedicatedHost(UpdateDedicatedHostOptions updateDedicatedHostOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateDedicatedHostOptions,
      "updateDedicatedHostOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateDedicatedHostOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/dedicated_hosts/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateDedicatedHost");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateDedicatedHostOptions.dedicatedHostPatch()), "application/merge-patch+json");
    ResponseConverter<DedicatedHost> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DedicatedHost>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List placement groups.
   *
   * This request lists placement groups in the region.
   *
   * @param listPlacementGroupsOptions the {@link ListPlacementGroupsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PlacementGroupCollection}
   */
  public ServiceCall<PlacementGroupCollection> listPlacementGroups(ListPlacementGroupsOptions listPlacementGroupsOptions) {
    if (listPlacementGroupsOptions == null) {
      listPlacementGroupsOptions = new ListPlacementGroupsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/placement_groups"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listPlacementGroups");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listPlacementGroupsOptions.start() != null) {
      builder.query("start", String.valueOf(listPlacementGroupsOptions.start()));
    }
    if (listPlacementGroupsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listPlacementGroupsOptions.limit()));
    }
    ResponseConverter<PlacementGroupCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PlacementGroupCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List placement groups.
   *
   * This request lists placement groups in the region.
   *
   * @return a {@link ServiceCall} with a result of type {@link PlacementGroupCollection}
   */
  public ServiceCall<PlacementGroupCollection> listPlacementGroups() {
    return listPlacementGroups(null);
  }

  /**
   * Create a placement group.
   *
   * This request creates a new placement group.
   *
   * @param createPlacementGroupOptions the {@link CreatePlacementGroupOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PlacementGroup}
   */
  public ServiceCall<PlacementGroup> createPlacementGroup(CreatePlacementGroupOptions createPlacementGroupOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createPlacementGroupOptions,
      "createPlacementGroupOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/placement_groups"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createPlacementGroup");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("strategy", createPlacementGroupOptions.strategy());
    if (createPlacementGroupOptions.name() != null) {
      contentJson.addProperty("name", createPlacementGroupOptions.name());
    }
    if (createPlacementGroupOptions.resourceGroup() != null) {
      contentJson.add("resource_group", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPlacementGroupOptions.resourceGroup()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<PlacementGroup> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PlacementGroup>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a placement group.
   *
   * This request deletes a placement group. This operation cannot be reversed. For this request to succeed, the
   * placement group must not be associated with an instance.
   *
   * @param deletePlacementGroupOptions the {@link DeletePlacementGroupOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deletePlacementGroup(DeletePlacementGroupOptions deletePlacementGroupOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deletePlacementGroupOptions,
      "deletePlacementGroupOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deletePlacementGroupOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/placement_groups/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deletePlacementGroup");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a placement group.
   *
   * This request retrieves a single placement group specified by identifier in the URL.
   *
   * @param getPlacementGroupOptions the {@link GetPlacementGroupOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PlacementGroup}
   */
  public ServiceCall<PlacementGroup> getPlacementGroup(GetPlacementGroupOptions getPlacementGroupOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getPlacementGroupOptions,
      "getPlacementGroupOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getPlacementGroupOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/placement_groups/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getPlacementGroup");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<PlacementGroup> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PlacementGroup>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a placement group.
   *
   * This request updates a placement group with the information provided placement group patch. The placement group
   * patch object is structured in the same way as a retrieved placement group and contains only the information to be
   * updated.
   *
   * @param updatePlacementGroupOptions the {@link UpdatePlacementGroupOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PlacementGroup}
   */
  public ServiceCall<PlacementGroup> updatePlacementGroup(UpdatePlacementGroupOptions updatePlacementGroupOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updatePlacementGroupOptions,
      "updatePlacementGroupOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updatePlacementGroupOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/placement_groups/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updatePlacementGroup");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updatePlacementGroupOptions.placementGroupPatch()), "application/merge-patch+json");
    ResponseConverter<PlacementGroup> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PlacementGroup>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List bare metal server profiles.
   *
   * This request lists [bare metal server
   * profiles](https://cloud.ibm.com/docs/vpc?topic=vpc-bare-metal-servers-profile) available in the region. A bare
   * metal server profile specifies the performance characteristics and pricing model for a bare metal server.
   *
   * @param listBareMetalServerProfilesOptions the {@link ListBareMetalServerProfilesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BareMetalServerProfileCollection}
   */
  public ServiceCall<BareMetalServerProfileCollection> listBareMetalServerProfiles(ListBareMetalServerProfilesOptions listBareMetalServerProfilesOptions) {
    if (listBareMetalServerProfilesOptions == null) {
      listBareMetalServerProfilesOptions = new ListBareMetalServerProfilesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/bare_metal_server/profiles"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listBareMetalServerProfiles");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listBareMetalServerProfilesOptions.start() != null) {
      builder.query("start", String.valueOf(listBareMetalServerProfilesOptions.start()));
    }
    if (listBareMetalServerProfilesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listBareMetalServerProfilesOptions.limit()));
    }
    ResponseConverter<BareMetalServerProfileCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BareMetalServerProfileCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List bare metal server profiles.
   *
   * This request lists [bare metal server
   * profiles](https://cloud.ibm.com/docs/vpc?topic=vpc-bare-metal-servers-profile) available in the region. A bare
   * metal server profile specifies the performance characteristics and pricing model for a bare metal server.
   *
   * @return a {@link ServiceCall} with a result of type {@link BareMetalServerProfileCollection}
   */
  public ServiceCall<BareMetalServerProfileCollection> listBareMetalServerProfiles() {
    return listBareMetalServerProfiles(null);
  }

  /**
   * Retrieve a bare metal server profile.
   *
   * This request retrieves a single bare metal server profile specified by the name in the URL.
   *
   * @param getBareMetalServerProfileOptions the {@link GetBareMetalServerProfileOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BareMetalServerProfile}
   */
  public ServiceCall<BareMetalServerProfile> getBareMetalServerProfile(GetBareMetalServerProfileOptions getBareMetalServerProfileOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getBareMetalServerProfileOptions,
      "getBareMetalServerProfileOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("name", getBareMetalServerProfileOptions.name());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/bare_metal_server/profiles/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getBareMetalServerProfile");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<BareMetalServerProfile> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BareMetalServerProfile>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List bare metal servers.
   *
   * This request lists bare metal servers in the region.
   *
   * @param listBareMetalServersOptions the {@link ListBareMetalServersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BareMetalServerCollection}
   */
  public ServiceCall<BareMetalServerCollection> listBareMetalServers(ListBareMetalServersOptions listBareMetalServersOptions) {
    if (listBareMetalServersOptions == null) {
      listBareMetalServersOptions = new ListBareMetalServersOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/bare_metal_servers"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listBareMetalServers");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listBareMetalServersOptions.start() != null) {
      builder.query("start", String.valueOf(listBareMetalServersOptions.start()));
    }
    if (listBareMetalServersOptions.limit() != null) {
      builder.query("limit", String.valueOf(listBareMetalServersOptions.limit()));
    }
    if (listBareMetalServersOptions.resourceGroupId() != null) {
      builder.query("resource_group.id", String.valueOf(listBareMetalServersOptions.resourceGroupId()));
    }
    if (listBareMetalServersOptions.name() != null) {
      builder.query("name", String.valueOf(listBareMetalServersOptions.name()));
    }
    if (listBareMetalServersOptions.reservationId() != null) {
      builder.query("reservation.id", String.valueOf(listBareMetalServersOptions.reservationId()));
    }
    if (listBareMetalServersOptions.reservationCrn() != null) {
      builder.query("reservation.crn", String.valueOf(listBareMetalServersOptions.reservationCrn()));
    }
    if (listBareMetalServersOptions.reservationName() != null) {
      builder.query("reservation.name", String.valueOf(listBareMetalServersOptions.reservationName()));
    }
    if (listBareMetalServersOptions.vpcId() != null) {
      builder.query("vpc.id", String.valueOf(listBareMetalServersOptions.vpcId()));
    }
    if (listBareMetalServersOptions.vpcCrn() != null) {
      builder.query("vpc.crn", String.valueOf(listBareMetalServersOptions.vpcCrn()));
    }
    if (listBareMetalServersOptions.vpcName() != null) {
      builder.query("vpc.name", String.valueOf(listBareMetalServersOptions.vpcName()));
    }
    ResponseConverter<BareMetalServerCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BareMetalServerCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List bare metal servers.
   *
   * This request lists bare metal servers in the region.
   *
   * @return a {@link ServiceCall} with a result of type {@link BareMetalServerCollection}
   */
  public ServiceCall<BareMetalServerCollection> listBareMetalServers() {
    return listBareMetalServers(null);
  }

  /**
   * Create a bare metal server.
   *
   * This request provisions a new bare metal server from a prototype object. The prototype object is structured in the
   * same way as a retrieved bare metal server, and contains the information necessary to provision the new bare metal
   * server. The bare metal server is automatically started.
   *
   * @param createBareMetalServerOptions the {@link CreateBareMetalServerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BareMetalServer}
   */
  public ServiceCall<BareMetalServer> createBareMetalServer(CreateBareMetalServerOptions createBareMetalServerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createBareMetalServerOptions,
      "createBareMetalServerOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/bare_metal_servers"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createBareMetalServer");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createBareMetalServerOptions.bareMetalServerPrototype()), "application/json");
    ResponseConverter<BareMetalServer> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BareMetalServer>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a console access token for a bare metal server.
   *
   * This request creates a new single-use console access token for a bare metal server. All console configuration is
   * provided at token create time, and the token is subsequently used in the `access_token` query parameter for the
   * WebSocket request.  The access token is only valid for a short period of time, and a maximum of one token is valid
   * for a given bare metal server at a time.  For this request to succeed, the server must have a `status` of
   * `stopped`, `starting`, or `running`.
   *
   * @param createBareMetalServerConsoleAccessTokenOptions the {@link CreateBareMetalServerConsoleAccessTokenOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BareMetalServerConsoleAccessToken}
   */
  public ServiceCall<BareMetalServerConsoleAccessToken> createBareMetalServerConsoleAccessToken(CreateBareMetalServerConsoleAccessTokenOptions createBareMetalServerConsoleAccessTokenOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createBareMetalServerConsoleAccessTokenOptions,
      "createBareMetalServerConsoleAccessTokenOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("bare_metal_server_id", createBareMetalServerConsoleAccessTokenOptions.bareMetalServerId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/bare_metal_servers/{bare_metal_server_id}/console_access_token", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createBareMetalServerConsoleAccessToken");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("console_type", createBareMetalServerConsoleAccessTokenOptions.consoleType());
    if (createBareMetalServerConsoleAccessTokenOptions.force() != null) {
      contentJson.addProperty("force", createBareMetalServerConsoleAccessTokenOptions.force());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<BareMetalServerConsoleAccessToken> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BareMetalServerConsoleAccessToken>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List disks on a bare metal server.
   *
   * This request lists  disks on a bare metal server.  A disk is a block device that is locally attached to the
   * physical server.  By default, the listed disks are sorted by their `created_at` property values, with the newest
   * disk first.
   *
   * @param listBareMetalServerDisksOptions the {@link ListBareMetalServerDisksOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BareMetalServerDiskCollection}
   */
  public ServiceCall<BareMetalServerDiskCollection> listBareMetalServerDisks(ListBareMetalServerDisksOptions listBareMetalServerDisksOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listBareMetalServerDisksOptions,
      "listBareMetalServerDisksOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("bare_metal_server_id", listBareMetalServerDisksOptions.bareMetalServerId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/bare_metal_servers/{bare_metal_server_id}/disks", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listBareMetalServerDisks");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<BareMetalServerDiskCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BareMetalServerDiskCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a bare metal server disk.
   *
   * This request retrieves a single disk specified by the identifier in the URL.
   *
   * @param getBareMetalServerDiskOptions the {@link GetBareMetalServerDiskOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BareMetalServerDisk}
   */
  public ServiceCall<BareMetalServerDisk> getBareMetalServerDisk(GetBareMetalServerDiskOptions getBareMetalServerDiskOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getBareMetalServerDiskOptions,
      "getBareMetalServerDiskOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("bare_metal_server_id", getBareMetalServerDiskOptions.bareMetalServerId());
    pathParamsMap.put("id", getBareMetalServerDiskOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/bare_metal_servers/{bare_metal_server_id}/disks/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getBareMetalServerDisk");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<BareMetalServerDisk> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BareMetalServerDisk>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a bare metal server disk.
   *
   * This request updates the bare metal server disk with the information in a provided patch.
   *
   * @param updateBareMetalServerDiskOptions the {@link UpdateBareMetalServerDiskOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BareMetalServerDisk}
   */
  public ServiceCall<BareMetalServerDisk> updateBareMetalServerDisk(UpdateBareMetalServerDiskOptions updateBareMetalServerDiskOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateBareMetalServerDiskOptions,
      "updateBareMetalServerDiskOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("bare_metal_server_id", updateBareMetalServerDiskOptions.bareMetalServerId());
    pathParamsMap.put("id", updateBareMetalServerDiskOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/bare_metal_servers/{bare_metal_server_id}/disks/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateBareMetalServerDisk");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateBareMetalServerDiskOptions.bareMetalServerDiskPatch()), "application/merge-patch+json");
    ResponseConverter<BareMetalServerDisk> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BareMetalServerDisk>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List network attachments on a bare metal server.
   *
   * This request lists network attachments on a bare metal server. A bare metal server network attachment is an
   * abstract representation of a network device and attaches a bare metal server to a single subnet. Each network
   * interface on a bare metal server can attach to any subnet in the zone, including subnets that are already attached
   * to the bare metal server.
   *
   * The network attachments will be sorted by their `created_at` property values, with newest network attachments
   * first. Network attachments with identical `created_at` property values will in turn be sorted by ascending `name`
   * property values.
   *
   * @param listBareMetalServerNetworkAttachmentsOptions the {@link ListBareMetalServerNetworkAttachmentsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BareMetalServerNetworkAttachmentCollection}
   */
  public ServiceCall<BareMetalServerNetworkAttachmentCollection> listBareMetalServerNetworkAttachments(ListBareMetalServerNetworkAttachmentsOptions listBareMetalServerNetworkAttachmentsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listBareMetalServerNetworkAttachmentsOptions,
      "listBareMetalServerNetworkAttachmentsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("bare_metal_server_id", listBareMetalServerNetworkAttachmentsOptions.bareMetalServerId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/bare_metal_servers/{bare_metal_server_id}/network_attachments", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listBareMetalServerNetworkAttachments");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listBareMetalServerNetworkAttachmentsOptions.start() != null) {
      builder.query("start", String.valueOf(listBareMetalServerNetworkAttachmentsOptions.start()));
    }
    if (listBareMetalServerNetworkAttachmentsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listBareMetalServerNetworkAttachmentsOptions.limit()));
    }
    ResponseConverter<BareMetalServerNetworkAttachmentCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BareMetalServerNetworkAttachmentCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a network attachment on a bare metal server.
   *
   * This request creates a new bare metal server network attachment from a bare metal server network attachment
   * prototype object. The prototype object is structured in the same way as a retrieved bare metal server network
   * attachment, and contains the information necessary to create the new bare metal server network attachment.
   *
   * @param createBareMetalServerNetworkAttachmentOptions the {@link CreateBareMetalServerNetworkAttachmentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BareMetalServerNetworkAttachment}
   */
  public ServiceCall<BareMetalServerNetworkAttachment> createBareMetalServerNetworkAttachment(CreateBareMetalServerNetworkAttachmentOptions createBareMetalServerNetworkAttachmentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createBareMetalServerNetworkAttachmentOptions,
      "createBareMetalServerNetworkAttachmentOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("bare_metal_server_id", createBareMetalServerNetworkAttachmentOptions.bareMetalServerId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/bare_metal_servers/{bare_metal_server_id}/network_attachments", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createBareMetalServerNetworkAttachment");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createBareMetalServerNetworkAttachmentOptions.bareMetalServerNetworkAttachmentPrototype()), "application/json");
    ResponseConverter<BareMetalServerNetworkAttachment> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BareMetalServerNetworkAttachment>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a bare metal server network attachment.
   *
   * This request deletes a bare metal server network attachment. This operation cannot be reversed. Any floating IPs
   * associated with the bare metal server network attachment are implicitly disassociated.
   *
   * The bare metal server's primary network attachment cannot be deleted.
   *
   * @param deleteBareMetalServerNetworkAttachmentOptions the {@link DeleteBareMetalServerNetworkAttachmentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteBareMetalServerNetworkAttachment(DeleteBareMetalServerNetworkAttachmentOptions deleteBareMetalServerNetworkAttachmentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteBareMetalServerNetworkAttachmentOptions,
      "deleteBareMetalServerNetworkAttachmentOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("bare_metal_server_id", deleteBareMetalServerNetworkAttachmentOptions.bareMetalServerId());
    pathParamsMap.put("id", deleteBareMetalServerNetworkAttachmentOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/bare_metal_servers/{bare_metal_server_id}/network_attachments/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteBareMetalServerNetworkAttachment");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a bare metal server network attachment.
   *
   * This request retrieves a single bare metal server network attachment specified by the identifier in the URL.
   *
   * @param getBareMetalServerNetworkAttachmentOptions the {@link GetBareMetalServerNetworkAttachmentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BareMetalServerNetworkAttachment}
   */
  public ServiceCall<BareMetalServerNetworkAttachment> getBareMetalServerNetworkAttachment(GetBareMetalServerNetworkAttachmentOptions getBareMetalServerNetworkAttachmentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getBareMetalServerNetworkAttachmentOptions,
      "getBareMetalServerNetworkAttachmentOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("bare_metal_server_id", getBareMetalServerNetworkAttachmentOptions.bareMetalServerId());
    pathParamsMap.put("id", getBareMetalServerNetworkAttachmentOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/bare_metal_servers/{bare_metal_server_id}/network_attachments/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getBareMetalServerNetworkAttachment");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<BareMetalServerNetworkAttachment> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BareMetalServerNetworkAttachment>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a bare metal server network attachment.
   *
   * This request updates a bare metal server network attachment with the information provided in a bare metal server
   * network attachment patch object. The bare metal server network attachment patch object is structured in the same
   * way as a retrieved bare metal server network attachment and contains only the information to be updated.
   *
   * @param updateBareMetalServerNetworkAttachmentOptions the {@link UpdateBareMetalServerNetworkAttachmentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BareMetalServerNetworkAttachment}
   */
  public ServiceCall<BareMetalServerNetworkAttachment> updateBareMetalServerNetworkAttachment(UpdateBareMetalServerNetworkAttachmentOptions updateBareMetalServerNetworkAttachmentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateBareMetalServerNetworkAttachmentOptions,
      "updateBareMetalServerNetworkAttachmentOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("bare_metal_server_id", updateBareMetalServerNetworkAttachmentOptions.bareMetalServerId());
    pathParamsMap.put("id", updateBareMetalServerNetworkAttachmentOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/bare_metal_servers/{bare_metal_server_id}/network_attachments/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateBareMetalServerNetworkAttachment");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateBareMetalServerNetworkAttachmentOptions.bareMetalServerNetworkAttachmentPatch()), "application/merge-patch+json");
    ResponseConverter<BareMetalServerNetworkAttachment> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BareMetalServerNetworkAttachment>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List network interfaces on a bare metal server.
   *
   * This request lists network interfaces on a bare metal server. A bare metal server network interface is an abstract
   * representation of a network device and attaches a bare metal server to a single subnet. Each network interface on a
   * bare metal server can attach to any subnet in the zone, including subnets that are already attached to the bare
   * metal server.
   *
   * If this bare metal server has network attachments, each returned network interface is a [read-only
   * representation](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients) of its corresponding
   * network attachment and its attached virtual network interface.
   *
   * @param listBareMetalServerNetworkInterfacesOptions the {@link ListBareMetalServerNetworkInterfacesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BareMetalServerNetworkInterfaceCollection}
   */
  public ServiceCall<BareMetalServerNetworkInterfaceCollection> listBareMetalServerNetworkInterfaces(ListBareMetalServerNetworkInterfacesOptions listBareMetalServerNetworkInterfacesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listBareMetalServerNetworkInterfacesOptions,
      "listBareMetalServerNetworkInterfacesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("bare_metal_server_id", listBareMetalServerNetworkInterfacesOptions.bareMetalServerId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/bare_metal_servers/{bare_metal_server_id}/network_interfaces", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listBareMetalServerNetworkInterfaces");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listBareMetalServerNetworkInterfacesOptions.start() != null) {
      builder.query("start", String.valueOf(listBareMetalServerNetworkInterfacesOptions.start()));
    }
    if (listBareMetalServerNetworkInterfacesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listBareMetalServerNetworkInterfacesOptions.limit()));
    }
    ResponseConverter<BareMetalServerNetworkInterfaceCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BareMetalServerNetworkInterfaceCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a network interface on a bare metal server.
   *
   * This request creates a new bare metal server network interface from a bare metal server network interface prototype
   * object. The prototype object is structured in the same way as a retrieved bare metal server network interface, and
   * contains the information necessary to create the new bare metal server network interface. Any subnet in the bare
   * metal server's VPC may be specified, even if it is already attached to another bare metal server network interface.
   * Addresses on the bare metal server network interface must be within the specified subnet's CIDR blocks.
   *
   * If this bare metal server has network attachments, each network interface is a [read-only
   * representation](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients) of its corresponding
   * network attachment and its attached virtual network interface, and new network interfaces are not allowed to be
   * created.
   *
   * @param createBareMetalServerNetworkInterfaceOptions the {@link CreateBareMetalServerNetworkInterfaceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BareMetalServerNetworkInterface}
   */
  public ServiceCall<BareMetalServerNetworkInterface> createBareMetalServerNetworkInterface(CreateBareMetalServerNetworkInterfaceOptions createBareMetalServerNetworkInterfaceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createBareMetalServerNetworkInterfaceOptions,
      "createBareMetalServerNetworkInterfaceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("bare_metal_server_id", createBareMetalServerNetworkInterfaceOptions.bareMetalServerId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/bare_metal_servers/{bare_metal_server_id}/network_interfaces", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createBareMetalServerNetworkInterface");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createBareMetalServerNetworkInterfaceOptions.bareMetalServerNetworkInterfacePrototype()), "application/json");
    ResponseConverter<BareMetalServerNetworkInterface> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BareMetalServerNetworkInterface>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a bare metal server network interface.
   *
   * This request deletes a bare metal server network interface. This operation cannot be reversed. Any floating IPs
   * associated with the bare metal server network interface are implicitly disassociated.  The primary bare metal
   * server network interface is not allowed to be deleted.
   *
   * If this bare metal server has network attachments, this network interface is a [read-only
   * representation](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients) of its corresponding
   * network attachment and its attached virtual network interface, and is not allowed to be deleted.
   *
   * @param deleteBareMetalServerNetworkInterfaceOptions the {@link DeleteBareMetalServerNetworkInterfaceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteBareMetalServerNetworkInterface(DeleteBareMetalServerNetworkInterfaceOptions deleteBareMetalServerNetworkInterfaceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteBareMetalServerNetworkInterfaceOptions,
      "deleteBareMetalServerNetworkInterfaceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("bare_metal_server_id", deleteBareMetalServerNetworkInterfaceOptions.bareMetalServerId());
    pathParamsMap.put("id", deleteBareMetalServerNetworkInterfaceOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/bare_metal_servers/{bare_metal_server_id}/network_interfaces/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteBareMetalServerNetworkInterface");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a bare metal server network interface.
   *
   * This request retrieves a single bare metal server network interface specified by the identifier in the URL.
   *
   * If this bare metal server has network attachments, the retrieved network interface is a [read-only
   * representation](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients) of its corresponding
   * network attachment and its attached virtual network interface.
   *
   * @param getBareMetalServerNetworkInterfaceOptions the {@link GetBareMetalServerNetworkInterfaceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BareMetalServerNetworkInterface}
   */
  public ServiceCall<BareMetalServerNetworkInterface> getBareMetalServerNetworkInterface(GetBareMetalServerNetworkInterfaceOptions getBareMetalServerNetworkInterfaceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getBareMetalServerNetworkInterfaceOptions,
      "getBareMetalServerNetworkInterfaceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("bare_metal_server_id", getBareMetalServerNetworkInterfaceOptions.bareMetalServerId());
    pathParamsMap.put("id", getBareMetalServerNetworkInterfaceOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/bare_metal_servers/{bare_metal_server_id}/network_interfaces/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getBareMetalServerNetworkInterface");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<BareMetalServerNetworkInterface> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BareMetalServerNetworkInterface>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a bare metal server network interface.
   *
   * This request updates a bare metal server network interface with the information provided in a bare metal server
   * network interface patch object. The bare metal server network interface patch object is structured in the same way
   * as a retrieved bare metal server network interface and needs to contain only the information to be updated.
   *
   * If this bare metal server has network attachments, this network interface is a [read-only
   * representation](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients) of its corresponding
   * network attachment and its attached virtual network interface, and is not allowed to be updated.
   *
   * @param updateBareMetalServerNetworkInterfaceOptions the {@link UpdateBareMetalServerNetworkInterfaceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BareMetalServerNetworkInterface}
   */
  public ServiceCall<BareMetalServerNetworkInterface> updateBareMetalServerNetworkInterface(UpdateBareMetalServerNetworkInterfaceOptions updateBareMetalServerNetworkInterfaceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateBareMetalServerNetworkInterfaceOptions,
      "updateBareMetalServerNetworkInterfaceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("bare_metal_server_id", updateBareMetalServerNetworkInterfaceOptions.bareMetalServerId());
    pathParamsMap.put("id", updateBareMetalServerNetworkInterfaceOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/bare_metal_servers/{bare_metal_server_id}/network_interfaces/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateBareMetalServerNetworkInterface");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateBareMetalServerNetworkInterfaceOptions.bareMetalServerNetworkInterfacePatch()), "application/merge-patch+json");
    ResponseConverter<BareMetalServerNetworkInterface> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BareMetalServerNetworkInterface>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List floating IPs associated with a bare metal server network interface.
   *
   * This request lists floating IPs associated with a bare metal server network interface.
   *
   * @param listBareMetalServerNetworkInterfaceFloatingIpsOptions the {@link ListBareMetalServerNetworkInterfaceFloatingIpsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link FloatingIPUnpaginatedCollection}
   */
  public ServiceCall<FloatingIPUnpaginatedCollection> listBareMetalServerNetworkInterfaceFloatingIps(ListBareMetalServerNetworkInterfaceFloatingIpsOptions listBareMetalServerNetworkInterfaceFloatingIpsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listBareMetalServerNetworkInterfaceFloatingIpsOptions,
      "listBareMetalServerNetworkInterfaceFloatingIpsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("bare_metal_server_id", listBareMetalServerNetworkInterfaceFloatingIpsOptions.bareMetalServerId());
    pathParamsMap.put("network_interface_id", listBareMetalServerNetworkInterfaceFloatingIpsOptions.networkInterfaceId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/bare_metal_servers/{bare_metal_server_id}/network_interfaces/{network_interface_id}/floating_ips", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listBareMetalServerNetworkInterfaceFloatingIps");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<FloatingIPUnpaginatedCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<FloatingIPUnpaginatedCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Disassociate a floating IP from a bare metal server network interface.
   *
   * This request disassociates the specified floating IP from the specified bare metal server network interface.
   *
   * @param removeBareMetalServerNetworkInterfaceFloatingIpOptions the {@link RemoveBareMetalServerNetworkInterfaceFloatingIpOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> removeBareMetalServerNetworkInterfaceFloatingIp(RemoveBareMetalServerNetworkInterfaceFloatingIpOptions removeBareMetalServerNetworkInterfaceFloatingIpOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(removeBareMetalServerNetworkInterfaceFloatingIpOptions,
      "removeBareMetalServerNetworkInterfaceFloatingIpOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("bare_metal_server_id", removeBareMetalServerNetworkInterfaceFloatingIpOptions.bareMetalServerId());
    pathParamsMap.put("network_interface_id", removeBareMetalServerNetworkInterfaceFloatingIpOptions.networkInterfaceId());
    pathParamsMap.put("id", removeBareMetalServerNetworkInterfaceFloatingIpOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/bare_metal_servers/{bare_metal_server_id}/network_interfaces/{network_interface_id}/floating_ips/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "removeBareMetalServerNetworkInterfaceFloatingIp");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve associated floating IP.
   *
   * This request retrieves a specified floating IP if it is associated with the bare metal server network interface
   * specified in the URL.
   *
   * @param getBareMetalServerNetworkInterfaceFloatingIpOptions the {@link GetBareMetalServerNetworkInterfaceFloatingIpOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link FloatingIP}
   */
  public ServiceCall<FloatingIP> getBareMetalServerNetworkInterfaceFloatingIp(GetBareMetalServerNetworkInterfaceFloatingIpOptions getBareMetalServerNetworkInterfaceFloatingIpOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getBareMetalServerNetworkInterfaceFloatingIpOptions,
      "getBareMetalServerNetworkInterfaceFloatingIpOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("bare_metal_server_id", getBareMetalServerNetworkInterfaceFloatingIpOptions.bareMetalServerId());
    pathParamsMap.put("network_interface_id", getBareMetalServerNetworkInterfaceFloatingIpOptions.networkInterfaceId());
    pathParamsMap.put("id", getBareMetalServerNetworkInterfaceFloatingIpOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/bare_metal_servers/{bare_metal_server_id}/network_interfaces/{network_interface_id}/floating_ips/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getBareMetalServerNetworkInterfaceFloatingIp");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<FloatingIP> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<FloatingIP>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Associate a floating IP with a bare metal server network interface.
   *
   * This request associates the specified floating IP with the specified bare metal server network interface. If
   * `enable_infrastructure_nat` is `false`, this adds the IP to any existing associations. If
   * `enable_infrastructure_nat` is `true`, this replaces any existing association.
   *
   * The existing floating IP must:
   * - not be required by another resource, such as a public gateway
   * - be in the same `zone` as the bare metal server
   *
   * A request body is not required, and if provided, is ignored.
   *
   * @param addBareMetalServerNetworkInterfaceFloatingIpOptions the {@link AddBareMetalServerNetworkInterfaceFloatingIpOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link FloatingIP}
   */
  public ServiceCall<FloatingIP> addBareMetalServerNetworkInterfaceFloatingIp(AddBareMetalServerNetworkInterfaceFloatingIpOptions addBareMetalServerNetworkInterfaceFloatingIpOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(addBareMetalServerNetworkInterfaceFloatingIpOptions,
      "addBareMetalServerNetworkInterfaceFloatingIpOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("bare_metal_server_id", addBareMetalServerNetworkInterfaceFloatingIpOptions.bareMetalServerId());
    pathParamsMap.put("network_interface_id", addBareMetalServerNetworkInterfaceFloatingIpOptions.networkInterfaceId());
    pathParamsMap.put("id", addBareMetalServerNetworkInterfaceFloatingIpOptions.id());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/bare_metal_servers/{bare_metal_server_id}/network_interfaces/{network_interface_id}/floating_ips/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "addBareMetalServerNetworkInterfaceFloatingIp");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<FloatingIP> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<FloatingIP>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List the primary reserved IP for a bare metal server network interface.
   *
   * This request lists the primary reserved IP for a bare metal server network interface.
   *
   * @param listBareMetalServerNetworkInterfaceIpsOptions the {@link ListBareMetalServerNetworkInterfaceIpsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ReservedIPCollectionBareMetalServerNetworkInterfaceContext}
   * @deprecated this method is deprecated and may be removed in a future release
   */
   @Deprecated
  public ServiceCall<ReservedIPCollectionBareMetalServerNetworkInterfaceContext> listBareMetalServerNetworkInterfaceIps(ListBareMetalServerNetworkInterfaceIpsOptions listBareMetalServerNetworkInterfaceIpsOptions) {
    LOGGER.warning("A deprecated operation has been invoked: listBareMetalServerNetworkInterfaceIps");
    com.ibm.cloud.sdk.core.util.Validator.notNull(listBareMetalServerNetworkInterfaceIpsOptions,
      "listBareMetalServerNetworkInterfaceIpsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("bare_metal_server_id", listBareMetalServerNetworkInterfaceIpsOptions.bareMetalServerId());
    pathParamsMap.put("network_interface_id", listBareMetalServerNetworkInterfaceIpsOptions.networkInterfaceId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/bare_metal_servers/{bare_metal_server_id}/network_interfaces/{network_interface_id}/ips", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listBareMetalServerNetworkInterfaceIps");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<ReservedIPCollectionBareMetalServerNetworkInterfaceContext> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ReservedIPCollectionBareMetalServerNetworkInterfaceContext>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve the primary reserved IP.
   *
   * This request retrieves the primary reserved IP for a bare metal server network interface.
   *
   * @param getBareMetalServerNetworkInterfaceIpOptions the {@link GetBareMetalServerNetworkInterfaceIpOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ReservedIP}
   * @deprecated this method is deprecated and may be removed in a future release
   */
   @Deprecated
  public ServiceCall<ReservedIP> getBareMetalServerNetworkInterfaceIp(GetBareMetalServerNetworkInterfaceIpOptions getBareMetalServerNetworkInterfaceIpOptions) {
    LOGGER.warning("A deprecated operation has been invoked: getBareMetalServerNetworkInterfaceIp");
    com.ibm.cloud.sdk.core.util.Validator.notNull(getBareMetalServerNetworkInterfaceIpOptions,
      "getBareMetalServerNetworkInterfaceIpOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("bare_metal_server_id", getBareMetalServerNetworkInterfaceIpOptions.bareMetalServerId());
    pathParamsMap.put("network_interface_id", getBareMetalServerNetworkInterfaceIpOptions.networkInterfaceId());
    pathParamsMap.put("id", getBareMetalServerNetworkInterfaceIpOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/bare_metal_servers/{bare_metal_server_id}/network_interfaces/{network_interface_id}/ips/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getBareMetalServerNetworkInterfaceIp");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<ReservedIP> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ReservedIP>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a bare metal server.
   *
   * This request deletes a bare metal server. This operation cannot be reversed. Any floating IPs associated with the
   * bare metal server network interfaces are implicitly disassociated.
   *
   * @param deleteBareMetalServerOptions the {@link DeleteBareMetalServerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteBareMetalServer(DeleteBareMetalServerOptions deleteBareMetalServerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteBareMetalServerOptions,
      "deleteBareMetalServerOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteBareMetalServerOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/bare_metal_servers/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteBareMetalServer");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a bare metal server.
   *
   * This request retrieves a single bare metal server specified by the identifier in the URL.
   *
   * @param getBareMetalServerOptions the {@link GetBareMetalServerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BareMetalServer}
   */
  public ServiceCall<BareMetalServer> getBareMetalServer(GetBareMetalServerOptions getBareMetalServerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getBareMetalServerOptions,
      "getBareMetalServerOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getBareMetalServerOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/bare_metal_servers/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getBareMetalServer");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<BareMetalServer> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BareMetalServer>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a bare metal server.
   *
   * This request updates a bare metal server with the information in a provided patch. The bare metal server patch
   * object is structured in the same way as a retrieved bare metal server and contains only the information to be
   * updated.
   *
   * @param updateBareMetalServerOptions the {@link UpdateBareMetalServerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BareMetalServer}
   */
  public ServiceCall<BareMetalServer> updateBareMetalServer(UpdateBareMetalServerOptions updateBareMetalServerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateBareMetalServerOptions,
      "updateBareMetalServerOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateBareMetalServerOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/bare_metal_servers/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateBareMetalServer");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateBareMetalServerOptions.bareMetalServerPatch()), "application/merge-patch+json");
    ResponseConverter<BareMetalServer> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BareMetalServer>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update firmware for a bare metal server.
   *
   * This request updates a bare metal server to the latest available firmware. The server must be stopped.
   *
   * @param updateFirmwareForBareMetalServerOptions the {@link UpdateFirmwareForBareMetalServerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> updateFirmwareForBareMetalServer(UpdateFirmwareForBareMetalServerOptions updateFirmwareForBareMetalServerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateFirmwareForBareMetalServerOptions,
      "updateFirmwareForBareMetalServerOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateFirmwareForBareMetalServerOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/bare_metal_servers/{id}/firmware/update", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateFirmwareForBareMetalServer");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    if (updateFirmwareForBareMetalServerOptions.autoStart() != null) {
      contentJson.addProperty("auto_start", updateFirmwareForBareMetalServerOptions.autoStart());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve initialization configuration for a bare metal server.
   *
   * This request retrieves configuration used to initialize the bare metal server, such as the image used, SSH keys,
   * and any configured usernames and passwords. These can subsequently be changed on the server and therefore may not
   * be current.
   *
   * @param getBareMetalServerInitializationOptions the {@link GetBareMetalServerInitializationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BareMetalServerInitialization}
   */
  public ServiceCall<BareMetalServerInitialization> getBareMetalServerInitialization(GetBareMetalServerInitializationOptions getBareMetalServerInitializationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getBareMetalServerInitializationOptions,
      "getBareMetalServerInitializationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getBareMetalServerInitializationOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/bare_metal_servers/{id}/initialization", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getBareMetalServerInitialization");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<BareMetalServerInitialization> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BareMetalServerInitialization>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Reinitialize a bare metal server.
   *
   * This request reinitializes a bare metal server with the specified image and SSH keys. The server must be stopped.
   * Upon successful reinitiatilization, the bare metal server will be started automatically.
   *
   * @param replaceBareMetalServerInitializationOptions the {@link ReplaceBareMetalServerInitializationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BareMetalServerInitialization}
   */
  public ServiceCall<BareMetalServerInitialization> replaceBareMetalServerInitialization(ReplaceBareMetalServerInitializationOptions replaceBareMetalServerInitializationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceBareMetalServerInitializationOptions,
      "replaceBareMetalServerInitializationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", replaceBareMetalServerInitializationOptions.id());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/bare_metal_servers/{id}/initialization", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "replaceBareMetalServerInitialization");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("image", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceBareMetalServerInitializationOptions.image()));
    contentJson.add("keys", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceBareMetalServerInitializationOptions.keys()));
    if (replaceBareMetalServerInitializationOptions.userData() != null) {
      contentJson.addProperty("user_data", replaceBareMetalServerInitializationOptions.userData());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<BareMetalServerInitialization> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BareMetalServerInitialization>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Restart a bare metal server.
   *
   * This request immediately restarts a bare metal server.  For this request to succeed, the server must have a
   * `status` of `running`.
   *
   * @param restartBareMetalServerOptions the {@link RestartBareMetalServerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> restartBareMetalServer(RestartBareMetalServerOptions restartBareMetalServerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(restartBareMetalServerOptions,
      "restartBareMetalServerOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", restartBareMetalServerOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/bare_metal_servers/{id}/restart", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "restartBareMetalServer");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Start a bare metal server.
   *
   * This request starts a bare metal server.  It will run immediately provided the server is stopped.
   *
   * @param startBareMetalServerOptions the {@link StartBareMetalServerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> startBareMetalServer(StartBareMetalServerOptions startBareMetalServerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(startBareMetalServerOptions,
      "startBareMetalServerOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", startBareMetalServerOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/bare_metal_servers/{id}/start", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "startBareMetalServer");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Stop a bare metal server.
   *
   * This request stops a bare metal server. It will run immediately provided the server is running. Note: A soft stop
   * may not complete as it relies on the operating system to perform the operation.
   *
   * @param stopBareMetalServerOptions the {@link StopBareMetalServerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> stopBareMetalServer(StopBareMetalServerOptions stopBareMetalServerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(stopBareMetalServerOptions,
      "stopBareMetalServerOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", stopBareMetalServerOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/bare_metal_servers/{id}/stop", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "stopBareMetalServer");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("type", stopBareMetalServerOptions.type());
    builder.bodyJson(contentJson);
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List volume profiles.
   *
   * This request lists [volume profiles](https://cloud.ibm.com/docs/vpc?topic=vpc-block-storage-profiles) available in
   * the region. A volume profile specifies the performance characteristics and pricing model for a volume.
   *
   * @param listVolumeProfilesOptions the {@link ListVolumeProfilesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VolumeProfileCollection}
   */
  public ServiceCall<VolumeProfileCollection> listVolumeProfiles(ListVolumeProfilesOptions listVolumeProfilesOptions) {
    if (listVolumeProfilesOptions == null) {
      listVolumeProfilesOptions = new ListVolumeProfilesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/volume/profiles"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listVolumeProfiles");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listVolumeProfilesOptions.start() != null) {
      builder.query("start", String.valueOf(listVolumeProfilesOptions.start()));
    }
    if (listVolumeProfilesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listVolumeProfilesOptions.limit()));
    }
    ResponseConverter<VolumeProfileCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VolumeProfileCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List volume profiles.
   *
   * This request lists [volume profiles](https://cloud.ibm.com/docs/vpc?topic=vpc-block-storage-profiles) available in
   * the region. A volume profile specifies the performance characteristics and pricing model for a volume.
   *
   * @return a {@link ServiceCall} with a result of type {@link VolumeProfileCollection}
   */
  public ServiceCall<VolumeProfileCollection> listVolumeProfiles() {
    return listVolumeProfiles(null);
  }

  /**
   * Retrieve a volume profile.
   *
   * This request retrieves a single volume profile specified by the name in the URL.
   *
   * @param getVolumeProfileOptions the {@link GetVolumeProfileOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VolumeProfile}
   */
  public ServiceCall<VolumeProfile> getVolumeProfile(GetVolumeProfileOptions getVolumeProfileOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getVolumeProfileOptions,
      "getVolumeProfileOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("name", getVolumeProfileOptions.name());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/volume/profiles/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getVolumeProfile");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<VolumeProfile> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VolumeProfile>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List volumes.
   *
   * This request lists volumes in the region. Volumes are network-connected block storage devices that may be attached
   * to one or more instances in the same region.
   *
   * @param listVolumesOptions the {@link ListVolumesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VolumeCollection}
   */
  public ServiceCall<VolumeCollection> listVolumes(ListVolumesOptions listVolumesOptions) {
    if (listVolumesOptions == null) {
      listVolumesOptions = new ListVolumesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/volumes"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listVolumes");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listVolumesOptions.start() != null) {
      builder.query("start", String.valueOf(listVolumesOptions.start()));
    }
    if (listVolumesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listVolumesOptions.limit()));
    }
    if (listVolumesOptions.attachmentState() != null) {
      builder.query("attachment_state", String.valueOf(listVolumesOptions.attachmentState()));
    }
    if (listVolumesOptions.encryption() != null) {
      builder.query("encryption", String.valueOf(listVolumesOptions.encryption()));
    }
    if (listVolumesOptions.name() != null) {
      builder.query("name", String.valueOf(listVolumesOptions.name()));
    }
    if (listVolumesOptions.operatingSystemFamily() != null) {
      builder.query("operating_system.family", String.valueOf(listVolumesOptions.operatingSystemFamily()));
    }
    if (listVolumesOptions.operatingSystemArchitecture() != null) {
      builder.query("operating_system.architecture", String.valueOf(listVolumesOptions.operatingSystemArchitecture()));
    }
    if (listVolumesOptions.tag() != null) {
      builder.query("tag", String.valueOf(listVolumesOptions.tag()));
    }
    if (listVolumesOptions.zoneName() != null) {
      builder.query("zone.name", String.valueOf(listVolumesOptions.zoneName()));
    }
    ResponseConverter<VolumeCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VolumeCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List volumes.
   *
   * This request lists volumes in the region. Volumes are network-connected block storage devices that may be attached
   * to one or more instances in the same region.
   *
   * @return a {@link ServiceCall} with a result of type {@link VolumeCollection}
   */
  public ServiceCall<VolumeCollection> listVolumes() {
    return listVolumes(null);
  }

  /**
   * Create a volume.
   *
   * This request creates a new volume from a volume prototype object. The prototype object is structured in the same
   * way as a retrieved volume, and contains the information necessary to create the new volume.
   *
   * @param createVolumeOptions the {@link CreateVolumeOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Volume}
   */
  public ServiceCall<Volume> createVolume(CreateVolumeOptions createVolumeOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createVolumeOptions,
      "createVolumeOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/volumes"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createVolume");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createVolumeOptions.volumePrototype()), "application/json");
    ResponseConverter<Volume> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Volume>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a volume.
   *
   * This request deletes a volume. This operation cannot be reversed. For this request to succeed, the volume must not
   * be attached to any instances.
   *
   * @param deleteVolumeOptions the {@link DeleteVolumeOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteVolume(DeleteVolumeOptions deleteVolumeOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteVolumeOptions,
      "deleteVolumeOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteVolumeOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/volumes/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteVolume");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteVolumeOptions.ifMatch() != null) {
      builder.header("If-Match", deleteVolumeOptions.ifMatch());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a volume.
   *
   * This request retrieves a single volume specified by the identifier in the URL.
   *
   * @param getVolumeOptions the {@link GetVolumeOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Volume}
   */
  public ServiceCall<Volume> getVolume(GetVolumeOptions getVolumeOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getVolumeOptions,
      "getVolumeOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getVolumeOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/volumes/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getVolume");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Volume> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Volume>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a volume.
   *
   * This request updates a volume with the information in a provided volume patch. The volume patch object is
   * structured in the same way as a retrieved volume and contains only the information to be updated.
   *
   * @param updateVolumeOptions the {@link UpdateVolumeOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Volume}
   */
  public ServiceCall<Volume> updateVolume(UpdateVolumeOptions updateVolumeOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateVolumeOptions,
      "updateVolumeOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateVolumeOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/volumes/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateVolume");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateVolumeOptions.ifMatch() != null) {
      builder.header("If-Match", updateVolumeOptions.ifMatch());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateVolumeOptions.volumePatch()), "application/merge-patch+json");
    ResponseConverter<Volume> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Volume>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List snapshot consistency groups.
   *
   * This request lists snapshot consistency groups in the region. A snapshot consistency group is a collection of
   * individual snapshots taken at the same time.
   *
   * @param listSnapshotConsistencyGroupsOptions the {@link ListSnapshotConsistencyGroupsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SnapshotConsistencyGroupCollection}
   */
  public ServiceCall<SnapshotConsistencyGroupCollection> listSnapshotConsistencyGroups(ListSnapshotConsistencyGroupsOptions listSnapshotConsistencyGroupsOptions) {
    if (listSnapshotConsistencyGroupsOptions == null) {
      listSnapshotConsistencyGroupsOptions = new ListSnapshotConsistencyGroupsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/snapshot_consistency_groups"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listSnapshotConsistencyGroups");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listSnapshotConsistencyGroupsOptions.start() != null) {
      builder.query("start", String.valueOf(listSnapshotConsistencyGroupsOptions.start()));
    }
    if (listSnapshotConsistencyGroupsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listSnapshotConsistencyGroupsOptions.limit()));
    }
    if (listSnapshotConsistencyGroupsOptions.resourceGroupId() != null) {
      builder.query("resource_group.id", String.valueOf(listSnapshotConsistencyGroupsOptions.resourceGroupId()));
    }
    if (listSnapshotConsistencyGroupsOptions.name() != null) {
      builder.query("name", String.valueOf(listSnapshotConsistencyGroupsOptions.name()));
    }
    if (listSnapshotConsistencyGroupsOptions.sort() != null) {
      builder.query("sort", String.valueOf(listSnapshotConsistencyGroupsOptions.sort()));
    }
    if (listSnapshotConsistencyGroupsOptions.backupPolicyPlanId() != null) {
      builder.query("backup_policy_plan.id", String.valueOf(listSnapshotConsistencyGroupsOptions.backupPolicyPlanId()));
    }
    ResponseConverter<SnapshotConsistencyGroupCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SnapshotConsistencyGroupCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List snapshot consistency groups.
   *
   * This request lists snapshot consistency groups in the region. A snapshot consistency group is a collection of
   * individual snapshots taken at the same time.
   *
   * @return a {@link ServiceCall} with a result of type {@link SnapshotConsistencyGroupCollection}
   */
  public ServiceCall<SnapshotConsistencyGroupCollection> listSnapshotConsistencyGroups() {
    return listSnapshotConsistencyGroups(null);
  }

  /**
   * Create a snapshot consistency group.
   *
   * This request creates a new snapshot consistency group from a snapshot consistency group object.  The prototype
   * object is structured in the same way as a retrieved consistency group, and contains the information necessary to
   * provision the new snapshot consistency group.
   *
   * @param createSnapshotConsistencyGroupOptions the {@link CreateSnapshotConsistencyGroupOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SnapshotConsistencyGroup}
   */
  public ServiceCall<SnapshotConsistencyGroup> createSnapshotConsistencyGroup(CreateSnapshotConsistencyGroupOptions createSnapshotConsistencyGroupOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createSnapshotConsistencyGroupOptions,
      "createSnapshotConsistencyGroupOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/snapshot_consistency_groups"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createSnapshotConsistencyGroup");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createSnapshotConsistencyGroupOptions.snapshotConsistencyGroupPrototype()), "application/json");
    ResponseConverter<SnapshotConsistencyGroup> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SnapshotConsistencyGroup>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a snapshot consistency group.
   *
   * This request deletes snapshot consistency group. This operation cannot be reversed. If the
   * `delete_snapshots_on_delete` property is `true`, all snapshots in the consistency group will also be deleted.
   *
   * @param deleteSnapshotConsistencyGroupOptions the {@link DeleteSnapshotConsistencyGroupOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SnapshotConsistencyGroup}
   */
  public ServiceCall<SnapshotConsistencyGroup> deleteSnapshotConsistencyGroup(DeleteSnapshotConsistencyGroupOptions deleteSnapshotConsistencyGroupOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteSnapshotConsistencyGroupOptions,
      "deleteSnapshotConsistencyGroupOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteSnapshotConsistencyGroupOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/snapshot_consistency_groups/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteSnapshotConsistencyGroup");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<SnapshotConsistencyGroup> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SnapshotConsistencyGroup>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a snapshot consistency group.
   *
   * This request retrieves a single snapshot consistency group specified by the identifier in the URL.
   *
   * @param getSnapshotConsistencyGroupOptions the {@link GetSnapshotConsistencyGroupOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SnapshotConsistencyGroup}
   */
  public ServiceCall<SnapshotConsistencyGroup> getSnapshotConsistencyGroup(GetSnapshotConsistencyGroupOptions getSnapshotConsistencyGroupOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSnapshotConsistencyGroupOptions,
      "getSnapshotConsistencyGroupOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getSnapshotConsistencyGroupOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/snapshot_consistency_groups/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getSnapshotConsistencyGroup");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<SnapshotConsistencyGroup> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SnapshotConsistencyGroup>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a snapshot consistency group.
   *
   * This request updates a snapshot consistency group with the information in a provided snapshot consistency group
   * patch. The snapshot consistency group patch object is structured in the same way as a retrieved snapshot
   * consistency group and contains only the information to be updated.
   *
   * @param updateSnapshotConsistencyGroupOptions the {@link UpdateSnapshotConsistencyGroupOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SnapshotConsistencyGroup}
   */
  public ServiceCall<SnapshotConsistencyGroup> updateSnapshotConsistencyGroup(UpdateSnapshotConsistencyGroupOptions updateSnapshotConsistencyGroupOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateSnapshotConsistencyGroupOptions,
      "updateSnapshotConsistencyGroupOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateSnapshotConsistencyGroupOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/snapshot_consistency_groups/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateSnapshotConsistencyGroup");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateSnapshotConsistencyGroupOptions.ifMatch() != null) {
      builder.header("If-Match", updateSnapshotConsistencyGroupOptions.ifMatch());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateSnapshotConsistencyGroupOptions.snapshotConsistencyGroupPatch()), "application/merge-patch+json");
    ResponseConverter<SnapshotConsistencyGroup> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SnapshotConsistencyGroup>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a filtered collection of snapshots.
   *
   * This request deletes snapshots that match the specified filter. This operation cannot be reversed.
   *
   * @param deleteSnapshotsOptions the {@link DeleteSnapshotsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteSnapshots(DeleteSnapshotsOptions deleteSnapshotsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteSnapshotsOptions,
      "deleteSnapshotsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/snapshots"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteSnapshots");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.query("source_volume.id", String.valueOf(deleteSnapshotsOptions.sourceVolumeId()));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List snapshots.
   *
   * This request lists snapshots in the region. A snapshot preserves the data of a volume at the time the snapshot is
   * created.
   *
   * @param listSnapshotsOptions the {@link ListSnapshotsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SnapshotCollection}
   */
  public ServiceCall<SnapshotCollection> listSnapshots(ListSnapshotsOptions listSnapshotsOptions) {
    if (listSnapshotsOptions == null) {
      listSnapshotsOptions = new ListSnapshotsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/snapshots"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listSnapshots");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listSnapshotsOptions.start() != null) {
      builder.query("start", String.valueOf(listSnapshotsOptions.start()));
    }
    if (listSnapshotsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listSnapshotsOptions.limit()));
    }
    if (listSnapshotsOptions.tag() != null) {
      builder.query("tag", String.valueOf(listSnapshotsOptions.tag()));
    }
    if (listSnapshotsOptions.resourceGroupId() != null) {
      builder.query("resource_group.id", String.valueOf(listSnapshotsOptions.resourceGroupId()));
    }
    if (listSnapshotsOptions.name() != null) {
      builder.query("name", String.valueOf(listSnapshotsOptions.name()));
    }
    if (listSnapshotsOptions.sourceVolumeId() != null) {
      builder.query("source_volume.id", String.valueOf(listSnapshotsOptions.sourceVolumeId()));
    }
    if (listSnapshotsOptions.sourceVolumeCrn() != null) {
      builder.query("source_volume.crn", String.valueOf(listSnapshotsOptions.sourceVolumeCrn()));
    }
    if (listSnapshotsOptions.sourceImageId() != null) {
      builder.query("source_image.id", String.valueOf(listSnapshotsOptions.sourceImageId()));
    }
    if (listSnapshotsOptions.sourceImageCrn() != null) {
      builder.query("source_image.crn", String.valueOf(listSnapshotsOptions.sourceImageCrn()));
    }
    if (listSnapshotsOptions.sort() != null) {
      builder.query("sort", String.valueOf(listSnapshotsOptions.sort()));
    }
    if (listSnapshotsOptions.backupPolicyPlanId() != null) {
      builder.query("backup_policy_plan.id", String.valueOf(listSnapshotsOptions.backupPolicyPlanId()));
    }
    if (listSnapshotsOptions.copiesId() != null) {
      builder.query("copies[].id", String.valueOf(listSnapshotsOptions.copiesId()));
    }
    if (listSnapshotsOptions.copiesName() != null) {
      builder.query("copies[].name", String.valueOf(listSnapshotsOptions.copiesName()));
    }
    if (listSnapshotsOptions.copiesCrn() != null) {
      builder.query("copies[].crn", String.valueOf(listSnapshotsOptions.copiesCrn()));
    }
    if (listSnapshotsOptions.copiesRemoteRegionName() != null) {
      builder.query("copies[].remote.region.name", String.valueOf(listSnapshotsOptions.copiesRemoteRegionName()));
    }
    if (listSnapshotsOptions.sourceSnapshotId() != null) {
      builder.query("source_snapshot.id", String.valueOf(listSnapshotsOptions.sourceSnapshotId()));
    }
    if (listSnapshotsOptions.sourceSnapshotRemoteRegionName() != null) {
      builder.query("source_snapshot.remote.region.name", String.valueOf(listSnapshotsOptions.sourceSnapshotRemoteRegionName()));
    }
    if (listSnapshotsOptions.sourceVolumeRemoteRegionName() != null) {
      builder.query("source_volume.remote.region.name", String.valueOf(listSnapshotsOptions.sourceVolumeRemoteRegionName()));
    }
    if (listSnapshotsOptions.sourceImageRemoteRegionName() != null) {
      builder.query("source_image.remote.region.name", String.valueOf(listSnapshotsOptions.sourceImageRemoteRegionName()));
    }
    if (listSnapshotsOptions.clonesZoneName() != null) {
      builder.query("clones[].zone.name", String.valueOf(listSnapshotsOptions.clonesZoneName()));
    }
    if (listSnapshotsOptions.snapshotConsistencyGroupId() != null) {
      builder.query("snapshot_consistency_group.id", String.valueOf(listSnapshotsOptions.snapshotConsistencyGroupId()));
    }
    if (listSnapshotsOptions.snapshotConsistencyGroupCrn() != null) {
      builder.query("snapshot_consistency_group.crn", String.valueOf(listSnapshotsOptions.snapshotConsistencyGroupCrn()));
    }
    ResponseConverter<SnapshotCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SnapshotCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List snapshots.
   *
   * This request lists snapshots in the region. A snapshot preserves the data of a volume at the time the snapshot is
   * created.
   *
   * @return a {@link ServiceCall} with a result of type {@link SnapshotCollection}
   */
  public ServiceCall<SnapshotCollection> listSnapshots() {
    return listSnapshots(null);
  }

  /**
   * Create a snapshot.
   *
   * This request creates a new snapshot from a snapshot prototype object.  The prototype object is structured in the
   * same way as a retrieved snapshot, and contains the information necessary to provision the new snapshot.
   *
   * @param createSnapshotOptions the {@link CreateSnapshotOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Snapshot}
   */
  public ServiceCall<Snapshot> createSnapshot(CreateSnapshotOptions createSnapshotOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createSnapshotOptions,
      "createSnapshotOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/snapshots"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createSnapshot");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createSnapshotOptions.snapshotPrototype()), "application/json");
    ResponseConverter<Snapshot> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Snapshot>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a snapshot.
   *
   * This request deletes a snapshot. This operation cannot be reversed.
   *
   * @param deleteSnapshotOptions the {@link DeleteSnapshotOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteSnapshot(DeleteSnapshotOptions deleteSnapshotOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteSnapshotOptions,
      "deleteSnapshotOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteSnapshotOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/snapshots/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteSnapshot");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteSnapshotOptions.ifMatch() != null) {
      builder.header("If-Match", deleteSnapshotOptions.ifMatch());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a snapshot.
   *
   * This request retrieves a single snapshot specified by the identifier in the URL.
   *
   * @param getSnapshotOptions the {@link GetSnapshotOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Snapshot}
   */
  public ServiceCall<Snapshot> getSnapshot(GetSnapshotOptions getSnapshotOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSnapshotOptions,
      "getSnapshotOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getSnapshotOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/snapshots/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getSnapshot");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Snapshot> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Snapshot>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a snapshot.
   *
   * This request updates a snapshot with the information in a provided snapshot patch. The snapshot consistency group
   * patch object is structured in the same way as a retrieved snapshot and contains only the information to be updated.
   *
   * @param updateSnapshotOptions the {@link UpdateSnapshotOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Snapshot}
   */
  public ServiceCall<Snapshot> updateSnapshot(UpdateSnapshotOptions updateSnapshotOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateSnapshotOptions,
      "updateSnapshotOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateSnapshotOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/snapshots/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateSnapshot");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateSnapshotOptions.ifMatch() != null) {
      builder.header("If-Match", updateSnapshotOptions.ifMatch());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateSnapshotOptions.snapshotPatch()), "application/merge-patch+json");
    ResponseConverter<Snapshot> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Snapshot>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List clones for a snapshot.
   *
   * This request lists clones for a snapshot. Use a clone to quickly restore a snapshot within the clone's zone.
   *
   * @param listSnapshotClonesOptions the {@link ListSnapshotClonesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SnapshotCloneCollection}
   */
  public ServiceCall<SnapshotCloneCollection> listSnapshotClones(ListSnapshotClonesOptions listSnapshotClonesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listSnapshotClonesOptions,
      "listSnapshotClonesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", listSnapshotClonesOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/snapshots/{id}/clones", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listSnapshotClones");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<SnapshotCloneCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SnapshotCloneCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a snapshot clone.
   *
   * This request deletes a snapshot clone. This operation cannot be reversed, but an equivalent clone may be recreated
   * from the snapshot.
   *
   * @param deleteSnapshotCloneOptions the {@link DeleteSnapshotCloneOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteSnapshotClone(DeleteSnapshotCloneOptions deleteSnapshotCloneOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteSnapshotCloneOptions,
      "deleteSnapshotCloneOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteSnapshotCloneOptions.id());
    pathParamsMap.put("zone_name", deleteSnapshotCloneOptions.zoneName());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/snapshots/{id}/clones/{zone_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteSnapshotClone");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a snapshot clone.
   *
   * This request retrieves a single clone specified by the snapshot identifier and zone name in the URL.
   *
   * @param getSnapshotCloneOptions the {@link GetSnapshotCloneOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SnapshotClone}
   */
  public ServiceCall<SnapshotClone> getSnapshotClone(GetSnapshotCloneOptions getSnapshotCloneOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSnapshotCloneOptions,
      "getSnapshotCloneOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getSnapshotCloneOptions.id());
    pathParamsMap.put("zone_name", getSnapshotCloneOptions.zoneName());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/snapshots/{id}/clones/{zone_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getSnapshotClone");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<SnapshotClone> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SnapshotClone>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a clone for a snapshot.
   *
   * This request creates a new clone for a snapshot in the specified zone. A request body is not required, and if
   * provided, is ignored. If the snapshot already has a clone in the zone, it is returned.
   *
   * @param createSnapshotCloneOptions the {@link CreateSnapshotCloneOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SnapshotClone}
   */
  public ServiceCall<SnapshotClone> createSnapshotClone(CreateSnapshotCloneOptions createSnapshotCloneOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createSnapshotCloneOptions,
      "createSnapshotCloneOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", createSnapshotCloneOptions.id());
    pathParamsMap.put("zone_name", createSnapshotCloneOptions.zoneName());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/snapshots/{id}/clones/{zone_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createSnapshotClone");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<SnapshotClone> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SnapshotClone>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List file share profiles.
   *
   * This request lists [file share profiles](https://cloud.ibm.com/docs/vpc?topic=vpc-file-storage-profiles) available
   * in the region. A file share profile specifies the performance characteristics and pricing model for a file share.
   *
   * @param listShareProfilesOptions the {@link ListShareProfilesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ShareProfileCollection}
   */
  public ServiceCall<ShareProfileCollection> listShareProfiles(ListShareProfilesOptions listShareProfilesOptions) {
    if (listShareProfilesOptions == null) {
      listShareProfilesOptions = new ListShareProfilesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/share/profiles"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listShareProfiles");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listShareProfilesOptions.start() != null) {
      builder.query("start", String.valueOf(listShareProfilesOptions.start()));
    }
    if (listShareProfilesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listShareProfilesOptions.limit()));
    }
    if (listShareProfilesOptions.sort() != null) {
      builder.query("sort", String.valueOf(listShareProfilesOptions.sort()));
    }
    ResponseConverter<ShareProfileCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ShareProfileCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List file share profiles.
   *
   * This request lists [file share profiles](https://cloud.ibm.com/docs/vpc?topic=vpc-file-storage-profiles) available
   * in the region. A file share profile specifies the performance characteristics and pricing model for a file share.
   *
   * @return a {@link ServiceCall} with a result of type {@link ShareProfileCollection}
   */
  public ServiceCall<ShareProfileCollection> listShareProfiles() {
    return listShareProfiles(null);
  }

  /**
   * Retrieve a file share profile.
   *
   * This request retrieves a single file share profile specified by the name in the URL.
   *
   * @param getShareProfileOptions the {@link GetShareProfileOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ShareProfile}
   */
  public ServiceCall<ShareProfile> getShareProfile(GetShareProfileOptions getShareProfileOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getShareProfileOptions,
      "getShareProfileOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("name", getShareProfileOptions.name());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/share/profiles/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getShareProfile");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<ShareProfile> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ShareProfile>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List file shares.
   *
   * This request lists file shares in the region.
   *
   * @param listSharesOptions the {@link ListSharesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ShareCollection}
   */
  public ServiceCall<ShareCollection> listShares(ListSharesOptions listSharesOptions) {
    if (listSharesOptions == null) {
      listSharesOptions = new ListSharesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/shares"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listShares");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listSharesOptions.start() != null) {
      builder.query("start", String.valueOf(listSharesOptions.start()));
    }
    if (listSharesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listSharesOptions.limit()));
    }
    if (listSharesOptions.resourceGroupId() != null) {
      builder.query("resource_group.id", String.valueOf(listSharesOptions.resourceGroupId()));
    }
    if (listSharesOptions.name() != null) {
      builder.query("name", String.valueOf(listSharesOptions.name()));
    }
    if (listSharesOptions.sort() != null) {
      builder.query("sort", String.valueOf(listSharesOptions.sort()));
    }
    if (listSharesOptions.replicationRole() != null) {
      builder.query("replication_role", String.valueOf(listSharesOptions.replicationRole()));
    }
    ResponseConverter<ShareCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ShareCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List file shares.
   *
   * This request lists file shares in the region.
   *
   * @return a {@link ServiceCall} with a result of type {@link ShareCollection}
   */
  public ServiceCall<ShareCollection> listShares() {
    return listShares(null);
  }

  /**
   * Create a file share.
   *
   * This request provisions new file shares from a share prototype object. The new file shares can be a standalone
   * share, a replica share, or both a source and replica share.
   *
   * The prototype object is structured in the same way as a retrieved share, and contains the information necessary to
   * provision the new file shares.
   *
   * @param createShareOptions the {@link CreateShareOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Share}
   */
  public ServiceCall<Share> createShare(CreateShareOptions createShareOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createShareOptions,
      "createShareOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/shares"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createShare");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createShareOptions.sharePrototype()), "application/json");
    ResponseConverter<Share> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Share>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a file share.
   *
   * This request deletes a share. This operation cannot be reversed. A share cannot be deleted if it:
   * - has share mount targets
   * - has a `lifecycle_state` of `updating`
   * - has a replication operation in progress
   *
   * If the request is accepted, the share `lifecycle_state` will be set to `deleting`. Once deletion processing
   * completes, it will no longer be retrievable.
   *
   * @param deleteShareOptions the {@link DeleteShareOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Share}
   */
  public ServiceCall<Share> deleteShare(DeleteShareOptions deleteShareOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteShareOptions,
      "deleteShareOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteShareOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/shares/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteShare");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (deleteShareOptions.ifMatch() != null) {
      builder.header("If-Match", deleteShareOptions.ifMatch());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Share> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Share>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a file share.
   *
   * This request retrieves a single file share specified by the identifier in the URL.
   *
   * @param getShareOptions the {@link GetShareOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Share}
   */
  public ServiceCall<Share> getShare(GetShareOptions getShareOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getShareOptions,
      "getShareOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getShareOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/shares/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getShare");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Share> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Share>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a file share.
   *
   * This request updates a share with the information in a provided share patch. The share patch object is structured
   * in the same way as a retrieved share and contains only the information to be updated.
   *
   * @param updateShareOptions the {@link UpdateShareOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Share}
   */
  public ServiceCall<Share> updateShare(UpdateShareOptions updateShareOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateShareOptions,
      "updateShareOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateShareOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/shares/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateShare");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateShareOptions.ifMatch() != null) {
      builder.header("If-Match", updateShareOptions.ifMatch());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateShareOptions.sharePatch()), "application/merge-patch+json");
    ResponseConverter<Share> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Share>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List accessor bindings for a file share.
   *
   * This request lists accessor bindings for a share. Each accessor binding identifies a resource (possibly in another
   * account) with access to this file share including its snapshots.
   *
   * The share accessor bindings will be sorted by their `created_at` property values, with newest bindings first.
   *
   * @param listShareAccessorBindingsOptions the {@link ListShareAccessorBindingsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ShareAccessorBindingCollection}
   */
  public ServiceCall<ShareAccessorBindingCollection> listShareAccessorBindings(ListShareAccessorBindingsOptions listShareAccessorBindingsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listShareAccessorBindingsOptions,
      "listShareAccessorBindingsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", listShareAccessorBindingsOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/shares/{id}/accessor_bindings", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listShareAccessorBindings");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listShareAccessorBindingsOptions.start() != null) {
      builder.query("start", String.valueOf(listShareAccessorBindingsOptions.start()));
    }
    if (listShareAccessorBindingsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listShareAccessorBindingsOptions.limit()));
    }
    ResponseConverter<ShareAccessorBindingCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ShareAccessorBindingCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a file share accessor binding.
   *
   * This request deletes a share accessor binding. This operation cannot be reversed.
   *
   * @param deleteShareAccessorBindingOptions the {@link DeleteShareAccessorBindingOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteShareAccessorBinding(DeleteShareAccessorBindingOptions deleteShareAccessorBindingOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteShareAccessorBindingOptions,
      "deleteShareAccessorBindingOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("share_id", deleteShareAccessorBindingOptions.shareId());
    pathParamsMap.put("id", deleteShareAccessorBindingOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/shares/{share_id}/accessor_bindings/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteShareAccessorBinding");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a file share accessor binding.
   *
   * This request retrieves a single accessor binding specified by the identifier in the URL.
   *
   * @param getShareAccessorBindingOptions the {@link GetShareAccessorBindingOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ShareAccessorBinding}
   */
  public ServiceCall<ShareAccessorBinding> getShareAccessorBinding(GetShareAccessorBindingOptions getShareAccessorBindingOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getShareAccessorBindingOptions,
      "getShareAccessorBindingOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("share_id", getShareAccessorBindingOptions.shareId());
    pathParamsMap.put("id", getShareAccessorBindingOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/shares/{share_id}/accessor_bindings/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getShareAccessorBinding");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<ShareAccessorBinding> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ShareAccessorBinding>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Failover to replica file share.
   *
   * This request triggers a failover to the replica file share specified by the identifier in the URL. The failover
   * cannot be started if a source share or the replica share has a `lifecycle_state` of `updating`, or has a
   * replication operation in progress.
   *
   * If `fallback_policy` is specified as `split`, and the request is accepted but the failover operation cannot be
   * performed, a split will be triggered.
   *
   * @param failoverShareOptions the {@link FailoverShareOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> failoverShare(FailoverShareOptions failoverShareOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(failoverShareOptions,
      "failoverShareOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("share_id", failoverShareOptions.shareId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/shares/{share_id}/failover", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "failoverShare");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    if (failoverShareOptions.fallbackPolicy() != null) {
      contentJson.addProperty("fallback_policy", failoverShareOptions.fallbackPolicy());
    }
    if (failoverShareOptions.timeout() != null) {
      contentJson.addProperty("timeout", failoverShareOptions.timeout());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List mount targets for a file share.
   *
   * This request lists mount targets for a file share. A mount target is a network endpoint at which a file share may
   * be mounted. The file share can be mounted by clients in the same VPC and zone after creating share mount targets.
   *
   * The share mount targets will be sorted by their `created_at` property values, with newest targets first.
   *
   * @param listShareMountTargetsOptions the {@link ListShareMountTargetsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ShareMountTargetCollection}
   */
  public ServiceCall<ShareMountTargetCollection> listShareMountTargets(ListShareMountTargetsOptions listShareMountTargetsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listShareMountTargetsOptions,
      "listShareMountTargetsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("share_id", listShareMountTargetsOptions.shareId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/shares/{share_id}/mount_targets", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listShareMountTargets");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listShareMountTargetsOptions.name() != null) {
      builder.query("name", String.valueOf(listShareMountTargetsOptions.name()));
    }
    if (listShareMountTargetsOptions.start() != null) {
      builder.query("start", String.valueOf(listShareMountTargetsOptions.start()));
    }
    if (listShareMountTargetsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listShareMountTargetsOptions.limit()));
    }
    ResponseConverter<ShareMountTargetCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ShareMountTargetCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a mount target for a file share.
   *
   * This request creates a new share mount target from a share mount target prototype object.
   *
   * The prototype object is structured in the same way as a retrieved share mount target, and contains the information
   * necessary to provision the new file share mount target.
   *
   * @param createShareMountTargetOptions the {@link CreateShareMountTargetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ShareMountTarget}
   */
  public ServiceCall<ShareMountTarget> createShareMountTarget(CreateShareMountTargetOptions createShareMountTargetOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createShareMountTargetOptions,
      "createShareMountTargetOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("share_id", createShareMountTargetOptions.shareId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/shares/{share_id}/mount_targets", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createShareMountTarget");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createShareMountTargetOptions.shareMountTargetPrototype()), "application/json");
    ResponseConverter<ShareMountTarget> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ShareMountTarget>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a file share mount target.
   *
   * This request deletes a share mount target. This operation cannot be reversed.
   *
   * If the request is accepted, the share mount target `lifecycle_state` will be set to
   * `deleting`. Once deletion processing completes, it will no longer be retrievable.
   *
   * @param deleteShareMountTargetOptions the {@link DeleteShareMountTargetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ShareMountTarget}
   */
  public ServiceCall<ShareMountTarget> deleteShareMountTarget(DeleteShareMountTargetOptions deleteShareMountTargetOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteShareMountTargetOptions,
      "deleteShareMountTargetOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("share_id", deleteShareMountTargetOptions.shareId());
    pathParamsMap.put("id", deleteShareMountTargetOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/shares/{share_id}/mount_targets/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteShareMountTarget");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<ShareMountTarget> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ShareMountTarget>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a file share mount target.
   *
   * This request retrieves a single share mount target specified by the identifier in the URL.
   *
   * @param getShareMountTargetOptions the {@link GetShareMountTargetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ShareMountTarget}
   */
  public ServiceCall<ShareMountTarget> getShareMountTarget(GetShareMountTargetOptions getShareMountTargetOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getShareMountTargetOptions,
      "getShareMountTargetOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("share_id", getShareMountTargetOptions.shareId());
    pathParamsMap.put("id", getShareMountTargetOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/shares/{share_id}/mount_targets/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getShareMountTarget");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<ShareMountTarget> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ShareMountTarget>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a file share mount target.
   *
   * This request updates a share mount target with the information provided in a share mount target patch object. The
   * share mount target patch object is structured in the same way as a retrieved share mount target and needs to
   * contain only the information to be updated.
   *
   * @param updateShareMountTargetOptions the {@link UpdateShareMountTargetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ShareMountTarget}
   */
  public ServiceCall<ShareMountTarget> updateShareMountTarget(UpdateShareMountTargetOptions updateShareMountTargetOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateShareMountTargetOptions,
      "updateShareMountTargetOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("share_id", updateShareMountTargetOptions.shareId());
    pathParamsMap.put("id", updateShareMountTargetOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/shares/{share_id}/mount_targets/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateShareMountTarget");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateShareMountTargetOptions.shareMountTargetPatch()), "application/merge-patch+json");
    ResponseConverter<ShareMountTarget> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ShareMountTarget>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List file share snapshots.
   *
   * This request lists snapshots for the specified file share, or across all accessible file shares. A snapshot
   * preserves the data of a share at the time the snapshot was captured.
   *
   * If the file share is a replica, the list will contain snapshots corresponding to snapshots on the source.
   *
   * @param listShareSnapshotsOptions the {@link ListShareSnapshotsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ShareSnapshotCollection}
   */
  public ServiceCall<ShareSnapshotCollection> listShareSnapshots(ListShareSnapshotsOptions listShareSnapshotsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listShareSnapshotsOptions,
      "listShareSnapshotsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("share_id", listShareSnapshotsOptions.shareId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/shares/{share_id}/snapshots", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listShareSnapshots");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listShareSnapshotsOptions.backupPolicyPlanId() != null) {
      builder.query("backup_policy_plan.id", String.valueOf(listShareSnapshotsOptions.backupPolicyPlanId()));
    }
    if (listShareSnapshotsOptions.name() != null) {
      builder.query("name", String.valueOf(listShareSnapshotsOptions.name()));
    }
    if (listShareSnapshotsOptions.start() != null) {
      builder.query("start", String.valueOf(listShareSnapshotsOptions.start()));
    }
    if (listShareSnapshotsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listShareSnapshotsOptions.limit()));
    }
    if (listShareSnapshotsOptions.sort() != null) {
      builder.query("sort", String.valueOf(listShareSnapshotsOptions.sort()));
    }
    ResponseConverter<ShareSnapshotCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ShareSnapshotCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a snapshot for a file share.
   *
   * This request creates a new share snapshot from a share snapshot prototype object. The prototype object is
   * structured in the same way as a retrieved share snapshot, and contains the information necessary to create the new
   * share snapshot.
   *
   * The share must have an `access_control_mode` of `security_group` and a `replication_role` of `source` or `none`.
   *
   * The snapshot will inherit its `resource_group` and encryption settings from the share.
   *
   * If the share has a `replication_role` of `source`, a corresponding snapshot on the replica share will be created
   * with a `status` of `pending`. It will remain in
   * `pending` until the data is synchronized per the replication schedule determined by the replica share's
   * `replication_cron_spec`.
   *
   * @param createShareSnapshotOptions the {@link CreateShareSnapshotOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ShareSnapshot}
   */
  public ServiceCall<ShareSnapshot> createShareSnapshot(CreateShareSnapshotOptions createShareSnapshotOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createShareSnapshotOptions,
      "createShareSnapshotOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("share_id", createShareSnapshotOptions.shareId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/shares/{share_id}/snapshots", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createShareSnapshot");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    if (createShareSnapshotOptions.name() != null) {
      contentJson.addProperty("name", createShareSnapshotOptions.name());
    }
    if (createShareSnapshotOptions.userTags() != null) {
      contentJson.add("user_tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createShareSnapshotOptions.userTags()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ShareSnapshot> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ShareSnapshot>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a share snapshot.
   *
   * This request deletes a share snapshot. This operation cannot be reversed. For this request to succeed, the share
   * must have a `replication_role` of `source` or `none`.
   *
   * If the request is accepted, the share snapshot `lifecycle_state` will be set to
   * `deleting`. Once deletion processing completes, the share snapshot will no longer be retrievable.
   *
   * Deleting a share snapshot will not affect any previously-accepted requests to create a share from it.
   *
   * If the share has a `replication_role` of `source`, the corresponding snapshot on the replica share will be
   * subsequently moved to a `lifecycle_state` of `deleting`. If the data for the corresponding snapshot has already
   * been synchronized via the replication schedule determined by `replication_cron_spec`, the snapshot will remain
   * available in the replica share's `.snapshot` directory until the next replication sync.
   *
   * @param deleteShareSnapshotOptions the {@link DeleteShareSnapshotOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ShareSnapshot}
   */
  public ServiceCall<ShareSnapshot> deleteShareSnapshot(DeleteShareSnapshotOptions deleteShareSnapshotOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteShareSnapshotOptions,
      "deleteShareSnapshotOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("share_id", deleteShareSnapshotOptions.shareId());
    pathParamsMap.put("id", deleteShareSnapshotOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/shares/{share_id}/snapshots/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteShareSnapshot");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<ShareSnapshot> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ShareSnapshot>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a share snapshot.
   *
   * This request retrieves a single share snapshot specified by the identifier in the URL.
   *
   * @param getShareSnapshotOptions the {@link GetShareSnapshotOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ShareSnapshot}
   */
  public ServiceCall<ShareSnapshot> getShareSnapshot(GetShareSnapshotOptions getShareSnapshotOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getShareSnapshotOptions,
      "getShareSnapshotOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("share_id", getShareSnapshotOptions.shareId());
    pathParamsMap.put("id", getShareSnapshotOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/shares/{share_id}/snapshots/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getShareSnapshot");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<ShareSnapshot> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ShareSnapshot>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a share snapshot.
   *
   * This request updates a share snapshot with the information provided in a share snapshot patch object. The share
   * snapshot patch object is structured in the same way as a retrieved share snapshot and needs to contain only the
   * information to be updated.
   *
   * @param updateShareSnapshotOptions the {@link UpdateShareSnapshotOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ShareSnapshot}
   */
  public ServiceCall<ShareSnapshot> updateShareSnapshot(UpdateShareSnapshotOptions updateShareSnapshotOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateShareSnapshotOptions,
      "updateShareSnapshotOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("share_id", updateShareSnapshotOptions.shareId());
    pathParamsMap.put("id", updateShareSnapshotOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/shares/{share_id}/snapshots/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateShareSnapshot");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateShareSnapshotOptions.ifMatch() != null) {
      builder.header("If-Match", updateShareSnapshotOptions.ifMatch());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateShareSnapshotOptions.shareSnapshotPatch()), "application/merge-patch+json");
    ResponseConverter<ShareSnapshot> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ShareSnapshot>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Split the source file share from a replica file share.
   *
   * This request removes the replication relationship between a source share and the replica share specified by the
   * identifier in the URL. The replication relationship cannot be removed if a source share or the replica share has a
   * `lifecycle_state` of `updating`, or has a replication operation in progress.
   *
   * This operation cannot be reversed.
   *
   * @param deleteShareSourceOptions the {@link DeleteShareSourceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteShareSource(DeleteShareSourceOptions deleteShareSourceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteShareSourceOptions,
      "deleteShareSourceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("share_id", deleteShareSourceOptions.shareId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/shares/{share_id}/source", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteShareSource");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve the source file share for a replica file share.
   *
   * This request retrieves the source file share associated with the replica file share specified by the identifier in
   * the URL.
   *
   * @param getShareSourceOptions the {@link GetShareSourceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ShareReference}
   */
  public ServiceCall<ShareReference> getShareSource(GetShareSourceOptions getShareSourceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getShareSourceOptions,
      "getShareSourceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("share_id", getShareSourceOptions.shareId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/shares/{share_id}/source", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getShareSource");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<ShareReference> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ShareReference>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List backup policies.
   *
   * This request lists backup policies in the region. Backup policies control which sources are selected for backup and
   * include a set of backup policy plans that provide the backup schedules and deletion triggers.
   *
   * @param listBackupPoliciesOptions the {@link ListBackupPoliciesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BackupPolicyCollection}
   */
  public ServiceCall<BackupPolicyCollection> listBackupPolicies(ListBackupPoliciesOptions listBackupPoliciesOptions) {
    if (listBackupPoliciesOptions == null) {
      listBackupPoliciesOptions = new ListBackupPoliciesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/backup_policies"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listBackupPolicies");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listBackupPoliciesOptions.start() != null) {
      builder.query("start", String.valueOf(listBackupPoliciesOptions.start()));
    }
    if (listBackupPoliciesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listBackupPoliciesOptions.limit()));
    }
    if (listBackupPoliciesOptions.resourceGroupId() != null) {
      builder.query("resource_group.id", String.valueOf(listBackupPoliciesOptions.resourceGroupId()));
    }
    if (listBackupPoliciesOptions.name() != null) {
      builder.query("name", String.valueOf(listBackupPoliciesOptions.name()));
    }
    if (listBackupPoliciesOptions.tag() != null) {
      builder.query("tag", String.valueOf(listBackupPoliciesOptions.tag()));
    }
    ResponseConverter<BackupPolicyCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BackupPolicyCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List backup policies.
   *
   * This request lists backup policies in the region. Backup policies control which sources are selected for backup and
   * include a set of backup policy plans that provide the backup schedules and deletion triggers.
   *
   * @return a {@link ServiceCall} with a result of type {@link BackupPolicyCollection}
   */
  public ServiceCall<BackupPolicyCollection> listBackupPolicies() {
    return listBackupPolicies(null);
  }

  /**
   * Create a backup policy.
   *
   * This request creates a new backup policy from a backup policy prototype object. The prototype object is structured
   * in the same way as a retrieved backup policy, and contains the information necessary to create the new backup
   * policy.
   *
   * @param createBackupPolicyOptions the {@link CreateBackupPolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BackupPolicy}
   */
  public ServiceCall<BackupPolicy> createBackupPolicy(CreateBackupPolicyOptions createBackupPolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createBackupPolicyOptions,
      "createBackupPolicyOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/backup_policies"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createBackupPolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createBackupPolicyOptions.backupPolicyPrototype()), "application/json");
    ResponseConverter<BackupPolicy> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BackupPolicy>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List jobs for a backup policy.
   *
   * This request retrieves jobs for a backup policy. A backup job represents the execution of a backup policy plan for
   * a resource matching the policy's criteria.
   *
   * @param listBackupPolicyJobsOptions the {@link ListBackupPolicyJobsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BackupPolicyJobCollection}
   */
  public ServiceCall<BackupPolicyJobCollection> listBackupPolicyJobs(ListBackupPolicyJobsOptions listBackupPolicyJobsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listBackupPolicyJobsOptions,
      "listBackupPolicyJobsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("backup_policy_id", listBackupPolicyJobsOptions.backupPolicyId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/backup_policies/{backup_policy_id}/jobs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listBackupPolicyJobs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listBackupPolicyJobsOptions.status() != null) {
      builder.query("status", String.valueOf(listBackupPolicyJobsOptions.status()));
    }
    if (listBackupPolicyJobsOptions.backupPolicyPlanId() != null) {
      builder.query("backup_policy_plan.id", String.valueOf(listBackupPolicyJobsOptions.backupPolicyPlanId()));
    }
    if (listBackupPolicyJobsOptions.start() != null) {
      builder.query("start", String.valueOf(listBackupPolicyJobsOptions.start()));
    }
    if (listBackupPolicyJobsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listBackupPolicyJobsOptions.limit()));
    }
    if (listBackupPolicyJobsOptions.sort() != null) {
      builder.query("sort", String.valueOf(listBackupPolicyJobsOptions.sort()));
    }
    if (listBackupPolicyJobsOptions.sourceId() != null) {
      builder.query("source.id", String.valueOf(listBackupPolicyJobsOptions.sourceId()));
    }
    if (listBackupPolicyJobsOptions.targetSnapshotsId() != null) {
      builder.query("target_snapshots[].id", String.valueOf(listBackupPolicyJobsOptions.targetSnapshotsId()));
    }
    if (listBackupPolicyJobsOptions.targetSnapshotsCrn() != null) {
      builder.query("target_snapshots[].crn", String.valueOf(listBackupPolicyJobsOptions.targetSnapshotsCrn()));
    }
    ResponseConverter<BackupPolicyJobCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BackupPolicyJobCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a backup policy job.
   *
   * This request retrieves a single backup policy job specified by the identifier in the URL.
   *
   * @param getBackupPolicyJobOptions the {@link GetBackupPolicyJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BackupPolicyJob}
   */
  public ServiceCall<BackupPolicyJob> getBackupPolicyJob(GetBackupPolicyJobOptions getBackupPolicyJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getBackupPolicyJobOptions,
      "getBackupPolicyJobOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("backup_policy_id", getBackupPolicyJobOptions.backupPolicyId());
    pathParamsMap.put("id", getBackupPolicyJobOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/backup_policies/{backup_policy_id}/jobs/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getBackupPolicyJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<BackupPolicyJob> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BackupPolicyJob>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List plans for a backup policy.
   *
   * This request retrieves plans for a backup policy. Backup plans provide the backup schedule and deletion triggers.
   *
   * @param listBackupPolicyPlansOptions the {@link ListBackupPolicyPlansOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BackupPolicyPlanCollection}
   */
  public ServiceCall<BackupPolicyPlanCollection> listBackupPolicyPlans(ListBackupPolicyPlansOptions listBackupPolicyPlansOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listBackupPolicyPlansOptions,
      "listBackupPolicyPlansOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("backup_policy_id", listBackupPolicyPlansOptions.backupPolicyId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/backup_policies/{backup_policy_id}/plans", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listBackupPolicyPlans");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listBackupPolicyPlansOptions.name() != null) {
      builder.query("name", String.valueOf(listBackupPolicyPlansOptions.name()));
    }
    ResponseConverter<BackupPolicyPlanCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BackupPolicyPlanCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a plan for a backup policy.
   *
   * This request creates a new backup policy plan from a backup policy plan prototype object. The prototype object is
   * structured in the same way as a retrieved backup policy plan, and contains the information necessary to create the
   * new backup policy plan.
   *
   * Backups created by this plan will use the resource group of the source being backed up.
   *
   * Backups created by this plan will use the plan's name truncated to 46 characters, followed by a unique 16-character
   * suffix.
   *
   * @param createBackupPolicyPlanOptions the {@link CreateBackupPolicyPlanOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BackupPolicyPlan}
   */
  public ServiceCall<BackupPolicyPlan> createBackupPolicyPlan(CreateBackupPolicyPlanOptions createBackupPolicyPlanOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createBackupPolicyPlanOptions,
      "createBackupPolicyPlanOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("backup_policy_id", createBackupPolicyPlanOptions.backupPolicyId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/backup_policies/{backup_policy_id}/plans", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createBackupPolicyPlan");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("cron_spec", createBackupPolicyPlanOptions.cronSpec());
    if (createBackupPolicyPlanOptions.active() != null) {
      contentJson.addProperty("active", createBackupPolicyPlanOptions.active());
    }
    if (createBackupPolicyPlanOptions.attachUserTags() != null) {
      contentJson.add("attach_user_tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createBackupPolicyPlanOptions.attachUserTags()));
    }
    if (createBackupPolicyPlanOptions.clonePolicy() != null) {
      contentJson.add("clone_policy", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createBackupPolicyPlanOptions.clonePolicy()));
    }
    if (createBackupPolicyPlanOptions.copyUserTags() != null) {
      contentJson.addProperty("copy_user_tags", createBackupPolicyPlanOptions.copyUserTags());
    }
    if (createBackupPolicyPlanOptions.deletionTrigger() != null) {
      contentJson.add("deletion_trigger", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createBackupPolicyPlanOptions.deletionTrigger()));
    }
    if (createBackupPolicyPlanOptions.name() != null) {
      contentJson.addProperty("name", createBackupPolicyPlanOptions.name());
    }
    if (createBackupPolicyPlanOptions.remoteRegionPolicies() != null) {
      contentJson.add("remote_region_policies", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createBackupPolicyPlanOptions.remoteRegionPolicies()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<BackupPolicyPlan> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BackupPolicyPlan>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a backup policy plan.
   *
   * This request deletes a backup policy plan. This operation cannot be reversed. Any backups that have been created by
   * the plan will remain but will no longer be subject to the plan's deletion trigger. Any running jobs associated with
   * the plan will run to completion before the plan is deleted.
   *
   * If the request is accepted, the backup policy plan `status` will be set to `deleting`. Once deletion processing
   * completes, the backup policy plan will no longer be retrievable.
   *
   * @param deleteBackupPolicyPlanOptions the {@link DeleteBackupPolicyPlanOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BackupPolicyPlan}
   */
  public ServiceCall<BackupPolicyPlan> deleteBackupPolicyPlan(DeleteBackupPolicyPlanOptions deleteBackupPolicyPlanOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteBackupPolicyPlanOptions,
      "deleteBackupPolicyPlanOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("backup_policy_id", deleteBackupPolicyPlanOptions.backupPolicyId());
    pathParamsMap.put("id", deleteBackupPolicyPlanOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/backup_policies/{backup_policy_id}/plans/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteBackupPolicyPlan");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (deleteBackupPolicyPlanOptions.ifMatch() != null) {
      builder.header("If-Match", deleteBackupPolicyPlanOptions.ifMatch());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<BackupPolicyPlan> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BackupPolicyPlan>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a backup policy plan.
   *
   * This request retrieves a single backup policy plan specified by the identifier in the URL.
   *
   * @param getBackupPolicyPlanOptions the {@link GetBackupPolicyPlanOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BackupPolicyPlan}
   */
  public ServiceCall<BackupPolicyPlan> getBackupPolicyPlan(GetBackupPolicyPlanOptions getBackupPolicyPlanOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getBackupPolicyPlanOptions,
      "getBackupPolicyPlanOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("backup_policy_id", getBackupPolicyPlanOptions.backupPolicyId());
    pathParamsMap.put("id", getBackupPolicyPlanOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/backup_policies/{backup_policy_id}/plans/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getBackupPolicyPlan");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<BackupPolicyPlan> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BackupPolicyPlan>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a backup policy plan.
   *
   * This request updates a backup policy plan with the information in a provided plan patch. The plan patch object is
   * structured in the same way as a retrieved backup policy plan and can contains only the information to be updated.
   *
   * @param updateBackupPolicyPlanOptions the {@link UpdateBackupPolicyPlanOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BackupPolicyPlan}
   */
  public ServiceCall<BackupPolicyPlan> updateBackupPolicyPlan(UpdateBackupPolicyPlanOptions updateBackupPolicyPlanOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateBackupPolicyPlanOptions,
      "updateBackupPolicyPlanOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("backup_policy_id", updateBackupPolicyPlanOptions.backupPolicyId());
    pathParamsMap.put("id", updateBackupPolicyPlanOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/backup_policies/{backup_policy_id}/plans/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateBackupPolicyPlan");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateBackupPolicyPlanOptions.ifMatch() != null) {
      builder.header("If-Match", updateBackupPolicyPlanOptions.ifMatch());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateBackupPolicyPlanOptions.backupPolicyPlanPatch()), "application/merge-patch+json");
    ResponseConverter<BackupPolicyPlan> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BackupPolicyPlan>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a backup policy.
   *
   * This request deletes a backup policy. This operation cannot be reversed.
   *
   * If the request is accepted, the backup policy `status` will be set to `deleting`. Once deletion processing
   * completes, the backup policy will no longer be retrievable.
   *
   * @param deleteBackupPolicyOptions the {@link DeleteBackupPolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BackupPolicy}
   */
  public ServiceCall<BackupPolicy> deleteBackupPolicy(DeleteBackupPolicyOptions deleteBackupPolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteBackupPolicyOptions,
      "deleteBackupPolicyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteBackupPolicyOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/backup_policies/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteBackupPolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (deleteBackupPolicyOptions.ifMatch() != null) {
      builder.header("If-Match", deleteBackupPolicyOptions.ifMatch());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<BackupPolicy> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BackupPolicy>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a backup policy.
   *
   * This request retrieves a single backup policy specified by the identifier in the URL.
   *
   * @param getBackupPolicyOptions the {@link GetBackupPolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BackupPolicy}
   */
  public ServiceCall<BackupPolicy> getBackupPolicy(GetBackupPolicyOptions getBackupPolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getBackupPolicyOptions,
      "getBackupPolicyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getBackupPolicyOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/backup_policies/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getBackupPolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<BackupPolicy> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BackupPolicy>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a backup policy.
   *
   * This request updates a backup policy with the information in a provided backup policy patch. The backup policy
   * patch object is structured in the same way as a retrieved backup policy and contains only the information to be
   * updated.
   *
   * @param updateBackupPolicyOptions the {@link UpdateBackupPolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BackupPolicy}
   */
  public ServiceCall<BackupPolicy> updateBackupPolicy(UpdateBackupPolicyOptions updateBackupPolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateBackupPolicyOptions,
      "updateBackupPolicyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateBackupPolicyOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/backup_policies/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateBackupPolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateBackupPolicyOptions.ifMatch() != null) {
      builder.header("If-Match", updateBackupPolicyOptions.ifMatch());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateBackupPolicyOptions.backupPolicyPatch()), "application/merge-patch+json");
    ResponseConverter<BackupPolicy> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BackupPolicy>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List regions.
   *
   * This request lists regions. Each region is a separate geographic area that contains multiple isolated zones.
   * Resources can be provisioned into one or more zones in a region. Each zone is isolated, but connected to other
   * zones in the same region with low-latency and high-bandwidth links. Regions represent the top-level of fault
   * isolation available. Resources deployed within a single region also benefit from the low latency afforded by
   * geographic proximity.
   *
   * @param listRegionsOptions the {@link ListRegionsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RegionCollection}
   */
  public ServiceCall<RegionCollection> listRegions(ListRegionsOptions listRegionsOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/regions"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listRegions");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<RegionCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RegionCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List regions.
   *
   * This request lists regions. Each region is a separate geographic area that contains multiple isolated zones.
   * Resources can be provisioned into one or more zones in a region. Each zone is isolated, but connected to other
   * zones in the same region with low-latency and high-bandwidth links. Regions represent the top-level of fault
   * isolation available. Resources deployed within a single region also benefit from the low latency afforded by
   * geographic proximity.
   *
   * @return a {@link ServiceCall} with a result of type {@link RegionCollection}
   */
  public ServiceCall<RegionCollection> listRegions() {
    return listRegions(null);
  }

  /**
   * Retrieve a region.
   *
   * This request retrieves a single region specified by the name in the URL.
   *
   * @param getRegionOptions the {@link GetRegionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Region}
   */
  public ServiceCall<Region> getRegion(GetRegionOptions getRegionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getRegionOptions,
      "getRegionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("name", getRegionOptions.name());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/regions/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getRegion");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Region> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Region>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List zones in a region.
   *
   * This request lists zones in a region. Zones represent logically-isolated data centers with high-bandwidth and
   * low-latency interconnects to other zones in the same region. Faults in a zone do not affect other zones.
   *
   * @param listRegionZonesOptions the {@link ListRegionZonesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ZoneCollection}
   */
  public ServiceCall<ZoneCollection> listRegionZones(ListRegionZonesOptions listRegionZonesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listRegionZonesOptions,
      "listRegionZonesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("region_name", listRegionZonesOptions.regionName());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/regions/{region_name}/zones", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listRegionZones");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<ZoneCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ZoneCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a zone.
   *
   * This request retrieves a single zone specified by the region and zone names in the URL.
   *
   * @param getRegionZoneOptions the {@link GetRegionZoneOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Zone}
   */
  public ServiceCall<Zone> getRegionZone(GetRegionZoneOptions getRegionZoneOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getRegionZoneOptions,
      "getRegionZoneOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("region_name", getRegionZoneOptions.regionName());
    pathParamsMap.put("name", getRegionZoneOptions.name());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/regions/{region_name}/zones/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getRegionZone");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Zone> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Zone>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List virtual network interfaces.
   *
   * This request lists virtual network interfaces in the region. A virtual network interface is a logical abstraction
   * of a virtual network interface in a subnet, and may be attached to a target resource.
   *
   * The virtual network interfaces will be sorted by their `created_at` property values, with newest virtual network
   * interfaces first. Virtual network interfaces with identical
   * `created_at` property values will in turn be sorted by ascending `name` property values.
   *
   * @param listVirtualNetworkInterfacesOptions the {@link ListVirtualNetworkInterfacesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VirtualNetworkInterfaceCollection}
   */
  public ServiceCall<VirtualNetworkInterfaceCollection> listVirtualNetworkInterfaces(ListVirtualNetworkInterfacesOptions listVirtualNetworkInterfacesOptions) {
    if (listVirtualNetworkInterfacesOptions == null) {
      listVirtualNetworkInterfacesOptions = new ListVirtualNetworkInterfacesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/virtual_network_interfaces"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listVirtualNetworkInterfaces");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listVirtualNetworkInterfacesOptions.start() != null) {
      builder.query("start", String.valueOf(listVirtualNetworkInterfacesOptions.start()));
    }
    if (listVirtualNetworkInterfacesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listVirtualNetworkInterfacesOptions.limit()));
    }
    if (listVirtualNetworkInterfacesOptions.resourceGroupId() != null) {
      builder.query("resource_group.id", String.valueOf(listVirtualNetworkInterfacesOptions.resourceGroupId()));
    }
    ResponseConverter<VirtualNetworkInterfaceCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VirtualNetworkInterfaceCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List virtual network interfaces.
   *
   * This request lists virtual network interfaces in the region. A virtual network interface is a logical abstraction
   * of a virtual network interface in a subnet, and may be attached to a target resource.
   *
   * The virtual network interfaces will be sorted by their `created_at` property values, with newest virtual network
   * interfaces first. Virtual network interfaces with identical
   * `created_at` property values will in turn be sorted by ascending `name` property values.
   *
   * @return a {@link ServiceCall} with a result of type {@link VirtualNetworkInterfaceCollection}
   */
  public ServiceCall<VirtualNetworkInterfaceCollection> listVirtualNetworkInterfaces() {
    return listVirtualNetworkInterfaces(null);
  }

  /**
   * Create a virtual network interface.
   *
   * This request creates a new virtual network interface from a virtual network interface prototype object. The
   * prototype object is structured in the same way as a retrieved virtual network interface, and contains the
   * information necessary to create the new virtual network interface.
   *
   * @param createVirtualNetworkInterfaceOptions the {@link CreateVirtualNetworkInterfaceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VirtualNetworkInterface}
   */
  public ServiceCall<VirtualNetworkInterface> createVirtualNetworkInterface(CreateVirtualNetworkInterfaceOptions createVirtualNetworkInterfaceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createVirtualNetworkInterfaceOptions,
      "createVirtualNetworkInterfaceOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/virtual_network_interfaces"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createVirtualNetworkInterface");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    if (createVirtualNetworkInterfaceOptions.allowIpSpoofing() != null) {
      contentJson.addProperty("allow_ip_spoofing", createVirtualNetworkInterfaceOptions.allowIpSpoofing());
    }
    if (createVirtualNetworkInterfaceOptions.autoDelete() != null) {
      contentJson.addProperty("auto_delete", createVirtualNetworkInterfaceOptions.autoDelete());
    }
    if (createVirtualNetworkInterfaceOptions.enableInfrastructureNat() != null) {
      contentJson.addProperty("enable_infrastructure_nat", createVirtualNetworkInterfaceOptions.enableInfrastructureNat());
    }
    if (createVirtualNetworkInterfaceOptions.ips() != null) {
      contentJson.add("ips", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createVirtualNetworkInterfaceOptions.ips()));
    }
    if (createVirtualNetworkInterfaceOptions.name() != null) {
      contentJson.addProperty("name", createVirtualNetworkInterfaceOptions.name());
    }
    if (createVirtualNetworkInterfaceOptions.primaryIp() != null) {
      contentJson.add("primary_ip", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createVirtualNetworkInterfaceOptions.primaryIp()));
    }
    if (createVirtualNetworkInterfaceOptions.protocolStateFilteringMode() != null) {
      contentJson.addProperty("protocol_state_filtering_mode", createVirtualNetworkInterfaceOptions.protocolStateFilteringMode());
    }
    if (createVirtualNetworkInterfaceOptions.resourceGroup() != null) {
      contentJson.add("resource_group", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createVirtualNetworkInterfaceOptions.resourceGroup()));
    }
    if (createVirtualNetworkInterfaceOptions.securityGroups() != null) {
      contentJson.add("security_groups", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createVirtualNetworkInterfaceOptions.securityGroups()));
    }
    if (createVirtualNetworkInterfaceOptions.subnet() != null) {
      contentJson.add("subnet", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createVirtualNetworkInterfaceOptions.subnet()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<VirtualNetworkInterface> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VirtualNetworkInterface>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a virtual network interface.
   *
   * This request creates a new virtual network interface from a virtual network interface prototype object. The
   * prototype object is structured in the same way as a retrieved virtual network interface, and contains the
   * information necessary to create the new virtual network interface.
   *
   * @return a {@link ServiceCall} with a result of type {@link VirtualNetworkInterface}
   */
  public ServiceCall<VirtualNetworkInterface> createVirtualNetworkInterface() {
    return createVirtualNetworkInterface(null);
  }

  /**
   * Delete a virtual network interface.
   *
   * This request deletes a virtual network interface. This operation cannot be reversed. For this request to succeed,
   * the virtual network interface must not be required by another resource, such as the primary network attachment for
   * an instance.
   *
   * @param deleteVirtualNetworkInterfacesOptions the {@link DeleteVirtualNetworkInterfacesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VirtualNetworkInterface}
   */
  public ServiceCall<VirtualNetworkInterface> deleteVirtualNetworkInterfaces(DeleteVirtualNetworkInterfacesOptions deleteVirtualNetworkInterfacesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteVirtualNetworkInterfacesOptions,
      "deleteVirtualNetworkInterfacesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteVirtualNetworkInterfacesOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/virtual_network_interfaces/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteVirtualNetworkInterfaces");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<VirtualNetworkInterface> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VirtualNetworkInterface>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a virtual network interface.
   *
   * This request retrieves a single virtual network interface specified by the identifier in the URL.
   *
   * @param getVirtualNetworkInterfaceOptions the {@link GetVirtualNetworkInterfaceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VirtualNetworkInterface}
   */
  public ServiceCall<VirtualNetworkInterface> getVirtualNetworkInterface(GetVirtualNetworkInterfaceOptions getVirtualNetworkInterfaceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getVirtualNetworkInterfaceOptions,
      "getVirtualNetworkInterfaceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getVirtualNetworkInterfaceOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/virtual_network_interfaces/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getVirtualNetworkInterface");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<VirtualNetworkInterface> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VirtualNetworkInterface>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a virtual network interface.
   *
   * This request updates a virtual network interface with the information in a provided virtual network interface
   * patch. The virtual network interface patch object is structured in the same way as a retrieved virtual network
   * interface and contains only the information to be updated.
   *
   * @param updateVirtualNetworkInterfaceOptions the {@link UpdateVirtualNetworkInterfaceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VirtualNetworkInterface}
   */
  public ServiceCall<VirtualNetworkInterface> updateVirtualNetworkInterface(UpdateVirtualNetworkInterfaceOptions updateVirtualNetworkInterfaceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateVirtualNetworkInterfaceOptions,
      "updateVirtualNetworkInterfaceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateVirtualNetworkInterfaceOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/virtual_network_interfaces/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateVirtualNetworkInterface");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateVirtualNetworkInterfaceOptions.virtualNetworkInterfacePatch()), "application/merge-patch+json");
    ResponseConverter<VirtualNetworkInterface> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VirtualNetworkInterface>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List floating IPs associated with a virtual network interface.
   *
   * This request lists floating IPs associated with a virtual network interface.
   *
   * @param listNetworkInterfaceFloatingIpsOptions the {@link ListNetworkInterfaceFloatingIpsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link FloatingIPCollectionVirtualNetworkInterfaceContext}
   */
  public ServiceCall<FloatingIPCollectionVirtualNetworkInterfaceContext> listNetworkInterfaceFloatingIps(ListNetworkInterfaceFloatingIpsOptions listNetworkInterfaceFloatingIpsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listNetworkInterfaceFloatingIpsOptions,
      "listNetworkInterfaceFloatingIpsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("virtual_network_interface_id", listNetworkInterfaceFloatingIpsOptions.virtualNetworkInterfaceId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/virtual_network_interfaces/{virtual_network_interface_id}/floating_ips", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listNetworkInterfaceFloatingIps");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listNetworkInterfaceFloatingIpsOptions.start() != null) {
      builder.query("start", String.valueOf(listNetworkInterfaceFloatingIpsOptions.start()));
    }
    if (listNetworkInterfaceFloatingIpsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listNetworkInterfaceFloatingIpsOptions.limit()));
    }
    if (listNetworkInterfaceFloatingIpsOptions.sort() != null) {
      builder.query("sort", String.valueOf(listNetworkInterfaceFloatingIpsOptions.sort()));
    }
    ResponseConverter<FloatingIPCollectionVirtualNetworkInterfaceContext> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<FloatingIPCollectionVirtualNetworkInterfaceContext>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Disassociate a floating IP from a virtual network interface.
   *
   * This request disassociates the specified floating IP from the specified virtual network interface.
   *
   * @param removeNetworkInterfaceFloatingIpOptions the {@link RemoveNetworkInterfaceFloatingIpOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> removeNetworkInterfaceFloatingIp(RemoveNetworkInterfaceFloatingIpOptions removeNetworkInterfaceFloatingIpOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(removeNetworkInterfaceFloatingIpOptions,
      "removeNetworkInterfaceFloatingIpOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("virtual_network_interface_id", removeNetworkInterfaceFloatingIpOptions.virtualNetworkInterfaceId());
    pathParamsMap.put("id", removeNetworkInterfaceFloatingIpOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/virtual_network_interfaces/{virtual_network_interface_id}/floating_ips/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "removeNetworkInterfaceFloatingIp");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve associated floating IP.
   *
   * This request retrieves a specified floating IP if it is associated with the virtual network interface specified in
   * the URL.
   *
   * @param getNetworkInterfaceFloatingIpOptions the {@link GetNetworkInterfaceFloatingIpOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link FloatingIPReference}
   */
  public ServiceCall<FloatingIPReference> getNetworkInterfaceFloatingIp(GetNetworkInterfaceFloatingIpOptions getNetworkInterfaceFloatingIpOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getNetworkInterfaceFloatingIpOptions,
      "getNetworkInterfaceFloatingIpOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("virtual_network_interface_id", getNetworkInterfaceFloatingIpOptions.virtualNetworkInterfaceId());
    pathParamsMap.put("id", getNetworkInterfaceFloatingIpOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/virtual_network_interfaces/{virtual_network_interface_id}/floating_ips/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getNetworkInterfaceFloatingIp");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<FloatingIPReference> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<FloatingIPReference>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Add an association between a floating IP and a virtual network interface.
   *
   * This request adds an association between the specified floating IP and the specified virtual network interface.
   *
   * If the virtual network interface has `enable_infrastructure_nat` set to `true`, no more than one floating IP can be
   * associated, and network address translation is performed between the floating IP address and the virtual network
   * interface's `primary_ip` address.
   *
   * If the virtual network interface has `enable_infrastructure_nat` set to `false`, packets are passed unchanged
   * to/from the virtual network interface.
   *
   * The floating IP must:
   * - be in the same `zone` as the virtual network interface
   * - not currently be associated with another resource
   *
   * The virtual network interface's `target` must not currently be a file share mount target.
   *
   * A request body is not required, and if provided, is ignored.
   *
   * @param addNetworkInterfaceFloatingIpOptions the {@link AddNetworkInterfaceFloatingIpOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link FloatingIPReference}
   */
  public ServiceCall<FloatingIPReference> addNetworkInterfaceFloatingIp(AddNetworkInterfaceFloatingIpOptions addNetworkInterfaceFloatingIpOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(addNetworkInterfaceFloatingIpOptions,
      "addNetworkInterfaceFloatingIpOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("virtual_network_interface_id", addNetworkInterfaceFloatingIpOptions.virtualNetworkInterfaceId());
    pathParamsMap.put("id", addNetworkInterfaceFloatingIpOptions.id());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/virtual_network_interfaces/{virtual_network_interface_id}/floating_ips/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "addNetworkInterfaceFloatingIp");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<FloatingIPReference> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<FloatingIPReference>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List reserved IPs bound to a virtual network interface.
   *
   * This request lists reserved IPs bound to a virtual network interface.
   *
   * @param listVirtualNetworkInterfaceIpsOptions the {@link ListVirtualNetworkInterfaceIpsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ReservedIPCollectionVirtualNetworkInterfaceContext}
   */
  public ServiceCall<ReservedIPCollectionVirtualNetworkInterfaceContext> listVirtualNetworkInterfaceIps(ListVirtualNetworkInterfaceIpsOptions listVirtualNetworkInterfaceIpsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listVirtualNetworkInterfaceIpsOptions,
      "listVirtualNetworkInterfaceIpsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("virtual_network_interface_id", listVirtualNetworkInterfaceIpsOptions.virtualNetworkInterfaceId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/virtual_network_interfaces/{virtual_network_interface_id}/ips", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listVirtualNetworkInterfaceIps");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listVirtualNetworkInterfaceIpsOptions.start() != null) {
      builder.query("start", String.valueOf(listVirtualNetworkInterfaceIpsOptions.start()));
    }
    if (listVirtualNetworkInterfaceIpsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listVirtualNetworkInterfaceIpsOptions.limit()));
    }
    if (listVirtualNetworkInterfaceIpsOptions.sort() != null) {
      builder.query("sort", String.valueOf(listVirtualNetworkInterfaceIpsOptions.sort()));
    }
    ResponseConverter<ReservedIPCollectionVirtualNetworkInterfaceContext> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ReservedIPCollectionVirtualNetworkInterfaceContext>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Unbind a reserved IP from a virtual network interface.
   *
   * This request unbinds the specified reserved IP from the specified virtual network interface. If the reserved IP has
   * `auto_delete` set to `true`, the reserved IP will be deleted.
   *
   * The reserved IP for the `primary_ip` cannot be unbound.
   *
   * @param removeVirtualNetworkInterfaceIpOptions the {@link RemoveVirtualNetworkInterfaceIpOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> removeVirtualNetworkInterfaceIp(RemoveVirtualNetworkInterfaceIpOptions removeVirtualNetworkInterfaceIpOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(removeVirtualNetworkInterfaceIpOptions,
      "removeVirtualNetworkInterfaceIpOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("virtual_network_interface_id", removeVirtualNetworkInterfaceIpOptions.virtualNetworkInterfaceId());
    pathParamsMap.put("id", removeVirtualNetworkInterfaceIpOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/virtual_network_interfaces/{virtual_network_interface_id}/ips/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "removeVirtualNetworkInterfaceIp");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve bound reserved IP.
   *
   * This request retrieves the specified reserved IP address if it is bound to the virtual network interface specified
   * in the URL.
   *
   * @param getVirtualNetworkInterfaceIpOptions the {@link GetVirtualNetworkInterfaceIpOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ReservedIPReference}
   */
  public ServiceCall<ReservedIPReference> getVirtualNetworkInterfaceIp(GetVirtualNetworkInterfaceIpOptions getVirtualNetworkInterfaceIpOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getVirtualNetworkInterfaceIpOptions,
      "getVirtualNetworkInterfaceIpOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("virtual_network_interface_id", getVirtualNetworkInterfaceIpOptions.virtualNetworkInterfaceId());
    pathParamsMap.put("id", getVirtualNetworkInterfaceIpOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/virtual_network_interfaces/{virtual_network_interface_id}/ips/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getVirtualNetworkInterfaceIp");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<ReservedIPReference> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ReservedIPReference>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Bind a reserved IP to a virtual network interface.
   *
   * This request binds the specified reserved IP to the specified virtual network interface.
   *
   * The reserved IP must currently be unbound and in the primary IP's subnet. The virtual network interface's `target`
   * must not currently be a file share mount target.
   *
   * @param addVirtualNetworkInterfaceIpOptions the {@link AddVirtualNetworkInterfaceIpOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ReservedIPReference}
   */
  public ServiceCall<ReservedIPReference> addVirtualNetworkInterfaceIp(AddVirtualNetworkInterfaceIpOptions addVirtualNetworkInterfaceIpOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(addVirtualNetworkInterfaceIpOptions,
      "addVirtualNetworkInterfaceIpOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("virtual_network_interface_id", addVirtualNetworkInterfaceIpOptions.virtualNetworkInterfaceId());
    pathParamsMap.put("id", addVirtualNetworkInterfaceIpOptions.id());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/virtual_network_interfaces/{virtual_network_interface_id}/ips/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "addVirtualNetworkInterfaceIp");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<ReservedIPReference> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ReservedIPReference>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List cluster network profiles.
   *
   * This request lists cluster network profiles available in the region. A cluster network profile specifies the
   * performance characteristics and capabilities for a cluster network.
   *
   * @param listClusterNetworkProfilesOptions the {@link ListClusterNetworkProfilesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ClusterNetworkProfileCollection}
   */
  public ServiceCall<ClusterNetworkProfileCollection> listClusterNetworkProfiles(ListClusterNetworkProfilesOptions listClusterNetworkProfilesOptions) {
    if (listClusterNetworkProfilesOptions == null) {
      listClusterNetworkProfilesOptions = new ListClusterNetworkProfilesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/cluster_network/profiles"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listClusterNetworkProfiles");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listClusterNetworkProfilesOptions.start() != null) {
      builder.query("start", String.valueOf(listClusterNetworkProfilesOptions.start()));
    }
    if (listClusterNetworkProfilesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listClusterNetworkProfilesOptions.limit()));
    }
    ResponseConverter<ClusterNetworkProfileCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ClusterNetworkProfileCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List cluster network profiles.
   *
   * This request lists cluster network profiles available in the region. A cluster network profile specifies the
   * performance characteristics and capabilities for a cluster network.
   *
   * @return a {@link ServiceCall} with a result of type {@link ClusterNetworkProfileCollection}
   */
  public ServiceCall<ClusterNetworkProfileCollection> listClusterNetworkProfiles() {
    return listClusterNetworkProfiles(null);
  }

  /**
   * Retrieve a cluster network profile.
   *
   * This request retrieves a single cluster network profile specified by the name in the URL.
   *
   * @param getClusterNetworkProfileOptions the {@link GetClusterNetworkProfileOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ClusterNetworkProfile}
   */
  public ServiceCall<ClusterNetworkProfile> getClusterNetworkProfile(GetClusterNetworkProfileOptions getClusterNetworkProfileOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getClusterNetworkProfileOptions,
      "getClusterNetworkProfileOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("name", getClusterNetworkProfileOptions.name());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/cluster_network/profiles/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getClusterNetworkProfile");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<ClusterNetworkProfile> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ClusterNetworkProfile>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List cluster networks.
   *
   * This request lists [cluster networks](https://cloud.ibm.com/docs/vpc?topic=vpc-about-cluster-network) in the
   * region. A cluster network is a grouping of resources in a separate networking space for high performance computing
   * and networking.
   *
   * @param listClusterNetworksOptions the {@link ListClusterNetworksOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ClusterNetworkCollection}
   */
  public ServiceCall<ClusterNetworkCollection> listClusterNetworks(ListClusterNetworksOptions listClusterNetworksOptions) {
    if (listClusterNetworksOptions == null) {
      listClusterNetworksOptions = new ListClusterNetworksOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/cluster_networks"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listClusterNetworks");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listClusterNetworksOptions.start() != null) {
      builder.query("start", String.valueOf(listClusterNetworksOptions.start()));
    }
    if (listClusterNetworksOptions.limit() != null) {
      builder.query("limit", String.valueOf(listClusterNetworksOptions.limit()));
    }
    if (listClusterNetworksOptions.resourceGroupId() != null) {
      builder.query("resource_group.id", String.valueOf(listClusterNetworksOptions.resourceGroupId()));
    }
    if (listClusterNetworksOptions.name() != null) {
      builder.query("name", String.valueOf(listClusterNetworksOptions.name()));
    }
    if (listClusterNetworksOptions.sort() != null) {
      builder.query("sort", String.valueOf(listClusterNetworksOptions.sort()));
    }
    if (listClusterNetworksOptions.vpcId() != null) {
      builder.query("vpc.id", String.valueOf(listClusterNetworksOptions.vpcId()));
    }
    if (listClusterNetworksOptions.vpcCrn() != null) {
      builder.query("vpc.crn", String.valueOf(listClusterNetworksOptions.vpcCrn()));
    }
    if (listClusterNetworksOptions.vpcName() != null) {
      builder.query("vpc.name", String.valueOf(listClusterNetworksOptions.vpcName()));
    }
    ResponseConverter<ClusterNetworkCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ClusterNetworkCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List cluster networks.
   *
   * This request lists [cluster networks](https://cloud.ibm.com/docs/vpc?topic=vpc-about-cluster-network) in the
   * region. A cluster network is a grouping of resources in a separate networking space for high performance computing
   * and networking.
   *
   * @return a {@link ServiceCall} with a result of type {@link ClusterNetworkCollection}
   */
  public ServiceCall<ClusterNetworkCollection> listClusterNetworks() {
    return listClusterNetworks(null);
  }

  /**
   * Create a cluster network.
   *
   * This request creates a new cluster network from a cluster network prototype object. The prototype object is
   * structured in the same way as a retrieved cluster network, and contains the information necessary to create the new
   * cluster network.
   *
   * @param createClusterNetworkOptions the {@link CreateClusterNetworkOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ClusterNetwork}
   */
  public ServiceCall<ClusterNetwork> createClusterNetwork(CreateClusterNetworkOptions createClusterNetworkOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createClusterNetworkOptions,
      "createClusterNetworkOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/cluster_networks"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createClusterNetwork");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("profile", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createClusterNetworkOptions.profile()));
    contentJson.add("vpc", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createClusterNetworkOptions.vpc()));
    contentJson.add("zone", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createClusterNetworkOptions.zone()));
    if (createClusterNetworkOptions.name() != null) {
      contentJson.addProperty("name", createClusterNetworkOptions.name());
    }
    if (createClusterNetworkOptions.resourceGroup() != null) {
      contentJson.add("resource_group", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createClusterNetworkOptions.resourceGroup()));
    }
    if (createClusterNetworkOptions.subnetPrefixes() != null) {
      contentJson.add("subnet_prefixes", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createClusterNetworkOptions.subnetPrefixes()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ClusterNetwork> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ClusterNetwork>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List cluster network interfaces.
   *
   * This request lists cluster network interfaces in the region. A cluster network interface is a logical abstraction
   * of a cluster network interface in a subnet, and may be attached to a target resource.
   *
   * The cluster network interfaces will be sorted by their `created_at` property values, with newest cluster network
   * interfaces first. Cluster network interfaces with identical
   * `created_at` property values will in turn be sorted by ascending `name` property values.
   *
   * @param listClusterNetworkInterfacesOptions the {@link ListClusterNetworkInterfacesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ClusterNetworkInterfaceCollection}
   */
  public ServiceCall<ClusterNetworkInterfaceCollection> listClusterNetworkInterfaces(ListClusterNetworkInterfacesOptions listClusterNetworkInterfacesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listClusterNetworkInterfacesOptions,
      "listClusterNetworkInterfacesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("cluster_network_id", listClusterNetworkInterfacesOptions.clusterNetworkId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/cluster_networks/{cluster_network_id}/interfaces", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listClusterNetworkInterfaces");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listClusterNetworkInterfacesOptions.start() != null) {
      builder.query("start", String.valueOf(listClusterNetworkInterfacesOptions.start()));
    }
    if (listClusterNetworkInterfacesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listClusterNetworkInterfacesOptions.limit()));
    }
    if (listClusterNetworkInterfacesOptions.name() != null) {
      builder.query("name", String.valueOf(listClusterNetworkInterfacesOptions.name()));
    }
    if (listClusterNetworkInterfacesOptions.sort() != null) {
      builder.query("sort", String.valueOf(listClusterNetworkInterfacesOptions.sort()));
    }
    ResponseConverter<ClusterNetworkInterfaceCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ClusterNetworkInterfaceCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a cluster network interface.
   *
   * This request creates a new cluster network interface from a cluster network interface prototype object. The
   * prototype object is structured in the same way as a retrieved cluster network interface, and contains the
   * information necessary to create the new cluster network interface.
   *
   * @param createClusterNetworkInterfaceOptions the {@link CreateClusterNetworkInterfaceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ClusterNetworkInterface}
   */
  public ServiceCall<ClusterNetworkInterface> createClusterNetworkInterface(CreateClusterNetworkInterfaceOptions createClusterNetworkInterfaceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createClusterNetworkInterfaceOptions,
      "createClusterNetworkInterfaceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("cluster_network_id", createClusterNetworkInterfaceOptions.clusterNetworkId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/cluster_networks/{cluster_network_id}/interfaces", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createClusterNetworkInterface");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    if (createClusterNetworkInterfaceOptions.name() != null) {
      contentJson.addProperty("name", createClusterNetworkInterfaceOptions.name());
    }
    if (createClusterNetworkInterfaceOptions.primaryIp() != null) {
      contentJson.add("primary_ip", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createClusterNetworkInterfaceOptions.primaryIp()));
    }
    if (createClusterNetworkInterfaceOptions.subnet() != null) {
      contentJson.add("subnet", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createClusterNetworkInterfaceOptions.subnet()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ClusterNetworkInterface> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ClusterNetworkInterface>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a cluster network interface.
   *
   * This request deletes a cluster network interface. This operation cannot be reversed. For this request to succeed,
   * the cluster network interface must not be required by another resource, such as a cluster network attachment for a
   * virtual server instance.
   *
   * @param deleteClusterNetworkInterfaceOptions the {@link DeleteClusterNetworkInterfaceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ClusterNetworkInterface}
   */
  public ServiceCall<ClusterNetworkInterface> deleteClusterNetworkInterface(DeleteClusterNetworkInterfaceOptions deleteClusterNetworkInterfaceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteClusterNetworkInterfaceOptions,
      "deleteClusterNetworkInterfaceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("cluster_network_id", deleteClusterNetworkInterfaceOptions.clusterNetworkId());
    pathParamsMap.put("id", deleteClusterNetworkInterfaceOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/cluster_networks/{cluster_network_id}/interfaces/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteClusterNetworkInterface");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (deleteClusterNetworkInterfaceOptions.ifMatch() != null) {
      builder.header("If-Match", deleteClusterNetworkInterfaceOptions.ifMatch());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<ClusterNetworkInterface> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ClusterNetworkInterface>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a cluster network interface.
   *
   * This request retrieves a single cluster network interface specified by the identifier in the URL.
   *
   * @param getClusterNetworkInterfaceOptions the {@link GetClusterNetworkInterfaceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ClusterNetworkInterface}
   */
  public ServiceCall<ClusterNetworkInterface> getClusterNetworkInterface(GetClusterNetworkInterfaceOptions getClusterNetworkInterfaceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getClusterNetworkInterfaceOptions,
      "getClusterNetworkInterfaceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("cluster_network_id", getClusterNetworkInterfaceOptions.clusterNetworkId());
    pathParamsMap.put("id", getClusterNetworkInterfaceOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/cluster_networks/{cluster_network_id}/interfaces/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getClusterNetworkInterface");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<ClusterNetworkInterface> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ClusterNetworkInterface>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a cluster network interface.
   *
   * This request updates a cluster network interface with the information provided in a cluster network interface patch
   * object. The patch object is structured in the same way as a retrieved cluster network interface and needs to
   * contain only the information to be updated.
   *
   * @param updateClusterNetworkInterfaceOptions the {@link UpdateClusterNetworkInterfaceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ClusterNetworkInterface}
   */
  public ServiceCall<ClusterNetworkInterface> updateClusterNetworkInterface(UpdateClusterNetworkInterfaceOptions updateClusterNetworkInterfaceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateClusterNetworkInterfaceOptions,
      "updateClusterNetworkInterfaceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("cluster_network_id", updateClusterNetworkInterfaceOptions.clusterNetworkId());
    pathParamsMap.put("id", updateClusterNetworkInterfaceOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/cluster_networks/{cluster_network_id}/interfaces/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateClusterNetworkInterface");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateClusterNetworkInterfaceOptions.ifMatch() != null) {
      builder.header("If-Match", updateClusterNetworkInterfaceOptions.ifMatch());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateClusterNetworkInterfaceOptions.clusterNetworkInterfacePatch()), "application/merge-patch+json");
    ResponseConverter<ClusterNetworkInterface> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ClusterNetworkInterface>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List cluster network subnets.
   *
   * This request lists cluster network subnets in the cluster network. A cluster network subnet provides network
   * routing between other cluster network subnets within a cluster network.
   *
   * @param listClusterNetworkSubnetsOptions the {@link ListClusterNetworkSubnetsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ClusterNetworkSubnetCollection}
   */
  public ServiceCall<ClusterNetworkSubnetCollection> listClusterNetworkSubnets(ListClusterNetworkSubnetsOptions listClusterNetworkSubnetsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listClusterNetworkSubnetsOptions,
      "listClusterNetworkSubnetsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("cluster_network_id", listClusterNetworkSubnetsOptions.clusterNetworkId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/cluster_networks/{cluster_network_id}/subnets", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listClusterNetworkSubnets");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listClusterNetworkSubnetsOptions.start() != null) {
      builder.query("start", String.valueOf(listClusterNetworkSubnetsOptions.start()));
    }
    if (listClusterNetworkSubnetsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listClusterNetworkSubnetsOptions.limit()));
    }
    if (listClusterNetworkSubnetsOptions.name() != null) {
      builder.query("name", String.valueOf(listClusterNetworkSubnetsOptions.name()));
    }
    if (listClusterNetworkSubnetsOptions.sort() != null) {
      builder.query("sort", String.valueOf(listClusterNetworkSubnetsOptions.sort()));
    }
    ResponseConverter<ClusterNetworkSubnetCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ClusterNetworkSubnetCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a cluster network subnet.
   *
   * This request creates a new cluster network subnet from a cluster network subnet prototype object. The prototype
   * object is structured in the same way as a retrieved cluster network subnet, and contains the information necessary
   * to create the new cluster network subnet.
   *
   * @param createClusterNetworkSubnetOptions the {@link CreateClusterNetworkSubnetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ClusterNetworkSubnet}
   */
  public ServiceCall<ClusterNetworkSubnet> createClusterNetworkSubnet(CreateClusterNetworkSubnetOptions createClusterNetworkSubnetOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createClusterNetworkSubnetOptions,
      "createClusterNetworkSubnetOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("cluster_network_id", createClusterNetworkSubnetOptions.clusterNetworkId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/cluster_networks/{cluster_network_id}/subnets", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createClusterNetworkSubnet");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createClusterNetworkSubnetOptions.clusterNetworkSubnetPrototype()), "application/json");
    ResponseConverter<ClusterNetworkSubnet> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ClusterNetworkSubnet>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List cluster network subnet reserved IPs.
   *
   * This request lists cluster network subnet reserved IPs in the cluster network.
   *
   * @param listClusterNetworkSubnetReservedIpsOptions the {@link ListClusterNetworkSubnetReservedIpsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ClusterNetworkSubnetReservedIPCollection}
   */
  public ServiceCall<ClusterNetworkSubnetReservedIPCollection> listClusterNetworkSubnetReservedIps(ListClusterNetworkSubnetReservedIpsOptions listClusterNetworkSubnetReservedIpsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listClusterNetworkSubnetReservedIpsOptions,
      "listClusterNetworkSubnetReservedIpsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("cluster_network_id", listClusterNetworkSubnetReservedIpsOptions.clusterNetworkId());
    pathParamsMap.put("cluster_network_subnet_id", listClusterNetworkSubnetReservedIpsOptions.clusterNetworkSubnetId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/cluster_networks/{cluster_network_id}/subnets/{cluster_network_subnet_id}/reserved_ips", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listClusterNetworkSubnetReservedIps");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listClusterNetworkSubnetReservedIpsOptions.start() != null) {
      builder.query("start", String.valueOf(listClusterNetworkSubnetReservedIpsOptions.start()));
    }
    if (listClusterNetworkSubnetReservedIpsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listClusterNetworkSubnetReservedIpsOptions.limit()));
    }
    if (listClusterNetworkSubnetReservedIpsOptions.name() != null) {
      builder.query("name", String.valueOf(listClusterNetworkSubnetReservedIpsOptions.name()));
    }
    if (listClusterNetworkSubnetReservedIpsOptions.sort() != null) {
      builder.query("sort", String.valueOf(listClusterNetworkSubnetReservedIpsOptions.sort()));
    }
    ResponseConverter<ClusterNetworkSubnetReservedIPCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ClusterNetworkSubnetReservedIPCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a cluster network subnet reserved IP.
   *
   * This request creates a new cluster network subnet reserved IP from a cluster network subnet reserved IP prototype
   * object. The prototype object is structured in the same way as a retrieved cluster network subnet reserved IP, and
   * contains the information necessary to create the new cluster network subnet reserved IP.
   *
   * @param createClusterNetworkSubnetReservedIpOptions the {@link CreateClusterNetworkSubnetReservedIpOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ClusterNetworkSubnetReservedIP}
   */
  public ServiceCall<ClusterNetworkSubnetReservedIP> createClusterNetworkSubnetReservedIp(CreateClusterNetworkSubnetReservedIpOptions createClusterNetworkSubnetReservedIpOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createClusterNetworkSubnetReservedIpOptions,
      "createClusterNetworkSubnetReservedIpOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("cluster_network_id", createClusterNetworkSubnetReservedIpOptions.clusterNetworkId());
    pathParamsMap.put("cluster_network_subnet_id", createClusterNetworkSubnetReservedIpOptions.clusterNetworkSubnetId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/cluster_networks/{cluster_network_id}/subnets/{cluster_network_subnet_id}/reserved_ips", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createClusterNetworkSubnetReservedIp");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    if (createClusterNetworkSubnetReservedIpOptions.address() != null) {
      contentJson.addProperty("address", createClusterNetworkSubnetReservedIpOptions.address());
    }
    if (createClusterNetworkSubnetReservedIpOptions.name() != null) {
      contentJson.addProperty("name", createClusterNetworkSubnetReservedIpOptions.name());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ClusterNetworkSubnetReservedIP> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ClusterNetworkSubnetReservedIP>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a cluster network subnet reserved IP.
   *
   * This request deletes a cluster network subnet reserved IP. This operation cannot be reversed.
   *
   * For this request to succeed, the reserved IP must be unbound. A provider-owned reserved IP is not allowed to be
   * deleted.
   *
   * @param deleteClusterNetworkSubnetReservedIpOptions the {@link DeleteClusterNetworkSubnetReservedIpOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ClusterNetworkSubnetReservedIP}
   */
  public ServiceCall<ClusterNetworkSubnetReservedIP> deleteClusterNetworkSubnetReservedIp(DeleteClusterNetworkSubnetReservedIpOptions deleteClusterNetworkSubnetReservedIpOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteClusterNetworkSubnetReservedIpOptions,
      "deleteClusterNetworkSubnetReservedIpOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("cluster_network_id", deleteClusterNetworkSubnetReservedIpOptions.clusterNetworkId());
    pathParamsMap.put("cluster_network_subnet_id", deleteClusterNetworkSubnetReservedIpOptions.clusterNetworkSubnetId());
    pathParamsMap.put("id", deleteClusterNetworkSubnetReservedIpOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/cluster_networks/{cluster_network_id}/subnets/{cluster_network_subnet_id}/reserved_ips/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteClusterNetworkSubnetReservedIp");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (deleteClusterNetworkSubnetReservedIpOptions.ifMatch() != null) {
      builder.header("If-Match", deleteClusterNetworkSubnetReservedIpOptions.ifMatch());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<ClusterNetworkSubnetReservedIP> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ClusterNetworkSubnetReservedIP>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a cluster network subnet reserved IP.
   *
   * This request retrieves a single cluster network subnet reserved IP specified by the identifier in the URL.
   *
   * @param getClusterNetworkSubnetReservedIpOptions the {@link GetClusterNetworkSubnetReservedIpOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ClusterNetworkSubnetReservedIP}
   */
  public ServiceCall<ClusterNetworkSubnetReservedIP> getClusterNetworkSubnetReservedIp(GetClusterNetworkSubnetReservedIpOptions getClusterNetworkSubnetReservedIpOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getClusterNetworkSubnetReservedIpOptions,
      "getClusterNetworkSubnetReservedIpOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("cluster_network_id", getClusterNetworkSubnetReservedIpOptions.clusterNetworkId());
    pathParamsMap.put("cluster_network_subnet_id", getClusterNetworkSubnetReservedIpOptions.clusterNetworkSubnetId());
    pathParamsMap.put("id", getClusterNetworkSubnetReservedIpOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/cluster_networks/{cluster_network_id}/subnets/{cluster_network_subnet_id}/reserved_ips/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getClusterNetworkSubnetReservedIp");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<ClusterNetworkSubnetReservedIP> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ClusterNetworkSubnetReservedIP>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a cluster network subnet reserved IP.
   *
   * This request updates a cluster network subnet reserved IP with the information provided in a cluster network subnet
   * reserved IP patch object. The patch object is structured in the same way as a retrieved cluster network subnet
   * reserved IP and needs to contain only the information to be updated.
   *
   * @param updateClusterNetworkSubnetReservedIpOptions the {@link UpdateClusterNetworkSubnetReservedIpOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ClusterNetworkSubnetReservedIP}
   */
  public ServiceCall<ClusterNetworkSubnetReservedIP> updateClusterNetworkSubnetReservedIp(UpdateClusterNetworkSubnetReservedIpOptions updateClusterNetworkSubnetReservedIpOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateClusterNetworkSubnetReservedIpOptions,
      "updateClusterNetworkSubnetReservedIpOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("cluster_network_id", updateClusterNetworkSubnetReservedIpOptions.clusterNetworkId());
    pathParamsMap.put("cluster_network_subnet_id", updateClusterNetworkSubnetReservedIpOptions.clusterNetworkSubnetId());
    pathParamsMap.put("id", updateClusterNetworkSubnetReservedIpOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/cluster_networks/{cluster_network_id}/subnets/{cluster_network_subnet_id}/reserved_ips/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateClusterNetworkSubnetReservedIp");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateClusterNetworkSubnetReservedIpOptions.ifMatch() != null) {
      builder.header("If-Match", updateClusterNetworkSubnetReservedIpOptions.ifMatch());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateClusterNetworkSubnetReservedIpOptions.clusterNetworkSubnetReservedIpPatch()), "application/merge-patch+json");
    ResponseConverter<ClusterNetworkSubnetReservedIP> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ClusterNetworkSubnetReservedIP>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a cluster network subnet.
   *
   * This request deletes a cluster network subnet. This operation cannot be reversed.
   *
   * For this request to succeed, this cluster subnet must not be attached to a cluster network interface.
   *
   * @param deleteClusterNetworkSubnetOptions the {@link DeleteClusterNetworkSubnetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ClusterNetworkSubnet}
   */
  public ServiceCall<ClusterNetworkSubnet> deleteClusterNetworkSubnet(DeleteClusterNetworkSubnetOptions deleteClusterNetworkSubnetOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteClusterNetworkSubnetOptions,
      "deleteClusterNetworkSubnetOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("cluster_network_id", deleteClusterNetworkSubnetOptions.clusterNetworkId());
    pathParamsMap.put("id", deleteClusterNetworkSubnetOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/cluster_networks/{cluster_network_id}/subnets/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteClusterNetworkSubnet");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (deleteClusterNetworkSubnetOptions.ifMatch() != null) {
      builder.header("If-Match", deleteClusterNetworkSubnetOptions.ifMatch());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<ClusterNetworkSubnet> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ClusterNetworkSubnet>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a cluster network subnet.
   *
   * This request retrieves a single cluster network subnet specified by the identifier in the URL.
   *
   * @param getClusterNetworkSubnetOptions the {@link GetClusterNetworkSubnetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ClusterNetworkSubnet}
   */
  public ServiceCall<ClusterNetworkSubnet> getClusterNetworkSubnet(GetClusterNetworkSubnetOptions getClusterNetworkSubnetOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getClusterNetworkSubnetOptions,
      "getClusterNetworkSubnetOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("cluster_network_id", getClusterNetworkSubnetOptions.clusterNetworkId());
    pathParamsMap.put("id", getClusterNetworkSubnetOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/cluster_networks/{cluster_network_id}/subnets/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getClusterNetworkSubnet");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<ClusterNetworkSubnet> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ClusterNetworkSubnet>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a cluster network subnet.
   *
   * This request updates a cluster network subnet with the information provided in a cluster network subnet patch
   * object. The patch object is structured in the same way as a retrieved cluster network subnet and needs to contain
   * only the information to be updated.
   *
   * @param updateClusterNetworkSubnetOptions the {@link UpdateClusterNetworkSubnetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ClusterNetworkSubnet}
   */
  public ServiceCall<ClusterNetworkSubnet> updateClusterNetworkSubnet(UpdateClusterNetworkSubnetOptions updateClusterNetworkSubnetOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateClusterNetworkSubnetOptions,
      "updateClusterNetworkSubnetOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("cluster_network_id", updateClusterNetworkSubnetOptions.clusterNetworkId());
    pathParamsMap.put("id", updateClusterNetworkSubnetOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/cluster_networks/{cluster_network_id}/subnets/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateClusterNetworkSubnet");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateClusterNetworkSubnetOptions.ifMatch() != null) {
      builder.header("If-Match", updateClusterNetworkSubnetOptions.ifMatch());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateClusterNetworkSubnetOptions.clusterNetworkSubnetPatch()), "application/merge-patch+json");
    ResponseConverter<ClusterNetworkSubnet> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ClusterNetworkSubnet>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a cluster network.
   *
   * This request deletes a cluster network. This operation cannot be reversed.
   *
   * For this request to succeed, virtual server instances must not reside in this cluster network.
   *
   * @param deleteClusterNetworkOptions the {@link DeleteClusterNetworkOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ClusterNetwork}
   */
  public ServiceCall<ClusterNetwork> deleteClusterNetwork(DeleteClusterNetworkOptions deleteClusterNetworkOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteClusterNetworkOptions,
      "deleteClusterNetworkOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteClusterNetworkOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/cluster_networks/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteClusterNetwork");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (deleteClusterNetworkOptions.ifMatch() != null) {
      builder.header("If-Match", deleteClusterNetworkOptions.ifMatch());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<ClusterNetwork> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ClusterNetwork>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a cluster network.
   *
   * This request retrieves a single cluster network specified by the identifier in the URL.
   *
   * @param getClusterNetworkOptions the {@link GetClusterNetworkOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ClusterNetwork}
   */
  public ServiceCall<ClusterNetwork> getClusterNetwork(GetClusterNetworkOptions getClusterNetworkOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getClusterNetworkOptions,
      "getClusterNetworkOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getClusterNetworkOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/cluster_networks/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getClusterNetwork");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<ClusterNetwork> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ClusterNetwork>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a cluster.
   *
   * This request updates a cluster network with the information provided in a cluster network patch object. The patch
   * object is structured in the same way as a retrieved cluster network and needs to contain only the information to be
   * updated.
   *
   * @param updateClusterNetworkOptions the {@link UpdateClusterNetworkOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ClusterNetwork}
   */
  public ServiceCall<ClusterNetwork> updateClusterNetwork(UpdateClusterNetworkOptions updateClusterNetworkOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateClusterNetworkOptions,
      "updateClusterNetworkOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateClusterNetworkOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/cluster_networks/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateClusterNetwork");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateClusterNetworkOptions.ifMatch() != null) {
      builder.header("If-Match", updateClusterNetworkOptions.ifMatch());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateClusterNetworkOptions.clusterNetworkPatch()), "application/merge-patch+json");
    ResponseConverter<ClusterNetwork> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ClusterNetwork>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List public gateways.
   *
   * This request lists public gateways in the region. A public gateway is a virtual network device associated with a
   * VPC, which allows access to the Internet. A public gateway resides in a zone and can be connected to subnets in the
   * same zone only.
   *
   * @param listPublicGatewaysOptions the {@link ListPublicGatewaysOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PublicGatewayCollection}
   */
  public ServiceCall<PublicGatewayCollection> listPublicGateways(ListPublicGatewaysOptions listPublicGatewaysOptions) {
    if (listPublicGatewaysOptions == null) {
      listPublicGatewaysOptions = new ListPublicGatewaysOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/public_gateways"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listPublicGateways");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listPublicGatewaysOptions.start() != null) {
      builder.query("start", String.valueOf(listPublicGatewaysOptions.start()));
    }
    if (listPublicGatewaysOptions.limit() != null) {
      builder.query("limit", String.valueOf(listPublicGatewaysOptions.limit()));
    }
    if (listPublicGatewaysOptions.resourceGroupId() != null) {
      builder.query("resource_group.id", String.valueOf(listPublicGatewaysOptions.resourceGroupId()));
    }
    ResponseConverter<PublicGatewayCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PublicGatewayCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List public gateways.
   *
   * This request lists public gateways in the region. A public gateway is a virtual network device associated with a
   * VPC, which allows access to the Internet. A public gateway resides in a zone and can be connected to subnets in the
   * same zone only.
   *
   * @return a {@link ServiceCall} with a result of type {@link PublicGatewayCollection}
   */
  public ServiceCall<PublicGatewayCollection> listPublicGateways() {
    return listPublicGateways(null);
  }

  /**
   * Create a public gateway.
   *
   * This request creates a new public gateway from a public gateway prototype object. For this to succeed, the VPC must
   * not already have a public gateway in the specified zone.
   *
   * If a floating IP is provided, it must be unbound. If a floating IP is not provided, one will be created and bound
   * to the public gateway. Once a public gateway has been created, its floating IP cannot be unbound. A public gateway
   * must be explicitly attached to each subnet it will provide connectivity for.
   *
   * @param createPublicGatewayOptions the {@link CreatePublicGatewayOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PublicGateway}
   */
  public ServiceCall<PublicGateway> createPublicGateway(CreatePublicGatewayOptions createPublicGatewayOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createPublicGatewayOptions,
      "createPublicGatewayOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/public_gateways"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createPublicGateway");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("vpc", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPublicGatewayOptions.vpc()));
    contentJson.add("zone", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPublicGatewayOptions.zone()));
    if (createPublicGatewayOptions.floatingIp() != null) {
      contentJson.add("floating_ip", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPublicGatewayOptions.floatingIp()));
    }
    if (createPublicGatewayOptions.name() != null) {
      contentJson.addProperty("name", createPublicGatewayOptions.name());
    }
    if (createPublicGatewayOptions.resourceGroup() != null) {
      contentJson.add("resource_group", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPublicGatewayOptions.resourceGroup()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<PublicGateway> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PublicGateway>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a public gateway.
   *
   * This request deletes a public gateway. This operation cannot be reversed. For this request to succeed, the public
   * gateway must not be attached to any subnets. The public gateway's floating IP will be automatically unbound. If the
   * floating IP was created when the public gateway was created, it will be deleted.
   *
   * @param deletePublicGatewayOptions the {@link DeletePublicGatewayOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deletePublicGateway(DeletePublicGatewayOptions deletePublicGatewayOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deletePublicGatewayOptions,
      "deletePublicGatewayOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deletePublicGatewayOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/public_gateways/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deletePublicGateway");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a public gateway.
   *
   * This request retrieves a single public gateway specified by the identifier in the URL.
   *
   * @param getPublicGatewayOptions the {@link GetPublicGatewayOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PublicGateway}
   */
  public ServiceCall<PublicGateway> getPublicGateway(GetPublicGatewayOptions getPublicGatewayOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getPublicGatewayOptions,
      "getPublicGatewayOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getPublicGatewayOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/public_gateways/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getPublicGateway");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<PublicGateway> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PublicGateway>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a public gateway.
   *
   * This request updates a public gateway's name.
   *
   * @param updatePublicGatewayOptions the {@link UpdatePublicGatewayOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PublicGateway}
   */
  public ServiceCall<PublicGateway> updatePublicGateway(UpdatePublicGatewayOptions updatePublicGatewayOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updatePublicGatewayOptions,
      "updatePublicGatewayOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updatePublicGatewayOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/public_gateways/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updatePublicGateway");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updatePublicGatewayOptions.publicGatewayPatch()), "application/merge-patch+json");
    ResponseConverter<PublicGateway> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PublicGateway>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List floating IPs.
   *
   * This request lists floating IPs in the region. Floating IPs allow inbound and outbound traffic from the Internet to
   * an instance.
   *
   * @param listFloatingIpsOptions the {@link ListFloatingIpsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link FloatingIPCollection}
   */
  public ServiceCall<FloatingIPCollection> listFloatingIps(ListFloatingIpsOptions listFloatingIpsOptions) {
    if (listFloatingIpsOptions == null) {
      listFloatingIpsOptions = new ListFloatingIpsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/floating_ips"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listFloatingIps");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listFloatingIpsOptions.start() != null) {
      builder.query("start", String.valueOf(listFloatingIpsOptions.start()));
    }
    if (listFloatingIpsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listFloatingIpsOptions.limit()));
    }
    if (listFloatingIpsOptions.resourceGroupId() != null) {
      builder.query("resource_group.id", String.valueOf(listFloatingIpsOptions.resourceGroupId()));
    }
    if (listFloatingIpsOptions.sort() != null) {
      builder.query("sort", String.valueOf(listFloatingIpsOptions.sort()));
    }
    if (listFloatingIpsOptions.targetId() != null) {
      builder.query("target.id", String.valueOf(listFloatingIpsOptions.targetId()));
    }
    if (listFloatingIpsOptions.targetCrn() != null) {
      builder.query("target.crn", String.valueOf(listFloatingIpsOptions.targetCrn()));
    }
    if (listFloatingIpsOptions.targetName() != null) {
      builder.query("target.name", String.valueOf(listFloatingIpsOptions.targetName()));
    }
    if (listFloatingIpsOptions.targetResourceType() != null) {
      builder.query("target.resource_type", String.valueOf(listFloatingIpsOptions.targetResourceType()));
    }
    ResponseConverter<FloatingIPCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<FloatingIPCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List floating IPs.
   *
   * This request lists floating IPs in the region. Floating IPs allow inbound and outbound traffic from the Internet to
   * an instance.
   *
   * @return a {@link ServiceCall} with a result of type {@link FloatingIPCollection}
   */
  public ServiceCall<FloatingIPCollection> listFloatingIps() {
    return listFloatingIps(null);
  }

  /**
   * Reserve a floating IP.
   *
   * This request reserves a new floating IP.
   *
   * @param createFloatingIpOptions the {@link CreateFloatingIpOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link FloatingIP}
   */
  public ServiceCall<FloatingIP> createFloatingIp(CreateFloatingIpOptions createFloatingIpOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createFloatingIpOptions,
      "createFloatingIpOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/floating_ips"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createFloatingIp");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createFloatingIpOptions.floatingIpPrototype()), "application/json");
    ResponseConverter<FloatingIP> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<FloatingIP>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a floating IP.
   *
   * This request disassociates (if associated) and releases a floating IP. This operation cannot be reversed. For this
   * request to succeed, the floating IP must not be required by another resource, such as a public gateway.
   *
   * @param deleteFloatingIpOptions the {@link DeleteFloatingIpOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteFloatingIp(DeleteFloatingIpOptions deleteFloatingIpOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteFloatingIpOptions,
      "deleteFloatingIpOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteFloatingIpOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/floating_ips/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteFloatingIp");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a floating IP.
   *
   * This request retrieves a single floating IP specified by the identifier in the URL.
   *
   * @param getFloatingIpOptions the {@link GetFloatingIpOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link FloatingIP}
   */
  public ServiceCall<FloatingIP> getFloatingIp(GetFloatingIpOptions getFloatingIpOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getFloatingIpOptions,
      "getFloatingIpOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getFloatingIpOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/floating_ips/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getFloatingIp");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<FloatingIP> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<FloatingIP>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a floating IP.
   *
   * This request updates a floating IP's name and/or target.
   *
   * @param updateFloatingIpOptions the {@link UpdateFloatingIpOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link FloatingIP}
   */
  public ServiceCall<FloatingIP> updateFloatingIp(UpdateFloatingIpOptions updateFloatingIpOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateFloatingIpOptions,
      "updateFloatingIpOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateFloatingIpOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/floating_ips/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateFloatingIp");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateFloatingIpOptions.floatingIpPatch()), "application/merge-patch+json");
    ResponseConverter<FloatingIP> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<FloatingIP>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List network ACLs.
   *
   * This request lists network ACLs in the region. A network ACL defines a set of packet filtering rules for traffic in
   * and out of the subnets the network ACL is attached to. No traffic is allowed by default. Both allow and deny rules
   * can be defined, and rules are stateless so that reverse traffic in response to allowed traffic is not automatically
   * allowed.
   *
   * @param listNetworkAclsOptions the {@link ListNetworkAclsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link NetworkACLCollection}
   */
  public ServiceCall<NetworkACLCollection> listNetworkAcls(ListNetworkAclsOptions listNetworkAclsOptions) {
    if (listNetworkAclsOptions == null) {
      listNetworkAclsOptions = new ListNetworkAclsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/network_acls"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listNetworkAcls");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listNetworkAclsOptions.start() != null) {
      builder.query("start", String.valueOf(listNetworkAclsOptions.start()));
    }
    if (listNetworkAclsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listNetworkAclsOptions.limit()));
    }
    if (listNetworkAclsOptions.resourceGroupId() != null) {
      builder.query("resource_group.id", String.valueOf(listNetworkAclsOptions.resourceGroupId()));
    }
    ResponseConverter<NetworkACLCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<NetworkACLCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List network ACLs.
   *
   * This request lists network ACLs in the region. A network ACL defines a set of packet filtering rules for traffic in
   * and out of the subnets the network ACL is attached to. No traffic is allowed by default. Both allow and deny rules
   * can be defined, and rules are stateless so that reverse traffic in response to allowed traffic is not automatically
   * allowed.
   *
   * @return a {@link ServiceCall} with a result of type {@link NetworkACLCollection}
   */
  public ServiceCall<NetworkACLCollection> listNetworkAcls() {
    return listNetworkAcls(null);
  }

  /**
   * Create a network ACL.
   *
   * This request creates a new stateless network ACL from a network ACL prototype object. The prototype object is
   * structured in the same way as a retrieved network ACL, and contains the information necessary to create the new
   * network ACL.
   *
   * @param createNetworkAclOptions the {@link CreateNetworkAclOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link NetworkACL}
   */
  public ServiceCall<NetworkACL> createNetworkAcl(CreateNetworkAclOptions createNetworkAclOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createNetworkAclOptions,
      "createNetworkAclOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/network_acls"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createNetworkAcl");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createNetworkAclOptions.networkAclPrototype()), "application/json");
    ResponseConverter<NetworkACL> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<NetworkACL>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a network ACL.
   *
   * This request deletes a network ACL. This operation cannot be reversed. For this request to succeed, the network ACL
   * must not be the default network ACL for any VPCs, and the network ACL must not be attached to any subnets.
   *
   * @param deleteNetworkAclOptions the {@link DeleteNetworkAclOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteNetworkAcl(DeleteNetworkAclOptions deleteNetworkAclOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteNetworkAclOptions,
      "deleteNetworkAclOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteNetworkAclOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/network_acls/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteNetworkAcl");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a network ACL.
   *
   * This request retrieves a single network ACL specified by the identifier in the URL.
   *
   * @param getNetworkAclOptions the {@link GetNetworkAclOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link NetworkACL}
   */
  public ServiceCall<NetworkACL> getNetworkAcl(GetNetworkAclOptions getNetworkAclOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getNetworkAclOptions,
      "getNetworkAclOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getNetworkAclOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/network_acls/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getNetworkAcl");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<NetworkACL> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<NetworkACL>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a network ACL.
   *
   * This request updates a network ACL's name.
   *
   * @param updateNetworkAclOptions the {@link UpdateNetworkAclOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link NetworkACL}
   */
  public ServiceCall<NetworkACL> updateNetworkAcl(UpdateNetworkAclOptions updateNetworkAclOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateNetworkAclOptions,
      "updateNetworkAclOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateNetworkAclOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/network_acls/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateNetworkAcl");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateNetworkAclOptions.networkAclPatch()), "application/merge-patch+json");
    ResponseConverter<NetworkACL> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<NetworkACL>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List rules for a network ACL.
   *
   * This request lists rules for a network ACL. These rules can allow or deny traffic between a source CIDR block and a
   * destination CIDR block over a particular protocol and port range.
   *
   * @param listNetworkAclRulesOptions the {@link ListNetworkAclRulesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link NetworkACLRuleCollection}
   */
  public ServiceCall<NetworkACLRuleCollection> listNetworkAclRules(ListNetworkAclRulesOptions listNetworkAclRulesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listNetworkAclRulesOptions,
      "listNetworkAclRulesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("network_acl_id", listNetworkAclRulesOptions.networkAclId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/network_acls/{network_acl_id}/rules", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listNetworkAclRules");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listNetworkAclRulesOptions.start() != null) {
      builder.query("start", String.valueOf(listNetworkAclRulesOptions.start()));
    }
    if (listNetworkAclRulesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listNetworkAclRulesOptions.limit()));
    }
    if (listNetworkAclRulesOptions.direction() != null) {
      builder.query("direction", String.valueOf(listNetworkAclRulesOptions.direction()));
    }
    ResponseConverter<NetworkACLRuleCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<NetworkACLRuleCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a rule for a network ACL.
   *
   * This request creates a new rule from a network ACL rule prototype object. The prototype object is structured in the
   * same way as a retrieved rule, and contains the information necessary to create the new rule.
   *
   * @param createNetworkAclRuleOptions the {@link CreateNetworkAclRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link NetworkACLRule}
   */
  public ServiceCall<NetworkACLRule> createNetworkAclRule(CreateNetworkAclRuleOptions createNetworkAclRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createNetworkAclRuleOptions,
      "createNetworkAclRuleOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("network_acl_id", createNetworkAclRuleOptions.networkAclId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/network_acls/{network_acl_id}/rules", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createNetworkAclRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createNetworkAclRuleOptions.networkAclRulePrototype()), "application/json");
    ResponseConverter<NetworkACLRule> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<NetworkACLRule>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a network ACL rule.
   *
   * This request deletes a rule. This operation cannot be reversed.
   *
   * @param deleteNetworkAclRuleOptions the {@link DeleteNetworkAclRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteNetworkAclRule(DeleteNetworkAclRuleOptions deleteNetworkAclRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteNetworkAclRuleOptions,
      "deleteNetworkAclRuleOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("network_acl_id", deleteNetworkAclRuleOptions.networkAclId());
    pathParamsMap.put("id", deleteNetworkAclRuleOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/network_acls/{network_acl_id}/rules/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteNetworkAclRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a network ACL rule.
   *
   * This request retrieves a single rule specified by the identifier in the URL.
   *
   * @param getNetworkAclRuleOptions the {@link GetNetworkAclRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link NetworkACLRule}
   */
  public ServiceCall<NetworkACLRule> getNetworkAclRule(GetNetworkAclRuleOptions getNetworkAclRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getNetworkAclRuleOptions,
      "getNetworkAclRuleOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("network_acl_id", getNetworkAclRuleOptions.networkAclId());
    pathParamsMap.put("id", getNetworkAclRuleOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/network_acls/{network_acl_id}/rules/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getNetworkAclRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<NetworkACLRule> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<NetworkACLRule>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a network ACL rule.
   *
   * This request updates a rule with the information in a provided rule patch. The rule patch object contains only the
   * information to be updated. The request will fail if the provided patch includes properties that are not used by the
   * rule's protocol.
   *
   * @param updateNetworkAclRuleOptions the {@link UpdateNetworkAclRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link NetworkACLRule}
   */
  public ServiceCall<NetworkACLRule> updateNetworkAclRule(UpdateNetworkAclRuleOptions updateNetworkAclRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateNetworkAclRuleOptions,
      "updateNetworkAclRuleOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("network_acl_id", updateNetworkAclRuleOptions.networkAclId());
    pathParamsMap.put("id", updateNetworkAclRuleOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/network_acls/{network_acl_id}/rules/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateNetworkAclRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateNetworkAclRuleOptions.networkAclRulePatch()), "application/merge-patch+json");
    ResponseConverter<NetworkACLRule> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<NetworkACLRule>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List security groups.
   *
   * This request lists security groups in the region. A security group defines a set of packet filtering rules to allow
   * traffic in and out of the resources targeted by the security group. No traffic is allowed by default. Security
   * group rules are stateful so that reverse traffic in response to allowed traffic is automatically allowed.
   *
   * @param listSecurityGroupsOptions the {@link ListSecurityGroupsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SecurityGroupCollection}
   */
  public ServiceCall<SecurityGroupCollection> listSecurityGroups(ListSecurityGroupsOptions listSecurityGroupsOptions) {
    if (listSecurityGroupsOptions == null) {
      listSecurityGroupsOptions = new ListSecurityGroupsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/security_groups"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listSecurityGroups");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listSecurityGroupsOptions.start() != null) {
      builder.query("start", String.valueOf(listSecurityGroupsOptions.start()));
    }
    if (listSecurityGroupsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listSecurityGroupsOptions.limit()));
    }
    if (listSecurityGroupsOptions.resourceGroupId() != null) {
      builder.query("resource_group.id", String.valueOf(listSecurityGroupsOptions.resourceGroupId()));
    }
    if (listSecurityGroupsOptions.vpcId() != null) {
      builder.query("vpc.id", String.valueOf(listSecurityGroupsOptions.vpcId()));
    }
    if (listSecurityGroupsOptions.vpcCrn() != null) {
      builder.query("vpc.crn", String.valueOf(listSecurityGroupsOptions.vpcCrn()));
    }
    if (listSecurityGroupsOptions.vpcName() != null) {
      builder.query("vpc.name", String.valueOf(listSecurityGroupsOptions.vpcName()));
    }
    ResponseConverter<SecurityGroupCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SecurityGroupCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List security groups.
   *
   * This request lists security groups in the region. A security group defines a set of packet filtering rules to allow
   * traffic in and out of the resources targeted by the security group. No traffic is allowed by default. Security
   * group rules are stateful so that reverse traffic in response to allowed traffic is automatically allowed.
   *
   * @return a {@link ServiceCall} with a result of type {@link SecurityGroupCollection}
   */
  public ServiceCall<SecurityGroupCollection> listSecurityGroups() {
    return listSecurityGroups(null);
  }

  /**
   * Create a security group.
   *
   * This request creates a new security group from a security group prototype object. The prototype object is
   * structured in the same way as a retrieved security group, and contains the information necessary to create the new
   * security group. If security group rules are included in the prototype object, those rules will be added to the
   * security group. Each security group is scoped to one VPC. Only resources in that VPC can be added to the security
   * group.
   *
   * @param createSecurityGroupOptions the {@link CreateSecurityGroupOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SecurityGroup}
   */
  public ServiceCall<SecurityGroup> createSecurityGroup(CreateSecurityGroupOptions createSecurityGroupOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createSecurityGroupOptions,
      "createSecurityGroupOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/security_groups"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createSecurityGroup");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("vpc", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createSecurityGroupOptions.vpc()));
    if (createSecurityGroupOptions.name() != null) {
      contentJson.addProperty("name", createSecurityGroupOptions.name());
    }
    if (createSecurityGroupOptions.resourceGroup() != null) {
      contentJson.add("resource_group", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createSecurityGroupOptions.resourceGroup()));
    }
    if (createSecurityGroupOptions.rules() != null) {
      contentJson.add("rules", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createSecurityGroupOptions.rules()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SecurityGroup> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SecurityGroup>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a security group.
   *
   * This request deletes a security group. A security group cannot be deleted if it is referenced by any security group
   * targets or rules. Additionally, a VPC's default security group cannot be deleted. This operation cannot be
   * reversed.
   *
   * @param deleteSecurityGroupOptions the {@link DeleteSecurityGroupOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteSecurityGroup(DeleteSecurityGroupOptions deleteSecurityGroupOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteSecurityGroupOptions,
      "deleteSecurityGroupOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteSecurityGroupOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/security_groups/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteSecurityGroup");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a security group.
   *
   * This request retrieves a single security group specified by the identifier in the URL path.
   *
   * @param getSecurityGroupOptions the {@link GetSecurityGroupOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SecurityGroup}
   */
  public ServiceCall<SecurityGroup> getSecurityGroup(GetSecurityGroupOptions getSecurityGroupOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSecurityGroupOptions,
      "getSecurityGroupOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getSecurityGroupOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/security_groups/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getSecurityGroup");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<SecurityGroup> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SecurityGroup>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a security group.
   *
   * This request updates a security group with the information provided in a security group patch object. The security
   * group patch object is structured in the same way as a retrieved security group and contains only the information to
   * be updated.
   *
   * @param updateSecurityGroupOptions the {@link UpdateSecurityGroupOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SecurityGroup}
   */
  public ServiceCall<SecurityGroup> updateSecurityGroup(UpdateSecurityGroupOptions updateSecurityGroupOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateSecurityGroupOptions,
      "updateSecurityGroupOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateSecurityGroupOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/security_groups/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateSecurityGroup");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateSecurityGroupOptions.securityGroupPatch()), "application/merge-patch+json");
    ResponseConverter<SecurityGroup> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SecurityGroup>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List rules in a security group.
   *
   * This request lists rules in a security group. These rules define what traffic the security group permits. Security
   * group rules are stateful, such that reverse traffic in response to allowed traffic is automatically permitted.
   *
   * @param listSecurityGroupRulesOptions the {@link ListSecurityGroupRulesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SecurityGroupRuleCollection}
   */
  public ServiceCall<SecurityGroupRuleCollection> listSecurityGroupRules(ListSecurityGroupRulesOptions listSecurityGroupRulesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listSecurityGroupRulesOptions,
      "listSecurityGroupRulesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("security_group_id", listSecurityGroupRulesOptions.securityGroupId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/security_groups/{security_group_id}/rules", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listSecurityGroupRules");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<SecurityGroupRuleCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SecurityGroupRuleCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a rule for a security group.
   *
   * This request creates a new security group rule from a security group rule prototype object. The prototype object is
   * structured in the same way as a retrieved security group rule and contains the information necessary to create the
   * rule. As part of creating a new rule in a security group, the rule is applied to all the networking interfaces in
   * the security group. Rules specify which IP traffic a security group will allow. Security group rules are stateful,
   * such that reverse traffic in response to allowed traffic is automatically permitted. A rule allowing inbound TCP
   * traffic on port 80 also allows outbound TCP traffic on port 80 without the need for an additional rule.
   *
   * @param createSecurityGroupRuleOptions the {@link CreateSecurityGroupRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SecurityGroupRule}
   */
  public ServiceCall<SecurityGroupRule> createSecurityGroupRule(CreateSecurityGroupRuleOptions createSecurityGroupRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createSecurityGroupRuleOptions,
      "createSecurityGroupRuleOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("security_group_id", createSecurityGroupRuleOptions.securityGroupId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/security_groups/{security_group_id}/rules", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createSecurityGroupRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createSecurityGroupRuleOptions.securityGroupRulePrototype()), "application/json");
    ResponseConverter<SecurityGroupRule> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SecurityGroupRule>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a security group rule.
   *
   * This request deletes a security group rule. This operation cannot be reversed. Removing a security group rule will
   * not end existing connections allowed by that rule.
   *
   * @param deleteSecurityGroupRuleOptions the {@link DeleteSecurityGroupRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteSecurityGroupRule(DeleteSecurityGroupRuleOptions deleteSecurityGroupRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteSecurityGroupRuleOptions,
      "deleteSecurityGroupRuleOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("security_group_id", deleteSecurityGroupRuleOptions.securityGroupId());
    pathParamsMap.put("id", deleteSecurityGroupRuleOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/security_groups/{security_group_id}/rules/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteSecurityGroupRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a security group rule.
   *
   * This request retrieves a single security group rule specified by the identifier in the URL path.
   *
   * @param getSecurityGroupRuleOptions the {@link GetSecurityGroupRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SecurityGroupRule}
   */
  public ServiceCall<SecurityGroupRule> getSecurityGroupRule(GetSecurityGroupRuleOptions getSecurityGroupRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSecurityGroupRuleOptions,
      "getSecurityGroupRuleOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("security_group_id", getSecurityGroupRuleOptions.securityGroupId());
    pathParamsMap.put("id", getSecurityGroupRuleOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/security_groups/{security_group_id}/rules/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getSecurityGroupRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<SecurityGroupRule> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SecurityGroupRule>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a security group rule.
   *
   * This request updates a security group rule with the information in a provided rule patch object. The rule patch
   * object contains only the information to be updated. The request will fail if the provided patch includes properties
   * that are not used by the rule's protocol.
   *
   * @param updateSecurityGroupRuleOptions the {@link UpdateSecurityGroupRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SecurityGroupRule}
   */
  public ServiceCall<SecurityGroupRule> updateSecurityGroupRule(UpdateSecurityGroupRuleOptions updateSecurityGroupRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateSecurityGroupRuleOptions,
      "updateSecurityGroupRuleOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("security_group_id", updateSecurityGroupRuleOptions.securityGroupId());
    pathParamsMap.put("id", updateSecurityGroupRuleOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/security_groups/{security_group_id}/rules/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateSecurityGroupRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateSecurityGroupRuleOptions.securityGroupRulePatch()), "application/merge-patch+json");
    ResponseConverter<SecurityGroupRule> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SecurityGroupRule>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List targets associated with a security group.
   *
   * This request lists targets associated with a security group, to which the rules in the security group are applied.
   *
   * @param listSecurityGroupTargetsOptions the {@link ListSecurityGroupTargetsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SecurityGroupTargetCollection}
   */
  public ServiceCall<SecurityGroupTargetCollection> listSecurityGroupTargets(ListSecurityGroupTargetsOptions listSecurityGroupTargetsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listSecurityGroupTargetsOptions,
      "listSecurityGroupTargetsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("security_group_id", listSecurityGroupTargetsOptions.securityGroupId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/security_groups/{security_group_id}/targets", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listSecurityGroupTargets");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listSecurityGroupTargetsOptions.start() != null) {
      builder.query("start", String.valueOf(listSecurityGroupTargetsOptions.start()));
    }
    if (listSecurityGroupTargetsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listSecurityGroupTargetsOptions.limit()));
    }
    ResponseConverter<SecurityGroupTargetCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SecurityGroupTargetCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Remove a target from a security group.
   *
   * This request removes a target from a security group. For this request to succeed, the target must be attached to at
   * least one other security group.  The specified target identifier can be:
   *
   * - A bare metal server network interface identifier
   * - A virtual network interface identifier
   * - A VPN server identifier
   * - A load balancer identifier
   * - An endpoint gateway identifier
   * - An instance network interface identifier
   *
   * Security groups are stateful, so any changes to a target's security groups are applied to new connections. Existing
   * connections are not affected.
   *
   * @param deleteSecurityGroupTargetBindingOptions the {@link DeleteSecurityGroupTargetBindingOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteSecurityGroupTargetBinding(DeleteSecurityGroupTargetBindingOptions deleteSecurityGroupTargetBindingOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteSecurityGroupTargetBindingOptions,
      "deleteSecurityGroupTargetBindingOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("security_group_id", deleteSecurityGroupTargetBindingOptions.securityGroupId());
    pathParamsMap.put("id", deleteSecurityGroupTargetBindingOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/security_groups/{security_group_id}/targets/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteSecurityGroupTargetBinding");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a security group target.
   *
   * This request retrieves a single target specified by the identifier in the URL path. The target must be an existing
   * target of the security group.
   *
   * @param getSecurityGroupTargetOptions the {@link GetSecurityGroupTargetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SecurityGroupTargetReference}
   */
  public ServiceCall<SecurityGroupTargetReference> getSecurityGroupTarget(GetSecurityGroupTargetOptions getSecurityGroupTargetOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSecurityGroupTargetOptions,
      "getSecurityGroupTargetOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("security_group_id", getSecurityGroupTargetOptions.securityGroupId());
    pathParamsMap.put("id", getSecurityGroupTargetOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/security_groups/{security_group_id}/targets/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getSecurityGroupTarget");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<SecurityGroupTargetReference> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SecurityGroupTargetReference>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Add a target to a security group.
   *
   * This request adds a resource to an existing security group. The specified target identifier can be:
   *
   * - A bare metal server network interface identifier
   * - A virtual network interface identifier
   * - A VPN server identifier
   * - A load balancer identifier
   * - An endpoint gateway identifier
   * - An instance network interface identifier
   *
   * When a target is added to a security group, the security group rules are applied to the target. A request body is
   * not required, and if provided, is ignored.
   *
   * @param createSecurityGroupTargetBindingOptions the {@link CreateSecurityGroupTargetBindingOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SecurityGroupTargetReference}
   */
  public ServiceCall<SecurityGroupTargetReference> createSecurityGroupTargetBinding(CreateSecurityGroupTargetBindingOptions createSecurityGroupTargetBindingOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createSecurityGroupTargetBindingOptions,
      "createSecurityGroupTargetBindingOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("security_group_id", createSecurityGroupTargetBindingOptions.securityGroupId());
    pathParamsMap.put("id", createSecurityGroupTargetBindingOptions.id());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/security_groups/{security_group_id}/targets/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createSecurityGroupTargetBinding");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<SecurityGroupTargetReference> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SecurityGroupTargetReference>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List IKE policies.
   *
   * This request lists IKE policies in the region.
   *
   * @param listIkePoliciesOptions the {@link ListIkePoliciesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link IKEPolicyCollection}
   */
  public ServiceCall<IKEPolicyCollection> listIkePolicies(ListIkePoliciesOptions listIkePoliciesOptions) {
    if (listIkePoliciesOptions == null) {
      listIkePoliciesOptions = new ListIkePoliciesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ike_policies"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listIkePolicies");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listIkePoliciesOptions.start() != null) {
      builder.query("start", String.valueOf(listIkePoliciesOptions.start()));
    }
    if (listIkePoliciesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listIkePoliciesOptions.limit()));
    }
    ResponseConverter<IKEPolicyCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<IKEPolicyCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List IKE policies.
   *
   * This request lists IKE policies in the region.
   *
   * @return a {@link ServiceCall} with a result of type {@link IKEPolicyCollection}
   */
  public ServiceCall<IKEPolicyCollection> listIkePolicies() {
    return listIkePolicies(null);
  }

  /**
   * Create an IKE policy.
   *
   * This request creates a new IKE policy.
   *
   * @param createIkePolicyOptions the {@link CreateIkePolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link IKEPolicy}
   */
  public ServiceCall<IKEPolicy> createIkePolicy(CreateIkePolicyOptions createIkePolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createIkePolicyOptions,
      "createIkePolicyOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ike_policies"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createIkePolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("authentication_algorithm", createIkePolicyOptions.authenticationAlgorithm());
    contentJson.addProperty("dh_group", createIkePolicyOptions.dhGroup());
    contentJson.addProperty("encryption_algorithm", createIkePolicyOptions.encryptionAlgorithm());
    contentJson.addProperty("ike_version", createIkePolicyOptions.ikeVersion());
    if (createIkePolicyOptions.keyLifetime() != null) {
      contentJson.addProperty("key_lifetime", createIkePolicyOptions.keyLifetime());
    }
    if (createIkePolicyOptions.name() != null) {
      contentJson.addProperty("name", createIkePolicyOptions.name());
    }
    if (createIkePolicyOptions.resourceGroup() != null) {
      contentJson.add("resource_group", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createIkePolicyOptions.resourceGroup()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<IKEPolicy> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<IKEPolicy>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete an IKE policy.
   *
   * This request deletes an IKE policy. This operation cannot be reversed. For this request to succeed, there must not
   * be any VPN gateway connections using this policy.
   *
   * @param deleteIkePolicyOptions the {@link DeleteIkePolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteIkePolicy(DeleteIkePolicyOptions deleteIkePolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteIkePolicyOptions,
      "deleteIkePolicyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteIkePolicyOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ike_policies/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteIkePolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve an IKE policy.
   *
   * This request retrieves a single IKE policy specified by the identifier in the URL.
   *
   * @param getIkePolicyOptions the {@link GetIkePolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link IKEPolicy}
   */
  public ServiceCall<IKEPolicy> getIkePolicy(GetIkePolicyOptions getIkePolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getIkePolicyOptions,
      "getIkePolicyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getIkePolicyOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ike_policies/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getIkePolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<IKEPolicy> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<IKEPolicy>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update an IKE policy.
   *
   * This request updates the properties of an existing IKE policy.
   *
   * @param updateIkePolicyOptions the {@link UpdateIkePolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link IKEPolicy}
   */
  public ServiceCall<IKEPolicy> updateIkePolicy(UpdateIkePolicyOptions updateIkePolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateIkePolicyOptions,
      "updateIkePolicyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateIkePolicyOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ike_policies/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateIkePolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateIkePolicyOptions.ikePolicyPatch()), "application/merge-patch+json");
    ResponseConverter<IKEPolicy> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<IKEPolicy>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List VPN gateway connections that use a specified IKE policy.
   *
   * This request lists VPN gateway connections that use an IKE policy.
   *
   * @param listIkePolicyConnectionsOptions the {@link ListIkePolicyConnectionsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link IKEPolicyConnectionCollection}
   */
  public ServiceCall<IKEPolicyConnectionCollection> listIkePolicyConnections(ListIkePolicyConnectionsOptions listIkePolicyConnectionsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listIkePolicyConnectionsOptions,
      "listIkePolicyConnectionsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", listIkePolicyConnectionsOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ike_policies/{id}/connections", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listIkePolicyConnections");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listIkePolicyConnectionsOptions.start() != null) {
      builder.query("start", String.valueOf(listIkePolicyConnectionsOptions.start()));
    }
    if (listIkePolicyConnectionsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listIkePolicyConnectionsOptions.limit()));
    }
    ResponseConverter<IKEPolicyConnectionCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<IKEPolicyConnectionCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List IPsec policies.
   *
   * This request lists IPsec policies in the region.
   *
   * @param listIpsecPoliciesOptions the {@link ListIpsecPoliciesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link IPsecPolicyCollection}
   */
  public ServiceCall<IPsecPolicyCollection> listIpsecPolicies(ListIpsecPoliciesOptions listIpsecPoliciesOptions) {
    if (listIpsecPoliciesOptions == null) {
      listIpsecPoliciesOptions = new ListIpsecPoliciesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ipsec_policies"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listIpsecPolicies");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listIpsecPoliciesOptions.start() != null) {
      builder.query("start", String.valueOf(listIpsecPoliciesOptions.start()));
    }
    if (listIpsecPoliciesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listIpsecPoliciesOptions.limit()));
    }
    ResponseConverter<IPsecPolicyCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<IPsecPolicyCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List IPsec policies.
   *
   * This request lists IPsec policies in the region.
   *
   * @return a {@link ServiceCall} with a result of type {@link IPsecPolicyCollection}
   */
  public ServiceCall<IPsecPolicyCollection> listIpsecPolicies() {
    return listIpsecPolicies(null);
  }

  /**
   * Create an IPsec policy.
   *
   * This request creates a new IPsec policy.
   *
   * @param createIpsecPolicyOptions the {@link CreateIpsecPolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link IPsecPolicy}
   */
  public ServiceCall<IPsecPolicy> createIpsecPolicy(CreateIpsecPolicyOptions createIpsecPolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createIpsecPolicyOptions,
      "createIpsecPolicyOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ipsec_policies"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createIpsecPolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("authentication_algorithm", createIpsecPolicyOptions.authenticationAlgorithm());
    contentJson.addProperty("encryption_algorithm", createIpsecPolicyOptions.encryptionAlgorithm());
    contentJson.addProperty("pfs", createIpsecPolicyOptions.pfs());
    if (createIpsecPolicyOptions.keyLifetime() != null) {
      contentJson.addProperty("key_lifetime", createIpsecPolicyOptions.keyLifetime());
    }
    if (createIpsecPolicyOptions.name() != null) {
      contentJson.addProperty("name", createIpsecPolicyOptions.name());
    }
    if (createIpsecPolicyOptions.resourceGroup() != null) {
      contentJson.add("resource_group", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createIpsecPolicyOptions.resourceGroup()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<IPsecPolicy> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<IPsecPolicy>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete an IPsec policy.
   *
   * This request deletes an IPsec policy. This operation cannot be reversed. For this request to succeed, there must
   * not be any VPN gateway connections using this policy.
   *
   * @param deleteIpsecPolicyOptions the {@link DeleteIpsecPolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteIpsecPolicy(DeleteIpsecPolicyOptions deleteIpsecPolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteIpsecPolicyOptions,
      "deleteIpsecPolicyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteIpsecPolicyOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ipsec_policies/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteIpsecPolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve an IPsec policy.
   *
   * This request retrieves a single IPsec policy specified by the identifier in the URL.
   *
   * @param getIpsecPolicyOptions the {@link GetIpsecPolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link IPsecPolicy}
   */
  public ServiceCall<IPsecPolicy> getIpsecPolicy(GetIpsecPolicyOptions getIpsecPolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getIpsecPolicyOptions,
      "getIpsecPolicyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getIpsecPolicyOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ipsec_policies/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getIpsecPolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<IPsecPolicy> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<IPsecPolicy>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update an IPsec policy.
   *
   * This request updates the properties of an existing IPsec policy.
   *
   * @param updateIpsecPolicyOptions the {@link UpdateIpsecPolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link IPsecPolicy}
   */
  public ServiceCall<IPsecPolicy> updateIpsecPolicy(UpdateIpsecPolicyOptions updateIpsecPolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateIpsecPolicyOptions,
      "updateIpsecPolicyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateIpsecPolicyOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ipsec_policies/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateIpsecPolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateIpsecPolicyOptions.iPsecPolicyPatch()), "application/merge-patch+json");
    ResponseConverter<IPsecPolicy> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<IPsecPolicy>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List VPN gateway connections that use a specified IPsec policy.
   *
   * This request lists VPN gateway connections that use an IPsec policy.
   *
   * @param listIpsecPolicyConnectionsOptions the {@link ListIpsecPolicyConnectionsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link IPsecPolicyConnectionCollection}
   */
  public ServiceCall<IPsecPolicyConnectionCollection> listIpsecPolicyConnections(ListIpsecPolicyConnectionsOptions listIpsecPolicyConnectionsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listIpsecPolicyConnectionsOptions,
      "listIpsecPolicyConnectionsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", listIpsecPolicyConnectionsOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ipsec_policies/{id}/connections", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listIpsecPolicyConnections");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listIpsecPolicyConnectionsOptions.start() != null) {
      builder.query("start", String.valueOf(listIpsecPolicyConnectionsOptions.start()));
    }
    if (listIpsecPolicyConnectionsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listIpsecPolicyConnectionsOptions.limit()));
    }
    ResponseConverter<IPsecPolicyConnectionCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<IPsecPolicyConnectionCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List VPN gateways.
   *
   * This request lists VPN gateways in the region.
   *
   * @param listVpnGatewaysOptions the {@link ListVpnGatewaysOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VPNGatewayCollection}
   */
  public ServiceCall<VPNGatewayCollection> listVpnGateways(ListVpnGatewaysOptions listVpnGatewaysOptions) {
    if (listVpnGatewaysOptions == null) {
      listVpnGatewaysOptions = new ListVpnGatewaysOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpn_gateways"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listVpnGateways");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listVpnGatewaysOptions.start() != null) {
      builder.query("start", String.valueOf(listVpnGatewaysOptions.start()));
    }
    if (listVpnGatewaysOptions.limit() != null) {
      builder.query("limit", String.valueOf(listVpnGatewaysOptions.limit()));
    }
    if (listVpnGatewaysOptions.resourceGroupId() != null) {
      builder.query("resource_group.id", String.valueOf(listVpnGatewaysOptions.resourceGroupId()));
    }
    if (listVpnGatewaysOptions.sort() != null) {
      builder.query("sort", String.valueOf(listVpnGatewaysOptions.sort()));
    }
    if (listVpnGatewaysOptions.mode() != null) {
      builder.query("mode", String.valueOf(listVpnGatewaysOptions.mode()));
    }
    ResponseConverter<VPNGatewayCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VPNGatewayCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List VPN gateways.
   *
   * This request lists VPN gateways in the region.
   *
   * @return a {@link ServiceCall} with a result of type {@link VPNGatewayCollection}
   */
  public ServiceCall<VPNGatewayCollection> listVpnGateways() {
    return listVpnGateways(null);
  }

  /**
   * Create a VPN gateway.
   *
   * This request creates a new VPN gateway.
   *
   * @param createVpnGatewayOptions the {@link CreateVpnGatewayOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VPNGateway}
   */
  public ServiceCall<VPNGateway> createVpnGateway(CreateVpnGatewayOptions createVpnGatewayOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createVpnGatewayOptions,
      "createVpnGatewayOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpn_gateways"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createVpnGateway");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createVpnGatewayOptions.vpnGatewayPrototype()), "application/json");
    ResponseConverter<VPNGateway> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VPNGateway>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a VPN gateway.
   *
   * This request deletes a VPN gateway. This operation cannot be reversed. For this request to succeed, the VPN gateway
   * must not have a `status` of `pending`, and there must not be any VPC routes using the VPN gateway's connections as
   * a next hop.
   *
   * @param deleteVpnGatewayOptions the {@link DeleteVpnGatewayOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteVpnGateway(DeleteVpnGatewayOptions deleteVpnGatewayOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteVpnGatewayOptions,
      "deleteVpnGatewayOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteVpnGatewayOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpn_gateways/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteVpnGateway");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a VPN gateway.
   *
   * This request retrieves a single VPN gateway specified by the identifier in the URL.
   *
   * @param getVpnGatewayOptions the {@link GetVpnGatewayOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VPNGateway}
   */
  public ServiceCall<VPNGateway> getVpnGateway(GetVpnGatewayOptions getVpnGatewayOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getVpnGatewayOptions,
      "getVpnGatewayOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getVpnGatewayOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpn_gateways/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getVpnGateway");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<VPNGateway> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VPNGateway>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a VPN gateway.
   *
   * This request updates the properties of an existing VPN gateway.
   *
   * @param updateVpnGatewayOptions the {@link UpdateVpnGatewayOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VPNGateway}
   */
  public ServiceCall<VPNGateway> updateVpnGateway(UpdateVpnGatewayOptions updateVpnGatewayOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateVpnGatewayOptions,
      "updateVpnGatewayOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateVpnGatewayOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpn_gateways/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateVpnGateway");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateVpnGatewayOptions.vpnGatewayPatch()), "application/merge-patch+json");
    ResponseConverter<VPNGateway> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VPNGateway>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List connections of a VPN gateway.
   *
   * This request lists connections of a VPN gateway.
   *
   * @param listVpnGatewayConnectionsOptions the {@link ListVpnGatewayConnectionsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VPNGatewayConnectionCollection}
   */
  public ServiceCall<VPNGatewayConnectionCollection> listVpnGatewayConnections(ListVpnGatewayConnectionsOptions listVpnGatewayConnectionsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listVpnGatewayConnectionsOptions,
      "listVpnGatewayConnectionsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpn_gateway_id", listVpnGatewayConnectionsOptions.vpnGatewayId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpn_gateways/{vpn_gateway_id}/connections", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listVpnGatewayConnections");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listVpnGatewayConnectionsOptions.start() != null) {
      builder.query("start", String.valueOf(listVpnGatewayConnectionsOptions.start()));
    }
    if (listVpnGatewayConnectionsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listVpnGatewayConnectionsOptions.limit()));
    }
    if (listVpnGatewayConnectionsOptions.status() != null) {
      builder.query("status", String.valueOf(listVpnGatewayConnectionsOptions.status()));
    }
    ResponseConverter<VPNGatewayConnectionCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VPNGatewayConnectionCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a connection for a VPN gateway.
   *
   * This request creates a new VPN gateway connection.
   *
   * @param createVpnGatewayConnectionOptions the {@link CreateVpnGatewayConnectionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VPNGatewayConnection}
   */
  public ServiceCall<VPNGatewayConnection> createVpnGatewayConnection(CreateVpnGatewayConnectionOptions createVpnGatewayConnectionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createVpnGatewayConnectionOptions,
      "createVpnGatewayConnectionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpn_gateway_id", createVpnGatewayConnectionOptions.vpnGatewayId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpn_gateways/{vpn_gateway_id}/connections", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createVpnGatewayConnection");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createVpnGatewayConnectionOptions.vpnGatewayConnectionPrototype()), "application/json");
    ResponseConverter<VPNGatewayConnection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VPNGatewayConnection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a VPN gateway connection.
   *
   * This request deletes a VPN gateway connection. This operation cannot be reversed. For this request to succeed,
   * there must not be VPC routes using this VPN connection as a next hop.
   *
   * @param deleteVpnGatewayConnectionOptions the {@link DeleteVpnGatewayConnectionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteVpnGatewayConnection(DeleteVpnGatewayConnectionOptions deleteVpnGatewayConnectionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteVpnGatewayConnectionOptions,
      "deleteVpnGatewayConnectionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpn_gateway_id", deleteVpnGatewayConnectionOptions.vpnGatewayId());
    pathParamsMap.put("id", deleteVpnGatewayConnectionOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpn_gateways/{vpn_gateway_id}/connections/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteVpnGatewayConnection");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a VPN gateway connection.
   *
   * This request retrieves a single VPN gateway connection specified by the identifier in the URL.
   *
   * @param getVpnGatewayConnectionOptions the {@link GetVpnGatewayConnectionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VPNGatewayConnection}
   */
  public ServiceCall<VPNGatewayConnection> getVpnGatewayConnection(GetVpnGatewayConnectionOptions getVpnGatewayConnectionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getVpnGatewayConnectionOptions,
      "getVpnGatewayConnectionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpn_gateway_id", getVpnGatewayConnectionOptions.vpnGatewayId());
    pathParamsMap.put("id", getVpnGatewayConnectionOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpn_gateways/{vpn_gateway_id}/connections/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getVpnGatewayConnection");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<VPNGatewayConnection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VPNGatewayConnection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a VPN gateway connection.
   *
   * This request updates the properties of an existing VPN gateway connection.
   *
   * @param updateVpnGatewayConnectionOptions the {@link UpdateVpnGatewayConnectionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VPNGatewayConnection}
   */
  public ServiceCall<VPNGatewayConnection> updateVpnGatewayConnection(UpdateVpnGatewayConnectionOptions updateVpnGatewayConnectionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateVpnGatewayConnectionOptions,
      "updateVpnGatewayConnectionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpn_gateway_id", updateVpnGatewayConnectionOptions.vpnGatewayId());
    pathParamsMap.put("id", updateVpnGatewayConnectionOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpn_gateways/{vpn_gateway_id}/connections/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateVpnGatewayConnection");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateVpnGatewayConnectionOptions.vpnGatewayConnectionPatch()), "application/merge-patch+json");
    ResponseConverter<VPNGatewayConnection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VPNGatewayConnection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List local CIDRs for a VPN gateway connection.
   *
   * This request lists local CIDRs for a VPN gateway connection.
   *
   * This request is only supported for policy mode VPN gateways.
   *
   * @param listVpnGatewayConnectionsLocalCidrsOptions the {@link ListVpnGatewayConnectionsLocalCidrsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VPNGatewayConnectionCIDRs}
   */
  public ServiceCall<VPNGatewayConnectionCIDRs> listVpnGatewayConnectionsLocalCidrs(ListVpnGatewayConnectionsLocalCidrsOptions listVpnGatewayConnectionsLocalCidrsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listVpnGatewayConnectionsLocalCidrsOptions,
      "listVpnGatewayConnectionsLocalCidrsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpn_gateway_id", listVpnGatewayConnectionsLocalCidrsOptions.vpnGatewayId());
    pathParamsMap.put("id", listVpnGatewayConnectionsLocalCidrsOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpn_gateways/{vpn_gateway_id}/connections/{id}/local/cidrs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listVpnGatewayConnectionsLocalCidrs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<VPNGatewayConnectionCIDRs> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VPNGatewayConnectionCIDRs>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Remove a local CIDR from a VPN gateway connection.
   *
   * This request removes a CIDR from a VPN gateway connection.
   *
   * This request is only supported for policy mode VPN gateways.
   *
   * @param removeVpnGatewayConnectionsLocalCidrOptions the {@link RemoveVpnGatewayConnectionsLocalCidrOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> removeVpnGatewayConnectionsLocalCidr(RemoveVpnGatewayConnectionsLocalCidrOptions removeVpnGatewayConnectionsLocalCidrOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(removeVpnGatewayConnectionsLocalCidrOptions,
      "removeVpnGatewayConnectionsLocalCidrOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpn_gateway_id", removeVpnGatewayConnectionsLocalCidrOptions.vpnGatewayId());
    pathParamsMap.put("id", removeVpnGatewayConnectionsLocalCidrOptions.id());
    pathParamsMap.put("cidr", removeVpnGatewayConnectionsLocalCidrOptions.cidr());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpn_gateways/{vpn_gateway_id}/connections/{id}/local/cidrs/{cidr}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "removeVpnGatewayConnectionsLocalCidr");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Check if the specified local CIDR exists on a VPN gateway connection.
   *
   * This request succeeds if a CIDR exists on the specified VPN gateway connection, and fails otherwise.
   *
   * This request is only supported for policy mode VPN gateways.
   *
   * @param checkVpnGatewayConnectionsLocalCidrOptions the {@link CheckVpnGatewayConnectionsLocalCidrOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> checkVpnGatewayConnectionsLocalCidr(CheckVpnGatewayConnectionsLocalCidrOptions checkVpnGatewayConnectionsLocalCidrOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(checkVpnGatewayConnectionsLocalCidrOptions,
      "checkVpnGatewayConnectionsLocalCidrOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpn_gateway_id", checkVpnGatewayConnectionsLocalCidrOptions.vpnGatewayId());
    pathParamsMap.put("id", checkVpnGatewayConnectionsLocalCidrOptions.id());
    pathParamsMap.put("cidr", checkVpnGatewayConnectionsLocalCidrOptions.cidr());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpn_gateways/{vpn_gateway_id}/connections/{id}/local/cidrs/{cidr}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "checkVpnGatewayConnectionsLocalCidr");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Set a local CIDR on a VPN gateway connection.
   *
   * This request adds the specified CIDR to the specified VPN gateway connection. This request succeeds if the
   * specified CIDR already exists. A request body is not required, and if provided, is ignored.
   *
   * This request is only supported for policy mode VPN gateways.
   *
   * @param addVpnGatewayConnectionsLocalCidrOptions the {@link AddVpnGatewayConnectionsLocalCidrOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> addVpnGatewayConnectionsLocalCidr(AddVpnGatewayConnectionsLocalCidrOptions addVpnGatewayConnectionsLocalCidrOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(addVpnGatewayConnectionsLocalCidrOptions,
      "addVpnGatewayConnectionsLocalCidrOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpn_gateway_id", addVpnGatewayConnectionsLocalCidrOptions.vpnGatewayId());
    pathParamsMap.put("id", addVpnGatewayConnectionsLocalCidrOptions.id());
    pathParamsMap.put("cidr", addVpnGatewayConnectionsLocalCidrOptions.cidr());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpn_gateways/{vpn_gateway_id}/connections/{id}/local/cidrs/{cidr}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "addVpnGatewayConnectionsLocalCidr");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List peer CIDRs for a VPN gateway connection.
   *
   * This request lists peer CIDRs for a VPN gateway connection.
   *
   * This request is only supported for policy mode VPN gateways.
   *
   * @param listVpnGatewayConnectionsPeerCidrsOptions the {@link ListVpnGatewayConnectionsPeerCidrsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VPNGatewayConnectionCIDRs}
   */
  public ServiceCall<VPNGatewayConnectionCIDRs> listVpnGatewayConnectionsPeerCidrs(ListVpnGatewayConnectionsPeerCidrsOptions listVpnGatewayConnectionsPeerCidrsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listVpnGatewayConnectionsPeerCidrsOptions,
      "listVpnGatewayConnectionsPeerCidrsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpn_gateway_id", listVpnGatewayConnectionsPeerCidrsOptions.vpnGatewayId());
    pathParamsMap.put("id", listVpnGatewayConnectionsPeerCidrsOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpn_gateways/{vpn_gateway_id}/connections/{id}/peer/cidrs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listVpnGatewayConnectionsPeerCidrs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<VPNGatewayConnectionCIDRs> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VPNGatewayConnectionCIDRs>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Remove a peer CIDR from a VPN gateway connection.
   *
   * This request removes a CIDR from a VPN gateway connection.
   *
   * This request is only supported for policy mode VPN gateways.
   *
   * @param removeVpnGatewayConnectionsPeerCidrOptions the {@link RemoveVpnGatewayConnectionsPeerCidrOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> removeVpnGatewayConnectionsPeerCidr(RemoveVpnGatewayConnectionsPeerCidrOptions removeVpnGatewayConnectionsPeerCidrOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(removeVpnGatewayConnectionsPeerCidrOptions,
      "removeVpnGatewayConnectionsPeerCidrOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpn_gateway_id", removeVpnGatewayConnectionsPeerCidrOptions.vpnGatewayId());
    pathParamsMap.put("id", removeVpnGatewayConnectionsPeerCidrOptions.id());
    pathParamsMap.put("cidr", removeVpnGatewayConnectionsPeerCidrOptions.cidr());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpn_gateways/{vpn_gateway_id}/connections/{id}/peer/cidrs/{cidr}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "removeVpnGatewayConnectionsPeerCidr");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Check if the specified peer CIDR exists on a VPN gateway connection.
   *
   * This request succeeds if a CIDR exists on the specified VPN gateway connection, and fails otherwise.
   *
   * This request is only supported for policy mode VPN gateways.
   *
   * @param checkVpnGatewayConnectionsPeerCidrOptions the {@link CheckVpnGatewayConnectionsPeerCidrOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> checkVpnGatewayConnectionsPeerCidr(CheckVpnGatewayConnectionsPeerCidrOptions checkVpnGatewayConnectionsPeerCidrOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(checkVpnGatewayConnectionsPeerCidrOptions,
      "checkVpnGatewayConnectionsPeerCidrOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpn_gateway_id", checkVpnGatewayConnectionsPeerCidrOptions.vpnGatewayId());
    pathParamsMap.put("id", checkVpnGatewayConnectionsPeerCidrOptions.id());
    pathParamsMap.put("cidr", checkVpnGatewayConnectionsPeerCidrOptions.cidr());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpn_gateways/{vpn_gateway_id}/connections/{id}/peer/cidrs/{cidr}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "checkVpnGatewayConnectionsPeerCidr");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Set a peer CIDR on a VPN gateway connection.
   *
   * This request adds the specified CIDR to the specified VPN gateway connection. This request succeeds if the
   * specified CIDR already exists. A request body is not required, and if provided, is ignored.
   *
   * This request is only supported for policy mode VPN gateways.
   *
   * @param addVpnGatewayConnectionsPeerCidrOptions the {@link AddVpnGatewayConnectionsPeerCidrOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> addVpnGatewayConnectionsPeerCidr(AddVpnGatewayConnectionsPeerCidrOptions addVpnGatewayConnectionsPeerCidrOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(addVpnGatewayConnectionsPeerCidrOptions,
      "addVpnGatewayConnectionsPeerCidrOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpn_gateway_id", addVpnGatewayConnectionsPeerCidrOptions.vpnGatewayId());
    pathParamsMap.put("id", addVpnGatewayConnectionsPeerCidrOptions.id());
    pathParamsMap.put("cidr", addVpnGatewayConnectionsPeerCidrOptions.cidr());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpn_gateways/{vpn_gateway_id}/connections/{id}/peer/cidrs/{cidr}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "addVpnGatewayConnectionsPeerCidr");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List VPN servers.
   *
   * This request lists VPN servers.
   *
   * @param listVpnServersOptions the {@link ListVpnServersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VPNServerCollection}
   */
  public ServiceCall<VPNServerCollection> listVpnServers(ListVpnServersOptions listVpnServersOptions) {
    if (listVpnServersOptions == null) {
      listVpnServersOptions = new ListVpnServersOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpn_servers"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listVpnServers");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listVpnServersOptions.name() != null) {
      builder.query("name", String.valueOf(listVpnServersOptions.name()));
    }
    if (listVpnServersOptions.start() != null) {
      builder.query("start", String.valueOf(listVpnServersOptions.start()));
    }
    if (listVpnServersOptions.limit() != null) {
      builder.query("limit", String.valueOf(listVpnServersOptions.limit()));
    }
    if (listVpnServersOptions.resourceGroupId() != null) {
      builder.query("resource_group.id", String.valueOf(listVpnServersOptions.resourceGroupId()));
    }
    if (listVpnServersOptions.sort() != null) {
      builder.query("sort", String.valueOf(listVpnServersOptions.sort()));
    }
    ResponseConverter<VPNServerCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VPNServerCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List VPN servers.
   *
   * This request lists VPN servers.
   *
   * @return a {@link ServiceCall} with a result of type {@link VPNServerCollection}
   */
  public ServiceCall<VPNServerCollection> listVpnServers() {
    return listVpnServers(null);
  }

  /**
   * Create a VPN server.
   *
   * This request creates a new VPN server.
   *
   * @param createVpnServerOptions the {@link CreateVpnServerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VPNServer}
   */
  public ServiceCall<VPNServer> createVpnServer(CreateVpnServerOptions createVpnServerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createVpnServerOptions,
      "createVpnServerOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpn_servers"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createVpnServer");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("certificate", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createVpnServerOptions.certificate()));
    contentJson.add("client_authentication", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createVpnServerOptions.clientAuthentication()));
    contentJson.addProperty("client_ip_pool", createVpnServerOptions.clientIpPool());
    contentJson.add("subnets", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createVpnServerOptions.subnets()));
    if (createVpnServerOptions.clientDnsServerIps() != null) {
      contentJson.add("client_dns_server_ips", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createVpnServerOptions.clientDnsServerIps()));
    }
    if (createVpnServerOptions.clientIdleTimeout() != null) {
      contentJson.addProperty("client_idle_timeout", createVpnServerOptions.clientIdleTimeout());
    }
    if (createVpnServerOptions.enableSplitTunneling() != null) {
      contentJson.addProperty("enable_split_tunneling", createVpnServerOptions.enableSplitTunneling());
    }
    if (createVpnServerOptions.name() != null) {
      contentJson.addProperty("name", createVpnServerOptions.name());
    }
    if (createVpnServerOptions.port() != null) {
      contentJson.addProperty("port", createVpnServerOptions.port());
    }
    if (createVpnServerOptions.protocol() != null) {
      contentJson.addProperty("protocol", createVpnServerOptions.protocol());
    }
    if (createVpnServerOptions.resourceGroup() != null) {
      contentJson.add("resource_group", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createVpnServerOptions.resourceGroup()));
    }
    if (createVpnServerOptions.securityGroups() != null) {
      contentJson.add("security_groups", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createVpnServerOptions.securityGroups()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<VPNServer> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VPNServer>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a VPN server.
   *
   * This request deletes a VPN server. This operation cannot be reversed.
   *
   * @param deleteVpnServerOptions the {@link DeleteVpnServerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteVpnServer(DeleteVpnServerOptions deleteVpnServerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteVpnServerOptions,
      "deleteVpnServerOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteVpnServerOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpn_servers/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteVpnServer");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteVpnServerOptions.ifMatch() != null) {
      builder.header("If-Match", deleteVpnServerOptions.ifMatch());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a VPN server.
   *
   * This request retrieves a single VPN server specified by the identifier in the URL.
   *
   * @param getVpnServerOptions the {@link GetVpnServerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VPNServer}
   */
  public ServiceCall<VPNServer> getVpnServer(GetVpnServerOptions getVpnServerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getVpnServerOptions,
      "getVpnServerOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getVpnServerOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpn_servers/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getVpnServer");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<VPNServer> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VPNServer>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a VPN server.
   *
   * This request updates the properties of an existing VPN server. Any updates other than to `name` will cause all
   * connected VPN clients to be disconnected.
   *
   * @param updateVpnServerOptions the {@link UpdateVpnServerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VPNServer}
   */
  public ServiceCall<VPNServer> updateVpnServer(UpdateVpnServerOptions updateVpnServerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateVpnServerOptions,
      "updateVpnServerOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateVpnServerOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpn_servers/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateVpnServer");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateVpnServerOptions.ifMatch() != null) {
      builder.header("If-Match", updateVpnServerOptions.ifMatch());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateVpnServerOptions.vpnServerPatch()), "application/merge-patch+json");
    ResponseConverter<VPNServer> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VPNServer>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve client configuration.
   *
   * This request retrieves OpenVPN client configuration on a single VPN server specified by the identifier in the URL.
   * This configuration includes directives compatible with OpenVPN releases 2.4 and 2.5.
   *
   * @param getVpnServerClientConfigurationOptions the {@link GetVpnServerClientConfigurationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link String}
   */
  public ServiceCall<String> getVpnServerClientConfiguration(GetVpnServerClientConfigurationOptions getVpnServerClientConfigurationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getVpnServerClientConfigurationOptions,
      "getVpnServerClientConfigurationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getVpnServerClientConfigurationOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpn_servers/{id}/client_configuration", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getVpnServerClientConfiguration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "text/plain");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<String> responseConverter = ResponseConverterUtils.getString();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List VPN clients for a VPN server.
   *
   * This request retrieves connected VPN clients, and any disconnected VPN clients that the VPN server has not yet
   * deleted based on its auto-deletion policy.
   *
   * @param listVpnServerClientsOptions the {@link ListVpnServerClientsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VPNServerClientCollection}
   */
  public ServiceCall<VPNServerClientCollection> listVpnServerClients(ListVpnServerClientsOptions listVpnServerClientsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listVpnServerClientsOptions,
      "listVpnServerClientsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpn_server_id", listVpnServerClientsOptions.vpnServerId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpn_servers/{vpn_server_id}/clients", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listVpnServerClients");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listVpnServerClientsOptions.start() != null) {
      builder.query("start", String.valueOf(listVpnServerClientsOptions.start()));
    }
    if (listVpnServerClientsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listVpnServerClientsOptions.limit()));
    }
    if (listVpnServerClientsOptions.sort() != null) {
      builder.query("sort", String.valueOf(listVpnServerClientsOptions.sort()));
    }
    ResponseConverter<VPNServerClientCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VPNServerClientCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a VPN client.
   *
   * This request disconnects and deletes the VPN client from the VPN server. The VPN client may reconnect unless its
   * authentication permissions for the configured authentication methods (such as its client certificate) have been
   * revoked.
   *
   * @param deleteVpnServerClientOptions the {@link DeleteVpnServerClientOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteVpnServerClient(DeleteVpnServerClientOptions deleteVpnServerClientOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteVpnServerClientOptions,
      "deleteVpnServerClientOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpn_server_id", deleteVpnServerClientOptions.vpnServerId());
    pathParamsMap.put("id", deleteVpnServerClientOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpn_servers/{vpn_server_id}/clients/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteVpnServerClient");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a VPN client.
   *
   * This request retrieves a single VPN client specified by the identifier in the URL.
   *
   * @param getVpnServerClientOptions the {@link GetVpnServerClientOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VPNServerClient}
   */
  public ServiceCall<VPNServerClient> getVpnServerClient(GetVpnServerClientOptions getVpnServerClientOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getVpnServerClientOptions,
      "getVpnServerClientOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpn_server_id", getVpnServerClientOptions.vpnServerId());
    pathParamsMap.put("id", getVpnServerClientOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpn_servers/{vpn_server_id}/clients/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getVpnServerClient");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<VPNServerClient> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VPNServerClient>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Disconnect a VPN client.
   *
   * This request disconnects the specified VPN client, and deletes the client according to the VPN server's
   * auto-deletion policy. The VPN client may reconnect unless its authentication permissions for the configured
   * authentication methods (such as its client certificate) have been revoked.
   *
   * @param disconnectVpnClientOptions the {@link DisconnectVpnClientOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> disconnectVpnClient(DisconnectVpnClientOptions disconnectVpnClientOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(disconnectVpnClientOptions,
      "disconnectVpnClientOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpn_server_id", disconnectVpnClientOptions.vpnServerId());
    pathParamsMap.put("id", disconnectVpnClientOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpn_servers/{vpn_server_id}/clients/{id}/disconnect", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "disconnectVpnClient");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List VPN routes for a VPN server.
   *
   * This request lists VPN routes in a VPN server. All VPN routes are provided to the VPN client when the connection is
   * established.  Packets received from the VPN client will be dropped by the VPN server if there is no VPN route
   * matching their specified destinations. All VPN routes must be unique within the VPN server.
   *
   * @param listVpnServerRoutesOptions the {@link ListVpnServerRoutesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VPNServerRouteCollection}
   */
  public ServiceCall<VPNServerRouteCollection> listVpnServerRoutes(ListVpnServerRoutesOptions listVpnServerRoutesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listVpnServerRoutesOptions,
      "listVpnServerRoutesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpn_server_id", listVpnServerRoutesOptions.vpnServerId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpn_servers/{vpn_server_id}/routes", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listVpnServerRoutes");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listVpnServerRoutesOptions.start() != null) {
      builder.query("start", String.valueOf(listVpnServerRoutesOptions.start()));
    }
    if (listVpnServerRoutesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listVpnServerRoutesOptions.limit()));
    }
    if (listVpnServerRoutesOptions.sort() != null) {
      builder.query("sort", String.valueOf(listVpnServerRoutesOptions.sort()));
    }
    ResponseConverter<VPNServerRouteCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VPNServerRouteCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a VPN route for a VPN server.
   *
   * This request creates a new VPN route in the VPN server. All VPN routes are provided to the VPN client when the
   * connection is established. Packets received from the VPN client will be dropped by the VPN server if there is no
   * VPN route matching their specified destinations. All VPN routes must be unique within the VPN server.
   *
   * @param createVpnServerRouteOptions the {@link CreateVpnServerRouteOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VPNServerRoute}
   */
  public ServiceCall<VPNServerRoute> createVpnServerRoute(CreateVpnServerRouteOptions createVpnServerRouteOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createVpnServerRouteOptions,
      "createVpnServerRouteOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpn_server_id", createVpnServerRouteOptions.vpnServerId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpn_servers/{vpn_server_id}/routes", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createVpnServerRoute");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("destination", createVpnServerRouteOptions.destination());
    if (createVpnServerRouteOptions.action() != null) {
      contentJson.addProperty("action", createVpnServerRouteOptions.action());
    }
    if (createVpnServerRouteOptions.name() != null) {
      contentJson.addProperty("name", createVpnServerRouteOptions.name());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<VPNServerRoute> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VPNServerRoute>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a VPN route.
   *
   * This request deletes a VPN route. This operation cannot be reversed.
   *
   * @param deleteVpnServerRouteOptions the {@link DeleteVpnServerRouteOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteVpnServerRoute(DeleteVpnServerRouteOptions deleteVpnServerRouteOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteVpnServerRouteOptions,
      "deleteVpnServerRouteOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpn_server_id", deleteVpnServerRouteOptions.vpnServerId());
    pathParamsMap.put("id", deleteVpnServerRouteOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpn_servers/{vpn_server_id}/routes/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteVpnServerRoute");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a VPN route.
   *
   * This request retrieves a single VPN route specified by the identifier in the URL.
   *
   * @param getVpnServerRouteOptions the {@link GetVpnServerRouteOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VPNServerRoute}
   */
  public ServiceCall<VPNServerRoute> getVpnServerRoute(GetVpnServerRouteOptions getVpnServerRouteOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getVpnServerRouteOptions,
      "getVpnServerRouteOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpn_server_id", getVpnServerRouteOptions.vpnServerId());
    pathParamsMap.put("id", getVpnServerRouteOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpn_servers/{vpn_server_id}/routes/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getVpnServerRoute");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<VPNServerRoute> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VPNServerRoute>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a VPN route.
   *
   * This request updates a VPN route with the information in a provided VPN route patch. The VPN route patch object is
   * structured in the same way as a retrieved VPN route and contains only the information to be updated.
   *
   * @param updateVpnServerRouteOptions the {@link UpdateVpnServerRouteOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VPNServerRoute}
   */
  public ServiceCall<VPNServerRoute> updateVpnServerRoute(UpdateVpnServerRouteOptions updateVpnServerRouteOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateVpnServerRouteOptions,
      "updateVpnServerRouteOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("vpn_server_id", updateVpnServerRouteOptions.vpnServerId());
    pathParamsMap.put("id", updateVpnServerRouteOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/vpn_servers/{vpn_server_id}/routes/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateVpnServerRoute");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateVpnServerRouteOptions.vpnServerRoutePatch()), "application/merge-patch+json");
    ResponseConverter<VPNServerRoute> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VPNServerRoute>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List load balancer profiles.
   *
   * This request lists load balancer profiles available in the region. A load balancer profile specifies the
   * performance characteristics and pricing model for a load balancer.
   *
   * @param listLoadBalancerProfilesOptions the {@link ListLoadBalancerProfilesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LoadBalancerProfileCollection}
   */
  public ServiceCall<LoadBalancerProfileCollection> listLoadBalancerProfiles(ListLoadBalancerProfilesOptions listLoadBalancerProfilesOptions) {
    if (listLoadBalancerProfilesOptions == null) {
      listLoadBalancerProfilesOptions = new ListLoadBalancerProfilesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/load_balancer/profiles"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listLoadBalancerProfiles");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listLoadBalancerProfilesOptions.start() != null) {
      builder.query("start", String.valueOf(listLoadBalancerProfilesOptions.start()));
    }
    if (listLoadBalancerProfilesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listLoadBalancerProfilesOptions.limit()));
    }
    ResponseConverter<LoadBalancerProfileCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LoadBalancerProfileCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List load balancer profiles.
   *
   * This request lists load balancer profiles available in the region. A load balancer profile specifies the
   * performance characteristics and pricing model for a load balancer.
   *
   * @return a {@link ServiceCall} with a result of type {@link LoadBalancerProfileCollection}
   */
  public ServiceCall<LoadBalancerProfileCollection> listLoadBalancerProfiles() {
    return listLoadBalancerProfiles(null);
  }

  /**
   * Retrieve a load balancer profile.
   *
   * This request retrieves a load balancer profile specified by the name in the URL.
   *
   * @param getLoadBalancerProfileOptions the {@link GetLoadBalancerProfileOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LoadBalancerProfile}
   */
  public ServiceCall<LoadBalancerProfile> getLoadBalancerProfile(GetLoadBalancerProfileOptions getLoadBalancerProfileOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getLoadBalancerProfileOptions,
      "getLoadBalancerProfileOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("name", getLoadBalancerProfileOptions.name());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/load_balancer/profiles/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getLoadBalancerProfile");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<LoadBalancerProfile> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LoadBalancerProfile>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List load balancers.
   *
   * This request lists load balancers in the region.
   *
   * @param listLoadBalancersOptions the {@link ListLoadBalancersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LoadBalancerCollection}
   */
  public ServiceCall<LoadBalancerCollection> listLoadBalancers(ListLoadBalancersOptions listLoadBalancersOptions) {
    if (listLoadBalancersOptions == null) {
      listLoadBalancersOptions = new ListLoadBalancersOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/load_balancers"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listLoadBalancers");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listLoadBalancersOptions.start() != null) {
      builder.query("start", String.valueOf(listLoadBalancersOptions.start()));
    }
    if (listLoadBalancersOptions.limit() != null) {
      builder.query("limit", String.valueOf(listLoadBalancersOptions.limit()));
    }
    ResponseConverter<LoadBalancerCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LoadBalancerCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List load balancers.
   *
   * This request lists load balancers in the region.
   *
   * @return a {@link ServiceCall} with a result of type {@link LoadBalancerCollection}
   */
  public ServiceCall<LoadBalancerCollection> listLoadBalancers() {
    return listLoadBalancers(null);
  }

  /**
   * Create a load balancer.
   *
   * This request creates and provisions a new load balancer.
   *
   * @param createLoadBalancerOptions the {@link CreateLoadBalancerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LoadBalancer}
   */
  public ServiceCall<LoadBalancer> createLoadBalancer(CreateLoadBalancerOptions createLoadBalancerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createLoadBalancerOptions,
      "createLoadBalancerOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/load_balancers"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createLoadBalancer");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("is_public", createLoadBalancerOptions.isPublic());
    contentJson.add("subnets", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createLoadBalancerOptions.subnets()));
    if (createLoadBalancerOptions.dns() != null) {
      contentJson.add("dns", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createLoadBalancerOptions.dns()));
    }
    if (createLoadBalancerOptions.isPrivatePath() != null) {
      contentJson.addProperty("is_private_path", createLoadBalancerOptions.isPrivatePath());
    }
    if (createLoadBalancerOptions.listeners() != null) {
      contentJson.add("listeners", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createLoadBalancerOptions.listeners()));
    }
    if (createLoadBalancerOptions.logging() != null) {
      contentJson.add("logging", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createLoadBalancerOptions.logging()));
    }
    if (createLoadBalancerOptions.name() != null) {
      contentJson.addProperty("name", createLoadBalancerOptions.name());
    }
    if (createLoadBalancerOptions.pools() != null) {
      contentJson.add("pools", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createLoadBalancerOptions.pools()));
    }
    if (createLoadBalancerOptions.profile() != null) {
      contentJson.add("profile", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createLoadBalancerOptions.profile()));
    }
    if (createLoadBalancerOptions.resourceGroup() != null) {
      contentJson.add("resource_group", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createLoadBalancerOptions.resourceGroup()));
    }
    if (createLoadBalancerOptions.routeMode() != null) {
      contentJson.addProperty("route_mode", createLoadBalancerOptions.routeMode());
    }
    if (createLoadBalancerOptions.securityGroups() != null) {
      contentJson.add("security_groups", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createLoadBalancerOptions.securityGroups()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<LoadBalancer> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LoadBalancer>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a load balancer.
   *
   * This request deletes a load balancer. This operation cannot be reversed. A load balancer cannot be deleted if its
   * `provisioning_status` is `delete_pending` or it is referenced by a resource.
   *
   * @param deleteLoadBalancerOptions the {@link DeleteLoadBalancerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteLoadBalancer(DeleteLoadBalancerOptions deleteLoadBalancerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteLoadBalancerOptions,
      "deleteLoadBalancerOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteLoadBalancerOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/load_balancers/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteLoadBalancer");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteLoadBalancerOptions.ifMatch() != null) {
      builder.header("If-Match", deleteLoadBalancerOptions.ifMatch());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a load balancer.
   *
   * This request retrieves a single load balancer specified by the identifier in the URL path.
   *
   * @param getLoadBalancerOptions the {@link GetLoadBalancerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LoadBalancer}
   */
  public ServiceCall<LoadBalancer> getLoadBalancer(GetLoadBalancerOptions getLoadBalancerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getLoadBalancerOptions,
      "getLoadBalancerOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getLoadBalancerOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/load_balancers/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getLoadBalancer");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<LoadBalancer> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LoadBalancer>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a load balancer.
   *
   * This request updates a load balancer with the information in a provided load balancer patch. The load balancer
   * patch object is structured in the same way as a retrieved load balancer and contains only the information to be
   * updated. A load balancer can only be updated if its `provisioning_status` is `active`.
   *
   * @param updateLoadBalancerOptions the {@link UpdateLoadBalancerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LoadBalancer}
   */
  public ServiceCall<LoadBalancer> updateLoadBalancer(UpdateLoadBalancerOptions updateLoadBalancerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateLoadBalancerOptions,
      "updateLoadBalancerOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateLoadBalancerOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/load_balancers/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateLoadBalancer");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateLoadBalancerOptions.ifMatch() != null) {
      builder.header("If-Match", updateLoadBalancerOptions.ifMatch());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateLoadBalancerOptions.loadBalancerPatch()), "application/merge-patch+json");
    ResponseConverter<LoadBalancer> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LoadBalancer>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List statistics of a load balancer.
   *
   * This request lists statistics of a load balancer.
   *
   * @param getLoadBalancerStatisticsOptions the {@link GetLoadBalancerStatisticsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LoadBalancerStatistics}
   */
  public ServiceCall<LoadBalancerStatistics> getLoadBalancerStatistics(GetLoadBalancerStatisticsOptions getLoadBalancerStatisticsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getLoadBalancerStatisticsOptions,
      "getLoadBalancerStatisticsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getLoadBalancerStatisticsOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/load_balancers/{id}/statistics", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getLoadBalancerStatistics");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<LoadBalancerStatistics> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LoadBalancerStatistics>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List listeners for a load balancer.
   *
   * This request lists listeners for a load balancer.
   *
   * @param listLoadBalancerListenersOptions the {@link ListLoadBalancerListenersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LoadBalancerListenerCollection}
   */
  public ServiceCall<LoadBalancerListenerCollection> listLoadBalancerListeners(ListLoadBalancerListenersOptions listLoadBalancerListenersOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listLoadBalancerListenersOptions,
      "listLoadBalancerListenersOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("load_balancer_id", listLoadBalancerListenersOptions.loadBalancerId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/load_balancers/{load_balancer_id}/listeners", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listLoadBalancerListeners");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<LoadBalancerListenerCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LoadBalancerListenerCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a listener for a load balancer.
   *
   * This request creates a new listener for a load balancer.
   *
   * @param createLoadBalancerListenerOptions the {@link CreateLoadBalancerListenerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LoadBalancerListener}
   */
  public ServiceCall<LoadBalancerListener> createLoadBalancerListener(CreateLoadBalancerListenerOptions createLoadBalancerListenerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createLoadBalancerListenerOptions,
      "createLoadBalancerListenerOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("load_balancer_id", createLoadBalancerListenerOptions.loadBalancerId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/load_balancers/{load_balancer_id}/listeners", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createLoadBalancerListener");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("protocol", createLoadBalancerListenerOptions.protocol());
    if (createLoadBalancerListenerOptions.acceptProxyProtocol() != null) {
      contentJson.addProperty("accept_proxy_protocol", createLoadBalancerListenerOptions.acceptProxyProtocol());
    }
    if (createLoadBalancerListenerOptions.certificateInstance() != null) {
      contentJson.add("certificate_instance", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createLoadBalancerListenerOptions.certificateInstance()));
    }
    if (createLoadBalancerListenerOptions.connectionLimit() != null) {
      contentJson.addProperty("connection_limit", createLoadBalancerListenerOptions.connectionLimit());
    }
    if (createLoadBalancerListenerOptions.defaultPool() != null) {
      contentJson.add("default_pool", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createLoadBalancerListenerOptions.defaultPool()));
    }
    if (createLoadBalancerListenerOptions.httpsRedirect() != null) {
      contentJson.add("https_redirect", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createLoadBalancerListenerOptions.httpsRedirect()));
    }
    if (createLoadBalancerListenerOptions.idleConnectionTimeout() != null) {
      contentJson.addProperty("idle_connection_timeout", createLoadBalancerListenerOptions.idleConnectionTimeout());
    }
    if (createLoadBalancerListenerOptions.policies() != null) {
      contentJson.add("policies", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createLoadBalancerListenerOptions.policies()));
    }
    if (createLoadBalancerListenerOptions.port() != null) {
      contentJson.addProperty("port", createLoadBalancerListenerOptions.port());
    }
    if (createLoadBalancerListenerOptions.portMax() != null) {
      contentJson.addProperty("port_max", createLoadBalancerListenerOptions.portMax());
    }
    if (createLoadBalancerListenerOptions.portMin() != null) {
      contentJson.addProperty("port_min", createLoadBalancerListenerOptions.portMin());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<LoadBalancerListener> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LoadBalancerListener>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a load balancer listener.
   *
   * This request deletes a load balancer listener. This operation cannot be reversed. For this operation to succeed,
   * the listener must not be the target of another load balancer listener.
   *
   * @param deleteLoadBalancerListenerOptions the {@link DeleteLoadBalancerListenerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteLoadBalancerListener(DeleteLoadBalancerListenerOptions deleteLoadBalancerListenerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteLoadBalancerListenerOptions,
      "deleteLoadBalancerListenerOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("load_balancer_id", deleteLoadBalancerListenerOptions.loadBalancerId());
    pathParamsMap.put("id", deleteLoadBalancerListenerOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/load_balancers/{load_balancer_id}/listeners/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteLoadBalancerListener");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a load balancer listener.
   *
   * This request retrieves a single listener specified by the identifier in the URL path.
   *
   * @param getLoadBalancerListenerOptions the {@link GetLoadBalancerListenerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LoadBalancerListener}
   */
  public ServiceCall<LoadBalancerListener> getLoadBalancerListener(GetLoadBalancerListenerOptions getLoadBalancerListenerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getLoadBalancerListenerOptions,
      "getLoadBalancerListenerOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("load_balancer_id", getLoadBalancerListenerOptions.loadBalancerId());
    pathParamsMap.put("id", getLoadBalancerListenerOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/load_balancers/{load_balancer_id}/listeners/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getLoadBalancerListener");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<LoadBalancerListener> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LoadBalancerListener>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a load balancer listener.
   *
   * This request updates a load balancer listener from a listener patch.
   *
   * @param updateLoadBalancerListenerOptions the {@link UpdateLoadBalancerListenerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LoadBalancerListener}
   */
  public ServiceCall<LoadBalancerListener> updateLoadBalancerListener(UpdateLoadBalancerListenerOptions updateLoadBalancerListenerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateLoadBalancerListenerOptions,
      "updateLoadBalancerListenerOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("load_balancer_id", updateLoadBalancerListenerOptions.loadBalancerId());
    pathParamsMap.put("id", updateLoadBalancerListenerOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/load_balancers/{load_balancer_id}/listeners/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateLoadBalancerListener");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateLoadBalancerListenerOptions.loadBalancerListenerPatch()), "application/merge-patch+json");
    ResponseConverter<LoadBalancerListener> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LoadBalancerListener>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List policies for a load balancer listener.
   *
   * This request lists policies for a load balancer listener. A policy consists of rules to match against each incoming
   * request, and an action to apply to the request if a rule matches.
   *
   * @param listLoadBalancerListenerPoliciesOptions the {@link ListLoadBalancerListenerPoliciesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LoadBalancerListenerPolicyCollection}
   */
  public ServiceCall<LoadBalancerListenerPolicyCollection> listLoadBalancerListenerPolicies(ListLoadBalancerListenerPoliciesOptions listLoadBalancerListenerPoliciesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listLoadBalancerListenerPoliciesOptions,
      "listLoadBalancerListenerPoliciesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("load_balancer_id", listLoadBalancerListenerPoliciesOptions.loadBalancerId());
    pathParamsMap.put("listener_id", listLoadBalancerListenerPoliciesOptions.listenerId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/load_balancers/{load_balancer_id}/listeners/{listener_id}/policies", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listLoadBalancerListenerPolicies");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<LoadBalancerListenerPolicyCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LoadBalancerListenerPolicyCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a policy for a load balancer listener.
   *
   * This request creates a new policy from a load balancer listener policy object. The prototype object is structured
   * in the same way as a retrieved policy, and contains the information necessary to create the new policy. For this
   * request to succeed, the load balancer must be in the `application` family.
   *
   * @param createLoadBalancerListenerPolicyOptions the {@link CreateLoadBalancerListenerPolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LoadBalancerListenerPolicy}
   */
  public ServiceCall<LoadBalancerListenerPolicy> createLoadBalancerListenerPolicy(CreateLoadBalancerListenerPolicyOptions createLoadBalancerListenerPolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createLoadBalancerListenerPolicyOptions,
      "createLoadBalancerListenerPolicyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("load_balancer_id", createLoadBalancerListenerPolicyOptions.loadBalancerId());
    pathParamsMap.put("listener_id", createLoadBalancerListenerPolicyOptions.listenerId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/load_balancers/{load_balancer_id}/listeners/{listener_id}/policies", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createLoadBalancerListenerPolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("action", createLoadBalancerListenerPolicyOptions.action());
    contentJson.addProperty("priority", createLoadBalancerListenerPolicyOptions.priority());
    if (createLoadBalancerListenerPolicyOptions.name() != null) {
      contentJson.addProperty("name", createLoadBalancerListenerPolicyOptions.name());
    }
    if (createLoadBalancerListenerPolicyOptions.rules() != null) {
      contentJson.add("rules", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createLoadBalancerListenerPolicyOptions.rules()));
    }
    if (createLoadBalancerListenerPolicyOptions.target() != null) {
      contentJson.add("target", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createLoadBalancerListenerPolicyOptions.target()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<LoadBalancerListenerPolicy> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LoadBalancerListenerPolicy>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a load balancer listener policy.
   *
   * Deletes a policy of the load balancer listener. This operation cannot be reversed.
   *
   * @param deleteLoadBalancerListenerPolicyOptions the {@link DeleteLoadBalancerListenerPolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteLoadBalancerListenerPolicy(DeleteLoadBalancerListenerPolicyOptions deleteLoadBalancerListenerPolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteLoadBalancerListenerPolicyOptions,
      "deleteLoadBalancerListenerPolicyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("load_balancer_id", deleteLoadBalancerListenerPolicyOptions.loadBalancerId());
    pathParamsMap.put("listener_id", deleteLoadBalancerListenerPolicyOptions.listenerId());
    pathParamsMap.put("id", deleteLoadBalancerListenerPolicyOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/load_balancers/{load_balancer_id}/listeners/{listener_id}/policies/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteLoadBalancerListenerPolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a load balancer listener policy.
   *
   * Retrieve a single policy specified by the identifier in the URL path.
   *
   * @param getLoadBalancerListenerPolicyOptions the {@link GetLoadBalancerListenerPolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LoadBalancerListenerPolicy}
   */
  public ServiceCall<LoadBalancerListenerPolicy> getLoadBalancerListenerPolicy(GetLoadBalancerListenerPolicyOptions getLoadBalancerListenerPolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getLoadBalancerListenerPolicyOptions,
      "getLoadBalancerListenerPolicyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("load_balancer_id", getLoadBalancerListenerPolicyOptions.loadBalancerId());
    pathParamsMap.put("listener_id", getLoadBalancerListenerPolicyOptions.listenerId());
    pathParamsMap.put("id", getLoadBalancerListenerPolicyOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/load_balancers/{load_balancer_id}/listeners/{listener_id}/policies/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getLoadBalancerListenerPolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<LoadBalancerListenerPolicy> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LoadBalancerListenerPolicy>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a load balancer listener policy.
   *
   * This request updates a load balancer listener policy with the information in a provided policy patch. The policy
   * patch object is structured in the same way as a retrieved policy and contains only the information to be updated.
   *
   * @param updateLoadBalancerListenerPolicyOptions the {@link UpdateLoadBalancerListenerPolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LoadBalancerListenerPolicy}
   */
  public ServiceCall<LoadBalancerListenerPolicy> updateLoadBalancerListenerPolicy(UpdateLoadBalancerListenerPolicyOptions updateLoadBalancerListenerPolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateLoadBalancerListenerPolicyOptions,
      "updateLoadBalancerListenerPolicyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("load_balancer_id", updateLoadBalancerListenerPolicyOptions.loadBalancerId());
    pathParamsMap.put("listener_id", updateLoadBalancerListenerPolicyOptions.listenerId());
    pathParamsMap.put("id", updateLoadBalancerListenerPolicyOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/load_balancers/{load_balancer_id}/listeners/{listener_id}/policies/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateLoadBalancerListenerPolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateLoadBalancerListenerPolicyOptions.loadBalancerListenerPolicyPatch()), "application/merge-patch+json");
    ResponseConverter<LoadBalancerListenerPolicy> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LoadBalancerListenerPolicy>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List rules of a load balancer listener policy.
   *
   * This request lists rules of a load balancer listener policy.
   *
   * @param listLoadBalancerListenerPolicyRulesOptions the {@link ListLoadBalancerListenerPolicyRulesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LoadBalancerListenerPolicyRuleCollection}
   */
  public ServiceCall<LoadBalancerListenerPolicyRuleCollection> listLoadBalancerListenerPolicyRules(ListLoadBalancerListenerPolicyRulesOptions listLoadBalancerListenerPolicyRulesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listLoadBalancerListenerPolicyRulesOptions,
      "listLoadBalancerListenerPolicyRulesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("load_balancer_id", listLoadBalancerListenerPolicyRulesOptions.loadBalancerId());
    pathParamsMap.put("listener_id", listLoadBalancerListenerPolicyRulesOptions.listenerId());
    pathParamsMap.put("policy_id", listLoadBalancerListenerPolicyRulesOptions.policyId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/load_balancers/{load_balancer_id}/listeners/{listener_id}/policies/{policy_id}/rules", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listLoadBalancerListenerPolicyRules");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<LoadBalancerListenerPolicyRuleCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LoadBalancerListenerPolicyRuleCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a rule for a load balancer listener policy.
   *
   * Creates a new rule for the load balancer listener policy.
   *
   * @param createLoadBalancerListenerPolicyRuleOptions the {@link CreateLoadBalancerListenerPolicyRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LoadBalancerListenerPolicyRule}
   */
  public ServiceCall<LoadBalancerListenerPolicyRule> createLoadBalancerListenerPolicyRule(CreateLoadBalancerListenerPolicyRuleOptions createLoadBalancerListenerPolicyRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createLoadBalancerListenerPolicyRuleOptions,
      "createLoadBalancerListenerPolicyRuleOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("load_balancer_id", createLoadBalancerListenerPolicyRuleOptions.loadBalancerId());
    pathParamsMap.put("listener_id", createLoadBalancerListenerPolicyRuleOptions.listenerId());
    pathParamsMap.put("policy_id", createLoadBalancerListenerPolicyRuleOptions.policyId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/load_balancers/{load_balancer_id}/listeners/{listener_id}/policies/{policy_id}/rules", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createLoadBalancerListenerPolicyRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("condition", createLoadBalancerListenerPolicyRuleOptions.condition());
    contentJson.addProperty("type", createLoadBalancerListenerPolicyRuleOptions.type());
    contentJson.addProperty("value", createLoadBalancerListenerPolicyRuleOptions.value());
    if (createLoadBalancerListenerPolicyRuleOptions.field() != null) {
      contentJson.addProperty("field", createLoadBalancerListenerPolicyRuleOptions.field());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<LoadBalancerListenerPolicyRule> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LoadBalancerListenerPolicyRule>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a load balancer listener policy rule.
   *
   * Deletes a rule from the load balancer listener policy. This operation cannot be reversed.
   *
   * @param deleteLoadBalancerListenerPolicyRuleOptions the {@link DeleteLoadBalancerListenerPolicyRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteLoadBalancerListenerPolicyRule(DeleteLoadBalancerListenerPolicyRuleOptions deleteLoadBalancerListenerPolicyRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteLoadBalancerListenerPolicyRuleOptions,
      "deleteLoadBalancerListenerPolicyRuleOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("load_balancer_id", deleteLoadBalancerListenerPolicyRuleOptions.loadBalancerId());
    pathParamsMap.put("listener_id", deleteLoadBalancerListenerPolicyRuleOptions.listenerId());
    pathParamsMap.put("policy_id", deleteLoadBalancerListenerPolicyRuleOptions.policyId());
    pathParamsMap.put("id", deleteLoadBalancerListenerPolicyRuleOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/load_balancers/{load_balancer_id}/listeners/{listener_id}/policies/{policy_id}/rules/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteLoadBalancerListenerPolicyRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a load balancer listener policy rule.
   *
   * Retrieves a single rule specified by the identifier in the URL path.
   *
   * @param getLoadBalancerListenerPolicyRuleOptions the {@link GetLoadBalancerListenerPolicyRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LoadBalancerListenerPolicyRule}
   */
  public ServiceCall<LoadBalancerListenerPolicyRule> getLoadBalancerListenerPolicyRule(GetLoadBalancerListenerPolicyRuleOptions getLoadBalancerListenerPolicyRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getLoadBalancerListenerPolicyRuleOptions,
      "getLoadBalancerListenerPolicyRuleOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("load_balancer_id", getLoadBalancerListenerPolicyRuleOptions.loadBalancerId());
    pathParamsMap.put("listener_id", getLoadBalancerListenerPolicyRuleOptions.listenerId());
    pathParamsMap.put("policy_id", getLoadBalancerListenerPolicyRuleOptions.policyId());
    pathParamsMap.put("id", getLoadBalancerListenerPolicyRuleOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/load_balancers/{load_balancer_id}/listeners/{listener_id}/policies/{policy_id}/rules/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getLoadBalancerListenerPolicyRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<LoadBalancerListenerPolicyRule> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LoadBalancerListenerPolicyRule>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a load balancer listener policy rule.
   *
   * Updates a rule of the load balancer listener policy.
   *
   * @param updateLoadBalancerListenerPolicyRuleOptions the {@link UpdateLoadBalancerListenerPolicyRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LoadBalancerListenerPolicyRule}
   */
  public ServiceCall<LoadBalancerListenerPolicyRule> updateLoadBalancerListenerPolicyRule(UpdateLoadBalancerListenerPolicyRuleOptions updateLoadBalancerListenerPolicyRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateLoadBalancerListenerPolicyRuleOptions,
      "updateLoadBalancerListenerPolicyRuleOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("load_balancer_id", updateLoadBalancerListenerPolicyRuleOptions.loadBalancerId());
    pathParamsMap.put("listener_id", updateLoadBalancerListenerPolicyRuleOptions.listenerId());
    pathParamsMap.put("policy_id", updateLoadBalancerListenerPolicyRuleOptions.policyId());
    pathParamsMap.put("id", updateLoadBalancerListenerPolicyRuleOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/load_balancers/{load_balancer_id}/listeners/{listener_id}/policies/{policy_id}/rules/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateLoadBalancerListenerPolicyRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateLoadBalancerListenerPolicyRuleOptions.loadBalancerListenerPolicyRulePatch()), "application/merge-patch+json");
    ResponseConverter<LoadBalancerListenerPolicyRule> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LoadBalancerListenerPolicyRule>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List pools of a load balancer.
   *
   * This request lists pools of a load balancer.
   *
   * @param listLoadBalancerPoolsOptions the {@link ListLoadBalancerPoolsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LoadBalancerPoolCollection}
   */
  public ServiceCall<LoadBalancerPoolCollection> listLoadBalancerPools(ListLoadBalancerPoolsOptions listLoadBalancerPoolsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listLoadBalancerPoolsOptions,
      "listLoadBalancerPoolsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("load_balancer_id", listLoadBalancerPoolsOptions.loadBalancerId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/load_balancers/{load_balancer_id}/pools", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listLoadBalancerPools");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<LoadBalancerPoolCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LoadBalancerPoolCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a load balancer pool.
   *
   * This request creates a new pool from a pool prototype object.
   *
   * @param createLoadBalancerPoolOptions the {@link CreateLoadBalancerPoolOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LoadBalancerPool}
   */
  public ServiceCall<LoadBalancerPool> createLoadBalancerPool(CreateLoadBalancerPoolOptions createLoadBalancerPoolOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createLoadBalancerPoolOptions,
      "createLoadBalancerPoolOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("load_balancer_id", createLoadBalancerPoolOptions.loadBalancerId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/load_balancers/{load_balancer_id}/pools", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createLoadBalancerPool");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("algorithm", createLoadBalancerPoolOptions.algorithm());
    contentJson.add("health_monitor", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createLoadBalancerPoolOptions.healthMonitor()));
    contentJson.addProperty("protocol", createLoadBalancerPoolOptions.protocol());
    if (createLoadBalancerPoolOptions.failsafePolicy() != null) {
      contentJson.add("failsafe_policy", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createLoadBalancerPoolOptions.failsafePolicy()));
    }
    if (createLoadBalancerPoolOptions.members() != null) {
      contentJson.add("members", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createLoadBalancerPoolOptions.members()));
    }
    if (createLoadBalancerPoolOptions.name() != null) {
      contentJson.addProperty("name", createLoadBalancerPoolOptions.name());
    }
    if (createLoadBalancerPoolOptions.proxyProtocol() != null) {
      contentJson.addProperty("proxy_protocol", createLoadBalancerPoolOptions.proxyProtocol());
    }
    if (createLoadBalancerPoolOptions.sessionPersistence() != null) {
      contentJson.add("session_persistence", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createLoadBalancerPoolOptions.sessionPersistence()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<LoadBalancerPool> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LoadBalancerPool>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a load balancer pool.
   *
   * This request deletes a load balancer pool. This operation cannot be reversed. The pool must not currently be the
   * default pool for any listener in the load balancer, nor be the target pool in the failsafe policy for any other
   * pool.
   *
   * @param deleteLoadBalancerPoolOptions the {@link DeleteLoadBalancerPoolOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteLoadBalancerPool(DeleteLoadBalancerPoolOptions deleteLoadBalancerPoolOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteLoadBalancerPoolOptions,
      "deleteLoadBalancerPoolOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("load_balancer_id", deleteLoadBalancerPoolOptions.loadBalancerId());
    pathParamsMap.put("id", deleteLoadBalancerPoolOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/load_balancers/{load_balancer_id}/pools/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteLoadBalancerPool");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a load balancer pool.
   *
   * This request retrieves a single pool specified by the identifier in the URL path.
   *
   * @param getLoadBalancerPoolOptions the {@link GetLoadBalancerPoolOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LoadBalancerPool}
   */
  public ServiceCall<LoadBalancerPool> getLoadBalancerPool(GetLoadBalancerPoolOptions getLoadBalancerPoolOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getLoadBalancerPoolOptions,
      "getLoadBalancerPoolOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("load_balancer_id", getLoadBalancerPoolOptions.loadBalancerId());
    pathParamsMap.put("id", getLoadBalancerPoolOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/load_balancers/{load_balancer_id}/pools/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getLoadBalancerPool");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<LoadBalancerPool> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LoadBalancerPool>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a load balancer pool.
   *
   * This request updates a load balancer pool from a pool patch.
   *
   * @param updateLoadBalancerPoolOptions the {@link UpdateLoadBalancerPoolOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LoadBalancerPool}
   */
  public ServiceCall<LoadBalancerPool> updateLoadBalancerPool(UpdateLoadBalancerPoolOptions updateLoadBalancerPoolOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateLoadBalancerPoolOptions,
      "updateLoadBalancerPoolOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("load_balancer_id", updateLoadBalancerPoolOptions.loadBalancerId());
    pathParamsMap.put("id", updateLoadBalancerPoolOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/load_balancers/{load_balancer_id}/pools/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateLoadBalancerPool");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateLoadBalancerPoolOptions.loadBalancerPoolPatch()), "application/merge-patch+json");
    ResponseConverter<LoadBalancerPool> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LoadBalancerPool>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List members of a load balancer pool.
   *
   * This request lists members of a load balancer pool.
   *
   * @param listLoadBalancerPoolMembersOptions the {@link ListLoadBalancerPoolMembersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LoadBalancerPoolMemberCollection}
   */
  public ServiceCall<LoadBalancerPoolMemberCollection> listLoadBalancerPoolMembers(ListLoadBalancerPoolMembersOptions listLoadBalancerPoolMembersOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listLoadBalancerPoolMembersOptions,
      "listLoadBalancerPoolMembersOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("load_balancer_id", listLoadBalancerPoolMembersOptions.loadBalancerId());
    pathParamsMap.put("pool_id", listLoadBalancerPoolMembersOptions.poolId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/load_balancers/{load_balancer_id}/pools/{pool_id}/members", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listLoadBalancerPoolMembers");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<LoadBalancerPoolMemberCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LoadBalancerPoolMemberCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a member in a load balancer pool.
   *
   * This request creates a new member and adds the member to the pool.
   *
   * The pool must not already have a member targeting a load balancer.
   *
   * @param createLoadBalancerPoolMemberOptions the {@link CreateLoadBalancerPoolMemberOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LoadBalancerPoolMember}
   */
  public ServiceCall<LoadBalancerPoolMember> createLoadBalancerPoolMember(CreateLoadBalancerPoolMemberOptions createLoadBalancerPoolMemberOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createLoadBalancerPoolMemberOptions,
      "createLoadBalancerPoolMemberOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("load_balancer_id", createLoadBalancerPoolMemberOptions.loadBalancerId());
    pathParamsMap.put("pool_id", createLoadBalancerPoolMemberOptions.poolId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/load_balancers/{load_balancer_id}/pools/{pool_id}/members", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createLoadBalancerPoolMember");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("port", createLoadBalancerPoolMemberOptions.port());
    contentJson.add("target", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createLoadBalancerPoolMemberOptions.target()));
    if (createLoadBalancerPoolMemberOptions.weight() != null) {
      contentJson.addProperty("weight", createLoadBalancerPoolMemberOptions.weight());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<LoadBalancerPoolMember> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LoadBalancerPoolMember>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Replace load balancer pool members.
   *
   * This request replaces the existing members of the load balancer pool with new members created from the collection
   * of member prototype objects.
   *
   * @param replaceLoadBalancerPoolMembersOptions the {@link ReplaceLoadBalancerPoolMembersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LoadBalancerPoolMemberCollection}
   */
  public ServiceCall<LoadBalancerPoolMemberCollection> replaceLoadBalancerPoolMembers(ReplaceLoadBalancerPoolMembersOptions replaceLoadBalancerPoolMembersOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceLoadBalancerPoolMembersOptions,
      "replaceLoadBalancerPoolMembersOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("load_balancer_id", replaceLoadBalancerPoolMembersOptions.loadBalancerId());
    pathParamsMap.put("pool_id", replaceLoadBalancerPoolMembersOptions.poolId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/load_balancers/{load_balancer_id}/pools/{pool_id}/members", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "replaceLoadBalancerPoolMembers");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("members", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceLoadBalancerPoolMembersOptions.members()));
    builder.bodyJson(contentJson);
    ResponseConverter<LoadBalancerPoolMemberCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LoadBalancerPoolMemberCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a load balancer pool member.
   *
   * This request deletes a member from the pool. This operation cannot be reversed.
   *
   * @param deleteLoadBalancerPoolMemberOptions the {@link DeleteLoadBalancerPoolMemberOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteLoadBalancerPoolMember(DeleteLoadBalancerPoolMemberOptions deleteLoadBalancerPoolMemberOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteLoadBalancerPoolMemberOptions,
      "deleteLoadBalancerPoolMemberOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("load_balancer_id", deleteLoadBalancerPoolMemberOptions.loadBalancerId());
    pathParamsMap.put("pool_id", deleteLoadBalancerPoolMemberOptions.poolId());
    pathParamsMap.put("id", deleteLoadBalancerPoolMemberOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/load_balancers/{load_balancer_id}/pools/{pool_id}/members/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteLoadBalancerPoolMember");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a load balancer pool member.
   *
   * This request retrieves a single member specified by the identifier in the URL path.
   *
   * @param getLoadBalancerPoolMemberOptions the {@link GetLoadBalancerPoolMemberOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LoadBalancerPoolMember}
   */
  public ServiceCall<LoadBalancerPoolMember> getLoadBalancerPoolMember(GetLoadBalancerPoolMemberOptions getLoadBalancerPoolMemberOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getLoadBalancerPoolMemberOptions,
      "getLoadBalancerPoolMemberOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("load_balancer_id", getLoadBalancerPoolMemberOptions.loadBalancerId());
    pathParamsMap.put("pool_id", getLoadBalancerPoolMemberOptions.poolId());
    pathParamsMap.put("id", getLoadBalancerPoolMemberOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/load_balancers/{load_balancer_id}/pools/{pool_id}/members/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getLoadBalancerPoolMember");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<LoadBalancerPoolMember> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LoadBalancerPoolMember>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a load balancer pool member.
   *
   * This request updates an existing member from a member patch.
   *
   * @param updateLoadBalancerPoolMemberOptions the {@link UpdateLoadBalancerPoolMemberOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LoadBalancerPoolMember}
   */
  public ServiceCall<LoadBalancerPoolMember> updateLoadBalancerPoolMember(UpdateLoadBalancerPoolMemberOptions updateLoadBalancerPoolMemberOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateLoadBalancerPoolMemberOptions,
      "updateLoadBalancerPoolMemberOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("load_balancer_id", updateLoadBalancerPoolMemberOptions.loadBalancerId());
    pathParamsMap.put("pool_id", updateLoadBalancerPoolMemberOptions.poolId());
    pathParamsMap.put("id", updateLoadBalancerPoolMemberOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/load_balancers/{load_balancer_id}/pools/{pool_id}/members/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateLoadBalancerPoolMember");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateLoadBalancerPoolMemberOptions.loadBalancerPoolMemberPatch()), "application/merge-patch+json");
    ResponseConverter<LoadBalancerPoolMember> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LoadBalancerPoolMember>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List endpoint gateways.
   *
   * This request lists endpoint gateways in the region. An endpoint gateway maps one or more reserved IPs in a VPC to a
   * target outside the VPC.
   *
   * @param listEndpointGatewaysOptions the {@link ListEndpointGatewaysOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link EndpointGatewayCollection}
   */
  public ServiceCall<EndpointGatewayCollection> listEndpointGateways(ListEndpointGatewaysOptions listEndpointGatewaysOptions) {
    if (listEndpointGatewaysOptions == null) {
      listEndpointGatewaysOptions = new ListEndpointGatewaysOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/endpoint_gateways"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listEndpointGateways");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listEndpointGatewaysOptions.name() != null) {
      builder.query("name", String.valueOf(listEndpointGatewaysOptions.name()));
    }
    if (listEndpointGatewaysOptions.start() != null) {
      builder.query("start", String.valueOf(listEndpointGatewaysOptions.start()));
    }
    if (listEndpointGatewaysOptions.limit() != null) {
      builder.query("limit", String.valueOf(listEndpointGatewaysOptions.limit()));
    }
    if (listEndpointGatewaysOptions.resourceGroupId() != null) {
      builder.query("resource_group.id", String.valueOf(listEndpointGatewaysOptions.resourceGroupId()));
    }
    if (listEndpointGatewaysOptions.lifecycleState() != null) {
      builder.query("lifecycle_state", RequestUtils.join(listEndpointGatewaysOptions.lifecycleState(), ","));
    }
    if (listEndpointGatewaysOptions.vpcId() != null) {
      builder.query("vpc.id", String.valueOf(listEndpointGatewaysOptions.vpcId()));
    }
    if (listEndpointGatewaysOptions.vpcCrn() != null) {
      builder.query("vpc.crn", String.valueOf(listEndpointGatewaysOptions.vpcCrn()));
    }
    if (listEndpointGatewaysOptions.vpcName() != null) {
      builder.query("vpc.name", String.valueOf(listEndpointGatewaysOptions.vpcName()));
    }
    if (listEndpointGatewaysOptions.allowDnsResolutionBinding() != null) {
      builder.query("allow_dns_resolution_binding", String.valueOf(listEndpointGatewaysOptions.allowDnsResolutionBinding()));
    }
    ResponseConverter<EndpointGatewayCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<EndpointGatewayCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List endpoint gateways.
   *
   * This request lists endpoint gateways in the region. An endpoint gateway maps one or more reserved IPs in a VPC to a
   * target outside the VPC.
   *
   * @return a {@link ServiceCall} with a result of type {@link EndpointGatewayCollection}
   */
  public ServiceCall<EndpointGatewayCollection> listEndpointGateways() {
    return listEndpointGateways(null);
  }

  /**
   * Create an endpoint gateway.
   *
   * This request creates a new endpoint gateway. An endpoint gateway maps one or more reserved IPs in a VPC to a target
   * outside the VPC.
   *
   * @param createEndpointGatewayOptions the {@link CreateEndpointGatewayOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link EndpointGateway}
   */
  public ServiceCall<EndpointGateway> createEndpointGateway(CreateEndpointGatewayOptions createEndpointGatewayOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createEndpointGatewayOptions,
      "createEndpointGatewayOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/endpoint_gateways"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createEndpointGateway");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("target", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createEndpointGatewayOptions.target()));
    contentJson.add("vpc", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createEndpointGatewayOptions.vpc()));
    if (createEndpointGatewayOptions.allowDnsResolutionBinding() != null) {
      contentJson.addProperty("allow_dns_resolution_binding", createEndpointGatewayOptions.allowDnsResolutionBinding());
    }
    if (createEndpointGatewayOptions.ips() != null) {
      contentJson.add("ips", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createEndpointGatewayOptions.ips()));
    }
    if (createEndpointGatewayOptions.name() != null) {
      contentJson.addProperty("name", createEndpointGatewayOptions.name());
    }
    if (createEndpointGatewayOptions.resourceGroup() != null) {
      contentJson.add("resource_group", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createEndpointGatewayOptions.resourceGroup()));
    }
    if (createEndpointGatewayOptions.securityGroups() != null) {
      contentJson.add("security_groups", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createEndpointGatewayOptions.securityGroups()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<EndpointGateway> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<EndpointGateway>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List reserved IPs bound to an endpoint gateway.
   *
   * This request lists reserved IPs bound to an endpoint gateway.
   *
   * @param listEndpointGatewayIpsOptions the {@link ListEndpointGatewayIpsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ReservedIPCollectionEndpointGatewayContext}
   */
  public ServiceCall<ReservedIPCollectionEndpointGatewayContext> listEndpointGatewayIps(ListEndpointGatewayIpsOptions listEndpointGatewayIpsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listEndpointGatewayIpsOptions,
      "listEndpointGatewayIpsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("endpoint_gateway_id", listEndpointGatewayIpsOptions.endpointGatewayId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/endpoint_gateways/{endpoint_gateway_id}/ips", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listEndpointGatewayIps");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listEndpointGatewayIpsOptions.start() != null) {
      builder.query("start", String.valueOf(listEndpointGatewayIpsOptions.start()));
    }
    if (listEndpointGatewayIpsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listEndpointGatewayIpsOptions.limit()));
    }
    if (listEndpointGatewayIpsOptions.sort() != null) {
      builder.query("sort", String.valueOf(listEndpointGatewayIpsOptions.sort()));
    }
    ResponseConverter<ReservedIPCollectionEndpointGatewayContext> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ReservedIPCollectionEndpointGatewayContext>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Unbind a reserved IP from an endpoint gateway.
   *
   * This request unbinds the specified reserved IP from the specified endpoint gateway. If the reserved IP has
   * `auto_delete` set to `true`, the reserved IP will be deleted.
   *
   * @param removeEndpointGatewayIpOptions the {@link RemoveEndpointGatewayIpOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> removeEndpointGatewayIp(RemoveEndpointGatewayIpOptions removeEndpointGatewayIpOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(removeEndpointGatewayIpOptions,
      "removeEndpointGatewayIpOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("endpoint_gateway_id", removeEndpointGatewayIpOptions.endpointGatewayId());
    pathParamsMap.put("id", removeEndpointGatewayIpOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/endpoint_gateways/{endpoint_gateway_id}/ips/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "removeEndpointGatewayIp");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a reserved IP bound to an endpoint gateway.
   *
   * This request retrieves the specified reserved IP address if it is bound to the endpoint gateway specified in the
   * URL.
   *
   * @param getEndpointGatewayIpOptions the {@link GetEndpointGatewayIpOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ReservedIP}
   */
  public ServiceCall<ReservedIP> getEndpointGatewayIp(GetEndpointGatewayIpOptions getEndpointGatewayIpOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getEndpointGatewayIpOptions,
      "getEndpointGatewayIpOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("endpoint_gateway_id", getEndpointGatewayIpOptions.endpointGatewayId());
    pathParamsMap.put("id", getEndpointGatewayIpOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/endpoint_gateways/{endpoint_gateway_id}/ips/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getEndpointGatewayIp");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<ReservedIP> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ReservedIP>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Bind a reserved IP to an endpoint gateway.
   *
   * This request binds the specified reserved IP to the specified endpoint gateway. The reserved IP:
   *
   * - must currently be unbound, or not required by its target
   * - must not be in the same zone as any other reserved IP bound to the endpoint gateway.
   *
   * @param addEndpointGatewayIpOptions the {@link AddEndpointGatewayIpOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ReservedIP}
   */
  public ServiceCall<ReservedIP> addEndpointGatewayIp(AddEndpointGatewayIpOptions addEndpointGatewayIpOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(addEndpointGatewayIpOptions,
      "addEndpointGatewayIpOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("endpoint_gateway_id", addEndpointGatewayIpOptions.endpointGatewayId());
    pathParamsMap.put("id", addEndpointGatewayIpOptions.id());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/endpoint_gateways/{endpoint_gateway_id}/ips/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "addEndpointGatewayIp");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<ReservedIP> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ReservedIP>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete an endpoint gateway.
   *
   * This request deletes an endpoint gateway. This operation cannot be reversed.
   *
   * Reserved IPs that were bound to the endpoint gateway will be released if their
   * `auto_delete` property is set to true.
   *
   * @param deleteEndpointGatewayOptions the {@link DeleteEndpointGatewayOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteEndpointGateway(DeleteEndpointGatewayOptions deleteEndpointGatewayOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteEndpointGatewayOptions,
      "deleteEndpointGatewayOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteEndpointGatewayOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/endpoint_gateways/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteEndpointGateway");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve an endpoint gateway.
   *
   * This request retrieves a single endpoint gateway specified by the identifier in the URL.
   *
   * @param getEndpointGatewayOptions the {@link GetEndpointGatewayOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link EndpointGateway}
   */
  public ServiceCall<EndpointGateway> getEndpointGateway(GetEndpointGatewayOptions getEndpointGatewayOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getEndpointGatewayOptions,
      "getEndpointGatewayOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getEndpointGatewayOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/endpoint_gateways/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getEndpointGateway");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<EndpointGateway> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<EndpointGateway>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update an endpoint gateway.
   *
   * This request updates an endpoint gateway's name.
   *
   * @param updateEndpointGatewayOptions the {@link UpdateEndpointGatewayOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link EndpointGateway}
   */
  public ServiceCall<EndpointGateway> updateEndpointGateway(UpdateEndpointGatewayOptions updateEndpointGatewayOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateEndpointGatewayOptions,
      "updateEndpointGatewayOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateEndpointGatewayOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/endpoint_gateways/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateEndpointGateway");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateEndpointGatewayOptions.endpointGatewayPatch()), "application/merge-patch+json");
    ResponseConverter<EndpointGateway> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<EndpointGateway>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List flow log collectors.
   *
   * This request lists flow log collectors in the region. A [flow log
   * collector](https://cloud.ibm.com/docs/vpc?topic=vpc-flow-logs) summarizes TCP and UDP data sent over the instance
   * network interfaces and instance network attachments contained within its target. The collected flow logs are
   * written to a cloud object storage bucket, where they can be
   * [viewed](https://cloud.ibm.com/docs/vpc?topic=vpc-fl-analyze).
   *
   * @param listFlowLogCollectorsOptions the {@link ListFlowLogCollectorsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link FlowLogCollectorCollection}
   */
  public ServiceCall<FlowLogCollectorCollection> listFlowLogCollectors(ListFlowLogCollectorsOptions listFlowLogCollectorsOptions) {
    if (listFlowLogCollectorsOptions == null) {
      listFlowLogCollectorsOptions = new ListFlowLogCollectorsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/flow_log_collectors"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listFlowLogCollectors");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listFlowLogCollectorsOptions.start() != null) {
      builder.query("start", String.valueOf(listFlowLogCollectorsOptions.start()));
    }
    if (listFlowLogCollectorsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listFlowLogCollectorsOptions.limit()));
    }
    if (listFlowLogCollectorsOptions.resourceGroupId() != null) {
      builder.query("resource_group.id", String.valueOf(listFlowLogCollectorsOptions.resourceGroupId()));
    }
    if (listFlowLogCollectorsOptions.name() != null) {
      builder.query("name", String.valueOf(listFlowLogCollectorsOptions.name()));
    }
    if (listFlowLogCollectorsOptions.vpcId() != null) {
      builder.query("vpc.id", String.valueOf(listFlowLogCollectorsOptions.vpcId()));
    }
    if (listFlowLogCollectorsOptions.vpcCrn() != null) {
      builder.query("vpc.crn", String.valueOf(listFlowLogCollectorsOptions.vpcCrn()));
    }
    if (listFlowLogCollectorsOptions.vpcName() != null) {
      builder.query("vpc.name", String.valueOf(listFlowLogCollectorsOptions.vpcName()));
    }
    if (listFlowLogCollectorsOptions.targetId() != null) {
      builder.query("target.id", String.valueOf(listFlowLogCollectorsOptions.targetId()));
    }
    if (listFlowLogCollectorsOptions.targetResourceType() != null) {
      builder.query("target.resource_type", String.valueOf(listFlowLogCollectorsOptions.targetResourceType()));
    }
    ResponseConverter<FlowLogCollectorCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<FlowLogCollectorCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List flow log collectors.
   *
   * This request lists flow log collectors in the region. A [flow log
   * collector](https://cloud.ibm.com/docs/vpc?topic=vpc-flow-logs) summarizes TCP and UDP data sent over the instance
   * network interfaces and instance network attachments contained within its target. The collected flow logs are
   * written to a cloud object storage bucket, where they can be
   * [viewed](https://cloud.ibm.com/docs/vpc?topic=vpc-fl-analyze).
   *
   * @return a {@link ServiceCall} with a result of type {@link FlowLogCollectorCollection}
   */
  public ServiceCall<FlowLogCollectorCollection> listFlowLogCollectors() {
    return listFlowLogCollectors(null);
  }

  /**
   * Create a flow log collector.
   *
   * This request creates and starts a new flow log collector from a flow log collector prototype object. The prototype
   * object is structured in the same way as a retrieved flow log collector, and contains the information necessary to
   * create and start the new flow log collector.
   *
   * @param createFlowLogCollectorOptions the {@link CreateFlowLogCollectorOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link FlowLogCollector}
   */
  public ServiceCall<FlowLogCollector> createFlowLogCollector(CreateFlowLogCollectorOptions createFlowLogCollectorOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createFlowLogCollectorOptions,
      "createFlowLogCollectorOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/flow_log_collectors"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createFlowLogCollector");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("storage_bucket", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createFlowLogCollectorOptions.storageBucket()));
    contentJson.add("target", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createFlowLogCollectorOptions.target()));
    if (createFlowLogCollectorOptions.active() != null) {
      contentJson.addProperty("active", createFlowLogCollectorOptions.active());
    }
    if (createFlowLogCollectorOptions.name() != null) {
      contentJson.addProperty("name", createFlowLogCollectorOptions.name());
    }
    if (createFlowLogCollectorOptions.resourceGroup() != null) {
      contentJson.add("resource_group", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createFlowLogCollectorOptions.resourceGroup()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<FlowLogCollector> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<FlowLogCollector>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a flow log collector.
   *
   * This request stops and deletes a flow log collector. This operation cannot be reversed.
   *
   * Collected flow logs remain available within the flow log collector's Cloud Object Storage bucket.
   *
   * @param deleteFlowLogCollectorOptions the {@link DeleteFlowLogCollectorOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteFlowLogCollector(DeleteFlowLogCollectorOptions deleteFlowLogCollectorOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteFlowLogCollectorOptions,
      "deleteFlowLogCollectorOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteFlowLogCollectorOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/flow_log_collectors/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deleteFlowLogCollector");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a flow log collector.
   *
   * This request retrieves a single flow log collector specified by the identifier in the URL.
   *
   * @param getFlowLogCollectorOptions the {@link GetFlowLogCollectorOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link FlowLogCollector}
   */
  public ServiceCall<FlowLogCollector> getFlowLogCollector(GetFlowLogCollectorOptions getFlowLogCollectorOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getFlowLogCollectorOptions,
      "getFlowLogCollectorOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getFlowLogCollectorOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/flow_log_collectors/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getFlowLogCollector");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<FlowLogCollector> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<FlowLogCollector>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a flow log collector.
   *
   * This request updates a flow log collector with the information in a provided flow log collector patch. The flow log
   * collector patch object is structured in the same way as a retrieved flow log collector and contains only the
   * information to be updated.
   *
   * @param updateFlowLogCollectorOptions the {@link UpdateFlowLogCollectorOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link FlowLogCollector}
   */
  public ServiceCall<FlowLogCollector> updateFlowLogCollector(UpdateFlowLogCollectorOptions updateFlowLogCollectorOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateFlowLogCollectorOptions,
      "updateFlowLogCollectorOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateFlowLogCollectorOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/flow_log_collectors/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updateFlowLogCollector");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateFlowLogCollectorOptions.flowLogCollectorPatch()), "application/merge-patch+json");
    ResponseConverter<FlowLogCollector> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<FlowLogCollector>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List private path service gateways.
   *
   * This request lists private path service gateways in the region. Private path service gateways allow
   * [service
   * providers](https://cloud.ibm.com/docs/private-path?topic=private-path-private-path-service-architecture#private-path-service-components)
   * to make their services available using
   * [private path
   * connectivity](https://cloud.ibm.com/docs/private-path?topic=private-path-private-path-service-architecture#private-path-service-components).
   * Private path service gateways are used to facilitate and manage the private path connectivity between private path
   * network load balancers and their associated endpoint gateways.
   *
   * @param listPrivatePathServiceGatewaysOptions the {@link ListPrivatePathServiceGatewaysOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PrivatePathServiceGatewayCollection}
   */
  public ServiceCall<PrivatePathServiceGatewayCollection> listPrivatePathServiceGateways(ListPrivatePathServiceGatewaysOptions listPrivatePathServiceGatewaysOptions) {
    if (listPrivatePathServiceGatewaysOptions == null) {
      listPrivatePathServiceGatewaysOptions = new ListPrivatePathServiceGatewaysOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/private_path_service_gateways"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listPrivatePathServiceGateways");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listPrivatePathServiceGatewaysOptions.start() != null) {
      builder.query("start", String.valueOf(listPrivatePathServiceGatewaysOptions.start()));
    }
    if (listPrivatePathServiceGatewaysOptions.limit() != null) {
      builder.query("limit", String.valueOf(listPrivatePathServiceGatewaysOptions.limit()));
    }
    if (listPrivatePathServiceGatewaysOptions.resourceGroupId() != null) {
      builder.query("resource_group.id", String.valueOf(listPrivatePathServiceGatewaysOptions.resourceGroupId()));
    }
    ResponseConverter<PrivatePathServiceGatewayCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PrivatePathServiceGatewayCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List private path service gateways.
   *
   * This request lists private path service gateways in the region. Private path service gateways allow
   * [service
   * providers](https://cloud.ibm.com/docs/private-path?topic=private-path-private-path-service-architecture#private-path-service-components)
   * to make their services available using
   * [private path
   * connectivity](https://cloud.ibm.com/docs/private-path?topic=private-path-private-path-service-architecture#private-path-service-components).
   * Private path service gateways are used to facilitate and manage the private path connectivity between private path
   * network load balancers and their associated endpoint gateways.
   *
   * @return a {@link ServiceCall} with a result of type {@link PrivatePathServiceGatewayCollection}
   */
  public ServiceCall<PrivatePathServiceGatewayCollection> listPrivatePathServiceGateways() {
    return listPrivatePathServiceGateways(null);
  }

  /**
   * Create a private path service gateway.
   *
   * This request creates a private path service gateway from a private path service gateway prototype object. The
   * prototype object is structured in the same way as a retrieved private path service gateway, and contains the
   * information necessary to create the new private path service gateway.
   *
   * @param createPrivatePathServiceGatewayOptions the {@link CreatePrivatePathServiceGatewayOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PrivatePathServiceGateway}
   */
  public ServiceCall<PrivatePathServiceGateway> createPrivatePathServiceGateway(CreatePrivatePathServiceGatewayOptions createPrivatePathServiceGatewayOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createPrivatePathServiceGatewayOptions,
      "createPrivatePathServiceGatewayOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/private_path_service_gateways"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createPrivatePathServiceGateway");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("load_balancer", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPrivatePathServiceGatewayOptions.loadBalancer()));
    contentJson.add("service_endpoints", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPrivatePathServiceGatewayOptions.serviceEndpoints()));
    if (createPrivatePathServiceGatewayOptions.defaultAccessPolicy() != null) {
      contentJson.addProperty("default_access_policy", createPrivatePathServiceGatewayOptions.defaultAccessPolicy());
    }
    if (createPrivatePathServiceGatewayOptions.name() != null) {
      contentJson.addProperty("name", createPrivatePathServiceGatewayOptions.name());
    }
    if (createPrivatePathServiceGatewayOptions.resourceGroup() != null) {
      contentJson.add("resource_group", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPrivatePathServiceGatewayOptions.resourceGroup()));
    }
    if (createPrivatePathServiceGatewayOptions.zonalAffinity() != null) {
      contentJson.addProperty("zonal_affinity", createPrivatePathServiceGatewayOptions.zonalAffinity());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<PrivatePathServiceGateway> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PrivatePathServiceGateway>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a private path service gateway.
   *
   * This request deletes a private path service gateway.  For this request to succeed, the value of
   * `endpoint_gateway_count` must be `0`. This operation cannot be reversed.
   *
   * @param deletePrivatePathServiceGatewayOptions the {@link DeletePrivatePathServiceGatewayOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deletePrivatePathServiceGateway(DeletePrivatePathServiceGatewayOptions deletePrivatePathServiceGatewayOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deletePrivatePathServiceGatewayOptions,
      "deletePrivatePathServiceGatewayOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deletePrivatePathServiceGatewayOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/private_path_service_gateways/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deletePrivatePathServiceGateway");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a private path service gateway.
   *
   * This request retrieves the private path service gateway specified by the identifier in the URL.
   *
   * @param getPrivatePathServiceGatewayOptions the {@link GetPrivatePathServiceGatewayOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PrivatePathServiceGateway}
   */
  public ServiceCall<PrivatePathServiceGateway> getPrivatePathServiceGateway(GetPrivatePathServiceGatewayOptions getPrivatePathServiceGatewayOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getPrivatePathServiceGatewayOptions,
      "getPrivatePathServiceGatewayOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getPrivatePathServiceGatewayOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/private_path_service_gateways/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getPrivatePathServiceGateway");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<PrivatePathServiceGateway> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PrivatePathServiceGateway>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a private path service gateway.
   *
   * This request updates a private path service gateway with the information provided in a private path service gateway
   * patch object. The private path service gateway patch object is structured in the same way as a retrieved private
   * path service gateway and contains only the information to be updated.
   *
   * @param updatePrivatePathServiceGatewayOptions the {@link UpdatePrivatePathServiceGatewayOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PrivatePathServiceGateway}
   */
  public ServiceCall<PrivatePathServiceGateway> updatePrivatePathServiceGateway(UpdatePrivatePathServiceGatewayOptions updatePrivatePathServiceGatewayOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updatePrivatePathServiceGatewayOptions,
      "updatePrivatePathServiceGatewayOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updatePrivatePathServiceGatewayOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/private_path_service_gateways/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updatePrivatePathServiceGateway");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updatePrivatePathServiceGatewayOptions.privatePathServiceGatewayPatch()), "application/merge-patch+json");
    ResponseConverter<PrivatePathServiceGateway> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PrivatePathServiceGateway>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List account policies for a private path service gateway.
   *
   * This request lists account policies for a private path service gateway. Each policy defines how requests to use the
   * private path service gateway from that account will be handled.
   *
   * The account policies will be sorted by their `created_at` property values, with newest account policies first.
   * Account policies with identical `created_at` property values will in turn be sorted by ascending `id` property
   * values.
   *
   * @param listPrivatePathServiceGatewayAccountPoliciesOptions the {@link ListPrivatePathServiceGatewayAccountPoliciesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PrivatePathServiceGatewayAccountPolicyCollection}
   */
  public ServiceCall<PrivatePathServiceGatewayAccountPolicyCollection> listPrivatePathServiceGatewayAccountPolicies(ListPrivatePathServiceGatewayAccountPoliciesOptions listPrivatePathServiceGatewayAccountPoliciesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listPrivatePathServiceGatewayAccountPoliciesOptions,
      "listPrivatePathServiceGatewayAccountPoliciesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("private_path_service_gateway_id", listPrivatePathServiceGatewayAccountPoliciesOptions.privatePathServiceGatewayId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/private_path_service_gateways/{private_path_service_gateway_id}/account_policies", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listPrivatePathServiceGatewayAccountPolicies");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listPrivatePathServiceGatewayAccountPoliciesOptions.start() != null) {
      builder.query("start", String.valueOf(listPrivatePathServiceGatewayAccountPoliciesOptions.start()));
    }
    if (listPrivatePathServiceGatewayAccountPoliciesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listPrivatePathServiceGatewayAccountPoliciesOptions.limit()));
    }
    if (listPrivatePathServiceGatewayAccountPoliciesOptions.accountId() != null) {
      builder.query("account.id", String.valueOf(listPrivatePathServiceGatewayAccountPoliciesOptions.accountId()));
    }
    ResponseConverter<PrivatePathServiceGatewayAccountPolicyCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PrivatePathServiceGatewayAccountPolicyCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create an account policy for a private path service gateway.
   *
   * This request creates an account policy from an account policy prototype object. The prototype object is structured
   * in the same way as a retrieved account policy, and contains the information necessary to create the new account
   * policy.
   *
   * @param createPrivatePathServiceGatewayAccountPolicyOptions the {@link CreatePrivatePathServiceGatewayAccountPolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PrivatePathServiceGatewayAccountPolicy}
   */
  public ServiceCall<PrivatePathServiceGatewayAccountPolicy> createPrivatePathServiceGatewayAccountPolicy(CreatePrivatePathServiceGatewayAccountPolicyOptions createPrivatePathServiceGatewayAccountPolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createPrivatePathServiceGatewayAccountPolicyOptions,
      "createPrivatePathServiceGatewayAccountPolicyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("private_path_service_gateway_id", createPrivatePathServiceGatewayAccountPolicyOptions.privatePathServiceGatewayId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/private_path_service_gateways/{private_path_service_gateway_id}/account_policies", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "createPrivatePathServiceGatewayAccountPolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("access_policy", createPrivatePathServiceGatewayAccountPolicyOptions.accessPolicy());
    contentJson.add("account", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPrivatePathServiceGatewayAccountPolicyOptions.account()));
    builder.bodyJson(contentJson);
    ResponseConverter<PrivatePathServiceGatewayAccountPolicy> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PrivatePathServiceGatewayAccountPolicy>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete an account policy for a private path service gateway.
   *
   * This request deletes an account policy. This operation cannot be reversed and it does not affect the `status` of
   * any existing endpoint gateway bindings.
   *
   * @param deletePrivatePathServiceGatewayAccountPolicyOptions the {@link DeletePrivatePathServiceGatewayAccountPolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deletePrivatePathServiceGatewayAccountPolicy(DeletePrivatePathServiceGatewayAccountPolicyOptions deletePrivatePathServiceGatewayAccountPolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deletePrivatePathServiceGatewayAccountPolicyOptions,
      "deletePrivatePathServiceGatewayAccountPolicyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("private_path_service_gateway_id", deletePrivatePathServiceGatewayAccountPolicyOptions.privatePathServiceGatewayId());
    pathParamsMap.put("id", deletePrivatePathServiceGatewayAccountPolicyOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/private_path_service_gateways/{private_path_service_gateway_id}/account_policies/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "deletePrivatePathServiceGatewayAccountPolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve an account policy for a private path service gateway.
   *
   * This request retrieves a single account policy specified by the identifier in the URL.
   *
   * @param getPrivatePathServiceGatewayAccountPolicyOptions the {@link GetPrivatePathServiceGatewayAccountPolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PrivatePathServiceGatewayAccountPolicy}
   */
  public ServiceCall<PrivatePathServiceGatewayAccountPolicy> getPrivatePathServiceGatewayAccountPolicy(GetPrivatePathServiceGatewayAccountPolicyOptions getPrivatePathServiceGatewayAccountPolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getPrivatePathServiceGatewayAccountPolicyOptions,
      "getPrivatePathServiceGatewayAccountPolicyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("private_path_service_gateway_id", getPrivatePathServiceGatewayAccountPolicyOptions.privatePathServiceGatewayId());
    pathParamsMap.put("id", getPrivatePathServiceGatewayAccountPolicyOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/private_path_service_gateways/{private_path_service_gateway_id}/account_policies/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getPrivatePathServiceGatewayAccountPolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<PrivatePathServiceGatewayAccountPolicy> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PrivatePathServiceGatewayAccountPolicy>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update an account policy for a private path service gateway.
   *
   * This request updates an account policy with the information in a provided account policy patch. The account policy
   * patch object is structured in the same way as a retrieved account policy and contains only the information to be
   * updated.
   *
   * @param updatePrivatePathServiceGatewayAccountPolicyOptions the {@link UpdatePrivatePathServiceGatewayAccountPolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PrivatePathServiceGatewayAccountPolicy}
   */
  public ServiceCall<PrivatePathServiceGatewayAccountPolicy> updatePrivatePathServiceGatewayAccountPolicy(UpdatePrivatePathServiceGatewayAccountPolicyOptions updatePrivatePathServiceGatewayAccountPolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updatePrivatePathServiceGatewayAccountPolicyOptions,
      "updatePrivatePathServiceGatewayAccountPolicyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("private_path_service_gateway_id", updatePrivatePathServiceGatewayAccountPolicyOptions.privatePathServiceGatewayId());
    pathParamsMap.put("id", updatePrivatePathServiceGatewayAccountPolicyOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/private_path_service_gateways/{private_path_service_gateway_id}/account_policies/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "updatePrivatePathServiceGatewayAccountPolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updatePrivatePathServiceGatewayAccountPolicyOptions.privatePathServiceGatewayAccountPolicyPatch()), "application/merge-patch+json");
    ResponseConverter<PrivatePathServiceGatewayAccountPolicy> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PrivatePathServiceGatewayAccountPolicy>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List endpoint gateway bindings for a private path service gateway.
   *
   * This request lists endpoint gateway bindings for a private path service gateway. Each endpoint gateway binding is
   * implicitly created when an endpoint gateway is created targeting the private path service gateway. The associated
   * account policy is applied to all new endpoint gateway bindings. If an associated account policy doesn't exist, the
   * private path service gateway's `default_access_policy` is used.
   *
   * The endpoint gateway bindings will be sorted by their `created_at` property values, with newest endpoint gateway
   * bindings first. Endpoint gateway bindings with identical
   * `created_at` property values will in turn be sorted by ascending `name` property values.
   *
   * @param listPrivatePathServiceGatewayEndpointGatewayBindingsOptions the {@link ListPrivatePathServiceGatewayEndpointGatewayBindingsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PrivatePathServiceGatewayEndpointGatewayBindingCollection}
   */
  public ServiceCall<PrivatePathServiceGatewayEndpointGatewayBindingCollection> listPrivatePathServiceGatewayEndpointGatewayBindings(ListPrivatePathServiceGatewayEndpointGatewayBindingsOptions listPrivatePathServiceGatewayEndpointGatewayBindingsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listPrivatePathServiceGatewayEndpointGatewayBindingsOptions,
      "listPrivatePathServiceGatewayEndpointGatewayBindingsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("private_path_service_gateway_id", listPrivatePathServiceGatewayEndpointGatewayBindingsOptions.privatePathServiceGatewayId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/private_path_service_gateways/{private_path_service_gateway_id}/endpoint_gateway_bindings", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "listPrivatePathServiceGatewayEndpointGatewayBindings");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    if (listPrivatePathServiceGatewayEndpointGatewayBindingsOptions.start() != null) {
      builder.query("start", String.valueOf(listPrivatePathServiceGatewayEndpointGatewayBindingsOptions.start()));
    }
    if (listPrivatePathServiceGatewayEndpointGatewayBindingsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listPrivatePathServiceGatewayEndpointGatewayBindingsOptions.limit()));
    }
    if (listPrivatePathServiceGatewayEndpointGatewayBindingsOptions.status() != null) {
      builder.query("status", String.valueOf(listPrivatePathServiceGatewayEndpointGatewayBindingsOptions.status()));
    }
    if (listPrivatePathServiceGatewayEndpointGatewayBindingsOptions.accountId() != null) {
      builder.query("account.id", String.valueOf(listPrivatePathServiceGatewayEndpointGatewayBindingsOptions.accountId()));
    }
    ResponseConverter<PrivatePathServiceGatewayEndpointGatewayBindingCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PrivatePathServiceGatewayEndpointGatewayBindingCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve an endpoint gateway binding for a private path service gateway.
   *
   * This request retrieves a single endpoint gateway binding specified by the identifier in the URL.
   *
   * @param getPrivatePathServiceGatewayEndpointGatewayBindingOptions the {@link GetPrivatePathServiceGatewayEndpointGatewayBindingOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PrivatePathServiceGatewayEndpointGatewayBinding}
   */
  public ServiceCall<PrivatePathServiceGatewayEndpointGatewayBinding> getPrivatePathServiceGatewayEndpointGatewayBinding(GetPrivatePathServiceGatewayEndpointGatewayBindingOptions getPrivatePathServiceGatewayEndpointGatewayBindingOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getPrivatePathServiceGatewayEndpointGatewayBindingOptions,
      "getPrivatePathServiceGatewayEndpointGatewayBindingOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("private_path_service_gateway_id", getPrivatePathServiceGatewayEndpointGatewayBindingOptions.privatePathServiceGatewayId());
    pathParamsMap.put("id", getPrivatePathServiceGatewayEndpointGatewayBindingOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/private_path_service_gateways/{private_path_service_gateway_id}/endpoint_gateway_bindings/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "getPrivatePathServiceGatewayEndpointGatewayBinding");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<PrivatePathServiceGatewayEndpointGatewayBinding> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PrivatePathServiceGatewayEndpointGatewayBinding>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Deny an endpoint gateway binding for a private path service gateway.
   *
   * This request denies a `pending` endpoint gateway request, and optionally sets the policy to deny future requests
   * from the same account.
   *
   * @param denyPrivatePathServiceGatewayEndpointGatewayBindingOptions the {@link DenyPrivatePathServiceGatewayEndpointGatewayBindingOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> denyPrivatePathServiceGatewayEndpointGatewayBinding(DenyPrivatePathServiceGatewayEndpointGatewayBindingOptions denyPrivatePathServiceGatewayEndpointGatewayBindingOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(denyPrivatePathServiceGatewayEndpointGatewayBindingOptions,
      "denyPrivatePathServiceGatewayEndpointGatewayBindingOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("private_path_service_gateway_id", denyPrivatePathServiceGatewayEndpointGatewayBindingOptions.privatePathServiceGatewayId());
    pathParamsMap.put("id", denyPrivatePathServiceGatewayEndpointGatewayBindingOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/private_path_service_gateways/{private_path_service_gateway_id}/endpoint_gateway_bindings/{id}/deny", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "denyPrivatePathServiceGatewayEndpointGatewayBinding");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    if (denyPrivatePathServiceGatewayEndpointGatewayBindingOptions.setAccountPolicy() != null) {
      contentJson.addProperty("set_account_policy", denyPrivatePathServiceGatewayEndpointGatewayBindingOptions.setAccountPolicy());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Permit an endpoint gateway binding for a private path service gateway.
   *
   * This request permits a `pending` endpoint gateway request, and optionally sets the policy to permit future requests
   * from the same account.
   *
   * @param permitPrivatePathServiceGatewayEndpointGatewayBindingOptions the {@link PermitPrivatePathServiceGatewayEndpointGatewayBindingOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> permitPrivatePathServiceGatewayEndpointGatewayBinding(PermitPrivatePathServiceGatewayEndpointGatewayBindingOptions permitPrivatePathServiceGatewayEndpointGatewayBindingOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(permitPrivatePathServiceGatewayEndpointGatewayBindingOptions,
      "permitPrivatePathServiceGatewayEndpointGatewayBindingOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("private_path_service_gateway_id", permitPrivatePathServiceGatewayEndpointGatewayBindingOptions.privatePathServiceGatewayId());
    pathParamsMap.put("id", permitPrivatePathServiceGatewayEndpointGatewayBindingOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/private_path_service_gateways/{private_path_service_gateway_id}/endpoint_gateway_bindings/{id}/permit", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "permitPrivatePathServiceGatewayEndpointGatewayBinding");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    if (permitPrivatePathServiceGatewayEndpointGatewayBindingOptions.setAccountPolicy() != null) {
      contentJson.addProperty("set_account_policy", permitPrivatePathServiceGatewayEndpointGatewayBindingOptions.setAccountPolicy());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Publish a private path service gateway.
   *
   * This request publishes a private path service gateway, allowing any account to request access to it.
   *
   * @param publishPrivatePathServiceGatewayOptions the {@link PublishPrivatePathServiceGatewayOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> publishPrivatePathServiceGateway(PublishPrivatePathServiceGatewayOptions publishPrivatePathServiceGatewayOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(publishPrivatePathServiceGatewayOptions,
      "publishPrivatePathServiceGatewayOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("private_path_service_gateway_id", publishPrivatePathServiceGatewayOptions.privatePathServiceGatewayId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/private_path_service_gateways/{private_path_service_gateway_id}/publish", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "publishPrivatePathServiceGateway");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Revoke access to a private path service gateway for an account.
   *
   * This request revokes a consumer account. This operation cannot be reversed. The `status` of all endpoint gateway
   * bindings associated with the specified private path service gateway become `denied`. If the specified account has
   * an existing access policy, that policy will be updated to `denied`. Otherwise, a new `deny` access policy will be
   * created for the account.
   *
   * @param revokeAccountForPrivatePathServiceGatewayOptions the {@link RevokeAccountForPrivatePathServiceGatewayOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> revokeAccountForPrivatePathServiceGateway(RevokeAccountForPrivatePathServiceGatewayOptions revokeAccountForPrivatePathServiceGatewayOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(revokeAccountForPrivatePathServiceGatewayOptions,
      "revokeAccountForPrivatePathServiceGatewayOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("private_path_service_gateway_id", revokeAccountForPrivatePathServiceGatewayOptions.privatePathServiceGatewayId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/private_path_service_gateways/{private_path_service_gateway_id}/revoke_account", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "revokeAccountForPrivatePathServiceGateway");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("account", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(revokeAccountForPrivatePathServiceGatewayOptions.account()));
    builder.bodyJson(contentJson);
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Unpublish a private path service gateway.
   *
   * This request unpublishes a private path service gateway. For this request to succeed, any existing access from
   * other accounts must first be revoked. Once unpublished, access will again be restricted to the account that created
   * this private path service gateway.
   *
   * @param unpublishPrivatePathServiceGatewayOptions the {@link UnpublishPrivatePathServiceGatewayOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> unpublishPrivatePathServiceGateway(UnpublishPrivatePathServiceGatewayOptions unpublishPrivatePathServiceGatewayOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(unpublishPrivatePathServiceGatewayOptions,
      "unpublishPrivatePathServiceGatewayOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("private_path_service_gateway_id", unpublishPrivatePathServiceGatewayOptions.privatePathServiceGatewayId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/private_path_service_gateways/{private_path_service_gateway_id}/unpublish", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("vpc", "v1", "unpublishPrivatePathServiceGateway");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    builder.query("generation", String.valueOf(this.generation));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

}
