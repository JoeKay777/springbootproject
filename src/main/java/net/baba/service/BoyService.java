package net.baba.service;

import java.util.List;

import net.baba.domain.Boy;

/**
 * 
 * boy业务层接口
 * @author 乔凯华 2017年4月27日 下午5:08:56
 * @version 1.0
 */
public interface BoyService {

	public Boy save(Boy boy);

	public List<Boy> findBoyListByAge(Integer age) throws Exception;

}
