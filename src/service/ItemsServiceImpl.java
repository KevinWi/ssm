package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.ItemsMapper;
import pojo.Items;
import pojo.ItemsExample;
@Service
public class ItemsServiceImpl implements ItemsService{
	
	@Autowired
	private ItemsMapper itemsMapper;
	public List<Items> list() {
		ItemsExample example = new ItemsExample();
		List<Items> items = itemsMapper.selectByExample(example);
		return items;
	}

}
