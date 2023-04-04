package framework;
import java.util.Map;

// Kelas ini tidak boleh dimodifikasi
public class Request {
    private static int currentId = 0;

    private String path;
    private User user;
    private Map<String, String> query;

    public Request(String path, User user, Map<String, String> query){
        this.path = path;
        this.user = user;
        this.query = query;
    }

    public String getPath(){
        return path;
    }

    public User getUser(){
        return user;
    }

    public String getQuery(String key){
        return query.getOrDefault(key, "");
    }
}
