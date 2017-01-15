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
public class InventoryReceiveWorkRequest extends WorkRequest {
    
    private String InventoryReceivingStatus;

    public String getInventoryReceivingStatus() {
        return InventoryReceivingStatus;
    }

    public void setInventoryReceivingStatus(String InventoryReceivingStatus) {
        this.InventoryReceivingStatus = InventoryReceivingStatus;
    }

}
