


function jsonToPointsOld(json) {
    var ptsDto = JSON.parse(json);
    var points = [];
    ptsDto.forEach(function(rawObj){
        var point = new BMap.Point(rawObj.lng, rawObj.lat); 
        points.push(point);
    });
    return points;
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


function pointsToIcons(pts) {
        
    pts.forEach(function(pt) {
        var txt = "Extra content:", 
        mouseoverTxt = txt + " " + parseInt(Math.random() * 1000,10);
        var myCompOverlay = new ComplexCustomOverlay(pt, "Provider info", mouseoverTxt);

        map.addOverlay(myCompOverlay);
//         map.panTo(pt);

    });

};


