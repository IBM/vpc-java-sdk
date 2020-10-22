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

import com.ibm.cloud.is.test.SdkIntegrationTestBase;
import com.ibm.cloud.is.vpc.v1.model.AddInstanceNetworkInterfaceFloatingIpOptions;
import com.ibm.cloud.is.vpc.v1.model.AddSecurityGroupNetworkInterfaceOptions;
import com.ibm.cloud.is.vpc.v1.model.AddVpnGatewayConnectionLocalCidrOptions;
import com.ibm.cloud.is.vpc.v1.model.AddVpnGatewayConnectionPeerCidrOptions;
import com.ibm.cloud.is.vpc.v1.model.AddressPrefix;
import com.ibm.cloud.is.vpc.v1.model.AddressPrefixCollection;
import com.ibm.cloud.is.vpc.v1.model.AddressPrefixCollection;
import com.ibm.cloud.is.vpc.v1.model.AddressPrefixPatch;
import com.ibm.cloud.is.vpc.v1.model.CheckVpnGatewayConnectionLocalCidrOptions;
import com.ibm.cloud.is.vpc.v1.model.CheckVpnGatewayConnectionPeerCidrOptions;
import com.ibm.cloud.is.vpc.v1.model.CloudObjectStorageBucketIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.CreateFloatingIpOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateFlowLogCollectorOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateIkePolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateImageOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateInstanceActionOptions;
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
import com.ibm.cloud.is.vpc.v1.model.CreatePublicGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateSecurityGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateSecurityGroupRuleOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateSubnetOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateVolumeOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateVpcAddressPrefixOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateVpcOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateVpcRouteOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateVpnGatewayConnectionOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateVpnGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.DefaultNetworkACL;
import com.ibm.cloud.is.vpc.v1.model.DefaultSecurityGroup;
import com.ibm.cloud.is.vpc.v1.model.DeleteFloatingIpOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteFlowLogCollectorOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteIkePolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteImageOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteInstanceGroupLoadBalancerOptions;
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
import com.ibm.cloud.is.vpc.v1.model.DeleteNetworkAclOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteNetworkAclRuleOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteNetworkAclRuleOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteNetworkAclRuleOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteNetworkAclRuleOptions;
import com.ibm.cloud.is.vpc.v1.model.DeletePublicGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteSecurityGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteSecurityGroupRuleOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteSubnetOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteVolumeOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteVpcAddressPrefixOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteVpcOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteVpcRouteOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteVpnGatewayConnectionOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteVpnGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.FloatingIP;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPCollection;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPPatch;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPPrototypeFloatingIPByZone;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPUnpaginatedCollection;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollector;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorCollection;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorCollection;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorCollection;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorPatch;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorPrototypeTargetNetworkInterfaceIdentityNetworkInterfaceIdentityNetworkInterfaceIdentityById;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorPrototypeTargetSubnetIdentitySubnetIdentityById;
import com.ibm.cloud.is.vpc.v1.model.GetFloatingIpOptions;
import com.ibm.cloud.is.vpc.v1.model.GetFlowLogCollectorOptions;
import com.ibm.cloud.is.vpc.v1.model.GetIkePolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.GetImageOptions;
import com.ibm.cloud.is.vpc.v1.model.GetInstanceGroupManagerOptions;
import com.ibm.cloud.is.vpc.v1.model.GetInstanceGroupManagerPolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.GetInstanceGroupMembershipOptions;
import com.ibm.cloud.is.vpc.v1.model.GetInstanceGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.GetInstanceInitializationOptions;
import com.ibm.cloud.is.vpc.v1.model.GetInstanceNetworkInterfaceFloatingIpOptions;
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
import com.ibm.cloud.is.vpc.v1.model.GetNetworkAclRuleOptions;
import com.ibm.cloud.is.vpc.v1.model.GetNetworkAclRuleOptions;
import com.ibm.cloud.is.vpc.v1.model.GetOperatingSystemOptions;
import com.ibm.cloud.is.vpc.v1.model.GetPublicGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.GetRegionOptions;
import com.ibm.cloud.is.vpc.v1.model.GetRegionZoneOptions;
import com.ibm.cloud.is.vpc.v1.model.GetSecurityGroupNetworkInterfaceOptions;
import com.ibm.cloud.is.vpc.v1.model.GetSecurityGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.GetSecurityGroupRuleOptions;
import com.ibm.cloud.is.vpc.v1.model.GetSubnetNetworkAclOptions;
import com.ibm.cloud.is.vpc.v1.model.GetSubnetOptions;
import com.ibm.cloud.is.vpc.v1.model.GetSubnetPublicGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVolumeOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVolumeProfileOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVpcAddressPrefixOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVpcDefaultNetworkAclOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVpcDefaultSecurityGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVpcOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVpcRouteOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVpnGatewayConnectionOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVpnGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.IKEPolicy;
import com.ibm.cloud.is.vpc.v1.model.IKEPolicyCollection;
import com.ibm.cloud.is.vpc.v1.model.IKEPolicyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.IKEPolicyPatch;
import com.ibm.cloud.is.vpc.v1.model.IPsecPolicy;
import com.ibm.cloud.is.vpc.v1.model.IPsecPolicyCollection;
import com.ibm.cloud.is.vpc.v1.model.IPsecPolicyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.IPsecPolicyPatch;
import com.ibm.cloud.is.vpc.v1.model.Image;
import com.ibm.cloud.is.vpc.v1.model.ImageCollection;
import com.ibm.cloud.is.vpc.v1.model.ImageFilePrototype;
import com.ibm.cloud.is.vpc.v1.model.ImageIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ImagePatch;
import com.ibm.cloud.is.vpc.v1.model.ImagePrototypeImageByFile;
import com.ibm.cloud.is.vpc.v1.model.Instance;
import com.ibm.cloud.is.vpc.v1.model.InstanceAction;
import com.ibm.cloud.is.vpc.v1.model.InstanceCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroup;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManager;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPolicy;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPolicyCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPolicyPatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupMembership;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupMembershipCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupMembershipPatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupPatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceInitialization;
import com.ibm.cloud.is.vpc.v1.model.InstancePatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfile;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.InstancePrototypeInstanceByImage;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplate;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateIdentityById;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplatePatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplatePrototypeInstanceByImage;
import com.ibm.cloud.is.vpc.v1.model.Key;
import com.ibm.cloud.is.vpc.v1.model.KeyCollection;
import com.ibm.cloud.is.vpc.v1.model.KeyIdentity;
import com.ibm.cloud.is.vpc.v1.model.KeyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.KeyPatch;
import com.ibm.cloud.is.vpc.v1.model.ListFloatingIpsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListFlowLogCollectorsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListIkePoliciesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListIkePolicyConnectionsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListImagesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListInstanceGroupManagerPoliciesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListInstanceGroupManagersOptions;
import com.ibm.cloud.is.vpc.v1.model.ListInstanceGroupMembershipsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListInstanceGroupsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListInstanceNetworkInterfaceFloatingIpsOptions;
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
import com.ibm.cloud.is.vpc.v1.model.ListNetworkAclsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListNetworkAclsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListOperatingSystemsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListPublicGatewaysOptions;
import com.ibm.cloud.is.vpc.v1.model.ListRegionZonesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListRegionsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListSecurityGroupNetworkInterfacesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListSecurityGroupRulesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListSecurityGroupsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListSecurityGroupsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListSubnetsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVolumeProfilesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVolumesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVolumesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVolumesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVpcAddressPrefixesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVpcRoutesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVpcsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVpnGatewayConnectionLocalCidrsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVpnGatewayConnectionPeerCidrsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVpnGatewayConnectionsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVpnGatewaysOptions;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancer;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerCollection;
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
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolHealthMonitorPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolHealthMonitorPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMember;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberCollection;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTargetPrototypeIP;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolSessionPersistencePatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfile;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileCollection;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerStatistics;
import com.ibm.cloud.is.vpc.v1.model.NetworkACL;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLCollection;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLIdentityById;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLIdentityById;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLIdentityById;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLPatch;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLPrototypeNetworkACLByRules;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRule;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRule;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleCollection;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleIdentityById;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePatch;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePrototypeNetworkACLContext;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAll;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePrototypeNetworkACLRuleProtocolICMP;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterface;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceCollection;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfacePatch;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfacePrototype;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceUnpaginatedCollection;
import com.ibm.cloud.is.vpc.v1.model.OperatingSystem;
import com.ibm.cloud.is.vpc.v1.model.OperatingSystemCollection;
import com.ibm.cloud.is.vpc.v1.model.OperatingSystemIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.PublicGateway;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayCollection;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayIdentityById;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayPatch;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayPrototypeFloatingIpFloatingIPIdentityFloatingIPIdentityById;
import com.ibm.cloud.is.vpc.v1.model.Region;
import com.ibm.cloud.is.vpc.v1.model.RegionCollection;
import com.ibm.cloud.is.vpc.v1.model.RemoveInstanceNetworkInterfaceFloatingIpOptions;
import com.ibm.cloud.is.vpc.v1.model.RemoveSecurityGroupNetworkInterfaceOptions;
import com.ibm.cloud.is.vpc.v1.model.RemoveVpnGatewayConnectionLocalCidrOptions;
import com.ibm.cloud.is.vpc.v1.model.RemoveVpnGatewayConnectionPeerCidrOptions;
import com.ibm.cloud.is.vpc.v1.model.ReplaceLoadBalancerPoolMembersOptions;
import com.ibm.cloud.is.vpc.v1.model.ReplaceSubnetNetworkAclOptions;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.Route;
import com.ibm.cloud.is.vpc.v1.model.RouteCollection;
import com.ibm.cloud.is.vpc.v1.model.RouteNextHopPrototypeRouteNextHopIP;
import com.ibm.cloud.is.vpc.v1.model.RoutePatch;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroup;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupCollection;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupCollection;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupCollection;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupIdentity;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupPatch;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRule;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleCollection;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRulePatch;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRulePatchRemoteIP;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRulePrototype;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRulePrototypeRemoteIP;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP;
import com.ibm.cloud.is.vpc.v1.model.SetSubnetPublicGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.Subnet;
import com.ibm.cloud.is.vpc.v1.model.SubnetCollection;
import com.ibm.cloud.is.vpc.v1.model.SubnetIdentity;
import com.ibm.cloud.is.vpc.v1.model.SubnetIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SubnetPatch;
import com.ibm.cloud.is.vpc.v1.model.SubnetPrototypeSubnetByCIDR;
import com.ibm.cloud.is.vpc.v1.model.SubnetPrototypeSubnetByTotalCount;
import com.ibm.cloud.is.vpc.v1.model.SubnetPrototypeSubnetByTotalCount;
import com.ibm.cloud.is.vpc.v1.model.SubnetPrototypeSubnetByTotalCount;
import com.ibm.cloud.is.vpc.v1.model.SubnetPrototypeSubnetByTotalCount;
import com.ibm.cloud.is.vpc.v1.model.UnsetSubnetPublicGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateFloatingIpOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateFlowLogCollectorOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateIkePolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateImageOptions;
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
import com.ibm.cloud.is.vpc.v1.model.UpdatePublicGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateSecurityGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateSecurityGroupRuleOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateSubnetOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateVolumeOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateVpcAddressPrefixOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateVpcOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateVpcRouteOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateVpnGatewayConnectionOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateVpnGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.VPC;
import com.ibm.cloud.is.vpc.v1.model.VPCCollection;
import com.ibm.cloud.is.vpc.v1.model.VPCIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VPCPatch;
import com.ibm.cloud.is.vpc.v1.model.VPNGateway;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayCollection;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnection;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionCollection;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionDPDPrototype;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionLocalCIDRs;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPatch;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPeerCIDRs;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayPatch;
import com.ibm.cloud.is.vpc.v1.model.Volume;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachment;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentCollection;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPatch;
import com.ibm.cloud.is.vpc.v1.model.VolumeCollection;
import com.ibm.cloud.is.vpc.v1.model.VolumeIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VolumePatch;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfile;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileCollection;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.VolumePrototypeVolumeByCapacity;
import com.ibm.cloud.is.vpc.v1.model.Zone;
import com.ibm.cloud.is.vpc.v1.model.ZoneCollection;
import com.ibm.cloud.is.vpc.v1.model.ZoneIdentityByName;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import java.io.InputStream;
import java.sql.Timestamp;
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

  // String version = "2020-07-28";
  /**
   * This method provides our config filename to the base class.
   */

  @Override
  public String getConfigFilename() {
    return "../../vpc.env";
  }

  @BeforeClass
  public void constructService() {
    // Ask super if we should skip the tests.
    if (skipTests()) {
      return;
    }

    service = Vpc.newInstance();
    assertNotNull(service);
    assertNotNull(service.getServiceUrl());

    // Load up our test-specific config properties.
    config = CredentialUtils.getServiceProperties(Vpc.DEFAULT_SERVICE_NAME);
    assertNotNull(config);
    assertFalse(config.isEmpty());
    assertEquals(service.getServiceUrl(), config.get("URL"));

    System.out.println("Setup complete.");
  }

  Map<String, String> store = new HashMap<String, String>();

  public String generateName(String rType) {
    Timestamp ts = new Timestamp(System.nanoTime());
    return "jsdk" + rType + ts.toString();
  }

  @Test
  public void testVPC() throws Exception {
    testGeography();
    testProfiles();
    testFloatingIPs();
    testSSHKeys();
    testImages();
    testVolume();
    testListVpcs();
    testCreateVpc();
    testNetworkACL();
    testPublicGateways();
    testSubnet();
    testFlowLogCollectors();
    testGetVpc();
    testUpdateVpc();
    testGetVpcDefaultNetworkAcl();
    testGetVpcDefaultSecurityGroup();
    testInstances();
    testInstanceTemplates();
    testInstanceGroups();

    testSecurityGroups();
    testVPCAddressPrefixes();
    // testVPCRoutes();
    testVPNGateways();
    testLoadBalancer();
  }

  public void testGeography() throws Exception {
    testListRegions();
    testGetRegion();
    testListRegionZones();
    testGetRegionZone();

  }

  public void testProfiles() throws Exception {
    testListInstanceProfiles();
    testGetInstanceProfile();
    testListVolumeProfiles();
    testGetVolumeProfile();
  }

  public void testFloatingIPs() throws Exception {
    testCreateFloatingIp();
    testListFloatingIps();
    testGetFloatingIp();
    testUpdateFloatingIp();
  }

  public void testImages() throws Exception {
    // testCreateImage();
    testListImages();
    testGetImage();
    // testUpdateImage();

    testListOperatingSystems();
    testGetOperatingSystem();
  }

  public void testSSHKeys() throws Exception {
    testCreateKey();
    testListKeys();
    testGetKey();
    testUpdateKey();
  }

  public void testNetworkACL() throws Exception {
    testCreateNetworkAcl();
    testListNetworkAcls();
    testGetNetworkAcl();
    testCreateNetworkAclRule();
    testListNetworkAclRules();
    testGetNetworkAcl();
    testUpdateNetworkAclRule();
    testUpdateNetworkAcl();
  }

  public void testVolume() throws Exception {
    testListVolumes();
    testCreateVolume();
    testGetVolume();
    testUpdateVolume();
  }

  public void testSubnet() throws Exception {
    testListSubnets();
    testCreateSubnet();
    testGetSubnet();
    testUpdateSubnet();
    testGetSubnetNetworkAcl();
    testReplaceSubnetNetworkAcl();
    testSetSubnetPublicGateway();
    testGetSubnetPublicGateway();
    testUnsetSubnetPublicGateway();
  }

  public void testInstanceTemplates() throws Exception {
    testListInstanceTemplates();
    testCreateInstanceTemplate();
    testGetInstanceTemplate();
    testUpdateInstanceTemplate();
  }

  public void testVPCAddressPrefixes() throws Exception {
    testListVpcAddressPrefixes();
    testCreateVpcAddressPrefix();
    testGetVpcAddressPrefix();
    testUpdateVpcAddressPrefix();
    testDeleteVpcAddressPrefix();
  }

  public void testVPCRoutes() throws Exception {
    testListVpcRoutes();
    testCreateVpcRoute();
    testGetVpcRoute();
    testUpdateVpcRoute();
    testDeleteVpcRoute();
  }

  public void testPublicGateways() throws Exception {
    testListPublicGateways();
    testCreatePublicGateway();
    testGetPublicGateway();
    testUpdatePublicGateway();
  }

  public void testInstanceGroups() throws Exception {
    testCreateInstanceGroup();
    testListInstanceGroups();
    testGetInstanceGroup();
    testUpdateInstanceGroup();

    testCreateInstanceGroupManager();
    testListInstanceGroupManagers();
    testGetInstanceGroupManager();
    testUpdateInstanceGroupManager();

    testCreateInstanceGroupManagerPolicy();
    testListInstanceGroupManagerPolicies();
    testGetInstanceGroupManagerPolicy();
    testUpdateInstanceGroupManagerPolicy();

    testListInstanceGroupMemberships();
    testGetInstanceGroupMembership();
    testDeleteInstanceGroupMembership();
    testDeleteInstanceGroupMemberships();

    testDeleteInstanceGroupManagerPolicy();
    testDeleteInstanceGroupLoadBalancer();
    testDeleteInstanceGroupManager();
    testDeleteInstanceGroup();

    testDeleteInstanceTemplate();
  }

  public void testInstances() throws Exception {
    testListInstances();
    testCreateInstance();
    testGetInstance();
    testUpdateInstance();
    testListInstanceNetworkInterfaces();
    testCreateInstanceAction();
    testGetInstanceInitialization();
    testCreateInstanceNetworkInterface();
    testUpdateInstanceNetworkInterface();
    testGetInstanceNetworkInterface();
    testAddInstanceNetworkInterfaceFloatingIp();
    testGetInstanceNetworkInterfaceFloatingIp();
    testListInstanceNetworkInterfaceFloatingIps();
    testRemoveInstanceNetworkInterfaceFloatingIp();
    testCreateInstanceVolumeAttachment();
    testListInstanceVolumeAttachments();
    testGetInstanceVolumeAttachment();
    testUpdateInstanceVolumeAttachment();
    testDeleteInstanceVolumeAttachment();
  }

  public void testSecurityGroups() throws Exception {
    testListSecurityGroups();
    testCreateSecurityGroup();
    testGetSecurityGroup();
    testUpdateSecurityGroup();

    testAddSecurityGroupNetworkInterface();
    testListSecurityGroupNetworkInterfaces();
    testGetSecurityGroupNetworkInterface();
    testRemoveSecurityGroupNetworkInterface();

    // rules
    testCreateSecurityGroupRule();
    testListSecurityGroupRules();
    testGetSecurityGroupRule();
    testUpdateSecurityGroup();
    testDeleteSecurityGroupRule();

  }

  public void testFlowLogCollectors() throws Exception {
    testListFlowLogCollectors();
    testCreateFlowLogCollector();
    testGetFlowLogCollector();
    testUpdateFlowLogCollector();
    testDeleteFlowLogCollector();
  }

  public void testVPNGateways() throws Exception {
    testListIkePolicies();
    testCreateIkePolicy();
    testGetIkePolicy();
    testUpdateIkePolicy();

    testListIkePolicyConnections();
    testCreateIpsecPolicy();
    testGetIpsecPolicy();
    testUpdateIpsecPolicy();
    testListIpsecPolicyConnections();

    testListVpnGateways();
    testCreateVpnGateway();
    testGetVpnGateway();
    testUpdateVpnGateway();

    testListVpnGatewayConnections();
    testCreateVpnGatewayConnection();
    testGetVpnGatewayConnection();
    testUpdateVpnGatewayConnection();

    testAddVpnGatewayConnectionLocalCidr();
    testListVpnGatewayConnectionLocalCidrs();
    testCheckVpnGatewayConnectionLocalCidr();

    testAddVpnGatewayConnectionPeerCidr();
    testListVpnGatewayConnectionPeerCidrs();
    testCheckVpnGatewayConnectionPeerCidr();

    testRemoveVpnGatewayConnectionLocalCidr();
    testRemoveVpnGatewayConnectionPeerCidr();

  }

  public void testLoadBalancer() throws Exception {
    testListLoadBalancers();
    testCreateLoadBalancer();
    testGetLoadBalancer();
    testUpdateLoadBalancer();
    testGetLoadBalancerStatistics();
    testListLoadBalancerListeners();
    testCreateLoadBalancerListener();
    testGetLoadBalancerListener();
    testUpdateLoadBalancerListener();
    testListLoadBalancerListenerPolicies();
    testCreateLoadBalancerListenerPolicy();
    testGetLoadBalancerListenerPolicy();
    testUpdateLoadBalancerListenerPolicy();

    testListLoadBalancerListenerPolicyRules();
    testCreateLoadBalancerListenerPolicyRule();
    testGetLoadBalancerListenerPolicyRule();
    testUpdateLoadBalancerListenerPolicyRule();


    testDeleteLoadBalancerListenerPolicyRule();
    testDeleteLoadBalancerListenerPolicy();
    testDeleteLoadBalancerListener();

    testListLoadBalancerPools();
    testCreateLoadBalancerPool();
    testGetLoadBalancerPool();

    testCreateLoadBalancerPoolMember();
    testListLoadBalancerPoolMembers();

    testGetLoadBalancerPoolMember();
    testUpdateLoadBalancerPoolMember();
    testUpdateLoadBalancerPool();


    testDeleteLoadBalancerPoolMember();
    testReplaceLoadBalancerPoolMembers();

    testDeleteLoadBalancerPool();

    testDeleteLoadBalancer();

  }

  public void testListFloatingIps() throws Exception {
    try {
      ListFloatingIpsOptions listFloatingIpsOptions = new ListFloatingIpsOptions.Builder()
      .limit(Long.valueOf("1"))
      .build();

      Response<FloatingIPCollection> response = service.listFloatingIps(listFloatingIpsOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      FloatingIPCollection floatingIpCollectionResult = response.getResult();

      assertNotNull(floatingIpCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testCreateFloatingIp() throws Exception {
    try {

      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name(store.get("zone"))
      .build();

      FloatingIPPrototypeFloatingIPByZone floatingIpPrototypeModel = new FloatingIPPrototypeFloatingIPByZone.Builder()
      .name(generateName("fip"))
      .zone(zoneIdentityModel)
      .build();

      CreateFloatingIpOptions createFloatingIpOptions = new CreateFloatingIpOptions.Builder()
      .floatingIpPrototype(floatingIpPrototypeModel)
      .build();


      Response<FloatingIP> response = service.createFloatingIp(createFloatingIpOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      FloatingIP floatingIpResult = response.getResult();
      store.put("created-floating-ip", floatingIpResult.getId());

      assertNotNull(floatingIpResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testGetFloatingIp() throws Exception {
    try {
      GetFloatingIpOptions getFloatingIpOptions = new GetFloatingIpOptions.Builder()
      .id(store.get("created-floating-ip"))
      .build();


      Response<FloatingIP> response = service.getFloatingIp(getFloatingIpOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      FloatingIP floatingIpResult = response.getResult();

      assertNotNull(floatingIpResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testUpdateFloatingIp() throws Exception {
    try {

      FloatingIPPatch floatingIpPatchModel = new FloatingIPPatch.Builder()
      .name(generateName("fip"))
      .build();
      Map<String, Object> floatingIpPatchModelAsPatch = floatingIpPatchModel.asPatch();

      UpdateFloatingIpOptions updateFloatingIpOptions = new UpdateFloatingIpOptions.Builder()
      .id(store.get("created-floating-ip"))
      .floatingIpPatch(floatingIpPatchModelAsPatch)
      .build();

      Response<FloatingIP> response = service.updateFloatingIp(updateFloatingIpOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      FloatingIP floatingIpResult = response.getResult();

      assertNotNull(floatingIpResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testListFlowLogCollectors() throws Exception {
    try {
      ListFlowLogCollectorsOptions listFlowLogCollectorsOptions = new ListFlowLogCollectorsOptions.Builder()
      .limit(Long.valueOf("1"))
      .build();


      Response<FlowLogCollectorCollection> response = service.listFlowLogCollectors(listFlowLogCollectorsOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      FlowLogCollectorCollection flowLogCollectorCollectionResult = response.getResult();

      assertNotNull(flowLogCollectorCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testCreateFlowLogCollector() throws Exception {
    try {
      CloudObjectStorageBucketIdentityByName cloudObjectStorageBucketIdentityModel = new CloudObjectStorageBucketIdentityByName.Builder()
      .name("my-bucket")
      .build();

      FlowLogCollectorPrototypeTargetSubnetIdentitySubnetIdentityById flowLogCollectorPrototypeTargetModel = new FlowLogCollectorPrototypeTargetSubnetIdentitySubnetIdentityById.Builder()
      .id(store.get("created-subnet"))
      .build();

      CreateFlowLogCollectorOptions createFlowLogCollectorOptions = new CreateFlowLogCollectorOptions.Builder()
      .storageBucket(cloudObjectStorageBucketIdentityModel)
      .target(flowLogCollectorPrototypeTargetModel)
      .active(false)
      .name(generateName("fl"))
      .build();


      Response<FlowLogCollector> response = service.createFlowLogCollector(createFlowLogCollectorOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      FlowLogCollector flowLogCollectorResult = response.getResult();
      store.put("created-flow-log", flowLogCollectorResult.getId());
      assertNotNull(flowLogCollectorResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testGetFlowLogCollector() throws Exception {
    try {
      GetFlowLogCollectorOptions getFlowLogCollectorOptions = new GetFlowLogCollectorOptions.Builder()
      .id(store.get("created-flow-log"))
      .build();


      Response<FlowLogCollector> response = service.getFlowLogCollector(getFlowLogCollectorOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      FlowLogCollector flowLogCollectorResult = response.getResult();

      assertNotNull(flowLogCollectorResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testUpdateFlowLogCollector() throws Exception {
    try {
      FlowLogCollectorPatch flowLogCollectorPatchModel = new FlowLogCollectorPatch.Builder()
      .active(true)
      .build();
      Map<String, Object> flowLogCollectorPatchModelAsPatch = flowLogCollectorPatchModel.asPatch();

      UpdateFlowLogCollectorOptions updateFlowLogCollectorOptions = new UpdateFlowLogCollectorOptions.Builder()
      .id(store.get("created-flow-log"))
      .flowLogCollectorPatch(flowLogCollectorPatchModelAsPatch)
      .build();

      Response<FlowLogCollector> response = service.updateFlowLogCollector(updateFlowLogCollectorOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      FlowLogCollector flowLogCollectorResult = response.getResult();

      assertNotNull(flowLogCollectorResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testListRegions() throws Exception {
    try {
      ListRegionsOptions listRegionsOptions = new ListRegionsOptions();


      Response<RegionCollection> response = service.listRegions(listRegionsOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      RegionCollection regionCollectionResult = response.getResult();
      store.put("region", "us-east");
      assertNotNull(regionCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testGetRegion() throws Exception {
    try {
      GetRegionOptions getRegionOptions = new GetRegionOptions.Builder()
      .name(store.get("region"))
      .build();


      Response<Region> response = service.getRegion(getRegionOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Region regionResult = response.getResult();

      assertNotNull(regionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testListRegionZones() throws Exception {
    try {
      ListRegionZonesOptions listRegionZonesOptions = new ListRegionZonesOptions.Builder()
      .regionName(store.get("region"))
      .build();


      Response<ZoneCollection> response = service.listRegionZones(listRegionZonesOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ZoneCollection zoneCollectionResult = response.getResult();
      store.put("zone", store.get("region") + "-2");

      assertNotNull(zoneCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testGetRegionZone() throws Exception {
    try {
      GetRegionZoneOptions getRegionZoneOptions = new GetRegionZoneOptions.Builder()
      .regionName(store.get("region"))
      .zoneName(store.get("zone"))
      .build();


      Response<Zone> response = service.getRegionZone(getRegionZoneOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Zone zoneResult = response.getResult();

      assertNotNull(zoneResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testListImages() throws Exception {
    try {
      ListImagesOptions listImagesOptions = new ListImagesOptions.Builder()
      .limit(Long.valueOf("1"))
      .build();


      Response<ImageCollection> response = service.listImages(listImagesOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ImageCollection imageCollectionResult = response.getResult();
      store.put("image", imageCollectionResult.getImages().get(0).getId());

      assertNotNull(imageCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testCreateImage() throws Exception {
    try {
      ImageFilePrototype imageFilePrototypeModel = new ImageFilePrototype.Builder()
      .href("cos://us-south/custom-image-vpc-bucket/customImage-0.vhd")
      .build();

      OperatingSystemIdentityByName operatingSystemIdentityModel = new OperatingSystemIdentityByName.Builder()
      .name("ubuntu-16-amd64")
      .build();

      ImagePrototypeImageByFile imagePrototypeModel = new ImagePrototypeImageByFile.Builder()
      .name("my-image")
      .file(imageFilePrototypeModel)
      .operatingSystem(operatingSystemIdentityModel)
      .build();

      CreateImageOptions createImageOptions = new CreateImageOptions.Builder()
      .imagePrototype(imagePrototypeModel)
      .build();


      Response<Image> response = service.createImage(createImageOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      Image imageResult = response.getResult();

      assertNotNull(imageResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testGetImage() throws Exception {
    try {
      GetImageOptions getImageOptions = new GetImageOptions.Builder()
      .id(store.get("image"))
      .build();


      Response<Image> response = service.getImage(getImageOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Image imageResult = response.getResult();

      assertNotNull(imageResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testUpdateImage() throws Exception {
    try {
      ImagePatch imagePatchModel = new ImagePatch.Builder()
      .name("my-image")
      .build();
      Map<String, Object> imagePatchModelAsPatch = imagePatchModel.asPatch();

      UpdateImageOptions updateImageOptions = new UpdateImageOptions.Builder()
      .id(store.get("image"))
      .imagePatch(imagePatchModelAsPatch)
      .build();


      Response<Image> response = service.updateImage(updateImageOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Image imageResult = response.getResult();

      assertNotNull(imageResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testListOperatingSystems() throws Exception {
    try {
      ListOperatingSystemsOptions listOperatingSystemsOptions = new ListOperatingSystemsOptions.Builder()

      .limit(Long.valueOf("1"))
      .build();


      Response<OperatingSystemCollection> response = service.listOperatingSystems(listOperatingSystemsOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      OperatingSystemCollection operatingSystemCollectionResult = response.getResult();
      store.put("os-name", operatingSystemCollectionResult.getOperatingSystems().get(0).getName());

      assertNotNull(operatingSystemCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testGetOperatingSystem() throws Exception {
    try {
      GetOperatingSystemOptions getOperatingSystemOptions = new GetOperatingSystemOptions.Builder()
      .name(store.get("os-name"))
      .build();


      Response<OperatingSystem> response = service.getOperatingSystem(getOperatingSystemOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      OperatingSystem operatingSystemResult = response.getResult();

      assertNotNull(operatingSystemResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testListInstanceProfiles() throws Exception {
    try {
      ListInstanceProfilesOptions listInstanceProfilesOptions = new ListInstanceProfilesOptions();


      Response<InstanceProfileCollection> response = service.listInstanceProfiles(listInstanceProfilesOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceProfileCollection instanceProfileCollectionResult = response.getResult();
      store.put("instance-profile", instanceProfileCollectionResult.getProfiles().get(0).getName());

      assertNotNull(instanceProfileCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testGetInstanceProfile() throws Exception {
    try {
      GetInstanceProfileOptions getInstanceProfileOptions = new GetInstanceProfileOptions.Builder()
      .name(store.get("instance-profile"))
      .build();


      Response<InstanceProfile> response = service.getInstanceProfile(getInstanceProfileOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceProfile instanceProfileResult = response.getResult();

      assertNotNull(instanceProfileResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testListInstances() throws Exception {
    try {
      ListInstancesOptions listInstancesOptions = new ListInstancesOptions.Builder()

      .limit(Long.valueOf("1"))
      .build();


      Response<InstanceCollection> response = service.listInstances(listInstancesOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceCollection instanceCollectionResult = response.getResult();

      assertNotNull(instanceCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testCreateInstance() throws Exception {
    try {

      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
      .id(store.get("created-subnet"))
      .build();

      ImageIdentityById imageIdentityModel = new ImageIdentityById.Builder()
      .id(store.get("image"))
      .build();

      InstanceProfileIdentityByName instanceProfileIdentityModel = new InstanceProfileIdentityByName.Builder()
      .name("bx2-2x8")
      .build();

      KeyIdentityById keyIdentityModel = new KeyIdentityById.Builder()
      .id(store.get("created-key"))
      .build();

      NetworkInterfacePrototype networkInterfacePrototypeModel = new NetworkInterfacePrototype.Builder()
      .name("my-network-interface")
      .subnet(subnetIdentityModel)
      .build();

      VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
      .id(store.get("created-vpc"))
      .build();

      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name(store.get("zone"))
      .build();

      InstancePrototypeInstanceByImage instancePrototypeModel = new InstancePrototypeInstanceByImage.Builder()
      .keys(new java.util.ArrayList<KeyIdentity>(java.util.Arrays.asList(keyIdentityModel)))
      .name(generateName("instance"))
      .profile(instanceProfileIdentityModel)
      .vpc(vpcIdentityModel)
      .image(imageIdentityModel)
      .primaryNetworkInterface(networkInterfacePrototypeModel)
      .zone(zoneIdentityModel)
      .build();

      CreateInstanceOptions createInstanceOptions = new CreateInstanceOptions.Builder()
      .instancePrototype(instancePrototypeModel)
      .build();


      Response<Instance> response = service.createInstance(createInstanceOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      Instance instanceResult = response.getResult();
      store.put("created-instance", instanceResult.getId());

      assertNotNull(instanceResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testGetInstance() throws Exception {
    try {
      GetInstanceOptions getInstanceOptions = new GetInstanceOptions.Builder()
      .id(store.get("created-instance"))
      .build();


      Response<Instance> response = service.getInstance(getInstanceOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Instance instanceResult = response.getResult();

      assertNotNull(instanceResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testUpdateInstance() throws Exception {
    try {
      InstancePatch instancePatchModel = new InstancePatch.Builder()
      .name(generateName("instance"))
      .build();
      Map<String, Object> instancePatchModelAsPatch = instancePatchModel.asPatch();

      UpdateInstanceOptions updateInstanceOptions = new UpdateInstanceOptions.Builder()
      .id(store.get("created-instance"))
      .instancePatch(instancePatchModelAsPatch)
      .build();
      Response<Instance> response = service.updateInstance(updateInstanceOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Instance instanceResult = response.getResult();

      assertNotNull(instanceResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testGetInstanceInitialization() throws Exception {
    try {
      GetInstanceInitializationOptions getInstanceInitializationOptions = new GetInstanceInitializationOptions.Builder()
      .id(store.get("created-instance"))
      .build();


      Response<InstanceInitialization> response = service.getInstanceInitialization(getInstanceInitializationOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceInitialization instanceInitializationResult = response.getResult();

      assertNotNull(instanceInitializationResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testCreateInstanceAction() throws Exception {
    try {
      CreateInstanceActionOptions createInstanceActionOptions = new CreateInstanceActionOptions.Builder()
      .instanceId(store.get("created-instance"))
      .type("reboot")
      .force(true)
      .build();


      Response<InstanceAction> response = service.createInstanceAction(createInstanceActionOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      InstanceAction instanceActionResult = response.getResult();

      assertNotNull(instanceActionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testListInstanceNetworkInterfaces() throws Exception {
    try {
      ListInstanceNetworkInterfacesOptions listInstanceNetworkInterfacesOptions = new ListInstanceNetworkInterfacesOptions.Builder()
      .instanceId(store.get("created-instance"))
      .build();


      Response<NetworkInterfaceUnpaginatedCollection> response = service.listInstanceNetworkInterfaces(listInstanceNetworkInterfacesOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      NetworkInterfaceUnpaginatedCollection networkInterfaceUnpaginatedCollectionResult = response.getResult();
      store.put("third-nic", networkInterfaceUnpaginatedCollectionResult.getNetworkInterfaces().get(0).getId());
      assertNotNull(networkInterfaceUnpaginatedCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testCreateInstanceNetworkInterface() throws Exception {
    try {
      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
      .id(store.get("created-subnet"))
      .build();

      CreateInstanceNetworkInterfaceOptions createInstanceNetworkInterfaceOptions = new CreateInstanceNetworkInterfaceOptions.Builder()
      .instanceId(store.get("created-instance"))
      .subnet(subnetIdentityModel)
      .name(generateName("nic"))
      .build();


      Response<NetworkInterface> response = service.createInstanceNetworkInterface(createInstanceNetworkInterfaceOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      NetworkInterface networkInterfaceResult = response.getResult();
      store.put("second-nic", networkInterfaceResult.getId());
      assertNotNull(networkInterfaceResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testGetInstanceNetworkInterface() throws Exception {
    try {
      GetInstanceNetworkInterfaceOptions getInstanceNetworkInterfaceOptions = new GetInstanceNetworkInterfaceOptions.Builder()
      .instanceId(store.get("created-instance"))
      .id(store.get("second-nic"))
      .build();


      Response<NetworkInterface> response = service.getInstanceNetworkInterface(getInstanceNetworkInterfaceOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      NetworkInterface networkInterfaceResult = response.getResult();

      assertNotNull(networkInterfaceResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testUpdateInstanceNetworkInterface() throws Exception {
    try {
      NetworkInterfacePatch networkInterfacePatchModel = new NetworkInterfacePatch.Builder()
      .name(generateName("nic"))
      .build();
      Map<String, Object> networkInterfacePatchModelAsPatch = networkInterfacePatchModel.asPatch();

      UpdateInstanceNetworkInterfaceOptions updateInstanceNetworkInterfaceOptions = new UpdateInstanceNetworkInterfaceOptions.Builder()
      .instanceId(store.get("created-instance"))
      .id(store.get("second-nic"))
      .networkInterfacePatch(networkInterfacePatchModelAsPatch)
      .build();

      Response<NetworkInterface> response = service.updateInstanceNetworkInterface(updateInstanceNetworkInterfaceOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      NetworkInterface networkInterfaceResult = response.getResult();

      assertNotNull(networkInterfaceResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testListInstanceNetworkInterfaceFloatingIps() throws Exception {
    try {
      ListInstanceNetworkInterfaceFloatingIpsOptions listInstanceNetworkInterfaceFloatingIpsOptions = new ListInstanceNetworkInterfaceFloatingIpsOptions.Builder()
      .networkInterfaceId(store.get("second-nic"))
      .instanceId(store.get("created-instance"))
      .build();


      Response<FloatingIPUnpaginatedCollection> response = service.listInstanceNetworkInterfaceFloatingIps(listInstanceNetworkInterfaceFloatingIpsOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      FloatingIPUnpaginatedCollection floatingIpUnpaginatedCollectionResult = response.getResult();
      assertNotNull(floatingIpUnpaginatedCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testGetInstanceNetworkInterfaceFloatingIp() throws Exception {
    try {
      GetInstanceNetworkInterfaceFloatingIpOptions getInstanceNetworkInterfaceFloatingIpOptions = new GetInstanceNetworkInterfaceFloatingIpOptions.Builder()
      .networkInterfaceId(store.get("second-nic"))
      .instanceId(store.get("created-instance"))
      .id(store.get("nic-fip"))
      .build();


      Response<FloatingIP> response = service.getInstanceNetworkInterfaceFloatingIp(getInstanceNetworkInterfaceFloatingIpOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      FloatingIP floatingIpResult = response.getResult();

      assertNotNull(floatingIpResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testAddInstanceNetworkInterfaceFloatingIp() throws Exception {
    try {
      AddInstanceNetworkInterfaceFloatingIpOptions addInstanceNetworkInterfaceFloatingIpOptions = new AddInstanceNetworkInterfaceFloatingIpOptions.Builder()
      .networkInterfaceId(store.get("second-nic"))
      .instanceId(store.get("created-instance"))
      .id(store.get("created-floating-ip"))
      .build();


      Response<FloatingIP> response = service.addInstanceNetworkInterfaceFloatingIp(addInstanceNetworkInterfaceFloatingIpOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      FloatingIP floatingIpResult = response.getResult();
      store.put("nic-fip", floatingIpResult.getId());
      assertNotNull(floatingIpResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testListInstanceVolumeAttachments() throws Exception {
    try {
      ListInstanceVolumeAttachmentsOptions listInstanceVolumeAttachmentsOptions = new ListInstanceVolumeAttachmentsOptions.Builder()
      .instanceId(store.get("created-instance"))
      .build();


      Response<VolumeAttachmentCollection> response = service.listInstanceVolumeAttachments(listInstanceVolumeAttachmentsOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VolumeAttachmentCollection volumeAttachmentCollectionResult = response.getResult();

      assertNotNull(volumeAttachmentCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testCreateInstanceVolumeAttachment() throws Exception {
    try {
      VolumeIdentityById volumeIdentityModel = new VolumeIdentityById.Builder()
      .id(store.get("created-volume"))
      .build();

      CreateInstanceVolumeAttachmentOptions createInstanceVolumeAttachmentOptions = new CreateInstanceVolumeAttachmentOptions.Builder()
      .instanceId(store.get("created-instance"))
      .volume(volumeIdentityModel)
      .deleteVolumeOnInstanceDelete(true)
      .name(generateName("data-vol"))
      .build();


      Response<VolumeAttachment> response = service.createInstanceVolumeAttachment(createInstanceVolumeAttachmentOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      VolumeAttachment volumeAttachmentResult = response.getResult();
      store.put("created-data-vol", volumeAttachmentResult.getId());
      assertNotNull(volumeAttachmentResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testGetInstanceVolumeAttachment() throws Exception {
    try {
      GetInstanceVolumeAttachmentOptions getInstanceVolumeAttachmentOptions = new GetInstanceVolumeAttachmentOptions.Builder()
      .instanceId(store.get("created-instance"))
      .id(store.get("created-data-vol"))
      .build();


      Response<VolumeAttachment> response = service.getInstanceVolumeAttachment(getInstanceVolumeAttachmentOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VolumeAttachment volumeAttachmentResult = response.getResult();

      assertNotNull(volumeAttachmentResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testUpdateInstanceVolumeAttachment() throws Exception {
    try {
      VolumeAttachmentPatch volumeAttachmentPatchModel = new VolumeAttachmentPatch.Builder()
      .deleteVolumeOnInstanceDelete(true)
      .name(generateName("data-vol"))
      .build();
      Map<String, Object> volumeAttachmentPatchModelAsPatch = volumeAttachmentPatchModel.asPatch();

      UpdateInstanceVolumeAttachmentOptions updateInstanceVolumeAttachmentOptions = new UpdateInstanceVolumeAttachmentOptions.Builder()
      .instanceId(store.get("created-instance"))
      .id(store.get("created-data-vol"))
      .volumeAttachmentPatch(volumeAttachmentPatchModelAsPatch)
      .build();


      Response<VolumeAttachment> response = service.updateInstanceVolumeAttachment(updateInstanceVolumeAttachmentOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VolumeAttachment volumeAttachmentResult = response.getResult();

      assertNotNull(volumeAttachmentResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testListLoadBalancerProfiles() throws Exception {
    try {
      ListLoadBalancerProfilesOptions listLoadBalancerProfilesOptions = new ListLoadBalancerProfilesOptions.Builder()
      .limit(Long.valueOf("1"))
      .build();

      Response<LoadBalancerProfileCollection> response = service.listLoadBalancerProfiles(listLoadBalancerProfilesOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancerProfileCollection loadBalancerProfileCollectionResult = response.getResult();

      assertNotNull(loadBalancerProfileCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testGetLoadBalancerProfile() throws Exception {
    try {
      GetLoadBalancerProfileOptions getLoadBalancerProfileOptions = new GetLoadBalancerProfileOptions.Builder()
      .name("network-small")
      .build();


      Response<LoadBalancerProfile> response = service.getLoadBalancerProfile(getLoadBalancerProfileOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancerProfile loadBalancerProfileResult = response.getResult();

      assertNotNull(loadBalancerProfileResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testListLoadBalancers() throws Exception {
    try {
      ListLoadBalancersOptions listLoadBalancersOptions = new ListLoadBalancersOptions();

      Response<LoadBalancerCollection> response = service.listLoadBalancers(listLoadBalancersOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancerCollection loadBalancerCollectionResult = response.getResult();

      assertNotNull(loadBalancerCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testCreateLoadBalancer() throws Exception {
    try {
      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
      .id(store.get("created-subnet"))
      .build();
      CreateLoadBalancerOptions createLoadBalancerOptions = new CreateLoadBalancerOptions.Builder()
      .isPublic(true)
      .subnets(new java.util.ArrayList<SubnetIdentity>(java.util.Arrays.asList(subnetIdentityModel)))
      .name(generateName("lb"))
      .build();

      Response<LoadBalancer> response = service.createLoadBalancer(createLoadBalancerOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      LoadBalancer loadBalancerResult = response.getResult();
      store.put("created-lb", loadBalancerResult.getId());
      assertNotNull(loadBalancerResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testGetLoadBalancer() throws Exception {
    try {
      GetLoadBalancerOptions getLoadBalancerOptions = new GetLoadBalancerOptions.Builder()
      .id(store.get("created-lb"))
      .build();

      Response<LoadBalancer> response = service.getLoadBalancer(getLoadBalancerOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancer loadBalancerResult = response.getResult();

      assertNotNull(loadBalancerResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testUpdateLoadBalancer() throws Exception {
    try {
      LoadBalancerPatch loadBalancerPatchModel = new LoadBalancerPatch.Builder()
      .name(generateName("lb"))
      .build();
      Map<String, Object> loadBalancerPatchModelAsPatch = loadBalancerPatchModel.asPatch();

      UpdateLoadBalancerOptions updateLoadBalancerOptions = new UpdateLoadBalancerOptions.Builder()
      .id(store.get("created-lb"))
      .loadBalancerPatch(loadBalancerPatchModelAsPatch)
      .build();

      Response<LoadBalancer> response = service.updateLoadBalancer(updateLoadBalancerOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancer loadBalancerResult = response.getResult();

      assertNotNull(loadBalancerResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testGetLoadBalancerStatistics() throws Exception {
    try {
      GetLoadBalancerStatisticsOptions getLoadBalancerStatisticsOptions = new GetLoadBalancerStatisticsOptions.Builder()
      .id(store.get("created-lb"))
      .build();

      Response<LoadBalancerStatistics> response = service.getLoadBalancerStatistics(getLoadBalancerStatisticsOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancerStatistics loadBalancerStatisticsResult = response.getResult();

      assertNotNull(loadBalancerStatisticsResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testListLoadBalancerListeners() throws Exception {
    try {
      ListLoadBalancerListenersOptions listLoadBalancerListenersOptions = new ListLoadBalancerListenersOptions.Builder()
      .loadBalancerId(store.get("created-lb"))
      .build();

      Response<LoadBalancerListenerCollection> response = service.listLoadBalancerListeners(listLoadBalancerListenersOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancerListenerCollection loadBalancerListenerCollectionResult = response.getResult();

      assertNotNull(loadBalancerListenerCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testCreateLoadBalancerListener() throws Exception {
    try {

      CreateLoadBalancerListenerOptions createLoadBalancerListenerOptions = new CreateLoadBalancerListenerOptions.Builder()
      .loadBalancerId(store.get("created-lb"))
      .port(Long.valueOf("443"))
      .protocol("http")
      .build();

      Response<LoadBalancerListener> response = service.createLoadBalancerListener(createLoadBalancerListenerOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      LoadBalancerListener loadBalancerListenerResult = response.getResult();
      store.put("created-listener", loadBalancerListenerResult.getId());
      assertNotNull(loadBalancerListenerResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testGetLoadBalancerListener() throws Exception {
    try {
      GetLoadBalancerListenerOptions getLoadBalancerListenerOptions = new GetLoadBalancerListenerOptions.Builder()
      .loadBalancerId(store.get("created-lb"))
      .id(store.get("created-listener"))
      .build();

      Response<LoadBalancerListener> response = service.getLoadBalancerListener(getLoadBalancerListenerOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancerListener loadBalancerListenerResult = response.getResult();

      assertNotNull(loadBalancerListenerResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testUpdateLoadBalancerListener() throws Exception {
    try {

      LoadBalancerListenerPatch loadBalancerListenerPatchModel = new LoadBalancerListenerPatch.Builder()
      .connectionLimit(Long.valueOf("2000"))
      .port(Long.valueOf("443"))
      .protocol("http")
      .build();
      Map<String, Object> loadBalancerListenerPatchModelAsPatch = loadBalancerListenerPatchModel.asPatch();

      UpdateLoadBalancerListenerOptions updateLoadBalancerListenerOptions = new UpdateLoadBalancerListenerOptions.Builder()
      .loadBalancerId(store.get("created-lb"))
      .id(store.get("created-listener"))
      .loadBalancerListenerPatch(loadBalancerListenerPatchModelAsPatch)
      .build();

      Response<LoadBalancerListener> response = service.updateLoadBalancerListener(updateLoadBalancerListenerOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancerListener loadBalancerListenerResult = response.getResult();

      assertNotNull(loadBalancerListenerResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testListLoadBalancerListenerPolicies() throws Exception {
    try {
      ListLoadBalancerListenerPoliciesOptions listLoadBalancerListenerPoliciesOptions = new ListLoadBalancerListenerPoliciesOptions.Builder()
      .loadBalancerId(store.get("created-lb"))
      .listenerId(store.get("created-listener"))
      .build();

      Response<LoadBalancerListenerPolicyCollection> response = service.listLoadBalancerListenerPolicies(listLoadBalancerListenerPoliciesOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancerListenerPolicyCollection loadBalancerListenerPolicyCollectionResult = response.getResult();

      assertNotNull(loadBalancerListenerPolicyCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testCreateLoadBalancerListenerPolicy() throws Exception {
    try {

      CreateLoadBalancerListenerPolicyOptions createLoadBalancerListenerPolicyOptions = new CreateLoadBalancerListenerPolicyOptions.Builder()
      .loadBalancerId(store.get("created-lb"))
      .listenerId(store.get("created-listener"))
      .action("forward")
      .priority(Long.valueOf("5"))
      .name(generateName("lb-policy"))
      .build();

      Response<LoadBalancerListenerPolicy> response = service.createLoadBalancerListenerPolicy(createLoadBalancerListenerPolicyOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      LoadBalancerListenerPolicy loadBalancerListenerPolicyResult = response.getResult();
      store.put("created-lbpolicy", loadBalancerListenerPolicyResult.getId());
      assertNotNull(loadBalancerListenerPolicyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testGetLoadBalancerListenerPolicy() throws Exception {
    try {
      GetLoadBalancerListenerPolicyOptions getLoadBalancerListenerPolicyOptions = new GetLoadBalancerListenerPolicyOptions.Builder()
      .loadBalancerId(store.get("created-lb"))
      .listenerId(store.get("created-listener"))
      .id(store.get("created-lbpolicy"))
      .build();

      Response<LoadBalancerListenerPolicy> response = service.getLoadBalancerListenerPolicy(getLoadBalancerListenerPolicyOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancerListenerPolicy loadBalancerListenerPolicyResult = response.getResult();

      assertNotNull(loadBalancerListenerPolicyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testUpdateLoadBalancerListenerPolicy() throws Exception {
    try {

      LoadBalancerListenerPolicyPatch loadBalancerListenerPolicyPatchModel = new LoadBalancerListenerPolicyPatch.Builder()
      .name(generateName("lb-policy"))
      .priority(Long.valueOf("5"))
      .build();
      Map<String, Object> loadBalancerListenerPolicyPatchModelAsPatch = loadBalancerListenerPolicyPatchModel.asPatch();

      UpdateLoadBalancerListenerPolicyOptions updateLoadBalancerListenerPolicyOptions = new UpdateLoadBalancerListenerPolicyOptions.Builder()
      .loadBalancerId(store.get("created-lb"))
      .listenerId(store.get("created-listener"))
      .id(store.get("created-lbpolicy"))
      .loadBalancerListenerPolicyPatch(loadBalancerListenerPolicyPatchModelAsPatch)
      .build();

      Response<LoadBalancerListenerPolicy> response = service.updateLoadBalancerListenerPolicy(updateLoadBalancerListenerPolicyOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancerListenerPolicy loadBalancerListenerPolicyResult = response.getResult();

      assertNotNull(loadBalancerListenerPolicyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testListLoadBalancerListenerPolicyRules() throws Exception {
    try {
      ListLoadBalancerListenerPolicyRulesOptions listLoadBalancerListenerPolicyRulesOptions = new ListLoadBalancerListenerPolicyRulesOptions.Builder()
      .loadBalancerId(store.get("created-lb"))
      .listenerId(store.get("created-listener"))
      .policyId(store.get("created-lbpolicy"))
      .build();


      Response<LoadBalancerListenerPolicyRuleCollection> response = service.listLoadBalancerListenerPolicyRules(listLoadBalancerListenerPolicyRulesOptions).execute();
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancerListenerPolicyRuleCollection loadBalancerListenerPolicyRuleCollectionResult = response.getResult();

      assertNotNull(loadBalancerListenerPolicyRuleCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testCreateLoadBalancerListenerPolicyRule() throws Exception {
    try {
      CreateLoadBalancerListenerPolicyRuleOptions createLoadBalancerListenerPolicyRuleOptions = new CreateLoadBalancerListenerPolicyRuleOptions.Builder()
      .loadBalancerId(store.get("created-lb"))
      .listenerId(store.get("created-listener"))
      .policyId(store.get("created-lbpolicy"))
      .condition("contains")
      .type("header")
      .value("test-value")
      .field("MY-APP-HEADER")
      .build();

      Response<LoadBalancerListenerPolicyRule> response = service.createLoadBalancerListenerPolicyRule(createLoadBalancerListenerPolicyRuleOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      LoadBalancerListenerPolicyRule loadBalancerListenerPolicyRuleResult = response.getResult();
      store.put("created-lbpolicyrule", loadBalancerListenerPolicyRuleResult.getId());

      assertNotNull(loadBalancerListenerPolicyRuleResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testGetLoadBalancerListenerPolicyRule() throws Exception {
    try {
      GetLoadBalancerListenerPolicyRuleOptions getLoadBalancerListenerPolicyRuleOptions = new GetLoadBalancerListenerPolicyRuleOptions.Builder()
      .loadBalancerId(store.get("created-lb"))
     .listenerId(store.get("created-listener"))
      .policyId(store.get("created-lbpolicy"))
      .id(store.get("created-lbpolicyrule"))
      .build();


      Response<LoadBalancerListenerPolicyRule> response = service.getLoadBalancerListenerPolicyRule(getLoadBalancerListenerPolicyRuleOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancerListenerPolicyRule loadBalancerListenerPolicyRuleResult = response.getResult();

      assertNotNull(loadBalancerListenerPolicyRuleResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testUpdateLoadBalancerListenerPolicyRule() throws Exception {
    try {
      LoadBalancerListenerPolicyRulePatch loadBalancerListenerPolicyRulePatchModel = new LoadBalancerListenerPolicyRulePatch.Builder()
      .condition("contains")
      .field("MY-APP-HEADER")
      .type("header")
      .value("testString")
      .build();
      Map<String, Object> loadBalancerListenerPolicyRulePatchModelAsPatch = loadBalancerListenerPolicyRulePatchModel.asPatch();

      UpdateLoadBalancerListenerPolicyRuleOptions updateLoadBalancerListenerPolicyRuleOptions = new UpdateLoadBalancerListenerPolicyRuleOptions.Builder()
      .loadBalancerId(store.get("created-lb"))
      .listenerId(store.get("created-listener"))
      .policyId(store.get("created-lbpolicy"))
      .id(store.get("created-lbpolicyrule"))
      .loadBalancerListenerPolicyRulePatch(loadBalancerListenerPolicyRulePatchModelAsPatch)
      .build();

      Response<LoadBalancerListenerPolicyRule> response = service.updateLoadBalancerListenerPolicyRule(updateLoadBalancerListenerPolicyRuleOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancerListenerPolicyRule loadBalancerListenerPolicyRuleResult = response.getResult();

      assertNotNull(loadBalancerListenerPolicyRuleResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testListLoadBalancerPools() throws Exception {
    try {
      ListLoadBalancerPoolsOptions listLoadBalancerPoolsOptions = new ListLoadBalancerPoolsOptions.Builder()
      .loadBalancerId(store.get("created-lb"))
      .build();


      Response<LoadBalancerPoolCollection> response = service.listLoadBalancerPools(listLoadBalancerPoolsOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancerPoolCollection loadBalancerPoolCollectionResult = response.getResult();

      assertNotNull(loadBalancerPoolCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


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

      CreateLoadBalancerPoolOptions createLoadBalancerPoolOptions = new CreateLoadBalancerPoolOptions.Builder()
      .loadBalancerId(store.get("created-lb"))
      .algorithm("least_connections")
      .healthMonitor(loadBalancerPoolHealthMonitorPrototypeModel)
      .protocol("http")
      .name(generateName("lbpool"))
      .build();


      Response<LoadBalancerPool> response = service.createLoadBalancerPool(createLoadBalancerPoolOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      LoadBalancerPool loadBalancerPoolResult = response.getResult();
      store.put("created-lbpool", loadBalancerPoolResult.getId());

      assertNotNull(loadBalancerPoolResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testGetLoadBalancerPool() throws Exception {
    try {
      GetLoadBalancerPoolOptions getLoadBalancerPoolOptions = new GetLoadBalancerPoolOptions.Builder()
      .loadBalancerId(store.get("created-lb"))
      .id(store.get("created-lbpool"))
      .build();


      Response<LoadBalancerPool> response = service.getLoadBalancerPool(getLoadBalancerPoolOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancerPool loadBalancerPoolResult = response.getResult();

      assertNotNull(loadBalancerPoolResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


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
      .type("source_ip")
      .build();

      LoadBalancerPoolPatch loadBalancerPoolPatchModel = new LoadBalancerPoolPatch.Builder()
      .name(generateName("lb-pool"))
      .algorithm("least_connections")
      .protocol("http")
      .healthMonitor(loadBalancerPoolHealthMonitorPatchModel)
      .sessionPersistence(loadBalancerPoolSessionPersistencePatchModel)
      .build();
      Map<String, Object> loadBalancerPoolPatchModelAsPatch = loadBalancerPoolPatchModel.asPatch();

      UpdateLoadBalancerPoolOptions updateLoadBalancerPoolOptions = new UpdateLoadBalancerPoolOptions.Builder()
      .loadBalancerId(store.get("created-lb"))
      .id(store.get("created-lbpool"))
      .loadBalancerPoolPatch(loadBalancerPoolPatchModelAsPatch)
      .build();

      Response<LoadBalancerPool> response = service.updateLoadBalancerPool(updateLoadBalancerPoolOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancerPool loadBalancerPoolResult = response.getResult();

      assertNotNull(loadBalancerPoolResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testListLoadBalancerPoolMembers() throws Exception {
    try {
      ListLoadBalancerPoolMembersOptions listLoadBalancerPoolMembersOptions = new ListLoadBalancerPoolMembersOptions.Builder()
      .loadBalancerId(store.get("created-lb"))
      .poolId(store.get("created-lbpool"))
      .build();


      Response<LoadBalancerPoolMemberCollection> response = service.listLoadBalancerPoolMembers(listLoadBalancerPoolMembersOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancerPoolMemberCollection loadBalancerPoolMemberCollectionResult = response.getResult();

      assertNotNull(loadBalancerPoolMemberCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testCreateLoadBalancerPoolMember() throws Exception {
    try {
      LoadBalancerPoolMemberTargetPrototypeIP loadBalancerPoolMemberTargetPrototypeModel = new LoadBalancerPoolMemberTargetPrototypeIP.Builder()
      .address("12.12.2.0")
      .build();

      CreateLoadBalancerPoolMemberOptions createLoadBalancerPoolMemberOptions = new CreateLoadBalancerPoolMemberOptions.Builder()
      .loadBalancerId(store.get("created-lb"))
      .poolId(store.get("created-lbpool"))
      .port(Long.valueOf("80"))
      .target(loadBalancerPoolMemberTargetPrototypeModel)
      .build();


      Response<LoadBalancerPoolMember> response = service.createLoadBalancerPoolMember(createLoadBalancerPoolMemberOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      LoadBalancerPoolMember loadBalancerPoolMemberResult = response.getResult();
      store.put("created-lbpoolmember", loadBalancerPoolMemberResult.getId());
      assertNotNull(loadBalancerPoolMemberResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testReplaceLoadBalancerPoolMembers() throws Exception {
    try {
      LoadBalancerPoolMemberTargetPrototypeIP loadBalancerPoolMemberTargetPrototypeModel = new LoadBalancerPoolMemberTargetPrototypeIP.Builder()
      .address("192.168.3.4")
      .build();

      LoadBalancerPoolMemberPrototype loadBalancerPoolMemberPrototypeModel = new LoadBalancerPoolMemberPrototype.Builder()
      .port(Long.valueOf("80"))
      .target(loadBalancerPoolMemberTargetPrototypeModel)
      .weight(Long.valueOf("50"))
      .build();

      ReplaceLoadBalancerPoolMembersOptions replaceLoadBalancerPoolMembersOptions = new ReplaceLoadBalancerPoolMembersOptions.Builder()
      .loadBalancerId(store.get("created-lb"))
      .poolId(store.get("created-lbpool"))
      .members(new java.util.ArrayList<LoadBalancerPoolMemberPrototype>(java.util.Arrays.asList(loadBalancerPoolMemberPrototypeModel)))
      .build();

      Response<LoadBalancerPoolMemberCollection> response = service.replaceLoadBalancerPoolMembers(replaceLoadBalancerPoolMembersOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      LoadBalancerPoolMemberCollection loadBalancerPoolMemberCollectionResult = response.getResult();

      assertNotNull(loadBalancerPoolMemberCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testGetLoadBalancerPoolMember() throws Exception {
    try {
      GetLoadBalancerPoolMemberOptions getLoadBalancerPoolMemberOptions = new GetLoadBalancerPoolMemberOptions.Builder()
      .loadBalancerId(store.get("created-lb"))
      .poolId(store.get("created-lbpool"))
      .id(store.get("created-lbpoolmember"))
      .build();


      Response<LoadBalancerPoolMember> response = service.getLoadBalancerPoolMember(getLoadBalancerPoolMemberOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancerPoolMember loadBalancerPoolMemberResult = response.getResult();

      assertNotNull(loadBalancerPoolMemberResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testUpdateLoadBalancerPoolMember() throws Exception {
    try {
      LoadBalancerPoolMemberTargetPrototypeIP loadBalancerPoolMemberTargetPrototypeModel = new LoadBalancerPoolMemberTargetPrototypeIP.Builder()
      .address("192.168.3.4")
      .build();

      LoadBalancerPoolMemberPatch loadBalancerPoolMemberPatchModel = new LoadBalancerPoolMemberPatch.Builder()
      .port(Long.valueOf("80"))
      .weight(Long.valueOf("50"))
      .target(loadBalancerPoolMemberTargetPrototypeModel)
      .build();
      Map<String, Object> loadBalancerPoolMemberPatchModelAsPatch = loadBalancerPoolMemberPatchModel.asPatch();

      UpdateLoadBalancerPoolMemberOptions updateLoadBalancerPoolMemberOptions = new UpdateLoadBalancerPoolMemberOptions.Builder()
      .loadBalancerId(store.get("created-lb"))
      .poolId(store.get("created-lbpool"))
      .id(store.get("created-lbpoolmember"))
      .loadBalancerPoolMemberPatch(loadBalancerPoolMemberPatchModelAsPatch)
      .build();

      Response<LoadBalancerPoolMember> response = service.updateLoadBalancerPoolMember(updateLoadBalancerPoolMemberOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadBalancerPoolMember loadBalancerPoolMemberResult = response.getResult();

      assertNotNull(loadBalancerPoolMemberResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testListNetworkAcls() throws Exception {
    try {
      ListNetworkAclsOptions listNetworkAclsOptions = new ListNetworkAclsOptions.Builder()

      .limit(Long.valueOf("1"))
      .build();


      Response<NetworkACLCollection> response = service.listNetworkAcls(listNetworkAclsOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      NetworkACLCollection networkAclCollectionResult = response.getResult();

      assertNotNull(networkAclCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testCreateNetworkAcl() throws Exception {
    try {
      NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAll networkAclRulePrototypeNetworkAclContextModel = new NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAll.Builder()
      .action("allow")
      .destination("192.168.3.2/32")
      .direction("inbound")
      .name(generateName("rule"))
      .protocol("tcp")
      .source("192.168.3.2/32")
      .build();

      VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
      .id(store.get("created-vpc"))
      .build();

      NetworkACLPrototypeNetworkACLByRules networkAclPrototypeModel = new NetworkACLPrototypeNetworkACLByRules.Builder()
      .name(generateName("acl"))
      .vpc(vpcIdentityModel)
      .rules(new java.util.ArrayList<NetworkACLRulePrototypeNetworkACLContext>(java.util.Arrays.asList(networkAclRulePrototypeNetworkAclContextModel)))
      .build();

      CreateNetworkAclOptions createNetworkAclOptions = new CreateNetworkAclOptions.Builder()
      .networkAclPrototype(networkAclPrototypeModel)
      .build();


      Response<NetworkACL> response = service.createNetworkAcl(createNetworkAclOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      NetworkACL networkAclResult = response.getResult();
      store.put("created-acl", networkAclResult.getId());
      assertNotNull(networkAclResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testGetNetworkAcl() throws Exception {
    try {
      GetNetworkAclOptions getNetworkAclOptions = new GetNetworkAclOptions.Builder()
      .id(store.get("created-acl"))
      .build();


      Response<NetworkACL> response = service.getNetworkAcl(getNetworkAclOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      NetworkACL networkAclResult = response.getResult();

      assertNotNull(networkAclResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testUpdateNetworkAcl() throws Exception {
    try {
      NetworkACLPatch networkAclPatchModel = new NetworkACLPatch.Builder()
      .name(generateName("acl"))
      .build();
      Map<String, Object> networkAclPatchModelAsPatch = networkAclPatchModel.asPatch();

      UpdateNetworkAclOptions updateNetworkAclOptions = new UpdateNetworkAclOptions.Builder()
      .id(store.get("created-acl"))
      .networkAclPatch(networkAclPatchModelAsPatch)
      .build();

      Response<NetworkACL> response = service.updateNetworkAcl(updateNetworkAclOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      NetworkACL networkAclResult = response.getResult();

      assertNotNull(networkAclResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testListNetworkAclRules() throws Exception {
    try {
      ListNetworkAclRulesOptions listNetworkAclRulesOptions = new ListNetworkAclRulesOptions.Builder()
      .networkAclId(store.get("created-acl"))

      .limit(Long.valueOf("1"))
      .direction("inbound")
      .build();


      Response<NetworkACLRuleCollection> response = service.listNetworkAclRules(listNetworkAclRulesOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      NetworkACLRuleCollection networkAclRuleCollectionResult = response.getResult();

      assertNotNull(networkAclRuleCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testCreateNetworkAclRule() throws Exception {
    try {
      NetworkACLRulePrototypeNetworkACLRuleProtocolICMP networkAclRulePrototypeModel = new NetworkACLRulePrototypeNetworkACLRuleProtocolICMP.Builder()
      .action("allow")
      .destination("192.168.3.2/32")
      .direction("inbound")
      .name(generateName("rule"))
      .protocol("tcp")
      .source("192.168.3.2/32")
      .code(Long.valueOf("0"))
      .type(Long.valueOf("8"))
      .build();

      CreateNetworkAclRuleOptions createNetworkAclRuleOptions = new CreateNetworkAclRuleOptions.Builder()
      .networkAclId(store.get("created-acl"))
      .networkAclRulePrototype(networkAclRulePrototypeModel)
      .build();


      Response<NetworkACLRule> response = service.createNetworkAclRule(createNetworkAclRuleOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      NetworkACLRule networkAclRuleResult = response.getResult();
      store.put("created-acl-rule", networkAclRuleResult.getId());
      assertNotNull(networkAclRuleResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testGetNetworkAclRule() throws Exception {
    try {
      GetNetworkAclRuleOptions getNetworkAclRuleOptions = new GetNetworkAclRuleOptions.Builder()
      .networkAclId(store.get("created-acl"))
      .id(store.get("created-acl-rule"))
      .build();


      Response<NetworkACLRule> response = service.getNetworkAclRule(getNetworkAclRuleOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      NetworkACLRule networkAclRuleResult = response.getResult();

      assertNotNull(networkAclRuleResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testUpdateNetworkAclRule() throws Exception {
    try {
      NetworkACLRulePatch networkAclRulePatchModel = new NetworkACLRulePatch.Builder()
      .action("allow")
      .destination("192.168.3.2/32")
      .direction("inbound")
      .source("192.168.3.2/32")
      .destinationPortMax(Long.valueOf("22"))
      .destinationPortMin(Long.valueOf("22"))
      .sourcePortMax(Long.valueOf("65535"))
      .sourcePortMin(Long.valueOf("49152"))
      .code(Long.valueOf("0"))
      .type(Long.valueOf("8"))
      .build();
      Map<String, Object> networkAclRulePatchModelAsPatch = networkAclRulePatchModel.asPatch();

      UpdateNetworkAclRuleOptions updateNetworkAclRuleOptions = new UpdateNetworkAclRuleOptions.Builder()
      .networkAclId(store.get("created-acl"))
      .id(store.get("created-acl-rule"))
      .networkAclRulePatch(networkAclRulePatchModelAsPatch)
      .build();



      Response<NetworkACLRule> response = service.updateNetworkAclRule(updateNetworkAclRuleOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      NetworkACLRule networkAclRuleResult = response.getResult();

      assertNotNull(networkAclRuleResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testListPublicGateways() throws Exception {
    try {
      ListPublicGatewaysOptions listPublicGatewaysOptions = new ListPublicGatewaysOptions.Builder()

      .limit(Long.valueOf("1"))
      // .resourceGroupId("testString")
      .build();


      Response<PublicGatewayCollection> response = service.listPublicGateways(listPublicGatewaysOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PublicGatewayCollection publicGatewayCollectionResult = response.getResult();

      assertNotNull(publicGatewayCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testCreatePublicGateway() throws Exception {
    try {
      VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
      .id(store.get("created-vpc"))
      .build();

      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name(store.get("zone"))
      .build();

      CreatePublicGatewayOptions createPublicGatewayOptions = new CreatePublicGatewayOptions.Builder()
      .vpc(vpcIdentityModel)
      .zone(zoneIdentityModel)
      .name(generateName("pgw"))
      .build();


      Response<PublicGateway> response = service.createPublicGateway(createPublicGatewayOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      PublicGateway publicGatewayResult = response.getResult();
      store.put("created-pgw", publicGatewayResult.getId());

      assertNotNull(publicGatewayResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testGetPublicGateway() throws Exception {
    try {
      GetPublicGatewayOptions getPublicGatewayOptions = new GetPublicGatewayOptions.Builder()
      .id(store.get("created-pgw"))
      .build();


      Response<PublicGateway> response = service.getPublicGateway(getPublicGatewayOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PublicGateway publicGatewayResult = response.getResult();

      assertNotNull(publicGatewayResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testUpdatePublicGateway() throws Exception {
    try {
      PublicGatewayPatch publicGatewayPatchModel = new PublicGatewayPatch.Builder()
      .name(generateName("pgw"))
      .build();
      Map<String, Object> publicGatewayPatchModelAsPatch = publicGatewayPatchModel.asPatch();

      UpdatePublicGatewayOptions updatePublicGatewayOptions = new UpdatePublicGatewayOptions.Builder()
      .id(store.get("created-pgw"))
      .publicGatewayPatch(publicGatewayPatchModelAsPatch)
      .build();

      Response<PublicGateway> response = service.updatePublicGateway(updatePublicGatewayOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PublicGateway publicGatewayResult = response.getResult();

      assertNotNull(publicGatewayResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testListKeys() throws Exception {
    try {
      ListKeysOptions listKeysOptions = new ListKeysOptions.Builder()
      // .resourceGroupId("testString")
      .build();


      Response<KeyCollection> response = service.listKeys(listKeysOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      KeyCollection keyCollectionResult = response.getResult();

      assertNotNull(keyCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testCreateKey() throws Exception {
    try {
;

      CreateKeyOptions createKeyOptions = new CreateKeyOptions.Builder()
      .publicKey("AAAAB3NzaC1yc2EAAAADAQABAAABAQDDGe50Bxa5T5NDddrrtbx2Y4/VGbiCgXqnBsYToIUKoFSHTQl5IX3PasGnneKanhcLwWz5M5MoCRvhxTp66NKzIfAz7r+FX9rxgR+ZgcM253YAqOVeIpOU408simDZKriTlN8kYsXL7P34tsWuAJf4MgZtJAQxous/2byetpdCv8ddnT4X3ltOg9w+LqSCPYfNivqH00Eh7S1Ldz7I8aw5WOp5a+sQFP/RbwfpwHp+ny7DfeIOokcuI42tJkoBn7UsLTVpCSmXr2EDRlSWe/1M/iHNRBzaT3CK0+SwZWd2AEjePxSnWKNGIEUJDlUYp7hKhiQcgT5ZAnWU121oc5En")
      .name(generateName("key"))
      .type("rsa")
      .build();


      Response<Key> response = service.createKey(createKeyOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      Key keyResult = response.getResult();
      store.put("created-key", keyResult.getId());
      assertNotNull(keyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testGetKey() throws Exception {
    try {
      GetKeyOptions getKeyOptions = new GetKeyOptions.Builder()
      .id(store.get("created-key"))
      .build();


      Response<Key> response = service.getKey(getKeyOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Key keyResult = response.getResult();

      assertNotNull(keyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testUpdateKey() throws Exception {
    try {
      KeyPatch keyPatchModel = new KeyPatch.Builder()
      .name(generateName("key"))
      .build();
      Map<String, Object> keyPatchModelAsPatch = keyPatchModel.asPatch();

      UpdateKeyOptions updateKeyOptions = new UpdateKeyOptions.Builder()
      .id(store.get("created-key"))
      .keyPatch(keyPatchModelAsPatch)
      .build();

      Response<Key> response = service.updateKey(updateKeyOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Key keyResult = response.getResult();

      assertNotNull(keyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testListSecurityGroups() throws Exception {
    try {
      ListSecurityGroupsOptions listSecurityGroupsOptions = new ListSecurityGroupsOptions.Builder()
      .limit(Long.valueOf("1"))
      .build();


      Response<SecurityGroupCollection> response = service.listSecurityGroups(listSecurityGroupsOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SecurityGroupCollection securityGroupCollectionResult = response.getResult();

      assertNotNull(securityGroupCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testCreateSecurityGroup() throws Exception {
    try {
      VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
      .id(store.get("created-vpc"))
      .build();
      SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP securityGroupRulePrototypeModel = new SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP.Builder()
      .direction("inbound")
      .ipVersion("ipv4")
      .protocol("tcp")
      // .remote(securityGroupRulePrototypeRemoteModel)
      .code(Long.valueOf("0"))
      .type(Long.valueOf("8"))
      .build();

      CreateSecurityGroupOptions createSecurityGroupOptions = new CreateSecurityGroupOptions.Builder()
      .vpc(vpcIdentityModel)
      .name(generateName("sg"))
      // .resourceGroup(resourceGroupIdentityModel)
      .rules(new java.util.ArrayList<SecurityGroupRulePrototype>(java.util.Arrays.asList(securityGroupRulePrototypeModel)))
      .build();


      Response<SecurityGroup> response = service.createSecurityGroup(createSecurityGroupOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      SecurityGroup securityGroupResult = response.getResult();
      store.put("created-sg", securityGroupResult.getId());
      assertNotNull(securityGroupResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testGetSecurityGroup() throws Exception {
    try {
      GetSecurityGroupOptions getSecurityGroupOptions = new GetSecurityGroupOptions.Builder()
      .id(store.get("created-sg"))
      .build();


      Response<SecurityGroup> response = service.getSecurityGroup(getSecurityGroupOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SecurityGroup securityGroupResult = response.getResult();

      assertNotNull(securityGroupResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testUpdateSecurityGroup() throws Exception {
    try {
      SecurityGroupPatch securityGroupPatchModel = new SecurityGroupPatch.Builder()
      .name(generateName("sg"))
      .build();
      Map<String, Object> securityGroupPatchModelAsPatch = securityGroupPatchModel.asPatch();

      UpdateSecurityGroupOptions updateSecurityGroupOptions = new UpdateSecurityGroupOptions.Builder()
      .id(store.get("created-sg"))
      .securityGroupPatch(securityGroupPatchModelAsPatch)
      .build();

      Response<SecurityGroup> response = service.updateSecurityGroup(updateSecurityGroupOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SecurityGroup securityGroupResult = response.getResult();

      assertNotNull(securityGroupResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testListSecurityGroupNetworkInterfaces() throws Exception {
    try {
      ListSecurityGroupNetworkInterfacesOptions listSecurityGroupNetworkInterfacesOptions = new ListSecurityGroupNetworkInterfacesOptions.Builder()
      .securityGroupId(store.get("created-sg"))

      .limit(Long.valueOf("1"))
      .build();


      Response<NetworkInterfaceCollection> response = service.listSecurityGroupNetworkInterfaces(listSecurityGroupNetworkInterfacesOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      NetworkInterfaceCollection networkInterfaceCollectionResult = response.getResult();
      assertNotNull(networkInterfaceCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testGetSecurityGroupNetworkInterface() throws Exception {
    try {
      GetSecurityGroupNetworkInterfaceOptions getSecurityGroupNetworkInterfaceOptions = new GetSecurityGroupNetworkInterfaceOptions.Builder()
      .securityGroupId(store.get("created-sg"))
      .id(store.get("sg-nic"))
      .build();


      Response<NetworkInterface> response = service.getSecurityGroupNetworkInterface(getSecurityGroupNetworkInterfaceOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      NetworkInterface networkInterfaceResult = response.getResult();

      assertNotNull(networkInterfaceResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testAddSecurityGroupNetworkInterface() throws Exception {
    try {
      AddSecurityGroupNetworkInterfaceOptions addSecurityGroupNetworkInterfaceOptions = new AddSecurityGroupNetworkInterfaceOptions.Builder()
      .securityGroupId(store.get("created-sg"))
      .id(store.get("second-nic"))
      .build();

      store.put("second-nic", store.get("second-nic") + " " + store.get("created-sg"));


      Response<NetworkInterface> response = service.addSecurityGroupNetworkInterface(addSecurityGroupNetworkInterfaceOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      NetworkInterface networkInterfaceResult = response.getResult();
      store.put("sg-nic",networkInterfaceResult.getId());

      assertNotNull(networkInterfaceResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testListSecurityGroupRules() throws Exception {
    try {
      ListSecurityGroupRulesOptions listSecurityGroupRulesOptions = new ListSecurityGroupRulesOptions.Builder()
      .securityGroupId(store.get("created-sg"))
      .build();


      Response<SecurityGroupRuleCollection> response = service.listSecurityGroupRules(listSecurityGroupRulesOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SecurityGroupRuleCollection securityGroupRuleCollectionResult = response.getResult();

      assertNotNull(securityGroupRuleCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testCreateSecurityGroupRule() throws Exception {
    try {

      SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP securityGroupRulePrototypeModel = new SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP.Builder()
      .direction("inbound")
      .ipVersion("ipv4")
      .protocol("tcp")
      // .remote(securityGroupRulePrototypeRemoteModel)
      .code(Long.valueOf("0"))
      .type(Long.valueOf("8"))
      .build();

      CreateSecurityGroupRuleOptions createSecurityGroupRuleOptions = new CreateSecurityGroupRuleOptions.Builder()
      .securityGroupId(store.get("created-sg"))
      .securityGroupRulePrototype(securityGroupRulePrototypeModel)
      .build();


      Response<SecurityGroupRule> response = service.createSecurityGroupRule(createSecurityGroupRuleOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      SecurityGroupRule securityGroupRuleResult = response.getResult();
      store.put("created-sg-rule", securityGroupRuleResult.getId());
      assertNotNull(securityGroupRuleResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testGetSecurityGroupRule() throws Exception {
    try {
      GetSecurityGroupRuleOptions getSecurityGroupRuleOptions = new GetSecurityGroupRuleOptions.Builder()
      .securityGroupId(store.get("created-sg"))
      .id(store.get("created-sg-rule"))
      .build();


      Response<SecurityGroupRule> response = service.getSecurityGroupRule(getSecurityGroupRuleOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SecurityGroupRule securityGroupRuleResult = response.getResult();

      assertNotNull(securityGroupRuleResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testUpdateSecurityGroupRule() throws Exception {
    try {
      SecurityGroupRulePatchRemoteIP securityGroupRulePatchRemoteModel = new SecurityGroupRulePatchRemoteIP.Builder()
      .address("192.168.3.4")
      .build();

      SecurityGroupRulePatch securityGroupRulePatchModel = new SecurityGroupRulePatch.Builder()
      .remote(securityGroupRulePatchRemoteModel)
      .direction("inbound")
      .ipVersion("ipv4")
      .code(Long.valueOf("0"))
      .portMax(Long.valueOf("22"))
      .portMin(Long.valueOf("22"))
      .type(Long.valueOf("8"))
      .build();
      Map<String, Object> securityGroupRulePatchModelAsPatch = securityGroupRulePatchModel.asPatch();

      UpdateSecurityGroupRuleOptions updateSecurityGroupRuleOptions = new UpdateSecurityGroupRuleOptions.Builder()
      .securityGroupId(store.get("created-sg"))
      .id(store.get("created-sg-rule"))
      .securityGroupRulePatch(securityGroupRulePatchModelAsPatch)
      .build();

      Response<SecurityGroupRule> response = service.updateSecurityGroupRule(updateSecurityGroupRuleOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SecurityGroupRule securityGroupRuleResult = response.getResult();

      assertNotNull(securityGroupRuleResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testListSubnets() throws Exception {
    try {
      ListSubnetsOptions listSubnetsOptions = new ListSubnetsOptions.Builder()

      .limit(Long.valueOf("1"))
      .resourceGroupId("testString")
      .build();


      Response<SubnetCollection> response = service.listSubnets(listSubnetsOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SubnetCollection subnetCollectionResult = response.getResult();

      assertNotNull(subnetCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testCreateSubnet() throws Exception {
    try {

      VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
      .id(store.get("created-vpc"))
      .build();

      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name(store.get("zone"))
      .build();

      SubnetPrototypeSubnetByCIDR subnetPrototypeModel = new SubnetPrototypeSubnetByCIDR.Builder()
      .name(generateName("subnet"))
      .vpc(vpcIdentityModel)
      .ipv4CidrBlock("10.152.0.0/24")
      .zone(zoneIdentityModel)
      .build();

      CreateSubnetOptions createSubnetOptions = new CreateSubnetOptions.Builder()
      .subnetPrototype(subnetPrototypeModel)
      .build();


      Response<Subnet> response = service.createSubnet(createSubnetOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      Subnet subnetResult = response.getResult();
      store.put("created-subnet", subnetResult.getId());

      assertNotNull(subnetResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testGetSubnet() throws Exception {
    try {
      GetSubnetOptions getSubnetOptions = new GetSubnetOptions.Builder()
      .id(store.get("created-subnet"))
      .build();


      Response<Subnet> response = service.getSubnet(getSubnetOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Subnet subnetResult = response.getResult();

      assertNotNull(subnetResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testUpdateSubnet() throws Exception {
    try {
      SubnetPatch subnetPatchModel = new SubnetPatch.Builder()
      .name(generateName("subnet"))
      .build();
      Map<String, Object> subnetPatchModelAsPatch = subnetPatchModel.asPatch();

      UpdateSubnetOptions updateSubnetOptions = new UpdateSubnetOptions.Builder()
      .id(store.get("created-subnet"))
      .subnetPatch(subnetPatchModelAsPatch)
      .build();

      Response<Subnet> response = service.updateSubnet(updateSubnetOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Subnet subnetResult = response.getResult();

      assertNotNull(subnetResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testGetSubnetNetworkAcl() throws Exception {
    try {
      GetSubnetNetworkAclOptions getSubnetNetworkAclOptions = new GetSubnetNetworkAclOptions.Builder()
      .id(store.get("created-subnet"))
      .build();


      Response<NetworkACL> response = service.getSubnetNetworkAcl(getSubnetNetworkAclOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      NetworkACL networkAclResult = response.getResult();

      assertNotNull(networkAclResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testReplaceSubnetNetworkAcl() throws Exception {
    try {
      NetworkACLIdentityById networkAclIdentityModel = new NetworkACLIdentityById.Builder()
      .id(store.get("created-acl"))
      .build();

      ReplaceSubnetNetworkAclOptions replaceSubnetNetworkAclOptions = new ReplaceSubnetNetworkAclOptions.Builder()
      .id(store.get("created-subnet"))
      .networkAclIdentity(networkAclIdentityModel)
      .build();


      Response<NetworkACL> response = service.replaceSubnetNetworkAcl(replaceSubnetNetworkAclOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      NetworkACL networkAclResult = response.getResult();

      assertNotNull(networkAclResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testGetSubnetPublicGateway() throws Exception {
    try {
      GetSubnetPublicGatewayOptions getSubnetPublicGatewayOptions = new GetSubnetPublicGatewayOptions.Builder()
      .id(store.get("created-subnet"))
      .build();


      Response<PublicGateway> response = service.getSubnetPublicGateway(getSubnetPublicGatewayOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PublicGateway publicGatewayResult = response.getResult();

      assertNotNull(publicGatewayResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testSetSubnetPublicGateway() throws Exception {
    try {
      PublicGatewayIdentityById publicGatewayIdentityModel = new PublicGatewayIdentityById.Builder()
      .id(store.get("created-pgw"))
      .build();

      SetSubnetPublicGatewayOptions setSubnetPublicGatewayOptions = new SetSubnetPublicGatewayOptions.Builder()
      .id(store.get("created-subnet"))
      .publicGatewayIdentity(publicGatewayIdentityModel)
      .build();


      Response<PublicGateway> response = service.setSubnetPublicGateway(setSubnetPublicGatewayOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      PublicGateway publicGatewayResult = response.getResult();

      assertNotNull(publicGatewayResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testListVpcs() throws Exception {
    try {
      ListVpcsOptions listVpcsOptions = new ListVpcsOptions.Builder()
      .limit(Long.valueOf("1"))
      // .resourceGroupId("testString")
      .classicAccess(true)
      .build();


      Response<VPCCollection> response = service.listVpcs(listVpcsOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VPCCollection vpcCollectionResult = response.getResult();

      assertNotNull(vpcCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testCreateVpc() throws Exception {
    try {
      // ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      // .id("fee82deba12e4c0fb69c3b09d1f12345")
      // .build();

      CreateVpcOptions createVpcOptions = new CreateVpcOptions.Builder()
      // .addressPrefixManagement("manual")
      // .classicAccess(false)
      .name(generateName("vpc"))
      // .resourceGroup(resourceGroupIdentityModel)
      .build();


      Response<VPC> response = service.createVpc(createVpcOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      VPC vpcResult = response.getResult();
      store.put("created-vpc", vpcResult.getId());

      assertNotNull(vpcResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testGetVpc() throws Exception {
    try {
      GetVpcOptions getVpcOptions = new GetVpcOptions.Builder()
      .id(store.get("created-vpc"))
      .build();


      Response<VPC> response = service.getVpc(getVpcOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VPC vpcResult = response.getResult();

      assertNotNull(vpcResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testUpdateVpc() throws Exception {
    try {
      VPCPatch vpcPatchModel = new VPCPatch.Builder()
      .name(generateName("vpc"))
      .build();
      Map<String, Object> vpcPatchModelAsPatch = vpcPatchModel.asPatch();

      UpdateVpcOptions updateVpcOptions = new UpdateVpcOptions.Builder()
      .id(store.get("created-vpc"))
      .vpcPatch(vpcPatchModelAsPatch)
      .build();

      Response<VPC> response = service.updateVpc(updateVpcOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VPC vpcResult = response.getResult();

      assertNotNull(vpcResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testGetVpcDefaultNetworkAcl() throws Exception {
    try {
      GetVpcDefaultNetworkAclOptions getVpcDefaultNetworkAclOptions = new GetVpcDefaultNetworkAclOptions.Builder()
      .id(store.get("created-vpc"))
      .build();


      Response<DefaultNetworkACL> response = service.getVpcDefaultNetworkAcl(getVpcDefaultNetworkAclOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DefaultNetworkACL defaultNetworkAclResult = response.getResult();

      assertNotNull(defaultNetworkAclResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testGetVpcDefaultSecurityGroup() throws Exception {
    try {
      GetVpcDefaultSecurityGroupOptions getVpcDefaultSecurityGroupOptions = new GetVpcDefaultSecurityGroupOptions.Builder()
      .id(store.get("created-vpc"))
      .build();


      Response<DefaultSecurityGroup> response = service.getVpcDefaultSecurityGroup(getVpcDefaultSecurityGroupOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DefaultSecurityGroup defaultSecurityGroupResult = response.getResult();

      assertNotNull(defaultSecurityGroupResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testListVpcAddressPrefixes() throws Exception {
    try {
      ListVpcAddressPrefixesOptions listVpcAddressPrefixesOptions = new ListVpcAddressPrefixesOptions.Builder()
      .vpcId(store.get("created-vpc"))
      .build();


      Response<AddressPrefixCollection> response = service.listVpcAddressPrefixes(listVpcAddressPrefixesOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      AddressPrefixCollection addressPrefixCollectionResult = response.getResult();

      assertNotNull(addressPrefixCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testCreateVpcAddressPrefix() throws Exception {
    try {
      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name(store.get("zone"))
      .build();

      CreateVpcAddressPrefixOptions createVpcAddressPrefixOptions = new CreateVpcAddressPrefixOptions.Builder()
      .vpcId(store.get("created-vpc"))
      .cidr("10.0.0.0/24")
      .zone(zoneIdentityModel)
      .isDefault(true)
      .name(generateName("addr-prefix"))
      .build();


      Response<AddressPrefix> response = service.createVpcAddressPrefix(createVpcAddressPrefixOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      AddressPrefix addressPrefixResult = response.getResult();
      store.put("created-addrprefix", addressPrefixResult.getId());
      assertNotNull(addressPrefixResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testGetVpcAddressPrefix() throws Exception {
    try {
      GetVpcAddressPrefixOptions getVpcAddressPrefixOptions = new GetVpcAddressPrefixOptions.Builder()
      .vpcId(store.get("created-vpc"))
      .id(store.get("created-addrprefix"))
      .build();


      Response<AddressPrefix> response = service.getVpcAddressPrefix(getVpcAddressPrefixOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      AddressPrefix addressPrefixResult = response.getResult();

      assertNotNull(addressPrefixResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testUpdateVpcAddressPrefix() throws Exception {
    try {
      AddressPrefixPatch addressPrefixPatchModel = new AddressPrefixPatch.Builder()
      .name(generateName("addr-prefix"))
      .isDefault(false)
      .build();
      Map<String, Object> addressPrefixPatchModelAsPatch = addressPrefixPatchModel.asPatch();

      UpdateVpcAddressPrefixOptions updateVpcAddressPrefixOptions = new UpdateVpcAddressPrefixOptions.Builder()
      .vpcId(store.get("created-vpc"))
      .id(store.get("created-addrprefix"))
      .addressPrefixPatch(addressPrefixPatchModelAsPatch)
      .build();
      Response<AddressPrefix> response = service.updateVpcAddressPrefix(updateVpcAddressPrefixOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      AddressPrefix addressPrefixResult = response.getResult();

      assertNotNull(addressPrefixResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testListVpcRoutes() throws Exception {
    try {
      ListVpcRoutesOptions listVpcRoutesOptions = new ListVpcRoutesOptions.Builder()
      .vpcId(store.get("created-vpc"))
      .zoneName(store.get("zone"))
      .build();


      Response<RouteCollection> response = service.listVpcRoutes(listVpcRoutesOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      RouteCollection routeCollectionResult = response.getResult();

      assertNotNull(routeCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testCreateVpcRoute() throws Exception {
    try {
      RouteNextHopPrototypeRouteNextHopIP routeNextHopPrototypeModel = new RouteNextHopPrototypeRouteNextHopIP.Builder()
      .address("10.5.6.3")
      .build();

      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name(store.get("zone"))
      .build();

      CreateVpcRouteOptions createVpcRouteOptions = new CreateVpcRouteOptions.Builder()
      .vpcId(store.get("created-vpc"))
      .destination("10.168.10.0/28")
      .nextHop(routeNextHopPrototypeModel)
      .zone(zoneIdentityModel)
      .name(generateName("vpc-route"))
      .build();


      Response<Route> response = service.createVpcRoute(createVpcRouteOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      Route routeResult = response.getResult();
      store.put("created-route", routeResult.getId());

      assertNotNull(routeResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testGetVpcRoute() throws Exception {
    try {
      GetVpcRouteOptions getVpcRouteOptions = new GetVpcRouteOptions.Builder()
      .vpcId(store.get("created-vpc"))
      .id(store.get("created-route"))
      .build();


      Response<Route> response = service.getVpcRoute(getVpcRouteOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Route routeResult = response.getResult();

      assertNotNull(routeResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testUpdateVpcRoute() throws Exception {
    try {
      RoutePatch routePatchModel = new RoutePatch.Builder()
      .name(generateName("vpc-route"))
      .build();
      Map<String, Object> routePatchModelAsPatch = routePatchModel.asPatch();

      UpdateVpcRouteOptions updateVpcRouteOptions = new UpdateVpcRouteOptions.Builder()
      .vpcId(store.get("created-vpc"))
      .id(store.get("created-route"))
      .routePatch(routePatchModelAsPatch)
      .build();
      Response<Route> response = service.updateVpcRoute(updateVpcRouteOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Route routeResult = response.getResult();

      assertNotNull(routeResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testListIkePolicies() throws Exception {
    try {
      ListIkePoliciesOptions listIkePoliciesOptions = new ListIkePoliciesOptions.Builder()
      .limit(Long.valueOf("1"))
      .build();


      Response<IKEPolicyCollection> response = service.listIkePolicies(listIkePoliciesOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      IKEPolicyCollection ikePolicyCollectionResult = response.getResult();

      assertNotNull(ikePolicyCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testCreateIkePolicy() throws Exception {
    try {
      CreateIkePolicyOptions createIkePolicyOptions = new CreateIkePolicyOptions.Builder()
      .authenticationAlgorithm("md5")
      .dhGroup(Long.valueOf("2"))
      .encryptionAlgorithm("triple_des")
      .ikeVersion(Long.valueOf("1"))
      .keyLifetime(Long.valueOf("28800"))
      .name(generateName("ike"))
      .build();


      Response<IKEPolicy> response = service.createIkePolicy(createIkePolicyOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      IKEPolicy ikePolicyResult = response.getResult();
      store.put("created-ike",ikePolicyResult.getId());
      assertNotNull(ikePolicyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testGetIkePolicy() throws Exception {
    try {
      GetIkePolicyOptions getIkePolicyOptions = new GetIkePolicyOptions.Builder()
      .id(store.get("created-ike"))
      .build();


      Response<IKEPolicy> response = service.getIkePolicy(getIkePolicyOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      IKEPolicy ikePolicyResult = response.getResult();

      assertNotNull(ikePolicyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testUpdateIkePolicy() throws Exception {
    try {
      IKEPolicyPatch ikePolicyPatchModel = new IKEPolicyPatch.Builder()
      .authenticationAlgorithm("md5")
      .dhGroup(Long.valueOf("2"))
      .encryptionAlgorithm("triple_des")
      .ikeVersion(Long.valueOf("1"))
      .keyLifetime(Long.valueOf("28800"))
      .build();
      Map<String, Object> ikePolicyPatchModelAsPatch = ikePolicyPatchModel.asPatch();

      UpdateIkePolicyOptions updateIkePolicyOptions = new UpdateIkePolicyOptions.Builder()
      .id(store.get("created-ike"))
      .ikePolicyPatch(ikePolicyPatchModelAsPatch)
      .build();

      Response<IKEPolicy> response = service.updateIkePolicy(updateIkePolicyOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      IKEPolicy ikePolicyResult = response.getResult();

      assertNotNull(ikePolicyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testListIkePolicyConnections() throws Exception {
    try {
      ListIkePolicyConnectionsOptions listIkePolicyConnectionsOptions = new ListIkePolicyConnectionsOptions.Builder()
      .id(store.get("created-ike"))
      .build();


      Response<VPNGatewayConnectionCollection> response = service.listIkePolicyConnections(listIkePolicyConnectionsOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VPNGatewayConnectionCollection vpnGatewayConnectionCollectionResult = response.getResult();

      assertNotNull(vpnGatewayConnectionCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testListIpsecPolicies() throws Exception {
    try {
      ListIpsecPoliciesOptions listIpsecPoliciesOptions = new ListIpsecPoliciesOptions.Builder()

      .limit(Long.valueOf("1"))
      .build();


      Response<IPsecPolicyCollection> response = service.listIpsecPolicies(listIpsecPoliciesOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      IPsecPolicyCollection iPsecPolicyCollectionResult = response.getResult();

      assertNotNull(iPsecPolicyCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testCreateIpsecPolicy() throws Exception {
    try {
      CreateIpsecPolicyOptions createIpsecPolicyOptions = new CreateIpsecPolicyOptions.Builder()
      .authenticationAlgorithm("md5")
      .encryptionAlgorithm("triple_des")
      .pfs("disabled")
      .keyLifetime(Long.valueOf("3600"))
      .name(generateName("ipsec"))
      .build();


      Response<IPsecPolicy> response = service.createIpsecPolicy(createIpsecPolicyOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      IPsecPolicy iPsecPolicyResult = response.getResult();
      store.put("created-ipsec", iPsecPolicyResult.getId());
      assertNotNull(iPsecPolicyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testGetIpsecPolicy() throws Exception {
    try {
      GetIpsecPolicyOptions getIpsecPolicyOptions = new GetIpsecPolicyOptions.Builder()
      .id(store.get("created-ipsec"))
      .build();


      Response<IPsecPolicy> response = service.getIpsecPolicy(getIpsecPolicyOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      IPsecPolicy iPsecPolicyResult = response.getResult();

      assertNotNull(iPsecPolicyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testUpdateIpsecPolicy() throws Exception {
    try {
      IPsecPolicyPatch iPsecPolicyPatchModel = new IPsecPolicyPatch.Builder()
      .name("my-ipsec-policy")
      .authenticationAlgorithm("md5")
      .encryptionAlgorithm("triple_des")
      .keyLifetime(Long.valueOf("3600"))
      .pfs("disabled")
      .build();
      Map<String, Object> iPsecPolicyPatchModelAsPatch = iPsecPolicyPatchModel.asPatch();

      UpdateIpsecPolicyOptions updateIpsecPolicyOptions = new UpdateIpsecPolicyOptions.Builder()
      .id(store.get("created-ipsec"))
      .iPsecPolicyPatch(iPsecPolicyPatchModelAsPatch)
      .build();


      Response<IPsecPolicy> response = service.updateIpsecPolicy(updateIpsecPolicyOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      IPsecPolicy iPsecPolicyResult = response.getResult();

      assertNotNull(iPsecPolicyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testListIpsecPolicyConnections() throws Exception {
    try {
      ListIpsecPolicyConnectionsOptions listIpsecPolicyConnectionsOptions = new ListIpsecPolicyConnectionsOptions.Builder()
      .id(store.get("created-ipsec"))
      .build();


      Response<VPNGatewayConnectionCollection> response = service.listIpsecPolicyConnections(listIpsecPolicyConnectionsOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VPNGatewayConnectionCollection vpnGatewayConnectionCollectionResult = response.getResult();

      assertNotNull(vpnGatewayConnectionCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testListVpnGateways() throws Exception {
    try {
      ListVpnGatewaysOptions listVpnGatewaysOptions = new ListVpnGatewaysOptions.Builder()

      .limit(Long.valueOf("1"))
      .build();


      Response<VPNGatewayCollection> response = service.listVpnGateways(listVpnGatewaysOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VPNGatewayCollection vpnGatewayCollectionResult = response.getResult();

      assertNotNull(vpnGatewayCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testCreateVpnGateway() throws Exception {
    try {
      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
      .id(store.get("created-subnet"))
      .build();

      CreateVpnGatewayOptions createVpnGatewayOptions = new CreateVpnGatewayOptions.Builder()
      .subnet(subnetIdentityModel)
      .name(generateName("vpn-gateway"))
      .build();


      Response<VPNGateway> response = service.createVpnGateway(createVpnGatewayOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      VPNGateway vpnGatewayResult = response.getResult();
      store.put("created-vpng", vpnGatewayResult.getId());
      assertNotNull(vpnGatewayResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testGetVpnGateway() throws Exception {
    try {
      GetVpnGatewayOptions getVpnGatewayOptions = new GetVpnGatewayOptions.Builder()
      .id(store.get("created-vpng"))
      .build();


      Response<VPNGateway> response = service.getVpnGateway(getVpnGatewayOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VPNGateway vpnGatewayResult = response.getResult();

      assertNotNull(vpnGatewayResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testUpdateVpnGateway() throws Exception {
    try {
      VPNGatewayPatch vpnGatewayPatchModel = new VPNGatewayPatch.Builder()
      .name(generateName("vpn-gateway"))
      .build();
      Map<String, Object> vpnGatewayPatchModelAsPatch = vpnGatewayPatchModel.asPatch();

      UpdateVpnGatewayOptions updateVpnGatewayOptions = new UpdateVpnGatewayOptions.Builder()
      .id(store.get("created-vpng"))
      .vpnGatewayPatch(vpnGatewayPatchModelAsPatch)
      .build();

      Response<VPNGateway> response = service.updateVpnGateway(updateVpnGatewayOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VPNGateway vpnGatewayResult = response.getResult();

      assertNotNull(vpnGatewayResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testListVpnGatewayConnections() throws Exception {
    try {
      ListVpnGatewayConnectionsOptions listVpnGatewayConnectionsOptions = new ListVpnGatewayConnectionsOptions.Builder()
      .vpnGatewayId(store.get("created-vpng"))
      .build();


      Response<VPNGatewayConnectionCollection> response = service.listVpnGatewayConnections(listVpnGatewayConnectionsOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VPNGatewayConnectionCollection vpnGatewayConnectionCollectionResult = response.getResult();

      assertNotNull(vpnGatewayConnectionCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testCreateVpnGatewayConnection() throws Exception {
    try {
      IKEPolicyIdentityById ikePolicyIdentityModel = new IKEPolicyIdentityById.Builder()
      .id(store.get("created-ike"))
      .build();

      IPsecPolicyIdentityById iPsecPolicyIdentityModel = new IPsecPolicyIdentityById.Builder()
      .id(store.get("created-ipsec"))
      .build();

      VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype vpnGatewayConnectionPrototypeModel = new VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype.Builder()
      .adminStateUp(true)
      .peerAddress("169.21.50.5")
      .name(generateName("my-vpn-connection"))
      .psk("lkj14b1oi0alcniejkso")
      .ikePolicy(ikePolicyIdentityModel)
      .ipsecPolicy(iPsecPolicyIdentityModel)
      .localCidrs(new java.util.ArrayList<String>(java.util.Arrays.asList("192.168.1.0/24")))
      .peerCidrs(new java.util.ArrayList<String>(java.util.Arrays.asList("10.45.1.0/24")))
      .build();


      CreateVpnGatewayConnectionOptions createVpnGatewayConnectionOptions = new CreateVpnGatewayConnectionOptions.Builder()
      .vpnGatewayId(store.get("created-vpng"))
      .vpnGatewayConnectionPrototype(vpnGatewayConnectionPrototypeModel)
      .build();


      Response<VPNGatewayConnection> response = service.createVpnGatewayConnection(createVpnGatewayConnectionOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      VPNGatewayConnection vpnGatewayConnectionResult = response.getResult();
      store.put("created-vpng-conn", vpnGatewayConnectionResult.getId());
      assertNotNull(vpnGatewayConnectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testGetVpnGatewayConnection() throws Exception {
    try {
      GetVpnGatewayConnectionOptions getVpnGatewayConnectionOptions = new GetVpnGatewayConnectionOptions.Builder()
      .vpnGatewayId(store.get("created-vpng"))
      .id(store.get("created-vpng-conn"))
      .build();


      Response<VPNGatewayConnection> response = service.getVpnGatewayConnection(getVpnGatewayConnectionOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VPNGatewayConnection vpnGatewayConnectionResult = response.getResult();

      assertNotNull(vpnGatewayConnectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testUpdateVpnGatewayConnection() throws Exception {
    try {
      VPNGatewayConnectionPatch vpnGatewayConnectionPatchModel = new VPNGatewayConnectionPatch.Builder()
      .adminStateUp(true)
      .peerAddress("169.21.50.5")
      .psk("lkj14b1oi0alcniejkso")
      .build();
      Map<String, Object> vpnGatewayConnectionPatchModelAsPatch = vpnGatewayConnectionPatchModel.asPatch();

      UpdateVpnGatewayConnectionOptions updateVpnGatewayConnectionOptions = new UpdateVpnGatewayConnectionOptions.Builder()
      .vpnGatewayId(store.get("created-vpng"))
      .id(store.get("created-vpng-conn"))
      .vpnGatewayConnectionPatch(vpnGatewayConnectionPatchModelAsPatch)
      .build();

      Response<VPNGatewayConnection> response = service.updateVpnGatewayConnection(updateVpnGatewayConnectionOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VPNGatewayConnection vpnGatewayConnectionResult = response.getResult();

      assertNotNull(vpnGatewayConnectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testListVpnGatewayConnectionLocalCidrs() throws Exception {
    try {
      ListVpnGatewayConnectionLocalCidrsOptions listVpnGatewayConnectionLocalCidrsOptions = new ListVpnGatewayConnectionLocalCidrsOptions.Builder()
      .vpnGatewayId(store.get("created-vpng"))
      .id(store.get("created-vpng-conn"))
      .build();


      Response<VPNGatewayConnectionLocalCIDRs> response = service.listVpnGatewayConnectionLocalCidrs(listVpnGatewayConnectionLocalCidrsOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VPNGatewayConnectionLocalCIDRs vpnGatewayConnectionLocalCidRsResult = response.getResult();

      assertNotNull(vpnGatewayConnectionLocalCidRsResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testCheckVpnGatewayConnectionLocalCidr() throws Exception {
    try {
      CheckVpnGatewayConnectionLocalCidrOptions checkVpnGatewayConnectionLocalCidrOptions = new CheckVpnGatewayConnectionLocalCidrOptions.Builder()
      .vpnGatewayId(store.get("created-vpng"))
      .id(store.get("created-vpng-conn"))
      .cidrPrefix("192.122.0.0")
      .prefixLength("28")
      .build();


      Response<Void> response = service.checkVpnGatewayConnectionLocalCidr(checkVpnGatewayConnectionLocalCidrOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);


    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testAddVpnGatewayConnectionLocalCidr() throws Exception {
    try {
      AddVpnGatewayConnectionLocalCidrOptions addVpnGatewayConnectionLocalCidrOptions = new AddVpnGatewayConnectionLocalCidrOptions.Builder()
      .vpnGatewayId(store.get("created-vpng"))
      .id(store.get("created-vpng-conn"))
      .cidrPrefix("192.122.0.0")
      .prefixLength("28")
      .build();


      Response<Void> response = service.addVpnGatewayConnectionLocalCidr(addVpnGatewayConnectionLocalCidrOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);


    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testListVpnGatewayConnectionPeerCidrs() throws Exception {
    try {
      ListVpnGatewayConnectionPeerCidrsOptions listVpnGatewayConnectionPeerCidrsOptions = new ListVpnGatewayConnectionPeerCidrsOptions.Builder()
      .vpnGatewayId(store.get("created-vpng"))
      .id(store.get("created-vpng-conn"))
      .build();


      Response<VPNGatewayConnectionPeerCIDRs> response = service.listVpnGatewayConnectionPeerCidrs(listVpnGatewayConnectionPeerCidrsOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VPNGatewayConnectionPeerCIDRs vpnGatewayConnectionPeerCidRsResult = response.getResult();

      assertNotNull(vpnGatewayConnectionPeerCidRsResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testCheckVpnGatewayConnectionPeerCidr() throws Exception {
    try {
      CheckVpnGatewayConnectionPeerCidrOptions checkVpnGatewayConnectionPeerCidrOptions = new CheckVpnGatewayConnectionPeerCidrOptions.Builder()
      .vpnGatewayId(store.get("created-vpng"))
      .id(store.get("created-vpng-conn"))
      .cidrPrefix("192.129.0.0")
      .prefixLength("28")
      .build();


      Response<Void> response = service.checkVpnGatewayConnectionPeerCidr(checkVpnGatewayConnectionPeerCidrOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);


    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testAddVpnGatewayConnectionPeerCidr() throws Exception {
    try {
      AddVpnGatewayConnectionPeerCidrOptions addVpnGatewayConnectionPeerCidrOptions = new AddVpnGatewayConnectionPeerCidrOptions.Builder()
      .vpnGatewayId(store.get("created-vpng"))
      .id(store.get("created-vpng-conn"))
      .cidrPrefix("192.129.0.0")
      .prefixLength("28")
      .build();


      Response<Void> response = service.addVpnGatewayConnectionPeerCidr(addVpnGatewayConnectionPeerCidrOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);


    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testRemoveVpnGatewayConnectionPeerCidr() throws Exception {
    try {
      RemoveVpnGatewayConnectionPeerCidrOptions removeVpnGatewayConnectionPeerCidrOptions = new RemoveVpnGatewayConnectionPeerCidrOptions.Builder()
      .vpnGatewayId(store.get("created-vpng"))
      .id(store.get("created-vpng-conn"))
      .cidrPrefix("192.129.0.0")
      .prefixLength("28")
      .build();


      Response<Void> response = service.removeVpnGatewayConnectionPeerCidr(removeVpnGatewayConnectionPeerCidrOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);


    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testRemoveVpnGatewayConnectionLocalCidr() throws Exception {
    try {
      RemoveVpnGatewayConnectionLocalCidrOptions removeVpnGatewayConnectionLocalCidrOptions = new RemoveVpnGatewayConnectionLocalCidrOptions.Builder()
      .vpnGatewayId(store.get("created-vpng"))
      .id(store.get("created-vpng-conn"))
      .cidrPrefix("192.122.0.0")
      .prefixLength("28")
      .build();


      Response<Void> response = service.removeVpnGatewayConnectionLocalCidr(removeVpnGatewayConnectionLocalCidrOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);


    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testListVolumeProfiles() throws Exception {
    try {
      ListVolumeProfilesOptions listVolumeProfilesOptions = new ListVolumeProfilesOptions.Builder()
      .limit(Long.valueOf("1"))
      .build();


      Response<VolumeProfileCollection> response = service.listVolumeProfiles(listVolumeProfilesOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VolumeProfileCollection volumeProfileCollectionResult = response.getResult();
      store.put("volume-profile", volumeProfileCollectionResult.getProfiles().get(0).getName());

      assertNotNull(volumeProfileCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testGetVolumeProfile() throws Exception {
    try {
      GetVolumeProfileOptions getVolumeProfileOptions = new GetVolumeProfileOptions.Builder()
      .name(store.get("volume-profile"))
      .build();


      Response<VolumeProfile> response = service.getVolumeProfile(getVolumeProfileOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VolumeProfile volumeProfileResult = response.getResult();

      assertNotNull(volumeProfileResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testListVolumes() throws Exception {
    try {
      ListVolumesOptions listVolumesOptions = new ListVolumesOptions.Builder()
      .limit(Long.valueOf("1"))
      .build();


      Response<VolumeCollection> response = service.listVolumes(listVolumesOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VolumeCollection volumeCollectionResult = response.getResult();

      assertNotNull(volumeCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testListInstanceTemplates() throws Exception {
    try {
      ListInstanceTemplatesOptions listInstanceTemplatesOptions = new ListInstanceTemplatesOptions();


      Response<InstanceTemplateCollection> response = service.listInstanceTemplates(listInstanceTemplatesOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceTemplateCollection instanceTemplateCollectionResult = response.getResult();

      assertNotNull(instanceTemplateCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testCreateInstanceTemplate() throws Exception {
    try {

      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
      .id(store.get("created-subnet"))
      .build();

      ImageIdentityById imageIdentityModel = new ImageIdentityById.Builder()
      .id(store.get("image"))
      .build();

      InstanceProfileIdentityByName instanceProfileIdentityModel = new InstanceProfileIdentityByName.Builder()
      .name("bx2-2x8")
      .build();

      KeyIdentityById keyIdentityModel = new KeyIdentityById.Builder()
      .id(store.get("created-key"))
      .build();

      NetworkInterfacePrototype networkInterfacePrototypeModel = new NetworkInterfacePrototype.Builder()
      .name(generateName("nic"))
      .subnet(subnetIdentityModel)
      .build();

      VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
      .id(store.get("created-vpc"))
      .build();

      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name(store.get("zone"))
      .build();

      InstanceTemplatePrototypeInstanceByImage instanceTemplatePrototypeModel = new InstanceTemplatePrototypeInstanceByImage.Builder()
      .name(generateName("template"))
      .keys(new java.util.ArrayList<KeyIdentity>(java.util.Arrays.asList(keyIdentityModel)))
      .primaryNetworkInterface(networkInterfacePrototypeModel)
      .profile(instanceProfileIdentityModel)
      .vpc(vpcIdentityModel)
      .zone(zoneIdentityModel)
      .image(imageIdentityModel)
      .build();

      CreateInstanceTemplateOptions createInstanceTemplateOptions = new CreateInstanceTemplateOptions.Builder()
      .instanceTemplatePrototype(instanceTemplatePrototypeModel)
      .build();


      Response<InstanceTemplate> response = service.createInstanceTemplate(createInstanceTemplateOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      InstanceTemplate instanceTemplateResult = response.getResult();
      store.put("created-instance-template", instanceTemplateResult.getId());

      assertNotNull(instanceTemplateResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testGetInstanceTemplate() throws Exception {
    try {
      GetInstanceTemplateOptions getInstanceTemplateOptions = new GetInstanceTemplateOptions.Builder()
      .id(store.get("created-instance-template"))
      .build();


      Response<InstanceTemplate> response = service.getInstanceTemplate(getInstanceTemplateOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceTemplate instanceTemplateResult = response.getResult();

      assertNotNull(instanceTemplateResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testUpdateInstanceTemplate() throws Exception {
    try {
      InstanceTemplatePatch instanceTemplatePatchModel = new InstanceTemplatePatch.Builder()
      .name(generateName("template-2"))
      .build();
      Map<String, Object> instanceTemplatePatchModelAsPatch = instanceTemplatePatchModel.asPatch();

      UpdateInstanceTemplateOptions updateInstanceTemplateOptions = new UpdateInstanceTemplateOptions.Builder()
      .id(store.get("created-instance-template"))
      .instanceTemplatePatch(instanceTemplatePatchModelAsPatch)
      .build();

      Response<InstanceTemplate> response = service.updateInstanceTemplate(updateInstanceTemplateOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceTemplate instanceTemplateResult = response.getResult();

      assertNotNull(instanceTemplateResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testDeleteInstanceTemplate() throws Exception {
    try {
      DeleteInstanceTemplateOptions deleteInstanceTemplateOptions = new DeleteInstanceTemplateOptions.Builder()
      .id(store.get("created-instance-template"))
      .build();


      Response<Void> response = service.deleteInstanceTemplate(deleteInstanceTemplateOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testListInstanceGroups() throws Exception {
    try {
      ListInstanceGroupsOptions listInstanceGroupsOptions = new ListInstanceGroupsOptions.Builder()
      .limit(Long.valueOf("1"))
      .build();


      Response<InstanceGroupCollection> response = service.listInstanceGroups(listInstanceGroupsOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceGroupCollection instanceGroupCollectionResult = response.getResult();

      assertNotNull(instanceGroupCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testCreateInstanceGroup() throws Exception {
    try {
      InstanceTemplateIdentityById instanceTemplateIdentityModel = new InstanceTemplateIdentityById.Builder()
      .id(store.get("created-instance-template"))
      .build();

      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
      .id(store.get("created-subnet"))
      .build();

      CreateInstanceGroupOptions createInstanceGroupOptions = new CreateInstanceGroupOptions.Builder()
      .instanceTemplate(instanceTemplateIdentityModel)
      .subnets(new java.util.ArrayList<SubnetIdentity>(java.util.Arrays.asList(subnetIdentityModel)))
      .name(generateName("instance-group"))
      .membershipCount(Long.valueOf("2"))
      .build();


      Response<InstanceGroup> response = service.createInstanceGroup(createInstanceGroupOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      InstanceGroup instanceGroupResult = response.getResult();
      store.put("created-instance-group", instanceGroupResult.getId());

      assertNotNull(instanceGroupResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testGetInstanceGroup() throws Exception {
    try {
      GetInstanceGroupOptions getInstanceGroupOptions = new GetInstanceGroupOptions.Builder()
      .id(store.get("created-instance-group"))
      .build();


      Response<InstanceGroup> response = service.getInstanceGroup(getInstanceGroupOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceGroup instanceGroupResult = response.getResult();

      assertNotNull(instanceGroupResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testUpdateInstanceGroup() throws Exception {
    try {

      InstanceGroupPatch instanceGroupPatchModel = new InstanceGroupPatch.Builder()
      .name("my-instance-group")
      .build();
      Map<String, Object> instanceGroupPatchModelAsPatch = instanceGroupPatchModel.asPatch();

      UpdateInstanceGroupOptions updateInstanceGroupOptions = new UpdateInstanceGroupOptions.Builder()
      .id(store.get("created-instance-group"))
      .instanceGroupPatch(instanceGroupPatchModelAsPatch)
      .build();

      Response<InstanceGroup> response = service.updateInstanceGroup(updateInstanceGroupOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceGroup instanceGroupResult = response.getResult();

      assertNotNull(instanceGroupResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testListInstanceGroupManagers() throws Exception {
    try {
      ListInstanceGroupManagersOptions listInstanceGroupManagersOptions = new ListInstanceGroupManagersOptions.Builder()
      .instanceGroupId(store.get("created-instance-group"))
      .build();


      Response<InstanceGroupManagerCollection> response = service.listInstanceGroupManagers(listInstanceGroupManagersOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceGroupManagerCollection instanceGroupManagerCollectionResult = response.getResult();

      assertNotNull(instanceGroupManagerCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testCreateInstanceGroupManager() throws Exception {
    try {
      InstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype instanceGroupManagerPrototypeModel = new InstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype.Builder()
      .name(generateName("manager"))
      .managementEnabled(true)
      .aggregationWindow(Long.valueOf("120"))
      .cooldown(Long.valueOf("210"))
      .maxMembershipCount(Long.valueOf("1"))
      .minMembershipCount(Long.valueOf("2"))
      .managerType("autoscale")
      .build();

      CreateInstanceGroupManagerOptions createInstanceGroupManagerOptions = new CreateInstanceGroupManagerOptions.Builder()
      .instanceGroupId(store.get("created-instance-group"))
      .instanceGroupManagerPrototype(instanceGroupManagerPrototypeModel)
      .build();


      Response<InstanceGroupManager> response = service.createInstanceGroupManager(createInstanceGroupManagerOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      InstanceGroupManager instanceGroupManagerResult = response.getResult();
      store.put("created-instance-group-manager", instanceGroupManagerResult.getId());

      assertNotNull(instanceGroupManagerResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testGetInstanceGroupManager() throws Exception {
    try {
      GetInstanceGroupManagerOptions getInstanceGroupManagerOptions = new GetInstanceGroupManagerOptions.Builder()
      .instanceGroupId(store.get("created-instance-group"))
      .id(store.get("created-instance-group-manager"))
      .build();


      Response<InstanceGroupManager> response = service.getInstanceGroupManager(getInstanceGroupManagerOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceGroupManager instanceGroupManagerResult = response.getResult();

      assertNotNull(instanceGroupManagerResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testUpdateInstanceGroupManager() throws Exception {
    try {
      InstanceGroupManagerPatch instanceGroupManagerPatchModel = new InstanceGroupManagerPatch.Builder()
      .managementEnabled(true)
      .aggregationWindow(Long.valueOf("120"))
      .cooldown(Long.valueOf("210"))
      .build();
      Map<String, Object> instanceGroupManagerPatchModelAsPatch = instanceGroupManagerPatchModel.asPatch();

      UpdateInstanceGroupManagerOptions updateInstanceGroupManagerOptions = new UpdateInstanceGroupManagerOptions.Builder()
      .instanceGroupId(store.get("created-instance-group"))
      .id(store.get("created-instance-group-manager"))
      .instanceGroupManagerPatch(instanceGroupManagerPatchModelAsPatch)
      .build();

      Response<InstanceGroupManager> response = service.updateInstanceGroupManager(updateInstanceGroupManagerOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceGroupManager instanceGroupManagerResult = response.getResult();

      assertNotNull(instanceGroupManagerResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testListInstanceGroupManagerPolicies() throws Exception {
    try {
      ListInstanceGroupManagerPoliciesOptions listInstanceGroupManagerPoliciesOptions = new ListInstanceGroupManagerPoliciesOptions.Builder()
      .instanceGroupId(store.get("created-instance-group"))
      .instanceGroupManagerId(store.get("created-instance-group-manager"))
      .build();


      Response<InstanceGroupManagerPolicyCollection> response = service.listInstanceGroupManagerPolicies(listInstanceGroupManagerPoliciesOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceGroupManagerPolicyCollection instanceGroupManagerPolicyCollectionResult = response.getResult();

      assertNotNull(instanceGroupManagerPolicyCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testCreateInstanceGroupManagerPolicy() throws Exception {
    try {
      InstanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototype instanceGroupManagerPolicyPrototypeModel = new InstanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototype.Builder()
      .name(generateName("policy"))
      .metricType("cpu")
      .metricValue(Long.valueOf("26"))
      .policyType("target")
      .build();

      CreateInstanceGroupManagerPolicyOptions createInstanceGroupManagerPolicyOptions = new CreateInstanceGroupManagerPolicyOptions.Builder()
      .instanceGroupId(store.get("created-instance-group"))
      .instanceGroupManagerId(store.get("created-instance-group-manager"))
      .instanceGroupManagerPolicyPrototype(instanceGroupManagerPolicyPrototypeModel)
      .build();


      Response<InstanceGroupManagerPolicy> response = service.createInstanceGroupManagerPolicy(createInstanceGroupManagerPolicyOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      InstanceGroupManagerPolicy instanceGroupManagerPolicyResult = response.getResult();
      store.put("created-instance-group-man-policy", instanceGroupManagerPolicyResult.getId());
      assertNotNull(instanceGroupManagerPolicyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testGetInstanceGroupManagerPolicy() throws Exception {
    try {
      GetInstanceGroupManagerPolicyOptions getInstanceGroupManagerPolicyOptions = new GetInstanceGroupManagerPolicyOptions.Builder()
      .instanceGroupId(store.get("created-instance-group"))
      .instanceGroupManagerId(store.get("created-instance-group-manager"))
      .id(store.get("created-instance-group-man-policy"))
      .build();


      Response<InstanceGroupManagerPolicy> response = service.getInstanceGroupManagerPolicy(getInstanceGroupManagerPolicyOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceGroupManagerPolicy instanceGroupManagerPolicyResult = response.getResult();

      assertNotNull(instanceGroupManagerPolicyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testUpdateInstanceGroupManagerPolicy() throws Exception {
    try {
      InstanceGroupManagerPolicyPatch instanceGroupManagerPolicyPatchModel = new InstanceGroupManagerPolicyPatch.Builder()
      .metricType("cpu")
      .metricValue(Long.valueOf("26"))
      .build();
      Map<String, Object> instanceGroupManagerPolicyPatchModelAsPatch = instanceGroupManagerPolicyPatchModel.asPatch();

      UpdateInstanceGroupManagerPolicyOptions updateInstanceGroupManagerPolicyOptions = new UpdateInstanceGroupManagerPolicyOptions.Builder()
      .instanceGroupId(store.get("created-instance-group"))
      .instanceGroupManagerId(store.get("created-instance-group-manager"))
      .id(store.get("created-instance-group-man-policy"))
      .instanceGroupManagerPolicyPatch(instanceGroupManagerPolicyPatchModelAsPatch)
      .build();

      Response<InstanceGroupManagerPolicy> response = service.updateInstanceGroupManagerPolicy(updateInstanceGroupManagerPolicyOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceGroupManagerPolicy instanceGroupManagerPolicyResult = response.getResult();

      assertNotNull(instanceGroupManagerPolicyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testListInstanceGroupMemberships() throws Exception {
    try {
      ListInstanceGroupMembershipsOptions listInstanceGroupMembershipsOptions = new ListInstanceGroupMembershipsOptions.Builder()
      .instanceGroupId(store.get("created-instance-group"))
      .build();


      Response<InstanceGroupMembershipCollection> response = service.listInstanceGroupMemberships(listInstanceGroupMembershipsOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceGroupMembershipCollection instanceGroupMembershipCollectionResult = response.getResult();
      store.put("created-membership", instanceGroupMembershipCollectionResult.getMemberships().get(0).getId());
      assertNotNull(instanceGroupMembershipCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testGetInstanceGroupMembership() throws Exception {
    try {
      GetInstanceGroupMembershipOptions getInstanceGroupMembershipOptions = new GetInstanceGroupMembershipOptions.Builder()
      .instanceGroupId(store.get("created-instance-group"))
      .id(store.get("created-membership"))
      .build();


      Response<InstanceGroupMembership> response = service.getInstanceGroupMembership(getInstanceGroupMembershipOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceGroupMembership instanceGroupMembershipResult = response.getResult();

      assertNotNull(instanceGroupMembershipResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testUpdateInstanceGroupMembership() throws Exception {
    try {
      InstanceGroupMembershipPatch instanceGroupMembershipPatchModel = new InstanceGroupMembershipPatch.Builder()
      .name("my-instance-group-membership")
      .build();
      Map<String, Object> instanceGroupMembershipPatchModelAsPatch = instanceGroupMembershipPatchModel.asPatch();

      UpdateInstanceGroupMembershipOptions updateInstanceGroupMembershipOptions = new UpdateInstanceGroupMembershipOptions.Builder()
      .instanceGroupId(store.get("created-instance-group"))
      .id(store.get("created-membership"))
      .instanceGroupMembershipPatch(instanceGroupMembershipPatchModelAsPatch)
      .build();

      Response<InstanceGroupMembership> response = service.updateInstanceGroupMembership(updateInstanceGroupMembershipOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceGroupMembership instanceGroupMembershipResult = response.getResult();

      assertNotNull(instanceGroupMembershipResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testDeleteInstanceGroupMemberships() throws Exception {
    try {
      DeleteInstanceGroupMembershipsOptions deleteInstanceGroupMembershipsOptions = new DeleteInstanceGroupMembershipsOptions.Builder()
      .instanceGroupId(store.get("created-instance-group"))
      .build();


      Response<Void> response = service.deleteInstanceGroupMemberships(deleteInstanceGroupMembershipsOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testDeleteInstanceGroupMembership() throws Exception {
    try {
      DeleteInstanceGroupMembershipOptions deleteInstanceGroupMembershipOptions = new DeleteInstanceGroupMembershipOptions.Builder()
      .instanceGroupId(store.get("created-instance-group"))
      .id(store.get("created-membership"))
      .build();


      Response<Void> response = service.deleteInstanceGroupMembership(deleteInstanceGroupMembershipOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testDeleteInstanceGroupManagerPolicy() throws Exception {
    try {
      DeleteInstanceGroupManagerPolicyOptions deleteInstanceGroupManagerPolicyOptions = new DeleteInstanceGroupManagerPolicyOptions.Builder()
      .instanceGroupId(store.get("created-instance-group"))
      .instanceGroupManagerId(store.get("created-instance-group-manager"))
      .id(store.get("created-instance-group-man-policy"))
      .build();


      Response<Void> response = service.deleteInstanceGroupManagerPolicy(deleteInstanceGroupManagerPolicyOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testDeleteInstanceGroupManager() throws Exception {
    try {
      DeleteInstanceGroupManagerOptions deleteInstanceGroupManagerOptions = new DeleteInstanceGroupManagerOptions.Builder()
      .instanceGroupId(store.get("created-instance-group"))
      .id(store.get("created-instance-group-manager"))
      .build();


      Response<Void> response = service.deleteInstanceGroupManager(deleteInstanceGroupManagerOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testDeleteInstanceGroupLoadBalancer() throws Exception {
    try {
      DeleteInstanceGroupLoadBalancerOptions deleteInstanceGroupLoadBalancerOptions = new DeleteInstanceGroupLoadBalancerOptions.Builder()
      .instanceGroupId(store.get("created-instance-group"))
      .build();


      Response<Void> response = service.deleteInstanceGroupLoadBalancer(deleteInstanceGroupLoadBalancerOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testDeleteInstanceGroup() throws Exception {
    try {
      DeleteInstanceGroupOptions deleteInstanceGroupOptions = new DeleteInstanceGroupOptions.Builder()
      .id(store.get("created-instance-group"))
      .build();


      Response<Void> response = service.deleteInstanceGroup(deleteInstanceGroupOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testCreateVolume() throws Exception {
    try {


      VolumeProfileIdentityByName volumeProfileIdentityModel = new VolumeProfileIdentityByName.Builder()
      .name("general-purpose")
      .build();

      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name(store.get("zone"))
      .build();

      VolumePrototypeVolumeByCapacity volumePrototypeModel = new VolumePrototypeVolumeByCapacity.Builder()
      // .encryptionKey(encryptionKeyIdentityModel)
      // .iops(Long.valueOf("10000"))
      .name(generateName("vol"))
      .profile(volumeProfileIdentityModel)
      // .resourceGroup(resourceGroupIdentityModel)
      .zone(zoneIdentityModel)
      .capacity(Long.valueOf("100"))
      .build();

      CreateVolumeOptions createVolumeOptions = new CreateVolumeOptions.Builder()
      .volumePrototype(volumePrototypeModel)
      .build();


      Response<Volume> response = service.createVolume(createVolumeOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      Volume volumeResult = response.getResult();
      store.put("created-volume", volumeResult.getId());
      assertNotNull(volumeResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testGetVolume() throws Exception {
    try {
      GetVolumeOptions getVolumeOptions = new GetVolumeOptions.Builder()
      .id(store.get("created-volume"))
      .build();


      Response<Volume> response = service.getVolume(getVolumeOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Volume volumeResult = response.getResult();

      assertNotNull(volumeResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testUpdateVolume() throws Exception {
    try {
      VolumePatch volumePatchModel = new VolumePatch.Builder()
      .name(generateName("volume"))
      .build();
      Map<String, Object> volumePatchModelAsPatch = volumePatchModel.asPatch();

      UpdateVolumeOptions updateVolumeOptions = new UpdateVolumeOptions.Builder()
      .id(store.get("created-volume"))
      .volumePatch(volumePatchModelAsPatch)
      .build();

      Response<Volume> response = service.updateVolume(updateVolumeOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Volume volumeResult = response.getResult();

      assertNotNull(volumeResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testUnsetSubnetPublicGateway() throws Exception {
    try {
      UnsetSubnetPublicGatewayOptions unsetSubnetPublicGatewayOptions = new UnsetSubnetPublicGatewayOptions.Builder()
      .id(store.get("created-subnet"))
      .build();


      Response<Void> response = service.unsetSubnetPublicGateway(unsetSubnetPublicGatewayOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);


    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testRemoveSecurityGroupNetworkInterface() throws Exception {
    try {
      RemoveSecurityGroupNetworkInterfaceOptions removeSecurityGroupNetworkInterfaceOptions = new RemoveSecurityGroupNetworkInterfaceOptions.Builder()
      .securityGroupId(store.get("created-sg"))
      .id(store.get("sg-nic"))
      .build();


      Response<Void> response = service.removeSecurityGroupNetworkInterface(removeSecurityGroupNetworkInterfaceOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testRemoveInstanceNetworkInterfaceFloatingIp() throws Exception {
    try {
      RemoveInstanceNetworkInterfaceFloatingIpOptions removeInstanceNetworkInterfaceFloatingIpOptions = new RemoveInstanceNetworkInterfaceFloatingIpOptions.Builder()
      .networkInterfaceId(store.get("second-nic"))
      .instanceId(store.get("created-instance"))
      .id(store.get("created-floating-ip"))
      .build();


      Response<Void> response = service.removeInstanceNetworkInterfaceFloatingIp(removeInstanceNetworkInterfaceFloatingIpOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testDeleteVpnGatewayConnection() throws Exception {
    try {
      DeleteVpnGatewayConnectionOptions deleteVpnGatewayConnectionOptions = new DeleteVpnGatewayConnectionOptions.Builder()
      .vpnGatewayId(store.get("created-vpng"))
      .id(store.get("created-vpng-conn"))
      .build();


      Response<Void> response = service.deleteVpnGatewayConnection(deleteVpnGatewayConnectionOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);


    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testDeleteVpnGateway() throws Exception {
    try {
      DeleteVpnGatewayOptions deleteVpnGatewayOptions = new DeleteVpnGatewayOptions.Builder()
      .id(store.get("created-vpng"))
      .build();


      Response<Void> response = service.deleteVpnGateway(deleteVpnGatewayOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);


    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testDeleteVpcRoute() throws Exception {
    try {
      DeleteVpcRouteOptions deleteVpcRouteOptions = new DeleteVpcRouteOptions.Builder()
      .vpcId(store.get("created-vpc"))
      .id(store.get("created-route"))
      .build();


      Response<Void> response = service.deleteVpcRoute(deleteVpcRouteOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);


    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testDeleteVpcAddressPrefix() throws Exception {
    try {
      DeleteVpcAddressPrefixOptions deleteVpcAddressPrefixOptions = new DeleteVpcAddressPrefixOptions.Builder()
      .vpcId(store.get("created-vpc"))
      .id(store.get("created-addrprefix"))
      .build();


      Response<Void> response = service.deleteVpcAddressPrefix(deleteVpcAddressPrefixOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);


    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testDeleteVpc() throws Exception {
    try {
      DeleteVpcOptions deleteVpcOptions = new DeleteVpcOptions.Builder()
      .id(store.get("created-vpc"))
      .build();


      Response<Void> response = service.deleteVpc(deleteVpcOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);


    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testDeleteVolume() throws Exception {
    try {
      DeleteVolumeOptions deleteVolumeOptions = new DeleteVolumeOptions.Builder()
      .id(store.get("created-volume"))
      .build();


      Response<Void> response = service.deleteVolume(deleteVolumeOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);


    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testDeleteSubnet() throws Exception {
    try {
      DeleteSubnetOptions deleteSubnetOptions = new DeleteSubnetOptions.Builder()
      .id(store.get("created-subnet"))
      .build();


      Response<Void> response = service.deleteSubnet(deleteSubnetOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);


    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testDeleteSecurityGroupRule() throws Exception {
    try {
      DeleteSecurityGroupRuleOptions deleteSecurityGroupRuleOptions = new DeleteSecurityGroupRuleOptions.Builder()
      .securityGroupId(store.get("created-sg"))
      .id(store.get("created-sg-rule"))
      .build();


      Response<Void> response = service.deleteSecurityGroupRule(deleteSecurityGroupRuleOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);


    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testDeleteSecurityGroup() throws Exception {
    try {
      DeleteSecurityGroupOptions deleteSecurityGroupOptions = new DeleteSecurityGroupOptions.Builder()
      .id(store.get("created-sg"))
      .build();


      Response<Void> response = service.deleteSecurityGroup(deleteSecurityGroupOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);


    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testDeletePublicGateway() throws Exception {
    try {
      DeletePublicGatewayOptions deletePublicGatewayOptions = new DeletePublicGatewayOptions.Builder()
      .id(store.get("created-pgw"))
      .build();


      Response<Void> response = service.deletePublicGateway(deletePublicGatewayOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testDeleteNetworkAclRule() throws Exception {
    try {
      DeleteNetworkAclRuleOptions deleteNetworkAclRuleOptions = new DeleteNetworkAclRuleOptions.Builder()
      .networkAclId(store.get("created-acl"))
      .id(store.get("created-acl-rule"))
      .build();


      Response<Void> response = service.deleteNetworkAclRule(deleteNetworkAclRuleOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);


    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testDeleteNetworkAcl() throws Exception {
    try {
      DeleteNetworkAclOptions deleteNetworkAclOptions = new DeleteNetworkAclOptions.Builder()
      .id(store.get("created-acl"))
      .build();


      Response<Void> response = service.deleteNetworkAcl(deleteNetworkAclOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);


    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testDeleteLoadBalancerPoolMember() throws Exception {
    try {
      DeleteLoadBalancerPoolMemberOptions deleteLoadBalancerPoolMemberOptions = new DeleteLoadBalancerPoolMemberOptions.Builder()
      .loadBalancerId(store.get("created-lb"))
      .poolId(store.get("created-lbpool"))
      .id(store.get("created-lbpoolmember"))
      .build();


      Response<Void> response = service.deleteLoadBalancerPoolMember(deleteLoadBalancerPoolMemberOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);


    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testDeleteLoadBalancerPool() throws Exception {
    try {
      DeleteLoadBalancerPoolOptions deleteLoadBalancerPoolOptions = new DeleteLoadBalancerPoolOptions.Builder()
      .loadBalancerId(store.get("created-lb"))
      .id(store.get("created-lbpool"))
      .build();


      Response<Void> response = service.deleteLoadBalancerPool(deleteLoadBalancerPoolOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);


    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testDeleteLoadBalancerListenerPolicyRule() throws Exception {
    try {
      DeleteLoadBalancerListenerPolicyRuleOptions deleteLoadBalancerListenerPolicyRuleOptions = new DeleteLoadBalancerListenerPolicyRuleOptions.Builder()
      .loadBalancerId(store.get("created-lb"))
      .listenerId(store.get("created-listener"))
      .policyId(store.get("created-lbpolicy"))
      .id(store.get("created-lbpolicyrule"))
      .build();


      Response<Void> response = service.deleteLoadBalancerListenerPolicyRule(deleteLoadBalancerListenerPolicyRuleOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);


    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testDeleteLoadBalancerListenerPolicy() throws Exception {
    try {
      DeleteLoadBalancerListenerPolicyOptions deleteLoadBalancerListenerPolicyOptions = new DeleteLoadBalancerListenerPolicyOptions.Builder()
      .loadBalancerId(store.get("created-lb"))
      .listenerId(store.get("created-listener"))
      .id(store.get("created-lbpolicy"))
      .build();


      Response<Void> response = service.deleteLoadBalancerListenerPolicy(deleteLoadBalancerListenerPolicyOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);


    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testDeleteLoadBalancerListener() throws Exception {
    try {
      DeleteLoadBalancerListenerOptions deleteLoadBalancerListenerOptions = new DeleteLoadBalancerListenerOptions.Builder()
      .loadBalancerId(store.get("created-lb"))
      .id(store.get("created-listener"))
      .build();


      Response<Void> response = service.deleteLoadBalancerListener(deleteLoadBalancerListenerOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);


    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testDeleteLoadBalancer() throws Exception {
    try {
      DeleteLoadBalancerOptions deleteLoadBalancerOptions = new DeleteLoadBalancerOptions.Builder()
      .id(store.get("created-lb"))
      .build();


      Response<Void> response = service.deleteLoadBalancer(deleteLoadBalancerOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);


    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testDeleteKey() throws Exception {
    try {
      DeleteKeyOptions deleteKeyOptions = new DeleteKeyOptions.Builder()
      .id(store.get("created-key"))
      .build();


      Response<Void> response = service.deleteKey(deleteKeyOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);


    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testDeleteIpsecPolicy() throws Exception {
    try {
      DeleteIpsecPolicyOptions deleteIpsecPolicyOptions = new DeleteIpsecPolicyOptions.Builder()
      .id(store.get("created-ipsec"))
      .build();


      Response<Void> response = service.deleteIpsecPolicy(deleteIpsecPolicyOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);


    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void testDeleteInstanceVolumeAttachment() throws Exception {
    try {
      DeleteInstanceVolumeAttachmentOptions deleteInstanceVolumeAttachmentOptions = new DeleteInstanceVolumeAttachmentOptions.Builder()
      .instanceId(store.get("created-instance"))
      .id(store.get("created-data-vol"))
      .build();


      Response<Void> response = service.deleteInstanceVolumeAttachment(deleteInstanceVolumeAttachmentOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);


    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testDeleteInstanceNetworkInterface() throws Exception {
    try {
      DeleteInstanceNetworkInterfaceOptions deleteInstanceNetworkInterfaceOptions = new DeleteInstanceNetworkInterfaceOptions.Builder()
      .instanceId(store.get("created-instance"))
      .id(store.get("third-nic"))
      .build();


      Response<Void> response = service.deleteInstanceNetworkInterface(deleteInstanceNetworkInterfaceOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);


    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testDeleteInstance() throws Exception {
    try {
      DeleteInstanceOptions deleteInstanceOptions = new DeleteInstanceOptions.Builder()
      .id(store.get("created-instance"))
      .build();


      Response<Void> response = service.deleteInstance(deleteInstanceOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testDeleteImage() throws Exception {
    try {
      DeleteImageOptions deleteImageOptions = new DeleteImageOptions.Builder()
      .id(store.get("created-image"))
      .build();


      Response<Void> response = service.deleteImage(deleteImageOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);


    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testDeleteIkePolicy() throws Exception {
    try {
      DeleteIkePolicyOptions deleteIkePolicyOptions = new DeleteIkePolicyOptions.Builder()
      .id(store.get("created-ike"))
      .build();


      Response<Void> response = service.deleteIkePolicy(deleteIkePolicyOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);


    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  public void testDeleteFlowLogCollector() throws Exception {
    try {
      DeleteFlowLogCollectorOptions deleteFlowLogCollectorOptions = new DeleteFlowLogCollectorOptions.Builder()
      .id(store.get("created-flow-log"))
      .build();


      Response<Void> response = service.deleteFlowLogCollector(deleteFlowLogCollectorOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  public void deleteFloatingIp() throws Exception {
    try {
      DeleteFloatingIpOptions deleteFloatingIpOptions = new DeleteFloatingIpOptions.Builder()
      .id(store.get("created-floating-ip"))
      .build();


      Response<Void> response = service.deleteFloatingIp(deleteFloatingIpOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @AfterClass
  public void tearDown() throws Exception {
    // Add any clean up logic here

    testDeleteInstanceNetworkInterface();
    deleteFloatingIp();
    testDeletePublicGateway();
    testDeleteSecurityGroup();
    testDeleteVolume();
    testDeleteSubnet();
    testDeleteNetworkAclRule();
    testDeleteNetworkAcl();
    testDeleteInstance();
    testDeleteVpc();
    testDeleteKey();

    System.out.println("Clean up complete.");
  }

 }
