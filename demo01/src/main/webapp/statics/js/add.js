$(document).ready(function () {

    $.post("/doAdd2",function(result){
        console.log(result.data);
        $.each(result.data,function (i,v) {
            var $option = $("<option value='"+v.id+"'>"+v.name+"</option>");
            $(".banji").append($option);
        })
    },"json");

});