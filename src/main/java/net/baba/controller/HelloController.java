package net.baba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.baba.properties.GirlProperties;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@Autowired		
	private GirlProperties girlProperties;
	
	
	@Value("${cupSize}")		//从配置文件获取数据
	private String cupSize;		
	@Value("${age}")
	private Integer age;
	
	
	@GetMapping(value = "/say")
	public String say(@RequestParam(value = "id", required = false, defaultValue = "0") Integer myId){
		return "id: " + myId;
	}
	
	@GetMapping("/girl")
	public String girlGet(){
		return girlProperties.getCupSize() +  girlProperties.getAge();
	}
	
	@GetMapping("/data")
	public String getData(){
		return "cupSize: " + cupSize + "; age: " + age;
	}

	public String getCupSize() {
		return cupSize;
	}

	public void setCupSize(String cupSize) {
		this.cupSize = cupSize;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	
}
