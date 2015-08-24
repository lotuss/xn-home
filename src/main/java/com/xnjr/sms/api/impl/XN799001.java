package com.xnjr.sms.api.impl;

import com.xnjr.sms.ao.ISmsAO;
import com.xnjr.sms.api.AProcessor;
import com.xnjr.sms.common.JsonUtil;
import com.xnjr.sms.dto.req.XN799001Req;
import com.xnjr.sms.dto.res.XN799001Res;
import com.xnjr.sms.exception.BizException;
import com.xnjr.sms.exception.ParaException;
import com.xnjr.sms.spring.SpringContextHolder;

/**
 * 发送短信
 * @author: myb858 
 * @since: 2015年8月20日 上午10:29:57 
 * @history:
 */
public class XN799001 extends AProcessor {
    private ISmsAO smsAO = SpringContextHolder.getBean(ISmsAO.class);

    private XN799001Req xn799001Req = null;

    @Override
    public Object doBusiness() throws BizException {
        return new XN799001Res(smsAO.doAddSmsOut(xn799001Req.getMobile(),
            xn799001Req.getContent(), xn799001Req.getBizType(),
            xn799001Req.getRemark()));
    }

    @Override
    public void doCheck(String inputparams) throws ParaException {
        xn799001Req = JsonUtil.json2Bean(inputparams, XN799001Req.class);

    }

}
