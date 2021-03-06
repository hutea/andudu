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
                                <h4>发布新闻</h4>
                            </div>
                        </div><!-- media -->
                    </div><!-- pageheader -->
                    
                    <div class="contentpanel">
                    	<div class="content-m" style="border: 0">
                    		<form action="/andudu/upload/image" class="form-horizontal" method="post" enctype="multipart/form-data">
				             <div class="form-group">
								    <label  class="col-sm-2 control-label">新闻标题</label>
								    <div class="col-sm-4">
								      <input type="text" class="form-control" name="trophy.name" placeholder="">
								      <span></span>
								    </div>
							</div>
				            <div class="form-group">
								    <label  class="col-sm-2 control-label">新闻标志图</label>
								    <div class="col-sm-4">
								      <input type="file" class="form-control" name="trophy.name" placeholder="选择图片">
								      <span></span>
								    </div>
							</div>
				            <div class="form-group">
								    <label  class="col-sm-2 control-label">新闻内容</label>
								    <div class="col-sm-8">
										<textarea name="editor1" id="editor1">
											http://pica.nipic.com/2007-12-23/200712231523651_2.jpg
							            </textarea>
								    </div>
								    <div class="col-sm-2"></div>
							</div>
				            <div class="form-group">
								    <div class="col-sm-5"></div>
								    <div class="col-sm-2">
										<input type="reset" class="btn btn-primary btn-md" value="重置">
										<input type="submit" class="btn btn-primary btn-md" value="提交">
								    </div>
								    <div class="col-sm-5"></div>
							</div>
                    		</form>
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
        <script src="${pageContext.request.contextPath}/resource/ckeditor/ckeditor.js"></script>
        <script src="${pageContext.request.contextPath}/resource/js/ajaxfileupload.js"></script>
        <script type="text/javascript">
        	CKEDITOR.replace( 'editor1');

        </script>
    </body>
    
</html>
