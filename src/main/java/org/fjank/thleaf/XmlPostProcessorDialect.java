package org.fjank.thleaf;

import org.springframework.stereotype.Component;
import org.thymeleaf.dialect.AbstractDialect;
import org.thymeleaf.dialect.IPostProcessorDialect;
import org.thymeleaf.postprocessor.IPostProcessor;
import org.thymeleaf.postprocessor.PostProcessor;
import org.thymeleaf.templatemode.TemplateMode;

import java.util.Set;

@Component
public class XmlPostProcessorDialect extends AbstractDialect implements IPostProcessorDialect {

    protected XmlPostProcessorDialect() {
        super("xmlPostProcessor");
    }

    @Override
    public int getDialectPostProcessorPrecedence() {
        return 0;
    }

    @Override
    public Set<IPostProcessor> getPostProcessors() {
        return Set.of(new PostProcessor(TemplateMode.XML, XmlTemplateHandler.class, 0));
    }

}
