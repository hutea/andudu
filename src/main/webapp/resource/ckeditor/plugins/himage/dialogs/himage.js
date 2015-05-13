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
			            	html: 'test',
			            },
						{
						    type: 'file',
						    id: 'upload',
						    title:'上传图片',
						    label: 'Select file from your computer',
						    size: 38
						},
						{
						    type: 'fileButton',
						    id: 'fileId',
						    label: '上传',
						    'for': [ 'tab1', 'upload' ],
						    filebrowser: {
						        onSelect: function( fileUrl, data ) {
						            alert( 'Successfully uploaded: ' + fileUrl );
						        }
						    }
						}
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