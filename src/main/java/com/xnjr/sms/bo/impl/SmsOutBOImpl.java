package com.xnjr.sms.bo.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xnjr.sms.bo.ISmsOutBO;
import com.xnjr.sms.bo.base.PaginableBOImpl;
import com.xnjr.sms.dao.ISmsOutDAO;
import com.xnjr.sms.domain.SmsOut;
import com.xnjr.sms.enums.ESmsStatus;

@Component
public class SmsOutBOImpl extends PaginableBOImpl<SmsOut> implements ISmsOutBO {
    @Autowired
    private ISmsOutDAO smsOutDAO;

    @Override
    public int saveSmsOut(SmsOut data) {
        int count = 0;
        if (data != null) {
            data.setStatus(ESmsStatus.TOSEND.getCode());
            data.setCreateDatetime(new Date());
            count = smsOutDAO.insert(data);
        }
        return count;
    }

    @Override
    public int removeSmsOut(Long id) {
        int count = 0;
        if (id > 0) {
            SmsOut data = new SmsOut();
            data.setId(id);
            count = smsOutDAO.delete(data);
        }
        return count;
    }

    @Override
    public SmsOut getSmsOut(Long id) {
        SmsOut data = null;
        if (id > 0) {
            SmsOut condition = new SmsOut();
            condition.setId(id);
            data = smsOutDAO.select(condition);
        }
        return data;
    }

    @Override
    public List<SmsOut> querySmsOutList(SmsOut data) {
        return smsOutDAO.selectList(data);
    }

}
