package syn.rmi;

import java.rmi.registry.*;

// Клиент RMI
public class RmiClient {
    final static String HOST = "localhost"; // Адрес сервера

    public static void main(String... args) throws Exception {
        Registry server = LocateRegistry.getRegistry(HOST, IRemoteService.PORT);
        IRemoteService remoteService = (IRemoteService) server.lookup(IRemoteService.SERVICE_NAME);
        System.out.println(remoteService.getData(new Value(1, 2, 3)));
        System.out.println(remoteService.getData(new Value(6, 9, 1)));
        remoteService.stopServer();
    }
}
