package net.baba.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 与配置文件appication-dev中 前缀时girl的数据映射到实体类中
 * 
 * @author 乔凯华 2017年4月26日 上午9:10:15
 * @version 1.0
 */
@Component
@ConfigurationProperties(prefix = "girl")
public class GirlProperties {

	private String cupSize;
	private Integer age;
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
