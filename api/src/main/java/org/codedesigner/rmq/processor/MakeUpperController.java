package org.codedesigner.rmq.processor;

import io.micronaut.http.annotation.*;

import javax.inject.Inject;

@Controller("/makeUpper")
public class MakeUpperController {

    @Inject
    MakeUpperRmqClient makeUpperRmqClient;

    @Get(uri="/{text}", produces="text/plain")
    public String index(String text) {
        return makeUpperRmqClient.send(text);
    }
}