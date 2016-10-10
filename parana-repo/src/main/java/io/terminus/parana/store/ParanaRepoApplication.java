package io.terminus.parana.store;

import io.terminus.parana.common.banner.ParanaBanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author xgs.
 * @Email xgs@terminus.io
 * @Date 16/10/10
 */

@SpringBootApplication
public class ParanaRepoApplication {
    public static void main(String[] args){
        SpringApplication application = new SpringApplication(ParanaRepoApplication.class);
        application.setBanner(new ParanaBanner());
        application.run(args);
    }
}
