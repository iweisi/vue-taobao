package io.renren.service;

import com.baomidou.mybatisplus.service.IService;
import io.renren.entity.GoodsSku;

import java.util.List;

/**
 * sku
 * @author admin
 */
public interface GoodsSkuService extends IService<GoodsSku> {


    /**
     * 查找sku
     * @param goodsId 商品id
     * @return
     */
    public List<GoodsSku> getByGoodsId(Long goodsId);

}
