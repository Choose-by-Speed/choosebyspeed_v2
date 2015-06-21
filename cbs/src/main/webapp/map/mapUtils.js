


function jsonToPointsOld(json) {
    var ptsDto = JSON.parse(json);
    var points = [];
    ptsDto.forEach(function(rawObj){
        var point = new BMap.Point(rawObj.lng, rawObj.lat); 
        points.push(point);
    });
    return points;
}    


function jsonToProviders(json) {
    
    var provDtos = JSON.parse(json);
    var providers = [];
    provDtos.forEach(function(provDto){
        var provider = {
            id:provDto['id'],
            point: new BMap.Point(provDto['locationLong'], provDto['locationLat']),
            name: provDto['name'],
            averageDeliveryRating: provDto['averageDeliveryRating']
        };
        providers.push(provider);
    });
    return providers; 
}

function jsonToPoints(json) {

    var ptsDto = JSON.parse(json);
    var points = [];
    ptsDto.forEach(function(rawObj){
        var point = new BMap.Point(rawObj["locationLong"], rawObj["locationLat"]); 
        points.push(point);
    });
    return points; 

}


function pointsToMap(pts) {

    pts.forEach(function(val) {
//         var val2 = new BMap.Point(116.404, 39.915);
//         map.centerAndZoom(point, 15);
//         var marker = new BMap.Marker(val);  // 创建标注
//         map.addOverlay(marker); 
        setMarker(val);
    });
//     setMarker(pts[0]);
    
}

function setMarker(new_point) {
	// map.clearOverlays();
	var marker = new BMap.Marker(new_point); 
	map.addOverlay(marker);  
	map.panTo(new_point);
}


function providersToIcons(providers) {
        
    providers.forEach(function(provider) {

        var name = provider.name, 
            color = "rgb("+provider.averageDeliveryRating+", 250, 0)";
           color= "rgb("+250+", 250, 0)";
        var myCompOverlay = new ProviderOverlay(provider, name, color);

        map.addOverlay(myCompOverlay);
//         map.panTo(pt);

    });

};


