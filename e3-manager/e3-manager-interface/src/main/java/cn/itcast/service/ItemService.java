package cn.itcast.service;

import cn.itcast.pojo.TbItem;

public interface ItemService {

	//定义一个方法通过id查询service
	public TbItem getitemByid(long id);
}
