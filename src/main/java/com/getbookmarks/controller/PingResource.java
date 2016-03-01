package com.getbookmarks.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by amarendra on 01/03/16.
 */
@RequestMapping("/ping")
@Controller
public class PingResource {

    @RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String ping() {
        return "{'ping':'pong'}";
    }
}

