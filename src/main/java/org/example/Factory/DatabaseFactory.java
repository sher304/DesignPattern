package org.example.Factory;

public class DatabaseFactory {
    public static IDatabase createDatabase(DatabaseType databaseType) {
        switch (databaseType) {
            case SqlServer -> {
                return new SqlServerDatabase();
            }
            case Oracle -> {
                return new OracleDatabase();
            }
            default -> {
                throw new IllegalArgumentException("Wrong database type!");
            }
        }
    };
}
