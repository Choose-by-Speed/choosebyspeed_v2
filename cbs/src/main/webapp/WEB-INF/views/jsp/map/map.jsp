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
    height: 500px;
}
p {
    margin-left: 5px;
    font-size: 14px;
}
</style>
    <link href="dropDownMenu.css" rel="stylesheet" type="text/css">

	<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=mQEILeHsxAjySv7ZMt7XQUFe">
</script>
	<title>icon&points</title>
</head>
<body>
 
    
    <div>
        <h1>Welcome all</h1>

        <nav id="primary_nav_wrap">
        <ul>
<!--           <li class="current-menu-item"><a href="#">Home</a></li> -->

          <li><a href="#">Filter Categories</a>
            <ul>
              <li><a class="dir catFitlerBtn" data-cat-id="1" href="#">category 1</a></li>
              <li><a class="dir catFitlerBtn" data-cat-id="2" href="#">category 2 THIS IS SO LONG IT MIGHT CAUSE AN ISSEUE BUT MAYBE NOT?</a>
                <ul>
                  <li><a class="catFitlerBtn" data-cat-id="30" href="#">sub cat 3</a></li>
                  <li><a class="catFitlerBtn" data-cat-id="40" href="#">sub cat 4</a></li>
                  <li><a class="catFitlerBtn" data-cat-id="50" href="#">sub cat 5</a></li>
                </ul>
              </li>
              <li><a class="dir catFitlerBtn" data-cat-id="3" href="#">category 3</a></li>
              <li><a class="dir catFitlerBtn" data-cat-id="4" href="#">category 4</a></li>
              <li><a class="dir catFitlerBtn" data-cat-id="5" href="#">category 5</a></li>
            </ul>
          </li>
          <li><a href="#">Orders</a></li>
        </ul>
        </nav>
    </div>
	<div id="allmap"></div>


	<script src="ComplexCustomOverlay.js" type="text/javascript"></script>
	<script src="mapUtils.js" type="text/javascript"></script>
	<script src="Ajax.js" type="text/javascript"></script>
    <script src="mapMain.js" type="text/javascript"></script>
    <script src="filterMap.js" type="text/javascript"></script>
</body>
</html>
