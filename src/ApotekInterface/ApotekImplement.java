/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ApotekInterface;

import java.util.List;

import Model.DataApotek;

/**
 *
 * @author aryaz
 */
public interface ApotekImplement {
    public void insert(DataApotek db);
    public void update(DataApotek db);
    public void delete(String id);
    public List<DataApotek> getAll();
    public void clear();
}
