package co.library.service.Item;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import co.library.models.Item.ItemAttribute;
import co.library.models.Item.ItemSearchRequestModel;
import co.library.models.Item.ItemSearchResponseModel;

@Service
public class ItemServiceImpl implements ItemService {

	@Override
	public ItemSearchResponseModel readItems(ItemSearchRequestModel itemSearchRequestModel) {
		
		// mock data for time being
		ItemSearchResponseModel itemSearchResponseModel = new ItemSearchResponseModel();
		List<ItemAttribute> listItemAttribute  = new ArrayList<ItemAttribute>();
		
		ItemAttribute itemAttribute1 = new ItemAttribute();
		itemAttribute1.setAuthor("Herbert Shield");
		
		ItemAttribute itemAttribute2 = new ItemAttribute();
		itemAttribute2.setAuthor("Denis");

		listItemAttribute.add(itemAttribute1);
		listItemAttribute.add(itemAttribute2);
		
		itemSearchResponseModel.setListItemAttribute(listItemAttribute);
		
		return itemSearchResponseModel;
	}

}
