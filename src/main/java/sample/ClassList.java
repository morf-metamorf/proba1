package sample;

public class ClassList implements InterfaceList {

    String[] stringList = new String[3];
    int size = 0;
    int finSize = 3;


    public String get(int i) {
        return stringList[i];
    }

    public void add(String str) {
        if (size == stringList.length - 1) {

            String[] stringListTmp = new String[stringList.length * 2];
            for (int i=0; i<stringList.length; i++) {
                stringListTmp[i] = stringList[i];
            }
            stringList=stringListTmp;
        }

        stringList[size] = str;
        size++;
    }

    public void delete(int index) {
        for (int i = index; i < size; i++) {
            stringList[i] = stringList[i + 1];
        }
        stringList[size - 1] = null;
        size--;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append( "[");
        for (int i=0; i<size; i++) {
            str.append(stringList[i]);
            if(i!=size-1) {
                str.append(", ");
            }
        }
        str.append("]");
        return str.toString();
    }
}
