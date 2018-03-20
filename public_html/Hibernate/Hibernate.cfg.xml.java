<?xml version='1.0' encoding='utf-8'?>  
<!DOCTYPE hibernate-configuration PUBLIC  
        "-//Hibernate/Hibernate Configuration DTD 3.0//EN"  
        "http://hibernate.sourceforge.net/hibernate-configuration-3.0.dtd">  
  
<hibernate-configuration>  
  
    <session-factory>  
  
        <!-- Database connection settings -->  
        <property name="connection.driver_class">com.microsoft.sqlserver.jdbc.SQLServerDriver</property>  
        <property name="connection.url">jdbc:sqlserver://localhost:1433;database=UserInfo</property>  
        <property name="connection.username">sa</property>  
        <property name="connection.password"></property>  
  
        <!-- JDBC connection pool (use the built-in) -->  
        <property name="connection.pool_size">1</property>  
  
        <!-- SQL dialect -->  
        <property name="dialect">org.hibernate.dialect.SQLServer2005Dialect</property>  
  
        <!-- Enable Hibernate's automatic session context management -->  
        <property name="current_session_context_class">thread</property>  
  
        <!-- Disable the second-level cache  -->  
        <property name="cache.provider_class">org.hibernate.cache.NoCacheProvider</property>  
  
        <!-- Echo all executed SQL to stdout -->  
        <property name="show_sql">true</property>  
  
        <!-- Drop and re-create the database schema on startup -->  
        <property name="hbm2ddl.auto">create</property>  
  
  <mapping class="org.arpit.javapostsforlearning.Country"></mapping>  
  <mapping class="org.arpit.javapostsforlearning.Capital"></mapping>  
  
    </session-factory>  
  
</hibernate-configuration>  