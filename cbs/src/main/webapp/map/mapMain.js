
var map = new BMap.Map("allmap");
map.centerAndZoom(new BMap.Point(114.159, 22.2845), 15);
map.enableScrollWheelZoom();

ajax.get('http://localhost:8080/choosebyspeed/providers', {}, function(responseText) {
    
    var providers = jsonToPoints(responseText);

    pointsToIcons(providers);

}, true);









