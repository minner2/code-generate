import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: RayMind
 * @Date: 2023/12/19
 * @Description:
 */
public class FreeMarkerTest {
    @Test
    public  void test() throws IOException, TemplateException {
        Configuration configuration = new Configuration(Configuration.VERSION_2_3_31);
        //指定模板文件所在的目录
        configuration.setDirectoryForTemplateLoading(new File("src/main/resources/templates"));
        //指定模板文件的编码格式
        configuration.setDefaultEncoding("UTF-8");
        Template template = configuration.getTemplate("myweb.html.ftl");
        Map<String,Object> dataModel = new HashMap<>();
        dataModel.put("currentYear",2023);
        List<Map<String,Object>> menuItemList = new ArrayList<>();
        Map<String,Object> menuItems = new HashMap<>();
        menuItems.put("name","首页");
        menuItems.put("url","www.baidu.com");
        Map<String,Object> menuItems2 = new HashMap<>();
        menuItems2.put("name","关于我们");
        menuItems2.put("url","raymind-blog.top");
        menuItemList.add(menuItems);
        menuItemList.add(menuItems2);
        dataModel.put("menuItems",menuItemList);
        Writer out  = new FileWriter("myweb.html");
        template.process(dataModel,out);
        out.close();

    }

    @Test
   public void test2(){
        System.out.println("钟慧如");
    }
}
