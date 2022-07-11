package main.java.com.factory;

import main.java.com.strategy.GetStrategy;
import main.java.com.strategy.PostStrategy;
import main.java.com.strategy.Strategy;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author pengjiequn
 * @Date 2022/07/08 17:31
 * @Version 1.0
 */
public class StrategyFactory {

    private static final Map<String, Strategy> strategies = new HashMap<>();

    static {
        strategies.put("get", new GetStrategy());
        strategies.put("post", new PostStrategy());
    }

    public static Strategy getStrategy(String type) throws IllegalAccessException {
        if (StringUtils.isEmpty(type)) {
            throw new IllegalAccessException("请求类型不能为空");
        }
        return strategies.get(type);
    }

}
