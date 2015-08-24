package com.xnjr.home.dao;

import java.util.Date;

import org.junit.Test;
import org.unitils.spring.annotation.SpringBeanByType;

import com.xnjr.home.dao.ISmsOutDAO;
import com.xnjr.home.domain.SmsOut;
import com.xnjr.home.enums.ESmsStatus;

public class ISmsOutDAOTest extends ADAOTest {
    @SpringBeanByType
    private ISmsOutDAO smsOutDAO;

    @Test
    public void insert() {
        SmsOut data = new SmsOut();
        data.setMobile("13958092437");
        data.setContent("短信测试内容");
        data.setBizType("1");
        data.setRemark("单元测试");
        data.setStatus(ESmsStatus.TOSEND.getCode());
        data.setCreateDatetime(new Date());
        int lineNum = smsOutDAO.insert(data);
        //logger.info("insert : {}", lineNum);
    }

    @Test
    public void insert1() {
        SmsOut data = new SmsOut();
        data.setMobile("13958092437");
        data.setContent("短信测试内容");
        data.setBizType("1");
        data.setRemark("单元测试");
        data.setStatus(ESmsStatus.TOSEND.getCode());
        data.setCreateDatetime(new Date());
        int lineNum = smsOutDAO.insert(data);
        logger.info("insert : {}", lineNum);
    }
}
