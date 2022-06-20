package lk.lahiru.jpaspringintegration.tasks.config;

import org.omg.CORBA.Environment;

import javax.management.MXBean;

@Configuration
@Profile
@PropertySource("classpath:application-dev.properties")

public class TestConfig {
    private final Environment env;

    public TestConfig(Environment env){
        this.env=env;
    }

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource= new DriverManagerdataSource();
        dataSource.setDriverClassName(env.getRequiredProperty("javax.persistance"));

    }
}
