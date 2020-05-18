package com.eidam.master.entity;

import lombok.Data;

import javax.persistence.Transient;

@Data
public class BaseEntity {

    @Transient
    private Integer pageNum = 0;

    @Transient
    private Integer pageSize = Integer.MAX_VALUE;

}
