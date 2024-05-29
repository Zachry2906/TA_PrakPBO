/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ApotekInterface;

import java.util.List;

import Model.DataAkun;
import Model.DataApotek;

/**
 *
 * @author aryaz
 */
public interface AccountInterface {
    public void insert(DataAkun db);
    public List<DataAkun> getAll();
}
