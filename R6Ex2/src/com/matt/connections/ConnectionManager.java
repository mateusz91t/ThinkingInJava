package com.matt.connections;

import static com.matt.connections.Connection.*;

public class ConnectionManager {

    private ConnectionManager() {
    }

    private static Connection[] tConnection = new Connection[10];

    public static Connection[] connectionsAccess() {
        return tConnection;
    }

    static Connection newConnection() {
        for (int i = 0; i < tConnection.length; i++) {
            if (tConnection[i] == null) {
                return createConnection();
            }
        }
        return null;
    }

    public static void addConnection() {
        for (int i = 0; i < tConnection.length; i++) {
            if (tConnection[i] == null) {
                tConnection[i] = newConnection();
                break;
            }
        }
    }
}

class Connection {
    private Connection() {
    }

    static Connection createConnection() {
        return new Connection();
    }
}