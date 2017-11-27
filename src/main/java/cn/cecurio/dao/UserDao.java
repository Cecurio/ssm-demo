package cn.cecurio.dao;

import cn.cecurio.entity.UserEntity;

import java.util.List;

/**
 * @author: Cecurio
 * @create: 2017-11-20 21:07
 **/
public interface UserDao {
    List<UserEntity> selectAll() throws Exception;
    int addOne(UserEntity userEntity) throws Exception;
}
