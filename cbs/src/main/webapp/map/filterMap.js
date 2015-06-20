(function(){
    
    
    var catFitlerBtns = document.querySelectorAll(".catFitlerBtn");
    [].forEach.call(catFitlerBtns, function(el) {
        
        el.addEventListener('click', catFitlerBtnAction)

    });


    function catFitlerBtnAction(e){
        
        var categoryId = e.target.getAttribute('data-cat-id');

        ajax.get('http://localhost:8080/choosebyspeed/providers/query', {'categoryId': categoryId}, function(responseText) {
    
            var providers = jsonToPoints(responseText);
            
            map.clearOverlays();
            pointsToIcons(providers);

        }, true);

    }

})();