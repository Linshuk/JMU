package com.jmu.server.service.impl;

import com.jmu.server.pojo.Oplog;
import com.jmu.server.mapper.OplogMapper;
import com.jmu.server.service.IOplogService;
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
public class OplogServiceImpl extends ServiceImpl<OplogMapper, Oplog> implements IOplogService {

}
