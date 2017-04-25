package net.baba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.baba.domain.Boy;

/**
 * boy实体类数据库接口
 * 
 * @author 乔凯华 2017年4月25日 下午3:54:19
 * @version 1.0
 */
public interface BoyRepository extends JpaRepository<Boy, Integer> {

	List<Boy> findByAge(Integer age);

}
