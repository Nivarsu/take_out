package com.sky.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 零食口味
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SnackFlavor implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    //零食id
    private Long snackId;

    //口味名称
    private String name;

    //口味数据list
    private String value;

}
