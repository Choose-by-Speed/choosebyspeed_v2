<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
	<style type="text/css">

body, html {
    width: 100%;
    height: 100%;
    margin: 0;
    font-family: "微软雅黑";
}
#allmap {
    width: 100%;
    height: 80%;
}
p {
    margin-left: 5px;
    font-size: 14px;
}
</style>
    <link href="dropDownMenu.css" rel="stylesheet" type="text/css">

	<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=mQEILeHsxAjySv7ZMt7XQUFe"></script>
	<title>Choose By Speed</title>
</head>
<body>
	<header>

		<div id="logo">
			<img src="/choosebyspeed/resources/images/logo.jpg" />
		</div>

		<div id="intro">Choose everything you want by speed from today!
		</div>

	</header>
 	<nav>
		<ul>
			<li><a href="#" title="Speed Map">Map</a></li>
                /
			<li><a href="#" title="Order List">Order List</a></li>
		</ul>
	</nav>
    
    <div>
        <nav id="primary_nav_wrap">
        <ul>
          <li><a href="#" class="catFitlerBtn" data-cat-id="-1">Filter Categories</a>
            <ul>
            	<c:forEach items="${categorys}" var="cat">
		              <li>
		              	<a class="dir catFitlerBtn" data-cat-id="<c:out value="${cat.id}"/>" href="#"><c:out value="${cat.name}${cat.id}"/></a>
		              	<ul></ul>
		              </li>
				</c:forEach>
              
<!--               <li><a class="dir catFitlerBtn" data-cat-id="2" href="#">category 2 THIS IS SO LONG IT MIGHT CAUSE AN ISSEUE BUT MAYBE NOT?</a> -->
<!--                 <ul> -->
<!--                   <li><a class="catFitlerBtn" data-cat-id="30" href="#">sub cat 3</a></li> -->
<!--                   <li><a class="catFitlerBtn" data-cat-id="40" href="#">sub cat 4</a></li> -->
<!--                   <li><a class="catFitlerBtn" data-cat-id="50" href="#">sub cat 5</a></li> -->
<!--                 </ul> -->
<!--               </li> -->
            </ul>
          </li>
<!--           <li><a href="#">Orders</a></li> -->
        </ul>
        </nav>
    </div>
	<div id="allmap"></div>


	<script src="ProviderOverlay.js" type="text/javascript"></script>
	<script src="mapUtils.js" type="text/javascript"></script>
	<script src="Ajax.js" type="text/javascript"></script>
    <script src="mapMain.js" type="text/javascript"></script>
    <script src="filterMap.js" type="text/javascript"></script>
</body>
</html>
