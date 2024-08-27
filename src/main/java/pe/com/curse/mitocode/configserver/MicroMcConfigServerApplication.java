package pe.com.curse.mitocode.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MicroMcConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroMcConfigServerApplication.class, args);
    }

}
