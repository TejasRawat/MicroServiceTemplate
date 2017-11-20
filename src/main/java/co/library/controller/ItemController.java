package co.library.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.library.models.Item.ItemSearchRequestModel;
import co.library.models.Item.ItemSearchResponseModel;
import co.library.service.Item.ItemService;
import co.library.utility.ApiResponseModel;

@RestController
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@GetMapping(value="/hi")
	public String sayHello(){
		return "Hello";
	}

	@PostMapping(value = "/item_search", produces = "application/json", consumes = "application/json")
	public ResponseEntity<ApiResponseModel<ItemSearchResponseModel>> readItems(
								@RequestBody @Valid ItemSearchRequestModel itemSearchRequestModel) {
		ApiResponseModel<ItemSearchResponseModel> apiResponseModel = new ApiResponseModel
																			<ItemSearchResponseModel>();

		ItemSearchResponseModel itemSearchResponseModel = itemService.readItems(itemSearchRequestModel);
		
		apiResponseModel.setData(itemSearchResponseModel);
		
		return new ResponseEntity<ApiResponseModel<ItemSearchResponseModel>>
														  				(apiResponseModel, HttpStatus.OK);
	}

}
