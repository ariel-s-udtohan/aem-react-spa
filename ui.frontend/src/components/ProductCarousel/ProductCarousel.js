import React from "react";
import { MapTo } from "@adobe/aem-react-editable-components";

// Logic to render placeholder or component
const ProductCarouselEditConfig = {
  emptyLabel: "Product Carousel",
  isEmpty: function (props) {
    return !props;
  },
};

const ProductCarousel = (props) => {
  if (ProductCarouselEditConfig.isEmpty(props)) {
    return <h1>Product Carousel</h1>;
  }

  return (
    <div className="product-carousel">
      <h1>Product Carousel</h1>
    </div>
  );
};

export default ProductCarousel;
MapTo("optus-react/components/productcarousel")(
  ProductCarousel,
  ProductCarouselEditConfig
);
