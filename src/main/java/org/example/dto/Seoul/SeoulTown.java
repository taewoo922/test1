package org.example.dto.Seoul;

import org.example.dto.Dto;

import java.util.Map;

public class SeoulTown extends Dto {
    public int id;
    public String town;
    public String foodtype;
    public String resname;
    public String num;
    public String address;
    public int boardId;

    public SeoulTown( int id, String foodtype, String town, String resname, String address, String num, int boardId) {
        this.id = id;
        this.foodtype = foodtype;
        this.town = town;
        this.resname = resname;
        this.address = address;
        this.num = num;
        this.boardId = boardId;
    }

    public SeoulTown (Map<String, Object> row) {
        super(row);
        this.id = (int) row.get("id");
        this.town = (String) row.get("town");
        this.foodtype = (String) row.get("foodtype");
        this.resname = (String) row.get("resname");
        this.address = (String) row.get("address");
        this.num = (String) row.get("num");
        this.boardId= (int) row.get("boardId");
//        this.memberId = (int) row.get("memberId");
    }
}
