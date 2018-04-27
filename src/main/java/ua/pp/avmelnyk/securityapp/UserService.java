package ua.pp.avmelnyk.securityapp;

import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.pp.avmelnyk.securityapp.models.User;

import javax.transaction.Transactional;


@Service
@Transactional
public class UserService {

    private  SessionFactory sessionFactory;


    @Autowired
    public UserService(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    protected Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }

    public String  checkConnection(){
        return String.valueOf(sessionFactory.getCurrentSession().isOpen());
    }

    public User getUser(Long user_id) {
        User user = (User) sessionFactory.getCurrentSession().load(User.class, user_id);
        System.out.println(user.toString());
        return user;
    }
    public Long createUser(User user) {

            Long user_id = (Long) getCurrentSession().save(user);
            return user_id;

    }


}
