package com.sky.dto;

import com.sky.entity.SnackFlavor;
import lombok.Data;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
public class SnackDTO implements Serializable {

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
    //口味
    private List<SnackFlavor> flavors = new ArrayList<>();

}
