<!DOCTYPE html>
<html>
<head>
    <title>My First Webpage</title>
</head>
<body>
<h1>欢迎来到我的频道</h1>
<ul>
    <#--循环渲染导航条-->
    <#list menuItems as item>
<li><a href="${item.url}">${item.name}</a></li>
    </#list>
</ul>
<footer>
    ${currentYear} 我的官网
</footer>
</body>

</html>
```