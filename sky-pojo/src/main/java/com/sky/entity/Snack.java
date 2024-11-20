package com.sky.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 零食
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Snack implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    //零食名称
    private String name;

    //零食分类id
    private Long categoryId;

    //零食价格
    private BigDecimal price;

    //图片
    private String image;

    //描述信息
    private String description;

    //0 停售 1 起售
    private Integer status;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private Long createUser;

    private Long updateUser;

}
