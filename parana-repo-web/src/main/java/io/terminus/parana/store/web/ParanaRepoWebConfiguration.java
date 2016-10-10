package io.terminus.parana.store.web;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.servlet.Filter;
import java.util.concurrent.Executors;

/**
 * @Author xgs.
 * @Email xgs@terminus.io
 * @Date 16/10/10
 */
@Configuration
@ComponentScan
@EnableWebMvc
@EnableAutoConfiguration
public class ParanaRepoWebConfiguration {

    @Bean
    public Filter hiddenHttpMethodFilter() {
        return new HiddenHttpMethodFilter();
    }

    @Bean
    public EventBus eventBus() {
        return new AsyncEventBus(
                Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() * 2));
    }

    @Bean
    public ObjectMapper nonNullObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        return objectMapper;
    }


}
