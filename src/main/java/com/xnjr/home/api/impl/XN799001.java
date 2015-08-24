package com.xnjr.home.api.impl;

import com.xnjr.home.ao.ISmsAO;
import com.xnjr.home.api.AProcessor;
import com.xnjr.home.common.JsonUtil;
import com.xnjr.home.dto.req.XN799001Req;
import com.xnjr.home.dto.res.XN799001Res;
import com.xnjr.home.exception.BizException;
import com.xnjr.home.exception.ParaException;
import com.xnjr.home.spring.SpringContextHolder;

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
