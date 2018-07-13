package com.acme.services.proxy;

import javax.ws.rs.core.MediaType;

import org.apache.wink.client.Resource;
import org.apache.wink.client.RestClient;

import com.acme.services.entities.QuoteRequest;
import com.acme.services.entities.QuoteResponse;

public class QuoteProxy {
	
	String baseURL = "http://localhost:9080/AcmeWeb/svc/quotes";
	
	public QuoteResponse getQuote(QuoteRequest req) {
		
		RestClient client = new RestClient();
		Resource resource = client.resource(baseURL);
		
		resource.contentType(MediaType.APPLICATION_XML);
		resource.accept(MediaType.APPLICATION_XML);
		
		QuoteResponse res = resource.post(QuoteResponse.class, req);
		
		return res;
	}

}
