select
  OB_RP_PK,
  EN_PK,
  PA_ID,
  EN_CNT,
  PA_NM,
  OB_RP_STA_CD,
  OB_RP_STA_NM,
  OB_RP_NO,
  OB_RP_NM,
  OB_IMPR,
  OB_FNDG,
  OB_VAL,
  NORMAL_FLAG,
  OB_ITM_CD,
  OB_ITM_NM,
  EXEC_TIME,
  EXEC_DCT_ID,
  EXEC_DCT_NM,
  EXEC_DEPT_CD,
  EXEC_DEPT_NM,
  RLS_USER_ID,
  RLS_USER_NM,
  RLS_TIME,
  RQS_TIME,
  RQS_DCT_ID,
  RQS_DCT_NM,
  OB_DI,
  ADV
from
  OBS_REPORT_COLLECT
where
1=1
/*%if enPk != null*/
  and en_pk =/*enPk*/'1203730'
/*%end */
