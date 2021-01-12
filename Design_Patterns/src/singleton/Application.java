package singleton;

public class Application {

    public static void main(String[] args) {

        //DataStore instance
        DataStore dataStore = DataStore.getDataStore();

        //set values
        String[] masterData = new String[]{"AB", "BC","CD"};
        dataStore.setValues(01,"sanuka", masterData);

        //print values in data store
        printDataStore(dataStore);

        // get new instance
        DataStore dataStore1 = DataStore.getDataStore();

        //print second time Datastore
        printDataStore(dataStore1);

    }

    private static void printDataStore(DataStore dataStore){
        System.out.print("Id:\t" + dataStore.getId() + "\nName :\t" +dataStore.getName() + "\nMasterData:\t");
        for (String data:dataStore.getMasterData()) {
            System.out.print(data + "\t");
        }
        System.out.println("\n_________________________________________________________________________________");
    }
}
