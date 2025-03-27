# NetCommHub - Group-Based Communication System

A robust networked distributed system for group-based client-server communication with a graphical user interface.

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Java Version](https://img.shields.io/badge/Java-17%2B-blue)](https://www.java.com)

## 📚 Overview

NetCommHub is a distributed communication platform that enables real-time messaging between multiple clients through a central server. It implements a coordinator-based architecture where one client serves as the group coordinator with elevated privileges for managing communication and member information.

The system handles dynamic membership, with clients able to join and leave at any time, and ensures fault tolerance through automatic coordinator reassignment. NetCommHub provides both broadcast messaging to all members and private direct messaging between specific clients through an intuitive tabbed interface.

## 🚀 Features

- **Dynamic Group Management**: Members can join and leave groups at any time
- **Coordinator Election**: Automatic selection of a coordinator when members join or leave
- **Member Discovery**: Members can request and view details about other participants
- **Fault Tolerance**: System continues functioning when members leave or disconnect
- **Real-time Messaging**: Direct messaging and broadcast capabilities
- **Intuitive UI**: Tab-based graphical interface with notifications for new messages

## 📋 Requirements

- Java 8 or higher
- Network connection between server and clients

## 🛠️ Installation

1. Clone the repository or download the source code
2. Navigate to the project directory:
   ```bash
   cd NetCommHub-App
   ```
3. Compile the project (or use the provided batch files):
   ```bash
   javac -d out src/main/java/com/netcommhub/Main.java src/main/java/com/netcommhub/client/*.java src/main/java/com/netcommhub/client/ui/*.java src/main/java/com/netcommhub/client/handlers/*.java src/main/java/com/netcommhub/server/*.java src/main/java/com/netcommhub/common/message/*.java src/main/java/com/netcommhub/common/util/*.java
   ```

## 💻 Usage

### Using the Batch Files (Windows)

1. Start the server:
   ```
   run-server.bat
   ```

2. In a separate command prompt, start one or more clients:
   ```
   run-client.bat
   ```

### Manual Execution

#### Starting the Server

```bash
java -cp out com.netcommhub.Main server
```

The server will start on port 59001 (default).

#### Starting a Client

```bash
java -cp out com.netcommhub.Main client
```

### Using the Application

1. When starting a client, you'll be prompted to:
   - Enter the server's IP address (e.g., 127.0.0.1 for localhost)
   - Enter the server's port (59001)
   - Choose a screen name (alphabetic characters only)

2. The first client to connect becomes the coordinator and can see all member details

3. Communication Features:
   - **Broadcast**: Send messages to all connected clients using the "Broadcast" tab
   - **Direct Messaging**: Select a recipient from the "Recipient" menu or click on an existing tab
   - **Member Details**: Click the "Detail Request" button to view information about connected members

## 🏗️ Architecture

NetCommHub implements a client-server architecture with:
- Central server for message routing and coordination
- First-connected client acts as coordinator with special privileges
- Automatic coordinator reassignment if the current coordinator disconnects
- Tab-based UI for managing multiple conversations

## 🧪 Testing

The project includes JUnit tests for various components. Run the test suite with:

```bash
java -cp out:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore com.netcommhub.AllTests
```

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

See the [CONTRIBUTING.md](CONTRIBUTING.md) file for detailed guidelines on how to contribute.

## 📬 Contact

This project was developed as a team by:
- [Nir Peretz](https://github.com/PeretzNiro)
- [Stefano Veglia](https://github.com/Steveglia)
- [Francesco Murgioni](https://github.com/Fmurgioni94)

Project Link: [https://github.com/PeretzNiro/NetCommHub](https://github.com/PeretzNiro/NetCommHub)