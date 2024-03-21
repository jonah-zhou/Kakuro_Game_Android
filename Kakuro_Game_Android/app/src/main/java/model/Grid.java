package model;

import androidx.annotation.NonNull;

public class Grid {
    private int rows;
    private int columns;
    private String[] datas;
    private String[] answerCode;
    private int gridId;

    public Grid(int rows, int columns, String[] datas, String[] answerCode, int gridId) {
        this.rows = rows;
        this.columns = columns;
        this.datas = datas;
        this.answerCode = answerCode;
        this.gridId = gridId;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public String[] getDatas() {
        return datas;
    }

    public void setDatas(String[] datas) {
        this.datas = datas;
    }

    public String[] getAnswerCode() {
        return answerCode;
    }

    public void setAnswerCode(String[] answerCode) {
        this.answerCode = answerCode;
    }

    public int getGridId() {
        return gridId;
    }

    public void setGridId(int gridId) {
        this.gridId = gridId;
    }
}
