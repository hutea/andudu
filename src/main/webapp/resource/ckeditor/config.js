/**
 * @license Copyright (c) 2003-2015, CKSource - Frederico Knabben. All rights reserved.
 * For licensing, see LICENSE.md or http://ckeditor.com/license
 */

CKEDITOR.editorConfig = function( config ) {
	// Define changes to default configuration here. For example:
	// config.language = 'fr';
	// config.uiColor = '#AADC6E';
	//config.toolbarLocation = 'bottom';//可选：bottom
	config.removePlugins = 'elementspath';//
	config.allowedContent=true;
	config.pasteFromWordRemoveFontStyles = false;
	config.pasteFromWordRemoveStyles = false;
    config.toolbar = 'Mytool';//config.toolbar = 'Basic';
    config.filebrowserImageUploadUrl = '/uploader/upload.php?type=Images';
    config.extraPlugins = 'himage'; //自定义插件，多个用逗号分隔
    config.toolbar_Mytool = [
	['Bold','Italic','Underline','Strike'],
	['JustifyLeft','JustifyCenter','JustifyRight','JustifyBlock'],
	['Font','FontSize'],
	['TextColor','BGColor','Image','himage']
	 ]
};
