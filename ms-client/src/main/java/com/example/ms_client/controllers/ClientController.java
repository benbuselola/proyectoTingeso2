package com.example.ms_client.controllers;

import com.example.ms_client.entities.ClientEntity;
import com.example.ms_client.services.ClientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/clients")
public class ClientController {
    @Autowired
    ClientServices clientServices;

    @GetMapping("/")
    public ResponseEntity<List<ClientEntity>> listClients() {
        List<ClientEntity> clients = clientServices.getClients();
        return ResponseEntity.ok(clients);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClientEntity> getClientById(@PathVariable Long id) {
        ClientEntity client = clientServices.getClientById(id);
        return ResponseEntity.ok(client);
    }

    @GetMapping("/rut/{rut}")
    public ResponseEntity<ClientEntity> getClientByRut(@PathVariable String rut) {
        ClientEntity client = clientServices.getClientByRut(rut);
        return ResponseEntity.ok(client);
    }

    @PostMapping("/")
    public ResponseEntity<ClientEntity> saveClient(@RequestBody ClientEntity client) {
        ClientEntity clientNew = clientServices.saveClient(client);
        return ResponseEntity.ok(clientNew);
    }

    @PutMapping("/")
    public ResponseEntity<ClientEntity> updateClient(@RequestBody ClientEntity client){
        ClientEntity clientUpdated = clientServices.updateClient(client);
        return ResponseEntity.ok(clientUpdated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteClientById(@PathVariable Long id) throws Exception {
        var isDeleted = clientServices.deleteClient(id);
        return ResponseEntity.noContent().build();
    }
}
