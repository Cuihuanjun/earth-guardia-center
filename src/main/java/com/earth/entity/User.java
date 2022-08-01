package com.earth.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
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

//    @JsonSerialize(
//            using = ToStringSerializer.class
//    )
//    @TableId(
//            value = "id",
//            type = IdType.ASSIGN_ID
//    )
    /**
     * 主键id
     */
    @ApiModelProperty("主键id")
    @TableId(type= IdType.AUTO)
    private Long id;
    private String username;
    private String password;

    public User() {
        // @AllArgsConstructor注解需要空参
    }
}
