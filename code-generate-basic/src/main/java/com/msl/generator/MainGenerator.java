package com.msl.generator;

import com.msl.model.MainTemplateConfig;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;

/**
 * @Author: RayMind
 * @Date: 2023/12/20
 * @Description: 核心生成器，动静结合
 */
public class MainGenerator {
    public static void main(String[] args) throws TemplateException, IOException {
        //创建数据模型
        MainTemplateConfig mainTemplateConfig = new MainTemplateConfig();
        mainTemplateConfig.setAuthor("RayMind");
        mainTemplateConfig.setLoop(false);
        mainTemplateConfig.setOutputText("两数之和等于: ");
        doGenerator(mainTemplateConfig);
    }

    /**
     * 生成
     * @param model 数据模型
     */
    public static void doGenerator(Object model) throws TemplateException, IOException {
        String projectPath = System.getProperty("user.dir");
        File parentFile = new File(projectPath).getParentFile();
        String inputPath = new File(parentFile,"demo-projects/acm-template").getAbsolutePath();
        String outputPath = projectPath;
        //生成静态文件
        StaticGenerator.copyFilesByHutool(inputPath,outputPath);
        //生成动态文件
        String inputDynamicFilePath = projectPath+File.separator+"src/main/resources/templates/MainTemplate.java.ftl";
        String outputDynamicFilePath = projectPath+File.separator+"acm-template/src/com/yupi/acm/MainTemplate.java";
        DynamicGenerator.doGenerate(inputDynamicFilePath,outputDynamicFilePath,model);
    }
}
