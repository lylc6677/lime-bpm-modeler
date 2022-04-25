package com.lime.bpm.modeler;

import lombok.extern.slf4j.Slf4j;
import org.flowable.bpmn.BpmnAutoLayout;
import org.flowable.bpmn.converter.BpmnXMLConverter;
import org.flowable.bpmn.model.BpmnModel;
import org.flowable.editor.language.json.converter.BpmnJsonConverter;
import org.flowable.ui.common.util.XmlUtil;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import java.io.*;

@Slf4j
public class BpmnAutoLayOutTest {

    protected BpmnXMLConverter bpmnXmlConverter = new BpmnXMLConverter();
    protected BpmnJsonConverter bpmnJsonConverter = new BpmnJsonConverter();

    @Test
    public void autoLayOutTest() {
        getResourcesByStream();
    }

    public void getResourcesByStream() {
        try {
            ClassPathResource resource = new ClassPathResource("usertask3-1.bpmn");
            try {
                InputStream inputStream = resource.getInputStream();
                XMLInputFactory xif = XmlUtil.createSafeXmlInputFactory();
                InputStreamReader xmlIn = new InputStreamReader(inputStream, "UTF-8");
                XMLStreamReader xtr = xif.createXMLStreamReader(xmlIn);
                BpmnModel bpmnModel = bpmnXmlConverter.convertToBpmnModel(xtr);
                if (bpmnModel.getLocationMap().size() == 0) {
                    BpmnAutoLayout bpmnLayout = new BpmnAutoLayout(bpmnModel);
                    bpmnLayout.execute();
                }
//                ObjectNode modelNode = bpmnJsonConverter.convertToJson(bpmnModel);
//                System.out.println(modelNode);
                byte[] bpmnBytes = bpmnXmlConverter.convertToXML(bpmnModel,"UTF-8");
                ByteArrayInputStream in = new ByteArrayInputStream(bpmnBytes);
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                byte[] buffer = new byte[4000];
                int length;
                while((length = in.read(buffer))!= -1) {
                    bos.write(buffer,0,length);
                }
                in.close();
                String bpmXml = new String(bos.toByteArray(),"utf-8");
                System.out.println(bpmXml);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
