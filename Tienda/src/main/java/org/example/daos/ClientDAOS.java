package org.example.daos;

import java.util.List;
import java.util.Objects;

public class ClientDAOS implements IClientDAOS {

    private int idClient;
    private String name;
    private String lastName;
    private String rfc;
    private String curp;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClientDAOS clientDAOS)) return false;

        return idClient == clientDAOS.idClient && Objects.equals(name, clientDAOS.name) && Objects.equals(lastName, clientDAOS.lastName) && Objects.equals(rfc, clientDAOS.rfc) && Objects.equals(curp, clientDAOS.curp);
    }

    @Override
    public int hashCode() {
        int result = idClient;
        result = 31 * result + Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(lastName);
        result = 31 * result + Objects.hashCode(rfc);
        result = 31 * result + Objects.hashCode(curp);
        return result;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    @Override
    public boolean addClient(ClientDAOS clientDAOS) {
        return false;
    }

    @Override
    public boolean deleteClient(ClientDAOS clientDAOS) {
        return false;
    }

    @Override
    public boolean updateClient(ClientDAOS clientDAOS) {
        return false;
    }

    @Override
    public boolean searchClient(ClientDAOS clientDAOS) {
        return false;
    }

    @Override
    public List<ClientDAOS> ListClients() {
        return List.of();
    }
}
