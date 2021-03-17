package syn.rmi;

import java.rmi.*;

// Интерфейс для описания возможностей сервера
public interface IRemoteService extends Remote {
    String SERVICE_NAME = "rmi";
    int PORT = 1101;
    Object getData(Value data) throws RemoteException;
    void stopServer() throws RemoteException;
}
