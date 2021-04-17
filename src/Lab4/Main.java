package Lab4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();
        ArrayList<String> polls = new ArrayList<>();
        polls.add("Saate 9:30");
        polls.add("Saate 11:30");
        polls.add("Saate 12:30");
        int index = votingSystem.createVoting("Emtehan saate chand bashe?",Voting.SINGLE_ANSWER_MODE,polls);

        votingSystem.getResult(index);

        Person person = new Person("Alborz","Saadatmand");

        votingSystem.vote(index,person,polls);

        polls.remove("Saate 9:30");
        polls.remove("Saate 11:30");
        votingSystem.vote(index,person,polls);

        votingSystem.getResult(index);
    }
}
