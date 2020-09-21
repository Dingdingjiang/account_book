package com.account.back.Service;

import com.account.back.Proj.User;
import com.account.back.Util.ServerResponse;
import org.springframework.stereotype.Service;


public interface UserService {
    public ServerResponse add (User user);
    public ServerResponse update(User user);
    public ServerResponse delete(Integer userId);
    public ServerResponse getById(Integer userId);
}
