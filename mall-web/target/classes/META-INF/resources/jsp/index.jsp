<%--
  Created by IntelliJ IDEA.
  User: tao
  Date: 2021/4/13
  Time: 22:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="shortcut icon" href="${pageContext.request.contextPath}assets/img/favicon.ico" type="image/x-icon">
<link rel="apple-touch-icon" href="${pageContext.request.contextPath}assets/img/icon.png">
<link rel="stylesheet" href="${pageContext.request.contextPath}assets/css/vendor.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}assets/css/main.css">
<script src="${pageContext.request.contextPath}assets/js/vendor.js"></script>
<script src="${pageContext.request.contextPath}assets/js/main.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>

<!-- Preloader Start -->
<div class="ft-preloader active">
    <div class="ft-preloader-inner h-100 d-flex align-items-center justify-content-center">
        <div class="ft-child ft-bounce1"></div>
        <div class="ft-child ft-bounce2"></div>
        <div class="ft-child ft-bounce3"></div>
    </div>
</div>
<!-- Preloader End -->

<!-- Main Wrapper Start -->
<div class="wrapper">
    <!-- Header Start -->
    <header class="header header-default site-header header-transparent">
        <%@ include file="/public/header.jsp"%>

    <!-- Main Content Wrapper Start -->
    <main class="main-content-wrapper">
        <!-- Slider area Start -->
        <section class="homepage-slider mb--11pt5">
            <div class="element-carousel slick-right-bottom" data-slick-options='{
                    "slidesToShow": 1,
                    "dots": true
                }'>
                <div class="item">
                    <div class="single-slide d-flex align-items-center bg-image"
                         data-bg-image="assets/img/slider/slider-bg-01.jpg">
                        <div class="container">
                            <div class="row align-items-center no-gutters w-100">
                                <div class="col-lg-6 col-md-8">
                                    <div class="slider-content">
                                        <div class="slider-content__text mb--95 md-lg--80 mb-md--40 mb-sm--15">
                                            <h3 class="text-uppercase font-weight-light" data-animation="fadeInUp"
                                                data-duration=".3s" data-delay=".3s">AMAZING PRODUCT!</h3>
                                            <h1 class="heading__primary mb--40 mb-md--20" data-animation="fadeInUp"
                                                data-duration=".3s" data-delay=".3s">BACKPACK</h1>
                                            <p class="font-weight-light" data-animation="fadeInUp"
                                               data-duration=".3s" data-delay=".3s">Neque porro quisquam est, qui
                                                dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed
                                                quia non numquam eius modi
                                                tempora Neque porro quisquam est, qui dolorem ipsum</p>
                                        </div>
                                        <div class="slider-content__btn">
                                            <a href="shop.html" class="btn-link" data-animation="fadeInUp"
                                               data-duration=".3s" data-delay=".6s">Shop Now</a>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-lg-4 offset-lg-2 col-md-4">
                                    <figure class="slider-image d-none d-md-block">
                                        <img src="assets/img/slider/slider-image-01.png" alt="Slider Image">
                                    </figure>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="item">
                    <div class="single-slide d-flex align-items-center bg-image"
                         data-bg-image="assets/img/slider/slider-bg-01.jpg">
                        <div class="container">
                            <div class="row align-items-center no-gutters w-100">
                                <div class="col-lg-6 col-md-8">
                                    <div class="slider-content py-0">
                                        <div class="slider-content__text mb--95 md-lg--80 mb-md--40 mb-sm--15">
                                            <h3 class="text-uppercase font-weight-light" data-animation="fadeInUp"
                                                data-duration=".3s" data-delay=".3s">AMAZING PRODUCT!</h3>
                                            <h1 class="heading__primary mb--40 mb-md--20" data-animation="fadeInUp"
                                                data-duration=".3s" data-delay=".3s">BACKPACK</h1>
                                            <p class="font-weight-light" data-animation="fadeInUp"
                                               data-duration=".3s" data-delay=".3s">Neque porro quisquam est, qui
                                                dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed
                                                quia non numquam eius modi
                                                tempora Neque porro quisquam est, qui dolorem ipsum</p>
                                        </div>
                                        <div class="slider-content__btn">
                                            <a href="shop.html" class="btn-link" data-animation="fadeInUp"
                                               data-duration=".3s" data-delay=".6s">Shop Now</a>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-lg-4 offset-lg-2 col-md-4">
                                    <figure class="slider-image d-none d-md-block">
                                        <img src="assets/img/slider/slider-image-02.png" alt="Slider Image">
                                    </figure>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Slider area End -->

        <!-- Featured Product Area Start -->
        <section class="featured-product-area mb--10pt8">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <h2 class="sr-only">Featured Product</h2>
                    </div>
                </div>
                <div class="row align-items-center">
                    <div class="col-md-6 mb-sm--50">
                        <div class="featured-product">
                            <div class="featured-product__inner info-center">
                                <figure class="featured-product__image">
                                    <img src="assets/img/products/product-01-500x466.jpg" alt="Featured Product">
                                </figure>
                                <div class="featured-product__info wow pbounceInLeft" data-wow-delay=".3s" data-wow-duration="1s">
                                    <div class="featured-product__info-inner">
                                        <h4 class="featured-product__text">Amazing Product!</h4>
                                        <h2 class="featured-product__name">Bisco Bag</h2>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="featured-product">
                            <div class="featured-product__inner info-left-bottom">
                                <figure class="featured-product__image">
                                    <img src="assets/img/products/product-02-500x575.jpg" alt="Featured Product">
                                </figure>
                                <div class="featured-product__info wow pbounceInDown" data-wow-duration="1s">
                                    <div class="featured-product__info-inner rotated-info">
                                        <h4 class="featured-product__text">Special Offer <strong>39%</strong> Off</h4>
                                        <h2 class="featured-product__name">Feedo Bag</h2>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Featured Product Area End -->

        <!-- Product Area Start -->
        <section class="product-area mb--50 mb-xl--40 mb-lg--25 mb-md--30 mb-sm--20 mb-xs--15">
            <div class="container">
                <div class="row mb--42">
                    <div class="col-lg-5 col-sm-10">
                        <h2 class="heading__secondary">新品上市</h2>
                        <p>Neque porro quisquam est, qui dolorem ipsum quia dolor ipisci velit, sed quia non numquam
                            eius modi </p>
                    </div>
                </div>
                <div class="row">
                    <c:forEach items="${productInfos}" var="product">
                    <div class="col-lg-3 col-md-4 col-sm-6 mb--65 mb-md--50">
                        <div class="payne-product">
                            <div class="product__inner">
                                <div class="product__image">
                                    <figure class="product__image--holder">
                                        <img src="${product.productImg}" alt="Product">
                                    </figure>
                                    <a href="product-details.html" class="product-overlay"></a>
                                    <div class="product__action">
                                        <a data-toggle="modal" data-target="#productModal" class="action-btn">
                                            <i class="fa fa-eye"></i>
                                            <span class="sr-only">查看</span>
                                        </a>
                                        <a href="wishlist.html" class="action-btn">
                                            <i class="fa fa-heart-o"></i>
                                            <span class="sr-only">Add to wishlist</span>
                                        </a>
                                        <a href="wishlist.html" class="action-btn">
                                            <i class="fa fa-repeat"></i>
                                            <span class="sr-only">Add To Compare</span>
                                        </a>
                                        <a href="cart.html" class="action-btn">
                                            <i class="fa fa-shopping-cart"></i>
                                            <span class="sr-only">加入购物车</span>
                                        </a>
                                    </div>
                                </div>
                                <div class="product__info">
                                    <div class="product__info--left">
                                        <h3 class="product__title">
                                            <a href="product-details.html">${product.price}</a>
                                        </h3>
                                        <div class="product__price">
                                            <span class="money">${product.price}</span>
                                            <span class="sign">$</span>
                                        </div>
                                    </div>
                                    <div class="product__info--right">
                                            <span class="product__rating">
                                                <i class="fa fa-star"></i>
                                                <i class="fa fa-star"></i>
                                                <i class="fa fa-star"></i>
                                                <i class="fa fa-star"></i>
                                                <i class="fa fa-star"></i>
                                            </span>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    </c:forEach>

                </div>
            </div>
        </section>
        <!-- Product Area End -->


        <!-- Featured Product Area Start -->
        <section class="featured-product-area mb--11pt5">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <h2 class="sr-only">Featured Product</h2>
                    </div>
                </div>
                <div class="row align-items-center">
                    <div class="col-md-6 mb-sm--50">
                        <div class="featured-product">
                            <div class="featured-product__inner info-right-bottom">
                                <figure class="featured-product__image">
                                    <img src="assets/img/products/product-14-500x575.jpg" alt="Featured Product">
                                </figure>
                                <div class="featured-product__info wow pbounceInDown" data-wow-delay=".6s" data-wow-duration=".8s">
                                    <div class="featured-product__info-inner rotated-info">
                                        <h4 class="featured-product__text">Special Offer <strong>39%</strong> Off</h4>
                                        <h2 class="featured-product__name">Feedo Bag</h2>
                                    </div>
                                </div>
                                <span class="featured-product__badge badge-top-left">53% off</span>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="featured-product">
                            <div class="featured-product__inner info-center">
                                <figure class="featured-product__image">
                                    <img src="assets/img/products/product-15-500x466.jpg" alt="Featured Product">
                                </figure>
                                <div class="featured-product__info wow pbounceInLeft" data-wow-delay=".3s" data-wow-duration=".8s">
                                    <div class="featured-product__info-inner">
                                        <h4 class="featured-product__text">Mega Sale Offer</h4>
                                        <h2 class="featured-product__name">Maxica Bag</h2>
                                    </div>
                                </div>
                                <span class="featured-product__badge">53% off</span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Featured Product Area End -->

        <section class="method-area mb--11pt5">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <h2 class="sr-only">Methods</h2>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-4 mb-sm--50">
                        <div class="method-box shipment-method">
                            <i class="flaticon-truck"></i>
                            <h3>免费配送</h3>
                        </div>
                    </div>
                    <div class="col-md-4 mb-sm--50">
                        <div class="method-box money-back-method">
                            <i class="flaticon-money"></i>
                            <h3>退款保证</h3>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="method-box support-method">
                            <i class="flaticon-support"></i>
                            <h3>客服支持</h3>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </main>
    <!-- Main Content Wrapper End -->

    <!-- Footer Start-->
    <footer class="footer bg-color pt--70 pt-xs--60" data-bg-color="#f4f8fa">
        <div class="container">
            <div class="row border-bottom pb--60 pb-sm--28 pb-xs--49">
                <div class="col footer-column-1 mb-sm--42">
                    <div class="footer-widget">
                        <div class="textwidget">
                            <figure class="footer-logo mb--10">
                                <img src="assets/img/logo/logo.png" alt="Logo">
                            </figure>
                        </div>
                        <div class="address-widget">
                            <address>广东省汕头市金平区XXXX</address>
                            <a href="tel:+84112345678">13999999999</a>
                            <a href="mailto:info@company.com">sunshine@qq.com</a>
                        </div>
                    </div>
                </div>
                <div class="col footer-column-2 mb-md--33">
                    <div class="footer-widget">
                        <h3 class="widget-title mb--35 mb-sm--15">店铺菜单</h3>
                        <ul class="footer-menu">
                            <li>
                                <a href="shop.html">
                                    <i class="fa fa-angle-right"></i>
                                    <span>Best Seller</span>
                                </a>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="col footer-column-3 mb-sm--33">
                    <div class="footer-widget">
                        <h3 class="widget-title mb--35 mb-sm--15">信息</h3>
                        <ul class="footer-menu">
                            <li>
                                <a href="#">
                                    <i class="fa fa-angle-right"></i>
                                    <span>关于我们</span>
                                </a>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="col footer-column-4 mb-xs--33">
                    <div class="footer-widget">
                        <h3 class="widget-title mb--35 mb-sm--15">问题</h3>
                        <div class="footer-widget">
                            <ul class="footer-menu">
                                <li>
                                    <a href="#">
                                        <i class="fa fa-angle-right"></i>
                                        <span>帮助</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="order-tracking.html">
                                        <i class="fa fa-angle-right"></i>
                                        <span>常见问题</span>
                                    </a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="col footer-column-5">
                    <div class="footer-widget">
                        <h3 class="widget-title mb--35 mb-sm--15">我的账户</h3>
                        <ul class="footer-menu">
                            <li>
                                <a href="my-account.html">
                                    <i class="fa fa-angle-right"></i>
                                    <span>我的账户</span>
                                </a>
                            </li>
                            <li>
                                <a href="order-tracking.html">
                                    <i class="fa fa-angle-right"></i>
                                    <span>订单交付</span>
                                </a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="row ptb--20">
                <div class="col-12 text-center">
                    <p class="copyright-text">汕头阳之光版权所有</a></p>

                </div>
            </div>
        </div>
    </footer>
    <!-- Footer End-->

    <!-- OffCanvas Menu Start -->
    <aside class="offcanvas-navigation" id="offcanvasnav">
        <div class="offcanvas-navigation__inner">
            <a href="" class="btn-close">
                <i class="flaticon-cross"></i>
                <span class="sr-only">Close Offcanvas Navigtion</span>
            </a>
            <div class="offcanvas-navigation__top">
                <ul class="offcanvas-menu">
                    <li class="has-children">
                        <a href="#">
                            <span class="mm-text">Home</span>
                        </a>
                        <ul class="sub-menu">
                            <li class="has-children">
                                <a href="index.html">
                                    <span class="mm-text">Home One</span>
                                </a>
                            </li>
                            <li class="has-children">
                                <a href="index-02.html">
                                    <span class="mm-text">Home Two</span>
                                </a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="shop.html">
                            <span class="mm-text">New Arrivals</span>
                        </a>
                    </li>
                    <li class="has-children">
                        <a href="#">
                            <span class="mm-text">Shop</span>
                        </a>
                        <ul class="sub-menu">
                            <li class="has-children">
                                <a href="#">
                                    <span class="overlay-menu__title">Shop Layout</span>
                                </a>
                                <ul class="sub-menu">
                                    <li>
                                        <a href="shop-fullwidth.html">
                                            <span class="mm-text">Full Width</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="shop.html">
                                            <span class="mm-text">Left Sidebar</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="shop-right-sidebar.html">
                                            <span class="mm-text">Right Sidebar</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="shop-three-columns.html">
                                            <span class="mm-text">Three Columns</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="shop-four-columns.html">
                                            <span class="mm-text">Four Columns</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="shop-list.html">
                                            <span class="mm-text">Full Width</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="shop-list-sidebar.html">
                                            <span class="mm-text">Left Sidebar</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="shop-list-right-sidebar.html">
                                            <span class="mm-text">Right Sidebar</span>
                                        </a>
                                    </li>
                                </ul>
                            </li>
                            <li class="has-children">
                                <a href="#">
                                    <span class="overlay-menu__title">Single Product</span>
                                </a>
                                <ul class="sub-menu">
                                    <li>
                                        <a href="product-details.html">
                                            <span class="mm-text">Tab Style 1</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="product-details-tab-style-2.html">
                                            <span class="mm-text">Tab Style 2</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="product-details-tab-style-3.html">
                                            <span class="mm-text">Tab Style 3</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="product-details-gallery-left.html">
                                            <span class="mm-text">Gallery Left</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="product-details-gallery-right.html">
                                            <span class="mm-text">Gallery Right</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="product-details-sticky-left.html">
                                            <span class="mm-text">Sticky Left</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="product-details-sticky-right.html">
                                            <span class="mm-text">Sticky Right</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="product-details-slider-box.html">
                                            <span class="mm-text">Slider Box</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="product-details-slider-full-width.html">
                                            <span class="mm-text">Slider Box Full Width</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="product-details-affiliate.html">
                                            <span class="mm-text">Affiliate Proudct</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="product-details-variable.html">
                                            <span class="mm-text">Variable Proudct</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="product-details-group.html">
                                            <span class="mm-text">Group Product</span>
                                        </a>
                                    </li>
                                </ul>
                            </li>
                            <li class="has-children">
                                <a href="#">
                                    <span class="overlay-menu__title">Shop Pages</span>
                                </a>
                                <ul class="sub-menu">
                                    <li>
                                        <a href="my-account.html">
                                            <span class="mm-text">My Account</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="cart.html">
                                            <span class="mm-text">Shopping Cart</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="checkout.html">
                                            <span class="mm-text">Check Out</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="wishlist.html">
                                            <span class="mm-text">Wishlist</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="order-tracking.html">
                                            <span class="mm-text">Order tracking</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="compare.html">
                                            <span class="mm-text">compare</span>
                                        </a>
                                    </li>
                                </ul>
                            </li>
                        </ul>
                    </li>
                    <li class="has-children">
                        <a href="#">
                            <span class="mm-text">Pages</span>
                        </a>
                        <ul class="sub-menu">
                            <li>
                                <a href="my-account.html">
                                    <span class="mm-text">My Account</span>
                                </a>
                            </li>
                            <li>
                                <a href="checkout.html">
                                    <span class="mm-text">Checkout</span>
                                </a>
                            </li>
                            <li>
                                <a href="cart.html">
                                    <span class="mm-text">Cart</span>
                                </a>
                            </li>
                            <li>
                                <a href="compare.html">
                                    <span class="mm-text">Compare</span>
                                </a>
                            </li>
                            <li>
                                <a href="order-tracking.html">
                                    <span class="mm-text">Track Order</span>
                                </a>
                            </li>
                            <li>
                                <a href="wishlist.html">
                                    <span class="mm-text">Wishlist</span>
                                </a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="contact-us.html">
                            <span class="mm-text">Contact Us</span>
                        </a>
                    </li>
                </ul>
            </div>
        </div>
    </aside>
    <!-- OffCanvas Menu End -->

    <!-- Mini Cart Start -->
    <aside class="mini-cart" id="miniCart">
        <div class="mini-cart-wrapper">
            <div class="mini-cart__close">
                <a href="#" class="btn-close"><i class="flaticon-cross"></i></a>
            </div>
            <div class="mini-cart-inner">
                <h3 class="mini-cart__heading mb--45">购物车</h3>
                <div class="mini-cart__content">
                    <ul class="mini-cart__list">
                        <li class="mini-cart__product">
                            <a href="#" class="mini-cart__product-remove">
                                <i class="flaticon-cross"></i>
                            </a>
                            <div class="mini-cart__product-image">
                                <img src="assets/img/products/product-11-90x90.jpg" alt="products">
                            </div>
                            <div class="mini-cart__product-content">
                                <a class="mini-cart__product-title" href="product-details.html">Lexbaro Begadi</a>
                                <span class="mini-cart__product-quantity">1 x $49.00</span>
                            </div>
                        </li>
                        <li class="mini-cart__product">
                            <a href="#" class="mini-cart__product-remove">
                                <i class="flaticon-cross"></i>
                            </a>
                            <div class="mini-cart__product-image">
                                <img src="assets/img/products/product-12-90x90.jpg" alt="products">
                            </div>
                            <div class="mini-cart__product-content">
                                <a class="mini-cart__product-title" href="product-details.html">Lexbaro Begadi</a>
                                <span class="mini-cart__product-quantity">1 x $49.00</span>
                            </div>
                        </li>
                        <li class="mini-cart__product">
                            <a href="#" class="mini-cart__product-remove">
                                <i class="flaticon-cross"></i>
                            </a>
                            <div class="mini-cart__product-image">
                                <img src="assets/img/products/product-13-90x90.jpg" alt="products">
                            </div>
                            <div class="mini-cart__product-content">
                                <a class="mini-cart__product-title" href="product-details.html">Lexbaro Begadi</a>
                                <span class="mini-cart__product-quantity">1 x $49.00</span>
                            </div>
                        </li>
                    </ul>
                    <div class="mini-cart__total">
                        <span>总额</span>
                        <span class="ammount">$98.00</span>
                    </div>
                    <div class="mini-cart__buttons">
                        <a href="cart.html" class="btn btn-fullwidth btn-bg-primary mb--20">立即购买</a>
                        <a href="checkout.html" class="btn btn-fullwidth btn-bg-primary">退出</a>
                    </div>
                </div>
            </div>
        </div>
    </aside>
    <!-- Mini Cart End -->

    <!-- Qicuk View Modal Start -->
    <div class="modal fade product-modal" id="productModal" tabindex="-1" role="dialog" aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-body">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true"><i class="flaticon-cross"></i></span>
                    </button>
                    <div class="row">
                        <div class="col-lg-6">
                            <div class="element-carousel slick-vertical-center" data-slick-options='{
                                    "slidesToShow": 1,
                                    "slidesToScroll": 1,
                                    "arrows": true,
                                    "prevArrow": {"buttonClass": "slick-btn slick-prev", "iconClass": "fa fa-angle-double-left" },
                                    "nextArrow": {"buttonClass": "slick-btn slick-next", "iconClass": "fa fa-angle-double-right" }
                                }'>
                                <div class="item">
                                    <figure class="product-gallery__image">
                                        <img src="assets/img/products/product-03-270x300.jpg" alt="Product">
                                        <span class="product-badge sale">Sale</span>
                                    </figure>
                                </div>
                                <div class="item">
                                    <figure class="product-gallery__image">
                                        <img src="assets/img/products/product-04-270x300.jpg" alt="Product">
                                        <span class="product-badge sale">Sale</span>
                                    </figure>
                                </div>
                                <div class="item">
                                    <figure class="product-gallery__image">
                                        <img src="assets/img/products/product-05-270x300.jpg" alt="Product">
                                        <span class="product-badge sale">Sale</span>
                                    </figure>
                                </div>
                                <div class="item">
                                    <figure class="product-gallery__image">
                                        <img src="assets/img/products/product-06-270x300.jpg" alt="Product">
                                        <span class="product-badge sale">Sale</span>
                                    </figure>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <div class="modal-box product-summary">
                                <div class="product-navigation text-right mb--20">
                                    <a href="#" class="prev"><i class="fa fa-angle-double-left"></i></a>
                                    <a href="#" class="next"><i class="fa fa-angle-double-right"></i></a>
                                </div>
                                <div class="product-rating d-flex mb--20">
                                    <div class="star-rating star-four">
                                        <span>Rated <strong class="rating">5.00</strong> out of 5</span>
                                    </div>
                                </div>
                                <h3 class="product-title mb--20">Golden Easy Spot Chair.</h3>
                                <p class="product-short-description mb--20">Donec accumsan auctor iaculis. Sed suscipit
                                    arcu ligula, at egestas magna molestie a. Proin ac ex maximus, ultrices justo eget,
                                    sodales orci. Aliquam egestas libero ac turpis pharetra, in vehicula lacus
                                    scelerisque. Vestibulum ut sem laoreet, feugiat tellus at, hendrerit arcu.</p>
                                <div class="product-price-wrapper mb--25">
                                    <span class="money">$200.00</span>
                                    <span class="price-separator">-</span>
                                    <span class="money">$400.00</span>
                                </div>
                                <form action="#" class="variation-form mb--20">
                                    <div class="product-size-variations d-flex align-items-center mb--15">
                                        <p class="variation-label">Size:</p>
                                        <div class="product-size-variation variation-wrapper">
                                            <div class="variation">
                                                <a class="product-size-variation-btn selected" data-toggle="tooltip"
                                                   data-placement="top" title="S">
                                                    <span class="product-size-variation-label">S</span>
                                                </a>
                                            </div>
                                            <div class="variation">
                                                <a class="product-size-variation-btn" data-toggle="tooltip"
                                                   data-placement="top" title="M">
                                                    <span class="product-size-variation-label">M</span>
                                                </a>
                                            </div>
                                            <div class="variation">
                                                <a class="product-size-variation-btn" data-toggle="tooltip"
                                                   data-placement="top" title="L">
                                                    <span class="product-size-variation-label">L</span>
                                                </a>
                                            </div>
                                            <div class="variation">
                                                <a class="product-size-variation-btn" data-toggle="tooltip"
                                                   data-placement="top" title="XL">
                                                    <span class="product-size-variation-label">XL</span>
                                                </a>
                                            </div>
                                        </div>
                                    </div>
                                    <a href="" class="reset_variations">Clear</a>
                                </form>
                                <div class="product-action d-flex flex-sm-row align-items-sm-center flex-column align-items-start mb--30">
                                    <div class="quantity-wrapper d-flex align-items-center mr--30 mr-xs--0 mb-xs--30">
                                        <label class="quantity-label" for="qty">Quantity:</label>
                                        <div class="quantity">
                                            <input type="number" class="quantity-input" name="qty" id="qty" value="1"
                                                   min="1">
                                        </div>
                                    </div>
                                    <button type="button" class="btn btn-shape-square btn-size-sm"
                                            onclick="window.location.href='cart.html'">
                                        加入购物车
                                    </button>
                                </div>
                                <div class="product-footer-meta">
                                    <p><span>Category:</span>
                                        <a href="shop.html">Full Sweater</a>,
                                        <a href="shop.html">SweatShirt</a>,
                                        <a href="shop.html">Jacket</a>,
                                        <a href="shop.html">Blazer</a>
                                    </p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div class="global-overlay"></div>
    <a class="scroll-to-top" href=""><i class="fa fa-angle-double-up"></i></a>
</div>


</body>
</html>
