package usergems;

import java.util.*;
import java.util.stream.Collectors;

@SuppressWarnings("SlowListContainsAll")
public class PersonMatchingTask {
    /* Given two arrays with personal data of people (name, email, company)
     * we want to find matches of people in the developers array within the candidates array.
     *
     * A match is defined as one of the following:
     *    - Exact match of the email addresses
     *    - The same combination of name and company (both values need to be defined)
     *
     * Assume that each array will contain millions of entries -> performance is important.
     * Hint: A nested loop with if statements will not be performant enough. You will need to think of a collection with fast lookup time.
     */


    private List<MergeEntry> addCandidateIdsToDevelopers(List<Candidate> candidates, List<Developer> developers) {
        List<MergeEntry> res = new ArrayList<>();
        Map<String, Candidate> candidateEmailMap = candidates.stream().collect(Collectors.toMap(c -> c.email, c -> c));
        Map<String, Developer> developerEmailMap = developers.stream().collect(Collectors.toMap(d -> d.email, d -> d));

        for (String email : candidateEmailMap.keySet()) {
            if (developerEmailMap.get(email) != null) {
                res.add(new MergeEntry(candidateEmailMap.get(email), developerEmailMap.get(email)));
            }
        }

        Map<String, Candidate> candidateNameCompanyMap = candidates.stream().collect(Collectors.toMap(c -> c.name + " " + c.company, c -> c));
        Map<String, Developer> developerNameCompanyMap = developers.stream().collect(Collectors.toMap(d -> d.name + " " + d.company, d -> d));

        for (String nameCompany : candidateNameCompanyMap.keySet()) {
            if (developerNameCompanyMap.get(nameCompany) != null) {
                res.add(new MergeEntry(candidateNameCompanyMap.get(nameCompany), developerNameCompanyMap.get(nameCompany)));
            }
        }

        return res;
    }


    public static void main(String[] args) {
        new PersonMatchingTask().test();
    }

    private void test() {
        Candidate jonC = new Candidate(1, "jon", "jon@acme.com", "acme");
        Candidate janeC = new Candidate(2, "jane", "jane@google.com", "google");
        Candidate peterC = new Candidate(3, "peter", "peter@microsoft.com", "microsoft");
        Candidate steveC = new Candidate(4, "steven", "steven@iotech.com", "iotech");
        List<Candidate> candidates = Arrays.asList(jonC, janeC, peterC, steveC);

        Developer jonD = new Developer("jonathan", "jon@acme.com", null);
        Developer janeD = new Developer("jane", "jane@gmail.com", "google");
        Developer peterD = new Developer("peter", "peter@netflix.com", "netflix");
        Developer steveD = new Developer("steve", "steve@niotech.com", "niotech"); // this is not a typo. it is intentionally niotech here and iotech above
        List<Developer> developers = Arrays.asList(jonD, janeD, peterD, steveD);

        List<MergeEntry> expectedOutput = Arrays.asList(
                new MergeEntry(jonC, jonD),
                new MergeEntry(janeC, janeD)
        );

        List<MergeEntry> actualOutput = addCandidateIdsToDevelopers(candidates, developers);
        System.out.println("Printing actualOutput:");
        for (MergeEntry mergeEntry : actualOutput) {
            System.out.println(mergeEntry.candidate.name + " - " + mergeEntry.developer.name);
        }

        System.out.println("\nPrinting expectedOutput:");
        for (MergeEntry mergeEntry : expectedOutput) {
            System.out.println(mergeEntry.candidate.name + " - " + mergeEntry.developer.name);
        }


        if (actualOutput.containsAll(expectedOutput) && expectedOutput.containsAll(actualOutput)) {
            System.out.println("Tests success");
        } else {
            System.err.println("Test failed");
        }
    }

    private static class MergeEntry {
        Candidate candidate;
        Developer developer;

        public MergeEntry(Candidate candidate, Developer developer) {
            this.candidate = candidate;
            this.developer = developer;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            MergeEntry that = (MergeEntry) o;
            return Objects.equals(candidate, that.candidate) && Objects.equals(developer, that.developer);
        }

        @Override
        public int hashCode() {
            return Objects.hash(candidate, developer);
        }
    }

    private static class Candidate {
        int id;
        String name;
        String email;
        String company;

        public Candidate(int id, String name, String email, String company) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.company = company;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Candidate candidate = (Candidate) o;
            return id == candidate.id && Objects.equals(name, candidate.name) && Objects.equals(email, candidate.email) && Objects.equals(company, candidate.company);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name, email, company);
        }
    }

    private static class Developer {
        String name;
        String email;
        String company;

        public Developer(String name, String email, String company) {
            this.name = name;
            this.email = email;
            this.company = company;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Developer developer = (Developer) o;
            return Objects.equals(name, developer.name) && Objects.equals(email, developer.email) && Objects.equals(company, developer.company);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, email, company);
        }
    }
}
