package com.cayulla.achuni;

import java.util.Date;
 

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.cayulla.achuni.hibernate.data.Cliente;

public class TestApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create a configuration instance
        Configuration configuration = new Configuration();
        // Provide configuration file
        configuration.configure("hibernate.cfg.xml");
        // Build a SessionFactory
        SessionFactory factory = configuration.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        // Get current session, current session is already associated with Thread
        Session session = factory.getCurrentSession();
        // Begin transaction, if you would like save your instances, your calling of save must be associated with a transaction
        session.getTransaction().begin();
        // Create employee
        Cliente client = new Cliente();
        client.setNumeroDocumento("45253793");
        client.setNombres("Kirito");
        client.setApellidos("SAO");
        client.setEstado(true);
        // Save
        session.save(client);
        // Commit, calling of commit will cause save an instance of employee
        session.getTransaction().commit();
	}

}
