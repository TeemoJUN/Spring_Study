package cn.wzl.test;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import cn.wzl.POJO.User;

@SessionAttributes({"users"})
@RequestMapping("/springmvc")
@Controller
public class SpringMVCTest {
	
	private final static String SUCCESS="success";
	
	@RequestMapping("/testView")
	public String testView(){
		pl("testView");
		return "helloView";
	}

	
	@RequestMapping("/handle41")
	public String handle41(@RequestBody String requestBody){
		pl(requestBody);
		return SUCCESS;
	}
	
	@ResponseBody
	@RequestMapping("/handle42/{ImageId}")
	public byte[] handle42(@PathVariable("ImageId") String imageId) throws IOException{
		pl("load image if "+imageId);
		Resource res=new ClassPathResource("/image.jpg");
		byte[] fileData=FileCopyUtils.copyToByteArray(res.getInputStream());
		return fileData;
	}
	

	@ModelAttribute
	public void testTwo(@RequestParam(value="username",required=false) String username,Map<String,Object> mm){
			
		User user = new User("wzl", "123456", "wzl@qq.com", 190);
		mm.put("user",user);
	}
	
	
	@RequestMapping("/testModelAttribute")
	public String testModelAttribute(User user){
		System.out.println("�޸�: " + user);
		return SUCCESS;
	}
	
		

	@RequestMapping("/testSessionAttribute")
	public String testSessionAttribute(Map<String,Object> mp){
		mp.put("users",new User("xyp","12345","wzl@aa.com",12));
		return SUCCESS;
	}
	
	
	
	@RequestMapping("/testMap")
	public String testMap(Map<String,Object> mp){
		
		mp.put("names", Arrays.asList("��","��"));
		System.out.println(mp.getClass().getName());		
		return SUCCESS;
	}
	
	@RequestMapping("/testModelAndView")
	public  ModelAndView testModelAndView(){
		String view=SUCCESS;
		pl("testModelAndView");
		ModelAndView mv=new ModelAndView(view);
		mv.addObject("user",new User("wzl","12345","wzl@aa.com",12));
		return mv;
	}

	
	//POJO��Plain Ordinary Java Object���򵥵�Java����
	@RequestMapping("/pojo")
	public String testPojo(User user){
		pl(user.toString());
		return SUCCESS;
	}
	
	//cookies
    @RequestMapping(value="/testCookieValue")
	public String testCookieValue(@CookieValue(value="JSESSIONID") String session){
		pl("tesetCoolieValue   "+session);
		return SUCCESS;
	}
	
    
    //����ͷ
	@RequestMapping(value="/testHeader")
	public String testHeader(@RequestHeader(value="Connection") String ck){
		pl("testHeader "+ ck);
		return SUCCESS;
	}
	
	
	
	
	//�������
	@RequestMapping(value="/testRequestParam")
	public String testRequestParam(@RequestParam(value="username") String un,@RequestParam(value="age",required=false) int age){
		
		pl("testRequestParam username= "+un+"  age  ="+age);
		return SUCCESS;
	}
		
	
	//----------------------------------------��������ʽ

	/**
	 * Rest ���� URL. �� CRUD Ϊ��: ����: /order POST �޸�: /order/1 PUT update?id=1 ��ȡ:
	 * /order/1 GET get?id=1 ɾ��: /order/1 DELETE delete?id=1
	 * 
	 * ��η��� PUT ����� DELETE ������ ? 
	 * 1. ��Ҫ���� HiddenHttpMethodFilter 
	 * 2. ��Ҫ���� POST ����
	 * 3. ��Ҫ�ڷ��� POST ����ʱЯ��һ�� name="_method" ��������, ֵΪ DELETE �� PUT
	 * 
	 * �� SpringMVC ��Ŀ�귽������εõ� id ��? ʹ�� @PathVariable ע��
	 * 
	 */	
	
	@RequestMapping(value="/testRest/{id}",method=RequestMethod.GET)
	public String testRest(@PathVariable Integer id){	
		pl("testRest  "+id);
		return SUCCESS;
	}
	
	@RequestMapping(value="/testRest",method=RequestMethod.DELETE )
	public String testRestDELETE(){
		pl("testRest "+"DELETE");
		return SUCCESS;
	}
	
	@RequestMapping(value="/testRest",method=RequestMethod.PUT)
	public String testRestPUT(){
		pl("testRest "+"PUT");
		return SUCCESS;
	}
	@RequestMapping(value="/testRest",method=RequestMethod.POST)
	public String testRestPOST(){
		pl("testRest "+"POST");
		return SUCCESS;
	}
	
	//---------------------------------------------------------�����������
	

	
	@RequestMapping("/testPathVariable/{id}")
	public String testPathVariable(@PathVariable("id") Integer id){
		pl("testPathVariable  "+id);
		return SUCCESS;
	}
	
	//ͨ���ʽƥ��
	@RequestMapping("/testAntPath/*/aa")
	public String testAntPath(){
		pl("testAntPath");
		return SUCCESS;
	}
	
	//ƥ�����
	@RequestMapping(value="testParamsAndHeaders",params={"username","age!=10"})
	public String testParamsAndHeaders(){
		pl("testParamsAndHeaders");
		return SUCCESS;
	}
	
	
	@RequestMapping(value="/testMethod",method=RequestMethod.POST)
	public String testMethod(){
		pl("testMethod");
		return SUCCESS;
	}
	
	
	/**
	 * @RequestMapping()���������࣬Ҳ�������η�����������ʱ���൱������ĵ�һ����Ŀ¼
	 * 
	 * spring�������Ϊ127.0.0.1��8080/SpringMVC/springmvc/testRequestMapping
	 * 
	 * */
	@RequestMapping("/testRequestMapping")
	public String testRequestMapping(){
		pl("testRequestMapping");
		return SUCCESS;
	}
	
	
	private void pl(String message){
		System.out.println(message);
	}
	
}
