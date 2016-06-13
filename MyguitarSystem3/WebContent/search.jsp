<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>MyguitarSystem</title>
    <link rel="stylesheet" type="text/css" href="css/common.css"/>
    <link rel="stylesheet" type="text/css" href="css/main1.css"/>
    <script type="text/javascript" src="js/modernizr.min.js"></script>
	<script type="text/javascript" src="js/jquery-1.6.min.js"></script>
</head>


<body>
<div class="topbar-wrap white">
    <div class="topbar-inner clearfix">
        <div class="topbar-logo-wrap clearfix">
            <h1 class="topbar-logo none"><a href="index.html" class="navbar-brand">后台管理</a></h1>
            <ul class="navbar-list clearfix">
                <li><a class="on" href="search.jsp">MyGuitar查询系统</a></li>
                <li><a class="on" href="Addguitar.jsp">添加数据</a></li>
                <li><a class="on" href="Delguitar.jsp">删除数据</a></li>                
            </ul>
        </div>
        <div class="top-info-wrap">
            <ul class="top-info-list clearfix">
             
            </ul>
        </div>
    </div>
</div>
<div class="container clearfix">
    <div class="main-wrap">      
       <div class="result-wrap">
                <div class="result-title">
                    <div class="result-list">
                    	<form action="SearchGuitar" method="post">
							请输入型号查询：<input type="text" name="type">&nbsp;&nbsp;
							<input type="submit" value="查询">
						</form> 
					              
                    </div>
                </div>
        <div class="result-content">
               
                    <table class="result-tab" width="100%">
                        <tr align="center">
				            <td width="50">编号</td> 
				            <td width="50">价格</td>
				            <td width="70">生产商</td>
				            <td width="50">型号</td>
				            <td width="70">背板材料</td> 
				            <td width="70">前板材料</td>
                        </tr>
                                            
                       <c:forEach var="guitar" items="${requestScope.list}">
                                <tr align="center">
                                <td>${guitar.serialNumber}</td>
                                <td>${guitar.price}</td>
                                <td>${guitar.builder}</td>
                                <td>${guitar.type}</td>
                                <td>${guitar.backWood}</td> 
                                <td>${guitar.topWood}</td> 
                                </tr>
                          </c:forEach>
                    </table>                    
                </div>
</div>
</div>
</div>
</body>
</html>
