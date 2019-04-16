package com.alibaba.seata.sample.repository;

import com.alibaba.seata.sample.entity.Storage;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Description：
 *
 * @author fangliangsheng
 * @date 2019-04-04
 */
public interface StorageDAO extends JpaRepository<Storage, String> {

    Storage findByCommodityCode(String commodityCode);

}
