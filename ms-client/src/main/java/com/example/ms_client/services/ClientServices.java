package com.example.ms_client.services;

import com.example.ms_client.entities.ClientEntity;
import com.example.ms_client.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServices {
    @Autowired
    ClientRepository clientRepository;

    public List<ClientEntity> getClients(){
        return clientRepository.findAll();
    }

    public ClientEntity saveClient(ClientEntity client){
        if (clientRepository.findByRut(client.getRut()) != null) {
            return null;
        }
        if (client.getAge() < 18) {
            return null;
        }
        return clientRepository.save(client);
    }

    public ClientEntity getClientById(Long id){

        return clientRepository.findById(id).get();
    }

    public ClientEntity getClientByRut(String rut){

        return clientRepository.findByRut(rut);
    }

    public ClientEntity updateClient(ClientEntity client) {
        if (clientRepository.findById(client.getId()).isEmpty()) {
            return null;
        }
        clientRepository.deleteById(client.getId());
        return clientRepository.save(client);
    }

    public boolean deleteClient(Long id) throws Exception {
        try{
            clientRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }
}
