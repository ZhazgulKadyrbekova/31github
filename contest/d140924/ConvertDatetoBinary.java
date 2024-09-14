package contest.d140924;

public class ConvertDatetoBinary {
    public String convertDateToBinary(String date) {
        String[] dateArr = date.split("-");

        StringBuilder sb = new StringBuilder();
        for (String d : dateArr) {
            int day = Integer.parseInt(d);
            sb.append(toBinary(day)).append("-");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public String toBinary(int num) {
        StringBuilder sb = new StringBuilder();
        while (num > 1) {
            int remainder = num % 2;
            sb.insert(0, remainder);
            num /= 2;
        }
        sb.insert(0, 1);
        return sb.toString();
    }
}
