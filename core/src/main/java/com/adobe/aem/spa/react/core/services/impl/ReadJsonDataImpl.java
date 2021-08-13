package com.adobe.aem.spa.react.core.services.impl;

import org.osgi.service.component.annotations.Component;
import static com.adobe.aem.spa.react.core.constants.AppConstants.URL;
import com.adobe.aem.spa.react.core.services.ReadJsonService;
import com.adobe.aem.spa.react.core.utils.Network;

/**
 * @author ayesan
 * 
 * Implementation of ReadJsonService
 */
@Component(immediate = true, service = ReadJsonService.class)
public class ReadJsonDataImpl implements ReadJsonService {


	/**
	 * Overridden method which will read the JSON data via an HTTP GET call
	 */
	@Override
	public String getData() {
		
		String response = Network.readJson(URL);
		
		return response;
	}

}