/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author rajusingh
 */
public class Donor_NurseTakeBloodWorkRequest extends WorkRequest {
    
    private String takeBlood;

    public String getTakeBlood() {
        return takeBlood;
    }

    public void setTakeBlood(String takeBlood) {
        this.takeBlood = takeBlood;
    }


}
