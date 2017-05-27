package com.shop.endPoint;

import com.shop.soap.GetProductRequest;
import com.shop.soap.GetProductResponse;
import com.shop.utility.ProductUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * Created by Владислав on 22.05.2017.
 */
@Endpoint
public class ProductEndPoint {
    private static final String NAMESPACE_URI = "http://vlad.com/product";
    @PayloadRoot(namespace = NAMESPACE_URI,localPart = "getProductRequest")
    @ResponsePayload
    public GetProductResponse response(@RequestPayload GetProductRequest request) {
        GetProductResponse response = new GetProductResponse();
        response.setResponse(utility.addProduct(request.getRequset()));
        return response;
    }
    @Autowired
    ProductUtility utility;
}
