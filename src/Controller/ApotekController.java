/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import ApotekObject.DataAccess;
import Model.*;
import java.util.List;
import projekakhir.MainView;
import ApotekInterface.ApotekImplement;

/**
 *
 * @author aryaz
 */
public class ApotekController {
    MainView frame;
    ApotekImplement implement;
    List<DataApotek> lb;

    public ApotekController(MainView frame) {
        this.frame = frame;
        implement = new DataAccess();
        lb = implement.getAll();
    }

    public void isiTable() {
        lb = implement.getAll();
        ModelTableApotek mtb = new ModelTableApotek(lb);
        frame.getShowTable().setModel(mtb);
    }

    public void cariTable(String cari) {
        lb = implement.getAllCari(cari);
        ModelTableApotek mtb = new ModelTableApotek(lb);
        frame.getShowTable().setModel(mtb);
    }

    public void insert(){
        DataApotek db = new DataApotek();
        db.setId(frame.getTFID().getText());
        db.setNama(frame.getTFNama().getText());
        db.setHarga(Double.parseDouble(frame.getTFHarga().getText()));
        db.setStock(Integer.parseInt(frame.getTFStock().getText()));
        db.setKadaluarsa(frame.getTFKadaluarsa().getText());
        implement.insert(db);
    }

    public void update(){
        DataApotek db = new DataApotek();
        db.setId(frame.getTFID().getText());
        db.setNama(frame.getTFNama().getText());
        db.setHarga(Double.parseDouble(frame.getTFHarga().getText()));
        db.setStock(Integer.parseInt(frame.getTFStock().getText()));
        db.setKadaluarsa(frame.getTFKadaluarsa().getText());
        implement.update(db);
    }

    public void delete(){
        DataApotek db = new DataApotek();
        String id = frame.getTFID().getText();
        implement.delete(id);
    }

    public void clear(){
        implement.clear();
    }

    public void cari(){
        String nama = frame.getTFNama().getText();
        implement.getAllCari(nama);
    }
    
}
