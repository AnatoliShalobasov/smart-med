package smartmed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static smartmed.constant.SmartMedConstants.BASE_PACKAGE_NAME;

@SpringBootApplication(scanBasePackages = BASE_PACKAGE_NAME)
public class SmartMedApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartMedApplication.class, args);
    }
}