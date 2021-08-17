<%--
  Created by IntelliJ IDEA.
  User: 86136
  Date: 2021/7/7
  Time: 17:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
   <%String basePath = request.getScheme() + "://" +
           request.getServerName() + ":" +
           request.getServerPort() + request.getContextPath() + "/";
    %>
<html>
    <head>
        <title>Title</title>
        <base href="<%=basePath%>">
    </head>
<body>
<form method="post" action="vip.do" onsubmit="return submitForm()">
    用户名:<input type="text" name="name" id="name"> <span style="color:#f00a0a;" id="msg"></span> <br>
    密码:<input type="password" name="password"><br>
    性别: boy<input type="radio" name="gender" value="男">
    girl<input type="radio" name="gender" value="女"><br>
    <input type="submit" value="登入" id="login">

</form>
<script src="js/ajax.js"></script>
<script>

    document.getElementById('name').addEventListener("blur",function (){
        var url = "checkUser.do?name="+document.getElementById('name').value;
        $.get(url,function (data) {
            if (data === "1"){
               document.getElementById("msg").innerText = "用户名存在";
            } else {
                document.getElementById("msg").innerText = "可用";
            };
              a =document.getElementById("msg").innerText
        })
    })
        function submitForm(){
            if ( a === "用户名存在"){
                alert ("用户名不符合");
                return false ;

            }else {
                alert("注册成功");
                return  true
            }
        }

        // var name = document.getElementById('name').value;//不要打括号,看仔细
        // var xhr = new XMLHttpRequest();
        // debugger;
        // xhr.open("get","/myshop/checkUser.do?name="+name);
        // xhr.send();
        // xhr.onreadystatechange = function() {
        //     if (this.readyState === 4) {
        //
        //        if (this.responseText === '1') {
        //             document.getElementById("msg").innerText = "用户名存在";
        //         } else {
        //             document.getElementById("msg").innerText = "可用";
        //         }
        //
        //     }
        // }

</script>

</body>
</html>
