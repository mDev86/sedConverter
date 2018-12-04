package conv.POJO;

/**
 * KindId - В деле - Directum
 * 0 – Не определенная - Approving
 * 1 – Авторская - Approving
 * 2 – Согласующая - Authentication
 * 3 – Утверждающая - Approving
 * 4 – Удостоверяющая - Approving
 * 5 – Ознакомительная - Approving
 **/
public enum SignType {
    Approving (3),
    Authenticating (2);

    private final int index;
    SignType(int i) {
        this.index = i;
    }

    public int getIndex(){
        return index;
    }

    public static String getName(int ind){
        switch (ind){
            case 2 : return Authenticating.name();
            default: return Approving.name();
        }
    }

}



