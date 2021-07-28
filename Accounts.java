import java.util.ArrayList;

public class Accounts {
    int Id;
    int ClientId;

    Accounts (int id,int clientId)
    {
        Id = id;
        ClientId = clientId;
    }

    @Override
    public int hashCode()
    {
        return Id;
    }
}
