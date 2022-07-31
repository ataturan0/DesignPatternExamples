package ProxyPattern;

public class DatabaseQueryExecuterProxy implements DatabaseQueryExecuter{

        boolean isAdmin;
        DatabaseQueryQueryExecuterImpl executer;

        public DatabaseQueryExecuterProxy(String name, String password){
            if(name.equals("Admin") && password.equals("Admin1234")){
                isAdmin=true;
            }
            executer = new DatabaseQueryQueryExecuterImpl();
        }

    @Override
    public void executeQuery(String query) throws Exception {
        if(isAdmin){
            executer.executeQuery(query);
        }
        else{
            if(query.equals("DELETE")){
                throw new Exception("DELETE operation is not allowed for non-admin users");
            }
            else{
                executer.executeQuery(query);
            }
        }
    }
}
