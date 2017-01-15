/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Donor;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author rajusingh
 */
public class DonorDirectory {

    private ArrayList<Donor> donorDirectory;

    public DonorDirectory() {
        donorDirectory = new ArrayList<Donor>();
    }

    public ArrayList<Donor> getDonorDirectory() {
        return donorDirectory;
    }

    public void setDonorDirectory(ArrayList<Donor> donorDirectory) {
        this.donorDirectory = donorDirectory;
    }

    public Donor addDonor(){
        Donor d1 = new Donor();
        donorDirectory.add(d1);
        return d1;
    }
    
    public void deleteDonor(Donor d) {
        donorDirectory.remove(d);
    }
}
