package org.github.arnisfet.restfullbackend.controller;

import org.github.arnisfet.restfullbackend.constant.ApiConstant;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = ApiConstant.API_V1 + "/client")
public interface ClientInterface {
//    @PostMapping(value = "/add")
//    public ResponseEntity<String> addClient(@RequestBody)
}
