package com.account.back.Service.Impl;

import com.account.back.Mapper.UserMapper;
import com.account.back.Proj.User;
import com.account.back.Service.UserService;
import com.account.back.Util.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserService")
public class UserImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public ServerResponse add(User user) {
        if(userMapper.insert(user)>0){
            return ServerResponse.addSuccess();
        }
        else
            return ServerResponse.addFail();
    }

    @Override
    public ServerResponse update(User user) {
        User tempUser = userMapper.selectByPrimaryKey(user.getUserId());
        if(tempUser != null){
            userMapper.updateByPrimaryKey(user);
            return ServerResponse.updateSuccess();
        }else
        {return ServerResponse.deleteFail();}
    }

    @Override
    public ServerResponse delete(Integer userId) {
        if(userMapper.deleteByPrimaryKey(userId) > 0)
            return ServerResponse.deleteSuccess();
        else
            return ServerResponse.deleteFail();
    }

    @Override
    public ServerResponse getById(Integer userId) {
        User user = userMapper.selectByPrimaryKey(userId);
        if (user != null)
            return ServerResponse.getSuccess(user);
        else
            return ServerResponse.getFail("获取失败");
    }
}
