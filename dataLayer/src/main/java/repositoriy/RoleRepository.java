package repositoriy;

import javax.persistence.EntityManager;

import entities.role;

public class RoleRepository {

	EntityManager entityManager;
	
	public RoleRepository(EntityManager entityManager)
	{
		this.entityManager = entityManager;
	}
	
	public void InsertRole(role roleToInsert)
	{
		entityManager.getTransaction().begin();
		entityManager.persist(roleToInsert);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
}
