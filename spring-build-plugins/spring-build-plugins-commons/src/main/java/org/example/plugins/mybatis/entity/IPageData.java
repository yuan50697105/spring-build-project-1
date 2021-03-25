package org.example.plugins.mybatis.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.plugins.commons.entity.BaseEntity;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class IPageData<T> extends BaseEntity {
    private List<T> data;
    private Long page;
    private Long size;
    private Long totalPages;
    private Long totalRowNum;

//    public IPageData() {
//    }

    public IPageData(List<T> data, Long page, Long size, Long totalPage, Long totalRowNum) {
        this.data = data;
        this.page = page;
        this.size = size;
        this.totalPages = totalPage;
        this.totalRowNum = totalRowNum;
    }

    protected IPageData(List<T> data, Integer page, Integer size, Integer totalPage, Integer totalRowNum) {
        this.data = data;
        this.page = Long.valueOf(page);
        this.size = Long.valueOf(size);
        this.totalPages = Long.valueOf(totalPage);
        this.totalRowNum = Long.valueOf(totalRowNum);
    }

    protected IPageData(List<T> data, Integer page, Integer size, Long totalPage, Long totalRowNum) {
        this.data = data;
        this.page = Long.valueOf(page);
        this.size = Long.valueOf(size);
        this.totalPages = totalPage;
        this.totalRowNum = totalRowNum;
    }

    protected IPageData(List<T> data, Integer page, Integer size, Integer totalPages, Long totalRowNum) {
        this.data = data;
        this.page = Long.valueOf(page);
        this.size = Long.valueOf(size);
        this.totalPages = Long.valueOf(totalPages);
        this.totalRowNum = totalRowNum;
    }
}