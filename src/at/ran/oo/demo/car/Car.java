package at.ran.oo.demo.car;

public class Car {
    public static void main(String[] args) {
        String data = "ABDCDDSeefdaAFDdeee";
        char[] arr = data.toCharArray();

        String outU = "";
        String outL = "";

        for (int i = 0; i < arr.length; i++) {
            if (Character.isUpperCase(arr[i])){
                outU += arr[i];
            } else {
                outL += arr[i];
            }
        }

        System.out.println(outU);
        System.out.println(outL);


    }

}
