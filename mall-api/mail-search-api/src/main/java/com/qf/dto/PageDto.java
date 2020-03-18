package com.qf.dto;

import java.util.List;

public class PageDto<T> {
    private List<T> pagesInfo;
    private boolean hasNext = true;
    private boolean hasPre = true;
    private int curPage;
    private int pageNum;

    public PageDto(int curPage, int rows) {
        this.curPage = curPage;
        this.pageNum = rows/15;
        if(this.curPage >= this.pageNum){
            this.hasNext = false;
        }
        if(this.curPage <= 1){
            this.hasPre = false;
        }
    }

    public List<T> getPagesInfo() {
        return pagesInfo;
    }

    public void setPagesInfo(List<T> pagesInfo) {
        this.pagesInfo = pagesInfo;
    }

    @Override
    public String toString() {
        return "PageDto{" +
                "pagesInfo=" + pagesInfo +
                ", hasNext=" + hasNext +
                ", hasPre=" + hasPre +
                ", curPage=" + curPage +
                ", pageNum=" + pageNum +
                '}';
    }
}
