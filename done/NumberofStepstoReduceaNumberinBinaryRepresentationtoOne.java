package done;

public class NumberofStepstoReduceaNumberinBinaryRepresentationtoOne {
    public int numSteps(String s) {
        if (s.length() == 1) {
            return 0;
        }

        return numSteps(0, s);
    }

    public int numSteps(int steps, String s) {
        System.out.println(steps + "\t" + s);

        if (s.length() == 1) {
            return steps;
        }

        int lastIndex = s.length() - 1;
        if (s.charAt(lastIndex) == '0') {
            return numSteps(steps + 1, s.substring(0, lastIndex));
        }

        StringBuilder builder = new StringBuilder();
        boolean vume = true;
        while (lastIndex >= 0 && vume) {
            vume = false;
            if (s.charAt(lastIndex) == '1') {
                builder.insert(0, "0");
                vume = true;
            }
            else {
                builder.insert(0, "1");
            }
            lastIndex--;
        }

        builder.insert(0, s.substring(0, lastIndex + 1));
        if (vume)
            builder.insert(0, 1);
        return numSteps(steps + 1, builder.toString());
    }
}
