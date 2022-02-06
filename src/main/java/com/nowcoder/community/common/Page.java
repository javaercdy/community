package com.nowcoder.community.common;

/**
 * @author javaercdy
 * @create 2022-02-05$-{TIME}
 */

public class Page {

    //当前页码
    private int current=1;
    //每页数量
    private int pageSize=10;
    //总记录数
    private int countRecord=0;
    //获取分页的路径
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        if (current>=1){
            this.current = current;
        }
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        if (pageSize>=1){
            this.pageSize = pageSize;
        }
    }

    public int getCountRecord() {
        return countRecord;
    }

    public void setCountRecord(int countRecord) {
        if (countRecord>=0){
            this.countRecord = countRecord;
        }

    }

    //获取总页数
    public int getCountPage(){
      return countRecord%pageSize==0?countRecord/pageSize:(countRecord/pageSize)+1;
    }

    //获取起始行
    public int getOffset(){
        return (current-1)*pageSize;
    }
    //获取起始页码
    public int getFrom(){
        return current-2>=1?current-2:1;
    }
    //获取结束页码
    public int getTo(){
        return current+2<=getCountPage()?current+2:getCountPage();
    }
}
