package org.example.Factory;

public interface IDatabase {
    void connect();
    void executeQuery(String query);
}
