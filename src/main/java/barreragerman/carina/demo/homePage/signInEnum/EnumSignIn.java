package barreragerman.carina.demo.homePage.signInEnum;

public enum EnumSignIn {
// this Enum is only available when the locators have a slice difference among them
    USER("email"),
    PASSWORD("pass");
    private final String id;

    EnumSignIn(String id) {
        this.id = id;
    }

    public String getId(){
        return this.id;
    }
}
