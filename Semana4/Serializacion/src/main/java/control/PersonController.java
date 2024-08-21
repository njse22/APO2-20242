package control;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.Person;

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

    public void save(){
        // el objeto que nos ayuda con al serialización
        Gson gson = new Gson();

        // Formateamos la información (arraylist -> JSON)
        String dataJson = gson.toJson(people);
        // System.out.println(dataJson);

        try {
            // inicializar los recursos
            createResources();

            // Enlazar la información con el archivo
            FileOutputStream fos = new FileOutputStream(this.listJson);
            // Escritor de la información
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fos));

            // Escribir la información
            writer.write(dataJson);
            // limpiar el buffer
            writer.flush();
            // cerrar el buffer
            writer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void load(){
        Gson gson = new Gson();

        try {
            // enlazador de la información
            FileInputStream fis = new FileInputStream(this.listJson);

            BufferedReader reader = new BufferedReader(new InputStreamReader(fis));

            String line = "";
            String data = "";

            while ( (line = reader.readLine()) != null ){
               data += line;
            }
            reader.close();

            // https://stackoverflow.com/questions/20773850/gson-typetoken-with-dynamic-arraylist-item-type
            Type listType = new TypeToken<ArrayList<Person>>(){}.getType();
            people = gson.fromJson(data, listType);

        } catch (FileNotFoundException e) {
           e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
