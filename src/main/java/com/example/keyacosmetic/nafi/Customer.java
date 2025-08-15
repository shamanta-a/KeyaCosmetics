public class Customer {
    private String customerId;
    private String name;
    private String preferences;
    private String location;
    private String behavior;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPreferences() {
        return preferences;
    }

    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;

    }

    public Customer(String customerId, String name, String preferences, String location, String behavior) {
        this.customerId = customerId;
        this.name = name;
        this.preferences = preferences;
        this.location = location;
        this.behavior = behavior;


    }}
