package main.java.com.config;

/**
 * @Author pengjiequn
 * @Date 2022/07/05 9:45
 * @Version 1.0
 */
public class BaseConfig {

    private String basePath = "C:\\Users\\17815\\Desktop\\接口.txt";
    private static final BaseConfig baseConfig = new BaseConfig();


    public static BaseConfig getInstance() {
        return baseConfig;
    }


    public String getBasePath() {
        return basePath;
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }


}
