package io.terminus.parana.store.web.check.controller;

import io.terminus.boot.rpc.common.annotation.RpcConsumer;
import io.terminus.parana.common.utils.RespHelper;
import io.terminus.parana.store.model.UserTest;
import io.terminus.parana.store.service.UserReadService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author xgs.
 * @Email xgs@terminus.io
 * @Date 16/10/10
 */

@RestController
@Slf4j
public class TestUserController {

    @RpcConsumer
    private UserReadService userReadService;

    @RequestMapping(value = "/test")
    public List<UserTest> findAll(){
        return RespHelper.or500(userReadService.findAll());
    }

}
