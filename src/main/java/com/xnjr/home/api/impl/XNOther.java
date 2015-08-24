package com.xnjr.home.api.impl;

import com.xnjr.home.api.AProcessor;
import com.xnjr.home.exception.BizException;
import com.xnjr.home.exception.ParaException;

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
