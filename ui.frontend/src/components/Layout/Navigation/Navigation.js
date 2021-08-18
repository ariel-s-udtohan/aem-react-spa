import React from "react";


import { Link } from "react-router-dom";

import "./Navigation.scss";

const Navigation = () => {

  return (
    <nav className="cmp-navigation">
      <div className="cmp-navigation__menu">
        <ul>
            <li>
              <Link to="">Collections</Link>
            </li>
            <li>
              <Link to="">Products</Link>
            </li>
            <li>
              <Link to="">Service</Link>
            </li>
            <li>
              <Link to="">Community</Link>
            </li>
        </ul>
      </div>
    </nav>
  );
};

export default Navigation;
