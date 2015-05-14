CKEDITOR.dialog.add('himageDialog',
		function(editor) {
			return {
				title : '插入图片 HImage',
				minWidth : 400,
				minHeight : 200,
				contents : [ {
					id : 'tab-image-net',
					label : '网络图片',
					elements : [ {
						 	type: 'vbox',
						 	heights: [ '20%', '80%'],
						    children: [
						        {
						        	type: 'text',
						            label: '地址',
						            labelLayout: 'horizontal',
						            widths: [20, 200]
						        },
						        {
						        	type: 'hbox',
						            widths:  [ '40%', '60%'],
						            children:[
						                       {
						                    	   type: 'vbox',
						                    	   heights: [ '30%', '30%','30%'],
												   children: [ 
												              {
												            	  	type: 'text',
												            	    label: '宽(px)',
												            	    labelLayout: 'horizontal',
												            	    widths: [100, 200]
												              },
												              {
												            	  	type: 'text',
												            	    label: '高(px)',
												            	    labelLayout: 'horizontal',
												            	    widths: [100, 200]
												              },
												              {
												            	  	type: 'text',
												            	    label: '描述',
												            	    labelLayout: 'horizontal',
												            	    widths: [100, 200]
												              }
												   ]
						                       } ,
						                       {
						                    	   type: 'html',
										           html: '<span><img style="width:300px;" src="http://i2.tietuku.com/79c749978160b131.jpg"></span>',
						                       }
						            ]
						        },
						    ]
					} ]
				}, {
					id : 'tab-image-local',
					label : '本地上传',
					elements : [ 
						{
							type: 'html',
			            	html: '<input id="himage" type="file" name="himage" onchange="ajaxupload()">',
						},
						{
							type: 'html',
			            	html: '<img id="himage-upload-image" style="width:400px;height:300px" src="http://i2.tietuku.com/79c749978160b131.jpg">',
						},
						{
							type: 'html',
							html:'',
						},
					]
				} ],
				onOk : function() {
					var dialog = this;
					var abbr = editor.document.createElement('abbr');
					abbr.setAttribute('title', dialog.getValueOf('tab-basic',
							'title'));
					abbr.setText(dialog.getValueOf('tab-basic', 'abbr'));

					var id = dialog.getValueOf('tab-adv', 'id');
					if (id)
						abbr.setAttribute('id', id);

					editor.insertElement(abbr);
				}
			};
		});


/**
	 $.ajaxFileUpload({
url: '/andudu/upload/image', //用于文件上传的服务器端请求地址
type:'post',
data:{name:"jack",age:"20"},
secureuri: false, //是否需要安全协议，一般设置为false
fileElementId: 'himage', //文件上传域的ID
dataType: 'json', //返回值类型 一般设置为json
success: function (data, status)  //服务器成功响应处理函数
{
    $("#img1").attr("src", data.url);
    if (typeof (data.error) != 'undefined') {
        if (data.error != '') {
            alert(data.error);
        } else {
            alert(data.msg);
        }
    }
},
error: function (data, status, e)//服务器响应失败处理函数
{
    alert(e);
}
});
*/