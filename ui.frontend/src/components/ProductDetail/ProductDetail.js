import React from "react";
import { MapTo } from "@adobe/aem-react-editable-components";

// Logic to render placeholder or component
const ProductDetailEditConfig = {
  emptyLabel: "Product Detail",
  isEmpty: function (props) {
    return !props;
  },
};

const ProductDetail = (props) => {
  return (
    <div>
      <h1> Product Detail</h1>
    </div>
  );
};

export default ProductDetail;
MapTo("spa-react/components/productdetail")(
  ProductDetail,
  ProductDetailEditConfig
);
