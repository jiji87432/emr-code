select 
  MR_TP_CCAT_CD,
  NM,
  DES,
  CONTINUE_PRINT_F,
  MEMO,
  SORT_NO,
  SPELL_NO,
  WUBI_NO,
  UPD_CNT,
  CRT_TIME,
  CRT_USER_ID,
  CRT_DEPT_CD,
  LAST_UPD_TIME,
  LAST_UPD_DEPT_CD,
  LAST_UPD_USER_ID,
  DEL_F,
  DCT_NS_F 
 from MD_MR_TP_CCAT 
 where ORG_CD = /*orgCode*/'SZLH' 
 and del_f = 0 
 and  LVL <= /*maxDepthLevel*/5 
 /*%if rootCode != null*/
  start with PAR_MR_TP_CCAT_CD = /*rootCode*/1
/*%else */
  start with PAR_MR_TP_CCAT_CD is null
/*%end */
 connect by prior MR_TP_CCAT_CD = PAR_MR_TP_CCAT_CD
 