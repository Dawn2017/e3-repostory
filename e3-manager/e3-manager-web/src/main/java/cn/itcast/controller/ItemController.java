package cn.itcast.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import cn.itcast.pojo.TbItem;
import cn.itcast.service.ItemService;

@Controller
public class ItemController {
	@Autowired
	private ItemService itemService;
	
    @RequestMapping("/list/{id}")
    @ResponseBody//将返回值对象转换为json格式,并在当前页面显示
	public TbItem getItemByid(@PathVariable long id){
    	TbItem tbItem = itemService.getitemByid(id);
    	System.out.println("hello,world,cvnjdh-------------------");
		return tbItem;
	}
}
