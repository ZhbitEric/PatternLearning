package com.xrd.pattern._01simpleFactoryPattern;

import org.springframework.util.ClassUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class XMLUtil {
    //该方法用于从XML配置文件中提取图表类型，并返回类型名
    public static String getChartType() {
        try {
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            String path = ClassUtils.getDefaultClassLoader().getResource("").getPath();
            doc = builder.parse(path+"static/simpleFactory/simpleFactoryConfig.xml");

            //获取包含图表类型的文本节点
            NodeList nl = doc.getElementsByTagName("graphType");
            Node classNode = nl.item(0).getFirstChild();
            String chartType = classNode.getNodeValue().trim();
            return chartType;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
