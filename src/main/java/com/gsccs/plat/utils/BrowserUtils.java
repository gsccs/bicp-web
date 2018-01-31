package com.gsccs.plat.utils;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class BrowserUtils {

	 /** 
     * 打开IE浏览器访问页面 
     */  
    public static void openIEBrowser(){  
         //启用cmd运行IE的方式来打开网址。  
        String str = "cmd /c start iexplore http://www.baidu.com/";  
        try {  
            Runtime.getRuntime().exec(str);  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
      
    /** 
     * 打开默认浏览器访问页面 
     */  
    public static void openDefaultBrowser(){  
        //启用系统默认浏览器来打开网址。  
        try {  
            URI uri = new URI("http://www.baidu.com/");  
            Desktop.getDesktop().browse(uri);  
        } catch (URISyntaxException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
   
    public static void main(String[] args) {  
        openIEBrowser();  
        openDefaultBrowser();  
    }  
    
}
