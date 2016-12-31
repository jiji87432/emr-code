package pkuhit.iih.qa.qasys;

import xap.sv.annotation.DictionaryTag;
import xap.model.BaseRelationModel;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;









public static final   String  CODE = "QAK03.AT01";
// 质控体系病案编码
public static final   String  QA_SYSTEM_AMR_CODE = "QAK03.AT02";
// 医疗记录类型编码
public static final   String  MR_TYPE_CODE = "QAK03.AT03";
// 质控要求
public static final   String  REQUIREMENT = "QAK03.AT04";
// 总分值
public static final   String  TOTAL_SCORE = "QAK03.AT05";


@Column(name="QA_SYS_MR_CD") 
private  String code;

@Column(name="QA_SYS_AMR_CD") 
private  String qaSystemAmrCode;

@Column(name="MR_TP_CD") 
private  String mrTypeCode;

@Column(name="REQ") 
private  String requirement;

@Column(name="TTL_SCR") 
private  Integer totalScore;
// 医疗记录类型名称
@DictionaryTag(code = "mrTypeCode")
private  String mrTypeName;

 {
     return this.code;
 }

 {
  this.code = code;
 }

 {
     return this.qaSystemAmrCode;
 }

 {
  this.qaSystemAmrCode = qaSystemAmrCode;
 }

 {
     return this.mrTypeCode;
 }

 {
  this.mrTypeCode = mrTypeCode;
 }

 {
     return this.requirement;
 }

 {
  this.requirement = requirement;
 }

 {
     return this.totalScore;
 }

 {
  this.totalScore = totalScore;
 }

 {
     return this.mrTypeName;
 }

 {
  this.mrTypeName = mrTypeName;
 }

