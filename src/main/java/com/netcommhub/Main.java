package com.netcommhub;

import com.netcommhub.client.Client;
import com.netcommhub.server.Server;

/**
 * Main entry point for NetCommHub application.
 * Supports running both server and client components.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            displayUsageInstructions();
            return;
        }

        try {
            if (args[0].equalsIgnoreCase("server")) {
                System.out.println("Starting NetCommHub Server...");
                Server.main(removeFirstArg(args));
            } else if (args[0].equalsIgnoreCase("client")) {
                System.out.println("Starting NetCommHub Client...");
                Client.main(removeFirstArg(args));
            } else {
                System.out.println("Invalid option: " + args[0]);
                displayUsageInstructions();
            }
        } catch (Exception e) {
            System.err.println("Error running application: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }

    private static void displayUsageInstructions() {
        System.out.println("NetCommHub - Group-Based Communication System");
        System.out.println("============================================");
        System.out.println("Usage:");
        System.out.println("  1. First start the server:");
        System.out.println("     java -cp out com.netcommhub.Main server");
        System.out.println("");
        System.out.println("  2. Then start one or more client instances:");
        System.out.println("     java -cp out com.netcommhub.Main client");
        System.out.println("");
        System.out.println("For multiple chat clients, run the client command in multiple terminals.");
    }

    private static String[] removeFirstArg(String[] args) {
        if (args.length <= 1) {
            return new String[0];
        }
        
        String[] newArgs = new String[args.length - 1];
        System.arraycopy(args, 1, newArgs, 0, args.length - 1);
        return newArgs;
    }
}