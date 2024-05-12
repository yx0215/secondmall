package com.yx.xx.transaction.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yx.xx.transaction.domain.Express;
import java.util.List;
import java.util.Map;

public interface ExpressMapper extends BaseMapper<Express> {
    List<Express>  expressPage(Map<String,Object> params);
}