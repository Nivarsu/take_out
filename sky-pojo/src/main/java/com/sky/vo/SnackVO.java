package com.sky.vo;

import com.sky.entity.SnackFlavor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SnackVO implements Serializable {

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
    //更新时间
    private LocalDateTime updateTime;
    //分类名称
    private String categoryName;
    //零食关联的口味
    private List<SnackFlavor> flavors = new ArrayList<>();

    //private Integer copies;
}
