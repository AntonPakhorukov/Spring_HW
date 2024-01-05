package HW_01_Gradle;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GsonParser {
    Gson gson = new Gson();
    public void writeToJson(Root root){
        try (FileWriter writer = new FileWriter("myJson.json")){
            //Переводим объект в формат строки json
            String json = gson.toJson(root);
            //Записываем строку в файл json
            writer.write(json);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public Root parse(){
        try (FileReader reader = new FileReader("myJson.json")) {
            // Закидываем reader и тип объекта, который хотим прочитать
            Root root = gson.fromJson(reader, Root.class);
            return root;
        } catch (Exception e){
            System.out.println("Parser error " + e.toString());
        }
        return null;
    }
}
