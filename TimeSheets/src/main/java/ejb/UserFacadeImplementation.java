package ejb;

import jpa.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class UserFacadeImplementation implements UserFacade {

    @PersistenceContext(unitName = "timesheetsDS")
    private EntityManager entityManager;

    @Override
    public User getUserByEmailAndPass(String email, String password) {
        Query query = entityManager.createQuery("SELECT u FROM User u WHERE u.email = :email AND u.parola = :password");
        query = query.setParameter("email", email);
        query = query.setParameter("password", password);
        try {
            return (User)query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
}