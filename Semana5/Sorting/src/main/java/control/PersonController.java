package control;

import model.Person;
import model.PersonCCComparator;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class PersonController {

    private File data;
    private File listJson;

    private ArrayList<Person> people;

    public PersonController(){
        people = new ArrayList<>();
        File projectDir = new File(System.getProperty("user.dir"));

        // Win -> C:\\Users\\user\\Documents\\
        // Unix -> /home/user/Documents/
        // Linux -> /home/user/Documents/

        // win -> this.data = new File(projectDir+"\\src\\main\\data");
        this.data = new File(projectDir+"/src/main/data");
        this.listJson = new File(data.getAbsoluteFile()+"/people.json");
    }

    public void createResources() throws IOException {
        if(!data.exists()){
            data.mkdir();
            if(!listJson.exists()){
                listJson.createNewFile();
            }
        }
    }

    public void createPerson(String name, int age, String cc){
        Person person = new Person(name, age, cc);
        people.add(person);
    }

    public void clearList(){
        people.removeAll(people);
    }

    public ArrayList<Person> getPeople(){
        return people;
    }

    public ArrayList<Person> selectionSort(ArrayList<Person> toSort){
        int n = toSort.size();
        for (int i = 0; i < n - 1; i++){
            for (int j = i+1; j < n; j++){
                if (toSort.get(i).compareTo(toSort.get(j)) > 0 ){
                   Person prev = toSort.get(i);
                   Person current = toSort.get(j);

                   toSort.set(i, current);
                   toSort.set(j, prev);
                }
            }
        }
        return toSort;
    }

    public ArrayList<Person> insertionSort(ArrayList<Person> toSort) {
        int n = toSort.size();

        for (int i = 1; i < n; i++){
            Person current = toSort.get(i);
            int j = i - 1;
            while (j >= 0 && current.compareTo(toSort.get(j)) < 0 ){
                toSort.set(j+1, toSort.get(j));
                --j;
            }
            toSort.set(j+1, current);
        }
        return toSort;
    }

}
