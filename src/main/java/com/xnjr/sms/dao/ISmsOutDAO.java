package com.xnjr.sms.dao;

import com.xnjr.sms.dao.base.IBaseDAO;
import com.xnjr.sms.domain.SmsOut;

public interface ISmsOutDAO extends IBaseDAO<SmsOut> {
    String NAMESPACE = ISmsOutDAO.class.getName().concat(".");
}
