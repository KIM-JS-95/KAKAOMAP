var main = {
init : function() {
var _this = this;
$('#searchBtn').on('click', function () {
            _this.search();
        });
},

    search : function () {
        var data = {
            add1: $('#add1').val(),
            add2: $('#add2').val()
        };

        var keyword = $('#add1').val() + $('#add2').val();

        $.ajax({
            type: 'POST',
            url: '/'
            dataType: 'json',
            contentType:'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function() {
            alert(keyword);
        }).fail(function (error) {

        });
    }
};
main.init();