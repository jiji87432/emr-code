package pkuhit.iih.mr.md;

import xap.model.BaseMasterModel;








//枚举常量
 public static final String   OBJ_CD  = "MRM04";
//新建
public final static String CREATED = "MRM04.01";
//已提交
public final static String SUBMITTED = "MRM04.02";
//已一级审签
//public final static String SIGNED_LEVEL_1 = "MRM04.03";
//二级审签中
public final static String SIGNED_LEVEL_2ING = "MRM04.03";
//已二级审签
public final static String SIGNED_LEVEL_2 = "MRM04.04";
//三级审签中
public final static String SIGNED_LEVEL_3ING = "MRM04.05";
//已三级审签
public final static String SIGNED_LEVEL_3 = "MRM04.06";

public static final   String  CODE = "MRM04.AT01";
// 审签级别编码
public static final   String  SIGN_LEVEL_CODE = "MRM04.AT02";
// 下一医疗记录状态编码
public static final   String  NEXT_MR_STATUS_CODE = "MRM04.AT03";
// 上一医疗记录状态编码
public static final   String  PRE_MR_STATUS_CODE = "MRM04.AT04";
// 名称
public static final   String  NAME = "MRM04.AT05";
// 描述
public static final   String  DESCRIPTION = "MRM04.AT06";
// 英文简称
public static final   String  SHORT_ENGLISH_NAME = "MRM04.AT07";
// 英文名称
public static final   String  ENGLISH_NAME = "MRM04.AT08";


@Column(name="MR_STA_CD") 
private  String code;

@Column(name="SIGN_LVL_CD") 
private  String signLevelCode;

@Column(name="NEXT_MR_STA_CD") 
private  String nextMrStatusCode;

@Column(name="PRE_MR_STA_CD") 
private  String preMrStatusCode;

@Column(name="NM") 
private  String name;

@Column(name="DES") 
private  String description;

@Column(name="SHT_NM_EN") 
private  String shortEnglishName;

@Column(name="NM_EN") 
private  String englishName;

 {
     return this.code;
 }

 {
  this.code = code;
 }

 {
     return this.signLevelCode;
 }

 {
  this.signLevelCode = signLevelCode;
 }

 {
     return this.nextMrStatusCode;
 }

 {
  this.nextMrStatusCode = nextMrStatusCode;
 }

 {
     return this.preMrStatusCode;
 }

 {
  this.preMrStatusCode = preMrStatusCode;
 }

 {
     return this.name;
 }

 {
  this.name = name;
 }

 {
     return this.description;
 }

 {
  this.description = description;
 }

 {
     return this.shortEnglishName;
 }

 {
  this.shortEnglishName = shortEnglishName;
 }

 {
     return this.englishName;
 }

 {
  this.englishName = englishName;
 }

