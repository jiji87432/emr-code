select
  MR_TPL_CD,
  ORG_CD,
  MR_BASE_TPL_CD,
  FILE_PK,
  MR_TPL_STA_CD,
  NM,
  DES,
  OWN_TP_CD,
  OWN_CD,
  MR_TP_CD,
  MR_SIGN_LVL_CD,
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
  EN_TP_CD,
  XML_FILE_PK,
  DEL_F
from
  MR_TPL
where
  MR_TPL_CD = /* mrTplCd */'a'
and del_f = 0
