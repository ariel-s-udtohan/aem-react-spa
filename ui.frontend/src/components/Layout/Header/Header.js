import React from "react";

import { MapTo } from "@adobe/aem-react-editable-components";
import { Link } from "react-router-dom";

import SearchIcon from "../../UI/Icons/SearchIcon";
import LoginIcon from "../../UI/Icons/LoginIcon";
import CartIcon from "../../UI/Icons/CartIcon";

import "./Header.scss";
import Logo from "./Logo";
import Navigation from "../Navigation/Navigation";

const HeaderEditConfig = {
  emptyLabel: "Header",

  isEmpty: function (props) {
    return !props || !props.title || props.title.trim().length < 1;
  },
};

const Header = (props) => {
  const headerLogo = props.homeUrl ? (
    <Link to={props.homeUrl}>
      <Logo />
    </Link>
  ) : (
    <Logo />
  );

  return (
    <header className="cmp-header">
      <div className="cmp-header__container">
        <div className="cmp-header__wrapper">
          <div className="cmp-header__logo">{headerLogo}</div>
          <div className="cmp-header__right-links">
            <ul>
              <li>
                <SearchIcon />
                <span className="cmp-header__label">Search</span>
              </li>
              <li>
                <LoginIcon />
                <span className="cmp-header__label">Login</span>
              </li>
              <li>
                <CartIcon />
                <span className="cmp-header__label">Cart</span>
              </li>
            </ul>
          </div>
        </div>
      </div>
      <Navigation/>
    </header>
  );
};

export default Header;
MapTo("spa-react/components/header")(
  Header,
  HeaderEditConfig
);
