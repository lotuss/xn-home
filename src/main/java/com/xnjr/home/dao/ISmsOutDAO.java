package com.xnjr.home.dao;

import com.xnjr.home.dao.base.IBaseDAO;
import com.xnjr.home.domain.SmsOut;

public interface ISmsOutDAO extends IBaseDAO<SmsOut> {
    String NAMESPACE = ISmsOutDAO.class.getName().concat(".");
}
