import javax.persistence.EntityManager;

import entities.role;
import manager.PersistenceManager;
import repositoriy.RoleRepository;

public class Main {

	public static void main(String[] args) 
	{
	    role nuevo_rol = new role();
	    nuevo_rol.setDescription("Rol de administrador");
	    nuevo_rol.setName("Administrador");
	    
	    EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
	    RoleRepository roleRepo = new RoleRepository(em);
	    roleRepo.InsertRole(nuevo_rol);
	    PersistenceManager.INSTANCE.close();
	  }
	
}
