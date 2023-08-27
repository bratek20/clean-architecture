import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CCommandLineRunner implements CommandLineRunner {

    @Override
    public void run(String... args) {
        System.out.println("CCommandLineRunner");
    };
}
