package pkuhit.iih.mr.md.dao.auto;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import pkuhit.iih.mr.md.dao.auto.entity.MdMetaElementRel;
import xap.sv.dao.annotation.RepositoryConfig;
import org.seasar.doma.BatchDelete;
import org.seasar.doma.BatchInsert;
import org.seasar.doma.BatchUpdate;
import java.util.List;
import org.seasar.doma.ClobFactory;
import java.sql.Clob;


/**
 */
@Dao
@RepositoryConfig
public interface MdMetaElementRelDao {

    /**
     * @param dataElementRelCd
     * @return the MdMetaElementRel entity
     */
    @Select
    MdMetaElementRel selectById(String dataElementRelCd);


    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MdMetaElementRel entity);
    
    /**
     * 为null的字段不会更新到数据表
     * @param entity
     * @return affected rows
     */
    @Insert(excludeNull=true)
    int insertExludeNull(MdMetaElementRel entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MdMetaElementRel entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update(excludeNull=true)
    int updateExcludeNull(MdMetaElementRel entity);

    /**
     * 标记删除
     * @param entity
     * 对实体进行标记删除时entity需要设置三个值，updCount，主键，del_f（=1）
     * @return affected rows
     */
    @Update(excludeNull=true)
    int markDelete(MdMetaElementRel entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MdMetaElementRel entity);

    @BatchInsert
    int[] batchInsert(List<MdMetaElementRel> entities);

    @BatchUpdate
    int[] batchUpdate(List<MdMetaElementRel> entities);

    @BatchDelete
    int[] batchDelete(List<MdMetaElementRel> entities);
    
    @ClobFactory
    Clob createClob();
}