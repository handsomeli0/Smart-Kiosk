package controller;

import java.io.*;

public class FileIOController {

    /**
     * This method is used to read the data from a json file.
     *
     * @param name file name
     * @return data of the file in String format
     * @throws IOException IOException
     */
    protected static String readJSON(String name) throws IOException {
        String line = "";
        FileReader fileReader = new FileReader("./data/" + name);
        BufferedReader br = new BufferedReader(fileReader);
        StringBuffer sb = new StringBuffer();
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();
        fileReader.close();

        return sb.toString();
    }

    /**
     * Write String data into a json file
     *
     * @param name filename
     * @param str  data to be written
     * @throws IOException IOException
     */
    protected static void writeJSON(String name, String str) throws IOException {
        FileWriter fw = new FileWriter(name);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(str);
        bw.close();
        fw.close();
    }
}
