/**
 * 
 */
package ei.cis.db.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;

import xap.sv.dao.annotation.RepositoryConfig;
import ei.cis.db.dao.auto.entity.IemrEnAdtEntity;

/**
 * @author guo_zhongbao
 * 自定义转科记录dao
 */
@Dao
@RepositoryConfig
public interface CusCisIemrEnAdtEntityDao {
	@Select
    List<IemrEnAdtEntity> selectAll();
}
