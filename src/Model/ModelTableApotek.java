/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import projekakhir.MainView;


/**
 *
 * @author aryaz
 */
public class ModelTableApotek extends AbstractTableModel{
    List<DataApotek> lb;
    MainView frame;
    
    public ModelTableApotek(List<DataApotek> lb) {
        this.lb = lb;
    }
    
    @Override
    public int getRowCount() {
        return lb.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }
    
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "Nama";
            case 2:
                return "Harga";
            case 3:
                return "Stock";
            case 4:
                return "Kadaluarsa";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return lb.get(rowIndex).getId();
            case 1:
                return lb.get(rowIndex).getNama();
            case 2:
                return lb.get(rowIndex).getHarga();
            case 3:
                return lb.get(rowIndex).getStock();
            case 4:
                return lb.get(rowIndex).getKadaluarsa();
            default:
                return null;
        }
    }
    
}
