package com.red.dao;

import com.red.domain.ExpenseInfo;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Niu Qianghong on 2017-09-06 0006.
 */
public interface ExpenseInfoMapper {
    /**
     * 添加消费记录
     * @param expenseInfo
     * @return
     */
    int add(@Param("expenseInfo") ExpenseInfo expenseInfo);
}
