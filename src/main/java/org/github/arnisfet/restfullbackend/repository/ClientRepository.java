package org.github.arnisfet.restfullbackend.repository;

import org.github.arnisfet.restfullbackend.data.entity.ClientData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClientData, String> {
}
