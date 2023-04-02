import java.io.*;
class CharacterCount 
{

    public static void main(String[] args) {
        String fileName = "D:\\HeroVired.txt";
        int charCount = 0;
        try {
            FileReader fileReader = new FileReader(fileName);
            int c = fileReader.read();
            while (c != -1) {
                charCount++;
                c = fileReader.read();
            }
            fileReader.close();
            System.out.println("Total number of characters in file are: " + charCount);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
