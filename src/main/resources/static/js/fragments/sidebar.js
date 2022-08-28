(function($) {
    initData();

    function initData(){
        $.ajax({
            url: "/init/menu", // 클라이언트가 HTTP 요청을 보낼 서버의 URL 주소
            data: {authId : "MEMBER"},  // HTTP 요청과 함께 서버로 보낼 데이터
            method: "GET",   // HTTP 요청 메소드(GET, POST 등)
            dataType: "json" // 서버에서 보내줄 데이터의 타입
        })
            .done(function(result) {
                console.log(JSON.stringify(result));
                drawMenu(result);
            })
            .fail(function(xhr, status, errorThrown) {

            })
    }

    function drawMenu(menuData){
       $('#sidebar-list').empty();
       let html = "";
        for(let obj of menuData) {
            html += `<li class="nav-item">`;
            if(parseInt(obj.depth) == 1) {
                html +=     `<a class="nav-link collapsed" href="${obj.menuUrl}" data-target="#collapse${obj.menuId}">`;
                html +=         `<span>${obj.menuName}</span>`;
                html +=     `</a>`;
            } else if (parseInt(obj.depth) == 2) {
                gvCategoryList[gvCategoryList.length] = obj;
            }
            html += `</li>`;
        }
        $('#sidebar-list').html(html);
    }
})(jQuery); // End of use strict
