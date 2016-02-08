package sample;

public class Main {


    String aboutCat = "Кот - это звучит гордо, а если наступить на хвост, то громко";


    public void outText() {
        System.out.println(aboutCat);
        }

    public static void main(String[] args) {
     //   Main nnn = new Main();
     //   nnn.outText();
        InterfaceList listExmpl = new ClassList();
        listExmpl.add("0");
        listExmpl.add("1");
        listExmpl.add("2");
        listExmpl.add("3");

        System.out.println("size = " + listExmpl.size());
        System.out.println("second el " + listExmpl.get(2));
        listExmpl.delete(2);
        System.out.println("second el " + listExmpl.get(2));
        System.out.println("size = " + listExmpl.size());
        System.out.println("");
        System.out.println(listExmpl.toString());

    }

    public String getSumResult(int a, int b) {
        return "" + a + b;
    }


}
