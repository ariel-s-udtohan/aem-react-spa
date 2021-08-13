package com.adobe.aem.spa.react.core.models;

import com.adobe.cq.export.json.ComponentExporter;

// Sling Models intended to be used with SPA Editor must extend ComponentExporter interface
public interface ProductDetailModel extends ComponentExporter {

    public String getProductId();

}
