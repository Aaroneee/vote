package com.pbc.vote.exceptions;


import com.pbc.vote.constant.ExceptionEnum;
import com.pbc.vote.model.vo.ResultInfo;
import com.pbc.vote.utils.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


/**
 * describe:
 *
 * @Author: Aaron
 * @Date: 2022/10/13 20:02
 */
@ControllerAdvice
public class GlobalExceptionResolver {

    @Autowired
    private Result result;

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionResolver.class);


    /**
     * description: 自定义异常
     *
     * @Author: BenOniShi
     * @Date: 2020/12/14 14:48
     */
    @ExceptionHandler(value = ParamsException.class)
    @ResponseBody
    public ResultInfo paramsException(ParamsException e) {
        logger.error(e.getLocalizedMessage() , e);
        e.printStackTrace();
        return result.failed(e.getExceptionCode(), e.getMsg());
    }

    /**
     * description: 通用异常
     *
     * @Author: BenOniShi
     * @Date: 2020/12/14 14:48
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultInfo unknownException(Exception e) {
        logger.error(e.getLocalizedMessage() , e);
        e.printStackTrace();
        return result.filed(ExceptionEnum.NETWORK_BUSY);
    }
}
