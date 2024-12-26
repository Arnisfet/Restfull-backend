package org.github.arnisfet.restfullbackend.controller;

import org.github.arnisfet.restfullbackend.constant.ApiConstant;
import org.github.arnisfet.restfullbackend.data.controller.ClientControllerData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = ApiConstant.API_V1 + "/client")
public interface ClientInterface {
    @PostMapping(value = "/add")
    public ResponseEntity addClient(@RequestBody ClientControllerData data);
    @DeleteMapping(value = "/delete")
    public ResponseEntity deleteClient(@RequestParam("id") String id);
    @GetMapping(value = "/get")
    public ResponseEntity getClient(@RequestParam("name") String name, @RequestParam("surname") String surname);
}
