package net.baba.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Boy {
	
	@Id
	@GeneratedValue
	private Integer id;			//id
	
	@NotBlank(message = "这个字段必传")
	@Length(max = 25)
	private String cupSize;		//大小
	
	@NotNull(message = "金额必传")
	private Double money;	//金钱
	
	@Min(value = 18 , message = "你太小了,还不满18岁")
	@Max(value = 140, message = "你属乌龟的,活这么久!")
	//@Length()
	private Integer age;	//年龄
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCupSize() {
		return cupSize;
	}

	public void setCupSize(String cupSize) {
		this.cupSize = cupSize;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Boy [id=" + id + ", cupSize=" + cupSize + ", money=" + money + ", age=" + age + "]";
	}
	
	

}
