import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by muhammadkhalilullah on 4/5/2016.
 */
public class AnimalRunner {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("spring-config.xml");
        IAnimal animal;
        animal = (IAnimal) context.getBean("cat");
        animal.Speak();
        animal = (IAnimal) context.getBean("lion");
        animal.Speak();
    }
}
