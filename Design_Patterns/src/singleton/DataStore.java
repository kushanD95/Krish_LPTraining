package singleton;

public class DataStore {

    static DataStore dataStore;
    Long id;
    String name;
    String[] masterData;


    private DataStore(){
        if(dataStore != null) {
            throw new RuntimeException("Please used getDataStore method to get instance");
        }
    }

    public static DataStore getDataStore() {
        if(dataStore == null) {
            synchronized (DataStore.class) {
                if(dataStore == null) {
                    dataStore = new DataStore();
                }
            }
        }
        return dataStore;
    }

    protected void setValues(long id, String name, String[] masterData) {
        setId(id);
        setName(name);
        setMasterData(masterData);
    }

    public Long getId() {
        return id;
    }

    private void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String[] getMasterData() {
        return masterData;
    }

    private void setMasterData(String[] masterData) {
        this.masterData = masterData;
    }
}
