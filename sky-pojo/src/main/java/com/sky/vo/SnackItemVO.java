package com.sky.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SnackItemVO implements Serializable {

    //零食名称
    private String name;

    //份数
    private Integer copies;

    //零食图片
    private String image;

    //零食描述
    private String description;
}
