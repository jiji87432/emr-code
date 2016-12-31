package pkuhit.iih.mr.dao.auto.entity;

import java.sql.Timestamp;

import org.seasar.doma.jdbc.entity.EntityListener;
import org.seasar.doma.jdbc.entity.PostDeleteContext;
import org.seasar.doma.jdbc.entity.PostInsertContext;
import org.seasar.doma.jdbc.entity.PostUpdateContext;
import org.seasar.doma.jdbc.entity.PreDeleteContext;
import org.seasar.doma.jdbc.entity.PreInsertContext;
import org.seasar.doma.jdbc.entity.PreUpdateContext;

import pkuhit.xap.ac.Session;

/**
 * 
 */
public class MrAmrRankScrListener implements EntityListener<MrAmrRankScr> {

    @Override
    public void preInsert(MrAmrRankScr entity, PreInsertContext<MrAmrRankScr> context) {
		Session session = Session.get();
		entity.crtUserId = session.getUserId();
    	entity.crtTime = new Timestamp(System.currentTimeMillis());
    	entity.lastUpdUserId = session.getUserId();
    	entity.lastUpdTime = entity.crtTime;
    	entity.delF = (short)0;
      	entity.crtDeptCd = session.getDeptId();
    }

    @Override
    public void preUpdate(MrAmrRankScr entity, PreUpdateContext<MrAmrRankScr> context) {
		Session session = Session.get();
		entity.lastUpdUserId = session.getUserId();
    	entity.lastUpdTime = new Timestamp(System.currentTimeMillis());
    	entity.lastUpdDeptCd = session.getDeptId();    	
    }

    @Override
    public void preDelete(MrAmrRankScr entity, PreDeleteContext<MrAmrRankScr> context) {
    }

    @Override
    public void postInsert(MrAmrRankScr entity, PostInsertContext<MrAmrRankScr> context) {
    }

    @Override
    public void postUpdate(MrAmrRankScr entity, PostUpdateContext<MrAmrRankScr> context) {
    }

    @Override
    public void postDelete(MrAmrRankScr entity, PostDeleteContext<MrAmrRankScr> context) {
    }
}