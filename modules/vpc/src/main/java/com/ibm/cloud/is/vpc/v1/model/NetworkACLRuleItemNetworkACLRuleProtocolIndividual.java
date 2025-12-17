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

/**
 * NetworkACLRuleItemNetworkACLRuleProtocolIndividual.
 */
public class NetworkACLRuleItemNetworkACLRuleProtocolIndividual extends NetworkACLRuleItem {

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
   * The value must be the name of an individual protocol, excluding `icmp`, `tcp` and `udp`. Names for well known
   * protocols are:
   * - `ah`: AH (authentication header, protocol number `51`)
   * - `esp`: ESP (encapsulating security payload, protocol number `50`)
   * - `gre`: GRE (generic routing encapsulation, protocol number `47`)
   * - `ip_in_ip`: IP encapsulation within IP (protocol number `4`)
   * - `l2tp`: L2TP (layer two tunneling protocol, protocol number `115`)
   * - `rsvp`: RSVP (reservation protocol, protocol number `46`)
   * - `sctp`: SCTP (stream control transmission protocol, protocol number `132`)
   * - `vrrp`: VRRP (virtual router redundancy protocol, protocol number `112`)
   *
   * For other protocols, specify a value of `number_`*N*, where *N* is the network protocol number in decimal.
   */
  public interface Protocol {
    /** ah. */
    String AH = "ah";
    /** esp. */
    String ESP = "esp";
    /** gre. */
    String GRE = "gre";
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
    /** vrrp. */
    String VRRP = "vrrp";
  }


  protected NetworkACLRuleItemNetworkACLRuleProtocolIndividual() { }
}

