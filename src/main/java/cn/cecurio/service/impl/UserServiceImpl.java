package cn.cecurio.service.impl;

import cn.cecurio.bo.R;
import cn.cecurio.dao.UserDao;
import cn.cecurio.entity.UserEntity;
import cn.cecurio.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author: Cecurio
 * @create: 2017-11-20 21:14
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public R selectAll() {
        List<UserEntity> userEntities = null;
        try {
            userEntities  = userDao.selectAll();
        } catch (Exception e) {
            return R.serverInternalError();
        }
        return R.ok().putData("users",userEntities).putData("now",new Date());
    }
}
