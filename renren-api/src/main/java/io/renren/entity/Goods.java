package io.renren.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author admin
 */
@Data
@TableName("goods")
public class Goods implements Serializable {
	@TableId
	private Long id;
	private String goodsTitle;
	private String goodsImg;
	private String goodsDetail;
	private Double goodsMinPrice;
	private Double goodsMaxPrice;

	private Double orgMinPrice;
	private Double orgMaxPrice;

	/**
	 * 所在地
	 */
	private String location;
	/**
	 * 运费
	 */
	private Double deliveryFree;

	private Integer goodsStock;

	private Integer payCount;

	private Integer goodsCategory;

}
