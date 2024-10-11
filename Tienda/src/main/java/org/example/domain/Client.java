package org.example.domain;


import com.mysql.cj.protocol.Resultset;
import org.example.daos.ClientDAOS;
import org.example.daos.IClientDAOS;
import org.example.connection.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Client implements IClientDAOS {

    private int idClient;
    private String name;
    private String lastName;
    private String rfc;
    private String curp;

    public List<Client> listClient() {
        List<Client> clients = new LinkedList<>();
        PreparedStatement ps;
        Resultset rst;
        Connection conn = DBConnection.getConnection();
        var sql = "SELECT idcliente, nombre, apellido, rfc, curp FROM cliente";

        try {
            ps = conn.prepareStatement(sql);
            rst = (Resultset) ps.executeQuery();
            while (((java.sql.ResultSet) rst).next()) {
                Client client = new Client();
                client.setIdClient(((java.sql.ResultSet) rst).getInt("idcliente"));
                client.setName(((java.sql.ResultSet) rst).getString("nombre"));
                client.setLastName(((java.sql.ResultSet) rst).getString("apellido"));
                client.setRfc(((java.sql.ResultSet) rst).getString("rfc"));
                client.setCurp(((java.sql.ResultSet) rst).getString("curp"));
                clients.add(client);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return clients;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client client)) return false;

        return idClient == client.idClient && Objects.equals(name, client.name) && Objects.equals(lastName, client.lastName) && Objects.equals(rfc, client.rfc) && Objects.equals(curp, client.curp);
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
