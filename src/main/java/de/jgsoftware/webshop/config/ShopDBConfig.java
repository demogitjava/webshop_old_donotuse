package de.jgsoftware.webshop.config;



import com.zaxxer.hikari.HikariConfig;
import org.h2.tools.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.HashMap;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "de.jgsoftware.webshop.dao.interfaces",
        entityManagerFactoryRef = "shopEntityManagerFactory",
        transactionManagerRef = "shopTransactionManager")
public class ShopDBConfig extends HikariConfig
{
    @Autowired
    @Qualifier(value = "shopJdbcTemplate")
    JdbcTemplate jtm;


    @Autowired
    DataSource dataSource;


    public ShopDBConfig()
    {

        try
        {

            org.h2.tools.Server h2Server = Server.createTcpServer("-tcpPort", "9092", "-tcpAllowOthers").start();
            org.h2.tools.Server webh2Server = Server.createWebServer("-web", "-webAllowOthers", "-webPort", "8082").start();

            if (h2Server.isRunning(true))
            {
                System.out.print("H2 server was started and is running." + "\n");
            } else
            {

                h2Server = Server.createWebServer().start();
                throw new RuntimeException("Could not start H2 server." + "\n");
            }
        } catch (SQLException e) {
            throw new RuntimeException("Failed to start H2 server: " + e + "\n");
        }
    }


    @Bean("ds3")
    @Qualifier("shopdb")
    @ConfigurationProperties(prefix="app.datasource3")
    public DataSource secondDS()
    {
        return DataSourceBuilder.create().build();
    }



    @Bean(name = "shopEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean shopEntityManagerFactory(EntityManagerFactoryBuilder builder,
                                                                           @Qualifier("shopdb") DataSource dataSource) {
        HashMap<String, Object> properties = new HashMap<>();

        properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
        return builder.dataSource(dataSource).properties(properties)
                .packages("de.jgsoftware.webshop.model").persistenceUnit("Shop").build();
    }

    @Bean(name = "shopTransactionManager")
    public PlatformTransactionManager shopTransactionManager(
            @Qualifier("shopEntityManagerFactory") EntityManagerFactory shopEntityManagerFactory) {
        return new JpaTransactionManager(shopEntityManagerFactory);
    }

    @Bean(name = "shopJdbcTemplate")
    public JdbcTemplate jdbcTemplate(@Qualifier("ds3") DataSource dataSource)
    {

        return new JdbcTemplate(dataSource);
    }



}