package co.library.service.Item;

import co.library.models.Item.ItemSearchRequestModel;
import co.library.models.Item.ItemSearchResponseModel;

public interface ItemService {

	public ItemSearchResponseModel readItems(ItemSearchRequestModel itemSearchRequestModel);

}
