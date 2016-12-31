package pkuhit.iih.qa.qasys;

import xap.sv.annotation.DictionaryTag;
import xap.model.BaseRelationModel;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;









public static final   String  CODE = "QAK06.AT01";
// 质控体系质控项目编码
public static final   String  QA_SYSTEM_ITEM_CODE = "QAK06.AT02";
// 规则编码
public static final   String  RULE_CODE = "QAK06.AT03";


@Column(name="QA_SYS_RULE_CD") 
private  String code;

@Column(name="QA_SYS_ITM_CD") 
private  String qaSystemItemCode;

@Column(name="RULE_CD") 
private  String ruleCode;

 {
     return this.code;
 }

 {
  this.code = code;
 }

 {
     return this.qaSystemItemCode;
 }

 {
  this.qaSystemItemCode = qaSystemItemCode;
 }

 {
     return this.ruleCode;
 }

 {
  this.ruleCode = ruleCode;
 }

