package lk.lahiru.jpaspringintegration.tasks.config;

public class JpaCofig {
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(DataSource ds, JpaVendorAdapter adapter){
        LocalContainerEntityManagerFactoryBean lcemfb=  new LocalContainerEntityManagerFactoryBean();
        lcemfb.setDataSource(ds);
        lcemfb.setJpaVendorAdapter(adapter);
        lcemfb.setPackagesToScan("lk.ijse.dep8.tasks.entity");
        return lcemfb;
    }

    public JpaVendorAdapter jpaVendorAdapter(){
        new Hiber
    }
}
