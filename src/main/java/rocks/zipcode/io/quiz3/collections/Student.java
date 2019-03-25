package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    private List<Lab> labs;

    public Student() {
        this(new ArrayList<>());
    }

    public Student(List<Lab> labs) {
        this.labs = labs;
    }

    public Lab getLab(String labName) {
        for (Lab lab : labs) {
            if(labName == lab.getName()){
                return lab;
            }
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        try {
            getLab(labName).setStatus(labStatus);
        } catch (NullPointerException e){
            throw new UnsupportedOperationException();
        }
    }

    public void forkLab(Lab lab) {
        lab.setStatus(LabStatus.PENDING);
        labs.add(lab);
    }

    public LabStatus getLabStatus(String labName) {
        return getLab(labName).getStatus();
    }

    @Override
    public String toString() {
        String list = "";

        for (int i = labs.size() - 1; i >=0 ; i--) {
            list += labs.get(i).getName() + " > " + labs.get(i).getStatus() + "\n";
        }
//        for (Lab lab : labs) {
//            list += lab.getName() + " > " + lab.getStatus() + "\n";
//        }
        list = list.substring(0,list.length() - 1);
        return list;


//        "duplicate deleter > COMPLETED\nlearner lab > PENDING"
    }
}
