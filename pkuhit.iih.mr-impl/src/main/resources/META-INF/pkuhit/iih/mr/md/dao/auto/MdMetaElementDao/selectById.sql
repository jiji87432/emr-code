select
  DATA_ELEMENT_CD,
  DATA_ELEMENT_NM_EN,
  DATA_ELEMENT_NM,
  DATA_META_TYPE_CD,
  DATA_META_STATUS_CD,
  DATA_TYPE_CD,
  DEFAULT_VALUE,
  DEFAULT_UNIT_CD,
  RELATED_MASTER_TABLE_CD,
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
  MD_META_ELEMENT
where
  DATA_ELEMENT_CD = /* dataElementCd */'a'
and del_f = 0
