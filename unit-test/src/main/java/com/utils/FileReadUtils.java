package main.java.com.utils;

import main.java.com.domain.InputEntity;

import java.io.*;

/**
 * @Author pengjiequn
 * @Date 2022/07/08 14:09
 * @Version 1.0
 */
public class FileReadUtils {

    public static InputEntity readFile(String path) {
        InputEntity inputEntity = new InputEntity();

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
                    inputEntity.setUrl(args[1]);
                } else if (args[0].equals("inParam")) {
                    inputEntity.setInParam(args[1]);
                } else if (args[0].equals("outParam")) {
                    inputEntity.setOutParam(args[1]);
                } else if (args[0].equals("treaty")) {
                    inputEntity.setTreaty(args[1]);
                }
            }

            return inputEntity;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;

    }


}
