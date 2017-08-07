package cn.wzl.test;

import java.io.IOException;

import org.junit.Test;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.util.FileCopyUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

public class PretentUserTest {
	
	
	
	@Test
	public void testHandle41(){
		RestTemplate restTemplate=new RestTemplate();
		
		MultiValueMap<String,String> form=new LinkedMultiValueMap<String,String>();
		
		form.add("userName", "Tom");
		form.add("password","12345");
		form.add("age", "45");
		restTemplate.postForLocation("http://localhost:8080/SpringMVC/springmvc/handle41", form);
	}
	@Test
	public void testHandle42() throws IOException{
		RestTemplate restTemplate=new RestTemplate();
		
		byte[] response=restTemplate.postForObject("http://localhost:8080/SpringMVC/springmvc/handle42/{itemId}.html", null, byte[].class,"12333");
		
		Resource outFile=new FileSystemResource("F:/a.jpg");
		//System.out.println(outFile);
		
		FileCopyUtils.copy(response, outFile.getFile());
	}
}
