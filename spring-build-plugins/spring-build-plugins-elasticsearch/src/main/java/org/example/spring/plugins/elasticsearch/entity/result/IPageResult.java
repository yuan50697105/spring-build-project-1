package org.example.spring.plugins.elasticsearch.entity.result;

import lombok.EqualsAndHashCode;
import lombok.Value;
import org.example.spring.plugins.mybatis.entity.IPageData;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @author yuane
 */
@SuppressWarnings("unused")
@EqualsAndHashCode(callSuper = true)
@Value
public class IPageResult<T> extends IPageData<T> {
    public IPageResult(List<T> data, Integer page, Integer size, Integer totalPage, Integer totalRowNum) {
        super(data, page, size, totalPage, totalRowNum);
    }

    public IPageResult(List<T> data, Integer page, Integer size, Long totalPage, Long totalRowNum) {
        super(data, page, size, totalPage, totalRowNum);
    }

    public IPageResult(List<T> data, Integer page, Integer size, Integer totalPages, Long totalRowNum) {
        super(data, page, size, totalPages, totalRowNum);
    }

    public IPageResult(List<T> data, Long page, Long size, Long totalPage, Long totalRowNum) {
        super(data, page, size, totalPage, totalRowNum);
    }

    public IPageResult(Page<T> page) {
        super(page.getContent(), page.getPageable().getPageNumber(), page.getPageable().getPageSize(), page.getTotalPages(), page.getTotalElements());
    }

}