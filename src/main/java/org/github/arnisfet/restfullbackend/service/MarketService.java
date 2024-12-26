package org.github.arnisfet.restfullbackend.service;

import lombok.AllArgsConstructor;
import org.github.arnisfet.restfullbackend.data.controller.ClientControllerData;
import org.github.arnisfet.restfullbackend.data.entity.ClientData;
import org.github.arnisfet.restfullbackend.repository.ClientRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MarketService {
    private ClientRepository clientRepository;

    public void addClient(ClientControllerData clientController) {
        ClientData clientData = clientController.toClientData();
        ClientData  result = clientRepository.save(clientData);
    }
    public void deleteClient(String id) {
        clientRepository.deleteById(id);
    }
    public ClientData getClient(String name, String surname) {
        clientRepository.findBy();
    }
}
