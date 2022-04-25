package com.lime.bpm.modeler.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.lime.bpm.modeler.domain.AbstractModel;
import com.lime.bpm.modeler.domain.Model;
import com.lime.bpm.modeler.model.ModelRepresentation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.flowable.bpmn.BpmnAutoLayout;
import org.flowable.bpmn.converter.BpmnXMLConverter;
import org.flowable.bpmn.model.BpmnModel;
import org.flowable.editor.language.json.converter.BpmnJsonConverter;
import org.flowable.ui.common.service.exception.BadRequestException;
import org.flowable.ui.common.util.XmlUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import java.io.InputStreamReader;

/**
 * @author lichao
 */
@Slf4j
@Service
public class BpmModelService {

//    @Autowired
//    protected ObjectMapper objectMapper;
//
//    protected BpmnXMLConverter bpmnXmlConverter = new BpmnXMLConverter();
//    protected BpmnJsonConverter bpmnJsonConverter = new BpmnJsonConverter();
//
//    public void importProcessModel(HttpServletRequest request, MultipartFile file) {
//        String fileName = file.getOriginalFilename();
//        if (fileName != null && (fileName.endsWith(".bpmn") || fileName.endsWith(".bpmn20.xml"))) {
//            try {
//                XMLInputFactory xif = XmlUtil.createSafeXmlInputFactory();
//                InputStreamReader xmlIn = new InputStreamReader(file.getInputStream(), "UTF-8");
//                XMLStreamReader xtr = xif.createXMLStreamReader(xmlIn);
//                BpmnModel bpmnModel = bpmnXmlConverter.convertToBpmnModel(xtr);
//                if (CollectionUtils.isEmpty(bpmnModel.getProcesses())) {
//                    throw new BadRequestException("No process found in definition " + fileName);
//                }
//                if (bpmnModel.getLocationMap().size() == 0) {
//                    BpmnAutoLayout bpmnLayout = new BpmnAutoLayout(bpmnModel);
//                    bpmnLayout.execute();
//                }
//                ObjectNode modelNode = bpmnJsonConverter.convertToJson(bpmnModel);
//                org.flowable.bpmn.model.Process process = bpmnModel.getMainProcess();
//                String name = process.getId();
//                if (StringUtils.isNotEmpty(process.getName())) {
//                    name = process.getName();
//                }
//                String description = process.getDocumentation();
//
//                ModelRepresentation model = new ModelRepresentation();
//                model.setKey(process.getId());
//                model.setName(name);
//                model.setDescription(description);
//                model.setModelType(AbstractModel.MODEL_TYPE_BPMN);
//                System.out.println(model);
//            } catch (BadRequestException e) {
//                throw e;
//            } catch (Exception e) {
//                log.error("Import failed for {}", fileName, e);
//                throw new BadRequestException("Import failed for " + fileName + ", error message " + e.getMessage());
//            }
//        } else {
//            throw new BadRequestException("Invalid file name, only .bpmn and .bpmn20.xml files are supported not " + fileName);
//        }
//    }
}
