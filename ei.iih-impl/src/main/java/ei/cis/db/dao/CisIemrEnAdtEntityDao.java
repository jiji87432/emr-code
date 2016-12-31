package ei.cis.db.dao;

import java.sql.Clob;
import java.util.List;

import org.seasar.doma.BatchDelete;
import org.seasar.doma.BatchInsert;
import org.seasar.doma.BatchUpdate;
import org.seasar.doma.ClobFactory;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

import xap.sv.dao.annotation.RepositoryConfig;
import ei.cis.db.dao.auto.entity.IemrEnAdtEntity;


/**
 */
@Dao
@RepositoryConfig
public interface CisIemrEnAdtEntityDao {

    /**
     * @param enAdtCd
     * @return the IemrEnAdtEntity entity
     */
    @Select
    IemrEnAdtEntity selectById(String enAdtCd);


    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(IemrEnAdtEntity entity);
    
    /**
     * 为null的字段不会更新到数据表
     * @param entity
     * @return affected rows
     */
    @Insert(excludeNull=true)
    int insertExludeNull(IemrEnAdtEntity entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(IemrEnAdtEntity entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update(excludeNull=true)
    int updateExcludeNull(IemrEnAdtEntity entity);

    /**
     * 标记删除
     * @param entity
     * 对实体进行标记删除时entity需要设置三个值，updCount，主键，del_f（=1）
     * @return affected rows
     */
    @Update(excludeNull=true)
    int markDelete(IemrEnAdtEntity entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(IemrEnAdtEntity entity);

    @BatchInsert
    int[] batchInsert(List<IemrEnAdtEntity> entities);

    @BatchUpdate
    int[] batchUpdate(List<IemrEnAdtEntity> entities);

    @BatchDelete
    int[] batchDelete(List<IemrEnAdtEntity> entities);
    
    @ClobFactory
    Clob createClob();
}