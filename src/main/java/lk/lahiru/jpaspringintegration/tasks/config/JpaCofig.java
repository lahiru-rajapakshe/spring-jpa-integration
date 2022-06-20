package lk.lahiru.jpaspringintegration.tasks.config;

import com.sun.deploy.Environment;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:application.properties")
@PropertySource("classpath:application-prod.properties")
@EnabletransactionManagement
@PropertySource
public class JpaCofig {
    private final Environment env;


    public JPAConfig(Environment env) {
        this.env = env;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource ds, JpaVendorAdapter jpaVendorAdapter){
        LocalContainerEntityManagerFactoryBean lcemfb = new LocalContainerEntityManagerFactoryBean();
        lcemfb.setDataSource(ds);
        lcemfb.setJpaVendorAdapter(jpaVendorAdapter);
        lcemfb.setPackagesToScan("lk.ijse.dep8.tasks.entity");
        return lcemfb;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter(){
        HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
        jpaVendorAdapter.setDatabase(Database.MYSQL);
        jpaVendorAdapter.setDatabasePlatform(env.getRequiredProperty("hibernate.dialect"));
        jpaVendorAdapter.setShowSql(env.getProperty("hibernate.show_sql", Boolean.class, false));
        return jpaVendorAdapter;
    }

    privare Properties jpaProperties(){
Properties prop=new Properties();
prop.put("hibernate.hdm2ddl.auto",env.getRequiredPropery("hibernate.hdm2ddl.auto"));
return prop;
    }

    public PlatformTransactionManager transactioManager(EntityManagerfactory entityManagerfactory){
        return  new JpaTransactionManager(emf);

    }

    public static PersistanseExceptionTransactionPostProcessor persistanseExceptionTransactionPostProcessor(){
        return  new PersistanceExceptionTransactionPostProcessor();
    }

    @Bean("datSource")
    public DataSource dataSourceFortesting(){
        new DriverManagerdataSource();
    }
}
