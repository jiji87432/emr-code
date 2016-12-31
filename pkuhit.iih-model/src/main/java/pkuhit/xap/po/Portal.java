package pkuhit.xap.po;

import xap.sv.annotation.DictionaryTag;
import xap.model.BaseMasterModel;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;









public static final   String  CODE = "XAPM06.AT01";
// 组织机构编码
public static final   String  ORGANIZATION_CODE = "XAPM06.AT02";
// 名称
public static final   String  NAME = "XAPM06.AT03";
// 描述
public static final   String  DESCRIPTION = "XAPM06.AT04";
// 英文简称
public static final   String  SHORT_ENGLISH_NAME_ = "XAPM06.AT05";
// 英文名称
public static final   String  ENGLISH_NAME = "XAPM06.AT06";


@Column(name="PORTAL_CD") 
private  String code;

@Column(name="ORG_CD") 
private  String organizationCode;

@Column(name="NM") 
private  String name;

@Column(name="DES") 
private  String description;

@Column(name="SHT_NM_EN") 
private  String shortEnglishName;

@Column(name="NM_EN") 
private  String englishName;
// 组织机构名称
//@DictionaryTag(code = "organizationCode")
private  String organizationName;

 {
     return this.code;
 }

 {
  this.code = code;
 }

 {
     return this.organizationCode;
 }

 {
  this.organizationCode = organizationCode;
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

 {
     return this.organizationName;
 }

 {
  this.organizationName = organizationName;
 }

