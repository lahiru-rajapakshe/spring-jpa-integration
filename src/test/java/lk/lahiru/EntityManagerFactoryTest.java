package lk.lahiru;

@SpringJunitConfiguration({JPAConfig.class,AppConfig.class})
import static org.junit.jupitor.api.Assertions.*;
public class EntityManagerFactoryTest {

    @Autowired
    private EntityManagerFactory emf;

    public void testEntityManagerfactory(){
        System.out.println(emf);
        assertNotNull(emf);
    }



}
