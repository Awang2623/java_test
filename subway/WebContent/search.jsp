<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>查询</title>
</head>
<script type="text/javascript">
         function check(form) {
               if(form.start.value==''){
                    alert("请输入起始站!");
                    form.start.focus();
                    return false;
                 }
               if(form.end.value==''){
                   alert("重新输入终点站!");
                   form.end.focus();
                   return false;
                }
             
                 return true;
         }
</script>
<body>
<form action="search01" method="post">
<center>
<table>
    <tr><td>起始站:</td> <td> <input type=text name="start" size="18" value="" ></td></tr>
    <tr><td>终点站:</td> <td><input type=text name="end" size="18" value="" ></td></tr>
    </table>
      <input type=submit name="submit1" value="查询" onclick="return check(this.form)">   
</center>
</form>
</body>
</html>