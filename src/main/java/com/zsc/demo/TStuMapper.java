package com.zsc.demo;

import com.zsc.demo.TStu;
import java.util.List;

public interface TStuMapper {
    int insert(TStu record);

    List<TStu> selectAll();
}