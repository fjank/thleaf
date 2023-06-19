package org.fjank.thleaf;

import org.thymeleaf.engine.AbstractTemplateHandler;
import org.thymeleaf.engine.ITemplateHandler;
import org.thymeleaf.model.IText;

public class XmlTemplateHandler extends AbstractTemplateHandler implements ITemplateHandler {
    @Override
    public void handleText(IText text) {
        super.handleText(text);
    }
}
