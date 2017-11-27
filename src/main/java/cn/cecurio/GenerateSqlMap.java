package cn.cecurio;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Cecurio
 * @create: 2017-11-24 19:17
 **/
public class GenerateSqlMap {
    public void generate() throws Exception {
        List<String> warnings = new ArrayList<>();
        boolean overwrite = true;
        String projectRootDirectory = System.getProperty("user.dir");
        StringBuffer configLocation = new StringBuffer(projectRootDirectory);
        configLocation.append(File.separator).append("src").append(File.separator)
            .append("main").append(File.separator).append("resources")
            .append(File.separator).append("generatorConfig.xml");

        File configFile = new File(configLocation.toString());
        ConfigurationParser configurationParser = new ConfigurationParser(warnings);
        Configuration config = configurationParser.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }

    public static void main(String[] args) {
        GenerateSqlMap generateSqlMap = new GenerateSqlMap();
        try {
            generateSqlMap.generate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
