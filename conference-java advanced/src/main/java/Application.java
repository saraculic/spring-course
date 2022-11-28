import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext appContex = new AnnotationConfigApplicationContext(AppConfig.class);

       //SpeakerService service = new SpeakerServiceImpl();
        SpeakerService service = appContex.getBean("speakerService", SpeakerService.class);

        //System.out.println(service);

        System.out.println(service.findAll().get(0).getFirstName());
        System.out.println(service.findAll().get(0).getSeedNum());

        //SpeakerService service2 = appContex.getBean("speakerService", SpeakerService.class);
        //System.out.println(service2);

    }
}
