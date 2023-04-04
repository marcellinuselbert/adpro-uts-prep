import java.util.Map;
import java.util.HashMap;
import framework.*;
import middleware.PathHandler;
import middleware.RoleHandler;
import endpoints.*;

public class CoRMain {

    public static void main(String[] args) {
        User affan = new User("Affan", "user");
        User tian = new User("Tian", "staff");

        // Contoh cara menjalankan endpoint Hello World.
        Map<String, String> query = new HashMap<>();
        query.put("name", "Ichlasul Affan");
        Request request = new Request("/hello-world", affan, query);
        getHelloWorldHandler().handle(request);

        // Contoh yang akan gagal ketika menjalankan endpoint Hello World.
        Request requestFail = new Request("/hello-comrade", affan, query);
        getHelloWorldHandler().handle(requestFail);
    }

    private static Handler getHelloWorldHandler() {

        PathHandler pathHandler = new PathHandler();
        RoleHandler roleHandler = new RoleHandler();
        HelloWorldEndpoint helloHandler = new HelloWorldEndpoint();
        pathHandler.setNextHandler(roleHandler);
        roleHandler.setNextHandler(helloHandler);

        // Ini adalah salah satu contoh static method yang nantinya akan mendefinisikan
        // endpoint yang bisa diakses, beserta rangkaian validasi yang dibutuhkan.
        // Tugas kalian adalah melengkapi bagian ini sehingga terbentuk rangkaian
        // handler HelloWorldEndpoint.
        // proses validasi dari saat Request mulai di-handle hingga sampai ke

        return pathHandler;
    }

    // Tambahkan definisi endpoint Anda sendiri dengan pola yang sama seperti yang
    // telah kalian buat untuk endpoint Hello World.
}
