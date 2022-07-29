package com.earth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.earth.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
* @author tang
* @description 针对表【user】的数据库操作Mapper
* @createDate 2022-07-29 15:40:08
* @Entity generator.domain.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
