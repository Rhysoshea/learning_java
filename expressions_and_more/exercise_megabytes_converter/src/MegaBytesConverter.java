public class MegaBytesConverter {
    
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.err.println("Invalid Value");
        } else {
            int megaBytes = Math.round(kiloBytes / 1024); // 1024KB = 1MB
            int remainder = kiloBytes - (megaBytes * 1024);

            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB");
        }


        
    }

}
