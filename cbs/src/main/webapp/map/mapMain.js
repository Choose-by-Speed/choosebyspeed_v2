
var map = new BMap.Map("allmap");
map.centerAndZoom(new BMap.Point(114.159, 22.2845), 15);
map.enableScrollWheelZoom();

var provJson = document.querySelector("#providersJson").innerHTML;
var genPoints = jsonToPoints(provJson);


ajax.get('http://localhost:8080/choosebyspeed/providers', {foo: 'bar'}, function(responseText) {
    
    var genPoints = jsonToPoints(responseText);

    pointsToIcons(genPoints);

}, true);







