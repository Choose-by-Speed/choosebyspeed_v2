function ProviderOverlay(provider, text, color) {
    this._point = provider.point;
    this._text = text;
    this._overText = "to remove";
    this._color = color;
    this._providerDetURL = "/choosebyspeed/providerdetail?id="+provider.id;

}
ProviderOverlay.prototype = new BMap.Overlay();
ProviderOverlay.prototype.initialize = function(pMap) {
    this._map = pMap;
    var div = this._div = document.createElement("div");
    div.style.position = "absolute";
    div.style.zIndex = BMap.Overlay.getZIndex(this._point.lat);
    div.style.backgroundColor = this._color || "#EE5D5B";
    div.style.border = "1px solid rgb(188, 58, 57)";
    div.style.borderRadius = "3px";
    div.style.color = "black";
    div.style.height = "18px";
    div.style.padding = "2px";
    div.style.lineHeight = "18px";
    div.style.whiteSpace = "nowrap";
    div.style.MozUserSelect = "none";
    div.style.fontSize = "12px"
    var span = this._span = document.createElement("span");
    div.appendChild(span);
    span.appendChild(document.createTextNode(this._text));
    var that = this;

    var arrow = this._arrow = document.createElement("div");
    arrow.style.background = "url(http://map.baidu.com/fwmap/upload/r/map/fwmap/static/house/images/label.png) no-repeat";
    arrow.style.position = "absolute";
    arrow.style.width = "11px";
    arrow.style.height = "10px";
    arrow.style.top = "22px";
    arrow.style.left = "10px";
    arrow.style.overflow = "hidden";
    div.appendChild(arrow);

    div.onclick = span.onclick = function(e) {
        window.location.href = that._providerDetURL;
    }

    map.getPanes().labelPane.appendChild(div);

    return div;
}
ProviderOverlay.prototype.draw = function() {
    var pMap = this._map;
    var pixel = pMap.pointToOverlayPixel(this._point);
    this._div.style.left = pixel.x - parseInt(this._arrow.style.left) + "px";
    this._div.style.top = pixel.y - 30 + "px";
}