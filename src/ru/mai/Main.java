package ru.mai;

import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static final byte ERROR_CODE = -1;
    private static final byte GROUP_NUM_NAME_PARTY = 1;
    private static final byte GROUP_NUM_VOICES = 2;
    private static final short NUM_SEATS = 450;

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            ArrayList<String> parties = new ArrayList<>();
            ArrayList<Integer> numVoices = new ArrayList<>();
            ArrayList<Integer> numSeats = new ArrayList<>();

            String inputStr;
            Integer allVoices = 0;
            while (in.hasNextLine()) {
                inputStr = in.nextLine();
                Pattern pat = Pattern.compile("(.+)\\s+([0-9]+)");
                Matcher mat = pat.matcher(inputStr);

                if (mat.find()) {
                    parties.add(mat.group(GROUP_NUM_NAME_PARTY));
                    Integer numVoice = Integer.valueOf(mat.group(GROUP_NUM_VOICES));
                    numVoices.add(numVoice);
                    allVoices += numVoice;
                }
            }

            int firstElectoralQuotient = allVoices / NUM_SEATS;

            int numDistributedPlaces = 0;
            int numSeatsForParty = 0;
            for(int i = 0; i < parties.size(); i++) {
                numSeatsForParty = numVoices.get(i) / firstElectoralQuotient;
                numSeats.add(numSeatsForParty);
                numDistributedPlaces += numSeatsForParty;

            }

            if (numDistributedPlaces < NUM_SEATS) {
                A
                ArrayList<Double> remnants = new ArrayList<>();
                 for()

            }

        } catch (Exception e) {
            System.out.println("ERROR!");
            System.exit(ERROR_CODE);
        }
    }
}
