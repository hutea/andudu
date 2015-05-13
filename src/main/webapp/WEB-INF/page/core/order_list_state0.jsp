<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/page/common/taglib.jsp" %>
<table class="table table-primary table-bordered">
<thread>
<tr class="info">
      <th>#</th>
      <th>监理公司</th>
      <th>监理人员</th>
      <th>项目启动时间</th>
      <th>项目结束时间</th>
      <th>订单状态</th>
      <th>操作</th>
</tr>
</thread>
<tbody>
<tr class="">
      <td>1${m}</td>
      <td>成都监理</td>
      <td>张三</td>
      <td>2015-02-13</td>
      <td>2015-08-13</td>
      <td>已付款</td>
      <td>查看</td>
</tr>
<c:forEach items="${pageView.records}" var="entry" varStatus="s">  
	<tr>
  		 <td>${s.index+1}</td> 
  		 <td>${entry.taskId} 
  		 	<c:if test="${entry.recycleType==1}"><span style="color:red;">超时回收</span></c:if>
  		 </td> 
  		 <a href=''>详细</a>
  		 <a href=''>进度日志</a>
  		 </td> 
	</tr>
</c:forEach>
</tbody>
</table>
<div class="fenye"><%@ include file="/WEB-INF/page/common/fenye.jsp" %></div>



