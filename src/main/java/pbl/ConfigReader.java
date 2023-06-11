package pbl;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ConfigReader
{
    static String CONFIG_FILE_PATH = new String("input.data");

    static public Integer GetValue(String valName)
    {
        try (BufferedReader reader = new BufferedReader(new FileReader(CONFIG_FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("=");
                if (parts.length != 2)
                    continue;

                String name = parts[0].trim();
                if (name.equals(valName))
                    return Integer.parseInt(parts[1].trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return 0;
    }

}
