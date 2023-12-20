package com.msl;

import java.io.File;

import static com.msl.generator.StaticGenerator.copyFilesByHutool;

public class Main {
    public static void main(String[] args) {

        //获取整个项目的根目录
        String projectPath = System.getProperty("user.dir");
        File parentFile = new File(projectPath).getParentFile();
        //输入路径：ACM示例代码模板目录
        String inputPath = new File(parentFile,"demo-projects/acm-template").getAbsolutePath();
        //输出路径：直接输出到项目的根目录
        String outputPath = projectPath;
        copyFilesByHutool(inputPath,outputPath);
        System.out.println(projectPath);

    }


}