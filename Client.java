
public class Client {
    int Id;
    int Age;
    String Name;

    Client (int id, int age, String name)
    {
        Id = id;
        Age = age;
        Name = name;
        // Client newC = new Client(2,22,Vasya)
    }

    @Override
    public int hashCode()
    {
        return Id;
    }
}
