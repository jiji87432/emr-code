select
  MR_TP_SEG_CD,
  MR_TP_CD,
  MR_SEG_TP_CD,
  SORT_NO,
  UPD_CNT,
  CRT_TIME,
  CRT_USER_ID,
  CRT_DEPT_CD,
  LAST_UPD_TIME,
  LAST_UPD_DEPT_CD,
  LAST_UPD_USER_ID,
  DEL_F
from
  MD_MR_TP_SEG
where
  MR_TP_SEG_CD = /* mrTpSegCd */'a'
and del_f = 0