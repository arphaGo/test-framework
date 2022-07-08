package main.java.com.service;

import main.java.com.config.BaseConfig;

import java.io.*;
import java.nio.file.Files;

/**
 * @Author pengjiequn
 * @Date 2022/07/05 9:47
 * @Version 1.0
 */
public class TestClass {


    TestClass() {}

    public <T> StringBuffer read(T clazz) {
        StringBuffer buffer = new StringBuffer();

        BaseConfig baseConfig = BaseConfig.getInstance();
        String path = baseConfig.getBasePath();

        File file = new File(path);
        if (!file.exists() || !file.isFile()) {
            System.out.println("请选择正确的文件");
        }

        try {
            FileReader reader = new FileReader(file);
            BufferedReader bf = new BufferedReader(reader);
            String line;

            while ((line = bf.readLine()) != null) {
                String[] args = line.split(":");
                if (args[0].equals("url")) {

                } else if (args[0].equals("param")) {

                } else if (args[0].equals("treaty")) {

                }
            }

            Byte[] bytes = new Byte[1024];

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return buffer;
    }



}
