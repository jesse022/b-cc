package io.terminus.parana.store.service;

import io.terminus.common.model.Response;
import io.terminus.parana.store.model.UserTest;

import java.util.List;

/**
 * @Author xgs.
 * @Email xgs@terminus.io
 * @Date 16/10/10
 */
public interface UserTestReadService {
    Response<List<UserTest>> findAll();
}
