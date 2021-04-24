package com.shrek.HeroAcademyV2.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public interface IGenericDao<T> {

  long countAll();
  long countByParameters(Map<String, Object> params);
  T create(T t);
  T find(Object id);
  List<T> findAll();
  List<T> findByParameters(Map<String, Object> params);
  T update(T t);
  void delete(Object id);
}