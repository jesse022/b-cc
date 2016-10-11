package io.terminus.parana.store.showcase;

import io.terminus.boot.rpc.dubbo.config.DubboConsumerAutoConfiguration;
import io.terminus.boot.rpc.dubbo.config.DubboProviderAutoConfiguration;
import io.terminus.boot.search.autoconfigure.ESSearchAutoConfiguration;
import io.terminus.parana.ItemAutoConfig;
import io.terminus.parana.store.web.ParanaRepoWebConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author xgs.
 * @Email xgs@terminus.io
 * @Date 16/10/10
 */
@ComponentScan(basePackages = {"io.terminus.parana"})
@EnableAutoConfiguration
@Import(ParanaRepoWebConfiguration.class)
@Configuration
public class ParanaStoreShowCaseConfiguration {
}
