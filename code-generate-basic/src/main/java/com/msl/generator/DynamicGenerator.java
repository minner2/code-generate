package com.msl.generator;

import com.msl.model.MainTemplateConfig;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @Author: RayMind
 * @Date: 2023/12/20
 * @Description: 生成动态代码
 */
public class DynamicGenerator {

    /**
     * 生成动态文件
     * @param inputPath 动态文件模板目录
     * @param outputPath 输出文件目录
     * @param model 数据模型
     * @throws IOException
     * @throws TemplateException
     */
    public static void doGenerate(String inputPath,String outputPath,Object model) throws IOException, TemplateException {
        Configuration configuration = new Configuration(Configuration.VERSION_2_3_31);
        //指定模板文件所在的目录
        File templateDir = new File(inputPath).getParentFile();
        configuration.setDirectoryForTemplateLoading(templateDir);
        configuration.setDefaultEncoding("UTF-8");
        //创建模板对象，加载指定模板
        String templateName = new File(inputPath).getName();
        Template template = configuration.getTemplate(templateName);


        //创建输出文件
        Writer out = new FileWriter(outputPath);
        template.process(model,out);
        out.close();


    }
}
