package com.jmu.server.service.impl;

import com.jmu.server.pojo.MailLog;
import com.jmu.server.mapper.MailLogMapper;
import com.jmu.server.service.IMailLogService;
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
public class MailLogServiceImpl extends ServiceImpl<MailLogMapper, MailLog> implements IMailLogService {

}
