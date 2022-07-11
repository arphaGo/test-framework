package main.java.com.service;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import main.java.com.config.BaseConfig;
import main.java.com.domain.InputEntity;
import main.java.com.factory.StrategyFactory;
import main.java.com.strategy.Strategy;
import main.java.com.utils.FileReadUtils;
import org.apache.commons.lang3.StringUtils;


/**
 * @Author pengjiequn
 * @Date 2022/07/05 9:47
 * @Version 1.0
 */
public class TestClass {
    private static final Logger log = LoggerFactory.getLogger(TestClass.class);

    TestClass() {}

    public <T> StringBuffer read(T clazz) throws IllegalAccessException {
        StringBuffer buffer = new StringBuffer();

        BaseConfig baseConfig = BaseConfig.getInstance();
        String path = baseConfig.getBasePath();

        InputEntity inputEntity = FileReadUtils.readFile(path);
        if (inputEntity == null || StringUtils.isNotBlank(inputEntity.getUrl())) {
            log.error("没有有效的URL, 接口调用异常终止");
            throw new IllegalAccessException("没有有效的URL, 接口调用异常终止");
        }

        Strategy strategy = StrategyFactory.getStrategy(inputEntity.getStrategy());




        return buffer;
    }



}
