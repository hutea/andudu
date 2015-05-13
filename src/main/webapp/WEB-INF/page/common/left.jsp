<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/page/common/taglib.jsp" %>
<div class="leftpanel">
                    <div class="media profile-left">
                        <a class="pull-left profile-thumb" href='<s:url action="myProfile" namespace="/manage/account" />' >
                            <img class="img-circle" src="${pageContext.request.contextPath}/resource/chain/images/photos/profile.png" alt="">
                        </a>
                        <div class="media-body">
                            <h4 class="media-heading">${loginAccount.nickname}</h4>
                            <small class="text-muted" style="font-size: 12px;"><fmt:formatDate value="${loginAccount.lastSigninTime}" pattern="HH:mm:ss dd/MM/yyyy"/></small>
                        </div>
                    </div><!-- media -->
                    
                    <h3 class="leftpanel-title">Navigation</h3>
                    <ul class="nav nav-pills nav-stacked">
                        <li <c:if test="${m==null}">class="active"</c:if> >
                        	<a href=''>    	<i class="fa fa-home"></i> <span>首页</span></a>
                        </li>
                        <li <c:if test="${param.m==1||m==1}">class="active"</c:if>  >
                        	<a href=''> <i class="fa fa-user"></i> <span>用户管理</span></a>
                        </li>
                        <li <c:if test="${param.m==1||m==1}">class="active"</c:if>  >
                        	<a href=''> <i class="fa fa-align-justify"></i> <span>订单管理</span></a>
                        </li>

                        <li <c:if test="${param.m==1||m==1}">class="active parent"</c:if>  class="parent hide" ><a href=""><i class="fa fa-bars"></i> <span>订单管理</span></a>
                            <ul class="children">
  								<li><a href=''>订单</a></li> 
  								<li><a href=''>已入库订单</a></li> 
  								<li><a href=''>待审核订单</a></li> 
  								<li><a href=''>待支付订单</a></li> 
  								<li><a href=''>待派工订单</a></li> 
  								<li><a href=''>待验收订单</a></li> 
  								<li><a href=''>已完结订单</a></li> 
                            </ul>
                        </li>
                        
                        
                         <li <c:if test="${param.m==1||m==1}">class="active"</c:if>  >
                        	<a href=''> <i class="fa fa-user-md"></i><span>监理人员管理</span></a>
                        </li>
                        
                        <li <c:if test="${param.m==4||m==4}">class="active parent"</c:if> class="parent"><a href=""><i class="fa fa-edit"></i> <span>系统管理</span></a>
                            <ul class="children">
  								<li><a href=''></a></li> 
  								<li><a href=''>轮播图片管理</a></li> 
  								<li><a href=''>新闻管理</a></li> 
                            </ul>
                        </li>
                        
                        <li <c:if test="${param.m==5||m==5}">class="active parent"</c:if> class="parent"><a href=""><i class="fa fa-cog"></i> <span>系统设置</span></a>
                            <ul class="children">
                            </ul>
                        </li>
                    </ul>
                    
</div><!-- leftpanel -->