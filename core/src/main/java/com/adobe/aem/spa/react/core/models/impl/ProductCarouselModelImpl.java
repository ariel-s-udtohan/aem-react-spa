package com.adobe.aem.spa.react.core.models.impl;


import org.apache.sling.models.annotations.*;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import com.adobe.aem.spa.react.core.models.ProductCarouselModel;

// Sling Model annotation
@Model(
    adaptables = SlingHttpServletRequest.class, 
    adapters = { ProductCarouselModel.class, ComponentExporter.class }, 
    resourceType = ProductCarouselModelImpl.RESOURCE_TYPE, 
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
    )
@Exporter( //Exporter annotation that serializes the model as JSON
    name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, 
    extensions = ExporterConstants.SLING_MODEL_EXTENSION
    )
public class ProductCarouselModelImpl implements ProductCarouselModel {

    @ValueMapValue
    private String productIds; //maps variable to jcr property named "productIds"

    // points to AEM component definition in ui.apps
    static final String RESOURCE_TYPE = "spa-react/components/productcarousel";

    // public getter method to expose value of private variable `productId`
    @Override
    public String getProductIds() {
        return StringUtils.isNotBlank(productIds) ? productIds : "";
    }

    // method required by `ComponentExporter` interface
    // exposes a JSON property named `:type` with a value of `spa-react/components/productcarousel`
    // required to map the JSON export to the SPA component props via the `MapTo`
    @Override
    public String getExportedType() {
        return ProductCarouselModelImpl.RESOURCE_TYPE;
    }
} 
