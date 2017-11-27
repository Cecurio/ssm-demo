package cn.cecurio.service.impl;

import cn.cecurio.bo.R;
import cn.cecurio.dao.SsmMessageMapper;
import cn.cecurio.entity.SsmMessage;
import cn.cecurio.entity.SsmMessageExample;
import cn.cecurio.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Cecurio
 * @create: 2017-11-24 19:39
 **/
@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    private SsmMessageMapper ssmMessageMapper;

    public R selectAll() {
        SsmMessageExample example = new SsmMessageExample();
        List<SsmMessage> ssmMessageList = ssmMessageMapper.selectByExample(example);
        if (ssmMessageList == null) {
            return R.notFound().setMsg("没有消息！");
        }
        return R.ok().putData("msgs", ssmMessageList);
    }
}
