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

import com.ibm.cloud.is.vpc.v1.Vpc;
import com.ibm.cloud.is.vpc.v1.model.AddInstanceNetworkInterfaceFloatingIpOptions;
import com.ibm.cloud.is.vpc.v1.model.AddSecurityGroupNetworkInterfaceOptions;
import com.ibm.cloud.is.vpc.v1.model.AddVpnGatewayConnectionLocalCidrOptions;
import com.ibm.cloud.is.vpc.v1.model.AddVpnGatewayConnectionPeerCidrOptions;
import com.ibm.cloud.is.vpc.v1.model.AddressPrefix;
import com.ibm.cloud.is.vpc.v1.model.AddressPrefixCollection;
import com.ibm.cloud.is.vpc.v1.model.AddressPrefixCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.AddressPrefixCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.CertificateInstanceIdentity;
import com.ibm.cloud.is.vpc.v1.model.CertificateInstanceIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.CertificateInstanceReference;
import com.ibm.cloud.is.vpc.v1.model.CheckVpnGatewayConnectionLocalCidrOptions;
import com.ibm.cloud.is.vpc.v1.model.CheckVpnGatewayConnectionPeerCidrOptions;
import com.ibm.cloud.is.vpc.v1.model.CloudObjectStorageBucketIdentity;
import com.ibm.cloud.is.vpc.v1.model.CloudObjectStorageBucketIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.CloudObjectStorageBucketReference;
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
import com.ibm.cloud.is.vpc.v1.model.EncryptionKeyIdentity;
import com.ibm.cloud.is.vpc.v1.model.EncryptionKeyIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.EncryptionKeyReference;
import com.ibm.cloud.is.vpc.v1.model.FloatingIP;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPByTargetTarget;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPByTargetTargetNetworkInterfaceIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPByTargetTargetNetworkInterfaceIdentityById;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPCollection;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPPatchTargetNetworkInterfaceIdentity;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPPatchTargetNetworkInterfaceIdentityNetworkInterfaceIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPPatchTargetNetworkInterfaceIdentityNetworkInterfaceIdentityById;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPPrototype;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPPrototypeFloatingIPByTarget;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPPrototypeFloatingIPByZone;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPReference;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPTarget;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPTargetNetworkInterfaceReference;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPTargetPublicGatewayReference;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPUnpaginatedCollection;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollector;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorCollection;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorPrototypeTarget;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorPrototypeTargetInstanceIdentity;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorPrototypeTargetInstanceIdentityInstanceIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorPrototypeTargetInstanceIdentityInstanceIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorPrototypeTargetInstanceIdentityInstanceIdentityById;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorPrototypeTargetNetworkInterfaceIdentity;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorPrototypeTargetNetworkInterfaceIdentityNetworkInterfaceIdentityNetworkInterfaceIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorPrototypeTargetNetworkInterfaceIdentityNetworkInterfaceIdentityNetworkInterfaceIdentityById;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorPrototypeTargetSubnetIdentity;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorPrototypeTargetSubnetIdentitySubnetIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorPrototypeTargetSubnetIdentitySubnetIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorPrototypeTargetSubnetIdentitySubnetIdentityById;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorPrototypeTargetVPCIdentity;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorPrototypeTargetVPCIdentityVPCIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorPrototypeTargetVPCIdentityVPCIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorPrototypeTargetVPCIdentityVPCIdentityById;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTarget;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetInstanceReference;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetNetworkInterfaceReferenceTargetContext;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetSubnetReference;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetVPCReference;
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
import com.ibm.cloud.is.vpc.v1.model.IKEPolicyCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.IKEPolicyCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.IKEPolicyIdentity;
import com.ibm.cloud.is.vpc.v1.model.IKEPolicyIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.IKEPolicyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.IKEPolicyReference;
import com.ibm.cloud.is.vpc.v1.model.IP;
import com.ibm.cloud.is.vpc.v1.model.IPsecPolicy;
import com.ibm.cloud.is.vpc.v1.model.IPsecPolicyCollection;
import com.ibm.cloud.is.vpc.v1.model.IPsecPolicyCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.IPsecPolicyCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.IPsecPolicyIdentity;
import com.ibm.cloud.is.vpc.v1.model.IPsecPolicyIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.IPsecPolicyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.IPsecPolicyReference;
import com.ibm.cloud.is.vpc.v1.model.Image;
import com.ibm.cloud.is.vpc.v1.model.ImageCollection;
import com.ibm.cloud.is.vpc.v1.model.ImageCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.ImageCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.ImageFile;
import com.ibm.cloud.is.vpc.v1.model.ImageFilePrototype;
import com.ibm.cloud.is.vpc.v1.model.ImageIdentity;
import com.ibm.cloud.is.vpc.v1.model.ImageIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.ImageIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.ImageIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ImagePrototype;
import com.ibm.cloud.is.vpc.v1.model.ImagePrototypeImageByFile;
import com.ibm.cloud.is.vpc.v1.model.ImageReference;
import com.ibm.cloud.is.vpc.v1.model.Instance;
import com.ibm.cloud.is.vpc.v1.model.InstanceAction;
import com.ibm.cloud.is.vpc.v1.model.InstanceCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.InstanceCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.InstanceGPU;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroup;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManager;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPolicy;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPolicyCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPolicyCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPolicyCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPolicyInstanceGroupManagerTargetPolicy;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPolicyPrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPolicyReference;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerReference;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupMembership;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupMembershipCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupMembershipCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupMembershipCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupReference;
import com.ibm.cloud.is.vpc.v1.model.InstanceInitialization;
import com.ibm.cloud.is.vpc.v1.model.InstanceInitializationPassword;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfile;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileBandwidth;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileBandwidthDependent;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileBandwidthEnum;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileBandwidthFixed;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileBandwidthRange;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileCollection;
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
import com.ibm.cloud.is.vpc.v1.model.InstancePrototype;
import com.ibm.cloud.is.vpc.v1.model.InstancePrototypeInstanceByImage;
import com.ibm.cloud.is.vpc.v1.model.InstancePrototypeInstanceBySourceTemplate;
import com.ibm.cloud.is.vpc.v1.model.InstanceReference;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplate;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateIdentity;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateIdentityById;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateInstanceByImage;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateInstanceBySourceTemplate;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplatePrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplatePrototypeInstanceByImage;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplatePrototypeInstanceBySourceTemplate;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateReference;
import com.ibm.cloud.is.vpc.v1.model.InstanceVCPU;
import com.ibm.cloud.is.vpc.v1.model.Key;
import com.ibm.cloud.is.vpc.v1.model.KeyCollection;
import com.ibm.cloud.is.vpc.v1.model.KeyIdentity;
import com.ibm.cloud.is.vpc.v1.model.KeyIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.KeyIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.KeyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.KeyIdentityKeyIdentityByFingerprint;
import com.ibm.cloud.is.vpc.v1.model.KeyReferenceInstanceInitializationContext;
import com.ibm.cloud.is.vpc.v1.model.KeyReferenceInstanceInitializationContextKeyIdentityByFingerprint;
import com.ibm.cloud.is.vpc.v1.model.KeyReferenceInstanceInitializationContextKeyReference;
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
import com.ibm.cloud.is.vpc.v1.model.ListOperatingSystemsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListPublicGatewaysOptions;
import com.ibm.cloud.is.vpc.v1.model.ListRegionZonesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListRegionsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListSecurityGroupNetworkInterfacesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListSecurityGroupRulesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListSecurityGroupsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListSubnetsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVolumeProfilesOptions;
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
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerIdentity;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerIdentityById;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListener;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerCollection;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicy;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyCollection;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyPatchTarget;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyPatchTargetLoadBalancerListenerPolicyRedirectURLPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyPatchTargetLoadBalancerPoolIdentity;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyPatchTargetLoadBalancerPoolIdentityLoadBalancerPoolIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyPatchTargetLoadBalancerPoolIdentityLoadBalancerPoolIdentityById;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyPrototypeTarget;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyPrototypeTargetLoadBalancerListenerPolicyRedirectURLPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyPrototypeTargetLoadBalancerPoolIdentity;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyPrototypeTargetLoadBalancerPoolIdentityLoadBalancerPoolIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyPrototypeTargetLoadBalancerPoolIdentityLoadBalancerPoolIdentityById;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyReference;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyRule;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyRuleCollection;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyRulePrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyRuleReference;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetReference;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetReferenceLoadBalancerListenerPolicyRedirectURL;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetReferenceLoadBalancerPoolReference;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPrototypeLoadBalancerContext;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerReference;
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
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberReference;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTarget;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTargetIP;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTargetInstanceReference;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTargetPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTargetPrototypeIP;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTargetPrototypeInstanceIdentity;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolReference;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolSessionPersistence;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolSessionPersistencePatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolSessionPersistencePrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfile;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileCollection;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileIdentity;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileReference;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerStatistics;
import com.ibm.cloud.is.vpc.v1.model.NetworkACL;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLCollection;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLIdentity;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLIdentityById;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLPrototype;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLPrototypeNetworkACLByRules;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLPrototypeNetworkACLBySourceNetworkACL;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLReference;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRule;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleCollection;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleIdentity;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleIdentityById;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleItem;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleItemNetworkACLRuleProtocolAll;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleItemNetworkACLRuleProtocolICMP;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleItemNetworkACLRuleProtocolTCPUDP;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleNetworkACLRuleProtocolAll;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleNetworkACLRuleProtocolICMP;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleNetworkACLRuleProtocolTCPUDP;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePrototype;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePrototypeNetworkACLContext;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAll;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMP;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDP;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePrototypeNetworkACLRuleProtocolAll;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePrototypeNetworkACLRuleProtocolICMP;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePrototypeNetworkACLRuleProtocolTCPUDP;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleReference;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterface;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceCollection;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceInstanceContextReference;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfacePrototype;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceReference;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceUnpaginatedCollection;
import com.ibm.cloud.is.vpc.v1.model.OperatingSystem;
import com.ibm.cloud.is.vpc.v1.model.OperatingSystemCollection;
import com.ibm.cloud.is.vpc.v1.model.OperatingSystemCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.OperatingSystemCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.OperatingSystemIdentity;
import com.ibm.cloud.is.vpc.v1.model.OperatingSystemIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.OperatingSystemIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.PublicGateway;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayCollection;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayFloatingIp;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayIdentity;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayIdentityById;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayPrototypeFloatingIp;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayPrototypeFloatingIpFloatingIPIdentity;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayPrototypeFloatingIpFloatingIPIdentityFloatingIPIdentityByAddress;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayPrototypeFloatingIpFloatingIPIdentityFloatingIPIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayPrototypeFloatingIpFloatingIPIdentityFloatingIPIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayPrototypeFloatingIpFloatingIPIdentityFloatingIPIdentityById;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayPrototypeFloatingIpFloatingIPPrototypeTargetContext;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayReference;
import com.ibm.cloud.is.vpc.v1.model.Region;
import com.ibm.cloud.is.vpc.v1.model.RegionCollection;
import com.ibm.cloud.is.vpc.v1.model.RegionReference;
import com.ibm.cloud.is.vpc.v1.model.RemoveInstanceNetworkInterfaceFloatingIpOptions;
import com.ibm.cloud.is.vpc.v1.model.RemoveSecurityGroupNetworkInterfaceOptions;
import com.ibm.cloud.is.vpc.v1.model.RemoveVpnGatewayConnectionLocalCidrOptions;
import com.ibm.cloud.is.vpc.v1.model.RemoveVpnGatewayConnectionPeerCidrOptions;
import com.ibm.cloud.is.vpc.v1.model.ReplaceLoadBalancerPoolMembersOptions;
import com.ibm.cloud.is.vpc.v1.model.ReplaceSubnetNetworkAclOptions;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentity;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupReference;
import com.ibm.cloud.is.vpc.v1.model.Route;
import com.ibm.cloud.is.vpc.v1.model.RouteCollection;
import com.ibm.cloud.is.vpc.v1.model.RouteNextHop;
import com.ibm.cloud.is.vpc.v1.model.RouteNextHopIP;
import com.ibm.cloud.is.vpc.v1.model.RouteNextHopPrototype;
import com.ibm.cloud.is.vpc.v1.model.RouteNextHopPrototypeRouteNextHopIP;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroup;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupCollection;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupIdentity;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupReference;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRule;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleCollection;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRulePatchRemote;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRulePatchRemoteCIDR;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRulePatchRemoteIP;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRulePatchRemoteSecurityGroupIdentity;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRulePatchRemoteSecurityGroupIdentitySecurityGroupIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRulePatchRemoteSecurityGroupIdentitySecurityGroupIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRulePatchRemoteSecurityGroupIdentitySecurityGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRulePrototype;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRulePrototypeRemote;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRulePrototypeRemoteCIDR;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRulePrototypeRemoteIP;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRulePrototypeRemoteSecurityGroupIdentity;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRulePrototypeRemoteSecurityGroupIdentitySecurityGroupIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRulePrototypeRemoteSecurityGroupIdentitySecurityGroupIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRulePrototypeRemoteSecurityGroupIdentitySecurityGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRulePrototypeSecurityGroupRuleProtocolAll;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRulePrototypeSecurityGroupRuleProtocolTCPUDP;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleRemote;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleRemoteCIDR;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleRemoteIP;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleRemoteSecurityGroupReference;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleSecurityGroupRuleProtocolAll;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleSecurityGroupRuleProtocolICMP;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleSecurityGroupRuleProtocolTCPUDP;
import com.ibm.cloud.is.vpc.v1.model.SetSubnetPublicGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.Subnet;
import com.ibm.cloud.is.vpc.v1.model.SubnetCollection;
import com.ibm.cloud.is.vpc.v1.model.SubnetCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.SubnetCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.SubnetIdentity;
import com.ibm.cloud.is.vpc.v1.model.SubnetIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.SubnetIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.SubnetIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SubnetPrototype;
import com.ibm.cloud.is.vpc.v1.model.SubnetPrototypeSubnetByCIDR;
import com.ibm.cloud.is.vpc.v1.model.SubnetPrototypeSubnetByTotalCount;
import com.ibm.cloud.is.vpc.v1.model.SubnetReference;
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
import com.ibm.cloud.is.vpc.v1.model.VPCCSESourceIP;
import com.ibm.cloud.is.vpc.v1.model.VPCCollection;
import com.ibm.cloud.is.vpc.v1.model.VPCCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.VPCCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.VPCIdentity;
import com.ibm.cloud.is.vpc.v1.model.VPCIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.VPCIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.VPCIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VPCReference;
import com.ibm.cloud.is.vpc.v1.model.VPNGateway;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayCollection;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnection;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionCollection;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionDPD;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionDPDPrototype;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionLocalCIDRs;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPeerCIDRs;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionReference;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayPublicIp;
import com.ibm.cloud.is.vpc.v1.model.Volume;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachment;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentCollection;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentDevice;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeInstanceByImageContext;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeInstanceContext;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeInstanceContextVolume;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeInstanceContextVolumeVolumeIdentity;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeInstanceContextVolumeVolumeIdentityVolumeIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeInstanceContextVolumeVolumeIdentityVolumeIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeInstanceContextVolumeVolumeIdentityVolumeIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeInstanceContextVolumeVolumePrototypeInstanceContext;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeInstanceContextVolumeVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeByCapacity;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentReferenceInstanceContext;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentReferenceVolumeContext;
import com.ibm.cloud.is.vpc.v1.model.VolumeCollection;
import com.ibm.cloud.is.vpc.v1.model.VolumeCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.VolumeCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.VolumeIdentity;
import com.ibm.cloud.is.vpc.v1.model.VolumeIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.VolumeIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.VolumeIdentityById;
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
import com.ibm.cloud.is.vpc.v1.model.VolumePrototypeVolumeByCapacity;
import com.ibm.cloud.is.vpc.v1.model.VolumeReference;
import com.ibm.cloud.is.vpc.v1.model.Zone;
import com.ibm.cloud.is.vpc.v1.model.ZoneCollection;
import com.ibm.cloud.is.vpc.v1.model.ZoneIdentity;
import com.ibm.cloud.is.vpc.v1.model.ZoneIdentityByHref;
import com.ibm.cloud.is.vpc.v1.model.ZoneIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.ZoneReference;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;

import com.ibm.cloud.sdk.core.util.EnvironmentUtils;

import java.io.IOException;
import java.io.InputStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;

import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.testng.PowerMockTestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Vpc service.
 */
@PrepareForTest({ EnvironmentUtils.class })
@PowerMockIgnore({"javax.net.ssl.*", "org.mockito.*"})
public class VpcTest extends PowerMockTestCase {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected Vpc vpcService;

  // Creates a mock set of environment variables that are returned by EnvironmentUtils.getenv().
  private Map<String, String> getTestProcessEnvironment() {
    Map<String, String> env = new HashMap<>();
    env.put("TESTSERVICE_AUTH_TYPE", "noAuth");
    return env;
  }

  public void constructClientService() throws Throwable {
    PowerMockito.spy(EnvironmentUtils.class);
    PowerMockito.when(EnvironmentUtils.getenv()).thenReturn(getTestProcessEnvironment());
    final String serviceName = "testService";
    // set mock values for global params
    String version = "testString";

    vpcService = Vpc.newInstance(version, serviceName);
    String url = server.url("/").toString();
    vpcService.setServiceUrl(url);
  }

  /**
  * Negative Test - construct the service with a null authenticator.
  */
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    // set mock values for global params
    String version = "testString";

    new Vpc(version, serviceName, null);
  }


  @Test
  public void testGetVersion() throws Throwable {
    constructClientService();
    assertEquals(vpcService.getVersion(), "testString");
  }

  @Test
  public void testListVpcsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"first\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs?limit=20\"}, \"limit\": 20, \"next\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs?start=9d5a91a3e2cbd233b5a5b33436855ed1&limit=20\"}, \"total_count\": 132, \"vpcs\": [{\"id\": \"4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"name\": \"my-vpc\", \"default_network_acl\": {\"id\": \"a4e28308-8ee7-46ab-8108-9f881f22bdbf\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::network-acl:a4e28308-8ee7-46ab-8108-9f881f22bdbf\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/network_acls/a4e28308-8ee7-46ab-8108-9f881f22bdbf\", \"name\": \"my-network-acl\"}, \"classic_access\": false, \"default_security_group\": {\"id\": \"be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::security-group:be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/security_groups/be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"name\": \"my-security-group\"}, \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"created_at\": \"2019-01-01T12:00:00\", \"cse_source_ips\": [{\"ip\": {\"address\": \"192.168.3.4\"}, \"zone\": {\"name\": \"us-south-1\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/regions/us-south/zones/us-south-1\"}}], \"status\": \"available\"}]}";
    String listVpcsPath = java.net.URLEncoder.encode("/vpcs", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListVpcsOptions model
    ListVpcsOptions listVpcsOptionsModel = new ListVpcsOptions.Builder()
    .start("testString")
    .limit(Long.valueOf("1"))
    .resourceGroupId("testString")
    .classicAccess(true)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<VPCCollection> response = vpcService.listVpcs(listVpcsOptionsModel).execute();
    assertNotNull(response);
    VPCCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    assertEquals(query.get("start"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(query.get("resource_group.id"), "testString");
    assertEquals(Boolean.valueOf(query.get("classic_access")), Boolean.valueOf(true));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listVpcsPath);
  }

  @Test
  public void testCreateVpcWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"name\": \"my-vpc\", \"default_network_acl\": {\"id\": \"a4e28308-8ee7-46ab-8108-9f881f22bdbf\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::network-acl:a4e28308-8ee7-46ab-8108-9f881f22bdbf\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/network_acls/a4e28308-8ee7-46ab-8108-9f881f22bdbf\", \"name\": \"my-network-acl\"}, \"classic_access\": false, \"default_security_group\": {\"id\": \"be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::security-group:be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/security_groups/be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"name\": \"my-security-group\"}, \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"created_at\": \"2019-01-01T12:00:00\", \"cse_source_ips\": [{\"ip\": {\"address\": \"192.168.3.4\"}, \"zone\": {\"name\": \"us-south-1\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/regions/us-south/zones/us-south-1\"}}], \"status\": \"available\"}";
    String createVpcPath = java.net.URLEncoder.encode("/vpcs", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ResourceGroupIdentityById model
    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
    .id("fee82deba12e4c0fb69c3b09d1f12345")
    .build();

    // Construct an instance of the CreateVpcOptions model
    CreateVpcOptions createVpcOptionsModel = new CreateVpcOptions.Builder()
    .name("my-vpc")
    .addressPrefixManagement("manual")
    .classicAccess(false)
    .resourceGroup(resourceGroupIdentityModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<VPC> response = vpcService.createVpc(createVpcOptionsModel).execute();
    assertNotNull(response);
    VPC responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createVpcPath);
  }

  @Test
  public void testDeleteVpcWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteVpcPath = java.net.URLEncoder.encode("/vpcs/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteVpcOptions model
    DeleteVpcOptions deleteVpcOptionsModel = new DeleteVpcOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = vpcService.deleteVpc(deleteVpcOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteVpcPath);
  }

  // Test the deleteVpc operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteVpcNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.deleteVpc(null).execute();
  }

  @Test
  public void testGetVpcWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"name\": \"my-vpc\", \"default_network_acl\": {\"id\": \"a4e28308-8ee7-46ab-8108-9f881f22bdbf\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::network-acl:a4e28308-8ee7-46ab-8108-9f881f22bdbf\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/network_acls/a4e28308-8ee7-46ab-8108-9f881f22bdbf\", \"name\": \"my-network-acl\"}, \"classic_access\": false, \"default_security_group\": {\"id\": \"be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::security-group:be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/security_groups/be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"name\": \"my-security-group\"}, \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"created_at\": \"2019-01-01T12:00:00\", \"cse_source_ips\": [{\"ip\": {\"address\": \"192.168.3.4\"}, \"zone\": {\"name\": \"us-south-1\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/regions/us-south/zones/us-south-1\"}}], \"status\": \"available\"}";
    String getVpcPath = java.net.URLEncoder.encode("/vpcs/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetVpcOptions model
    GetVpcOptions getVpcOptionsModel = new GetVpcOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<VPC> response = vpcService.getVpc(getVpcOptionsModel).execute();
    assertNotNull(response);
    VPC responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getVpcPath);
  }

  // Test the getVpc operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetVpcNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.getVpc(null).execute();
  }

  @Test
  public void testUpdateVpcWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"name\": \"my-vpc\", \"default_network_acl\": {\"id\": \"a4e28308-8ee7-46ab-8108-9f881f22bdbf\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::network-acl:a4e28308-8ee7-46ab-8108-9f881f22bdbf\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/network_acls/a4e28308-8ee7-46ab-8108-9f881f22bdbf\", \"name\": \"my-network-acl\"}, \"classic_access\": false, \"default_security_group\": {\"id\": \"be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::security-group:be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/security_groups/be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"name\": \"my-security-group\"}, \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"created_at\": \"2019-01-01T12:00:00\", \"cse_source_ips\": [{\"ip\": {\"address\": \"192.168.3.4\"}, \"zone\": {\"name\": \"us-south-1\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/regions/us-south/zones/us-south-1\"}}], \"status\": \"available\"}";
    String updateVpcPath = java.net.URLEncoder.encode("/vpcs/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateVpcOptions model
    UpdateVpcOptions updateVpcOptionsModel = new UpdateVpcOptions.Builder()
    .id("testString")
    .name("my-vpc")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<VPC> response = vpcService.updateVpc(updateVpcOptionsModel).execute();
    assertNotNull(response);
    VPC responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateVpcPath);
  }

  // Test the updateVpc operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateVpcNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.updateVpc(null).execute();
  }

  @Test
  public void testGetVpcDefaultNetworkAclWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"a4e28308-8ee7-46ab-8108-9f881f22bdbf\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::network-acl:a4e28308-8ee7-46ab-8108-9f881f22bdbf\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/network_acls/a4e28308-8ee7-46ab-8108-9f881f22bdbf\", \"name\": \"mnemonic-ersatz-eatery-malaise\", \"vpc\": {\"id\": \"4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"name\": \"my-vpc\"}, \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"created_at\": \"2019-01-01T12:00:00\", \"rules\": [{\"id\": \"8daca77a-4980-4d33-8f3e-7038797be8f9\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/network_acls/a4e28308-8ee7-46ab-8108-9f881f22bdbf/rules/8daca77a-4980-4d33-8f3e-7038797be8f9\", \"name\": \"my-rule-2\", \"action\": \"allow\", \"destination\": \"192.168.3.0/24\", \"direction\": \"inbound\", \"source\": \"192.168.3.0/24\", \"protocol\": \"udp\", \"before\": {\"id\": \"8daca77a-4980-4d33-8f3e-7038797be8f9\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/network_acls/a4e28308-8ee7-46ab-8108-9f881f22bdbf/rules/8daca77a-4980-4d33-8f3e-7038797be8f9\", \"name\": \"my-rule-1\"}, \"created_at\": \"2019-01-01T12:00:00\", \"ip_version\": \"ipv4\", \"destination_port_max\": 22, \"destination_port_min\": 22, \"source_port_max\": 65535, \"source_port_min\": 49152}], \"subnets\": [{\"id\": \"7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::subnet:7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/subnets/7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"name\": \"my-subnet\"}]}";
    String getVpcDefaultNetworkAclPath = java.net.URLEncoder.encode("/vpcs/testString/default_network_acl", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetVpcDefaultNetworkAclOptions model
    GetVpcDefaultNetworkAclOptions getVpcDefaultNetworkAclOptionsModel = new GetVpcDefaultNetworkAclOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DefaultNetworkACL> response = vpcService.getVpcDefaultNetworkAcl(getVpcDefaultNetworkAclOptionsModel).execute();
    assertNotNull(response);
    DefaultNetworkACL responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getVpcDefaultNetworkAclPath);
  }

  // Test the getVpcDefaultNetworkAcl operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetVpcDefaultNetworkAclNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.getVpcDefaultNetworkAcl(null).execute();
  }

  @Test
  public void testGetVpcDefaultSecurityGroupWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::security-group:be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/security_groups/be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"name\": \"observant-chip-emphatic-engraver\", \"rules\": [{\"id\": \"6f2a6efe-21e2-401c-b237-620aa26ba16a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/security_groups/be5df5ca-12a0-494b-907e-aa6ec2bfa271/rules/6f2a6efe-21e2-401c-b237-620aa26ba16a\", \"direction\": \"inbound\", \"ip_version\": \"ipv4\", \"protocol\": \"udp\", \"remote\": {\"address\": \"192.168.3.4\"}, \"port_max\": 22, \"port_min\": 22}], \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"created_at\": \"2019-01-01T12:00:00\", \"vpc\": {\"id\": \"4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"name\": \"my-vpc\"}}";
    String getVpcDefaultSecurityGroupPath = java.net.URLEncoder.encode("/vpcs/testString/default_security_group", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetVpcDefaultSecurityGroupOptions model
    GetVpcDefaultSecurityGroupOptions getVpcDefaultSecurityGroupOptionsModel = new GetVpcDefaultSecurityGroupOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DefaultSecurityGroup> response = vpcService.getVpcDefaultSecurityGroup(getVpcDefaultSecurityGroupOptionsModel).execute();
    assertNotNull(response);
    DefaultSecurityGroup responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getVpcDefaultSecurityGroupPath);
  }

  // Test the getVpcDefaultSecurityGroup operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetVpcDefaultSecurityGroupNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.getVpcDefaultSecurityGroup(null).execute();
  }

  @Test
  public void testListVpcAddressPrefixesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"first\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/a4e28308-8ee7-46ab-8108-9f881f22bdbf/address_prefixes?limit=20\"}, \"limit\": 20, \"next\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/a4e28308-8ee7-46ab-8108-9f881f22bdbf/address_prefixes?start=9d5a91a3e2cbd233b5a5b33436855ed1&limit=20\"}, \"total_count\": 132, \"address_prefixes\": [{\"id\": \"1a15dca5-7e33-45e1-b7c5-bc690e569531\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/8e454ead-0db7-48ac-9a8b-2698d8c470a7/address_prefixes/1a15dca5-7e33-45e1-b7c5-bc690e569531\", \"name\": \"my-address-prefix-2\", \"is_default\": false, \"cidr\": \"192.168.3.0/24\", \"created_at\": \"2019-01-01T12:00:00\", \"has_subnets\": true, \"zone\": {\"name\": \"us-south-1\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/regions/us-south/zones/us-south-1\"}}]}";
    String listVpcAddressPrefixesPath = java.net.URLEncoder.encode("/vpcs/testString/address_prefixes", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListVpcAddressPrefixesOptions model
    ListVpcAddressPrefixesOptions listVpcAddressPrefixesOptionsModel = new ListVpcAddressPrefixesOptions.Builder()
    .vpcId("testString")
    .start("testString")
    .limit(Long.valueOf("1"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<AddressPrefixCollection> response = vpcService.listVpcAddressPrefixes(listVpcAddressPrefixesOptionsModel).execute();
    assertNotNull(response);
    AddressPrefixCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    assertEquals(query.get("start"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listVpcAddressPrefixesPath);
  }

  // Test the listVpcAddressPrefixes operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListVpcAddressPrefixesNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.listVpcAddressPrefixes(null).execute();
  }

  @Test
  public void testCreateVpcAddressPrefixWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"1a15dca5-7e33-45e1-b7c5-bc690e569531\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/8e454ead-0db7-48ac-9a8b-2698d8c470a7/address_prefixes/1a15dca5-7e33-45e1-b7c5-bc690e569531\", \"name\": \"my-address-prefix-2\", \"is_default\": false, \"cidr\": \"192.168.3.0/24\", \"created_at\": \"2019-01-01T12:00:00\", \"has_subnets\": true, \"zone\": {\"name\": \"us-south-1\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/regions/us-south/zones/us-south-1\"}}";
    String createVpcAddressPrefixPath = java.net.URLEncoder.encode("/vpcs/testString/address_prefixes", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ZoneIdentityByName model
    ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
    .name("us-south-1")
    .build();

    // Construct an instance of the CreateVpcAddressPrefixOptions model
    CreateVpcAddressPrefixOptions createVpcAddressPrefixOptionsModel = new CreateVpcAddressPrefixOptions.Builder()
    .vpcId("testString")
    .cidr("10.0.0.0/24")
    .zone(zoneIdentityModel)
    .name("my-address-prefix-2")
    .isDefault(true)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<AddressPrefix> response = vpcService.createVpcAddressPrefix(createVpcAddressPrefixOptionsModel).execute();
    assertNotNull(response);
    AddressPrefix responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createVpcAddressPrefixPath);
  }

  // Test the createVpcAddressPrefix operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateVpcAddressPrefixNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.createVpcAddressPrefix(null).execute();
  }

  @Test
  public void testDeleteVpcAddressPrefixWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteVpcAddressPrefixPath = java.net.URLEncoder.encode("/vpcs/testString/address_prefixes/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteVpcAddressPrefixOptions model
    DeleteVpcAddressPrefixOptions deleteVpcAddressPrefixOptionsModel = new DeleteVpcAddressPrefixOptions.Builder()
    .vpcId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = vpcService.deleteVpcAddressPrefix(deleteVpcAddressPrefixOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteVpcAddressPrefixPath);
  }

  // Test the deleteVpcAddressPrefix operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteVpcAddressPrefixNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.deleteVpcAddressPrefix(null).execute();
  }

  @Test
  public void testGetVpcAddressPrefixWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"1a15dca5-7e33-45e1-b7c5-bc690e569531\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/8e454ead-0db7-48ac-9a8b-2698d8c470a7/address_prefixes/1a15dca5-7e33-45e1-b7c5-bc690e569531\", \"name\": \"my-address-prefix-2\", \"is_default\": false, \"cidr\": \"192.168.3.0/24\", \"created_at\": \"2019-01-01T12:00:00\", \"has_subnets\": true, \"zone\": {\"name\": \"us-south-1\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/regions/us-south/zones/us-south-1\"}}";
    String getVpcAddressPrefixPath = java.net.URLEncoder.encode("/vpcs/testString/address_prefixes/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetVpcAddressPrefixOptions model
    GetVpcAddressPrefixOptions getVpcAddressPrefixOptionsModel = new GetVpcAddressPrefixOptions.Builder()
    .vpcId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<AddressPrefix> response = vpcService.getVpcAddressPrefix(getVpcAddressPrefixOptionsModel).execute();
    assertNotNull(response);
    AddressPrefix responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getVpcAddressPrefixPath);
  }

  // Test the getVpcAddressPrefix operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetVpcAddressPrefixNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.getVpcAddressPrefix(null).execute();
  }

  @Test
  public void testUpdateVpcAddressPrefixWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"1a15dca5-7e33-45e1-b7c5-bc690e569531\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/8e454ead-0db7-48ac-9a8b-2698d8c470a7/address_prefixes/1a15dca5-7e33-45e1-b7c5-bc690e569531\", \"name\": \"my-address-prefix-2\", \"is_default\": false, \"cidr\": \"192.168.3.0/24\", \"created_at\": \"2019-01-01T12:00:00\", \"has_subnets\": true, \"zone\": {\"name\": \"us-south-1\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/regions/us-south/zones/us-south-1\"}}";
    String updateVpcAddressPrefixPath = java.net.URLEncoder.encode("/vpcs/testString/address_prefixes/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateVpcAddressPrefixOptions model
    UpdateVpcAddressPrefixOptions updateVpcAddressPrefixOptionsModel = new UpdateVpcAddressPrefixOptions.Builder()
    .vpcId("testString")
    .id("testString")
    .name("my-address-prefix-2")
    .isDefault(false)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<AddressPrefix> response = vpcService.updateVpcAddressPrefix(updateVpcAddressPrefixOptionsModel).execute();
    assertNotNull(response);
    AddressPrefix responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateVpcAddressPrefixPath);
  }

  // Test the updateVpcAddressPrefix operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateVpcAddressPrefixNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.updateVpcAddressPrefix(null).execute();
  }

  @Test
  public void testListVpcRoutesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"routes\": [{\"next_hop\": {\"address\": \"192.168.3.4\"}, \"id\": \"1a15dca5-7e33-45e1-b7c5-bc690e569531\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/8e454ead-0db7-48ac-9a8b-2698d8c470a7/routes/1a15dca5-7e33-45e1-b7c5-bc690e569531\", \"name\": \"my-route-1\", \"created_at\": \"2019-01-01T12:00:00\", \"destination\": \"192.168.3.0/24\", \"lifecycle_state\": \"stable\", \"zone\": {\"name\": \"us-south-1\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/regions/us-south/zones/us-south-1\"}}]}";
    String listVpcRoutesPath = java.net.URLEncoder.encode("/vpcs/testString/routes", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListVpcRoutesOptions model
    ListVpcRoutesOptions listVpcRoutesOptionsModel = new ListVpcRoutesOptions.Builder()
    .vpcId("testString")
    .zoneName("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<RouteCollection> response = vpcService.listVpcRoutes(listVpcRoutesOptionsModel).execute();
    assertNotNull(response);
    RouteCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    assertEquals(query.get("zone.name"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listVpcRoutesPath);
  }

  // Test the listVpcRoutes operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListVpcRoutesNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.listVpcRoutes(null).execute();
  }

  @Test
  public void testCreateVpcRouteWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"next_hop\": {\"address\": \"192.168.3.4\"}, \"id\": \"1a15dca5-7e33-45e1-b7c5-bc690e569531\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/8e454ead-0db7-48ac-9a8b-2698d8c470a7/routes/1a15dca5-7e33-45e1-b7c5-bc690e569531\", \"name\": \"my-route-1\", \"created_at\": \"2019-01-01T12:00:00\", \"destination\": \"192.168.3.0/24\", \"lifecycle_state\": \"stable\", \"zone\": {\"name\": \"us-south-1\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/regions/us-south/zones/us-south-1\"}}";
    String createVpcRoutePath = java.net.URLEncoder.encode("/vpcs/testString/routes", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the RouteNextHopPrototypeRouteNextHopIP model
    RouteNextHopPrototypeRouteNextHopIP routeNextHopPrototypeModel = new RouteNextHopPrototypeRouteNextHopIP.Builder()
    .address("192.168.3.4")
    .build();

    // Construct an instance of the ZoneIdentityByName model
    ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
    .name("us-south-1")
    .build();

    // Construct an instance of the CreateVpcRouteOptions model
    CreateVpcRouteOptions createVpcRouteOptionsModel = new CreateVpcRouteOptions.Builder()
    .vpcId("testString")
    .nextHop(routeNextHopPrototypeModel)
    .destination("192.168.3.0/24")
    .zone(zoneIdentityModel)
    .name("my-route-2")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Route> response = vpcService.createVpcRoute(createVpcRouteOptionsModel).execute();
    assertNotNull(response);
    Route responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createVpcRoutePath);
  }

  // Test the createVpcRoute operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateVpcRouteNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.createVpcRoute(null).execute();
  }

  @Test
  public void testDeleteVpcRouteWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteVpcRoutePath = java.net.URLEncoder.encode("/vpcs/testString/routes/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteVpcRouteOptions model
    DeleteVpcRouteOptions deleteVpcRouteOptionsModel = new DeleteVpcRouteOptions.Builder()
    .vpcId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = vpcService.deleteVpcRoute(deleteVpcRouteOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteVpcRoutePath);
  }

  // Test the deleteVpcRoute operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteVpcRouteNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.deleteVpcRoute(null).execute();
  }

  @Test
  public void testGetVpcRouteWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"next_hop\": {\"address\": \"192.168.3.4\"}, \"id\": \"1a15dca5-7e33-45e1-b7c5-bc690e569531\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/8e454ead-0db7-48ac-9a8b-2698d8c470a7/routes/1a15dca5-7e33-45e1-b7c5-bc690e569531\", \"name\": \"my-route-1\", \"created_at\": \"2019-01-01T12:00:00\", \"destination\": \"192.168.3.0/24\", \"lifecycle_state\": \"stable\", \"zone\": {\"name\": \"us-south-1\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/regions/us-south/zones/us-south-1\"}}";
    String getVpcRoutePath = java.net.URLEncoder.encode("/vpcs/testString/routes/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetVpcRouteOptions model
    GetVpcRouteOptions getVpcRouteOptionsModel = new GetVpcRouteOptions.Builder()
    .vpcId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Route> response = vpcService.getVpcRoute(getVpcRouteOptionsModel).execute();
    assertNotNull(response);
    Route responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getVpcRoutePath);
  }

  // Test the getVpcRoute operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetVpcRouteNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.getVpcRoute(null).execute();
  }

  @Test
  public void testUpdateVpcRouteWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"next_hop\": {\"address\": \"192.168.3.4\"}, \"id\": \"1a15dca5-7e33-45e1-b7c5-bc690e569531\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/8e454ead-0db7-48ac-9a8b-2698d8c470a7/routes/1a15dca5-7e33-45e1-b7c5-bc690e569531\", \"name\": \"my-route-1\", \"created_at\": \"2019-01-01T12:00:00\", \"destination\": \"192.168.3.0/24\", \"lifecycle_state\": \"stable\", \"zone\": {\"name\": \"us-south-1\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/regions/us-south/zones/us-south-1\"}}";
    String updateVpcRoutePath = java.net.URLEncoder.encode("/vpcs/testString/routes/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateVpcRouteOptions model
    UpdateVpcRouteOptions updateVpcRouteOptionsModel = new UpdateVpcRouteOptions.Builder()
    .vpcId("testString")
    .id("testString")
    .name("my-route-2")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Route> response = vpcService.updateVpcRoute(updateVpcRouteOptionsModel).execute();
    assertNotNull(response);
    Route responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateVpcRoutePath);
  }

  // Test the updateVpcRoute operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateVpcRouteNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.updateVpcRoute(null).execute();
  }

  @Test
  public void testListSubnetsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"first\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/subnets?limit=20\"}, \"limit\": 20, \"next\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/subnets?start=9d5a91a3e2cbd233b5a5b33436855ed1&limit=20\"}, \"total_count\": 132, \"subnets\": [{\"id\": \"7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::subnet:7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/subnets/7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"name\": \"my-subnet\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"available_ipv4_address_count\": 15, \"network_acl\": {\"id\": \"a4e28308-8ee7-46ab-8108-9f881f22bdbf\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::network-acl:a4e28308-8ee7-46ab-8108-9f881f22bdbf\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/network_acls/a4e28308-8ee7-46ab-8108-9f881f22bdbf\", \"name\": \"my-network-acl\"}, \"total_ipv4_address_count\": 256, \"created_at\": \"2019-01-01T12:00:00\", \"ipv4_cidr_block\": \"10.0.0.0/24\", \"public_gateway\": {\"id\": \"dc5431ef-1fc6-4861-adc9-a59d077d1241\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::public-gateway:dc5431ef-1fc6-4861-adc9-a59d077d1241\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/public_gateways/dc5431ef-1fc6-4861-adc9-a59d077d1241\", \"name\": \"my-public-gateway\", \"resource_type\": \"public_gateway\"}, \"status\": \"available\", \"vpc\": {\"id\": \"4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"name\": \"my-vpc\"}, \"zone\": {\"name\": \"us-south-1\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/regions/us-south/zones/us-south-1\"}, \"ip_version\": \"ipv4\"}]}";
    String listSubnetsPath = java.net.URLEncoder.encode("/subnets", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListSubnetsOptions model
    ListSubnetsOptions listSubnetsOptionsModel = new ListSubnetsOptions.Builder()
    .start("testString")
    .limit(Long.valueOf("1"))
    .resourceGroupId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<SubnetCollection> response = vpcService.listSubnets(listSubnetsOptionsModel).execute();
    assertNotNull(response);
    SubnetCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    assertEquals(query.get("start"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(query.get("resource_group.id"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listSubnetsPath);
  }

  @Test
  public void testCreateSubnetWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::subnet:7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/subnets/7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"name\": \"my-subnet\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"available_ipv4_address_count\": 15, \"network_acl\": {\"id\": \"a4e28308-8ee7-46ab-8108-9f881f22bdbf\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::network-acl:a4e28308-8ee7-46ab-8108-9f881f22bdbf\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/network_acls/a4e28308-8ee7-46ab-8108-9f881f22bdbf\", \"name\": \"my-network-acl\"}, \"total_ipv4_address_count\": 256, \"created_at\": \"2019-01-01T12:00:00\", \"ipv4_cidr_block\": \"10.0.0.0/24\", \"public_gateway\": {\"id\": \"dc5431ef-1fc6-4861-adc9-a59d077d1241\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::public-gateway:dc5431ef-1fc6-4861-adc9-a59d077d1241\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/public_gateways/dc5431ef-1fc6-4861-adc9-a59d077d1241\", \"name\": \"my-public-gateway\", \"resource_type\": \"public_gateway\"}, \"status\": \"available\", \"vpc\": {\"id\": \"4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"name\": \"my-vpc\"}, \"zone\": {\"name\": \"us-south-1\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/regions/us-south/zones/us-south-1\"}, \"ip_version\": \"ipv4\"}";
    String createSubnetPath = java.net.URLEncoder.encode("/subnets", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the NetworkACLIdentityById model
    NetworkACLIdentityById networkAclIdentityModel = new NetworkACLIdentityById.Builder()
    .id("a4e28308-8ee7-46ab-8108-9f881f22bdbf")
    .build();

    // Construct an instance of the PublicGatewayIdentityById model
    PublicGatewayIdentityById publicGatewayIdentityModel = new PublicGatewayIdentityById.Builder()
    .id("dc5431ef-1fc6-4861-adc9-a59d077d1241")
    .build();

    // Construct an instance of the ResourceGroupIdentityById model
    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
    .id("fee82deba12e4c0fb69c3b09d1f12345")
    .build();

    // Construct an instance of the VPCIdentityById model
    VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
    .id("4727d842-f94f-4a2d-824a-9bc9b02c523b")
    .build();

    // Construct an instance of the ZoneIdentityByName model
    ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
    .name("us-south-1")
    .build();

    // Construct an instance of the SubnetPrototypeSubnetByTotalCount model
    SubnetPrototypeSubnetByTotalCount subnetPrototypeModel = new SubnetPrototypeSubnetByTotalCount.Builder()
    .name("my-subnet")
    .networkAcl(networkAclIdentityModel)
    .publicGateway(publicGatewayIdentityModel)
    .ipVersion("ipv4")
    .resourceGroup(resourceGroupIdentityModel)
    .vpc(vpcIdentityModel)
    .totalIpv4AddressCount(Long.valueOf("256"))
    .zone(zoneIdentityModel)
    .build();

    // Construct an instance of the CreateSubnetOptions model
    CreateSubnetOptions createSubnetOptionsModel = new CreateSubnetOptions.Builder()
    .subnetPrototype(subnetPrototypeModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Subnet> response = vpcService.createSubnet(createSubnetOptionsModel).execute();
    assertNotNull(response);
    Subnet responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createSubnetPath);
  }

  // Test the createSubnet operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateSubnetNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.createSubnet(null).execute();
  }

  @Test
  public void testDeleteSubnetWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteSubnetPath = java.net.URLEncoder.encode("/subnets/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteSubnetOptions model
    DeleteSubnetOptions deleteSubnetOptionsModel = new DeleteSubnetOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = vpcService.deleteSubnet(deleteSubnetOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteSubnetPath);
  }

  // Test the deleteSubnet operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteSubnetNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.deleteSubnet(null).execute();
  }

  @Test
  public void testGetSubnetWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::subnet:7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/subnets/7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"name\": \"my-subnet\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"available_ipv4_address_count\": 15, \"network_acl\": {\"id\": \"a4e28308-8ee7-46ab-8108-9f881f22bdbf\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::network-acl:a4e28308-8ee7-46ab-8108-9f881f22bdbf\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/network_acls/a4e28308-8ee7-46ab-8108-9f881f22bdbf\", \"name\": \"my-network-acl\"}, \"total_ipv4_address_count\": 256, \"created_at\": \"2019-01-01T12:00:00\", \"ipv4_cidr_block\": \"10.0.0.0/24\", \"public_gateway\": {\"id\": \"dc5431ef-1fc6-4861-adc9-a59d077d1241\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::public-gateway:dc5431ef-1fc6-4861-adc9-a59d077d1241\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/public_gateways/dc5431ef-1fc6-4861-adc9-a59d077d1241\", \"name\": \"my-public-gateway\", \"resource_type\": \"public_gateway\"}, \"status\": \"available\", \"vpc\": {\"id\": \"4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"name\": \"my-vpc\"}, \"zone\": {\"name\": \"us-south-1\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/regions/us-south/zones/us-south-1\"}, \"ip_version\": \"ipv4\"}";
    String getSubnetPath = java.net.URLEncoder.encode("/subnets/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetSubnetOptions model
    GetSubnetOptions getSubnetOptionsModel = new GetSubnetOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Subnet> response = vpcService.getSubnet(getSubnetOptionsModel).execute();
    assertNotNull(response);
    Subnet responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSubnetPath);
  }

  // Test the getSubnet operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSubnetNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.getSubnet(null).execute();
  }

  @Test
  public void testUpdateSubnetWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::subnet:7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/subnets/7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"name\": \"my-subnet\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"available_ipv4_address_count\": 15, \"network_acl\": {\"id\": \"a4e28308-8ee7-46ab-8108-9f881f22bdbf\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::network-acl:a4e28308-8ee7-46ab-8108-9f881f22bdbf\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/network_acls/a4e28308-8ee7-46ab-8108-9f881f22bdbf\", \"name\": \"my-network-acl\"}, \"total_ipv4_address_count\": 256, \"created_at\": \"2019-01-01T12:00:00\", \"ipv4_cidr_block\": \"10.0.0.0/24\", \"public_gateway\": {\"id\": \"dc5431ef-1fc6-4861-adc9-a59d077d1241\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::public-gateway:dc5431ef-1fc6-4861-adc9-a59d077d1241\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/public_gateways/dc5431ef-1fc6-4861-adc9-a59d077d1241\", \"name\": \"my-public-gateway\", \"resource_type\": \"public_gateway\"}, \"status\": \"available\", \"vpc\": {\"id\": \"4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"name\": \"my-vpc\"}, \"zone\": {\"name\": \"us-south-1\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/regions/us-south/zones/us-south-1\"}, \"ip_version\": \"ipv4\"}";
    String updateSubnetPath = java.net.URLEncoder.encode("/subnets/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the NetworkACLIdentityById model
    NetworkACLIdentityById networkAclIdentityModel = new NetworkACLIdentityById.Builder()
    .id("a4e28308-8ee7-46ab-8108-9f881f22bdbf")
    .build();

    // Construct an instance of the PublicGatewayIdentityById model
    PublicGatewayIdentityById publicGatewayIdentityModel = new PublicGatewayIdentityById.Builder()
    .id("dc5431ef-1fc6-4861-adc9-a59d077d1241")
    .build();

    // Construct an instance of the UpdateSubnetOptions model
    UpdateSubnetOptions updateSubnetOptionsModel = new UpdateSubnetOptions.Builder()
    .id("testString")
    .name("my-subnet")
    .networkAcl(networkAclIdentityModel)
    .publicGateway(publicGatewayIdentityModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Subnet> response = vpcService.updateSubnet(updateSubnetOptionsModel).execute();
    assertNotNull(response);
    Subnet responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateSubnetPath);
  }

  // Test the updateSubnet operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateSubnetNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.updateSubnet(null).execute();
  }

  @Test
  public void testGetSubnetNetworkAclWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"a4e28308-8ee7-46ab-8108-9f881f22bdbf\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::network-acl:a4e28308-8ee7-46ab-8108-9f881f22bdbf\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/network_acls/a4e28308-8ee7-46ab-8108-9f881f22bdbf\", \"name\": \"my-network-acl\", \"vpc\": {\"id\": \"4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"name\": \"my-vpc\"}, \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"created_at\": \"2019-01-01T12:00:00\", \"rules\": [{\"id\": \"8daca77a-4980-4d33-8f3e-7038797be8f9\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/network_acls/a4e28308-8ee7-46ab-8108-9f881f22bdbf/rules/8daca77a-4980-4d33-8f3e-7038797be8f9\", \"name\": \"my-rule-2\", \"action\": \"allow\", \"destination\": \"192.168.3.0/24\", \"direction\": \"inbound\", \"source\": \"192.168.3.0/24\", \"protocol\": \"udp\", \"before\": {\"id\": \"8daca77a-4980-4d33-8f3e-7038797be8f9\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/network_acls/a4e28308-8ee7-46ab-8108-9f881f22bdbf/rules/8daca77a-4980-4d33-8f3e-7038797be8f9\", \"name\": \"my-rule-1\"}, \"created_at\": \"2019-01-01T12:00:00\", \"ip_version\": \"ipv4\", \"destination_port_max\": 22, \"destination_port_min\": 22, \"source_port_max\": 65535, \"source_port_min\": 49152}], \"subnets\": [{\"id\": \"7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::subnet:7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/subnets/7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"name\": \"my-subnet\"}]}";
    String getSubnetNetworkAclPath = java.net.URLEncoder.encode("/subnets/testString/network_acl", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetSubnetNetworkAclOptions model
    GetSubnetNetworkAclOptions getSubnetNetworkAclOptionsModel = new GetSubnetNetworkAclOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<NetworkACL> response = vpcService.getSubnetNetworkAcl(getSubnetNetworkAclOptionsModel).execute();
    assertNotNull(response);
    NetworkACL responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSubnetNetworkAclPath);
  }

  // Test the getSubnetNetworkAcl operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSubnetNetworkAclNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.getSubnetNetworkAcl(null).execute();
  }

  @Test
  public void testReplaceSubnetNetworkAclWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"a4e28308-8ee7-46ab-8108-9f881f22bdbf\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::network-acl:a4e28308-8ee7-46ab-8108-9f881f22bdbf\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/network_acls/a4e28308-8ee7-46ab-8108-9f881f22bdbf\", \"name\": \"my-network-acl\", \"vpc\": {\"id\": \"4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"name\": \"my-vpc\"}, \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"created_at\": \"2019-01-01T12:00:00\", \"rules\": [{\"id\": \"8daca77a-4980-4d33-8f3e-7038797be8f9\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/network_acls/a4e28308-8ee7-46ab-8108-9f881f22bdbf/rules/8daca77a-4980-4d33-8f3e-7038797be8f9\", \"name\": \"my-rule-2\", \"action\": \"allow\", \"destination\": \"192.168.3.0/24\", \"direction\": \"inbound\", \"source\": \"192.168.3.0/24\", \"protocol\": \"udp\", \"before\": {\"id\": \"8daca77a-4980-4d33-8f3e-7038797be8f9\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/network_acls/a4e28308-8ee7-46ab-8108-9f881f22bdbf/rules/8daca77a-4980-4d33-8f3e-7038797be8f9\", \"name\": \"my-rule-1\"}, \"created_at\": \"2019-01-01T12:00:00\", \"ip_version\": \"ipv4\", \"destination_port_max\": 22, \"destination_port_min\": 22, \"source_port_max\": 65535, \"source_port_min\": 49152}], \"subnets\": [{\"id\": \"7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::subnet:7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/subnets/7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"name\": \"my-subnet\"}]}";
    String replaceSubnetNetworkAclPath = java.net.URLEncoder.encode("/subnets/testString/network_acl", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the NetworkACLIdentityById model
    NetworkACLIdentityById networkAclIdentityModel = new NetworkACLIdentityById.Builder()
    .id("a4e28308-8ee7-46ab-8108-9f881f22bdbf")
    .build();

    // Construct an instance of the ReplaceSubnetNetworkAclOptions model
    ReplaceSubnetNetworkAclOptions replaceSubnetNetworkAclOptionsModel = new ReplaceSubnetNetworkAclOptions.Builder()
    .id("testString")
    .networkAclIdentity(networkAclIdentityModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<NetworkACL> response = vpcService.replaceSubnetNetworkAcl(replaceSubnetNetworkAclOptionsModel).execute();
    assertNotNull(response);
    NetworkACL responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceSubnetNetworkAclPath);
  }

  // Test the replaceSubnetNetworkAcl operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceSubnetNetworkAclNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.replaceSubnetNetworkAcl(null).execute();
  }

  @Test
  public void testUnsetSubnetPublicGatewayWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String unsetSubnetPublicGatewayPath = java.net.URLEncoder.encode("/subnets/testString/public_gateway", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UnsetSubnetPublicGatewayOptions model
    UnsetSubnetPublicGatewayOptions unsetSubnetPublicGatewayOptionsModel = new UnsetSubnetPublicGatewayOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = vpcService.unsetSubnetPublicGateway(unsetSubnetPublicGatewayOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, unsetSubnetPublicGatewayPath);
  }

  // Test the unsetSubnetPublicGateway operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUnsetSubnetPublicGatewayNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.unsetSubnetPublicGateway(null).execute();
  }

  @Test
  public void testGetSubnetPublicGatewayWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"dc5431ef-1fc6-4861-adc9-a59d077d1241\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::public-gateway:dc5431ef-1fc6-4861-adc9-a59d077d1241\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/public_gateways/dc5431ef-1fc6-4861-adc9-a59d077d1241\", \"name\": \"my-public-gateway\", \"resource_type\": \"public_gateway\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"created_at\": \"2019-01-01T12:00:00\", \"floating_ip\": {\"id\": \"39300233-9995-4806-89a5-3c1b6eb88689\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::floating-ip:39300233-9995-4806-89a5-3c1b6eb88689\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/floating_ips/39300233-9995-4806-89a5-3c1b6eb88689\", \"address\": \"203.0.113.1\", \"name\": \"my-floating-ip\"}, \"status\": \"available\", \"vpc\": {\"id\": \"4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"name\": \"my-vpc\"}, \"zone\": {\"name\": \"us-south-1\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/regions/us-south/zones/us-south-1\"}}";
    String getSubnetPublicGatewayPath = java.net.URLEncoder.encode("/subnets/testString/public_gateway", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetSubnetPublicGatewayOptions model
    GetSubnetPublicGatewayOptions getSubnetPublicGatewayOptionsModel = new GetSubnetPublicGatewayOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PublicGateway> response = vpcService.getSubnetPublicGateway(getSubnetPublicGatewayOptionsModel).execute();
    assertNotNull(response);
    PublicGateway responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSubnetPublicGatewayPath);
  }

  // Test the getSubnetPublicGateway operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSubnetPublicGatewayNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.getSubnetPublicGateway(null).execute();
  }

  @Test
  public void testSetSubnetPublicGatewayWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"dc5431ef-1fc6-4861-adc9-a59d077d1241\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::public-gateway:dc5431ef-1fc6-4861-adc9-a59d077d1241\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/public_gateways/dc5431ef-1fc6-4861-adc9-a59d077d1241\", \"name\": \"my-public-gateway\", \"resource_type\": \"public_gateway\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"created_at\": \"2019-01-01T12:00:00\", \"floating_ip\": {\"id\": \"39300233-9995-4806-89a5-3c1b6eb88689\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::floating-ip:39300233-9995-4806-89a5-3c1b6eb88689\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/floating_ips/39300233-9995-4806-89a5-3c1b6eb88689\", \"address\": \"203.0.113.1\", \"name\": \"my-floating-ip\"}, \"status\": \"available\", \"vpc\": {\"id\": \"4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"name\": \"my-vpc\"}, \"zone\": {\"name\": \"us-south-1\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/regions/us-south/zones/us-south-1\"}}";
    String setSubnetPublicGatewayPath = java.net.URLEncoder.encode("/subnets/testString/public_gateway", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the PublicGatewayIdentityById model
    PublicGatewayIdentityById publicGatewayIdentityModel = new PublicGatewayIdentityById.Builder()
    .id("dc5431ef-1fc6-4861-adc9-a59d077d1241")
    .build();

    // Construct an instance of the SetSubnetPublicGatewayOptions model
    SetSubnetPublicGatewayOptions setSubnetPublicGatewayOptionsModel = new SetSubnetPublicGatewayOptions.Builder()
    .id("testString")
    .publicGatewayIdentity(publicGatewayIdentityModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PublicGateway> response = vpcService.setSubnetPublicGateway(setSubnetPublicGatewayOptionsModel).execute();
    assertNotNull(response);
    PublicGateway responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, setSubnetPublicGatewayPath);
  }

  // Test the setSubnetPublicGateway operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSetSubnetPublicGatewayNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.setSubnetPublicGateway(null).execute();
  }

  @Test
  public void testListImagesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"first\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/images?limit=20\"}, \"limit\": 20, \"next\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/images?start=9d5a91a3e2cbd233b5a5b33436855ed1&limit=20\"}, \"images\": [{\"id\": \"72b27b5c-f4b0-48bb-b954-5becc7c1dcb8\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::image:72b27b5c-f4b0-48bb-b954-5becc7c1dcb8\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/images/72b27b5c-f4b0-48bb-b954-5becc7c1dcb8\", \"name\": \"my-image\", \"minimum_provisioned_size\": 22, \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"created_at\": \"2019-01-01T12:00:00\", \"file\": {\"size\": 1}, \"operating_system\": {\"name\": \"ubuntu-16-amd64\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/operating_systems/ubuntu-16-amd64\", \"architecture\": \"amd64\", \"display_name\": \"Ubuntu Server 16.04 LTS amd64\", \"family\": \"Ubuntu Server\", \"vendor\": \"Canonical\", \"version\": \"16.04 LTS\"}, \"status\": \"available\", \"visibility\": \"private\"}]}";
    String listImagesPath = java.net.URLEncoder.encode("/images", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListImagesOptions model
    ListImagesOptions listImagesOptionsModel = new ListImagesOptions.Builder()
    .start("testString")
    .limit(Long.valueOf("1"))
    .resourceGroupId("testString")
    .name("testString")
    .visibility("private")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ImageCollection> response = vpcService.listImages(listImagesOptionsModel).execute();
    assertNotNull(response);
    ImageCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    assertEquals(query.get("start"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(query.get("resource_group.id"), "testString");
    assertEquals(query.get("name"), "testString");
    assertEquals(query.get("visibility"), "private");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listImagesPath);
  }

  @Test
  public void testCreateImageWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"72b27b5c-f4b0-48bb-b954-5becc7c1dcb8\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::image:72b27b5c-f4b0-48bb-b954-5becc7c1dcb8\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/images/72b27b5c-f4b0-48bb-b954-5becc7c1dcb8\", \"name\": \"my-image\", \"minimum_provisioned_size\": 22, \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"created_at\": \"2019-01-01T12:00:00\", \"file\": {\"size\": 1}, \"operating_system\": {\"name\": \"ubuntu-16-amd64\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/operating_systems/ubuntu-16-amd64\", \"architecture\": \"amd64\", \"display_name\": \"Ubuntu Server 16.04 LTS amd64\", \"family\": \"Ubuntu Server\", \"vendor\": \"Canonical\", \"version\": \"16.04 LTS\"}, \"status\": \"available\", \"visibility\": \"private\"}";
    String createImagePath = java.net.URLEncoder.encode("/images", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ResourceGroupIdentityById model
    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
    .id("fee82deba12e4c0fb69c3b09d1f12345")
    .build();

    // Construct an instance of the ImageFilePrototype model
    ImageFilePrototype imageFilePrototypeModel = new ImageFilePrototype.Builder()
    .href("cos://us-south/custom-image-vpc-bucket/customImage-0.vhd")
    .build();

    // Construct an instance of the OperatingSystemIdentityByName model
    OperatingSystemIdentityByName operatingSystemIdentityModel = new OperatingSystemIdentityByName.Builder()
    .name("ubuntu-16-amd64")
    .build();

    // Construct an instance of the ImagePrototypeImageByFile model
    ImagePrototypeImageByFile imagePrototypeModel = new ImagePrototypeImageByFile.Builder()
    .name("my-image")
    .resourceGroup(resourceGroupIdentityModel)
    .file(imageFilePrototypeModel)
    .operatingSystem(operatingSystemIdentityModel)
    .build();

    // Construct an instance of the CreateImageOptions model
    CreateImageOptions createImageOptionsModel = new CreateImageOptions.Builder()
    .imagePrototype(imagePrototypeModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Image> response = vpcService.createImage(createImageOptionsModel).execute();
    assertNotNull(response);
    Image responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createImagePath);
  }

  // Test the createImage operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateImageNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.createImage(null).execute();
  }

  @Test
  public void testDeleteImageWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteImagePath = java.net.URLEncoder.encode("/images/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(202)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteImageOptions model
    DeleteImageOptions deleteImageOptionsModel = new DeleteImageOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = vpcService.deleteImage(deleteImageOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteImagePath);
  }

  // Test the deleteImage operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteImageNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.deleteImage(null).execute();
  }

  @Test
  public void testGetImageWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"72b27b5c-f4b0-48bb-b954-5becc7c1dcb8\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::image:72b27b5c-f4b0-48bb-b954-5becc7c1dcb8\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/images/72b27b5c-f4b0-48bb-b954-5becc7c1dcb8\", \"name\": \"my-image\", \"minimum_provisioned_size\": 22, \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"created_at\": \"2019-01-01T12:00:00\", \"file\": {\"size\": 1}, \"operating_system\": {\"name\": \"ubuntu-16-amd64\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/operating_systems/ubuntu-16-amd64\", \"architecture\": \"amd64\", \"display_name\": \"Ubuntu Server 16.04 LTS amd64\", \"family\": \"Ubuntu Server\", \"vendor\": \"Canonical\", \"version\": \"16.04 LTS\"}, \"status\": \"available\", \"visibility\": \"private\"}";
    String getImagePath = java.net.URLEncoder.encode("/images/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetImageOptions model
    GetImageOptions getImageOptionsModel = new GetImageOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Image> response = vpcService.getImage(getImageOptionsModel).execute();
    assertNotNull(response);
    Image responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getImagePath);
  }

  // Test the getImage operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetImageNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.getImage(null).execute();
  }

  @Test
  public void testUpdateImageWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"72b27b5c-f4b0-48bb-b954-5becc7c1dcb8\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::image:72b27b5c-f4b0-48bb-b954-5becc7c1dcb8\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/images/72b27b5c-f4b0-48bb-b954-5becc7c1dcb8\", \"name\": \"my-image\", \"minimum_provisioned_size\": 22, \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"created_at\": \"2019-01-01T12:00:00\", \"file\": {\"size\": 1}, \"operating_system\": {\"name\": \"ubuntu-16-amd64\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/operating_systems/ubuntu-16-amd64\", \"architecture\": \"amd64\", \"display_name\": \"Ubuntu Server 16.04 LTS amd64\", \"family\": \"Ubuntu Server\", \"vendor\": \"Canonical\", \"version\": \"16.04 LTS\"}, \"status\": \"available\", \"visibility\": \"private\"}";
    String updateImagePath = java.net.URLEncoder.encode("/images/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateImageOptions model
    UpdateImageOptions updateImageOptionsModel = new UpdateImageOptions.Builder()
    .id("testString")
    .name("my-image")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Image> response = vpcService.updateImage(updateImageOptionsModel).execute();
    assertNotNull(response);
    Image responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateImagePath);
  }

  // Test the updateImage operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateImageNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.updateImage(null).execute();
  }

  @Test
  public void testListOperatingSystemsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"first\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/operating_systems?limit=20\"}, \"limit\": 20, \"next\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/operating_systems?start=9d5a91a3e2cbd233b5a5b33436855ed1&limit=20\"}, \"operating_systems\": [{\"name\": \"ubuntu-16-amd64\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/operating_systems/ubuntu-16-amd64\", \"architecture\": \"amd64\", \"display_name\": \"Ubuntu Server 16.04 LTS amd64\", \"family\": \"Ubuntu Server\", \"vendor\": \"Canonical\", \"version\": \"16.04 LTS\"}]}";
    String listOperatingSystemsPath = java.net.URLEncoder.encode("/operating_systems", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListOperatingSystemsOptions model
    ListOperatingSystemsOptions listOperatingSystemsOptionsModel = new ListOperatingSystemsOptions.Builder()
    .start("testString")
    .limit(Long.valueOf("1"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<OperatingSystemCollection> response = vpcService.listOperatingSystems(listOperatingSystemsOptionsModel).execute();
    assertNotNull(response);
    OperatingSystemCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    assertEquals(query.get("start"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listOperatingSystemsPath);
  }

  @Test
  public void testGetOperatingSystemWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"ubuntu-16-amd64\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/operating_systems/ubuntu-16-amd64\", \"architecture\": \"amd64\", \"display_name\": \"Ubuntu Server 16.04 LTS amd64\", \"family\": \"Ubuntu Server\", \"vendor\": \"Canonical\", \"version\": \"16.04 LTS\"}";
    String getOperatingSystemPath = java.net.URLEncoder.encode("/operating_systems/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetOperatingSystemOptions model
    GetOperatingSystemOptions getOperatingSystemOptionsModel = new GetOperatingSystemOptions.Builder()
    .name("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<OperatingSystem> response = vpcService.getOperatingSystem(getOperatingSystemOptionsModel).execute();
    assertNotNull(response);
    OperatingSystem responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getOperatingSystemPath);
  }

  // Test the getOperatingSystem operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetOperatingSystemNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.getOperatingSystem(null).execute();
  }

  @Test
  public void testListKeysWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"keys\": [{\"id\": \"a6b1a881-2ce8-41a3-80fc-36316a73f803\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::key:a6b1a881-2ce8-41a3-80fc-36316a73f803\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/keys/a6b1a881-2ce8-41a3-80fc-36316a73f803\", \"fingerprint\": \"SHA256:yxavE4CIOL2NlsqcurRO3xGjkP6m/0mp8ugojH5yxlY\", \"name\": \"my-key\", \"public_key\": \"AAAAB3NzaC1yc2EAAAADAQABAAABAQDDGe50Bxa5T5NDddrrtbx2Y4/VGbiCgXqnBsYToIUKoFSHTQl5IX3PasGnneKanhcLwWz5M5MoCRvhxTp66NKzIfAz7r+FX9rxgR+ZgcM253YAqOVeIpOU408simDZKriTlN8kYsXL7P34tsWuAJf4MgZtJAQxous/2byetpdCv8ddnT4X3ltOg9w+LqSCPYfNivqH00Eh7S1Ldz7I8aw5WOp5a+sQFP/RbwfpwHp+ny7DfeIOokcuI42tJkoBn7UsLTVpCSmXr2EDRlSWe/1M/iHNRBzaT3CK0+SwZWd2AEjePxSnWKNGIEUJDlUYp7hKhiQcgT5ZAnWU121oc5En\", \"type\": \"rsa\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"created_at\": \"2019-01-01T12:00:00\", \"length\": 2048}]}";
    String listKeysPath = java.net.URLEncoder.encode("/keys", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListKeysOptions model
    ListKeysOptions listKeysOptionsModel = new ListKeysOptions.Builder()
    .resourceGroupId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<KeyCollection> response = vpcService.listKeys(listKeysOptionsModel).execute();
    assertNotNull(response);
    KeyCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    assertEquals(query.get("resource_group.id"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listKeysPath);
  }

  @Test
  public void testCreateKeyWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"a6b1a881-2ce8-41a3-80fc-36316a73f803\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::key:a6b1a881-2ce8-41a3-80fc-36316a73f803\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/keys/a6b1a881-2ce8-41a3-80fc-36316a73f803\", \"fingerprint\": \"SHA256:yxavE4CIOL2NlsqcurRO3xGjkP6m/0mp8ugojH5yxlY\", \"name\": \"my-key\", \"public_key\": \"AAAAB3NzaC1yc2EAAAADAQABAAABAQDDGe50Bxa5T5NDddrrtbx2Y4/VGbiCgXqnBsYToIUKoFSHTQl5IX3PasGnneKanhcLwWz5M5MoCRvhxTp66NKzIfAz7r+FX9rxgR+ZgcM253YAqOVeIpOU408simDZKriTlN8kYsXL7P34tsWuAJf4MgZtJAQxous/2byetpdCv8ddnT4X3ltOg9w+LqSCPYfNivqH00Eh7S1Ldz7I8aw5WOp5a+sQFP/RbwfpwHp+ny7DfeIOokcuI42tJkoBn7UsLTVpCSmXr2EDRlSWe/1M/iHNRBzaT3CK0+SwZWd2AEjePxSnWKNGIEUJDlUYp7hKhiQcgT5ZAnWU121oc5En\", \"type\": \"rsa\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"created_at\": \"2019-01-01T12:00:00\", \"length\": 2048}";
    String createKeyPath = java.net.URLEncoder.encode("/keys", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ResourceGroupIdentityById model
    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
    .id("fee82deba12e4c0fb69c3b09d1f12345")
    .build();

    // Construct an instance of the CreateKeyOptions model
    CreateKeyOptions createKeyOptionsModel = new CreateKeyOptions.Builder()
    .publicKey("AAAAB3NzaC1yc2EAAAADAQABAAABAQDDGe50Bxa5T5NDddrrtbx2Y4/VGbiCgXqnBsYToIUKoFSHTQl5IX3PasGnneKanhcLwWz5M5MoCRvhxTp66NKzIfAz7r+FX9rxgR+ZgcM253YAqOVeIpOU408simDZKriTlN8kYsXL7P34tsWuAJf4MgZtJAQxous/2byetpdCv8ddnT4X3ltOg9w+LqSCPYfNivqH00Eh7S1Ldz7I8aw5WOp5a+sQFP/RbwfpwHp+ny7DfeIOokcuI42tJkoBn7UsLTVpCSmXr2EDRlSWe/1M/iHNRBzaT3CK0+SwZWd2AEjePxSnWKNGIEUJDlUYp7hKhiQcgT5ZAnWU121oc5En")
    .name("my-key")
    .type("rsa")
    .resourceGroup(resourceGroupIdentityModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Key> response = vpcService.createKey(createKeyOptionsModel).execute();
    assertNotNull(response);
    Key responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createKeyPath);
  }

  // Test the createKey operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateKeyNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.createKey(null).execute();
  }

  @Test
  public void testDeleteKeyWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteKeyPath = java.net.URLEncoder.encode("/keys/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteKeyOptions model
    DeleteKeyOptions deleteKeyOptionsModel = new DeleteKeyOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = vpcService.deleteKey(deleteKeyOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteKeyPath);
  }

  // Test the deleteKey operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteKeyNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.deleteKey(null).execute();
  }

  @Test
  public void testGetKeyWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"a6b1a881-2ce8-41a3-80fc-36316a73f803\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::key:a6b1a881-2ce8-41a3-80fc-36316a73f803\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/keys/a6b1a881-2ce8-41a3-80fc-36316a73f803\", \"fingerprint\": \"SHA256:yxavE4CIOL2NlsqcurRO3xGjkP6m/0mp8ugojH5yxlY\", \"name\": \"my-key\", \"public_key\": \"AAAAB3NzaC1yc2EAAAADAQABAAABAQDDGe50Bxa5T5NDddrrtbx2Y4/VGbiCgXqnBsYToIUKoFSHTQl5IX3PasGnneKanhcLwWz5M5MoCRvhxTp66NKzIfAz7r+FX9rxgR+ZgcM253YAqOVeIpOU408simDZKriTlN8kYsXL7P34tsWuAJf4MgZtJAQxous/2byetpdCv8ddnT4X3ltOg9w+LqSCPYfNivqH00Eh7S1Ldz7I8aw5WOp5a+sQFP/RbwfpwHp+ny7DfeIOokcuI42tJkoBn7UsLTVpCSmXr2EDRlSWe/1M/iHNRBzaT3CK0+SwZWd2AEjePxSnWKNGIEUJDlUYp7hKhiQcgT5ZAnWU121oc5En\", \"type\": \"rsa\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"created_at\": \"2019-01-01T12:00:00\", \"length\": 2048}";
    String getKeyPath = java.net.URLEncoder.encode("/keys/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetKeyOptions model
    GetKeyOptions getKeyOptionsModel = new GetKeyOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Key> response = vpcService.getKey(getKeyOptionsModel).execute();
    assertNotNull(response);
    Key responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getKeyPath);
  }

  // Test the getKey operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetKeyNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.getKey(null).execute();
  }

  @Test
  public void testUpdateKeyWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"a6b1a881-2ce8-41a3-80fc-36316a73f803\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::key:a6b1a881-2ce8-41a3-80fc-36316a73f803\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/keys/a6b1a881-2ce8-41a3-80fc-36316a73f803\", \"fingerprint\": \"SHA256:yxavE4CIOL2NlsqcurRO3xGjkP6m/0mp8ugojH5yxlY\", \"name\": \"my-key\", \"public_key\": \"AAAAB3NzaC1yc2EAAAADAQABAAABAQDDGe50Bxa5T5NDddrrtbx2Y4/VGbiCgXqnBsYToIUKoFSHTQl5IX3PasGnneKanhcLwWz5M5MoCRvhxTp66NKzIfAz7r+FX9rxgR+ZgcM253YAqOVeIpOU408simDZKriTlN8kYsXL7P34tsWuAJf4MgZtJAQxous/2byetpdCv8ddnT4X3ltOg9w+LqSCPYfNivqH00Eh7S1Ldz7I8aw5WOp5a+sQFP/RbwfpwHp+ny7DfeIOokcuI42tJkoBn7UsLTVpCSmXr2EDRlSWe/1M/iHNRBzaT3CK0+SwZWd2AEjePxSnWKNGIEUJDlUYp7hKhiQcgT5ZAnWU121oc5En\", \"type\": \"rsa\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"created_at\": \"2019-01-01T12:00:00\", \"length\": 2048}";
    String updateKeyPath = java.net.URLEncoder.encode("/keys/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateKeyOptions model
    UpdateKeyOptions updateKeyOptionsModel = new UpdateKeyOptions.Builder()
    .id("testString")
    .name("my-key")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Key> response = vpcService.updateKey(updateKeyOptionsModel).execute();
    assertNotNull(response);
    Key responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateKeyPath);
  }

  // Test the updateKey operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateKeyNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.updateKey(null).execute();
  }

  @Test
  public void testListInstanceProfilesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"profiles\": [{\"name\": \"bc1-4x16\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance/profiles/bc1-4x16\", \"bandwidth\": {\"type\": \"fixed\", \"value\": 20000}, \"port_speed\": {\"type\": \"fixed\", \"value\": 1000}, \"memory\": {\"type\": \"fixed\", \"value\": 16}, \"os_architecture\": {\"type\": \"enum\", \"default\": \"xDefault\", \"values\": [\"amd64\"]}, \"vcpu_architecture\": {\"type\": \"fixed\", \"value\": \"amd64\", \"default\": \"xDefault\"}, \"vcpu_count\": {\"type\": \"fixed\", \"value\": 16}, \"family\": \"balanced\"}]}";
    String listInstanceProfilesPath = java.net.URLEncoder.encode("/instance/profiles", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListInstanceProfilesOptions model
    ListInstanceProfilesOptions listInstanceProfilesOptionsModel = new ListInstanceProfilesOptions();

    // Invoke operation with valid options model (positive test)
    Response<InstanceProfileCollection> response = vpcService.listInstanceProfiles(listInstanceProfilesOptionsModel).execute();
    assertNotNull(response);
    InstanceProfileCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listInstanceProfilesPath);
  }

  @Test
  public void testGetInstanceProfileWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"bc1-4x16\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance/profiles/bc1-4x16\", \"bandwidth\": {\"type\": \"fixed\", \"value\": 20000}, \"port_speed\": {\"type\": \"fixed\", \"value\": 1000}, \"memory\": {\"type\": \"fixed\", \"value\": 16}, \"os_architecture\": {\"type\": \"enum\", \"default\": \"xDefault\", \"values\": [\"amd64\"]}, \"vcpu_architecture\": {\"type\": \"fixed\", \"value\": \"amd64\", \"default\": \"xDefault\"}, \"vcpu_count\": {\"type\": \"fixed\", \"value\": 16}, \"family\": \"balanced\"}";
    String getInstanceProfilePath = java.net.URLEncoder.encode("/instance/profiles/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetInstanceProfileOptions model
    GetInstanceProfileOptions getInstanceProfileOptionsModel = new GetInstanceProfileOptions.Builder()
    .name("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<InstanceProfile> response = vpcService.getInstanceProfile(getInstanceProfileOptionsModel).execute();
    assertNotNull(response);
    InstanceProfile responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getInstanceProfilePath);
  }

  // Test the getInstanceProfile operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetInstanceProfileNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.getInstanceProfile(null).execute();
  }

  @Test
  public void testListInstanceTemplatesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"first\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance/templates?limit=20\"}, \"limit\": 20, \"next\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance/templates?start=9d5a91a3e2cbd233b5a5b33436855ed1&limit=20\"}, \"total_count\": 132, \"templates\": [{\"id\": \"a6b1a881-2ce8-41a3-80fc-36316a73f803\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance/templates/1e09281b-f177-46fb-baf1-bc152b2e391a\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::instance-template:1e09281b-f177-46fb-baf1-bc152b2e391a\", \"name\": \"my-instance-template\", \"keys\": [{\"id\": \"a6b1a881-2ce8-41a3-80fc-36316a73f803\"}], \"network_interfaces\": [{\"name\": \"my-network-interface\", \"primary_ipv4_address\": \"10.0.0.5\", \"security_groups\": [{\"id\": \"be5df5ca-12a0-494b-907e-aa6ec2bfa271\"}], \"subnet\": {\"id\": \"7ec86020-1c6e-4889-b3f0-a15f2e50f87e\"}}], \"profile\": {\"name\": \"bc1-4x16\"}, \"user_data\": \"userData\", \"volume_attachments\": [{\"name\": \"my-volume-attachment\", \"delete_volume_on_instance_delete\": true, \"volume\": {\"id\": \"1a6b7274-678d-4dfb-8981-c71dd9d4daa5\"}}], \"vpc\": {\"id\": \"4727d842-f94f-4a2d-824a-9bc9b02c523b\"}, \"created_at\": \"2019-01-01T12:00:00\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"primary_network_interface\": {\"name\": \"my-network-interface\", \"primary_ipv4_address\": \"10.0.0.5\", \"security_groups\": [{\"id\": \"be5df5ca-12a0-494b-907e-aa6ec2bfa271\"}], \"subnet\": {\"id\": \"7ec86020-1c6e-4889-b3f0-a15f2e50f87e\"}}, \"zone\": {\"name\": \"us-south-1\"}, \"boot_volume_attachment\": {\"name\": \"my-volume-attachment\", \"delete_volume_on_instance_delete\": true, \"volume\": {\"name\": \"my-volume\", \"profile\": {\"name\": \"general-purpose\"}, \"encryption_key\": {\"crn\": \"crn:v1:bluemix:public:kms:us-south:a/dffc98a0f1f0f95f6613b3b752286b87:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179\"}, \"capacity\": 100, \"iops\": 10000}}, \"image\": {\"id\": \"72b27b5c-f4b0-48bb-b954-5becc7c1dcb8\"}}]}";
    String listInstanceTemplatesPath = java.net.URLEncoder.encode("/instance/templates", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListInstanceTemplatesOptions model
    ListInstanceTemplatesOptions listInstanceTemplatesOptionsModel = new ListInstanceTemplatesOptions();

    // Invoke operation with valid options model (positive test)
    Response<InstanceTemplateCollection> response = vpcService.listInstanceTemplates(listInstanceTemplatesOptionsModel).execute();
    assertNotNull(response);
    InstanceTemplateCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listInstanceTemplatesPath);
  }

  @Test
  public void testCreateInstanceTemplateWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"a6b1a881-2ce8-41a3-80fc-36316a73f803\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance/templates/1e09281b-f177-46fb-baf1-bc152b2e391a\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::instance-template:1e09281b-f177-46fb-baf1-bc152b2e391a\", \"name\": \"my-instance-template\", \"keys\": [{\"id\": \"a6b1a881-2ce8-41a3-80fc-36316a73f803\"}], \"network_interfaces\": [{\"name\": \"my-network-interface\", \"primary_ipv4_address\": \"10.0.0.5\", \"security_groups\": [{\"id\": \"be5df5ca-12a0-494b-907e-aa6ec2bfa271\"}], \"subnet\": {\"id\": \"7ec86020-1c6e-4889-b3f0-a15f2e50f87e\"}}], \"profile\": {\"name\": \"bc1-4x16\"}, \"user_data\": \"userData\", \"volume_attachments\": [{\"name\": \"my-volume-attachment\", \"delete_volume_on_instance_delete\": true, \"volume\": {\"id\": \"1a6b7274-678d-4dfb-8981-c71dd9d4daa5\"}}], \"vpc\": {\"id\": \"4727d842-f94f-4a2d-824a-9bc9b02c523b\"}, \"created_at\": \"2019-01-01T12:00:00\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"primary_network_interface\": {\"name\": \"my-network-interface\", \"primary_ipv4_address\": \"10.0.0.5\", \"security_groups\": [{\"id\": \"be5df5ca-12a0-494b-907e-aa6ec2bfa271\"}], \"subnet\": {\"id\": \"7ec86020-1c6e-4889-b3f0-a15f2e50f87e\"}}, \"zone\": {\"name\": \"us-south-1\"}, \"boot_volume_attachment\": {\"name\": \"my-volume-attachment\", \"delete_volume_on_instance_delete\": true, \"volume\": {\"name\": \"my-volume\", \"profile\": {\"name\": \"general-purpose\"}, \"encryption_key\": {\"crn\": \"crn:v1:bluemix:public:kms:us-south:a/dffc98a0f1f0f95f6613b3b752286b87:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179\"}, \"capacity\": 100, \"iops\": 10000}}, \"image\": {\"id\": \"72b27b5c-f4b0-48bb-b954-5becc7c1dcb8\"}}";
    String createInstanceTemplatePath = java.net.URLEncoder.encode("/instance/templates", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the KeyIdentityById model
    KeyIdentityById keyIdentityModel = new KeyIdentityById.Builder()
    .id("a6b1a881-2ce8-41a3-80fc-36316a73f803")
    .build();

    // Construct an instance of the SecurityGroupIdentityById model
    SecurityGroupIdentityById securityGroupIdentityModel = new SecurityGroupIdentityById.Builder()
    .id("be5df5ca-12a0-494b-907e-aa6ec2bfa271")
    .build();

    // Construct an instance of the SubnetIdentityById model
    SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
    .id("7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
    .build();

    // Construct an instance of the NetworkInterfacePrototype model
    NetworkInterfacePrototype networkInterfacePrototypeModel = new NetworkInterfacePrototype.Builder()
    .name("my-network-interface")
    .primaryIpv4Address("10.0.0.5")
    .securityGroups(new java.util.ArrayList<SecurityGroupIdentity>(java.util.Arrays.asList(securityGroupIdentityModel)))
    .subnet(subnetIdentityModel)
    .build();

    // Construct an instance of the InstanceProfileIdentityByName model
    InstanceProfileIdentityByName instanceProfileIdentityModel = new InstanceProfileIdentityByName.Builder()
    .name("cc1-16x32")
    .build();

    // Construct an instance of the VolumeAttachmentPrototypeInstanceContextVolumeVolumeIdentityVolumeIdentityById model
    VolumeAttachmentPrototypeInstanceContextVolumeVolumeIdentityVolumeIdentityById volumeAttachmentPrototypeInstanceContextVolumeModel = new VolumeAttachmentPrototypeInstanceContextVolumeVolumeIdentityVolumeIdentityById.Builder()
    .id("1a6b7274-678d-4dfb-8981-c71dd9d4daa5")
    .build();

    // Construct an instance of the VolumeAttachmentPrototypeInstanceContext model
    VolumeAttachmentPrototypeInstanceContext volumeAttachmentPrototypeInstanceContextModel = new VolumeAttachmentPrototypeInstanceContext.Builder()
    .name("my-volume-attachment")
    .deleteVolumeOnInstanceDelete(true)
    .volume(volumeAttachmentPrototypeInstanceContextVolumeModel)
    .build();

    // Construct an instance of the VPCIdentityById model
    VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
    .id("4727d842-f94f-4a2d-824a-9bc9b02c523b")
    .build();

    // Construct an instance of the ResourceGroupIdentityById model
    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
    .id("fee82deba12e4c0fb69c3b09d1f12345")
    .build();

    // Construct an instance of the ZoneIdentityByName model
    ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
    .name("us-south-1")
    .build();

    // Construct an instance of the VolumeProfileIdentityByName model
    VolumeProfileIdentityByName volumeProfileIdentityModel = new VolumeProfileIdentityByName.Builder()
    .name("general-purpose")
    .build();

    // Construct an instance of the EncryptionKeyIdentityByCRN model
    EncryptionKeyIdentityByCRN encryptionKeyIdentityModel = new EncryptionKeyIdentityByCRN.Builder()
    .crn("crn:v1:bluemix:public:kms:us-south:a/dffc98a0f1f0f95f6613b3b752286b87:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179")
    .build();

    // Construct an instance of the VolumePrototypeInstanceByImageContext model
    VolumePrototypeInstanceByImageContext volumePrototypeInstanceByImageContextModel = new VolumePrototypeInstanceByImageContext.Builder()
    .name("my-volume")
    .profile(volumeProfileIdentityModel)
    .encryptionKey(encryptionKeyIdentityModel)
    .capacity(Long.valueOf("100"))
    .iops(Long.valueOf("10000"))
    .build();

    // Construct an instance of the VolumeAttachmentPrototypeInstanceByImageContext model
    VolumeAttachmentPrototypeInstanceByImageContext volumeAttachmentPrototypeInstanceByImageContextModel = new VolumeAttachmentPrototypeInstanceByImageContext.Builder()
    .name("my-volume-attachment")
    .deleteVolumeOnInstanceDelete(true)
    .volume(volumePrototypeInstanceByImageContextModel)
    .build();

    // Construct an instance of the ImageIdentityById model
    ImageIdentityById imageIdentityModel = new ImageIdentityById.Builder()
    .id("72b27b5c-f4b0-48bb-b954-5becc7c1dcb8")
    .build();

    // Construct an instance of the InstanceTemplatePrototypeInstanceByImage model
    InstanceTemplatePrototypeInstanceByImage instanceTemplatePrototypeModel = new InstanceTemplatePrototypeInstanceByImage.Builder()
    .name("my-instance")
    .keys(new java.util.ArrayList<KeyIdentity>(java.util.Arrays.asList(keyIdentityModel)))
    .networkInterfaces(new java.util.ArrayList<NetworkInterfacePrototype>(java.util.Arrays.asList(networkInterfacePrototypeModel)))
    .profile(instanceProfileIdentityModel)
    .userData("testString")
    .volumeAttachments(new java.util.ArrayList<VolumeAttachmentPrototypeInstanceContext>(java.util.Arrays.asList(volumeAttachmentPrototypeInstanceContextModel)))
    .vpc(vpcIdentityModel)
    .resourceGroup(resourceGroupIdentityModel)
    .primaryNetworkInterface(networkInterfacePrototypeModel)
    .zone(zoneIdentityModel)
    .bootVolumeAttachment(volumeAttachmentPrototypeInstanceByImageContextModel)
    .image(imageIdentityModel)
    .build();

    // Construct an instance of the CreateInstanceTemplateOptions model
    CreateInstanceTemplateOptions createInstanceTemplateOptionsModel = new CreateInstanceTemplateOptions.Builder()
    .instanceTemplatePrototype(instanceTemplatePrototypeModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<InstanceTemplate> response = vpcService.createInstanceTemplate(createInstanceTemplateOptionsModel).execute();
    assertNotNull(response);
    InstanceTemplate responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createInstanceTemplatePath);
  }

  // Test the createInstanceTemplate operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateInstanceTemplateNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.createInstanceTemplate(null).execute();
  }

  @Test
  public void testDeleteInstanceTemplateWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteInstanceTemplatePath = java.net.URLEncoder.encode("/instance/templates/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteInstanceTemplateOptions model
    DeleteInstanceTemplateOptions deleteInstanceTemplateOptionsModel = new DeleteInstanceTemplateOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = vpcService.deleteInstanceTemplate(deleteInstanceTemplateOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteInstanceTemplatePath);
  }

  // Test the deleteInstanceTemplate operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteInstanceTemplateNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.deleteInstanceTemplate(null).execute();
  }

  @Test
  public void testGetInstanceTemplateWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"a6b1a881-2ce8-41a3-80fc-36316a73f803\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance/templates/1e09281b-f177-46fb-baf1-bc152b2e391a\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::instance-template:1e09281b-f177-46fb-baf1-bc152b2e391a\", \"name\": \"my-instance-template\", \"keys\": [{\"id\": \"a6b1a881-2ce8-41a3-80fc-36316a73f803\"}], \"network_interfaces\": [{\"name\": \"my-network-interface\", \"primary_ipv4_address\": \"10.0.0.5\", \"security_groups\": [{\"id\": \"be5df5ca-12a0-494b-907e-aa6ec2bfa271\"}], \"subnet\": {\"id\": \"7ec86020-1c6e-4889-b3f0-a15f2e50f87e\"}}], \"profile\": {\"name\": \"bc1-4x16\"}, \"user_data\": \"userData\", \"volume_attachments\": [{\"name\": \"my-volume-attachment\", \"delete_volume_on_instance_delete\": true, \"volume\": {\"id\": \"1a6b7274-678d-4dfb-8981-c71dd9d4daa5\"}}], \"vpc\": {\"id\": \"4727d842-f94f-4a2d-824a-9bc9b02c523b\"}, \"created_at\": \"2019-01-01T12:00:00\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"primary_network_interface\": {\"name\": \"my-network-interface\", \"primary_ipv4_address\": \"10.0.0.5\", \"security_groups\": [{\"id\": \"be5df5ca-12a0-494b-907e-aa6ec2bfa271\"}], \"subnet\": {\"id\": \"7ec86020-1c6e-4889-b3f0-a15f2e50f87e\"}}, \"zone\": {\"name\": \"us-south-1\"}, \"boot_volume_attachment\": {\"name\": \"my-volume-attachment\", \"delete_volume_on_instance_delete\": true, \"volume\": {\"name\": \"my-volume\", \"profile\": {\"name\": \"general-purpose\"}, \"encryption_key\": {\"crn\": \"crn:v1:bluemix:public:kms:us-south:a/dffc98a0f1f0f95f6613b3b752286b87:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179\"}, \"capacity\": 100, \"iops\": 10000}}, \"image\": {\"id\": \"72b27b5c-f4b0-48bb-b954-5becc7c1dcb8\"}}";
    String getInstanceTemplatePath = java.net.URLEncoder.encode("/instance/templates/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetInstanceTemplateOptions model
    GetInstanceTemplateOptions getInstanceTemplateOptionsModel = new GetInstanceTemplateOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<InstanceTemplate> response = vpcService.getInstanceTemplate(getInstanceTemplateOptionsModel).execute();
    assertNotNull(response);
    InstanceTemplate responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getInstanceTemplatePath);
  }

  // Test the getInstanceTemplate operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetInstanceTemplateNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.getInstanceTemplate(null).execute();
  }

  @Test
  public void testUpdateInstanceTemplateWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"a6b1a881-2ce8-41a3-80fc-36316a73f803\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance/templates/1e09281b-f177-46fb-baf1-bc152b2e391a\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::instance-template:1e09281b-f177-46fb-baf1-bc152b2e391a\", \"name\": \"my-instance-template\", \"keys\": [{\"id\": \"a6b1a881-2ce8-41a3-80fc-36316a73f803\"}], \"network_interfaces\": [{\"name\": \"my-network-interface\", \"primary_ipv4_address\": \"10.0.0.5\", \"security_groups\": [{\"id\": \"be5df5ca-12a0-494b-907e-aa6ec2bfa271\"}], \"subnet\": {\"id\": \"7ec86020-1c6e-4889-b3f0-a15f2e50f87e\"}}], \"profile\": {\"name\": \"bc1-4x16\"}, \"user_data\": \"userData\", \"volume_attachments\": [{\"name\": \"my-volume-attachment\", \"delete_volume_on_instance_delete\": true, \"volume\": {\"id\": \"1a6b7274-678d-4dfb-8981-c71dd9d4daa5\"}}], \"vpc\": {\"id\": \"4727d842-f94f-4a2d-824a-9bc9b02c523b\"}, \"created_at\": \"2019-01-01T12:00:00\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"primary_network_interface\": {\"name\": \"my-network-interface\", \"primary_ipv4_address\": \"10.0.0.5\", \"security_groups\": [{\"id\": \"be5df5ca-12a0-494b-907e-aa6ec2bfa271\"}], \"subnet\": {\"id\": \"7ec86020-1c6e-4889-b3f0-a15f2e50f87e\"}}, \"zone\": {\"name\": \"us-south-1\"}, \"boot_volume_attachment\": {\"name\": \"my-volume-attachment\", \"delete_volume_on_instance_delete\": true, \"volume\": {\"name\": \"my-volume\", \"profile\": {\"name\": \"general-purpose\"}, \"encryption_key\": {\"crn\": \"crn:v1:bluemix:public:kms:us-south:a/dffc98a0f1f0f95f6613b3b752286b87:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179\"}, \"capacity\": 100, \"iops\": 10000}}, \"image\": {\"id\": \"72b27b5c-f4b0-48bb-b954-5becc7c1dcb8\"}}";
    String updateInstanceTemplatePath = java.net.URLEncoder.encode("/instance/templates/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateInstanceTemplateOptions model
    UpdateInstanceTemplateOptions updateInstanceTemplateOptionsModel = new UpdateInstanceTemplateOptions.Builder()
    .id("testString")
    .name("my-instance-template")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<InstanceTemplate> response = vpcService.updateInstanceTemplate(updateInstanceTemplateOptionsModel).execute();
    assertNotNull(response);
    InstanceTemplate responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateInstanceTemplatePath);
  }

  // Test the updateInstanceTemplate operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateInstanceTemplateNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.updateInstanceTemplate(null).execute();
  }

  @Test
  public void testListInstancesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"first\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances?limit=20\"}, \"limit\": 20, \"next\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances?start=9d5a91a3e2cbd233b5a5b33436855ed1&limit=20\"}, \"total_count\": 132, \"instances\": [{\"id\": \"1e09281b-f177-46fb-baf1-bc152b2e391a\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::instance:1e09281b-f177-46fb-baf1-bc152b2e391a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a\", \"name\": \"my-instance\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"bandwidth\": 1000, \"boot_volume_attachment\": {\"id\": \"82cbf856-9cbb-45fb-b62f-d7bcef32399a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/volume_attachments/82cbf856-9cbb-45fb-b62f-d7bcef32399a\", \"name\": \"my-volume-attachment\", \"device\": {\"id\": \"80b3e36e-41f4-40e9-bd56-beae81792a68\"}, \"volume\": {\"id\": \"1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::volume:1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/volumes/1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"name\": \"my-volume\"}}, \"created_at\": \"2019-01-01T12:00:00\", \"gpu\": {\"count\": 1, \"manufacturer\": \"nvidia\", \"memory\": 1, \"model\": \"Tesla V100\"}, \"image\": {\"id\": \"72b27b5c-f4b0-48bb-b954-5becc7c1dcb8\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::image:72b27b5c-f4b0-48bb-b954-5becc7c1dcb8\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/images/72b27b5c-f4b0-48bb-b954-5becc7c1dcb8\", \"name\": \"my-image\"}, \"memory\": 8, \"network_interfaces\": [{\"name\": \"my-network-interface\", \"id\": \"10c02d81-0ecb-4dc5-897d-28392913b81e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/network_interfaces/10c02d81-0ecb-4dc5-897d-28392913b81e\", \"primary_ipv4_address\": \"192.168.3.4\", \"resource_type\": \"network_interface\", \"subnet\": {\"id\": \"7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::subnet:7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/subnets/7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"name\": \"my-subnet\"}}], \"primary_network_interface\": {\"name\": \"my-network-interface\", \"id\": \"10c02d81-0ecb-4dc5-897d-28392913b81e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/network_interfaces/10c02d81-0ecb-4dc5-897d-28392913b81e\", \"primary_ipv4_address\": \"192.168.3.4\", \"resource_type\": \"network_interface\", \"subnet\": {\"id\": \"7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::subnet:7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/subnets/7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"name\": \"my-subnet\"}}, \"profile\": {\"name\": \"bc1-4x16\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance/profiles/bc1-4x16\"}, \"status\": \"failed\", \"vcpu\": {\"architecture\": \"amd64\", \"count\": 4}, \"volume_attachments\": [{\"id\": \"82cbf856-9cbb-45fb-b62f-d7bcef32399a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/volume_attachments/82cbf856-9cbb-45fb-b62f-d7bcef32399a\", \"name\": \"my-volume-attachment\", \"device\": {\"id\": \"80b3e36e-41f4-40e9-bd56-beae81792a68\"}, \"volume\": {\"id\": \"1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::volume:1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/volumes/1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"name\": \"my-volume\"}}], \"vpc\": {\"id\": \"4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"name\": \"my-vpc\"}, \"zone\": {\"name\": \"us-south-1\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/regions/us-south/zones/us-south-1\"}}]}";
    String listInstancesPath = java.net.URLEncoder.encode("/instances", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListInstancesOptions model
    ListInstancesOptions listInstancesOptionsModel = new ListInstancesOptions.Builder()
    .start("testString")
    .limit(Long.valueOf("1"))
    .resourceGroupId("testString")
    .name("testString")
    .vpcId("testString")
    .vpcCrn("testString")
    .vpcName("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<InstanceCollection> response = vpcService.listInstances(listInstancesOptionsModel).execute();
    assertNotNull(response);
    InstanceCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    assertEquals(query.get("start"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(query.get("resource_group.id"), "testString");
    assertEquals(query.get("name"), "testString");
    assertEquals(query.get("vpc.id"), "testString");
    assertEquals(query.get("vpc.crn"), "testString");
    assertEquals(query.get("vpc.name"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listInstancesPath);
  }

  @Test
  public void testCreateInstanceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"1e09281b-f177-46fb-baf1-bc152b2e391a\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::instance:1e09281b-f177-46fb-baf1-bc152b2e391a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a\", \"name\": \"my-instance\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"bandwidth\": 1000, \"boot_volume_attachment\": {\"id\": \"82cbf856-9cbb-45fb-b62f-d7bcef32399a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/volume_attachments/82cbf856-9cbb-45fb-b62f-d7bcef32399a\", \"name\": \"my-volume-attachment\", \"device\": {\"id\": \"80b3e36e-41f4-40e9-bd56-beae81792a68\"}, \"volume\": {\"id\": \"1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::volume:1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/volumes/1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"name\": \"my-volume\"}}, \"created_at\": \"2019-01-01T12:00:00\", \"gpu\": {\"count\": 1, \"manufacturer\": \"nvidia\", \"memory\": 1, \"model\": \"Tesla V100\"}, \"image\": {\"id\": \"72b27b5c-f4b0-48bb-b954-5becc7c1dcb8\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::image:72b27b5c-f4b0-48bb-b954-5becc7c1dcb8\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/images/72b27b5c-f4b0-48bb-b954-5becc7c1dcb8\", \"name\": \"my-image\"}, \"memory\": 8, \"network_interfaces\": [{\"name\": \"my-network-interface\", \"id\": \"10c02d81-0ecb-4dc5-897d-28392913b81e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/network_interfaces/10c02d81-0ecb-4dc5-897d-28392913b81e\", \"primary_ipv4_address\": \"192.168.3.4\", \"resource_type\": \"network_interface\", \"subnet\": {\"id\": \"7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::subnet:7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/subnets/7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"name\": \"my-subnet\"}}], \"primary_network_interface\": {\"name\": \"my-network-interface\", \"id\": \"10c02d81-0ecb-4dc5-897d-28392913b81e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/network_interfaces/10c02d81-0ecb-4dc5-897d-28392913b81e\", \"primary_ipv4_address\": \"192.168.3.4\", \"resource_type\": \"network_interface\", \"subnet\": {\"id\": \"7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::subnet:7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/subnets/7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"name\": \"my-subnet\"}}, \"profile\": {\"name\": \"bc1-4x16\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance/profiles/bc1-4x16\"}, \"status\": \"failed\", \"vcpu\": {\"architecture\": \"amd64\", \"count\": 4}, \"volume_attachments\": [{\"id\": \"82cbf856-9cbb-45fb-b62f-d7bcef32399a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/volume_attachments/82cbf856-9cbb-45fb-b62f-d7bcef32399a\", \"name\": \"my-volume-attachment\", \"device\": {\"id\": \"80b3e36e-41f4-40e9-bd56-beae81792a68\"}, \"volume\": {\"id\": \"1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::volume:1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/volumes/1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"name\": \"my-volume\"}}], \"vpc\": {\"id\": \"4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"name\": \"my-vpc\"}, \"zone\": {\"name\": \"us-south-1\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/regions/us-south/zones/us-south-1\"}}";
    String createInstancePath = java.net.URLEncoder.encode("/instances", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the KeyIdentityById model
    KeyIdentityById keyIdentityModel = new KeyIdentityById.Builder()
    .id("a6b1a881-2ce8-41a3-80fc-36316a73f803")
    .build();

    // Construct an instance of the SecurityGroupIdentityById model
    SecurityGroupIdentityById securityGroupIdentityModel = new SecurityGroupIdentityById.Builder()
    .id("be5df5ca-12a0-494b-907e-aa6ec2bfa271")
    .build();

    // Construct an instance of the SubnetIdentityById model
    SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
    .id("7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
    .build();

    // Construct an instance of the NetworkInterfacePrototype model
    NetworkInterfacePrototype networkInterfacePrototypeModel = new NetworkInterfacePrototype.Builder()
    .name("my-network-interface")
    .primaryIpv4Address("10.0.0.5")
    .securityGroups(new java.util.ArrayList<SecurityGroupIdentity>(java.util.Arrays.asList(securityGroupIdentityModel)))
    .subnet(subnetIdentityModel)
    .build();

    // Construct an instance of the InstanceProfileIdentityByName model
    InstanceProfileIdentityByName instanceProfileIdentityModel = new InstanceProfileIdentityByName.Builder()
    .name("cc1-16x32")
    .build();

    // Construct an instance of the VolumeAttachmentPrototypeInstanceContextVolumeVolumeIdentityVolumeIdentityById model
    VolumeAttachmentPrototypeInstanceContextVolumeVolumeIdentityVolumeIdentityById volumeAttachmentPrototypeInstanceContextVolumeModel = new VolumeAttachmentPrototypeInstanceContextVolumeVolumeIdentityVolumeIdentityById.Builder()
    .id("1a6b7274-678d-4dfb-8981-c71dd9d4daa5")
    .build();

    // Construct an instance of the VolumeAttachmentPrototypeInstanceContext model
    VolumeAttachmentPrototypeInstanceContext volumeAttachmentPrototypeInstanceContextModel = new VolumeAttachmentPrototypeInstanceContext.Builder()
    .name("my-volume-attachment")
    .deleteVolumeOnInstanceDelete(true)
    .volume(volumeAttachmentPrototypeInstanceContextVolumeModel)
    .build();

    // Construct an instance of the VPCIdentityById model
    VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
    .id("4727d842-f94f-4a2d-824a-9bc9b02c523b")
    .build();

    // Construct an instance of the ResourceGroupIdentityById model
    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
    .id("fee82deba12e4c0fb69c3b09d1f12345")
    .build();

    // Construct an instance of the ZoneIdentityByName model
    ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
    .name("us-south-1")
    .build();

    // Construct an instance of the VolumeProfileIdentityByName model
    VolumeProfileIdentityByName volumeProfileIdentityModel = new VolumeProfileIdentityByName.Builder()
    .name("general-purpose")
    .build();

    // Construct an instance of the EncryptionKeyIdentityByCRN model
    EncryptionKeyIdentityByCRN encryptionKeyIdentityModel = new EncryptionKeyIdentityByCRN.Builder()
    .crn("crn:v1:bluemix:public:kms:us-south:a/dffc98a0f1f0f95f6613b3b752286b87:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179")
    .build();

    // Construct an instance of the VolumePrototypeInstanceByImageContext model
    VolumePrototypeInstanceByImageContext volumePrototypeInstanceByImageContextModel = new VolumePrototypeInstanceByImageContext.Builder()
    .name("my-volume")
    .profile(volumeProfileIdentityModel)
    .encryptionKey(encryptionKeyIdentityModel)
    .capacity(Long.valueOf("100"))
    .iops(Long.valueOf("10000"))
    .build();

    // Construct an instance of the VolumeAttachmentPrototypeInstanceByImageContext model
    VolumeAttachmentPrototypeInstanceByImageContext volumeAttachmentPrototypeInstanceByImageContextModel = new VolumeAttachmentPrototypeInstanceByImageContext.Builder()
    .name("my-volume-attachment")
    .deleteVolumeOnInstanceDelete(true)
    .volume(volumePrototypeInstanceByImageContextModel)
    .build();

    // Construct an instance of the ImageIdentityById model
    ImageIdentityById imageIdentityModel = new ImageIdentityById.Builder()
    .id("72b27b5c-f4b0-48bb-b954-5becc7c1dcb8")
    .build();

    // Construct an instance of the InstancePrototypeInstanceByImage model
    InstancePrototypeInstanceByImage instancePrototypeModel = new InstancePrototypeInstanceByImage.Builder()
    .name("my-instance")
    .keys(new java.util.ArrayList<KeyIdentity>(java.util.Arrays.asList(keyIdentityModel)))
    .networkInterfaces(new java.util.ArrayList<NetworkInterfacePrototype>(java.util.Arrays.asList(networkInterfacePrototypeModel)))
    .profile(instanceProfileIdentityModel)
    .userData("testString")
    .volumeAttachments(new java.util.ArrayList<VolumeAttachmentPrototypeInstanceContext>(java.util.Arrays.asList(volumeAttachmentPrototypeInstanceContextModel)))
    .vpc(vpcIdentityModel)
    .resourceGroup(resourceGroupIdentityModel)
    .primaryNetworkInterface(networkInterfacePrototypeModel)
    .zone(zoneIdentityModel)
    .bootVolumeAttachment(volumeAttachmentPrototypeInstanceByImageContextModel)
    .image(imageIdentityModel)
    .build();

    // Construct an instance of the CreateInstanceOptions model
    CreateInstanceOptions createInstanceOptionsModel = new CreateInstanceOptions.Builder()
    .instancePrototype(instancePrototypeModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Instance> response = vpcService.createInstance(createInstanceOptionsModel).execute();
    assertNotNull(response);
    Instance responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createInstancePath);
  }

  // Test the createInstance operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateInstanceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.createInstance(null).execute();
  }

  @Test
  public void testDeleteInstanceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteInstancePath = java.net.URLEncoder.encode("/instances/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteInstanceOptions model
    DeleteInstanceOptions deleteInstanceOptionsModel = new DeleteInstanceOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = vpcService.deleteInstance(deleteInstanceOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteInstancePath);
  }

  // Test the deleteInstance operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteInstanceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.deleteInstance(null).execute();
  }

  @Test
  public void testGetInstanceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"1e09281b-f177-46fb-baf1-bc152b2e391a\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::instance:1e09281b-f177-46fb-baf1-bc152b2e391a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a\", \"name\": \"my-instance\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"bandwidth\": 1000, \"boot_volume_attachment\": {\"id\": \"82cbf856-9cbb-45fb-b62f-d7bcef32399a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/volume_attachments/82cbf856-9cbb-45fb-b62f-d7bcef32399a\", \"name\": \"my-volume-attachment\", \"device\": {\"id\": \"80b3e36e-41f4-40e9-bd56-beae81792a68\"}, \"volume\": {\"id\": \"1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::volume:1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/volumes/1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"name\": \"my-volume\"}}, \"created_at\": \"2019-01-01T12:00:00\", \"gpu\": {\"count\": 1, \"manufacturer\": \"nvidia\", \"memory\": 1, \"model\": \"Tesla V100\"}, \"image\": {\"id\": \"72b27b5c-f4b0-48bb-b954-5becc7c1dcb8\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::image:72b27b5c-f4b0-48bb-b954-5becc7c1dcb8\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/images/72b27b5c-f4b0-48bb-b954-5becc7c1dcb8\", \"name\": \"my-image\"}, \"memory\": 8, \"network_interfaces\": [{\"name\": \"my-network-interface\", \"id\": \"10c02d81-0ecb-4dc5-897d-28392913b81e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/network_interfaces/10c02d81-0ecb-4dc5-897d-28392913b81e\", \"primary_ipv4_address\": \"192.168.3.4\", \"resource_type\": \"network_interface\", \"subnet\": {\"id\": \"7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::subnet:7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/subnets/7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"name\": \"my-subnet\"}}], \"primary_network_interface\": {\"name\": \"my-network-interface\", \"id\": \"10c02d81-0ecb-4dc5-897d-28392913b81e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/network_interfaces/10c02d81-0ecb-4dc5-897d-28392913b81e\", \"primary_ipv4_address\": \"192.168.3.4\", \"resource_type\": \"network_interface\", \"subnet\": {\"id\": \"7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::subnet:7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/subnets/7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"name\": \"my-subnet\"}}, \"profile\": {\"name\": \"bc1-4x16\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance/profiles/bc1-4x16\"}, \"status\": \"failed\", \"vcpu\": {\"architecture\": \"amd64\", \"count\": 4}, \"volume_attachments\": [{\"id\": \"82cbf856-9cbb-45fb-b62f-d7bcef32399a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/volume_attachments/82cbf856-9cbb-45fb-b62f-d7bcef32399a\", \"name\": \"my-volume-attachment\", \"device\": {\"id\": \"80b3e36e-41f4-40e9-bd56-beae81792a68\"}, \"volume\": {\"id\": \"1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::volume:1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/volumes/1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"name\": \"my-volume\"}}], \"vpc\": {\"id\": \"4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"name\": \"my-vpc\"}, \"zone\": {\"name\": \"us-south-1\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/regions/us-south/zones/us-south-1\"}}";
    String getInstancePath = java.net.URLEncoder.encode("/instances/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetInstanceOptions model
    GetInstanceOptions getInstanceOptionsModel = new GetInstanceOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Instance> response = vpcService.getInstance(getInstanceOptionsModel).execute();
    assertNotNull(response);
    Instance responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getInstancePath);
  }

  // Test the getInstance operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetInstanceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.getInstance(null).execute();
  }

  @Test
  public void testUpdateInstanceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"1e09281b-f177-46fb-baf1-bc152b2e391a\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::instance:1e09281b-f177-46fb-baf1-bc152b2e391a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a\", \"name\": \"my-instance\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"bandwidth\": 1000, \"boot_volume_attachment\": {\"id\": \"82cbf856-9cbb-45fb-b62f-d7bcef32399a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/volume_attachments/82cbf856-9cbb-45fb-b62f-d7bcef32399a\", \"name\": \"my-volume-attachment\", \"device\": {\"id\": \"80b3e36e-41f4-40e9-bd56-beae81792a68\"}, \"volume\": {\"id\": \"1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::volume:1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/volumes/1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"name\": \"my-volume\"}}, \"created_at\": \"2019-01-01T12:00:00\", \"gpu\": {\"count\": 1, \"manufacturer\": \"nvidia\", \"memory\": 1, \"model\": \"Tesla V100\"}, \"image\": {\"id\": \"72b27b5c-f4b0-48bb-b954-5becc7c1dcb8\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::image:72b27b5c-f4b0-48bb-b954-5becc7c1dcb8\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/images/72b27b5c-f4b0-48bb-b954-5becc7c1dcb8\", \"name\": \"my-image\"}, \"memory\": 8, \"network_interfaces\": [{\"name\": \"my-network-interface\", \"id\": \"10c02d81-0ecb-4dc5-897d-28392913b81e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/network_interfaces/10c02d81-0ecb-4dc5-897d-28392913b81e\", \"primary_ipv4_address\": \"192.168.3.4\", \"resource_type\": \"network_interface\", \"subnet\": {\"id\": \"7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::subnet:7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/subnets/7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"name\": \"my-subnet\"}}], \"primary_network_interface\": {\"name\": \"my-network-interface\", \"id\": \"10c02d81-0ecb-4dc5-897d-28392913b81e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/network_interfaces/10c02d81-0ecb-4dc5-897d-28392913b81e\", \"primary_ipv4_address\": \"192.168.3.4\", \"resource_type\": \"network_interface\", \"subnet\": {\"id\": \"7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::subnet:7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/subnets/7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"name\": \"my-subnet\"}}, \"profile\": {\"name\": \"bc1-4x16\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance/profiles/bc1-4x16\"}, \"status\": \"failed\", \"vcpu\": {\"architecture\": \"amd64\", \"count\": 4}, \"volume_attachments\": [{\"id\": \"82cbf856-9cbb-45fb-b62f-d7bcef32399a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/volume_attachments/82cbf856-9cbb-45fb-b62f-d7bcef32399a\", \"name\": \"my-volume-attachment\", \"device\": {\"id\": \"80b3e36e-41f4-40e9-bd56-beae81792a68\"}, \"volume\": {\"id\": \"1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::volume:1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/volumes/1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"name\": \"my-volume\"}}], \"vpc\": {\"id\": \"4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"name\": \"my-vpc\"}, \"zone\": {\"name\": \"us-south-1\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/regions/us-south/zones/us-south-1\"}}";
    String updateInstancePath = java.net.URLEncoder.encode("/instances/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateInstanceOptions model
    UpdateInstanceOptions updateInstanceOptionsModel = new UpdateInstanceOptions.Builder()
    .id("testString")
    .name("my-instance")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Instance> response = vpcService.updateInstance(updateInstanceOptionsModel).execute();
    assertNotNull(response);
    Instance responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateInstancePath);
  }

  // Test the updateInstance operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateInstanceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.updateInstance(null).execute();
  }

  @Test
  public void testGetInstanceInitializationWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"keys\": [{\"id\": \"a6b1a881-2ce8-41a3-80fc-36316a73f803\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::key:a6b1a881-2ce8-41a3-80fc-36316a73f803\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/keys/a6b1a881-2ce8-41a3-80fc-36316a73f803\", \"fingerprint\": \"SHA256:yxavE4CIOL2NlsqcurRO3xGjkP6m/0mp8ugojH5yxlY\", \"name\": \"my-key\"}], \"password\": {\"encrypted_password\": \"VGhpcyBpcyBhbiBlbmNvZGVkIGJ5dGUgYXJyYXku\", \"encryption_key\": {\"id\": \"a6b1a881-2ce8-41a3-80fc-36316a73f803\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::key:a6b1a881-2ce8-41a3-80fc-36316a73f803\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/keys/a6b1a881-2ce8-41a3-80fc-36316a73f803\", \"fingerprint\": \"SHA256:yxavE4CIOL2NlsqcurRO3xGjkP6m/0mp8ugojH5yxlY\", \"name\": \"my-key\"}}}";
    String getInstanceInitializationPath = java.net.URLEncoder.encode("/instances/testString/initialization", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetInstanceInitializationOptions model
    GetInstanceInitializationOptions getInstanceInitializationOptionsModel = new GetInstanceInitializationOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<InstanceInitialization> response = vpcService.getInstanceInitialization(getInstanceInitializationOptionsModel).execute();
    assertNotNull(response);
    InstanceInitialization responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getInstanceInitializationPath);
  }

  // Test the getInstanceInitialization operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetInstanceInitializationNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.getInstanceInitialization(null).execute();
  }

  @Test
  public void testCreateInstanceActionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"109a1b6e-1242-4de1-be44-38705e9474ed\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/actions/109a1b6e-1242-4de1-be44-38705e9474ed\", \"force\": false, \"type\": \"reboot\", \"completed_at\": \"2019-01-01T12:00:00\", \"created_at\": \"2019-01-01T12:00:00\", \"started_at\": \"2019-01-01T12:00:00\", \"status\": \"completed\"}";
    String createInstanceActionPath = java.net.URLEncoder.encode("/instances/testString/actions", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CreateInstanceActionOptions model
    CreateInstanceActionOptions createInstanceActionOptionsModel = new CreateInstanceActionOptions.Builder()
    .instanceId("testString")
    .type("reboot")
    .force(true)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<InstanceAction> response = vpcService.createInstanceAction(createInstanceActionOptionsModel).execute();
    assertNotNull(response);
    InstanceAction responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createInstanceActionPath);
  }

  // Test the createInstanceAction operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateInstanceActionNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.createInstanceAction(null).execute();
  }

  @Test
  public void testListInstanceNetworkInterfacesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"network_interfaces\": [{\"name\": \"my-network-interface\", \"id\": \"10c02d81-0ecb-4dc5-897d-28392913b81e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/network_interfaces/10c02d81-0ecb-4dc5-897d-28392913b81e\", \"primary_ipv4_address\": \"192.168.3.4\", \"resource_type\": \"network_interface\", \"security_groups\": [{\"id\": \"be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::security-group:be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/security_groups/be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"name\": \"my-security-group\"}], \"created_at\": \"2019-01-01T12:00:00\", \"floating_ips\": [{\"id\": \"39300233-9995-4806-89a5-3c1b6eb88689\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::floating-ip:39300233-9995-4806-89a5-3c1b6eb88689\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/floating_ips/39300233-9995-4806-89a5-3c1b6eb88689\", \"address\": \"203.0.113.1\", \"name\": \"my-floating-ip\"}], \"port_speed\": 1000, \"status\": \"available\", \"subnet\": {\"id\": \"7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::subnet:7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/subnets/7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"name\": \"my-subnet\"}, \"type\": \"primary\"}]}";
    String listInstanceNetworkInterfacesPath = java.net.URLEncoder.encode("/instances/testString/network_interfaces", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListInstanceNetworkInterfacesOptions model
    ListInstanceNetworkInterfacesOptions listInstanceNetworkInterfacesOptionsModel = new ListInstanceNetworkInterfacesOptions.Builder()
    .instanceId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<NetworkInterfaceUnpaginatedCollection> response = vpcService.listInstanceNetworkInterfaces(listInstanceNetworkInterfacesOptionsModel).execute();
    assertNotNull(response);
    NetworkInterfaceUnpaginatedCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listInstanceNetworkInterfacesPath);
  }

  // Test the listInstanceNetworkInterfaces operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListInstanceNetworkInterfacesNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.listInstanceNetworkInterfaces(null).execute();
  }

  @Test
  public void testCreateInstanceNetworkInterfaceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"my-network-interface\", \"id\": \"10c02d81-0ecb-4dc5-897d-28392913b81e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/network_interfaces/10c02d81-0ecb-4dc5-897d-28392913b81e\", \"primary_ipv4_address\": \"192.168.3.4\", \"resource_type\": \"network_interface\", \"security_groups\": [{\"id\": \"be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::security-group:be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/security_groups/be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"name\": \"my-security-group\"}], \"created_at\": \"2019-01-01T12:00:00\", \"floating_ips\": [{\"id\": \"39300233-9995-4806-89a5-3c1b6eb88689\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::floating-ip:39300233-9995-4806-89a5-3c1b6eb88689\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/floating_ips/39300233-9995-4806-89a5-3c1b6eb88689\", \"address\": \"203.0.113.1\", \"name\": \"my-floating-ip\"}], \"port_speed\": 1000, \"status\": \"available\", \"subnet\": {\"id\": \"7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::subnet:7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/subnets/7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"name\": \"my-subnet\"}, \"type\": \"primary\"}";
    String createInstanceNetworkInterfacePath = java.net.URLEncoder.encode("/instances/testString/network_interfaces", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the SubnetIdentityById model
    SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
    .id("7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
    .build();

    // Construct an instance of the SecurityGroupIdentityById model
    SecurityGroupIdentityById securityGroupIdentityModel = new SecurityGroupIdentityById.Builder()
    .id("be5df5ca-12a0-494b-907e-aa6ec2bfa271")
    .build();

    // Construct an instance of the CreateInstanceNetworkInterfaceOptions model
    CreateInstanceNetworkInterfaceOptions createInstanceNetworkInterfaceOptionsModel = new CreateInstanceNetworkInterfaceOptions.Builder()
    .instanceId("testString")
    .subnet(subnetIdentityModel)
    .name("my-network-interface")
    .primaryIpv4Address("10.0.0.5")
    .securityGroups(new java.util.ArrayList<SecurityGroupIdentity>(java.util.Arrays.asList(securityGroupIdentityModel)))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<NetworkInterface> response = vpcService.createInstanceNetworkInterface(createInstanceNetworkInterfaceOptionsModel).execute();
    assertNotNull(response);
    NetworkInterface responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createInstanceNetworkInterfacePath);
  }

  // Test the createInstanceNetworkInterface operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateInstanceNetworkInterfaceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.createInstanceNetworkInterface(null).execute();
  }

  @Test
  public void testDeleteInstanceNetworkInterfaceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteInstanceNetworkInterfacePath = java.net.URLEncoder.encode("/instances/testString/network_interfaces/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteInstanceNetworkInterfaceOptions model
    DeleteInstanceNetworkInterfaceOptions deleteInstanceNetworkInterfaceOptionsModel = new DeleteInstanceNetworkInterfaceOptions.Builder()
    .instanceId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = vpcService.deleteInstanceNetworkInterface(deleteInstanceNetworkInterfaceOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteInstanceNetworkInterfacePath);
  }

  // Test the deleteInstanceNetworkInterface operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteInstanceNetworkInterfaceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.deleteInstanceNetworkInterface(null).execute();
  }

  @Test
  public void testGetInstanceNetworkInterfaceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"my-network-interface\", \"id\": \"10c02d81-0ecb-4dc5-897d-28392913b81e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/network_interfaces/10c02d81-0ecb-4dc5-897d-28392913b81e\", \"primary_ipv4_address\": \"192.168.3.4\", \"resource_type\": \"network_interface\", \"security_groups\": [{\"id\": \"be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::security-group:be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/security_groups/be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"name\": \"my-security-group\"}], \"created_at\": \"2019-01-01T12:00:00\", \"floating_ips\": [{\"id\": \"39300233-9995-4806-89a5-3c1b6eb88689\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::floating-ip:39300233-9995-4806-89a5-3c1b6eb88689\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/floating_ips/39300233-9995-4806-89a5-3c1b6eb88689\", \"address\": \"203.0.113.1\", \"name\": \"my-floating-ip\"}], \"port_speed\": 1000, \"status\": \"available\", \"subnet\": {\"id\": \"7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::subnet:7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/subnets/7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"name\": \"my-subnet\"}, \"type\": \"primary\"}";
    String getInstanceNetworkInterfacePath = java.net.URLEncoder.encode("/instances/testString/network_interfaces/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetInstanceNetworkInterfaceOptions model
    GetInstanceNetworkInterfaceOptions getInstanceNetworkInterfaceOptionsModel = new GetInstanceNetworkInterfaceOptions.Builder()
    .instanceId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<NetworkInterface> response = vpcService.getInstanceNetworkInterface(getInstanceNetworkInterfaceOptionsModel).execute();
    assertNotNull(response);
    NetworkInterface responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getInstanceNetworkInterfacePath);
  }

  // Test the getInstanceNetworkInterface operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetInstanceNetworkInterfaceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.getInstanceNetworkInterface(null).execute();
  }

  @Test
  public void testUpdateInstanceNetworkInterfaceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"my-network-interface\", \"id\": \"10c02d81-0ecb-4dc5-897d-28392913b81e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/network_interfaces/10c02d81-0ecb-4dc5-897d-28392913b81e\", \"primary_ipv4_address\": \"192.168.3.4\", \"resource_type\": \"network_interface\", \"security_groups\": [{\"id\": \"be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::security-group:be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/security_groups/be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"name\": \"my-security-group\"}], \"created_at\": \"2019-01-01T12:00:00\", \"floating_ips\": [{\"id\": \"39300233-9995-4806-89a5-3c1b6eb88689\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::floating-ip:39300233-9995-4806-89a5-3c1b6eb88689\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/floating_ips/39300233-9995-4806-89a5-3c1b6eb88689\", \"address\": \"203.0.113.1\", \"name\": \"my-floating-ip\"}], \"port_speed\": 1000, \"status\": \"available\", \"subnet\": {\"id\": \"7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::subnet:7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/subnets/7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"name\": \"my-subnet\"}, \"type\": \"primary\"}";
    String updateInstanceNetworkInterfacePath = java.net.URLEncoder.encode("/instances/testString/network_interfaces/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateInstanceNetworkInterfaceOptions model
    UpdateInstanceNetworkInterfaceOptions updateInstanceNetworkInterfaceOptionsModel = new UpdateInstanceNetworkInterfaceOptions.Builder()
    .instanceId("testString")
    .id("testString")
    .name("my-network-interface")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<NetworkInterface> response = vpcService.updateInstanceNetworkInterface(updateInstanceNetworkInterfaceOptionsModel).execute();
    assertNotNull(response);
    NetworkInterface responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateInstanceNetworkInterfacePath);
  }

  // Test the updateInstanceNetworkInterface operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateInstanceNetworkInterfaceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.updateInstanceNetworkInterface(null).execute();
  }

  @Test
  public void testListInstanceNetworkInterfaceFloatingIpsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"floating_ips\": [{\"id\": \"39300233-9995-4806-89a5-3c1b6eb88689\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::floating-ip:39300233-9995-4806-89a5-3c1b6eb88689\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/floating_ips/39300233-9995-4806-89a5-3c1b6eb88689\", \"address\": \"203.0.113.1\", \"name\": \"my-floating-ip\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"created_at\": \"2019-01-01T12:00:00\", \"status\": \"available\", \"target\": {\"name\": \"my-network-interface\", \"id\": \"10c02d81-0ecb-4dc5-897d-28392913b81e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/network_interfaces/10c02d81-0ecb-4dc5-897d-28392913b81e\", \"primary_ipv4_address\": \"192.168.3.4\", \"resource_type\": \"network_interface\"}, \"zone\": {\"name\": \"us-south-1\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/regions/us-south/zones/us-south-1\"}}]}";
    String listInstanceNetworkInterfaceFloatingIpsPath = java.net.URLEncoder.encode("/instances/testString/network_interfaces/testString/floating_ips", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListInstanceNetworkInterfaceFloatingIpsOptions model
    ListInstanceNetworkInterfaceFloatingIpsOptions listInstanceNetworkInterfaceFloatingIpsOptionsModel = new ListInstanceNetworkInterfaceFloatingIpsOptions.Builder()
    .instanceId("testString")
    .networkInterfaceId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<FloatingIPUnpaginatedCollection> response = vpcService.listInstanceNetworkInterfaceFloatingIps(listInstanceNetworkInterfaceFloatingIpsOptionsModel).execute();
    assertNotNull(response);
    FloatingIPUnpaginatedCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listInstanceNetworkInterfaceFloatingIpsPath);
  }

  // Test the listInstanceNetworkInterfaceFloatingIps operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListInstanceNetworkInterfaceFloatingIpsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.listInstanceNetworkInterfaceFloatingIps(null).execute();
  }

  @Test
  public void testRemoveInstanceNetworkInterfaceFloatingIpWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String removeInstanceNetworkInterfaceFloatingIpPath = java.net.URLEncoder.encode("/instances/testString/network_interfaces/testString/floating_ips/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the RemoveInstanceNetworkInterfaceFloatingIpOptions model
    RemoveInstanceNetworkInterfaceFloatingIpOptions removeInstanceNetworkInterfaceFloatingIpOptionsModel = new RemoveInstanceNetworkInterfaceFloatingIpOptions.Builder()
    .instanceId("testString")
    .networkInterfaceId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = vpcService.removeInstanceNetworkInterfaceFloatingIp(removeInstanceNetworkInterfaceFloatingIpOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, removeInstanceNetworkInterfaceFloatingIpPath);
  }

  // Test the removeInstanceNetworkInterfaceFloatingIp operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRemoveInstanceNetworkInterfaceFloatingIpNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.removeInstanceNetworkInterfaceFloatingIp(null).execute();
  }

  @Test
  public void testGetInstanceNetworkInterfaceFloatingIpWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"39300233-9995-4806-89a5-3c1b6eb88689\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::floating-ip:39300233-9995-4806-89a5-3c1b6eb88689\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/floating_ips/39300233-9995-4806-89a5-3c1b6eb88689\", \"address\": \"203.0.113.1\", \"name\": \"my-floating-ip\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"created_at\": \"2019-01-01T12:00:00\", \"status\": \"available\", \"target\": {\"name\": \"my-network-interface\", \"id\": \"10c02d81-0ecb-4dc5-897d-28392913b81e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/network_interfaces/10c02d81-0ecb-4dc5-897d-28392913b81e\", \"primary_ipv4_address\": \"192.168.3.4\", \"resource_type\": \"network_interface\"}, \"zone\": {\"name\": \"us-south-1\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/regions/us-south/zones/us-south-1\"}}";
    String getInstanceNetworkInterfaceFloatingIpPath = java.net.URLEncoder.encode("/instances/testString/network_interfaces/testString/floating_ips/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetInstanceNetworkInterfaceFloatingIpOptions model
    GetInstanceNetworkInterfaceFloatingIpOptions getInstanceNetworkInterfaceFloatingIpOptionsModel = new GetInstanceNetworkInterfaceFloatingIpOptions.Builder()
    .instanceId("testString")
    .networkInterfaceId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<FloatingIP> response = vpcService.getInstanceNetworkInterfaceFloatingIp(getInstanceNetworkInterfaceFloatingIpOptionsModel).execute();
    assertNotNull(response);
    FloatingIP responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getInstanceNetworkInterfaceFloatingIpPath);
  }

  // Test the getInstanceNetworkInterfaceFloatingIp operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetInstanceNetworkInterfaceFloatingIpNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.getInstanceNetworkInterfaceFloatingIp(null).execute();
  }

  @Test
  public void testAddInstanceNetworkInterfaceFloatingIpWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"39300233-9995-4806-89a5-3c1b6eb88689\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::floating-ip:39300233-9995-4806-89a5-3c1b6eb88689\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/floating_ips/39300233-9995-4806-89a5-3c1b6eb88689\", \"address\": \"203.0.113.1\", \"name\": \"my-floating-ip\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"created_at\": \"2019-01-01T12:00:00\", \"status\": \"available\", \"target\": {\"name\": \"my-network-interface\", \"id\": \"10c02d81-0ecb-4dc5-897d-28392913b81e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/network_interfaces/10c02d81-0ecb-4dc5-897d-28392913b81e\", \"primary_ipv4_address\": \"192.168.3.4\", \"resource_type\": \"network_interface\"}, \"zone\": {\"name\": \"us-south-1\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/regions/us-south/zones/us-south-1\"}}";
    String addInstanceNetworkInterfaceFloatingIpPath = java.net.URLEncoder.encode("/instances/testString/network_interfaces/testString/floating_ips/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the AddInstanceNetworkInterfaceFloatingIpOptions model
    AddInstanceNetworkInterfaceFloatingIpOptions addInstanceNetworkInterfaceFloatingIpOptionsModel = new AddInstanceNetworkInterfaceFloatingIpOptions.Builder()
    .instanceId("testString")
    .networkInterfaceId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<FloatingIP> response = vpcService.addInstanceNetworkInterfaceFloatingIp(addInstanceNetworkInterfaceFloatingIpOptionsModel).execute();
    assertNotNull(response);
    FloatingIP responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, addInstanceNetworkInterfaceFloatingIpPath);
  }

  // Test the addInstanceNetworkInterfaceFloatingIp operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAddInstanceNetworkInterfaceFloatingIpNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.addInstanceNetworkInterfaceFloatingIp(null).execute();
  }

  @Test
  public void testListInstanceVolumeAttachmentsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"volume_attachments\": [{\"name\": \"my-volume-attachment\", \"delete_volume_on_instance_delete\": true, \"id\": \"82cbf856-9cbb-45fb-b62f-d7bcef32399a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/volume_attachments/82cbf856-9cbb-45fb-b62f-d7bcef32399a\", \"device\": {\"id\": \"80b3e36e-41f4-40e9-bd56-beae81792a68\"}, \"volume\": {\"id\": \"1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::volume:1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/volumes/1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"name\": \"my-volume\"}, \"created_at\": \"2019-01-01T12:00:00\", \"status\": \"attached\", \"type\": \"boot\"}]}";
    String listInstanceVolumeAttachmentsPath = java.net.URLEncoder.encode("/instances/testString/volume_attachments", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListInstanceVolumeAttachmentsOptions model
    ListInstanceVolumeAttachmentsOptions listInstanceVolumeAttachmentsOptionsModel = new ListInstanceVolumeAttachmentsOptions.Builder()
    .instanceId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<VolumeAttachmentCollection> response = vpcService.listInstanceVolumeAttachments(listInstanceVolumeAttachmentsOptionsModel).execute();
    assertNotNull(response);
    VolumeAttachmentCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listInstanceVolumeAttachmentsPath);
  }

  // Test the listInstanceVolumeAttachments operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListInstanceVolumeAttachmentsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.listInstanceVolumeAttachments(null).execute();
  }

  @Test
  public void testCreateInstanceVolumeAttachmentWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"my-volume-attachment\", \"delete_volume_on_instance_delete\": true, \"id\": \"82cbf856-9cbb-45fb-b62f-d7bcef32399a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/volume_attachments/82cbf856-9cbb-45fb-b62f-d7bcef32399a\", \"device\": {\"id\": \"80b3e36e-41f4-40e9-bd56-beae81792a68\"}, \"volume\": {\"id\": \"1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::volume:1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/volumes/1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"name\": \"my-volume\"}, \"created_at\": \"2019-01-01T12:00:00\", \"status\": \"attached\", \"type\": \"boot\"}";
    String createInstanceVolumeAttachmentPath = java.net.URLEncoder.encode("/instances/testString/volume_attachments", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the VolumeIdentityById model
    VolumeIdentityById volumeIdentityModel = new VolumeIdentityById.Builder()
    .id("1a6b7274-678d-4dfb-8981-c71dd9d4daa5")
    .build();

    // Construct an instance of the CreateInstanceVolumeAttachmentOptions model
    CreateInstanceVolumeAttachmentOptions createInstanceVolumeAttachmentOptionsModel = new CreateInstanceVolumeAttachmentOptions.Builder()
    .instanceId("testString")
    .volume(volumeIdentityModel)
    .name("my-volume-attachment")
    .deleteVolumeOnInstanceDelete(true)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<VolumeAttachment> response = vpcService.createInstanceVolumeAttachment(createInstanceVolumeAttachmentOptionsModel).execute();
    assertNotNull(response);
    VolumeAttachment responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createInstanceVolumeAttachmentPath);
  }

  // Test the createInstanceVolumeAttachment operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateInstanceVolumeAttachmentNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.createInstanceVolumeAttachment(null).execute();
  }

  @Test
  public void testDeleteInstanceVolumeAttachmentWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteInstanceVolumeAttachmentPath = java.net.URLEncoder.encode("/instances/testString/volume_attachments/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteInstanceVolumeAttachmentOptions model
    DeleteInstanceVolumeAttachmentOptions deleteInstanceVolumeAttachmentOptionsModel = new DeleteInstanceVolumeAttachmentOptions.Builder()
    .instanceId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = vpcService.deleteInstanceVolumeAttachment(deleteInstanceVolumeAttachmentOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteInstanceVolumeAttachmentPath);
  }

  // Test the deleteInstanceVolumeAttachment operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteInstanceVolumeAttachmentNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.deleteInstanceVolumeAttachment(null).execute();
  }

  @Test
  public void testGetInstanceVolumeAttachmentWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"my-volume-attachment\", \"delete_volume_on_instance_delete\": true, \"id\": \"82cbf856-9cbb-45fb-b62f-d7bcef32399a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/volume_attachments/82cbf856-9cbb-45fb-b62f-d7bcef32399a\", \"device\": {\"id\": \"80b3e36e-41f4-40e9-bd56-beae81792a68\"}, \"volume\": {\"id\": \"1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::volume:1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/volumes/1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"name\": \"my-volume\"}, \"created_at\": \"2019-01-01T12:00:00\", \"status\": \"attached\", \"type\": \"boot\"}";
    String getInstanceVolumeAttachmentPath = java.net.URLEncoder.encode("/instances/testString/volume_attachments/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetInstanceVolumeAttachmentOptions model
    GetInstanceVolumeAttachmentOptions getInstanceVolumeAttachmentOptionsModel = new GetInstanceVolumeAttachmentOptions.Builder()
    .instanceId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<VolumeAttachment> response = vpcService.getInstanceVolumeAttachment(getInstanceVolumeAttachmentOptionsModel).execute();
    assertNotNull(response);
    VolumeAttachment responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getInstanceVolumeAttachmentPath);
  }

  // Test the getInstanceVolumeAttachment operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetInstanceVolumeAttachmentNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.getInstanceVolumeAttachment(null).execute();
  }

  @Test
  public void testUpdateInstanceVolumeAttachmentWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"my-volume-attachment\", \"delete_volume_on_instance_delete\": true, \"id\": \"82cbf856-9cbb-45fb-b62f-d7bcef32399a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/volume_attachments/82cbf856-9cbb-45fb-b62f-d7bcef32399a\", \"device\": {\"id\": \"80b3e36e-41f4-40e9-bd56-beae81792a68\"}, \"volume\": {\"id\": \"1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::volume:1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/volumes/1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"name\": \"my-volume\"}, \"created_at\": \"2019-01-01T12:00:00\", \"status\": \"attached\", \"type\": \"boot\"}";
    String updateInstanceVolumeAttachmentPath = java.net.URLEncoder.encode("/instances/testString/volume_attachments/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateInstanceVolumeAttachmentOptions model
    UpdateInstanceVolumeAttachmentOptions updateInstanceVolumeAttachmentOptionsModel = new UpdateInstanceVolumeAttachmentOptions.Builder()
    .instanceId("testString")
    .id("testString")
    .name("my-volume-attachment")
    .deleteVolumeOnInstanceDelete(true)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<VolumeAttachment> response = vpcService.updateInstanceVolumeAttachment(updateInstanceVolumeAttachmentOptionsModel).execute();
    assertNotNull(response);
    VolumeAttachment responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateInstanceVolumeAttachmentPath);
  }

  // Test the updateInstanceVolumeAttachment operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateInstanceVolumeAttachmentNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.updateInstanceVolumeAttachment(null).execute();
  }

  @Test
  public void testListInstanceGroupsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"first\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance_groups?limit=20\"}, \"limit\": 20, \"next\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance_groups?start=9d5a91a3e2cbd233b5a5b33436855ed1&limit=20\"}, \"total_count\": 132, \"instance_groups\": [{\"id\": \"1e09281b-f177-46fb-baf1-bc152b2e391a\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::instance-group:1e09281b-f177-46fb-baf1-bc152b2e391a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance_groups/1e09281b-f177-46fb-baf1-bc152b2e391a\", \"name\": \"my-instance-group\", \"membership_count\": 10, \"application_port\": 22, \"load_balancer_pool\": {\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/pools/70294e14-4e61-11e8-bcf4-0242ac110004\", \"name\": \"my-load-balancer-pool\"}, \"created_at\": \"2019-01-01T12:00:00\", \"instance_template\": {\"id\": \"a6b1a881-2ce8-41a3-80fc-36316a73f803\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance/templates/1e09281b-f177-46fb-baf1-bc152b2e391a\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::instance-template:1e09281b-f177-46fb-baf1-bc152b2e391a\"}, \"managers\": [{\"id\": \"1e09281b-f177-46fb-baf1-bc152b2e391a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance_groups/1e09281b-f177-46fb-baf1-bc152b2e391a/managers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727\", \"name\": \"my-instance-group-manager\"}], \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"status\": \"deleting\", \"subnets\": [{\"id\": \"7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::subnet:7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/subnets/7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"name\": \"my-subnet\"}], \"vpc\": {\"id\": \"4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"name\": \"my-vpc\"}}]}";
    String listInstanceGroupsPath = java.net.URLEncoder.encode("/instance_groups", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListInstanceGroupsOptions model
    ListInstanceGroupsOptions listInstanceGroupsOptionsModel = new ListInstanceGroupsOptions.Builder()
    .start("testString")
    .limit(Long.valueOf("1"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<InstanceGroupCollection> response = vpcService.listInstanceGroups(listInstanceGroupsOptionsModel).execute();
    assertNotNull(response);
    InstanceGroupCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    assertEquals(query.get("start"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listInstanceGroupsPath);
  }

  @Test
  public void testCreateInstanceGroupWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"1e09281b-f177-46fb-baf1-bc152b2e391a\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::instance-group:1e09281b-f177-46fb-baf1-bc152b2e391a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance_groups/1e09281b-f177-46fb-baf1-bc152b2e391a\", \"name\": \"my-instance-group\", \"membership_count\": 10, \"application_port\": 22, \"load_balancer_pool\": {\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/pools/70294e14-4e61-11e8-bcf4-0242ac110004\", \"name\": \"my-load-balancer-pool\"}, \"created_at\": \"2019-01-01T12:00:00\", \"instance_template\": {\"id\": \"a6b1a881-2ce8-41a3-80fc-36316a73f803\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance/templates/1e09281b-f177-46fb-baf1-bc152b2e391a\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::instance-template:1e09281b-f177-46fb-baf1-bc152b2e391a\"}, \"managers\": [{\"id\": \"1e09281b-f177-46fb-baf1-bc152b2e391a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance_groups/1e09281b-f177-46fb-baf1-bc152b2e391a/managers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727\", \"name\": \"my-instance-group-manager\"}], \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"status\": \"deleting\", \"subnets\": [{\"id\": \"7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::subnet:7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/subnets/7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"name\": \"my-subnet\"}], \"vpc\": {\"id\": \"4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"name\": \"my-vpc\"}}";
    String createInstanceGroupPath = java.net.URLEncoder.encode("/instance_groups", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the InstanceTemplateIdentityById model
    InstanceTemplateIdentityById instanceTemplateIdentityModel = new InstanceTemplateIdentityById.Builder()
    .id("a6b1a881-2ce8-41a3-80fc-36316a73f803")
    .build();

    // Construct an instance of the SubnetIdentityById model
    SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
    .id("7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
    .build();

    // Construct an instance of the LoadBalancerIdentityById model
    LoadBalancerIdentityById loadBalancerIdentityModel = new LoadBalancerIdentityById.Builder()
    .id("dd754295-e9e0-4c9d-bf6c-58fbc59e5727")
    .build();

    // Construct an instance of the LoadBalancerPoolIdentityById model
    LoadBalancerPoolIdentityById loadBalancerPoolIdentityModel = new LoadBalancerPoolIdentityById.Builder()
    .id("70294e14-4e61-11e8-bcf4-0242ac110004")
    .build();

    // Construct an instance of the ResourceGroupIdentityById model
    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
    .id("fee82deba12e4c0fb69c3b09d1f12345")
    .build();

    // Construct an instance of the CreateInstanceGroupOptions model
    CreateInstanceGroupOptions createInstanceGroupOptionsModel = new CreateInstanceGroupOptions.Builder()
    .instanceTemplate(instanceTemplateIdentityModel)
    .subnets(new java.util.ArrayList<SubnetIdentity>(java.util.Arrays.asList(subnetIdentityModel)))
    .name("my-instance-group")
    .membershipCount(Long.valueOf("10"))
    .applicationPort(Long.valueOf("22"))
    .loadBalancer(loadBalancerIdentityModel)
    .loadBalancerPool(loadBalancerPoolIdentityModel)
    .resourceGroup(resourceGroupIdentityModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<InstanceGroup> response = vpcService.createInstanceGroup(createInstanceGroupOptionsModel).execute();
    assertNotNull(response);
    InstanceGroup responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createInstanceGroupPath);
  }

  // Test the createInstanceGroup operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateInstanceGroupNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.createInstanceGroup(null).execute();
  }

  @Test
  public void testDeleteInstanceGroupWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteInstanceGroupPath = java.net.URLEncoder.encode("/instance_groups/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteInstanceGroupOptions model
    DeleteInstanceGroupOptions deleteInstanceGroupOptionsModel = new DeleteInstanceGroupOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = vpcService.deleteInstanceGroup(deleteInstanceGroupOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteInstanceGroupPath);
  }

  // Test the deleteInstanceGroup operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteInstanceGroupNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.deleteInstanceGroup(null).execute();
  }

  @Test
  public void testGetInstanceGroupWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"1e09281b-f177-46fb-baf1-bc152b2e391a\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::instance-group:1e09281b-f177-46fb-baf1-bc152b2e391a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance_groups/1e09281b-f177-46fb-baf1-bc152b2e391a\", \"name\": \"my-instance-group\", \"membership_count\": 10, \"application_port\": 22, \"load_balancer_pool\": {\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/pools/70294e14-4e61-11e8-bcf4-0242ac110004\", \"name\": \"my-load-balancer-pool\"}, \"created_at\": \"2019-01-01T12:00:00\", \"instance_template\": {\"id\": \"a6b1a881-2ce8-41a3-80fc-36316a73f803\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance/templates/1e09281b-f177-46fb-baf1-bc152b2e391a\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::instance-template:1e09281b-f177-46fb-baf1-bc152b2e391a\"}, \"managers\": [{\"id\": \"1e09281b-f177-46fb-baf1-bc152b2e391a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance_groups/1e09281b-f177-46fb-baf1-bc152b2e391a/managers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727\", \"name\": \"my-instance-group-manager\"}], \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"status\": \"deleting\", \"subnets\": [{\"id\": \"7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::subnet:7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/subnets/7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"name\": \"my-subnet\"}], \"vpc\": {\"id\": \"4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"name\": \"my-vpc\"}}";
    String getInstanceGroupPath = java.net.URLEncoder.encode("/instance_groups/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetInstanceGroupOptions model
    GetInstanceGroupOptions getInstanceGroupOptionsModel = new GetInstanceGroupOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<InstanceGroup> response = vpcService.getInstanceGroup(getInstanceGroupOptionsModel).execute();
    assertNotNull(response);
    InstanceGroup responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getInstanceGroupPath);
  }

  // Test the getInstanceGroup operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetInstanceGroupNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.getInstanceGroup(null).execute();
  }

  @Test
  public void testUpdateInstanceGroupWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"1e09281b-f177-46fb-baf1-bc152b2e391a\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::instance-group:1e09281b-f177-46fb-baf1-bc152b2e391a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance_groups/1e09281b-f177-46fb-baf1-bc152b2e391a\", \"name\": \"my-instance-group\", \"membership_count\": 10, \"application_port\": 22, \"load_balancer_pool\": {\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/pools/70294e14-4e61-11e8-bcf4-0242ac110004\", \"name\": \"my-load-balancer-pool\"}, \"created_at\": \"2019-01-01T12:00:00\", \"instance_template\": {\"id\": \"a6b1a881-2ce8-41a3-80fc-36316a73f803\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance/templates/1e09281b-f177-46fb-baf1-bc152b2e391a\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::instance-template:1e09281b-f177-46fb-baf1-bc152b2e391a\"}, \"managers\": [{\"id\": \"1e09281b-f177-46fb-baf1-bc152b2e391a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance_groups/1e09281b-f177-46fb-baf1-bc152b2e391a/managers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727\", \"name\": \"my-instance-group-manager\"}], \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"status\": \"deleting\", \"subnets\": [{\"id\": \"7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::subnet:7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/subnets/7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"name\": \"my-subnet\"}], \"vpc\": {\"id\": \"4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"name\": \"my-vpc\"}}";
    String updateInstanceGroupPath = java.net.URLEncoder.encode("/instance_groups/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the InstanceTemplateIdentityById model
    InstanceTemplateIdentityById instanceTemplateIdentityModel = new InstanceTemplateIdentityById.Builder()
    .id("a6b1a881-2ce8-41a3-80fc-36316a73f803")
    .build();

    // Construct an instance of the SubnetIdentityById model
    SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
    .id("7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
    .build();

    // Construct an instance of the LoadBalancerIdentityById model
    LoadBalancerIdentityById loadBalancerIdentityModel = new LoadBalancerIdentityById.Builder()
    .id("dd754295-e9e0-4c9d-bf6c-58fbc59e5727")
    .build();

    // Construct an instance of the LoadBalancerPoolIdentityById model
    LoadBalancerPoolIdentityById loadBalancerPoolIdentityModel = new LoadBalancerPoolIdentityById.Builder()
    .id("70294e14-4e61-11e8-bcf4-0242ac110004")
    .build();

    // Construct an instance of the UpdateInstanceGroupOptions model
    UpdateInstanceGroupOptions updateInstanceGroupOptionsModel = new UpdateInstanceGroupOptions.Builder()
    .id("testString")
    .name("my-instance-group")
    .membershipCount(Long.valueOf("10"))
    .instanceTemplate(instanceTemplateIdentityModel)
    .subnets(new java.util.ArrayList<SubnetIdentity>(java.util.Arrays.asList(subnetIdentityModel)))
    .applicationPort(Long.valueOf("22"))
    .loadBalancer(loadBalancerIdentityModel)
    .loadBalancerPool(loadBalancerPoolIdentityModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<InstanceGroup> response = vpcService.updateInstanceGroup(updateInstanceGroupOptionsModel).execute();
    assertNotNull(response);
    InstanceGroup responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateInstanceGroupPath);
  }

  // Test the updateInstanceGroup operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateInstanceGroupNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.updateInstanceGroup(null).execute();
  }

  @Test
  public void testDeleteInstanceGroupLoadBalancerWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteInstanceGroupLoadBalancerPath = java.net.URLEncoder.encode("/instance_groups/testString/load_balancer", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteInstanceGroupLoadBalancerOptions model
    DeleteInstanceGroupLoadBalancerOptions deleteInstanceGroupLoadBalancerOptionsModel = new DeleteInstanceGroupLoadBalancerOptions.Builder()
    .instanceGroupId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = vpcService.deleteInstanceGroupLoadBalancer(deleteInstanceGroupLoadBalancerOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteInstanceGroupLoadBalancerPath);
  }

  // Test the deleteInstanceGroupLoadBalancer operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteInstanceGroupLoadBalancerNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.deleteInstanceGroupLoadBalancer(null).execute();
  }

  @Test
  public void testListInstanceGroupManagersWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"first\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance_groups/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/managers?limit=20\"}, \"limit\": 20, \"next\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance_groups/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/managers?start=9d5a91a3e2cbd233b5a5b33436855ed1&limit=20\"}, \"total_count\": 132, \"managers\": [{\"id\": \"1e09281b-f177-46fb-baf1-bc152b2e391a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance_groups/1e09281b-f177-46fb-baf1-bc152b2e391a/managers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727\", \"name\": \"my-instance-group-manager\", \"management_enabled\": false, \"aggregation_window\": 120, \"cooldown\": 210, \"max_membership_count\": 10, \"min_membership_count\": 10, \"manager_type\": \"autoscale\", \"policies\": [{\"id\": \"1e09281b-f177-46fb-baf1-bc152b2e391a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance_groups/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/managers/4c939b00-601f-11ea-bca2-000c29475bed/policies/1e09281b-f177-46fb-baf1-bc152b2e391a\", \"name\": \"my-instance-group-manager-policy\"}]}]}";
    String listInstanceGroupManagersPath = java.net.URLEncoder.encode("/instance_groups/testString/managers", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListInstanceGroupManagersOptions model
    ListInstanceGroupManagersOptions listInstanceGroupManagersOptionsModel = new ListInstanceGroupManagersOptions.Builder()
    .instanceGroupId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<InstanceGroupManagerCollection> response = vpcService.listInstanceGroupManagers(listInstanceGroupManagersOptionsModel).execute();
    assertNotNull(response);
    InstanceGroupManagerCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listInstanceGroupManagersPath);
  }

  // Test the listInstanceGroupManagers operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListInstanceGroupManagersNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.listInstanceGroupManagers(null).execute();
  }

  @Test
  public void testCreateInstanceGroupManagerWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"1e09281b-f177-46fb-baf1-bc152b2e391a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance_groups/1e09281b-f177-46fb-baf1-bc152b2e391a/managers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727\", \"name\": \"my-instance-group-manager\", \"management_enabled\": false, \"aggregation_window\": 120, \"cooldown\": 210, \"max_membership_count\": 10, \"min_membership_count\": 10, \"manager_type\": \"autoscale\", \"policies\": [{\"id\": \"1e09281b-f177-46fb-baf1-bc152b2e391a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance_groups/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/managers/4c939b00-601f-11ea-bca2-000c29475bed/policies/1e09281b-f177-46fb-baf1-bc152b2e391a\", \"name\": \"my-instance-group-manager-policy\"}]}";
    String createInstanceGroupManagerPath = java.net.URLEncoder.encode("/instance_groups/testString/managers", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the InstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype model
    InstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype instanceGroupManagerPrototypeModel = new InstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype.Builder()
    .name("my-instance-group-manager")
    .managementEnabled(true)
    .aggregationWindow(Long.valueOf("120"))
    .cooldown(Long.valueOf("210"))
    .maxMembershipCount(Long.valueOf("10"))
    .minMembershipCount(Long.valueOf("10"))
    .managerType("autoscale")
    .build();

    // Construct an instance of the CreateInstanceGroupManagerOptions model
    CreateInstanceGroupManagerOptions createInstanceGroupManagerOptionsModel = new CreateInstanceGroupManagerOptions.Builder()
    .instanceGroupId("testString")
    .instanceGroupManagerPrototype(instanceGroupManagerPrototypeModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<InstanceGroupManager> response = vpcService.createInstanceGroupManager(createInstanceGroupManagerOptionsModel).execute();
    assertNotNull(response);
    InstanceGroupManager responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createInstanceGroupManagerPath);
  }

  // Test the createInstanceGroupManager operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateInstanceGroupManagerNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.createInstanceGroupManager(null).execute();
  }

  @Test
  public void testDeleteInstanceGroupManagerWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteInstanceGroupManagerPath = java.net.URLEncoder.encode("/instance_groups/testString/managers/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteInstanceGroupManagerOptions model
    DeleteInstanceGroupManagerOptions deleteInstanceGroupManagerOptionsModel = new DeleteInstanceGroupManagerOptions.Builder()
    .instanceGroupId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = vpcService.deleteInstanceGroupManager(deleteInstanceGroupManagerOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteInstanceGroupManagerPath);
  }

  // Test the deleteInstanceGroupManager operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteInstanceGroupManagerNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.deleteInstanceGroupManager(null).execute();
  }

  @Test
  public void testGetInstanceGroupManagerWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"1e09281b-f177-46fb-baf1-bc152b2e391a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance_groups/1e09281b-f177-46fb-baf1-bc152b2e391a/managers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727\", \"name\": \"my-instance-group-manager\", \"management_enabled\": false, \"aggregation_window\": 120, \"cooldown\": 210, \"max_membership_count\": 10, \"min_membership_count\": 10, \"manager_type\": \"autoscale\", \"policies\": [{\"id\": \"1e09281b-f177-46fb-baf1-bc152b2e391a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance_groups/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/managers/4c939b00-601f-11ea-bca2-000c29475bed/policies/1e09281b-f177-46fb-baf1-bc152b2e391a\", \"name\": \"my-instance-group-manager-policy\"}]}";
    String getInstanceGroupManagerPath = java.net.URLEncoder.encode("/instance_groups/testString/managers/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetInstanceGroupManagerOptions model
    GetInstanceGroupManagerOptions getInstanceGroupManagerOptionsModel = new GetInstanceGroupManagerOptions.Builder()
    .instanceGroupId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<InstanceGroupManager> response = vpcService.getInstanceGroupManager(getInstanceGroupManagerOptionsModel).execute();
    assertNotNull(response);
    InstanceGroupManager responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getInstanceGroupManagerPath);
  }

  // Test the getInstanceGroupManager operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetInstanceGroupManagerNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.getInstanceGroupManager(null).execute();
  }

  @Test
  public void testUpdateInstanceGroupManagerWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"1e09281b-f177-46fb-baf1-bc152b2e391a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance_groups/1e09281b-f177-46fb-baf1-bc152b2e391a/managers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727\", \"name\": \"my-instance-group-manager\", \"management_enabled\": false, \"aggregation_window\": 120, \"cooldown\": 210, \"max_membership_count\": 10, \"min_membership_count\": 10, \"manager_type\": \"autoscale\", \"policies\": [{\"id\": \"1e09281b-f177-46fb-baf1-bc152b2e391a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance_groups/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/managers/4c939b00-601f-11ea-bca2-000c29475bed/policies/1e09281b-f177-46fb-baf1-bc152b2e391a\", \"name\": \"my-instance-group-manager-policy\"}]}";
    String updateInstanceGroupManagerPath = java.net.URLEncoder.encode("/instance_groups/testString/managers/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateInstanceGroupManagerOptions model
    UpdateInstanceGroupManagerOptions updateInstanceGroupManagerOptionsModel = new UpdateInstanceGroupManagerOptions.Builder()
    .instanceGroupId("testString")
    .id("testString")
    .name("my-instance-group-manager")
    .managementEnabled(true)
    .aggregationWindow(Long.valueOf("120"))
    .cooldown(Long.valueOf("210"))
    .maxMembershipCount(Long.valueOf("10"))
    .minMembershipCount(Long.valueOf("10"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<InstanceGroupManager> response = vpcService.updateInstanceGroupManager(updateInstanceGroupManagerOptionsModel).execute();
    assertNotNull(response);
    InstanceGroupManager responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateInstanceGroupManagerPath);
  }

  // Test the updateInstanceGroupManager operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateInstanceGroupManagerNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.updateInstanceGroupManager(null).execute();
  }

  @Test
  public void testListInstanceGroupManagerPoliciesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"first\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance_groups/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/managers/4c939b00-601f-11ea-bca2-000c29475bed/policies?limit=20\"}, \"limit\": 20, \"next\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance_groups/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/managers/4c939b00-601f-11ea-bca2-000c29475bed/policies?start=9d5a91a3e2cbd233b5a5b33436855ed1&limit=20\"}, \"total_count\": 132, \"policies\": [{\"id\": \"1e09281b-f177-46fb-baf1-bc152b2e391a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance_groups/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/managers/4c939b00-601f-11ea-bca2-000c29475bed/policies/1e09281b-f177-46fb-baf1-bc152b2e391a\", \"name\": \"my-instance-group-manager-policy\", \"metric_type\": \"cpu\", \"metric_value\": 11, \"policy_type\": \"target\"}]}";
    String listInstanceGroupManagerPoliciesPath = java.net.URLEncoder.encode("/instance_groups/testString/managers/testString/policies", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListInstanceGroupManagerPoliciesOptions model
    ListInstanceGroupManagerPoliciesOptions listInstanceGroupManagerPoliciesOptionsModel = new ListInstanceGroupManagerPoliciesOptions.Builder()
    .instanceGroupId("testString")
    .instanceGroupManagerId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<InstanceGroupManagerPolicyCollection> response = vpcService.listInstanceGroupManagerPolicies(listInstanceGroupManagerPoliciesOptionsModel).execute();
    assertNotNull(response);
    InstanceGroupManagerPolicyCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listInstanceGroupManagerPoliciesPath);
  }

  // Test the listInstanceGroupManagerPolicies operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListInstanceGroupManagerPoliciesNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.listInstanceGroupManagerPolicies(null).execute();
  }

  @Test
  public void testCreateInstanceGroupManagerPolicyWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"1e09281b-f177-46fb-baf1-bc152b2e391a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance_groups/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/managers/4c939b00-601f-11ea-bca2-000c29475bed/policies/1e09281b-f177-46fb-baf1-bc152b2e391a\", \"name\": \"my-instance-group-manager-policy\", \"metric_type\": \"cpu\", \"metric_value\": 11, \"policy_type\": \"target\"}";
    String createInstanceGroupManagerPolicyPath = java.net.URLEncoder.encode("/instance_groups/testString/managers/testString/policies", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the InstanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototype model
    InstanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototype instanceGroupManagerPolicyPrototypeModel = new InstanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototype.Builder()
    .name("my-instance-group-manager-policy")
    .metricType("cpu")
    .metricValue(Long.valueOf("26"))
    .policyType("target")
    .build();

    // Construct an instance of the CreateInstanceGroupManagerPolicyOptions model
    CreateInstanceGroupManagerPolicyOptions createInstanceGroupManagerPolicyOptionsModel = new CreateInstanceGroupManagerPolicyOptions.Builder()
    .instanceGroupId("testString")
    .instanceGroupManagerId("testString")
    .instanceGroupManagerPolicyPrototype(instanceGroupManagerPolicyPrototypeModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<InstanceGroupManagerPolicy> response = vpcService.createInstanceGroupManagerPolicy(createInstanceGroupManagerPolicyOptionsModel).execute();
    assertNotNull(response);
    InstanceGroupManagerPolicy responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createInstanceGroupManagerPolicyPath);
  }

  // Test the createInstanceGroupManagerPolicy operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateInstanceGroupManagerPolicyNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.createInstanceGroupManagerPolicy(null).execute();
  }

  @Test
  public void testDeleteInstanceGroupManagerPolicyWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteInstanceGroupManagerPolicyPath = java.net.URLEncoder.encode("/instance_groups/testString/managers/testString/policies/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteInstanceGroupManagerPolicyOptions model
    DeleteInstanceGroupManagerPolicyOptions deleteInstanceGroupManagerPolicyOptionsModel = new DeleteInstanceGroupManagerPolicyOptions.Builder()
    .instanceGroupId("testString")
    .instanceGroupManagerId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = vpcService.deleteInstanceGroupManagerPolicy(deleteInstanceGroupManagerPolicyOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteInstanceGroupManagerPolicyPath);
  }

  // Test the deleteInstanceGroupManagerPolicy operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteInstanceGroupManagerPolicyNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.deleteInstanceGroupManagerPolicy(null).execute();
  }

  @Test
  public void testGetInstanceGroupManagerPolicyWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"1e09281b-f177-46fb-baf1-bc152b2e391a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance_groups/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/managers/4c939b00-601f-11ea-bca2-000c29475bed/policies/1e09281b-f177-46fb-baf1-bc152b2e391a\", \"name\": \"my-instance-group-manager-policy\", \"metric_type\": \"cpu\", \"metric_value\": 11, \"policy_type\": \"target\"}";
    String getInstanceGroupManagerPolicyPath = java.net.URLEncoder.encode("/instance_groups/testString/managers/testString/policies/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetInstanceGroupManagerPolicyOptions model
    GetInstanceGroupManagerPolicyOptions getInstanceGroupManagerPolicyOptionsModel = new GetInstanceGroupManagerPolicyOptions.Builder()
    .instanceGroupId("testString")
    .instanceGroupManagerId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<InstanceGroupManagerPolicy> response = vpcService.getInstanceGroupManagerPolicy(getInstanceGroupManagerPolicyOptionsModel).execute();
    assertNotNull(response);
    InstanceGroupManagerPolicy responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getInstanceGroupManagerPolicyPath);
  }

  // Test the getInstanceGroupManagerPolicy operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetInstanceGroupManagerPolicyNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.getInstanceGroupManagerPolicy(null).execute();
  }

  @Test
  public void testUpdateInstanceGroupManagerPolicyWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"1e09281b-f177-46fb-baf1-bc152b2e391a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance_groups/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/managers/4c939b00-601f-11ea-bca2-000c29475bed/policies/1e09281b-f177-46fb-baf1-bc152b2e391a\", \"name\": \"my-instance-group-manager-policy\", \"metric_type\": \"cpu\", \"metric_value\": 11, \"policy_type\": \"target\"}";
    String updateInstanceGroupManagerPolicyPath = java.net.URLEncoder.encode("/instance_groups/testString/managers/testString/policies/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateInstanceGroupManagerPolicyOptions model
    UpdateInstanceGroupManagerPolicyOptions updateInstanceGroupManagerPolicyOptionsModel = new UpdateInstanceGroupManagerPolicyOptions.Builder()
    .instanceGroupId("testString")
    .instanceGroupManagerId("testString")
    .id("testString")
    .name("my-instance-group-manager-policy")
    .metricType("cpu")
    .metricValue(Long.valueOf("26"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<InstanceGroupManagerPolicy> response = vpcService.updateInstanceGroupManagerPolicy(updateInstanceGroupManagerPolicyOptionsModel).execute();
    assertNotNull(response);
    InstanceGroupManagerPolicy responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateInstanceGroupManagerPolicyPath);
  }

  // Test the updateInstanceGroupManagerPolicy operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateInstanceGroupManagerPolicyNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.updateInstanceGroupManagerPolicy(null).execute();
  }

  @Test
  public void testDeleteInstanceGroupMembershipsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteInstanceGroupMembershipsPath = java.net.URLEncoder.encode("/instance_groups/testString/memberships", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteInstanceGroupMembershipsOptions model
    DeleteInstanceGroupMembershipsOptions deleteInstanceGroupMembershipsOptionsModel = new DeleteInstanceGroupMembershipsOptions.Builder()
    .instanceGroupId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = vpcService.deleteInstanceGroupMemberships(deleteInstanceGroupMembershipsOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteInstanceGroupMembershipsPath);
  }

  // Test the deleteInstanceGroupMemberships operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteInstanceGroupMembershipsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.deleteInstanceGroupMemberships(null).execute();
  }

  @Test
  public void testListInstanceGroupMembershipsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"first\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance_groups/7241e2a8-601f-11ea-8503-000c29475bed/memberships?limit=20\"}, \"limit\": 20, \"next\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance_groups/7241e2a8-601f-11ea-8503-000c29475bed/memberships?start=9d5a91a3e2cbd233b5a5b33436855ed1&limit=20\"}, \"total_count\": 132, \"memberships\": [{\"id\": \"1e09281b-f177-46fb-baf1-bc152b2e391a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance_groups/1e09281b-f177-46fb-baf1-bc152b2e391a/memberships/8b002d86-601f-11ea-898b-000c29475bed\", \"name\": \"my-instance-group-membership\", \"delete_instance_on_membership_delete\": true, \"instance\": {\"id\": \"1e09281b-f177-46fb-baf1-bc152b2e391a\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::instance:1e09281b-f177-46fb-baf1-bc152b2e391a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a\", \"name\": \"my-instance\"}, \"instance_template\": {\"id\": \"a6b1a881-2ce8-41a3-80fc-36316a73f803\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance/templates/1e09281b-f177-46fb-baf1-bc152b2e391a\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::instance-template:1e09281b-f177-46fb-baf1-bc152b2e391a\"}, \"pool_member\": {\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/pools/70294e14-4e61-11e8-bcf4-0242ac110004/members/80294e14-4e61-11e8-bcf4-0242ac110004\"}, \"status\": \"deleting\"}]}";
    String listInstanceGroupMembershipsPath = java.net.URLEncoder.encode("/instance_groups/testString/memberships", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListInstanceGroupMembershipsOptions model
    ListInstanceGroupMembershipsOptions listInstanceGroupMembershipsOptionsModel = new ListInstanceGroupMembershipsOptions.Builder()
    .instanceGroupId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<InstanceGroupMembershipCollection> response = vpcService.listInstanceGroupMemberships(listInstanceGroupMembershipsOptionsModel).execute();
    assertNotNull(response);
    InstanceGroupMembershipCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listInstanceGroupMembershipsPath);
  }

  // Test the listInstanceGroupMemberships operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListInstanceGroupMembershipsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.listInstanceGroupMemberships(null).execute();
  }

  @Test
  public void testDeleteInstanceGroupMembershipWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteInstanceGroupMembershipPath = java.net.URLEncoder.encode("/instance_groups/testString/memberships/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteInstanceGroupMembershipOptions model
    DeleteInstanceGroupMembershipOptions deleteInstanceGroupMembershipOptionsModel = new DeleteInstanceGroupMembershipOptions.Builder()
    .instanceGroupId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = vpcService.deleteInstanceGroupMembership(deleteInstanceGroupMembershipOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteInstanceGroupMembershipPath);
  }

  // Test the deleteInstanceGroupMembership operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteInstanceGroupMembershipNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.deleteInstanceGroupMembership(null).execute();
  }

  @Test
  public void testGetInstanceGroupMembershipWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"1e09281b-f177-46fb-baf1-bc152b2e391a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance_groups/1e09281b-f177-46fb-baf1-bc152b2e391a/memberships/8b002d86-601f-11ea-898b-000c29475bed\", \"name\": \"my-instance-group-membership\", \"delete_instance_on_membership_delete\": true, \"instance\": {\"id\": \"1e09281b-f177-46fb-baf1-bc152b2e391a\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::instance:1e09281b-f177-46fb-baf1-bc152b2e391a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a\", \"name\": \"my-instance\"}, \"instance_template\": {\"id\": \"a6b1a881-2ce8-41a3-80fc-36316a73f803\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance/templates/1e09281b-f177-46fb-baf1-bc152b2e391a\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::instance-template:1e09281b-f177-46fb-baf1-bc152b2e391a\"}, \"pool_member\": {\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/pools/70294e14-4e61-11e8-bcf4-0242ac110004/members/80294e14-4e61-11e8-bcf4-0242ac110004\"}, \"status\": \"deleting\"}";
    String getInstanceGroupMembershipPath = java.net.URLEncoder.encode("/instance_groups/testString/memberships/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetInstanceGroupMembershipOptions model
    GetInstanceGroupMembershipOptions getInstanceGroupMembershipOptionsModel = new GetInstanceGroupMembershipOptions.Builder()
    .instanceGroupId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<InstanceGroupMembership> response = vpcService.getInstanceGroupMembership(getInstanceGroupMembershipOptionsModel).execute();
    assertNotNull(response);
    InstanceGroupMembership responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getInstanceGroupMembershipPath);
  }

  // Test the getInstanceGroupMembership operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetInstanceGroupMembershipNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.getInstanceGroupMembership(null).execute();
  }

  @Test
  public void testUpdateInstanceGroupMembershipWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"1e09281b-f177-46fb-baf1-bc152b2e391a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance_groups/1e09281b-f177-46fb-baf1-bc152b2e391a/memberships/8b002d86-601f-11ea-898b-000c29475bed\", \"name\": \"my-instance-group-membership\", \"delete_instance_on_membership_delete\": true, \"instance\": {\"id\": \"1e09281b-f177-46fb-baf1-bc152b2e391a\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::instance:1e09281b-f177-46fb-baf1-bc152b2e391a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a\", \"name\": \"my-instance\"}, \"instance_template\": {\"id\": \"a6b1a881-2ce8-41a3-80fc-36316a73f803\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance/templates/1e09281b-f177-46fb-baf1-bc152b2e391a\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::instance-template:1e09281b-f177-46fb-baf1-bc152b2e391a\"}, \"pool_member\": {\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/pools/70294e14-4e61-11e8-bcf4-0242ac110004/members/80294e14-4e61-11e8-bcf4-0242ac110004\"}, \"status\": \"deleting\"}";
    String updateInstanceGroupMembershipPath = java.net.URLEncoder.encode("/instance_groups/testString/memberships/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateInstanceGroupMembershipOptions model
    UpdateInstanceGroupMembershipOptions updateInstanceGroupMembershipOptionsModel = new UpdateInstanceGroupMembershipOptions.Builder()
    .instanceGroupId("testString")
    .id("testString")
    .name("my-instance-group-membership")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<InstanceGroupMembership> response = vpcService.updateInstanceGroupMembership(updateInstanceGroupMembershipOptionsModel).execute();
    assertNotNull(response);
    InstanceGroupMembership responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateInstanceGroupMembershipPath);
  }

  // Test the updateInstanceGroupMembership operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateInstanceGroupMembershipNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.updateInstanceGroupMembership(null).execute();
  }

  @Test
  public void testListVolumeProfilesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"first\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/volume/profiles?limit=20\"}, \"limit\": 20, \"next\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/volume/profiles?start=9d5a91a3e2cbd233b5a5b33436855ed1&limit=20\"}, \"total_count\": 132, \"profiles\": [{\"name\": \"general-purpose\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/volume/profiles/general-purpose\", \"family\": \"tiered\"}]}";
    String listVolumeProfilesPath = java.net.URLEncoder.encode("/volume/profiles", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListVolumeProfilesOptions model
    ListVolumeProfilesOptions listVolumeProfilesOptionsModel = new ListVolumeProfilesOptions.Builder()
    .start("testString")
    .limit(Long.valueOf("1"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<VolumeProfileCollection> response = vpcService.listVolumeProfiles(listVolumeProfilesOptionsModel).execute();
    assertNotNull(response);
    VolumeProfileCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    assertEquals(query.get("start"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listVolumeProfilesPath);
  }

  @Test
  public void testGetVolumeProfileWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"general-purpose\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/volume/profiles/general-purpose\", \"family\": \"tiered\"}";
    String getVolumeProfilePath = java.net.URLEncoder.encode("/volume/profiles/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetVolumeProfileOptions model
    GetVolumeProfileOptions getVolumeProfileOptionsModel = new GetVolumeProfileOptions.Builder()
    .name("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<VolumeProfile> response = vpcService.getVolumeProfile(getVolumeProfileOptionsModel).execute();
    assertNotNull(response);
    VolumeProfile responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getVolumeProfilePath);
  }

  // Test the getVolumeProfile operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetVolumeProfileNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.getVolumeProfile(null).execute();
  }

  @Test
  public void testListVolumesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"first\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/volumes?limit=20\"}, \"limit\": 20, \"next\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/volumes?start=9d5a91a3e2cbd233b5a5b33436855ed1&limit=20\"}, \"volumes\": [{\"iops\": 10000, \"capacity\": 100, \"id\": \"1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::volume:1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/volumes/1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"name\": \"my-volume\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"created_at\": \"2019-01-01T12:00:00\", \"encryption\": \"provider_managed\", \"encryption_key\": {\"crn\": \"crn:v1:bluemix:public:kms:us-south:a/dffc98a0f1f0f95f6613b3b752286b87:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179\"}, \"profile\": {\"name\": \"general-purpose\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/volume/profiles/general-purpose\"}, \"status\": \"available\", \"volume_attachments\": [{\"id\": \"82cbf856-9cbb-45fb-b62f-d7bcef32399a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/volume_attachments/82cbf856-9cbb-45fb-b62f-d7bcef32399a\", \"name\": \"my-volume-attachment\", \"delete_volume_on_instance_delete\": true, \"device\": {\"id\": \"80b3e36e-41f4-40e9-bd56-beae81792a68\"}, \"instance\": {\"id\": \"1e09281b-f177-46fb-baf1-bc152b2e391a\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::instance:1e09281b-f177-46fb-baf1-bc152b2e391a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a\", \"name\": \"my-instance\"}, \"type\": \"boot\"}], \"zone\": {\"name\": \"us-south-1\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/regions/us-south/zones/us-south-1\"}}]}";
    String listVolumesPath = java.net.URLEncoder.encode("/volumes", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListVolumesOptions model
    ListVolumesOptions listVolumesOptionsModel = new ListVolumesOptions.Builder()
    .start("testString")
    .limit(Long.valueOf("1"))
    .name("testString")
    .zoneName("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<VolumeCollection> response = vpcService.listVolumes(listVolumesOptionsModel).execute();
    assertNotNull(response);
    VolumeCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    assertEquals(query.get("start"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(query.get("name"), "testString");
    assertEquals(query.get("zone.name"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listVolumesPath);
  }

  @Test
  public void testCreateVolumeWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"iops\": 10000, \"capacity\": 100, \"id\": \"1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::volume:1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/volumes/1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"name\": \"my-volume\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"created_at\": \"2019-01-01T12:00:00\", \"encryption\": \"provider_managed\", \"encryption_key\": {\"crn\": \"crn:v1:bluemix:public:kms:us-south:a/dffc98a0f1f0f95f6613b3b752286b87:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179\"}, \"profile\": {\"name\": \"general-purpose\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/volume/profiles/general-purpose\"}, \"status\": \"available\", \"volume_attachments\": [{\"id\": \"82cbf856-9cbb-45fb-b62f-d7bcef32399a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/volume_attachments/82cbf856-9cbb-45fb-b62f-d7bcef32399a\", \"name\": \"my-volume-attachment\", \"delete_volume_on_instance_delete\": true, \"device\": {\"id\": \"80b3e36e-41f4-40e9-bd56-beae81792a68\"}, \"instance\": {\"id\": \"1e09281b-f177-46fb-baf1-bc152b2e391a\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::instance:1e09281b-f177-46fb-baf1-bc152b2e391a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a\", \"name\": \"my-instance\"}, \"type\": \"boot\"}], \"zone\": {\"name\": \"us-south-1\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/regions/us-south/zones/us-south-1\"}}";
    String createVolumePath = java.net.URLEncoder.encode("/volumes", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the VolumeProfileIdentityByName model
    VolumeProfileIdentityByName volumeProfileIdentityModel = new VolumeProfileIdentityByName.Builder()
    .name("general-purpose")
    .build();

    // Construct an instance of the EncryptionKeyIdentityByCRN model
    EncryptionKeyIdentityByCRN encryptionKeyIdentityModel = new EncryptionKeyIdentityByCRN.Builder()
    .crn("crn:v1:bluemix:public:kms:us-south:a/dffc98a0f1f0f95f6613b3b752286b87:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179")
    .build();

    // Construct an instance of the ResourceGroupIdentityById model
    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
    .id("fee82deba12e4c0fb69c3b09d1f12345")
    .build();

    // Construct an instance of the ZoneIdentityByName model
    ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
    .name("us-south-1")
    .build();

    // Construct an instance of the VolumePrototypeVolumeByCapacity model
    VolumePrototypeVolumeByCapacity volumePrototypeModel = new VolumePrototypeVolumeByCapacity.Builder()
    .name("my-volume")
    .profile(volumeProfileIdentityModel)
    .encryptionKey(encryptionKeyIdentityModel)
    .iops(Long.valueOf("10000"))
    .resourceGroup(resourceGroupIdentityModel)
    .zone(zoneIdentityModel)
    .capacity(Long.valueOf("100"))
    .build();

    // Construct an instance of the CreateVolumeOptions model
    CreateVolumeOptions createVolumeOptionsModel = new CreateVolumeOptions.Builder()
    .volumePrototype(volumePrototypeModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Volume> response = vpcService.createVolume(createVolumeOptionsModel).execute();
    assertNotNull(response);
    Volume responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createVolumePath);
  }

  // Test the createVolume operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateVolumeNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.createVolume(null).execute();
  }

  @Test
  public void testDeleteVolumeWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteVolumePath = java.net.URLEncoder.encode("/volumes/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteVolumeOptions model
    DeleteVolumeOptions deleteVolumeOptionsModel = new DeleteVolumeOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = vpcService.deleteVolume(deleteVolumeOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteVolumePath);
  }

  // Test the deleteVolume operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteVolumeNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.deleteVolume(null).execute();
  }

  @Test
  public void testGetVolumeWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"iops\": 10000, \"capacity\": 100, \"id\": \"1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::volume:1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/volumes/1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"name\": \"my-volume\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"created_at\": \"2019-01-01T12:00:00\", \"encryption\": \"provider_managed\", \"encryption_key\": {\"crn\": \"crn:v1:bluemix:public:kms:us-south:a/dffc98a0f1f0f95f6613b3b752286b87:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179\"}, \"profile\": {\"name\": \"general-purpose\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/volume/profiles/general-purpose\"}, \"status\": \"available\", \"volume_attachments\": [{\"id\": \"82cbf856-9cbb-45fb-b62f-d7bcef32399a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/volume_attachments/82cbf856-9cbb-45fb-b62f-d7bcef32399a\", \"name\": \"my-volume-attachment\", \"delete_volume_on_instance_delete\": true, \"device\": {\"id\": \"80b3e36e-41f4-40e9-bd56-beae81792a68\"}, \"instance\": {\"id\": \"1e09281b-f177-46fb-baf1-bc152b2e391a\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::instance:1e09281b-f177-46fb-baf1-bc152b2e391a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a\", \"name\": \"my-instance\"}, \"type\": \"boot\"}], \"zone\": {\"name\": \"us-south-1\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/regions/us-south/zones/us-south-1\"}}";
    String getVolumePath = java.net.URLEncoder.encode("/volumes/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetVolumeOptions model
    GetVolumeOptions getVolumeOptionsModel = new GetVolumeOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Volume> response = vpcService.getVolume(getVolumeOptionsModel).execute();
    assertNotNull(response);
    Volume responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getVolumePath);
  }

  // Test the getVolume operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetVolumeNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.getVolume(null).execute();
  }

  @Test
  public void testUpdateVolumeWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"iops\": 10000, \"capacity\": 100, \"id\": \"1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::volume:1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/volumes/1a6b7274-678d-4dfb-8981-c71dd9d4daa5\", \"name\": \"my-volume\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"created_at\": \"2019-01-01T12:00:00\", \"encryption\": \"provider_managed\", \"encryption_key\": {\"crn\": \"crn:v1:bluemix:public:kms:us-south:a/dffc98a0f1f0f95f6613b3b752286b87:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179\"}, \"profile\": {\"name\": \"general-purpose\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/volume/profiles/general-purpose\"}, \"status\": \"available\", \"volume_attachments\": [{\"id\": \"82cbf856-9cbb-45fb-b62f-d7bcef32399a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/volume_attachments/82cbf856-9cbb-45fb-b62f-d7bcef32399a\", \"name\": \"my-volume-attachment\", \"delete_volume_on_instance_delete\": true, \"device\": {\"id\": \"80b3e36e-41f4-40e9-bd56-beae81792a68\"}, \"instance\": {\"id\": \"1e09281b-f177-46fb-baf1-bc152b2e391a\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::instance:1e09281b-f177-46fb-baf1-bc152b2e391a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a\", \"name\": \"my-instance\"}, \"type\": \"boot\"}], \"zone\": {\"name\": \"us-south-1\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/regions/us-south/zones/us-south-1\"}}";
    String updateVolumePath = java.net.URLEncoder.encode("/volumes/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateVolumeOptions model
    UpdateVolumeOptions updateVolumeOptionsModel = new UpdateVolumeOptions.Builder()
    .id("testString")
    .name("my-volume")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Volume> response = vpcService.updateVolume(updateVolumeOptionsModel).execute();
    assertNotNull(response);
    Volume responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateVolumePath);
  }

  // Test the updateVolume operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateVolumeNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.updateVolume(null).execute();
  }

  @Test
  public void testListRegionsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"regions\": [{\"name\": \"us-south\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/regions/us-south\", \"endpoint\": \"endpoint\", \"status\": \"available\"}]}";
    String listRegionsPath = java.net.URLEncoder.encode("/regions", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListRegionsOptions model
    ListRegionsOptions listRegionsOptionsModel = new ListRegionsOptions();

    // Invoke operation with valid options model (positive test)
    Response<RegionCollection> response = vpcService.listRegions(listRegionsOptionsModel).execute();
    assertNotNull(response);
    RegionCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listRegionsPath);
  }

  @Test
  public void testGetRegionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"us-south\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/regions/us-south\", \"endpoint\": \"endpoint\", \"status\": \"available\"}";
    String getRegionPath = java.net.URLEncoder.encode("/regions/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetRegionOptions model
    GetRegionOptions getRegionOptionsModel = new GetRegionOptions.Builder()
    .name("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Region> response = vpcService.getRegion(getRegionOptionsModel).execute();
    assertNotNull(response);
    Region responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getRegionPath);
  }

  // Test the getRegion operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetRegionNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.getRegion(null).execute();
  }

  @Test
  public void testListRegionZonesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"zones\": [{\"name\": \"us-south-1\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/regions/us-south/zones/us-south-1\", \"region\": {\"name\": \"us-south\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/regions/us-south\"}, \"status\": \"available\"}]}";
    String listRegionZonesPath = java.net.URLEncoder.encode("/regions/testString/zones", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListRegionZonesOptions model
    ListRegionZonesOptions listRegionZonesOptionsModel = new ListRegionZonesOptions.Builder()
    .regionName("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ZoneCollection> response = vpcService.listRegionZones(listRegionZonesOptionsModel).execute();
    assertNotNull(response);
    ZoneCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listRegionZonesPath);
  }

  // Test the listRegionZones operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListRegionZonesNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.listRegionZones(null).execute();
  }

  @Test
  public void testGetRegionZoneWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"us-south-1\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/regions/us-south/zones/us-south-1\", \"region\": {\"name\": \"us-south\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/regions/us-south\"}, \"status\": \"available\"}";
    String getRegionZonePath = java.net.URLEncoder.encode("/regions/testString/zones/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetRegionZoneOptions model
    GetRegionZoneOptions getRegionZoneOptionsModel = new GetRegionZoneOptions.Builder()
    .regionName("testString")
    .zoneName("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Zone> response = vpcService.getRegionZone(getRegionZoneOptionsModel).execute();
    assertNotNull(response);
    Zone responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getRegionZonePath);
  }

  // Test the getRegionZone operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetRegionZoneNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.getRegionZone(null).execute();
  }

  @Test
  public void testListPublicGatewaysWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"first\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/public_gateways?limit=20\"}, \"limit\": 20, \"next\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/public_gateways?start=9d5a91a3e2cbd233b5a5b33436855ed1&limit=20\"}, \"total_count\": 132, \"public_gateways\": [{\"id\": \"dc5431ef-1fc6-4861-adc9-a59d077d1241\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::public-gateway:dc5431ef-1fc6-4861-adc9-a59d077d1241\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/public_gateways/dc5431ef-1fc6-4861-adc9-a59d077d1241\", \"name\": \"my-public-gateway\", \"resource_type\": \"public_gateway\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"created_at\": \"2019-01-01T12:00:00\", \"floating_ip\": {\"id\": \"39300233-9995-4806-89a5-3c1b6eb88689\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::floating-ip:39300233-9995-4806-89a5-3c1b6eb88689\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/floating_ips/39300233-9995-4806-89a5-3c1b6eb88689\", \"address\": \"203.0.113.1\", \"name\": \"my-floating-ip\"}, \"status\": \"available\", \"vpc\": {\"id\": \"4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"name\": \"my-vpc\"}, \"zone\": {\"name\": \"us-south-1\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/regions/us-south/zones/us-south-1\"}}]}";
    String listPublicGatewaysPath = java.net.URLEncoder.encode("/public_gateways", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListPublicGatewaysOptions model
    ListPublicGatewaysOptions listPublicGatewaysOptionsModel = new ListPublicGatewaysOptions.Builder()
    .start("testString")
    .limit(Long.valueOf("1"))
    .resourceGroupId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PublicGatewayCollection> response = vpcService.listPublicGateways(listPublicGatewaysOptionsModel).execute();
    assertNotNull(response);
    PublicGatewayCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    assertEquals(query.get("start"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(query.get("resource_group.id"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listPublicGatewaysPath);
  }

  @Test
  public void testCreatePublicGatewayWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"dc5431ef-1fc6-4861-adc9-a59d077d1241\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::public-gateway:dc5431ef-1fc6-4861-adc9-a59d077d1241\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/public_gateways/dc5431ef-1fc6-4861-adc9-a59d077d1241\", \"name\": \"my-public-gateway\", \"resource_type\": \"public_gateway\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"created_at\": \"2019-01-01T12:00:00\", \"floating_ip\": {\"id\": \"39300233-9995-4806-89a5-3c1b6eb88689\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::floating-ip:39300233-9995-4806-89a5-3c1b6eb88689\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/floating_ips/39300233-9995-4806-89a5-3c1b6eb88689\", \"address\": \"203.0.113.1\", \"name\": \"my-floating-ip\"}, \"status\": \"available\", \"vpc\": {\"id\": \"4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"name\": \"my-vpc\"}, \"zone\": {\"name\": \"us-south-1\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/regions/us-south/zones/us-south-1\"}}";
    String createPublicGatewayPath = java.net.URLEncoder.encode("/public_gateways", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the VPCIdentityById model
    VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
    .id("4727d842-f94f-4a2d-824a-9bc9b02c523b")
    .build();

    // Construct an instance of the ZoneIdentityByName model
    ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
    .name("us-south-1")
    .build();

    // Construct an instance of the PublicGatewayPrototypeFloatingIpFloatingIPIdentityFloatingIPIdentityById model
    PublicGatewayPrototypeFloatingIpFloatingIPIdentityFloatingIPIdentityById publicGatewayPrototypeFloatingIpModel = new PublicGatewayPrototypeFloatingIpFloatingIPIdentityFloatingIPIdentityById.Builder()
    .id("39300233-9995-4806-89a5-3c1b6eb88689")
    .build();

    // Construct an instance of the ResourceGroupIdentityById model
    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
    .id("fee82deba12e4c0fb69c3b09d1f12345")
    .build();

    // Construct an instance of the CreatePublicGatewayOptions model
    CreatePublicGatewayOptions createPublicGatewayOptionsModel = new CreatePublicGatewayOptions.Builder()
    .vpc(vpcIdentityModel)
    .zone(zoneIdentityModel)
    .name("my-public-gateway")
    .floatingIp(publicGatewayPrototypeFloatingIpModel)
    .resourceGroup(resourceGroupIdentityModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PublicGateway> response = vpcService.createPublicGateway(createPublicGatewayOptionsModel).execute();
    assertNotNull(response);
    PublicGateway responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createPublicGatewayPath);
  }

  // Test the createPublicGateway operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreatePublicGatewayNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.createPublicGateway(null).execute();
  }

  @Test
  public void testDeletePublicGatewayWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deletePublicGatewayPath = java.net.URLEncoder.encode("/public_gateways/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeletePublicGatewayOptions model
    DeletePublicGatewayOptions deletePublicGatewayOptionsModel = new DeletePublicGatewayOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = vpcService.deletePublicGateway(deletePublicGatewayOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deletePublicGatewayPath);
  }

  // Test the deletePublicGateway operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeletePublicGatewayNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.deletePublicGateway(null).execute();
  }

  @Test
  public void testGetPublicGatewayWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"dc5431ef-1fc6-4861-adc9-a59d077d1241\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::public-gateway:dc5431ef-1fc6-4861-adc9-a59d077d1241\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/public_gateways/dc5431ef-1fc6-4861-adc9-a59d077d1241\", \"name\": \"my-public-gateway\", \"resource_type\": \"public_gateway\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"created_at\": \"2019-01-01T12:00:00\", \"floating_ip\": {\"id\": \"39300233-9995-4806-89a5-3c1b6eb88689\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::floating-ip:39300233-9995-4806-89a5-3c1b6eb88689\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/floating_ips/39300233-9995-4806-89a5-3c1b6eb88689\", \"address\": \"203.0.113.1\", \"name\": \"my-floating-ip\"}, \"status\": \"available\", \"vpc\": {\"id\": \"4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"name\": \"my-vpc\"}, \"zone\": {\"name\": \"us-south-1\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/regions/us-south/zones/us-south-1\"}}";
    String getPublicGatewayPath = java.net.URLEncoder.encode("/public_gateways/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetPublicGatewayOptions model
    GetPublicGatewayOptions getPublicGatewayOptionsModel = new GetPublicGatewayOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PublicGateway> response = vpcService.getPublicGateway(getPublicGatewayOptionsModel).execute();
    assertNotNull(response);
    PublicGateway responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getPublicGatewayPath);
  }

  // Test the getPublicGateway operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetPublicGatewayNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.getPublicGateway(null).execute();
  }

  @Test
  public void testUpdatePublicGatewayWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"dc5431ef-1fc6-4861-adc9-a59d077d1241\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::public-gateway:dc5431ef-1fc6-4861-adc9-a59d077d1241\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/public_gateways/dc5431ef-1fc6-4861-adc9-a59d077d1241\", \"name\": \"my-public-gateway\", \"resource_type\": \"public_gateway\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"created_at\": \"2019-01-01T12:00:00\", \"floating_ip\": {\"id\": \"39300233-9995-4806-89a5-3c1b6eb88689\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::floating-ip:39300233-9995-4806-89a5-3c1b6eb88689\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/floating_ips/39300233-9995-4806-89a5-3c1b6eb88689\", \"address\": \"203.0.113.1\", \"name\": \"my-floating-ip\"}, \"status\": \"available\", \"vpc\": {\"id\": \"4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"name\": \"my-vpc\"}, \"zone\": {\"name\": \"us-south-1\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/regions/us-south/zones/us-south-1\"}}";
    String updatePublicGatewayPath = java.net.URLEncoder.encode("/public_gateways/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdatePublicGatewayOptions model
    UpdatePublicGatewayOptions updatePublicGatewayOptionsModel = new UpdatePublicGatewayOptions.Builder()
    .id("testString")
    .name("my-public-gateway")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PublicGateway> response = vpcService.updatePublicGateway(updatePublicGatewayOptionsModel).execute();
    assertNotNull(response);
    PublicGateway responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updatePublicGatewayPath);
  }

  // Test the updatePublicGateway operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdatePublicGatewayNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.updatePublicGateway(null).execute();
  }

  @Test
  public void testListFloatingIpsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"first\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/floating_ips?limit=20\"}, \"limit\": 20, \"next\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/floating_ips?start=9d5a91a3e2cbd233b5a5b33436855ed1&limit=20\"}, \"total_count\": 132, \"floating_ips\": [{\"id\": \"39300233-9995-4806-89a5-3c1b6eb88689\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::floating-ip:39300233-9995-4806-89a5-3c1b6eb88689\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/floating_ips/39300233-9995-4806-89a5-3c1b6eb88689\", \"address\": \"203.0.113.1\", \"name\": \"my-floating-ip\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"created_at\": \"2019-01-01T12:00:00\", \"status\": \"available\", \"target\": {\"name\": \"my-network-interface\", \"id\": \"10c02d81-0ecb-4dc5-897d-28392913b81e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/network_interfaces/10c02d81-0ecb-4dc5-897d-28392913b81e\", \"primary_ipv4_address\": \"192.168.3.4\", \"resource_type\": \"network_interface\"}, \"zone\": {\"name\": \"us-south-1\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/regions/us-south/zones/us-south-1\"}}]}";
    String listFloatingIpsPath = java.net.URLEncoder.encode("/floating_ips", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListFloatingIpsOptions model
    ListFloatingIpsOptions listFloatingIpsOptionsModel = new ListFloatingIpsOptions.Builder()
    .start("testString")
    .limit(Long.valueOf("1"))
    .resourceGroupId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<FloatingIPCollection> response = vpcService.listFloatingIps(listFloatingIpsOptionsModel).execute();
    assertNotNull(response);
    FloatingIPCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    assertEquals(query.get("start"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(query.get("resource_group.id"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listFloatingIpsPath);
  }

  @Test
  public void testCreateFloatingIpWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"39300233-9995-4806-89a5-3c1b6eb88689\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::floating-ip:39300233-9995-4806-89a5-3c1b6eb88689\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/floating_ips/39300233-9995-4806-89a5-3c1b6eb88689\", \"address\": \"203.0.113.1\", \"name\": \"my-floating-ip\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"created_at\": \"2019-01-01T12:00:00\", \"status\": \"available\", \"target\": {\"name\": \"my-network-interface\", \"id\": \"10c02d81-0ecb-4dc5-897d-28392913b81e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/network_interfaces/10c02d81-0ecb-4dc5-897d-28392913b81e\", \"primary_ipv4_address\": \"192.168.3.4\", \"resource_type\": \"network_interface\"}, \"zone\": {\"name\": \"us-south-1\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/regions/us-south/zones/us-south-1\"}}";
    String createFloatingIpPath = java.net.URLEncoder.encode("/floating_ips", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ResourceGroupIdentityById model
    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
    .id("fee82deba12e4c0fb69c3b09d1f12345")
    .build();

    // Construct an instance of the ZoneIdentityByName model
    ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
    .name("us-south-1")
    .build();

    // Construct an instance of the FloatingIPPrototypeFloatingIPByZone model
    FloatingIPPrototypeFloatingIPByZone floatingIpPrototypeModel = new FloatingIPPrototypeFloatingIPByZone.Builder()
    .name("my-floating-ip")
    .resourceGroup(resourceGroupIdentityModel)
    .zone(zoneIdentityModel)
    .build();

    // Construct an instance of the CreateFloatingIpOptions model
    CreateFloatingIpOptions createFloatingIpOptionsModel = new CreateFloatingIpOptions.Builder()
    .floatingIpPrototype(floatingIpPrototypeModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<FloatingIP> response = vpcService.createFloatingIp(createFloatingIpOptionsModel).execute();
    assertNotNull(response);
    FloatingIP responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createFloatingIpPath);
  }

  // Test the createFloatingIp operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateFloatingIpNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.createFloatingIp(null).execute();
  }

  @Test
  public void testDeleteFloatingIpWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteFloatingIpPath = java.net.URLEncoder.encode("/floating_ips/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteFloatingIpOptions model
    DeleteFloatingIpOptions deleteFloatingIpOptionsModel = new DeleteFloatingIpOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = vpcService.deleteFloatingIp(deleteFloatingIpOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteFloatingIpPath);
  }

  // Test the deleteFloatingIp operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteFloatingIpNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.deleteFloatingIp(null).execute();
  }

  @Test
  public void testGetFloatingIpWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"39300233-9995-4806-89a5-3c1b6eb88689\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::floating-ip:39300233-9995-4806-89a5-3c1b6eb88689\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/floating_ips/39300233-9995-4806-89a5-3c1b6eb88689\", \"address\": \"203.0.113.1\", \"name\": \"my-floating-ip\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"created_at\": \"2019-01-01T12:00:00\", \"status\": \"available\", \"target\": {\"name\": \"my-network-interface\", \"id\": \"10c02d81-0ecb-4dc5-897d-28392913b81e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/network_interfaces/10c02d81-0ecb-4dc5-897d-28392913b81e\", \"primary_ipv4_address\": \"192.168.3.4\", \"resource_type\": \"network_interface\"}, \"zone\": {\"name\": \"us-south-1\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/regions/us-south/zones/us-south-1\"}}";
    String getFloatingIpPath = java.net.URLEncoder.encode("/floating_ips/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetFloatingIpOptions model
    GetFloatingIpOptions getFloatingIpOptionsModel = new GetFloatingIpOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<FloatingIP> response = vpcService.getFloatingIp(getFloatingIpOptionsModel).execute();
    assertNotNull(response);
    FloatingIP responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getFloatingIpPath);
  }

  // Test the getFloatingIp operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetFloatingIpNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.getFloatingIp(null).execute();
  }

  @Test
  public void testUpdateFloatingIpWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"39300233-9995-4806-89a5-3c1b6eb88689\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::floating-ip:39300233-9995-4806-89a5-3c1b6eb88689\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/floating_ips/39300233-9995-4806-89a5-3c1b6eb88689\", \"address\": \"203.0.113.1\", \"name\": \"my-floating-ip\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"created_at\": \"2019-01-01T12:00:00\", \"status\": \"available\", \"target\": {\"name\": \"my-network-interface\", \"id\": \"10c02d81-0ecb-4dc5-897d-28392913b81e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/network_interfaces/10c02d81-0ecb-4dc5-897d-28392913b81e\", \"primary_ipv4_address\": \"192.168.3.4\", \"resource_type\": \"network_interface\"}, \"zone\": {\"name\": \"us-south-1\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/regions/us-south/zones/us-south-1\"}}";
    String updateFloatingIpPath = java.net.URLEncoder.encode("/floating_ips/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the FloatingIPPatchTargetNetworkInterfaceIdentityNetworkInterfaceIdentityById model
    FloatingIPPatchTargetNetworkInterfaceIdentityNetworkInterfaceIdentityById floatingIpPatchTargetNetworkInterfaceIdentityModel = new FloatingIPPatchTargetNetworkInterfaceIdentityNetworkInterfaceIdentityById.Builder()
    .id("10c02d81-0ecb-4dc5-897d-28392913b81e")
    .build();

    // Construct an instance of the UpdateFloatingIpOptions model
    UpdateFloatingIpOptions updateFloatingIpOptionsModel = new UpdateFloatingIpOptions.Builder()
    .id("testString")
    .name("my-floating-ip")
    .target(floatingIpPatchTargetNetworkInterfaceIdentityModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<FloatingIP> response = vpcService.updateFloatingIp(updateFloatingIpOptionsModel).execute();
    assertNotNull(response);
    FloatingIP responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateFloatingIpPath);
  }

  // Test the updateFloatingIp operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateFloatingIpNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.updateFloatingIp(null).execute();
  }

  @Test
  public void testListNetworkAclsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"first\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/network_acls?limit=20\"}, \"limit\": 20, \"next\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/network_acls?start=9d5a91a3e2cbd233b5a5b33436855ed1&limit=20\"}, \"total_count\": 132, \"network_acls\": [{\"id\": \"a4e28308-8ee7-46ab-8108-9f881f22bdbf\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::network-acl:a4e28308-8ee7-46ab-8108-9f881f22bdbf\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/network_acls/a4e28308-8ee7-46ab-8108-9f881f22bdbf\", \"name\": \"my-network-acl\", \"vpc\": {\"id\": \"4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"name\": \"my-vpc\"}, \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"created_at\": \"2019-01-01T12:00:00\", \"rules\": [{\"id\": \"8daca77a-4980-4d33-8f3e-7038797be8f9\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/network_acls/a4e28308-8ee7-46ab-8108-9f881f22bdbf/rules/8daca77a-4980-4d33-8f3e-7038797be8f9\", \"name\": \"my-rule-2\", \"action\": \"allow\", \"destination\": \"192.168.3.0/24\", \"direction\": \"inbound\", \"source\": \"192.168.3.0/24\", \"protocol\": \"udp\", \"before\": {\"id\": \"8daca77a-4980-4d33-8f3e-7038797be8f9\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/network_acls/a4e28308-8ee7-46ab-8108-9f881f22bdbf/rules/8daca77a-4980-4d33-8f3e-7038797be8f9\", \"name\": \"my-rule-1\"}, \"created_at\": \"2019-01-01T12:00:00\", \"ip_version\": \"ipv4\", \"destination_port_max\": 22, \"destination_port_min\": 22, \"source_port_max\": 65535, \"source_port_min\": 49152}], \"subnets\": [{\"id\": \"7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::subnet:7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/subnets/7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"name\": \"my-subnet\"}]}]}";
    String listNetworkAclsPath = java.net.URLEncoder.encode("/network_acls", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListNetworkAclsOptions model
    ListNetworkAclsOptions listNetworkAclsOptionsModel = new ListNetworkAclsOptions.Builder()
    .start("testString")
    .limit(Long.valueOf("1"))
    .resourceGroupId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<NetworkACLCollection> response = vpcService.listNetworkAcls(listNetworkAclsOptionsModel).execute();
    assertNotNull(response);
    NetworkACLCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    assertEquals(query.get("start"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(query.get("resource_group.id"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listNetworkAclsPath);
  }

  @Test
  public void testCreateNetworkAclWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"a4e28308-8ee7-46ab-8108-9f881f22bdbf\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::network-acl:a4e28308-8ee7-46ab-8108-9f881f22bdbf\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/network_acls/a4e28308-8ee7-46ab-8108-9f881f22bdbf\", \"name\": \"my-network-acl\", \"vpc\": {\"id\": \"4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"name\": \"my-vpc\"}, \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"created_at\": \"2019-01-01T12:00:00\", \"rules\": [{\"id\": \"8daca77a-4980-4d33-8f3e-7038797be8f9\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/network_acls/a4e28308-8ee7-46ab-8108-9f881f22bdbf/rules/8daca77a-4980-4d33-8f3e-7038797be8f9\", \"name\": \"my-rule-2\", \"action\": \"allow\", \"destination\": \"192.168.3.0/24\", \"direction\": \"inbound\", \"source\": \"192.168.3.0/24\", \"protocol\": \"udp\", \"before\": {\"id\": \"8daca77a-4980-4d33-8f3e-7038797be8f9\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/network_acls/a4e28308-8ee7-46ab-8108-9f881f22bdbf/rules/8daca77a-4980-4d33-8f3e-7038797be8f9\", \"name\": \"my-rule-1\"}, \"created_at\": \"2019-01-01T12:00:00\", \"ip_version\": \"ipv4\", \"destination_port_max\": 22, \"destination_port_min\": 22, \"source_port_max\": 65535, \"source_port_min\": 49152}], \"subnets\": [{\"id\": \"7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::subnet:7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/subnets/7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"name\": \"my-subnet\"}]}";
    String createNetworkAclPath = java.net.URLEncoder.encode("/network_acls", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the VPCIdentityById model
    VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
    .id("cf7cd5a-2f30-4336-a495-6addc820cd61")
    .build();

    // Construct an instance of the ResourceGroupIdentityById model
    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
    .id("fee82deba12e4c0fb69c3b09d1f12345")
    .build();

    // Construct an instance of the NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAll model
    NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAll networkAclRulePrototypeNetworkAclContextModel = new NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAll.Builder()
    .name("my-rule-2")
    .action("allow")
    .destination("192.168.3.2/32")
    .direction("inbound")
    .source("192.168.3.2/32")
    .protocol("all")
    .build();

    // Construct an instance of the NetworkACLPrototypeNetworkACLByRules model
    NetworkACLPrototypeNetworkACLByRules networkAclPrototypeModel = new NetworkACLPrototypeNetworkACLByRules.Builder()
    .name("my-network-acl")
    .vpc(vpcIdentityModel)
    .resourceGroup(resourceGroupIdentityModel)
    .rules(new java.util.ArrayList<NetworkACLRulePrototypeNetworkACLContext>(java.util.Arrays.asList(networkAclRulePrototypeNetworkAclContextModel)))
    .build();

    // Construct an instance of the CreateNetworkAclOptions model
    CreateNetworkAclOptions createNetworkAclOptionsModel = new CreateNetworkAclOptions.Builder()
    .networkAclPrototype(networkAclPrototypeModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<NetworkACL> response = vpcService.createNetworkAcl(createNetworkAclOptionsModel).execute();
    assertNotNull(response);
    NetworkACL responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createNetworkAclPath);
  }

  @Test
  public void testDeleteNetworkAclWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteNetworkAclPath = java.net.URLEncoder.encode("/network_acls/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteNetworkAclOptions model
    DeleteNetworkAclOptions deleteNetworkAclOptionsModel = new DeleteNetworkAclOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = vpcService.deleteNetworkAcl(deleteNetworkAclOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteNetworkAclPath);
  }

  // Test the deleteNetworkAcl operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteNetworkAclNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.deleteNetworkAcl(null).execute();
  }

  @Test
  public void testGetNetworkAclWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"a4e28308-8ee7-46ab-8108-9f881f22bdbf\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::network-acl:a4e28308-8ee7-46ab-8108-9f881f22bdbf\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/network_acls/a4e28308-8ee7-46ab-8108-9f881f22bdbf\", \"name\": \"my-network-acl\", \"vpc\": {\"id\": \"4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"name\": \"my-vpc\"}, \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"created_at\": \"2019-01-01T12:00:00\", \"rules\": [{\"id\": \"8daca77a-4980-4d33-8f3e-7038797be8f9\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/network_acls/a4e28308-8ee7-46ab-8108-9f881f22bdbf/rules/8daca77a-4980-4d33-8f3e-7038797be8f9\", \"name\": \"my-rule-2\", \"action\": \"allow\", \"destination\": \"192.168.3.0/24\", \"direction\": \"inbound\", \"source\": \"192.168.3.0/24\", \"protocol\": \"udp\", \"before\": {\"id\": \"8daca77a-4980-4d33-8f3e-7038797be8f9\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/network_acls/a4e28308-8ee7-46ab-8108-9f881f22bdbf/rules/8daca77a-4980-4d33-8f3e-7038797be8f9\", \"name\": \"my-rule-1\"}, \"created_at\": \"2019-01-01T12:00:00\", \"ip_version\": \"ipv4\", \"destination_port_max\": 22, \"destination_port_min\": 22, \"source_port_max\": 65535, \"source_port_min\": 49152}], \"subnets\": [{\"id\": \"7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::subnet:7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/subnets/7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"name\": \"my-subnet\"}]}";
    String getNetworkAclPath = java.net.URLEncoder.encode("/network_acls/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetNetworkAclOptions model
    GetNetworkAclOptions getNetworkAclOptionsModel = new GetNetworkAclOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<NetworkACL> response = vpcService.getNetworkAcl(getNetworkAclOptionsModel).execute();
    assertNotNull(response);
    NetworkACL responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getNetworkAclPath);
  }

  // Test the getNetworkAcl operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetNetworkAclNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.getNetworkAcl(null).execute();
  }

  @Test
  public void testUpdateNetworkAclWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"a4e28308-8ee7-46ab-8108-9f881f22bdbf\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::network-acl:a4e28308-8ee7-46ab-8108-9f881f22bdbf\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/network_acls/a4e28308-8ee7-46ab-8108-9f881f22bdbf\", \"name\": \"my-network-acl\", \"vpc\": {\"id\": \"4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"name\": \"my-vpc\"}, \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"created_at\": \"2019-01-01T12:00:00\", \"rules\": [{\"id\": \"8daca77a-4980-4d33-8f3e-7038797be8f9\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/network_acls/a4e28308-8ee7-46ab-8108-9f881f22bdbf/rules/8daca77a-4980-4d33-8f3e-7038797be8f9\", \"name\": \"my-rule-2\", \"action\": \"allow\", \"destination\": \"192.168.3.0/24\", \"direction\": \"inbound\", \"source\": \"192.168.3.0/24\", \"protocol\": \"udp\", \"before\": {\"id\": \"8daca77a-4980-4d33-8f3e-7038797be8f9\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/network_acls/a4e28308-8ee7-46ab-8108-9f881f22bdbf/rules/8daca77a-4980-4d33-8f3e-7038797be8f9\", \"name\": \"my-rule-1\"}, \"created_at\": \"2019-01-01T12:00:00\", \"ip_version\": \"ipv4\", \"destination_port_max\": 22, \"destination_port_min\": 22, \"source_port_max\": 65535, \"source_port_min\": 49152}], \"subnets\": [{\"id\": \"7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::subnet:7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/subnets/7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"name\": \"my-subnet\"}]}";
    String updateNetworkAclPath = java.net.URLEncoder.encode("/network_acls/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateNetworkAclOptions model
    UpdateNetworkAclOptions updateNetworkAclOptionsModel = new UpdateNetworkAclOptions.Builder()
    .id("testString")
    .name("my-network-acl")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<NetworkACL> response = vpcService.updateNetworkAcl(updateNetworkAclOptionsModel).execute();
    assertNotNull(response);
    NetworkACL responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateNetworkAclPath);
  }

  // Test the updateNetworkAcl operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateNetworkAclNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.updateNetworkAcl(null).execute();
  }

  @Test
  public void testListNetworkAclRulesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"first\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/network_acls/a4e28308-8ee7-46ab-8108-9f881f22bdbf/rules?limit=20\"}, \"limit\": 20, \"next\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/network_acls/a4e28308-8ee7-46ab-8108-9f881f22bdbf/rules?start=9d5a91a3e2cbd233b5a5b33436855ed1&limit=20\"}, \"total_count\": 132, \"rules\": [{\"id\": \"8daca77a-4980-4d33-8f3e-7038797be8f9\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/network_acls/a4e28308-8ee7-46ab-8108-9f881f22bdbf/rules/8daca77a-4980-4d33-8f3e-7038797be8f9\", \"name\": \"my-rule-2\", \"action\": \"allow\", \"destination\": \"192.168.3.0/24\", \"direction\": \"inbound\", \"source\": \"192.168.3.0/24\", \"protocol\": \"udp\", \"before\": {\"id\": \"8daca77a-4980-4d33-8f3e-7038797be8f9\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/network_acls/a4e28308-8ee7-46ab-8108-9f881f22bdbf/rules/8daca77a-4980-4d33-8f3e-7038797be8f9\", \"name\": \"my-rule-1\"}, \"created_at\": \"2019-01-01T12:00:00\", \"ip_version\": \"ipv4\", \"destination_port_max\": 22, \"destination_port_min\": 22, \"source_port_max\": 65535, \"source_port_min\": 49152}]}";
    String listNetworkAclRulesPath = java.net.URLEncoder.encode("/network_acls/testString/rules", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListNetworkAclRulesOptions model
    ListNetworkAclRulesOptions listNetworkAclRulesOptionsModel = new ListNetworkAclRulesOptions.Builder()
    .networkAclId("testString")
    .start("testString")
    .limit(Long.valueOf("1"))
    .direction("inbound")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<NetworkACLRuleCollection> response = vpcService.listNetworkAclRules(listNetworkAclRulesOptionsModel).execute();
    assertNotNull(response);
    NetworkACLRuleCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    assertEquals(query.get("start"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(query.get("direction"), "inbound");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listNetworkAclRulesPath);
  }

  // Test the listNetworkAclRules operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListNetworkAclRulesNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.listNetworkAclRules(null).execute();
  }

  @Test
  public void testCreateNetworkAclRuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"8daca77a-4980-4d33-8f3e-7038797be8f9\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/network_acls/a4e28308-8ee7-46ab-8108-9f881f22bdbf/rules/8daca77a-4980-4d33-8f3e-7038797be8f9\", \"name\": \"my-rule-2\", \"action\": \"allow\", \"destination\": \"192.168.3.0/24\", \"direction\": \"inbound\", \"source\": \"192.168.3.0/24\", \"protocol\": \"all\", \"before\": {\"id\": \"8daca77a-4980-4d33-8f3e-7038797be8f9\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/network_acls/a4e28308-8ee7-46ab-8108-9f881f22bdbf/rules/8daca77a-4980-4d33-8f3e-7038797be8f9\", \"name\": \"my-rule-1\"}, \"created_at\": \"2019-01-01T12:00:00\", \"ip_version\": \"ipv4\"}";
    String createNetworkAclRulePath = java.net.URLEncoder.encode("/network_acls/testString/rules", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the NetworkACLRuleIdentityById model
    NetworkACLRuleIdentityById networkAclRuleIdentityModel = new NetworkACLRuleIdentityById.Builder()
    .id("8daca77a-4980-4d33-8f3e-7038797be8f9")
    .build();

    // Construct an instance of the NetworkACLRulePrototypeNetworkACLRuleProtocolICMP model
    NetworkACLRulePrototypeNetworkACLRuleProtocolICMP networkAclRulePrototypeModel = new NetworkACLRulePrototypeNetworkACLRuleProtocolICMP.Builder()
    .name("my-rule-2")
    .action("allow")
    .destination("192.168.3.2/32")
    .direction("inbound")
    .source("192.168.3.2/32")
    .protocol("icmp")
    .before(networkAclRuleIdentityModel)
    .code(Long.valueOf("0"))
    .type(Long.valueOf("8"))
    .build();

    // Construct an instance of the CreateNetworkAclRuleOptions model
    CreateNetworkAclRuleOptions createNetworkAclRuleOptionsModel = new CreateNetworkAclRuleOptions.Builder()
    .networkAclId("testString")
    .networkAclRulePrototype(networkAclRulePrototypeModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<NetworkACLRule> response = vpcService.createNetworkAclRule(createNetworkAclRuleOptionsModel).execute();
    assertNotNull(response);
    NetworkACLRule responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createNetworkAclRulePath);
  }

  // Test the createNetworkAclRule operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateNetworkAclRuleNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.createNetworkAclRule(null).execute();
  }

  @Test
  public void testDeleteNetworkAclRuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteNetworkAclRulePath = java.net.URLEncoder.encode("/network_acls/testString/rules/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteNetworkAclRuleOptions model
    DeleteNetworkAclRuleOptions deleteNetworkAclRuleOptionsModel = new DeleteNetworkAclRuleOptions.Builder()
    .networkAclId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = vpcService.deleteNetworkAclRule(deleteNetworkAclRuleOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteNetworkAclRulePath);
  }

  // Test the deleteNetworkAclRule operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteNetworkAclRuleNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.deleteNetworkAclRule(null).execute();
  }

  @Test
  public void testGetNetworkAclRuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"8daca77a-4980-4d33-8f3e-7038797be8f9\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/network_acls/a4e28308-8ee7-46ab-8108-9f881f22bdbf/rules/8daca77a-4980-4d33-8f3e-7038797be8f9\", \"name\": \"my-rule-2\", \"action\": \"allow\", \"destination\": \"192.168.3.0/24\", \"direction\": \"inbound\", \"source\": \"192.168.3.0/24\", \"protocol\": \"all\", \"before\": {\"id\": \"8daca77a-4980-4d33-8f3e-7038797be8f9\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/network_acls/a4e28308-8ee7-46ab-8108-9f881f22bdbf/rules/8daca77a-4980-4d33-8f3e-7038797be8f9\", \"name\": \"my-rule-1\"}, \"created_at\": \"2019-01-01T12:00:00\", \"ip_version\": \"ipv4\"}";
    String getNetworkAclRulePath = java.net.URLEncoder.encode("/network_acls/testString/rules/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetNetworkAclRuleOptions model
    GetNetworkAclRuleOptions getNetworkAclRuleOptionsModel = new GetNetworkAclRuleOptions.Builder()
    .networkAclId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<NetworkACLRule> response = vpcService.getNetworkAclRule(getNetworkAclRuleOptionsModel).execute();
    assertNotNull(response);
    NetworkACLRule responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getNetworkAclRulePath);
  }

  // Test the getNetworkAclRule operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetNetworkAclRuleNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.getNetworkAclRule(null).execute();
  }

  @Test
  public void testUpdateNetworkAclRuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"8daca77a-4980-4d33-8f3e-7038797be8f9\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/network_acls/a4e28308-8ee7-46ab-8108-9f881f22bdbf/rules/8daca77a-4980-4d33-8f3e-7038797be8f9\", \"name\": \"my-rule-2\", \"action\": \"allow\", \"destination\": \"192.168.3.0/24\", \"direction\": \"inbound\", \"source\": \"192.168.3.0/24\", \"protocol\": \"all\", \"before\": {\"id\": \"8daca77a-4980-4d33-8f3e-7038797be8f9\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/network_acls/a4e28308-8ee7-46ab-8108-9f881f22bdbf/rules/8daca77a-4980-4d33-8f3e-7038797be8f9\", \"name\": \"my-rule-1\"}, \"created_at\": \"2019-01-01T12:00:00\", \"ip_version\": \"ipv4\"}";
    String updateNetworkAclRulePath = java.net.URLEncoder.encode("/network_acls/testString/rules/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the NetworkACLRuleIdentityById model
    NetworkACLRuleIdentityById networkAclRuleIdentityModel = new NetworkACLRuleIdentityById.Builder()
    .id("8daca77a-4980-4d33-8f3e-7038797be8f9")
    .build();

    // Construct an instance of the UpdateNetworkAclRuleOptions model
    UpdateNetworkAclRuleOptions updateNetworkAclRuleOptionsModel = new UpdateNetworkAclRuleOptions.Builder()
    .networkAclId("testString")
    .id("testString")
    .name("my-rule-2")
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
    .before(networkAclRuleIdentityModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<NetworkACLRule> response = vpcService.updateNetworkAclRule(updateNetworkAclRuleOptionsModel).execute();
    assertNotNull(response);
    NetworkACLRule responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateNetworkAclRulePath);
  }

  // Test the updateNetworkAclRule operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateNetworkAclRuleNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.updateNetworkAclRule(null).execute();
  }

  @Test
  public void testListSecurityGroupsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"first\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/security_groups?limit=20\"}, \"limit\": 20, \"next\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/security_groups?start=9d5a91a3e2cbd233b5a5b33436855ed1&limit=20\"}, \"total_count\": 132, \"security_groups\": [{\"id\": \"be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::security-group:be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/security_groups/be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"name\": \"my-security-group\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"created_at\": \"2019-01-01T12:00:00\", \"network_interfaces\": [{\"name\": \"my-network-interface\", \"id\": \"10c02d81-0ecb-4dc5-897d-28392913b81e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/network_interfaces/10c02d81-0ecb-4dc5-897d-28392913b81e\", \"primary_ipv4_address\": \"192.168.3.4\", \"resource_type\": \"network_interface\"}], \"rules\": [{\"id\": \"6f2a6efe-21e2-401c-b237-620aa26ba16a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/security_groups/be5df5ca-12a0-494b-907e-aa6ec2bfa271/rules/6f2a6efe-21e2-401c-b237-620aa26ba16a\", \"direction\": \"inbound\", \"ip_version\": \"ipv4\", \"protocol\": \"udp\", \"remote\": {\"address\": \"192.168.3.4\"}, \"port_max\": 22, \"port_min\": 22}], \"vpc\": {\"id\": \"4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"name\": \"my-vpc\"}}]}";
    String listSecurityGroupsPath = java.net.URLEncoder.encode("/security_groups", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListSecurityGroupsOptions model
    ListSecurityGroupsOptions listSecurityGroupsOptionsModel = new ListSecurityGroupsOptions.Builder()
    .start("testString")
    .limit(Long.valueOf("1"))
    .resourceGroupId("testString")
    .vpcId("testString")
    .vpcCrn("testString")
    .vpcName("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<SecurityGroupCollection> response = vpcService.listSecurityGroups(listSecurityGroupsOptionsModel).execute();
    assertNotNull(response);
    SecurityGroupCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    assertEquals(query.get("start"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(query.get("resource_group.id"), "testString");
    assertEquals(query.get("vpc.id"), "testString");
    assertEquals(query.get("vpc.crn"), "testString");
    assertEquals(query.get("vpc.name"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listSecurityGroupsPath);
  }

  @Test
  public void testCreateSecurityGroupWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::security-group:be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/security_groups/be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"name\": \"my-security-group\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"created_at\": \"2019-01-01T12:00:00\", \"network_interfaces\": [{\"name\": \"my-network-interface\", \"id\": \"10c02d81-0ecb-4dc5-897d-28392913b81e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/network_interfaces/10c02d81-0ecb-4dc5-897d-28392913b81e\", \"primary_ipv4_address\": \"192.168.3.4\", \"resource_type\": \"network_interface\"}], \"rules\": [{\"id\": \"6f2a6efe-21e2-401c-b237-620aa26ba16a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/security_groups/be5df5ca-12a0-494b-907e-aa6ec2bfa271/rules/6f2a6efe-21e2-401c-b237-620aa26ba16a\", \"direction\": \"inbound\", \"ip_version\": \"ipv4\", \"protocol\": \"udp\", \"remote\": {\"address\": \"192.168.3.4\"}, \"port_max\": 22, \"port_min\": 22}], \"vpc\": {\"id\": \"4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"name\": \"my-vpc\"}}";
    String createSecurityGroupPath = java.net.URLEncoder.encode("/security_groups", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the VPCIdentityById model
    VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
    .id("4727d842-f94f-4a2d-824a-9bc9b02c523b")
    .build();

    // Construct an instance of the ResourceGroupIdentityById model
    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
    .id("fee82deba12e4c0fb69c3b09d1f12345")
    .build();

    // Construct an instance of the SecurityGroupRulePrototypeRemoteIP model
    SecurityGroupRulePrototypeRemoteIP securityGroupRulePrototypeRemoteModel = new SecurityGroupRulePrototypeRemoteIP.Builder()
    .address("192.168.3.4")
    .build();

    // Construct an instance of the SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP model
    SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP securityGroupRulePrototypeModel = new SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP.Builder()
    .direction("inbound")
    .ipVersion("ipv4")
    .protocol("icmp")
    .remote(securityGroupRulePrototypeRemoteModel)
    .code(Long.valueOf("0"))
    .type(Long.valueOf("8"))
    .build();

    // Construct an instance of the CreateSecurityGroupOptions model
    CreateSecurityGroupOptions createSecurityGroupOptionsModel = new CreateSecurityGroupOptions.Builder()
    .vpc(vpcIdentityModel)
    .name("my-security-group")
    .resourceGroup(resourceGroupIdentityModel)
    .rules(new java.util.ArrayList<SecurityGroupRulePrototype>(java.util.Arrays.asList(securityGroupRulePrototypeModel)))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<SecurityGroup> response = vpcService.createSecurityGroup(createSecurityGroupOptionsModel).execute();
    assertNotNull(response);
    SecurityGroup responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createSecurityGroupPath);
  }

  // Test the createSecurityGroup operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateSecurityGroupNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.createSecurityGroup(null).execute();
  }

  @Test
  public void testDeleteSecurityGroupWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteSecurityGroupPath = java.net.URLEncoder.encode("/security_groups/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteSecurityGroupOptions model
    DeleteSecurityGroupOptions deleteSecurityGroupOptionsModel = new DeleteSecurityGroupOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = vpcService.deleteSecurityGroup(deleteSecurityGroupOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteSecurityGroupPath);
  }

  // Test the deleteSecurityGroup operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteSecurityGroupNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.deleteSecurityGroup(null).execute();
  }

  @Test
  public void testGetSecurityGroupWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::security-group:be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/security_groups/be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"name\": \"my-security-group\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"created_at\": \"2019-01-01T12:00:00\", \"network_interfaces\": [{\"name\": \"my-network-interface\", \"id\": \"10c02d81-0ecb-4dc5-897d-28392913b81e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/network_interfaces/10c02d81-0ecb-4dc5-897d-28392913b81e\", \"primary_ipv4_address\": \"192.168.3.4\", \"resource_type\": \"network_interface\"}], \"rules\": [{\"id\": \"6f2a6efe-21e2-401c-b237-620aa26ba16a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/security_groups/be5df5ca-12a0-494b-907e-aa6ec2bfa271/rules/6f2a6efe-21e2-401c-b237-620aa26ba16a\", \"direction\": \"inbound\", \"ip_version\": \"ipv4\", \"protocol\": \"udp\", \"remote\": {\"address\": \"192.168.3.4\"}, \"port_max\": 22, \"port_min\": 22}], \"vpc\": {\"id\": \"4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"name\": \"my-vpc\"}}";
    String getSecurityGroupPath = java.net.URLEncoder.encode("/security_groups/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetSecurityGroupOptions model
    GetSecurityGroupOptions getSecurityGroupOptionsModel = new GetSecurityGroupOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<SecurityGroup> response = vpcService.getSecurityGroup(getSecurityGroupOptionsModel).execute();
    assertNotNull(response);
    SecurityGroup responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSecurityGroupPath);
  }

  // Test the getSecurityGroup operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSecurityGroupNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.getSecurityGroup(null).execute();
  }

  @Test
  public void testUpdateSecurityGroupWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::security-group:be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/security_groups/be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"name\": \"my-security-group\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"created_at\": \"2019-01-01T12:00:00\", \"network_interfaces\": [{\"name\": \"my-network-interface\", \"id\": \"10c02d81-0ecb-4dc5-897d-28392913b81e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/network_interfaces/10c02d81-0ecb-4dc5-897d-28392913b81e\", \"primary_ipv4_address\": \"192.168.3.4\", \"resource_type\": \"network_interface\"}], \"rules\": [{\"id\": \"6f2a6efe-21e2-401c-b237-620aa26ba16a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/security_groups/be5df5ca-12a0-494b-907e-aa6ec2bfa271/rules/6f2a6efe-21e2-401c-b237-620aa26ba16a\", \"direction\": \"inbound\", \"ip_version\": \"ipv4\", \"protocol\": \"udp\", \"remote\": {\"address\": \"192.168.3.4\"}, \"port_max\": 22, \"port_min\": 22}], \"vpc\": {\"id\": \"4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"name\": \"my-vpc\"}}";
    String updateSecurityGroupPath = java.net.URLEncoder.encode("/security_groups/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateSecurityGroupOptions model
    UpdateSecurityGroupOptions updateSecurityGroupOptionsModel = new UpdateSecurityGroupOptions.Builder()
    .id("testString")
    .name("my-security-group")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<SecurityGroup> response = vpcService.updateSecurityGroup(updateSecurityGroupOptionsModel).execute();
    assertNotNull(response);
    SecurityGroup responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateSecurityGroupPath);
  }

  // Test the updateSecurityGroup operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateSecurityGroupNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.updateSecurityGroup(null).execute();
  }

  @Test
  public void testListSecurityGroupNetworkInterfacesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"first\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/3b2669a2-4c2b-4003-bc91-1b81f1326267/network_interfaces?limit=20\"}, \"limit\": 20, \"next\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/3b2669a2-4c2b-4003-bc91-1b81f1326267/network_interfaces?start=d3e721fd-c988-4670-9927-dbd5e7b07fc6&limit=20\"}, \"total_count\": 132, \"network_interfaces\": [{\"name\": \"my-network-interface\", \"id\": \"10c02d81-0ecb-4dc5-897d-28392913b81e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/network_interfaces/10c02d81-0ecb-4dc5-897d-28392913b81e\", \"primary_ipv4_address\": \"192.168.3.4\", \"resource_type\": \"network_interface\", \"security_groups\": [{\"id\": \"be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::security-group:be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/security_groups/be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"name\": \"my-security-group\"}], \"created_at\": \"2019-01-01T12:00:00\", \"floating_ips\": [{\"id\": \"39300233-9995-4806-89a5-3c1b6eb88689\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::floating-ip:39300233-9995-4806-89a5-3c1b6eb88689\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/floating_ips/39300233-9995-4806-89a5-3c1b6eb88689\", \"address\": \"203.0.113.1\", \"name\": \"my-floating-ip\"}], \"port_speed\": 1000, \"status\": \"available\", \"subnet\": {\"id\": \"7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::subnet:7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/subnets/7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"name\": \"my-subnet\"}, \"type\": \"primary\"}]}";
    String listSecurityGroupNetworkInterfacesPath = java.net.URLEncoder.encode("/security_groups/testString/network_interfaces", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListSecurityGroupNetworkInterfacesOptions model
    ListSecurityGroupNetworkInterfacesOptions listSecurityGroupNetworkInterfacesOptionsModel = new ListSecurityGroupNetworkInterfacesOptions.Builder()
    .securityGroupId("testString")
    .start("testString")
    .limit(Long.valueOf("1"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<NetworkInterfaceCollection> response = vpcService.listSecurityGroupNetworkInterfaces(listSecurityGroupNetworkInterfacesOptionsModel).execute();
    assertNotNull(response);
    NetworkInterfaceCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    assertEquals(query.get("start"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listSecurityGroupNetworkInterfacesPath);
  }

  // Test the listSecurityGroupNetworkInterfaces operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListSecurityGroupNetworkInterfacesNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.listSecurityGroupNetworkInterfaces(null).execute();
  }

  @Test
  public void testRemoveSecurityGroupNetworkInterfaceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String removeSecurityGroupNetworkInterfacePath = java.net.URLEncoder.encode("/security_groups/testString/network_interfaces/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the RemoveSecurityGroupNetworkInterfaceOptions model
    RemoveSecurityGroupNetworkInterfaceOptions removeSecurityGroupNetworkInterfaceOptionsModel = new RemoveSecurityGroupNetworkInterfaceOptions.Builder()
    .securityGroupId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = vpcService.removeSecurityGroupNetworkInterface(removeSecurityGroupNetworkInterfaceOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, removeSecurityGroupNetworkInterfacePath);
  }

  // Test the removeSecurityGroupNetworkInterface operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRemoveSecurityGroupNetworkInterfaceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.removeSecurityGroupNetworkInterface(null).execute();
  }

  @Test
  public void testGetSecurityGroupNetworkInterfaceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"my-network-interface\", \"id\": \"10c02d81-0ecb-4dc5-897d-28392913b81e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/network_interfaces/10c02d81-0ecb-4dc5-897d-28392913b81e\", \"primary_ipv4_address\": \"192.168.3.4\", \"resource_type\": \"network_interface\", \"security_groups\": [{\"id\": \"be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::security-group:be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/security_groups/be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"name\": \"my-security-group\"}], \"created_at\": \"2019-01-01T12:00:00\", \"floating_ips\": [{\"id\": \"39300233-9995-4806-89a5-3c1b6eb88689\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::floating-ip:39300233-9995-4806-89a5-3c1b6eb88689\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/floating_ips/39300233-9995-4806-89a5-3c1b6eb88689\", \"address\": \"203.0.113.1\", \"name\": \"my-floating-ip\"}], \"port_speed\": 1000, \"status\": \"available\", \"subnet\": {\"id\": \"7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::subnet:7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/subnets/7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"name\": \"my-subnet\"}, \"type\": \"primary\"}";
    String getSecurityGroupNetworkInterfacePath = java.net.URLEncoder.encode("/security_groups/testString/network_interfaces/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetSecurityGroupNetworkInterfaceOptions model
    GetSecurityGroupNetworkInterfaceOptions getSecurityGroupNetworkInterfaceOptionsModel = new GetSecurityGroupNetworkInterfaceOptions.Builder()
    .securityGroupId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<NetworkInterface> response = vpcService.getSecurityGroupNetworkInterface(getSecurityGroupNetworkInterfaceOptionsModel).execute();
    assertNotNull(response);
    NetworkInterface responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSecurityGroupNetworkInterfacePath);
  }

  // Test the getSecurityGroupNetworkInterface operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSecurityGroupNetworkInterfaceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.getSecurityGroupNetworkInterface(null).execute();
  }

  @Test
  public void testAddSecurityGroupNetworkInterfaceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"my-network-interface\", \"id\": \"10c02d81-0ecb-4dc5-897d-28392913b81e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/network_interfaces/10c02d81-0ecb-4dc5-897d-28392913b81e\", \"primary_ipv4_address\": \"192.168.3.4\", \"resource_type\": \"network_interface\", \"security_groups\": [{\"id\": \"be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::security-group:be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/security_groups/be5df5ca-12a0-494b-907e-aa6ec2bfa271\", \"name\": \"my-security-group\"}], \"created_at\": \"2019-01-01T12:00:00\", \"floating_ips\": [{\"id\": \"39300233-9995-4806-89a5-3c1b6eb88689\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::floating-ip:39300233-9995-4806-89a5-3c1b6eb88689\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/floating_ips/39300233-9995-4806-89a5-3c1b6eb88689\", \"address\": \"203.0.113.1\", \"name\": \"my-floating-ip\"}], \"port_speed\": 1000, \"status\": \"available\", \"subnet\": {\"id\": \"7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::subnet:7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/subnets/7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"name\": \"my-subnet\"}, \"type\": \"primary\"}";
    String addSecurityGroupNetworkInterfacePath = java.net.URLEncoder.encode("/security_groups/testString/network_interfaces/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the AddSecurityGroupNetworkInterfaceOptions model
    AddSecurityGroupNetworkInterfaceOptions addSecurityGroupNetworkInterfaceOptionsModel = new AddSecurityGroupNetworkInterfaceOptions.Builder()
    .securityGroupId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<NetworkInterface> response = vpcService.addSecurityGroupNetworkInterface(addSecurityGroupNetworkInterfaceOptionsModel).execute();
    assertNotNull(response);
    NetworkInterface responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, addSecurityGroupNetworkInterfacePath);
  }

  // Test the addSecurityGroupNetworkInterface operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAddSecurityGroupNetworkInterfaceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.addSecurityGroupNetworkInterface(null).execute();
  }

  @Test
  public void testListSecurityGroupRulesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"rules\": [{\"id\": \"6f2a6efe-21e2-401c-b237-620aa26ba16a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/security_groups/be5df5ca-12a0-494b-907e-aa6ec2bfa271/rules/6f2a6efe-21e2-401c-b237-620aa26ba16a\", \"direction\": \"inbound\", \"ip_version\": \"ipv4\", \"protocol\": \"udp\", \"remote\": {\"address\": \"192.168.3.4\"}, \"port_max\": 22, \"port_min\": 22}]}";
    String listSecurityGroupRulesPath = java.net.URLEncoder.encode("/security_groups/testString/rules", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListSecurityGroupRulesOptions model
    ListSecurityGroupRulesOptions listSecurityGroupRulesOptionsModel = new ListSecurityGroupRulesOptions.Builder()
    .securityGroupId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<SecurityGroupRuleCollection> response = vpcService.listSecurityGroupRules(listSecurityGroupRulesOptionsModel).execute();
    assertNotNull(response);
    SecurityGroupRuleCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listSecurityGroupRulesPath);
  }

  // Test the listSecurityGroupRules operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListSecurityGroupRulesNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.listSecurityGroupRules(null).execute();
  }

  @Test
  public void testCreateSecurityGroupRuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"6f2a6efe-21e2-401c-b237-620aa26ba16a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/security_groups/be5df5ca-12a0-494b-907e-aa6ec2bfa271/rules/6f2a6efe-21e2-401c-b237-620aa26ba16a\", \"direction\": \"inbound\", \"ip_version\": \"ipv4\", \"protocol\": \"udp\", \"remote\": {\"address\": \"192.168.3.4\"}, \"port_max\": 22, \"port_min\": 22}";
    String createSecurityGroupRulePath = java.net.URLEncoder.encode("/security_groups/testString/rules", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the SecurityGroupRulePrototypeRemoteIP model
    SecurityGroupRulePrototypeRemoteIP securityGroupRulePrototypeRemoteModel = new SecurityGroupRulePrototypeRemoteIP.Builder()
    .address("192.168.3.4")
    .build();

    // Construct an instance of the SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP model
    SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP securityGroupRulePrototypeModel = new SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP.Builder()
    .direction("inbound")
    .ipVersion("ipv4")
    .protocol("icmp")
    .remote(securityGroupRulePrototypeRemoteModel)
    .code(Long.valueOf("0"))
    .type(Long.valueOf("8"))
    .build();

    // Construct an instance of the CreateSecurityGroupRuleOptions model
    CreateSecurityGroupRuleOptions createSecurityGroupRuleOptionsModel = new CreateSecurityGroupRuleOptions.Builder()
    .securityGroupId("testString")
    .securityGroupRulePrototype(securityGroupRulePrototypeModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<SecurityGroupRule> response = vpcService.createSecurityGroupRule(createSecurityGroupRuleOptionsModel).execute();
    assertNotNull(response);
    SecurityGroupRule responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createSecurityGroupRulePath);
  }

  // Test the createSecurityGroupRule operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateSecurityGroupRuleNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.createSecurityGroupRule(null).execute();
  }

  @Test
  public void testDeleteSecurityGroupRuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteSecurityGroupRulePath = java.net.URLEncoder.encode("/security_groups/testString/rules/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteSecurityGroupRuleOptions model
    DeleteSecurityGroupRuleOptions deleteSecurityGroupRuleOptionsModel = new DeleteSecurityGroupRuleOptions.Builder()
    .securityGroupId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = vpcService.deleteSecurityGroupRule(deleteSecurityGroupRuleOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteSecurityGroupRulePath);
  }

  // Test the deleteSecurityGroupRule operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteSecurityGroupRuleNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.deleteSecurityGroupRule(null).execute();
  }

  @Test
  public void testGetSecurityGroupRuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"6f2a6efe-21e2-401c-b237-620aa26ba16a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/security_groups/be5df5ca-12a0-494b-907e-aa6ec2bfa271/rules/6f2a6efe-21e2-401c-b237-620aa26ba16a\", \"direction\": \"inbound\", \"ip_version\": \"ipv4\", \"protocol\": \"udp\", \"remote\": {\"address\": \"192.168.3.4\"}, \"port_max\": 22, \"port_min\": 22}";
    String getSecurityGroupRulePath = java.net.URLEncoder.encode("/security_groups/testString/rules/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetSecurityGroupRuleOptions model
    GetSecurityGroupRuleOptions getSecurityGroupRuleOptionsModel = new GetSecurityGroupRuleOptions.Builder()
    .securityGroupId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<SecurityGroupRule> response = vpcService.getSecurityGroupRule(getSecurityGroupRuleOptionsModel).execute();
    assertNotNull(response);
    SecurityGroupRule responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSecurityGroupRulePath);
  }

  // Test the getSecurityGroupRule operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSecurityGroupRuleNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.getSecurityGroupRule(null).execute();
  }

  @Test
  public void testUpdateSecurityGroupRuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"6f2a6efe-21e2-401c-b237-620aa26ba16a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/security_groups/be5df5ca-12a0-494b-907e-aa6ec2bfa271/rules/6f2a6efe-21e2-401c-b237-620aa26ba16a\", \"direction\": \"inbound\", \"ip_version\": \"ipv4\", \"protocol\": \"udp\", \"remote\": {\"address\": \"192.168.3.4\"}, \"port_max\": 22, \"port_min\": 22}";
    String updateSecurityGroupRulePath = java.net.URLEncoder.encode("/security_groups/testString/rules/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the SecurityGroupRulePatchRemoteIP model
    SecurityGroupRulePatchRemoteIP securityGroupRulePatchRemoteModel = new SecurityGroupRulePatchRemoteIP.Builder()
    .address("192.168.3.4")
    .build();

    // Construct an instance of the UpdateSecurityGroupRuleOptions model
    UpdateSecurityGroupRuleOptions updateSecurityGroupRuleOptionsModel = new UpdateSecurityGroupRuleOptions.Builder()
    .securityGroupId("testString")
    .id("testString")
    .remote(securityGroupRulePatchRemoteModel)
    .direction("inbound")
    .ipVersion("ipv4")
    .code(Long.valueOf("0"))
    .portMax(Long.valueOf("22"))
    .portMin(Long.valueOf("22"))
    .type(Long.valueOf("8"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<SecurityGroupRule> response = vpcService.updateSecurityGroupRule(updateSecurityGroupRuleOptionsModel).execute();
    assertNotNull(response);
    SecurityGroupRule responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateSecurityGroupRulePath);
  }

  // Test the updateSecurityGroupRule operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateSecurityGroupRuleNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.updateSecurityGroupRule(null).execute();
  }

  @Test
  public void testListIkePoliciesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"first\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/ike_policies?limit=20\"}, \"limit\": 20, \"next\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/ike_policies?start=9d5a91a3e2cbd233b5a5b33436855ed&limit=20\"}, \"total_count\": 132, \"ike_policies\": [{\"id\": \"ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/ike_policies/ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"name\": \"my-ike-policy\", \"resource_type\": \"ike_policy\", \"authentication_algorithm\": \"md5\", \"dh_group\": 2, \"encryption_algorithm\": \"triple_des\", \"ike_version\": 1, \"key_lifetime\": 28800, \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"connections\": [{\"id\": \"a10a5771-dc23-442c-8460-c3601d8542f7\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpn_gateways/ddf51bec-3424-11e8-b467-0ed5f89f718b/connections/93487806-7743-4c46-81d6-72869883ea0b\", \"name\": \"my-vpn-connection\", \"resource_type\": \"vpn_gateway_connection\"}], \"created_at\": \"2019-01-01T12:00:00\", \"negotiation_mode\": \"main\"}]}";
    String listIkePoliciesPath = java.net.URLEncoder.encode("/ike_policies", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListIkePoliciesOptions model
    ListIkePoliciesOptions listIkePoliciesOptionsModel = new ListIkePoliciesOptions.Builder()
    .start("testString")
    .limit(Long.valueOf("1"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<IKEPolicyCollection> response = vpcService.listIkePolicies(listIkePoliciesOptionsModel).execute();
    assertNotNull(response);
    IKEPolicyCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    assertEquals(query.get("start"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listIkePoliciesPath);
  }

  @Test
  public void testCreateIkePolicyWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/ike_policies/ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"name\": \"my-ike-policy\", \"resource_type\": \"ike_policy\", \"authentication_algorithm\": \"md5\", \"dh_group\": 2, \"encryption_algorithm\": \"triple_des\", \"ike_version\": 1, \"key_lifetime\": 28800, \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"connections\": [{\"id\": \"a10a5771-dc23-442c-8460-c3601d8542f7\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpn_gateways/ddf51bec-3424-11e8-b467-0ed5f89f718b/connections/93487806-7743-4c46-81d6-72869883ea0b\", \"name\": \"my-vpn-connection\", \"resource_type\": \"vpn_gateway_connection\"}], \"created_at\": \"2019-01-01T12:00:00\", \"negotiation_mode\": \"main\"}";
    String createIkePolicyPath = java.net.URLEncoder.encode("/ike_policies", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ResourceGroupIdentityById model
    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
    .id("fee82deba12e4c0fb69c3b09d1f12345")
    .build();

    // Construct an instance of the CreateIkePolicyOptions model
    CreateIkePolicyOptions createIkePolicyOptionsModel = new CreateIkePolicyOptions.Builder()
    .authenticationAlgorithm("md5")
    .dhGroup(Long.valueOf("2"))
    .encryptionAlgorithm("triple_des")
    .ikeVersion(Long.valueOf("1"))
    .name("my-ike-policy")
    .keyLifetime(Long.valueOf("28800"))
    .resourceGroup(resourceGroupIdentityModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<IKEPolicy> response = vpcService.createIkePolicy(createIkePolicyOptionsModel).execute();
    assertNotNull(response);
    IKEPolicy responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createIkePolicyPath);
  }

  // Test the createIkePolicy operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateIkePolicyNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.createIkePolicy(null).execute();
  }

  @Test
  public void testDeleteIkePolicyWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteIkePolicyPath = java.net.URLEncoder.encode("/ike_policies/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteIkePolicyOptions model
    DeleteIkePolicyOptions deleteIkePolicyOptionsModel = new DeleteIkePolicyOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = vpcService.deleteIkePolicy(deleteIkePolicyOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteIkePolicyPath);
  }

  // Test the deleteIkePolicy operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteIkePolicyNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.deleteIkePolicy(null).execute();
  }

  @Test
  public void testGetIkePolicyWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/ike_policies/ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"name\": \"my-ike-policy\", \"resource_type\": \"ike_policy\", \"authentication_algorithm\": \"md5\", \"dh_group\": 2, \"encryption_algorithm\": \"triple_des\", \"ike_version\": 1, \"key_lifetime\": 28800, \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"connections\": [{\"id\": \"a10a5771-dc23-442c-8460-c3601d8542f7\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpn_gateways/ddf51bec-3424-11e8-b467-0ed5f89f718b/connections/93487806-7743-4c46-81d6-72869883ea0b\", \"name\": \"my-vpn-connection\", \"resource_type\": \"vpn_gateway_connection\"}], \"created_at\": \"2019-01-01T12:00:00\", \"negotiation_mode\": \"main\"}";
    String getIkePolicyPath = java.net.URLEncoder.encode("/ike_policies/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetIkePolicyOptions model
    GetIkePolicyOptions getIkePolicyOptionsModel = new GetIkePolicyOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<IKEPolicy> response = vpcService.getIkePolicy(getIkePolicyOptionsModel).execute();
    assertNotNull(response);
    IKEPolicy responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getIkePolicyPath);
  }

  // Test the getIkePolicy operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetIkePolicyNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.getIkePolicy(null).execute();
  }

  @Test
  public void testUpdateIkePolicyWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/ike_policies/ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"name\": \"my-ike-policy\", \"resource_type\": \"ike_policy\", \"authentication_algorithm\": \"md5\", \"dh_group\": 2, \"encryption_algorithm\": \"triple_des\", \"ike_version\": 1, \"key_lifetime\": 28800, \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"connections\": [{\"id\": \"a10a5771-dc23-442c-8460-c3601d8542f7\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpn_gateways/ddf51bec-3424-11e8-b467-0ed5f89f718b/connections/93487806-7743-4c46-81d6-72869883ea0b\", \"name\": \"my-vpn-connection\", \"resource_type\": \"vpn_gateway_connection\"}], \"created_at\": \"2019-01-01T12:00:00\", \"negotiation_mode\": \"main\"}";
    String updateIkePolicyPath = java.net.URLEncoder.encode("/ike_policies/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateIkePolicyOptions model
    UpdateIkePolicyOptions updateIkePolicyOptionsModel = new UpdateIkePolicyOptions.Builder()
    .id("testString")
    .name("my-ike-policy")
    .authenticationAlgorithm("md5")
    .dhGroup(Long.valueOf("2"))
    .encryptionAlgorithm("triple_des")
    .ikeVersion(Long.valueOf("1"))
    .keyLifetime(Long.valueOf("28800"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<IKEPolicy> response = vpcService.updateIkePolicy(updateIkePolicyOptionsModel).execute();
    assertNotNull(response);
    IKEPolicy responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateIkePolicyPath);
  }

  // Test the updateIkePolicy operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateIkePolicyNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.updateIkePolicy(null).execute();
  }

  @Test
  public void testListIkePolicyConnectionsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"connections\": [{\"id\": \"a10a5771-dc23-442c-8460-c3601d8542f7\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpn_gateways/ddf51bec-3424-11e8-b467-0ed5f89f718b/connections/93487806-7743-4c46-81d6-72869883ea0b\", \"name\": \"my-vpn-connection\", \"resource_type\": \"vpn_gateway_connection\", \"admin_state_up\": true, \"peer_address\": \"169.21.50.5\", \"psk\": \"lkj14b1oi0alcniejkso\", \"local_cidrs\": [\"192.168.1.0/24\"], \"peer_cidrs\": [\"10.45.1.0/24\"], \"route_mode\": \"policy\", \"authentication_mode\": \"psk\", \"status\": \"down\", \"created_at\": \"2019-01-01T12:00:00\", \"dead_peer_detection\": {\"action\": \"restart\", \"interval\": 30, \"timeout\": 120}, \"ike_policy\": {\"id\": \"ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/ike_policies/ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"name\": \"my-ike-policy\", \"resource_type\": \"ike_policy\"}, \"ipsec_policy\": {\"id\": \"ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/ipsec_policies/ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"name\": \"my-ipsec-policy\", \"resource_type\": \"ipsec_policy\"}}]}";
    String listIkePolicyConnectionsPath = java.net.URLEncoder.encode("/ike_policies/testString/connections", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListIkePolicyConnectionsOptions model
    ListIkePolicyConnectionsOptions listIkePolicyConnectionsOptionsModel = new ListIkePolicyConnectionsOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<VPNGatewayConnectionCollection> response = vpcService.listIkePolicyConnections(listIkePolicyConnectionsOptionsModel).execute();
    assertNotNull(response);
    VPNGatewayConnectionCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listIkePolicyConnectionsPath);
  }

  // Test the listIkePolicyConnections operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListIkePolicyConnectionsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.listIkePolicyConnections(null).execute();
  }

  @Test
  public void testListIpsecPoliciesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"first\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/ipsec_policies?limit=20\"}, \"limit\": 20, \"next\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/ipsec_policies?start=9d5a91a3e2cbd233b5a5b33436855ed&limit=20\"}, \"total_count\": 132, \"ipsec_policies\": [{\"id\": \"ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/ipsec_policies/ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"name\": \"my-ipsec-policy\", \"resource_type\": \"ipsec_policy\", \"authentication_algorithm\": \"md5\", \"encryption_algorithm\": \"triple_des\", \"key_lifetime\": 3600, \"pfs\": \"disabled\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"connections\": [{\"id\": \"a10a5771-dc23-442c-8460-c3601d8542f7\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpn_gateways/ddf51bec-3424-11e8-b467-0ed5f89f718b/connections/93487806-7743-4c46-81d6-72869883ea0b\", \"name\": \"my-vpn-connection\", \"resource_type\": \"vpn_gateway_connection\"}], \"created_at\": \"2019-01-01T12:00:00\", \"encapsulation_mode\": \"tunnel\", \"transform_protocol\": \"esp\"}]}";
    String listIpsecPoliciesPath = java.net.URLEncoder.encode("/ipsec_policies", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListIpsecPoliciesOptions model
    ListIpsecPoliciesOptions listIpsecPoliciesOptionsModel = new ListIpsecPoliciesOptions.Builder()
    .start("testString")
    .limit(Long.valueOf("1"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<IPsecPolicyCollection> response = vpcService.listIpsecPolicies(listIpsecPoliciesOptionsModel).execute();
    assertNotNull(response);
    IPsecPolicyCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    assertEquals(query.get("start"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listIpsecPoliciesPath);
  }

  @Test
  public void testCreateIpsecPolicyWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/ipsec_policies/ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"name\": \"my-ipsec-policy\", \"resource_type\": \"ipsec_policy\", \"authentication_algorithm\": \"md5\", \"encryption_algorithm\": \"triple_des\", \"key_lifetime\": 3600, \"pfs\": \"disabled\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"connections\": [{\"id\": \"a10a5771-dc23-442c-8460-c3601d8542f7\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpn_gateways/ddf51bec-3424-11e8-b467-0ed5f89f718b/connections/93487806-7743-4c46-81d6-72869883ea0b\", \"name\": \"my-vpn-connection\", \"resource_type\": \"vpn_gateway_connection\"}], \"created_at\": \"2019-01-01T12:00:00\", \"encapsulation_mode\": \"tunnel\", \"transform_protocol\": \"esp\"}";
    String createIpsecPolicyPath = java.net.URLEncoder.encode("/ipsec_policies", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ResourceGroupIdentityById model
    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
    .id("fee82deba12e4c0fb69c3b09d1f12345")
    .build();

    // Construct an instance of the CreateIpsecPolicyOptions model
    CreateIpsecPolicyOptions createIpsecPolicyOptionsModel = new CreateIpsecPolicyOptions.Builder()
    .authenticationAlgorithm("md5")
    .encryptionAlgorithm("triple_des")
    .pfs("disabled")
    .name("my-ipsec-policy")
    .keyLifetime(Long.valueOf("3600"))
    .resourceGroup(resourceGroupIdentityModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<IPsecPolicy> response = vpcService.createIpsecPolicy(createIpsecPolicyOptionsModel).execute();
    assertNotNull(response);
    IPsecPolicy responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createIpsecPolicyPath);
  }

  // Test the createIpsecPolicy operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateIpsecPolicyNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.createIpsecPolicy(null).execute();
  }

  @Test
  public void testDeleteIpsecPolicyWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteIpsecPolicyPath = java.net.URLEncoder.encode("/ipsec_policies/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteIpsecPolicyOptions model
    DeleteIpsecPolicyOptions deleteIpsecPolicyOptionsModel = new DeleteIpsecPolicyOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = vpcService.deleteIpsecPolicy(deleteIpsecPolicyOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteIpsecPolicyPath);
  }

  // Test the deleteIpsecPolicy operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteIpsecPolicyNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.deleteIpsecPolicy(null).execute();
  }

  @Test
  public void testGetIpsecPolicyWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/ipsec_policies/ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"name\": \"my-ipsec-policy\", \"resource_type\": \"ipsec_policy\", \"authentication_algorithm\": \"md5\", \"encryption_algorithm\": \"triple_des\", \"key_lifetime\": 3600, \"pfs\": \"disabled\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"connections\": [{\"id\": \"a10a5771-dc23-442c-8460-c3601d8542f7\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpn_gateways/ddf51bec-3424-11e8-b467-0ed5f89f718b/connections/93487806-7743-4c46-81d6-72869883ea0b\", \"name\": \"my-vpn-connection\", \"resource_type\": \"vpn_gateway_connection\"}], \"created_at\": \"2019-01-01T12:00:00\", \"encapsulation_mode\": \"tunnel\", \"transform_protocol\": \"esp\"}";
    String getIpsecPolicyPath = java.net.URLEncoder.encode("/ipsec_policies/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetIpsecPolicyOptions model
    GetIpsecPolicyOptions getIpsecPolicyOptionsModel = new GetIpsecPolicyOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<IPsecPolicy> response = vpcService.getIpsecPolicy(getIpsecPolicyOptionsModel).execute();
    assertNotNull(response);
    IPsecPolicy responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getIpsecPolicyPath);
  }

  // Test the getIpsecPolicy operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetIpsecPolicyNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.getIpsecPolicy(null).execute();
  }

  @Test
  public void testUpdateIpsecPolicyWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/ipsec_policies/ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"name\": \"my-ipsec-policy\", \"resource_type\": \"ipsec_policy\", \"authentication_algorithm\": \"md5\", \"encryption_algorithm\": \"triple_des\", \"key_lifetime\": 3600, \"pfs\": \"disabled\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"connections\": [{\"id\": \"a10a5771-dc23-442c-8460-c3601d8542f7\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpn_gateways/ddf51bec-3424-11e8-b467-0ed5f89f718b/connections/93487806-7743-4c46-81d6-72869883ea0b\", \"name\": \"my-vpn-connection\", \"resource_type\": \"vpn_gateway_connection\"}], \"created_at\": \"2019-01-01T12:00:00\", \"encapsulation_mode\": \"tunnel\", \"transform_protocol\": \"esp\"}";
    String updateIpsecPolicyPath = java.net.URLEncoder.encode("/ipsec_policies/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateIpsecPolicyOptions model
    UpdateIpsecPolicyOptions updateIpsecPolicyOptionsModel = new UpdateIpsecPolicyOptions.Builder()
    .id("testString")
    .name("my-ipsec-policy")
    .authenticationAlgorithm("md5")
    .encryptionAlgorithm("triple_des")
    .keyLifetime(Long.valueOf("3600"))
    .pfs("disabled")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<IPsecPolicy> response = vpcService.updateIpsecPolicy(updateIpsecPolicyOptionsModel).execute();
    assertNotNull(response);
    IPsecPolicy responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateIpsecPolicyPath);
  }

  // Test the updateIpsecPolicy operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateIpsecPolicyNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.updateIpsecPolicy(null).execute();
  }

  @Test
  public void testListIpsecPolicyConnectionsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"connections\": [{\"id\": \"a10a5771-dc23-442c-8460-c3601d8542f7\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpn_gateways/ddf51bec-3424-11e8-b467-0ed5f89f718b/connections/93487806-7743-4c46-81d6-72869883ea0b\", \"name\": \"my-vpn-connection\", \"resource_type\": \"vpn_gateway_connection\", \"admin_state_up\": true, \"peer_address\": \"169.21.50.5\", \"psk\": \"lkj14b1oi0alcniejkso\", \"local_cidrs\": [\"192.168.1.0/24\"], \"peer_cidrs\": [\"10.45.1.0/24\"], \"route_mode\": \"policy\", \"authentication_mode\": \"psk\", \"status\": \"down\", \"created_at\": \"2019-01-01T12:00:00\", \"dead_peer_detection\": {\"action\": \"restart\", \"interval\": 30, \"timeout\": 120}, \"ike_policy\": {\"id\": \"ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/ike_policies/ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"name\": \"my-ike-policy\", \"resource_type\": \"ike_policy\"}, \"ipsec_policy\": {\"id\": \"ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/ipsec_policies/ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"name\": \"my-ipsec-policy\", \"resource_type\": \"ipsec_policy\"}}]}";
    String listIpsecPolicyConnectionsPath = java.net.URLEncoder.encode("/ipsec_policies/testString/connections", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListIpsecPolicyConnectionsOptions model
    ListIpsecPolicyConnectionsOptions listIpsecPolicyConnectionsOptionsModel = new ListIpsecPolicyConnectionsOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<VPNGatewayConnectionCollection> response = vpcService.listIpsecPolicyConnections(listIpsecPolicyConnectionsOptionsModel).execute();
    assertNotNull(response);
    VPNGatewayConnectionCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listIpsecPolicyConnectionsPath);
  }

  // Test the listIpsecPolicyConnections operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListIpsecPolicyConnectionsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.listIpsecPolicyConnections(null).execute();
  }

  @Test
  public void testListVpnGatewaysWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"first\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpn_gateways?limit=20\"}, \"limit\": 20, \"next\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpn_gateways?start=9d5a91a3e2cbd233b5a5b33436855ed&limit=20\"}, \"total_count\": 132, \"vpn_gateways\": [{\"id\": \"ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpn:ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpn_gateways/ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"name\": \"my-vpn-gateway\", \"resource_type\": \"vpn_gateway\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"public_ip\": {\"address\": \"192.168.3.4\"}, \"connections\": [{\"id\": \"a10a5771-dc23-442c-8460-c3601d8542f7\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpn_gateways/ddf51bec-3424-11e8-b467-0ed5f89f718b/connections/93487806-7743-4c46-81d6-72869883ea0b\", \"name\": \"my-vpn-connection\", \"resource_type\": \"vpn_gateway_connection\"}], \"created_at\": \"2019-01-01T12:00:00\", \"status\": \"available\", \"subnet\": {\"id\": \"7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::subnet:7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/subnets/7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"name\": \"my-subnet\"}}]}";
    String listVpnGatewaysPath = java.net.URLEncoder.encode("/vpn_gateways", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListVpnGatewaysOptions model
    ListVpnGatewaysOptions listVpnGatewaysOptionsModel = new ListVpnGatewaysOptions.Builder()
    .start("testString")
    .limit(Long.valueOf("1"))
    .resourceGroupId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<VPNGatewayCollection> response = vpcService.listVpnGateways(listVpnGatewaysOptionsModel).execute();
    assertNotNull(response);
    VPNGatewayCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    assertEquals(query.get("start"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(query.get("resource_group.id"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listVpnGatewaysPath);
  }

  @Test
  public void testCreateVpnGatewayWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpn:ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpn_gateways/ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"name\": \"my-vpn-gateway\", \"resource_type\": \"vpn_gateway\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"public_ip\": {\"address\": \"192.168.3.4\"}, \"connections\": [{\"id\": \"a10a5771-dc23-442c-8460-c3601d8542f7\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpn_gateways/ddf51bec-3424-11e8-b467-0ed5f89f718b/connections/93487806-7743-4c46-81d6-72869883ea0b\", \"name\": \"my-vpn-connection\", \"resource_type\": \"vpn_gateway_connection\"}], \"created_at\": \"2019-01-01T12:00:00\", \"status\": \"available\", \"subnet\": {\"id\": \"7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::subnet:7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/subnets/7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"name\": \"my-subnet\"}}";
    String createVpnGatewayPath = java.net.URLEncoder.encode("/vpn_gateways", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the SubnetIdentityById model
    SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
    .id("7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
    .build();

    // Construct an instance of the ResourceGroupIdentityById model
    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
    .id("fee82deba12e4c0fb69c3b09d1f12345")
    .build();

    // Construct an instance of the CreateVpnGatewayOptions model
    CreateVpnGatewayOptions createVpnGatewayOptionsModel = new CreateVpnGatewayOptions.Builder()
    .subnet(subnetIdentityModel)
    .name("my-vpn-gateway")
    .resourceGroup(resourceGroupIdentityModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<VPNGateway> response = vpcService.createVpnGateway(createVpnGatewayOptionsModel).execute();
    assertNotNull(response);
    VPNGateway responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createVpnGatewayPath);
  }

  // Test the createVpnGateway operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateVpnGatewayNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.createVpnGateway(null).execute();
  }

  @Test
  public void testDeleteVpnGatewayWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteVpnGatewayPath = java.net.URLEncoder.encode("/vpn_gateways/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(202)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteVpnGatewayOptions model
    DeleteVpnGatewayOptions deleteVpnGatewayOptionsModel = new DeleteVpnGatewayOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = vpcService.deleteVpnGateway(deleteVpnGatewayOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteVpnGatewayPath);
  }

  // Test the deleteVpnGateway operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteVpnGatewayNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.deleteVpnGateway(null).execute();
  }

  @Test
  public void testGetVpnGatewayWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpn:ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpn_gateways/ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"name\": \"my-vpn-gateway\", \"resource_type\": \"vpn_gateway\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"public_ip\": {\"address\": \"192.168.3.4\"}, \"connections\": [{\"id\": \"a10a5771-dc23-442c-8460-c3601d8542f7\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpn_gateways/ddf51bec-3424-11e8-b467-0ed5f89f718b/connections/93487806-7743-4c46-81d6-72869883ea0b\", \"name\": \"my-vpn-connection\", \"resource_type\": \"vpn_gateway_connection\"}], \"created_at\": \"2019-01-01T12:00:00\", \"status\": \"available\", \"subnet\": {\"id\": \"7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::subnet:7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/subnets/7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"name\": \"my-subnet\"}}";
    String getVpnGatewayPath = java.net.URLEncoder.encode("/vpn_gateways/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetVpnGatewayOptions model
    GetVpnGatewayOptions getVpnGatewayOptionsModel = new GetVpnGatewayOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<VPNGateway> response = vpcService.getVpnGateway(getVpnGatewayOptionsModel).execute();
    assertNotNull(response);
    VPNGateway responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getVpnGatewayPath);
  }

  // Test the getVpnGateway operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetVpnGatewayNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.getVpnGateway(null).execute();
  }

  @Test
  public void testUpdateVpnGatewayWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpn:ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpn_gateways/ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"name\": \"my-vpn-gateway\", \"resource_type\": \"vpn_gateway\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"public_ip\": {\"address\": \"192.168.3.4\"}, \"connections\": [{\"id\": \"a10a5771-dc23-442c-8460-c3601d8542f7\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpn_gateways/ddf51bec-3424-11e8-b467-0ed5f89f718b/connections/93487806-7743-4c46-81d6-72869883ea0b\", \"name\": \"my-vpn-connection\", \"resource_type\": \"vpn_gateway_connection\"}], \"created_at\": \"2019-01-01T12:00:00\", \"status\": \"available\", \"subnet\": {\"id\": \"7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::subnet:7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/subnets/7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"name\": \"my-subnet\"}}";
    String updateVpnGatewayPath = java.net.URLEncoder.encode("/vpn_gateways/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateVpnGatewayOptions model
    UpdateVpnGatewayOptions updateVpnGatewayOptionsModel = new UpdateVpnGatewayOptions.Builder()
    .id("testString")
    .name("my-vpn-gateway")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<VPNGateway> response = vpcService.updateVpnGateway(updateVpnGatewayOptionsModel).execute();
    assertNotNull(response);
    VPNGateway responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateVpnGatewayPath);
  }

  // Test the updateVpnGateway operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateVpnGatewayNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.updateVpnGateway(null).execute();
  }

  @Test
  public void testListVpnGatewayConnectionsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"connections\": [{\"id\": \"a10a5771-dc23-442c-8460-c3601d8542f7\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpn_gateways/ddf51bec-3424-11e8-b467-0ed5f89f718b/connections/93487806-7743-4c46-81d6-72869883ea0b\", \"name\": \"my-vpn-connection\", \"resource_type\": \"vpn_gateway_connection\", \"admin_state_up\": true, \"peer_address\": \"169.21.50.5\", \"psk\": \"lkj14b1oi0alcniejkso\", \"local_cidrs\": [\"192.168.1.0/24\"], \"peer_cidrs\": [\"10.45.1.0/24\"], \"route_mode\": \"policy\", \"authentication_mode\": \"psk\", \"status\": \"down\", \"created_at\": \"2019-01-01T12:00:00\", \"dead_peer_detection\": {\"action\": \"restart\", \"interval\": 30, \"timeout\": 120}, \"ike_policy\": {\"id\": \"ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/ike_policies/ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"name\": \"my-ike-policy\", \"resource_type\": \"ike_policy\"}, \"ipsec_policy\": {\"id\": \"ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/ipsec_policies/ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"name\": \"my-ipsec-policy\", \"resource_type\": \"ipsec_policy\"}}]}";
    String listVpnGatewayConnectionsPath = java.net.URLEncoder.encode("/vpn_gateways/testString/connections", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListVpnGatewayConnectionsOptions model
    ListVpnGatewayConnectionsOptions listVpnGatewayConnectionsOptionsModel = new ListVpnGatewayConnectionsOptions.Builder()
    .vpnGatewayId("testString")
    .status("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<VPNGatewayConnectionCollection> response = vpcService.listVpnGatewayConnections(listVpnGatewayConnectionsOptionsModel).execute();
    assertNotNull(response);
    VPNGatewayConnectionCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    assertEquals(query.get("status"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listVpnGatewayConnectionsPath);
  }

  // Test the listVpnGatewayConnections operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListVpnGatewayConnectionsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.listVpnGatewayConnections(null).execute();
  }

  @Test
  public void testCreateVpnGatewayConnectionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"a10a5771-dc23-442c-8460-c3601d8542f7\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpn_gateways/ddf51bec-3424-11e8-b467-0ed5f89f718b/connections/93487806-7743-4c46-81d6-72869883ea0b\", \"name\": \"my-vpn-connection\", \"resource_type\": \"vpn_gateway_connection\", \"admin_state_up\": true, \"peer_address\": \"169.21.50.5\", \"psk\": \"lkj14b1oi0alcniejkso\", \"local_cidrs\": [\"192.168.1.0/24\"], \"peer_cidrs\": [\"10.45.1.0/24\"], \"route_mode\": \"policy\", \"authentication_mode\": \"psk\", \"status\": \"down\", \"created_at\": \"2019-01-01T12:00:00\", \"dead_peer_detection\": {\"action\": \"restart\", \"interval\": 30, \"timeout\": 120}, \"ike_policy\": {\"id\": \"ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/ike_policies/ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"name\": \"my-ike-policy\", \"resource_type\": \"ike_policy\"}, \"ipsec_policy\": {\"id\": \"ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/ipsec_policies/ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"name\": \"my-ipsec-policy\", \"resource_type\": \"ipsec_policy\"}}";
    String createVpnGatewayConnectionPath = java.net.URLEncoder.encode("/vpn_gateways/testString/connections", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the VPNGatewayConnectionDPDPrototype model
    VPNGatewayConnectionDPDPrototype vpnGatewayConnectionDpdPrototypeModel = new VPNGatewayConnectionDPDPrototype.Builder()
    .action("restart")
    .interval(Long.valueOf("30"))
    .timeout(Long.valueOf("120"))
    .build();

    // Construct an instance of the IKEPolicyIdentityById model
    IKEPolicyIdentityById ikePolicyIdentityModel = new IKEPolicyIdentityById.Builder()
    .id("ddf51bec-3424-11e8-b467-0ed5f89f718b")
    .build();

    // Construct an instance of the IPsecPolicyIdentityById model
    IPsecPolicyIdentityById iPsecPolicyIdentityModel = new IPsecPolicyIdentityById.Builder()
    .id("ddf51bec-3424-11e8-b467-0ed5f89f718b")
    .build();

    // Construct an instance of the CreateVpnGatewayConnectionOptions model
    CreateVpnGatewayConnectionOptions createVpnGatewayConnectionOptionsModel = new CreateVpnGatewayConnectionOptions.Builder()
    .vpnGatewayId("testString")
    .peerAddress("169.21.50.5")
    .psk("lkj14b1oi0alcniejkso")
    .adminStateUp(true)
    .name("my-vpn-connection")
    .deadPeerDetection(vpnGatewayConnectionDpdPrototypeModel)
    .ikePolicy(ikePolicyIdentityModel)
    .ipsecPolicy(iPsecPolicyIdentityModel)
    .localCidrs(new java.util.ArrayList<String>(java.util.Arrays.asList("192.168.1.0/24")))
    .peerCidrs(new java.util.ArrayList<String>(java.util.Arrays.asList("10.45.1.0/24")))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<VPNGatewayConnection> response = vpcService.createVpnGatewayConnection(createVpnGatewayConnectionOptionsModel).execute();
    assertNotNull(response);
    VPNGatewayConnection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createVpnGatewayConnectionPath);
  }

  // Test the createVpnGatewayConnection operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateVpnGatewayConnectionNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.createVpnGatewayConnection(null).execute();
  }

  @Test
  public void testDeleteVpnGatewayConnectionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteVpnGatewayConnectionPath = java.net.URLEncoder.encode("/vpn_gateways/testString/connections/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(202)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteVpnGatewayConnectionOptions model
    DeleteVpnGatewayConnectionOptions deleteVpnGatewayConnectionOptionsModel = new DeleteVpnGatewayConnectionOptions.Builder()
    .vpnGatewayId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = vpcService.deleteVpnGatewayConnection(deleteVpnGatewayConnectionOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteVpnGatewayConnectionPath);
  }

  // Test the deleteVpnGatewayConnection operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteVpnGatewayConnectionNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.deleteVpnGatewayConnection(null).execute();
  }

  @Test
  public void testGetVpnGatewayConnectionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"a10a5771-dc23-442c-8460-c3601d8542f7\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpn_gateways/ddf51bec-3424-11e8-b467-0ed5f89f718b/connections/93487806-7743-4c46-81d6-72869883ea0b\", \"name\": \"my-vpn-connection\", \"resource_type\": \"vpn_gateway_connection\", \"admin_state_up\": true, \"peer_address\": \"169.21.50.5\", \"psk\": \"lkj14b1oi0alcniejkso\", \"local_cidrs\": [\"192.168.1.0/24\"], \"peer_cidrs\": [\"10.45.1.0/24\"], \"route_mode\": \"policy\", \"authentication_mode\": \"psk\", \"status\": \"down\", \"created_at\": \"2019-01-01T12:00:00\", \"dead_peer_detection\": {\"action\": \"restart\", \"interval\": 30, \"timeout\": 120}, \"ike_policy\": {\"id\": \"ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/ike_policies/ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"name\": \"my-ike-policy\", \"resource_type\": \"ike_policy\"}, \"ipsec_policy\": {\"id\": \"ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/ipsec_policies/ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"name\": \"my-ipsec-policy\", \"resource_type\": \"ipsec_policy\"}}";
    String getVpnGatewayConnectionPath = java.net.URLEncoder.encode("/vpn_gateways/testString/connections/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetVpnGatewayConnectionOptions model
    GetVpnGatewayConnectionOptions getVpnGatewayConnectionOptionsModel = new GetVpnGatewayConnectionOptions.Builder()
    .vpnGatewayId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<VPNGatewayConnection> response = vpcService.getVpnGatewayConnection(getVpnGatewayConnectionOptionsModel).execute();
    assertNotNull(response);
    VPNGatewayConnection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getVpnGatewayConnectionPath);
  }

  // Test the getVpnGatewayConnection operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetVpnGatewayConnectionNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.getVpnGatewayConnection(null).execute();
  }

  @Test
  public void testUpdateVpnGatewayConnectionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"a10a5771-dc23-442c-8460-c3601d8542f7\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpn_gateways/ddf51bec-3424-11e8-b467-0ed5f89f718b/connections/93487806-7743-4c46-81d6-72869883ea0b\", \"name\": \"my-vpn-connection\", \"resource_type\": \"vpn_gateway_connection\", \"admin_state_up\": true, \"peer_address\": \"169.21.50.5\", \"psk\": \"lkj14b1oi0alcniejkso\", \"local_cidrs\": [\"192.168.1.0/24\"], \"peer_cidrs\": [\"10.45.1.0/24\"], \"route_mode\": \"policy\", \"authentication_mode\": \"psk\", \"status\": \"down\", \"created_at\": \"2019-01-01T12:00:00\", \"dead_peer_detection\": {\"action\": \"restart\", \"interval\": 30, \"timeout\": 120}, \"ike_policy\": {\"id\": \"ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/ike_policies/ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"name\": \"my-ike-policy\", \"resource_type\": \"ike_policy\"}, \"ipsec_policy\": {\"id\": \"ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/ipsec_policies/ddf51bec-3424-11e8-b467-0ed5f89f718b\", \"name\": \"my-ipsec-policy\", \"resource_type\": \"ipsec_policy\"}}";
    String updateVpnGatewayConnectionPath = java.net.URLEncoder.encode("/vpn_gateways/testString/connections/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the VPNGatewayConnectionDPDPrototype model
    VPNGatewayConnectionDPDPrototype vpnGatewayConnectionDpdPrototypeModel = new VPNGatewayConnectionDPDPrototype.Builder()
    .action("restart")
    .interval(Long.valueOf("30"))
    .timeout(Long.valueOf("120"))
    .build();

    // Construct an instance of the IKEPolicyIdentityById model
    IKEPolicyIdentityById ikePolicyIdentityModel = new IKEPolicyIdentityById.Builder()
    .id("ddf51bec-3424-11e8-b467-0ed5f89f718b")
    .build();

    // Construct an instance of the IPsecPolicyIdentityById model
    IPsecPolicyIdentityById iPsecPolicyIdentityModel = new IPsecPolicyIdentityById.Builder()
    .id("ddf51bec-3424-11e8-b467-0ed5f89f718b")
    .build();

    // Construct an instance of the UpdateVpnGatewayConnectionOptions model
    UpdateVpnGatewayConnectionOptions updateVpnGatewayConnectionOptionsModel = new UpdateVpnGatewayConnectionOptions.Builder()
    .vpnGatewayId("testString")
    .id("testString")
    .adminStateUp(true)
    .peerAddress("169.21.50.5")
    .name("my-vpn-connection")
    .psk("lkj14b1oi0alcniejkso")
    .deadPeerDetection(vpnGatewayConnectionDpdPrototypeModel)
    .ikePolicy(ikePolicyIdentityModel)
    .ipsecPolicy(iPsecPolicyIdentityModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<VPNGatewayConnection> response = vpcService.updateVpnGatewayConnection(updateVpnGatewayConnectionOptionsModel).execute();
    assertNotNull(response);
    VPNGatewayConnection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateVpnGatewayConnectionPath);
  }

  // Test the updateVpnGatewayConnection operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateVpnGatewayConnectionNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.updateVpnGatewayConnection(null).execute();
  }

  @Test
  public void testListVpnGatewayConnectionLocalCidrsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"local_cidrs\": [\"192.168.1.0/24\"]}";
    String listVpnGatewayConnectionLocalCidrsPath = java.net.URLEncoder.encode("/vpn_gateways/testString/connections/testString/local_cidrs", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListVpnGatewayConnectionLocalCidrsOptions model
    ListVpnGatewayConnectionLocalCidrsOptions listVpnGatewayConnectionLocalCidrsOptionsModel = new ListVpnGatewayConnectionLocalCidrsOptions.Builder()
    .vpnGatewayId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<VPNGatewayConnectionLocalCIDRs> response = vpcService.listVpnGatewayConnectionLocalCidrs(listVpnGatewayConnectionLocalCidrsOptionsModel).execute();
    assertNotNull(response);
    VPNGatewayConnectionLocalCIDRs responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listVpnGatewayConnectionLocalCidrsPath);
  }

  // Test the listVpnGatewayConnectionLocalCidrs operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListVpnGatewayConnectionLocalCidrsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.listVpnGatewayConnectionLocalCidrs(null).execute();
  }

  @Test
  public void testRemoveVpnGatewayConnectionLocalCidrWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String removeVpnGatewayConnectionLocalCidrPath = java.net.URLEncoder.encode("/vpn_gateways/testString/connections/testString/local_cidrs/testString/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the RemoveVpnGatewayConnectionLocalCidrOptions model
    RemoveVpnGatewayConnectionLocalCidrOptions removeVpnGatewayConnectionLocalCidrOptionsModel = new RemoveVpnGatewayConnectionLocalCidrOptions.Builder()
    .vpnGatewayId("testString")
    .id("testString")
    .cidrPrefix("testString")
    .prefixLength("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = vpcService.removeVpnGatewayConnectionLocalCidr(removeVpnGatewayConnectionLocalCidrOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, removeVpnGatewayConnectionLocalCidrPath);
  }

  // Test the removeVpnGatewayConnectionLocalCidr operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRemoveVpnGatewayConnectionLocalCidrNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.removeVpnGatewayConnectionLocalCidr(null).execute();
  }

  @Test
  public void testCheckVpnGatewayConnectionLocalCidrWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String checkVpnGatewayConnectionLocalCidrPath = java.net.URLEncoder.encode("/vpn_gateways/testString/connections/testString/local_cidrs/testString/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CheckVpnGatewayConnectionLocalCidrOptions model
    CheckVpnGatewayConnectionLocalCidrOptions checkVpnGatewayConnectionLocalCidrOptionsModel = new CheckVpnGatewayConnectionLocalCidrOptions.Builder()
    .vpnGatewayId("testString")
    .id("testString")
    .cidrPrefix("testString")
    .prefixLength("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = vpcService.checkVpnGatewayConnectionLocalCidr(checkVpnGatewayConnectionLocalCidrOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, checkVpnGatewayConnectionLocalCidrPath);
  }

  // Test the checkVpnGatewayConnectionLocalCidr operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCheckVpnGatewayConnectionLocalCidrNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.checkVpnGatewayConnectionLocalCidr(null).execute();
  }

  @Test
  public void testAddVpnGatewayConnectionLocalCidrWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String addVpnGatewayConnectionLocalCidrPath = java.net.URLEncoder.encode("/vpn_gateways/testString/connections/testString/local_cidrs/testString/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the AddVpnGatewayConnectionLocalCidrOptions model
    AddVpnGatewayConnectionLocalCidrOptions addVpnGatewayConnectionLocalCidrOptionsModel = new AddVpnGatewayConnectionLocalCidrOptions.Builder()
    .vpnGatewayId("testString")
    .id("testString")
    .cidrPrefix("testString")
    .prefixLength("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = vpcService.addVpnGatewayConnectionLocalCidr(addVpnGatewayConnectionLocalCidrOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, addVpnGatewayConnectionLocalCidrPath);
  }

  // Test the addVpnGatewayConnectionLocalCidr operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAddVpnGatewayConnectionLocalCidrNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.addVpnGatewayConnectionLocalCidr(null).execute();
  }

  @Test
  public void testListVpnGatewayConnectionPeerCidrsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"peer_cidrs\": [\"10.45.1.0/24\"]}";
    String listVpnGatewayConnectionPeerCidrsPath = java.net.URLEncoder.encode("/vpn_gateways/testString/connections/testString/peer_cidrs", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListVpnGatewayConnectionPeerCidrsOptions model
    ListVpnGatewayConnectionPeerCidrsOptions listVpnGatewayConnectionPeerCidrsOptionsModel = new ListVpnGatewayConnectionPeerCidrsOptions.Builder()
    .vpnGatewayId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<VPNGatewayConnectionPeerCIDRs> response = vpcService.listVpnGatewayConnectionPeerCidrs(listVpnGatewayConnectionPeerCidrsOptionsModel).execute();
    assertNotNull(response);
    VPNGatewayConnectionPeerCIDRs responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listVpnGatewayConnectionPeerCidrsPath);
  }

  // Test the listVpnGatewayConnectionPeerCidrs operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListVpnGatewayConnectionPeerCidrsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.listVpnGatewayConnectionPeerCidrs(null).execute();
  }

  @Test
  public void testRemoveVpnGatewayConnectionPeerCidrWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String removeVpnGatewayConnectionPeerCidrPath = java.net.URLEncoder.encode("/vpn_gateways/testString/connections/testString/peer_cidrs/testString/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the RemoveVpnGatewayConnectionPeerCidrOptions model
    RemoveVpnGatewayConnectionPeerCidrOptions removeVpnGatewayConnectionPeerCidrOptionsModel = new RemoveVpnGatewayConnectionPeerCidrOptions.Builder()
    .vpnGatewayId("testString")
    .id("testString")
    .cidrPrefix("testString")
    .prefixLength("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = vpcService.removeVpnGatewayConnectionPeerCidr(removeVpnGatewayConnectionPeerCidrOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, removeVpnGatewayConnectionPeerCidrPath);
  }

  // Test the removeVpnGatewayConnectionPeerCidr operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRemoveVpnGatewayConnectionPeerCidrNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.removeVpnGatewayConnectionPeerCidr(null).execute();
  }

  @Test
  public void testCheckVpnGatewayConnectionPeerCidrWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String checkVpnGatewayConnectionPeerCidrPath = java.net.URLEncoder.encode("/vpn_gateways/testString/connections/testString/peer_cidrs/testString/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CheckVpnGatewayConnectionPeerCidrOptions model
    CheckVpnGatewayConnectionPeerCidrOptions checkVpnGatewayConnectionPeerCidrOptionsModel = new CheckVpnGatewayConnectionPeerCidrOptions.Builder()
    .vpnGatewayId("testString")
    .id("testString")
    .cidrPrefix("testString")
    .prefixLength("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = vpcService.checkVpnGatewayConnectionPeerCidr(checkVpnGatewayConnectionPeerCidrOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, checkVpnGatewayConnectionPeerCidrPath);
  }

  // Test the checkVpnGatewayConnectionPeerCidr operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCheckVpnGatewayConnectionPeerCidrNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.checkVpnGatewayConnectionPeerCidr(null).execute();
  }

  @Test
  public void testAddVpnGatewayConnectionPeerCidrWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String addVpnGatewayConnectionPeerCidrPath = java.net.URLEncoder.encode("/vpn_gateways/testString/connections/testString/peer_cidrs/testString/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the AddVpnGatewayConnectionPeerCidrOptions model
    AddVpnGatewayConnectionPeerCidrOptions addVpnGatewayConnectionPeerCidrOptionsModel = new AddVpnGatewayConnectionPeerCidrOptions.Builder()
    .vpnGatewayId("testString")
    .id("testString")
    .cidrPrefix("testString")
    .prefixLength("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = vpcService.addVpnGatewayConnectionPeerCidr(addVpnGatewayConnectionPeerCidrOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, addVpnGatewayConnectionPeerCidrPath);
  }

  // Test the addVpnGatewayConnectionPeerCidr operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAddVpnGatewayConnectionPeerCidrNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.addVpnGatewayConnectionPeerCidr(null).execute();
  }

  @Test
  public void testListLoadBalancerProfilesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"first\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancer/profiles?limit=20\"}, \"limit\": 20, \"next\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancer/profiles?start=9d5a91a3e2cbd233b5a5b33436855ed1&limit=20\"}, \"total_count\": 132, \"profiles\": [{\"name\": \"network-fixed\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancer/profiles/network-fixed\", \"family\": \"network\"}]}";
    String listLoadBalancerProfilesPath = java.net.URLEncoder.encode("/load_balancer/profiles", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListLoadBalancerProfilesOptions model
    ListLoadBalancerProfilesOptions listLoadBalancerProfilesOptionsModel = new ListLoadBalancerProfilesOptions.Builder()
    .start("testString")
    .limit(Long.valueOf("1"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<LoadBalancerProfileCollection> response = vpcService.listLoadBalancerProfiles(listLoadBalancerProfilesOptionsModel).execute();
    assertNotNull(response);
    LoadBalancerProfileCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    assertEquals(query.get("start"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listLoadBalancerProfilesPath);
  }

  @Test
  public void testGetLoadBalancerProfileWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"network-fixed\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancer/profiles/network-fixed\", \"family\": \"network\"}";
    String getLoadBalancerProfilePath = java.net.URLEncoder.encode("/load_balancer/profiles/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetLoadBalancerProfileOptions model
    GetLoadBalancerProfileOptions getLoadBalancerProfileOptionsModel = new GetLoadBalancerProfileOptions.Builder()
    .name("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<LoadBalancerProfile> response = vpcService.getLoadBalancerProfile(getLoadBalancerProfileOptionsModel).execute();
    assertNotNull(response);
    LoadBalancerProfile responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getLoadBalancerProfilePath);
  }

  // Test the getLoadBalancerProfile operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetLoadBalancerProfileNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.getLoadBalancerProfile(null).execute();
  }

  @Test
  public void testListLoadBalancersWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"load_balancers\": [{\"profile\": {\"name\": \"network-fixed\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancer/profiles/network-fixed\", \"family\": \"network\"}, \"id\": \"dd754295-e9e0-4c9d-bf6c-58fbc59e5727\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::load-balancer:dd754295-e9e0-4c9d-bf6c-58fbc59e5727\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727\", \"name\": \"my-load-balancer\", \"created_at\": \"2019-01-01T12:00:00\", \"hostname\": \"myloadbalancer-123456-us-south-1.lb.bluemix.net\", \"is_public\": true, \"listeners\": [{\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/listeners/70294e14-4e61-11e8-bcf4-0242ac110004\"}], \"operating_status\": \"offline\", \"pools\": [{\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/pools/70294e14-4e61-11e8-bcf4-0242ac110004\", \"name\": \"my-load-balancer-pool\"}], \"private_ips\": [{\"address\": \"192.168.3.4\"}], \"provisioning_status\": \"active\", \"public_ips\": [{\"address\": \"192.168.3.4\"}], \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"subnets\": [{\"id\": \"7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::subnet:7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/subnets/7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"name\": \"my-subnet\"}]}]}";
    String listLoadBalancersPath = java.net.URLEncoder.encode("/load_balancers", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListLoadBalancersOptions model
    ListLoadBalancersOptions listLoadBalancersOptionsModel = new ListLoadBalancersOptions();

    // Invoke operation with valid options model (positive test)
    Response<LoadBalancerCollection> response = vpcService.listLoadBalancers(listLoadBalancersOptionsModel).execute();
    assertNotNull(response);
    LoadBalancerCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listLoadBalancersPath);
  }

  @Test
  public void testCreateLoadBalancerWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"profile\": {\"name\": \"network-fixed\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancer/profiles/network-fixed\", \"family\": \"network\"}, \"id\": \"dd754295-e9e0-4c9d-bf6c-58fbc59e5727\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::load-balancer:dd754295-e9e0-4c9d-bf6c-58fbc59e5727\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727\", \"name\": \"my-load-balancer\", \"created_at\": \"2019-01-01T12:00:00\", \"hostname\": \"myloadbalancer-123456-us-south-1.lb.bluemix.net\", \"is_public\": true, \"listeners\": [{\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/listeners/70294e14-4e61-11e8-bcf4-0242ac110004\"}], \"operating_status\": \"offline\", \"pools\": [{\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/pools/70294e14-4e61-11e8-bcf4-0242ac110004\", \"name\": \"my-load-balancer-pool\"}], \"private_ips\": [{\"address\": \"192.168.3.4\"}], \"provisioning_status\": \"active\", \"public_ips\": [{\"address\": \"192.168.3.4\"}], \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"subnets\": [{\"id\": \"7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::subnet:7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/subnets/7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"name\": \"my-subnet\"}]}";
    String createLoadBalancerPath = java.net.URLEncoder.encode("/load_balancers", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the SubnetIdentityById model
    SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
    .id("7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
    .build();

    // Construct an instance of the LoadBalancerPoolIdentityByName model
    LoadBalancerPoolIdentityByName loadBalancerPoolIdentityByNameModel = new LoadBalancerPoolIdentityByName.Builder()
    .name("my-load-balancer-pool")
    .build();

    // Construct an instance of the LoadBalancerListenerPrototypeLoadBalancerContext model
    LoadBalancerListenerPrototypeLoadBalancerContext loadBalancerListenerPrototypeLoadBalancerContextModel = new LoadBalancerListenerPrototypeLoadBalancerContext.Builder()
    .connectionLimit(Long.valueOf("2000"))
    .port(Long.valueOf("443"))
    .protocol("http")
    .defaultPool(loadBalancerPoolIdentityByNameModel)
    .build();

    // Construct an instance of the LoadBalancerPoolHealthMonitorPrototype model
    LoadBalancerPoolHealthMonitorPrototype loadBalancerPoolHealthMonitorPrototypeModel = new LoadBalancerPoolHealthMonitorPrototype.Builder()
    .delay(Long.valueOf("5"))
    .maxRetries(Long.valueOf("2"))
    .port(Long.valueOf("22"))
    .timeout(Long.valueOf("2"))
    .type("http")
    .urlPath("/")
    .build();

    // Construct an instance of the LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById model
    LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById loadBalancerPoolMemberTargetPrototypeModel = new LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById.Builder()
    .id("1e09281b-f177-46fb-baf1-bc152b2e391a")
    .build();

    // Construct an instance of the LoadBalancerPoolMemberPrototype model
    LoadBalancerPoolMemberPrototype loadBalancerPoolMemberPrototypeModel = new LoadBalancerPoolMemberPrototype.Builder()
    .port(Long.valueOf("80"))
    .weight(Long.valueOf("50"))
    .target(loadBalancerPoolMemberTargetPrototypeModel)
    .build();

    // Construct an instance of the LoadBalancerPoolSessionPersistencePrototype model
    LoadBalancerPoolSessionPersistencePrototype loadBalancerPoolSessionPersistencePrototypeModel = new LoadBalancerPoolSessionPersistencePrototype.Builder()
    .type("source_ip")
    .build();

    // Construct an instance of the LoadBalancerPoolPrototype model
    LoadBalancerPoolPrototype loadBalancerPoolPrototypeModel = new LoadBalancerPoolPrototype.Builder()
    .name("my-load-balancer-pool")
    .algorithm("least_connections")
    .protocol("http")
    .healthMonitor(loadBalancerPoolHealthMonitorPrototypeModel)
    .members(new java.util.ArrayList<LoadBalancerPoolMemberPrototype>(java.util.Arrays.asList(loadBalancerPoolMemberPrototypeModel)))
    .sessionPersistence(loadBalancerPoolSessionPersistencePrototypeModel)
    .build();

    // Construct an instance of the LoadBalancerProfileIdentityByName model
    LoadBalancerProfileIdentityByName loadBalancerProfileIdentityModel = new LoadBalancerProfileIdentityByName.Builder()
    .name("network-fixed")
    .build();

    // Construct an instance of the ResourceGroupIdentityById model
    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
    .id("fee82deba12e4c0fb69c3b09d1f12345")
    .build();

    // Construct an instance of the CreateLoadBalancerOptions model
    CreateLoadBalancerOptions createLoadBalancerOptionsModel = new CreateLoadBalancerOptions.Builder()
    .isPublic(true)
    .subnets(new java.util.ArrayList<SubnetIdentity>(java.util.Arrays.asList(subnetIdentityModel)))
    .name("my-load-balancer")
    .listeners(new java.util.ArrayList<LoadBalancerListenerPrototypeLoadBalancerContext>(java.util.Arrays.asList(loadBalancerListenerPrototypeLoadBalancerContextModel)))
    .pools(new java.util.ArrayList<LoadBalancerPoolPrototype>(java.util.Arrays.asList(loadBalancerPoolPrototypeModel)))
    .profile(loadBalancerProfileIdentityModel)
    .resourceGroup(resourceGroupIdentityModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<LoadBalancer> response = vpcService.createLoadBalancer(createLoadBalancerOptionsModel).execute();
    assertNotNull(response);
    LoadBalancer responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createLoadBalancerPath);
  }

  // Test the createLoadBalancer operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateLoadBalancerNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.createLoadBalancer(null).execute();
  }

  @Test
  public void testDeleteLoadBalancerWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteLoadBalancerPath = java.net.URLEncoder.encode("/load_balancers/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteLoadBalancerOptions model
    DeleteLoadBalancerOptions deleteLoadBalancerOptionsModel = new DeleteLoadBalancerOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = vpcService.deleteLoadBalancer(deleteLoadBalancerOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteLoadBalancerPath);
  }

  // Test the deleteLoadBalancer operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteLoadBalancerNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.deleteLoadBalancer(null).execute();
  }

  @Test
  public void testGetLoadBalancerWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"profile\": {\"name\": \"network-fixed\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancer/profiles/network-fixed\", \"family\": \"network\"}, \"id\": \"dd754295-e9e0-4c9d-bf6c-58fbc59e5727\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::load-balancer:dd754295-e9e0-4c9d-bf6c-58fbc59e5727\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727\", \"name\": \"my-load-balancer\", \"created_at\": \"2019-01-01T12:00:00\", \"hostname\": \"myloadbalancer-123456-us-south-1.lb.bluemix.net\", \"is_public\": true, \"listeners\": [{\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/listeners/70294e14-4e61-11e8-bcf4-0242ac110004\"}], \"operating_status\": \"offline\", \"pools\": [{\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/pools/70294e14-4e61-11e8-bcf4-0242ac110004\", \"name\": \"my-load-balancer-pool\"}], \"private_ips\": [{\"address\": \"192.168.3.4\"}], \"provisioning_status\": \"active\", \"public_ips\": [{\"address\": \"192.168.3.4\"}], \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"subnets\": [{\"id\": \"7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::subnet:7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/subnets/7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"name\": \"my-subnet\"}]}";
    String getLoadBalancerPath = java.net.URLEncoder.encode("/load_balancers/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetLoadBalancerOptions model
    GetLoadBalancerOptions getLoadBalancerOptionsModel = new GetLoadBalancerOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<LoadBalancer> response = vpcService.getLoadBalancer(getLoadBalancerOptionsModel).execute();
    assertNotNull(response);
    LoadBalancer responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getLoadBalancerPath);
  }

  // Test the getLoadBalancer operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetLoadBalancerNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.getLoadBalancer(null).execute();
  }

  @Test
  public void testUpdateLoadBalancerWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"profile\": {\"name\": \"network-fixed\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancer/profiles/network-fixed\", \"family\": \"network\"}, \"id\": \"dd754295-e9e0-4c9d-bf6c-58fbc59e5727\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::load-balancer:dd754295-e9e0-4c9d-bf6c-58fbc59e5727\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727\", \"name\": \"my-load-balancer\", \"created_at\": \"2019-01-01T12:00:00\", \"hostname\": \"myloadbalancer-123456-us-south-1.lb.bluemix.net\", \"is_public\": true, \"listeners\": [{\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/listeners/70294e14-4e61-11e8-bcf4-0242ac110004\"}], \"operating_status\": \"offline\", \"pools\": [{\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/pools/70294e14-4e61-11e8-bcf4-0242ac110004\", \"name\": \"my-load-balancer-pool\"}], \"private_ips\": [{\"address\": \"192.168.3.4\"}], \"provisioning_status\": \"active\", \"public_ips\": [{\"address\": \"192.168.3.4\"}], \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"subnets\": [{\"id\": \"7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::subnet:7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/subnets/7ec86020-1c6e-4889-b3f0-a15f2e50f87e\", \"name\": \"my-subnet\"}]}";
    String updateLoadBalancerPath = java.net.URLEncoder.encode("/load_balancers/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateLoadBalancerOptions model
    UpdateLoadBalancerOptions updateLoadBalancerOptionsModel = new UpdateLoadBalancerOptions.Builder()
    .id("testString")
    .name("my-load-balancer")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<LoadBalancer> response = vpcService.updateLoadBalancer(updateLoadBalancerOptionsModel).execute();
    assertNotNull(response);
    LoadBalancer responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateLoadBalancerPath);
  }

  // Test the updateLoadBalancer operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateLoadBalancerNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.updateLoadBalancer(null).execute();
  }

  @Test
  public void testGetLoadBalancerStatisticsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"active_connections\": 797, \"connection_rate\": 91.121, \"data_processed_this_month\": 10093173145, \"throughput\": 167.278}";
    String getLoadBalancerStatisticsPath = java.net.URLEncoder.encode("/load_balancers/testString/statistics", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetLoadBalancerStatisticsOptions model
    GetLoadBalancerStatisticsOptions getLoadBalancerStatisticsOptionsModel = new GetLoadBalancerStatisticsOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<LoadBalancerStatistics> response = vpcService.getLoadBalancerStatistics(getLoadBalancerStatisticsOptionsModel).execute();
    assertNotNull(response);
    LoadBalancerStatistics responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getLoadBalancerStatisticsPath);
  }

  // Test the getLoadBalancerStatistics operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetLoadBalancerStatisticsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.getLoadBalancerStatistics(null).execute();
  }

  @Test
  public void testListLoadBalancerListenersWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"listeners\": [{\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/listeners/70294e14-4e61-11e8-bcf4-0242ac110004\", \"connection_limit\": 2000, \"port\": 443, \"protocol\": \"http\", \"certificate_instance\": {\"crn\": \"crn:v1:bluemix:public:cloudcerts:us-south:a/123456:b8866ea4-b8df-467e-801a-da1db7e020bf:certificate:78ff9c4c97d013fb2a95b21dddde7758\"}, \"created_at\": \"2019-01-01T12:00:00\", \"default_pool\": {\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/pools/70294e14-4e61-11e8-bcf4-0242ac110004\", \"name\": \"my-load-balancer-pool\"}, \"policies\": [{\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/listeners/70294e14-4e61-11e8-bcf4-0242ac110004/policies/f3187486-7b27-4c79-990c-47d33c0e2278\"}], \"provisioning_status\": \"active\"}]}";
    String listLoadBalancerListenersPath = java.net.URLEncoder.encode("/load_balancers/testString/listeners", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListLoadBalancerListenersOptions model
    ListLoadBalancerListenersOptions listLoadBalancerListenersOptionsModel = new ListLoadBalancerListenersOptions.Builder()
    .loadBalancerId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<LoadBalancerListenerCollection> response = vpcService.listLoadBalancerListeners(listLoadBalancerListenersOptionsModel).execute();
    assertNotNull(response);
    LoadBalancerListenerCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listLoadBalancerListenersPath);
  }

  // Test the listLoadBalancerListeners operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListLoadBalancerListenersNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.listLoadBalancerListeners(null).execute();
  }

  @Test
  public void testCreateLoadBalancerListenerWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/listeners/70294e14-4e61-11e8-bcf4-0242ac110004\", \"connection_limit\": 2000, \"port\": 443, \"protocol\": \"http\", \"certificate_instance\": {\"crn\": \"crn:v1:bluemix:public:cloudcerts:us-south:a/123456:b8866ea4-b8df-467e-801a-da1db7e020bf:certificate:78ff9c4c97d013fb2a95b21dddde7758\"}, \"created_at\": \"2019-01-01T12:00:00\", \"default_pool\": {\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/pools/70294e14-4e61-11e8-bcf4-0242ac110004\", \"name\": \"my-load-balancer-pool\"}, \"policies\": [{\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/listeners/70294e14-4e61-11e8-bcf4-0242ac110004/policies/f3187486-7b27-4c79-990c-47d33c0e2278\"}], \"provisioning_status\": \"active\"}";
    String createLoadBalancerListenerPath = java.net.URLEncoder.encode("/load_balancers/testString/listeners", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CertificateInstanceIdentityByCRN model
    CertificateInstanceIdentityByCRN certificateInstanceIdentityModel = new CertificateInstanceIdentityByCRN.Builder()
    .crn("crn:v1:bluemix:public:cloudcerts:us-south:a/123456:b8866ea4-b8df-467e-801a-da1db7e020bf:certificate:78ff9c4c97d013fb2a95b21dddde7758")
    .build();

    // Construct an instance of the LoadBalancerPoolIdentityById model
    LoadBalancerPoolIdentityById loadBalancerPoolIdentityModel = new LoadBalancerPoolIdentityById.Builder()
    .id("70294e14-4e61-11e8-bcf4-0242ac110004")
    .build();

    // Construct an instance of the LoadBalancerListenerPolicyRulePrototype model
    LoadBalancerListenerPolicyRulePrototype loadBalancerListenerPolicyRulePrototypeModel = new LoadBalancerListenerPolicyRulePrototype.Builder()
    .condition("contains")
    .field("MY-APP-HEADER")
    .type("header")
    .value("testString")
    .build();

    // Construct an instance of the LoadBalancerListenerPolicyPrototypeTargetLoadBalancerPoolIdentityLoadBalancerPoolIdentityById model
    LoadBalancerListenerPolicyPrototypeTargetLoadBalancerPoolIdentityLoadBalancerPoolIdentityById loadBalancerListenerPolicyPrototypeTargetModel = new LoadBalancerListenerPolicyPrototypeTargetLoadBalancerPoolIdentityLoadBalancerPoolIdentityById.Builder()
    .id("70294e14-4e61-11e8-bcf4-0242ac110004")
    .build();

    // Construct an instance of the LoadBalancerListenerPolicyPrototype model
    LoadBalancerListenerPolicyPrototype loadBalancerListenerPolicyPrototypeModel = new LoadBalancerListenerPolicyPrototype.Builder()
    .name("my-policy")
    .priority(Long.valueOf("5"))
    .action("forward")
    .rules(new java.util.ArrayList<LoadBalancerListenerPolicyRulePrototype>(java.util.Arrays.asList(loadBalancerListenerPolicyRulePrototypeModel)))
    .target(loadBalancerListenerPolicyPrototypeTargetModel)
    .build();

    // Construct an instance of the CreateLoadBalancerListenerOptions model
    CreateLoadBalancerListenerOptions createLoadBalancerListenerOptionsModel = new CreateLoadBalancerListenerOptions.Builder()
    .loadBalancerId("testString")
    .port(Long.valueOf("443"))
    .protocol("http")
    .connectionLimit(Long.valueOf("2000"))
    .certificateInstance(certificateInstanceIdentityModel)
    .defaultPool(loadBalancerPoolIdentityModel)
    .policies(new java.util.ArrayList<LoadBalancerListenerPolicyPrototype>(java.util.Arrays.asList(loadBalancerListenerPolicyPrototypeModel)))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<LoadBalancerListener> response = vpcService.createLoadBalancerListener(createLoadBalancerListenerOptionsModel).execute();
    assertNotNull(response);
    LoadBalancerListener responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createLoadBalancerListenerPath);
  }

  // Test the createLoadBalancerListener operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateLoadBalancerListenerNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.createLoadBalancerListener(null).execute();
  }

  @Test
  public void testDeleteLoadBalancerListenerWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteLoadBalancerListenerPath = java.net.URLEncoder.encode("/load_balancers/testString/listeners/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteLoadBalancerListenerOptions model
    DeleteLoadBalancerListenerOptions deleteLoadBalancerListenerOptionsModel = new DeleteLoadBalancerListenerOptions.Builder()
    .loadBalancerId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = vpcService.deleteLoadBalancerListener(deleteLoadBalancerListenerOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteLoadBalancerListenerPath);
  }

  // Test the deleteLoadBalancerListener operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteLoadBalancerListenerNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.deleteLoadBalancerListener(null).execute();
  }

  @Test
  public void testGetLoadBalancerListenerWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/listeners/70294e14-4e61-11e8-bcf4-0242ac110004\", \"connection_limit\": 2000, \"port\": 443, \"protocol\": \"http\", \"certificate_instance\": {\"crn\": \"crn:v1:bluemix:public:cloudcerts:us-south:a/123456:b8866ea4-b8df-467e-801a-da1db7e020bf:certificate:78ff9c4c97d013fb2a95b21dddde7758\"}, \"created_at\": \"2019-01-01T12:00:00\", \"default_pool\": {\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/pools/70294e14-4e61-11e8-bcf4-0242ac110004\", \"name\": \"my-load-balancer-pool\"}, \"policies\": [{\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/listeners/70294e14-4e61-11e8-bcf4-0242ac110004/policies/f3187486-7b27-4c79-990c-47d33c0e2278\"}], \"provisioning_status\": \"active\"}";
    String getLoadBalancerListenerPath = java.net.URLEncoder.encode("/load_balancers/testString/listeners/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetLoadBalancerListenerOptions model
    GetLoadBalancerListenerOptions getLoadBalancerListenerOptionsModel = new GetLoadBalancerListenerOptions.Builder()
    .loadBalancerId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<LoadBalancerListener> response = vpcService.getLoadBalancerListener(getLoadBalancerListenerOptionsModel).execute();
    assertNotNull(response);
    LoadBalancerListener responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getLoadBalancerListenerPath);
  }

  // Test the getLoadBalancerListener operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetLoadBalancerListenerNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.getLoadBalancerListener(null).execute();
  }

  @Test
  public void testUpdateLoadBalancerListenerWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/listeners/70294e14-4e61-11e8-bcf4-0242ac110004\", \"connection_limit\": 2000, \"port\": 443, \"protocol\": \"http\", \"certificate_instance\": {\"crn\": \"crn:v1:bluemix:public:cloudcerts:us-south:a/123456:b8866ea4-b8df-467e-801a-da1db7e020bf:certificate:78ff9c4c97d013fb2a95b21dddde7758\"}, \"created_at\": \"2019-01-01T12:00:00\", \"default_pool\": {\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/pools/70294e14-4e61-11e8-bcf4-0242ac110004\", \"name\": \"my-load-balancer-pool\"}, \"policies\": [{\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/listeners/70294e14-4e61-11e8-bcf4-0242ac110004/policies/f3187486-7b27-4c79-990c-47d33c0e2278\"}], \"provisioning_status\": \"active\"}";
    String updateLoadBalancerListenerPath = java.net.URLEncoder.encode("/load_balancers/testString/listeners/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CertificateInstanceIdentityByCRN model
    CertificateInstanceIdentityByCRN certificateInstanceIdentityModel = new CertificateInstanceIdentityByCRN.Builder()
    .crn("crn:v1:bluemix:public:cloudcerts:us-south:a/123456:b8866ea4-b8df-467e-801a-da1db7e020bf:certificate:78ff9c4c97d013fb2a95b21dddde7758")
    .build();

    // Construct an instance of the LoadBalancerPoolIdentityById model
    LoadBalancerPoolIdentityById loadBalancerPoolIdentityModel = new LoadBalancerPoolIdentityById.Builder()
    .id("70294e14-4e61-11e8-bcf4-0242ac110004")
    .build();

    // Construct an instance of the UpdateLoadBalancerListenerOptions model
    UpdateLoadBalancerListenerOptions updateLoadBalancerListenerOptionsModel = new UpdateLoadBalancerListenerOptions.Builder()
    .loadBalancerId("testString")
    .id("testString")
    .connectionLimit(Long.valueOf("2000"))
    .port(Long.valueOf("443"))
    .protocol("http")
    .certificateInstance(certificateInstanceIdentityModel)
    .defaultPool(loadBalancerPoolIdentityModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<LoadBalancerListener> response = vpcService.updateLoadBalancerListener(updateLoadBalancerListenerOptionsModel).execute();
    assertNotNull(response);
    LoadBalancerListener responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateLoadBalancerListenerPath);
  }

  // Test the updateLoadBalancerListener operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateLoadBalancerListenerNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.updateLoadBalancerListener(null).execute();
  }

  @Test
  public void testListLoadBalancerListenerPoliciesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"policies\": [{\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/listeners/70294e14-4e61-11e8-bcf4-0242ac110004/policies/f3187486-7b27-4c79-990c-47d33c0e2278\", \"name\": \"my-policy\", \"priority\": 5, \"action\": \"forward\", \"created_at\": \"2019-01-01T12:00:00\", \"provisioning_status\": \"active\", \"rules\": [{\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/listeners/70294e14-4e61-11e8-bcf4-0242ac110004/policies/f3187486-7b27-4c79-990c-47d33c0e2278/rules/873a84b0-84d6-49c6-8948-1fa527b25762\"}], \"target\": {\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/pools/70294e14-4e61-11e8-bcf4-0242ac110004\", \"name\": \"my-load-balancer-pool\"}}]}";
    String listLoadBalancerListenerPoliciesPath = java.net.URLEncoder.encode("/load_balancers/testString/listeners/testString/policies", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListLoadBalancerListenerPoliciesOptions model
    ListLoadBalancerListenerPoliciesOptions listLoadBalancerListenerPoliciesOptionsModel = new ListLoadBalancerListenerPoliciesOptions.Builder()
    .loadBalancerId("testString")
    .listenerId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<LoadBalancerListenerPolicyCollection> response = vpcService.listLoadBalancerListenerPolicies(listLoadBalancerListenerPoliciesOptionsModel).execute();
    assertNotNull(response);
    LoadBalancerListenerPolicyCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listLoadBalancerListenerPoliciesPath);
  }

  // Test the listLoadBalancerListenerPolicies operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListLoadBalancerListenerPoliciesNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.listLoadBalancerListenerPolicies(null).execute();
  }

  @Test
  public void testCreateLoadBalancerListenerPolicyWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/listeners/70294e14-4e61-11e8-bcf4-0242ac110004/policies/f3187486-7b27-4c79-990c-47d33c0e2278\", \"name\": \"my-policy\", \"priority\": 5, \"action\": \"forward\", \"created_at\": \"2019-01-01T12:00:00\", \"provisioning_status\": \"active\", \"rules\": [{\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/listeners/70294e14-4e61-11e8-bcf4-0242ac110004/policies/f3187486-7b27-4c79-990c-47d33c0e2278/rules/873a84b0-84d6-49c6-8948-1fa527b25762\"}], \"target\": {\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/pools/70294e14-4e61-11e8-bcf4-0242ac110004\", \"name\": \"my-load-balancer-pool\"}}";
    String createLoadBalancerListenerPolicyPath = java.net.URLEncoder.encode("/load_balancers/testString/listeners/testString/policies", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the LoadBalancerListenerPolicyRulePrototype model
    LoadBalancerListenerPolicyRulePrototype loadBalancerListenerPolicyRulePrototypeModel = new LoadBalancerListenerPolicyRulePrototype.Builder()
    .condition("contains")
    .field("MY-APP-HEADER")
    .type("header")
    .value("testString")
    .build();

    // Construct an instance of the LoadBalancerListenerPolicyPrototypeTargetLoadBalancerPoolIdentityLoadBalancerPoolIdentityById model
    LoadBalancerListenerPolicyPrototypeTargetLoadBalancerPoolIdentityLoadBalancerPoolIdentityById loadBalancerListenerPolicyPrototypeTargetModel = new LoadBalancerListenerPolicyPrototypeTargetLoadBalancerPoolIdentityLoadBalancerPoolIdentityById.Builder()
    .id("70294e14-4e61-11e8-bcf4-0242ac110004")
    .build();

    // Construct an instance of the CreateLoadBalancerListenerPolicyOptions model
    CreateLoadBalancerListenerPolicyOptions createLoadBalancerListenerPolicyOptionsModel = new CreateLoadBalancerListenerPolicyOptions.Builder()
    .loadBalancerId("testString")
    .listenerId("testString")
    .priority(Long.valueOf("5"))
    .action("forward")
    .name("my-policy")
    .rules(new java.util.ArrayList<LoadBalancerListenerPolicyRulePrototype>(java.util.Arrays.asList(loadBalancerListenerPolicyRulePrototypeModel)))
    .target(loadBalancerListenerPolicyPrototypeTargetModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<LoadBalancerListenerPolicy> response = vpcService.createLoadBalancerListenerPolicy(createLoadBalancerListenerPolicyOptionsModel).execute();
    assertNotNull(response);
    LoadBalancerListenerPolicy responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createLoadBalancerListenerPolicyPath);
  }

  // Test the createLoadBalancerListenerPolicy operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateLoadBalancerListenerPolicyNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.createLoadBalancerListenerPolicy(null).execute();
  }

  @Test
  public void testDeleteLoadBalancerListenerPolicyWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteLoadBalancerListenerPolicyPath = java.net.URLEncoder.encode("/load_balancers/testString/listeners/testString/policies/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteLoadBalancerListenerPolicyOptions model
    DeleteLoadBalancerListenerPolicyOptions deleteLoadBalancerListenerPolicyOptionsModel = new DeleteLoadBalancerListenerPolicyOptions.Builder()
    .loadBalancerId("testString")
    .listenerId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = vpcService.deleteLoadBalancerListenerPolicy(deleteLoadBalancerListenerPolicyOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteLoadBalancerListenerPolicyPath);
  }

  // Test the deleteLoadBalancerListenerPolicy operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteLoadBalancerListenerPolicyNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.deleteLoadBalancerListenerPolicy(null).execute();
  }

  @Test
  public void testGetLoadBalancerListenerPolicyWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/listeners/70294e14-4e61-11e8-bcf4-0242ac110004/policies/f3187486-7b27-4c79-990c-47d33c0e2278\", \"name\": \"my-policy\", \"priority\": 5, \"action\": \"forward\", \"created_at\": \"2019-01-01T12:00:00\", \"provisioning_status\": \"active\", \"rules\": [{\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/listeners/70294e14-4e61-11e8-bcf4-0242ac110004/policies/f3187486-7b27-4c79-990c-47d33c0e2278/rules/873a84b0-84d6-49c6-8948-1fa527b25762\"}], \"target\": {\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/pools/70294e14-4e61-11e8-bcf4-0242ac110004\", \"name\": \"my-load-balancer-pool\"}}";
    String getLoadBalancerListenerPolicyPath = java.net.URLEncoder.encode("/load_balancers/testString/listeners/testString/policies/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetLoadBalancerListenerPolicyOptions model
    GetLoadBalancerListenerPolicyOptions getLoadBalancerListenerPolicyOptionsModel = new GetLoadBalancerListenerPolicyOptions.Builder()
    .loadBalancerId("testString")
    .listenerId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<LoadBalancerListenerPolicy> response = vpcService.getLoadBalancerListenerPolicy(getLoadBalancerListenerPolicyOptionsModel).execute();
    assertNotNull(response);
    LoadBalancerListenerPolicy responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getLoadBalancerListenerPolicyPath);
  }

  // Test the getLoadBalancerListenerPolicy operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetLoadBalancerListenerPolicyNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.getLoadBalancerListenerPolicy(null).execute();
  }

  @Test
  public void testUpdateLoadBalancerListenerPolicyWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/listeners/70294e14-4e61-11e8-bcf4-0242ac110004/policies/f3187486-7b27-4c79-990c-47d33c0e2278\", \"name\": \"my-policy\", \"priority\": 5, \"action\": \"forward\", \"created_at\": \"2019-01-01T12:00:00\", \"provisioning_status\": \"active\", \"rules\": [{\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/listeners/70294e14-4e61-11e8-bcf4-0242ac110004/policies/f3187486-7b27-4c79-990c-47d33c0e2278/rules/873a84b0-84d6-49c6-8948-1fa527b25762\"}], \"target\": {\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/pools/70294e14-4e61-11e8-bcf4-0242ac110004\", \"name\": \"my-load-balancer-pool\"}}";
    String updateLoadBalancerListenerPolicyPath = java.net.URLEncoder.encode("/load_balancers/testString/listeners/testString/policies/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the LoadBalancerListenerPolicyPatchTargetLoadBalancerPoolIdentityLoadBalancerPoolIdentityById model
    LoadBalancerListenerPolicyPatchTargetLoadBalancerPoolIdentityLoadBalancerPoolIdentityById loadBalancerListenerPolicyPatchTargetModel = new LoadBalancerListenerPolicyPatchTargetLoadBalancerPoolIdentityLoadBalancerPoolIdentityById.Builder()
    .id("70294e14-4e61-11e8-bcf4-0242ac110004")
    .build();

    // Construct an instance of the UpdateLoadBalancerListenerPolicyOptions model
    UpdateLoadBalancerListenerPolicyOptions updateLoadBalancerListenerPolicyOptionsModel = new UpdateLoadBalancerListenerPolicyOptions.Builder()
    .loadBalancerId("testString")
    .listenerId("testString")
    .id("testString")
    .name("my-policy")
    .priority(Long.valueOf("5"))
    .target(loadBalancerListenerPolicyPatchTargetModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<LoadBalancerListenerPolicy> response = vpcService.updateLoadBalancerListenerPolicy(updateLoadBalancerListenerPolicyOptionsModel).execute();
    assertNotNull(response);
    LoadBalancerListenerPolicy responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateLoadBalancerListenerPolicyPath);
  }

  // Test the updateLoadBalancerListenerPolicy operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateLoadBalancerListenerPolicyNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.updateLoadBalancerListenerPolicy(null).execute();
  }

  @Test
  public void testListLoadBalancerListenerPolicyRulesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"rules\": [{\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/listeners/70294e14-4e61-11e8-bcf4-0242ac110004/policies/f3187486-7b27-4c79-990c-47d33c0e2278/rules/873a84b0-84d6-49c6-8948-1fa527b25762\", \"condition\": \"contains\", \"field\": \"MY-APP-HEADER\", \"type\": \"header\", \"value\": \"value\", \"created_at\": \"2019-01-01T12:00:00\", \"provisioning_status\": \"active\"}]}";
    String listLoadBalancerListenerPolicyRulesPath = java.net.URLEncoder.encode("/load_balancers/testString/listeners/testString/policies/testString/rules", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListLoadBalancerListenerPolicyRulesOptions model
    ListLoadBalancerListenerPolicyRulesOptions listLoadBalancerListenerPolicyRulesOptionsModel = new ListLoadBalancerListenerPolicyRulesOptions.Builder()
    .loadBalancerId("testString")
    .listenerId("testString")
    .policyId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<LoadBalancerListenerPolicyRuleCollection> response = vpcService.listLoadBalancerListenerPolicyRules(listLoadBalancerListenerPolicyRulesOptionsModel).execute();
    assertNotNull(response);
    LoadBalancerListenerPolicyRuleCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listLoadBalancerListenerPolicyRulesPath);
  }

  // Test the listLoadBalancerListenerPolicyRules operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListLoadBalancerListenerPolicyRulesNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.listLoadBalancerListenerPolicyRules(null).execute();
  }

  @Test
  public void testCreateLoadBalancerListenerPolicyRuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/listeners/70294e14-4e61-11e8-bcf4-0242ac110004/policies/f3187486-7b27-4c79-990c-47d33c0e2278/rules/873a84b0-84d6-49c6-8948-1fa527b25762\", \"condition\": \"contains\", \"field\": \"MY-APP-HEADER\", \"type\": \"header\", \"value\": \"value\", \"created_at\": \"2019-01-01T12:00:00\", \"provisioning_status\": \"active\"}";
    String createLoadBalancerListenerPolicyRulePath = java.net.URLEncoder.encode("/load_balancers/testString/listeners/testString/policies/testString/rules", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CreateLoadBalancerListenerPolicyRuleOptions model
    CreateLoadBalancerListenerPolicyRuleOptions createLoadBalancerListenerPolicyRuleOptionsModel = new CreateLoadBalancerListenerPolicyRuleOptions.Builder()
    .loadBalancerId("testString")
    .listenerId("testString")
    .policyId("testString")
    .condition("contains")
    .type("header")
    .value("testString")
    .field("MY-APP-HEADER")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<LoadBalancerListenerPolicyRule> response = vpcService.createLoadBalancerListenerPolicyRule(createLoadBalancerListenerPolicyRuleOptionsModel).execute();
    assertNotNull(response);
    LoadBalancerListenerPolicyRule responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createLoadBalancerListenerPolicyRulePath);
  }

  // Test the createLoadBalancerListenerPolicyRule operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateLoadBalancerListenerPolicyRuleNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.createLoadBalancerListenerPolicyRule(null).execute();
  }

  @Test
  public void testDeleteLoadBalancerListenerPolicyRuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteLoadBalancerListenerPolicyRulePath = java.net.URLEncoder.encode("/load_balancers/testString/listeners/testString/policies/testString/rules/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteLoadBalancerListenerPolicyRuleOptions model
    DeleteLoadBalancerListenerPolicyRuleOptions deleteLoadBalancerListenerPolicyRuleOptionsModel = new DeleteLoadBalancerListenerPolicyRuleOptions.Builder()
    .loadBalancerId("testString")
    .listenerId("testString")
    .policyId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = vpcService.deleteLoadBalancerListenerPolicyRule(deleteLoadBalancerListenerPolicyRuleOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteLoadBalancerListenerPolicyRulePath);
  }

  // Test the deleteLoadBalancerListenerPolicyRule operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteLoadBalancerListenerPolicyRuleNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.deleteLoadBalancerListenerPolicyRule(null).execute();
  }

  @Test
  public void testGetLoadBalancerListenerPolicyRuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/listeners/70294e14-4e61-11e8-bcf4-0242ac110004/policies/f3187486-7b27-4c79-990c-47d33c0e2278/rules/873a84b0-84d6-49c6-8948-1fa527b25762\", \"condition\": \"contains\", \"field\": \"MY-APP-HEADER\", \"type\": \"header\", \"value\": \"value\", \"created_at\": \"2019-01-01T12:00:00\", \"provisioning_status\": \"active\"}";
    String getLoadBalancerListenerPolicyRulePath = java.net.URLEncoder.encode("/load_balancers/testString/listeners/testString/policies/testString/rules/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetLoadBalancerListenerPolicyRuleOptions model
    GetLoadBalancerListenerPolicyRuleOptions getLoadBalancerListenerPolicyRuleOptionsModel = new GetLoadBalancerListenerPolicyRuleOptions.Builder()
    .loadBalancerId("testString")
    .listenerId("testString")
    .policyId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<LoadBalancerListenerPolicyRule> response = vpcService.getLoadBalancerListenerPolicyRule(getLoadBalancerListenerPolicyRuleOptionsModel).execute();
    assertNotNull(response);
    LoadBalancerListenerPolicyRule responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getLoadBalancerListenerPolicyRulePath);
  }

  // Test the getLoadBalancerListenerPolicyRule operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetLoadBalancerListenerPolicyRuleNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.getLoadBalancerListenerPolicyRule(null).execute();
  }

  @Test
  public void testUpdateLoadBalancerListenerPolicyRuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/listeners/70294e14-4e61-11e8-bcf4-0242ac110004/policies/f3187486-7b27-4c79-990c-47d33c0e2278/rules/873a84b0-84d6-49c6-8948-1fa527b25762\", \"condition\": \"contains\", \"field\": \"MY-APP-HEADER\", \"type\": \"header\", \"value\": \"value\", \"created_at\": \"2019-01-01T12:00:00\", \"provisioning_status\": \"active\"}";
    String updateLoadBalancerListenerPolicyRulePath = java.net.URLEncoder.encode("/load_balancers/testString/listeners/testString/policies/testString/rules/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateLoadBalancerListenerPolicyRuleOptions model
    UpdateLoadBalancerListenerPolicyRuleOptions updateLoadBalancerListenerPolicyRuleOptionsModel = new UpdateLoadBalancerListenerPolicyRuleOptions.Builder()
    .loadBalancerId("testString")
    .listenerId("testString")
    .policyId("testString")
    .id("testString")
    .condition("contains")
    .field("MY-APP-HEADER")
    .type("header")
    .value("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<LoadBalancerListenerPolicyRule> response = vpcService.updateLoadBalancerListenerPolicyRule(updateLoadBalancerListenerPolicyRuleOptionsModel).execute();
    assertNotNull(response);
    LoadBalancerListenerPolicyRule responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateLoadBalancerListenerPolicyRulePath);
  }

  // Test the updateLoadBalancerListenerPolicyRule operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateLoadBalancerListenerPolicyRuleNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.updateLoadBalancerListenerPolicyRule(null).execute();
  }

  @Test
  public void testListLoadBalancerPoolsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"pools\": [{\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/pools/70294e14-4e61-11e8-bcf4-0242ac110004\", \"name\": \"my-load-balancer-pool\", \"algorithm\": \"least_connections\", \"protocol\": \"http\", \"created_at\": \"2019-01-01T12:00:00\", \"health_monitor\": {\"delay\": 5, \"max_retries\": 2, \"port\": 22, \"timeout\": 2, \"type\": \"http\", \"url_path\": \"/\"}, \"instance_group\": {\"id\": \"1e09281b-f177-46fb-baf1-bc152b2e391a\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::instance-group:1e09281b-f177-46fb-baf1-bc152b2e391a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance_groups/1e09281b-f177-46fb-baf1-bc152b2e391a\", \"name\": \"my-instance-group\"}, \"members\": [{\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/pools/70294e14-4e61-11e8-bcf4-0242ac110004/members/80294e14-4e61-11e8-bcf4-0242ac110004\"}], \"provisioning_status\": \"active\", \"session_persistence\": {\"type\": \"source_ip\"}}]}";
    String listLoadBalancerPoolsPath = java.net.URLEncoder.encode("/load_balancers/testString/pools", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListLoadBalancerPoolsOptions model
    ListLoadBalancerPoolsOptions listLoadBalancerPoolsOptionsModel = new ListLoadBalancerPoolsOptions.Builder()
    .loadBalancerId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<LoadBalancerPoolCollection> response = vpcService.listLoadBalancerPools(listLoadBalancerPoolsOptionsModel).execute();
    assertNotNull(response);
    LoadBalancerPoolCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listLoadBalancerPoolsPath);
  }

  // Test the listLoadBalancerPools operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListLoadBalancerPoolsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.listLoadBalancerPools(null).execute();
  }

  @Test
  public void testCreateLoadBalancerPoolWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/pools/70294e14-4e61-11e8-bcf4-0242ac110004\", \"name\": \"my-load-balancer-pool\", \"algorithm\": \"least_connections\", \"protocol\": \"http\", \"created_at\": \"2019-01-01T12:00:00\", \"health_monitor\": {\"delay\": 5, \"max_retries\": 2, \"port\": 22, \"timeout\": 2, \"type\": \"http\", \"url_path\": \"/\"}, \"instance_group\": {\"id\": \"1e09281b-f177-46fb-baf1-bc152b2e391a\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::instance-group:1e09281b-f177-46fb-baf1-bc152b2e391a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance_groups/1e09281b-f177-46fb-baf1-bc152b2e391a\", \"name\": \"my-instance-group\"}, \"members\": [{\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/pools/70294e14-4e61-11e8-bcf4-0242ac110004/members/80294e14-4e61-11e8-bcf4-0242ac110004\"}], \"provisioning_status\": \"active\", \"session_persistence\": {\"type\": \"source_ip\"}}";
    String createLoadBalancerPoolPath = java.net.URLEncoder.encode("/load_balancers/testString/pools", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the LoadBalancerPoolHealthMonitorPrototype model
    LoadBalancerPoolHealthMonitorPrototype loadBalancerPoolHealthMonitorPrototypeModel = new LoadBalancerPoolHealthMonitorPrototype.Builder()
    .delay(Long.valueOf("5"))
    .maxRetries(Long.valueOf("2"))
    .port(Long.valueOf("22"))
    .timeout(Long.valueOf("2"))
    .type("http")
    .urlPath("/")
    .build();

    // Construct an instance of the LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById model
    LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById loadBalancerPoolMemberTargetPrototypeModel = new LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById.Builder()
    .id("1e09281b-f177-46fb-baf1-bc152b2e391a")
    .build();

    // Construct an instance of the LoadBalancerPoolMemberPrototype model
    LoadBalancerPoolMemberPrototype loadBalancerPoolMemberPrototypeModel = new LoadBalancerPoolMemberPrototype.Builder()
    .port(Long.valueOf("80"))
    .weight(Long.valueOf("50"))
    .target(loadBalancerPoolMemberTargetPrototypeModel)
    .build();

    // Construct an instance of the LoadBalancerPoolSessionPersistencePrototype model
    LoadBalancerPoolSessionPersistencePrototype loadBalancerPoolSessionPersistencePrototypeModel = new LoadBalancerPoolSessionPersistencePrototype.Builder()
    .type("source_ip")
    .build();

    // Construct an instance of the CreateLoadBalancerPoolOptions model
    CreateLoadBalancerPoolOptions createLoadBalancerPoolOptionsModel = new CreateLoadBalancerPoolOptions.Builder()
    .loadBalancerId("testString")
    .algorithm("least_connections")
    .protocol("http")
    .healthMonitor(loadBalancerPoolHealthMonitorPrototypeModel)
    .name("my-load-balancer-pool")
    .members(new java.util.ArrayList<LoadBalancerPoolMemberPrototype>(java.util.Arrays.asList(loadBalancerPoolMemberPrototypeModel)))
    .sessionPersistence(loadBalancerPoolSessionPersistencePrototypeModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<LoadBalancerPool> response = vpcService.createLoadBalancerPool(createLoadBalancerPoolOptionsModel).execute();
    assertNotNull(response);
    LoadBalancerPool responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createLoadBalancerPoolPath);
  }

  // Test the createLoadBalancerPool operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateLoadBalancerPoolNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.createLoadBalancerPool(null).execute();
  }

  @Test
  public void testDeleteLoadBalancerPoolWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteLoadBalancerPoolPath = java.net.URLEncoder.encode("/load_balancers/testString/pools/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteLoadBalancerPoolOptions model
    DeleteLoadBalancerPoolOptions deleteLoadBalancerPoolOptionsModel = new DeleteLoadBalancerPoolOptions.Builder()
    .loadBalancerId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = vpcService.deleteLoadBalancerPool(deleteLoadBalancerPoolOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteLoadBalancerPoolPath);
  }

  // Test the deleteLoadBalancerPool operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteLoadBalancerPoolNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.deleteLoadBalancerPool(null).execute();
  }

  @Test
  public void testGetLoadBalancerPoolWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/pools/70294e14-4e61-11e8-bcf4-0242ac110004\", \"name\": \"my-load-balancer-pool\", \"algorithm\": \"least_connections\", \"protocol\": \"http\", \"created_at\": \"2019-01-01T12:00:00\", \"health_monitor\": {\"delay\": 5, \"max_retries\": 2, \"port\": 22, \"timeout\": 2, \"type\": \"http\", \"url_path\": \"/\"}, \"instance_group\": {\"id\": \"1e09281b-f177-46fb-baf1-bc152b2e391a\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::instance-group:1e09281b-f177-46fb-baf1-bc152b2e391a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance_groups/1e09281b-f177-46fb-baf1-bc152b2e391a\", \"name\": \"my-instance-group\"}, \"members\": [{\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/pools/70294e14-4e61-11e8-bcf4-0242ac110004/members/80294e14-4e61-11e8-bcf4-0242ac110004\"}], \"provisioning_status\": \"active\", \"session_persistence\": {\"type\": \"source_ip\"}}";
    String getLoadBalancerPoolPath = java.net.URLEncoder.encode("/load_balancers/testString/pools/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetLoadBalancerPoolOptions model
    GetLoadBalancerPoolOptions getLoadBalancerPoolOptionsModel = new GetLoadBalancerPoolOptions.Builder()
    .loadBalancerId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<LoadBalancerPool> response = vpcService.getLoadBalancerPool(getLoadBalancerPoolOptionsModel).execute();
    assertNotNull(response);
    LoadBalancerPool responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getLoadBalancerPoolPath);
  }

  // Test the getLoadBalancerPool operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetLoadBalancerPoolNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.getLoadBalancerPool(null).execute();
  }

  @Test
  public void testUpdateLoadBalancerPoolWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/pools/70294e14-4e61-11e8-bcf4-0242ac110004\", \"name\": \"my-load-balancer-pool\", \"algorithm\": \"least_connections\", \"protocol\": \"http\", \"created_at\": \"2019-01-01T12:00:00\", \"health_monitor\": {\"delay\": 5, \"max_retries\": 2, \"port\": 22, \"timeout\": 2, \"type\": \"http\", \"url_path\": \"/\"}, \"instance_group\": {\"id\": \"1e09281b-f177-46fb-baf1-bc152b2e391a\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::instance-group:1e09281b-f177-46fb-baf1-bc152b2e391a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instance_groups/1e09281b-f177-46fb-baf1-bc152b2e391a\", \"name\": \"my-instance-group\"}, \"members\": [{\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/pools/70294e14-4e61-11e8-bcf4-0242ac110004/members/80294e14-4e61-11e8-bcf4-0242ac110004\"}], \"provisioning_status\": \"active\", \"session_persistence\": {\"type\": \"source_ip\"}}";
    String updateLoadBalancerPoolPath = java.net.URLEncoder.encode("/load_balancers/testString/pools/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the LoadBalancerPoolHealthMonitorPatch model
    LoadBalancerPoolHealthMonitorPatch loadBalancerPoolHealthMonitorPatchModel = new LoadBalancerPoolHealthMonitorPatch.Builder()
    .delay(Long.valueOf("5"))
    .maxRetries(Long.valueOf("2"))
    .port(Long.valueOf("22"))
    .timeout(Long.valueOf("2"))
    .type("http")
    .urlPath("/")
    .build();

    // Construct an instance of the LoadBalancerPoolSessionPersistencePatch model
    LoadBalancerPoolSessionPersistencePatch loadBalancerPoolSessionPersistencePatchModel = new LoadBalancerPoolSessionPersistencePatch.Builder()
    .type("source_ip")
    .build();

    // Construct an instance of the UpdateLoadBalancerPoolOptions model
    UpdateLoadBalancerPoolOptions updateLoadBalancerPoolOptionsModel = new UpdateLoadBalancerPoolOptions.Builder()
    .loadBalancerId("testString")
    .id("testString")
    .name("my-load-balancer-pool")
    .algorithm("least_connections")
    .protocol("http")
    .healthMonitor(loadBalancerPoolHealthMonitorPatchModel)
    .sessionPersistence(loadBalancerPoolSessionPersistencePatchModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<LoadBalancerPool> response = vpcService.updateLoadBalancerPool(updateLoadBalancerPoolOptionsModel).execute();
    assertNotNull(response);
    LoadBalancerPool responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateLoadBalancerPoolPath);
  }

  // Test the updateLoadBalancerPool operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateLoadBalancerPoolNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.updateLoadBalancerPool(null).execute();
  }

  @Test
  public void testListLoadBalancerPoolMembersWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"members\": [{\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/pools/70294e14-4e61-11e8-bcf4-0242ac110004/members/80294e14-4e61-11e8-bcf4-0242ac110004\", \"port\": 80, \"weight\": 50, \"health\": \"faulted\", \"created_at\": \"2019-01-01T12:00:00\", \"provisioning_status\": \"active\", \"target\": {\"id\": \"1e09281b-f177-46fb-baf1-bc152b2e391a\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::instance:1e09281b-f177-46fb-baf1-bc152b2e391a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a\", \"name\": \"my-instance\"}}]}";
    String listLoadBalancerPoolMembersPath = java.net.URLEncoder.encode("/load_balancers/testString/pools/testString/members", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListLoadBalancerPoolMembersOptions model
    ListLoadBalancerPoolMembersOptions listLoadBalancerPoolMembersOptionsModel = new ListLoadBalancerPoolMembersOptions.Builder()
    .loadBalancerId("testString")
    .poolId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<LoadBalancerPoolMemberCollection> response = vpcService.listLoadBalancerPoolMembers(listLoadBalancerPoolMembersOptionsModel).execute();
    assertNotNull(response);
    LoadBalancerPoolMemberCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listLoadBalancerPoolMembersPath);
  }

  // Test the listLoadBalancerPoolMembers operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListLoadBalancerPoolMembersNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.listLoadBalancerPoolMembers(null).execute();
  }

  @Test
  public void testCreateLoadBalancerPoolMemberWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/pools/70294e14-4e61-11e8-bcf4-0242ac110004/members/80294e14-4e61-11e8-bcf4-0242ac110004\", \"port\": 80, \"weight\": 50, \"health\": \"faulted\", \"created_at\": \"2019-01-01T12:00:00\", \"provisioning_status\": \"active\", \"target\": {\"id\": \"1e09281b-f177-46fb-baf1-bc152b2e391a\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::instance:1e09281b-f177-46fb-baf1-bc152b2e391a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a\", \"name\": \"my-instance\"}}";
    String createLoadBalancerPoolMemberPath = java.net.URLEncoder.encode("/load_balancers/testString/pools/testString/members", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById model
    LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById loadBalancerPoolMemberTargetPrototypeModel = new LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById.Builder()
    .id("1e09281b-f177-46fb-baf1-bc152b2e391a")
    .build();

    // Construct an instance of the CreateLoadBalancerPoolMemberOptions model
    CreateLoadBalancerPoolMemberOptions createLoadBalancerPoolMemberOptionsModel = new CreateLoadBalancerPoolMemberOptions.Builder()
    .loadBalancerId("testString")
    .poolId("testString")
    .port(Long.valueOf("80"))
    .target(loadBalancerPoolMemberTargetPrototypeModel)
    .weight(Long.valueOf("50"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<LoadBalancerPoolMember> response = vpcService.createLoadBalancerPoolMember(createLoadBalancerPoolMemberOptionsModel).execute();
    assertNotNull(response);
    LoadBalancerPoolMember responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createLoadBalancerPoolMemberPath);
  }

  // Test the createLoadBalancerPoolMember operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateLoadBalancerPoolMemberNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.createLoadBalancerPoolMember(null).execute();
  }

  @Test
  public void testReplaceLoadBalancerPoolMembersWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"members\": [{\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/pools/70294e14-4e61-11e8-bcf4-0242ac110004/members/80294e14-4e61-11e8-bcf4-0242ac110004\", \"port\": 80, \"weight\": 50, \"health\": \"faulted\", \"created_at\": \"2019-01-01T12:00:00\", \"provisioning_status\": \"active\", \"target\": {\"id\": \"1e09281b-f177-46fb-baf1-bc152b2e391a\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::instance:1e09281b-f177-46fb-baf1-bc152b2e391a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a\", \"name\": \"my-instance\"}}]}";
    String replaceLoadBalancerPoolMembersPath = java.net.URLEncoder.encode("/load_balancers/testString/pools/testString/members", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(202)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById model
    LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById loadBalancerPoolMemberTargetPrototypeModel = new LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById.Builder()
    .id("1e09281b-f177-46fb-baf1-bc152b2e391a")
    .build();

    // Construct an instance of the LoadBalancerPoolMemberPrototype model
    LoadBalancerPoolMemberPrototype loadBalancerPoolMemberPrototypeModel = new LoadBalancerPoolMemberPrototype.Builder()
    .port(Long.valueOf("80"))
    .weight(Long.valueOf("50"))
    .target(loadBalancerPoolMemberTargetPrototypeModel)
    .build();

    // Construct an instance of the ReplaceLoadBalancerPoolMembersOptions model
    ReplaceLoadBalancerPoolMembersOptions replaceLoadBalancerPoolMembersOptionsModel = new ReplaceLoadBalancerPoolMembersOptions.Builder()
    .loadBalancerId("testString")
    .poolId("testString")
    .members(new java.util.ArrayList<LoadBalancerPoolMemberPrototype>(java.util.Arrays.asList(loadBalancerPoolMemberPrototypeModel)))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<LoadBalancerPoolMemberCollection> response = vpcService.replaceLoadBalancerPoolMembers(replaceLoadBalancerPoolMembersOptionsModel).execute();
    assertNotNull(response);
    LoadBalancerPoolMemberCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceLoadBalancerPoolMembersPath);
  }

  // Test the replaceLoadBalancerPoolMembers operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceLoadBalancerPoolMembersNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.replaceLoadBalancerPoolMembers(null).execute();
  }

  @Test
  public void testDeleteLoadBalancerPoolMemberWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteLoadBalancerPoolMemberPath = java.net.URLEncoder.encode("/load_balancers/testString/pools/testString/members/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteLoadBalancerPoolMemberOptions model
    DeleteLoadBalancerPoolMemberOptions deleteLoadBalancerPoolMemberOptionsModel = new DeleteLoadBalancerPoolMemberOptions.Builder()
    .loadBalancerId("testString")
    .poolId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = vpcService.deleteLoadBalancerPoolMember(deleteLoadBalancerPoolMemberOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteLoadBalancerPoolMemberPath);
  }

  // Test the deleteLoadBalancerPoolMember operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteLoadBalancerPoolMemberNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.deleteLoadBalancerPoolMember(null).execute();
  }

  @Test
  public void testGetLoadBalancerPoolMemberWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/pools/70294e14-4e61-11e8-bcf4-0242ac110004/members/80294e14-4e61-11e8-bcf4-0242ac110004\", \"port\": 80, \"weight\": 50, \"health\": \"faulted\", \"created_at\": \"2019-01-01T12:00:00\", \"provisioning_status\": \"active\", \"target\": {\"id\": \"1e09281b-f177-46fb-baf1-bc152b2e391a\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::instance:1e09281b-f177-46fb-baf1-bc152b2e391a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a\", \"name\": \"my-instance\"}}";
    String getLoadBalancerPoolMemberPath = java.net.URLEncoder.encode("/load_balancers/testString/pools/testString/members/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetLoadBalancerPoolMemberOptions model
    GetLoadBalancerPoolMemberOptions getLoadBalancerPoolMemberOptionsModel = new GetLoadBalancerPoolMemberOptions.Builder()
    .loadBalancerId("testString")
    .poolId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<LoadBalancerPoolMember> response = vpcService.getLoadBalancerPoolMember(getLoadBalancerPoolMemberOptionsModel).execute();
    assertNotNull(response);
    LoadBalancerPoolMember responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getLoadBalancerPoolMemberPath);
  }

  // Test the getLoadBalancerPoolMember operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetLoadBalancerPoolMemberNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.getLoadBalancerPoolMember(null).execute();
  }

  @Test
  public void testUpdateLoadBalancerPoolMemberWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"70294e14-4e61-11e8-bcf4-0242ac110004\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/pools/70294e14-4e61-11e8-bcf4-0242ac110004/members/80294e14-4e61-11e8-bcf4-0242ac110004\", \"port\": 80, \"weight\": 50, \"health\": \"faulted\", \"created_at\": \"2019-01-01T12:00:00\", \"provisioning_status\": \"active\", \"target\": {\"id\": \"1e09281b-f177-46fb-baf1-bc152b2e391a\", \"crn\": \"crn:v1:bluemix:public:is:us-south-1:a/123456::instance:1e09281b-f177-46fb-baf1-bc152b2e391a\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a\", \"name\": \"my-instance\"}}";
    String updateLoadBalancerPoolMemberPath = java.net.URLEncoder.encode("/load_balancers/testString/pools/testString/members/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById model
    LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById loadBalancerPoolMemberTargetPrototypeModel = new LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById.Builder()
    .id("1e09281b-f177-46fb-baf1-bc152b2e391a")
    .build();

    // Construct an instance of the UpdateLoadBalancerPoolMemberOptions model
    UpdateLoadBalancerPoolMemberOptions updateLoadBalancerPoolMemberOptionsModel = new UpdateLoadBalancerPoolMemberOptions.Builder()
    .loadBalancerId("testString")
    .poolId("testString")
    .id("testString")
    .port(Long.valueOf("80"))
    .weight(Long.valueOf("50"))
    .target(loadBalancerPoolMemberTargetPrototypeModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<LoadBalancerPoolMember> response = vpcService.updateLoadBalancerPoolMember(updateLoadBalancerPoolMemberOptionsModel).execute();
    assertNotNull(response);
    LoadBalancerPoolMember responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateLoadBalancerPoolMemberPath);
  }

  // Test the updateLoadBalancerPoolMember operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateLoadBalancerPoolMemberNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.updateLoadBalancerPoolMember(null).execute();
  }

  @Test
  public void testListFlowLogCollectorsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"first\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/flow_log_collectors?limit=20\"}, \"limit\": 20, \"next\": {\"href\": \"https://us-south.iaas.cloud.ibm.com/v1/flow_log_collectors?start=9d5a91a3e2cbd233b5a5b33436855ed1&limit=20\"}, \"total_count\": 132, \"flow_log_collectors\": [{\"id\": \"39300233-9995-4806-89a5-3c1b6eb88689\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::flow-log-collector:39300233-9995-4806-89a5-3c1b6eb88689\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/flow_log_collectors/39300233-9995-4806-89a5-3c1b6eb88689\", \"name\": \"my-flow-log-collector\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"active\": true, \"auto_delete\": true, \"created_at\": \"2019-01-01T12:00:00\", \"lifecycle_state\": \"stable\", \"storage_bucket\": {\"name\": \"bucket-27200-lwx4cfvcue\"}, \"target\": {\"id\": \"10c02d81-0ecb-4dc5-897d-28392913b81e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/network_interfaces/10c02d81-0ecb-4dc5-897d-28392913b81e\", \"name\": \"my-network-interface\", \"resource_type\": \"network_interface\"}, \"vpc\": {\"id\": \"4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"name\": \"my-vpc\"}}]}";
    String listFlowLogCollectorsPath = java.net.URLEncoder.encode("/flow_log_collectors", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListFlowLogCollectorsOptions model
    ListFlowLogCollectorsOptions listFlowLogCollectorsOptionsModel = new ListFlowLogCollectorsOptions.Builder()
    .start("testString")
    .limit(Long.valueOf("1"))
    .resourceGroupId("testString")
    .name("testString")
    .vpcId("testString")
    .vpcCrn("testString")
    .vpcName("testString")
    .targetId("testString")
    .targetResourceType("vpc")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<FlowLogCollectorCollection> response = vpcService.listFlowLogCollectors(listFlowLogCollectorsOptionsModel).execute();
    assertNotNull(response);
    FlowLogCollectorCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    assertEquals(query.get("start"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(query.get("resource_group.id"), "testString");
    assertEquals(query.get("name"), "testString");
    assertEquals(query.get("vpc.id"), "testString");
    assertEquals(query.get("vpc.crn"), "testString");
    assertEquals(query.get("vpc.name"), "testString");
    assertEquals(query.get("target.id"), "testString");
    assertEquals(query.get("target.resource_type"), "vpc");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listFlowLogCollectorsPath);
  }

  @Test
  public void testCreateFlowLogCollectorWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"39300233-9995-4806-89a5-3c1b6eb88689\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::flow-log-collector:39300233-9995-4806-89a5-3c1b6eb88689\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/flow_log_collectors/39300233-9995-4806-89a5-3c1b6eb88689\", \"name\": \"my-flow-log-collector\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"active\": true, \"auto_delete\": true, \"created_at\": \"2019-01-01T12:00:00\", \"lifecycle_state\": \"stable\", \"storage_bucket\": {\"name\": \"bucket-27200-lwx4cfvcue\"}, \"target\": {\"id\": \"10c02d81-0ecb-4dc5-897d-28392913b81e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/network_interfaces/10c02d81-0ecb-4dc5-897d-28392913b81e\", \"name\": \"my-network-interface\", \"resource_type\": \"network_interface\"}, \"vpc\": {\"id\": \"4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"name\": \"my-vpc\"}}";
    String createFlowLogCollectorPath = java.net.URLEncoder.encode("/flow_log_collectors", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CloudObjectStorageBucketIdentityByName model
    CloudObjectStorageBucketIdentityByName cloudObjectStorageBucketIdentityModel = new CloudObjectStorageBucketIdentityByName.Builder()
    .name("bucket-27200-lwx4cfvcue")
    .build();

    // Construct an instance of the FlowLogCollectorPrototypeTargetNetworkInterfaceIdentityNetworkInterfaceIdentityNetworkInterfaceIdentityById model
    FlowLogCollectorPrototypeTargetNetworkInterfaceIdentityNetworkInterfaceIdentityNetworkInterfaceIdentityById flowLogCollectorPrototypeTargetModel = new FlowLogCollectorPrototypeTargetNetworkInterfaceIdentityNetworkInterfaceIdentityNetworkInterfaceIdentityById.Builder()
    .id("10c02d81-0ecb-4dc5-897d-28392913b81e")
    .build();

    // Construct an instance of the ResourceGroupIdentityById model
    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
    .id("fee82deba12e4c0fb69c3b09d1f12345")
    .build();

    // Construct an instance of the CreateFlowLogCollectorOptions model
    CreateFlowLogCollectorOptions createFlowLogCollectorOptionsModel = new CreateFlowLogCollectorOptions.Builder()
    .storageBucket(cloudObjectStorageBucketIdentityModel)
    .target(flowLogCollectorPrototypeTargetModel)
    .name("my-flow-log-collector")
    .active(false)
    .resourceGroup(resourceGroupIdentityModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<FlowLogCollector> response = vpcService.createFlowLogCollector(createFlowLogCollectorOptionsModel).execute();
    assertNotNull(response);
    FlowLogCollector responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createFlowLogCollectorPath);
  }

  // Test the createFlowLogCollector operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateFlowLogCollectorNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.createFlowLogCollector(null).execute();
  }

  @Test
  public void testDeleteFlowLogCollectorWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteFlowLogCollectorPath = java.net.URLEncoder.encode("/flow_log_collectors/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteFlowLogCollectorOptions model
    DeleteFlowLogCollectorOptions deleteFlowLogCollectorOptionsModel = new DeleteFlowLogCollectorOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = vpcService.deleteFlowLogCollector(deleteFlowLogCollectorOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteFlowLogCollectorPath);
  }

  // Test the deleteFlowLogCollector operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteFlowLogCollectorNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.deleteFlowLogCollector(null).execute();
  }

  @Test
  public void testGetFlowLogCollectorWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"39300233-9995-4806-89a5-3c1b6eb88689\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::flow-log-collector:39300233-9995-4806-89a5-3c1b6eb88689\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/flow_log_collectors/39300233-9995-4806-89a5-3c1b6eb88689\", \"name\": \"my-flow-log-collector\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"active\": true, \"auto_delete\": true, \"created_at\": \"2019-01-01T12:00:00\", \"lifecycle_state\": \"stable\", \"storage_bucket\": {\"name\": \"bucket-27200-lwx4cfvcue\"}, \"target\": {\"id\": \"10c02d81-0ecb-4dc5-897d-28392913b81e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/network_interfaces/10c02d81-0ecb-4dc5-897d-28392913b81e\", \"name\": \"my-network-interface\", \"resource_type\": \"network_interface\"}, \"vpc\": {\"id\": \"4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"name\": \"my-vpc\"}}";
    String getFlowLogCollectorPath = java.net.URLEncoder.encode("/flow_log_collectors/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetFlowLogCollectorOptions model
    GetFlowLogCollectorOptions getFlowLogCollectorOptionsModel = new GetFlowLogCollectorOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<FlowLogCollector> response = vpcService.getFlowLogCollector(getFlowLogCollectorOptionsModel).execute();
    assertNotNull(response);
    FlowLogCollector responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getFlowLogCollectorPath);
  }

  // Test the getFlowLogCollector operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetFlowLogCollectorNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.getFlowLogCollector(null).execute();
  }

  @Test
  public void testUpdateFlowLogCollectorWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"39300233-9995-4806-89a5-3c1b6eb88689\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::flow-log-collector:39300233-9995-4806-89a5-3c1b6eb88689\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/flow_log_collectors/39300233-9995-4806-89a5-3c1b6eb88689\", \"name\": \"my-flow-log-collector\", \"resource_group\": {\"id\": \"fee82deba12e4c0fb69c3b09d1f12345\", \"name\": \"my-resource-group\", \"href\": \"https://resource-controller.cloud.ibm.com/v2/resource_groups/fee82deba12e4c0fb69c3b09d1f12345\"}, \"active\": true, \"auto_delete\": true, \"created_at\": \"2019-01-01T12:00:00\", \"lifecycle_state\": \"stable\", \"storage_bucket\": {\"name\": \"bucket-27200-lwx4cfvcue\"}, \"target\": {\"id\": \"10c02d81-0ecb-4dc5-897d-28392913b81e\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/network_interfaces/10c02d81-0ecb-4dc5-897d-28392913b81e\", \"name\": \"my-network-interface\", \"resource_type\": \"network_interface\"}, \"vpc\": {\"id\": \"4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"crn\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"href\": \"https://us-south.iaas.cloud.ibm.com/v1/vpcs/4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"name\": \"my-vpc\"}}";
    String updateFlowLogCollectorPath = java.net.URLEncoder.encode("/flow_log_collectors/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateFlowLogCollectorOptions model
    UpdateFlowLogCollectorOptions updateFlowLogCollectorOptionsModel = new UpdateFlowLogCollectorOptions.Builder()
    .id("testString")
    .name("my-flow-log-collector")
    .active(true)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<FlowLogCollector> response = vpcService.updateFlowLogCollector(updateFlowLogCollectorOptionsModel).execute();
    assertNotNull(response);
    FlowLogCollector responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("generation")), Long.valueOf("2"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateFlowLogCollectorPath);
  }

  // Test the updateFlowLogCollector operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateFlowLogCollectorNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    vpcService.updateFlowLogCollector(null).execute();
  }

  /** Initialize the server */
  @BeforeMethod
  public void setUpMockServer() {
    try {
        server = new MockWebServer();
        // register handler
        server.start();
        }
    catch (IOException err) {
        fail("Failed to instantiate mock web server");
    }
  }

  @AfterMethod
  public void tearDownMockServer() throws IOException {
    server.shutdown();
    vpcService = null;
  }
}