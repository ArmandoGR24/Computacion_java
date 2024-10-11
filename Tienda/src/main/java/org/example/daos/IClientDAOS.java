package org.example.daos;

import java.util.List;

public interface IClientDAOS {

    boolean addClient(ClientDAOS clientDAOS);
    boolean deleteClient(ClientDAOS clientDAOS);
    boolean updateClient(ClientDAOS clientDAOS);
    boolean searchClient(ClientDAOS clientDAOS);

    List<ClientDAOS> ListClients();
}
