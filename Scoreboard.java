/*

# Answer close reading 1 questions here


# Answer close reading 2 questions here

*/

// Write the class below
public class Scoreboard
{
    private String team1;
    private String team2;
    private int score1;
    private int score2;
    private boolean isTeam1Active = true;

    public Scoreboard(String t1, String t2)
    {
        team1 = t1;
        team2 = t2;
    }

    public void recordPlay(int points)
    {
        if(points>=1)
        {
            if(isTeam1Active == true)
            {
                score1 += points;
            }
            else
            {
                score2 +=points;
            }

        }
        if(points == 0)
        {
            if(isTeam1Active == true)
            {
                isTeam1Active = false;

            }
            else 
            {
                isTeam1Active = true;
            }
        }
    }

    public String getScore()
    {
         String name;
        if(isTeam1Active == true)
        {
            name = team1;
        }
        else
        {
            name = team2;
        }

        return score1 + "-" + score2 + "-" + name;
    }
}