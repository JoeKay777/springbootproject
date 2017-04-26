package net.baba.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.baba.domain.Boy;
import net.baba.repository.BoyRepository;

/**
 * 
 * 
 * @author 乔凯华 2017年4月25日 下午3:14:41
 * @version 1.0
 */
@RestController
public class BoyController {
	
	
	@Autowired
	private BoyRepository boyRepository;
	/**
	 * 查询所有男孩列表
	 * @return
	 * @author 乔凯华 2017年4月25日 下午3:50:21
	 * @version 1.0
	 */
	@GetMapping(value = "/boys")
	public List<Boy> boyList(){
		return  this.boyRepository.findAll();
	}
	
	/**
	 * 添加一个男孩
	 * @param boy
	 * @return
	 * @author 乔凯华 2017年4月25日 下午4:32:05
	 * @version 1.0
	 */
	@PostMapping(value = "/boys")
	public Boy boyAdd(@Valid Boy boy, BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			System.out.println(bindingResult.getFieldError().getDefaultMessage());
			return null;
		}
		return boyRepository.save(boy);
	}
	
	/**
	 * 查询一个男生
	 * @param id
	 * @return
	 * @author 乔凯华 2017年4月25日 下午4:44:06
	 * @version 1.0
	 */
	@GetMapping(value = "/boys/{id}")
	public Boy boyFindOne(@PathVariable("id") Integer id){
		return boyRepository.findOne(id);
	}
	
	/**
	 * 更新 (有问题)
	 * @param id
	 * @param cupSize
	 * @param age
	 * @return
	 * @author 乔凯华 2017年4月25日 下午5:04:48
	 * @version 1.0
	 */
	@PutMapping(value = "/boys/{id}")
	public Boy boyUpdate(@PathVariable("id") Integer id,
						 @RequestParam("cupSize") String cupSize,
						 @RequestParam("age") Integer age){
		Boy boy = new Boy();
		boy.setId(id);
		boy.setCupSize(cupSize);
		boy.setAge(age);
		
		return boyRepository.save(boy);
	}
	
	/**
	 * 删除
	 * @param id
	 * @author 乔凯华 2017年4月25日 下午5:11:11
	 * @version 1.0
	 */
	@DeleteMapping(value = "/boys/{id}")
	public void BoyDelete(@PathVariable("id") Integer id){
		this.boyRepository.delete(id);
	}
	
	/**
	 * 通过年龄查询女生列表
	 * @param age
	 * @return
	 * @author 乔凯华 2017年4月25日 下午5:14:14
	 * @version 1.0
	 */
	@GetMapping(value = "/boys/age/{age}")
	public List<Boy> boyListByAge(@PathVariable("age") Integer age){
		return boyRepository.findByAge(age);
	}
}
