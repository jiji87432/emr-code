package pkuhit.iih.qa.dao.auto.entity;

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
public class QaItmMrTpListener implements EntityListener<QaItmMrTp> {

    @Override
    public void preInsert(QaItmMrTp entity, PreInsertContext<QaItmMrTp> context) {
		Session session = Session.get();
		entity.crtUserId = session.getUserId();
    	entity.crtTime = new Timestamp(System.currentTimeMillis());
    	entity.lastUpdUserId = session.getUserId();
    	entity.lastUpdTime = entity.crtTime;
    	entity.delF = (short)0;
      	entity.crtDeptCd = session.getDeptId();
    }

    @Override
    public void preUpdate(QaItmMrTp entity, PreUpdateContext<QaItmMrTp> context) {
		Session session = Session.get();
		entity.lastUpdUserId = session.getUserId();
    	entity.lastUpdTime = new Timestamp(System.currentTimeMillis());
    	entity.lastUpdDeptCd = session.getDeptId();    	
    }

    @Override
    public void preDelete(QaItmMrTp entity, PreDeleteContext<QaItmMrTp> context) {
    }

    @Override
    public void postInsert(QaItmMrTp entity, PostInsertContext<QaItmMrTp> context) {
    }

    @Override
    public void postUpdate(QaItmMrTp entity, PostUpdateContext<QaItmMrTp> context) {
    }

    @Override
    public void postDelete(QaItmMrTp entity, PostDeleteContext<QaItmMrTp> context) {
    }
}