package com.jmu.server.service.impl;

import com.jmu.server.pojo.Admin;
import com.jmu.server.mapper.AdminMapper;
import com.jmu.server.service.IAdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author linshukai
 * @since 2023-07-10
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {

}
