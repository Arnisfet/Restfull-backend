package org.github.arnisfet.restfullbackend.controller;

import lombok.AllArgsConstructor;
import org.github.arnisfet.restfullbackend.data.controller.ClientControllerData;
import org.github.arnisfet.restfullbackend.data.entity.ClientData;
import org.github.arnisfet.restfullbackend.service.MarketService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ClientController implements ClientInterface {
    private MarketService marketService;
    @Override
    public ResponseEntity addClient(ClientControllerData data) {
        marketService.addClient(data);
        return new ResponseEntity(HttpStatus.OK);
    }
    @Override
    public ResponseEntity deleteClient(String id) {
        marketService.deleteClient(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @Override
    public ResponseEntity getClient(String name, String surname) {
        marketService.
    }
}
