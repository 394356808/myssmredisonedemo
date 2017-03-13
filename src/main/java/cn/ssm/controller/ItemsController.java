package cn.ssm.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import cn.ssm.po.ItemsCustom;
import cn.ssm.po.Temptable;
import cn.ssm.service.ItemsService;


/**
 * 商品的controller类
 * @author yyao
 *
 */
@Controller
public class ItemsController {
	//自动注入ItemsService
@Autowired
private ItemsService itemsService;
//商品查询
@RequestMapping("/queryItems")
public ModelAndView queryItems()throws Exception{
	//调用service查询数据库，查询商品列表
	List<ItemsCustom> itemsList=itemsService.findItemsList(null);
	for(ItemsCustom item:itemsList){
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyyMMdd");
		String temp=dateFormat.format(item.getCreatetime());
	    Date date=new Date();
	    //SimpleDateFormat dateFormat2=new SimpleDateFormat("dd");
	    String temp2=dateFormat.format(date);
	    if(temp2.equals(temp)){
	    	System.out.println("有相同的年份和月份");
	    }
		System.out.println(temp+"&&");
		System.out.println(temp2);
		
	}
	//返回ModelAndView
	ModelAndView model=new ModelAndView();
	//相当于request的setAttribut，在jsp页面中通过itemsList取数据
	model.addObject("itemsList",itemsList);
	/*指定视图
	 * 下边的路径，如果在视图解析器中配置jsp路径的前缀和jsp路径的后缀，修改为
	 * modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp")
	 * 上边的路径配置可以不在程序中指定jsp路径的前缀和jsp路径的后缀
	 */
	model.setViewName("jsp/itemsList");
	//model.setViewName("jsp/newmetting");
	return model;
}
//商品模糊查询
@RequestMapping("/selectItems")
public ModelAndView selectItems()throws Exception{
	//调用service查询数据库，查询商品列表
		List<ItemsCustom> itemsList=itemsService.findItemsList(null);
		//返回ModelAndView
		ModelAndView model=new ModelAndView();
		//相当于request的setAttribut，在jsp页面中通过itemsList取数据
		model.addObject("itemsList",itemsList);
		/*指定视图
		 * 下边的路径，如果在视图解析器中配置jsp路径的前缀和jsp路径的后缀，修改为
		 * modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp")
		 * 上边的路径配置可以不在程序中指定jsp路径的前缀和jsp路径的后缀
		 */
		model.setViewName("jsp/itemsList");
		return model;
}
//修改商品
@RequestMapping("/updateitems")
public ModelAndView updateitems(Integer id)throws Exception{
	ItemsCustom itemsCustom=itemsService.findItemsByid(id);
	ModelAndView model=new ModelAndView();
	model.addObject("items", itemsCustom);
	model.setViewName("jsp/updateitems");
	return model;
}
//修改商品提交
@RequestMapping(value="/updateitemsSubmit")
public ModelAndView updateitemsSubmit(ItemsCustom itemscustom)throws Exception{
	Integer temp=itemscustom.getItemsid();
	if(temp!=null && temp!=0){
    itemsService.updateItems(itemscustom.getItemsid(), itemscustom);
	}
	ModelAndView model2=new ModelAndView();
	try{
	model2=queryItems();
	}catch(Exception e){
		e.printStackTrace();
	}
	return model2;
}
//添加商品
@RequestMapping("/additems")
public String additems(){
	String retval="/jsp/additems";
	return retval;
}
//添加商品提交
@RequestMapping("/additemsSubmit")
public ModelAndView additemsSubmit(ItemsCustom itemsCustom)throws Exception{
     itemsService.insertItems(itemsCustom);
	 ModelAndView model=new ModelAndView();
	 model=queryItems();
	return model;
}
//删除商品
@RequestMapping("/deletcitems")
public @ResponseBody List<ItemsCustom> deletcItems(Integer id){
	List<ItemsCustom> itemsList=new ArrayList<ItemsCustom>();
	try{
	itemsService.deletcItems(id);
	 itemsList=itemsService.findItemsList(null);
	}catch(Exception e ){
		System.out.println("删除失败");
	}
	return itemsList;
}
@RequestMapping("/fileup")
public String tiaoz(){
	return "/jsp/Fileflod";
}
@RequestMapping("/filefilap")
public String editItemsSubmit(MultipartFile items_pic) throws IllegalStateException, IOException{
	//获取图片物理路径
	String pic_path="/Users/yyao/Documents/img/";
	System.out.println("文件大小为："+(items_pic.getSize()/1024)/1024+"MB");
	
	//获取图片名称
	String originalFilename=items_pic.getOriginalFilename();
	//随机生成一个名称
	String newfilename=UUID.randomUUID()+originalFilename.substring(originalFilename.lastIndexOf("."));
	System.out.println(newfilename);
	//readTxtFile(pic_path+newfilename);
	File newFile=new File(pic_path+newfilename);
	items_pic.transferTo(newFile);
	readTxtFile(pic_path+newfilename);
	return "/jsp/Fileflod";
}
@RequestMapping(value="/login")  
//public @ResponseBody Map<String,Object> login(HttpServletRequest request,HttpServletResponse response) throws IOException{ 
	public @ResponseBody Map<String,Object> login(String name) throws IOException{  
    //System.out.println(request.getParameter("name"));  
	System.out.println(name);
    Map<String,Object> map = new HashMap<String,Object>();  
      
   // if(request.getParameter("name").equals("123")){ 
    	 if(name.equals("123")){ 
        System.out.println("城东");  
        map.put("msg", "成功");  
    }else{  
        System.out.println("失败");  
        map.put("msg", "失败");  
    }  
    return map;  
}  
//读取txt
public  void readTxtFile(String filePath){
	BufferedReader bufferedReader=null;
	try{
		String encoding="GBK";
		File file=new File(filePath);
		if(file.isFile() && file.exists()){
			InputStreamReader read=new InputStreamReader(new FileInputStream(file),encoding);
			 bufferedReader=new BufferedReader(read);
			String lineTxt=null;
			Temptable temptable=new Temptable();
			PrintWriter printWriter=new PrintWriter(new FileWriter("/Users/yyao/Documents/img/aa.txt"));
			while((lineTxt=bufferedReader.readLine())!=null){
				temptable.setUserid(lineTxt);
				addTemp(temptable);
				printWriter.print(lineTxt);
				printWriter.println("\r");
				System.out.println(lineTxt);
			}
			read.close();
			printWriter.close();
		}else{
			System.out.println("找不到指定文件");
		}
	}catch(Exception e){
		System.out.println("读取文件内容出错");
		e.printStackTrace();
	}
}
public  void addTemp(Temptable temptable) throws Exception{
	int temp=itemsService.insertTemptable(temptable);
	if(temp>0){
		System.out.println("写入成功");
	}
}

@RequestMapping(value = "/upload", method = RequestMethod.POST)
public String upload(HttpServletRequest request, @RequestParam("file") MultipartFile file, ModelMap model) {
    System.out.println("开始");
    String path = request.getSession().getServletContext().getRealPath("upload");
    String fileName = file.getOriginalFilename();
    // String fileName = new Date().getTime()+".jpg";
    System.out.println(path);
    File targetFile = new File(path, fileName);
    if (!targetFile.exists()) {
        targetFile.mkdirs();
    }

    // 保存
    try {
        file.transferTo(targetFile);
    } catch (Exception e) {
        e.printStackTrace();
    }
    model.addAttribute("fileUrl", request.getContextPath() + "/upload/" + fileName);
    return "result";
}
}
