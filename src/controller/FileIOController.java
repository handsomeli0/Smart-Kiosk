package controller;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;
import java.awt.image.BufferedImage;
import java.io.*;
/**
 * This class is used to manage peripherals.
 *
 * @author Minghan Li
 * @version 1.1
 */

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

    /**
     * Write strings into an image file.
     *
     * @param name file name
     * @param strs Strings to be written. Each element corresponds to one line.
     * @throws IOException IOException
     */
    protected static void writeImage(String name, String[] strs) throws IOException {
        BufferedImage image = DataController.createImage(strs);
        File file = new File("./peripherals/");
        String fileName = name + ".jpg";
        File jpgFile = new File(file, fileName);
        if (!jpgFile.exists()) {
            jpgFile.createNewFile();
        }
        ImageOutputStream imageOutputStream = ImageIO.createImageOutputStream(jpgFile);

        ImageIO.write(image, "jpg", imageOutputStream);
        imageOutputStream.close();
    }
}
