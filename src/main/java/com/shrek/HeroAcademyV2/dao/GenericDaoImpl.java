package com.shrek.HeroAcademyV2.dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.apache.log4j.Priority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public abstract class GenericDaoImpl<T> implements IGenericDao<T> {

	// @PersistenceContext(unitName="heroAcademyPU")
	// protected EntityManager em;

	// @PersistenceContext(unitName = "heroAcademyPU", type =
	// PersistenceContextType.EXTENDED)

	@Autowired
	protected EntityManager em;

	private Class<T> type;

	private static Logger logger;

	@SuppressWarnings("unchecked")
	public GenericDaoImpl() {
		Type t = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) t;
		type = (Class<T>) pt.getActualTypeArguments()[0];
		logger = Logger.getLogger(type);
	}

	@Override
	public T create(final T t) {
		this.em.persist(t);
		this.em.flush();
		this.em.refresh(t);
		logger.log(Priority.INFO, type + " object created.");
		return t;
	}

	@Override
	public T find(final Object id) {
		return (T) this.em.find(type, id);
	}

	@Override
	public T update(final T t) {
		return this.em.merge(t);
	}

	@Override
	public void delete(final Object id) {
		this.em.remove(this.em.getReference(type, id));
	}

	@Override
	public long countAll() {
		StringBuffer queryString = new StringBuffer();
		queryString.append("SELECT count(o) from ");
		queryString.append(type.getName());
		queryString.append(" o ");
		final Query query = em.createQuery(queryString.toString());
		return (Long) query.getSingleResult();
	}

	@Override
	public long countByParameters(final Map<String, Object> parameters) {
		StringBuffer queryString = new StringBuffer();
		queryString.append("SELECT count(o) from ");
		queryString.append(type.getName());
		queryString.append(" o ");
		queryString = appendWhereClause(parameters, queryString);
		final Query query = em.createQuery(queryString.toString());
		return (Long) query.getSingleResult();
	}

	@Override
	public List<T> findAll() {
		StringBuffer queryString = new StringBuffer();
		queryString.append("SELECT e FROM ");
		queryString.append(type.getName());
		queryString.append(" e");
		final Query query = em.createQuery(queryString.toString(), type);
		return query.getResultList();
	}

	@Override
	public List<T> findByParameters(final Map<String, Object> parameters) {
		StringBuffer queryString = new StringBuffer();
		queryString.append("SELECT e FROM ");
		queryString.append(type.getName());
		queryString.append(" e");
		queryString = appendWhereClause(parameters, queryString);
		final Query query = em.createQuery(queryString.toString(), type);
		return query.getResultList();
	}

	StringBuffer appendWhereClause(Map<String, Object> parameters, StringBuffer queryString) {
		Set<String> rawParameters = parameters.keySet();
		int counter = 0;
		for (String entry : rawParameters) {
			if (counter == 0) {
				queryString.append(" WHERE e." + entry + " = '");
				queryString.append(parameters.get(entry));
				queryString.append("'");
			} else {
				queryString.append(" AND e." + entry + " = '");
				queryString.append(parameters.get(entry));
				queryString.append("'");
			}
			counter++;
		}
		return queryString;
	}

}