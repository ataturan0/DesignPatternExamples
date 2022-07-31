package ProxyPattern;

public class ProxyPatternDemo {
    public static void main(String [] args) throws Exception {

        //admin user should be able to execute all queries,
        DatabaseQueryExecuter adminExecuter = new DatabaseQueryExecuterProxy("Admin","Admin1234");
        adminExecuter.executeQuery("DELETE");
        adminExecuter.executeQuery("OTHER QUERIES");

        //non admin users are not allowed to execute delete queries, this will throw exception
         DatabaseQueryExecuter nonAdminExecuter = new DatabaseQueryExecuterProxy("NonAdmin","Admin1234");
         nonAdminExecuter.executeQuery("OTHER QUERIES");
         nonAdminExecuter.executeQuery("DELETE");
    }
}
