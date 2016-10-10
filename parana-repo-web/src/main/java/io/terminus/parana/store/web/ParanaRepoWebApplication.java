package io.terminus.parana.store.web;

import io.terminus.parana.common.banner.ParanaBanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author xgs.
 * @Email xgs@terminus.io
 * @Date 16/10/10
 */

@SpringBootApplication
public class ParanaRepoWebApplication {
    public static void main(String[] args){
        SpringApplication application = new SpringApplication(ParanaRepoWebApplication.class);
        application.setBanner(new ParanaBanner());
        application.run(args);
    }
}
