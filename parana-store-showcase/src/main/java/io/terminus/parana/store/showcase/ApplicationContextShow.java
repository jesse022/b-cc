package io.terminus.parana.store.showcase;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Author xgs.
 * @Email xgs@terminus.io
 * @Date 16/10/11
 */
@Component
public class ApplicationContextShow implements ApplicationContextAware{
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        String[] s = applicationContext.getBeanDefinitionNames();
        for(String name : s){
            System.out.println(name);
        }
    }
}
