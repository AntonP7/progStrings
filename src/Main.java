import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {


        String politeh ="Нижегородский  государственный технический университет гоимени Ростислава Евгеньевича Алексеева";

            int counterletter = 0;
            /* while (politeh.contains("го")){
            counterletter++;
             politeh = politeh.substring(politeh.indexOf("го")+1);
        }*/
        politeh=politeh.replaceAll("го","*");
        for ( int i = 0; i<politeh.length(); i++){
            if (politeh.charAt(i)=='*') counterletter++;

            System.out.println(counterletter);

        }
        String fRes =String.format("%.3f",500.0000123);
        System.out.println(fRes);

        DecimalFormat decimalFormat =new DecimalFormat("#.###");
        String cRes=decimalFormat.format(500.0000123);
        System.out.println(cRes);
          /*  StringTokenizer st01 = new StringTokenizer(politeh,"е");
          try{
              throw new FileNotFoundException();
          }
          catch (StringIndexOutOfBoundsException e){
              System.out.println("Incorrect index");
              System.out.println(e.getMessage());
          }
          catch (ArithmeticException e){
              System.out.println("Division by zero");
          } catch (FileNotFoundException e) {
              System.out.println("FileSystemNotFound");
          }
        System.out.println("here");
       FileWriter fw1= new FileWriter("1.txt",true);
        fw1.write("Hello one more time");
        fw1.flush();
        fw1.close();*/


    }

}









   // public static void meth1(int arg1){
       // System.out.println(""+(25/arg1));


