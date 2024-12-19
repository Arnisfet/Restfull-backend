package org.github.arnisfet.restfullbackend.controller;

import lombok.AllArgsConstructor;
import org.github.arnisfet.restfullbackend.data.controller.ClientControllerData;
import org.github.arnisfet.restfullbackend.data.entity.ClientData;
import org.github.arnisfet.restfullbackend.service.MarketService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ClientController implements ClientInterface {
    private MarketService marketService;
    @Override
    public ResponseEntity addClient(@RequestBody ClientControllerData data) {
        return marketService.addClient(data);
    }
}
