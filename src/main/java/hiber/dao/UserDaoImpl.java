package hiber.dao;


import hiber.model.User;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<User> getAllUsers() {
        Query<User> query;
        query = sessionFactory.getCurrentSession().createQuery("from User", User.class);
        return query.getResultList();
    }
}
