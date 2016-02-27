package knutd.bit.dao;

import java.io.Serializable;

import java.lang.reflect.ParameterizedType;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NameClassPair;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractDao<PK extends Serializable, T> {
	
    Class NameClass;

    public void setNameClass(String NameClass) {
        try {
            this.NameClass = Class.forName(NameClass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AbstractDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
	
	@SuppressWarnings("unchecked")
	public AbstractDao(){
            try {
                this.NameClass = Class.forName("knutd.bit.model.Department");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AbstractDao.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
	
	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	protected Criteria createEntityCriteria(){
		return getSession().createCriteria(NameClass);
	}

}
