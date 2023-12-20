package com.msl.model;

import lombok.Data;

/**
 * @Author: RayMind
 * @Date: 2023/12/19
 * @Description: 动态文件模板变量数据模型
 */

@Data
public class MainTemplateConfig {
    /**
     * 作者注释
     */
    private String author = "raymind";
    /**
     * 是否循环
     */
    private boolean loop = false;
    /**
     * 输出信息
     */
    private String outputText = "sum = ";

}
