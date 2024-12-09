package com.example.ms_requestCredit.clients;

import com.example.ms_requestCredit.configurations.FeignClientConfig;
import com.example.ms_requestCredit.entities.ClientEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@FeignClient(value = "ms-client", path = "/api/v1/clients", configuration = {FeignClientConfig.class})
public interface ClientsFeignClient {

    @GetMapping("/")
    public ResponseEntity<List<ClientEntity>> listClients();

    @GetMapping("/{id}")
    public ResponseEntity<ClientEntity> getClientById(@PathVariable Long id);

    @GetMapping("/{rut}")
    public ResponseEntity<ClientEntity> getClientByRut(@PathVariable String rut);

}
