package com.gsccs.cmcc.info.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gsccs.plat.auth.model.DictGroupT;
import com.gsccs.plat.auth.service.DictService;
import com.gsccs.plat.bass.Constants;
import com.gsccs.plat.bass.JsonMsg;

@Controller
public class UploadController {
	
	@Autowired
	private DictService dictService;

	@RequestMapping("/uploadify")
	@ResponseBody
	public String uploadify(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
			JsonMsg msg1 = new JsonMsg();
			String str ="";
		 	Map map = new HashMap();
			request.setCharacterEncoding("utf-8");
	        DiskFileItemFactory factory = new DiskFileItemFactory();
	       // String path = request.getRealPath("/file");
	        DictGroupT dt = dictService.getGroupByCode(Constants.FILE_PATH);
	       //String path ="C:\\soft";
	        String path = dt.getVal();
	        factory.setRepository(new File(path));
	        factory.setSizeThreshold(1024*1024) ;
	        ServletFileUpload upload = new ServletFileUpload(factory);
	        try {
	            //可以上传多个文件
	            List<FileItem> list = (List<FileItem>)upload.parseRequest(request);
	            for(FileItem item : list){
	                if(!item.isFormField()){
	                    String name = item.getName() ;
	                    String fileSuffix  = name.substring(name.lastIndexOf(".")+1,name.length());
	                    String oldName = name.replaceAll("." + fileSuffix,"");
	                    String fileName =  UUID.randomUUID().toString();
	                    String newName = fileName + "." + fileSuffix;
	                    OutputStream out = new FileOutputStream(new File(path,newName));
	                    InputStream in = item.getInputStream() ;
	                    int length = 0 ;
	                    byte [] buf = new byte[1024] ;
	                    while( (length = in.read(buf) ) != -1){
	                        out.write(buf, 0, length);
	                    }
	                    in.close();
	                    out.close();
	                    /**将上传处理后的数据返回**/
	                    map.put("fileSuffix",fileSuffix);
	                    map.put("fileName",name);
	                    map.put("filePath",newName);
	                    
	                     //str = "{['id':1,'name':'张三','age':18]}";
	                   String msg = newName + "=="+name;
	                   str = URLEncoder.encode(msg, "UTF-8").replace("+","%20");
	                    break;
	                }
	            }
	        }catch (Exception e) {
	            System.out.println("出错了：" + e.getMessage());
	        }
		
		msg1.setSuccess(true);
		msg1.setMsg("上传成功!");
		msg1.setData(map);
		return str;
	}
	
	/*public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map map = new HashMap();
        request.setCharacterEncoding("utf-8");
        DiskFileItemFactory factory = new DiskFileItemFactory();
        String path = request.getRealPath("/file");
        factory.setRepository(new File(path));
        factory.setSizeThreshold(1024*1024) ;
        ServletFileUpload upload = new ServletFileUpload(factory);
        try {
            //可以上传多个文件
            List<FileItem> list = (List<FileItem>)upload.parseRequest(request);
            for(FileItem item : list){
                if(!item.isFormField()){
                	System.out.println("===============");
                    String name = item.getName() ;
                    System.out.println("name=="+name);
                    String fileSuffix  = name.substring(name.lastIndexOf(".")+1,name.length());
                    String oldName = name.replaceAll("." + fileSuffix,"");
                    String fileName = "11";
                    		//DateUtils.getNowTime();
                    String newName = fileName + "." + fileSuffix;
                    OutputStream out = new FileOutputStream(new File(path,newName));
                    InputStream in = item.getInputStream() ;
                    int length = 0 ;
                    byte [] buf = new byte[1024] ;
                    while( (length = in.read(buf) ) != -1){
                        out.write(buf, 0, length);
                    }
                    in.close();
                    out.close();
                    *//**将上传处理后的数据返回**//*
                    map.put("fileSuffix",fileSuffix);
                    map.put("fileName",oldName);
                    map.put("filePath",fileName);
                    break;
                }
            }
        }catch (Exception e) {
            System.out.println("出错了：" + e.getMessage());
        }
        response.setContentType("text/xml; charset=UTF-8");
        response.setHeader("Cache-Control", "no-cache");
        response.setHeader("Pragma", "no-cache");
        PrintWriter out = response.getWriter();
        JSONObject jsonObject = JSONObject.fromObject(map);
        String msg =  jsonObject.toString();
        out.print(msg);
        out.close();
    }

    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        doPost(req, resp);
    }*/
}
