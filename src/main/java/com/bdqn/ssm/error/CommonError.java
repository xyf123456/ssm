package com.bdqn.ssm.error;
/**
 * @ClassName: CommonError
 * @Description:全局异常接口
 * @Author: xyf
 * @Date 2019/7/16 14:42
 */
public interface CommonError {

    /**
     * @Description:获取错误的错误代码
     * @param: []
     * @return: int
     * @Date: 2019/07/16 14:43
     */
    int getErrorCode();

    /**
     * @Description: 获取错误信息
     * @param: []
     * @return: java.lang.String
     * @Date: 2019/07/16 14:43
     */
    String getErrMsg();

    /**
     * @Description:手动设置错误的业务信息(通过定制化的方式处理一些通用的错误类型)
     * @param: [errMsg]
     * @return: com.bdqn.ssm.error.CommonError
     * @Date: 2019/07/16 14:45
     */
    CommonError setErrMsg(String errMsg);

}
