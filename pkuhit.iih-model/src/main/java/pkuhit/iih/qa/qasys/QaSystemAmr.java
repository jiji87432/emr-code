package pkuhit.iih.qa.qasys;

import xap.sv.annotation.DictionaryTag;
import xap.model.BaseRelationModel;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;









public static final   String  CODE = "QAK02.AT01";
// 质控体系编码
public static final   String  QA_SYSTEM_CODE = "QAK02.AT02";
// 就诊类型编码
public static final   String  ENCOUNTER_TYPE_CODE = "QAK02.AT03";
// 质控要求
public static final   String  REQUIREMENT = "QAK02.AT04";
// 总分值
public static final   String  TOTAL_SCORE = "QAK02.AT05";


@Column(name="QA_SYS_AMR_CD") 
private  String code;

@Column(name="QA_SYS_CD") 
private  String qaSystemCode;

@Column(name="EN_TP_CD") 
private  String encounterTypeCode;

@Column(name="REQ") 
private  String requirement;

@Column(name="TTL_SCR") 
private  Integer totalScore;
// 质控体系名称
private  String qaSystemName;
// 就诊类型名称
private  String encounterTypeName;

 {
     return this.code;
 }

 {
  this.code = code;
 }

 {
     return this.qaSystemCode;
 }

 {
  this.qaSystemCode = qaSystemCode;
 }

 {
     return this.encounterTypeCode;
 }

 {
  this.encounterTypeCode = encounterTypeCode;
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
     return this.qaSystemName;
 }

 {
  this.qaSystemName = qaSystemName;
 }

 {
     return this.encounterTypeName;
 }

 {
  this.encounterTypeName = encounterTypeName;
 }

