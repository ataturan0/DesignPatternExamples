package ProxyPattern;

public class DatabaseQueryExecuterImpl implements DatabaseQueryExecuter {
    @Override
    public void executeQuery(String query) throws Exception {
        System.out.println("Going to execute query => " + query);
    }
}
