package com.msl.generator;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.file.FileCopier;

import java.io.File;

/**
 * @Author: RayMind
 * @Date: 2023/12/18
 * @Description: 生成静态代码
 */
public class StaticGenerator {
    /**
     *  使用hutool工具包进行文件拷贝
     * @param inputPath 输入路径
     * @param outputPath 输出路径
     * @return
     */
    public static void copyFilesByHutool(String inputPath,String outputPath) {
        FileUtil.copy(inputPath,outputPath,false);
    }
}
