package com.qf.user.api;

import com.qf.base.IBaseDao;
import com.qf.dto.ResultBean;
import com.qf.entity.TUser;

public interface IUserService extends IBaseDao<TUser> {

    ResultBean checkLogin(String username, String password);

    ResultBean checkIsLogin(String uuid);

    ResultBean regist(String phone, Integer code, String password);

    ResultBean registByEmail(String email, String password);

    TUser selectByUsername(String username);
}
