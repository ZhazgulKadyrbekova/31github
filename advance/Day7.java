package advance;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class Day7 {
//905000 - too low
    public static void main(String[] args) throws IOException {
        Map<HandType, List<HandBid>> handBidMap = getInputList();

        Response response = new Response(0, 1);
        System.out.println(HandType.HIGH_CARD);
        response = print(handBidMap.get(HandType.HIGH_CARD), response);

        System.out.println(HandType.ONE_PAIR);
        response = print(handBidMap.get(HandType.ONE_PAIR), response);

        System.out.println(HandType.TWO_PAIR);
        response = print(handBidMap.get(HandType.TWO_PAIR), response);

        System.out.println(HandType.THREE_OF_A_KIND);
        response = print(handBidMap.get(HandType.THREE_OF_A_KIND), response);

        System.out.println(HandType.FULL_HOUSE);
        response = print(handBidMap.get(HandType.FULL_HOUSE), response);

        System.out.println(HandType.FOUR_OF_A_KIND);
        response = print(handBidMap.get(HandType.FOUR_OF_A_KIND), response);

        System.out.println(HandType.FIVE_OF_A_KIND);
        response = print(handBidMap.get(HandType.FIVE_OF_A_KIND), response);

        System.out.println(response.sum);
    }

    public static Response print(List<HandBid> handBids, Response response) {
        long sum = response.sum;
        int count = response.count;
        handBids.sort(new CardComparator());
        for (HandBid handBid : handBids) {
            sum += (long) handBid.bid * (count++);
            System.out.println(handBid + "\t" + count + "\t" + sum);
        }
        return new Response(sum, count);
    }

    static class CardComparator implements Comparator<HandBid> {

        @Override
        public int compare(HandBid handBid1, HandBid handBid2) {
            String card1 = handBid1.hand;
            String card2 = handBid2.hand;
            int minLength = Math.min(card1.length(), card2.length());

            for (int i = 0; i < minLength; i++) {
                char char1 = card1.charAt(i);
                char char2 = card2.charAt(i);

                String order = "23456789TJQKA";
                int index1 = order.indexOf(char1);
                int index2 = order.indexOf(char2);

                if (index1 != index2) {
                    return Integer.compare(index1, index2);
                }
            }

            return Integer.compare(card1.length(), card2.length());
        }
    }

    public static Map<HandType, List<HandBid>> getInputList() throws IOException {
        return Files
                .readAllLines(Path.of("src/advance/input.txt"))
                .stream().map(input -> {
                    String[] inputSplit = input.split(" ");
                    var handBid = new Day7.HandBid();
                    handBid.hand = inputSplit[0];
                    handBid.bid = Integer.parseInt(inputSplit[1]);
                    handBid.type = getHandType(handBid);
                    return handBid;
                })
                .collect(Collectors.groupingBy(h -> h.type));
    }

    public static HandType getHandType(HandBid handBid) {
        String code = handBid.hand;
        Collection<Long> values = code.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .values();

        var size = values.size();
        switch (size) {
            case 1:
                return HandType.FIVE_OF_A_KIND;
            case 2: {
                if (values.contains(4L))
                    return HandType.FOUR_OF_A_KIND;
                return HandType.FULL_HOUSE;
            }
            case 3: {
                if (values.contains(3L))
                    return HandType.THREE_OF_A_KIND;
                return HandType.TWO_PAIR;
            }
            case 4:
                return HandType.ONE_PAIR;
            case 5:
                return HandType.HIGH_CARD;
            default:
                return null;
        }
    }

    public static class HandBid {

        private String hand;
        private int bid;
        private HandType type;

        @Override
        public String toString() {
            return "HandBid: hand - " + hand + ", bid - " + bid;// + "\n";//  + ", type - " + type;
        }
    }

    public enum HandType {
        FIVE_OF_A_KIND,     //5
        FOUR_OF_A_KIND,     //4,1
        FULL_HOUSE,         //3,2
        THREE_OF_A_KIND,    //3,1,1
        TWO_PAIR,           //2,2,1
        ONE_PAIR,           //2,1,1,1
        HIGH_CARD           //1,1,1,1,1

    }

    public static class Response {
        long sum;
        int count;
        
        Response(long sum, int count) {
            this.count = count;
            this.sum = sum;
        }
    }
}