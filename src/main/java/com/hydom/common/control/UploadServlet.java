package com.hydom.common.control;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.hydom.util.StringUtil;

@Controller
@RequestMapping("/upload")
public class UploadServlet {
	@Autowired
	private HttpServletRequest request;

	@RequestMapping(value = "/image", method = RequestMethod.POST)
	public @ResponseBody
	String uploadImage(@RequestParam(value = "himage", required = false) MultipartFile himage) {
		String oriname = himage.getOriginalFilename();
		String suffix = oriname.substring(oriname.lastIndexOf("."));
		String filePath = "resource/upload/image/" + StringUtil.generatorID() + "-TEMP" + suffix;
		File tempFile = new File(request.getSession().getServletContext().getRealPath(filePath));
		try {
			FileUtils.copyInputStreamToFile(himage.getInputStream(), tempFile);
			Map<String, Object> dataMap = new HashMap<String, Object>();

			dataMap.put("url", request.getContextPath() + "/" + filePath);
			dataMap.put("title", oriname);
			ObjectMapper mapper = new ObjectMapper();
			String json = mapper.writeValueAsString(dataMap);
			return json;
		} catch (Exception e) {
			e.printStackTrace();
			return e.toString();
		}
	}

}
