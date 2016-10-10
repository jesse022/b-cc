package io.terminus.parana.store.impl.service;

import com.google.common.base.Throwables;
import io.terminus.boot.rpc.common.annotation.RpcProvider;
import io.terminus.common.model.Response;
import io.terminus.parana.store.impl.dao.UserMapper;
import io.terminus.parana.store.model.UserTest;
import io.terminus.parana.store.service.UserReadService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author xgs.
 * @Email xgs@terminus.io
 * @Date 16/10/10
 */
@Service
@RpcProvider
@Slf4j
public class UserReadServiceImpl implements UserReadService {

    private final UserMapper userMapper;

    @Autowired
    public UserReadServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }


    @Override
    public Response<List<UserTest>> findAll() {
        try {
            return Response.ok(userMapper.selectAll());
        } catch (Exception e) {
            log.error("find user all failed, error={}", Throwables.getStackTraceAsString(e));
            return Response.fail("user.find.failed");
        }
    }
}
