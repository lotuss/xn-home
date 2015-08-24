package com.xnjr.home.api.impl;

import com.xnjr.home.ao.ISmsAO;
import com.xnjr.home.api.AProcessor;
import com.xnjr.home.common.JsonUtil;
import com.xnjr.home.dto.req.XN704002Req;
import com.xnjr.home.dto.res.XN704002Res;
import com.xnjr.home.dto.res.XN799001Res;
import com.xnjr.home.exception.BizException;
import com.xnjr.home.exception.ParaException;
import com.xnjr.home.spring.SpringContextHolder;

/**
 * 合作伙伴
 * 
 * @author: wll
 * @since: 2015年8月24日 下午16:29:57
 * @history:
 */

public class XN704002 extends AProcessor {
    private ISmsAO smsAO = SpringContextHolder.getBean(ISmsAO.class);

    private XN704002Req xn704002Req = null;

    @Override
    public Object doBusiness() throws BizException {
        return new XN704002Res(smsAO.doAddSmsOut(xn704002Req.getid(),
            xn704002Req.getptpicture(), xn704002Req.getptname()));
    }

    @Override
    public void doCheck(String inputparams) throws ParaException {
        xn704002Req = JsonUtil.json2Bean(inputparams, XN704002Req.class);

    }



}
