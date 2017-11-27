package cn.cecurio.service;

import cn.cecurio.bo.R;
import cn.cecurio.entity.UserEntity;

/**
 * @author: Cecurio
 * @create: 2017-11-20 21:14
 **/
public interface UserService {
    R selectAll();
    R addOne(UserEntity userEntity);
}
