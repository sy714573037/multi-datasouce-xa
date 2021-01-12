package com.x2021.mycloud.multidatasoucexa.mapper.db2;

import com.x2021.mycloud.multidatasoucexa.entity.Log;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogMapper2 {

    List<Log> findAll();

    Log getLog(@Param("id") int id);

    int insertSelective(Log log);
}
