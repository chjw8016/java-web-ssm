<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link href="resources/css/main.css" rel="stylesheet"/>
    <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.js"></script>
    <script type="text/javascript">
        function postRequest() {
            $("#result").append("-----------------------------------------------");
            $.post("hello/post_ajax.do", {
                name: getRandomName(),
                age: Math.floor((Math.random() * 10) + 20)
            }, function (res) {
                var p = "<p>Name：" + res.name + "，Age：" + res.age + "</p>";
                $("#result").append(p);
            }, "json");

        }

        function getRequest() {
            $("#result").append("-----------------------------------------------");
            $.get("hello/get_ajax.do", {id: 1}, function (data) {
                data.forEach(function (val, index) {
                    var p = "<p>Name：" + val.name + "，Age：" + val.age + "，Role：" + val.role.name + "</p>";
                    $("#result").append(p);
                })
            }, "json");
        }

        function transfer() {
            $("#result").append("-----------------------------------------------");
            $.get("hello/transfer.do", null, function (res) {
                console.log(res);
                var p = "<p>" + res.message + "</p>";
                $("#result").append(p);
            }, "json");
        }

    </script>
</head>
<body>
<a href="say/hello.do">打开页面</a>
<a href="javascript: postRequest();">新装用户</a>
<a href="javascript: getRequest();">获取用户</a>
<a href="javascript: transfer();">事务转账</a>
<h2>结果：</h2>
<div id="result" style="color: white;background: black; height: 400px; width: 400px; overflow: auto">

</div>
</body>
</html>
