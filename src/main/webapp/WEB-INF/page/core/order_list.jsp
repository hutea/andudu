<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!DOCTYPE html>
<html lang="zh-CN">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
        <meta name="description" content="">
        
        <meta name="author" content="">
        <title>安嘟嘟后台管理 首页</title>
        <link href="${pageContext.request.contextPath}/resource/css/common.css" rel="stylesheet" />
        <link href="${pageContext.request.contextPath}/resource/chain/css/style.default.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/resource/chain/css/morris.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/resource/chain/css/select2.css" rel="stylesheet" />
		<script type="text/javascript" src="${pageContext.request.contextPath}/resource/js/myform.js"></script>
		<script src="${pageContext.request.contextPath}/resource/art/artDialog.js?skin=blue"></script>
        <script src="${pageContext.request.contextPath}/resource/art/plugins/iframeTools.js"></script>
        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
        <script src="${pageContext.request.contextPath}/resource/chain/js/html5shiv.js"></script>
        <script src="${pageContext.request.contextPath}/resource/chain/js/respond.min.js"></script>
        <![endif]-->
        <script type="text/javascript">
    	function show(tid,uid) {
	   	   	 var url ="${pageContext.request.contextPath}/manage/task/task_show.action";
	   		 art.dialog.open(url,{width:400 ,height: 500 , title: '区块笔迹',id:'task_'+tid});
   	 	}
        </script>
    </head>

    <body>
        <header>    
        <%@ include file="/WEB-INF/page/common/head.jsp" %>
        </header>
        
        <section>
            <div class="mainwrapper">
        	<%@ include file="/WEB-INF/page/common/left.jsp" %>
                
                <div class="mainpanel">
                    <div class="pageheader">
                        <div class="media">
                            <div class="pageicon pull-left">
                                <i class="fa  fa-list-alt"></i>
                            </div>
                            <div class="media-body">
                                <ul class="breadcrumb">
                                    <li><a href=""><i class="glyphicon glyphicon-home"></i></a></li>
                                    <li>Home</li>
                                </ul>
                                <h4>订单管理</h4>
                            </div>
                        </div><!-- media -->
                    </div><!-- pageheader -->
                    
                    <div class="contentpanel">
                    	<div style="content-l">
                    		<ul id="myTab" class="nav nav-tabs">
						        <li class="active"><a href="#list" data-toggle="tab">订单管理</a></li>
						        <li><a href="#list0" data-toggle="tab">待审核订单</a></li>
						        <li><a href="#list0" data-toggle="tab">待审核订单</a></li>
						        <li><a href="#list0" data-toggle="tab">待审核订单</a></li>
						        <li><a href="#list0" data-toggle="tab">待审核订单</a></li>
						        <li><a href="#list0" data-toggle="tab">待审核订单</a></li>
						        <li><a href="#list0" data-toggle="tab">待审核订单</a></li>
						    </ul>
						    <div id="myTabContent" class="tab-content">
						        <div id="list" class="tab-pane fade in active">
						            <p>home</p>
						        </div>
						        <div id="list0" class="tab-pane fade">
						        </div>
						    </div>
                    	</div>
                    </div><!-- contentpanel -->
                    <div class="bottomwrapper" >
						<%@ include file="/WEB-INF/page/common/bottom.jsp" %>
                    </div>
                </div><!-- mainpanel -->
            </div><!-- mainwrapper -->
        </section>

        <script src="${pageContext.request.contextPath}/resource/chain/js/jquery-1.11.1.min.js"></script>
        <script src="${pageContext.request.contextPath}/resource/chain/js/jquery-migrate-1.2.1.min.js"></script>
        <script src="${pageContext.request.contextPath}/resource/chain/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/resource/chain/js/modernizr.min.js"></script>
        <script src="${pageContext.request.contextPath}/resource/chain/js/pace.min.js"></script>
        <script src="${pageContext.request.contextPath}/resource/chain/js/retina.min.js"></script>
        <script src="${pageContext.request.contextPath}/resource/chain/js/jquery.cookies.js"></script>
        
        <script src="${pageContext.request.contextPath}/resource/chain/js/jquery.sparkline.min.js"></script>
        <script src="${pageContext.request.contextPath}/resource/chain/js/morris.min.js"></script>
        <script src="${pageContext.request.contextPath}/resource/chain/js/raphael-2.1.0.min.js"></script>
        <script src="${pageContext.request.contextPath}/resource/chain/js/bootstrap-wizard.min.js"></script>
        <script src="${pageContext.request.contextPath}/resource/chain/js/select2.min.js"></script>

        <script src="${pageContext.request.contextPath}/resource/chain/js/custom.js"></script>
        <script type="text/javascript">
	        $('a[data-toggle="tab"]').on('show.bs.tab', function (e) {
		        if(e.target.hash.search('#list0')>=0){
				    $("#list0").empty();
					//alert("list0");
					$.get("${pageContext.request.contextPath}/manage/order/list/store", 
					  {id:1},
					  function(data) {
				      	$("#list0").append(data);
					 });
					
				}
	        })
        </script>
    </body>
    
</html>
