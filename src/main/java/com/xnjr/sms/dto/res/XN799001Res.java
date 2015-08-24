package com.xnjr.sms.dto.res;

public class XN799001Res {
    // 是否成功
    private boolean isSuccess;

    public XN799001Res() {
    };

    public XN799001Res(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }
}
