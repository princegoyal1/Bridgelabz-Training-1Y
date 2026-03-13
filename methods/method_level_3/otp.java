public class OTPGenerator {

    public static int otp() {
        return (int)(Math.random() * 900000) + 100000;
    }

    public static boolean checkUnique(int[] arr) {

        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] == arr[j])
                    return false;

        return true;
    }

    public static void main(String[] args) {

        int[] otp = new int[10];

        for (int i = 0; i < 10; i++) {
            otp[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + " = " + otp[i]);
        }

        if (checkUnique(otp))
            System.out.println("All OTPs are unique");
        else
            System.out.println("Some OTPs are same");
    }
}