package com.adobe.aem.spa.react.core.models.impl;

import org.apache.sling.models.annotations.*;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import com.adobe.aem.spa.react.core.models.HeaderModel;

// Sling Model annotation
@Model(
    adaptables = SlingHttpServletRequest.class, 
    adapters = { HeaderModel.class, ComponentExporter.class }, 
    resourceType = HeaderModelImpl.RESOURCE_TYPE, 
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
    )
@Exporter( //Exporter annotation that serializes the model as JSON
    name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, 
    extensions = ExporterConstants.SLING_MODEL_EXTENSION
    )
public class HeaderModelImpl implements HeaderModel {

    @ValueMapValue
    private String title; //maps variable to jcr property named "title" persisted by Dialog

    // points to AEM component definition in ui.apps
    static final String RESOURCE_TYPE = "spa-react/components/header";

    // public getter method to expose value of private variable `title`
    // adds additional logic to default the title to "(Default)" if not set.
    @Override
    public String getTitle() {
        return StringUtils.isNotBlank(title) ? title : "(Default)";
    }

    // method required by `ComponentExporter` interface
    // exposes a JSON property named `:type` with a value of `spa-react/components/header`
    // required to map the JSON export to the SPA component props via the `MapTo`
    @Override
    public String getExportedType() {
        return HeaderModelImpl.RESOURCE_TYPE;
    }
} 
