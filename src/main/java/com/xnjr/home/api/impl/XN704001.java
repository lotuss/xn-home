package com.xnjr.home.api.impl;

import com.xnjr.home.ao.ISmsAO;
import com.xnjr.home.api.AProcessor;
import com.xnjr.home.common.JsonUtil;
import com.xnjr.home.dto.req.XN704001Req;
import com.xnjr.home.dto.res.XN704001Res;
import com.xnjr.home.exception.BizException;
import com.xnjr.home.exception.ParaException;
import com.xnjr.home.spring.SpringContextHolder;

/**
 * 雄牛官网
 * 
 * @author: wll
 * @since: 2015年8月24日 上午16:20:57
 * @history:
 */
public class XN704001 extends AProcessor {
	private ISmsAO smsAO = SpringContextHolder.getBean(ISmsAO.class);

	private XN704001Req xn704001Req = null;

	@Override
	public Object doBusiness() throws BizException {
		return new XN704001Res(smsAO.doAddSmsOut(xn704001Req.getcpname(),
				xn704001Req.getlogo(), xn704001Req.getcparea(),
				xn704001Req.getcppicture(),xn704001Req.getcpexplain(),
				xn704001Req.getcpphone(),xn704001Req.getemail(),
				xn704001Req.getcorporation()));
	}

	@Override
	public void doCheck(String inputparams) throws ParaException {
		xn704001Req = JsonUtil.json2Bean(inputparams, XN704001Req.class);

	}

}
