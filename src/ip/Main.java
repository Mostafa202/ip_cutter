package ip;

public class Main {

    public static void main(String[] args) {

        String ip="192.162.11.0";
        String [] parts=ip.split("\\.");

        int arr[]=new int[parts.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(parts[i]);
            System.out.println(arr[i]);
        }


    }
}
