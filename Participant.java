import java.util.ArrayList;
/*
 * 
 * Nishanth Mantri
 * s3622464
 */

public class Participant {

    int PartID;
    String PartName;
    String PartState;
    int PartAge;
    int score;


    public int getID() {
        return PartID;
    }

    public void setID(int iD) {
        PartID = iD;
    }

    public String getName() {
        return PartName;
    }

    public void setName(String name) {
        this.PartName = PartName;
    }

    public String getState() {
        return PartState;
    }

    public void setState(String state) {
        this.PartState = state;
    }
    public void setScore(int score){

        this.score=score;
    }
    public int getScore()
    {
        return score;
    }

    public Participant() {
        PartID = 0;
        PartName = "";
        PartState = "";
        PartAge = 0;
        score=0;


    }

    public Participant(int PartID, String PartName, int PartAge, String PartState, int score) {
        this.PartID =PartID;
        this.PartName = PartName;
        this.PartAge = PartAge;
        this.PartState = PartState;
        this.score=score;

    }





}