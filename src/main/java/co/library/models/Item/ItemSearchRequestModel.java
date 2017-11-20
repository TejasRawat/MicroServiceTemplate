package co.library.models.Item;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This model is responsible to provide parameter to request search item from
 * third party web API
 * 
 * @author te303950
 */
public class ItemSearchRequestModel {

	@JsonProperty("itemType")
	private String itemType;

	@JsonProperty("author")
	private String author;

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "ItemSearchModel [itemType=" + itemType + ", author=" + author + "]";
	}

}
