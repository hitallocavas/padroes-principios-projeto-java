package solid.single_responsibility;

public class Client {

    private Long governmentId;
    private String name;

    public Client(Long governmentId, String name){
        this.governmentId = governmentId;
        this.name = name;
    }

    public Long getGovernmentId() {
        return governmentId;
    }

    public void setGovernmentId(Long governmentId) {
        this.governmentId = governmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Client{" +
                "governmentId:" + governmentId +
                ", name:'" + name + '\'' +
                '}';
    }
}
