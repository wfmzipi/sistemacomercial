package model.dao.entities;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import exception.CustomException;
import model.dao.jpa.JpaDao;
import model.entities.Users;

public class UsersDaoImp extends JpaDao<Users> implements UsersDao {

	public UsersDaoImp() {
	}

	@Override
	public List<Users> findAll() throws CustomException {
		// TypedQuery<Estado> query = getEntityManager().createQuery("SELECT e FROM
		// Cliente e", Cliente.class);

		return (List<Users>) getEntityManager().createQuery("SELECT e FROM User e").getResultList();
	}

	public Boolean loginUser(String login, String password) throws CustomException {

		TypedQuery<Users> query = null;
		Users userExist;

		query = getEntityManager().createQuery("Select e from User e where e.login= :login and e.password= :password",
				Users.class);

		query.setParameter("login", login);
		query.setParameter("password", password);

		try {
			userExist = query.getSingleResult();
		} catch (NoResultException e) {
			return false;
		}

		if (userExist.getLogin().equals(login) && userExist.getPassword().equals(password)) {
			return true;
		} else {
			return false;
		}

	}

}
