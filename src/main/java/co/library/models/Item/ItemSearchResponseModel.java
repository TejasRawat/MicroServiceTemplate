package co.library.models.Item;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemSearchResponseModel {

	@JsonProperty("items")
	private List<ItemAttribute> listItemAttribute;

	public List<ItemAttribute> getListItemAttribute() {
		return listItemAttribute;
	}

	public void setListItemAttribute(List<ItemAttribute> listItemAttribute) {
		this.listItemAttribute = listItemAttribute;
	}

	@Override
	public String toString() {
		return "ItemSearchResponseModel [listItemAttribute=" + listItemAttribute + "]";
	}
	
	

}
