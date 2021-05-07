package com.shrek.HeroAcademyV2.dao;

import com.shrek.HeroAcademyV2.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class UserDaoImpl extends GenericDaoImpl<User>  implements IUserDao{

    @Transactional
    public List<User> getAllUsers() {
        return (List<User>) findAll();
    }

    @Transactional
    public User getUser(Long id) {
        return (User) find(id);
    }

    @Transactional
    public User addUser(User user) {
        return (User) create(user);
    }

    @Transactional
    public User updateUser(User user) {
        return (User) update(user);
    }

    @Transactional
    public void deleteUser(User user) {
        delete(user.getId());
    }

}

/*
@Repository
public class UserDaoImpl implements IUserDao {
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<User> get() {
        Session currSession = entityManager.unwrap(Session.class);
        Query<User> query = currSession.createQuery("from User", User.class);
        List<User> list = query.getResultList();
        return list;
    }

    @Override
    public User get(int id) {
        Session currSession = entityManager.unwrap(Session.class);
        User emp = currSession.get(User.class, id);
        return emp;
    }

    @Override
    public void save(User User) {
        Session currSession = entityManager.unwrap(Session.class);
        currSession.saveOrUpdate(User);
    }

    @Override
    public void delete(int id) {
        Session currSession = entityManager.unwrap(Session.class);
        User emp = currSession.get(User.class, id);
        currSession.delete(emp);
    }
}*/
