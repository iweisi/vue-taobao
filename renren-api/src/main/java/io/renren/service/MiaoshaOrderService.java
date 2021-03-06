package io.renren.service;

import com.baomidou.mybatisplus.service.IService;
import io.renren.entity.MiaoshaOrder;
import io.renren.entity.OrderInfo;
import io.renren.entity.UserEntity;
import io.renren.vo.GoodsVo;

/**
 * 商品
 * @author admin
 */
public interface MiaoshaOrderService extends IService<MiaoshaOrder> {

	/**
	 * 根据商品Id和用户id查询是否有秒杀订单
	 * @param goodsId 商品Id
	 * @param userId 用户id
	 * @return 秒杀订单
	 */
	public MiaoshaOrder getOrderByGoodsIdAndUserId(Long goodsId,Long userId);

	/**
	 * 执行秒杀商品
	 * @param goodsVo 商品
	 * @param user 用户
	 * @return
	 */
    OrderInfo secKill(GoodsVo goodsVo, UserEntity user);

	/**
	 * 查询秒杀结果
	 * @param userId
	 * @param goodsId
	 * @return
	 */
	public long getMiaoshaResult(Long userId, long goodsId);
}
