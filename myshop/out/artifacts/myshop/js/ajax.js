var $ = {
    get : function (url ,fn) {
        //不要打括号,看仔细
        var xhr = new XMLHttpRequest();

        xhr.open("get",url);
        xhr.send();
        xhr.onreadystatechange = function() {
            if (this.readyState === 4) {
                fn(this.responseText);
            }
        }
    },
    post : function (url ,data ,fn) {
        //不要打括号,看仔细
        var xhr = new XMLHttpRequest();

        xhr.open("post",url);
        xhr.send(data);
        xhr.onreadystatechange = function() {
            if (this.readyState === 4) {
                fn(this.responseText);
            }
        }
    },
}