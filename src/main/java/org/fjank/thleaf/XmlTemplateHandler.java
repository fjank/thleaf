package org.fjank.thleaf;

import org.thymeleaf.engine.AbstractTemplateHandler;
import org.thymeleaf.engine.ITemplateHandler;
import org.thymeleaf.model.IText;
import org.unbescape.xml.XmlEscape;

public class XmlTemplateHandler extends AbstractTemplateHandler implements ITemplateHandler {
    @Override
    public void handleText(IText textNode) {
        // create a new text-node where we take the escaped text,
        // unescape it for pushing out to xml.
        // Do note that this can be dangerous if the text to be processed is user controlled.
        // depending on what system that reads the XML, you may now risk
        // Entity injection, XSS and other XML vulnerabilities, in addition to broken XML.
        String text = textNode.getText();
        String unescaped = XmlEscape.unescapeXml(text);
        IText newNode = getContext().getModelFactory().createText(unescaped);
        super.handleText(newNode);
    }
}
