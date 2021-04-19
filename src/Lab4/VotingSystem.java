package Lab4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class VotingSystem {
    ArrayList<Voting> votingList;

    public VotingSystem() {
        votingList = new ArrayList<>();
    }

    public int createVoting(String question, int mode, ArrayList<String> choices)
    {
        Voting voting = new Voting(mode,question);
        for(String s : choices)
        {
            voting.createPoll(s);
        }
        votingList.add(voting);
        return votingList.size()-1;
    }

    public ArrayList<Voting> getVotingList() {
        return votingList;
    }

    public Voting getVoting(int num)
    {
        return votingList.get(num);
    }

    public void vote(int votingNumber , Person person, ArrayList<String> votes)
    {
        votingList.get(votingNumber).vote(person,votes);
    }

    public void getResult(int num)
    {
        if(num < 0 || num >= votingList.size())
        {
            System.out.println("Not found");
            return;
        }
        Voting voting = votingList.get(num);
        System.out.println(voting.getQuestion());
        System.out.println("Votes: (" + voting.votersCount()+" in total)");
        HashMap<String, HashSet<Vote>> polls = voting.getPolls();
        for(String s : polls.keySet())
        {
            System.out.println(s + " - " + polls.get(s).size());
            for(Vote vote : polls.get(s))
            {
                System.out.println(vote.getPerson() + " - " + vote.getDate());
            }
        }

    }


}
