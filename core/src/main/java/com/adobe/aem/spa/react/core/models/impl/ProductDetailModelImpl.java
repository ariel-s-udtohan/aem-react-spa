package com.adobe.aem.spa.react.core.models.impl;


import org.apache.sling.models.annotations.*;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import com.adobe.aem.spa.react.core.models.ProductDetailModel;

// Sling Model annotation
@Model(
    adaptables = SlingHttpServletRequest.class, 
    adapters = { ProductDetailModel.class, ComponentExporter.class }, 
    resourceType = ProductDetailModelImpl.RESOURCE_TYPE, 
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
    )
@Exporter( //Exporter annotation that serializes the model as JSON
    name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, 
    extensions = ExporterConstants.SLING_MODEL_EXTENSION
    )
public class ProductDetailModelImpl implements ProductDetailModel {

    @ValueMapValue
    private String productId; //maps variable to jcr property named "productId"

    // points to AEM component definition in ui.apps
    static final String RESOURCE_TYPE = "spa-react/components/productdetail";

    // public getter method to expose value of private variable `productId`
    @Override
    public String getProductId() {
        return StringUtils.isNotBlank(productId) ? productId : "";
    }

    // method required by `ComponentExporter` interface
    // exposes a JSON property named `:type` with a value of `spa-react/components/productdetail`
    // required to map the JSON export to the SPA component props via the `MapTo`
    @Override
    public String getExportedType() {
        return ProductDetailModelImpl.RESOURCE_TYPE;
    }
} 
