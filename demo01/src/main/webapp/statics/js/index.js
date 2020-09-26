$(document).ready(function () {
    chaxun()

   $(".chax").click(function () {
       chaxun()
   });
});

function chaxun() {
    $.post("/doIndex",function(result){
        console.log(result.data);
        $.each(result.data,function (i,v) {
            var $tr = $("<tr class='aaa'><td>"+v.id+"</td><td>"+v.name+"</td><td>"+v.age+"</td><td>"+v.gender+"</td><td>"+v.telephone+"</td><td>"+v.email+"</td><td>"+v.className+"</td></tr>");
            $(".tab_cha").append($tr);
        })
    },"json");
}

