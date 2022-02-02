package com.snack.lambda.myfirstlambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyFirstLambdaRequestHandler implements RequestHandler<APIGatewayProxyRequestEvent, Object> {

    private static final Logger logger = LoggerFactory.getLogger(MyFirstLambdaRequestHandler.class);

    @Override
    public Object handleRequest(APIGatewayProxyRequestEvent input, Context context) {
        logger.info("MyFirstLambdaRequestHandler: " + input.getBody());
        return new APIGatewayProxyResponseEvent().withBody("Hello world, " + input.getBody()).withStatusCode(200);
    }
}
