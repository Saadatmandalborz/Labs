package Lab4;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

public class Voting {
    public static final int SINGLE_ANSWER_MODE = 0;
    public static final int MULTI_ANSWER_MODE = 1;
    private int type;
    private String question;
    private ArrayList<Person> voters;
    private HashMap<String, HashSet<Vote>> polls;

    public Voting(int type, String question) {
        this.type = type;
        this.question = question;
        voters = new ArrayList<>();
        polls = new HashMap<>();
    }

    public String getQuestion() {
        return question;
    }

    public void createPoll(String text)
    {
        polls.put(text,new HashSet<>());
    }

    public void vote(Person person, ArrayList<String> votes)
    {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String dateString = formatter.format(date);
        if(type == SINGLE_ANSWER_MODE && votes.size() > 1)
        {
            System.out.println("Error, single mode!");
            return;
        }
        if(voters.contains(person))
        {
            System.out.println("This person voted");
            return;
        }
        voters.add(person);
        for(String s : votes)
        {
            polls.get(s).add(new Vote(person,dateString));
        }
    }

    public HashMap<String, HashSet<Vote>> getPolls() {
        return polls;
    }

    public int votersCount(){
        return voters.size();
    }


}
