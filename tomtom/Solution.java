package tomtom;

import java.util.*;


class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        String a = s.solution("John Doe; Peter Benjamin Parker; Mary Jane Watson-Parker; John Elvis Doe; John Evan Doe; Jane Doe; Peter Brian Parker", "Example");
        System.out.println(a);
    }
    public String solution(String S, String C) {
        StringBuilder builder = new StringBuilder();
        List<String> emailPrefixes = new ArrayList<>();
        String[] employeeNames = S.split("; ");
        for (String employee : employeeNames) {
            String[] employeeName = employee.split(" ");
            String email;
            String first;
            String last;
            if (employeeName.length == 3) {
                first = employeeName[0].toLowerCase();
                last = employeeName[2].replace("-", "").toLowerCase();
            }
            else {
                first = employeeName[0].toLowerCase();
                last = employeeName[1].replace("-", "").toLowerCase();
            }
            if (last.length() > 8) {
                last = last.substring(0, 8);
            }
            email = "<" + first + "." + last;
            int counter = 2;
            String count = "";
            while (emailPrefixes.contains(email + count)) {
                counter++;
                count = String.valueOf(counter);
            }
            emailPrefixes.add(email + count);
            email += count + "@" + C + ".com>";

            builder.append(employee).append(" ").append(email.toLowerCase()).append("; ");
        }

        return builder.toString();
    }
}