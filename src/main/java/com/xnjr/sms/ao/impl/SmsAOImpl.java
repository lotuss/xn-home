package com.xnjr.sms.ao.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xnjr.sms.ao.ISmsAO;
import com.xnjr.sms.bo.ISmsOutBO;
import com.xnjr.sms.domain.SmsOut;
import com.xnjr.sms.exception.BizException;

@Service
public class SmsAOImpl implements ISmsAO {
    @Autowired
    ISmsOutBO smsOutBO;

    @Override
    public boolean doAddSmsOut(String moible, String content, String bizType,
            String remark) {
        if (StringUtils.isNotBlank(moible) && StringUtils.isNotBlank(content)) {
            SmsOut data = new SmsOut();
            data.setMobile(moible);
            data.setContent(content);
            data.setBizType(bizType);
            data.setRemark(remark);
            smsOutBO.saveSmsOut(data);
            return true;
        } else {
            throw new BizException("xn709901", "手机号和短信内容不能为空");

        }

    }

}
