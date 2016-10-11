package io.terminus.parana.store.showcase;

import io.terminus.parana.common.banner.ParanaBanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author xgs.
 * @Email xgs@terminus.io
 * @Date 16/10/10
 */

@SpringBootApplication
public class ParanaStoreShowCaseApplication {
    public static void main(String[] args){
        SpringApplication application = new SpringApplication(ParanaStoreShowCaseApplication.class);
        application.setBanner(new ParanaBanner());
        application.run(args);
    }

}
