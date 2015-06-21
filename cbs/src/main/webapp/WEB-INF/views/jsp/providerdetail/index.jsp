
<%@ page contentType="text/html;charset=utf-8" language="java"
	import="java.io.*" errorPage=""%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">

<head>
<title>Choose By Speed</title>
<meta charset="utf-8">
<link href="/choosebyspeed/resources/styles/providerDetailsPage.css"
	rel="stylesheet" type="text/css">
<link href='http://fonts.googleapis.com/css?family=Lemon'
	rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Hammersmith+One'
	rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Varela+Round'
	rel='stylesheet' type='text/css'>
<link rel="shortcut icon" href="favicon.ico" type="image/x-icon" />
</head>

<header>

		<div id="logo">
			<img src="/choosebyspeed/resources/images/logo.jpg" />
		</div>

		<div id="intro">Choose everything you want by speed from today!
		</div>

	</header>

	<nav>
		<ul>
			<li><a href="/choosebyspeed/map/map" title="Speed Map">Map</a></li>
			<!--
                -->
			<li><a href="#" title="Provider Detail">Provider</a></li>
			<!--
                -->
<!-- 			<li><a href="#" title="Price details">whatever</a></li> -->
<!-- 			<!-- -->
<!--                 --> 
<!-- 			<li><a href="#" title="website details">whatever</a></li> -->
<!-- 			<!-- -->
<!--                 --> 
<!-- 			<li><a href="#" title="Job opportunities">whatever</a></li> -->
<!-- 			<!-- -->
<!--                 -->
		</ul>
	</nav>




	<div id="center">

		<content>
		<div id="item_image">

			<img src="/choosebyspeed/resources/images/pizza01.jpg" />

			<div id="item_intro">
				<!--  -->
				<h2>Pizza Hut</h2>
				<div id="item_detail">We specialize in pizzas you never have
					to settle for; from our classic Lover’s Line and Supreme recipes to
					our new Flavor of Now recipes.</div>
			</div>

		</div>

		<div id="order_now">
		<div id="promotion">		
				<p>Promotion: From June 20 to June 27,2015  </p>
				<p>Free upsize!</p>
		</div>	
			<div id="book">

				<input id="submit" type="submit" name="submit" value="Order now!"
					src="/deliverydetail" onclick=window.open("/choosebyspeed/deliverydetail")>

			</div>
		</div>
		</content>
		<!----
                
                
                
                
                
                
                ---------->



		<div class="col-sm-6">
			<div class="block-page menu">
				<h2>${allItemsList}</h2>

				<span>${itemsType}</span>
				<p></p>
				<ul>
					<div class="price">Price</div>
					<li>
						<div class="item-info-container">
							<p>
								<b>102.</b> Roasted Eel Pizza
							</p>
							<strong>Eel, pineapple, mozzarella, corn and seaweed.</strong>
						</div>
						<div class="strock">

							<div class="block">
								<span>9"</span> <i>52.00</i> <b>RMB</b>
							</div>
							<div class="block">
								<span>12"</span> <i>78.00</i> <b>RMB</b>
							</div>
							<div class="block">
								<span>16"</span> <i>118.00</i> <b>RMB</b>
							</div>
						</div>
					</li>
					<li>
						<div class="item-info-container">
							<p>
								<b>103.</b> Truffles
							</p>
							<strong>Marinated wild mushroom, black truffles, cherry
								tomato and fresh basil.</strong>
						</div>
						<div class="strock">

							<div class="block">
								<span>9"</span> <i>62.00</i> <b>RMB</b>
							</div>
							<div class="block">
								<span>12"</span> <i>88.00</i> <b>RMB</b>
							</div>
							<div class="block">
								<span>16"</span> <i>128.00</i> <b>RMB</b>
							</div>
						</div>
					</li>
					<li>
						<div class="item-info-container">
							<p>
								<b>104.</b> Bavaria Trotter Pizza
							</p>
							<strong>Roasted pork trotter, dried figs, crispy coconut
								and mozzarella cheese.</strong>
						</div>
						<div class="strock">

							<div class="block">
								<span>9"</span> <i>52.00</i> <b>RMB</b>
							</div>
							<div class="block">
								<span>12"</span> <i>78.00</i> <b>RMB</b>
							</div>
							<div class="block">
								<span>16"</span> <i>118.00</i> <b>RMB</b>
							</div>
						</div>
					</li>
					<li>
						<div class="item-info-container">
							<p>
								<b>105.</b> Mexican
							</p>
							<strong>Chili con carne, red bean, mozzarella, jalapeno,
								home-made tomato-jalapeno salsa, sour cream and guacamole.</strong>
						</div>
						<div class="strock">

							<div class="block">
								<span>9"</span> <i>52.00</i> <b>RMB</b>
							</div>
							<div class="block">
								<span>12"</span> <i>78.00</i> <b>RMB</b>
							</div>
							<div class="block">
								<span>16"</span> <i>118.00</i> <b>RMB</b>
							</div>
						</div>
					</li>
					<li>
						<div class="item-info-container">
							<p>
								<b>106.</b> Mango & Chicken Pizza
							</p>
							<strong>Roasted Chicken, mango and cheese</strong>
						</div>
						<div class="strock">

							<div class="block">
								<span>9"</span> <i>52.00</i> <b>RMB</b>
							</div>
							<div class="block">
								<span>12"</span> <i>78.00</i> <b>RMB</b>
							</div>
							<div class="block">
								<span>16"</span> <i>118.00</i> <b>RMB</b>
							</div>
						</div>
					</li>
					<li>
						<div class="item-info-container">
							<p>
								<b>107.</b> Prosciutto Di Parma
							</p>
							<strong>Prosciutto, onion, parmesan, extra virgin olive
								oil and fresh basil.</strong>
						</div>
						<div class="strock">

							<div class="block">
								<span>9"</span> <i>62.00</i> <b>RMB</b>
							</div>
							<div class="block">
								<span>12"</span> <i>88.00</i> <b>RMB</b>
							</div>
							<div class="block">
								<span>16"</span> <i>128.00</i> <b>RMB</b>
							</div>
						</div>
					</li>
					<li>
						<div class="item-info-container">
							<p>
								<b>108.</b> Quattro Sausage
							</p>
							<strong>Thueringen sausage, salami, ham, spicy sausage
								and jalapeno.</strong>
						</div>
						<div class="strock">

							<div class="block">
								<span>9"</span> <i>48.00</i> <b>RMB</b>
							</div>
							<div class="block">
								<span>12"</span> <i>68.00</i> <b>RMB</b>
							</div>
							<div class="block">
								<span>16"</span> <i>108.00</i> <b>RMB</b>
							</div>
						</div>
					</li>
					<li>
						<div class="item-info-container">
							<p>
								<b>109.</b> Pepperoni Lover
							</p>
							<strong>Salami and extra mozzarella cheese</strong>
						</div>
						<div class="strock">

							<div class="block">
								<span>9"</span> <i>48.00</i> <b>RMB</b>
							</div>
							<div class="block">
								<span>12"</span> <i>68.00</i> <b>RMB</b>
							</div>
							<div class="block">
								<span>16"</span> <i>108.00</i> <b>RMB</b>
							</div>
						</div>
					</li>
					<li>
						<div class="item-info-container">
							<p>
								<b>110.</b> Hawaii
							</p>
							<strong>Ham, pineapple and extra mozzarella cheese </strong>
						</div>
						<div class="strock">

							<div class="block">
								<span>9"</span> <i>48.00</i> <b>RMB</b>
							</div>
							<div class="block">
								<span>12"</span> <i>68.00</i> <b>RMB</b>
							</div>
							<div class="block">
								<span>16"</span> <i>108.00</i> <b>RMB</b>
							</div>
						</div>
					</li>
					<li>
						<div class="item-info-container">
							<p>
								<b>111.</b> Golden Pillow Durian Fruit Pizza
							</p>
							<strong></strong>
						</div>
						<div class="strock">

							<div class="block">
								<span>9"</span> <i>68.00</i> <b>RMB</b>
							</div>
							<div class="block">
								<span>12"</span> <i>98.00</i> <b>RMB</b>
							</div>
							<div class="block">
								<span>16"</span> <i>138.00</i> <b>RMB</b>
							</div>
						</div>
					</li>
					<li>
						<div class="item-info-container">
							<p>
								<b>112.</b> Sultan Durian Fruit Pizza
							</p>
							<strong></strong>
						</div>
						<div class="strock">

							<div class="block">
								<span>9"</span> <i>98.00</i> <b>RMB</b>
							</div>
							<div class="block">
								<span>12"</span> <i>148.00</i> <b>RMB</b>
							</div>
							<div class="block">
								<span>16"</span> <i>238.00</i> <b>RMB</b>
							</div>
						</div>
					</li>
					<li>
						<div class="item-info-container">
							<p>
								<b>113.</b> Musang King Durian Fruit Pizza
							</p>
							<strong></strong>
						</div>
						<div class="strock">

							<div class="block">
								<span>9"</span> <i>188.00</i> <b>RMB</b>
							</div>
							<div class="block">
								<span>12"</span> <i>288.00</i> <b>RMB</b>
							</div>
							<div class="block">
								<span>16"</span> <i>388.00</i> <b>RMB</b>
							</div>
						</div>
					</li>
				</ul>
				<span class="seperator"></span>

				<!--                     <span>Sides, Desserts & Drinks</span> -->
				<!--                     <p></p> -->
				<!--                     <ul> -->
				<!--                     	<div class="price">Price</div> -->
				<!--                     	                                                <li> -->
				<!--                         	<div class="item-info-container"> -->
				<!--                                 <p><b>201.</b> Orleans Chicken Wings</p> -->
				<!--                                 <strong></strong> -->
				<!--                             </div> -->
				<!--                             <div class="strock"> -->
				<!-- 								                                    <div class="block"> -->
				<!--                                         <span></span> -->
				<!--                                         <i>20.00</i> -->
				<!--                                         <b>RMB</b> -->
				<!--                                     </div> -->

				<!--                                 								                             </div> -->
				<!--                         </li> -->
				<!--                                                 <li> -->
				<!--                         	<div class="item-info-container"> -->
				<!--                                 <p><b>202.</b> Latin Sausage</p> -->
				<!--                                 <strong></strong> -->
				<!--                             </div> -->
				<!--                             <div class="strock"> -->
				<!-- 								                                    <div class="block"> -->
				<!--                                         <span></span> -->
				<!--                                         <i>20.00</i> -->
				<!--                                         <b>RMB</b> -->
				<!--                                     </div> -->

				<!--                                 								                             </div> -->
				<!--                         </li> -->
				<!--                                                 <li> -->
				<!--                         	<div class="item-info-container"> -->
				<!--                                 <p><b>203.</b> Mango Cheese Sticks</p> -->
				<!--                                 <strong></strong> -->
				<!--                             </div> -->
				<!--                             <div class="strock"> -->
				<!-- 								                                    <div class="block"> -->
				<!--                                         <span></span> -->
				<!--                                         <i>20.00</i> -->
				<!--                                         <b>RMB</b> -->
				<!--                                     </div> -->

				<!--                                 								                             </div> -->
				<!--                         </li> -->
				<!--                                                 <li> -->
				<!--                         	<div class="item-info-container"> -->
				<!--                                 <p><b>209.</b> Ice Lemon Coke</p> -->
				<!--                                 <strong></strong> -->
				<!--                             </div> -->
				<!--                             <div class="strock"> -->
				<!-- 								                                    <div class="block"> -->
				<!--                                         <span></span> -->
				<!--                                         <i>16.00</i> -->
				<!--                                         <b>RMB</b> -->
				<!--                                     </div> -->

				<!--                                 								                             </div> -->
				<!--                         </li> -->
				<!--                                                 <li> -->
				<!--                         	<div class="item-info-container"> -->
				<!--                                 <p><b>210.</b> Ice Lemon Sprite</p> -->
				<!--                                 <strong></strong> -->
				<!--                             </div> -->
				<!--                             <div class="strock"> -->
				<!-- 								                                    <div class="block"> -->
				<!--                                         <span></span> -->
				<!--                                         <i>16.00</i> -->
				<!--                                         <b>RMB</b> -->
				<!--                                     </div> -->

				<!--                                 								                             </div> -->
				<!--                         </li> -->
				<!--                                             </ul> -->
				<span class="seperator"></span>

				<!--------------
                
                
                
                
                
                --->






			</div>
		</div>
	</div>
</body>

<footer> </footer>