package com.earth.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.earth.entity.User;
import com.earth.service.IUserService;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


/**
 * @author tang
 */
@AllArgsConstructor
@ResponseBody
@RestController
//@RequestMapping(path = "")
public class UserController {
    private IUserService userService;
    @GetMapping(path = "a")
    public String a() {
        return "你好";
    }
    @ApiModelProperty("添加用户")
    @PostMapping(path = "b")
    public boolean b(@RequestBody User user) {
        if (user == null) {
            user = new User(null, "用户名", "密码");
        }
        return userService.save(user);
    }
    @GetMapping(path = "c")
    public IPage<User> page(User user) {
        return userService.page(new Page<>());
    }
    @PostMapping(path = "/d")
    public boolean del(Long id) {
        return userService.removeById(id);
    }
}








