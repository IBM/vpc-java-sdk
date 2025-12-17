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

package com.ibm.cloud.is.vpc.v1.model;

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * NetworkACLRuleItem.
 *
 * Classes which extend this class:
 * - NetworkACLRuleItemNetworkACLRuleProtocolAny
 * - NetworkACLRuleItemNetworkACLRuleProtocolICMPTCPUDP
 * - NetworkACLRuleItemNetworkACLRuleProtocolICMP
 * - NetworkACLRuleItemNetworkACLRuleProtocolTCPUDP
 * - NetworkACLRuleItemNetworkACLRuleProtocolIndividual
 */
public class NetworkACLRuleItem extends GenericModel {
  @SuppressWarnings("unused")
  protected static String discriminatorPropertyName = "protocol";
  protected static java.util.Map<String, Class<?>> discriminatorMapping;
  static {
    discriminatorMapping = new java.util.HashMap<>();
    discriminatorMapping.put("ah", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("any", NetworkACLRuleItemNetworkACLRuleProtocolAny.class);
    discriminatorMapping.put("esp", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("gre", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("icmp", NetworkACLRuleItemNetworkACLRuleProtocolICMP.class);
    discriminatorMapping.put("icmp_tcp_udp", NetworkACLRuleItemNetworkACLRuleProtocolICMPTCPUDP.class);
    discriminatorMapping.put("ip_in_ip", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("l2tp", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_0", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_10", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_100", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_101", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_102", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_103", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_104", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_105", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_106", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_107", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_108", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_109", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_11", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_110", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_111", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_113", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_114", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_116", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_117", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_118", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_119", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_12", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_120", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_121", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_122", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_123", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_124", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_125", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_126", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_127", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_128", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_129", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_13", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_130", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_131", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_133", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_134", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_135", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_136", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_137", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_138", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_139", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_14", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_140", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_141", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_142", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_143", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_144", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_145", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_146", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_147", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_148", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_149", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_15", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_150", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_151", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_152", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_153", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_154", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_155", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_156", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_157", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_158", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_159", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_16", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_160", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_161", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_162", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_163", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_164", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_165", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_166", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_167", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_168", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_169", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_170", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_171", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_172", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_173", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_174", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_175", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_176", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_177", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_178", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_179", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_18", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_180", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_181", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_182", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_183", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_184", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_185", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_186", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_187", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_188", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_189", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_19", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_190", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_191", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_192", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_193", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_194", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_195", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_196", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_197", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_198", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_199", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_2", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_20", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_200", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_201", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_202", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_203", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_204", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_205", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_206", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_207", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_208", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_209", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_21", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_210", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_211", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_212", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_213", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_214", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_215", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_216", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_217", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_218", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_219", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_22", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_220", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_221", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_222", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_223", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_224", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_225", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_226", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_227", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_228", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_229", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_23", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_230", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_231", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_232", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_233", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_234", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_235", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_236", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_237", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_238", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_239", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_24", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_240", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_241", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_242", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_243", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_244", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_245", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_246", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_247", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_248", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_249", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_25", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_250", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_251", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_252", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_253", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_254", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_255", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_26", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_27", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_28", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_29", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_3", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_30", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_31", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_32", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_33", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_34", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_35", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_36", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_37", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_38", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_39", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_40", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_41", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_42", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_43", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_44", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_45", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_48", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_49", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_5", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_52", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_53", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_54", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_55", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_56", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_57", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_58", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_59", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_60", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_61", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_62", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_63", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_64", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_65", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_66", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_67", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_68", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_69", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_7", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_70", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_71", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_72", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_73", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_74", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_75", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_76", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_77", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_78", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_79", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_8", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_80", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_81", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_82", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_83", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_84", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_85", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_86", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_87", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_88", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_89", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_9", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_90", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_91", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_92", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_93", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_94", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_95", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_96", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_97", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_98", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("number_99", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("rsvp", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("sctp", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
    discriminatorMapping.put("tcp", NetworkACLRuleItemNetworkACLRuleProtocolTCPUDP.class);
    discriminatorMapping.put("udp", NetworkACLRuleItemNetworkACLRuleProtocolTCPUDP.class);
    discriminatorMapping.put("vrrp", NetworkACLRuleItemNetworkACLRuleProtocolIndividual.class);
  }
  /**
   * The action to perform for a packet matching the rule.
   */
  public interface Action {
    /** allow. */
    String ALLOW = "allow";
    /** deny. */
    String DENY = "deny";
  }

  /**
   * The direction of traffic to match.
   */
  public interface Direction {
    /** inbound. */
    String INBOUND = "inbound";
    /** outbound. */
    String OUTBOUND = "outbound";
  }

  /**
   * The IP version for this rule.
   */
  public interface IpVersion {
    /** ipv4. */
    String IPV4 = "ipv4";
  }

  /**
   * The network protocol.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Protocol {
    /** ah. */
    String AH = "ah";
    /** any. */
    String ANY = "any";
    /** esp. */
    String ESP = "esp";
    /** gre. */
    String GRE = "gre";
    /** icmp. */
    String ICMP = "icmp";
    /** icmp_tcp_udp. */
    String ICMP_TCP_UDP = "icmp_tcp_udp";
    /** ip_in_ip. */
    String IP_IN_IP = "ip_in_ip";
    /** l2tp. */
    String L2TP = "l2tp";
    /** number_0. */
    String NUMBER_0 = "number_0";
    /** number_10. */
    String NUMBER_10 = "number_10";
    /** number_100. */
    String NUMBER_100 = "number_100";
    /** number_101. */
    String NUMBER_101 = "number_101";
    /** number_102. */
    String NUMBER_102 = "number_102";
    /** number_103. */
    String NUMBER_103 = "number_103";
    /** number_104. */
    String NUMBER_104 = "number_104";
    /** number_105. */
    String NUMBER_105 = "number_105";
    /** number_106. */
    String NUMBER_106 = "number_106";
    /** number_107. */
    String NUMBER_107 = "number_107";
    /** number_108. */
    String NUMBER_108 = "number_108";
    /** number_109. */
    String NUMBER_109 = "number_109";
    /** number_11. */
    String NUMBER_11 = "number_11";
    /** number_110. */
    String NUMBER_110 = "number_110";
    /** number_111. */
    String NUMBER_111 = "number_111";
    /** number_113. */
    String NUMBER_113 = "number_113";
    /** number_114. */
    String NUMBER_114 = "number_114";
    /** number_116. */
    String NUMBER_116 = "number_116";
    /** number_117. */
    String NUMBER_117 = "number_117";
    /** number_118. */
    String NUMBER_118 = "number_118";
    /** number_119. */
    String NUMBER_119 = "number_119";
    /** number_12. */
    String NUMBER_12 = "number_12";
    /** number_120. */
    String NUMBER_120 = "number_120";
    /** number_121. */
    String NUMBER_121 = "number_121";
    /** number_122. */
    String NUMBER_122 = "number_122";
    /** number_123. */
    String NUMBER_123 = "number_123";
    /** number_124. */
    String NUMBER_124 = "number_124";
    /** number_125. */
    String NUMBER_125 = "number_125";
    /** number_126. */
    String NUMBER_126 = "number_126";
    /** number_127. */
    String NUMBER_127 = "number_127";
    /** number_128. */
    String NUMBER_128 = "number_128";
    /** number_129. */
    String NUMBER_129 = "number_129";
    /** number_13. */
    String NUMBER_13 = "number_13";
    /** number_130. */
    String NUMBER_130 = "number_130";
    /** number_131. */
    String NUMBER_131 = "number_131";
    /** number_133. */
    String NUMBER_133 = "number_133";
    /** number_134. */
    String NUMBER_134 = "number_134";
    /** number_135. */
    String NUMBER_135 = "number_135";
    /** number_136. */
    String NUMBER_136 = "number_136";
    /** number_137. */
    String NUMBER_137 = "number_137";
    /** number_138. */
    String NUMBER_138 = "number_138";
    /** number_139. */
    String NUMBER_139 = "number_139";
    /** number_14. */
    String NUMBER_14 = "number_14";
    /** number_140. */
    String NUMBER_140 = "number_140";
    /** number_141. */
    String NUMBER_141 = "number_141";
    /** number_142. */
    String NUMBER_142 = "number_142";
    /** number_143. */
    String NUMBER_143 = "number_143";
    /** number_144. */
    String NUMBER_144 = "number_144";
    /** number_145. */
    String NUMBER_145 = "number_145";
    /** number_146. */
    String NUMBER_146 = "number_146";
    /** number_147. */
    String NUMBER_147 = "number_147";
    /** number_148. */
    String NUMBER_148 = "number_148";
    /** number_149. */
    String NUMBER_149 = "number_149";
    /** number_15. */
    String NUMBER_15 = "number_15";
    /** number_150. */
    String NUMBER_150 = "number_150";
    /** number_151. */
    String NUMBER_151 = "number_151";
    /** number_152. */
    String NUMBER_152 = "number_152";
    /** number_153. */
    String NUMBER_153 = "number_153";
    /** number_154. */
    String NUMBER_154 = "number_154";
    /** number_155. */
    String NUMBER_155 = "number_155";
    /** number_156. */
    String NUMBER_156 = "number_156";
    /** number_157. */
    String NUMBER_157 = "number_157";
    /** number_158. */
    String NUMBER_158 = "number_158";
    /** number_159. */
    String NUMBER_159 = "number_159";
    /** number_16. */
    String NUMBER_16 = "number_16";
    /** number_160. */
    String NUMBER_160 = "number_160";
    /** number_161. */
    String NUMBER_161 = "number_161";
    /** number_162. */
    String NUMBER_162 = "number_162";
    /** number_163. */
    String NUMBER_163 = "number_163";
    /** number_164. */
    String NUMBER_164 = "number_164";
    /** number_165. */
    String NUMBER_165 = "number_165";
    /** number_166. */
    String NUMBER_166 = "number_166";
    /** number_167. */
    String NUMBER_167 = "number_167";
    /** number_168. */
    String NUMBER_168 = "number_168";
    /** number_169. */
    String NUMBER_169 = "number_169";
    /** number_170. */
    String NUMBER_170 = "number_170";
    /** number_171. */
    String NUMBER_171 = "number_171";
    /** number_172. */
    String NUMBER_172 = "number_172";
    /** number_173. */
    String NUMBER_173 = "number_173";
    /** number_174. */
    String NUMBER_174 = "number_174";
    /** number_175. */
    String NUMBER_175 = "number_175";
    /** number_176. */
    String NUMBER_176 = "number_176";
    /** number_177. */
    String NUMBER_177 = "number_177";
    /** number_178. */
    String NUMBER_178 = "number_178";
    /** number_179. */
    String NUMBER_179 = "number_179";
    /** number_18. */
    String NUMBER_18 = "number_18";
    /** number_180. */
    String NUMBER_180 = "number_180";
    /** number_181. */
    String NUMBER_181 = "number_181";
    /** number_182. */
    String NUMBER_182 = "number_182";
    /** number_183. */
    String NUMBER_183 = "number_183";
    /** number_184. */
    String NUMBER_184 = "number_184";
    /** number_185. */
    String NUMBER_185 = "number_185";
    /** number_186. */
    String NUMBER_186 = "number_186";
    /** number_187. */
    String NUMBER_187 = "number_187";
    /** number_188. */
    String NUMBER_188 = "number_188";
    /** number_189. */
    String NUMBER_189 = "number_189";
    /** number_19. */
    String NUMBER_19 = "number_19";
    /** number_190. */
    String NUMBER_190 = "number_190";
    /** number_191. */
    String NUMBER_191 = "number_191";
    /** number_192. */
    String NUMBER_192 = "number_192";
    /** number_193. */
    String NUMBER_193 = "number_193";
    /** number_194. */
    String NUMBER_194 = "number_194";
    /** number_195. */
    String NUMBER_195 = "number_195";
    /** number_196. */
    String NUMBER_196 = "number_196";
    /** number_197. */
    String NUMBER_197 = "number_197";
    /** number_198. */
    String NUMBER_198 = "number_198";
    /** number_199. */
    String NUMBER_199 = "number_199";
    /** number_2. */
    String NUMBER_2 = "number_2";
    /** number_20. */
    String NUMBER_20 = "number_20";
    /** number_200. */
    String NUMBER_200 = "number_200";
    /** number_201. */
    String NUMBER_201 = "number_201";
    /** number_202. */
    String NUMBER_202 = "number_202";
    /** number_203. */
    String NUMBER_203 = "number_203";
    /** number_204. */
    String NUMBER_204 = "number_204";
    /** number_205. */
    String NUMBER_205 = "number_205";
    /** number_206. */
    String NUMBER_206 = "number_206";
    /** number_207. */
    String NUMBER_207 = "number_207";
    /** number_208. */
    String NUMBER_208 = "number_208";
    /** number_209. */
    String NUMBER_209 = "number_209";
    /** number_21. */
    String NUMBER_21 = "number_21";
    /** number_210. */
    String NUMBER_210 = "number_210";
    /** number_211. */
    String NUMBER_211 = "number_211";
    /** number_212. */
    String NUMBER_212 = "number_212";
    /** number_213. */
    String NUMBER_213 = "number_213";
    /** number_214. */
    String NUMBER_214 = "number_214";
    /** number_215. */
    String NUMBER_215 = "number_215";
    /** number_216. */
    String NUMBER_216 = "number_216";
    /** number_217. */
    String NUMBER_217 = "number_217";
    /** number_218. */
    String NUMBER_218 = "number_218";
    /** number_219. */
    String NUMBER_219 = "number_219";
    /** number_22. */
    String NUMBER_22 = "number_22";
    /** number_220. */
    String NUMBER_220 = "number_220";
    /** number_221. */
    String NUMBER_221 = "number_221";
    /** number_222. */
    String NUMBER_222 = "number_222";
    /** number_223. */
    String NUMBER_223 = "number_223";
    /** number_224. */
    String NUMBER_224 = "number_224";
    /** number_225. */
    String NUMBER_225 = "number_225";
    /** number_226. */
    String NUMBER_226 = "number_226";
    /** number_227. */
    String NUMBER_227 = "number_227";
    /** number_228. */
    String NUMBER_228 = "number_228";
    /** number_229. */
    String NUMBER_229 = "number_229";
    /** number_23. */
    String NUMBER_23 = "number_23";
    /** number_230. */
    String NUMBER_230 = "number_230";
    /** number_231. */
    String NUMBER_231 = "number_231";
    /** number_232. */
    String NUMBER_232 = "number_232";
    /** number_233. */
    String NUMBER_233 = "number_233";
    /** number_234. */
    String NUMBER_234 = "number_234";
    /** number_235. */
    String NUMBER_235 = "number_235";
    /** number_236. */
    String NUMBER_236 = "number_236";
    /** number_237. */
    String NUMBER_237 = "number_237";
    /** number_238. */
    String NUMBER_238 = "number_238";
    /** number_239. */
    String NUMBER_239 = "number_239";
    /** number_24. */
    String NUMBER_24 = "number_24";
    /** number_240. */
    String NUMBER_240 = "number_240";
    /** number_241. */
    String NUMBER_241 = "number_241";
    /** number_242. */
    String NUMBER_242 = "number_242";
    /** number_243. */
    String NUMBER_243 = "number_243";
    /** number_244. */
    String NUMBER_244 = "number_244";
    /** number_245. */
    String NUMBER_245 = "number_245";
    /** number_246. */
    String NUMBER_246 = "number_246";
    /** number_247. */
    String NUMBER_247 = "number_247";
    /** number_248. */
    String NUMBER_248 = "number_248";
    /** number_249. */
    String NUMBER_249 = "number_249";
    /** number_25. */
    String NUMBER_25 = "number_25";
    /** number_250. */
    String NUMBER_250 = "number_250";
    /** number_251. */
    String NUMBER_251 = "number_251";
    /** number_252. */
    String NUMBER_252 = "number_252";
    /** number_253. */
    String NUMBER_253 = "number_253";
    /** number_254. */
    String NUMBER_254 = "number_254";
    /** number_255. */
    String NUMBER_255 = "number_255";
    /** number_26. */
    String NUMBER_26 = "number_26";
    /** number_27. */
    String NUMBER_27 = "number_27";
    /** number_28. */
    String NUMBER_28 = "number_28";
    /** number_29. */
    String NUMBER_29 = "number_29";
    /** number_3. */
    String NUMBER_3 = "number_3";
    /** number_30. */
    String NUMBER_30 = "number_30";
    /** number_31. */
    String NUMBER_31 = "number_31";
    /** number_32. */
    String NUMBER_32 = "number_32";
    /** number_33. */
    String NUMBER_33 = "number_33";
    /** number_34. */
    String NUMBER_34 = "number_34";
    /** number_35. */
    String NUMBER_35 = "number_35";
    /** number_36. */
    String NUMBER_36 = "number_36";
    /** number_37. */
    String NUMBER_37 = "number_37";
    /** number_38. */
    String NUMBER_38 = "number_38";
    /** number_39. */
    String NUMBER_39 = "number_39";
    /** number_40. */
    String NUMBER_40 = "number_40";
    /** number_41. */
    String NUMBER_41 = "number_41";
    /** number_42. */
    String NUMBER_42 = "number_42";
    /** number_43. */
    String NUMBER_43 = "number_43";
    /** number_44. */
    String NUMBER_44 = "number_44";
    /** number_45. */
    String NUMBER_45 = "number_45";
    /** number_48. */
    String NUMBER_48 = "number_48";
    /** number_49. */
    String NUMBER_49 = "number_49";
    /** number_5. */
    String NUMBER_5 = "number_5";
    /** number_52. */
    String NUMBER_52 = "number_52";
    /** number_53. */
    String NUMBER_53 = "number_53";
    /** number_54. */
    String NUMBER_54 = "number_54";
    /** number_55. */
    String NUMBER_55 = "number_55";
    /** number_56. */
    String NUMBER_56 = "number_56";
    /** number_57. */
    String NUMBER_57 = "number_57";
    /** number_58. */
    String NUMBER_58 = "number_58";
    /** number_59. */
    String NUMBER_59 = "number_59";
    /** number_60. */
    String NUMBER_60 = "number_60";
    /** number_61. */
    String NUMBER_61 = "number_61";
    /** number_62. */
    String NUMBER_62 = "number_62";
    /** number_63. */
    String NUMBER_63 = "number_63";
    /** number_64. */
    String NUMBER_64 = "number_64";
    /** number_65. */
    String NUMBER_65 = "number_65";
    /** number_66. */
    String NUMBER_66 = "number_66";
    /** number_67. */
    String NUMBER_67 = "number_67";
    /** number_68. */
    String NUMBER_68 = "number_68";
    /** number_69. */
    String NUMBER_69 = "number_69";
    /** number_7. */
    String NUMBER_7 = "number_7";
    /** number_70. */
    String NUMBER_70 = "number_70";
    /** number_71. */
    String NUMBER_71 = "number_71";
    /** number_72. */
    String NUMBER_72 = "number_72";
    /** number_73. */
    String NUMBER_73 = "number_73";
    /** number_74. */
    String NUMBER_74 = "number_74";
    /** number_75. */
    String NUMBER_75 = "number_75";
    /** number_76. */
    String NUMBER_76 = "number_76";
    /** number_77. */
    String NUMBER_77 = "number_77";
    /** number_78. */
    String NUMBER_78 = "number_78";
    /** number_79. */
    String NUMBER_79 = "number_79";
    /** number_8. */
    String NUMBER_8 = "number_8";
    /** number_80. */
    String NUMBER_80 = "number_80";
    /** number_81. */
    String NUMBER_81 = "number_81";
    /** number_82. */
    String NUMBER_82 = "number_82";
    /** number_83. */
    String NUMBER_83 = "number_83";
    /** number_84. */
    String NUMBER_84 = "number_84";
    /** number_85. */
    String NUMBER_85 = "number_85";
    /** number_86. */
    String NUMBER_86 = "number_86";
    /** number_87. */
    String NUMBER_87 = "number_87";
    /** number_88. */
    String NUMBER_88 = "number_88";
    /** number_89. */
    String NUMBER_89 = "number_89";
    /** number_9. */
    String NUMBER_9 = "number_9";
    /** number_90. */
    String NUMBER_90 = "number_90";
    /** number_91. */
    String NUMBER_91 = "number_91";
    /** number_92. */
    String NUMBER_92 = "number_92";
    /** number_93. */
    String NUMBER_93 = "number_93";
    /** number_94. */
    String NUMBER_94 = "number_94";
    /** number_95. */
    String NUMBER_95 = "number_95";
    /** number_96. */
    String NUMBER_96 = "number_96";
    /** number_97. */
    String NUMBER_97 = "number_97";
    /** number_98. */
    String NUMBER_98 = "number_98";
    /** number_99. */
    String NUMBER_99 = "number_99";
    /** rsvp. */
    String RSVP = "rsvp";
    /** sctp. */
    String SCTP = "sctp";
    /** tcp. */
    String TCP = "tcp";
    /** udp. */
    String UDP = "udp";
    /** vrrp. */
    String VRRP = "vrrp";
  }

  protected String action;
  protected NetworkACLRuleReference before;
  @SerializedName("created_at")
  protected Date createdAt;
  protected String destination;
  protected String direction;
  protected String href;
  protected String id;
  @SerializedName("ip_version")
  protected String ipVersion;
  protected String name;
  protected String protocol;
  protected String source;
  protected Long code;
  protected Long type;
  @SerializedName("destination_port_max")
  protected Long destinationPortMax;
  @SerializedName("destination_port_min")
  protected Long destinationPortMin;
  @SerializedName("source_port_max")
  protected Long sourcePortMax;
  @SerializedName("source_port_min")
  protected Long sourcePortMin;

  protected NetworkACLRuleItem() { }

  /**
   * Gets the action.
   *
   * The action to perform for a packet matching the rule.
   *
   * @return the action
   */
  public String getAction() {
    return action;
  }

  /**
   * Gets the before.
   *
   * The rule that this rule is immediately before. In a rule collection, this always
   * refers to the next item in the collection. If absent, this is the last rule.
   *
   * @return the before
   */
  public NetworkACLRuleReference getBefore() {
    return before;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that the rule was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the destination.
   *
   * The destination IP address or CIDR block to match. The CIDR block `0.0.0.0/0` matches all destination addresses.
   *
   * @return the destination
   */
  public String getDestination() {
    return destination;
  }

  /**
   * Gets the direction.
   *
   * The direction of traffic to match.
   *
   * @return the direction
   */
  public String getDirection() {
    return direction;
  }

  /**
   * Gets the href.
   *
   * The URL for this network ACL rule.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this network ACL rule.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the ipVersion.
   *
   * The IP version for this rule.
   *
   * @return the ipVersion
   */
  public String getIpVersion() {
    return ipVersion;
  }

  /**
   * Gets the name.
   *
   * The name for this network ACL rule. The name is unique across all rules for the network ACL.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the protocol.
   *
   * The network protocol.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the protocol
   */
  public String getProtocol() {
    return protocol;
  }

  /**
   * Gets the source.
   *
   * The source IP address or CIDR block to match. The CIDR block `0.0.0.0/0` matches all source addresses.
   *
   * @return the source
   */
  public String getSource() {
    return source;
  }

  /**
   * Gets the code.
   *
   * The ICMP traffic code to match.
   *
   * If absent, all codes are matched.
   *
   * @return the code
   */
  public Long getCode() {
    return code;
  }

  /**
   * Gets the type.
   *
   * The ICMP traffic type to match.
   *
   * If absent, all types are matched.
   *
   * @return the type
   */
  public Long getType() {
    return type;
  }

  /**
   * Gets the destinationPortMax.
   *
   * The inclusive upper bound of the TCP or UDP destination port range.
   *
   * @return the destinationPortMax
   */
  public Long getDestinationPortMax() {
    return destinationPortMax;
  }

  /**
   * Gets the destinationPortMin.
   *
   * The inclusive lower bound of the TCP or UDP destination port range.
   *
   * @return the destinationPortMin
   */
  public Long getDestinationPortMin() {
    return destinationPortMin;
  }

  /**
   * Gets the sourcePortMax.
   *
   * The inclusive upper bound of the TCP or UDP source port range.
   *
   * @return the sourcePortMax
   */
  public Long getSourcePortMax() {
    return sourcePortMax;
  }

  /**
   * Gets the sourcePortMin.
   *
   * The inclusive lower bound of the TCP or UDP source port range.
   *
   * @return the sourcePortMin
   */
  public Long getSourcePortMin() {
    return sourcePortMin;
  }
}

