package com.doing.more.java.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class HibernateConfig

{

	private SessionFactory sessionFactory;

    public HibernateConfig() {
        Configuration config = new Configuration();

        config.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");

        config.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");

        //change the next line of code to match your MySQL URL and port

        config.setProperty("hibernate.connection.url");

    

        config.setProperty("hibernate.connection.username", "bob");

        config.setProperty("hibernate.connection.password", "somepass");

        config.setProperty("hibernate.connection.pool_size", "1");

        config.setProperty("hibernate.connection.autocommit", "true");

        config.setProperty("hibernate.cache.provider_class", "org.hibernate.cache.NoCacheProvider");

        config.setProperty("hibernate.show_sql", "true");

        config.setProperty("hibernate.transaction.factory_class", "org.hibernate.transaction.JDBCTransactionFactory");

        config.setProperty("hibernate.current_session_context_class", "thread");

        config.addAnnotatedClass(User.class);

        config.addAnnotatedClass(PhoneNumber.class);
ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();

        sessionFactory = config.buildSessionFactory(serviceRegistry);
    }
    public  Session getCurrentSession() {

        return sessionFactory.getCurrentSession();

    }

}