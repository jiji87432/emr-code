select
  DATA_ELEMENT_REL_CD,
  DATA_ELEMENT_CD,
  CODE_SYSTEM_CD,
  CODE_SYSTEM_DATA_ELEMENT_CD,
  CODE_SYSTEM_DATA_ELEMENT_VER,
  DESCRIPTIONS,
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
  DEL_F
from
  MD_META_ELEMENT_REL
where
  DATA_ELEMENT_REL_CD = /* dataElementRelCd */'a'
and del_f = 0
