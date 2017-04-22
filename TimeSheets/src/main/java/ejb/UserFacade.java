package ejb;

import jpa.User;

import javax.ejb.Local;

@Local
public interface UserFacade {
    User getUserByEmailAndPass(String email, String password);
}
