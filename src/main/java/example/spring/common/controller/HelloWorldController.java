package example.spring.common.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;

@RestController
public class HelloWorldController
{
    @RequestMapping(path={"/hello"}, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
	protected HashMap<String, String> displayHelloWorldMessage()
    {
        HashMap<String, String> model = new HashMap<>();
        String name = "Hello World!!";
        model.put("greeting", name);
        return model;
	}

}