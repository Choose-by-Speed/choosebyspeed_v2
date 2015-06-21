(function(){
    
    function assignListeners() {
        var catFitlerBtns = document.querySelectorAll(".catFitlerBtn");
        [].forEach.call(catFitlerBtns, function(el) {
            el.addEventListener('click', catFitlerBtnAction)
        });
    }
    assignListeners();

    function catFitlerBtnAction(e){
        
        var categoryId = e.target.getAttribute('data-cat-id');

        ajax.get('/choosebyspeed/providers/query', {'categoryId': categoryId}, function(responseText) {
    
            var providers = jsonToProviders(responseText);
            
            map.clearOverlays();
            providersToIcons(providers);

        }, true);


         ajax.get('/choosebyspeed/categorys/query', {'id': categoryId}, function(responseText) {
            
            var categorys = JSON.parse(responseText);
            var subUl = e.target.parentElement.getElementsByTagName('ul')[0];
            var lvl2CatLi = '';

            [].forEach.call(categorys, function(cat, i) {
            
                lvl2CatLi += '<li><a class="catFitlerBtn" data-cat-id="'+categorys[i].id+'" href="#">'+categorys[i].name+'</a></li>';
                
            });
            
            if(lvl2CatLi) subUl.innerHTML = lvl2CatLi;
            assignListeners();
        }, true);

        

    };

        

})();