package org.example.spring.plugins.commons.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;
import java.util.stream.Stream;

@EqualsAndHashCode(callSuper = true)
@Data
public class IPageData<T> extends BaseEntity {
    private List<T> data;
    @JsonIgnore
    private Stream<T> stream;
    private Long page;
    private Long size;
    private Long totalPages;
    private Long totalRowNum;

//    public IPageData() {
//    }

    public IPageData(List<T> data, Long page, Long size, Long totalPage, Long totalRowNum) {
        this.data = data;
        this.stream = data.stream();
        this.page = page;
        this.size = size;
        this.totalPages = totalPage;
        this.totalRowNum = totalRowNum;
    }

    protected IPageData(List<T> data, Integer page, Integer size, Integer totalPage, Integer totalRowNum) {
        this(data, Long.valueOf(page), Long.valueOf(size), Long.valueOf(totalPage), Long.valueOf(totalRowNum));
    }

    protected IPageData(List<T> data, Integer page, Integer size, Long totalPage, Long totalRowNum) {
        this(data, Long.valueOf(page), Long.valueOf(size), totalPage, totalRowNum);
    }

    protected IPageData(List<T> data, Integer page, Integer size, Integer totalPages, Long totalRowNum) {
        this(data, Long.valueOf(page), Long.valueOf(size), Long.valueOf(totalPages), totalRowNum);
    }
}