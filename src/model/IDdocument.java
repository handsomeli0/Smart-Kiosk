package model;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class IDdocument {
    private String idNum;
    private String firstName;
    private String lastName;

    public IDdocument(String idNum, String firstName, String lastName) {
        this.idNum = idNum;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

//    public static void main(String[] args) {
//        ArrayList<IDdocument> arrayList = new ArrayList<>();
//        arrayList.add(new IDdocument("id01", "Tom", "Bliboo"));
//        arrayList.add(new IDdocument("id02", "Makka", "Pakka"));
//        arrayList.add(new IDdocument("id03", "Upsy", "Daisy"));
//        arrayList.add(new IDdocument("id04", "Iggle", "Piggle"));
//        JSONArray jsonArray = (JSONArray) JSON.toJSON(arrayList);
//        System.out.println(jsonArray);
//    }
}
