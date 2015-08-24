package com.xnjr.home.ao;

public interface ISmsAO {
    /**
     * 
     * @param moible
     * @param content
     * @param bizType
     * @param remark
     * @return 
     * @create: 2015年8月20日 下午4:34:19 myb858
     * @history:
     */
    public boolean doAddSmsOut(String moible, String content, String bizType,
            String remark);
}
