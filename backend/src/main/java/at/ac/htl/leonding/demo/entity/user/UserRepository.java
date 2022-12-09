package at.ac.htl.leonding.demo.entity.user;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;



@ApplicationScoped
@Named
public class UserRepository {
    @Inject EntityManager em;

    public List<User> getAll() {
        return em.createQuery("from User", User.class).getResultList();
    }
}
