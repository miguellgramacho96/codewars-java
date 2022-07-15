package katatraining.persistentbugger;

public class Persist {
    public static int persistence(long n) {
        String strOfNo = String.valueOf(n);
        int multiplicativePersistence = 0;

        if (strOfNo.length() == 1) {
            return multiplicativePersistence;
        }

        while (strOfNo.length() > 1) {
            int result = 1;
            for (int i = 0; i < strOfNo.length(); i++) {
                result *= Integer.parseInt(strOfNo.substring(i, i+1));
            }
            multiplicativePersistence++;
            strOfNo = String.valueOf(result);
        }

        return multiplicativePersistence;
    }
}
