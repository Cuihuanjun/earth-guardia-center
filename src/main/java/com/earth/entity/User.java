package com.earth.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author tang
 */
@Data
@AllArgsConstructor
@Accessors(chain = true)
public class User {
    @TableId(type= IdType.AUTO)
    private Long id;
    private String username;
    private String password;

    public User() {
    }
}
