package lang.object.equals;

import java.util.Objects;

public class UserV2 {

    private String id;

    public UserV2(String id) {
        this.id = id;
    }

//    @Override
//    public boolean equals(Object object) {
//        UserV2 user = (UserV2) object;
//        return id.equals(user.id);
//    }


    /**
     * 정확한 equals 구현
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserV2 userV2 = (UserV2) o;
        return Objects.equals(id, userV2.id);
    }

    //추후에 설명
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }
}
