package cn.itcast.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.mapper.TbItemMapper;
import cn.itcast.pojo.TbItem;
import cn.itcast.service.ItemService;
@Service
public class ItemServiceimpl implements ItemService {
    //注入mapper,进行查询
	@Autowired
	private TbItemMapper tbItemMapper;
	
	public TbItem getitemByid(long id) {
		TbItem tbItem = tbItemMapper.selectByPrimaryKey(id);
		return tbItem;
	}

}
