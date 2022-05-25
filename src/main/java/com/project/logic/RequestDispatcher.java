package com.project.logic;

import com.project.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class RequestDispatcher {
    @Autowired
    private RestTemplate restTemplate;
    private final String URL = "http://localhost:8080/client";


    public List<Client> getAllClients() {
        ResponseEntity<List<Client>> responseEntity =
                restTemplate.exchange(URL+"s", HttpMethod.GET, null,
                        new ParameterizedTypeReference<List<Client>>() {
                        });
        return responseEntity.getBody();
    }

    public Client getClient(int id) {
        Client client =
                restTemplate.getForObject(URL + "/" + id, Client.class);
        return client;
    }

    public void saveClient(Client client) {
        int id = client.getId();
        if (id == 0) {
            ResponseEntity<String> responseEntity =
                    restTemplate.postForEntity(URL, client, String.class);
            System.out.println("New client was added to DB");
            System.out.println(responseEntity.getBody());
        } else {
            restTemplate.put(URL, client);
            System.out.println("client with id " + id + " has been updated");
        }
    }

    public void deleteClient(int id) {
        restTemplate.delete(URL + "/" + id);
        System.out.println("client with id " + id + " has been deleted");

    }
}
