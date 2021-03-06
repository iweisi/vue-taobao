package io.renren.service;

import com.baomidou.mybatisplus.service.IService;
import io.renren.entity.GoodsDetailImg;

import java.util.List;

/**
 * GoodsDetailImg
 * @author admin
 */
public interface GoodsDetailImgService extends IService<GoodsDetailImg> {

    /**
     * 查找商品详情图
     * @param goodsId 商品id
     * @return
     */
    public List<GoodsDetailImg> getByGoodsId(Long goodsId);
}
