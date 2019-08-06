package com.yigo.service.impl;

import com.yigo.entity.Emp;
import com.yigo.mapper.EmpMapper;
import com.yigo.service.EmpService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Ethan123
 * @since 2019-08-05
 */
@Service
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp> implements EmpService {

}
