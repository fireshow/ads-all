package com.fireshow.sponsor.entity.unit_condition;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 *@author Vincent(sec1995@hotmail.com)
 *@date 2020/7/27 23:07
 *@version 1.0
 **/

/**
    * 推广单元关键词 Feature
    */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdUnitKeyword implements Serializable {
    private Integer id;

    /**
    * 推广单元 id
    */
    private Integer unitId;

    /**
    * 关键词
    */
    private String keyword;

    private static final long serialVersionUID = 1L;
}
