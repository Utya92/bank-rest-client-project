package com.project;

import com.project.configuration.MyConfig;
import com.project.entity.Client;
import com.project.logic.RequestDispatcher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


public class App {
    public static void main(String[] args) {


        try (AnnotationConfigApplicationContext configApplicationContext =
                     new AnnotationConfigApplicationContext(MyConfig.class)) {

            RequestDispatcher requestDispatcher =
                    configApplicationContext
                            .getBean("requestDispatcher", RequestDispatcher.class);

            List<Client> allClients = requestDispatcher.getAllClients();
            System.out.println(allClients);

//            Client client = requestDispatcher.getClient(5);
//            System.out.println(client);
//
//            Client client = new
//                    Client("TestClient", "TestClient", 99999, "visa_basic");
//            client.setId(130);
//            requestDispatcher.saveClient(client);
//
//            requestDispatcher.deleteClient(4);


        }
    }
}
