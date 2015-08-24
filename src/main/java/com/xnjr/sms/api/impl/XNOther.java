package com.xnjr.sms.api.impl;

import com.xnjr.sms.api.AProcessor;
import com.xnjr.sms.exception.BizException;
import com.xnjr.sms.exception.ParaException;

public class XNOther extends AProcessor {

    @Override
    public Object doBusiness() throws BizException {
        throw new BizException("799xxx", "无效API功能号");
    }

    @Override
    public void doCheck(String inputparams) throws ParaException {
        throw new ParaException("799xxx", "无效API功能号");

    }

}
