package com.earth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.earth.entity.User;
import com.earth.service.IUserService;
import com.earth.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author tang
* @description 针对表【user】的数据库操作Service实现
* @createDate 2022-07-29 15:40:08
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
implements IUserService {

}
