<%--
  Created by IntelliJ IDEA.
  User: tao
  Date: 2021/4/13
  Time: 22:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<link rel="stylesheet" href="${pageContext.request.contextPath}assets/css/vendor.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}assets/css/main.css">
<head></head>
<body>
<header class="header header-default site-header header-transparent">
    <div class="header__outer">
        <div class="header__inner header--fixed">
            <div class="container">
                <div class="header__main">
                    <div class="header__col header__left">
                        <a href="index.html" class="logo">
                            <figure class="logo--normal">
                                <img src="assets/img/logo/logo.png" alt="Logo">
                            </figure>
                            <figure class="logo--transparency">
                                <img src="assets/img/logo/logo.png" alt="Logo">
                            </figure>
                        </a>
                    </div>
                    <div class="header__col header__center">
                        <nav class="main-navigation d-none d-lg-block">
                            <ul class="mainmenu">
                                <li class="mainmenu__item menu-item-has-children position-relative">
                                    <a href="index.html" class="mainmenu__link">首页</a>
                                </li>
                                <li class="mainmenu__item menu-item-has-children position-static">
                                    <a href="#" class="mainmenu__link">分类</a>
                                    <div class="inner-menu megamenu-holder">
                                        <ul class="megamenu">
                                            <li>
                                                <a class="megamenu-title" href="#">Shop Grid</a>
                                                <ul>
                                                    <li>
                                                        <a href="shop-fullwidth.html">Full Width</a>
                                                    </li>
                                                </ul>
                                            </li>
                                            <li>
                                                <a class="megamenu-title" href="#">Shop List</a>
                                                <ul>
                                                    <li>
                                                        <a href="shop-list.html">Full Width</a>
                                                    </li>
                                                </ul>
                                            </li>
                                            <li>
                                                <a class="megamenu-title" href="#">Product Details</a>
                                                <ul>
                                                    <li>
                                                        <a href="product-details.html">Tab Style 1</a>
                                                    </li>
                                                </ul>
                                            </li>
                                            <li>
                                                <a class="megamenu-title" href="#">Product Details</a>
                                                <ul>
                                                    <li>
                                                        <a href="product-details-sticky-right.html">Sticky Right</a>
                                                    </li>
                                                </ul>
                                            </li>
                                        </ul>
                                    </div>
                                </li>
                                <li class="mainmenu__item menu-item-has-children position-relative">
                                    <a href="#" class="mainmenu__link">导航</a>
                                    <div class="inner-menu">
                                        <ul class="sub-menu">
                                            <li>
                                                <a href="my-account.html">My Account</a>
                                            </li>
                                        </ul>
                                    </div>
                                </li>
                                <li class="mainmenu__item menu-item-has-children position-relative">
                                    <a href="#" class="mainmenu__link">Blog</a>
                                    <div class="inner-menu">
                                        <ul class="sub-menu">
                                            <li class="has-children">
                                                <a href="#">Blog Grid</a>
                                                <ul class="sub-menu">
                                                    <li>
                                                        <a href="blog-left-sidebar.html">Left Sidebar</a>
                                                    </li>
                                                </ul>
                                            </li>
                                            <li class="has-children">
                                                <a href="#">Blog Details</a>
                                                <ul class="sub-menu">
                                                    <li>
                                                        <a href="blog-details-image.html">Image Post</a>
                                                    </li>
                                                </ul>
                                            </li>
                                        </ul>
                                    </div>
                                </li>
                                <li class="mainmenu__item">
                                    <a href="contact-us.html" class="mainmenu__link">关于我们</a>
                                </li>
                            </ul>
                        </nav>
                    </div>
                    <div class="header__col header__right">
                        <div class="toolbar-item d-none d-lg-block">
                            <a href="login-register.html" class="toolbar-btn">
                                <span>登录</span>
                            </a>
                        </div>
                        <div class="toolbar-item d-block d-lg-none">
                            <a href="#offcanvasnav" class="hamburger-icon js-toolbar menu-btn">
                                <span></span>
                                <span></span>
                                <span></span>
                                <span></span>
                                <span></span>
                                <span></span>
                            </a>
                        </div>
                        <div class="toolbar-item">
                            <a href="wishlist.html" class="toolbar-btn">
                                <i class="flaticon-heart"></i>
                            </a>
                        </div>
                        <div class="toolbar-item mini-cart-btn">
                            <a href="#miniCart" class="toolbar-btn js-toolbar">
                                        <span class="mini-cart-btn__icon">
                                            <i class="flaticon-bag"></i>
                                        </span>
                                <sup class="mini-cart-btn__count">
                                    02
                                </sup>
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="header-sticky-height"></div>
    </div>
</header>
</body>
</html>
