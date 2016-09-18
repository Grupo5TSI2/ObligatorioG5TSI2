import javax.persistence.EntityManager;

import entities.role;
import manager.PersistenceManager;

public class Main {

	public static void main(String[] args) 
	{
	    role nuevo_rol = new role();
	    nuevo_rol.setDescription("Prueba");
	    nuevo_rol.setName("Test");
	    
	    EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
	    em.getTransaction()
	        .begin();
	    em.persist(nuevo_rol);
	    em.getTransaction()
	        .commit();
	    em.close();
	    PersistenceManager.INSTANCE.close();
	  }
	
}
