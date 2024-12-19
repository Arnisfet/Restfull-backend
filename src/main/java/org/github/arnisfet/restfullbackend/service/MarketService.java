package org.github.arnisfet.restfullbackend.service;

import lombok.AllArgsConstructor;
import org.github.arnisfet.restfullbackend.data.controller.ClientControllerData;
import org.github.arnisfet.restfullbackend.data.entity.ClientData;
import org.github.arnisfet.restfullbackend.repository.MarketRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MarketService {
    private MarketRepository marketRepository;

    public ResponseEntity addClient(ClientControllerData clientController) {
        ClientData clientData = clientController.toClientData();
        marketRepository.save(clientData);
        return new ResponseEntity(HttpStatus.OK);
    }
}
