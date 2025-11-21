package org.example.Factory;

public class DataAnalyticsEngine {

    private IDatabase database;

    public DataAnalyticsEngine(IDatabase database) {
        this.database = database;
    }

    public void processData(String query) {
        database.connect();
        database.executeQuery(query);
    }
}
